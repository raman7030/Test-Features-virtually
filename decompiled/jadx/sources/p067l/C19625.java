package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DBDG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19625 extends AbstractC2860 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C19625 f59676 = new C19625(0);

    /* JADX INFO: renamed from: ᩶ */
    public static final C19625 f59675 = new C19625(1);

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.BOOLEAN;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19625 m44526(int i) {
        if (i == 0) {
            return f59676;
        }
        if (i == 1) {
            return f59675;
        }
        throw new IllegalArgumentException(C20778.m46922(i, "bogus value: "));
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26314;
    }

    public final String toString() {
        return mo4598() == 0 ? "boolean{false}" : "boolean{true}";
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return mo4598() == 0 ? "false" : "true";
    }
}
