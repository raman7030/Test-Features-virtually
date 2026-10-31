package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۜܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6BDA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6868 extends AbstractC0517 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C6868 f21232 = new C6868(0);

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.CHARACTER;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6868 m18552(int i) {
        char c = (char) i;
        if (c == i) {
            return new C6868(c);
        }
        throw new IllegalArgumentException(C19370.m44628(i, "bogus char value: "));
    }

    public final String toString() {
        int iMo2231 = mo2231();
        return "char{0x" + C14712.m35006(iMo2231) + " / " + iMo2231 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23389;
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return Integer.toString(mo2231());
    }
}
