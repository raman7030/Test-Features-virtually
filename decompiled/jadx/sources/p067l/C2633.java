package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P4XD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2633 extends AbstractC10205 {

    /* JADX INFO: renamed from: ۗ */
    public final C20935 f4390;

    /* JADX INFO: renamed from: ۙ */
    public final C20935 f4391;

    /* JADX INFO: renamed from: ᩶ */
    public final C20935 f4392;

    /* JADX INFO: renamed from: ᩹ */
    public final String f4393;

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ۧ */
    public final double mo4019() {
        return 102.0d;
    }

    public C2633(C23616 c23616, C7523 c7523, int i, String str, int i2, int i3, int i4) {
        super(i);
        this.f4393 = str;
        this.f4390 = c7523.m17426(new C20935(c23616, i2, "try_start_"));
        this.f4391 = c7523.m17426(new C24091(c23616, i, i3));
        if (str == null) {
            this.f4392 = c7523.m17426(new C20935(c23616, i4, "catchall_"));
        } else {
            this.f4392 = c7523.m17426(new C20935(c23616, i4, "catch_"));
        }
    }

    @Override // p067l.AbstractC10205
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4018(C5636 c5636) throws IOException {
        String str = this.f4393;
        if (str == null) {
            c5636.getClass();
            c5636.write(".catchall", 0, 9);
        } else {
            c5636.getClass();
            c5636.write(".catch ", 0, 7);
            c5636.write(str);
        }
        c5636.getClass();
        c5636.write(" {", 0, 2);
        this.f4390.mo4018(c5636);
        c5636.write(" .. ", 0, 4);
        this.f4391.mo4018(c5636);
        c5636.write("} ", 0, 2);
        this.f4392.mo4018(c5636);
        return true;
    }
}
