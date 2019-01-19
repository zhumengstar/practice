package Multithreaded;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author:zhumeng
 * @desc:
 **/
@Slf4j
public class MapExample {
    private static Map<Integer, Integer> map = Maps.newHashMap();
    private static int threadNum = 200;
    private static int clientNUm = 5000;

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadNum);
        for (int index = 0; index < clientNUm; index++) {
            final int threadNUm = index;
            exec.execute(() -> {
                try {
                    semaphore.acquire();
                    func(threadNUm);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    log.error("exception", e);
                }
            });
        }
        exec.shutdown();
        log.info("size:{}", map.size());
    }

    private static void func(int threadNum) {
        map.put(threadNum, threadNum);
    }
}
