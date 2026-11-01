package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NALW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8410 implements InterfaceC12374, InterfaceC14445 {

    /* JADX INFO: renamed from: ֫ */
    public final Class f22551;

    public C8410(Class cls) {
        C13045.m29867(cls, "jClass");
        this.f22551 = cls;
    }

    @Override // p067l.InterfaceC14445
    /* JADX INFO: renamed from: ֫ */
    public final Class mo19593() {
        return this.f22551;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m19594() {
        return C12434.m28639(this.f22551);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8410) && C12981.m29754(this).equals(C12981.m29754((InterfaceC12374) obj));
    }

    public final int hashCode() {
        return C12981.m29754(this).hashCode();
    }

    public final String toString() {
        return this.f22551.toString() + " (Kotlin reflection is not available)";
    }

    static {
        int i = 0;
        List listM8476 = C4187.m8476((Object[]) new Class[]{InterfaceC4387.class, InterfaceC17797.class, InterfaceC21152.class, InterfaceC3045.class, InterfaceC7740.class, InterfaceC3716.class, InterfaceC10422.class, InterfaceC17126.class, InterfaceC23163.class, InterfaceC23833.class, InterfaceC13105.class, InterfaceC18468.class, InterfaceC19810.class, InterfaceC19139.class, InterfaceC16456.class, InterfaceC25174.class, InterfaceC9081.class, InterfaceC22493.class, InterfaceC11764.class, InterfaceC11093.class, InterfaceC5058.class, InterfaceC6399.class, InterfaceC20481.class});
        ArrayList arrayList = new ArrayList(C4187.m8472((Iterable) listM8476));
        for (Object obj : listM8476) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C17402((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        C2845.m4540(arrayList);
    }
}
