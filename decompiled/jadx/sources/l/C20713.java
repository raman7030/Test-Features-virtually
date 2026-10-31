package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩷ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20713 extends AbstractC15772 {
    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ۧ */
    public final int mo3385() {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_HEADER_ITEM;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        int iM16522 = c1662.m5623().m16522();
        C4484 c4484M5621 = c1662.m5621();
        C4484 c4484M5633 = c1662.m5633();
        int iM16523 = c4484M5621.m16522();
        int iMo13226 = (c4484M5633.mo13226() + c4484M5633.m16522()) - iM16523;
        int i = c1662.m5629().f29484;
        String str = "039";
        if (i < 28) {
            if (i >= 10000) {
                str = "040";
            } else if (i < 28) {
                str = i >= 26 ? "038" : i >= 24 ? "037" : "035";
            }
        }
        String strM14172 = C4860.m14172("dex\n", str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        if (c18241.m42506()) {
            c18241.m42501(8, "magic: " + new C13217(strM14172).m32052());
            c18241.m42501(4, "checksum");
            c18241.m42501(20, "signature");
            c18241.m42501(4, "file_size:       ".concat(C14712.m35008(c1662.m5634())));
            c18241.m42501(4, "header_size:     ".concat(C14712.m35008(UMErrorCode.E_UM_BE_DEFLATE_FAILED)));
            c18241.m42501(4, "endian_tag:      ".concat(C14712.m35008(305419896)));
            c18241.m42501(4, "link_size:       0");
            c18241.m42501(4, "link_off:        0");
            c18241.m42501(4, "map_off:         ".concat(C14712.m35008(iM16522)));
        }
        for (int i2 = 0; i2 < 8; i2++) {
            c18241.m42517(strM14172.charAt(i2));
        }
        c18241.m42518(24);
        c18241.m42514(c1662.m5634());
        c18241.m42514(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c18241.m42514(305419896);
        c18241.m42518(8);
        c18241.m42514(iM16522);
        c1662.m5631().m6833(c18241);
        c1662.m5632().m39752(c18241);
        c1662.m5618().m25413(c18241);
        c1662.m5626().m18105(c18241);
        c1662.m5627().m48541(c18241);
        c1662.m5630().m32477(c18241);
        if (c18241.m42506()) {
            c18241.m42501(4, "data_size:       ".concat(C14712.m35008(iMo13226)));
            c18241.m42501(4, "data_off:        ".concat(C14712.m35008(iM16523)));
        }
        c18241.m42514(iMo13226);
        c18241.m42514(iM16523);
    }
}
