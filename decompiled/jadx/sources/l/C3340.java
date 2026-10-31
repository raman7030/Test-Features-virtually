package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBI7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3340 extends AbstractC0517 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C3340 f10558 = new C3340(0);

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.SHORT;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3340 m10202(int i) {
        short s = (short) i;
        if (s == i) {
            return new C3340(s);
        }
        throw new IllegalArgumentException(C19370.m44628(i, "bogus short value: "));
    }

    public final String toString() {
        int iMo2231 = mo2231();
        return "short{0x" + C14712.m35006(iMo2231) + " / " + iMo2231 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23393;
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return Integer.toString(mo2231());
    }
}
