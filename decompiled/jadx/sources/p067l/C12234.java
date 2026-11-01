package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12234 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC16436[] f34179;

    public C12234(InterfaceC16436[] interfaceC16436Arr) {
        this.f34179 = interfaceC16436Arr;
    }

    private final Object readResolve() {
        InterfaceC16436[] interfaceC16436Arr = this.f34179;
        InterfaceC16436 interfaceC16436Mo15731 = C25154.f80484;
        for (InterfaceC16436 interfaceC16436 : interfaceC16436Arr) {
            interfaceC16436Mo15731 = interfaceC16436Mo15731.mo15731(interfaceC16436);
        }
        return interfaceC16436Mo15731;
    }
}
