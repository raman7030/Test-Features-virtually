package l;

import java.util.Set;

/* JADX INFO: renamed from: l.۬۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12959 extends AbstractC1129 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f38862;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38863;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f38864;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38865;

    public C12959(C12918 c12918, C18729 c18729) {
        this.f38864 = c12918;
        this.f38862 = c12918.m31401(c18729.m43368());
        int iM43368 = c18729.m43368();
        this.f38865 = iM43368;
        this.f38863 = c18729.m43364();
        m31528(c18729, iM43368);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31527(C18729 c18729) {
        c18729.m43354();
        m31528(c18729, c18729.m43368());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31528(C18729 c18729, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            c18729.m43354();
            AbstractC10494.m26391(c18729);
        }
    }

    @Override // l.InterfaceC22404
    public final String getType() {
        return this.f38862;
    }

    @Override // l.InterfaceC22404
    public final Set getElements() {
        return new C3082(this, this.f38864, this.f38863, this.f38865);
    }
}
