package l;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14951 {
    /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
    public abstract void m35416(int i);

    /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
    public abstract void m35417(Typeface typeface);

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        m35415(handler).post(new RunnableC20004(1, this, typeface));
    }

    public final void callbackFailAsync(final int i, Handler handler) {
        m35415(handler).post(new Runnable() { // from class: l.۠ۗ
            @Override // java.lang.Runnable
            public final void run() {
                this.f24461.m35416(i);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Handler m35415(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }
}
