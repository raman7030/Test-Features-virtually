package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F15V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2845 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f9081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4256 f9082;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f9083;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f9084;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f9085;

    public C2845(C4256 c4256, int i, int i2, int i3, boolean z) {
        this.f9082 = c4256;
        this.f9081 = i;
        this.f9085 = i2;
        this.f9083 = i3;
        this.f9084 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8735(C19357 c19357, C1109 c1109, int i) {
        int i2 = this.f9083;
        if (i2 == -1) {
            throw new RuntimeException();
        }
        C4256.m12807(c19357, (InterfaceC5471) ((List) this.f9082.f13782.get(i2)).get(this.f9081), this.f9085, this.f9084, c1109, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8736(C19357 c19357, C1109 c1109, int i) {
        int i2 = this.f9083;
        if (i2 == -1) {
            throw new RuntimeException();
        }
        C4256.m12807(c19357, (InterfaceC5471) this.f9082.f13791.get(i2), this.f9085, this.f9084, c1109, i);
    }
}
