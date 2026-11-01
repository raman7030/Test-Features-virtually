package p067l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܳ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NO */
/* JADX INFO: loaded from: classes4.dex */
public final class C15849 implements InterfaceC17980 {
    @Override // p067l.InterfaceC17980
    /* JADX INFO: renamed from: ֫ */
    public final long mo35963() {
        return System.currentTimeMillis();
    }

    @Override // p067l.InterfaceC17980
    /* JADX INFO: renamed from: ܽ */
    public final long mo35966() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p067l.InterfaceC17980
    /* JADX INFO: renamed from: ۧ */
    public final long mo35965() {
        return SystemClock.uptimeMillis();
    }

    @Override // p067l.InterfaceC17980
    /* JADX INFO: renamed from: ᩳ */
    public final long mo35967() {
        return System.nanoTime();
    }

    @Override // p067l.InterfaceC17980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20664 mo35964(Looper looper, Handler.Callback callback) {
        return new C8474(new Handler(looper, callback));
    }
}
