package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class ProgressListenerCallbackExecutor {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f1328 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static ExecutorService f1329 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("android-sdk-progress-listener-callback-thread");
            thread.setDaemon(true);
            return thread;
        }
    });

    /* JADX INFO: renamed from: ֫ */
    public final ProgressListener f1330;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.f1330 = progressListener;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1397(final ProgressEvent progressEvent) {
        if (this.f1330 == null) {
            return;
        }
        f1329.submit(new Runnable() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.2
            @Override // java.lang.Runnable
            public final void run() {
                ProgressListenerCallbackExecutor.this.f1330.mo1395(progressEvent);
            }
        });
    }
}
