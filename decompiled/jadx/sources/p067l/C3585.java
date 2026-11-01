package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3585 extends AbstractC12310 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC3080 f7278;

    /* JADX INFO: renamed from: ۫ */
    public int f7279;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f7280;

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo5202() {
    }

    public C3585(InterfaceC6434 interfaceC6434, InterfaceC3080 interfaceC3080, int i, ArrayList arrayList) throws C5276 {
        super((AbstractC10298) interfaceC6434, i);
        this.f7280 = new ArrayList();
        this.f7278 = interfaceC3080;
        this.f7279 = interfaceC3080 == null ? 0 : interfaceC3080.mo5207();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6268 c6268 = (C6268) it.next();
            String typeName = getTypeName();
            String str = c6268.f15859;
            String str2 = c6268.f15854;
            if (!typeName.equals(str)) {
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch type name differs.");
            }
            int i2 = c6268.f15855 & 65535;
            String str3 = (String) map.put(Integer.valueOf(i2), str2);
            if (str3 != null && !str3.equals(str2)) {
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch entry names differ.");
            }
            if (interfaceC3080 != null) {
                for (InterfaceC9116 interfaceC9116 : interfaceC3080.mo5201()) {
                    if (interfaceC9116.mo4718(i2) && !str2.equals(interfaceC9116.mo4719(i2))) {
                        throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch entry name differs from existing variants.");
                    }
                }
            }
            this.f7279 = Math.max(this.f7279, i2 + 1);
        }
        HashSet hashSet = new HashSet();
        if (interfaceC3080 != null) {
            for (InterfaceC9116 c2914 : interfaceC3080.mo5201()) {
                String strM10472 = C4927.m10472(c2914);
                ArrayList arrayListM6589 = m6589(strM10472, arrayList);
                ArrayList arrayList2 = this.f7280;
                if (hashSet.add(strM10472) && !arrayListM6589.isEmpty()) {
                    c2914 = new C2914(this, c2914, strM10472, arrayListM6589);
                }
                arrayList2.add(c2914);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C6268 c6269 = (C6268) it2.next();
            if (hashSet.add(c6269.f15853)) {
                ArrayList arrayList3 = this.f7280;
                String str4 = c6269.f15853;
                arrayList3.add(new C2914(this, null, str4, m6589(str4, arrayList)));
            }
        }
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo5204(int i) {
        InterfaceC3080 interfaceC3080 = this.f7278;
        return interfaceC3080 != null && interfaceC3080.mo5204(i);
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5208(int i) {
        InterfaceC3080 interfaceC3080 = this.f7278;
        if (interfaceC3080 == null) {
            return 0;
        }
        return interfaceC3080.mo5208(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m6589(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6268 c6268 = (C6268) it.next();
            if (c6268.f15853.equals(str)) {
                arrayList2.add(c6268);
            }
        }
        return arrayList2;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5207() {
        return this.f7279;
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo5200() {
        return this.f7280.size();
    }

    @Override // p067l.InterfaceC3080
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9116 mo5206(int i) {
        return (InterfaceC9116) this.f7280.get(i);
    }

    @Override // p067l.AbstractC12310, p067l.InterfaceC3080
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo5201() {
        return this.f7280;
    }
}
