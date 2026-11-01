package p067l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C2914 extends AbstractC8957 {

    /* JADX INFO: renamed from: ۗ */
    public int f5036;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC9116 f5037;

    /* JADX INFO: renamed from: ۬ */
    public final HashMap f5038;

    /* JADX INFO: renamed from: ᩶ */
    public final HashMap f5039;

    public C2914(InterfaceC3080 interfaceC3080, InterfaceC9116 interfaceC9116, String str, ArrayList arrayList) throws C5276 {
        C22999 c22999Mo20693;
        super((AbstractC12310) interfaceC3080);
        this.f5039 = new HashMap();
        this.f5038 = new HashMap();
        this.f5037 = interfaceC9116;
        try {
            if (interfaceC9116 == null) {
                c22999Mo20693 = C22999.m51348("default".equals(str) ? "" : str, ((AbstractC10298) ((AbstractC12310) interfaceC3080).mo5203()).mo14712());
            } else {
                c22999Mo20693 = interfaceC9116.mo20693();
            }
            this.f24275 = c22999Mo20693;
            if (!C4927.m10472(this).equals(str)) {
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch variant is not canonical.");
            }
            this.f5036 = interfaceC9116 == null ? -1 : interfaceC9116.mo4715();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C6268 c6268 = (C6268) it.next();
                int i = c6268.f15855 & 65535;
                if ((interfaceC9116 != null && interfaceC9116.mo4718(i)) || this.f5038.put(Integer.valueOf(i), c6268.f15854) != null) {
                    throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Added resource variant already exists.");
                }
                this.f5036 = Math.max(this.f5036, i);
                this.f5039.put(Integer.valueOf(i), C25003.m54910(this, i, c6268.f15856));
            }
        } catch (Exception unused) {
            throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch variant is invalid.");
        }
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֨ */
    public final int mo4715() {
        return this.f5036;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4718(int i) {
        if (this.f5039.containsKey(Integer.valueOf(i))) {
            return true;
        }
        InterfaceC9116 interfaceC9116 = this.f5037;
        return interfaceC9116 != null && interfaceC9116.mo4718(i);
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo4716() {
        InterfaceC9116 interfaceC9116 = this.f5037;
        return interfaceC9116 != null && interfaceC9116.mo4716();
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ᩷ۧ */
    public final boolean mo4720() {
        InterfaceC9116 interfaceC9116 = this.f5037;
        return interfaceC9116 != null && interfaceC9116.mo4720();
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܽ */
    public final String mo4719(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f5038;
        if (map.containsKey(numValueOf)) {
            return (String) map.get(Integer.valueOf(i));
        }
        InterfaceC9116 interfaceC9116 = this.f5037;
        if (interfaceC9116 == null) {
            return null;
        }
        return interfaceC9116.mo4719(i);
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22528 mo4717(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f5039;
        if (map.containsKey(numValueOf)) {
            return (InterfaceC22528) map.get(Integer.valueOf(i));
        }
        InterfaceC9116 interfaceC9116 = this.f5037;
        if (interfaceC9116 == null) {
            return null;
        }
        return interfaceC9116.mo4717(i);
    }
}
