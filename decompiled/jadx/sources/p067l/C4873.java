package p067l;

import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBFX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4873 extends AbstractC2860 {

    /* JADX INFO: renamed from: ۛ */
    public static final C4873[] f11112 = new C4873[SecP521R1Field.P16];

    /* JADX INFO: renamed from: ۤ */
    public static final C4873 f11113 = m10335(-1);

    /* JADX INFO: renamed from: ᩹ */
    public static final C4873 f11117 = m10335(0);

    /* JADX INFO: renamed from: ᩶ */
    public static final C4873 f11116 = m10335(1);

    /* JADX INFO: renamed from: ۙ */
    public static final C4873 f11111 = m10335(2);

    /* JADX INFO: renamed from: ۗ */
    public static final C4873 f11110 = m10335(3);

    /* JADX INFO: renamed from: ۬ */
    public static final C4873 f11115 = m10335(4);

    /* JADX INFO: renamed from: ۫ */
    public static final C4873 f11114 = m10335(5);

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.INTEGER;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4873 m10335(int i) {
        C4873[] c4873Arr = f11112;
        int length = (Integer.MAX_VALUE & i) % c4873Arr.length;
        C4873 c4873 = c4873Arr[length];
        if (c4873 != null && c4873.mo4598() == i) {
            return c4873;
        }
        C4873 c4874 = new C4873(i);
        c4873Arr[length] = c4874;
        return c4874;
    }

    public final String toString() {
        int iMo4598 = mo4598();
        return "int{0x" + C16351.m37155(iMo4598) + " / " + iMo4598 + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26325;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Integer.toString(mo4598());
    }
}
