package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0909 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13547 f3485;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3486 = new ArrayList(2);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Throwable f3487;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3265(Throwable th) {
        Throwable th2 = this.f3487;
        if (th2 == null) {
            this.f3487 = th;
        } else if (th2 != th) {
            th2.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m3264(boolean z) {
        ArrayList<Throwable> arrayList = this.f3486;
        for (Throwable th : arrayList) {
            Error error = (Error) C4437.m13165(th, Error.class);
            if (error != null) {
                m3263(error);
                return error;
            }
            if (C4437.m13180(th)) {
                m3263(th);
                return th;
            }
        }
        Throwable th2 = this.f3487;
        if (th2 != null) {
            m3263(th2);
            return th2;
        }
        if (z || arrayList.isEmpty()) {
            return null;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        m3263(th3);
        return th3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m3263(Throwable th) {
        Throwable th2 = this.f3487;
        if (th2 != null && th2 != th) {
            th.addSuppressed(th2);
        }
        for (Throwable th3 : this.f3486) {
            if (th3 != th) {
                th.addSuppressed(th3);
            }
        }
    }
}
