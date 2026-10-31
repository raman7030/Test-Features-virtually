package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C0574 extends AbstractC6932 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f2261;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 f2262;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f2263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f2264;

    public C0574(InterfaceC0748 interfaceC0748, InterfaceC7099 interfaceC7099, String str, ArrayList arrayList) throws C3059 {
        C21707 c21707Mo18743;
        super((AbstractC10460) interfaceC0748);
        this.f2264 = new HashMap();
        this.f2263 = new HashMap();
        this.f2262 = interfaceC7099;
        try {
            if (interfaceC7099 == null) {
                c21707Mo18743 = C21707.m48999("default".equals(str) ? "" : str, ((AbstractC8343) ((AbstractC10460) interfaceC0748).mo2874()).mo12848());
            } else {
                c21707Mo18743 = interfaceC7099.mo18743();
            }
            this.f21394 = c21707Mo18743;
            if (!C2692.m8426(this).equals(str)) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch variant is not canonical.");
            }
            this.f2261 = interfaceC7099 == null ? -1 : interfaceC7099.mo2344();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4103 c4103 = (C4103) it.next();
                int i = c4103.f13041 & 65535;
                if ((interfaceC7099 != null && interfaceC7099.mo2347(i)) || this.f2263.put(Integer.valueOf(i), c4103.f13040) != null) {
                    throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Added resource variant already exists.");
                }
                this.f2261 = Math.max(this.f2261, i);
                this.f2264.put(Integer.valueOf(i), C23816.m52501(this, i, c4103.f13042));
            }
        } catch (Exception unused) {
            throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch variant is invalid.");
        }
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo2344() {
        return this.f2261;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean mo2347(int i) {
        if (this.f2264.containsKey(Integer.valueOf(i))) {
            return true;
        }
        InterfaceC7099 interfaceC7099 = this.f2262;
        return interfaceC7099 != null && interfaceC7099.mo2347(i);
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2345() {
        InterfaceC7099 interfaceC7099 = this.f2262;
        return interfaceC7099 != null && interfaceC7099.mo2345();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo2349() {
        InterfaceC7099 interfaceC7099 = this.f2262;
        return interfaceC7099 != null && interfaceC7099.mo2349();
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo2348(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f2263;
        if (map.containsKey(numValueOf)) {
            return (String) map.get(Integer.valueOf(i));
        }
        InterfaceC7099 interfaceC7099 = this.f2262;
        if (interfaceC7099 == null) {
            return null;
        }
        return interfaceC7099.mo2348(i);
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21211 mo2346(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f2264;
        if (map.containsKey(numValueOf)) {
            return (InterfaceC21211) map.get(Integer.valueOf(i));
        }
        InterfaceC7099 interfaceC7099 = this.f2262;
        if (interfaceC7099 == null) {
            return null;
        }
        return interfaceC7099.mo2346(i);
    }
}
