package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۤ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5BR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10544 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC2452[] f31656 = new InterfaceC2452[10];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f31655 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26472(String str, InterfaceC2452 interfaceC2452) {
        ArrayList arrayList = this.f31655;
        int size = arrayList.size();
        InterfaceC2452[] interfaceC2452Arr = this.f31656;
        if (size == interfaceC2452Arr.length) {
            InterfaceC2452[] interfaceC2452Arr2 = new InterfaceC2452[interfaceC2452Arr.length + 10];
            this.f31656 = interfaceC2452Arr2;
            System.arraycopy(interfaceC2452Arr, 0, interfaceC2452Arr2, 0, interfaceC2452Arr.length);
        }
        this.f31656[arrayList.size()] = interfaceC2452;
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26471(String str) {
        int iIndexOf = this.f31655.indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new RuntimeException("Null");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26473(C20422 c20422, int i) {
        this.f31656[i].mo1728(c20422.f65886);
    }

    public C10544() {
        m26472("FqEbNJXkJJiNHyALXoAPmNssdfAfNBwo", new C0459());
        m26472("VccaTcBCLZNJJFdPoFgCfDEXEfyLbLRc", new C6664());
        m26472("EPBCJBqAFiXcEDiZdDcukBwcwgiRscVA", new C3863());
        m26472("CTHiqssoBaukCbPJsgNBkFeCwooFJZbf", new C2732());
        m26472("qoNZDuCTyLXAuEZHyHscRAodgmRgkJVA", new C13739());
        m26472("ybqoPJTkJJFqmNPBdfToJBZDdTDCNdiR", new C6554());
        m26472("NBwgiNDasoayTwBCayNZeyybZTbXcyHi", new C10881());
        C15856.m37545(this);
        C7369.m19812(this);
        C9692.m24636(this);
        C23597.m52071(this);
        C13034.m31616(this);
        C19386.m44646(this);
        C22912.m50998(this);
        C8075.m21439(this);
    }
}
