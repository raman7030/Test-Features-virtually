package l;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.IBinder;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.۬ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X0 */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceC13018 extends Service implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static String f38961 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String f38962 = "";

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C12534 f38963;

    /* JADX INFO: renamed from: ۬ܽ۠, reason: not valid java name and contains not printable characters */
    private static final short[] f38964 = {9437, 13643, 13656, 13657, 13641, 26810, -17149, 26030, -22613, 23066, -18689, 13675, 13673, 13694, 13667, 13669, 13668, 13685, 13671, 13694, 13685, 13673, 13670, 13669, 13689, 13679, 13685, 13688, 13679, 13689, 13669, 13695, 13688, 13673, 13679, 13685, 13691, 13695, 13679, 13688, 13667, 13679, 13688, 3340, 18414, 18409, 18414, 18419};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f38965;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C22202 f38966;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12534 f38967;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BinderC3141 f38968;

    public ServiceC13018() {
        C4552 c4552 = null;
        int i = 1702488274;
        int i2 = C4117.f13076;
        int i3 = ServiceConnectionC3453.f10921;
        int iM6981 = C2105.m6981("ۤ֨") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-3013)) ^ 1926043785;
        int i5 = -918128673;
        while (true) {
            i = ((((i ^ i2) * 29753) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2049873931:
                case 271495029:
                    if (C22628.f73083 <= 0) {
                        iM6981 = C0630.m2566("۬֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM6981 = (C2105.m6981("۫᩺") ^ i3) * 115;
                        i4 = ((iM6981 ^ i2) * 27801) ^ 1448783025;
                        i5 = 1404556372;
                    }
                    break;
                case -2014112676:
                case 627431815:
                    C1047.m3599();
                    C1773.m5908();
                    iM6981 = (C2105.m6981("ۧۡ") + i2) * (-73);
                    i4 = ((iM6981 ^ i3) * 6577) ^ 1449619721;
                    i5 = -865104816;
                    break;
                case -1943248793:
                case 615938169:
                    RunnableC1108.m3790();
                    throw new RuntimeException();
                case -1847780065:
                case -1292530049:
                    if (C4075.m12263() <= 0) {
                        iM6981 = C0630.m2566("۬֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM6981 = C0630.m2566("ۛ᩹") ^ i3;
                        i4 = ((iM6981 ^ i2) * 14359) ^ 183968360;
                        i5 = 328250150;
                    }
                    break;
                case -1840375697:
                case -9983832:
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("۬֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM6981 = (i2 - C0630.m2566("᩺۟")) * 31;
                        i4 = ((iM6981 ^ i3) * 26525) ^ 878738022;
                        i5 = -1206047286;
                    }
                    break;
                case -1727765692:
                case 974695668:
                    if (C3663.m11168() >= 0) {
                        iM6981 = C0630.m2566("۬֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM6981 = (C2105.m6981("ۢۤ") + i3) * 7;
                        i4 = ((iM6981 ^ i2) * (-12789)) ^ (-38280645);
                        i5 = -685008323;
                    }
                    break;
                case -1485362848:
                case 1229867515:
                    if (!C1711.f5919) {
                        iM6981 = C0630.m2566("ᩴܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19941)) ^ (-496004956);
                        i5 = -1603723347;
                    } else {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15355) ^ 530205130;
                        i5 = 1795676312;
                    }
                    break;
                case -1436642766:
                case 557863481:
                    this.f38965 = c4552;
                    return;
                case -1400833917:
                case 632379883:
                    c4552 = new C4552(this);
                    if (C2105.m6982() != 0) {
                        iM6981 = (C2105.m6981("ۧۡ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    } else {
                        iM6981 = (C0630.m2566("ۙܰ") + i3) * 33;
                        i4 = ((iM6981 ^ i2) * (-14313)) ^ (-1682504047);
                        i5 = -1803263704;
                    }
                    break;
                case -1279683372:
                case -128932660:
                    if (C0798.f2919) {
                        iM6981 = (C2105.m6981("ۧۡ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    } else {
                        iM6981 = (i2 - C2105.m6981("ᩳ᩻")) * (-53);
                        i4 = ((iM6981 ^ i3) * (-5783)) ^ 585412077;
                        i5 = -1173899126;
                    }
                    break;
                case -587387648:
                case 2112992980:
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("۠֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3435)) ^ 380535255;
                        i5 = 528943511;
                    } else {
                        iM6981 = C0630.m2566("᩸᩻") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-31897)) ^ (-2140177972);
                        i5 = 1189378769;
                    }
                    break;
                case 103721400:
                case 1938780712:
                    if (C2520.f8000 >= 0) {
                        iM6981 = (C2105.m6981("ۧۡ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    } else {
                        iM6981 = C2105.m6981("۬ۤ") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-26867)) ^ 485085239;
                        i5 = -1976276257;
                    }
                    break;
                case 412519663:
                case 616248286:
                    if (RunnableC1108.m3790()) {
                        iM6981 = C0630.m2566("۬֡") ^ i2;
                        i4 = ((iM6981 ^ i3) * 15687) ^ (-1265415963);
                        i5 = 506459259;
                    } else {
                        iM6981 = C0630.m2566("֡ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 20929) ^ 123748244;
                        i5 = -445596888;
                    }
                    break;
                case 1223078633:
                case 1681213346:
                    C1420.m4913();
                    if (AbstractC2021.f6743 > 0) {
                        iM6981 = C0630.m2566("۠֫") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-3435)) ^ 380535255;
                        i5 = 528943511;
                    } else {
                        iM6981 = C0630.m2566("ᩴܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19941)) ^ (-496004956);
                        i5 = -1603723347;
                    }
                    break;
                case 1285411297:
                case 1516903308:
                    if (C2520.f8000 < 0) {
                        iM6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((iM6981 ^ i2) * 15355) ^ 530205130;
                        i5 = 1795676312;
                    } else {
                        iM6981 = (C2105.m6981("ۧۡ") + i2) * (-73);
                        i4 = ((iM6981 ^ i3) * 6577) ^ 1449619721;
                        i5 = -865104816;
                    }
                    break;
                default:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = C0630.m2566("ᩴܰ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-19941)) ^ (-496004956);
                        i5 = -1603723347;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۢ᩶")) * 9;
                        i4 = ((iM6981 ^ i2) * 19669) ^ 204102055;
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
        int iM6981;
        int i;
        String strM10211 = null;
        int i2 = 0;
        int i3 = -1977430140;
        int i4 = ViewOnClickListenerC1958.f6529;
        int i5 = C4616.f14690;
        int iM2566 = C0630.m2566("ۨ᩻") ^ i5;
        int i6 = ((iM2566 ^ i4) * 13603) ^ (-1240385027);
        int i7 = -103620361;
        while (true) {
            int i8 = iM2566 ^ i7;
            Intent intent = null;
            while (true) {
                i3 = ((((i3 ^ i4) * 28137) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2099873116:
                    case 2003093728:
                        if (C4075.f12947 < 0) {
                            iM6981 = (i4 - C2105.m6981("᩵ۧ")) * (-51);
                            i6 = ((iM6981 ^ i5) * 18797) ^ (-677195476);
                            i = -2090754404;
                            i8 = iM6981 ^ i;
                        }
                        break;
                    case -2094448224:
                    case 668266824:
                        C0798.m3009(intent, 268435456);
                        C21923.m49344(this, intent);
                        break;
                    case -1770464525:
                    case 375372266:
                        if (C4117.m12362(strM10211, 10) == -1) {
                            int iM2567 = C0630.m2566("ۗۘ") ^ i4;
                            i6 = ((iM2567 ^ i5) * 735) ^ 319829684;
                            i8 = iM2567 ^ (-240523736);
                            i2 = -1;
                        } else {
                            i2 = -1;
                            iM6981 = C2105.m6981("ܿ᩹") ^ i4;
                            i6 = ((iM6981 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                            i8 = iM6981 ^ i;
                        }
                        break;
                    case -1723035297:
                    case -1662608822:
                        if (AbstractC2021.f6743 <= 0) {
                            iM6981 = (i5 - C0630.m2566("֫ۢ")) * 53;
                            i6 = ((iM6981 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        } else {
                            iM6981 = (C0630.m2566("ܳۜ") + i5) * (-101);
                            i6 = ((iM6981 ^ i4) * (-24005)) ^ (-1109028909);
                            i = -986461476;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1542454794:
                    case 610239949:
                        C3746.m11369();
                        iM6981 = (i4 - C2105.m6981("᩻ۙ")) * 5;
                        i6 = ((iM6981 ^ i5) * 1313) ^ (-1203316229);
                        i = -268555879;
                        i8 = iM6981 ^ i;
                        break;
                    case -1517643522:
                    case -1297534624:
                        if (C2958.m9036(strM10211, 13) == i2) {
                            iM6981 = (C0630.m2566("᩻ۗ") + i5) * 57;
                            i6 = ((iM6981 ^ i4) * 15741) ^ 775458483;
                            i = -529404639;
                        } else {
                            iM6981 = C2105.m6981("ܿ᩹") ^ i4;
                            i6 = ((iM6981 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1450154597:
                    case 1583252705:
                        if (C1711.m5736() <= 0) {
                            iM6981 = C0630.m2566("ᩴᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-30675)) ^ (-454557741);
                            i = 48698738;
                        } else {
                            iM6981 = (i5 - C0630.m2566("֫ۢ")) * 53;
                            i6 = ((iM6981 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1390812820:
                    case 342898413:
                        if (C1005.f3721) {
                            iM6981 = C2105.m6981("ۙܳ") ^ i4;
                            i6 = ((iM6981 ^ i5) * 21025) ^ 1557745513;
                            i = -688585239;
                        } else {
                            iM6981 = C0630.m2566("ᩴᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-30675)) ^ (-454557741);
                            i = 48698738;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1389146832:
                    case -204834372:
                        if (C21923.f70183 != 0) {
                            iM6981 = (i5 - C2105.m6981("֫ۧ")) * (-53);
                            i6 = ((iM6981 ^ i4) * 7003) ^ (-428261756);
                            i = 1032499632;
                        } else {
                            iM6981 = C2105.m6981("᩸ܳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-1493)) ^ 635828293;
                            i = 852022166;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -1251900670:
                    case 1264329668:
                        C1047.m3599();
                        C0382.m1848();
                        break;
                    case -1111364961:
                    case 2002921195:
                        if (C4159.m12565() < 0) {
                            intent = new Intent(this, (Class<?>) ViewOnClickListenerC12313.class);
                            if (C0714.f2697 >= 0) {
                                iM6981 = (i5 - C2105.m6981("֫ۧ")) * (-53);
                                i6 = ((iM6981 ^ i4) * 7003) ^ (-428261756);
                                i = 1032499632;
                            } else {
                                iM6981 = (C0630.m2566("ۗᩳ") ^ i5) * (-57);
                                i6 = ((iM6981 ^ i4) * 19313) ^ (-1010283637);
                                i = -478451836;
                            }
                            i8 = iM6981 ^ i;
                        }
                        break;
                    case -1091923139:
                    case -380048548:
                        if (RunnableC1108.f4040) {
                            iM6981 = C2105.m6981("᩶ۨ") ^ i5;
                            i6 = ((iM6981 ^ i4) * o.a.F) ^ (-1527287152);
                            i = 253470301;
                        } else {
                            iM6981 = (i5 - C0630.m2566("֫ۢ")) * 53;
                            i6 = ((iM6981 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -959839940:
                    case -337958719:
                        C0964.m3413();
                        if (C1128.m3851() > 0) {
                        }
                        iM6981 = (i5 - C0630.m2566("֫ۢ")) * 53;
                        i6 = ((iM6981 ^ i4) * (-9491)) ^ (-103904252);
                        i = -212012736;
                        i8 = iM6981 ^ i;
                        break;
                    case -701137208:
                    case -451274683:
                        if (C3432.f10845 >= 0) {
                            iM6981 = (i5 - C0630.m2566("֫ۢ")) * 53;
                            i6 = ((iM6981 ^ i4) * (-9491)) ^ (-103904252);
                            i = -212012736;
                        } else {
                            iM6981 = C2105.m6981("ᩴۛ") ^ i5;
                            i6 = ((iM6981 ^ i4) * 30023) ^ (-1191436443);
                            i = -1074498184;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case -136076995:
                    case 1529217467:
                        if (C4159.f13567) {
                            iM6981 = (i4 - C2105.m6981("᩻ۙ")) * 5;
                            i6 = ((iM6981 ^ i5) * 1313) ^ (-1203316229);
                            i = -268555879;
                        } else {
                            iM6981 = C0630.m2566("ᩴᩳ") ^ i5;
                            i6 = ((iM6981 ^ i4) * (-30675)) ^ (-454557741);
                            i = 48698738;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 698565551:
                    case 964671884:
                        strM10211 = AbstractActivityC3346.m10211();
                        if (strM10211 != null) {
                            iM6981 = (C2105.m6981("ۢܶ") + i4) * 15;
                            i6 = ((iM6981 ^ i5) * 7763) ^ (-966078755);
                            i = -1425753623;
                        } else {
                            iM6981 = C2105.m6981("ܿ᩹") ^ i4;
                            i6 = ((iM6981 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 1090324669:
                    case 1392331121:
                        f38962 = strM10211;
                        iM6981 = C2105.m6981("ܿ᩹") ^ i4;
                        i6 = ((iM6981 ^ i5) * 29549) ^ (-2014378851);
                        i = -371018318;
                        i8 = iM6981 ^ i;
                        break;
                    case 1160196620:
                    case 1611664430:
                        if (C1711.m5741(strM10211) < 100) {
                            iM6981 = C2105.m6981("᩶᩹") ^ i5;
                            i6 = ((iM6981 ^ i4) * 29219) ^ 1213212677;
                            i = -1329575184;
                        } else {
                            iM6981 = C2105.m6981("ܿ᩹") ^ i4;
                            i6 = ((iM6981 ^ i5) * 29549) ^ (-2014378851);
                            i = -371018318;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    case 1253038032:
                    case 1924503151:
                        if (C1005.f3721) {
                            iM6981 = C0630.m2566("ᩴ᩵") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-15525)) ^ (-1621970050);
                            i = -116152442;
                        } else {
                            iM6981 = (i5 - C2105.m6981("֫ۧ")) * (-53);
                            i6 = ((iM6981 ^ i4) * 7003) ^ (-428261756);
                            i = 1032499632;
                        }
                        i8 = iM6981 ^ i;
                        break;
                    default:
                        if (RunnableC1937.m6387() != 0) {
                            iM6981 = (i4 - C2105.m6981("᩻ۙ")) * 5;
                            i6 = ((iM6981 ^ i5) * 1313) ^ (-1203316229);
                            i = -268555879;
                        } else {
                            iM6981 = C0630.m2566("᩵ᩴ") ^ i4;
                            i6 = ((iM6981 ^ i5) * (-22597)) ^ (-251102859);
                            i = -1321536787;
                        }
                        i8 = iM6981 ^ i;
                        break;
                }
                return;
            }
            iM2566 = C0630.m2566("ۛ᩸") ^ i4;
            i6 = ((iM2566 ^ i5) * (-8469)) ^ 430469204;
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
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        int i4;
        int i5;
        int iM2567;
        int i6;
        int i7;
        int i8 = C3432.f10845;
        int i9 = C5695.f17556;
        int iM6982 = (C2105.m6981("ܿۢ") + i9) * (-39);
        int i10 = ((iM6982 ^ i8) * (-3751)) ^ (-505530463);
        Resources resources = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = iM6982 ^ (-1023904671);
        C22202 c22202M49871 = null;
        int i12 = 0;
        int iM2568 = 0;
        int iM6983 = 0;
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
                    iM6983 = iM6983;
                    c22202M49871.setImageDrawable(C22597.m50571(resources, iM2568, getTheme()));
                    C4159.m12564(c22202M49871, this);
                    if (C1047.f3863 < 0) {
                        iM6981 = (C0630.m2566("ۘ᩸") ^ i9) * (-29);
                        i3 = ((iM6981 ^ i8) * (-14959)) ^ (-1428383046);
                        i4 = 1570482495;
                        i5 = iM6983;
                        i11 = iM6981 ^ i4;
                        i10 = i3;
                        iM6983 = i5;
                    }
                    sArr = sArr;
                    iM2566 = (C2105.m6981("᩸ܰ") + i8) * 3;
                    i = ((iM2566 ^ i9) * 3405) ^ (-1340881398);
                    i2 = -1409587259;
                    int i19 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i19;
                    iM6983 = i5;
                    break;
                case -1402052058:
                case -1084789096:
                    RunnableC3474.m10630();
                    C21923.m49329();
                    iM6983 = iM6983;
                    iM6981 = C0630.m2566("᩻ۗ") ^ i8;
                    i3 = ((iM6981 ^ i9) * 16635) ^ (-1193934118);
                    i4 = 1665804772;
                    i5 = iM6983;
                    i11 = iM6981 ^ i4;
                    i10 = i3;
                    iM6983 = i5;
                    break;
                case -1337193436:
                case -1262640283:
                    if (C0630.f2410 <= 0) {
                        int iM2569 = C0630.m2566("۬ᩴ") ^ i9;
                        i11 = iM2569 ^ (-1119551604);
                        i10 = ((iM2569 ^ i8) * q.h) ^ 1239041810;
                        intentFilter = null;
                    } else {
                        iM2567 = (i9 - C0630.m2566("᩶᩷")) * 115;
                        i6 = ((iM2567 ^ i8) * (-12947)) ^ (-1280338372);
                        i7 = 573129796;
                        i11 = iM2567 ^ i7;
                        i10 = i6;
                    }
                    break;
                case -1255960067:
                case -1172310644:
                    iM6983 = iM6983;
                    sArr = sArr;
                    if (((s * s) + 212372329) - (s * s2) < 0) {
                        iM2566 = C2105.m6981("᩺ۛ") ^ i9;
                        i = ((iM2566 ^ i8) * (-16205)) ^ (-2088192566);
                        i2 = -1597258189;
                    } else {
                        iM2566 = C0630.m2566("ܿ֫") ^ i9;
                        i = ((iM2566 ^ i8) * (-3327)) ^ 1830676972;
                        i2 = -760073917;
                    }
                    int i110 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i110;
                    iM6983 = i5;
                    break;
                case -1181312796:
                case 1399196097:
                    C4925.m14311(this.f38965, intentFilter);
                    this.f38968 = new BinderC3141(this);
                    break;
                case -931942199:
                case 1152020323:
                    iM6983 = iM6983;
                    super.onCreate();
                    setTheme(C18080.m42142());
                    sArr = f38964;
                    if (RunnableC1108.m3790()) {
                        iM6981 = C0630.m2566("᩻ۗ") ^ i8;
                        i3 = ((iM6981 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                    } else {
                        iM6981 = (i8 - C2105.m6981("֫ۙ")) * 123;
                        i3 = ((iM6981 ^ i9) * 14355) ^ 24853595;
                        i4 = 1440592381;
                    }
                    i5 = iM6983;
                    i11 = iM6981 ^ i4;
                    i10 = i3;
                    iM6983 = i5;
                    break;
                case -743089668:
                case 539666767:
                    iM6983 = iM6983;
                    sArr = sArr;
                    c22202M49871 = C22202.m49871(this, C5695.m16034(sArr, i15, i16, i14));
                    resources = getResources();
                    sArr2 = f38964;
                    i17 = 5;
                    if (C1916.f6442) {
                        iM2566 = (C2105.m6981("ۤܿ") ^ i9) * 71;
                        i = ((iM2566 ^ i8) * (-13121)) ^ (-1179946861);
                        i2 = 1295579786;
                    } else {
                        iM2566 = (C2105.m6981("᩸ܰ") + i8) * 3;
                        i = ((iM2566 ^ i9) * 3405) ^ (-1340881398);
                        i2 = -1409587259;
                    }
                    int i111 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i111;
                    iM6983 = i5;
                    break;
                case -698529424:
                case 425424027:
                    C11340.m28031();
                    break;
                case -609216377:
                case 1065744216:
                    i14 = 13610;
                    iM2566 = (C2105.m6981("۬ۧ") ^ i8) * (-45);
                    i = ((iM2566 ^ i9) * 11245) ^ 465139148;
                    i2 = -484977760;
                    int i112 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i112;
                    iM6983 = i5;
                    break;
                case -494216214:
                case -8344629:
                    if (C0964.f3626 == 0) {
                        iM2567 = (i9 - C0630.m2566("᩶᩷")) * 115;
                        i6 = ((iM2567 ^ i8) * (-12947)) ^ (-1280338372);
                        i7 = 573129796;
                        i11 = iM2567 ^ i7;
                        i10 = i6;
                    } else {
                        iM6983 = iM6983;
                        iM6981 = C0630.m2566("᩻ۗ") ^ i8;
                        i3 = ((iM6981 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                        i5 = iM6983;
                        i11 = iM6981 ^ i4;
                        i10 = i3;
                        iM6983 = i5;
                    }
                    break;
                case -111834918:
                case 464512066:
                    c22202M49871.setId(2100949060 ^ iM6983);
                    if (C11340.f33930 < 0) {
                        iM6983 = iM6983;
                        intentFilter = new IntentFilter(RunnableC1937.m6385(f38964, 11, 32, i14));
                        if (!C1711.f5919) {
                            iM6981 = C2105.m6981("۟ܳ") ^ i8;
                            i3 = ((iM6981 ^ i9) * 5423) ^ (-239842080);
                            i4 = -428699939;
                            i5 = iM6983;
                            i11 = iM6981 ^ i4;
                            i10 = i3;
                            iM6983 = i5;
                        }
                        sArr = sArr;
                        iM2566 = (C2105.m6981("᩸ܰ") + i8) * 3;
                        i = ((iM2566 ^ i9) * 3405) ^ (-1340881398);
                        i2 = -1409587259;
                        int i113 = iM2566 ^ i2;
                        sArr = sArr;
                        i10 = i;
                        i5 = iM6983;
                        i11 = i113;
                        iM6983 = i5;
                    } else {
                        int iM25610 = C0630.m2566("۬ᩴ") ^ i9;
                        i11 = iM25610 ^ (-1119551604);
                        i10 = ((iM25610 ^ i8) * q.h) ^ 1239041810;
                        intentFilter = null;
                    }
                    break;
                case 284423642:
                case 1349725907:
                    C1916.m6308();
                    if (!C1005.m3501()) {
                        iM6983 = iM6983;
                        sArr = sArr;
                        iM2566 = C2105.m6981("۫۫") ^ i8;
                        i = ((iM2566 ^ i9) * (-12735)) ^ 2006020094;
                        i2 = 1251224963;
                        int i114 = iM2566 ^ i2;
                        sArr = sArr;
                        i10 = i;
                        i5 = iM6983;
                        i11 = i114;
                        iM6983 = i5;
                    }
                    iM6983 = iM6983;
                    iM6981 = C0630.m2566("᩻ۗ") ^ i8;
                    i3 = ((iM6981 ^ i9) * 16635) ^ (-1193934118);
                    i4 = 1665804772;
                    i5 = iM6983;
                    i11 = iM6981 ^ i4;
                    i10 = i3;
                    iM6983 = i5;
                    break;
                case 345276540:
                case 1757362187:
                    iM6983 = C2105.m6981(C4616.m13542(sArr3, i12, i13, i14));
                    if (C1711.f5919) {
                        iM2567 = (i9 - C0630.m2566("᩶᩷")) * 115;
                        i6 = ((iM2567 ^ i8) * (-12947)) ^ (-1280338372);
                        i7 = 573129796;
                    } else {
                        iM2567 = (C0630.m2566("ۘ᩶") ^ i9) * 11;
                        i6 = ((iM2567 ^ i8) * (-10003)) ^ 984703287;
                        i7 = -936351111;
                    }
                    i11 = iM2567 ^ i7;
                    i10 = i6;
                    break;
                case 512670123:
                case 591378584:
                    iM6983 = iM6983;
                    sArr = sArr;
                    s = f38964[0];
                    s2 = 29146;
                    if (C3537.m10746() <= 0) {
                        iM2566 = C2105.m6981("۫۫") ^ i8;
                        i = ((iM2566 ^ i9) * (-12735)) ^ 2006020094;
                        i2 = 1251224963;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩶") ^ i8;
                        i = ((iM2566 ^ i9) * (-14557)) ^ 770485910;
                        i2 = 3619527;
                    }
                    int i115 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i115;
                    iM6983 = i5;
                    break;
                case 768271101:
                case 2100700986:
                    iM6983 = iM6983;
                    this.f38966 = c22202M49871;
                    sArr3 = f38964;
                    i12 = 8;
                    i13 = 3;
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("᩻ۗ") ^ i8;
                        i3 = ((iM6981 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩸") ^ i8;
                        i3 = ((iM6981 ^ i9) * 29735) ^ (-124252351);
                        i4 = -1585437967;
                    }
                    i5 = iM6983;
                    i11 = iM6981 ^ i4;
                    i10 = i3;
                    iM6983 = i5;
                    break;
                case 1076015925:
                case 1308614085:
                    i14 = 31884;
                    iM2566 = (C2105.m6981("۬ۧ") ^ i8) * (-45);
                    i = ((iM2566 ^ i9) * 11245) ^ 465139148;
                    i2 = -484977760;
                    int i116 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i116;
                    iM6983 = i5;
                    break;
                case 1437443075:
                case 1691577299:
                    iM6983 = iM6983;
                    sArr = sArr;
                    i15 = 1;
                    i16 = 4;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("᩸ܰ") + i8) * 3;
                        i = ((iM2566 ^ i9) * 3405) ^ (-1340881398);
                        i2 = -1409587259;
                    } else {
                        iM2566 = C2105.m6981("᩷ۡ") ^ i9;
                        i = ((iM2566 ^ i8) * (-11015)) ^ (-540367042);
                        i2 = 1048658657;
                    }
                    int i117 = iM2566 ^ i2;
                    sArr = sArr;
                    i10 = i;
                    i5 = iM6983;
                    i11 = i117;
                    iM6983 = i5;
                    break;
                default:
                    iM6983 = iM6983;
                    iM2568 = 2121795158 ^ C0630.m2566(C3432.m10488(sArr2, i17, 3, i14));
                    if (AbstractC2021.f6743 <= 0) {
                        iM6981 = C0630.m2566("᩻ۗ") ^ i8;
                        i3 = ((iM6981 ^ i9) * 16635) ^ (-1193934118);
                        i4 = 1665804772;
                    } else {
                        iM6981 = C0630.m2566("ۜܶ") ^ i8;
                        i3 = ((iM6981 ^ i9) * (-16325)) ^ (-1043169256);
                        i4 = -2088589977;
                    }
                    i5 = iM6983;
                    i11 = iM6981 ^ i4;
                    i10 = i3;
                    iM6983 = i5;
                    break;
            }
            return;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f38968;
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
        int i8 = C3537.f11231;
        int i9 = C1128.f4106;
        int iM6981 = (C2105.m6981("᩹۟") + i8) * 57;
        int i10 = ((iM6981 ^ i9) * 28177) ^ 2099884774;
        int i11 = 1428306775;
        while (true) {
            i7 = ((((i7 ^ i9) * (-17623)) >> 31) & i10) ^ (iM6981 ^ i11);
            switch (i7) {
                case -2051366202:
                case -1800242757:
                    i4 = 54698;
                    iM6981 = (C2105.m6981("ۚᩳ") + i9) * (-111);
                    i10 = ((iM6981 ^ i8) * (-4969)) ^ (-89854624);
                    i11 = 1779073181;
                    break;
                case -1996021912:
                case -1137081385:
                    this.f38966.show();
                    iM6981 = (C0630.m2566("ۛ۬") + i9) * (-29);
                    i10 = ((iM6981 ^ i8) * (-3513)) ^ (-45471754);
                    i11 = 1679400253;
                    break;
                case -1722430121:
                case -1344282829:
                    if (C2105.f7037 != 0) {
                        iM6981 = (i8 - C2105.m6981("ۜ᩸")) * (-83);
                        i10 = ((iM6981 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    } else {
                        iM6981 = C0630.m2566("᩺ۖ") ^ i8;
                        i10 = ((iM6981 ^ i9) * (-24213)) ^ 840942710;
                        i11 = -1561109449;
                    }
                    break;
                case -1691020021:
                case -949822114:
                    if (C7106.f21815 != 0) {
                        iM6981 = (i8 - C2105.m6981("ۜ᩸")) * (-83);
                        i10 = ((iM6981 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    } else {
                        iM6981 = C2105.m6981("ᩳۢ") ^ i8;
                        i10 = ((iM6981 ^ i9) * (-599)) ^ (-1070242560);
                        i11 = -727611070;
                    }
                    break;
                case -1595727524:
                case 917018068:
                    if (i3 - (36556 * s) >= 0) {
                        iM6981 = (C0630.m2566("᩺۬") + i8) * 13;
                        i10 = ((iM6981 ^ i9) * (-559)) ^ (-1902127665);
                        i11 = 515137374;
                    } else {
                        iM6981 = (C2105.m6981("ۛ᩸") + i8) * (-73);
                        i10 = ((iM6981 ^ i9) * 9529) ^ 1717874044;
                        i11 = -1522196102;
                    }
                    break;
                case -1422486890:
                case -544163635:
                    if (this.f38966.m49879()) {
                        iM6981 = C2105.m6981("ۜ᩻") ^ i9;
                        i10 = ((iM6981 ^ i8) * 8035) ^ (-1264519416);
                        i11 = -1262654720;
                    } else {
                        iM6981 = C2105.m6981("ܰۢ") ^ i8;
                        i10 = ((iM6981 ^ i9) * 7327) ^ (-1926911927);
                        i11 = -1565333463;
                    }
                    break;
                case -1298911594:
                case -151430090:
                    s = f38964[43];
                    if (C4616.f14690 <= 0) {
                        iM6981 = (C2105.m6981("ۡۗ") ^ i8) * 101;
                        i10 = ((iM6981 ^ i9) * (-123)) ^ 151214496;
                        i11 = -1977041328;
                    } else {
                        iM6981 = (i9 - C2105.m6981("ܶۙ")) * (-37);
                        i10 = ((iM6981 ^ i8) * (-5911)) ^ 944926824;
                        i11 = -202883962;
                    }
                    break;
                case -1277138151:
                case -272023244:
                    if (C3432.f10845 >= 0) {
                        iM6981 = (C0630.m2566("᩷֨") ^ i8) * 77;
                        i10 = ((iM6981 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    } else {
                        iM6981 = (i8 - C2105.m6981("ۜ᩸")) * (-83);
                        i10 = ((iM6981 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    }
                    break;
                case -1271549497:
                case 1827397558:
                    return 2;
                case -1204029294:
                case -1036404199:
                    i4 = 18311;
                    iM6981 = (C2105.m6981("ۚᩳ") + i9) * (-111);
                    i10 = ((iM6981 ^ i8) * (-4969)) ^ (-89854624);
                    i11 = 1779073181;
                    break;
                case -1166724566:
                case 470199100:
                    if (this.f38967 != null) {
                        iM6981 = C2105.m6981("ۧۤ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-16323)) ^ 960674808;
                        i11 = -686529576;
                    } else {
                        iM6981 = C0630.m2566("֨ᩴ") ^ i9;
                        i10 = ((iM6981 ^ i8) * 29523) ^ (-557044609);
                        i11 = 710396726;
                    }
                    break;
                case -783278073:
                case 584254770:
                    stopSelf();
                    iM6981 = (C0630.m2566("ۛ۬") + i9) * (-29);
                    i10 = ((iM6981 ^ i8) * (-3513)) ^ (-45471754);
                    i11 = 1679400253;
                    break;
                case -748654468:
                case 920916193:
                    int i12 = s + 9139;
                    i3 = i12 * i12;
                    if (C1294.m4372() <= 0) {
                        iM6981 = (i8 - C2105.m6981("ۜ᩸")) * (-83);
                        i10 = ((iM6981 ^ i9) * (-14597)) ^ (-1200482818);
                        i11 = -376317190;
                    } else {
                        iM6981 = (C0630.m2566("ۖۖ") + i9) * 57;
                        i10 = ((iM6981 ^ i8) * 2715) ^ (-439116354);
                        i11 = 1165316372;
                    }
                    break;
                case -718754320:
                case 689001162:
                    this.f38967 = f38963;
                    f38963 = null;
                    iM6981 = (C2105.m6981("۫ۨ") + i9) * 91;
                    i10 = ((iM6981 ^ i8) * (-24817)) ^ (-967681931);
                    i11 = -1119336947;
                    break;
                case -512606778:
                case 2079694642:
                    AbstractC2021.m6574();
                    RunnableC0588.m2441();
                    iM6981 = (i8 - C2105.m6981("ۜ᩸")) * (-83);
                    i10 = ((iM6981 ^ i9) * (-14597)) ^ (-1200482818);
                    i11 = -376317190;
                    break;
                case -438728264:
                case -388017940:
                    C1005.m3501();
                    return 0;
                case -436436743:
                case -406206969:
                    if (C4117.f13076 <= 0) {
                        iM6981 = (C0630.m2566("᩷֨") ^ i8) * 77;
                        i10 = ((iM6981 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    } else {
                        iM6981 = (C2105.m6981("֫֫") ^ i9) * 63;
                        i10 = ((iM6981 ^ i8) * 16511) ^ (-1280761974);
                        i11 = -2114831857;
                    }
                    break;
                case -418672033:
                case 1064497643:
                    sArr = f38964;
                    i5 = 44;
                    i6 = 4;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM6981 = (C2105.m6981("ۡۗ") ^ i8) * 101;
                        i10 = ((iM6981 ^ i9) * (-123)) ^ 151214496;
                        i11 = -1977041328;
                    } else {
                        iM6981 = C2105.m6981("᩹᩶") ^ i8;
                        i10 = ((iM6981 ^ i9) * 31311) ^ (-2054711098);
                        i11 = -1901586904;
                    }
                    break;
                case -126593763:
                case 1934191585:
                    if (C3746.f11829 <= 0) {
                        iM6981 = (C0630.m2566("᩷֨") ^ i8) * 77;
                        i10 = ((iM6981 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    } else {
                        iM6981 = C2105.m6981("ܿ۬") ^ i9;
                        i10 = ((iM6981 ^ i8) * 21253) ^ 233419038;
                        i11 = -806994661;
                    }
                    break;
                case 11012003:
                case 1596501963:
                    if (C7106.f21815 != 0) {
                        iM6981 = (i9 - C2105.m6981("ۛ᩻")) * 91;
                        i10 = ((iM6981 ^ i8) * 25309) ^ 172372474;
                        i11 = 1557653462;
                    } else {
                        iM6981 = C0630.m2566("᩷ܰ") ^ i9;
                        i10 = ((iM6981 ^ i8) * 31625) ^ 1276442290;
                        i11 = 507909907;
                    }
                    break;
                case 85704647:
                case 1783922194:
                    if (C2272.f7362) {
                        iM6981 = (i9 - C2105.m6981("ۛ᩻")) * 91;
                        i10 = ((iM6981 ^ i8) * 25309) ^ 172372474;
                        i11 = 1557653462;
                    } else {
                        iM6981 = C0630.m2566("ۧ֫") ^ i8;
                        i10 = ((iM6981 ^ i9) * (-7151)) ^ (-170523922);
                        i11 = -787361715;
                    }
                    break;
                case 289074216:
                case 879200796:
                    if (C22628.f73083 > 0) {
                        iM6981 = (i9 - C2105.m6981("ۛ᩻")) * 91;
                        i10 = ((iM6981 ^ i8) * 25309) ^ 172372474;
                        i11 = 1557653462;
                    } else {
                        iM6981 = C2105.m6981("ᩳܶ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-3599)) ^ (-2103741764);
                        i11 = -414286369;
                    }
                    break;
                case 302389502:
                case 1515071694:
                    C2958.m9034();
                    if (C1294.f4556 < 0) {
                        iM6981 = C2105.m6981("ᩳܶ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-3599)) ^ (-2103741764);
                        i11 = -414286369;
                    } else {
                        iM6981 = (C0630.m2566("᩷֨") ^ i8) * 77;
                        i10 = ((iM6981 ^ i9) * 18875) ^ 2024244665;
                        i11 = 1861731949;
                    }
                    break;
                case 381758274:
                case 2041670275:
                    if (C3245.m9925() != 0) {
                        iM6981 = C2105.m6981("ᩳܶ") ^ i9;
                        i10 = ((iM6981 ^ i8) * (-3599)) ^ (-2103741764);
                        i11 = -414286369;
                    } else {
                        iM6981 = (C2105.m6981("۟᩺") ^ i8) * q.h;
                        i10 = ((iM6981 ^ i9) * 11969) ^ (-1787422651);
                        i11 = -715669381;
                    }
                    break;
                case 1303021128:
                case 1930101201:
                    this.f38966.m49878();
                    iM6981 = (C0630.m2566("ۛ۬") + i9) * (-29);
                    i10 = ((iM6981 ^ i8) * (-3513)) ^ (-45471754);
                    i11 = 1679400253;
                    break;
                case 1595037055:
                case 1820278440:
                    if (intent.getBooleanExtra(C0630.m2575(sArr, i5, i6, i4), false)) {
                        iM6981 = C2105.m6981("۫ۗ") ^ i8;
                        i10 = ((iM6981 ^ i9) * 7341) ^ 1852919308;
                        i11 = -123173940;
                    } else {
                        iM6981 = (C2105.m6981("۫ۨ") + i9) * 91;
                        i10 = ((iM6981 ^ i8) * (-24817)) ^ (-967681931);
                        i11 = -1119336947;
                    }
                    break;
                default:
                    if (intent != null) {
                        iM6981 = (i8 - C2105.m6981("ۢ᩻")) * (-71);
                        i10 = ((iM6981 ^ i9) * (-32167)) ^ 261793037;
                        i11 = 855346934;
                    } else {
                        iM6981 = (C2105.m6981("۫ۨ") + i9) * 91;
                        i10 = ((iM6981 ^ i8) * (-24817)) ^ (-967681931);
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
        int i2 = C1294.f4556;
        int i3 = C1420.f5096;
        int iM6981 = C2105.m6981("᩶᩸") ^ i3;
        int i4 = ((iM6981 ^ i2) * (-10327)) ^ (-1978520531);
        int i5 = 625690685;
        while (true) {
            i = ((((i ^ i2) * 31383) >> 31) & i4) ^ (iM6981 ^ i5);
            switch (i) {
                case -2042673141:
                case -128724401:
                    this.f38966.m49880();
                    if (C1047.f3863 >= 0) {
                        iM6981 = C0630.m2566("ۙ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14563)) ^ (-601483031);
                        i5 = 273484186;
                    } else {
                        iM6981 = (C0630.m2566("᩵᩷") + i2) * 99;
                        i4 = ((iM6981 ^ i3) * 6413) ^ (-777772001);
                        i5 = 1722413582;
                    }
                    break;
                case -2007696602:
                case 1713646989:
                    if (C1005.f3721) {
                        iM6981 = C2105.m6981("ۙۗ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 10249) ^ (-1453586981);
                        i5 = 458239470;
                    } else {
                        iM6981 = C2105.m6981("֫۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10001)) ^ (-236840353);
                        i5 = -1978380963;
                    }
                    break;
                case -1570384215:
                case -1269284645:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (i3 - C0630.m2566("ۖۛ")) * 39;
                        i4 = ((iM6981 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ۖۖ")) * 99;
                        i4 = ((iM6981 ^ i2) * (-28957)) ^ (-1473180368);
                        i5 = 1155066312;
                    }
                    break;
                case -1474370049:
                case 607464327:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۙ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14563)) ^ (-601483031);
                        i5 = 273484186;
                    } else {
                        iM6981 = (C0630.m2566("᩸᩹") ^ i2) * 13;
                        i4 = ((iM6981 ^ i3) * (-22993)) ^ (-1993403084);
                        i5 = -1591702712;
                    }
                    break;
                case -1337878077:
                case 1719852395:
                    super.onDestroy();
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۡۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18665) ^ (-986495594);
                        i5 = 2020673320;
                    } else {
                        iM6981 = C2105.m6981("۬ۤ") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-5025)) ^ 1208015730;
                        i5 = 636365665;
                    }
                    break;
                case -1292899515:
                case 1146114887:
                    C1005.m3501();
                    ServiceConnectionC3453.m10564();
                    break;
                case -1045551531:
                case 1002111131:
                    C0422.m1963();
                    C0237.m1481();
                    iM6981 = C0630.m2566("ܳ᩷") ^ i2;
                    i4 = ((iM6981 ^ i3) * 22431) ^ (-611282489);
                    i5 = 501720266;
                    break;
                case -885432953:
                case 789590294:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C2105.m6981("֫۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10001)) ^ (-236840353);
                        i5 = -1978380963;
                    } else {
                        iM6981 = (C2105.m6981("۟۠") + i2) * 47;
                        i4 = ((iM6981 ^ i3) * 2909) ^ (-902832932);
                        i5 = 276309823;
                    }
                    break;
                case -687068855:
                case 538945761:
                    C4925.m14310(this.f38965);
                    break;
                case -559478109:
                case 869520717:
                    if (!C0798.f2919) {
                        iM6981 = C0630.m2566("ۡۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18665) ^ (-986495594);
                        i5 = 2020673320;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22431) ^ (-611282489);
                        i5 = 501720266;
                    }
                    break;
                case -121125128:
                case 1401358633:
                    C3019.m9255();
                    if (C3432.f10845 < 0) {
                        iM6981 = C2105.m6981("֫۟") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-10001)) ^ (-236840353);
                        i5 = -1978380963;
                    } else {
                        iM6981 = (i3 - C0630.m2566("ۖۛ")) * 39;
                        i4 = ((iM6981 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    }
                    break;
                case 42586164:
                case 1119562858:
                    if (C4075.f12947 >= 0) {
                        iM6981 = C0630.m2566("ۡۨ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 18665) ^ (-986495594);
                        i5 = 2020673320;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۬ۛ")) * (-55);
                        i4 = ((iM6981 ^ i2) * 24539) ^ (-587250157);
                        i5 = -1532806262;
                    }
                    break;
                case 622611938:
                case 1129689752:
                    if (C22628.m50615() == 0) {
                        iM6981 = (i3 - C0630.m2566("ۖۛ")) * 39;
                        i4 = ((iM6981 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22431) ^ (-611282489);
                        i5 = 501720266;
                    }
                    break;
                case 851048203:
                case 1108685559:
                    str = null;
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ܳ᩷") ^ i2;
                        i4 = ((iM6981 ^ i3) * 22431) ^ (-611282489);
                        i5 = 501720266;
                    } else {
                        iM6981 = (C2105.m6981("۫ۛ") ^ i3) * q.h;
                        i4 = ((iM6981 ^ i2) * (-2525)) ^ 1479822156;
                        i5 = 1184363420;
                    }
                    break;
                case 1927700641:
                case 1942403124:
                    if (C21923.f70183 != 0) {
                        iM6981 = (i3 - C0630.m2566("ۖۛ")) * 39;
                        i4 = ((iM6981 ^ i2) * (-8269)) ^ (-841587288);
                        i5 = 1612040900;
                    } else {
                        iM6981 = C2105.m6981("۟ۜ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 24763) ^ 2058631150;
                        i5 = 118917129;
                    }
                    break;
                default:
                    f38961 = str;
                    if (C0237.f1507 != 0) {
                        iM6981 = C0630.m2566("ۙ۠") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-14563)) ^ (-601483031);
                        i5 = 273484186;
                    } else {
                        iM6981 = (C0630.m2566("᩸֡") ^ i3) * (-81);
                        i4 = ((iM6981 ^ i2) * 9299) ^ 819264652;
                        i5 = 186702648;
                    }
                    break;
            }
            return;
        }
    }
}
