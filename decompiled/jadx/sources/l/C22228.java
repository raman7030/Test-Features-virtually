package l;

import android.app.Activity;
import android.text.TextUtils;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩹ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes.dex */
public final class C22228 extends AbstractC15252 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f72123;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3178 f72124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22228(C3178 c3178, AbstractActivityC3346 abstractActivityC3346, byte[] bArr) {
        super(abstractActivityC3346);
        this.f72124 = c3178;
        this.f72123 = bArr;
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4060() {
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector);
            return false;
        }
        final String string = m36254(0).getText().toString();
        final String string2 = m36254(1).getText().toString();
        final String string3 = m36254(2).getText().toString();
        if (string.isEmpty()) {
            m36254(0).requestFocus();
            return false;
        }
        if (string2.isEmpty()) {
            m36254(1).requestFocus();
            return false;
        }
        if (string3.isEmpty()) {
            m36254(2).requestFocus();
            return false;
        }
        final byte[] bArr = this.f72123;
        if (bArr.length < 4) {
            C21374.m48463(R.string.MT_Protector);
            return false;
        }
        C3178 c3178 = this.f72124;
        C13136 c13136 = new C13136(c3178.f9989, R.string.MT_Protector);
        c13136.m31864();
        final AbstractActivityC3346 abstractActivityC3346 = c3178.f9989;
        final C21523 c21523 = new C21523(this, c13136, string, string2, string3);
        if (bArr.length > 102400 || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            c21523.mo1430(new C23881(2));
            return false;
        }
        new Thread(new Runnable() { // from class: l.֡֨ۡ
            /* JADX WARN: Code duplicated, block: B:29:0x009c A[PHI: r11 r12 r13
              0x009c: PHI (r11v5 byte[]) = (r11v4 byte[]), (r11v3 byte[]) binds: [B:28:0x009a, B:24:0x007e] A[DONT_GENERATE, DONT_INLINE]
              0x009c: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v3 java.lang.String) binds: [B:28:0x009a, B:24:0x007e] A[DONT_GENERATE, DONT_INLINE]
              0x009c: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v3 java.lang.String) binds: [B:28:0x009a, B:24:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:45:0x012e  */
            /* JADX WARN: Code duplicated, block: B:49:0x0161 A[PHI: r16
              0x0161: PHI (r16v3 l.ۢ۠ۡ) = (r16v1 l.ۢ۠ۡ), (r16v1 l.ۢ۠ۡ), (r16v1 l.ۢ۠ۡ), (r16v1 l.ۢ۠ۡ), (r16v5 l.ۢ۠ۡ) binds: [B:48:0x015f, B:16:0x0065, B:13:0x005c, B:9:0x003e, B:33:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:58:0x01c0 A[PHI: r15
              0x01c0: PHI (r15v3 android.app.Activity) = 
              (r15v2 android.app.Activity)
              (r15v1 android.app.Activity)
              (r15v1 android.app.Activity)
              (r15v1 android.app.Activity)
              (r15v1 android.app.Activity)
              (r15v1 android.app.Activity)
             binds: [B:57:0x01be, B:52:0x018f, B:40:0x010f, B:36:0x00ef, B:13:0x005c, B:6:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            public final void run() {
                int iM6981;
                int i;
                int i2 = -508398235;
                int i3 = C0422.f1886;
                int i4 = C1420.f5096;
                int iM2566 = C0630.m2566("۠ۤ") ^ i4;
                int i5 = ((iM2566 ^ i3) * 22271) ^ 824471624;
                int i6 = iM2566 ^ (-809593733);
                Activity activity = null;
                InterfaceC9461 interfaceC9461 = null;
                byte[] bArr2 = null;
                String str = null;
                String str2 = null;
                while (true) {
                    i2 = i6 ^ ((((i2 ^ i3) * 25939) >> 31) & i5);
                    switch (i2) {
                        case -1938517013:
                        case 1316807116:
                            activity = abstractActivityC3346;
                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                iM6981 = C0630.m2566("ۤۘ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM6981 = C2105.m6981("ۛ۬") ^ i4;
                                i5 = ((iM6981 ^ i3) * (-3517)) ^ (-613440018);
                                i = -301364705;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case -1937223761:
                        case -1071656187:
                            InterfaceC9461 interfaceC9462 = c21523;
                            if (C7106.f21815 != 0) {
                                interfaceC9461 = interfaceC9462;
                                iM6981 = C2105.m6981("᩵᩶") ^ i3;
                                i5 = ((iM6981 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                                i6 = iM6981 ^ i;
                            } else {
                                int iM2567 = (C0630.m2566("᩻ܿ") + i3) * (-83);
                                i5 = ((iM2567 ^ i4) * (-16289)) ^ 274514219;
                                i6 = iM2567 ^ 1302139022;
                                interfaceC9461 = interfaceC9462;
                            }
                            break;
                        case -1762683408:
                        case -724064571:
                            if (C0630.m2564()) {
                                iM6981 = C0630.m2566("ۤۘ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM6981 = (i4 - C0630.m2566("᩵ۖ")) * 53;
                                i5 = ((iM6981 ^ i3) * 18061) ^ (-648825540);
                                i = -934548118;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case -1673101398:
                        case -1001506649:
                            C1047.m3599();
                            if (C2272.f7362) {
                                iM6981 = C2105.m6981("᩵᩶") ^ i3;
                                i5 = ((iM6981 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            } else {
                                iM6981 = C0630.m2566("֡ܽ") ^ i3;
                                i5 = ((iM6981 ^ i4) * 4851) ^ (-1242340895);
                                i = 354716112;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case -1663429535:
                        case 493064845:
                            C2167.m7155();
                            iM6981 = (i4 - C0630.m2566("᩻᩵")) * (-39);
                            i5 = ((iM6981 ^ i3) * 31427) ^ (-1893232926);
                            i = -1550454882;
                            i6 = iM6981 ^ i;
                            break;
                        case -1489905777:
                        case -489533969:
                            bArr2 = bArr;
                            if (C0382.f1805) {
                                iM6981 = C0630.m2566("۠֡") ^ i3;
                                i5 = ((iM6981 ^ i4) * 11145) ^ 161260281;
                                i = 1611840401;
                            } else {
                                iM6981 = C0630.m2566("ᩳܿ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 25153) ^ 1047536884;
                                i = -2021140449;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case -1300300649:
                        case 252464308:
                            C3683.m11222();
                            break;
                        case -743814849:
                        case 1963438529:
                            if (ServiceConnectionC3453.f10921 >= 0) {
                                iM6981 = C2105.m6981("᩵᩶") ^ i3;
                                i5 = ((iM6981 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            } else {
                                iM6981 = (i4 - C2105.m6981("᩷ۢ")) * (-57);
                                i5 = ((iM6981 ^ i3) * 24895) ^ (-632802576);
                                i = -1911707026;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case -630356377:
                        case 1916767110:
                            C1420.m4913();
                            if (C0630.f2410 <= 0) {
                                iM6981 = (i4 - C0630.m2566("᩻᩵")) * (-39);
                                i5 = ((iM6981 ^ i3) * 31427) ^ (-1893232926);
                                i = -1550454882;
                            } else {
                                iM6981 = C2105.m6981("᩵᩶") ^ i3;
                                i5 = ((iM6981 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case -40158489:
                        case 40805649:
                            if (C3746.f11829 <= 0) {
                                iM6981 = C0630.m2566("ۤۘ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM6981 = C0630.m2566("֨ۘ") ^ i3;
                                i5 = ((iM6981 ^ i4) * 30797) ^ 1349887839;
                                i = 1844200688;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case 231702381:
                        case 1838588263:
                            C2958.m9034();
                            if (C0422.f1886 > 0) {
                                iM6981 = C2105.m6981("᩵᩶") ^ i3;
                                i5 = ((iM6981 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            } else {
                                iM6981 = C0630.m2566("ۤۘ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case 731191900:
                        case 2029593169:
                            str = string;
                            str2 = string2;
                            if (C0483.f2088 >= 0) {
                                iM6981 = C0630.m2566("ᩳܿ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 25153) ^ 1047536884;
                                i = -2021140449;
                            } else {
                                iM6981 = C0630.m2566("ۙۧ") ^ i4;
                                i5 = ((iM6981 ^ i3) * (-8299)) ^ (-592419827);
                                i = 261723721;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case 1050812170:
                        case 2096597962:
                            if (C22628.m50615() != 0) {
                                iM6981 = C0630.m2566("ۤۘ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM6981 = (C2105.m6981("ۡۨ") + i4) * (-31);
                                i5 = ((iM6981 ^ i3) * 20705) ^ 1365680431;
                                i = 1555781035;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        case 1280546547:
                        case 1346544169:
                            C2405.m7806(bArr2, str, str2, string3, activity, interfaceC9461);
                            break;
                        case 1719723473:
                        case 1866069987:
                            if (C1294.f4556 >= 0) {
                                iM6981 = (i4 - C0630.m2566("᩻᩵")) * (-39);
                                i5 = ((iM6981 ^ i3) * 31427) ^ (-1893232926);
                                i = -1550454882;
                            } else {
                                iM6981 = (C0630.m2566("᩵ۙ") ^ i3) * (-51);
                                i5 = ((iM6981 ^ i4) * (-9767)) ^ 783885197;
                                i = 923928587;
                            }
                            i6 = iM6981 ^ i;
                            break;
                        default:
                            if (C2272.f7362) {
                                iM6981 = C0630.m2566("ۤۘ") ^ i4;
                                i5 = ((iM6981 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM6981 = C0630.m2566("ۧ֫") ^ i3;
                                i5 = ((iM6981 ^ i4) * 10087) ^ 1147920449;
                                i = -445603262;
                            }
                            i6 = iM6981 ^ i;
                            break;
                    }
                    return;
                }
            }

            {
                int i = -1281131563;
                int i2 = AbstractC2021.f6743;
                int i3 = C1773.f6144;
                int iM6981 = (i3 - C2105.m6981("᩶᩻")) * 115;
                int i4 = ((iM6981 ^ i2) * 11923) ^ (-1015039097);
                int i5 = 1511666929;
                while (true) {
                    i = ((((i ^ i2) * 23815) >> 31) & i4) ^ (iM6981 ^ i5);
                    switch (i) {
                        case -2082180086:
                        case 288195743:
                            C5695.m16023();
                            iM6981 = C0630.m2566("۫֨") ^ i2;
                            i4 = ((iM6981 ^ i3) * (-32263)) ^ (-1262797732);
                            i5 = 1566375609;
                            break;
                        case -1959354681:
                        case 1363561431:
                            if (C3663.f11553) {
                                iM6981 = C0630.m2566("᩶ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            } else {
                                iM6981 = (C2105.m6981("ۢ᩶") + i2) * 43;
                                i4 = ((iM6981 ^ i3) * 27997) ^ 1593972805;
                                i5 = -1981600263;
                            }
                            break;
                        case -1640295200:
                        case 998204056:
                            return;
                        case -1483953166:
                        case 2055694837:
                            if (RunnableC1937.f6483 >= 0) {
                                iM6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                iM6981 = (C2105.m6981("۫᩸") + i3) * (-23);
                                i4 = ((iM6981 ^ i2) * (-25177)) ^ (-667102880);
                                i5 = 445320039;
                            }
                            break;
                        case -1186211647:
                        case 697195760:
                            if (C0237.f1507 != 0) {
                                iM6981 = (C0630.m2566("ۗۗ") + i2) * 85;
                                i4 = ((iM6981 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            } else {
                                iM6981 = (i2 - C2105.m6981("ۙ۬")) * (-101);
                                i4 = ((iM6981 ^ i3) * 19617) ^ (-297784234);
                                i5 = 1144865463;
                            }
                            break;
                        case -1127398672:
                        case -20295390:
                            if (C2126.f7087) {
                                iM6981 = C0630.m2566("۫֨") ^ i2;
                                i4 = ((iM6981 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            } else {
                                iM6981 = (i3 - C0630.m2566("ۗۖ")) * (-29);
                                i4 = ((iM6981 ^ i2) * 15737) ^ (-1380021369);
                                i5 = -1658130795;
                            }
                            break;
                        case -980326644:
                        case 950997163:
                            C1005.m3501();
                            if (C4159.m12565() < 0) {
                                iM6981 = (C0630.m2566("ۗۗ") + i2) * 85;
                                i4 = ((iM6981 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            } else {
                                iM6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            }
                            break;
                        case -870243595:
                        case -561985436:
                            C1773.m5908();
                            if (RunnableC1937.f6483 >= 0) {
                                iM6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                iM6981 = C0630.m2566("۫֨") ^ i2;
                                i4 = ((iM6981 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            }
                            break;
                        case -697465092:
                        case 1284981300:
                            if (C0050.f910 >= 0) {
                                iM6981 = (C0630.m2566("֫᩸") ^ i3) * 9;
                                i4 = ((iM6981 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                iM6981 = C0630.m2566("۠֫") ^ i2;
                                i4 = ((iM6981 ^ i3) * 22957) ^ 617189041;
                                i5 = 1889822027;
                            }
                            break;
                        case -205259181:
                        case 200715559:
                            C3537.m10746();
                            C2167.m7155();
                            throw new RuntimeException();
                        case 120409700:
                        case 434125310:
                            if (C1005.f3721) {
                                iM6981 = (C0630.m2566("᩷ᩴ") + i3) * 29;
                                i4 = ((iM6981 ^ i2) * 16619) ^ (-30660138);
                                i5 = 1088890685;
                            } else {
                                iM6981 = C0630.m2566("᩶ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            }
                            break;
                        case 161334033:
                        case 967986057:
                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                iM6981 = C0630.m2566("᩶ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            } else {
                                iM6981 = (i3 - C2105.m6981("᩵ܿ")) * (-115);
                                i4 = ((iM6981 ^ i2) * (-9661)) ^ (-1790273051);
                                i5 = -1671709700;
                            }
                            break;
                        case 349087947:
                        case 2012077140:
                            ViewOnClickListenerC1958.m6429();
                            if (C2167.f7158 < 0) {
                                iM6981 = (C0630.m2566("֫᩸") ^ i3) * 9;
                                i4 = ((iM6981 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                iM6981 = C0630.m2566("۫֨") ^ i2;
                                i4 = ((iM6981 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            }
                            break;
                        case 614347886:
                        case 1449132372:
                            if (ServiceConnectionC3453.f10921 >= 0) {
                                iM6981 = C2105.m6981("֨ᩳ") ^ i3;
                                i4 = ((iM6981 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                iM6981 = C2105.m6981("ۤ֫") ^ i3;
                                i4 = ((iM6981 ^ i2) * (-15459)) ^ 1552524920;
                                i5 = -797447277;
                            }
                            break;
                        case 638464003:
                        case 1002638548:
                            if (RunnableC3474.m10630()) {
                                iM6981 = (i2 - C0630.m2566("᩶ۗ")) * 15;
                                i4 = ((iM6981 ^ i3) * 20857) ^ (-719007950);
                                i5 = 1169027306;
                            } else {
                                iM6981 = (C0630.m2566("ۗۗ") + i2) * 85;
                                i4 = ((iM6981 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            }
                            break;
                        default:
                            if (C0237.f1507 != 0) {
                                iM6981 = (C0630.m2566("֫᩸") ^ i3) * 9;
                                i4 = ((iM6981 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                iM6981 = (C2105.m6981("ܿܽ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                i4 = ((iM6981 ^ i3) * (-8639)) ^ (-997800031);
                                i5 = -1377138554;
                            }
                            break;
                    }
                }
            }
        }).start();
        return false;
    }
}
