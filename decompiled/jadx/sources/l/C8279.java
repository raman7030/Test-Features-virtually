package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABB0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8279 extends AbstractC5457 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C8279 f25451 = new C8279(0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C8279 f25450 = new C8279(1);

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.LONG;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8279 m21878(long j) {
        return new C8279(j);
    }

    public final String toString() {
        long jMo2227 = mo2227();
        return "long{0x" + C14712.m35004(jMo2227) + " / " + jMo2227 + '}';
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23418;
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return Long.toString(mo2227());
    }
}
