package l;

import android.database.ContentObserver;

/* JADX INFO: renamed from: l.۫ܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: QBKJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12459 extends ContentObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f37466;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13164 f37467;

    public C12459(C13164 c13164, int i) {
        super(null);
        this.f37467 = c13164;
        this.f37466 = i;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f37467 != null) {
            C13164.m31899(this.f37466);
        }
    }
}
