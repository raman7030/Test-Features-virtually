package l;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC14636 implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23809 f44749;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f44750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f44751 = SystemClock.uptimeMillis() + 10000;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f44752 = false;

    public ExecutorC14636(ActivityC23809 activityC23809) {
        this.f44749 = activityC23809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34929(View view) {
        if (this.f44752) {
            return;
        }
        this.f44752 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f44750 = runnable;
        View decorView = this.f44749.getWindow().getDecorView();
        if (this.f44752) {
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
                ExecutorC14636 executorC14636 = this.f53340;
                Runnable runnable2 = executorC14636.f44750;
                if (runnable2 != null) {
                    runnable2.run();
                    executorC14636.f44750 = null;
                }
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.f44750;
        ActivityC23809 activityC23809 = this.f44749;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f44751) {
                this.f44752 = false;
                activityC23809.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f44750 = null;
        if (activityC23809.f77050.m43578()) {
            this.f44752 = false;
            activityC23809.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44749.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
