package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P4XD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0279 extends AbstractC8246 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C19536 f1612;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19536 f1613;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19536 f1614;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f1615;

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double mo1619() {
        return 102.0d;
    }

    public C0279(C22357 c22357, C5424 c5424, int i, String str, int i2, int i3, int i4) {
        super(i);
        this.f1615 = str;
        this.f1612 = c5424.m15515(new C19536(c22357, i2, "try_start_"));
        this.f1613 = c5424.m15515(new C22857(c22357, i, i3));
        if (str == null) {
            this.f1614 = c5424.m15515(new C19536(c22357, i4, "catchall_"));
        } else {
            this.f1614 = c5424.m15515(new C19536(c22357, i4, "catch_"));
        }
    }

    @Override // l.AbstractC8246
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1618(C3438 c3438) throws IOException {
        String str = this.f1615;
        if (str == null) {
            c3438.getClass();
            c3438.write(".catchall", 0, 9);
        } else {
            c3438.getClass();
            c3438.write(".catch ", 0, 7);
            c3438.write(str);
        }
        c3438.getClass();
        c3438.write(" {", 0, 2);
        this.f1612.mo1618(c3438);
        c3438.write(" .. ", 0, 4);
        this.f1613.mo1618(c3438);
        c3438.write("} ", 0, 2);
        this.f1614.mo1618(c3438);
        return true;
    }
}
