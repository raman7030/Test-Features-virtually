package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S1JO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4583 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Object f14625 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5242 f14626 = new C5242();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f14627 = new WeakReference(null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13483(InterfaceC23586 interfaceC23586, InterfaceC20106 interfaceC20106) {
        C5242 c5242 = this.f14626;
        if (c5242.m1671()) {
            InterfaceC1008 interfaceC1008 = (InterfaceC1008) this.f14627.get();
            if (interfaceC1008 != null) {
                c5242.m1670(interfaceC1008);
                this.f14627.clear();
            }
            if (c5242.m1671()) {
                throw new RuntimeException();
            }
        }
        C22222 c22222 = new C22222(0, interfaceC20106);
        this.f14627 = new WeakReference(c22222);
        c5242.m1668(interfaceC23586, c22222);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13480(InterfaceC20106 interfaceC20106, Object[] objArr) {
        Object obj = objArr[0];
        Object obj2 = f14625;
        if (obj != obj2) {
            objArr[0] = obj2;
            interfaceC20106.mo13218(obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13481(Object obj) {
        this.f14626.mo1669(new Object[]{obj});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13482(C9028 c9028) {
        this.f14626.mo1664(new Object[]{c9028});
    }
}
