package p067l;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܳܽ */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC1568 implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ ActivityC2023 f47856;

    /* JADX INFO: renamed from: ᩶ */
    public Runnable f47857;

    /* JADX INFO: renamed from: ᩸ */
    public final long f47858 = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f47859 = false;

    public ExecutorC1568(ActivityC2023 activityC2023) {
        this.f47856 = activityC2023;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37076(View view) {
        if (this.f47859) {
            return;
        }
        this.f47859 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47857 = runnable;
        View decorView = this.f47856.getWindow().getDecorView();
        if (this.f47859) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new Runnable() { // from class: l.ܿܽ
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC1568 executorC1568 = this.f56527;
                Runnable runnable2 = executorC1568.f47857;
                if (runnable2 != null) {
                    runnable2.run();
                    executorC1568.f47857 = null;
                }
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.f47857;
        ActivityC2023 activityC2023 = this.f47856;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f47858) {
                this.f47859 = false;
                activityC2023.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f47857 = null;
        if (activityC2023.f79801.m45844()) {
            this.f47859 = false;
            activityC2023.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47856.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
