package p067l;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1U0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8579 implements InterfaceC4790 {

    /* JADX INFO: renamed from: ֫ */
    public final C19308 f23058;

    /* JADX INFO: renamed from: ۧ */
    public final C11262 f23059;

    public C8579(C19308 c19308, C17548 c17548, C11262 c11262) {
        this.f23058 = c19308;
        this.f23059 = c11262;
    }

    @Override // p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5457(C5187 c5187, C14574 c14574) {
        m19991(c5187, c14574, true);
    }

    @Override // p067l.InterfaceC4790
    /* JADX INFO: renamed from: ֫ */
    public final void mo5456(C5187 c5187, C11893 c11893) {
        if (C24158.m53423(c11893.m14973())) {
            return;
        }
        m19991(c5187, c11893, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19991(C5187 c5187, AbstractC13904 abstractC13904, boolean z) {
        String strSubstring;
        String string;
        String strM14973 = abstractC13904.m14973();
        C19308 c19308 = this.f23058;
        AbstractC17966 abstractC17966 = C12603.f35393;
        Map map = (Map) c19308.get(abstractC17966);
        if (map == null) {
            map = new HashMap();
            c19308.put(abstractC17966, map);
        }
        String strM26179 = C11262.m26179(abstractC13904);
        String str = (String) map.get(strM26179);
        if (str == null || strM14973.equals(str)) {
            return;
        }
        if (C17295.m39206(abstractC13904) instanceof C21991) {
            AbstractC17966 abstractC17966M14972 = abstractC13904.m14972();
            StringBuilder sb = new StringBuilder("Warning: ");
            sb.append(c5187.m48106().replace('/', '.'));
            if (z) {
                StringBuilder sb2 = new StringBuilder(": field '");
                sb2.append("" + C24158.m53420(abstractC17966M14972.mo7686()) + ' ' + strM14973);
                string = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder(": method '");
                String strM48106 = c5187.m48106();
                String strMo7686 = abstractC17966M14972.mo7686();
                StringBuilder sb4 = new StringBuilder("");
                if (strM14973.equals("<init>")) {
                    String strReplace = strM48106.replace('/', '.');
                    strSubstring = strReplace.substring(strReplace.lastIndexOf(46) + 1);
                } else {
                    strSubstring = C24158.m53420(strMo7686.substring(strMo7686.indexOf(41) + 1)) + ' ' + strM14973;
                }
                sb4.append(strSubstring);
                sb4.append('(');
                sb4.append(C24158.m53412(strMo7686));
                sb4.append(')');
                sb3.append(sb4.toString());
                string = sb3.toString();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, string, "' can't be mapped to '", strM26179, "' because it would conflict with ");
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, z ? "field '" : "method '", str, "', which is already being mapped to '", strM26179);
            sb.append("'");
        }
        C17295.m39206(abstractC13904).mo14967(null);
        abstractC13904.mo14970(c5187, this.f23059);
    }
}
