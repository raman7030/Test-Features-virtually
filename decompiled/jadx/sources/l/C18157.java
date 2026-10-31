package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBDG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18157 extends AbstractC0517 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C18157 f56462 = new C18157(0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C18157 f56461 = new C18157(1);

    @Override // l.AbstractC13717
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8292() {
        return ClassTransform.BOOLEAN;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18157 m42265(int i) {
        if (i == 0) {
            return f56462;
        }
        if (i == 1) {
            return f56461;
        }
        throw new IllegalArgumentException(C19370.m44628(i, "bogus value: "));
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23402;
    }

    public final String toString() {
        return mo2231() == 0 ? "boolean{false}" : "boolean{true}";
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return mo2231() == 0 ? "false" : "true";
    }
}
