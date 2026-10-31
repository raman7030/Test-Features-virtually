package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NALW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6356 implements InterfaceC10527, InterfaceC12706 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class f19678;

    public C6356(Class cls) {
        C11233.m27805(cls, "jClass");
        this.f19678 = cls;
    }

    @Override // l.InterfaceC12706
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class mo17650() {
        return this.f19678;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m17651() {
        return C10590.m26602(this.f19678);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6356) && C11166.m27692(this).equals(C11166.m27692((InterfaceC10527) obj));
    }

    public final int hashCode() {
        return C11166.m27692(this).hashCode();
    }

    public final String toString() {
        return this.f19678.toString() + " (Kotlin reflection is not available)";
    }

    static {
        int i = 0;
        List listM6274 = C1913.m6274((Object[]) new Class[]{InterfaceC2123.class, InterfaceC16233.class, InterfaceC19763.class, InterfaceC0711.class, InterfaceC5651.class, InterfaceC1417.class, InterfaceC8473.class, InterfaceC15527.class, InterfaceC21879.class, InterfaceC22584.class, InterfaceC11296.class, InterfaceC16939.class, InterfaceC18351.class, InterfaceC17645.class, InterfaceC14822.class, InterfaceC23995.class, InterfaceC7062.class, InterfaceC21174.class, InterfaceC9885.class, InterfaceC9179.class, InterfaceC2829.class, InterfaceC4240.class, InterfaceC19057.class});
        ArrayList arrayList = new ArrayList(C1913.m6270((Iterable) listM6274));
        for (Object obj : listM6274) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C15818((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        C0501.m2173(arrayList);
    }
}
