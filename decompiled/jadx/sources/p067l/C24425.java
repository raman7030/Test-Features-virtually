package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩺᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes.dex */
public final class C24425 extends C17938 {

    /* JADX INFO: renamed from: ۫ */
    public long f77332;

    public C24425(C12356 c12356) {
        super(c12356);
        this.f77332 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53897() {
        try {
            ((C12356) mo27170()).f34483.m38534("MT_PING$").close();
        } catch (C3406 e) {
            if (e.m6034() != EnumC9460.STATUS_BAD_NETWORK_NAME.getValue()) {
                throw e;
            }
        }
        this.f77332 = SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53896() {
        return SystemClock.uptimeMillis() - this.f77332 > 30000;
    }
}
