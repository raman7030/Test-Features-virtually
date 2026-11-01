package p067l;

import android.database.ContentObserver;

/* JADX INFO: renamed from: l.۫ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: QBKJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14209 extends ContentObserver {

    /* JADX INFO: renamed from: ֫ */
    public int f40486;

    /* JADX INFO: renamed from: ۧ */
    public C14879 f40487;

    public C14209(C14879 c14879, int i) {
        super(null);
        this.f40487 = c14879;
        this.f40486 = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f40487 != null) {
            C14879.m33995(this.f40486);
        }
    }
}
