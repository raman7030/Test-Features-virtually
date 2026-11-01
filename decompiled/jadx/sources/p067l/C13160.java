package p067l;

/* JADX INFO: renamed from: l.ۨ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13160 extends C7933 {

    /* JADX INFO: renamed from: ۧ */
    public int[] f36985;

    /* JADX INFO: renamed from: ܽ */
    public C7933[] f36986;

    /* JADX INFO: renamed from: ܿ */
    public int f36987 = 2;

    /* JADX INFO: renamed from: ᩳ */
    public C7933 f36988;

    public C13160(C7933 c7933, C7933 c7934, C7933 c7935) {
        this.f36986 = new C7933[]{c7933, c7934};
        this.f36988 = c7935;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30147() {
        this.f36985 = null;
        int i = -1;
        for (int i2 = 0; i2 < this.f36987; i2++) {
            int iM30145 = m30145(this.f36986[i2]);
            if (iM30145 >= 0) {
                if (i >= 0 && i != iM30145) {
                    int[] iArr = new int[this.f36987];
                    for (int i3 = 0; i3 < this.f36987; i3++) {
                        iArr[i3] = m30145(this.f36986[i3]);
                    }
                    this.f36985 = iArr;
                    return;
                }
                i = iM30145;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30145(C7933 c7933) {
        int i;
        for (int i2 = 0; i2 < 64 && ((c7933 instanceof C7263) || (c7933 instanceof C23888)); i2++) {
            c7933 = c7933.f20809;
        }
        if (!(c7933 instanceof C11168)) {
            return -1;
        }
        int[] iArr = ((C11168) c7933).f10016;
        if (iArr.length <= 0 || (i = iArr[0]) < 0 || i >= 128) {
            return -1;
        }
        return i;
    }
}
