package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280 extends AbstractC10460 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0748 f4504;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4505;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f4506;

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۢ֫ */
    public final void mo2873() {
    }

    public C1280(InterfaceC4277 interfaceC4277, InterfaceC0748 interfaceC0748, int i, ArrayList arrayList) throws C3059 {
        super((AbstractC8343) interfaceC4277, i);
        this.f4506 = new ArrayList();
        this.f4504 = interfaceC0748;
        this.f4505 = interfaceC0748 == null ? 0 : interfaceC0748.mo2878();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4103 c4103 = (C4103) it.next();
            String typeName = getTypeName();
            String str = c4103.f13045;
            String str2 = c4103.f13040;
            if (!typeName.equals(str)) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch type name differs.");
            }
            int i2 = c4103.f13041 & 65535;
            String str3 = (String) map.put(Integer.valueOf(i2), str2);
            if (str3 != null && !str3.equals(str2)) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch entry names differ.");
            }
            if (interfaceC0748 != null) {
                for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2872()) {
                    if (interfaceC7099.mo2347(i2) && !str2.equals(interfaceC7099.mo2348(i2))) {
                        throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch entry name differs from existing variants.");
                    }
                }
            }
            this.f4505 = Math.max(this.f4505, i2 + 1);
        }
        HashSet hashSet = new HashSet();
        if (interfaceC0748 != null) {
            for (InterfaceC7099 c0574 : interfaceC0748.mo2872()) {
                String strM8426 = C2692.m8426(c0574);
                ArrayList arrayListM4343 = m4343(strM8426, arrayList);
                ArrayList arrayList2 = this.f4506;
                if (hashSet.add(strM8426) && !arrayListM4343.isEmpty()) {
                    c0574 = new C0574(this, c0574, strM8426, arrayListM4343);
                }
                arrayList2.add(c0574);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C4103 c4104 = (C4103) it2.next();
            if (hashSet.add(c4104.f13039)) {
                ArrayList arrayList3 = this.f4506;
                String str4 = c4104.f13039;
                arrayList3.add(new C0574(this, null, str4, m4343(str4, arrayList)));
            }
        }
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo2875(int i) {
        InterfaceC0748 interfaceC0748 = this.f4504;
        return interfaceC0748 != null && interfaceC0748.mo2875(i);
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2879(int i) {
        InterfaceC0748 interfaceC0748 = this.f4504;
        if (interfaceC0748 == null) {
            return 0;
        }
        return interfaceC0748.mo2879(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m4343(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4103 c4103 = (C4103) it.next();
            if (c4103.f13039.equals(str)) {
                arrayList2.add(c4103);
            }
        }
        return arrayList2;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ᩷ */
    public final int mo2878() {
        return this.f4505;
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ۜ֫ */
    public final int mo2871() {
        return this.f4506.size();
    }

    @Override // l.InterfaceC0748
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7099 mo2877(int i) {
        return (InterfaceC7099) this.f4506.get(i);
    }

    @Override // l.AbstractC10460, l.InterfaceC0748
    /* JADX INFO: renamed from: ۢ */
    public final Iterable mo2872() {
        return this.f4506;
    }
}
