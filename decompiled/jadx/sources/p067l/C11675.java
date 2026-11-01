package p067l;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢ᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C11675 extends BaseAdapter {

    /* JADX INFO: renamed from: ۙ۠᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f82113 = {1552, 20648, 24574, -31576, -30141, 31647, -28700, 31034, -30487, -27078, 32151, 24391, -24858, 250, 109, 250, -28454, 28522, -27624, -30856, -25601, -31232, 23665, 32474, 22525, 25313, -25770, 28176, 20896, -26926, 24234, 27159, 22046, 26786};

    /* JADX INFO: renamed from: ᩸ */
    public final List f32572;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list = null;
        int i2 = 491790476;
        int i3 = C0992.f81922;
        int i4 = C0845.f81821;
        int iM55979 = C0946.m55979("ܳܽ") ^ i4;
        int i5 = ((iM55979 ^ i3) * 3185) ^ 633264583;
        int i6 = -1156606929;
        while (true) {
            i2 = ((((i2 ^ i3) * (-19937)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -2034862906:
                case 1497298058:
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0946.m55979("ۜܺ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM55979 = C0946.m55979("ۙۜ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-1783)) ^ 21286817;
                        i6 = -1414431789;
                    }
                    break;
                case -1889941418:
                case -1004720724:
                    if (C1194.f82045 != 0) {
                        iM55979 = C0873.m55680("᩻ܶ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-14031)) ^ 1119119084;
                        i6 = 1796522285;
                    } else {
                        iM55979 = C0946.m55979("۟ۤ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 7577) ^ 986682798;
                        i6 = -1099295190;
                    }
                    break;
                case -1861780647:
                case -519957608:
                    return (C22404) C1964.m56587(list, i);
                case -1603748756:
                case 466691970:
                    RunnableC0938.m55938();
                    C0873.m55678();
                    return null;
                case -1345554306:
                case -1175156830:
                    if (C1012.m56134() <= 0) {
                        iM55979 = C0946.m55979("ۜܺ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM55979 = C0873.m55680("֡ۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * 22315) ^ 1608560092;
                        i6 = -514846544;
                    }
                    break;
                case -1310648231:
                case -458860871:
                    C1046.m56302();
                    C1012.m56134();
                    iM55979 = C0946.m55979("ۜܺ") ^ i4;
                    i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                    i6 = 1556970233;
                    break;
                case -1214303580:
                case 908084500:
                    C1404.m56468();
                    if (C1229.f82066 >= 0) {
                        iM55979 = (C0873.m55680("᩺ۖ") ^ i3) * (-55);
                        i5 = ((iM55979 ^ i4) * (-31159)) ^ (-1189301857);
                        i6 = 1139454613;
                    } else {
                        iM55979 = C0946.m55979("ۜܺ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    }
                    break;
                case -1048197953:
                case 1406878783:
                    if (C0947.f81895) {
                        iM55979 = C0946.m55979("ۜܺ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM55979 = (i4 - C0946.m55979("ۢ۬")) * 35;
                        i5 = ((iM55979 ^ i3) * 9367) ^ 196141619;
                        i6 = -2116041350;
                    }
                    break;
                case -688094336:
                case 1249973385:
                    if (C0912.m55833()) {
                        iM55979 = C0946.m55979("ۜܺ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM55979 = (C0946.m55979("۟۟") + i3) * 57;
                        i5 = ((iM55979 ^ i4) * 16711) ^ 1515778990;
                        i6 = 392553286;
                    }
                    break;
                case -632501112:
                case 1202351886:
                    if (C0854.m55595() >= 0) {
                        iM55979 = (C0946.m55979("᩹ۨ") + i4) * 15;
                        i5 = ((iM55979 ^ i3) * 22221) ^ 1791811470;
                        i6 = 2051147362;
                    } else {
                        iM55979 = (C0946.m55979("ۗᩴ") + i3) * (-121);
                        i5 = ((iM55979 ^ i4) * (-8805)) ^ 1905375314;
                        i6 = -1731668077;
                    }
                    break;
                case 195765849:
                case 1107061279:
                    if (C1404.f82149 >= 0) {
                        iM55979 = (C0873.m55680("᩺ۖ") ^ i3) * (-55);
                        i5 = ((iM55979 ^ i4) * (-31159)) ^ (-1189301857);
                        i6 = 1139454613;
                    } else {
                        iM55979 = C0946.m55979("ܰܿ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-20847)) ^ 424266374;
                        i6 = -1765136835;
                    }
                    break;
                case 211319722:
                case 922600424:
                    if (C1003.f81929 <= 0) {
                        iM55979 = C0873.m55680("᩻ܶ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-14031)) ^ 1119119084;
                        i6 = 1796522285;
                    } else {
                        iM55979 = C0873.m55680("ۨۘ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-741)) ^ 585574880;
                        i6 = -1239100110;
                    }
                    break;
                case 217132058:
                case 270837261:
                    if (C0882.m55710() != 0) {
                        iM55979 = (C0946.m55979("᩹ۨ") + i4) * 15;
                        i5 = ((iM55979 ^ i3) * 22221) ^ 1791811470;
                        i6 = 2051147362;
                    } else {
                        iM55979 = C0873.m55680("ۢ۟") ^ i4;
                        i5 = ((iM55979 ^ i3) * 26593) ^ (-424328644);
                        i6 = 951643354;
                    }
                    break;
                case 1034765049:
                case 1175464192:
                    C0967.m56074();
                    if (C0992.f81922 < 0) {
                        iM55979 = (C0946.m55979("᩹ۨ") + i4) * 15;
                        i5 = ((iM55979 ^ i3) * 22221) ^ 1791811470;
                        i6 = 2051147362;
                    } else {
                        iM55979 = (C0873.m55680("᩺ۖ") ^ i3) * (-55);
                        i5 = ((iM55979 ^ i4) * (-31159)) ^ (-1189301857);
                        i6 = 1139454613;
                    }
                    break;
                case 1424346288:
                case 2070628802:
                    list = this.f32572;
                    if (C1071.f81975 <= 0) {
                        iM55979 = C0873.m55680("᩻ܶ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-14031)) ^ 1119119084;
                        i6 = 1796522285;
                    } else {
                        iM55979 = C0946.m55979("ܺ۟") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-13429)) ^ 565824459;
                        i6 = 497543222;
                    }
                    break;
                default:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0946.m55979("ۜܺ") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM55979 = C0873.m55680("ܺ۫") ^ i4;
                        i5 = ((iM55979 ^ i3) * 6283) ^ (-1105722894);
                        i6 = 1399423940;
                    }
                    break;
            }
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        List list = null;
        int i2 = -758875927;
        int i3 = C1124.f82007;
        int i4 = C1046.f81962;
        int iM55680 = (i4 - C0873.m55680("᩶ܿ")) * (-35);
        int i5 = ((iM55680 ^ i3) * 23335) ^ 623455811;
        int i6 = -226964978;
        while (true) {
            i2 = ((((i2 ^ i3) * (-31991)) >> 31) & i5) ^ (iM55680 ^ i6);
            switch (i2) {
                case -2120303591:
                case 1123207413:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0946.m55979("֡ۛ") ^ i3) * 123;
                        i5 = ((iM55680 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ܳۤ")) * (-23);
                        i5 = ((iM55680 ^ i3) * 26129) ^ 543314506;
                        i6 = -1331398996;
                    }
                    break;
                case -2091667414:
                case 100105089:
                    if (C1048.f81963) {
                        iM55680 = (C0946.m55979("ᩴۗ") ^ i4) * (-55);
                        i5 = ((iM55680 ^ i3) * (-18949)) ^ (-721502139);
                        i6 = 122104660;
                    } else {
                        iM55680 = (C0946.m55979("᩷֡") ^ i4) * (-93);
                        i5 = ((iM55680 ^ i3) * (-20773)) ^ 1699681980;
                        i6 = -938887918;
                    }
                    break;
                case -1982834807:
                case -1336008058:
                    if (C1003.f81929 <= 0) {
                        iM55680 = (C0946.m55979("֡ۛ") ^ i3) * 123;
                        i5 = ((iM55680 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    } else {
                        iM55680 = (C0946.m55979("۫ۖ") + i3) * 45;
                        i5 = ((iM55680 ^ i4) * 30431) ^ (-557778982);
                        i6 = 12309803;
                    }
                    break;
                case -1978447889:
                case -726937505:
                    if (C0854.f81826 == 0) {
                        iM55680 = C0946.m55979("֫ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 32227) ^ (-513363615);
                        i6 = 882345866;
                    } else {
                        iM55680 = (C0946.m55979("֡ۛ") ^ i3) * 123;
                        i5 = ((iM55680 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    }
                    break;
                case -1816474276:
                case -795331352:
                    if (C0930.f81879 <= 0) {
                        iM55680 = (C0946.m55979("᩷֡") ^ i4) * (-93);
                        i5 = ((iM55680 ^ i3) * (-20773)) ^ 1699681980;
                        i6 = -938887918;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩹۠")) * 93;
                        i5 = ((iM55680 ^ i4) * (-325)) ^ (-178547263);
                        i6 = 1764284261;
                    }
                    break;
                case -1667322312:
                case -667596783:
                    return ((C22404) C1964.m56587(list, i)).f70677;
                case -1621603325:
                case 526589219:
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("֫ۚ") ^ i4;
                        i5 = ((iM55680 ^ i3) * 32227) ^ (-513363615);
                        i6 = 882345866;
                    } else {
                        iM55680 = (C0873.m55680("۬ۛ") ^ i3) * (-103);
                        i5 = ((iM55680 ^ i4) * 14487) ^ (-2129371554);
                        i6 = 580615016;
                    }
                    break;
                case -1421096603:
                case -537002923:
                    if (C1229.m56410() != 0) {
                        iM55680 = C0946.m55979("֫ۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3007) ^ (-1434024034);
                        i6 = 596736916;
                    } else {
                        iM55680 = (C0873.m55680("ܳۜ") ^ i4) * 41;
                        i5 = ((iM55680 ^ i3) * 31661) ^ 1549340570;
                        i6 = 1444599128;
                    }
                    break;
                case -1394449136:
                case 1087970503:
                    list = this.f32572;
                    if (C0930.f81879 <= 0) {
                        iM55680 = (i3 - C0873.m55680("۫ۤ")) * (-75);
                        i5 = ((iM55680 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM55680 = (C0946.m55979("ۡܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM55680 ^ i3) * 6525) ^ (-1734174339);
                        i6 = -625069429;
                    }
                    break;
                case -1335225291:
                case 2029115481:
                    C0947.m55997();
                    C1024.m56209();
                    return 0L;
                case -1301528495:
                case -36497400:
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = (i3 - C0873.m55680("۫ۤ")) * (-75);
                        i5 = ((iM55680 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM55680 = (i4 - C0873.m55680("᩹ᩴ")) * (-93);
                        i5 = ((iM55680 ^ i3) * (-17149)) ^ (-1918393479);
                        i6 = -424754649;
                    }
                    break;
                case -875655006:
                case 897570045:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (i3 - C0873.m55680("۫ۤ")) * (-75);
                        i5 = ((iM55680 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM55680 = (C0873.m55680("᩹ܰ") ^ i3) * (-73);
                        i5 = ((iM55680 ^ i4) * 14625) ^ 569938743;
                        i6 = -2082876203;
                    }
                    break;
                case 467239915:
                case 2101398695:
                    C1194.m56396();
                    if (!C0917.m55854()) {
                        iM55680 = C0946.m55979("֫ۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3007) ^ (-1434024034);
                        i6 = 596736916;
                    } else {
                        iM55680 = (C0946.m55979("᩷֡") ^ i4) * (-93);
                        i5 = ((iM55680 ^ i3) * (-20773)) ^ 1699681980;
                        i6 = -938887918;
                    }
                    break;
                case 827176564:
                case 1563474480:
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i3 - C0873.m55680("۫ۤ")) * (-75);
                        i5 = ((iM55680 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM55680 = (C0946.m55979("ۗ᩷") + i3) * 119;
                        i5 = ((iM55680 ^ i4) * (-17403)) ^ (-1683758863);
                        i6 = 1886466316;
                    }
                    break;
                case 1030163806:
                case 1650371490:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (C0946.m55979("֡ۛ") ^ i3) * 123;
                        i5 = ((iM55680 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    } else {
                        iM55680 = C0946.m55979("֫ۖ") ^ i3;
                        i5 = ((iM55680 ^ i4) * 3007) ^ (-1434024034);
                        i6 = 596736916;
                    }
                    break;
                default:
                    C1964.m56597();
                    C0866.m55645();
                    iM55680 = (C0946.m55979("᩷֡") ^ i4) * (-93);
                    i5 = ((iM55680 ^ i3) * (-20773)) ^ 1699681980;
                    i6 = -938887918;
                    break;
            }
        }
    }

    public C11675(List list) {
        this.f32572 = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return C1048.m56303(this.f32572);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int iM55979;
        int i2;
        int i3;
        int i4;
        short s;
        int i5;
        int i6;
        int iM559710;
        int i7;
        int i8;
        TextView textView;
        short[] sArr;
        int i9;
        int i10;
        int iM55680;
        int i11;
        int iM559711;
        int i12;
        int i13;
        int iM559712;
        int i14;
        int i15;
        String strM55590;
        int iM559713;
        int i16;
        int iM55681;
        int i17;
        int i18 = C0912.f81867;
        int i19 = C0949.f81897;
        int iM55682 = (C0873.m55680("᩵ۛ") + i18) * (-117);
        int i20 = ((iM55682 ^ i19) * 17185) ^ (-2072845218);
        String str = null;
        String strM55639 = null;
        StringBuilder sbM21133 = null;
        String strM55726 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i21 = iM55682 ^ (-1260130771);
        int iM559714 = 0;
        int iM559715 = 0;
        int iM55683 = 0;
        int i22 = 0;
        short s2 = 0;
        int i23 = 0;
        int i24 = 0;
        View viewM55755 = null;
        TextView textView2 = null;
        String strM56558 = null;
        String str2 = null;
        long jM55944 = 0;
        CharSequence relativeTimeSpanString = null;
        String strM55689 = null;
        int i25 = 0;
        int i26 = 1775008539;
        C22404 c22404 = null;
        TextView textView3 = null;
        String strM55591 = null;
        int i27 = 0;
        int i28 = 0;
        Context contextM55963 = null;
        View viewM34686 = null;
        while (true) {
            int i29 = i21 ^ (i20 & (((i26 ^ i19) * 15087) >> 31));
            switch (i29) {
                case -2093514225:
                case -1922863129:
                    i29 = i29;
                    viewM34686 = viewM34686;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    i23 = i23;
                    i24 = i24;
                    s2 = sArr2[0];
                    i22 = s2 * s2;
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("᩻ۤ") ^ i19;
                        i2 = ((iM55979 ^ i18) * (-2201)) ^ (-2011843264);
                        i3 = -1875129257;
                    } else {
                        iM55979 = C0873.m55680("֡᩸") ^ i19;
                        i2 = ((iM55979 ^ i18) * (-29427)) ^ 332650097;
                        i3 = -138892282;
                    }
                    int i30 = iM55979 ^ i3;
                    i24 = i24;
                    textView2 = textView2;
                    contextM55963 = contextM55963;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    i21 = i30;
                    i20 = i2;
                    viewM34686 = viewM34686;
                    break;
                case -2038764478:
                case -804062841:
                    i29 = i29;
                    textView2 = textView2;
                    viewM34686 = C1514.m34686(viewGroup, iM559715 ^ 2128058322, viewGroup, false);
                    contextM55963 = contextM55963;
                    sArr3 = sArr3;
                    i23 = i23;
                    i24 = i24;
                    iM559711 = (i19 - C0873.m55680("ۚۢ")) * 77;
                    i7 = ((iM559711 ^ i18) * (-32315)) ^ 296032652;
                    i12 = -110010675;
                    i13 = iM559711 ^ i12;
                    i24 = i24;
                    textView2 = textView2;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context;
                    break;
                case -1902626710:
                case 1965409201:
                    i29 = i29;
                    textView2 = textView2;
                    strM55689 = C0873.m55689(f82113, 16, 3, i27);
                    if (!C0967.m56074()) {
                        iM559712 = (C0873.m55680("᩵᩻") ^ i18) * (-97);
                        i14 = ((iM559712 ^ i19) * (-26119)) ^ 195262610;
                        i15 = 828929616;
                        i21 = iM559712 ^ i15;
                        i20 = i14;
                        textView2 = textView2;
                        i26 = i29;
                    } else {
                        contextM55963 = contextM55963;
                        iM55680 = C0873.m55680("֨۟") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM55680 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context2 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context2;
                    }
                    break;
                case -1747526003:
                case -378265216:
                    relativeTimeSpanString = C0845.m55590(contextM55963, C0873.m55680(C0882.m55717(f82113, 31, 3, i27)) ^ 2122964222);
                    iM559713 = C0946.m55979("֫ܶ") ^ i18;
                    i4 = ((iM559713 ^ i19) * 7853) ^ (-236789157);
                    i16 = 2069952365;
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -1663561046:
                case -1595165519:
                    i29 = i29;
                    textView2 = textView2;
                    contextM55963 = contextM55963;
                    iM559715 = C0946.m55979(C0861.m55618(f82113, 7, 3, i27));
                    if (C1194.m56396() > 0) {
                        iM55680 = (C0873.m55680("᩸۬") + i19) * 17;
                        i7 = ((iM55680 ^ i18) * (-137)) ^ (-1661391577);
                        i11 = -1092306755;
                        i13 = iM55680 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context3 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context3;
                    }
                    s = s2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    iM559710 = (i18 - C0873.m55680("ۘܰ")) * (-91);
                    i7 = ((iM559710 ^ i19) * 27103) ^ (-703603024);
                    i8 = -374522428;
                    i13 = iM559710 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM34686 = viewM34686;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context4 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context4;
                    break;
                case -1626857264:
                case -861486657:
                    i29 = i29;
                    C0947.m55997();
                    if (!C0927.f81875) {
                        contextM55963 = contextM55963;
                        textView2 = textView2;
                        iM55680 = C0873.m55680("֨۟") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM55680 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context5 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context5;
                    } else {
                        textView = textView2;
                        sArr = sArr3;
                        i9 = i23;
                        i10 = i24;
                        int iM559716 = C0946.m55979("ۢ᩶") ^ i19;
                        i20 = ((iM559716 ^ i18) * 26717) ^ (-1680308630);
                        i21 = iM559716 ^ (-790861964);
                        i24 = i10;
                        textView2 = textView;
                        i23 = i9;
                        sArr3 = sArr;
                        i26 = i29;
                    }
                    break;
                case -1481151477:
                case 1161669533:
                    i29 = i29;
                    textView = textView2;
                    sArr = sArr3;
                    i9 = i23;
                    i10 = i24;
                    contextM55963 = AbstractC0942.m55963(viewM34686);
                    c22404 = (C22404) C1964.m56587(this.f32572, i);
                    if (C0917.f81868) {
                        int iM559717 = C0946.m55979("ۢ᩶") ^ i19;
                        i20 = ((iM559717 ^ i18) * 26717) ^ (-1680308630);
                        i21 = iM559717 ^ (-790861964);
                        i24 = i10;
                        textView2 = textView;
                        i23 = i9;
                    } else {
                        int iM55684 = C0873.m55680("ܳ᩷") ^ i19;
                        i21 = iM55684 ^ (-1722535724);
                        i20 = ((iM55684 ^ i18) * (-13173)) ^ 1935675623;
                        i24 = i10;
                        textView2 = textView;
                        i23 = i9;
                        viewM34686 = viewM34686;
                    }
                    sArr3 = sArr;
                    i26 = i29;
                    break;
                case -1439797604:
                case 359795013:
                    relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(c22404.f70676, jM55944, 60000L);
                    iM559713 = C0946.m55979("֫ܶ") ^ i18;
                    i4 = ((iM559713 ^ i19) * 7853) ^ (-236789157);
                    i16 = 2069952365;
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -1416781286:
                case 2088054414:
                    i29 = i29;
                    sbM21133 = C9179.m21133(str2, strM56558);
                    textView2 = textView2;
                    iM55683 = C0873.m55680(C0927.m55863(f82113, 19, 3, i27));
                    if (!C0927.f81875) {
                        iM559712 = C0946.m55979("֨֡") ^ i18;
                        i14 = ((iM559712 ^ i19) * (-20081)) ^ 200223318;
                        i15 = 1882836012;
                        i21 = iM559712 ^ i15;
                        i20 = i14;
                        textView2 = textView2;
                        i26 = i29;
                    } else {
                        contextM55963 = contextM55963;
                        s = s2;
                        sArr3 = sArr3;
                        i5 = i23;
                        i6 = i24;
                        iM559710 = (i18 - C0873.m55680("ۘܰ")) * (-91);
                        i7 = ((iM559710 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                        i13 = iM559710 ^ i8;
                        s2 = s;
                        i24 = i6;
                        textView2 = textView2;
                        i23 = i5;
                        viewM34686 = viewM34686;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context6 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context6;
                    }
                    break;
                case -1353859561:
                case 1130737613:
                    i29 = i29;
                    textView2 = textView2;
                    if (C1194.m56397(str)) {
                        iM559712 = C0946.m55979("ܺ֡") ^ i19;
                        i14 = ((iM559712 ^ i18) * (-24541)) ^ (-1692826876);
                        i15 = 1473139179;
                    } else {
                        str2 = str;
                        iM559712 = (i19 - C0946.m55979("᩵ۘ")) * 99;
                        i14 = ((iM559712 ^ i18) * 13693) ^ 1694230115;
                        i15 = -1280069691;
                    }
                    i21 = iM559712 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -1298925036:
                case -353323359:
                    i29 = i29;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    short[] sArr4 = sArr3;
                    int i31 = i23;
                    i24 = i24;
                    sArr3 = sArr4;
                    viewM55755 = C0892.m55755(viewM34686, C0873.m55680(C1071.m56336(sArr4, i31, i24, i27)) ^ 2117075144);
                    if (C0882.f81846) {
                        iM559711 = C0946.m55979("ۚ᩵") ^ i19;
                        i23 = i31;
                        i7 = ((iM559711 ^ i18) * 7305) ^ (-1033634308);
                        i12 = 943896509;
                    } else {
                        i23 = i31;
                        iM559711 = C0946.m55979("ܶۤ") ^ i18;
                        i7 = ((iM559711 ^ i19) * 11299) ^ 1614584550;
                        i12 = -2051385469;
                    }
                    i13 = iM559711 ^ i12;
                    i24 = i24;
                    textView2 = textView2;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context7 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context7;
                    break;
                case -1238612557:
                case 1451091797:
                    i29 = i29;
                    viewM34686 = viewM34686;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    s = s2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    sArr2 = f82113;
                    if (C0882.f81846) {
                        iM559710 = (i18 - C0873.m55680("ۘܰ")) * (-91);
                        i7 = ((iM559710 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                    } else {
                        iM559710 = (C0946.m55979("ܳۘ") + i18) * (-73);
                        i7 = ((iM559710 ^ i19) * (-7707)) ^ (-941382187);
                        i8 = 663135416;
                    }
                    i13 = iM559710 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM34686 = viewM34686;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context8 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context8;
                    break;
                case -1213017717:
                case -965711239:
                    i29 = i29;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    textView3 = (TextView) viewM55755;
                    iM559714 = C0946.m55979(C1404.m56462(f82113, 4, 3, i27));
                    if (C1404.m56468()) {
                        iM55680 = C0946.m55979("ۗ᩹") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-5805)) ^ 147176065;
                        i11 = -502110228;
                        i13 = iM55680 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context9 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context9;
                    }
                    s = s2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    iM559710 = (i18 - C0873.m55680("ۘܰ")) * (-91);
                    i7 = ((iM559710 ^ i19) * 27103) ^ (-703603024);
                    i8 = -374522428;
                    i13 = iM559710 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM34686 = viewM34686;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context10 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context10;
                    break;
                case -1198796980:
                case 53638918:
                    i29 = i29;
                    textView2 = textView2;
                    boolean z = c22404.f70672;
                    strM56558 = C1929.m56558(f82113, 13, 3, i27);
                    if (z) {
                        iM559712 = (i18 - C0946.m55979("ᩴ۫")) * 93;
                        i14 = ((iM559712 ^ i19) * 11185) ^ 1522386667;
                        i15 = -470780025;
                    } else {
                        strM55639 = str2;
                        iM559712 = (C0946.m55979("᩶ۨ") ^ i19) * (-39);
                        i14 = ((iM559712 ^ i18) * (-26133)) ^ (-808637055);
                        i15 = -1629206572;
                    }
                    i21 = iM559712 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -1096119935:
                case 2098551840:
                    i29 = i29;
                    textView2 = textView2;
                    RunnableC0938.m55928(textView3, strM55639);
                    i25 = c22404.f70673;
                    if (i25 == 3) {
                        iM559712 = (i18 - C0873.m55680("ۤ᩵")) * (-33);
                        i14 = ((iM559712 ^ i19) * 22769) ^ (-934129199);
                        i15 = -2138217783;
                    } else {
                        iM559712 = (i19 - C0946.m55979("ܺܽ")) * 79;
                        i14 = ((iM559712 ^ i18) * (-13661)) ^ (-907506563);
                        i15 = 1029195774;
                    }
                    i21 = iM559712 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -1081192475:
                case 741713395:
                    i29 = i29;
                    textView2 = textView2;
                    if (i25 == 2) {
                        iM559713 = C0946.m55979("ۛۚ") ^ i18;
                        i4 = ((iM559713 ^ i19) * (-4615)) ^ (-671224470);
                        i16 = 80005459;
                    } else {
                        iM559713 = C0946.m55979("᩷ۡ") ^ i19;
                        i4 = ((iM559713 ^ i18) * 27507) ^ 146802262;
                        i16 = -1902304100;
                    }
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -1051615859:
                case -518728384:
                    if (!C0882.f81846) {
                        i29 = i29;
                        contextM55963 = contextM55963;
                        textView2 = textView2;
                        iM55680 = C0873.m55680("֨۟") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM55680 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context11 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context11;
                    } else {
                        int iM559718 = C0946.m55979("֨ۙ") ^ i18;
                        i29 = i29;
                        i20 = ((iM559718 ^ i19) * (-9759)) ^ (-1372987828);
                        i21 = iM559718 ^ (-591245963);
                        i26 = i29;
                    }
                    break;
                case -1032468780:
                case 1726984334:
                    iM55681 = C0873.m55680(C1044.m56276(f82113, 22, 3, i27));
                    i17 = 2121891365;
                    i28 = iM55681 ^ i17;
                    iM559713 = C0873.m55680("ۛۜ") ^ i19;
                    i4 = ((iM559713 ^ i18) * 7773) ^ 256025066;
                    i16 = 246425565;
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -882747150:
                case 871605057:
                    i29 = i29;
                    C0912.m55825(sbM21133, C0845.m55590(contextM55963, iM55683 ^ 2097315404));
                    textView2 = textView2;
                    strM55639 = C0863.m55639(sbM21133);
                    iM559712 = (C0946.m55979("᩶ۨ") ^ i19) * (-39);
                    i14 = ((iM559712 ^ i18) * (-26133)) ^ (-808637055);
                    i15 = -1629206572;
                    i21 = iM559712 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -672763750:
                case 1543189463:
                    i29 = i29;
                    textView2 = textView2;
                    strM55591 = C0845.m55590(contextM55963, i28);
                    jM55944 = ViewOnClickListenerC0939.m55944();
                    if (Math.abs(jM55944 - c22404.f70676) < 60000) {
                        iM559713 = (i19 - C0873.m55680("ۡ᩹")) * 57;
                        i4 = ((iM559713 ^ i18) * 10427) ^ (-1446129437);
                        i16 = -203879693;
                    } else {
                        iM559713 = (i18 - C0946.m55979("᩺ܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM559713 ^ i19) * (-28789)) ^ 2044233041;
                        i16 = 1093868066;
                    }
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -403907424:
                case 863393484:
                    i27 = 218;
                    iM55979 = C0946.m55979("᩷ۖ") ^ i18;
                    i2 = ((iM55979 ^ i19) * (-2349)) ^ (-694095181);
                    i3 = -1435540189;
                    int i32 = iM55979 ^ i3;
                    i24 = i24;
                    textView2 = textView2;
                    contextM55963 = contextM55963;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    i21 = i32;
                    i20 = i2;
                    viewM34686 = viewM34686;
                    break;
                case -374962808:
                case 137265420:
                    i29 = i29;
                    viewM34686 = viewM34686;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    i23 = i23;
                    i24 = i24;
                    if (view != null) {
                        viewM34686 = view;
                        iM559711 = (i19 - C0873.m55680("ۚۢ")) * 77;
                        i7 = ((iM559711 ^ i18) * (-32315)) ^ 296032652;
                        i12 = -110010675;
                        i13 = iM559711 ^ i12;
                        i24 = i24;
                        textView2 = textView2;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context12 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context12;
                    } else {
                        iM55979 = (C0946.m55979("ܶᩴ") + i18) * (-121);
                        i2 = ((iM55979 ^ i19) * 28413) ^ (-329087901);
                        i3 = 1413724495;
                        int i33 = iM55979 ^ i3;
                        i24 = i24;
                        textView2 = textView2;
                        contextM55963 = contextM55963;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        i21 = i33;
                        i20 = i2;
                        viewM34686 = viewM34686;
                    }
                    break;
                case 52306746:
                case 734877072:
                    i29 = i29;
                    textView2 = textView2;
                    strM55726 = C0890.m55726(f82113, 10, 3, i27);
                    if (C1404.f82149 < 0) {
                        iM559712 = C0873.m55680("ܰۢ") ^ i18;
                        i14 = ((iM559712 ^ i19) * (-8577)) ^ (-514135322);
                        i15 = 1443866904;
                        i21 = iM559712 ^ i15;
                        i20 = i14;
                        textView2 = textView2;
                        i26 = i29;
                    } else {
                        contextM55963 = contextM55963;
                        s = s2;
                        sArr3 = sArr3;
                        i5 = i23;
                        i6 = i24;
                        iM559710 = (i18 - C0873.m55680("ۘܰ")) * (-91);
                        i7 = ((iM559710 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                        i13 = iM559710 ^ i8;
                        s2 = s;
                        i24 = i6;
                        textView2 = textView2;
                        i23 = i5;
                        viewM34686 = viewM34686;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context13 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context13;
                    }
                    break;
                case 124491766:
                case 938641759:
                    i29 = i29;
                    if (RunnableC0897.f81856) {
                        viewM34686 = viewM34686;
                        contextM55963 = contextM55963;
                        textView2 = textView2;
                        s = s2;
                        sArr3 = sArr3;
                        i5 = i23;
                        i6 = i24;
                        iM559710 = (i18 - C0873.m55680("ۘܰ")) * (-91);
                        i7 = ((iM559710 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                        i13 = iM559710 ^ i8;
                        s2 = s;
                        i24 = i6;
                        textView2 = textView2;
                        i23 = i5;
                        viewM34686 = viewM34686;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context14 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context14;
                    }
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    iM55680 = C0873.m55680("֨۟") ^ i19;
                    i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                    i11 = -422019428;
                    i13 = iM55680 ^ i11;
                    textView2 = textView2;
                    i26 = i29;
                    Context context15 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context15;
                    break;
                case 160040070:
                case 1200287714:
                    i29 = i29;
                    if (C1124.f82007 < 0) {
                        int iM559719 = (i18 - C0946.m55979("֫ܿ")) * 15;
                        i4 = ((iM559719 ^ i19) * (-1897)) ^ 1698871011;
                        i21 = iM559719 ^ (-819286977);
                        i20 = i4;
                        i26 = i29;
                    } else {
                        viewM34686 = viewM34686;
                        contextM55963 = contextM55963;
                        textView2 = textView2;
                        sArr3 = sArr3;
                        i23 = i23;
                        i24 = i24;
                        iM55979 = C0873.m55680("᩻ۤ") ^ i19;
                        i2 = ((iM55979 ^ i18) * (-2201)) ^ (-2011843264);
                        i3 = -1875129257;
                        int i34 = iM55979 ^ i3;
                        i24 = i24;
                        textView2 = textView2;
                        contextM55963 = contextM55963;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        i21 = i34;
                        i20 = i2;
                        viewM34686 = viewM34686;
                    }
                    break;
                case 277296088:
                case 365270846:
                    strM55590 = C0845.m55590(contextM55963, C0873.m55680(strM55726) ^ 2129697036);
                    str2 = strM55590;
                    iM559712 = (i19 - C0946.m55979("᩵ۘ")) * 99;
                    i14 = ((iM559712 ^ i18) * 13693) ^ 1694230115;
                    i15 = -1280069691;
                    i21 = iM559712 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case 388288364:
                case 950704658:
                    StringBuilder sb = new StringBuilder();
                    C1003.m56121(sb, strM55591);
                    C1003.m56121(sb, strM56558);
                    C1028.m56245(sb, relativeTimeSpanString);
                    C0894.m55771(textView2, C0863.m55639(sb));
                    return viewM34686;
                case 722500129:
                case 1164629674:
                    i27 = 31798;
                    iM55979 = C0946.m55979("᩷ۖ") ^ i18;
                    i2 = ((iM55979 ^ i19) * (-2349)) ^ (-694095181);
                    i3 = -1435540189;
                    int i35 = iM55979 ^ i3;
                    i24 = i24;
                    textView2 = textView2;
                    contextM55963 = contextM55963;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    i21 = i35;
                    i20 = i2;
                    viewM34686 = viewM34686;
                    break;
                case 752113731:
                case 1073890646:
                    i29 = i29;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    sArr3 = f82113;
                    i23 = 1;
                    i24 = 3;
                    if (C0861.m55626()) {
                        iM55680 = C0873.m55680("֨۟") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                    } else {
                        iM55680 = (C0873.m55680("᩶᩷") + i18) * (-75);
                        i7 = ((iM55680 ^ i19) * 2815) ^ (-1300638860);
                        i11 = -932630600;
                    }
                    i13 = iM55680 ^ i11;
                    textView2 = textView2;
                    i26 = i29;
                    Context context16 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context16;
                    break;
                case 787409111:
                case 1129654567:
                    i29 = i29;
                    viewM34686 = viewM34686;
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    int i36 = i22 + 386397649;
                    s = s2;
                    int i37 = s + 19657;
                    if ((i37 * i37) - (i36 + i36) <= 0) {
                        iM559710 = (i18 - C0946.m55979("᩸ܽ")) * 61;
                        i7 = ((iM559710 ^ i19) * (-24325)) ^ 991695067;
                        i8 = -1048721165;
                    } else {
                        iM559710 = (C0873.m55680("ۜ۫") + i19) * (-127);
                        i7 = ((iM559710 ^ i18) * (-9491)) ^ (-86777466);
                        i8 = 112457492;
                    }
                    i13 = iM559710 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM34686 = viewM34686;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context17 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context17;
                    break;
                case 994313544:
                case 1068303705:
                    Context context18 = contextM55963;
                    TextView textView4 = (TextView) C0892.m55755(viewM34686, iM559714 ^ 2099102197);
                    String str3 = c22404.f70678;
                    if (c22404.f70674) {
                        int iM559720 = C0946.m55979("ܶ۠") ^ i18;
                        i20 = ((iM559720 ^ i19) * (-23869)) ^ 350048546;
                        str = str3;
                        textView2 = textView4;
                        contextM55963 = context18;
                        i26 = i29;
                        i21 = iM559720 ^ 1745315950;
                    } else {
                        int iM55685 = C0873.m55680("᩷֡") ^ i19;
                        str = str3;
                        textView2 = textView4;
                        contextM55963 = context18;
                        i26 = i29;
                        i21 = iM55685 ^ (-1708123679);
                        i20 = ((iM55685 ^ i18) * (-28311)) ^ (-1493620318);
                    }
                    break;
                case 1066288269:
                case 1997948330:
                    AbstractC0942.m55971();
                    C0861.m55626();
                    return null;
                case 1080824868:
                case 1643515486:
                    strM55590 = C0845.m55590(contextM55963, C0946.m55979(strM55689) ^ 2100863574);
                    str2 = strM55590;
                    iM559712 = (i19 - C0946.m55979("᩵ۘ")) * 99;
                    i14 = ((iM559712 ^ i18) * 13693) ^ 1694230115;
                    i15 = -1280069691;
                    i21 = iM559712 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case 1192151448:
                case 1396465527:
                    iM55681 = C0946.m55979(C1025.m56233(f82113, 28, 3, i27));
                    i17 = 2119593304;
                    i28 = iM55681 ^ i17;
                    iM559713 = C0873.m55680("ۛۜ") ^ i19;
                    i4 = ((iM559713 ^ i18) * 7773) ^ 256025066;
                    i16 = 246425565;
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case 1193348814:
                case 1472762864:
                    iM55681 = C0946.m55979(C1003.m56132(f82113, 25, 3, i27));
                    i17 = 2123763067;
                    i28 = iM55681 ^ i17;
                    iM559713 = C0873.m55680("ۛۜ") ^ i19;
                    i4 = ((iM559713 ^ i18) * 7773) ^ 256025066;
                    i16 = 246425565;
                    i21 = iM559713 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case 1231977400:
                case 1513069701:
                    i29 = i29;
                    C1003.m56123();
                    contextM55963 = contextM55963;
                    textView2 = textView2;
                    iM55680 = C0873.m55680("֨۟") ^ i19;
                    i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                    i11 = -422019428;
                    i13 = iM55680 ^ i11;
                    textView2 = textView2;
                    i26 = i29;
                    Context context19 = contextM55963;
                    i21 = i13;
                    i20 = i7;
                    contextM55963 = context19;
                    break;
                default:
                    i29 = i29;
                    if (C0866.f81837 < 0) {
                        viewM34686 = viewM34686;
                        contextM55963 = contextM55963;
                        textView2 = textView2;
                        sArr3 = sArr3;
                        i23 = i23;
                        i24 = i24;
                        iM55979 = C0873.m55680("᩻ۤ") ^ i19;
                        i2 = ((iM55979 ^ i18) * (-2201)) ^ (-2011843264);
                        i3 = -1875129257;
                        int i38 = iM55979 ^ i3;
                        i24 = i24;
                        textView2 = textView2;
                        contextM55963 = contextM55963;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        i21 = i38;
                        i20 = i2;
                        viewM34686 = viewM34686;
                    } else {
                        contextM55963 = contextM55963;
                        textView2 = textView2;
                        iM55680 = C0873.m55680("֨۟") ^ i19;
                        i7 = ((iM55680 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM55680 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context110 = contextM55963;
                        i21 = i13;
                        i20 = i7;
                        contextM55963 = context110;
                    }
                    break;
            }
        }
    }
}
