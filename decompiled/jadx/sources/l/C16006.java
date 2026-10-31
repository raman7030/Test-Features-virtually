package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U6AJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16006 extends AbstractC2602 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49380;

    public C16006(int i, int i2) {
        super(i);
        this.f49380 = i2;
    }

    @Override // l.AbstractC2602
    /* JADX INFO: renamed from: ֫ */
    public final void mo8230(C3438 c3438) throws IOException {
        int i = this.f49380;
        if (i >= 0) {
            c3438.write(43);
        }
        c3438.m10510(i);
    }
}
