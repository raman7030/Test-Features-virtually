package l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6535 implements InterfaceC2548 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17824 f20180;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9358 f20181;

    public C6535(C17824 c17824, C15972 c15972, C9358 c9358) {
        this.f20180 = c17824;
        this.f20181 = c9358;
    }

    @Override // l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        m18041(c2966, c12843, true);
    }

    @Override // l.InterfaceC2548
    /* JADX INFO: renamed from: ֫ */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        if (C22927.m51032(c10022.m13109())) {
            return;
        }
        m18041(c2966, c10022, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18041(C2966 c2966, AbstractC12138 abstractC12138, boolean z) {
        String strSubstring;
        String string;
        String strM13109 = abstractC12138.m13109();
        C17824 c17824 = this.f20180;
        AbstractC16412 abstractC16412 = C10769.f32418;
        Map map = (Map) c17824.get(abstractC16412);
        if (map == null) {
            map = new HashMap();
            c17824.put(abstractC16412, map);
        }
        String strM24169 = C9358.m24169(abstractC12138);
        String str = (String) map.get(strM24169);
        if (str == null || strM13109.equals(str)) {
            return;
        }
        if (C15706.m37039(abstractC12138) instanceof C20647) {
            AbstractC16412 abstractC16412M13108 = abstractC12138.m13108();
            StringBuilder sb = new StringBuilder("Warning: ");
            sb.append(c2966.m45794().replace('/', '.'));
            if (z) {
                StringBuilder sb2 = new StringBuilder(": field '");
                sb2.append("" + C22927.m51029(abstractC16412M13108.mo5456()) + ' ' + strM13109);
                string = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder(": method '");
                String strM45794 = c2966.m45794();
                String strMo5456 = abstractC16412M13108.mo5456();
                StringBuilder sb4 = new StringBuilder("");
                if (strM13109.equals("<init>")) {
                    String strReplace = strM45794.replace('/', '.');
                    strSubstring = strReplace.substring(strReplace.lastIndexOf(46) + 1);
                } else {
                    strSubstring = C22927.m51029(strMo5456.substring(strMo5456.indexOf(41) + 1)) + ' ' + strM13109;
                }
                sb4.append(strSubstring);
                sb4.append('(');
                sb4.append(C22927.m51021(strMo5456));
                sb4.append(')');
                sb3.append(sb4.toString());
                string = sb3.toString();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, string, "' can't be mapped to '", strM24169, "' because it would conflict with ");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, z ? "field '" : "method '", str, "', which is already being mapped to '", strM24169);
            sb.append("'");
        }
        C15706.m37039(abstractC12138).mo13103(null);
        abstractC12138.mo13106(c2966, this.f20181);
    }
}
