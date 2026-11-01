package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.᩷ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes5.dex */
public final class C22054 extends AbstractC17358 {
    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ۧ */
    public final int mo5704() {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_HEADER_ITEM;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5703(C3948 c3948, C19705 c19705) {
        int iM18448 = c3948.m7853().m18448();
        C6630 c6630M7851 = c3948.m7851();
        C6630 c6630M7863 = c3948.m7863();
        int iM18449 = c6630M7851.m18448();
        int iMo15108 = (c6630M7863.mo15108() + c6630M7863.m18448()) - iM18449;
        int i = c3948.m7859().f32434;
        String str = "039";
        if (i < 28) {
            if (i >= 10000) {
                str = "040";
            } else if (i < 28) {
                str = i >= 26 ? "038" : i >= 24 ? "037" : "035";
            }
        }
        String strM16053 = C6988.m16053("dex\n", str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        if (c19705.m44765()) {
            c19705.m44760(8, "magic: " + new C14930(strM16053).m34150());
            c19705.m44760(4, "checksum");
            c19705.m44760(20, "signature");
            c19705.m44760(4, "file_size:       ".concat(C16351.m37155(c3948.m7864())));
            c19705.m44760(4, "header_size:     ".concat(C16351.m37155(UMErrorCode.E_UM_BE_DEFLATE_FAILED)));
            c19705.m44760(4, "endian_tag:      ".concat(C16351.m37155(305419896)));
            c19705.m44760(4, "link_size:       0");
            c19705.m44760(4, "link_off:        0");
            c19705.m44760(4, "map_off:         ".concat(C16351.m37155(iM18448)));
        }
        for (int i2 = 0; i2 < 8; i2++) {
            c19705.m44776(strM16053.charAt(i2));
        }
        c19705.m44777(24);
        c19705.m44773(c3948.m7864());
        c19705.m44773(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c19705.m44773(305419896);
        c19705.m44777(8);
        c19705.m44773(iM18448);
        c3948.m7861().m8959(c19705);
        c3948.m7862().m41993(c19705);
        c3948.m7848().m27433(c19705);
        c3948.m7856().m20057(c19705);
        c3948.m7857().m50877(c19705);
        c3948.m7860().m34579(c19705);
        if (c19705.m44765()) {
            c19705.m44760(4, "data_size:       ".concat(C16351.m37155(iMo15108)));
            c19705.m44760(4, "data_off:        ".concat(C16351.m37155(iM18449)));
        }
        c19705.m44773(iMo15108);
        c19705.m44773(iM18449);
    }
}
