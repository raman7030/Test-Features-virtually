package p067l;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.IBinder;
import android.view.View;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.۬ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X0 */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC14741 extends Service implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public static String f42008 = null;

    /* JADX INFO: renamed from: ۫ */
    public static String f42009 = "";

    /* JADX INFO: renamed from: ۬ */
    public static C14281 f42010;

    /* JADX INFO: renamed from: ۬ܽ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f82185 = {9437, 13643, 13656, 13657, 13641, 26810, -17149, 26030, -22613, 23066, -18689, 13675, 13673, 13694, 13667, 13669, 13668, 13685, 13671, 13694, 13685, 13673, 13670, 13669, 13689, 13679, 13685, 13688, 13679, 13689, 13669, 13695, 13688, 13673, 13679, 13685, 13691, 13695, 13679, 13688, 13667, 13679, 13688, 3340, 18414, 18409, 18414, 18419};

    /* JADX INFO: renamed from: ۙ */
    public final BroadcastReceiver f42011;

    /* JADX INFO: renamed from: ᩶ */
    public C23469 f42012;

    /* JADX INFO: renamed from: ᩸ */
    public C14281 f42013;

    /* JADX INFO: renamed from: ᩹ */
    public BinderC5354 f42014;

    public ServiceC14741() {
        C6695 c6695 = null;
        int i = 1702488274;
        int i2 = C1046.f81962;
        int i3 = ServiceConnectionC1013.f81940;
        int iM55979 = C0946.m55979("ۤ֨") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-3013)) ^ 1926043785;
        int i5 = -918128673;
        while (true) {
            i = ((((i ^ i2) * 29753) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2049873931:
                case 271495029:
                    if (C1964.f83032 <= 0) {
                        iM55979 = C0873.m55680("۬֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM55979 = (C0946.m55979("۫᩺") ^ i3) * 115;
                        i4 = ((iM55979 ^ i2) * 27801) ^ 1448783025;
                        i5 = 1404556372;
                    }
                    break;
                case -2014112676:
                case 627431815:
                    C0894.m55769();
                    C0930.m55885();
                    iM55979 = (C0946.m55979("ۧۡ") + i2) * (-73);
                    i4 = ((iM55979 ^ i3) * 6577) ^ 1449619721;
                    i5 = -865104816;
                    break;
                case -1943248793:
                case 615938169:
                    RunnableC0897.m55784();
                    throw new RuntimeException();
                case -1847780065:
                case -1292530049:
                    if (C1044.m56286() <= 0) {
                        iM55979 = C0873.m55680("۬֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM55979 = C0873.m55680("ۛ᩹") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14359) ^ 183968360;
                        i5 = 328250150;
                    }
                    break;
                case -1840375697:
                case -9983832:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("۬֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM55979 = (i2 - C0873.m55680("᩺۟")) * 31;
                        i4 = ((iM55979 ^ i3) * 26525) ^ 878738022;
                        i5 = -1206047286;
                    }
                    break;
                case -1727765692:
                case 974695668:
                    if (C1024.m56209() >= 0) {
                        iM55979 = C0873.m55680("۬֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM55979 = (C0946.m55979("ۢۤ") + i3) * 7;
                        i4 = ((iM55979 ^ i2) * (-12789)) ^ (-38280645);
                        i5 = -685008323;
                    }
                    break;
                case -1485362848:
                case 1229867515:
                    if (!C0927.f81875) {
                        iM55979 = C0873.m55680("ᩴܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19941)) ^ (-496004956);
                        i5 = -1603723347;
                    } else {
                        iM55979 = C0873.m55680("ᩴ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15355) ^ 530205130;
                        i5 = 1795676312;
                    }
                    break;
                case -1436642766:
                case 557863481:
                    this.f42011 = c6695;
                    return;
                case -1400833917:
                case 632379883:
                    c6695 = new C6695(this);
                    if (C0946.m55980() != 0) {
                        iM55979 = (C0946.m55979("ۧۡ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    } else {
                        iM55979 = (C0873.m55680("ۙܰ") + i3) * 33;
                        i4 = ((iM55979 ^ i2) * (-14313)) ^ (-1682504047);
                        i5 = -1803263704;
                    }
                    break;
                case -1279683372:
                case -128932660:
                    if (C0882.f81846) {
                        iM55979 = (C0946.m55979("ۧۡ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    } else {
                        iM55979 = (i2 - C0946.m55979("ᩳ᩻")) * (-53);
                        i4 = ((iM55979 ^ i3) * (-5783)) ^ 585412077;
                        i5 = -1173899126;
                    }
                    break;
                case -587387648:
                case 2112992980:
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("۠֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3435)) ^ 380535255;
                        i5 = 528943511;
                    } else {
                        iM55979 = C0873.m55680("᩸᩻") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-31897)) ^ (-2140177972);
                        i5 = 1189378769;
                    }
                    break;
                case 103721400:
                case 1938780712:
                    if (C0967.f81910 >= 0) {
                        iM55979 = (C0946.m55979("ۧۡ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    } else {
                        iM55979 = C0946.m55979("۬ۤ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-26867)) ^ 485085239;
                        i5 = -1976276257;
                    }
                    break;
                case 412519663:
                case 616248286:
                    if (RunnableC0897.m55784()) {
                        iM55979 = C0873.m55680("۬֡") ^ i2;
                        i4 = ((iM55979 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM55979 = C0873.m55680("֡ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 20929) ^ 123748244;
                        i5 = -445596888;
                    }
                    break;
                case 1223078633:
                case 1681213346:
                    C0912.m55833();
                    if (AbstractC0942.f81890 > 0) {
                        iM55979 = C0873.m55680("۠֫") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-3435)) ^ 380535255;
                        i5 = 528943511;
                    } else {
                        iM55979 = C0873.m55680("ᩴܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19941)) ^ (-496004956);
                        i5 = -1603723347;
                    }
                    break;
                case 1285411297:
                case 1516903308:
                    if (C0967.f81910 < 0) {
                        iM55979 = C0873.m55680("ᩴ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * 15355) ^ 530205130;
                        i5 = 1795676312;
                    } else {
                        iM55979 = (C0946.m55979("ۧۡ") + i2) * (-73);
                        i4 = ((iM55979 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    }
                    break;
                default:
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = C0873.m55680("ᩴܰ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-19941)) ^ (-496004956);
                        i5 = -1603723347;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۢ᩶")) * 9;
                        i4 = ((iM55979 ^ i2) * 19669) ^ 204102055;
                        i5 = 1384225732;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0103 A[PHI: r1 r10
      0x0103: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v2 int), (r1v2 int), (r1v8 int) binds: [B:42:0x00eb, B:30:0x009e, B:23:0x005f, B:21:0x0055, B:28:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x0103: PHI (r10v7 java.lang.String) = 
      (r10v4 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
      (r10v3 java.lang.String)
     binds: [B:42:0x00eb, B:30:0x009e, B:23:0x005f, B:21:0x0055, B:28:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a9 A[PHI: r7
      0x01a9: PHI (r7v5 android.content.Intent) = (r7v4 android.content.Intent), (r7v4 android.content.Intent), (r7v6 android.content.Intent) binds: [B:62:0x01a7, B:58:0x018e, B:38:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x021a  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM55979;
        int i;
        String strM12247 = null;
        int i2 = 0;
        int i3 = -1977430140;
        int i4 = ViewOnClickListenerC0939.f81888;
        int i5 = C1071.f81975;
        int iM55680 = C0873.m55680("ۨ᩻") ^ i5;
        int i6 = ((iM55680 ^ i4) * 13603) ^ (-1240385027);
        int i7 = -103620361;
        while (true) {
            int i8 = iM55680 ^ i7;
            Intent intent = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 28137) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2099873116:
                    case 2003093728:
                        if (C1044.f81959 < 0) {
                            iM55979 = (i4 - C0946.m55979("᩵ۧ")) * (-51);
                            i6 = ((iM55979 ^ i5) * 18797) ^ (-677195476);
                            i = -2090754404;
                            i8 = iM55979 ^ i;
                        }
                        break;
                    case -2094448224:
                    case 668266824:
                        C0882.m55721(intent, 268435456);
                        C1929.m56568(this, intent);
                        break;
                    case -1770464525:
                    case 375372266:
                        if (C1046.m56300(strM12247, 10) == -1) {
                            int iM55681 = C0873.m55680("ۗۘ") ^ i4;
                            i6 = ((iM55681 ^ i5) * 735) ^ 319829684;
                            i8 = iM55681 ^ (-240523736);
                            i2 = -1;
                        } else {
                            i2 = -1;
                            iM55979 = C0946.m55979("ܿ᩹") ^ i4;
                            i6 = ((iM55979 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                            i8 = iM55979 ^ i;
                        }
                        break;
                    case -1723035297:
                    case -1662608822:
                        if (AbstractC0942.f81890 <= 0) {
                            iM55979 = (i5 - C0873.m55680("֫ۢ")) * 53;
                            i6 = ((iM55979 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        } else {
                            iM55979 = (C0873.m55680("ܳۜ") + i5) * (-101);
                            i6 = ((iM55979 ^ i4) * (-24005)) ^ (-1109028909);
                            i = -986461476;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1542454794:
                    case 610239949:
                        C1028.m56247();
                        iM55979 = (i4 - C0946.m55979("᩻ۙ")) * 5;
                        i6 = ((iM55979 ^ i5) * 1313) ^ (-1203316229);
                        i = -268555879;
                        i8 = iM55979 ^ i;
                        break;
                    case -1517643522:
                    case -1297534624:
                        if (C0989.m56097(strM12247, 13) == i2) {
                            iM55979 = (C0873.m55680("᩻ۗ") + i5) * 57;
                            i6 = ((iM55979 ^ i4) * 15741) ^ 775458483;
                            i = -529404639;
                        } else {
                            iM55979 = C0946.m55979("ܿ᩹") ^ i4;
                            i6 = ((iM55979 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1450154597:
                    case 1583252705:
                        if (C0927.m55873() <= 0) {
                            iM55979 = C0873.m55680("ᩴᩳ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-30675)) ^ (-454557741);
                            i = 48698738;
                        } else {
                            iM55979 = (i5 - C0873.m55680("֫ۢ")) * 53;
                            i6 = ((iM55979 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1390812820:
                    case 342898413:
                        if (C0892.f81851) {
                            iM55979 = C0946.m55979("ۙܳ") ^ i4;
                            i6 = ((iM55979 ^ i5) * 21025) ^ 1557745513;
                            i = -688585239;
                        } else {
                            iM55979 = C0873.m55680("ᩴᩳ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-30675)) ^ (-454557741);
                            i = 48698738;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1389146832:
                    case -204834372:
                        if (C1929.f83011 != 0) {
                            iM55979 = (i5 - C0946.m55979("֫ۧ")) * (-53);
                            i6 = ((iM55979 ^ i4) * 7003) ^ (-428261756);
                            i = 1032499632;
                        } else {
                            iM55979 = C0946.m55979("᩸ܳ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-1493)) ^ 635828293;
                            i = 852022166;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -1251900670:
                    case 1264329668:
                        C0894.m55769();
                        C0861.m55626();
                        break;
                    case -1111364961:
                    case 2002921195:
                        if (C1048.m56305() < 0) {
                            intent = new Intent(this, (Class<?>) ViewOnClickListenerC14071.class);
                            if (C0877.f81843 >= 0) {
                                iM55979 = (i5 - C0946.m55979("֫ۧ")) * (-53);
                                i6 = ((iM55979 ^ i4) * 7003) ^ (-428261756);
                                i = 1032499632;
                            } else {
                                iM55979 = (C0873.m55680("ۗᩳ") ^ i5) * (-57);
                                i6 = ((iM55979 ^ i4) * 19313) ^ (-1010283637);
                                i = -478451836;
                            }
                            i8 = iM55979 ^ i;
                        }
                        break;
                    case -1091923139:
                    case -380048548:
                        if (RunnableC0897.f81856) {
                            iM55979 = C0946.m55979("᩶ۨ") ^ i5;
                            i6 = ((iM55979 ^ i4) * C0719o.a.f2894F) ^ (-1527287152);
                            i = 253470301;
                        } else {
                            iM55979 = (i5 - C0873.m55680("֫ۢ")) * 53;
                            i6 = ((iM55979 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -959839940:
                    case -337958719:
                        C0890.m55740();
                        if (C0898.m55800() > 0) {
                        }
                        iM55979 = (i5 - C0873.m55680("֫ۢ")) * 53;
                        i6 = ((iM55979 ^ i4) * (-9491)) ^ (-103904252);
                        i = -212012736;
                        i8 = iM55979 ^ i;
                        break;
                    case -701137208:
                    case -451274683:
                        if (C1012.f81938 >= 0) {
                            iM55979 = (i5 - C0873.m55680("֫ۢ")) * 53;
                            i6 = ((iM55979 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        } else {
                            iM55979 = C0946.m55979("ᩴۛ") ^ i5;
                            i6 = ((iM55979 ^ i4) * 30023) ^ (-1191436443);
                            i = -1074498184;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case -136076995:
                    case 1529217467:
                        if (C1048.f81963) {
                            iM55979 = (i4 - C0946.m55979("᩻ۙ")) * 5;
                            i6 = ((iM55979 ^ i5) * 1313) ^ (-1203316229);
                            i = -268555879;
                        } else {
                            iM55979 = C0873.m55680("ᩴᩳ") ^ i5;
                            i6 = ((iM55979 ^ i4) * (-30675)) ^ (-454557741);
                            i = 48698738;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 698565551:
                    case 964671884:
                        strM12247 = AbstractActivityC5549.m12247();
                        if (strM12247 != null) {
                            iM55979 = (C0946.m55979("ۢܶ") + i4) * 15;
                            i6 = ((iM55979 ^ i5) * 7763) ^ (-966078755);
                            i = -1425753623;
                        } else {
                            iM55979 = C0946.m55979("ܿ᩹") ^ i4;
                            i6 = ((iM55979 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 1090324669:
                    case 1392331121:
                        f42009 = strM12247;
                        iM55979 = C0946.m55979("ܿ᩹") ^ i4;
                        i6 = ((iM55979 ^ i5) * 29549) ^ (-2014378851);
                        i = -371018318;
                        i8 = iM55979 ^ i;
                        break;
                    case 1160196620:
                    case 1611664430:
                        if (C0927.m55878(strM12247) < 100) {
                            iM55979 = C0946.m55979("᩶᩹") ^ i5;
                            i6 = ((iM55979 ^ i4) * 29219) ^ 1213212677;
                            i = -1329575184;
                        } else {
                            iM55979 = C0946.m55979("ܿ᩹") ^ i4;
                            i6 = ((iM55979 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    case 1253038032:
                    case 1924503151:
                        if (C0892.f81851) {
                            iM55979 = C0873.m55680("ᩴ᩵") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-15525)) ^ (-1621970050);
                            i = -116152442;
                        } else {
                            iM55979 = (i5 - C0946.m55979("֫ۧ")) * (-53);
                            i6 = ((iM55979 ^ i4) * 7003) ^ (-428261756);
                            i = 1032499632;
                        }
                        i8 = iM55979 ^ i;
                        break;
                    default:
                        if (RunnableC0938.m55938() != 0) {
                            iM55979 = (i4 - C0946.m55979("᩻ۙ")) * 5;
                            i6 = ((iM55979 ^ i5) * 1313) ^ (-1203316229);
                            i = -268555879;
                        } else {
                            iM55979 = C0873.m55680("᩵ᩴ") ^ i4;
                            i6 = ((iM55979 ^ i5) * (-22597)) ^ (-251102859);
                            i = -1321536787;
                        }
                        i8 = iM55979 ^ i;
                        break;
                }
                return;
            }
            iM55680 = C0873.m55680("ۛ᩸") ^ i4;
            i6 = ((iM55680 ^ i5) * (-8469)) ^ 430469204;
            i7 = -38588591;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01cd A[PHI: r1 r2 r3 r8 r11 r12 r13 r14 r21
      0x01cd: PHI (r1v30 short[]) = (r1v17 short[]), (r1v18 short[]), (r1v31 short[]) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r2v5 l.᩹ۢۡ) = (r2v2 l.᩹ۢۡ), (r2v4 l.᩹ۢۡ), (r2v2 l.᩹ۢۡ) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r3v4 android.content.res.Resources) = (r3v2 android.content.res.Resources), (r3v3 android.content.res.Resources), (r3v2 android.content.res.Resources) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r8v3 android.content.IntentFilter) = (r8v2 android.content.IntentFilter), (r8v2 android.content.IntentFilter), (r8v4 android.content.IntentFilter) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r11v4 int) = (r11v3 int), (r11v2 int), (r11v2 int) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r12v4 int) = (r12v3 int), (r12v2 int), (r12v2 int) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r13v4 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r14v4 int) = (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r21v12 int) = (r21v8 int), (r21v9 int), (r21v13 int) binds: [B:49:0x01cb, B:45:0x01a8, B:41:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x020f A[PHI: r4 r5 r7 r15 r21 r23
      0x020f: PHI (r4v3 int) = (r4v1 int), (r4v2 int), (r4v1 int), (r4v1 int) binds: [B:53:0x020d, B:36:0x0137, B:13:0x0078, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v7 int) binds: [B:53:0x020d, B:36:0x0137, B:13:0x0078, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r7v4 int) = (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:53:0x020d, B:36:0x0137, B:13:0x0078, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r15v4 short[]) = (r15v2 short[]), (r15v3 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:53:0x020d, B:36:0x0137, B:13:0x0078, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r21v20 int) = (r21v7 int), (r21v11 int), (r21v18 int), (r21v24 int) binds: [B:53:0x020d, B:36:0x0137, B:13:0x0078, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]
      0x020f: PHI (r23v22 short[]) = (r23v11 short[]), (r23v1 short[]), (r23v1 short[]), (r23v1 short[]) binds: [B:53:0x020d, B:36:0x0137, B:13:0x0078, B:6:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Service
    public final void onCreate() {
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        int i4;
        int i5;
        int iM55681;
        int i6;
        int i7;
        int i8 = C1012.f81938;
        int i9 = C1124.f82007;
        int iM559710 = (C0946.m55979("ܿۢ") + i9) * (-39);
        int i10 = ((iM559710 ^ i8) * (-3751)) ^ (-505530463);
        Resources resources = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = iM559710 ^ (-1023904671);
        C23469 c23469M52198 = null;
        int i12 = 0;
        int iM55682 = 0;
        int iM559711 = 0;
        int i13 = 0;
        IntentFilter intentFilter = null;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        short s = 0;
        int i18 = -890608658;
        short s2 = 0;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i8) * (-4083)) >> 31));
            switch (i18) {
                case -1622645878:
                case 915809685:
                    iM559711 = iM559711;
                    c23469M52198.setImageDrawable(C23845.m52913(resources, iM55682, getTheme()));
                    C1048.m56304(c23469M52198, this);
                    if (C0894.f81854 < 0) {
                        iM55979 = (C0873.m55680("ۘ᩸") ^ i9) * (-29);
                        i3 = ((iM55979 ^ i8) * (-14959)) ^ (-1428383046);
                        i4 = 1570482495;
                        i5 = iM559711;
                        i11 = iM55979 ^ i4;
                        i10 = i3;
                        iM559711 = i5;
                    }
                    sArr = sArr;
                    iM55680 = (C0946.m55979("᩸ܰ") + i8) * 3;
                    i = ((iM55680 ^ i9) * 3405) ^ (-1340881398);
                    i2 = -1409587259;
                    int i19 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i19;
                    iM559711 = i5;
                    break;
                case -1402052058:
                case -1084789096:
                    RunnableC1014.m56177();
                    C1929.m56553();
                    iM559711 = iM559711;
                    iM55979 = C0873.m55680("᩻ۗ") ^ i8;
                    i3 = ((iM55979 ^ i9) * 16635) ^ (-1193934118);
                    i4 = 1665804772;
                    i5 = iM559711;
                    i11 = iM55979 ^ i4;
                    i10 = i3;
                    iM559711 = i5;
                    break;
                case -1337193436:
                case -1262640283:
                    if (C0873.f81841 <= 0) {
                        int iM55683 = C0873.m55680("۬ᩴ") ^ i9;
                        i11 = iM55683 ^ (-1119551604);
                        i10 = ((iM55683 ^ i8) * C0254q.f1218h) ^ 1239041810;
                        intentFilter = null;
                    } else {
                        iM55681 = (i9 - C0873.m55680("᩶᩷")) * 115;
                        i6 = ((iM55681 ^ i8) * (-12947)) ^ (-1280338372);
                        i7 = 573129796;
                        i11 = iM55681 ^ i7;
                        i10 = i6;
                    }
                    break;
                case -1255960067:
                case -1172310644:
                    iM559711 = iM559711;
                    sArr = sArr;
                    if (((s * s) + 212372329) - (s * s2) < 0) {
                        iM55680 = C0946.m55979("᩺ۛ") ^ i9;
                        i = ((iM55680 ^ i8) * (-16205)) ^ (-2088192566);
                        i2 = -1597258189;
                    } else {
                        iM55680 = C0873.m55680("ܿ֫") ^ i9;
                        i = ((iM55680 ^ i8) * (-3327)) ^ 1830676972;
                        i2 = -760073917;
                    }
                    int i110 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i110;
                    iM559711 = i5;
                    break;
                case -1181312796:
                case 1399196097:
                    C7050.m16208(this.f42011, intentFilter);
                    this.f42014 = new BinderC5354(this);
                    break;
                case -931942199:
                case 1152020323:
                    iM559711 = iM559711;
                    super.onCreate();
                    setTheme(C19552.m44401());
                    sArr = f82185;
                    if (RunnableC0897.m55784()) {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i8;
                        i3 = ((iM55979 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                    } else {
                        iM55979 = (i8 - C0946.m55979("֫ۙ")) * 123;
                        i3 = ((iM55979 ^ i9) * 14355) ^ 24853595;
                        i4 = 1440592381;
                    }
                    i5 = iM559711;
                    i11 = iM55979 ^ i4;
                    i10 = i3;
                    iM559711 = i5;
                    break;
                case -743089668:
                case 539666767:
                    iM559711 = iM559711;
                    sArr = sArr;
                    c23469M52198 = C23469.m52198(this, C1124.m56373(sArr, i15, i16, i14));
                    resources = getResources();
                    sArr2 = f82185;
                    i17 = 5;
                    if (C0937.f81884) {
                        iM55680 = (C0946.m55979("ۤܿ") ^ i9) * 71;
                        i = ((iM55680 ^ i8) * (-13121)) ^ (-1179946861);
                        i2 = 1295579786;
                    } else {
                        iM55680 = (C0946.m55979("᩸ܰ") + i8) * 3;
                        i = ((iM55680 ^ i9) * 3405) ^ (-1340881398);
                        i2 = -1409587259;
                    }
                    int i111 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i111;
                    iM559711 = i5;
                    break;
                case -698529424:
                case 425424027:
                    C1404.m56468();
                    break;
                case -609216377:
                case 1065744216:
                    i14 = 13610;
                    iM55680 = (C0946.m55979("۬ۧ") ^ i8) * (-45);
                    i = ((iM55680 ^ i9) * 11245) ^ 465139148;
                    i2 = -484977760;
                    int i112 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i112;
                    iM559711 = i5;
                    break;
                case -494216214:
                case -8344629:
                    if (C0890.f81849 == 0) {
                        iM55681 = (i9 - C0873.m55680("᩶᩷")) * 115;
                        i6 = ((iM55681 ^ i8) * (-12947)) ^ (-1280338372);
                        i7 = 573129796;
                        i11 = iM55681 ^ i7;
                        i10 = i6;
                    } else {
                        iM559711 = iM559711;
                        iM55979 = C0873.m55680("᩻ۗ") ^ i8;
                        i3 = ((iM55979 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                        i5 = iM559711;
                        i11 = iM55979 ^ i4;
                        i10 = i3;
                        iM559711 = i5;
                    }
                    break;
                case -111834918:
                case 464512066:
                    c23469M52198.setId(2100949060 ^ iM559711);
                    if (C1404.f82149 < 0) {
                        iM559711 = iM559711;
                        intentFilter = new IntentFilter(RunnableC0938.m55936(f82185, 11, 32, i14));
                        if (!C0927.f81875) {
                            iM55979 = C0946.m55979("۟ܳ") ^ i8;
                            i3 = ((iM55979 ^ i9) * 5423) ^ (-239842080);
                            i4 = -428699939;
                            i5 = iM559711;
                            i11 = iM55979 ^ i4;
                            i10 = i3;
                            iM559711 = i5;
                        }
                        sArr = sArr;
                        iM55680 = (C0946.m55979("᩸ܰ") + i8) * 3;
                        i = ((iM55680 ^ i9) * 3405) ^ (-1340881398);
                        i2 = -1409587259;
                        int i113 = iM55680 ^ i2;
                        sArr = sArr;
                        i10 = i;
                        i5 = iM559711;
                        i11 = i113;
                        iM559711 = i5;
                    } else {
                        int iM55684 = C0873.m55680("۬ᩴ") ^ i9;
                        i11 = iM55684 ^ (-1119551604);
                        i10 = ((iM55684 ^ i8) * C0254q.f1218h) ^ 1239041810;
                        intentFilter = null;
                    }
                    break;
                case 284423642:
                case 1349725907:
                    C0937.m55918();
                    if (!C0892.m55749()) {
                        iM559711 = iM559711;
                        sArr = sArr;
                        iM55680 = C0946.m55979("۫۫") ^ i8;
                        i = ((iM55680 ^ i9) * (-12735)) ^ 2006020094;
                        i2 = 1251224963;
                        int i114 = iM55680 ^ i2;
                        sArr = sArr;
                        i10 = i;
                        i5 = iM559711;
                        i11 = i114;
                        iM559711 = i5;
                    }
                    iM559711 = iM559711;
                    iM55979 = C0873.m55680("᩻ۗ") ^ i8;
                    i3 = ((iM55979 ^ i9) * 16635) ^ (-1193934118);
                    i4 = 1665804772;
                    i5 = iM559711;
                    i11 = iM55979 ^ i4;
                    i10 = i3;
                    iM559711 = i5;
                    break;
                case 345276540:
                case 1757362187:
                    iM559711 = C0946.m55979(C1071.m56336(sArr3, i12, i13, i14));
                    if (C0927.f81875) {
                        iM55681 = (i9 - C0873.m55680("᩶᩷")) * 115;
                        i6 = ((iM55681 ^ i8) * (-12947)) ^ (-1280338372);
                        i7 = 573129796;
                    } else {
                        iM55681 = (C0873.m55680("ۘ᩶") ^ i9) * 11;
                        i6 = ((iM55681 ^ i8) * (-10003)) ^ 984703287;
                        i7 = -936351111;
                    }
                    i11 = iM55681 ^ i7;
                    i10 = i6;
                    break;
                case 512670123:
                case 591378584:
                    iM559711 = iM559711;
                    sArr = sArr;
                    s = f82185[0];
                    s2 = 29146;
                    if (C1017.m56187() <= 0) {
                        iM55680 = C0946.m55979("۫۫") ^ i8;
                        i = ((iM55680 ^ i9) * (-12735)) ^ 2006020094;
                        i2 = 1251224963;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩶") ^ i8;
                        i = ((iM55680 ^ i9) * (-14557)) ^ 770485910;
                        i2 = 3619527;
                    }
                    int i115 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i115;
                    iM559711 = i5;
                    break;
                case 768271101:
                case 2100700986:
                    iM559711 = iM559711;
                    this.f42012 = c23469M52198;
                    sArr3 = f82185;
                    i12 = 8;
                    i13 = 3;
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i8;
                        i3 = ((iM55979 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩸") ^ i8;
                        i3 = ((iM55979 ^ i9) * 29735) ^ (-124252351);
                        i4 = -1585437967;
                    }
                    i5 = iM559711;
                    i11 = iM55979 ^ i4;
                    i10 = i3;
                    iM559711 = i5;
                    break;
                case 1076015925:
                case 1308614085:
                    i14 = 31884;
                    iM55680 = (C0946.m55979("۬ۧ") ^ i8) * (-45);
                    i = ((iM55680 ^ i9) * 11245) ^ 465139148;
                    i2 = -484977760;
                    int i116 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i116;
                    iM559711 = i5;
                    break;
                case 1437443075:
                case 1691577299:
                    iM559711 = iM559711;
                    sArr = sArr;
                    i15 = 1;
                    i16 = 4;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("᩸ܰ") + i8) * 3;
                        i = ((iM55680 ^ i9) * 3405) ^ (-1340881398);
                        i2 = -1409587259;
                    } else {
                        iM55680 = C0946.m55979("᩷ۡ") ^ i9;
                        i = ((iM55680 ^ i8) * (-11015)) ^ (-540367042);
                        i2 = 1048658657;
                    }
                    int i117 = iM55680 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM559711;
                    i11 = i117;
                    iM559711 = i5;
                    break;
                default:
                    iM559711 = iM559711;
                    iM55682 = 2121795158 ^ C0873.m55680(C1012.m56144(sArr2, i17, 3, i14));
                    if (AbstractC0942.f81890 <= 0) {
                        iM55979 = C0873.m55680("᩻ۗ") ^ i8;
                        i3 = ((iM55979 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                    } else {
                        iM55979 = C0873.m55680("ۜܶ") ^ i8;
                        i3 = ((iM55979 ^ i9) * (-16325)) ^ (-1043169256);
                        i4 = -2088589977;
                    }
                    i5 = iM559711;
                    i11 = iM55979 ^ i4;
                    i10 = i3;
                    iM559711 = i5;
                    break;
            }
            return;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f42014;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 698490085;
        int i8 = C1017.f81942;
        int i9 = C0898.f81858;
        int iM55979 = (C0946.m55979("᩹۟") + i8) * 57;
        int i10 = ((iM55979 ^ i9) * 28177) ^ 2099884774;
        int i11 = 1428306775;
        while (true) {
            i7 = ((((i7 ^ i9) * (-17623)) >> 31) & i10) ^ (iM55979 ^ i11);
            switch (i7) {
                case -2051366202:
                case -1800242757:
                    i4 = 54698;
                    iM55979 = (C0946.m55979("ۚᩳ") + i9) * (-111);
                    i10 = ((iM55979 ^ i8) * (-4969)) ^ (-89854624);
                    i11 = 1779073181;
                    break;
                case -1996021912:
                case -1137081385:
                    this.f42012.show();
                    iM55979 = (C0873.m55680("ۛ۬") + i9) * (-29);
                    i10 = ((iM55979 ^ i8) * (-3513)) ^ (-45471754);
                    i11 = 1679400253;
                    break;
                case -1722430121:
                case -1344282829:
                    if (C0946.f81894 != 0) {
                        iM55979 = (i8 - C0946.m55979("ۜ᩸")) * (-83);
                        i10 = ((iM55979 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    } else {
                        iM55979 = C0873.m55680("᩺ۖ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-24213)) ^ 840942710;
                        i11 = -1561109449;
                    }
                    break;
                case -1691020021:
                case -949822114:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i8 - C0946.m55979("ۜ᩸")) * (-83);
                        i10 = ((iM55979 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    } else {
                        iM55979 = C0946.m55979("ᩳۢ") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-599)) ^ (-1070242560);
                        i11 = -727611070;
                    }
                    break;
                case -1595727524:
                case 917018068:
                    if (i3 - (36556 * s) >= 0) {
                        iM55979 = (C0873.m55680("᩺۬") + i8) * 13;
                        i10 = ((iM55979 ^ i9) * (-559)) ^ (-1902127665);
                        i11 = 515137374;
                    } else {
                        iM55979 = (C0946.m55979("ۛ᩸") + i8) * (-73);
                        i10 = ((iM55979 ^ i9) * 9529) ^ 1717874044;
                        i11 = -1522196102;
                    }
                    break;
                case -1422486890:
                case -544163635:
                    if (this.f42012.m52206()) {
                        iM55979 = C0946.m55979("ۜ᩻") ^ i9;
                        i10 = ((iM55979 ^ i8) * 8035) ^ (-1264519416);
                        i11 = -1262654720;
                    } else {
                        iM55979 = C0946.m55979("ܰۢ") ^ i8;
                        i10 = ((iM55979 ^ i9) * 7327) ^ (-1926911927);
                        i11 = -1565333463;
                    }
                    break;
                case -1298911594:
                case -151430090:
                    s = f82185[43];
                    if (C1071.f81975 <= 0) {
                        iM55979 = (C0946.m55979("ۡۗ") ^ i8) * 101;
                        i10 = ((iM55979 ^ i9) * (-123)) ^ 151214496;
                        i11 = -1977041328;
                    } else {
                        iM55979 = (i9 - C0946.m55979("ܶۙ")) * (-37);
                        i10 = ((iM55979 ^ i8) * (-5911)) ^ 944926824;
                        i11 = -202883962;
                    }
                    break;
                case -1277138151:
                case -272023244:
                    if (C1012.f81938 >= 0) {
                        iM55979 = (C0873.m55680("᩷֨") ^ i8) * 77;
                        i10 = ((iM55979 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    } else {
                        iM55979 = (i8 - C0946.m55979("ۜ᩸")) * (-83);
                        i10 = ((iM55979 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    }
                    break;
                case -1271549497:
                case 1827397558:
                    return 2;
                case -1204029294:
                case -1036404199:
                    i4 = 18311;
                    iM55979 = (C0946.m55979("ۚᩳ") + i9) * (-111);
                    i10 = ((iM55979 ^ i8) * (-4969)) ^ (-89854624);
                    i11 = 1779073181;
                    break;
                case -1166724566:
                case 470199100:
                    if (this.f42013 != null) {
                        iM55979 = C0946.m55979("ۧۤ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-16323)) ^ 960674808;
                        i11 = -686529576;
                    } else {
                        iM55979 = C0873.m55680("֨ᩴ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 29523) ^ (-557044609);
                        i11 = 710396726;
                    }
                    break;
                case -783278073:
                case 584254770:
                    stopSelf();
                    iM55979 = (C0873.m55680("ۛ۬") + i9) * (-29);
                    i10 = ((iM55979 ^ i8) * (-3513)) ^ (-45471754);
                    i11 = 1679400253;
                    break;
                case -748654468:
                case 920916193:
                    int i12 = s + 9139;
                    i3 = i12 * i12;
                    if (C0906.m55809() <= 0) {
                        iM55979 = (i8 - C0946.m55979("ۜ᩸")) * (-83);
                        i10 = ((iM55979 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    } else {
                        iM55979 = (C0873.m55680("ۖۖ") + i9) * 57;
                        i10 = ((iM55979 ^ i8) * 2715) ^ (-439116354);
                        i11 = 1165316372;
                    }
                    break;
                case -718754320:
                case 689001162:
                    this.f42013 = f42010;
                    f42010 = null;
                    iM55979 = (C0946.m55979("۫ۨ") + i9) * 91;
                    i10 = ((iM55979 ^ i8) * (-24817)) ^ (-967681931);
                    i11 = -1119336947;
                    break;
                case -512606778:
                case 2079694642:
                    AbstractC0942.m55971();
                    RunnableC0871.m55672();
                    iM55979 = (i8 - C0946.m55979("ۜ᩸")) * (-83);
                    i10 = ((iM55979 ^ i9) * (-14597)) ^ (-1200482818);
                    i11 = -376317190;
                    break;
                case -438728264:
                case -388017940:
                    C0892.m55749();
                    return 0;
                case -436436743:
                case -406206969:
                    if (C1046.f81962 <= 0) {
                        iM55979 = (C0873.m55680("᩷֨") ^ i8) * 77;
                        i10 = ((iM55979 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    } else {
                        iM55979 = (C0946.m55979("֫֫") ^ i9) * 63;
                        i10 = ((iM55979 ^ i8) * 16511) ^ (-1280761974);
                        i11 = -2114831857;
                    }
                    break;
                case -418672033:
                case 1064497643:
                    sArr = f82185;
                    i5 = 44;
                    i6 = 4;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55979 = (C0946.m55979("ۡۗ") ^ i8) * 101;
                        i10 = ((iM55979 ^ i9) * (-123)) ^ 151214496;
                        i11 = -1977041328;
                    } else {
                        iM55979 = C0946.m55979("᩹᩶") ^ i8;
                        i10 = ((iM55979 ^ i9) * 31311) ^ (-2054711098);
                        i11 = -1901586904;
                    }
                    break;
                case -126593763:
                case 1934191585:
                    if (C1028.f81950 <= 0) {
                        iM55979 = (C0873.m55680("᩷֨") ^ i8) * 77;
                        i10 = ((iM55979 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    } else {
                        iM55979 = C0946.m55979("ܿ۬") ^ i9;
                        i10 = ((iM55979 ^ i8) * 21253) ^ 233419038;
                        i11 = -806994661;
                    }
                    break;
                case 11012003:
                case 1596501963:
                    if (C1194.f82045 != 0) {
                        iM55979 = (i9 - C0946.m55979("ۛ᩻")) * 91;
                        i10 = ((iM55979 ^ i8) * 25309) ^ 172372474;
                        i11 = 1557653462;
                    } else {
                        iM55979 = C0873.m55680("᩷ܰ") ^ i9;
                        i10 = ((iM55979 ^ i8) * 31625) ^ 1276442290;
                        i11 = 507909907;
                    }
                    break;
                case 85704647:
                case 1783922194:
                    if (C0955.f81898) {
                        iM55979 = (i9 - C0946.m55979("ۛ᩻")) * 91;
                        i10 = ((iM55979 ^ i8) * 25309) ^ 172372474;
                        i11 = 1557653462;
                    } else {
                        iM55979 = C0873.m55680("ۧ֫") ^ i8;
                        i10 = ((iM55979 ^ i9) * (-7151)) ^ (-170523922);
                        i11 = -787361715;
                    }
                    break;
                case 289074216:
                case 879200796:
                    if (C1964.f83032 > 0) {
                        iM55979 = (i9 - C0946.m55979("ۛ᩻")) * 91;
                        i10 = ((iM55979 ^ i8) * 25309) ^ 172372474;
                        i11 = 1557653462;
                    } else {
                        iM55979 = C0946.m55979("ᩳܶ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-3599)) ^ (-2103741764);
                        i11 = -414286369;
                    }
                    break;
                case 302389502:
                case 1515071694:
                    C0989.m56095();
                    if (C0906.f81862 < 0) {
                        iM55979 = C0946.m55979("ᩳܶ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-3599)) ^ (-2103741764);
                        i11 = -414286369;
                    } else {
                        iM55979 = (C0873.m55680("᩷֨") ^ i8) * 77;
                        i10 = ((iM55979 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    }
                    break;
                case 381758274:
                case 2041670275:
                    if (C1003.m56123() != 0) {
                        iM55979 = C0946.m55979("ᩳܶ") ^ i9;
                        i10 = ((iM55979 ^ i8) * (-3599)) ^ (-2103741764);
                        i11 = -414286369;
                    } else {
                        iM55979 = (C0946.m55979("۟᩺") ^ i8) * C0254q.f1218h;
                        i10 = ((iM55979 ^ i9) * 11969) ^ (-1787422651);
                        i11 = -715669381;
                    }
                    break;
                case 1303021128:
                case 1930101201:
                    this.f42012.m52205();
                    iM55979 = (C0873.m55680("ۛ۬") + i9) * (-29);
                    i10 = ((iM55979 ^ i8) * (-3513)) ^ (-45471754);
                    i11 = 1679400253;
                    break;
                case 1595037055:
                case 1820278440:
                    if (intent.getBooleanExtra(C0873.m55689(sArr, i5, i6, i4), false)) {
                        iM55979 = C0946.m55979("۫ۗ") ^ i8;
                        i10 = ((iM55979 ^ i9) * 7341) ^ 1852919308;
                        i11 = -123173940;
                    } else {
                        iM55979 = (C0946.m55979("۫ۨ") + i9) * 91;
                        i10 = ((iM55979 ^ i8) * (-24817)) ^ (-967681931);
                        i11 = -1119336947;
                    }
                    break;
                default:
                    if (intent != null) {
                        iM55979 = (i8 - C0946.m55979("ۢ᩻")) * (-71);
                        i10 = ((iM55979 ^ i9) * (-32167)) ^ 261793037;
                        i11 = 855346934;
                    } else {
                        iM55979 = (C0946.m55979("۫ۨ") + i9) * 91;
                        i10 = ((iM55979 ^ i8) * (-24817)) ^ (-967681931);
                        i11 = -1119336947;
                    }
                    break;
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        String str = null;
        int i = 1952544406;
        int i2 = C0906.f81862;
        int i3 = C0912.f81867;
        int iM55979 = C0946.m55979("᩶᩸") ^ i3;
        int i4 = ((iM55979 ^ i2) * (-10327)) ^ (-1978520531);
        int i5 = 625690685;
        while (true) {
            i = ((((i ^ i2) * 31383) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2042673141:
                case -128724401:
                    this.f42012.m52207();
                    if (C0894.f81854 >= 0) {
                        iM55979 = C0873.m55680("ۙ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14563)) ^ (-601483031);
                        i5 = 273484186;
                    } else {
                        iM55979 = (C0873.m55680("᩵᩷") + i2) * 99;
                        i4 = ((iM55979 ^ i3) * 6413) ^ (-777772001);
                        i5 = 1722413582;
                    }
                    break;
                case -2007696602:
                case 1713646989:
                    if (C0892.f81851) {
                        iM55979 = C0946.m55979("ۙۗ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 10249) ^ (-1453586981);
                        i5 = 458239470;
                    } else {
                        iM55979 = C0946.m55979("֫۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10001)) ^ (-236840353);
                        i5 = -1978380963;
                    }
                    break;
                case -1570384215:
                case -1269284645:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (i3 - C0873.m55680("ۖۛ")) * 39;
                        i4 = ((iM55979 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ۖۖ")) * 99;
                        i4 = ((iM55979 ^ i2) * (-28957)) ^ (-1473180368);
                        i5 = 1155066312;
                    }
                    break;
                case -1474370049:
                case 607464327:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۙ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14563)) ^ (-601483031);
                        i5 = 273484186;
                    } else {
                        iM55979 = (C0873.m55680("᩸᩹") ^ i2) * 13;
                        i4 = ((iM55979 ^ i3) * (-22993)) ^ (-1993403084);
                        i5 = -1591702712;
                    }
                    break;
                case -1337878077:
                case 1719852395:
                    super.onDestroy();
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۡۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18665) ^ (-986495594);
                        i5 = 2020673320;
                    } else {
                        iM55979 = C0946.m55979("۬ۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-5025)) ^ 1208015730;
                        i5 = 636365665;
                    }
                    break;
                case -1292899515:
                case 1146114887:
                    C0892.m55749();
                    ServiceConnectionC1013.m56157();
                    break;
                case -1045551531:
                case 1002111131:
                    C0863.m55643();
                    C0854.m55595();
                    iM55979 = C0873.m55680("ܳ᩷") ^ i2;
                    i4 = ((iM55979 ^ i3) * 22431) ^ (-611282489);
                    i5 = 501720266;
                    break;
                case -885432953:
                case 789590294:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0946.m55979("֫۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10001)) ^ (-236840353);
                        i5 = -1978380963;
                    } else {
                        iM55979 = (C0946.m55979("۟۠") + i2) * 47;
                        i4 = ((iM55979 ^ i3) * 2909) ^ (-902832932);
                        i5 = 276309823;
                    }
                    break;
                case -687068855:
                case 538945761:
                    C7050.m16207(this.f42011);
                    break;
                case -559478109:
                case 869520717:
                    if (!C0882.f81846) {
                        iM55979 = C0873.m55680("ۡۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18665) ^ (-986495594);
                        i5 = 2020673320;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22431) ^ (-611282489);
                        i5 = 501720266;
                    }
                    break;
                case -121125128:
                case 1401358633:
                    C0992.m56107();
                    if (C1012.f81938 < 0) {
                        iM55979 = C0946.m55979("֫۟") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-10001)) ^ (-236840353);
                        i5 = -1978380963;
                    } else {
                        iM55979 = (i3 - C0873.m55680("ۖۛ")) * 39;
                        i4 = ((iM55979 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    }
                    break;
                case 42586164:
                case 1119562858:
                    if (C1044.f81959 >= 0) {
                        iM55979 = C0873.m55680("ۡۨ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 18665) ^ (-986495594);
                        i5 = 2020673320;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۬ۛ")) * (-55);
                        i4 = ((iM55979 ^ i2) * 24539) ^ (-587250157);
                        i5 = -1532806262;
                    }
                    break;
                case 622611938:
                case 1129689752:
                    if (C1964.m56597() == 0) {
                        iM55979 = (i3 - C0873.m55680("ۖۛ")) * 39;
                        i4 = ((iM55979 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    } else {
                        iM55979 = C0873.m55680("ܳ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22431) ^ (-611282489);
                        i5 = 501720266;
                    }
                    break;
                case 851048203:
                case 1108685559:
                    str = null;
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ܳ᩷") ^ i2;
                        i4 = ((iM55979 ^ i3) * 22431) ^ (-611282489);
                        i5 = 501720266;
                    } else {
                        iM55979 = (C0946.m55979("۫ۛ") ^ i3) * C0254q.f1218h;
                        i4 = ((iM55979 ^ i2) * (-2525)) ^ 1479822156;
                        i5 = 1184363420;
                    }
                    break;
                case 1927700641:
                case 1942403124:
                    if (C1929.f83011 != 0) {
                        iM55979 = (i3 - C0873.m55680("ۖۛ")) * 39;
                        i4 = ((iM55979 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    } else {
                        iM55979 = C0946.m55979("۟ۜ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 24763) ^ 2058631150;
                        i5 = 118917129;
                    }
                    break;
                default:
                    f42008 = str;
                    if (C0854.f81826 != 0) {
                        iM55979 = C0873.m55680("ۙ۠") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-14563)) ^ (-601483031);
                        i5 = 273484186;
                    } else {
                        iM55979 = (C0873.m55680("᩸֡") ^ i3) * (-81);
                        i4 = ((iM55979 ^ i2) * 9299) ^ 819264652;
                        i5 = 186702648;
                    }
                    break;
            }
            return;
        }
    }
}
