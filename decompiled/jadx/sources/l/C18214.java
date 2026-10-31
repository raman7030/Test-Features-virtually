package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩳᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18214 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14587 f56606;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f56607;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18878 f56608;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56609;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13232 f56610;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23942 f56611;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23528 f56612;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11138 f56613;

    public C18214(C18878 c18878, C23528 c23528, String str, C13232 c13232, HashSet hashSet, C11138 c11138) {
        this.f56608 = c18878;
        this.f56606 = c18878.f59510;
        this.f56612 = c23528;
        this.f56609 = str;
        this.f56610 = c13232;
        this.f56607 = hashSet;
        this.f56613 = c11138;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42437(InterfaceC7099 interfaceC7099, InterfaceC21211 interfaceC21211) {
        String str;
        String str2;
        String str3;
        C9748 c9748M42435;
        String strM8426 = C2692.m8426(interfaceC7099);
        boolean zM23329 = C9042.m23329(interfaceC21211);
        C9748 c9748M42436 = null;
        HashSet hashSet = this.f56607;
        C18878 c18878 = this.f56608;
        String str4 = this.f56609;
        if (zM23329) {
            C11159 c11159M23306 = C9042.m23306(c18878, interfaceC21211.getValue(0), null, null, strM8426, 0, 0, hashSet, null, null);
            String str5 = c11159M23306.f33491;
            String str6 = c11159M23306.f33502;
            if (!"resource_table_file_path".equals(str4)) {
                C9748 c9748M42437 = "file_path".equals(str6) ? m42435(str5, "file_path", null) : null;
                if (c9748M42437 == null && c11159M23306.f33504) {
                    c9748M42437 = m42435(str5, "styledText", null);
                }
                c9748M42436 = c9748M42437;
                if (c9748M42436 == null) {
                    c9748M42436 = m42435(str5, b.d, null);
                }
            } else if ("file_path".equals(str6)) {
                c9748M42436 = m42435(str5, "file_path", null);
            }
            return m42436(c11159M23306, c9748M42436);
        }
        ArrayList arrayList = new ArrayList();
        int iMo29409 = interfaceC21211.mo29409();
        C11159 c11159 = c11159;
        String str7 = "file_path";
        String str8 = "resource_table_file_path";
        String str9 = str4;
        String str10 = "styledText";
        String str11 = b.d;
        C11159 c111510 = new C11159(null, null, strM8426, "item_list", false, false, null, null, null, null, null, arrayList, false, iMo29409, null);
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            C0532 c0532M23320 = C9042.m23320(this.f56606, interfaceC7099, interfaceC1454.mo5006());
            C11159 c11159M23307 = C9042.m23306(c18878, interfaceC1454, c0532M23320.f2194, c0532M23320.f2195, strM8426, 0, 0, hashSet, null, null);
            String str12 = c11159M23307.f33491;
            String str13 = c11159M23307.f33502;
            String str14 = str8;
            String str15 = str9;
            if (!str14.equals(str15)) {
                str = str7;
                C9748 c9748M42438 = str.equals(str13) ? m42435(str12, str, c11159M23307) : null;
                if (c9748M42438 == null && c11159M23307.f33504) {
                    str2 = str10;
                    c9748M42438 = m42435(str12, str2, c11159M23307);
                } else {
                    str2 = str10;
                }
                if (c9748M42438 == null) {
                    str3 = str11;
                    c9748M42435 = m42435(str12, str3, c11159M23307);
                } else {
                    str3 = str11;
                    c9748M42435 = c9748M42438;
                }
            } else {
                str = str7;
                c9748M42435 = str.equals(str13) ? m42435(str12, str, c11159M23307) : null;
                str2 = str10;
                str3 = str11;
            }
            if (m42436(c11159, c9748M42435)) {
                return true;
            }
            c11159 = c11159;
            str9 = str15;
            str8 = str14;
            str7 = str;
            str10 = str2;
            str11 = str3;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9748 m42435(String str, String str2, C11159 c11159) {
        C1965 c1965M27623;
        if (str == null || str.isEmpty() || (c1965M27623 = this.f56613.m27623(str, "resource_table_value")) == null) {
            return null;
        }
        return new C9748(str, c1965M27623, str2, c11159);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m42436(C11159 c11159, C9748 c9748) {
        String strReplace;
        C1965 c1965;
        int i;
        if (c9748 == null) {
            return false;
        }
        String str = c9748.f29512;
        C1965 c1966 = c9748.f29511;
        int i2 = c1966.f6591;
        String str2 = c9748.f29513;
        C23528 c23528 = this.f56612;
        if (!c23528.f75549 || (i = c23528.f75546) <= 0 || i2 < 0) {
            strReplace = null;
        } else {
            int iMin = Math.min(i, 300);
            strReplace = C8163.m21635(C8163.m21642(i2, -Math.max(0, iMin / 3), str2), str2.length(), iMin, str2).replace('\n', ' ');
        }
        C16802 c16802M39536 = C16802.m39536(c11159, c9748.f29510, str, strReplace);
        if (c23528.f75541) {
            c1966.m6475();
            c1965 = c1966;
        } else {
            c1965 = null;
        }
        this.f56611 = new C23942("resource", this.f56609, str, c1965, null, this.f56610, c16802M39536, null, null, null);
        return true;
    }
}
