package l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ܳ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8NO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14185 implements InterfaceC16427 {
    @Override // l.InterfaceC16427
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo33831() {
        return System.currentTimeMillis();
    }

    @Override // l.InterfaceC16427
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long mo33834() {
        return SystemClock.elapsedRealtime();
    }

    @Override // l.InterfaceC16427
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long mo33833() {
        return SystemClock.uptimeMillis();
    }

    @Override // l.InterfaceC16427
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo33835() {
        return System.nanoTime();
    }

    @Override // l.InterfaceC16427
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 mo33832(Looper looper, Handler.Callback callback) {
        return new C6425(new Handler(looper, callback));
    }
}
