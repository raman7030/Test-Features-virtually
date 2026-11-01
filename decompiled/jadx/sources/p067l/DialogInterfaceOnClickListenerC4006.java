package p067l;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Spinner;
import bin.p000mt.plus.Main;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC4006 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ۜۘᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f81876 = {3616, 22750, 22729, 22751, 22723, 22745, 22750, 22735, 22729, 22751, 22658, 22733, 22750, 22751, 22735, 22759, 22766, 22753, 22766};

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f8739;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f8740;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8741;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f8742;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        if (p067l.C0947.f81895 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:
    
        if (p067l.RunnableC1014.f81941 <= 0) goto L22;
     */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, final int i) {
        int i2;
        int iM55979;
        int i3;
        int i4;
        List list;
        C18107 c18107;
        int i5;
        int iM559710;
        int i6;
        int iM559711;
        int i7;
        int i8;
        Object obj = null;
        Object obj2 = null;
        C18107 c18108 = null;
        char c = 0;
        C12073[] c12073Arr = null;
        EditText editText = null;
        Spinner spinner = null;
        int selectedItemPosition = 0;
        short[] sArr = null;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = -961031763;
        int i12 = C1124.f82007;
        int i13 = C1003.f81929;
        int iM559712 = (C0946.m55979("᩺ۖ") ^ i12) * 31;
        int i14 = ((iM559712 ^ i13) * 12325) ^ 2108587354;
        int i15 = iM559712 ^ (-1529796688);
        InterfaceC1489 interfaceC1489 = null;
        StringBuilder sb = null;
        String strM56161 = null;
        C12073 c12073 = null;
        Object obj3 = null;
        char c2 = 0;
        int i16 = 0;
        C12073 c12074 = null;
        int i17 = 0;
        final InterfaceC19370 interfaceC19370 = null;
        List listAsList = null;
        final Main main = null;
        AbstractC18422 abstractC18422M56000 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 12787) >> 31));
            switch (i11) {
                case -2101650279:
                case 1530727000:
                    strM56161 = strM56161;
                    i16 = i16;
                    C12073 c12075 = new C12073(interfaceC19370);
                    if (C0937.f81884) {
                        c12074 = c12075;
                        short[] sArr2 = f81876;
                        list = listAsList;
                        if (C0912.f81867 > 0) {
                            c18107 = c18108;
                            String strM56189 = C1017.m56189(sArr2, 1, 14, i17);
                            String parent = interfaceC19370.getParent();
                            if (ServiceConnectionC1013.f81940 >= 0) {
                                c18108 = c18107;
                            } else {
                                c = 1;
                                C12073 c12076 = new C12073(strM56189, parent, false, true);
                                i5 = 2;
                                if (ServiceConnectionC1013.m56157() <= 0) {
                                    c12073 = c12076;
                                    c2 = 0;
                                    int iM559713 = (C0946.m55979("֫ۨ") + i13) * (-61);
                                    c18108 = c18107;
                                    List list2 = list;
                                    i16 = i5;
                                    strM56161 = strM56161;
                                    i15 = iM559713 ^ 887013103;
                                    i14 = ((iM559713 ^ i12) * 4449) ^ 1222336332;
                                    listAsList = list2;
                                } else {
                                    int iM559714 = (i13 - C0946.m55979("ۛ֨")) * 41;
                                    c12073 = c12076;
                                    i14 = ((iM559714 ^ i12) * (-21627)) ^ (-777343828);
                                    strM56161 = strM56161;
                                    c18108 = c18107;
                                    c2 = 0;
                                    i15 = iM559714 ^ (-386421305);
                                    listAsList = list;
                                    i16 = 2;
                                }
                            }
                        }
                        int iM55680 = C0873.m55680("᩹ۖ") ^ i12;
                        i14 = ((iM55680 ^ i13) * (-7931)) ^ 184284899;
                        i2 = iM55680 ^ 354106107;
                        listAsList = list;
                        c12073 = null;
                        i16 = i16;
                        String str = strM56161;
                        i15 = i2;
                        strM56161 = str;
                    } else {
                        c12074 = c12075;
                        int iM55681 = C0873.m55680("ۙ֨") ^ i13;
                        i14 = ((iM55681 ^ i12) * (-3301)) ^ 340318491;
                        i2 = iM55681 ^ 466116396;
                        i16 = i16;
                        c12073 = null;
                        String str2 = strM56161;
                        i15 = i2;
                        strM56161 = str2;
                    }
                    break;
                case -2062886255:
                case 1153150144:
                    C1964.m56597();
                    C1048.m56305();
                    break;
                case -2039462146:
                case 1113072642:
                    try {
                        C1003.m56121(sb, strM56161);
                        interfaceC1489.accept(C0845.m55591(sb));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                    strM56161 = strM56161;
                    iM559710 = C0873.m55680("ܺܿ") ^ i13;
                    i14 = ((iM559710 ^ i12) * 17895) ^ 1606807256;
                    i6 = -1780486996;
                    i2 = iM559710 ^ i6;
                    String str3 = strM56161;
                    i15 = i2;
                    strM56161 = str3;
                    break;
                case -2018976703:
                case -1622449484:
                    strM56161 = strM56161;
                    c12073Arr[c] = c12073;
                    listAsList = Arrays.asList(c12073Arr);
                    abstractC18422M56000 = C0947.m56000(c18108);
                    if (C1048.m56305() >= 0) {
                        iM559710 = (C0873.m55680("۬۟") ^ i13) * (-41);
                        i14 = ((iM559710 ^ i12) * (-6343)) ^ (-662692562);
                        i6 = -176907444;
                    } else {
                        iM559710 = C0946.m55979("ۜᩳ") ^ i12;
                        i14 = ((iM559710 ^ i13) * (-853)) ^ 1329130249;
                        i6 = 51931413;
                    }
                    i2 = iM559710 ^ i6;
                    String str4 = strM56161;
                    i15 = i2;
                    strM56161 = str4;
                    break;
                case -1995174674:
                case -1105116052:
                    strM56161 = strM56161;
                    editText = (EditText) obj2;
                    spinner = (Spinner) obj;
                    interfaceC1489 = (InterfaceC1489) obj3;
                    iM559710 = (C0946.m55979("ܿ֫") ^ i12) * (-115);
                    i14 = ((iM559710 ^ i13) * 2119) ^ (-750857360);
                    i6 = 1071152056;
                    i2 = iM559710 ^ i6;
                    String str5 = strM56161;
                    i15 = i2;
                    strM56161 = str5;
                    break;
                case -1941196981:
                case 1507713338:
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    s = sArr[0];
                    i9 = s * s;
                    if (C0949.f81897 >= 0) {
                        iM55979 = C0946.m55979("ܺۧ") ^ i13;
                        i3 = ((iM55979 ^ i12) * 4137) ^ (-2028466707);
                        i4 = -76198676;
                    } else {
                        iM55979 = C0873.m55680("ۗᩴ") ^ i12;
                        i3 = ((iM55979 ^ i13) * 3959) ^ 2030836560;
                        i4 = -1573147469;
                    }
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str6 = strM56161;
                    i15 = i2;
                    strM56161 = str6;
                    break;
                case -1879231007:
                case 2047492965:
                    if (C0894.f81854 < 0) {
                        strM56161 = strM56161;
                        i16 = i16;
                        int iM55682 = C0873.m55680("ۙ֨") ^ i13;
                        i14 = ((iM55682 ^ i12) * (-3301)) ^ 340318491;
                        i2 = iM55682 ^ 466116396;
                        i16 = i16;
                        c12073 = null;
                        String str7 = strM56161;
                        i15 = i2;
                        strM56161 = str7;
                    }
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    iM55979 = C0873.m55680("۫᩷") ^ i12;
                    i3 = ((iM55979 ^ i13) * (-17109)) ^ (-2049919968);
                    i4 = -1450410885;
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str8 = strM56161;
                    i15 = i2;
                    strM56161 = str8;
                    break;
                case -1710631249:
                case -1291642721:
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    int i18 = s + s2;
                    if (i10 - (i18 * i18) >= 0) {
                        iM55979 = C0873.m55680("ۡܿ") ^ i12;
                        i3 = ((iM55979 ^ i13) * 13463) ^ 1725298794;
                        i4 = 927792907;
                    } else {
                        iM55979 = C0946.m55979("ۙۘ") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-4995)) ^ 806303383;
                        i4 = -214146583;
                    }
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str9 = strM56161;
                    i15 = i2;
                    strM56161 = str9;
                    break;
                case -1640686876:
                case -298867115:
                    final List list3 = listAsList;
                    final C18107 c18109 = c18108;
                    abstractC18422M56000.mo8202(c18108, listAsList, new Runnable() { // from class: l.ۧۡܳ
                        {
                            int i19 = -1879505470;
                            int i20 = C1964.f83032;
                            int i21 = C1025.f81947;
                            int iM55683 = C0873.m55680("᩷ܺ") ^ i21;
                            int i22 = ((iM55683 ^ i20) * 23917) ^ (-1029639393);
                            int i23 = -421050365;
                            while (true) {
                                i19 = ((((i19 ^ i20) * 3511) >> 31) & i22) ^ (iM55683 ^ i23);
                                switch (i19) {
                                    case -1899889854:
                                    case 1666933766:
                                        C0863.m55643();
                                        iM55683 = (C0873.m55680("ۛۛ") + i21) * 41;
                                        i22 = ((iM55683 ^ i20) * 6007) ^ 432837022;
                                        i23 = -2028419769;
                                        break;
                                    case -1891870186:
                                    case -1359350766:
                                        C1071.m56343();
                                        ServiceConnectionC1013.m56157();
                                        throw new RuntimeException();
                                    case -1713971862:
                                    case -441033844:
                                        if (C1194.m56396() <= 0) {
                                            iM55683 = (C0946.m55979("֨ۨ") + i21) * (-15);
                                            i22 = ((iM55683 ^ i20) * 22679) ^ (-88372288);
                                            i23 = -1830342206;
                                        } else {
                                            iM55683 = (C0946.m55979("᩹۬") ^ i20) * (-19);
                                            i22 = ((iM55683 ^ i21) * 24215) ^ (-657044843);
                                            i23 = 6138785;
                                        }
                                        break;
                                    case -1707535466:
                                    case 54151762:
                                        if (C1025.f81947 >= 0) {
                                            iM55683 = C0946.m55979("ۗۡ") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-25947)) ^ (-1162828341);
                                            i23 = -1918509135;
                                        } else {
                                            iM55683 = C0873.m55680("ᩳ᩸") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 201) ^ (-1922509014);
                                            i23 = -1290362655;
                                        }
                                        break;
                                    case -1449749122:
                                    case 2065203495:
                                        if (ViewOnClickListenerC0939.f81888 <= 0) {
                                            iM55683 = (C0946.m55979("֨ۨ") + i21) * (-15);
                                            i22 = ((iM55683 ^ i20) * 22679) ^ (-88372288);
                                            i23 = -1830342206;
                                        } else {
                                            iM55683 = C0946.m55979("ܺۜ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        }
                                        break;
                                    case -1348709793:
                                    case 449297:
                                        if (C0882.f81846) {
                                            iM55683 = C0873.m55680("ᩴۗ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * (-25953)) ^ 1659133034;
                                            i23 = -1669944962;
                                        } else {
                                            iM55683 = C0946.m55979("᩵᩷") ^ i21;
                                            i22 = ((iM55683 ^ i20) * 4221) ^ 1328417826;
                                            i23 = 246723765;
                                        }
                                        break;
                                    case -1128932479:
                                    case 642868680:
                                        if (C0877.m55696()) {
                                            iM55683 = C0873.m55680("᩵ܰ") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-28943)) ^ (-1706385167);
                                            i23 = -1025520252;
                                        } else {
                                            iM55683 = C0946.m55979("ۗۡ") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-25947)) ^ (-1162828341);
                                            i23 = -1918509135;
                                        }
                                        break;
                                    case -581912490:
                                    case 480221483:
                                        return;
                                    case -538522864:
                                    case 804015594:
                                        if (C0967.m56074()) {
                                            iM55683 = (C0873.m55680("ۛۛ") + i21) * 41;
                                            i22 = ((iM55683 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        } else {
                                            iM55683 = (C0873.m55680("ۖ᩸") + i20) * 5;
                                            i22 = ((iM55683 ^ i21) * 16969) ^ (-1417740259);
                                            i23 = -1312419368;
                                        }
                                        break;
                                    case -446539187:
                                    case 1055376543:
                                        if (!C1024.f81946) {
                                            iM55683 = C0946.m55979("ܺۜ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        } else {
                                            iM55683 = (C0873.m55680("ۛۛ") + i21) * 41;
                                            i22 = ((iM55683 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        }
                                        break;
                                    case -254660613:
                                    case 308523597:
                                        if (C0946.f81894 != 0) {
                                            iM55683 = (C0873.m55680("ۛۛ") + i21) * 41;
                                            i22 = ((iM55683 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        } else {
                                            iM55683 = C0873.m55680("ۘ֨") ^ i20;
                                            i22 = ((iM55683 ^ i21) * (-13277)) ^ 1805892605;
                                            i23 = 1474006877;
                                        }
                                        break;
                                    case -97502214:
                                    case 1563873060:
                                        if (C1229.m56410() != 0) {
                                            iM55683 = C0873.m55680("ᩴۗ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * (-25953)) ^ 1659133034;
                                            i23 = -1669944962;
                                        } else {
                                            iM55683 = (i21 - C0946.m55979("۫᩷")) * (-87);
                                            i22 = ((iM55683 ^ i20) * 10325) ^ 438544214;
                                            i23 = 2081942335;
                                        }
                                        break;
                                    case 34343561:
                                    case 2032321718:
                                        C0947.m55997();
                                        if (C0890.f81849 != 0) {
                                            iM55683 = C0873.m55680("ᩴۗ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * (-25953)) ^ 1659133034;
                                            i23 = -1669944962;
                                        } else {
                                            iM55683 = C0946.m55979("ܺۜ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        }
                                        break;
                                    case 334547913:
                                    case 1647857774:
                                        if (C0930.f81879 <= 0) {
                                            iM55683 = C0946.m55979("ܺۜ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 11477) ^ (-205629928);
                                            i23 = 1454932999;
                                        } else {
                                            iM55683 = C0946.m55979("ۜ۫") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-18663)) ^ 717584767;
                                            i23 = 288440814;
                                        }
                                        break;
                                    case 911947570:
                                    case 1754736070:
                                        if (C1194.m56396() <= 0) {
                                            iM55683 = C0946.m55979("ۗۡ") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-25947)) ^ (-1162828341);
                                            i23 = -1918509135;
                                        } else {
                                            iM55683 = C0873.m55680("ܿ֡") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 10409) ^ (-1853687215);
                                            i23 = 696023434;
                                        }
                                        break;
                                    default:
                                        if (C0882.f81846) {
                                            iM55683 = (C0873.m55680("ۛۛ") + i21) * 41;
                                            i22 = ((iM55683 ^ i20) * 6007) ^ 432837022;
                                            i23 = -2028419769;
                                        } else {
                                            iM55683 = (C0946.m55979("ۖ᩹") ^ i21) * (-39);
                                            i22 = ((iM55683 ^ i20) * (-4401)) ^ 1532539177;
                                            i23 = -1869902668;
                                        }
                                        break;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Main main2 = null;
                            InterfaceC19370 interfaceC19371 = null;
                            List list4 = null;
                            int i19 = -1297647304;
                            int i20 = C0898.f81858;
                            int i21 = C0906.f81862;
                            int iM55683 = C0873.m55680("ۛۖ") ^ i20;
                            int i22 = ((iM55683 ^ i21) * 22745) ^ 1776200310;
                            int i23 = -424746138;
                            while (true) {
                                i19 = ((((i19 ^ i21) * (-10547)) >> 31) & i22) ^ (iM55683 ^ i23);
                                switch (i19) {
                                    case -2003104113:
                                    case -24416579:
                                        if (C0882.m55710() != 0) {
                                            iM55683 = C0946.m55979("ܺᩳ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        } else {
                                            iM55683 = C0873.m55680("᩺ۗ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * (-3817)) ^ (-1783429331);
                                            i23 = -2109063264;
                                        }
                                        break;
                                    case -1989501453:
                                    case 1261698928:
                                        if (C0949.f81897 >= 0) {
                                            iM55683 = C0873.m55680("ۗ۫") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-28905)) ^ 516106400;
                                            i23 = -2092788527;
                                        } else {
                                            iM55683 = C0873.m55680("ܳ۬") ^ i21;
                                            i22 = ((iM55683 ^ i20) * 11191) ^ (-1629987138);
                                            i23 = -590211307;
                                        }
                                        break;
                                    case -1966275595:
                                    case -1145697398:
                                        interfaceC19371 = interfaceC19370;
                                        if (C1053.m56327() >= 0) {
                                            iM55683 = (i20 - C0873.m55680("۫ᩳ")) * (-119);
                                            i22 = ((iM55683 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        } else {
                                            iM55683 = C0873.m55680("ᩴ۠") ^ i21;
                                            i22 = ((iM55683 ^ i20) * 16503) ^ 739841143;
                                            i23 = -1161197558;
                                        }
                                        break;
                                    case -1693137921:
                                    case 997438792:
                                        if (!C1048.f81963) {
                                            iM55683 = C0873.m55680("ۗ۫") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-28905)) ^ 516106400;
                                            i23 = -2092788527;
                                        } else {
                                            iM55683 = C0873.m55680("ᩳ᩶") ^ i21;
                                            i22 = ((iM55683 ^ i20) * 27911) ^ 1359095952;
                                            i23 = -22211141;
                                        }
                                        break;
                                    case -1256458193:
                                    case 1943684903:
                                        if (C0992.f81922 >= 0) {
                                            iM55683 = C0946.m55979("ܺᩳ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        } else {
                                            iM55683 = (C0946.m55979("۬ᩳ") ^ i20) * 53;
                                            i22 = ((iM55683 ^ i21) * (-16303)) ^ 132217191;
                                            i23 = -2061257338;
                                        }
                                        break;
                                    case -1231636481:
                                    case 1734253568:
                                        ServiceConnectionC1013.m56157();
                                        C0949.m56012();
                                        break;
                                    case -851369861:
                                    case -299221003:
                                        main2 = main;
                                        if (RunnableC0938.f81886 >= 0) {
                                            iM55683 = C0873.m55680("ۗ۫") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-28905)) ^ 516106400;
                                            i23 = -2092788527;
                                        } else {
                                            iM55683 = (i20 - C0873.m55680("֨ۨ")) * (-117);
                                            i22 = ((iM55683 ^ i21) * 21557) ^ (-2038591422);
                                            i23 = 1457458966;
                                        }
                                        break;
                                    case -467813917:
                                    case 1369894387:
                                        C1028.m56247();
                                        iM55683 = C0946.m55979("ܺᩳ") ^ i20;
                                        i22 = ((iM55683 ^ i21) * 17987) ^ (-408170831);
                                        i23 = -1106097586;
                                        break;
                                    case -248428389:
                                    case 766045705:
                                        if (C0877.f81843 >= 0) {
                                            iM55683 = (i20 - C0873.m55680("۫ᩳ")) * (-119);
                                            i22 = ((iM55683 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        } else {
                                            iM55683 = (C0873.m55680("۫ۘ") + i21) * 51;
                                            i22 = ((iM55683 ^ i20) * 18037) ^ (-710049390);
                                            i23 = 543362645;
                                        }
                                        break;
                                    case -26056798:
                                    case 224353469:
                                        if (C0937.m55918() >= 0) {
                                            iM55683 = (i20 - C0873.m55680("۫ᩳ")) * (-119);
                                            i22 = ((iM55683 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        } else {
                                            iM55683 = (i21 - C0873.m55680("ܳ᩶")) * (-85);
                                            i22 = ((iM55683 ^ i20) * (-16183)) ^ 89887490;
                                            i23 = -809072431;
                                        }
                                        break;
                                    case -22010941:
                                    case 1294250958:
                                        if (C0861.m55626()) {
                                            iM55683 = C0946.m55979("ܺᩳ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 17987) ^ (-408170831);
                                            i23 = -1106097586;
                                        } else {
                                            iM55683 = C0946.m55979("ۛᩳ") ^ i21;
                                            i22 = ((iM55683 ^ i20) * (-21789)) ^ (-1411637134);
                                            i23 = 644007200;
                                        }
                                        break;
                                    case -5868733:
                                    case 365036749:
                                        list4 = list3;
                                        if (C1048.f81963) {
                                            iM55683 = (i20 - C0873.m55680("۠ۧ")) * 77;
                                            i22 = ((iM55683 ^ i21) * 30143) ^ 2131025106;
                                            i23 = -1945547603;
                                        } else {
                                            iM55683 = (i20 - C0873.m55680("۫ᩳ")) * (-119);
                                            i22 = ((iM55683 ^ i21) * (-873)) ^ (-949707254);
                                            i23 = 811853992;
                                        }
                                        break;
                                    case 58549664:
                                    case 1305387560:
                                        C20966.m47297(list4, i, c18109, main2, interfaceC19371);
                                        break;
                                    case 550611135:
                                    case 743110670:
                                        if (C0930.f81879 > 0) {
                                            iM55683 = (i20 - C0946.m55979("᩷۫")) * (-37);
                                            i22 = ((iM55683 ^ i21) * 12981) ^ (-1702855468);
                                            i23 = 262632984;
                                        } else {
                                            iM55683 = C0873.m55680("ᩳ᩶") ^ i21;
                                            i22 = ((iM55683 ^ i20) * 27911) ^ 1359095952;
                                            i23 = -22211141;
                                        }
                                        break;
                                    case 754945482:
                                    case 1185197405:
                                        if (C1046.f81962 <= 0) {
                                            iM55683 = (i20 - C0946.m55979("᩷۫")) * (-37);
                                            i22 = ((iM55683 ^ i21) * 12981) ^ (-1702855468);
                                            i23 = 262632984;
                                        } else {
                                            iM55683 = (i20 - C0946.m55979("᩺ܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i22 = ((iM55683 ^ i21) * 25817) ^ (-1093929340);
                                            i23 = 1370111002;
                                        }
                                        break;
                                    default:
                                        C1124.m56367();
                                        if (C1071.f81975 > 0) {
                                            iM55683 = C0873.m55680("ᩳ᩶") ^ i21;
                                            i22 = ((iM55683 ^ i20) * 27911) ^ 1359095952;
                                            i23 = -22211141;
                                        } else {
                                            iM55683 = C0946.m55979("ܺᩳ") ^ i20;
                                            i22 = ((iM55683 ^ i21) * 17987) ^ (-408170831);
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
                    ServiceConnectionC1013.m56157();
                    break;
                case -1511987155:
                case -575705483:
                    strM56161 = C1044.m56276(f81876, 15, 2, i17);
                    iM559711 = C0873.m55680("ܿܿ") ^ i13;
                    i7 = ((iM559711 ^ i12) * 5405) ^ 724370879;
                    i8 = 1612815242;
                    i15 = iM559711 ^ i8;
                    i14 = i7;
                    break;
                case -1467059121:
                case -1213836415:
                    break;
                case -1222605468:
                case -171063877:
                    C0937.m55918();
                    if (C1071.m56343() != 0) {
                        iM559711 = (C0873.m55680("᩹ۜ") + i12) * 15;
                        i7 = ((iM559711 ^ i13) * 1863) ^ (-900405201);
                        i8 = -352895185;
                        i15 = iM559711 ^ i8;
                        i14 = i7;
                    } else {
                        strM56161 = strM56161;
                        c18108 = c18108;
                        i16 = i16;
                        listAsList = listAsList;
                        iM55979 = C0873.m55680("۫᩷") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-17109)) ^ (-2049919968);
                        i4 = -1450410885;
                        i2 = iM55979 ^ i4;
                        i14 = i3;
                        listAsList = listAsList;
                        c18108 = c18108;
                        i16 = i16;
                        String str10 = strM56161;
                        i15 = i2;
                        strM56161 = str10;
                    }
                    break;
                case -1104070924:
                case -63646432:
                    if (C1229.f82066 >= 0) {
                        iM559711 = C0873.m55680("֨ܶ") ^ i12;
                        i7 = ((iM559711 ^ i13) * (-1675)) ^ (-709828806);
                        i8 = 1511461821;
                        i15 = iM559711 ^ i8;
                        i14 = i7;
                    } else {
                        strM56161 = strM56161;
                        iM559710 = (C0873.m55680("۬۟") ^ i13) * (-41);
                        i14 = ((iM559710 ^ i12) * (-6343)) ^ (-662692562);
                        i6 = -176907444;
                        i2 = iM559710 ^ i6;
                        String str11 = strM56161;
                        i15 = i2;
                        strM56161 = str11;
                    }
                    break;
                case -833237145:
                case 1326211737:
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    int i19 = i9 + 33628401;
                    i10 = i19 + i19;
                    s2 = 5799;
                    if (C1124.m56367() >= 0) {
                        iM55979 = C0873.m55680("۫᩷") ^ i12;
                        i3 = ((iM55979 ^ i13) * (-17109)) ^ (-2049919968);
                        i4 = -1450410885;
                    } else {
                        iM55979 = C0946.m55979("۬᩷") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-17803)) ^ 1818931956;
                        i4 = -1854230020;
                    }
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str12 = strM56161;
                    i15 = i2;
                    strM56161 = str12;
                    break;
                case -783949154:
                case -168955223:
                    i17 = 64349;
                    iM55979 = C0946.m55979("᩺ۨ") ^ i12;
                    i3 = ((iM55979 ^ i13) * 10745) ^ 1119002439;
                    i4 = 1349638926;
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str13 = strM56161;
                    i15 = i2;
                    strM56161 = str13;
                    break;
                case -715839572:
                case 1841011380:
                    strM56161 = strM56161;
                    i16 = i16;
                    c12073Arr = new C12073[i16];
                    c12073Arr[c2] = c12074;
                    if (C0967.f81910 >= 0) {
                        listAsList = listAsList;
                        c18108 = c18108;
                        iM55979 = C0946.m55979("ܺۧ") ^ i13;
                        i3 = ((iM55979 ^ i12) * 4137) ^ (-2028466707);
                        i4 = -76198676;
                        i2 = iM55979 ^ i4;
                        i14 = i3;
                        listAsList = listAsList;
                        c18108 = c18108;
                    } else {
                        int iM55683 = C0873.m55680("ܺ۟") ^ i12;
                        i14 = ((iM55683 ^ i13) * (-11809)) ^ 1051846419;
                        i2 = iM55683 ^ 1788812019;
                    }
                    i16 = i16;
                    String str14 = strM56161;
                    i15 = i2;
                    strM56161 = str14;
                    break;
                case -653462935:
                case 1133539366:
                    C1194.m56396();
                    if (C1964.f83032 > 0) {
                        strM56161 = strM56161;
                        c18107 = c18108;
                        i5 = i16;
                        list = listAsList;
                        int iM559715 = (C0946.m55979("֫ۨ") + i13) * (-61);
                        c18108 = c18107;
                        List list4 = list;
                        i16 = i5;
                        strM56161 = strM56161;
                        i15 = iM559715 ^ 887013103;
                        i14 = ((iM559715 ^ i12) * 4449) ^ 1222336332;
                        listAsList = list4;
                    } else {
                        iM559711 = (C0873.m55680("᩹ۜ") + i12) * 15;
                        i7 = ((iM559711 ^ i13) * 1863) ^ (-900405201);
                        i8 = -352895185;
                        i15 = iM559711 ^ i8;
                        i14 = i7;
                    }
                    break;
                case -629472478:
                case -59839201:
                    i17 = 22700;
                    iM55979 = C0946.m55979("᩺ۨ") ^ i12;
                    i3 = ((iM55979 ^ i13) * 10745) ^ 1119002439;
                    i4 = 1349638926;
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str15 = strM56161;
                    i15 = i2;
                    strM56161 = str15;
                    break;
                case -626660563:
                case 1667855201:
                    break;
                case -270644498:
                case 496925221:
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    sArr = f81876;
                    if (C0912.f81867 <= 0) {
                        iM55979 = (i12 - C0946.m55979("۟۫")) * (-79);
                        i3 = ((iM55979 ^ i13) * (-15161)) ^ 518589449;
                        i4 = 384109014;
                    } else {
                        iM55979 = C0946.m55979("ۜܿ") ^ i13;
                        i3 = ((iM55979 ^ i12) * (-1637)) ^ (-1951105979);
                        i4 = 2074370737;
                    }
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str16 = strM56161;
                    i15 = i2;
                    strM56161 = str16;
                    break;
                case -219510976:
                case 967958187:
                    C1229.m56410();
                    C1046.m56302();
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    iM55979 = C0873.m55680("۫᩷") ^ i12;
                    i3 = ((iM55979 ^ i13) * (-17109)) ^ (-2049919968);
                    i4 = -1450410885;
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str17 = strM56161;
                    i15 = i2;
                    strM56161 = str17;
                    break;
                case -165353051:
                case 93661300:
                    strM56161 = strM56161;
                    i16 = i16;
                    list = listAsList;
                    interfaceC19370 = (InterfaceC19370) obj2;
                    c18108 = (C18107) obj;
                    main = (Main) obj3;
                    dialogInterface.dismiss();
                    if (C0955.f81898) {
                        int iM55684 = C0873.m55680("᩹ۖ") ^ i12;
                        i14 = ((iM55684 ^ i13) * (-7931)) ^ 184284899;
                        i2 = iM55684 ^ 354106107;
                        listAsList = list;
                        c12073 = null;
                    } else {
                        int iM559716 = (C0946.m55979("ۧۙ") ^ i12) * 101;
                        i14 = ((iM559716 ^ i13) * (-19633)) ^ (-1770641666);
                        i2 = iM559716 ^ (-869553631);
                        listAsList = list;
                    }
                    i16 = i16;
                    String str18 = strM56161;
                    i15 = i2;
                    strM56161 = str18;
                    break;
                case -131128879:
                case 1133086072:
                    C1929.m56553();
                    if (C1003.m56123() != 0) {
                        strM56161 = strM56161;
                        c18108 = c18108;
                        i16 = i16;
                        listAsList = listAsList;
                        iM55979 = C0946.m55979("ܺۧ") ^ i13;
                        i3 = ((iM55979 ^ i12) * 4137) ^ (-2028466707);
                        i4 = -76198676;
                        i2 = iM55979 ^ i4;
                        i14 = i3;
                        listAsList = listAsList;
                        c18108 = c18108;
                        i16 = i16;
                        String str19 = strM56161;
                        i15 = i2;
                        strM56161 = str19;
                    }
                    strM56161 = strM56161;
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    iM55979 = (i12 - C0946.m55979("۟۫")) * (-79);
                    i3 = ((iM55979 ^ i13) * (-15161)) ^ 518589449;
                    i4 = 384109014;
                    i2 = iM55979 ^ i4;
                    i14 = i3;
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str110 = strM56161;
                    i15 = i2;
                    strM56161 = str110;
                    break;
                case -120648220:
                case -17532004:
                    strM56161 = strM56161;
                    if (selectedItemPosition == 0) {
                        iM559710 = C0946.m55979("᩶᩷") ^ i12;
                        i14 = ((iM559710 ^ i13) * 24089) ^ (-89713171);
                        i6 = -590876196;
                    } else {
                        iM559710 = (C0946.m55979("֡ۗ") + i13) * (-127);
                        i14 = ((iM559710 ^ i12) * (-30981)) ^ (-741338581);
                        i6 = 1083426451;
                    }
                    i2 = iM559710 ^ i6;
                    String str111 = strM56161;
                    i15 = i2;
                    strM56161 = str111;
                    break;
                case 211574505:
                case 644446084:
                    if (C0989.m56095() > 0) {
                        iM559711 = (C0946.m55979("ᩴ۠") ^ i13) * (-73);
                        i7 = ((iM559711 ^ i12) * (-2139)) ^ (-78362029);
                        i8 = 1507297886;
                        i15 = iM559711 ^ i8;
                        i14 = i7;
                    } else {
                        strM56161 = strM56161;
                        iM559710 = (C0873.m55680("۬۟") ^ i13) * (-41);
                        i14 = ((iM559710 ^ i12) * (-6343)) ^ (-662692562);
                        i6 = -176907444;
                        i2 = iM559710 ^ i6;
                        String str112 = strM56161;
                        i15 = i2;
                        strM56161 = str112;
                    }
                    break;
                case 838049610:
                case 1408182377:
                    strM56161 = strM56161;
                    try {
                        strM56161 = ServiceConnectionC1013.m56161(f81876, 17, 2, i17);
                        iM559711 = C0873.m55680("ܿܿ") ^ i13;
                        i7 = ((iM559711 ^ i12) * 5405) ^ 724370879;
                        i8 = 1612815242;
                        i15 = iM559711 ^ i8;
                        i14 = i7;
                    } catch (NumberFormatException unused2) {
                        iM559710 = C0873.m55680("ܺܿ") ^ i13;
                        i14 = ((iM559710 ^ i12) * 17895) ^ 1606807256;
                        i6 = -1780486996;
                        i2 = iM559710 ^ i6;
                        String str113 = strM56161;
                        i15 = i2;
                        strM56161 = str113;
                    }
                    break;
                case 1344961127:
                case 1600598230:
                    strM56161 = strM56161;
                    int iM56179 = RunnableC1014.m56179(C0845.m55591(C0989.m56089(editText)));
                    try {
                        sb = new StringBuilder();
                        C0863.m55629(sb, iM56179);
                        selectedItemPosition = spinner.getSelectedItemPosition();
                        iM559710 = (i12 - C0946.m55979("ܽ᩸")) * (-67);
                        i14 = ((iM559710 ^ i13) * 19151) ^ 1655885348;
                        i6 = 337660688;
                    } catch (NumberFormatException unused3) {
                        sb = null;
                        iM559710 = C0873.m55680("ܺܿ") ^ i13;
                        i14 = ((iM559710 ^ i12) * 17895) ^ 1606807256;
                        i6 = -1780486996;
                    }
                    i2 = iM559710 ^ i6;
                    String str114 = strM56161;
                    i15 = i2;
                    strM56161 = str114;
                    break;
                default:
                    c18108 = c18108;
                    i16 = i16;
                    listAsList = listAsList;
                    int i20 = this.f8741;
                    Object obj4 = this.f8739;
                    Object obj5 = this.f8740;
                    Object obj6 = this.f8742;
                    switch (i20) {
                        case 0:
                            int iM559717 = (i13 - C0946.m55979("᩻᩸")) * 89;
                            i14 = ((iM559717 ^ i12) * 20469) ^ (-1626419323);
                            obj3 = obj4;
                            obj2 = obj6;
                            strM56161 = strM56161;
                            c18108 = c18108;
                            i15 = iM559717 ^ 221105526;
                            obj = obj5;
                            listAsList = listAsList;
                            i16 = i16;
                            continue;
                        default:
                            strM56161 = strM56161;
                            int iM55685 = (C0873.m55680("ۗᩳ") ^ i13) * 21;
                            int i21 = ((iM55685 ^ i12) * (-541)) ^ 2115617787;
                            i2 = iM55685 ^ 1843047368;
                            i14 = i21;
                            obj3 = obj4;
                            obj = obj5;
                            obj2 = obj6;
                            break;
                    }
                    listAsList = listAsList;
                    c18108 = c18108;
                    i16 = i16;
                    String str115 = strM56161;
                    i15 = i2;
                    strM56161 = str115;
                    break;
            }
            return;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC4006(Object obj, Object obj2, Object obj3, int i) {
        int i2 = -875122026;
        int i3 = C1036.f81953;
        int i4 = ServiceConnectionC1013.f81940;
        this.f8741 = i;
        this.f8742 = obj;
        this.f8740 = obj2;
        this.f8739 = obj3;
        int iM55979 = C0946.m55979("۠۬") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-16563)) ^ 1732652494;
        int i6 = 1192306376;
        while (true) {
            i2 = (iM55979 ^ i6) ^ (i5 & (((i2 ^ i3) * (-24965)) >> 31));
            switch (i2) {
                case -2132878332:
                case 308653415:
                    C0873.m55678();
                    C1012.m56134();
                    throw new RuntimeException();
                case -1876738640:
                case 1880773266:
                    C1012.m56134();
                    iM55979 = (C0873.m55680("۟ᩳ") ^ i3) * C0254q.f1218h;
                    i5 = ((iM55979 ^ i4) * (-22549)) ^ (-803324372);
                    i6 = -1352861382;
                    break;
                case -1410986060:
                case 1019141103:
                    if (C0898.f81858 <= 0) {
                        iM55979 = (C0946.m55979("֡ۖ") + i4) * 17;
                        i5 = ((iM55979 ^ i3) * 24135) ^ (-667425006);
                        i6 = -1976051476;
                    } else {
                        iM55979 = C0873.m55680("᩹ۢ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-31215)) ^ (-1268010886);
                        i6 = -1069490515;
                    }
                    break;
                case -623475388:
                case 204328411:
                    ServiceConnectionC1013.m56157();
                    if (C0882.f81846) {
                        iM55979 = (C0873.m55680("۟ᩳ") ^ i3) * C0254q.f1218h;
                        i5 = ((iM55979 ^ i4) * (-22549)) ^ (-803324372);
                        i6 = -1352861382;
                    } else {
                        iM55979 = (C0946.m55979("ᩴۘ") ^ i3) * (-29);
                        i5 = ((iM55979 ^ i4) * 29839) ^ 118858959;
                        i6 = -1467553247;
                    }
                    break;
                case -565551230:
                case 749998164:
                    return;
                case -358380168:
                case 17184210:
                    C0917.m55854();
                    if (C1028.f81950 <= 0) {
                        iM55979 = C0873.m55680("ۧ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * 9697) ^ 370884827;
                        i6 = -522525942;
                    } else {
                        iM55979 = (C0873.m55680("۟ᩳ") ^ i3) * C0254q.f1218h;
                        i5 = ((iM55979 ^ i4) * (-22549)) ^ (-803324372);
                        i6 = -1352861382;
                    }
                    break;
                default:
                    if (C1929.f83011 == 0) {
                        iM55979 = C0873.m55680("ۧ֨") ^ i4;
                        i5 = ((iM55979 ^ i3) * 9697) ^ 370884827;
                        i6 = -522525942;
                    } else {
                        iM55979 = C0873.m55680("۠֡") ^ i3;
                        i5 = ((iM55979 ^ i4) * 4067) ^ (-135229242);
                        i6 = -404371194;
                    }
                    break;
            }
        }
    }
}
