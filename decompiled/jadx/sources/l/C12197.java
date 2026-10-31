package l;

import com.alipay.sdk.m.n.c;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۫ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12197 extends EnumC22780 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final int f36406 = 24;

    public /* synthetic */ C12197() {
        this("InBody", 6);
    }

    public C12197(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        switch (C21370.f68842[abstractC2195.f7214.ordinal()]) {
            case 1:
                c17136.m40178((C14188) abstractC2195);
                return true;
            case 2:
                c17136.m40182(this);
                return false;
            case 3:
                return m29672(abstractC2195, c17136);
            case 4:
                return m29671(abstractC2195, c17136);
            case 5:
                C17011 c17011 = (C17011) abstractC2195;
                if (c17011.m39895().equals(EnumC22780.f73536)) {
                    c17136.m40182(this);
                    return false;
                }
                if (c17136.m40223() && EnumC22780.m50859(c17011)) {
                    c17136.m40194();
                    c17136.m40179(c17011);
                    return true;
                }
                c17136.m40194();
                c17136.m40179(c17011);
                c17136.m40183(false);
                return true;
            case 6:
                if (c17136.m40189() <= 0) {
                    return true;
                }
                EnumC22780 enumC22780 = EnumC22780.f73543;
                c17136.f2106 = abstractC2195;
                return enumC22780.mo1361(abstractC2195, c17136);
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:402:0x0642  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m29672(AbstractC2195 abstractC2195, C17136 c17136) {
        C19814 c19814M40228;
        C12052 c12052M40198;
        C15578 c15578;
        abstractC2195.getClass();
        C9251 c9251 = (C9251) abstractC2195;
        String str = c9251.f26122;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1644953643:
                if (str.equals("frameset")) {
                    b = 0;
                }
                break;
            case -1377687758:
                if (str.equals("button")) {
                    b = 1;
                }
                break;
            case -1191214428:
                if (str.equals("iframe")) {
                    b = 2;
                }
                break;
            case -1134665583:
                if (str.equals("keygen")) {
                    b = 3;
                }
                break;
            case -1010136971:
                if (str.equals("option")) {
                    b = 4;
                }
                break;
            case -1003243718:
                if (str.equals("textarea")) {
                    b = 5;
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    b = 6;
                }
                break;
            case -891985998:
                if (str.equals("strike")) {
                    b = 7;
                }
                break;
            case -891980137:
                if (str.equals("strong")) {
                    b = 8;
                }
                break;
            case -80773204:
                if (str.equals("optgroup")) {
                    b = 9;
                }
                break;
            case 97:
                if (str.equals(am.av)) {
                    b = 10;
                }
                break;
            case 98:
                if (str.equals("b")) {
                    b = 11;
                }
                break;
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                if (str.equals(am.aC)) {
                    b = 12;
                }
                break;
            case 115:
                if (str.equals(am.aB)) {
                    b = cb.k;
                }
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                if (str.equals(am.aH)) {
                    b = cb.f77931l;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    b = 15;
                }
                break;
            case 3200:
                if (str.equals("dd")) {
                    b = 16;
                }
                break;
            case 3216:
                if (str.equals("dt")) {
                    b = 17;
                }
                break;
            case 3240:
                if (str.equals("em")) {
                    b = 18;
                }
                break;
            case 3273:
                if (str.equals("h1")) {
                    b = 19;
                }
                break;
            case 3274:
                if (str.equals("h2")) {
                    b = 20;
                }
                break;
            case 3275:
                if (str.equals("h3")) {
                    b = 21;
                }
                break;
            case 3276:
                if (str.equals("h4")) {
                    b = 22;
                }
                break;
            case 3277:
                if (str.equals("h5")) {
                    b = 23;
                }
                break;
            case 3278:
                if (str.equals("h6")) {
                    b = 24;
                }
                break;
            case 3338:
                if (str.equals("hr")) {
                    b = 25;
                }
                break;
            case 3453:
                if (str.equals("li")) {
                    b = 26;
                }
                break;
            case 3646:
                if (str.equals("rp")) {
                    b = 27;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                }
                break;
            case 3712:
                if (str.equals("tt")) {
                    b = 29;
                }
                break;
            case 97536:
                if (str.equals("big")) {
                    b = 30;
                }
                break;
            case 104387:
                if (str.equals("img")) {
                    b = bo.j;
                }
                break;
            case 111267:
                if (str.equals("pre")) {
                    b = UTF8.S_CS3;
                }
                break;
            case 114276:
                if (str.equals("svg")) {
                    b = PublicSuffixDatabase.EXCEPTION_MARKER;
                }
                break;
            case 117511:
                if (str.equals("wbr")) {
                    b = 34;
                }
                break;
            case 118811:
                if (str.equals("xmp")) {
                    b = 35;
                }
                break;
            case 3002509:
                if (str.equals("area")) {
                    b = 36;
                }
                break;
            case 3029410:
                if (str.equals("body")) {
                    b = 37;
                }
                break;
            case 3059181:
                if (str.equals("code")) {
                    b = 38;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b = 39;
                }
                break;
            case 3148996:
                if (str.equals(c.c)) {
                    b = 40;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    b = 41;
                }
                break;
            case 3344136:
                if (str.equals("math")) {
                    b = 42;
                }
                break;
            case 3386833:
                if (str.equals("nobr")) {
                    b = 43;
                }
                break;
            case 3536714:
                if (str.equals("span")) {
                    b = 44;
                }
                break;
            case 96620249:
                if (str.equals("embed")) {
                    b = 45;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    b = 46;
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    b = 47;
                }
                break;
            case 109548807:
                if (str.equals("small")) {
                    b = UTF8.S_P3A;
                }
                break;
            case 110115790:
                if (str.equals("table")) {
                    b = 49;
                }
                break;
            case 181975684:
                if (str.equals("listing")) {
                    b = 50;
                }
                break;
            case 1973234167:
                if (str.equals("plaintext")) {
                    b = 51;
                }
                break;
            case 2091304424:
                if (str.equals("isindex")) {
                    b = 52;
                }
                break;
            case 2115613112:
                if (str.equals("noembed")) {
                    b = 53;
                }
                break;
        }
        String[] strArr = C11492.f34318;
        String[] strArr2 = C17136.f52500;
        switch (b) {
            case 0:
                c17136.m40182(this);
                ArrayList arrayList = c17136.f2112;
                if (arrayList.size() == 1) {
                    return false;
                }
                if ((arrayList.size() > 2 && !((C19814) arrayList.get(1)).m45588().equals("body")) || !c17136.m40223()) {
                    return false;
                }
                C19814 c19814 = (C19814) arrayList.get(1);
                if (c19814.mo28099() != null) {
                    c19814.m28091();
                }
                while (arrayList.size() > 1) {
                    C18473.m42953(arrayList, 1);
                }
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73535);
                return true;
            case 1:
                if (c17136.m40193("button")) {
                    c17136.m40182(this);
                    c17136.m2163("button");
                    c17136.mo2158((AbstractC2195) c9251);
                    return true;
                }
                c17136.m40194();
                c17136.m40173(c9251);
                c17136.m40183(false);
                return true;
            case 2:
                c17136.m40183(false);
                EnumC22780.m50860(c9251, c17136);
                return true;
            case 3:
            case 15:
            case 31:
            case 34:
            case 36:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                c17136.m40194();
                c17136.m40201(c9251);
                c17136.m40183(false);
                return true;
            case 4:
            case 9:
                if (c17136.m2157("option")) {
                    c17136.m2163("option");
                }
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case 5:
                c17136.m40173(c9251);
                if (c9251.f26116) {
                    return true;
                }
                c17136.f2104.m44177(EnumC19541.f63162);
                c17136.m40219();
                c17136.m40183(false);
                c17136.m40212(EnumC22780.f73551);
                return true;
            case 6:
                c17136.m40194();
                c17136.m40173(c9251);
                c17136.m40183(false);
                if (!c9251.f26116) {
                    EnumC22780 enumC22780M40221 = c17136.m40221();
                    if (enumC22780M40221.equals(EnumC22780.f73560) || enumC22780M40221.equals(EnumC22780.f73559) || enumC22780M40221.equals(EnumC22780.f73540) || enumC22780M40221.equals(EnumC22780.f73554) || enumC22780M40221.equals(EnumC22780.f73549)) {
                        c17136.m40212(EnumC22780.f73550);
                        return true;
                    }
                    c17136.m40212(EnumC22780.f73553);
                    return true;
                }
                return true;
            case 7:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 29:
            case 30:
            case 38:
            case 39:
            case 48:
                c17136.m40194();
                c17136.m40192(c17136.m40173(c9251));
                return true;
            case 10:
                if (c17136.m40205(am.av) != null) {
                    c17136.m40182(this);
                    c17136.m2163(am.av);
                    C19814 c19814M40229 = c17136.m40228(am.av);
                    if (c19814M40229 != null) {
                        c17136.m40222(c19814M40229);
                        c17136.m40199(c19814M40229);
                    }
                }
                c17136.m40194();
                c17136.m40192(c17136.m40173(c9251));
                return true;
            case 16:
            case 17:
                c17136.m40183(false);
                ArrayList arrayList2 = c17136.f2112;
                int size = arrayList2.size();
                int i = size - 1;
                int i2 = i >= 24 ? size - 25 : 0;
                while (i >= i2) {
                    C19814 c19815 = (C19814) arrayList2.get(i);
                    if (C20519.m47005(c19815.m45588(), C11492.f34330)) {
                        c17136.m2163(c19815.m45588());
                    } else if (!C20519.m47005(c19815.m45588(), strArr2) || C20519.m47005(c19815.m45588(), strArr)) {
                        i--;
                    }
                    if (c17136.m40193(am.ax)) {
                        c17136.m2163(am.ax);
                    }
                    c17136.m40173(c9251);
                    return true;
                }
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                return true;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                if (C20519.m47005(c17136.m2153().m45588(), C11492.f34333)) {
                    c17136.m40182(this);
                    c17136.m40190();
                }
                c17136.m40173(c9251);
                return true;
            case 25:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40201(c9251);
                c17136.m40183(false);
                return true;
            case 26:
                c17136.m40183(false);
                ArrayList arrayList3 = c17136.f2112;
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 > 0) {
                        C19814 c19816 = (C19814) arrayList3.get(size2);
                        if (c19816.m45588().equals("li")) {
                            c17136.m2163("li");
                        } else if (!C20519.m47005(c19816.m45588(), strArr2) || C20519.m47005(c19816.m45588(), strArr)) {
                        }
                    }
                }
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                return true;
            case 27:
            case 28:
                if (c17136.m40200("ruby")) {
                    c17136.m40204(false);
                    if (!c17136.m2157("ruby")) {
                        c17136.m40182(this);
                        int size3 = c17136.f2112.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0 && !((C19814) c17136.f2112.get(size3)).m45588().equals("ruby")) {
                                c17136.f2112.remove(size3);
                            }
                        }
                    }
                    c17136.m40173(c9251);
                    return true;
                }
                return true;
            case 32:
            case 50:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                c17136.f2107.m41796("\n");
                c17136.m40183(false);
                return true;
            case 33:
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case 35:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40194();
                c17136.m40183(false);
                EnumC22780.m50860(c9251, c17136);
                return true;
            case 37:
                c17136.m40182(this);
                ArrayList arrayList4 = c17136.f2112;
                if (arrayList4.size() == 1) {
                    return false;
                }
                if ((arrayList4.size() > 2 && !((C19814) arrayList4.get(1)).m45588().equals("body")) || c17136.m40186("template")) {
                    return false;
                }
                c17136.m40183(false);
                if (c9251.m22252() && (c19814M40228 = c17136.m40228("body")) != null) {
                    for (C9230 c9230 : c9251.f26118) {
                        if (!c19814M40228.mo25052(c9230.getKey())) {
                            c19814M40228.mo25045().m36729(c9230);
                        }
                    }
                }
                return true;
            case 40:
                if (c17136.m40198() != null && !c17136.m40186("template")) {
                    c17136.m40182(this);
                    return false;
                }
                if (c17136.m40193(am.ax)) {
                    c17136.m40191();
                }
                c17136.m40176(c9251, true, true);
                return true;
            case 41:
                c17136.m40182(this);
                if (c17136.m40186("template")) {
                    return false;
                }
                if (c17136.f2112.size() > 0) {
                    C19814 c19817 = (C19814) c17136.f2112.get(0);
                    if (c9251.m22252()) {
                        for (C9230 c9231 : c9251.f26118) {
                            if (!c19817.mo25052(c9231.getKey())) {
                                c19817.mo25045().m36729(c9231);
                            }
                        }
                    }
                }
                return true;
            case 42:
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case 43:
                c17136.m40194();
                if (c17136.m40200("nobr")) {
                    c17136.m40182(this);
                    c17136.m2163("nobr");
                    c17136.m40194();
                }
                c17136.m40192(c17136.m40173(c9251));
                return true;
            case 44:
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
            case 46:
                if (c17136.m40228("svg") == null) {
                    c9251.m22257("img");
                    return c17136.mo2158((AbstractC2195) c9251);
                }
                c17136.m40173(c9251);
                return true;
            case 47:
                c17136.m40194();
                if (!c17136.m40201(c9251).mo25048("type").equalsIgnoreCase("hidden")) {
                    c17136.m40183(false);
                    return true;
                }
                return true;
            case 49:
                if (c17136.f2109.m2914() != EnumC4996.quirks && c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                c17136.m40183(false);
                c17136.m40212(EnumC22780.f73560);
                return true;
            case 51:
                if (c17136.m40193(am.ax)) {
                    c17136.m2163(am.ax);
                }
                c17136.m40173(c9251);
                c17136.f2104.m44177(EnumC19541.f63129);
                return true;
            case 52:
                c17136.m40182(this);
                if (c17136.m40198() != null) {
                    return false;
                }
                c17136.m2164(c.c);
                C15578 c15579 = c9251.f26118;
                if (c15579 != null && c15579.m36735("action") && (c12052M40198 = c17136.m40198()) != null && (c15578 = c9251.f26118) != null && c15578.m36735("action")) {
                    c12052M40198.mo25045().put("action", c9251.f26118.get("action"));
                }
                c17136.m2164("hr");
                c17136.m2164(AnnotatedPrivateKey.LABEL);
                C15578 c155710 = c9251.f26118;
                String str2 = (c155710 == null || !c155710.m36735("prompt")) ? "This is a searchable index. Enter search keywords: " : c9251.f26118.get("prompt");
                C17011 c17011 = new C17011();
                c17011.m39894(str2);
                c17136.mo2158((AbstractC2195) c17011);
                C15578 c155711 = new C15578();
                if (c9251.m22252()) {
                    for (C9230 c9232 : c9251.f26118) {
                        if (!C20519.m47005(c9232.getKey(), C11492.f34319)) {
                            c155711.m36729(c9232);
                        }
                    }
                }
                c155711.put("name", "isindex");
                c17136.m2159(c155711);
                c17136.m2163(AnnotatedPrivateKey.LABEL);
                c17136.m2164("hr");
                c17136.m2163(c.c);
                return true;
            case 53:
                EnumC22780.m50860(c9251, c17136);
                return true;
            default:
                if (!C16305.m38358(str)) {
                    c17136.m40173(c9251);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34309)) {
                    if (c17136.m40193(am.ax)) {
                        c17136.m2163(am.ax);
                    }
                    c17136.m40173(c9251);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34311)) {
                    EnumC22780 enumC22780 = EnumC22780.f73545;
                    c17136.f2106 = abstractC2195;
                    return enumC22780.mo1361(abstractC2195, c17136);
                }
                if (C20519.m47005(str, C11492.f34315)) {
                    c17136.m40194();
                    c17136.m40173(c9251);
                    c17136.m40185();
                    c17136.m40183(false);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34329)) {
                    c17136.m40201(c9251);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34338)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40194();
                c17136.m40173(c9251);
                return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m29671(AbstractC2195 abstractC2195, C17136 c17136) {
        abstractC2195.getClass();
        C20540 c20540 = (C20540) abstractC2195;
        String str = c20540.f26122;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1321546630:
                if (str.equals("template")) {
                    b = 0;
                }
                break;
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                if (str.equals(am.ax)) {
                    b = 1;
                }
                break;
            case 3152:
                if (str.equals("br")) {
                    b = 2;
                }
                break;
            case 3200:
                if (str.equals("dd")) {
                    b = 3;
                }
                break;
            case 3216:
                if (str.equals("dt")) {
                    b = 4;
                }
                break;
            case 3273:
                if (str.equals("h1")) {
                    b = 5;
                }
                break;
            case 3274:
                if (str.equals("h2")) {
                    b = 6;
                }
                break;
            case 3275:
                if (str.equals("h3")) {
                    b = 7;
                }
                break;
            case 3276:
                if (str.equals("h4")) {
                    b = 8;
                }
                break;
            case 3277:
                if (str.equals("h5")) {
                    b = 9;
                }
                break;
            case 3278:
                if (str.equals("h6")) {
                    b = 10;
                }
                break;
            case 3453:
                if (str.equals("li")) {
                    b = 11;
                }
                break;
            case 3029410:
                if (str.equals("body")) {
                    b = 12;
                }
                break;
            case 3148996:
                if (str.equals(c.c)) {
                    b = cb.k;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    b = cb.f77931l;
                }
                break;
            case 3536714:
                if (str.equals("span")) {
                    b = 15;
                }
                break;
            case 1869063452:
                if (str.equals("sarcasm")) {
                    b = 16;
                }
                break;
        }
        switch (b) {
            case 0:
                c17136.m40175(abstractC2195, EnumC22780.f73545);
                return true;
            case 1:
                if (!c17136.m40193(str)) {
                    c17136.m40182(this);
                    c17136.m2164(str);
                    return c17136.mo2158(c20540);
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            case 2:
                c17136.m40182(this);
                c17136.m2164("br");
                return false;
            case 3:
            case 4:
                if (!c17136.m40200(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                String[] strArr = C11492.f34333;
                if (!c17136.m40184(strArr)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                for (int size = c17136.f2112.size() - 1; size >= 0; size--) {
                    C19814 c19814 = (C19814) c17136.f2112.get(size);
                    c17136.f2112.remove(size);
                    if (C20519.m47005(c19814.m45588(), strArr)) {
                        return true;
                    }
                }
                return true;
            case 11:
                if (!c17136.m40224(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            case 12:
                if (!c17136.m40200("body")) {
                    c17136.m40182(this);
                    return false;
                }
                m29674(abstractC2195, c17136);
                c17136.m40212(EnumC22780.f73538);
                return true;
            case 13:
                if (c17136.m40186("template")) {
                    if (!c17136.m40200(str)) {
                        c17136.m40182(this);
                        return false;
                    }
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    return true;
                }
                C12052 c12052M40198 = c17136.m40198();
                c17136.m40226();
                if (c12052M40198 == null || !c17136.m40200(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40204(false);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40199(c12052M40198);
                return true;
            case 14:
                if (c17136.m2163("body")) {
                    return c17136.mo2158(c20540);
                }
                return true;
            case 15:
            case 16:
                return m29674(abstractC2195, c17136);
            default:
                if (C20519.m47005(str, C11492.f34332)) {
                    return m29673(abstractC2195, c17136);
                }
                if (C20519.m47005(str, C11492.f34327)) {
                    if (!c17136.m40200(str)) {
                        c17136.m40182(this);
                        return false;
                    }
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    return true;
                }
                if (!C20519.m47005(str, C11492.f34315)) {
                    return m29674(abstractC2195, c17136);
                }
                if (!c17136.m40200("name")) {
                    if (!c17136.m40200(str)) {
                        c17136.m40182(this);
                        return false;
                    }
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    c17136.m40217();
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m29674(AbstractC2195 abstractC2195, C17136 c17136) {
        abstractC2195.getClass();
        String str = ((C20540) abstractC2195).f26122;
        ArrayList arrayList = c17136.f2112;
        if (c17136.m40228(str) == null) {
            c17136.m40182(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C19814 c19814 = (C19814) arrayList.get(size);
            if (!c19814.m45588().equals(str)) {
                if (C20519.m47005(c19814.m45588(), C17136.f52500)) {
                    c17136.m40182(this);
                    return false;
                }
            } else {
                c17136.m40215(str);
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m29673(AbstractC2195 abstractC2195, C17136 c17136) {
        boolean z;
        C19814 c19814;
        abstractC2195.getClass();
        String str = ((C20540) abstractC2195).f26122;
        ArrayList arrayList = c17136.f2112;
        boolean z2 = false;
        int i = 0;
        while (i < 8) {
            C19814 c19814M40205 = c17136.m40205(str);
            if (c19814M40205 == null) {
                return m29674(abstractC2195, c17136);
            }
            if (!c17136.m40207(c19814M40205)) {
                c17136.m40182(this);
                c17136.m40222(c19814M40205);
                return true;
            }
            if (!c17136.m40200(c19814M40205.m45588())) {
                c17136.m40182(this);
                return z2;
            }
            if (c17136.m2153() != c19814M40205) {
                c17136.m40182(this);
            }
            int size = arrayList.size();
            int i2 = 1;
            boolean z3 = false;
            int iM40227 = -1;
            C19814 c19815 = null;
            while (true) {
                if (i2 >= size || i2 >= 64) {
                    z = true;
                    c19814 = null;
                    break;
                }
                c19814 = (C19814) arrayList.get(i2);
                if (c19814 == c19814M40205) {
                    c19815 = (C19814) arrayList.get(i2 - 1);
                    iM40227 = c17136.m40227(c19814);
                    z3 = true;
                } else if (z3) {
                    z = true;
                    if (C20519.m47005(c19814.m45588(), C17136.f52500)) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            }
            if (c19814 != null) {
                C19814 c19814M40174 = c19814;
                C19814 c19816 = c19814M40174;
                for (int i3 = 0; i3 < 3; i3++) {
                    if (c17136.m40207(c19814M40174)) {
                        c19814M40174 = c17136.m40174(c19814M40174);
                    }
                    if (c17136.m40218(c19814M40174)) {
                        if (c19814M40174 == c19814M40205) {
                            break;
                        }
                        C19814 c19817 = new C19814(c17136.m2152(c19814M40174.mo2915(), C1489.f5329), c17136.f2102, null);
                        c17136.m40181(c19814M40174, c19817);
                        ArrayList arrayList2 = c17136.f2112;
                        int iLastIndexOf = arrayList2.lastIndexOf(c19814M40174);
                        C16990.m39825(iLastIndexOf != -1);
                        arrayList2.set(iLastIndexOf, c19817);
                        if (c19816 == c19814) {
                            iM40227 = c17136.m40227(c19817) + 1;
                        }
                        if (c19816.mo28099() != null) {
                            c19816.m28091();
                        }
                        c19817.m45584(c19816);
                        c19814M40174 = c19817;
                        c19816 = c19814M40174;
                    } else {
                        c17136.m40199(c19814M40174);
                    }
                }
                if (c19815 != null) {
                    if (C20519.m47005(c19815.m45588(), C11492.f34342)) {
                        if (c19816.mo28099() != null) {
                            c19816.m28091();
                        }
                        c17136.m40177(c19816);
                    } else {
                        if (c19816.mo28099() != null) {
                            c19816.m28091();
                        }
                        c19815.m45584(c19816);
                    }
                }
                C19814 c19818 = new C19814(c19814M40205.m45571(), c17136.f2102, null);
                c19818.mo25045().m36730(c19814M40205.mo25045());
                c19818.m45562(-1, c19814.m28097());
                c19814.m45584(c19818);
                c17136.m40222(c19814M40205);
                c17136.m40180(c19818, iM40227);
                c17136.m40199(c19814M40205);
                int iLastIndexOf2 = c17136.f2112.lastIndexOf(c19814);
                C16990.m39825(iLastIndexOf2 != -1);
                c17136.f2112.add(iLastIndexOf2 + 1, c19818);
                i++;
                z2 = false;
            } else {
                c17136.m40187(c19814M40205.m45588());
                c17136.m40222(c19814M40205);
                return z;
            }
        }
        return true;
    }
}
