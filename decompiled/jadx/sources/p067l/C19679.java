package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩳᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19679 {

    /* JADX INFO: renamed from: ֫ */
    public final C16232 f59819;

    /* JADX INFO: renamed from: ۜ */
    public final HashSet f59820;

    /* JADX INFO: renamed from: ۧ */
    public final C20310 f59821;

    /* JADX INFO: renamed from: ܳ */
    public final String f59822;

    /* JADX INFO: renamed from: ܽ */
    public final C14944 f59823;

    /* JADX INFO: renamed from: ܿ */
    public C25123 f59824;

    /* JADX INFO: renamed from: ᩳ */
    public final C24729 f59825;

    /* JADX INFO: renamed from: ᩻ */
    public final C12954 f59826;

    public C19679(C20310 c20310, C24729 c24729, String str, C14944 c14944, HashSet hashSet, C12954 c12954) {
        this.f59821 = c20310;
        this.f59819 = c20310.f62739;
        this.f59825 = c24729;
        this.f59822 = str;
        this.f59823 = c14944;
        this.f59820 = hashSet;
        this.f59826 = c12954;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44698(InterfaceC9116 interfaceC9116, InterfaceC22528 interfaceC22528) {
        String str;
        String str2;
        String str3;
        C11633 c11633M44696;
        String strM10472 = C4927.m10472(interfaceC9116);
        boolean zM25274 = C10962.m25274(interfaceC22528);
        C11633 c11633M44697 = null;
        HashSet hashSet = this.f59820;
        C20310 c20310 = this.f59821;
        String str4 = this.f59822;
        if (zM25274) {
            C12974 c12974M25251 = C10962.m25251(c20310, interfaceC22528.getValue(0), null, null, strM10472, 0, 0, hashSet, null, null);
            String str5 = c12974M25251.f36491;
            String str6 = c12974M25251.f36502;
            if (!"resource_table_file_path".equals(str4)) {
                C11633 c11633M44698 = "file_path".equals(str6) ? m44696(str5, "file_path", null) : null;
                if (c11633M44698 == null && c12974M25251.f36504) {
                    c11633M44698 = m44696(str5, "styledText", null);
                }
                c11633M44697 = c11633M44698;
                if (c11633M44697 == null) {
                    c11633M44697 = m44696(str5, C0226b.f1011d, null);
                }
            } else if ("file_path".equals(str6)) {
                c11633M44697 = m44696(str5, "file_path", null);
            }
            return m44697(c12974M25251, c11633M44697);
        }
        ArrayList arrayList = new ArrayList();
        int iMo31471 = interfaceC22528.mo31471();
        C12974 c12974 = c12974;
        String str7 = "file_path";
        String str8 = "resource_table_file_path";
        String str9 = str4;
        String str10 = "styledText";
        String str11 = C0226b.f1011d;
        C12974 c12975 = new C12974(null, null, strM10472, "item_list", false, false, null, null, null, null, null, arrayList, false, iMo31471, null);
        for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
            C2874 c2874M25265 = C10962.m25265(this.f59819, interfaceC9116, interfaceC3751.mo7249());
            C12974 c12974M25252 = C10962.m25251(c20310, interfaceC3751, c2874M25265.f4967, c2874M25265.f4968, strM10472, 0, 0, hashSet, null, null);
            String str12 = c12974M25252.f36491;
            String str13 = c12974M25252.f36502;
            String str14 = str8;
            String str15 = str9;
            if (!str14.equals(str15)) {
                str = str7;
                C11633 c11633M44699 = str.equals(str13) ? m44696(str12, str, c12974M25252) : null;
                if (c11633M44699 == null && c12974M25252.f36504) {
                    str2 = str10;
                    c11633M44699 = m44696(str12, str2, c12974M25252);
                } else {
                    str2 = str10;
                }
                if (c11633M44699 == null) {
                    str3 = str11;
                    c11633M44696 = m44696(str12, str3, c12974M25252);
                } else {
                    str3 = str11;
                    c11633M44696 = c11633M44699;
                }
            } else {
                str = str7;
                c11633M44696 = str.equals(str13) ? m44696(str12, str, c12974M25252) : null;
                str2 = str10;
                str3 = str11;
            }
            if (m44697(c12974, c11633M44696)) {
                return true;
            }
            c12974 = c12974;
            str9 = str15;
            str8 = str14;
            str7 = str;
            str10 = str2;
            str11 = str3;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private C11633 m44696(String str, String str2, C12974 c12974) {
        C4236 c4236M29685;
        if (str == null || str.isEmpty() || (c4236M29685 = this.f59826.m29685(str, "resource_table_value")) == null) {
            return null;
        }
        return new C11633(str, c4236M29685, str2, c12974);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m44697(C12974 c12974, C11633 c11633) {
        String strReplace;
        C4236 c4236;
        int i;
        if (c11633 == null) {
            return false;
        }
        String str = c11633.f32463;
        C4236 c4237 = c11633.f32462;
        int i2 = c4237.f9370;
        String str2 = c11633.f32464;
        C24729 c24729 = this.f59825;
        if (!c24729.f78295 || (i = c24729.f78292) <= 0 || i2 < 0) {
            strReplace = null;
        } else {
            int iMin = Math.min(i, 300);
            strReplace = C10127.m23604(C10127.m23611(i2, -Math.max(0, iMin / 3), str2), str2.length(), iMin, str2).replace('\n', ' ');
        }
        C18337 c18337M41772 = C18337.m41772(c12974, c11633.f32461, str, strReplace);
        if (c24729.f78287) {
            c4237.m8616();
            c4236 = c4237;
        } else {
            c4236 = null;
        }
        this.f59824 = new C25123("resource", this.f59822, str, c4236, null, this.f59823, c18337M41772, null, null, null);
        return true;
    }
}
