package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۫ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13960 extends EnumC24018 {

    /* JADX INFO: renamed from: ۘ֫ */
    public static final int f39421 = 24;

    public /* synthetic */ C13960() {
        this("InBody", 6);
    }

    public C13960(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC24018
    /* JADX INFO: renamed from: ֫ */
    public boolean mo3774(AbstractC4454 abstractC4454, C18654 c18654) {
        switch (C22678.f71538[abstractC4454.f9999.ordinal()]) {
            case 1:
                c18654.m42423((C15852) abstractC4454);
                return true;
            case 2:
                c18654.m42427(this);
                return false;
            case 3:
                return m31734(abstractC4454, c18654);
            case 4:
                return m31733(abstractC4454, c18654);
            case 5:
                C18535 c18535 = (C18535) abstractC4454;
                if (c18535.m42138().equals(EnumC24018.f76266)) {
                    c18654.m42427(this);
                    return false;
                }
                if (c18654.m42468() && EnumC24018.m53202(c18535)) {
                    c18654.m42439();
                    c18654.m42424(c18535);
                    return true;
                }
                c18654.m42439();
                c18654.m42424(c18535);
                c18654.m42428(false);
                return true;
            case 6:
                if (c18654.m42434() <= 0) {
                    return true;
                }
                EnumC24018 enumC24018 = EnumC24018.f76273;
                c18654.f4878 = abstractC4454;
                return enumC24018.mo3774(abstractC4454, c18654);
            default:
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:402:0x0642  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܿ */
    private boolean m31734(AbstractC4454 abstractC4454, C18654 c18654) {
        C21199 c21199M42473;
        C13822 c13822M42443;
        C17173 c17173;
        abstractC4454.getClass();
        C11160 c11160 = (C11160) abstractC4454;
        String str = c11160.f29037;
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
                if (str.equals(C0655am.f2320av)) {
                    b = 10;
                }
                break;
            case 98:
                if (str.equals("b")) {
                    b = 11;
                }
                break;
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                if (str.equals(C0655am.f2275aC)) {
                    b = 12;
                }
                break;
            case 115:
                if (str.equals(C0655am.f2274aB)) {
                    b = C0698cb.f2569k;
                }
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                if (str.equals(C0655am.f2280aH)) {
                    b = C0698cb.f2570l;
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
                    b = C0684bo.f2505j;
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
                if (str.equals(C0172c.f707c)) {
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
        String[] strArr = C13290.f37315;
        String[] strArr2 = C18654.f55683;
        switch (b) {
            case 0:
                c18654.m42427(this);
                ArrayList arrayList = c18654.f4884;
                if (arrayList.size() == 1) {
                    return false;
                }
                if ((arrayList.size() > 2 && !((C21199) arrayList.get(1)).m47899().equals("body")) || !c18654.m42468()) {
                    return false;
                }
                C21199 c21199 = (C21199) arrayList.get(1);
                if (c21199.mo30143() != null) {
                    c21199.m30135();
                }
                while (arrayList.size() > 1) {
                    C19925.m45229(arrayList, 1);
                }
                c18654.m42418(c11160);
                c18654.m42457(EnumC24018.f76265);
                return true;
            case 1:
                if (c18654.m42438("button")) {
                    c18654.m42427(this);
                    c18654.m4530("button");
                    c18654.mo4525((AbstractC4454) c11160);
                    return true;
                }
                c18654.m42439();
                c18654.m42418(c11160);
                c18654.m42428(false);
                return true;
            case 2:
                c18654.m42428(false);
                EnumC24018.m53203(c11160, c18654);
                return true;
            case 3:
            case 15:
            case 31:
            case 34:
            case 36:
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                c18654.m42439();
                c18654.m42446(c11160);
                c18654.m42428(false);
                return true;
            case 4:
            case 9:
                if (c18654.m4524("option")) {
                    c18654.m4530("option");
                }
                c18654.m42439();
                c18654.m42418(c11160);
                return true;
            case 5:
                c18654.m42418(c11160);
                if (c11160.f29031) {
                    return true;
                }
                c18654.f4876.m46471(EnumC20940.f65782);
                c18654.m42464();
                c18654.m42428(false);
                c18654.m42457(EnumC24018.f76281);
                return true;
            case 6:
                c18654.m42439();
                c18654.m42418(c11160);
                c18654.m42428(false);
                if (!c11160.f29031) {
                    EnumC24018 enumC24018M42466 = c18654.m42466();
                    if (enumC24018M42466.equals(EnumC24018.f76290) || enumC24018M42466.equals(EnumC24018.f76289) || enumC24018M42466.equals(EnumC24018.f76270) || enumC24018M42466.equals(EnumC24018.f76284) || enumC24018M42466.equals(EnumC24018.f76279)) {
                        c18654.m42457(EnumC24018.f76280);
                        return true;
                    }
                    c18654.m42457(EnumC24018.f76283);
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
                c18654.m42439();
                c18654.m42437(c18654.m42418(c11160));
                return true;
            case 10:
                if (c18654.m42450(C0655am.f2320av) != null) {
                    c18654.m42427(this);
                    c18654.m4530(C0655am.f2320av);
                    C21199 c21199M42474 = c18654.m42473(C0655am.f2320av);
                    if (c21199M42474 != null) {
                        c18654.m42467(c21199M42474);
                        c18654.m42444(c21199M42474);
                    }
                }
                c18654.m42439();
                c18654.m42437(c18654.m42418(c11160));
                return true;
            case 16:
            case 17:
                c18654.m42428(false);
                ArrayList arrayList2 = c18654.f4884;
                int size = arrayList2.size();
                int i = size - 1;
                int i2 = i >= 24 ? size - 25 : 0;
                while (i >= i2) {
                    C21199 c211910 = (C21199) arrayList2.get(i);
                    if (C21869.m49328(c211910.m47899(), C13290.f37327)) {
                        c18654.m4530(c211910.m47899());
                    } else if (!C21869.m49328(c211910.m47899(), strArr2) || C21869.m49328(c211910.m47899(), strArr)) {
                        i--;
                    }
                    if (c18654.m42438(C0655am.f2322ax)) {
                        c18654.m4530(C0655am.f2322ax);
                    }
                    c18654.m42418(c11160);
                    return true;
                }
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42418(c11160);
                return true;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                if (C21869.m49328(c18654.m4520().m47899(), C13290.f37330)) {
                    c18654.m42427(this);
                    c18654.m42435();
                }
                c18654.m42418(c11160);
                return true;
            case 25:
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42446(c11160);
                c18654.m42428(false);
                return true;
            case 26:
                c18654.m42428(false);
                ArrayList arrayList3 = c18654.f4884;
                int size2 = arrayList3.size();
                while (true) {
                    size2--;
                    if (size2 > 0) {
                        C21199 c211911 = (C21199) arrayList3.get(size2);
                        if (c211911.m47899().equals("li")) {
                            c18654.m4530("li");
                        } else if (!C21869.m49328(c211911.m47899(), strArr2) || C21869.m49328(c211911.m47899(), strArr)) {
                        }
                    }
                }
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42418(c11160);
                return true;
            case 27:
            case 28:
                if (c18654.m42445("ruby")) {
                    c18654.m42449(false);
                    if (!c18654.m4524("ruby")) {
                        c18654.m42427(this);
                        int size3 = c18654.f4884.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0 && !((C21199) c18654.f4884.get(size3)).m47899().equals("ruby")) {
                                c18654.f4884.remove(size3);
                            }
                        }
                    }
                    c18654.m42418(c11160);
                    return true;
                }
                return true;
            case 32:
            case 50:
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42418(c11160);
                c18654.f4879.m44042("\n");
                c18654.m42428(false);
                return true;
            case 33:
                c18654.m42439();
                c18654.m42418(c11160);
                return true;
            case 35:
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42439();
                c18654.m42428(false);
                EnumC24018.m53203(c11160, c18654);
                return true;
            case 37:
                c18654.m42427(this);
                ArrayList arrayList4 = c18654.f4884;
                if (arrayList4.size() == 1) {
                    return false;
                }
                if ((arrayList4.size() > 2 && !((C21199) arrayList4.get(1)).m47899().equals("body")) || c18654.m42431("template")) {
                    return false;
                }
                c18654.m42428(false);
                if (c11160.m24220() && (c21199M42473 = c18654.m42473("body")) != null) {
                    for (C11140 c11140 : c11160.f29033) {
                        if (!c21199M42473.mo27069(c11140.getKey())) {
                            c21199M42473.mo27062().m38890(c11140);
                        }
                    }
                }
                return true;
            case 40:
                if (c18654.m42443() != null && !c18654.m42431("template")) {
                    c18654.m42427(this);
                    return false;
                }
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m42436();
                }
                c18654.m42421(c11160, true, true);
                return true;
            case 41:
                c18654.m42427(this);
                if (c18654.m42431("template")) {
                    return false;
                }
                if (c18654.f4884.size() > 0) {
                    C21199 c211912 = (C21199) c18654.f4884.get(0);
                    if (c11160.m24220()) {
                        for (C11140 c11141 : c11160.f29033) {
                            if (!c211912.mo27069(c11141.getKey())) {
                                c211912.mo27062().m38890(c11141);
                            }
                        }
                    }
                }
                return true;
            case 42:
                c18654.m42439();
                c18654.m42418(c11160);
                return true;
            case 43:
                c18654.m42439();
                if (c18654.m42445("nobr")) {
                    c18654.m42427(this);
                    c18654.m4530("nobr");
                    c18654.m42439();
                }
                c18654.m42437(c18654.m42418(c11160));
                return true;
            case 44:
                c18654.m42439();
                c18654.m42418(c11160);
                return true;
            case 46:
                if (c18654.m42473("svg") == null) {
                    c11160.m24225("img");
                    return c18654.mo4525((AbstractC4454) c11160);
                }
                c18654.m42418(c11160);
                return true;
            case 47:
                c18654.m42439();
                if (!c18654.m42446(c11160).mo27065("type").equalsIgnoreCase("hidden")) {
                    c18654.m42428(false);
                    return true;
                }
                return true;
            case 49:
                if (c18654.f4881.m5243() != EnumC7116.quirks && c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42418(c11160);
                c18654.m42428(false);
                c18654.m42457(EnumC24018.f76290);
                return true;
            case 51:
                if (c18654.m42438(C0655am.f2322ax)) {
                    c18654.m4530(C0655am.f2322ax);
                }
                c18654.m42418(c11160);
                c18654.f4876.m46471(EnumC20940.f65749);
                return true;
            case 52:
                c18654.m42427(this);
                if (c18654.m42443() != null) {
                    return false;
                }
                c18654.m4531(C0172c.f707c);
                C17173 c17174 = c11160.f29033;
                if (c17174 != null && c17174.m38896("action") && (c13822M42443 = c18654.m42443()) != null && (c17173 = c11160.f29033) != null && c17173.m38896("action")) {
                    c13822M42443.mo27062().put("action", c11160.f29033.get("action"));
                }
                c18654.m4531("hr");
                c18654.m4531(AnnotatedPrivateKey.LABEL);
                C17173 c17175 = c11160.f29033;
                String str2 = (c17175 == null || !c17175.m38896("prompt")) ? "This is a searchable index. Enter search keywords: " : c11160.f29033.get("prompt");
                C18535 c18535 = new C18535();
                c18535.m42137(str2);
                c18654.mo4525((AbstractC4454) c18535);
                C17173 c17176 = new C17173();
                if (c11160.m24220()) {
                    for (C11140 c11142 : c11160.f29033) {
                        if (!C21869.m49328(c11142.getKey(), C13290.f37316)) {
                            c17176.m38890(c11142);
                        }
                    }
                }
                c17176.put("name", "isindex");
                c18654.m4526(c17176);
                c18654.m4530(AnnotatedPrivateKey.LABEL);
                c18654.m4531("hr");
                c18654.m4530(C0172c.f707c);
                return true;
            case 53:
                EnumC24018.m53203(c11160, c18654);
                return true;
            default:
                if (!C17864.m40573(str)) {
                    c18654.m42418(c11160);
                    return true;
                }
                if (C21869.m49328(str, C13290.f37306)) {
                    if (c18654.m42438(C0655am.f2322ax)) {
                        c18654.m4530(C0655am.f2322ax);
                    }
                    c18654.m42418(c11160);
                    return true;
                }
                if (C21869.m49328(str, C13290.f37308)) {
                    EnumC24018 enumC24018 = EnumC24018.f76275;
                    c18654.f4878 = abstractC4454;
                    return enumC24018.mo3774(abstractC4454, c18654);
                }
                if (C21869.m49328(str, C13290.f37312)) {
                    c18654.m42439();
                    c18654.m42418(c11160);
                    c18654.m42430();
                    c18654.m42428(false);
                    return true;
                }
                if (C21869.m49328(str, C13290.f37326)) {
                    c18654.m42446(c11160);
                    return true;
                }
                if (C21869.m49328(str, C13290.f37335)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42439();
                c18654.m42418(c11160);
                return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ܽ */
    private boolean m31733(AbstractC4454 abstractC4454, C18654 c18654) {
        abstractC4454.getClass();
        C21889 c21889 = (C21889) abstractC4454;
        String str = c21889.f29037;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1321546630:
                if (str.equals("template")) {
                    b = 0;
                }
                break;
            case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                if (str.equals(C0655am.f2322ax)) {
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
                if (str.equals(C0172c.f707c)) {
                    b = C0698cb.f2569k;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    b = C0698cb.f2570l;
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
                c18654.m42420(abstractC4454, EnumC24018.f76275);
                return true;
            case 1:
                if (!c18654.m42438(str)) {
                    c18654.m42427(this);
                    c18654.m4531(str);
                    return c18654.mo4525(c21889);
                }
                c18654.m42460(str);
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                }
                c18654.m42432(str);
                return true;
            case 2:
                c18654.m42427(this);
                c18654.m4531("br");
                return false;
            case 3:
            case 4:
                if (!c18654.m42445(str)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42460(str);
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                }
                c18654.m42432(str);
                return true;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                String[] strArr = C13290.f37330;
                if (!c18654.m42429(strArr)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42460(str);
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                }
                for (int size = c18654.f4884.size() - 1; size >= 0; size--) {
                    C21199 c21199 = (C21199) c18654.f4884.get(size);
                    c18654.f4884.remove(size);
                    if (C21869.m49328(c21199.m47899(), strArr)) {
                        return true;
                    }
                }
                return true;
            case 11:
                if (!c18654.m42469(str)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42460(str);
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                }
                c18654.m42432(str);
                return true;
            case 12:
                if (!c18654.m42445("body")) {
                    c18654.m42427(this);
                    return false;
                }
                m31736(abstractC4454, c18654);
                c18654.m42457(EnumC24018.f76268);
                return true;
            case 13:
                if (c18654.m42431("template")) {
                    if (!c18654.m42445(str)) {
                        c18654.m42427(this);
                        return false;
                    }
                    c18654.m42449(false);
                    if (!c18654.m4524(str)) {
                        c18654.m42427(this);
                    }
                    c18654.m42432(str);
                    return true;
                }
                C13822 c13822M42443 = c18654.m42443();
                c18654.m42471();
                if (c13822M42443 == null || !c18654.m42445(str)) {
                    c18654.m42427(this);
                    return false;
                }
                c18654.m42449(false);
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                }
                c18654.m42444(c13822M42443);
                return true;
            case 14:
                if (c18654.m4530("body")) {
                    return c18654.mo4525(c21889);
                }
                return true;
            case 15:
            case 16:
                return m31736(abstractC4454, c18654);
            default:
                if (C21869.m49328(str, C13290.f37329)) {
                    return m31735(abstractC4454, c18654);
                }
                if (C21869.m49328(str, C13290.f37324)) {
                    if (!c18654.m42445(str)) {
                        c18654.m42427(this);
                        return false;
                    }
                    c18654.m42449(false);
                    if (!c18654.m4524(str)) {
                        c18654.m42427(this);
                    }
                    c18654.m42432(str);
                    return true;
                }
                if (!C21869.m49328(str, C13290.f37312)) {
                    return m31736(abstractC4454, c18654);
                }
                if (!c18654.m42445("name")) {
                    if (!c18654.m42445(str)) {
                        c18654.m42427(this);
                        return false;
                    }
                    c18654.m42449(false);
                    if (!c18654.m4524(str)) {
                        c18654.m42427(this);
                    }
                    c18654.m42432(str);
                    c18654.m42462();
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m31736(AbstractC4454 abstractC4454, C18654 c18654) {
        abstractC4454.getClass();
        String str = ((C21889) abstractC4454).f29037;
        ArrayList arrayList = c18654.f4884;
        if (c18654.m42473(str) == null) {
            c18654.m42427(this);
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C21199 c21199 = (C21199) arrayList.get(size);
            if (!c21199.m47899().equals(str)) {
                if (C21869.m49328(c21199.m47899(), C18654.f55683)) {
                    c18654.m42427(this);
                    return false;
                }
            } else {
                c18654.m42460(str);
                if (!c18654.m4524(str)) {
                    c18654.m42427(this);
                }
                c18654.m42432(str);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m31735(AbstractC4454 abstractC4454, C18654 c18654) {
        boolean z;
        C21199 c21199;
        abstractC4454.getClass();
        String str = ((C21889) abstractC4454).f29037;
        ArrayList arrayList = c18654.f4884;
        boolean z2 = false;
        int i = 0;
        while (i < 8) {
            C21199 c21199M42450 = c18654.m42450(str);
            if (c21199M42450 == null) {
                return m31736(abstractC4454, c18654);
            }
            if (!c18654.m42452(c21199M42450)) {
                c18654.m42427(this);
                c18654.m42467(c21199M42450);
                return true;
            }
            if (!c18654.m42445(c21199M42450.m47899())) {
                c18654.m42427(this);
                return z2;
            }
            if (c18654.m4520() != c21199M42450) {
                c18654.m42427(this);
            }
            int size = arrayList.size();
            int i2 = 1;
            boolean z3 = false;
            int iM42472 = -1;
            C21199 c211910 = null;
            while (true) {
                if (i2 >= size || i2 >= 64) {
                    z = true;
                    c21199 = null;
                    break;
                }
                c21199 = (C21199) arrayList.get(i2);
                if (c21199 == c21199M42450) {
                    c211910 = (C21199) arrayList.get(i2 - 1);
                    iM42472 = c18654.m42472(c21199);
                    z3 = true;
                } else if (z3) {
                    z = true;
                    if (C21869.m49328(c21199.m47899(), C18654.f55683)) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            }
            if (c21199 != null) {
                C21199 c21199M42419 = c21199;
                C21199 c211911 = c21199M42419;
                for (int i3 = 0; i3 < 3; i3++) {
                    if (c18654.m42452(c21199M42419)) {
                        c21199M42419 = c18654.m42419(c21199M42419);
                    }
                    if (c18654.m42463(c21199M42419)) {
                        if (c21199M42419 == c21199M42450) {
                            break;
                        }
                        C21199 c211912 = new C21199(c18654.m4519(c21199M42419.mo5244(), C3783.f8102), c18654.f4874, null);
                        c18654.m42426(c21199M42419, c211912);
                        ArrayList arrayList2 = c18654.f4884;
                        int iLastIndexOf = arrayList2.lastIndexOf(c21199M42419);
                        C18515.m42068(iLastIndexOf != -1);
                        arrayList2.set(iLastIndexOf, c211912);
                        if (c211911 == c21199) {
                            iM42472 = c18654.m42472(c211912) + 1;
                        }
                        if (c211911.mo30143() != null) {
                            c211911.m30135();
                        }
                        c211912.m47895(c211911);
                        c21199M42419 = c211912;
                        c211911 = c21199M42419;
                    } else {
                        c18654.m42444(c21199M42419);
                    }
                }
                if (c211910 != null) {
                    if (C21869.m49328(c211910.m47899(), C13290.f37339)) {
                        if (c211911.mo30143() != null) {
                            c211911.m30135();
                        }
                        c18654.m42422(c211911);
                    } else {
                        if (c211911.mo30143() != null) {
                            c211911.m30135();
                        }
                        c211910.m47895(c211911);
                    }
                }
                C21199 c211913 = new C21199(c21199M42450.m47882(), c18654.f4874, null);
                c211913.mo27062().m38891(c21199M42450.mo27062());
                c211913.m47873(-1, c21199.m30141());
                c21199.m47895(c211913);
                c18654.m42467(c21199M42450);
                c18654.m42425(c211913, iM42472);
                c18654.m42444(c21199M42450);
                int iLastIndexOf2 = c18654.f4884.lastIndexOf(c21199);
                C18515.m42068(iLastIndexOf2 != -1);
                c18654.f4884.add(iLastIndexOf2 + 1, c211913);
                i++;
                z2 = false;
            } else {
                c18654.m42432(c21199M42450.m47899());
                c18654.m42467(c21199M42450);
                return z;
            }
        }
        return true;
    }
}
