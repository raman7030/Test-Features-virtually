package p067l;

import android.app.Activity;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.᩹ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes.dex */
public final class C23494 extends AbstractC16864 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ byte[] f74843;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C5389 f74844;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23494(C5389 c5389, AbstractActivityC5549 abstractActivityC5549, byte[] bArr) {
        super(abstractActivityC5549);
        this.f74844 = c5389;
        this.f74843 = bArr;
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        if (!C24414.m53850()) {
            C22682.m50793(R.string.MT_Protector);
            return false;
        }
        final String string = m38415(0).getText().toString();
        final String string2 = m38415(1).getText().toString();
        final String string3 = m38415(2).getText().toString();
        if (string.isEmpty()) {
            m38415(0).requestFocus();
            return false;
        }
        if (string2.isEmpty()) {
            m38415(1).requestFocus();
            return false;
        }
        if (string3.isEmpty()) {
            m38415(2).requestFocus();
            return false;
        }
        final byte[] bArr = this.f74843;
        if (bArr.length < 4) {
            C22682.m50799(R.string.MT_Protector);
            return false;
        }
        C5389 c5389 = this.f74844;
        C14853 c14853 = new C14853(c5389.f12789, R.string.MT_Protector);
        c14853.m33956();
        final AbstractActivityC5549 abstractActivityC5549 = c5389.f12789;
        final C22824 c22824 = new C22824(this, c14853, string, string2, string3);
        if (bArr.length > 102400 || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            c22824.mo3843(new C25065(2));
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
                int iM55979;
                int i;
                int i2 = -508398235;
                int i3 = C0863.f81833;
                int i4 = C0912.f81867;
                int iM55680 = C0873.m55680("۠ۤ") ^ i4;
                int i5 = ((iM55680 ^ i3) * 22271) ^ 824471624;
                int i6 = iM55680 ^ (-809593733);
                Activity activity = null;
                InterfaceC11360 interfaceC11360 = null;
                byte[] bArr2 = null;
                String str = null;
                String str2 = null;
                while (true) {
                    i2 = i6 ^ ((((i2 ^ i3) * 25939) >> 31) & i5);
                    switch (i2) {
                        case -1938517013:
                        case 1316807116:
                            activity = abstractActivityC5549;
                            if (ViewOnClickListenerC0939.f81888 <= 0) {
                                iM55979 = C0873.m55680("ۤۘ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM55979 = C0946.m55979("ۛ۬") ^ i4;
                                i5 = ((iM55979 ^ i3) * (-3517)) ^ (-613440018);
                                i = -301364705;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case -1937223761:
                        case -1071656187:
                            InterfaceC11360 interfaceC11361 = c22824;
                            if (C1194.f82045 != 0) {
                                interfaceC11360 = interfaceC11361;
                                iM55979 = C0946.m55979("᩵᩶") ^ i3;
                                i5 = ((iM55979 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                                i6 = iM55979 ^ i;
                            } else {
                                int iM55681 = (C0873.m55680("᩻ܿ") + i3) * (-83);
                                i5 = ((iM55681 ^ i4) * (-16289)) ^ 274514219;
                                i6 = iM55681 ^ 1302139022;
                                interfaceC11360 = interfaceC11361;
                            }
                            break;
                        case -1762683408:
                        case -724064571:
                            if (C0873.m55678()) {
                                iM55979 = C0873.m55680("ۤۘ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM55979 = (i4 - C0873.m55680("᩵ۖ")) * 53;
                                i5 = ((iM55979 ^ i3) * 18061) ^ (-648825540);
                                i = -934548118;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case -1673101398:
                        case -1001506649:
                            C0894.m55769();
                            if (C0955.f81898) {
                                iM55979 = C0946.m55979("᩵᩶") ^ i3;
                                i5 = ((iM55979 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            } else {
                                iM55979 = C0873.m55680("֡ܽ") ^ i3;
                                i5 = ((iM55979 ^ i4) * 4851) ^ (-1242340895);
                                i = 354716112;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case -1663429535:
                        case 493064845:
                            C0949.m56012();
                            iM55979 = (i4 - C0873.m55680("᩻᩵")) * (-39);
                            i5 = ((iM55979 ^ i3) * 31427) ^ (-1893232926);
                            i = -1550454882;
                            i6 = iM55979 ^ i;
                            break;
                        case -1489905777:
                        case -489533969:
                            bArr2 = bArr;
                            if (C0861.f81831) {
                                iM55979 = C0873.m55680("۠֡") ^ i3;
                                i5 = ((iM55979 ^ i4) * 11145) ^ 161260281;
                                i = 1611840401;
                            } else {
                                iM55979 = C0873.m55680("ᩳܿ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 25153) ^ 1047536884;
                                i = -2021140449;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case -1300300649:
                        case 252464308:
                            C1025.m56230();
                            break;
                        case -743814849:
                        case 1963438529:
                            if (ServiceConnectionC1013.f81940 >= 0) {
                                iM55979 = C0946.m55979("᩵᩶") ^ i3;
                                i5 = ((iM55979 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            } else {
                                iM55979 = (i4 - C0946.m55979("᩷ۢ")) * (-57);
                                i5 = ((iM55979 ^ i3) * 24895) ^ (-632802576);
                                i = -1911707026;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case -630356377:
                        case 1916767110:
                            C0912.m55833();
                            if (C0873.f81841 <= 0) {
                                iM55979 = (i4 - C0873.m55680("᩻᩵")) * (-39);
                                i5 = ((iM55979 ^ i3) * 31427) ^ (-1893232926);
                                i = -1550454882;
                            } else {
                                iM55979 = C0946.m55979("᩵᩶") ^ i3;
                                i5 = ((iM55979 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case -40158489:
                        case 40805649:
                            if (C1028.f81950 <= 0) {
                                iM55979 = C0873.m55680("ۤۘ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM55979 = C0873.m55680("֨ۘ") ^ i3;
                                i5 = ((iM55979 ^ i4) * 30797) ^ 1349887839;
                                i = 1844200688;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case 231702381:
                        case 1838588263:
                            C0989.m56095();
                            if (C0863.f81833 > 0) {
                                iM55979 = C0946.m55979("᩵᩶") ^ i3;
                                i5 = ((iM55979 ^ i4) * (-24733)) ^ (-1963547408);
                                i = -2077091391;
                            } else {
                                iM55979 = C0873.m55680("ۤۘ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case 731191900:
                        case 2029593169:
                            str = string;
                            str2 = string2;
                            if (C0866.f81837 >= 0) {
                                iM55979 = C0873.m55680("ᩳܿ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 25153) ^ 1047536884;
                                i = -2021140449;
                            } else {
                                iM55979 = C0873.m55680("ۙۧ") ^ i4;
                                i5 = ((iM55979 ^ i3) * (-8299)) ^ (-592419827);
                                i = 261723721;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case 1050812170:
                        case 2096597962:
                            if (C1964.m56597() != 0) {
                                iM55979 = C0873.m55680("ۤۘ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM55979 = (C0946.m55979("ۡۨ") + i4) * (-31);
                                i5 = ((iM55979 ^ i3) * 20705) ^ 1365680431;
                                i = 1555781035;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        case 1280546547:
                        case 1346544169:
                            C4654.m9869(bArr2, str, str2, string3, activity, interfaceC11360);
                            break;
                        case 1719723473:
                        case 1866069987:
                            if (C0906.f81862 >= 0) {
                                iM55979 = (i4 - C0873.m55680("᩻᩵")) * (-39);
                                i5 = ((iM55979 ^ i3) * 31427) ^ (-1893232926);
                                i = -1550454882;
                            } else {
                                iM55979 = (C0873.m55680("᩵ۙ") ^ i3) * (-51);
                                i5 = ((iM55979 ^ i4) * (-9767)) ^ 783885197;
                                i = 923928587;
                            }
                            i6 = iM55979 ^ i;
                            break;
                        default:
                            if (C0955.f81898) {
                                iM55979 = C0873.m55680("ۤۘ") ^ i4;
                                i5 = ((iM55979 ^ i3) * 11391) ^ 1158011518;
                                i = 838175846;
                            } else {
                                iM55979 = C0873.m55680("ۧ֫") ^ i3;
                                i5 = ((iM55979 ^ i4) * 10087) ^ 1147920449;
                                i = -445603262;
                            }
                            i6 = iM55979 ^ i;
                            break;
                    }
                    return;
                }
            }

            {
                int i = -1281131563;
                int i2 = AbstractC0942.f81890;
                int i3 = C0930.f81879;
                int iM55979 = (i3 - C0946.m55979("᩶᩻")) * 115;
                int i4 = ((iM55979 ^ i2) * 11923) ^ (-1015039097);
                int i5 = 1511666929;
                while (true) {
                    i = ((((i ^ i2) * 23815) >> 31) & i4) ^ (iM55979 ^ i5);
                    switch (i) {
                        case -2082180086:
                        case 288195743:
                            C1124.m56367();
                            iM55979 = C0873.m55680("۫֨") ^ i2;
                            i4 = ((iM55979 ^ i3) * (-32263)) ^ (-1262797732);
                            i5 = 1566375609;
                            break;
                        case -1959354681:
                        case 1363561431:
                            if (C1024.f81946) {
                                iM55979 = C0873.m55680("᩶ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            } else {
                                iM55979 = (C0946.m55979("ۢ᩶") + i2) * 43;
                                i4 = ((iM55979 ^ i3) * 27997) ^ 1593972805;
                                i5 = -1981600263;
                            }
                            break;
                        case -1640295200:
                        case 998204056:
                            return;
                        case -1483953166:
                        case 2055694837:
                            if (RunnableC0938.f81886 >= 0) {
                                iM55979 = C0946.m55979("֨ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                iM55979 = (C0946.m55979("۫᩸") + i3) * (-23);
                                i4 = ((iM55979 ^ i2) * (-25177)) ^ (-667102880);
                                i5 = 445320039;
                            }
                            break;
                        case -1186211647:
                        case 697195760:
                            if (C0854.f81826 != 0) {
                                iM55979 = (C0873.m55680("ۗۗ") + i2) * 85;
                                i4 = ((iM55979 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            } else {
                                iM55979 = (i2 - C0946.m55979("ۙ۬")) * (-101);
                                i4 = ((iM55979 ^ i3) * 19617) ^ (-297784234);
                                i5 = 1144865463;
                            }
                            break;
                        case -1127398672:
                        case -20295390:
                            if (C0947.f81895) {
                                iM55979 = C0873.m55680("۫֨") ^ i2;
                                i4 = ((iM55979 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            } else {
                                iM55979 = (i3 - C0873.m55680("ۗۖ")) * (-29);
                                i4 = ((iM55979 ^ i2) * 15737) ^ (-1380021369);
                                i5 = -1658130795;
                            }
                            break;
                        case -980326644:
                        case 950997163:
                            C0892.m55749();
                            if (C1048.m56305() < 0) {
                                iM55979 = (C0873.m55680("ۗۗ") + i2) * 85;
                                i4 = ((iM55979 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            } else {
                                iM55979 = C0946.m55979("֨ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            }
                            break;
                        case -870243595:
                        case -561985436:
                            C0930.m55885();
                            if (RunnableC0938.f81886 >= 0) {
                                iM55979 = C0946.m55979("֨ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                iM55979 = C0873.m55680("۫֨") ^ i2;
                                i4 = ((iM55979 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            }
                            break;
                        case -697465092:
                        case 1284981300:
                            if (C0845.f81821 >= 0) {
                                iM55979 = (C0873.m55680("֫᩸") ^ i3) * 9;
                                i4 = ((iM55979 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                iM55979 = C0873.m55680("۠֫") ^ i2;
                                i4 = ((iM55979 ^ i3) * 22957) ^ 617189041;
                                i5 = 1889822027;
                            }
                            break;
                        case -205259181:
                        case 200715559:
                            C1017.m56187();
                            C0949.m56012();
                            throw new RuntimeException();
                        case 120409700:
                        case 434125310:
                            if (C0892.f81851) {
                                iM55979 = (C0873.m55680("᩷ᩴ") + i3) * 29;
                                i4 = ((iM55979 ^ i2) * 16619) ^ (-30660138);
                                i5 = 1088890685;
                            } else {
                                iM55979 = C0873.m55680("᩶ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            }
                            break;
                        case 161334033:
                        case 967986057:
                            if (ViewOnClickListenerC0939.m55941() >= 0) {
                                iM55979 = C0873.m55680("᩶ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 11769) ^ (-1855062737);
                                i5 = -349222841;
                            } else {
                                iM55979 = (i3 - C0946.m55979("᩵ܿ")) * (-115);
                                i4 = ((iM55979 ^ i2) * (-9661)) ^ (-1790273051);
                                i5 = -1671709700;
                            }
                            break;
                        case 349087947:
                        case 2012077140:
                            ViewOnClickListenerC0939.m55941();
                            if (C0949.f81897 < 0) {
                                iM55979 = (C0873.m55680("֫᩸") ^ i3) * 9;
                                i4 = ((iM55979 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                iM55979 = C0873.m55680("۫֨") ^ i2;
                                i4 = ((iM55979 ^ i3) * (-32263)) ^ (-1262797732);
                                i5 = 1566375609;
                            }
                            break;
                        case 614347886:
                        case 1449132372:
                            if (ServiceConnectionC1013.f81940 >= 0) {
                                iM55979 = C0946.m55979("֨ᩳ") ^ i3;
                                i4 = ((iM55979 ^ i2) * 20581) ^ (-22185623);
                                i5 = 980615414;
                            } else {
                                iM55979 = C0946.m55979("ۤ֫") ^ i3;
                                i4 = ((iM55979 ^ i2) * (-15459)) ^ 1552524920;
                                i5 = -797447277;
                            }
                            break;
                        case 638464003:
                        case 1002638548:
                            if (RunnableC1014.m56177()) {
                                iM55979 = (i2 - C0873.m55680("᩶ۗ")) * 15;
                                i4 = ((iM55979 ^ i3) * 20857) ^ (-719007950);
                                i5 = 1169027306;
                            } else {
                                iM55979 = (C0873.m55680("ۗۗ") + i2) * 85;
                                i4 = ((iM55979 ^ i3) * 30301) ^ (-1948020364);
                                i5 = 181104682;
                            }
                            break;
                        default:
                            if (C0854.f81826 != 0) {
                                iM55979 = (C0873.m55680("֫᩸") ^ i3) * 9;
                                i4 = ((iM55979 ^ i2) * (-12187)) ^ (-1553368219);
                                i5 = 659521209;
                            } else {
                                iM55979 = (C0946.m55979("ܿܽ") + i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                i4 = ((iM55979 ^ i3) * (-8639)) ^ (-997800031);
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
