package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.۬۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14684 extends AbstractC3441 {

    /* JADX INFO: renamed from: ۙ */
    public final String f41906;

    /* JADX INFO: renamed from: ᩶ */
    public final int f41907;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f41908;

    /* JADX INFO: renamed from: ᩹ */
    public final int f41909;

    public C14684(C14645 c14645, C20168 c20168) {
        this.f41908 = c14645;
        this.f41906 = c14645.m33487(c20168.m45635());
        int iM45635 = c20168.m45635();
        this.f41909 = iM45635;
        this.f41907 = c20168.m45631();
        m33614(c20168, iM45635);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33613(C20168 c20168) {
        c20168.m45621();
        m33614(c20168, c20168.m45635());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33614(C20168 c20168, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            c20168.m45621();
            AbstractC12342.m28424(c20168);
        }
    }

    @Override // p067l.InterfaceC23661
    public final String getType() {
        return this.f41906;
    }

    @Override // p067l.InterfaceC23661
    public final Set getElements() {
        return new C5297(this, this.f41908, this.f41907, this.f41909);
    }
}
