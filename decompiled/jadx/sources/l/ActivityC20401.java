package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC20401 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۠ۖۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f65836 = {7593, -22257, -23205, 17354, 32453, 21428, -24303, -22310, 19922, -24199, 9535, 16880, 30709, 18881, 5444, 24389, 23849, 23772, 17312, 24215, 19094, 6471, 1472, 3760, 3622, -6854, 12914, 4624, 3701, -27701, -27674, -27668, -27653, -27674, -27680, -27679, -27666, -27651, -27658, -27710, -27666, -27679, -27666, -27672, -27670, -27651};

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f65837 = 0;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public List f65838 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C22517 f65839;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -337801746;
        int i7 = RunnableC1937.f6483;
        int i8 = C0714.f2697;
        int iM2566 = (C0630.m2566("۬ۢ") ^ i7) * 95;
        int i9 = ((iM2566 ^ i8) * (-32755)) ^ (-1978198031);
        int i10 = -1534028460;
        while (true) {
            i6 = ((((i6 ^ i8) * (-18747)) >> 31) & i9) ^ (iM2566 ^ i10);
            switch (i6) {
                case -2018675344:
                case 1543525988:
                    sArr = f65836;
                    if (C4616.f14690 <= 0) {
                        iM2566 = C0630.m2566("ܿ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM2566 = C2105.m6981("۬ܺ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-14051)) ^ 1066126225;
                        i10 = -270323055;
                    }
                    break;
                case -2002724427:
                case 1817322501:
                    i4 = 37775;
                    iM2566 = (i7 - C2105.m6981("۠ᩴ")) * (-55);
                    i9 = ((iM2566 ^ i8) * 6595) ^ 2045431845;
                    i10 = -2079116349;
                    break;
                case -1957752184:
                case 739244949:
                    C21923.m49329();
                    C4075.m12263();
                    iM2566 = (C2105.m6981("ᩳ᩸") ^ i8) * (-49);
                    i9 = ((iM2566 ^ i7) * (-1321)) ^ 1088617860;
                    i10 = 1749365827;
                    break;
                case -1776836889:
                case 1788814908:
                    C21923.m49329();
                    if (!RunnableC1108.f4040) {
                        iM2566 = (i7 - C0630.m2566("ۧۚ")) * 77;
                        i9 = ((iM2566 ^ i8) * (-2395)) ^ (-1635072557);
                        i10 = -850899010;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩸") ^ i8) * (-49);
                        i9 = ((iM2566 ^ i7) * (-1321)) ^ 1088617860;
                        i10 = 1749365827;
                    }
                    break;
                case -1713285842:
                case 131336481:
                    i3 = 8631844;
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("ۚۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM2566 = C2105.m6981("ۤܶ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7151)) ^ 1706677295;
                        i10 = 237255448;
                    }
                    break;
                case -1633623057:
                case -1547548021:
                    s = sArr[c];
                    s2 = 5876;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("ܿ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM2566 = C2105.m6981("᩶ۡ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 21243) ^ (-1887961709);
                        i10 = 2078360557;
                    }
                    break;
                case -1627903485:
                case 1793001431:
                    c = 28;
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ۚۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM2566 = C0630.m2566("᩺۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * 8803) ^ (-1648389962);
                        i10 = 841133584;
                    }
                    break;
                case -1614333728:
                case -1108983558:
                    if (i - (i2 + i3) <= 0) {
                        iM2566 = C0630.m2566("ۢۙ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 25563) ^ 1092001456;
                        i10 = -501358033;
                    } else {
                        iM2566 = C0630.m2566("֡᩻") ^ i8;
                        i9 = ((iM2566 ^ i7) * 28421) ^ (-104187321);
                        i10 = 654639925;
                    }
                    break;
                case -1567643071:
                case -1423515317:
                    C2272.m7503();
                    C2272.m7503();
                    return null;
                case -1529740123:
                case 156448172:
                    C2520.m8026();
                    if (C3746.f11829 > 0) {
                        iM2566 = C0630.m2566("ۚۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM2566 = (i7 - C0630.m2566("ۧۚ")) * 77;
                        i9 = ((iM2566 ^ i8) * (-2395)) ^ (-1635072557);
                        i10 = -850899010;
                    }
                    break;
                case -1454714414:
                case 1759036308:
                    i4 = 45936;
                    iM2566 = (i7 - C2105.m6981("۠ᩴ")) * (-55);
                    i9 = ((iM2566 ^ i8) * 6595) ^ 2045431845;
                    i10 = -2079116349;
                    break;
                case -1182344100:
                case -355440786:
                    if (C3537.f11231 >= 0) {
                        iM2566 = C0630.m2566("ܿ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM2566 = C2105.m6981("۠ۘ") ^ i7;
                        i9 = ((iM2566 ^ i8) * 2911) ^ 2010179813;
                        i10 = 1799344605;
                    }
                    break;
                case -1022989338:
                case 1638724930:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("ܿ۫") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM2566 = C0630.m2566("֡ܺ") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-7255)) ^ 859868300;
                        i10 = 677754575;
                    }
                    break;
                case -675254315:
                case -249858449:
                    if (C7106.f21815 == 0) {
                        iM2566 = C0630.m2566("ܰܶ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ᩸") ^ i8) * (-49);
                        i9 = ((iM2566 ^ i7) * (-1321)) ^ 1088617860;
                        i10 = 1749365827;
                    }
                    break;
                case -173186341:
                case 170492476:
                    i = s * s2;
                    i2 = s * s;
                    if (C0483.f2088 >= 0) {
                        iM2566 = C0630.m2566("ܰܶ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM2566 = C2105.m6981("ۗ᩹") ^ i7;
                        i9 = ((iM2566 ^ i8) * (-12895)) ^ 10957274;
                        i10 = 134374534;
                    }
                    break;
                case 298457284:
                case 1785281042:
                    return AbstractC2021.m6573(sArr2, i5, 17, i4);
                case 506416693:
                case 1066569816:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C0630.m2566("ܰܶ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۖ") ^ i8) * (-93);
                        i9 = ((iM2566 ^ i7) * 11951) ^ 1156624708;
                        i10 = -794811047;
                    }
                    break;
                case 741192965:
                case 891074801:
                    sArr2 = f65836;
                    i5 = 29;
                    if (C0798.f2919) {
                        iM2566 = C0630.m2566("ۚۚ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM2566 = (C0630.m2566("᩺֫") + i7) * 109;
                        i9 = ((iM2566 ^ i8) * 13489) ^ 1639309972;
                        i10 = 246414907;
                    }
                    break;
                default:
                    if (RunnableC3474.f10992 <= 0) {
                        iM2566 = C0630.m2566("ܰܶ") ^ i8;
                        i9 = ((iM2566 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM2566 = C2105.m6981("ۤۜ") ^ i8;
                        i9 = ((iM2566 ^ i7) * (-16673)) ^ 434009020;
                        i10 = -1310894531;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        if (l.C1504.f5354 != false) goto L10;
     */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        String strM4373;
        int iM2566;
        int i2;
        int i3;
        String str;
        int i4;
        C19866 c19866;
        int iM2567;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM2568;
        int i9;
        int i10;
        C3060 c3060;
        this = this;
        int i11 = 1394990490;
        int i12 = C22628.f73083;
        int i13 = RunnableC1937.f6483;
        int iM6981 = C2105.m6981("᩸֡") ^ i12;
        int i14 = ((iM6981 ^ i13) * 7189) ^ (-235382791);
        int i15 = iM6981 ^ 1551224276;
        final String strM45696 = null;
        C3060 c3060M48304 = null;
        String str2 = null;
        short[] sArr = null;
        int i16 = 0;
        final C19866 c19867 = null;
        int i17 = 0;
        int i18 = 0;
        C21282 c21282 = null;
        int i19 = 0;
        int iM6982 = 0;
        int i20 = 0;
        int i21 = 0;
        short s = 0;
        int i22 = 0;
        InterfaceC14930 interfaceC14930 = null;
        C3060 c3060M48305 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 10205) >> 31));
            switch (i11) {
                case -2145207036:
                case -356980104:
                    strM45696 = strM45696;
                    i22 = i22;
                    c3060M48304 = c3060M48304;
                    c19867 = c19867;
                    s = f65836[14];
                    if (C1128.f4106 > 0) {
                        iM2566 = (C0630.m2566("ۘۛ") ^ i12) * (-19);
                        i14 = ((iM2566 ^ i13) * (-21059)) ^ (-1810509118);
                        i2 = 1124206537;
                        i8 = iM2566 ^ i2;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    } else {
                        strM4373 = str2;
                        int iM6983 = (C2105.m6981("᩷֨") ^ i12) * (-99);
                        i7 = ((iM6983 ^ i13) * 26431) ^ (-902805108);
                        i8 = iM6983 ^ (-513809854);
                        str2 = strM4373;
                        i14 = i7;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -2114528792:
                case -1989238057:
                    iM6982 = C2105.m6981(RunnableC1108.m3789(sArr, i21, i19, i17));
                    i20 = 2126238910;
                    if (C2105.f7037 == 0) {
                        iM2567 = C0630.m2566("۬ۨ") ^ i12;
                        i5 = ((iM2567 ^ i13) * 11975) ^ (-836888483);
                        i6 = -178701714;
                        i15 = iM2567 ^ i6;
                        i14 = i5;
                    } else {
                        c3060 = c3060M48304;
                        i22 = i22;
                        int iM6984 = C2105.m6981("᩹ۘ") ^ i12;
                        c3060M48304 = c3060;
                        i14 = ((iM6984 ^ i13) * 21473) ^ (-1777985805);
                        i15 = iM6984 ^ (-742597986);
                        c3060M48304 = c3060M48304;
                        i22 = i22;
                    }
                    break;
                case -2090323974:
                case 1725959622:
                    String str3 = strM45696;
                    int i23 = i22;
                    C3060 c3061 = c3060M48304;
                    C19866 c19868 = c19867;
                    short s2 = s;
                    int i24 = s2 + 10410;
                    if ((i24 * i24) - i16 > 0) {
                        iM2568 = C0630.m2566("ܶۢ") ^ i13;
                        i9 = ((iM2568 ^ i12) * (-12257)) ^ (-214378810);
                        i10 = 1928672812;
                    } else {
                        iM2568 = C0630.m2566("ܺ᩷") ^ i12;
                        i9 = ((iM2568 ^ i13) * (-28825)) ^ 1875639588;
                        i10 = 360701516;
                    }
                    int i25 = iM2568 ^ i10;
                    s = s2;
                    c19867 = c19868;
                    c3060M48304 = c3061;
                    i22 = i23;
                    str = str3;
                    i15 = i25;
                    i14 = i9;
                    strM45696 = str;
                    break;
                case -2058400635:
                case -858403696:
                    i4 = i22;
                    C3060 c3062 = c3060M48304;
                    c19866 = (C19866) C22628.m50605(this.f65838, i);
                    strM45696 = c19866.m45696();
                    if (AbstractC2021.f6743 > 0) {
                        i18 = 0;
                        c21282 = new C21282(this, view, 0);
                        c3060M48304 = c21282.m48304();
                        if (C21923.f70183 == 0) {
                            int iM2569 = (C0630.m2566("ۧۗ") ^ i13) * (-113);
                            int i26 = ((iM2569 ^ i12) * 26923) ^ 1845551197;
                            i15 = iM2569 ^ (-46699331);
                            this = this;
                            c19867 = c19866;
                            i14 = i26;
                            i22 = i4;
                            i18 = 0;
                        }
                    } else {
                        c3060M48304 = c3062;
                    }
                    int iM6985 = C2105.m6981("ۘۡ") ^ i13;
                    int i27 = ((iM6985 ^ i12) * (-12029)) ^ (-61672830);
                    i15 = iM6985 ^ 657677333;
                    c19867 = c19866;
                    i22 = i4;
                    c21282 = null;
                    i14 = i27;
                    this = this;
                    break;
                case -1686628027:
                case -376303328:
                    C3060 c3063 = c3060M48304;
                    int iM25610 = C0630.m2566(str2) ^ 2124799826;
                    if (C3683.f11629 >= 0) {
                        int iM6986 = (C2105.m6981("ܳ۫") + i13) * 123;
                        i14 = ((iM6986 ^ i12) * 287) ^ (-812823726);
                        i15 = iM6986 ^ 372703868;
                    } else {
                        int iM6987 = (C2105.m6981("᩶֡") + i13) * 23;
                        i15 = iM6987 ^ (-1467303326);
                        i14 = ((iM6987 ^ i12) * (-32141)) ^ 1804991232;
                    }
                    i22 = iM25610;
                    c3060M48304 = c3063;
                    break;
                case -1623639624:
                case -337351576:
                    c21282.m48302(interfaceC14930);
                    C18342.m42767(view, c21282);
                    return true;
                case -1577295116:
                case -1227859914:
                    C3683.m11222();
                    C1047.m3599();
                    return false;
                case -1558432102:
                case 547103442:
                    i17 = 11795;
                    iM2566 = (C2105.m6981("ᩳ֨") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i14 = ((iM2566 ^ i13) * 29131) ^ (-666594767);
                    i2 = -1171770794;
                    i8 = iM2566 ^ i2;
                    c19867 = c19867;
                    c3060M48304 = c3060M48304;
                    strM45696 = strM45696;
                    i15 = i8;
                    i22 = i22;
                    this = this;
                    break;
                case -1286997375:
                case 249000833:
                    c3060 = c3060M48304;
                    i22 = i22;
                    C0630.m2573(c3060, i18, i22, i18, i22);
                    c3060M48305 = c21282.m48304();
                    sArr = f65836;
                    i21 = 18;
                    if (C7106.f21815 != 0) {
                        i19 = 3;
                        int iM6988 = C2105.m6981("᩹ۘ") ^ i12;
                        c3060M48304 = c3060;
                        i14 = ((iM6988 ^ i13) * 21473) ^ (-1777985805);
                        i15 = iM6988 ^ (-742597986);
                        c3060M48304 = c3060M48304;
                    } else {
                        int iM25611 = C0630.m2566("۟ܿ") ^ i12;
                        i15 = iM25611 ^ (-1131579276);
                        i14 = ((iM25611 ^ i13) * 23319) ^ (-1251980944);
                        c3060M48304 = c3060;
                        i19 = 3;
                    }
                    i22 = i22;
                    break;
                case -1128394541:
                case 249414858:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1070195369:
                case -485093526:
                    i17 = 14963;
                    iM2566 = (C2105.m6981("ᩳ֨") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i14 = ((iM2566 ^ i13) * 29131) ^ (-666594767);
                    i2 = -1171770794;
                    i8 = iM2566 ^ i2;
                    c19867 = c19867;
                    c3060M48304 = c3060M48304;
                    strM45696 = strM45696;
                    i15 = i8;
                    i22 = i22;
                    this = this;
                    break;
                case -1061494287:
                case 1920522015:
                    int i28 = iM6982 ^ i20;
                    C2105.m6974(c3060M48305, i18, i28, i18, i28);
                    interfaceC14930 = new InterfaceC14930() { // from class: l.۠᩶ܽ
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i29 = ActivityC20401.f65837;
                            int itemId = menuItem.getItemId();
                            ActivityC20401 activityC20401 = this.f25760;
                            String str4 = strM45696;
                            C19866 c19869 = c19867;
                            int i30 = 1;
                            if (itemId == R.string.MT_Protector) {
                                C21812 c21812 = new C21812(activityC20401, activityC20401, str4, c19869);
                                c21812.m31258(R.string.MT_Protector);
                                c21812.m31250((CharSequence) str4);
                                c21812.m31244();
                                c21812.m31279(6);
                                c21812.m31281();
                                c21812.m31266(true);
                                return true;
                            }
                            int i31 = DialogInterfaceC0206.f1451;
                            C19258 c19258 = new C19258(activityC20401);
                            c19258.m44433(R.string.MT_Protector);
                            c19258.m44424(activityC20401.getString(R.string.MT_Protector, str4));
                            c19258.m44442(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22370(i30, activityC20401, c19869));
                            c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c19258.m44438();
                            return true;
                        }
                    };
                    if (RunnableC0588.f2309 < 0) {
                        iM2567 = (C0630.m2566("ۚۗ") + i13) * 25;
                        i5 = ((iM2567 ^ i12) * 8631) ^ 2009761636;
                        i6 = -1603334729;
                        i15 = iM2567 ^ i6;
                        i14 = i5;
                    } else {
                        strM4373 = str2;
                        strM45696 = strM45696;
                        i22 = i22;
                        c3060M48304 = c3060M48304;
                        c19867 = c19867;
                        int iM6989 = (C2105.m6981("᩷֨") ^ i12) * (-99);
                        i7 = ((iM6989 ^ i13) * 26431) ^ (-902805108);
                        i8 = iM6989 ^ (-513809854);
                        str2 = strM4373;
                        i14 = i7;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -887649240:
                case 1119263588:
                    C1128.m3851();
                    if (C1420.f5096 <= 0) {
                        i3 = i16;
                        strM45696 = strM45696;
                        i22 = i22;
                        c3060M48304 = c3060M48304;
                        c19867 = c19867;
                        int iM69810 = C2105.m6981("ۖۖ") ^ i13;
                        i7 = ((iM69810 ^ i12) * (-28369)) ^ (-1623836970);
                        i8 = iM69810 ^ 2050257739;
                        i16 = i3;
                        i14 = i7;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    c19866 = c19867;
                    i4 = i22;
                    int iM69811 = C2105.m6981("ۘۡ") ^ i13;
                    int i29 = ((iM69811 ^ i12) * (-12029)) ^ (-61672830);
                    i15 = iM69811 ^ 657677333;
                    c19867 = c19866;
                    i22 = i4;
                    c21282 = null;
                    i14 = i29;
                    this = this;
                    break;
                case -506122551:
                case 1125420969:
                    strM45696 = strM45696;
                    short s3 = s;
                    i22 = i22;
                    c3060M48304 = c3060M48304;
                    c19867 = c19867;
                    int i30 = (s3 * s3) + 108368100;
                    i3 = i30 + i30;
                    if (!C3663.f11553) {
                        int iM69812 = (C2105.m6981("᩸᩷") ^ i13) * (-33);
                        s = s3;
                        i16 = i3;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        i14 = ((iM69812 ^ i12) * (-27317)) ^ 671027012;
                        i22 = i22;
                        str = strM45696;
                        i15 = iM69812 ^ 1424834125;
                        strM45696 = str;
                    } else {
                        s = s3;
                        int iM69813 = C2105.m6981("ۖۖ") ^ i13;
                        i7 = ((iM69813 ^ i12) * (-28369)) ^ (-1623836970);
                        i8 = iM69813 ^ 2050257739;
                        i16 = i3;
                        i14 = i7;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -483822895:
                case 1744589339:
                    i22 = i22;
                    c3060M48304 = c3060M48304;
                    c19867 = c19867;
                    strM45696 = strM45696;
                    strM4373 = C1294.m4373(f65836, 15, 3, i17);
                    if (C4075.f12947 < 0) {
                        int iM69814 = C2105.m6981("۠ۤ") ^ i12;
                        str2 = strM4373;
                        i14 = ((iM69814 ^ i13) * 1473) ^ (-691312408);
                        strM45696 = strM45696;
                        i15 = iM69814 ^ (-596522041);
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        i22 = i22;
                    } else {
                        int iM69815 = (C2105.m6981("᩷֨") ^ i12) * (-99);
                        i7 = ((iM69815 ^ i13) * 26431) ^ (-902805108);
                        i8 = iM69815 ^ (-513809854);
                        str2 = strM4373;
                        i14 = i7;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -430119166:
                case 431075847:
                    C4159.m12565();
                    c19866 = c19867;
                    i4 = i22;
                    int iM69816 = C2105.m6981("ۘۡ") ^ i13;
                    int i210 = ((iM69816 ^ i12) * (-12029)) ^ (-61672830);
                    i15 = iM69816 ^ 657677333;
                    c19867 = c19866;
                    i22 = i4;
                    c21282 = null;
                    i14 = i210;
                    this = this;
                    break;
                case -338200927:
                case 1850664912:
                    C0422.m1963();
                    if (C1773.m5908() > 0) {
                        c3060 = c3060M48304;
                        i22 = i22;
                        int iM69817 = C2105.m6981("᩹ۘ") ^ i12;
                        c3060M48304 = c3060;
                        i14 = ((iM69817 ^ i13) * 21473) ^ (-1777985805);
                        i15 = iM69817 ^ (-742597986);
                        c3060M48304 = c3060M48304;
                        i22 = i22;
                    } else {
                        c19866 = c19867;
                        i4 = i22;
                        int iM69818 = C2105.m6981("ۘۡ") ^ i13;
                        int i211 = ((iM69818 ^ i12) * (-12029)) ^ (-61672830);
                        i15 = iM69818 ^ 657677333;
                        c19867 = c19866;
                        i22 = i4;
                        c21282 = null;
                        i14 = i211;
                        this = this;
                    }
                    break;
                default:
                    strM45696 = strM45696;
                    i22 = i22;
                    c3060M48304 = c3060M48304;
                    c19867 = c19867;
                    if (C3537.f11231 < 0) {
                        iM2566 = C2105.m6981("۬ᩳ") ^ i13;
                        i14 = ((iM2566 ^ i12) * (-15599)) ^ (-1328297774);
                        i2 = 297898793;
                        i8 = iM2566 ^ i2;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    } else {
                        i3 = i16;
                        int iM69819 = C2105.m6981("ۖۖ") ^ i13;
                        i7 = ((iM69819 ^ i12) * (-28369)) ^ (-1623836970);
                        i8 = iM69819 ^ 2050257739;
                        i16 = i3;
                        i14 = i7;
                        c19867 = c19867;
                        c3060M48304 = c3060M48304;
                        strM45696 = strM45696;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x019d A[PHI: r3 r8 r9 r10
      0x019d: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:48:0x019b, B:44:0x017d, B:28:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int) binds: [B:48:0x019b, B:44:0x017d, B:28:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r9v4 int) = (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:48:0x019b, B:44:0x017d, B:28:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int) binds: [B:48:0x019b, B:44:0x017d, B:28:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4 A[PHI: r1 r2 r6 r7 r11 r13 r14
      0x01d4: PHI (r1v5 android.view.MenuInflater) = 
      (r1v2 android.view.MenuInflater)
      (r1v3 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
      (r1v2 android.view.MenuInflater)
     binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v2 int), (r2v7 int) binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r6v5 short) = (r6v3 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short), (r6v2 short) binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r7v5 short) = (r7v3 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short), (r7v2 short) binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r11v5 int) = (r11v2 int), (r11v2 int), (r11v2 int), (r11v2 int), (r11v3 int), (r11v2 int) binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r13v5 short[]) = (r13v2 short[]), (r13v3 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]), (r13v2 short[]) binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]
      0x01d4: PHI (r14v5 int) = (r14v2 int), (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:52:0x01d2, B:32:0x00f4, B:12:0x0065, B:9:0x005c, B:6:0x0051, B:87:0x01d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0227 A[PHI: r19
      0x0227: PHI (r19v5 short[]) = (r19v4 short[]), (r19v3 short[]), (r19v3 short[]), (r19v3 short[]) binds: [B:60:0x0225, B:18:0x0087, B:15:0x006b, B:12:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0253 A[PHI: r5
      0x0253: PHI (r5v4 char) = (r5v2 char), (r5v3 char), (r5v2 char) binds: [B:64:0x0251, B:56:0x020a, B:9:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int iM2566;
        int i;
        int i2;
        int i3 = C3746.f11829;
        int i4 = ViewOnClickListenerC1958.f6529;
        int iM6981 = (C2105.m6981("ۤۨ") + i3) * (-13);
        int i5 = ((iM6981 ^ i4) * 24665) ^ 760132986;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM6981 ^ 1583234975;
        MenuInflater menuInflater = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1603384823;
        String strM9031 = null;
        int iM2567 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-32379)) >> 31));
            switch (i13) {
                case -2138574621:
                case 1281414274:
                    c = '\n';
                    if (C2272.m7503()) {
                        iM2566 = (i4 - C2105.m6981("ۨ۫")) * 33;
                        i = ((iM2566 ^ i3) * 7503) ^ (-1571602776);
                        i2 = -2103567596;
                    } else {
                        iM2566 = C2105.m6981("᩷֨") ^ i3;
                        i = ((iM2566 ^ i4) * (-12223)) ^ (-564972120);
                        i2 = -1743962351;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -2023072162:
                case -1379686575:
                    i7 = s + s2;
                    if (C0964.f3626 != 0) {
                        iM2566 = (C0630.m2566("ܰ᩵") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-19715)) ^ (-616468157);
                        i2 = -1984784212;
                    } else {
                        iM2566 = (i4 - C2105.m6981("֡ᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM2566 ^ i3) * (-23821)) ^ (-789050484);
                        i2 = 1421921515;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1899563992:
                case 1658290102:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C21923.m49329()) {
                        iM2566 = (C0630.m2566("ܰ᩵") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-19715)) ^ (-616468157);
                        i2 = -1984784212;
                    } else {
                        iM2566 = (C2105.m6981("ۙۙ") + i3) * (-39);
                        i = ((iM2566 ^ i4) * 22403) ^ (-931908169);
                        i2 = -477739210;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1821110131:
                case 582219917:
                    menuInflater = getMenuInflater();
                    sArr2 = f65836;
                    i12 = 11;
                    if (C3432.f10845 >= 0) {
                        iM2566 = (i3 - C0630.m2566("֨ܿ")) * (-117);
                        i = ((iM2566 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM2566 = C0630.m2566("ܺܺ") ^ i3;
                        i = ((iM2566 ^ i4) * (-31173)) ^ (-1014509791);
                        i2 = 1105753708;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1737664327:
                case -609113095:
                    RunnableC0588.m2441();
                    return false;
                case -1733155276:
                case 1152383090:
                    if (C22628.f73083 <= 0) {
                        iM2566 = (i4 - C2105.m6981("ۨ۫")) * 33;
                        i = ((iM2566 ^ i3) * 7503) ^ (-1571602776);
                        i2 = -2103567596;
                    } else {
                        iM2566 = (C0630.m2566("ۜۛ") + i4) * (-67);
                        i = ((iM2566 ^ i3) * (-22699)) ^ (-1054553218);
                        i2 = 78687681;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1535540797:
                case 803517652:
                    i11 = 10238;
                    iM2566 = C0630.m2566("᩵᩺") ^ i4;
                    i = ((iM2566 ^ i3) * (-20719)) ^ (-672412953);
                    i2 = -950732257;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1333233417:
                case 1525003936:
                    ViewOnClickListenerC1958.m6429();
                    if (RunnableC1937.f6483 < 0) {
                        iM2566 = C2105.m6981("ܰܰ") ^ i3;
                        i = ((iM2566 ^ i4) * 6531) ^ (-1025574858);
                        i2 = -21694884;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֨ܿ")) * (-117);
                        i = ((iM2566 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -1066567345:
                case 762954301:
                    i11 = 11646;
                    iM2566 = C0630.m2566("᩵᩺") ^ i4;
                    i = ((iM2566 ^ i3) * (-20719)) ^ (-672412953);
                    i2 = -950732257;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -678314624:
                case 1053844685:
                    iM2567 = C0630.m2566(strM9031) ^ 2122725931;
                    if (C4616.m13552() != 0) {
                        iM2566 = (i3 - C0630.m2566("֨ܿ")) * (-117);
                        i = ((iM2566 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                        i6 = iM2566 ^ i2;
                        i5 = i;
                    } else {
                        int iM6982 = (C2105.m6981("֡᩶") ^ i4) * 33;
                        i5 = ((iM6982 ^ i3) * (-31453)) ^ 1365424574;
                        i6 = iM6982 ^ (-1816471208);
                    }
                    break;
                case -571402670:
                case 1006359279:
                    C2272.m7503();
                    C3019.m9255();
                    iM2566 = C2105.m6981("ܰܰ") ^ i3;
                    i = ((iM2566 ^ i4) * 6531) ^ (-1025574858);
                    i2 = -21694884;
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -20824417:
                case 2051868662:
                    sArr = f65836;
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("۫ۖ") ^ i3;
                        i = ((iM2566 ^ i4) * 16519) ^ (-1565441074);
                        i2 = -430021299;
                    } else {
                        iM2566 = C2105.m6981("ܰܰ") ^ i3;
                        i = ((iM2566 ^ i4) * 6531) ^ (-1025574858);
                        i2 = -21694884;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case -19444251:
                case 967741390:
                    s = sArr[c];
                    s2 = 2798;
                    if (C0630.f2410 <= 0) {
                        iM2566 = (i3 - C0630.m2566("֨ܿ")) * (-117);
                        i = ((iM2566 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM2566 = (i4 - C0630.m2566("ۘۘ")) * (-67);
                        i = ((iM2566 ^ i3) * 20837) ^ (-2081153863);
                        i2 = 2106525893;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 432634420:
                case 1029887458:
                    ServiceConnectionC3453.m10564();
                    if (C7106.m19120() > 0) {
                        iM2566 = (i3 - C0630.m2566("֨ܿ")) * (-117);
                        i = ((iM2566 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM2566 = (i4 - C2105.m6981("ۨ۫")) * 33;
                        i = ((iM2566 ^ i3) * 7503) ^ (-1571602776);
                        i2 = -2103567596;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 657578441:
                case 1923809358:
                    strM9031 = C2958.m9031(sArr2, i12, 3, i11);
                    if (C1005.f3721) {
                        iM2566 = (i4 - C0630.m2566("۟ܶ")) * (-23);
                        i = ((iM2566 ^ i3) * 24623) ^ 1704530758;
                        i2 = -1485720192;
                    } else {
                        iM2566 = (C0630.m2566("ܰ᩵") + i3) * (-53);
                        i = ((iM2566 ^ i4) * (-19715)) ^ (-616468157);
                        i2 = -1984784212;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1261165658:
                case 1547553905:
                    menuInflater.inflate(iM2567, menu);
                    return true;
                case 1333646730:
                case 1791162260:
                    int i14 = i9 + i10;
                    if ((i14 + i14) - i8 >= 0) {
                        iM2566 = C2105.m6981("᩻ۘ") ^ i4;
                        i = ((iM2566 ^ i3) * (-449)) ^ 475009862;
                        i2 = 2076453726;
                    } else {
                        iM2566 = (i3 - C2105.m6981("ܰܳ")) * 37;
                        i = ((iM2566 ^ i4) * (-20911)) ^ 1069977311;
                        i2 = -264271721;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                case 1885872180:
                case 1896614617:
                    if (C3019.f9544 < 0) {
                        iM2566 = C2105.m6981("ܰܰ") ^ i3;
                        i = ((iM2566 ^ i4) * 6531) ^ (-1025574858);
                        i2 = -21694884;
                    } else {
                        iM2566 = (C2105.m6981("ۢۡ") ^ i4) * (-121);
                        i = ((iM2566 ^ i3) * (-23719)) ^ (-1996493976);
                        i2 = 13080279;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 7828804;
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i3 - C0630.m2566("֨ܿ")) * (-117);
                        i = ((iM2566 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM2566 = C0630.m2566("᩹ۘ") ^ i3;
                        i = ((iM2566 ^ i4) * 19617) ^ 513334739;
                        i2 = 202933262;
                    }
                    i6 = iM2566 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = null;
        AbstractC15440 abstractC15440M45691 = null;
        int i2 = -1121812551;
        int i3 = C1128.f4106;
        int i4 = C3019.f9544;
        int iM6981 = C2105.m6981("ۚۤ") ^ i3;
        int i5 = ((iM6981 ^ i4) * (-12799)) ^ 998682384;
        int i6 = 1824096464;
        while (true) {
            i2 = ((((i2 ^ i4) * (-29459)) >> 31) & i5) ^ (iM6981 ^ i6);
            switch (i2) {
                case -1943187076:
                case -823572814:
                    RunnableC3474.m10630();
                    if (RunnableC0588.f2309 >= 0) {
                        iM6981 = C2105.m6981("ܿۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-19533)) ^ 1919145255;
                        i6 = -2057068965;
                    } else {
                        iM6981 = C0630.m2566("ۜ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 16945) ^ 2034022081;
                        i6 = -1478073497;
                    }
                    break;
                case -1914208529:
                case 133926212:
                    C1916.m6308();
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("ۜ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 16945) ^ 2034022081;
                        i6 = -1478073497;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                        i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    }
                    break;
                case -1556251440:
                case -264323060:
                    if (C0483.f2088 >= 0) {
                        iM6981 = (C0630.m2566("ᩴᩴ") ^ i3) * 79;
                        i5 = ((iM6981 ^ i4) * (-18435)) ^ (-418802074);
                        i6 = 764595268;
                    } else {
                        iM6981 = (C2105.m6981("ۡ֨") ^ i4) * (-11);
                        i5 = ((iM6981 ^ i3) * (-14931)) ^ 841957622;
                        i6 = -143523075;
                    }
                    break;
                case -1519075522:
                case 968578927:
                    if (C0798.f2919) {
                        iM6981 = C2105.m6981("ܿۛ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-19533)) ^ 1919145255;
                        i6 = -2057068965;
                    } else {
                        iM6981 = (C0630.m2566("֫ܺ") ^ i3) * 59;
                        i5 = ((iM6981 ^ i4) * (-2747)) ^ (-924985559);
                        i6 = -168274901;
                    }
                    break;
                case -1053563266:
                case 57444310:
                    if (C1047.m3599() >= 0) {
                        iM6981 = C0630.m2566("ۨ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-15885)) ^ 1550109975;
                        i6 = 806258273;
                    } else {
                        iM6981 = C0630.m2566("ۢ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-3103)) ^ 1353788586;
                        i6 = -861408126;
                    }
                    break;
                case -976297424:
                case 1681742930:
                    if (C3663.f11553) {
                        iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                        i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM6981 = (i3 - C0630.m2566("۠᩺")) * 77;
                        i5 = ((iM6981 ^ i4) * 13489) ^ 479263363;
                        i6 = -864690780;
                    }
                    break;
                case -912238774:
                case -575668477:
                    C7811.m20844();
                    iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                    i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                    i6 = 115066508;
                    break;
                case -660030281:
                case 1125881970:
                    if (C5695.f17556 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                        i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM6981 = C2105.m6981("ܿۘ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 21703) ^ (-1099753599);
                        i6 = 80070036;
                    }
                    break;
                case -379278563:
                case 831101211:
                    if (C1128.f4106 <= 0) {
                        iM6981 = C0630.m2566("ۜ۫") ^ i4;
                        i5 = ((iM6981 ^ i3) * 16945) ^ 2034022081;
                        i6 = -1478073497;
                    } else {
                        iM6981 = C2105.m6981("֡ᩴ") ^ i3;
                        i5 = ((iM6981 ^ i4) * (-17931)) ^ (-1402269926);
                        i6 = 1993618488;
                    }
                    break;
                case -311103410:
                case 1456229401:
                    intent.setData(abstractC15440M45691.m36522());
                    C4075.m12261(this, intent);
                    break;
                case -248891968:
                case 554082619:
                    intent = new Intent(this, (Class<?>) ActivityC1350.class);
                    if (C1916.f6442) {
                        iM6981 = (C0630.m2566("۬ܶ") ^ i3) * 35;
                        i5 = ((iM6981 ^ i4) * 28013) ^ (-1355646589);
                        i6 = 1620675759;
                    } else {
                        iM6981 = (C0630.m2566("ᩴᩴ") ^ i3) * 79;
                        i5 = ((iM6981 ^ i4) * (-18435)) ^ (-418802074);
                        i6 = 764595268;
                    }
                    break;
                case 481408017:
                case 925825751:
                    C3683.m11222();
                    break;
                case 504184084:
                case 1253065449:
                    abstractC15440M45691 = ((C19866) C21923.m49339(this.f65838, i)).m45691();
                    if (C2126.f7087) {
                        iM6981 = (C0630.m2566("ᩴᩴ") ^ i3) * 79;
                        i5 = ((iM6981 ^ i4) * (-18435)) ^ (-418802074);
                        i6 = 764595268;
                    } else {
                        iM6981 = C2105.m6981("ۨᩴ") ^ i4;
                        i5 = ((iM6981 ^ i3) * 5311) ^ 1600594971;
                        i6 = -1150470811;
                    }
                    break;
                case 607225694:
                case 2119236355:
                    if (C0714.f2697 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                        i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM6981 = (i4 - C0630.m2566("֨᩸")) * (-119);
                        i5 = ((iM6981 ^ i3) * 14289) ^ (-985622604);
                        i6 = 695979504;
                    }
                    break;
                case 1246179608:
                case 1329926622:
                    if (!C2272.f7362) {
                        iM6981 = C0630.m2566("ۨ᩺") ^ i4;
                        i5 = ((iM6981 ^ i3) * (-15885)) ^ 1550109975;
                        i6 = 806258273;
                    } else {
                        iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                        i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    }
                    break;
                default:
                    if (C3911.f12484 >= 0) {
                        iM6981 = (i3 - C0630.m2566("᩸ۧ")) * (-27);
                        i5 = ((iM6981 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM6981 = (i3 - C2105.m6981("ܰܳ")) * (-57);
                        i5 = ((iM6981 ^ i4) * 8899) ^ 1827869928;
                        i6 = -1078344675;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x018f A[PHI: r7 r8 r9 r15 r22
      0x018f: PHI (r7v5 int) = (r7v3 int), (r7v2 int), (r7v2 int), (r7v2 int) binds: [B:44:0x018d, B:40:0x0165, B:23:0x00b4, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r8v5 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:44:0x018d, B:40:0x0165, B:23:0x00b4, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r9v6 short[]) = (r9v2 short[]), (r9v4 short[]), (r9v2 short[]), (r9v2 short[]) binds: [B:44:0x018d, B:40:0x0165, B:23:0x00b4, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r15v5 short[]) = (r15v3 short[]), (r15v2 short[]), (r15v2 short[]), (r15v2 short[]) binds: [B:44:0x018d, B:40:0x0165, B:23:0x00b4, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r22v17 short[]) = (r22v11 short[]), (r22v12 short[]), (r22v14 short[]), (r22v18 short[]) binds: [B:44:0x018d, B:40:0x0165, B:23:0x00b4, B:14:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01e0 A[PHI: r12 r13 r14
      0x01e0: PHI (r12v21 short[]) = (r12v8 short[]), (r12v2 short[]), (r12v2 short[]), (r12v2 short[]) binds: [B:50:0x01de, B:19:0x0097, B:17:0x0093, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r13v4 int) = (r13v3 int), (r13v2 int), (r13v2 int), (r13v2 int) binds: [B:50:0x01de, B:19:0x0097, B:17:0x0093, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r14v4 int) = (r14v3 int), (r14v2 int), (r14v2 int), (r14v2 int) binds: [B:50:0x01de, B:19:0x0097, B:17:0x0093, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (l.C1420.f5096 > 0) goto L51;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        short[] sArr;
        int iM2566;
        int i;
        int i2;
        int iM2567;
        int i3;
        short s;
        int iM2568;
        int i4;
        int i5;
        int iM2569;
        ActivityC20401 activityC20401 = this;
        int i6 = C3019.f9544;
        int i7 = C3245.f10203;
        int iM25610 = C0630.m2566("ۚ᩻") ^ i7;
        int i8 = ((iM25610 ^ i6) * (-23007)) ^ (-1253393553);
        ListView listView = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i9 = iM25610 ^ (-1199641543);
        int i10 = 0;
        int iM6981 = 0;
        int i11 = 0;
        int iM25611 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s2 = 0;
        int i17 = 665549736;
        int i18 = 0;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i6) * 21785) >> 31));
            switch (i17) {
                case -2116868969:
                case 831730542:
                    sArr = sArr3;
                    C0964.m3409(activityC20401, C2105.m6981(ViewOnClickListenerC1958.m6435(sArr4, i12, i13, i14)) ^ 2121191642);
                    sArr5 = f65836;
                    if (C11340.f33930 >= 0) {
                        iM2566 = (C2105.m6981("ۗ᩸") + i7) * (-75);
                        i = ((iM2566 ^ i6) * 5503) ^ (-1138586839);
                        i2 = -1916232441;
                    } else {
                        iM2566 = (C0630.m2566("ᩳۨ") + i7) * (-35);
                        i = ((iM2566 ^ i6) * (-26705)) ^ (-2037602620);
                        i2 = -1603350891;
                    }
                    int i19 = iM2566 ^ i2;
                    sArr3 = sArr;
                    i9 = i19;
                    i8 = i;
                    break;
                case -2097011003:
                case 1581857291:
                    s = s2;
                    if ((s * 3828) - (i18 + 3663396) > 0) {
                        iM2568 = (i7 - C2105.m6981("᩸᩵")) * (-79);
                        i8 = ((iM2568 ^ i6) * 14937) ^ 374875289;
                        i4 = -1769877938;
                    } else {
                        iM2568 = C2105.m6981("᩹ܿ") ^ i6;
                        i8 = ((iM2568 ^ i7) * (-22129)) ^ 1841874495;
                        i4 = 497743155;
                    }
                    i9 = iM2568 ^ i4;
                    activityC20401 = this;
                    s2 = s;
                    break;
                case -1950187596:
                case 917610268:
                    if (C7811.f24123 >= 0) {
                        iM2567 = C0630.m2566("᩶ۚ") ^ i6;
                        i = ((iM2567 ^ i7) * 2513) ^ (-872894392);
                        i3 = -1314601849;
                    } else {
                        iM2567 = C2105.m6981("ᩳᩴ") ^ i7;
                        i = ((iM2567 ^ i6) * (-24111)) ^ 417655258;
                        i3 = 362383521;
                    }
                    i9 = iM2567 ^ i3;
                    i8 = i;
                    break;
                case -1836652384:
                case 1810212026:
                    C2167.m7155();
                    C3683.m11222();
                    iM2567 = C0630.m2566("᩶ۚ") ^ i6;
                    i = ((iM2567 ^ i7) * 2513) ^ (-872894392);
                    i3 = -1314601849;
                    i9 = iM2567 ^ i3;
                    i8 = i;
                    break;
                case -1710794064:
                case -339589818:
                    s = s2;
                    sArr2 = f65836;
                    c = 0;
                    if (C0630.f2410 <= 0) {
                        iM2568 = (C0630.m2566("ۤ᩹") + i6) * 9;
                        i8 = ((iM2568 ^ i7) * (-3305)) ^ (-2119634196);
                        i4 = -348978565;
                    } else {
                        iM2568 = (i7 - C2105.m6981("ۘᩳ")) * (-55);
                        i8 = ((iM2568 ^ i6) * 18353) ^ (-693893518);
                        i4 = 1378406379;
                    }
                    i9 = iM2568 ^ i4;
                    activityC20401 = this;
                    s2 = s;
                    break;
                case -1699821622:
                case 503123243:
                    sArr = sArr3;
                    RunnableC3474.m10625(activityC20401.f10584, new ViewOnClickListenerC20259(1, activityC20401));
                    if (C1916.f6442) {
                        C22517 c22517 = new C22517(activityC20401);
                        activityC20401.f65839 = c22517;
                        listView.setAdapter((ListAdapter) c22517);
                        listView.setOnItemClickListener(activityC20401);
                        listView.setOnItemLongClickListener(activityC20401);
                    }
                    iM2566 = (C2105.m6981("ۗ᩸") + i7) * (-75);
                    i = ((iM2566 ^ i6) * 5503) ^ (-1138586839);
                    i2 = -1916232441;
                    int i110 = iM2566 ^ i2;
                    sArr3 = sArr;
                    i9 = i110;
                    i8 = i;
                    break;
                case -1316665258:
                case 1719703945:
                    break;
                case -1025004680:
                case -267892955:
                    i14 = 9228;
                    iM2567 = (C2105.m6981("ܽۜ") ^ i6) * 85;
                    i = ((iM2567 ^ i7) * (-15615)) ^ (-1816245743);
                    i3 = -863890231;
                    i9 = iM2567 ^ i3;
                    i8 = i;
                    break;
                case -921006866:
                case -833130803:
                    sArr = sArr3;
                    listView = (ListView) C0964.m3409(activityC20401, i10);
                    RunnableC1108.m3780(activityC20401, activityC20401.f10584);
                    C1773.m5915(this);
                    if (!C0714.m2805()) {
                        sArr3 = sArr;
                        iM2569 = C0630.m2566("ܽ᩵") ^ i7;
                        i8 = ((iM2569 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                        i9 = iM2569 ^ i5;
                        activityC20401 = this;
                    } else {
                        iM2566 = C2105.m6981("ۨۜ") ^ i7;
                        i = ((iM2566 ^ i6) * 9553) ^ 2048856525;
                        i2 = -1193852074;
                        int i111 = iM2566 ^ i2;
                        sArr3 = sArr;
                        i9 = i111;
                        i8 = i;
                    }
                    break;
                case -905344226:
                case -364401127:
                    s2 = sArr2[c];
                    i18 = s2 * s2;
                    if (C4263.f13799 <= 0) {
                        iM2569 = C0630.m2566("ܽ᩵") ^ i7;
                        i8 = ((iM2569 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                    } else {
                        iM2569 = C0630.m2566("۫۫") ^ i6;
                        i8 = ((iM2569 ^ i7) * 9057) ^ (-1746285258);
                        i5 = 1856205397;
                    }
                    i9 = iM2569 ^ i5;
                    activityC20401 = this;
                    break;
                case -887957067:
                case 1680708351:
                    i14 = 39739;
                    iM2567 = (C2105.m6981("ܽۜ") ^ i6) * 85;
                    i = ((iM2567 ^ i7) * (-15615)) ^ (-1816245743);
                    i3 = -863890231;
                    i9 = iM2567 ^ i3;
                    i8 = i;
                    break;
                case -825632075:
                case 1335817329:
                    sArr = sArr3;
                    C0964.m3409(activityC20401, iM6981 ^ i11);
                    sArr4 = f65836;
                    i12 = 4;
                    i13 = 3;
                    if (C3746.m11369() >= 0) {
                        iM2566 = (C2105.m6981("ۗ᩸") + i7) * (-75);
                        i = ((iM2566 ^ i6) * 5503) ^ (-1138586839);
                        i2 = -1916232441;
                    } else {
                        iM2566 = C2105.m6981("ܺۛ") ^ i7;
                        i = ((iM2566 ^ i6) * (-745)) ^ (-1819900122);
                        i2 = 334138855;
                    }
                    int i112 = iM2566 ^ i2;
                    sArr3 = sArr;
                    i9 = i112;
                    i8 = i;
                    break;
                case -392622020:
                case -232291793:
                    sArr = sArr3;
                    iM25611 = C0630.m2566(C5695.m16034(sArr5, 7, 3, i14));
                    if (C5695.m16023() < 0) {
                        iM2566 = (C0630.m2566("֨ۘ") ^ i6) * (-11);
                        i = ((iM2566 ^ i7) * (-25789)) ^ 757163886;
                        i2 = 935437319;
                        int i113 = iM2566 ^ i2;
                        sArr3 = sArr;
                        i9 = i113;
                        i8 = i;
                    } else {
                        sArr3 = sArr;
                        iM2569 = C0630.m2566("ܽ᩵") ^ i7;
                        i8 = ((iM2569 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                        i9 = iM2569 ^ i5;
                        activityC20401 = this;
                    }
                    break;
                case -129900624:
                case 706469490:
                    super.onCreate(bundle);
                    sArr3 = f65836;
                    i15 = 1;
                    i16 = 3;
                    if (C1504.f5354) {
                        iM2567 = C0630.m2566("᩶ۚ") ^ i6;
                        i = ((iM2567 ^ i7) * 2513) ^ (-872894392);
                        i3 = -1314601849;
                    } else {
                        iM2567 = (i7 - C0630.m2566("ۡۡ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM2567 ^ i6) * (-28807)) ^ (-1014836933);
                        i3 = 849997769;
                    }
                    i9 = iM2567 ^ i3;
                    i8 = i;
                    break;
                case -97126041:
                case 1543927379:
                    ViewOnClickListenerC1958.m6429();
                    break;
                case -36444473:
                case 1114714193:
                    sArr = sArr3;
                    activityC20401.f10584 = (C9762) C0964.m3409(activityC20401, 2098462871 ^ iM25611);
                    i10 = android.R.id.list;
                    if (C1294.f4556 < 0) {
                        iM2566 = C2105.m6981("ۙ᩵") ^ i6;
                        i = ((iM2566 ^ i7) * 7699) ^ (-1019279985);
                        i2 = 603326849;
                        int i114 = iM2566 ^ i2;
                        sArr3 = sArr;
                        i9 = i114;
                        i8 = i;
                    } else {
                        s = s2;
                        sArr3 = sArr;
                        iM2568 = (C0630.m2566("ۤ᩹") + i6) * 9;
                        i8 = ((iM2568 ^ i7) * (-3305)) ^ (-2119634196);
                        i4 = -348978565;
                        i9 = iM2568 ^ i4;
                        activityC20401 = this;
                        s2 = s;
                    }
                    break;
                case 519521339:
                case 937664168:
                    if (C0714.f2697 >= 0) {
                        s = s2;
                        iM2568 = (C0630.m2566("ۤ᩹") + i6) * 9;
                        i8 = ((iM2568 ^ i7) * (-3305)) ^ (-2119634196);
                        i4 = -348978565;
                        i9 = iM2568 ^ i4;
                        activityC20401 = this;
                        s2 = s;
                    } else {
                        sArr = sArr3;
                        iM2566 = (C2105.m6981("ۗ᩸") + i7) * (-75);
                        i = ((iM2566 ^ i6) * 5503) ^ (-1138586839);
                        i2 = -1916232441;
                        int i115 = iM2566 ^ i2;
                        sArr3 = sArr;
                        i9 = i115;
                        i8 = i;
                    }
                    break;
                default:
                    iM6981 = C2105.m6981(RunnableC1108.m3789(sArr3, i15, i16, i14));
                    i11 = 2100521780;
                    if (C1128.f4106 > 0) {
                        iM2567 = (C0630.m2566("۟ᩳ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM2567 ^ i7) * 9111) ^ 77991792;
                        i3 = -1184231247;
                        i9 = iM2567 ^ i3;
                        i8 = i;
                    } else {
                        iM2569 = C0630.m2566("ܽ᩵") ^ i7;
                        i8 = ((iM2569 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                        i9 = iM2569 ^ i5;
                        activityC20401 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46723(ActivityC20401 activityC20401) {
        List listM5956 = null;
        int i = 851868073;
        int i2 = C4616.f14690;
        int i3 = ViewOnClickListenerC1958.f6529;
        int iM2566 = (C0630.m2566("᩻ۡ") ^ i3) * 97;
        int i4 = ((iM2566 ^ i2) * (-30899)) ^ (-1233277472);
        int i5 = 100634531;
        while (true) {
            i = ((((i ^ i2) * 28469) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2001444657:
                case 1997258714:
                    if (C4616.f14690 <= 0) {
                        iM2566 = (C0630.m2566("ܿ᩺") + i2) * 3;
                        i4 = ((iM2566 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM2566 = (i2 - C0630.m2566("۫ᩳ")) * (-29);
                        i4 = ((iM2566 ^ i3) * (-24651)) ^ 1492257802;
                        i5 = 1939330276;
                    }
                    break;
                case -1903339102:
                case 1722576571:
                    if (C0237.f1507 != 0) {
                        iM2566 = (C0630.m2566("ۡۗ") ^ i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 27129) ^ (-1675012457);
                        i5 = 469765905;
                    } else {
                        iM2566 = C0630.m2566("۠۟") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-5899)) ^ (-20199272);
                        i5 = 1619817502;
                    }
                    break;
                case -1768054810:
                case 883887062:
                    if (C0964.f3626 != 0) {
                        iM2566 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM2566 = C2105.m6981("ᩳ۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * 14777) ^ 1814708430;
                        i5 = 522262369;
                    }
                    break;
                case -1591480569:
                case 316840555:
                    activityC20401.f65839.notifyDataSetChanged();
                    break;
                case -1442115491:
                case 1567301946:
                    if (C7106.f21815 != 0) {
                        iM2566 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM2566 = (i3 - C2105.m6981("۠ᩳ")) * (-85);
                        i4 = ((iM2566 ^ i2) * 19265) ^ (-21675964);
                        i5 = -406691176;
                    }
                    break;
                case -1149577956:
                case -138909932:
                    C1504.m5179();
                    if (C3746.m11369() >= 0) {
                        iM2566 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM2566 = (C0630.m2566("ۡۗ") ^ i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 27129) ^ (-1675012457);
                        i5 = 469765905;
                    }
                    break;
                case -1094080289:
                case 1779535990:
                    activityC20401.f65838 = listM5956;
                    if (C2520.m8026()) {
                        iM2566 = (C0630.m2566("ۗۗ") + i2) * 101;
                        i4 = ((iM2566 ^ i3) * (-7183)) ^ 690660288;
                        i5 = 354295066;
                    } else {
                        iM2566 = (i2 - C0630.m2566("᩺ۢ")) * (-75);
                        i4 = ((iM2566 ^ i3) * (-18867)) ^ (-935269841);
                        i5 = -1257591405;
                    }
                    break;
                case -671502705:
                case -442296846:
                    listM5956 = C1789.m5956();
                    if (C3911.f12484 >= 0) {
                        iM2566 = (C0630.m2566("ܿ᩺") + i2) * 3;
                        i4 = ((iM2566 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ܽۗ")) * 45;
                        i4 = ((iM2566 ^ i3) * (-10869)) ^ (-1621310358);
                        i5 = -1468928971;
                    }
                    break;
                case -607563708:
                case -192623060:
                    if (C2105.f7037 != 0) {
                        iM2566 = (C0630.m2566("ܿ᩺") + i2) * 3;
                        i4 = ((iM2566 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM2566 = (C0630.m2566("ܺܳ") + i2) * 101;
                        i4 = ((iM2566 ^ i3) * 20923) ^ (-1545006735);
                        i5 = -1492787706;
                    }
                    break;
                case -280700308:
                case 1455459437:
                    if (C21923.f70183 != 0) {
                        iM2566 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM2566 = C0630.m2566("᩶᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * 26921) ^ 1155764883;
                        i5 = -143382094;
                    }
                    break;
                case -276839109:
                case 1469473284:
                    if (C3432.m10477() <= 0) {
                        iM2566 = (C0630.m2566("ܿ᩺") + i2) * 3;
                        i4 = ((iM2566 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM2566 = C2105.m6981("ۛۖ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 16453) ^ (-198095799);
                        i5 = 589873334;
                    }
                    break;
                case 855044469:
                case 1772400205:
                    C2272.m7503();
                    if (C0237.m1481() >= 0) {
                        iM2566 = (C0630.m2566("ܿ᩺") + i2) * 3;
                        i4 = ((iM2566 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM2566 = (C0630.m2566("ۡۗ") ^ i3) * (-99);
                        i4 = ((iM2566 ^ i2) * 27129) ^ (-1675012457);
                        i5 = 469765905;
                    }
                    break;
                case 919088264:
                case 966390648:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM2566 = (C2105.m6981("۠ۘ") + i3) * (-89);
                        i4 = ((iM2566 ^ i2) * 3947) ^ (-2132356213);
                        i5 = 1271636357;
                    }
                    break;
                case 1009260458:
                case 1425296037:
                    RunnableC0588.m2441();
                    iM2566 = (C0630.m2566("ۡۗ") ^ i3) * (-99);
                    i4 = ((iM2566 ^ i2) * 27129) ^ (-1675012457);
                    i5 = 469765905;
                    break;
                case 1783137324:
                case 2089990830:
                    C1294.m4372();
                    break;
                default:
                    if (C0237.f1507 != 0) {
                        iM2566 = C0630.m2566("ۘ֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM2566 = C2105.m6981("֡᩻") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-20461)) ^ 493428318;
                        i5 = 1043528891;
                    }
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        List listM5956 = null;
        int i = -1872949616;
        int i2 = C2520.f8000;
        int i3 = C3432.f10845;
        int iM2566 = C0630.m2566("ܰۤ") ^ i2;
        int i4 = ((iM2566 ^ i3) * 6225) ^ 1306890805;
        int i5 = 1735879687;
        while (true) {
            i = ((((i ^ i3) * 24465) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -1980907703:
                case -589116038:
                    C3432.m10477();
                    iM2566 = (C2105.m6981("ᩳۜ") ^ i2) * 55;
                    i4 = ((iM2566 ^ i3) * 29973) ^ 1852680608;
                    i5 = -384546870;
                    break;
                case -1902335703:
                case -1061413480:
                    if (C2272.m7503()) {
                        iM2566 = (C2105.m6981("ܰ֨") + i3) * 97;
                        i4 = ((iM2566 ^ i2) * (-28201)) ^ 759131241;
                        i5 = -1590726446;
                    } else {
                        iM2566 = C0630.m2566("᩺۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * 23797) ^ 1712007825;
                        i5 = 1966121459;
                    }
                    break;
                case -1861007746:
                case 329290939:
                    C0483.m2121();
                    if (!C1916.f6442) {
                        iM2566 = (C2105.m6981("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    } else {
                        iM2566 = (C0630.m2566("᩶᩶") + i3) * 97;
                        i4 = ((iM2566 ^ i2) * (-14365)) ^ 2123608199;
                        i5 = 337305505;
                    }
                    break;
                case -1155518256:
                case -411033500:
                    if (C4075.f12947 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۨܽ")) * 49;
                        i4 = ((iM2566 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM2566 = C0630.m2566("ܶ۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 27501) ^ 1532753847;
                        i5 = -1753990619;
                    }
                    break;
                case -1098987565:
                case -965540383:
                    C0237.m1481();
                    if (AbstractC2021.f6743 <= 0) {
                        iM2566 = C0630.m2566("᩸᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4453)) ^ (-739780130);
                        i5 = -1497923218;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    }
                    break;
                case -1071136387:
                case 884087630:
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۨܽ")) * 49;
                        i4 = ((iM2566 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM2566 = C2105.m6981("ܽۚ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-1805)) ^ 1224013880;
                        i5 = 1787409204;
                    }
                    break;
                case -1043429734:
                case -321699353:
                    super.onResume();
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۨܽ")) * 49;
                        i4 = ((iM2566 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM2566 = C2105.m6981("ۢܰ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 21497) ^ 189351579;
                        i5 = 1892532536;
                    }
                    break;
                case -1004073659:
                case 1922994358:
                    this.f65838 = listM5956;
                    this.f65839.notifyDataSetChanged();
                    break;
                case -750146789:
                case -76950046:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    } else {
                        iM2566 = C2105.m6981("ᩴۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20279) ^ 686435328;
                        i5 = 1584979058;
                    }
                    break;
                case -568508706:
                case -402565007:
                    C1711.m5736();
                    break;
                case -517104547:
                case 1409627606:
                    if (C2520.f8000 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۨܽ")) * 49;
                        i4 = ((iM2566 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM2566 = C0630.m2566("ۧۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 24377) ^ 1047772739;
                        i5 = 1385473951;
                    }
                    break;
                case -344998487:
                case 711532304:
                    if (C4159.f13567) {
                        iM2566 = (i2 - C0630.m2566("ۚܺ")) * (-43);
                        i4 = ((iM2566 ^ i3) * (-19535)) ^ 1927649693;
                        i5 = 1271603292;
                    } else {
                        iM2566 = C0630.m2566("᩸᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4453)) ^ (-739780130);
                        i5 = -1497923218;
                    }
                    break;
                case 483398680:
                case 899302238:
                    if (C2105.m6982() != 0) {
                        iM2566 = (C0630.m2566("᩶᩶") + i3) * 97;
                        i4 = ((iM2566 ^ i2) * (-14365)) ^ 2123608199;
                        i5 = 337305505;
                    } else {
                        iM2566 = (C2105.m6981("֨᩸") + i3) * (-19);
                        i4 = ((iM2566 ^ i2) * (-32195)) ^ 799898954;
                        i5 = -1301545044;
                    }
                    break;
                case 1008888690:
                case 1957114615:
                    if (C4117.f13076 > 0) {
                        iM2566 = (i2 - C2105.m6981("ۨܽ")) * 49;
                        i4 = ((iM2566 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM2566 = (C2105.m6981("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM2566 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    }
                    break;
                case 1023786548:
                case 1725476578:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (i2 - C2105.m6981("ۨܽ")) * 49;
                        i4 = ((iM2566 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-31185)) ^ (-431896173);
                        i5 = -294096961;
                    }
                    break;
                default:
                    listM5956 = C1789.m5956();
                    if (C3019.m9255() <= 0) {
                        iM2566 = (C2105.m6981("ܰ֨") + i3) * 97;
                        i4 = ((iM2566 ^ i2) * (-28201)) ^ 759131241;
                        i5 = -1590726446;
                    } else {
                        iM2566 = (i3 - C0630.m2566("֡ۘ")) * (-29);
                        i4 = ((iM2566 ^ i2) * (-30907)) ^ 1436413968;
                        i5 = -1193199082;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46722(ActivityC20401 activityC20401, C19866 c19866) {
        AbstractC15440 abstractC15440M45691 = null;
        int i = -2100188035;
        int i2 = C2520.f8000;
        int i3 = C11340.f33930;
        int iM2566 = C0630.m2566("ᩳᩴ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-17801)) ^ (-668671831);
        int i5 = 1575914183;
        while (true) {
            i = ((((i ^ i3) * (-365)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2073395905:
                case 1810932522:
                    RunnableC0588.m2441();
                    if (C1773.m5908() <= 0) {
                        iM2566 = (C2105.m6981("ۖ᩺") + i3) * 109;
                        i4 = ((iM2566 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۙ") + i2) * (-23);
                        i4 = ((iM2566 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    }
                    break;
                case -1970650108:
                case -226325843:
                    if (C3432.f10845 >= 0) {
                        iM2566 = C0630.m2566("ܶܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21301) ^ (-1210653521);
                        i5 = 1865617135;
                    } else {
                        iM2566 = C0630.m2566("֨۬") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25565)) ^ 1089678503;
                        i5 = -374007425;
                    }
                    break;
                case -1875848461:
                case 1044024327:
                    if (!C2126.f7087) {
                        iM2566 = (C2105.m6981("᩷ۙ") + i2) * (-23);
                        i4 = ((iM2566 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ᩴۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 16481) ^ 727283876;
                        i5 = 1441819132;
                    }
                    break;
                case -1769128087:
                case 1290771756:
                    if (C1005.f3721) {
                        iM2566 = (C2105.m6981("᩹ۚ") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * 12533) ^ 1125506020;
                        i5 = 129178876;
                    } else {
                        iM2566 = (C2105.m6981("ۖ᩺") + i3) * 109;
                        i4 = ((iM2566 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    }
                    break;
                case -1429916695:
                case -1428585208:
                    activityC20401.f65839.notifyDataSetChanged();
                    break;
                case -1262782893:
                case 261423583:
                    if (C3911.f12484 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ᩴۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 16481) ^ 727283876;
                        i5 = 1441819132;
                    } else {
                        iM2566 = C0630.m2566("᩵ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-26017)) ^ 520140027;
                        i5 = -1876428296;
                    }
                    break;
                case -1155936489:
                case -649728220:
                    C0483.m2121();
                    C0964.m3413();
                    iM2566 = (C2105.m6981("᩷ۙ") + i2) * (-23);
                    i4 = ((iM2566 ^ i3) * (-6865)) ^ (-1704644894);
                    i5 = -1621515590;
                    break;
                case -1096775308:
                case -699855630:
                    if (C0714.f2697 >= 0) {
                        iM2566 = C0630.m2566("ܶܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21301) ^ (-1210653521);
                        i5 = 1865617135;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩶ۖ")) * 115;
                        i4 = ((iM2566 ^ i2) * (-8923)) ^ 1874713961;
                        i5 = -1073833415;
                    }
                    break;
                case -1062048999:
                case 1660479677:
                    if (C0050.f910 >= 0) {
                        iM2566 = C2105.m6981("᩸ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25673)) ^ (-1226756717);
                        i5 = -1076248620;
                    } else {
                        iM2566 = (C2105.m6981("ܰ֨") + i2) * (-31);
                        i4 = ((iM2566 ^ i3) * 30597) ^ 311638460;
                        i5 = 426054291;
                    }
                    break;
                case -323088580:
                case 1472330744:
                    C4616.m13552();
                    break;
                case -159465853:
                case 461376170:
                    if (C0050.f910 >= 0) {
                        iM2566 = (C2105.m6981("ۖ᩺") + i3) * 109;
                        i4 = ((iM2566 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    } else {
                        iM2566 = C2105.m6981("᩶᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * 6305) ^ (-2057778963);
                        i5 = 1118066325;
                    }
                    break;
                case -12956431:
                case 1145061868:
                    activityC20401.f65838 = C1789.m5956();
                    if (C2167.f7158 >= 0) {
                        iM2566 = (i2 - C0630.m2566("ᩴۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM2566 ^ i3) * 16481) ^ 727283876;
                        i5 = 1441819132;
                    } else {
                        iM2566 = C2105.m6981("֫ۖ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8399) ^ 256620652;
                        i5 = 560024886;
                    }
                    break;
                case 76536892:
                case 1235355966:
                    AbstractC2021.m6569(abstractC15440M45691);
                    if (C3663.f11553) {
                        iM2566 = C2105.m6981("᩸ܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-25673)) ^ (-1226756717);
                        i5 = -1076248620;
                    } else {
                        iM2566 = C2105.m6981("ۚۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 10649) ^ 1495612386;
                        i5 = -1872052753;
                    }
                    break;
                case 850465272:
                case 1583959151:
                    abstractC15440M45691 = c19866.m45691();
                    if (C1916.m6308() >= 0) {
                        iM2566 = (C2105.m6981("᩷ۙ") + i2) * (-23);
                        i4 = ((iM2566 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    } else {
                        iM2566 = C0630.m2566("᩺۫") ^ i2;
                        i4 = ((iM2566 ^ i3) * 18837) ^ 1108547151;
                        i5 = -1039795493;
                    }
                    break;
                case 1318618852:
                case 2014282220:
                    C1773.m5908();
                    if (C3019.f9544 >= 0) {
                        iM2566 = C0630.m2566("ܶܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 21301) ^ (-1210653521);
                        i5 = 1865617135;
                    } else {
                        iM2566 = (C2105.m6981("᩷ۙ") + i2) * (-23);
                        i4 = ((iM2566 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    }
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM2566 = (C2105.m6981("ۖ᩺") + i3) * 109;
                        i4 = ((iM2566 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    } else {
                        iM2566 = C2105.m6981("᩻ۧ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14643) ^ 1070818056;
                        i5 = 345733097;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0226 A[PHI: r2 r3 r6 r11 r23
      0x0226: PHI (r2v4 l.ܶ᩶ܽ) = (r2v2 l.ܶ᩶ܽ), (r2v2 l.ܶ᩶ܽ), (r2v2 l.ܶ᩶ܽ), (r2v6 l.ܶ᩶ܽ) binds: [B:25:0x00c3, B:12:0x0070, B:6:0x0065, B:97:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r3v5 int) = (r3v3 int), (r3v2 int), (r3v2 int), (r3v2 int) binds: [B:25:0x00c3, B:12:0x0070, B:6:0x0065, B:97:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r6v4 short[]) = (r6v2 short[]), (r6v2 short[]), (r6v2 short[]), (r6v6 short[]) binds: [B:25:0x00c3, B:12:0x0070, B:6:0x0065, B:97:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r11v5 short) = (r11v2 short), (r11v2 short), (r11v3 short), (r11v2 short) binds: [B:25:0x00c3, B:12:0x0070, B:6:0x0065, B:97:0x0226] A[DONT_GENERATE, DONT_INLINE]
      0x0226: PHI (r23v6 int) = (r23v3 int), (r23v3 int), (r23v4 int), (r23v3 int) binds: [B:25:0x00c3, B:12:0x0070, B:6:0x0065, B:97:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x025a A[PHI: r7 r8 r9 r15 r18
      0x025a: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int) binds: [B:64:0x0258, B:47:0x0191, B:33:0x010b, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r8v4 short) = (r8v3 short), (r8v2 short), (r8v2 short), (r8v2 short) binds: [B:64:0x0258, B:47:0x0191, B:33:0x010b, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r9v4 int) = (r9v2 int), (r9v2 int), (r9v3 int), (r9v2 int) binds: [B:64:0x0258, B:47:0x0191, B:33:0x010b, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r15v4 int) = (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:64:0x0258, B:47:0x0191, B:33:0x010b, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x025a: PHI (r18v4 int) = (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:64:0x0258, B:47:0x0191, B:33:0x010b, B:9:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x02a8 A[PHI: r1 r4 r5 r13 r14 r16 r17
      0x02a8: PHI (r1v4 int) = (r1v2 int), (r1v2 int), (r1v3 int), (r1v2 int) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r4v3 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v4 int) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r5v3 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v4 int) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r13v4 short[]) = (r13v2 short[]), (r13v2 short[]), (r13v3 short[]), (r13v2 short[]) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r14v4 int) = (r14v2 int), (r14v2 int), (r14v3 int), (r14v2 int) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]
      0x02a8: PHI (r17v4 char) = (r17v2 char), (r17v3 char), (r17v2 char), (r17v2 char) binds: [B:72:0x02a6, B:68:0x028a, B:51:0x01b7, B:29:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int iM6981;
        int i;
        int i2;
        int i3 = C1047.f3863;
        int i4 = C4075.f12947;
        int iM2566 = (C0630.m2566("᩸ۤ") ^ i3) * (-77);
        int i5 = ((iM2566 ^ i4) * 6701) ^ (-535586756);
        C15460 c15460 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM2566 ^ (-1107272262);
        int iM12567 = 0;
        int i7 = 0;
        int iM2567 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c = 0;
        int i14 = 0;
        int i15 = -1947105289;
        int i16 = 0;
        while (true) {
            i15 = i6 ^ (i5 & (((i15 ^ i4) * (-11677)) >> 31));
            switch (i15) {
                case -2014955163:
                case 847358470:
                    ServiceConnectionC3453.m10564();
                    iM6981 = C0630.m2566("ᩳ֨") ^ i3;
                    i = ((iM6981 ^ i4) * 2471) ^ (-915682032);
                    i2 = -1705981340;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1976466720:
                case 1517309721:
                    if (iM12567 == (C0630.m2566(C1916.m6311(sArr2, i12, i13, i11)) ^ 2128454002)) {
                        iM6981 = C2105.m6981("ۤ۟") ^ i4;
                        i = ((iM6981 ^ i3) * 8497) ^ 1643152676;
                        i2 = 2114284213;
                    } else {
                        iM6981 = C2105.m6981("ۨ֨") ^ i4;
                        i = ((iM6981 ^ i3) * (-24755)) ^ 328947324;
                        i2 = 518096179;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1973079965:
                case -1732275637:
                    iM12567 = C4159.m12567(menuItem);
                    sArr2 = f65836;
                    i12 = 22;
                    if (C1294.f4556 >= 0) {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i = ((iM6981 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM6981 = C2105.m6981("ᩴۜ") ^ i4;
                        i = ((iM6981 ^ i3) * 705) ^ 1415659012;
                        i2 = 650989735;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1920514134:
                case 542279693:
                    c = 21;
                    if (RunnableC3474.f10992 <= 0) {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i = ((iM6981 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM6981 = C0630.m2566("ۗ᩵") ^ i4;
                        i = ((iM6981 ^ i3) * (-13195)) ^ 684240954;
                        i2 = 1788748024;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1846715828:
                case 2108230590:
                    if ((s * s2) - i16 > 0) {
                        iM6981 = C0630.m2566("ۗܺ") ^ i3;
                        i = ((iM6981 ^ i4) * (-2403)) ^ (-790874228);
                        i2 = -1252979846;
                    } else {
                        iM6981 = (C0630.m2566("۠ۡ") ^ i4) * 85;
                        i = ((iM6981 ^ i3) * 17765) ^ 215131154;
                        i2 = 268408503;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1766174933:
                case 2131397290:
                    return false;
                case -1563758554:
                case 142587143:
                    c15460.m31279(i7);
                    c15460.m31266(true);
                    return true;
                case -1479307788:
                case 388757144:
                    C5695.m16023();
                    return false;
                case -1365935209:
                case -412359030:
                    i13 = 3;
                    if (C2105.f7037 != 0) {
                        iM6981 = (i4 - C2105.m6981("֫֡")) * (-25);
                        i = ((iM6981 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    } else {
                        iM6981 = (C2105.m6981("᩶᩺") + i3) * 21;
                        i = ((iM6981 ^ i4) * (-9573)) ^ (-215853462);
                        i2 = -1049778008;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -1066206209:
                case -490348706:
                    s = sArr[c];
                    i14 = s * s;
                    if (C3537.f11231 >= 0) {
                        iM6981 = (i4 - C2105.m6981("֫֡")) * (-25);
                        i = ((iM6981 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    } else {
                        iM6981 = C0630.m2566("۠ۜ") ^ i4;
                        i = ((iM6981 ^ i3) * (-18067)) ^ 1468317765;
                        i2 = 1405330373;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -965884546:
                case 1754906493:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM6981 = (C2105.m6981("۬ܰ") + i3) * (-7);
                        i = ((iM6981 ^ i4) * 17563) ^ (-134275348);
                        i2 = -1504186208;
                    } else {
                        iM6981 = C0630.m2566("֫ۤ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -959869939:
                case 536336566:
                    iM2567 = C0630.m2566(C3746.m11357(sArr3, i9, i10, i11));
                    i8 = 2103107431;
                    if (C0483.f2088 >= 0) {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i = ((iM6981 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM6981 = C2105.m6981("ۛܳ") ^ i4;
                        i = ((iM6981 ^ i3) * (-14237)) ^ (-1626808991);
                        i2 = -750082503;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -833529004:
                case -309596447:
                    if (C3245.f10203 <= 0) {
                        iM6981 = (C2105.m6981("۬ܰ") + i3) * (-7);
                        i = ((iM6981 ^ i4) * 17563) ^ (-134275348);
                        i2 = -1504186208;
                    } else {
                        iM6981 = (i4 - C2105.m6981("֫֡")) * (-25);
                        i = ((iM6981 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -806484539:
                case 1638233506:
                    sArr = f65836;
                    if (C0422.f1886 <= 0) {
                        iM6981 = C0630.m2566("ܽ᩷") ^ i3;
                        i = ((iM6981 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM6981 = C2105.m6981("ۙۡ") ^ i3;
                        i = ((iM6981 ^ i4) * 11487) ^ 204860896;
                        i2 = 16751083;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -476665533:
                case 1527868505:
                    c15460.m31258(iM2567 ^ i8);
                    c15460.m31244();
                    i7 = 6;
                    if (C4117.f13076 <= 0) {
                        iM6981 = C0630.m2566("֫ۤ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                    } else {
                        iM6981 = (C0630.m2566("᩹۠") ^ i4) * 101;
                        i = ((iM6981 ^ i3) * 25297) ^ (-2116484717);
                        i2 = 1744979805;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -453180980:
                case 1120153760:
                    i9 = 25;
                    i10 = 3;
                    if (C0422.f1886 <= 0) {
                        iM6981 = (i4 - C2105.m6981("֫֡")) * (-25);
                        i = ((iM6981 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    } else {
                        iM6981 = (C0630.m2566("ۗ۠") + i3) * 115;
                        i = ((iM6981 ^ i4) * (-7121)) ^ (-1926446807);
                        i2 = 1267026139;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case -161569002:
                case 253057688:
                    c15460 = new C15460(this, this);
                    sArr3 = f65836;
                    if (C3019.m9255() <= 0) {
                        iM6981 = C0630.m2566("֫ۤ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                        i6 = iM6981 ^ i2;
                        i5 = i;
                    } else {
                        int iM2568 = (C0630.m2566("֫᩷") + i3) * 53;
                        i5 = ((iM2568 ^ i4) * (-17767)) ^ 879907829;
                        i6 = iM2568 ^ 147245433;
                    }
                    break;
                case 673378742:
                case 942265680:
                    i11 = 47187;
                    iM6981 = C0630.m2566("᩷ۤ") ^ i3;
                    i = ((iM6981 ^ i4) * 20881) ^ 78859156;
                    i2 = 119410247;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1164709084:
                case 1233440698:
                    i11 = 31762;
                    iM6981 = C0630.m2566("᩷ۤ") ^ i3;
                    i = ((iM6981 ^ i4) * 20881) ^ 78859156;
                    i2 = 119410247;
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                case 1686575894:
                case 2095850827:
                    if (C3663.m11168() < 0) {
                        iM6981 = C0630.m2566("ᩳ֨") ^ i3;
                        i = ((iM6981 ^ i4) * 2471) ^ (-915682032);
                        i2 = -1705981340;
                    } else {
                        iM6981 = (C2105.m6981("۬ܰ") + i3) * (-7);
                        i = ((iM6981 ^ i4) * 17563) ^ (-134275348);
                        i2 = -1504186208;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
                default:
                    i16 = i14 + 299013264;
                    s2 = 34584;
                    if (C1005.m3501()) {
                        iM6981 = C2105.m6981("ܳܺ") ^ i3;
                        i = ((iM6981 ^ i4) * 1325) ^ 2001439852;
                        i2 = -254678864;
                    } else {
                        iM6981 = C0630.m2566("֫ۤ") ^ i4;
                        i = ((iM6981 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                    }
                    i6 = iM6981 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
