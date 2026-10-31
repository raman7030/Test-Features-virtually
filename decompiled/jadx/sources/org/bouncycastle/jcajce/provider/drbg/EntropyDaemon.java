package org.bouncycastle.jcajce.provider.drbg;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class EntropyDaemon implements Runnable {
    public static final Logger LOG = Logger.getLogger(EntropyDaemon.class.getName());
    public final LinkedList tasks = new LinkedList();

    public void addTask(Runnable runnable) {
        synchronized (this.tasks) {
            this.tasks.add(runnable);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (this.tasks) {
                runnable = (Runnable) this.tasks.poll();
            }
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
            } else {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        Logger logger = LOG;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("entropy thread interrupted - exiting");
        }
    }
}
