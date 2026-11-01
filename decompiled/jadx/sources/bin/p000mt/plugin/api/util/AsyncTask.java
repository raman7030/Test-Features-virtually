package bin.p000mt.plugin.api.util;

import bin.p000mt.plugin.api.PluginContext;
import java.util.concurrent.Executor;
import p067l.RunnableC21169;
import p067l.RunnableC23549;
import p067l.RunnableC24771;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTask {
    public final PluginContext context;
    public Executor executor = android.os.AsyncTask.THREAD_POOL_EXECUTOR;

    public abstract void afterThread();

    public abstract void beforeThread();

    public abstract void onException(Exception exc);

    public abstract void onFinally();

    public abstract void onThread();

    public AsyncTask(PluginContext pluginContext) {
        this.context = pluginContext;
    }

    public void start() {
        try {
            beforeThread();
            this.executor.execute(new RunnableC21169(6, this));
        } catch (Exception e) {
            try {
                onException(e);
            } finally {
                onFinally();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        try {
            onThread();
            ThreadUtil.post(new RunnableC23549(3, this));
        } catch (Exception e) {
            handleError(e);
        } catch (OutOfMemoryError e2) {
            handleError(new Exception(this.context.getString("{out_of_memory_error}"), e2));
        } catch (Throwable th) {
            handleError(new Exception(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        try {
            afterThread();
        } catch (OutOfMemoryError e) {
            onException(new Exception(this.context.getString("{out_of_memory_error}"), e));
        } catch (Exception e2) {
            onException(e2);
        } catch (Throwable th) {
            onException(new Exception(th));
        } finally {
            onFinally();
        }
    }

    private void handleError(Exception exc) {
        ThreadUtil.post(new RunnableC24771(2, this, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleError$2(Exception exc) {
        try {
            onException(exc);
        } finally {
            onFinally();
        }
    }
}
