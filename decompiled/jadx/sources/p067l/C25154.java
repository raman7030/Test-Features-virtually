package p067l;

import com.umeng.analytics.pro.C0708d;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes.dex */
public final class C25154 implements InterfaceC16436, Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public static final C25154 f80484 = new C25154();

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15730(Object obj, InterfaceC21152 interfaceC21152) {
        return obj;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16436 mo15731(InterfaceC16436 interfaceC16436) {
        C13045.m29867(interfaceC16436, C0708d.f2602R);
        return interfaceC16436;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19790 mo11134(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        return null;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16436 mo11137(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        return this;
    }

    private final Object readResolve() {
        return f80484;
    }
}
