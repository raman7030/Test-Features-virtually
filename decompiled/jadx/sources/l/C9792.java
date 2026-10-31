package l;

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
public final class C9792 extends BaseAdapter {

    /* JADX INFO: renamed from: ۙ۠᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f29620 = {1552, 20648, 24574, -31576, -30141, 31647, -28700, 31034, -30487, -27078, 32151, 24391, -24858, 250, 109, 250, -28454, 28522, -27624, -30856, -25601, -31232, 23665, 32474, 22525, 25313, -25770, 28176, 20896, -26926, 24234, 27159, 22046, 26786};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f29621;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        List list = null;
        int i2 = 491790476;
        int i3 = C3019.f9544;
        int i4 = C0050.f910;
        int iM6981 = C2105.m6981("ܳܽ") ^ i4;
        int i5 = ((iM6981 ^ i3) * 3185) ^ 633264583;
        int i6 = -1156606929;
        while (true) {
            i2 = ((((i2 ^ i3) * (-19937)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -2034862906:
                case 1497298058:
                    if (C4117.f13076 <= 0) {
                        iM6981 = C2105.m6981("ۜܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM6981 = C2105.m6981("ۙۜ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-1783)) ^ 21286817;
                        i6 = -1414431789;
                    }
                    break;
                case -1889941418:
                case -1004720724:
                    if (C7106.f21815 != 0) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-14031)) ^ 1119119084;
                        i6 = 1796522285;
                    } else {
                        iM6981 = C2105.m6981("۟ۤ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 7577) ^ 986682798;
                        i6 = -1099295190;
                    }
                    break;
                case -1861780647:
                case -519957608:
                    return (C21081) C22628.m50605(list, i);
                case -1603748756:
                case 466691970:
                    RunnableC1937.m6387();
                    C0630.m2564();
                    return null;
                case -1345554306:
                case -1175156830:
                    if (C3432.m10477() <= 0) {
                        iM6981 = C2105.m6981("ۜܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM6981 = C0630.m2566("֡ۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * 22315) ^ 1608560092;
                        i6 = -514846544;
                    }
                    break;
                case -1310648231:
                case -458860871:
                    C4117.m12364();
                    C3432.m10477();
                    iM6981 = C2105.m6981("ۜܺ") ^ i4;
                    i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                    i6 = 1556970233;
                    break;
                case -1214303580:
                case 908084500:
                    C11340.m28031();
                    if (C7811.f24123 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۖ") ^ i3) * (-55);
                        i5 = ((iM6981 ^ i4) * (-31159)) ^ (-1189301857);
                        i6 = 1139454613;
                    } else {
                        iM6981 = C2105.m6981("ۜܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    }
                    break;
                case -1048197953:
                case 1406878783:
                    if (C2126.f7087) {
                        iM6981 = C2105.m6981("ۜܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM6981 = (i4 - C2105.m6981("ۢ۬")) * 35;
                        i5 = ((iM6981 ^ i3) * 9367) ^ 196141619;
                        i6 = -2116041350;
                    }
                    break;
                case -688094336:
                case 1249973385:
                    if (C1420.m4913()) {
                        iM6981 = C2105.m6981("ۜܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM6981 = (C2105.m6981("۟۟") + i3) * 57;
                        i5 = ((iM6981 ^ i4) * 16711) ^ 1515778990;
                        i6 = 392553286;
                    }
                    break;
                case -632501112:
                case 1202351886:
                    if (C0237.m1481() >= 0) {
                        iM6981 = (C2105.m6981("᩹ۨ") + i4) * 15;
                        i5 = ((iM6981 ^ i3) * 22221) ^ 1791811470;
                        i6 = 2051147362;
                    } else {
                        iM6981 = (C2105.m6981("ۗᩴ") + i3) * (-121);
                        i5 = ((iM6981 ^ i4) * (-8805)) ^ 1905375314;
                        i6 = -1731668077;
                    }
                    break;
                case 195765849:
                case 1107061279:
                    if (C11340.f33930 >= 0) {
                        iM6981 = (C0630.m2566("᩺ۖ") ^ i3) * (-55);
                        i5 = ((iM6981 ^ i4) * (-31159)) ^ (-1189301857);
                        i6 = 1139454613;
                    } else {
                        iM6981 = C2105.m6981("ܰܿ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-20847)) ^ 424266374;
                        i6 = -1765136835;
                    }
                    break;
                case 211319722:
                case 922600424:
                    if (C3245.f10203 <= 0) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-14031)) ^ 1119119084;
                        i6 = 1796522285;
                    } else {
                        iM6981 = C0630.m2566("ۨۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-741)) ^ 585574880;
                        i6 = -1239100110;
                    }
                    break;
                case 217132058:
                case 270837261:
                    if (C0798.m2998() != 0) {
                        iM6981 = (C2105.m6981("᩹ۨ") + i4) * 15;
                        i5 = ((iM6981 ^ i3) * 22221) ^ 1791811470;
                        i6 = 2051147362;
                    } else {
                        iM6981 = C0630.m2566("ۢ۟") ^ i4;
                        i5 = ((iM6981 ^ i3) * 26593) ^ (-424328644);
                        i6 = 951643354;
                    }
                    break;
                case 1034765049:
                case 1175464192:
                    C2520.m8026();
                    if (C3019.f9544 < 0) {
                        iM6981 = (C2105.m6981("᩹ۨ") + i4) * 15;
                        i5 = ((iM6981 ^ i3) * 22221) ^ 1791811470;
                        i6 = 2051147362;
                    } else {
                        iM6981 = (C0630.m2566("᩺ۖ") ^ i3) * (-55);
                        i5 = ((iM6981 ^ i4) * (-31159)) ^ (-1189301857);
                        i6 = 1139454613;
                    }
                    break;
                case 1424346288:
                case 2070628802:
                    list = this.f29621;
                    if (C4616.f14690 <= 0) {
                        iM6981 = C0630.m2566("᩻ܶ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-14031)) ^ 1119119084;
                        i6 = 1796522285;
                    } else {
                        iM6981 = C2105.m6981("ܺ۟") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-13429)) ^ 565824459;
                        i6 = 497543222;
                    }
                    break;
                default:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C2105.m6981("ۜܺ") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-30705)) ^ 1102107909;
                        i6 = 1556970233;
                    } else {
                        iM6981 = C0630.m2566("ܺ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 6283) ^ (-1105722894);
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
        int i3 = C5695.f17556;
        int i4 = C4117.f13076;
        int iM2566 = (i4 - C0630.m2566("᩶ܿ")) * (-35);
        int i5 = ((iM2566 ^ i3) * 23335) ^ 623455811;
        int i6 = -226964978;
        while (true) {
            i2 = ((((i2 ^ i3) * (-31991)) >> 31) & i5) ^ (iM2566 ^ i6);
            switch (i2) {
                case -2120303591:
                case 1123207413:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C2105.m6981("֡ۛ") ^ i3) * 123;
                        i5 = ((iM2566 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ܳۤ")) * (-23);
                        i5 = ((iM2566 ^ i3) * 26129) ^ 543314506;
                        i6 = -1331398996;
                    }
                    break;
                case -2091667414:
                case 100105089:
                    if (C4159.f13567) {
                        iM2566 = (C2105.m6981("ᩴۗ") ^ i4) * (-55);
                        i5 = ((iM2566 ^ i3) * (-18949)) ^ (-721502139);
                        i6 = 122104660;
                    } else {
                        iM2566 = (C2105.m6981("᩷֡") ^ i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-20773)) ^ 1699681980;
                        i6 = -938887918;
                    }
                    break;
                case -1982834807:
                case -1336008058:
                    if (C3245.f10203 <= 0) {
                        iM2566 = (C2105.m6981("֡ۛ") ^ i3) * 123;
                        i5 = ((iM2566 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    } else {
                        iM2566 = (C2105.m6981("۫ۖ") + i3) * 45;
                        i5 = ((iM2566 ^ i4) * 30431) ^ (-557778982);
                        i6 = 12309803;
                    }
                    break;
                case -1978447889:
                case -726937505:
                    if (C0237.f1507 == 0) {
                        iM2566 = C2105.m6981("֫ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32227) ^ (-513363615);
                        i6 = 882345866;
                    } else {
                        iM2566 = (C2105.m6981("֡ۛ") ^ i3) * 123;
                        i5 = ((iM2566 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    }
                    break;
                case -1816474276:
                case -795331352:
                    if (C1773.f6144 <= 0) {
                        iM2566 = (C2105.m6981("᩷֡") ^ i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-20773)) ^ 1699681980;
                        i6 = -938887918;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩹۠")) * 93;
                        i5 = ((iM2566 ^ i4) * (-325)) ^ (-178547263);
                        i6 = 1764284261;
                    }
                    break;
                case -1667322312:
                case -667596783:
                    return ((C21081) C22628.m50605(list, i)).f67995;
                case -1621603325:
                case 526589219:
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("֫ۚ") ^ i4;
                        i5 = ((iM2566 ^ i3) * 32227) ^ (-513363615);
                        i6 = 882345866;
                    } else {
                        iM2566 = (C0630.m2566("۬ۛ") ^ i3) * (-103);
                        i5 = ((iM2566 ^ i4) * 14487) ^ (-2129371554);
                        i6 = 580615016;
                    }
                    break;
                case -1421096603:
                case -537002923:
                    if (C7811.m20844() != 0) {
                        iM2566 = C2105.m6981("֫ۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 3007) ^ (-1434024034);
                        i6 = 596736916;
                    } else {
                        iM2566 = (C0630.m2566("ܳۜ") ^ i4) * 41;
                        i5 = ((iM2566 ^ i3) * 31661) ^ 1549340570;
                        i6 = 1444599128;
                    }
                    break;
                case -1394449136:
                case 1087970503:
                    list = this.f29621;
                    if (C1773.f6144 <= 0) {
                        iM2566 = (i3 - C0630.m2566("۫ۤ")) * (-75);
                        i5 = ((iM2566 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM2566 = (C2105.m6981("ۡܿ") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((iM2566 ^ i3) * 6525) ^ (-1734174339);
                        i6 = -625069429;
                    }
                    break;
                case -1335225291:
                case 2029115481:
                    C2126.m7040();
                    C3663.m11168();
                    return 0L;
                case -1301528495:
                case -36497400:
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = (i3 - C0630.m2566("۫ۤ")) * (-75);
                        i5 = ((iM2566 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM2566 = (i4 - C0630.m2566("᩹ᩴ")) * (-93);
                        i5 = ((iM2566 ^ i3) * (-17149)) ^ (-1918393479);
                        i6 = -424754649;
                    }
                    break;
                case -875655006:
                case 897570045:
                    if (C1128.f4106 <= 0) {
                        iM2566 = (i3 - C0630.m2566("۫ۤ")) * (-75);
                        i5 = ((iM2566 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM2566 = (C0630.m2566("᩹ܰ") ^ i3) * (-73);
                        i5 = ((iM2566 ^ i4) * 14625) ^ 569938743;
                        i6 = -2082876203;
                    }
                    break;
                case 467239915:
                case 2101398695:
                    C7106.m19120();
                    if (!C1504.m5179()) {
                        iM2566 = C2105.m6981("֫ۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 3007) ^ (-1434024034);
                        i6 = 596736916;
                    } else {
                        iM2566 = (C2105.m6981("᩷֡") ^ i4) * (-93);
                        i5 = ((iM2566 ^ i3) * (-20773)) ^ 1699681980;
                        i6 = -938887918;
                    }
                    break;
                case 827176564:
                case 1563474480:
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i3 - C0630.m2566("۫ۤ")) * (-75);
                        i5 = ((iM2566 ^ i4) * (-23351)) ^ 80781513;
                        i6 = 185145465;
                    } else {
                        iM2566 = (C2105.m6981("ۗ᩷") + i3) * 119;
                        i5 = ((iM2566 ^ i4) * (-17403)) ^ (-1683758863);
                        i6 = 1886466316;
                    }
                    break;
                case 1030163806:
                case 1650371490:
                    if (C3537.f11231 >= 0) {
                        iM2566 = (C2105.m6981("֡ۛ") ^ i3) * 123;
                        i5 = ((iM2566 ^ i4) * 3367) ^ 1945612132;
                        i6 = -496165164;
                    } else {
                        iM2566 = C2105.m6981("֫ۖ") ^ i3;
                        i5 = ((iM2566 ^ i4) * 3007) ^ (-1434024034);
                        i6 = 596736916;
                    }
                    break;
                default:
                    C22628.m50615();
                    C0483.m2121();
                    iM2566 = (C2105.m6981("᩷֡") ^ i4) * (-93);
                    i5 = ((iM2566 ^ i3) * (-20773)) ^ 1699681980;
                    i6 = -938887918;
                    break;
            }
        }
    }

    public C9792(List list) {
        this.f29621 = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return C4159.m12563(this.f29621);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int iM6981;
        int i2;
        int i3;
        int i4;
        short s;
        int i5;
        int i6;
        int iM6982;
        int i7;
        int i8;
        TextView textView;
        short[] sArr;
        int i9;
        int i10;
        int iM2566;
        int i11;
        int iM6983;
        int i12;
        int i13;
        int iM6984;
        int i14;
        int i15;
        String strM946;
        int iM6985;
        int i16;
        int iM2567;
        int i17;
        int i18 = C1420.f5096;
        int i19 = C2167.f7158;
        int iM2568 = (C0630.m2566("᩵ۛ") + i18) * (-117);
        int i20 = ((iM2568 ^ i19) * 17185) ^ (-2072845218);
        String str = null;
        String strM1959 = null;
        StringBuilder sbM19190 = null;
        String strM3396 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i21 = iM2568 ^ (-1260130771);
        int iM6986 = 0;
        int iM6987 = 0;
        int iM2569 = 0;
        int i22 = 0;
        short s2 = 0;
        int i23 = 0;
        int i24 = 0;
        View viewM3507 = null;
        TextView textView2 = null;
        String strM49334 = null;
        String str2 = null;
        long jM6432 = 0;
        CharSequence relativeTimeSpanString = null;
        String strM2575 = null;
        int i25 = 0;
        int i26 = 1775008539;
        C21081 c21081 = null;
        TextView textView3 = null;
        String strM947 = null;
        int i27 = 0;
        int i28 = 0;
        Context contextM6566 = null;
        View viewM32583 = null;
        while (true) {
            int i29 = i21 ^ (i20 & (((i26 ^ i19) * 15087) >> 31));
            switch (i29) {
                case -2093514225:
                case -1922863129:
                    i29 = i29;
                    viewM32583 = viewM32583;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    i23 = i23;
                    i24 = i24;
                    s2 = sArr2[0];
                    i22 = s2 * s2;
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("᩻ۤ") ^ i19;
                        i2 = ((iM6981 ^ i18) * (-2201)) ^ (-2011843264);
                        i3 = -1875129257;
                    } else {
                        iM6981 = C0630.m2566("֡᩸") ^ i19;
                        i2 = ((iM6981 ^ i18) * (-29427)) ^ 332650097;
                        i3 = -138892282;
                    }
                    int i30 = iM6981 ^ i3;
                    i24 = i24;
                    textView2 = textView2;
                    contextM6566 = contextM6566;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    i21 = i30;
                    i20 = i2;
                    viewM32583 = viewM32583;
                    break;
                case -2038764478:
                case -804062841:
                    i29 = i29;
                    textView2 = textView2;
                    viewM32583 = C13540.m32583(viewGroup, iM6987 ^ 2128058322, viewGroup, false);
                    contextM6566 = contextM6566;
                    sArr3 = sArr3;
                    i23 = i23;
                    i24 = i24;
                    iM6983 = (i19 - C0630.m2566("ۚۢ")) * 77;
                    i7 = ((iM6983 ^ i18) * (-32315)) ^ 296032652;
                    i12 = -110010675;
                    i13 = iM6983 ^ i12;
                    i24 = i24;
                    textView2 = textView2;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context;
                    break;
                case -1902626710:
                case 1965409201:
                    i29 = i29;
                    textView2 = textView2;
                    strM2575 = C0630.m2575(f29620, 16, 3, i27);
                    if (!C2520.m8026()) {
                        iM6984 = (C0630.m2566("᩵᩻") ^ i18) * (-97);
                        i14 = ((iM6984 ^ i19) * (-26119)) ^ 195262610;
                        i15 = 828929616;
                        i21 = iM6984 ^ i15;
                        i20 = i14;
                        textView2 = textView2;
                        i26 = i29;
                    } else {
                        contextM6566 = contextM6566;
                        iM2566 = C0630.m2566("֨۟") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM2566 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context2 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context2;
                    }
                    break;
                case -1747526003:
                case -378265216:
                    relativeTimeSpanString = C0050.m946(contextM6566, C0630.m2566(C0798.m3005(f29620, 31, 3, i27)) ^ 2122964222);
                    iM6985 = C2105.m6981("֫ܶ") ^ i18;
                    i4 = ((iM6985 ^ i19) * 7853) ^ (-236789157);
                    i16 = 2069952365;
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -1663561046:
                case -1595165519:
                    i29 = i29;
                    textView2 = textView2;
                    contextM6566 = contextM6566;
                    iM6987 = C2105.m6981(C0382.m1840(f29620, 7, 3, i27));
                    if (C7106.m19120() > 0) {
                        iM2566 = (C0630.m2566("᩸۬") + i19) * 17;
                        i7 = ((iM2566 ^ i18) * (-137)) ^ (-1661391577);
                        i11 = -1092306755;
                        i13 = iM2566 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context3 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context3;
                    }
                    s = s2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    iM6982 = (i18 - C0630.m2566("ۘܰ")) * (-91);
                    i7 = ((iM6982 ^ i19) * 27103) ^ (-703603024);
                    i8 = -374522428;
                    i13 = iM6982 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM32583 = viewM32583;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context4 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context4;
                    break;
                case -1626857264:
                case -861486657:
                    i29 = i29;
                    C2126.m7040();
                    if (!C1711.f5919) {
                        contextM6566 = contextM6566;
                        textView2 = textView2;
                        iM2566 = C0630.m2566("֨۟") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM2566 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context5 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context5;
                    } else {
                        textView = textView2;
                        sArr = sArr3;
                        i9 = i23;
                        i10 = i24;
                        int iM6988 = C2105.m6981("ۢ᩶") ^ i19;
                        i20 = ((iM6988 ^ i18) * 26717) ^ (-1680308630);
                        i21 = iM6988 ^ (-790861964);
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
                    contextM6566 = AbstractC2021.m6566(viewM32583);
                    c21081 = (C21081) C22628.m50605(this.f29621, i);
                    if (C1504.f5354) {
                        int iM6989 = C2105.m6981("ۢ᩶") ^ i19;
                        i20 = ((iM6989 ^ i18) * 26717) ^ (-1680308630);
                        i21 = iM6989 ^ (-790861964);
                        i24 = i10;
                        textView2 = textView;
                        i23 = i9;
                    } else {
                        int iM25610 = C0630.m2566("ܳ᩷") ^ i19;
                        i21 = iM25610 ^ (-1722535724);
                        i20 = ((iM25610 ^ i18) * (-13173)) ^ 1935675623;
                        i24 = i10;
                        textView2 = textView;
                        i23 = i9;
                        viewM32583 = viewM32583;
                    }
                    sArr3 = sArr;
                    i26 = i29;
                    break;
                case -1439797604:
                case 359795013:
                    relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(c21081.f67994, jM6432, 60000L);
                    iM6985 = C2105.m6981("֫ܶ") ^ i18;
                    i4 = ((iM6985 ^ i19) * 7853) ^ (-236789157);
                    i16 = 2069952365;
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -1416781286:
                case 2088054414:
                    i29 = i29;
                    sbM19190 = C7166.m19190(str2, strM49334);
                    textView2 = textView2;
                    iM2569 = C0630.m2566(C1711.m5726(f29620, 19, 3, i27));
                    if (!C1711.f5919) {
                        iM6984 = C2105.m6981("֨֡") ^ i18;
                        i14 = ((iM6984 ^ i19) * (-20081)) ^ 200223318;
                        i15 = 1882836012;
                        i21 = iM6984 ^ i15;
                        i20 = i14;
                        textView2 = textView2;
                        i26 = i29;
                    } else {
                        contextM6566 = contextM6566;
                        s = s2;
                        sArr3 = sArr3;
                        i5 = i23;
                        i6 = i24;
                        iM6982 = (i18 - C0630.m2566("ۘܰ")) * (-91);
                        i7 = ((iM6982 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                        i13 = iM6982 ^ i8;
                        s2 = s;
                        i24 = i6;
                        textView2 = textView2;
                        i23 = i5;
                        viewM32583 = viewM32583;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context6 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context6;
                    }
                    break;
                case -1353859561:
                case 1130737613:
                    i29 = i29;
                    textView2 = textView2;
                    if (C7106.m19121(str)) {
                        iM6984 = C2105.m6981("ܺ֡") ^ i19;
                        i14 = ((iM6984 ^ i18) * (-24541)) ^ (-1692826876);
                        i15 = 1473139179;
                    } else {
                        str2 = str;
                        iM6984 = (i19 - C2105.m6981("᩵ۘ")) * 99;
                        i14 = ((iM6984 ^ i18) * 13693) ^ 1694230115;
                        i15 = -1280069691;
                    }
                    i21 = iM6984 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -1298925036:
                case -353323359:
                    i29 = i29;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    short[] sArr4 = sArr3;
                    int i31 = i23;
                    i24 = i24;
                    sArr3 = sArr4;
                    viewM3507 = C1005.m3507(viewM32583, C0630.m2566(C4616.m13542(sArr4, i31, i24, i27)) ^ 2117075144);
                    if (C0798.f2919) {
                        iM6983 = C2105.m6981("ۚ᩵") ^ i19;
                        i23 = i31;
                        i7 = ((iM6983 ^ i18) * 7305) ^ (-1033634308);
                        i12 = 943896509;
                    } else {
                        i23 = i31;
                        iM6983 = C2105.m6981("ܶۤ") ^ i18;
                        i7 = ((iM6983 ^ i19) * 11299) ^ 1614584550;
                        i12 = -2051385469;
                    }
                    i13 = iM6983 ^ i12;
                    i24 = i24;
                    textView2 = textView2;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context7 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context7;
                    break;
                case -1238612557:
                case 1451091797:
                    i29 = i29;
                    viewM32583 = viewM32583;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    s = s2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    sArr2 = f29620;
                    if (C0798.f2919) {
                        iM6982 = (i18 - C0630.m2566("ۘܰ")) * (-91);
                        i7 = ((iM6982 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                    } else {
                        iM6982 = (C2105.m6981("ܳۘ") + i18) * (-73);
                        i7 = ((iM6982 ^ i19) * (-7707)) ^ (-941382187);
                        i8 = 663135416;
                    }
                    i13 = iM6982 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM32583 = viewM32583;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context8 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context8;
                    break;
                case -1213017717:
                case -965711239:
                    i29 = i29;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    textView3 = (TextView) viewM3507;
                    iM6986 = C2105.m6981(C11340.m28025(f29620, 4, 3, i27));
                    if (C11340.m28031()) {
                        iM2566 = C2105.m6981("ۗ᩹") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-5805)) ^ 147176065;
                        i11 = -502110228;
                        i13 = iM2566 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context9 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context9;
                    }
                    s = s2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    iM6982 = (i18 - C0630.m2566("ۘܰ")) * (-91);
                    i7 = ((iM6982 ^ i19) * 27103) ^ (-703603024);
                    i8 = -374522428;
                    i13 = iM6982 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM32583 = viewM32583;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context10 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context10;
                    break;
                case -1198796980:
                case 53638918:
                    i29 = i29;
                    textView2 = textView2;
                    boolean z = c21081.f67990;
                    strM49334 = C21923.m49334(f29620, 13, 3, i27);
                    if (z) {
                        iM6984 = (i18 - C2105.m6981("ᩴ۫")) * 93;
                        i14 = ((iM6984 ^ i19) * 11185) ^ 1522386667;
                        i15 = -470780025;
                    } else {
                        strM1959 = str2;
                        iM6984 = (C2105.m6981("᩶ۨ") ^ i19) * (-39);
                        i14 = ((iM6984 ^ i18) * (-26133)) ^ (-808637055);
                        i15 = -1629206572;
                    }
                    i21 = iM6984 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -1096119935:
                case 2098551840:
                    i29 = i29;
                    textView2 = textView2;
                    RunnableC1937.m6377(textView3, strM1959);
                    i25 = c21081.f67991;
                    if (i25 == 3) {
                        iM6984 = (i18 - C0630.m2566("ۤ᩵")) * (-33);
                        i14 = ((iM6984 ^ i19) * 22769) ^ (-934129199);
                        i15 = -2138217783;
                    } else {
                        iM6984 = (i19 - C2105.m6981("ܺܽ")) * 79;
                        i14 = ((iM6984 ^ i18) * (-13661)) ^ (-907506563);
                        i15 = 1029195774;
                    }
                    i21 = iM6984 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -1081192475:
                case 741713395:
                    i29 = i29;
                    textView2 = textView2;
                    if (i25 == 2) {
                        iM6985 = C2105.m6981("ۛۚ") ^ i18;
                        i4 = ((iM6985 ^ i19) * (-4615)) ^ (-671224470);
                        i16 = 80005459;
                    } else {
                        iM6985 = C2105.m6981("᩷ۡ") ^ i19;
                        i4 = ((iM6985 ^ i18) * 27507) ^ 146802262;
                        i16 = -1902304100;
                    }
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -1051615859:
                case -518728384:
                    if (!C0798.f2919) {
                        i29 = i29;
                        contextM6566 = contextM6566;
                        textView2 = textView2;
                        iM2566 = C0630.m2566("֨۟") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM2566 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context11 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context11;
                    } else {
                        int iM69810 = C2105.m6981("֨ۙ") ^ i18;
                        i29 = i29;
                        i20 = ((iM69810 ^ i19) * (-9759)) ^ (-1372987828);
                        i21 = iM69810 ^ (-591245963);
                        i26 = i29;
                    }
                    break;
                case -1032468780:
                case 1726984334:
                    iM2567 = C0630.m2566(C4075.m12252(f29620, 22, 3, i27));
                    i17 = 2121891365;
                    i28 = iM2567 ^ i17;
                    iM6985 = C0630.m2566("ۛۜ") ^ i19;
                    i4 = ((iM6985 ^ i18) * 7773) ^ 256025066;
                    i16 = 246425565;
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -882747150:
                case 871605057:
                    i29 = i29;
                    C1420.m4905(sbM19190, C0050.m946(contextM6566, iM2569 ^ 2097315404));
                    textView2 = textView2;
                    strM1959 = C0422.m1959(sbM19190);
                    iM6984 = (C2105.m6981("᩶ۨ") ^ i19) * (-39);
                    i14 = ((iM6984 ^ i18) * (-26133)) ^ (-808637055);
                    i15 = -1629206572;
                    i21 = iM6984 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case -672763750:
                case 1543189463:
                    i29 = i29;
                    textView2 = textView2;
                    strM947 = C0050.m946(contextM6566, i28);
                    jM6432 = ViewOnClickListenerC1958.m6432();
                    if (Math.abs(jM6432 - c21081.f67994) < 60000) {
                        iM6985 = (i19 - C0630.m2566("ۡ᩹")) * 57;
                        i4 = ((iM6985 ^ i18) * 10427) ^ (-1446129437);
                        i16 = -203879693;
                    } else {
                        iM6985 = (i18 - C2105.m6981("᩺ܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6985 ^ i19) * (-28789)) ^ 2044233041;
                        i16 = 1093868066;
                    }
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case -403907424:
                case 863393484:
                    i27 = 218;
                    iM6981 = C2105.m6981("᩷ۖ") ^ i18;
                    i2 = ((iM6981 ^ i19) * (-2349)) ^ (-694095181);
                    i3 = -1435540189;
                    int i32 = iM6981 ^ i3;
                    i24 = i24;
                    textView2 = textView2;
                    contextM6566 = contextM6566;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    i21 = i32;
                    i20 = i2;
                    viewM32583 = viewM32583;
                    break;
                case -374962808:
                case 137265420:
                    i29 = i29;
                    viewM32583 = viewM32583;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    i23 = i23;
                    i24 = i24;
                    if (view != null) {
                        viewM32583 = view;
                        iM6983 = (i19 - C0630.m2566("ۚۢ")) * 77;
                        i7 = ((iM6983 ^ i18) * (-32315)) ^ 296032652;
                        i12 = -110010675;
                        i13 = iM6983 ^ i12;
                        i24 = i24;
                        textView2 = textView2;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context12 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context12;
                    } else {
                        iM6981 = (C2105.m6981("ܶᩴ") + i18) * (-121);
                        i2 = ((iM6981 ^ i19) * 28413) ^ (-329087901);
                        i3 = 1413724495;
                        int i33 = iM6981 ^ i3;
                        i24 = i24;
                        textView2 = textView2;
                        contextM6566 = contextM6566;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        i21 = i33;
                        i20 = i2;
                        viewM32583 = viewM32583;
                    }
                    break;
                case 52306746:
                case 734877072:
                    i29 = i29;
                    textView2 = textView2;
                    strM3396 = C0964.m3396(f29620, 10, 3, i27);
                    if (C11340.f33930 < 0) {
                        iM6984 = C0630.m2566("ܰۢ") ^ i18;
                        i14 = ((iM6984 ^ i19) * (-8577)) ^ (-514135322);
                        i15 = 1443866904;
                        i21 = iM6984 ^ i15;
                        i20 = i14;
                        textView2 = textView2;
                        i26 = i29;
                    } else {
                        contextM6566 = contextM6566;
                        s = s2;
                        sArr3 = sArr3;
                        i5 = i23;
                        i6 = i24;
                        iM6982 = (i18 - C0630.m2566("ۘܰ")) * (-91);
                        i7 = ((iM6982 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                        i13 = iM6982 ^ i8;
                        s2 = s;
                        i24 = i6;
                        textView2 = textView2;
                        i23 = i5;
                        viewM32583 = viewM32583;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context13 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context13;
                    }
                    break;
                case 124491766:
                case 938641759:
                    i29 = i29;
                    if (RunnableC1108.f4040) {
                        viewM32583 = viewM32583;
                        contextM6566 = contextM6566;
                        textView2 = textView2;
                        s = s2;
                        sArr3 = sArr3;
                        i5 = i23;
                        i6 = i24;
                        iM6982 = (i18 - C0630.m2566("ۘܰ")) * (-91);
                        i7 = ((iM6982 ^ i19) * 27103) ^ (-703603024);
                        i8 = -374522428;
                        i13 = iM6982 ^ i8;
                        s2 = s;
                        i24 = i6;
                        textView2 = textView2;
                        i23 = i5;
                        viewM32583 = viewM32583;
                        sArr3 = sArr3;
                        i26 = i29;
                        Context context14 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context14;
                    }
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    iM2566 = C0630.m2566("֨۟") ^ i19;
                    i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                    i11 = -422019428;
                    i13 = iM2566 ^ i11;
                    textView2 = textView2;
                    i26 = i29;
                    Context context15 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context15;
                    break;
                case 160040070:
                case 1200287714:
                    i29 = i29;
                    if (C5695.f17556 < 0) {
                        int iM69811 = (i18 - C2105.m6981("֫ܿ")) * 15;
                        i4 = ((iM69811 ^ i19) * (-1897)) ^ 1698871011;
                        i21 = iM69811 ^ (-819286977);
                        i20 = i4;
                        i26 = i29;
                    } else {
                        viewM32583 = viewM32583;
                        contextM6566 = contextM6566;
                        textView2 = textView2;
                        sArr3 = sArr3;
                        i23 = i23;
                        i24 = i24;
                        iM6981 = C0630.m2566("᩻ۤ") ^ i19;
                        i2 = ((iM6981 ^ i18) * (-2201)) ^ (-2011843264);
                        i3 = -1875129257;
                        int i34 = iM6981 ^ i3;
                        i24 = i24;
                        textView2 = textView2;
                        contextM6566 = contextM6566;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        i21 = i34;
                        i20 = i2;
                        viewM32583 = viewM32583;
                    }
                    break;
                case 277296088:
                case 365270846:
                    strM946 = C0050.m946(contextM6566, C0630.m2566(strM3396) ^ 2129697036);
                    str2 = strM946;
                    iM6984 = (i19 - C2105.m6981("᩵ۘ")) * 99;
                    i14 = ((iM6984 ^ i18) * 13693) ^ 1694230115;
                    i15 = -1280069691;
                    i21 = iM6984 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case 388288364:
                case 950704658:
                    StringBuilder sb = new StringBuilder();
                    C3245.m9923(sb, strM947);
                    C3245.m9923(sb, strM49334);
                    C3746.m11367(sb, relativeTimeSpanString);
                    C1047.m3601(textView2, C0422.m1959(sb));
                    return viewM32583;
                case 722500129:
                case 1164629674:
                    i27 = 31798;
                    iM6981 = C2105.m6981("᩷ۖ") ^ i18;
                    i2 = ((iM6981 ^ i19) * (-2349)) ^ (-694095181);
                    i3 = -1435540189;
                    int i35 = iM6981 ^ i3;
                    i24 = i24;
                    textView2 = textView2;
                    contextM6566 = contextM6566;
                    i23 = i23;
                    sArr3 = sArr3;
                    i26 = i29;
                    i21 = i35;
                    i20 = i2;
                    viewM32583 = viewM32583;
                    break;
                case 752113731:
                case 1073890646:
                    i29 = i29;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    sArr3 = f29620;
                    i23 = 1;
                    i24 = 3;
                    if (C0382.m1848()) {
                        iM2566 = C0630.m2566("֨۟") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                    } else {
                        iM2566 = (C0630.m2566("᩶᩷") + i18) * (-75);
                        i7 = ((iM2566 ^ i19) * 2815) ^ (-1300638860);
                        i11 = -932630600;
                    }
                    i13 = iM2566 ^ i11;
                    textView2 = textView2;
                    i26 = i29;
                    Context context16 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context16;
                    break;
                case 787409111:
                case 1129654567:
                    i29 = i29;
                    viewM32583 = viewM32583;
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    sArr3 = sArr3;
                    i5 = i23;
                    i6 = i24;
                    int i36 = i22 + 386397649;
                    s = s2;
                    int i37 = s + 19657;
                    if ((i37 * i37) - (i36 + i36) <= 0) {
                        iM6982 = (i18 - C2105.m6981("᩸ܽ")) * 61;
                        i7 = ((iM6982 ^ i19) * (-24325)) ^ 991695067;
                        i8 = -1048721165;
                    } else {
                        iM6982 = (C0630.m2566("ۜ۫") + i19) * (-127);
                        i7 = ((iM6982 ^ i18) * (-9491)) ^ (-86777466);
                        i8 = 112457492;
                    }
                    i13 = iM6982 ^ i8;
                    s2 = s;
                    i24 = i6;
                    textView2 = textView2;
                    i23 = i5;
                    viewM32583 = viewM32583;
                    sArr3 = sArr3;
                    i26 = i29;
                    Context context17 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context17;
                    break;
                case 994313544:
                case 1068303705:
                    Context context18 = contextM6566;
                    TextView textView4 = (TextView) C1005.m3507(viewM32583, iM6986 ^ 2099102197);
                    String str3 = c21081.f67996;
                    if (c21081.f67992) {
                        int iM69812 = C2105.m6981("ܶ۠") ^ i18;
                        i20 = ((iM69812 ^ i19) * (-23869)) ^ 350048546;
                        str = str3;
                        textView2 = textView4;
                        contextM6566 = context18;
                        i26 = i29;
                        i21 = iM69812 ^ 1745315950;
                    } else {
                        int iM25611 = C0630.m2566("᩷֡") ^ i19;
                        str = str3;
                        textView2 = textView4;
                        contextM6566 = context18;
                        i26 = i29;
                        i21 = iM25611 ^ (-1708123679);
                        i20 = ((iM25611 ^ i18) * (-28311)) ^ (-1493620318);
                    }
                    break;
                case 1066288269:
                case 1997948330:
                    AbstractC2021.m6574();
                    C0382.m1848();
                    return null;
                case 1080824868:
                case 1643515486:
                    strM946 = C0050.m946(contextM6566, C2105.m6981(strM2575) ^ 2100863574);
                    str2 = strM946;
                    iM6984 = (i19 - C2105.m6981("᩵ۘ")) * 99;
                    i14 = ((iM6984 ^ i18) * 13693) ^ 1694230115;
                    i15 = -1280069691;
                    i21 = iM6984 ^ i15;
                    i20 = i14;
                    textView2 = textView2;
                    i26 = i29;
                    break;
                case 1192151448:
                case 1396465527:
                    iM2567 = C2105.m6981(C3683.m11225(f29620, 28, 3, i27));
                    i17 = 2119593304;
                    i28 = iM2567 ^ i17;
                    iM6985 = C0630.m2566("ۛۜ") ^ i19;
                    i4 = ((iM6985 ^ i18) * 7773) ^ 256025066;
                    i16 = 246425565;
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case 1193348814:
                case 1472762864:
                    iM2567 = C2105.m6981(C3245.m9934(f29620, 25, 3, i27));
                    i17 = 2123763067;
                    i28 = iM2567 ^ i17;
                    iM6985 = C0630.m2566("ۛۜ") ^ i19;
                    i4 = ((iM6985 ^ i18) * 7773) ^ 256025066;
                    i16 = 246425565;
                    i21 = iM6985 ^ i16;
                    textView2 = textView2;
                    i20 = i4;
                    i26 = i29;
                    break;
                case 1231977400:
                case 1513069701:
                    i29 = i29;
                    C3245.m9925();
                    contextM6566 = contextM6566;
                    textView2 = textView2;
                    iM2566 = C0630.m2566("֨۟") ^ i19;
                    i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                    i11 = -422019428;
                    i13 = iM2566 ^ i11;
                    textView2 = textView2;
                    i26 = i29;
                    Context context19 = contextM6566;
                    i21 = i13;
                    i20 = i7;
                    contextM6566 = context19;
                    break;
                default:
                    i29 = i29;
                    if (C0483.f2088 < 0) {
                        viewM32583 = viewM32583;
                        contextM6566 = contextM6566;
                        textView2 = textView2;
                        sArr3 = sArr3;
                        i23 = i23;
                        i24 = i24;
                        iM6981 = C0630.m2566("᩻ۤ") ^ i19;
                        i2 = ((iM6981 ^ i18) * (-2201)) ^ (-2011843264);
                        i3 = -1875129257;
                        int i38 = iM6981 ^ i3;
                        i24 = i24;
                        textView2 = textView2;
                        contextM6566 = contextM6566;
                        i23 = i23;
                        sArr3 = sArr3;
                        i26 = i29;
                        i21 = i38;
                        i20 = i2;
                        viewM32583 = viewM32583;
                    } else {
                        contextM6566 = contextM6566;
                        textView2 = textView2;
                        iM2566 = C0630.m2566("֨۟") ^ i19;
                        i7 = ((iM2566 ^ i18) * (-25865)) ^ (-484796300);
                        i11 = -422019428;
                        i13 = iM2566 ^ i11;
                        textView2 = textView2;
                        i26 = i29;
                        Context context110 = contextM6566;
                        i21 = i13;
                        i20 = i7;
                        contextM6566 = context110;
                    }
                    break;
            }
        }
    }
}
