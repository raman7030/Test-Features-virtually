package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C3232 {

    /* JADX INFO: renamed from: ֫ */
    public C15243 f6260;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f6261 = new ArrayList(2);

    /* JADX INFO: renamed from: ܽ */
    public Throwable f6262;

    /* JADX INFO: renamed from: ֫ */
    public final void m5584(Throwable th) {
        Throwable th2 = this.f6262;
        if (th2 == null) {
            this.f6262 = th;
        } else if (th2 != th) {
            th2.addSuppressed(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Throwable m5583(boolean z) {
        ArrayList<Throwable> arrayList = this.f6261;
        for (Throwable th : arrayList) {
            Error error = (Error) C6585.m15046(th, Error.class);
            if (error != null) {
                m5582(error);
                return error;
            }
            if (C6585.m15061(th)) {
                m5582(th);
                return th;
            }
        }
        Throwable th2 = this.f6262;
        if (th2 != null) {
            m5582(th2);
            return th2;
        }
        if (z || arrayList.isEmpty()) {
            return null;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        m5582(th3);
        return th3;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m5582(Throwable th) {
        Throwable th2 = this.f6262;
        if (th2 != null && th2 != th) {
            th.addSuppressed(th2);
        }
        for (Throwable th3 : this.f6261) {
            if (th3 != th) {
                th.addSuppressed(th3);
            }
        }
    }
}
