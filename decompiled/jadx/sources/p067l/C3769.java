package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes2.dex */
public final class C3769 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Map f8046;

    public C3769(Map map) {
        this.f8046 = map;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3769) && C12826.equals(this.f8046, ((C3769) obj).f8046);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f8046);
    }

    public final String toString() {
        Object[] objArr = {this.f8046};
        String[] strArrSplit = "files".length() == 0 ? new String[0] : "files".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C3769.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7345(AbstractC15599 abstractC15599) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f8046);
            if (abstractC15599 instanceof C4598) {
                for (C10633 c10633 : ((C4598) abstractC15599).m9720()) {
                    if (!c10633.m24449()) {
                        return false;
                    }
                    AbstractC17043 abstractC17043M24447 = c10633.m24447();
                    C15525.putIfAbsent(linkedHashMap, abstractC17043M24447.mo25505(), new C14359(abstractC17043M24447.mo25505(), c10633.length(), c10633.m24448()));
                }
            }
            LinkedHashMap linkedHashMapM42098 = C18521.m42098(abstractC15599);
            if (!linkedHashMap.keySet().equals(linkedHashMapM42098.keySet())) {
                return false;
            }
            for (AbstractC17043 abstractC17043 : linkedHashMapM42098.values()) {
                if (!((C14359) linkedHashMap.get(abstractC17043.mo25505())).equals(C18521.m42095(abstractC17043))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
