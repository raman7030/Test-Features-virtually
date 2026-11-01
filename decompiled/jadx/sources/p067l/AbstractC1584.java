package p067l;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܶۗ */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1584 {
    /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
    public abstract void m37568(int i);

    /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
    public abstract void m37569(Typeface typeface);

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        m37567(handler).post(new RunnableC21380(1, this, typeface));
    }

    public final void callbackFailAsync(final int i, Handler handler) {
        m37567(handler).post(new Runnable() { // from class: l.۠ۗ
            @Override // java.lang.Runnable
            public final void run() {
                this.f27377.m37568(i);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static Handler m37567(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
