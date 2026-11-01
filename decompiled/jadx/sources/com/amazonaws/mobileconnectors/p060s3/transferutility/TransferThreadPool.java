package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TransferThreadPool {

    /* JADX INFO: renamed from: ֫ */
    public static final Log f1529 = LogFactory.m1468(TransferService.class);

    /* JADX INFO: renamed from: ۧ */
    public static ThreadPoolExecutor f1530;

    /* JADX INFO: renamed from: ܽ */
    public static ThreadPoolExecutor f1531;

    /* JADX INFO: renamed from: ֫ */
    public static Future m1567(Callable callable) {
        int i = TransferUtilityOptions.f1540;
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() + 1) * 2;
        synchronized (TransferThreadPool.class) {
            f1529.mo1460("Initializing the thread pool of size: " + iAvailableProcessors);
            int iMax = Math.max((int) Math.ceil(((double) iAvailableProcessors) / 2.0d), 1);
            if (f1530 == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, iMax, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                f1530 = threadPoolExecutor;
            }
            if (f1531 == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(iMax, iMax, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor2.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                f1531 = threadPoolExecutor2;
            }
        }
        return callable instanceof UploadPartTask ? f1531.submit(callable) : f1530.submit(callable);
    }
}
