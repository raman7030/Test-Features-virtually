package l;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Spinner;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC1723 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۜۘᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f5961 = {3616, 22750, 22729, 22751, 22723, 22745, 22750, 22735, 22729, 22751, 22658, 22733, 22750, 22751, 22735, 22759, 22766, 22753, 22766};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5962;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5963;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5964;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5965;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        if (l.C2126.f7087 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:
    
        if (l.RunnableC3474.f10992 <= 0) goto L22;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, final int i) {
        int i2;
        int iM6981;
        int i3;
        int i4;
        List list;
        C16560 c16560;
        int i5;
        int iM6982;
        int i6;
        int iM6983;
        int i7;
        int i8;
        Object obj = null;
        Object obj2 = null;
        C16560 c16561 = null;
        char c = 0;
        C10211[] c10211Arr = null;
        EditText editText = null;
        Spinner spinner = null;
        int selectedItemPosition = 0;
        short[] sArr = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = -961031763;
        int i12 = C5695.f17556;
        int i13 = C3245.f10203;
        int iM6984 = (C2105.m6981("᩺ۖ") ^ i12) * 31;
        int i14 = ((iM6984 ^ i13) * 12325) ^ 2108587354;
        int i15 = iM6984 ^ (-1529796688);
        InterfaceC13041 interfaceC13041 = null;
        StringBuilder sb = null;
        String strM10568 = null;
        C10211 c10211 = null;
        Object obj3 = null;
        char c2 = 0;
        int i16 = 0;
        C10211 c10212 = null;
        int i17 = 0;
        final InterfaceC17889 interfaceC17889 = null;
        List listAsList = null;
        final Main main = null;
        AbstractC16891 abstractC16891M7043 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 12787) >> 31));
            switch (i11) {
                case -2101650279:
                case 1530727000:
                    strM10568 = strM10568;
                    i16 = i16;
                    C10211 c10213 = new C10211(interfaceC17889);
                    if (C1916.f6442) {
                        c10212 = c10213;
                        short[] sArr2 = f5961;
                        list = listAsList;
                        if (C1420.f5096 > 0) {
                            c16560 = c16561;
                            String strM10748 = C3537.m10748(sArr2, 1, 14, i17);
                            String parent = interfaceC17889.getParent();
                            if (ServiceConnectionC3453.f10921 >= 0) {
                                c16561 = c16560;
                            } else {
                                c = 1;
                                C10211 c10214 = new C10211(strM10748, parent, false, true);
                                i5 = 2;
                                if (ServiceConnectionC3453.m10564() <= 0) {
                                    c10211 = c10214;
                                    c2 = 0;
                                    int iM6985 = (C2105.m6981("֫ۨ") + i13) * (-61);
                                    c16561 = c16560;
                                    List list2 = list;
                                    i16 = i5;
                                    strM10568 = strM10568;
                                    i15 = iM6985 ^ 887013103;
                                    i14 = ((iM6985 ^ i12) * 4449) ^ 1222336332;
                                    listAsList = list2;
                                } else {
                                    int iM6986 = (i13 - C2105.m6981("ۛ֨")) * 41;
                                    c10211 = c10214;
                                    i14 = ((iM6986 ^ i12) * (-21627)) ^ (-777343828);
                                    strM10568 = strM10568;
                                    c16561 = c16560;
                                    c2 = 0;
                                    i15 = iM6986 ^ (-386421305);
                                    listAsList = list;
                                    i16 = 2;
                                }
                            }
                        }
                        int iM2566 = C0630.m2566("᩹ۖ") ^ i12;
                        i14 = ((iM2566 ^ i13) * (-7931)) ^ 184284899;
                        i2 = iM2566 ^ 354106107;
                        listAsList = list;
                        c10211 = null;
                        i16 = i16;
                        String str = strM10568;
                        i15 = i2;
                        strM10568 = str;
                    } else {
                        c10212 = c10213;
                        int iM2567 = C0630.m2566("ۙ֨") ^ i13;
                        i14 = ((iM2567 ^ i12) * (-3301)) ^ 340318491;
                        i2 = iM2567 ^ 466116396;
                        i16 = i16;
                        c10211 = null;
                        String str2 = strM10568;
                        i15 = i2;
                        strM10568 = str2;
                    }
                    break;
                case -2062886255:
                case 1153150144:
                    C22628.m50615();
                    C4159.m12565();
                    break;
                case -2039462146:
                case 1113072642:
                    try {
                        C3245.m9923(sb, strM10568);
                        interfaceC13041.accept(C0050.m947(sb));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                    strM10568 = strM10568;
                    iM6982 = C0630.m2566("ܺܿ") ^ i13;
                    i14 = ((iM6982 ^ i12) * 17895) ^ 1606807256;
                    i6 = -1780486996;
                    i2 = iM6982 ^ i6;
                    String str3 = strM10568;
                    i15 = i2;
                    strM10568 = str3;
                    break;
                case -2018976703:
                case -1622449484:
                    strM10568 = strM10568;
                    c10211Arr[c] = c10211;
                    listAsList = Arrays.asList(c10211Arr);
                    abstractC16891M7043 = C2126.m7043(c16561);
                    if (C4159.m12565() >= 0) {
                        iM6982 = (C0630.m2566("۬۟") ^ i13) * (-41);
                        i14 = ((iM6982 ^ i12) * (-6343)) ^ (-662692562);
                        i6 = -176907444;
                    } else {
                        iM6982 = C2105.m6981("ۜᩳ") ^ i12;
                        i14 = ((iM6982 ^ i13) * (-853)) ^ 1329130249;
                        i6 = 51931413;
                    }
                    i2 = iM6982 ^ i6;
                    String str4 = strM10568;
                    i15 = i2;
                    strM10568 = str4;
                    break;
                case -1995174674:
                case -1105116052:
                    strM10568 = strM10568;
                    editText = (EditText) obj2;
                    spinner = (Spinner) obj;
                    interfaceC13041 = (InterfaceC13041) obj3;
                    iM6982 = (C2105.m6981("ܿ֫") ^ i12) * (-115);
                    i14 = ((iM6982 ^ i13) * 2119) ^ (-750857360);
                    i6 = 1071152056;
                    i2 = iM6982 ^ i6;
                    String str5 = strM10568;
                    i15 = i2;
                    strM10568 = str5;
                    break;
                case -1941196981:
                case 1507713338:
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    s = sArr[0];
                    i9 = s * s;
                    if (C2167.f7158 >= 0) {
                        iM6981 = C2105.m6981("ܺۧ") ^ i13;
                        i3 = ((iM6981 ^ i12) * 4137) ^ (-2028466707);
                        i4 = -76198676;
                    } else {
                        iM6981 = C0630.m2566("ۗᩴ") ^ i12;
                        i3 = ((iM6981 ^ i13) * 3959) ^ 2030836560;
                        i4 = -1573147469;
                    }
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str6 = strM10568;
                    i15 = i2;
                    strM10568 = str6;
                    break;
                case -1879231007:
                case 2047492965:
                    if (C1047.f3863 < 0) {
                        strM10568 = strM10568;
                        i16 = i16;
                        int iM2568 = C0630.m2566("ۙ֨") ^ i13;
                        i14 = ((iM2568 ^ i12) * (-3301)) ^ 340318491;
                        i2 = iM2568 ^ 466116396;
                        i16 = i16;
                        c10211 = null;
                        String str7 = strM10568;
                        i15 = i2;
                        strM10568 = str7;
                    }
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    iM6981 = C0630.m2566("۫᩷") ^ i12;
                    i3 = ((iM6981 ^ i13) * (-17109)) ^ (-2049919968);
                    i4 = -1450410885;
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str8 = strM10568;
                    i15 = i2;
                    strM10568 = str8;
                    break;
                case -1710631249:
                case -1291642721:
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    int i18 = s + s2;
                    if (i10 - (i18 * i18) >= 0) {
                        iM6981 = C0630.m2566("ۡܿ") ^ i12;
                        i3 = ((iM6981 ^ i13) * 13463) ^ 1725298794;
                        i4 = 927792907;
                    } else {
                        iM6981 = C2105.m6981("ۙۘ") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-4995)) ^ 806303383;
                        i4 = -214146583;
                    }
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str9 = strM10568;
                    i15 = i2;
                    strM10568 = str9;
                    break;
                case -1640686876:
                case -298867115:
                    final List list3 = listAsList;
                    final C16560 c16562 = c16561;
                    abstractC16891M7043.mo6005(c16561, listAsList, new Runnable() { // from class: l.ۧۡܳ
                        {
                            int i19 = -1879505470;
                            int i20 = C22628.f73083;
                            int i21 = C3683.f11629;
                            int iM2569 = C0630.m2566("᩷ܺ") ^ i21;
                            int i22 = ((iM2569 ^ i20) * 23917) ^ (-1029639393);
                            int i23 = -421050365;
                            while (true) {
                                i19 = ((((i19 ^ i20) * 3511) >> 31) & i22) ^ (iM2569 ^ i23);
                                switch (i19) {
                                    case -1899889854:
                                    case 1666933766:
                                        C0422.m1963();
                                        iM2569 = (C0630.m2566("ۛۛ") + i21) * 41;
                                        i22 = ((iM2569 ^ i20) * 6007) ^ 432837022;
                                        i23 = -2028419769;
                                        break;
                                    case -1891870186:
                                    case -1359350766:
                                        C4616.m13552();
                                        ServiceConnectionC3453.m10564();
                                        throw new RuntimeException();
                                    case -1713971862:
                                    case -441033844:
                                        if (C7106.m19120() <= 0) {
                                            iM2569 = (C2105.m6981("֨ۨ") + i21) * (-15);
                                            i22 = ((iM2569 ^ i20) * 22679) ^ (-88372288);
                                            i23 = -1830342206;
                                        } else {
                                            iM2569 = (C2105.m6981("᩹۬") ^ i20) * (-19);
                                            i22 = ((iM2569 ^ i21) * 24215) ^ (-657044843);
                                            i23 = 6138785;
                                        }
                                        break;
                                    case -1707535466:
                                    case 54151762:
                                        if (C3683.f11629 >= 0) {
                                            iM2569 = C2105.m6981("ۗۡ") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-25947)) ^ (-1162828341);
                                            i23 = -1918509135;
                                        } else {
                                            iM2569 = C0630.m2566("ᩳ᩸") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 201) ^ (-1922509014);
                                            i23 = -1290362655;
                                        }
                                        break;
                                    case -1449749122:
                                    case 2065203495:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            iM2569 = (C2105.m6981("֨ۨ") + i21) * (-15);
                                            i22 = ((iM2569 ^ i20) * 22679) ^ (-88372288);
                                            i23 = -1830342206;
                                        } else {
                                            iM2569 = C2105.m6981("ܺۜ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        }
                                        break;
                                    case -1348709793:
                                    case 449297:
                                        if (C0798.f2919) {
                                            iM2569 = C0630.m2566("ᩴۗ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * (-25953)) ^ 1659133034;
                                            i23 = -1669944962;
                                        } else {
                                            iM2569 = C2105.m6981("᩵᩷") ^ i21;
                                            i22 = ((iM2569 ^ i20) * 4221) ^ 1328417826;
                                            i23 = 246723765;
                                        }
                                        break;
                                    case -1128932479:
                                    case 642868680:
                                        if (C0714.m2805()) {
                                            iM2569 = C0630.m2566("᩵ܰ") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-28943)) ^ (-1706385167);
                                            i23 = -1025520252;
                                        } else {
                                            iM2569 = C2105.m6981("ۗۡ") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-25947)) ^ (-1162828341);
                                            i23 = -1918509135;
                                        }
                                        break;
                                    case -581912490:
                                    case 480221483:
                                        return;
                                    case -538522864:
                                    case 804015594:
                                        if (C2520.m8026()) {
                                            iM2569 = (C0630.m2566("ۛۛ") + i21) * 41;
                                            i22 = ((iM2569 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        } else {
                                            iM2569 = (C0630.m2566("ۖ᩸") + i20) * 5;
                                            i22 = ((iM2569 ^ i21) * 16969) ^ (-1417740259);
                                            i23 = -1312419368;
                                        }
                                        break;
                                    case -446539187:
                                    case 1055376543:
                                        if (!C3663.f11553) {
                                            iM2569 = C2105.m6981("ܺۜ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        } else {
                                            iM2569 = (C0630.m2566("ۛۛ") + i21) * 41;
                                            i22 = ((iM2569 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        }
                                        break;
                                    case -254660613:
                                    case 308523597:
                                        if (C2105.f7037 != 0) {
                                            iM2569 = (C0630.m2566("ۛۛ") + i21) * 41;
                                            i22 = ((iM2569 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        } else {
                                            iM2569 = C0630.m2566("ۘ֨") ^ i20;
                                            i22 = ((iM2569 ^ i21) * (-13277)) ^ 1805892605;
                                            i23 = 1474006877;
                                        }
                                        break;
                                    case -97502214:
                                    case 1563873060:
                                        if (C7811.m20844() != 0) {
                                            iM2569 = C0630.m2566("ᩴۗ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * (-25953)) ^ 1659133034;
                                            i23 = -1669944962;
                                        } else {
                                            iM2569 = (i21 - C2105.m6981("۫᩷")) * (-87);
                                            i22 = ((iM2569 ^ i20) * 10325) ^ 438544214;
                                            i23 = 2081942335;
                                        }
                                        break;
                                    case 34343561:
                                    case 2032321718:
                                        C2126.m7040();
                                        if (C0964.f3626 != 0) {
                                            iM2569 = C0630.m2566("ᩴۗ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * (-25953)) ^ 1659133034;
                                            i23 = -1669944962;
                                        } else {
                                            iM2569 = C2105.m6981("ܺۜ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        }
                                        break;
                                    case 334547913:
                                    case 1647857774:
                                        if (C1773.f6144 <= 0) {
                                            iM2569 = C2105.m6981("ܺۜ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        } else {
                                            iM2569 = C2105.m6981("ۜ۫") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-18663)) ^ 717584767;
                                            i23 = 288440814;
                                        }
                                        break;
                                    case 911947570:
                                    case 1754736070:
                                        if (C7106.m19120() <= 0) {
                                            iM2569 = C2105.m6981("ۗۡ") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-25947)) ^ (-1162828341);
                                            i23 = -1918509135;
                                        } else {
                                            iM2569 = C0630.m2566("ܿ֡") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 10409) ^ (-1853687215);
                                            i23 = 696023434;
                                        }
                                        break;
                                    default:
                                        if (C0798.f2919) {
                                            iM2569 = (C0630.m2566("ۛۛ") + i21) * 41;
                                            i22 = ((iM2569 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        } else {
                                            iM2569 = (C2105.m6981("ۖ᩹") ^ i21) * (-39);
                                            i22 = ((iM2569 ^ i20) * (-4401)) ^ 1532539177;
                                            i23 = -1869902668;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Main main2 = null;
                            InterfaceC17889 interfaceC178810 = null;
                            List list4 = null;
                            int i19 = -1297647304;
                            int i20 = C1128.f4106;
                            int i21 = C1294.f4556;
                            int iM2569 = C0630.m2566("ۛۖ") ^ i20;
                            int i22 = ((iM2569 ^ i21) * 22745) ^ 1776200310;
                            int i23 = -424746138;
                            while (true) {
                                i19 = ((((i19 ^ i21) * (-10547)) >> 31) & i22) ^ (iM2569 ^ i23);
                                switch (i19) {
                                    case -2003104113:
                                    case -24416579:
                                        if (C0798.m2998() != 0) {
                                            iM2569 = C2105.m6981("ܺᩳ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        } else {
                                            iM2569 = C0630.m2566("᩺ۗ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * (-3817)) ^ (-1783429331);
                                            i23 = -2109063264;
                                        }
                                        break;
                                    case -1989501453:
                                    case 1261698928:
                                        if (C2167.f7158 >= 0) {
                                            iM2569 = C0630.m2566("ۗ۫") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-28905)) ^ 516106400;
                                            i23 = -2092788527;
                                        } else {
                                            iM2569 = C0630.m2566("ܳ۬") ^ i21;
                                            i22 = ((iM2569 ^ i20) * 11191) ^ (-1629987138);
                                            i23 = -590211307;
                                        }
                                        break;
                                    case -1966275595:
                                    case -1145697398:
                                        interfaceC178810 = interfaceC17889;
                                        if (C4263.m12819() >= 0) {
                                            iM2569 = (i20 - C0630.m2566("۫ᩳ")) * (-119);
                                            i22 = ((iM2569 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        } else {
                                            iM2569 = C0630.m2566("ᩴ۠") ^ i21;
                                            i22 = ((iM2569 ^ i20) * 16503) ^ 739841143;
                                            i23 = -1161197558;
                                        }
                                        break;
                                    case -1693137921:
                                    case 997438792:
                                        if (!C4159.f13567) {
                                            iM2569 = C0630.m2566("ۗ۫") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-28905)) ^ 516106400;
                                            i23 = -2092788527;
                                        } else {
                                            iM2569 = C0630.m2566("ᩳ᩶") ^ i21;
                                            i22 = ((iM2569 ^ i20) * 27911) ^ 1359095952;
                                            i23 = -22211141;
                                        }
                                        break;
                                    case -1256458193:
                                    case 1943684903:
                                        if (C3019.f9544 >= 0) {
                                            iM2569 = C2105.m6981("ܺᩳ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        } else {
                                            iM2569 = (C2105.m6981("۬ᩳ") ^ i20) * 53;
                                            i22 = ((iM2569 ^ i21) * (-16303)) ^ 132217191;
                                            i23 = -2061257338;
                                        }
                                        break;
                                    case -1231636481:
                                    case 1734253568:
                                        ServiceConnectionC3453.m10564();
                                        C2167.m7155();
                                        break;
                                    case -851369861:
                                    case -299221003:
                                        main2 = main;
                                        if (RunnableC1937.f6483 >= 0) {
                                            iM2569 = C0630.m2566("ۗ۫") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-28905)) ^ 516106400;
                                            i23 = -2092788527;
                                        } else {
                                            iM2569 = (i20 - C0630.m2566("֨ۨ")) * (-117);
                                            i22 = ((iM2569 ^ i21) * 21557) ^ (-2038591422);
                                            i23 = 1457458966;
                                        }
                                        break;
                                    case -467813917:
                                    case 1369894387:
                                        C3746.m11369();
                                        iM2569 = C2105.m6981("ܺᩳ") ^ i20;
                                        i22 = ((iM2569 ^ i21) * 17987) ^ (-408170831);
                                        i23 = -1106097586;
                                        break;
                                    case -248428389:
                                    case 766045705:
                                        if (C0714.f2697 >= 0) {
                                            iM2569 = (i20 - C0630.m2566("۫ᩳ")) * (-119);
                                            i22 = ((iM2569 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        } else {
                                            iM2569 = (C0630.m2566("۫ۘ") + i21) * 51;
                                            i22 = ((iM2569 ^ i20) * 18037) ^ (-710049390);
                                            i23 = 543362645;
                                        }
                                        break;
                                    case -26056798:
                                    case 224353469:
                                        if (C1916.m6308() >= 0) {
                                            iM2569 = (i20 - C0630.m2566("۫ᩳ")) * (-119);
                                            i22 = ((iM2569 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        } else {
                                            iM2569 = (i21 - C0630.m2566("ܳ᩶")) * (-85);
                                            i22 = ((iM2569 ^ i20) * (-16183)) ^ 89887490;
                                            i23 = -809072431;
                                        }
                                        break;
                                    case -22010941:
                                    case 1294250958:
                                        if (C0382.m1848()) {
                                            iM2569 = C2105.m6981("ܺᩳ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        } else {
                                            iM2569 = C2105.m6981("ۛᩳ") ^ i21;
                                            i22 = ((iM2569 ^ i20) * (-21789)) ^ (-1411637134);
                                            i23 = 644007200;
                                        }
                                        break;
                                    case -5868733:
                                    case 365036749:
                                        list4 = list3;
                                        if (C4159.f13567) {
                                            iM2569 = (i20 - C0630.m2566("۠ۧ")) * 77;
                                            i22 = ((iM2569 ^ i21) * 30143) ^ 2131025106;
                                            i23 = -1945547603;
                                        } else {
                                            iM2569 = (i20 - C0630.m2566("۫ᩳ")) * (-119);
                                            i22 = ((iM2569 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        }
                                        break;
                                    case 58549664:
                                    case 1305387560:
                                        C19568.m45002(list4, i, c16562, main2, interfaceC178810);
                                        break;
                                    case 550611135:
                                    case 743110670:
                                        if (C1773.f6144 > 0) {
                                            iM2569 = (i20 - C2105.m6981("᩷۫")) * (-37);
                                            i22 = ((iM2569 ^ i21) * 12981) ^ (-1702855468);
                                            i23 = 262632984;
                                        } else {
                                            iM2569 = C0630.m2566("ᩳ᩶") ^ i21;
                                            i22 = ((iM2569 ^ i20) * 27911) ^ 1359095952;
                                            i23 = -22211141;
                                        }
                                        break;
                                    case 754945482:
                                    case 1185197405:
                                        if (C4117.f13076 <= 0) {
                                            iM2569 = (i20 - C2105.m6981("᩷۫")) * (-37);
                                            i22 = ((iM2569 ^ i21) * 12981) ^ (-1702855468);
                                            i23 = 262632984;
                                        } else {
                                            iM2569 = (i20 - C2105.m6981("᩺ܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i22 = ((iM2569 ^ i21) * 25817) ^ (-1093929340);
                                            i23 = 1370111002;
                                        }
                                        break;
                                    default:
                                        C5695.m16023();
                                        if (C4616.f14690 > 0) {
                                            iM2569 = C0630.m2566("ᩳ᩶") ^ i21;
                                            i22 = ((iM2569 ^ i20) * 27911) ^ 1359095952;
                                            i23 = -22211141;
                                        } else {
                                            iM2569 = C2105.m6981("ܺᩳ") ^ i20;
                                            i22 = ((iM2569 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        }
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    break;
                case -1635474362:
                case 1926128130:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1511987155:
                case -575705483:
                    strM10568 = C4075.m12252(f5961, 15, 2, i17);
                    iM6983 = C0630.m2566("ܿܿ") ^ i13;
                    i7 = ((iM6983 ^ i12) * 5405) ^ 724370879;
                    i8 = 1612815242;
                    i15 = iM6983 ^ i8;
                    i14 = i7;
                    break;
                case -1467059121:
                case -1213836415:
                    break;
                case -1222605468:
                case -171063877:
                    C1916.m6308();
                    if (C4616.m13552() != 0) {
                        iM6983 = (C0630.m2566("᩹ۜ") + i12) * 15;
                        i7 = ((iM6983 ^ i13) * 1863) ^ (-900405201);
                        i8 = -352895185;
                        i15 = iM6983 ^ i8;
                        i14 = i7;
                    } else {
                        strM10568 = strM10568;
                        c16561 = c16561;
                        i16 = i16;
                        listAsList = listAsList;
                        iM6981 = C0630.m2566("۫᩷") ^ i12;
                        i3 = ((iM6981 ^ i13) * (-17109)) ^ (-2049919968);
                        i4 = -1450410885;
                        i2 = iM6981 ^ i4;
                        i14 = i3;
                        listAsList = listAsList;
                        c16561 = c16561;
                        i16 = i16;
                        String str10 = strM10568;
                        i15 = i2;
                        strM10568 = str10;
                    }
                    break;
                case -1104070924:
                case -63646432:
                    if (C7811.f24123 >= 0) {
                        iM6983 = C0630.m2566("֨ܶ") ^ i12;
                        i7 = ((iM6983 ^ i13) * (-1675)) ^ (-709828806);
                        i8 = 1511461821;
                        i15 = iM6983 ^ i8;
                        i14 = i7;
                    } else {
                        strM10568 = strM10568;
                        iM6982 = (C0630.m2566("۬۟") ^ i13) * (-41);
                        i14 = ((iM6982 ^ i12) * (-6343)) ^ (-662692562);
                        i6 = -176907444;
                        i2 = iM6982 ^ i6;
                        String str11 = strM10568;
                        i15 = i2;
                        strM10568 = str11;
                    }
                    break;
                case -833237145:
                case 1326211737:
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    int i19 = i9 + 33628401;
                    i10 = i19 + i19;
                    s2 = 5799;
                    if (C5695.m16023() >= 0) {
                        iM6981 = C0630.m2566("۫᩷") ^ i12;
                        i3 = ((iM6981 ^ i13) * (-17109)) ^ (-2049919968);
                        i4 = -1450410885;
                    } else {
                        iM6981 = C2105.m6981("۬᩷") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-17803)) ^ 1818931956;
                        i4 = -1854230020;
                    }
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str12 = strM10568;
                    i15 = i2;
                    strM10568 = str12;
                    break;
                case -783949154:
                case -168955223:
                    i17 = 64349;
                    iM6981 = C2105.m6981("᩺ۨ") ^ i12;
                    i3 = ((iM6981 ^ i13) * 10745) ^ 1119002439;
                    i4 = 1349638926;
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str13 = strM10568;
                    i15 = i2;
                    strM10568 = str13;
                    break;
                case -715839572:
                case 1841011380:
                    strM10568 = strM10568;
                    i16 = i16;
                    c10211Arr = new C10211[i16];
                    c10211Arr[c2] = c10212;
                    if (C2520.f8000 >= 0) {
                        listAsList = listAsList;
                        c16561 = c16561;
                        iM6981 = C2105.m6981("ܺۧ") ^ i13;
                        i3 = ((iM6981 ^ i12) * 4137) ^ (-2028466707);
                        i4 = -76198676;
                        i2 = iM6981 ^ i4;
                        i14 = i3;
                        listAsList = listAsList;
                        c16561 = c16561;
                    } else {
                        int iM2569 = C0630.m2566("ܺ۟") ^ i12;
                        i14 = ((iM2569 ^ i13) * (-11809)) ^ 1051846419;
                        i2 = iM2569 ^ 1788812019;
                    }
                    i16 = i16;
                    String str14 = strM10568;
                    i15 = i2;
                    strM10568 = str14;
                    break;
                case -653462935:
                case 1133539366:
                    C7106.m19120();
                    if (C22628.f73083 > 0) {
                        strM10568 = strM10568;
                        c16560 = c16561;
                        i5 = i16;
                        list = listAsList;
                        int iM6987 = (C2105.m6981("֫ۨ") + i13) * (-61);
                        c16561 = c16560;
                        List list4 = list;
                        i16 = i5;
                        strM10568 = strM10568;
                        i15 = iM6987 ^ 887013103;
                        i14 = ((iM6987 ^ i12) * 4449) ^ 1222336332;
                        listAsList = list4;
                    } else {
                        iM6983 = (C0630.m2566("᩹ۜ") + i12) * 15;
                        i7 = ((iM6983 ^ i13) * 1863) ^ (-900405201);
                        i8 = -352895185;
                        i15 = iM6983 ^ i8;
                        i14 = i7;
                    }
                    break;
                case -629472478:
                case -59839201:
                    i17 = 22700;
                    iM6981 = C2105.m6981("᩺ۨ") ^ i12;
                    i3 = ((iM6981 ^ i13) * 10745) ^ 1119002439;
                    i4 = 1349638926;
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str15 = strM10568;
                    i15 = i2;
                    strM10568 = str15;
                    break;
                case -626660563:
                case 1667855201:
                    break;
                case -270644498:
                case 496925221:
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    sArr = f5961;
                    if (C1420.f5096 <= 0) {
                        iM6981 = (i12 - C2105.m6981("۟۫")) * (-79);
                        i3 = ((iM6981 ^ i13) * (-15161)) ^ 518589449;
                        i4 = 384109014;
                    } else {
                        iM6981 = C2105.m6981("ۜܿ") ^ i13;
                        i3 = ((iM6981 ^ i12) * (-1637)) ^ (-1951105979);
                        i4 = 2074370737;
                    }
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str16 = strM10568;
                    i15 = i2;
                    strM10568 = str16;
                    break;
                case -219510976:
                case 967958187:
                    C7811.m20844();
                    C4117.m12364();
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    iM6981 = C0630.m2566("۫᩷") ^ i12;
                    i3 = ((iM6981 ^ i13) * (-17109)) ^ (-2049919968);
                    i4 = -1450410885;
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str17 = strM10568;
                    i15 = i2;
                    strM10568 = str17;
                    break;
                case -165353051:
                case 93661300:
                    strM10568 = strM10568;
                    i16 = i16;
                    list = listAsList;
                    interfaceC17889 = (InterfaceC17889) obj2;
                    c16561 = (C16560) obj;
                    main = (Main) obj3;
                    dialogInterface.dismiss();
                    if (C2272.f7362) {
                        int iM25610 = C0630.m2566("᩹ۖ") ^ i12;
                        i14 = ((iM25610 ^ i13) * (-7931)) ^ 184284899;
                        i2 = iM25610 ^ 354106107;
                        listAsList = list;
                        c10211 = null;
                    } else {
                        int iM6988 = (C2105.m6981("ۧۙ") ^ i12) * 101;
                        i14 = ((iM6988 ^ i13) * (-19633)) ^ (-1770641666);
                        i2 = iM6988 ^ (-869553631);
                        listAsList = list;
                    }
                    i16 = i16;
                    String str18 = strM10568;
                    i15 = i2;
                    strM10568 = str18;
                    break;
                case -131128879:
                case 1133086072:
                    C21923.m49329();
                    if (C3245.m9925() != 0) {
                        strM10568 = strM10568;
                        c16561 = c16561;
                        i16 = i16;
                        listAsList = listAsList;
                        iM6981 = C2105.m6981("ܺۧ") ^ i13;
                        i3 = ((iM6981 ^ i12) * 4137) ^ (-2028466707);
                        i4 = -76198676;
                        i2 = iM6981 ^ i4;
                        i14 = i3;
                        listAsList = listAsList;
                        c16561 = c16561;
                        i16 = i16;
                        String str19 = strM10568;
                        i15 = i2;
                        strM10568 = str19;
                    }
                    strM10568 = strM10568;
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    iM6981 = (i12 - C2105.m6981("۟۫")) * (-79);
                    i3 = ((iM6981 ^ i13) * (-15161)) ^ 518589449;
                    i4 = 384109014;
                    i2 = iM6981 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str110 = strM10568;
                    i15 = i2;
                    strM10568 = str110;
                    break;
                case -120648220:
                case -17532004:
                    strM10568 = strM10568;
                    if (selectedItemPosition == 0) {
                        iM6982 = C2105.m6981("᩶᩷") ^ i12;
                        i14 = ((iM6982 ^ i13) * 24089) ^ (-89713171);
                        i6 = -590876196;
                    } else {
                        iM6982 = (C2105.m6981("֡ۗ") + i13) * (-127);
                        i14 = ((iM6982 ^ i12) * (-30981)) ^ (-741338581);
                        i6 = 1083426451;
                    }
                    i2 = iM6982 ^ i6;
                    String str111 = strM10568;
                    i15 = i2;
                    strM10568 = str111;
                    break;
                case 211574505:
                case 644446084:
                    if (C2958.m9034() > 0) {
                        iM6983 = (C2105.m6981("ᩴ۠") ^ i13) * (-73);
                        i7 = ((iM6983 ^ i12) * (-2139)) ^ (-78362029);
                        i8 = 1507297886;
                        i15 = iM6983 ^ i8;
                        i14 = i7;
                    } else {
                        strM10568 = strM10568;
                        iM6982 = (C0630.m2566("۬۟") ^ i13) * (-41);
                        i14 = ((iM6982 ^ i12) * (-6343)) ^ (-662692562);
                        i6 = -176907444;
                        i2 = iM6982 ^ i6;
                        String str112 = strM10568;
                        i15 = i2;
                        strM10568 = str112;
                    }
                    break;
                case 838049610:
                case 1408182377:
                    strM10568 = strM10568;
                    try {
                        strM10568 = ServiceConnectionC3453.m10568(f5961, 17, 2, i17);
                        iM6983 = C0630.m2566("ܿܿ") ^ i13;
                        i7 = ((iM6983 ^ i12) * 5405) ^ 724370879;
                        i8 = 1612815242;
                        i15 = iM6983 ^ i8;
                        i14 = i7;
                    } catch (NumberFormatException unused2) {
                        iM6982 = C0630.m2566("ܺܿ") ^ i13;
                        i14 = ((iM6982 ^ i12) * 17895) ^ 1606807256;
                        i6 = -1780486996;
                        i2 = iM6982 ^ i6;
                        String str113 = strM10568;
                        i15 = i2;
                        strM10568 = str113;
                    }
                    break;
                case 1344961127:
                case 1600598230:
                    strM10568 = strM10568;
                    int iM10632 = RunnableC3474.m10632(C0050.m947(C2958.m9028(editText)));
                    try {
                        sb = new StringBuilder();
                        C0422.m1944(sb, iM10632);
                        selectedItemPosition = spinner.getSelectedItemPosition();
                        iM6982 = (i12 - C2105.m6981("ܽ᩸")) * (-67);
                        i14 = ((iM6982 ^ i13) * 19151) ^ 1655885348;
                        i6 = 337660688;
                    } catch (NumberFormatException unused3) {
                        sb = null;
                        iM6982 = C0630.m2566("ܺܿ") ^ i13;
                        i14 = ((iM6982 ^ i12) * 17895) ^ 1606807256;
                        i6 = -1780486996;
                    }
                    i2 = iM6982 ^ i6;
                    String str114 = strM10568;
                    i15 = i2;
                    strM10568 = str114;
                    break;
                default:
                    c16561 = c16561;
                    i16 = i16;
                    listAsList = listAsList;
                    int i20 = this.f5964;
                    Object obj4 = this.f5962;
                    Object obj5 = this.f5963;
                    Object obj6 = this.f5965;
                    switch (i20) {
                        case 0:
                            int iM6989 = (i13 - C2105.m6981("᩻᩸")) * 89;
                            i14 = ((iM6989 ^ i12) * 20469) ^ (-1626419323);
                            obj3 = obj4;
                            obj2 = obj6;
                            strM10568 = strM10568;
                            c16561 = c16561;
                            i15 = iM6989 ^ 221105526;
                            obj = obj5;
                            listAsList = listAsList;
                            i16 = i16;
                            continue;
                        default:
                            strM10568 = strM10568;
                            int iM25611 = (C0630.m2566("ۗᩳ") ^ i13) * 21;
                            int i21 = ((iM25611 ^ i12) * (-541)) ^ 2115617787;
                            i2 = iM25611 ^ 1843047368;
                            i14 = i21;
                            obj3 = obj4;
                            obj = obj5;
                            obj2 = obj6;
                            break;
                    }
                    listAsList = listAsList;
                    c16561 = c16561;
                    i16 = i16;
                    String str115 = strM10568;
                    i15 = i2;
                    strM10568 = str115;
                    break;
            }
            return;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC1723(Object obj, Object obj2, Object obj3, int i) {
        int i2 = -875122026;
        int i3 = C3911.f12484;
        int i4 = ServiceConnectionC3453.f10921;
        this.f5964 = i;
        this.f5965 = obj;
        this.f5963 = obj2;
        this.f5962 = obj3;
        int iM6981 = C2105.m6981("۠۬") ^ i4;
        int i5 = ((iM6981 ^ i3) * (-16563)) ^ 1732652494;
        int i6 = 1192306376;
        while (true) {
            i2 = (iM6981 ^ i6) ^ (i5 & (((i2 ^ i3) * (-24965)) >> 31));
            switch (i2) {
                case -2132878332:
                case 308653415:
                    C0630.m2564();
                    C3432.m10477();
                    throw new RuntimeException();
                case -1876738640:
                case 1880773266:
                    C3432.m10477();
                    iM6981 = (C0630.m2566("۟ᩳ") ^ i3) * q.h;
                    i5 = ((iM6981 ^ i4) * (-22549)) ^ (-803324372);
                    i6 = -1352861382;
                    break;
                case -1410986060:
                case 1019141103:
                    if (C1128.f4106 <= 0) {
                        iM6981 = (C2105.m6981("֡ۖ") + i4) * 17;
                        i5 = ((iM6981 ^ i3) * 24135) ^ (-667425006);
                        i6 = -1976051476;
                    } else {
                        iM6981 = C0630.m2566("᩹ۢ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-31215)) ^ (-1268010886);
                        i6 = -1069490515;
                    }
                    break;
                case -623475388:
                case 204328411:
                    ServiceConnectionC3453.m10564();
                    if (C0798.f2919) {
                        iM6981 = (C0630.m2566("۟ᩳ") ^ i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-22549)) ^ (-803324372);
                        i6 = -1352861382;
                    } else {
                        iM6981 = (C2105.m6981("ᩴۘ") ^ i3) * (-29);
                        i5 = ((iM6981 ^ i4) * 29839) ^ 118858959;
                        i6 = -1467553247;
                    }
                    break;
                case -565551230:
                case 749998164:
                    return;
                case -358380168:
                case 17184210:
                    C1504.m5179();
                    if (C3746.f11829 <= 0) {
                        iM6981 = C0630.m2566("ۧ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * 9697) ^ 370884827;
                        i6 = -522525942;
                    } else {
                        iM6981 = (C0630.m2566("۟ᩳ") ^ i3) * q.h;
                        i5 = ((iM6981 ^ i4) * (-22549)) ^ (-803324372);
                        i6 = -1352861382;
                    }
                    break;
                default:
                    if (C21923.f70183 == 0) {
                        iM6981 = C0630.m2566("ۧ֨") ^ i4;
                        i5 = ((iM6981 ^ i3) * 9697) ^ 370884827;
                        i6 = -522525942;
                    } else {
                        iM6981 = C0630.m2566("۠֡") ^ i3;
                        i5 = ((iM6981 ^ i4) * 4067) ^ (-135229242);
                        i6 = -404371194;
                    }
                    break;
            }
        }
    }
}
