package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class TransferThreadPool {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Log f369 = LogFactory.m302(TransferService.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor f370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor f371;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Future m401(Callable callable) {
        int i = TransferUtilityOptions.f380;
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() + 1) * 2;
        synchronized (TransferThreadPool.class) {
            f369.mo294("Initializing the thread pool of size: " + iAvailableProcessors);
            int iMax = Math.max((int) Math.ceil(((double) iAvailableProcessors) / 2.0d), 1);
            if (f370 == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, iMax, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                f370 = threadPoolExecutor;
            }
            if (f371 == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(iMax, iMax, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                threadPoolExecutor2.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                f371 = threadPoolExecutor2;
            }
        }
        return callable instanceof UploadPartTask ? f371.submit(callable) : f370.submit(callable);
    }
}
