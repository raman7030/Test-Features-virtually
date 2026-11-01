package p067l;

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
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC21758 extends AbstractActivityC5549 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ۠ۖۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f82977 = {7593, -22257, -23205, 17354, 32453, 21428, -24303, -22310, 19922, -24199, 9535, 16880, 30709, 18881, 5444, 24389, 23849, 23772, 17312, 24215, 19094, 6471, 1472, 3760, 3622, -6854, 12914, 4624, 3701, -27701, -27674, -27668, -27653, -27674, -27680, -27679, -27666, -27651, -27658, -27710, -27666, -27679, -27666, -27672, -27670, -27651};

    /* JADX INFO: renamed from: ܳۧ */
    public static final /* synthetic */ int f68512 = 0;

    /* JADX INFO: renamed from: ܿۧ */
    public List f68513 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩳۧ */
    public C23769 f68514;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
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
        int i7 = RunnableC0938.f81886;
        int i8 = C0877.f81843;
        int iM55680 = (C0873.m55680("۬ۢ") ^ i7) * 95;
        int i9 = ((iM55680 ^ i8) * (-32755)) ^ (-1978198031);
        int i10 = -1534028460;
        while (true) {
            i6 = ((((i6 ^ i8) * (-18747)) >> 31) & i9) ^ (iM55680 ^ i10);
            switch (i6) {
                case -2018675344:
                case 1543525988:
                    sArr = f82977;
                    if (C1071.f81975 <= 0) {
                        iM55680 = C0873.m55680("ܿ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM55680 = C0946.m55979("۬ܺ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-14051)) ^ 1066126225;
                        i10 = -270323055;
                    }
                    break;
                case -2002724427:
                case 1817322501:
                    i4 = 37775;
                    iM55680 = (i7 - C0946.m55979("۠ᩴ")) * (-55);
                    i9 = ((iM55680 ^ i8) * 6595) ^ 2045431845;
                    i10 = -2079116349;
                    break;
                case -1957752184:
                case 739244949:
                    C1929.m56553();
                    C1044.m56286();
                    iM55680 = (C0946.m55979("ᩳ᩸") ^ i8) * (-49);
                    i9 = ((iM55680 ^ i7) * (-1321)) ^ 1088617860;
                    i10 = 1749365827;
                    break;
                case -1776836889:
                case 1788814908:
                    C1929.m56553();
                    if (!RunnableC0897.f81856) {
                        iM55680 = (i7 - C0873.m55680("ۧۚ")) * 77;
                        i9 = ((iM55680 ^ i8) * (-2395)) ^ (-1635072557);
                        i10 = -850899010;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩸") ^ i8) * (-49);
                        i9 = ((iM55680 ^ i7) * (-1321)) ^ 1088617860;
                        i10 = 1749365827;
                    }
                    break;
                case -1713285842:
                case 131336481:
                    i3 = 8631844;
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("ۚۚ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM55680 = C0946.m55979("ۤܶ") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-7151)) ^ 1706677295;
                        i10 = 237255448;
                    }
                    break;
                case -1633623057:
                case -1547548021:
                    s = sArr[c];
                    s2 = 5876;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("ܿ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM55680 = C0946.m55979("᩶ۡ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 21243) ^ (-1887961709);
                        i10 = 2078360557;
                    }
                    break;
                case -1627903485:
                case 1793001431:
                    c = 28;
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ۚۚ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM55680 = C0873.m55680("᩺۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * 8803) ^ (-1648389962);
                        i10 = 841133584;
                    }
                    break;
                case -1614333728:
                case -1108983558:
                    if (i - (i2 + i3) <= 0) {
                        iM55680 = C0873.m55680("ۢۙ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 25563) ^ 1092001456;
                        i10 = -501358033;
                    } else {
                        iM55680 = C0873.m55680("֡᩻") ^ i8;
                        i9 = ((iM55680 ^ i7) * 28421) ^ (-104187321);
                        i10 = 654639925;
                    }
                    break;
                case -1567643071:
                case -1423515317:
                    C0955.m56025();
                    C0955.m56025();
                    return null;
                case -1529740123:
                case 156448172:
                    C0967.m56074();
                    if (C1028.f81950 > 0) {
                        iM55680 = C0873.m55680("ۚۚ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM55680 = (i7 - C0873.m55680("ۧۚ")) * 77;
                        i9 = ((iM55680 ^ i8) * (-2395)) ^ (-1635072557);
                        i10 = -850899010;
                    }
                    break;
                case -1454714414:
                case 1759036308:
                    i4 = 45936;
                    iM55680 = (i7 - C0946.m55979("۠ᩴ")) * (-55);
                    i9 = ((iM55680 ^ i8) * 6595) ^ 2045431845;
                    i10 = -2079116349;
                    break;
                case -1182344100:
                case -355440786:
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0873.m55680("ܿ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM55680 = C0946.m55979("۠ۘ") ^ i7;
                        i9 = ((iM55680 ^ i8) * 2911) ^ 2010179813;
                        i10 = 1799344605;
                    }
                    break;
                case -1022989338:
                case 1638724930:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("ܿ۫") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-1655)) ^ 418406569;
                        i10 = 1626885833;
                    } else {
                        iM55680 = C0873.m55680("֡ܺ") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-7255)) ^ 859868300;
                        i10 = 677754575;
                    }
                    break;
                case -675254315:
                case -249858449:
                    if (C1194.f82045 == 0) {
                        iM55680 = C0873.m55680("ܰܶ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ᩸") ^ i8) * (-49);
                        i9 = ((iM55680 ^ i7) * (-1321)) ^ 1088617860;
                        i10 = 1749365827;
                    }
                    break;
                case -173186341:
                case 170492476:
                    i = s * s2;
                    i2 = s * s;
                    if (C0866.f81837 >= 0) {
                        iM55680 = C0873.m55680("ܰܶ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM55680 = C0946.m55979("ۗ᩹") ^ i7;
                        i9 = ((iM55680 ^ i8) * (-12895)) ^ 10957274;
                        i10 = 134374534;
                    }
                    break;
                case 298457284:
                case 1785281042:
                    return AbstractC0942.m55970(sArr2, i5, 17, i4);
                case 506416693:
                case 1066569816:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0873.m55680("ܰܶ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۖ") ^ i8) * (-93);
                        i9 = ((iM55680 ^ i7) * 11951) ^ 1156624708;
                        i10 = -794811047;
                    }
                    break;
                case 741192965:
                case 891074801:
                    sArr2 = f82977;
                    i5 = 29;
                    if (C0882.f81846) {
                        iM55680 = C0873.m55680("ۚۚ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-2773)) ^ 269662246;
                        i10 = 408444858;
                    } else {
                        iM55680 = (C0873.m55680("᩺֫") + i7) * 109;
                        i9 = ((iM55680 ^ i8) * 13489) ^ 1639309972;
                        i10 = 246414907;
                    }
                    break;
                default:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = C0873.m55680("ܰܶ") ^ i8;
                        i9 = ((iM55680 ^ i7) * 6317) ^ 656494868;
                        i10 = 714995902;
                    } else {
                        iM55680 = C0946.m55979("ۤۜ") ^ i8;
                        i9 = ((iM55680 ^ i7) * (-16673)) ^ 434009020;
                        i10 = -1310894531;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        if (p067l.C0917.f81868 != false) goto L10;
     */
    @Override // android.widget.AdapterView.OnItemLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        String strM55810;
        int iM55680;
        int i2;
        int i3;
        String str;
        int i4;
        C21249 c21249;
        int iM55681;
        int i5;
        int i6;
        int i7;
        int i8;
        int iM55682;
        int i9;
        int i10;
        C0994 c0994;
        this = this;
        int i11 = 1394990490;
        int i12 = C1964.f83032;
        int i13 = RunnableC0938.f81886;
        int iM55979 = C0946.m55979("᩸֡") ^ i12;
        int i14 = ((iM55979 ^ i13) * 7189) ^ (-235382791);
        int i15 = iM55979 ^ 1551224276;
        final String strM48007 = null;
        C0994 c0994M50638 = null;
        String str2 = null;
        short[] sArr = null;
        int i16 = 0;
        final C21249 c212410 = null;
        int i17 = 0;
        int i18 = 0;
        C1898 c1898 = null;
        int i19 = 0;
        int iM559710 = 0;
        int i20 = 0;
        int i21 = 0;
        short s = 0;
        int i22 = 0;
        InterfaceC1583 interfaceC1583 = null;
        C0994 c0994M50639 = null;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i13) * 10205) >> 31));
            switch (i11) {
                case -2145207036:
                case -356980104:
                    strM48007 = strM48007;
                    i22 = i22;
                    c0994M50638 = c0994M50638;
                    c212410 = c212410;
                    s = f82977[14];
                    if (C0898.f81858 > 0) {
                        iM55680 = (C0873.m55680("ۘۛ") ^ i12) * (-19);
                        i14 = ((iM55680 ^ i13) * (-21059)) ^ (-1810509118);
                        i2 = 1124206537;
                        i8 = iM55680 ^ i2;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    } else {
                        strM55810 = str2;
                        int iM559711 = (C0946.m55979("᩷֨") ^ i12) * (-99);
                        i7 = ((iM559711 ^ i13) * 26431) ^ (-902805108);
                        i8 = iM559711 ^ (-513809854);
                        str2 = strM55810;
                        i14 = i7;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -2114528792:
                case -1989238057:
                    iM559710 = C0946.m55979(RunnableC0897.m55783(sArr, i21, i19, i17));
                    i20 = 2126238910;
                    if (C0946.f81894 == 0) {
                        iM55681 = C0873.m55680("۬ۨ") ^ i12;
                        i5 = ((iM55681 ^ i13) * 11975) ^ (-836888483);
                        i6 = -178701714;
                        i15 = iM55681 ^ i6;
                        i14 = i5;
                    } else {
                        c0994 = c0994M50638;
                        i22 = i22;
                        int iM559712 = C0946.m55979("᩹ۘ") ^ i12;
                        c0994M50638 = c0994;
                        i14 = ((iM559712 ^ i13) * 21473) ^ (-1777985805);
                        i15 = iM559712 ^ (-742597986);
                        c0994M50638 = c0994M50638;
                        i22 = i22;
                    }
                    break;
                case -2090323974:
                case 1725959622:
                    String str3 = strM48007;
                    int i23 = i22;
                    C0994 c0995 = c0994M50638;
                    C21249 c212411 = c212410;
                    short s2 = s;
                    int i24 = s2 + 10410;
                    if ((i24 * i24) - i16 > 0) {
                        iM55682 = C0873.m55680("ܶۢ") ^ i13;
                        i9 = ((iM55682 ^ i12) * (-12257)) ^ (-214378810);
                        i10 = 1928672812;
                    } else {
                        iM55682 = C0873.m55680("ܺ᩷") ^ i12;
                        i9 = ((iM55682 ^ i13) * (-28825)) ^ 1875639588;
                        i10 = 360701516;
                    }
                    int i25 = iM55682 ^ i10;
                    s = s2;
                    c212410 = c212411;
                    c0994M50638 = c0995;
                    i22 = i23;
                    str = str3;
                    i15 = i25;
                    i14 = i9;
                    strM48007 = str;
                    break;
                case -2058400635:
                case -858403696:
                    i4 = i22;
                    C0994 c0996 = c0994M50638;
                    c21249 = (C21249) C1964.m56587(this.f68513, i);
                    strM48007 = c21249.m48007();
                    if (AbstractC0942.f81890 > 0) {
                        i18 = 0;
                        c1898 = new C1898(this, view, 0);
                        c0994M50638 = c1898.m50638();
                        if (C1929.f83011 == 0) {
                            int iM55683 = (C0873.m55680("ۧۗ") ^ i13) * (-113);
                            int i26 = ((iM55683 ^ i12) * 26923) ^ 1845551197;
                            i15 = iM55683 ^ (-46699331);
                            this = this;
                            c212410 = c21249;
                            i14 = i26;
                            i22 = i4;
                            i18 = 0;
                        }
                    } else {
                        c0994M50638 = c0996;
                    }
                    int iM559713 = C0946.m55979("ۘۡ") ^ i13;
                    int i27 = ((iM559713 ^ i12) * (-12029)) ^ (-61672830);
                    i15 = iM559713 ^ 657677333;
                    c212410 = c21249;
                    i22 = i4;
                    c1898 = null;
                    i14 = i27;
                    this = this;
                    break;
                case -1686628027:
                case -376303328:
                    C0994 c0997 = c0994M50638;
                    int iM55684 = C0873.m55680(str2) ^ 2124799826;
                    if (C1025.f81947 >= 0) {
                        int iM559714 = (C0946.m55979("ܳ۫") + i13) * 123;
                        i14 = ((iM559714 ^ i12) * 287) ^ (-812823726);
                        i15 = iM559714 ^ 372703868;
                    } else {
                        int iM559715 = (C0946.m55979("᩶֡") + i13) * 23;
                        i15 = iM559715 ^ (-1467303326);
                        i14 = ((iM559715 ^ i12) * (-32141)) ^ 1804991232;
                    }
                    i22 = iM55684;
                    c0994M50638 = c0997;
                    break;
                case -1623639624:
                case -337351576:
                    c1898.m50636(interfaceC1583);
                    C19801.m45029(view, c1898);
                    return true;
                case -1577295116:
                case -1227859914:
                    C1025.m56230();
                    C0894.m55769();
                    return false;
                case -1558432102:
                case 547103442:
                    i17 = 11795;
                    iM55680 = (C0946.m55979("ᩳ֨") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i14 = ((iM55680 ^ i13) * 29131) ^ (-666594767);
                    i2 = -1171770794;
                    i8 = iM55680 ^ i2;
                    c212410 = c212410;
                    c0994M50638 = c0994M50638;
                    strM48007 = strM48007;
                    i15 = i8;
                    i22 = i22;
                    this = this;
                    break;
                case -1286997375:
                case 249000833:
                    c0994 = c0994M50638;
                    i22 = i22;
                    C0873.m55687(c0994, i18, i22, i18, i22);
                    c0994M50639 = c1898.m50638();
                    sArr = f82977;
                    i21 = 18;
                    if (C1194.f82045 != 0) {
                        i19 = 3;
                        int iM559716 = C0946.m55979("᩹ۘ") ^ i12;
                        c0994M50638 = c0994;
                        i14 = ((iM559716 ^ i13) * 21473) ^ (-1777985805);
                        i15 = iM559716 ^ (-742597986);
                        c0994M50638 = c0994M50638;
                    } else {
                        int iM55685 = C0873.m55680("۟ܿ") ^ i12;
                        i15 = iM55685 ^ (-1131579276);
                        i14 = ((iM55685 ^ i13) * 23319) ^ (-1251980944);
                        c0994M50638 = c0994;
                        i19 = 3;
                    }
                    i22 = i22;
                    break;
                case -1128394541:
                case 249414858:
                    ServiceConnectionC1013.m56157();
                    break;
                case -1070195369:
                case -485093526:
                    i17 = 14963;
                    iM55680 = (C0946.m55979("ᩳ֨") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i14 = ((iM55680 ^ i13) * 29131) ^ (-666594767);
                    i2 = -1171770794;
                    i8 = iM55680 ^ i2;
                    c212410 = c212410;
                    c0994M50638 = c0994M50638;
                    strM48007 = strM48007;
                    i15 = i8;
                    i22 = i22;
                    this = this;
                    break;
                case -1061494287:
                case 1920522015:
                    int i28 = iM559710 ^ i20;
                    C0946.m55972(c0994M50639, i18, i28, i18, i28);
                    interfaceC1583 = new InterfaceC1583() { // from class: l.۠᩶ܽ
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
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i29 = ActivityC21758.f68512;
                            int itemId = menuItem.getItemId();
                            ActivityC21758 activityC21758 = this.f28673;
                            String str4 = strM48007;
                            C21249 c212412 = c212410;
                            int i30 = 1;
                            if (itemId == R.string.MT_Protector) {
                                C23099 c23099 = new C23099(activityC21758, activityC21758, str4, c212412);
                                c23099.m33344(R.string.MT_Protector);
                                c23099.m33336((CharSequence) str4);
                                c23099.m33330();
                                c23099.m33365(6);
                                c23099.m33367();
                                c23099.m33352(true);
                                return true;
                            }
                            int i31 = DialogInterfaceC2564.f4230;
                            C20671 c20671 = new C20671(activityC21758);
                            c20671.m46727(R.string.MT_Protector);
                            c20671.m46718(activityC21758.getString(R.string.MT_Protector, str4));
                            c20671.m46736(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23629(i30, activityC21758, c212412));
                            c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                            c20671.m46732();
                            return true;
                        }
                    };
                    if (RunnableC0871.f81839 < 0) {
                        iM55681 = (C0873.m55680("ۚۗ") + i13) * 25;
                        i5 = ((iM55681 ^ i12) * 8631) ^ 2009761636;
                        i6 = -1603334729;
                        i15 = iM55681 ^ i6;
                        i14 = i5;
                    } else {
                        strM55810 = str2;
                        strM48007 = strM48007;
                        i22 = i22;
                        c0994M50638 = c0994M50638;
                        c212410 = c212410;
                        int iM559717 = (C0946.m55979("᩷֨") ^ i12) * (-99);
                        i7 = ((iM559717 ^ i13) * 26431) ^ (-902805108);
                        i8 = iM559717 ^ (-513809854);
                        str2 = strM55810;
                        i14 = i7;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -887649240:
                case 1119263588:
                    C0898.m55800();
                    if (C0912.f81867 <= 0) {
                        i3 = i16;
                        strM48007 = strM48007;
                        i22 = i22;
                        c0994M50638 = c0994M50638;
                        c212410 = c212410;
                        int iM559718 = C0946.m55979("ۖۖ") ^ i13;
                        i7 = ((iM559718 ^ i12) * (-28369)) ^ (-1623836970);
                        i8 = iM559718 ^ 2050257739;
                        i16 = i3;
                        i14 = i7;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    c21249 = c212410;
                    i4 = i22;
                    int iM559719 = C0946.m55979("ۘۡ") ^ i13;
                    int i29 = ((iM559719 ^ i12) * (-12029)) ^ (-61672830);
                    i15 = iM559719 ^ 657677333;
                    c212410 = c21249;
                    i22 = i4;
                    c1898 = null;
                    i14 = i29;
                    this = this;
                    break;
                case -506122551:
                case 1125420969:
                    strM48007 = strM48007;
                    short s3 = s;
                    i22 = i22;
                    c0994M50638 = c0994M50638;
                    c212410 = c212410;
                    int i30 = (s3 * s3) + 108368100;
                    i3 = i30 + i30;
                    if (!C1024.f81946) {
                        int iM559720 = (C0946.m55979("᩸᩷") ^ i13) * (-33);
                        s = s3;
                        i16 = i3;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        i14 = ((iM559720 ^ i12) * (-27317)) ^ 671027012;
                        i22 = i22;
                        str = strM48007;
                        i15 = iM559720 ^ 1424834125;
                        strM48007 = str;
                    } else {
                        s = s3;
                        int iM5597110 = C0946.m55979("ۖۖ") ^ i13;
                        i7 = ((iM5597110 ^ i12) * (-28369)) ^ (-1623836970);
                        i8 = iM5597110 ^ 2050257739;
                        i16 = i3;
                        i14 = i7;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -483822895:
                case 1744589339:
                    i22 = i22;
                    c0994M50638 = c0994M50638;
                    c212410 = c212410;
                    strM48007 = strM48007;
                    strM55810 = C0906.m55810(f82977, 15, 3, i17);
                    if (C1044.f81959 < 0) {
                        int iM559721 = C0946.m55979("۠ۤ") ^ i12;
                        str2 = strM55810;
                        i14 = ((iM559721 ^ i13) * 1473) ^ (-691312408);
                        strM48007 = strM48007;
                        i15 = iM559721 ^ (-596522041);
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        i22 = i22;
                    } else {
                        int iM5597111 = (C0946.m55979("᩷֨") ^ i12) * (-99);
                        i7 = ((iM5597111 ^ i13) * 26431) ^ (-902805108);
                        i8 = iM5597111 ^ (-513809854);
                        str2 = strM55810;
                        i14 = i7;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    }
                    break;
                case -430119166:
                case 431075847:
                    C1048.m56305();
                    c21249 = c212410;
                    i4 = i22;
                    int iM5597112 = C0946.m55979("ۘۡ") ^ i13;
                    int i210 = ((iM5597112 ^ i12) * (-12029)) ^ (-61672830);
                    i15 = iM5597112 ^ 657677333;
                    c212410 = c21249;
                    i22 = i4;
                    c1898 = null;
                    i14 = i210;
                    this = this;
                    break;
                case -338200927:
                case 1850664912:
                    C0863.m55643();
                    if (C0930.m55885() > 0) {
                        c0994 = c0994M50638;
                        i22 = i22;
                        int iM5597113 = C0946.m55979("᩹ۘ") ^ i12;
                        c0994M50638 = c0994;
                        i14 = ((iM5597113 ^ i13) * 21473) ^ (-1777985805);
                        i15 = iM5597113 ^ (-742597986);
                        c0994M50638 = c0994M50638;
                        i22 = i22;
                    } else {
                        c21249 = c212410;
                        i4 = i22;
                        int iM5597114 = C0946.m55979("ۘۡ") ^ i13;
                        int i211 = ((iM5597114 ^ i12) * (-12029)) ^ (-61672830);
                        i15 = iM5597114 ^ 657677333;
                        c212410 = c21249;
                        i22 = i4;
                        c1898 = null;
                        i14 = i211;
                        this = this;
                    }
                    break;
                default:
                    strM48007 = strM48007;
                    i22 = i22;
                    c0994M50638 = c0994M50638;
                    c212410 = c212410;
                    if (C1017.f81942 < 0) {
                        iM55680 = C0946.m55979("۬ᩳ") ^ i13;
                        i14 = ((iM55680 ^ i12) * (-15599)) ^ (-1328297774);
                        i2 = 297898793;
                        i8 = iM55680 ^ i2;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
                        i15 = i8;
                        i22 = i22;
                        this = this;
                    } else {
                        i3 = i16;
                        int iM5597115 = C0946.m55979("ۖۖ") ^ i13;
                        i7 = ((iM5597115 ^ i12) * (-28369)) ^ (-1623836970);
                        i8 = iM5597115 ^ 2050257739;
                        i16 = i3;
                        i14 = i7;
                        c212410 = c212410;
                        c0994M50638 = c0994M50638;
                        strM48007 = strM48007;
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
        int iM55680;
        int i;
        int i2;
        int i3 = C1028.f81950;
        int i4 = ViewOnClickListenerC0939.f81888;
        int iM55979 = (C0946.m55979("ۤۨ") + i3) * (-13);
        int i5 = ((iM55979 ^ i4) * 24665) ^ 760132986;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM55979 ^ 1583234975;
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
        String strM56092 = null;
        int iM55681 = 0;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * (-32379)) >> 31));
            switch (i13) {
                case -2138574621:
                case 1281414274:
                    c = '\n';
                    if (C0955.m56025()) {
                        iM55680 = (i4 - C0946.m55979("ۨ۫")) * 33;
                        i = ((iM55680 ^ i3) * 7503) ^ (-1571602776);
                        i2 = -2103567596;
                    } else {
                        iM55680 = C0946.m55979("᩷֨") ^ i3;
                        i = ((iM55680 ^ i4) * (-12223)) ^ (-564972120);
                        i2 = -1743962351;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -2023072162:
                case -1379686575:
                    i7 = s + s2;
                    if (C0890.f81849 != 0) {
                        iM55680 = (C0873.m55680("ܰ᩵") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-19715)) ^ (-616468157);
                        i2 = -1984784212;
                    } else {
                        iM55680 = (i4 - C0946.m55979("֡ᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((iM55680 ^ i3) * (-23821)) ^ (-789050484);
                        i2 = 1421921515;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1899563992:
                case 1658290102:
                    i8 = i7 * i7;
                    i9 = s * s;
                    if (C1929.m56553()) {
                        iM55680 = (C0873.m55680("ܰ᩵") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-19715)) ^ (-616468157);
                        i2 = -1984784212;
                    } else {
                        iM55680 = (C0946.m55979("ۙۙ") + i3) * (-39);
                        i = ((iM55680 ^ i4) * 22403) ^ (-931908169);
                        i2 = -477739210;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1821110131:
                case 582219917:
                    menuInflater = getMenuInflater();
                    sArr2 = f82977;
                    i12 = 11;
                    if (C1012.f81938 >= 0) {
                        iM55680 = (i3 - C0873.m55680("֨ܿ")) * (-117);
                        i = ((iM55680 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM55680 = C0873.m55680("ܺܺ") ^ i3;
                        i = ((iM55680 ^ i4) * (-31173)) ^ (-1014509791);
                        i2 = 1105753708;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1737664327:
                case -609113095:
                    RunnableC0871.m55672();
                    return false;
                case -1733155276:
                case 1152383090:
                    if (C1964.f83032 <= 0) {
                        iM55680 = (i4 - C0946.m55979("ۨ۫")) * 33;
                        i = ((iM55680 ^ i3) * 7503) ^ (-1571602776);
                        i2 = -2103567596;
                    } else {
                        iM55680 = (C0873.m55680("ۜۛ") + i4) * (-67);
                        i = ((iM55680 ^ i3) * (-22699)) ^ (-1054553218);
                        i2 = 78687681;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1535540797:
                case 803517652:
                    i11 = 10238;
                    iM55680 = C0873.m55680("᩵᩺") ^ i4;
                    i = ((iM55680 ^ i3) * (-20719)) ^ (-672412953);
                    i2 = -950732257;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1333233417:
                case 1525003936:
                    ViewOnClickListenerC0939.m55941();
                    if (RunnableC0938.f81886 < 0) {
                        iM55680 = C0946.m55979("ܰܰ") ^ i3;
                        i = ((iM55680 ^ i4) * 6531) ^ (-1025574858);
                        i2 = -21694884;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֨ܿ")) * (-117);
                        i = ((iM55680 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1066567345:
                case 762954301:
                    i11 = 11646;
                    iM55680 = C0873.m55680("᩵᩺") ^ i4;
                    i = ((iM55680 ^ i3) * (-20719)) ^ (-672412953);
                    i2 = -950732257;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -678314624:
                case 1053844685:
                    iM55681 = C0873.m55680(strM56092) ^ 2122725931;
                    if (C1071.m56343() != 0) {
                        iM55680 = (i3 - C0873.m55680("֨ܿ")) * (-117);
                        i = ((iM55680 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559710 = (C0946.m55979("֡᩶") ^ i4) * 33;
                        i5 = ((iM559710 ^ i3) * (-31453)) ^ 1365424574;
                        i6 = iM559710 ^ (-1816471208);
                    }
                    break;
                case -571402670:
                case 1006359279:
                    C0955.m56025();
                    C0992.m56107();
                    iM55680 = C0946.m55979("ܰܰ") ^ i3;
                    i = ((iM55680 ^ i4) * 6531) ^ (-1025574858);
                    i2 = -21694884;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -20824417:
                case 2051868662:
                    sArr = f82977;
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("۫ۖ") ^ i3;
                        i = ((iM55680 ^ i4) * 16519) ^ (-1565441074);
                        i2 = -430021299;
                    } else {
                        iM55680 = C0946.m55979("ܰܰ") ^ i3;
                        i = ((iM55680 ^ i4) * 6531) ^ (-1025574858);
                        i2 = -21694884;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -19444251:
                case 967741390:
                    s = sArr[c];
                    s2 = 2798;
                    if (C0873.f81841 <= 0) {
                        iM55680 = (i3 - C0873.m55680("֨ܿ")) * (-117);
                        i = ((iM55680 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM55680 = (i4 - C0873.m55680("ۘۘ")) * (-67);
                        i = ((iM55680 ^ i3) * 20837) ^ (-2081153863);
                        i2 = 2106525893;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 432634420:
                case 1029887458:
                    ServiceConnectionC1013.m56157();
                    if (C1194.m56396() > 0) {
                        iM55680 = (i3 - C0873.m55680("֨ܿ")) * (-117);
                        i = ((iM55680 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM55680 = (i4 - C0946.m55979("ۨ۫")) * 33;
                        i = ((iM55680 ^ i3) * 7503) ^ (-1571602776);
                        i2 = -2103567596;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 657578441:
                case 1923809358:
                    strM56092 = C0989.m56092(sArr2, i12, 3, i11);
                    if (C0892.f81851) {
                        iM55680 = (i4 - C0873.m55680("۟ܶ")) * (-23);
                        i = ((iM55680 ^ i3) * 24623) ^ 1704530758;
                        i2 = -1485720192;
                    } else {
                        iM55680 = (C0873.m55680("ܰ᩵") + i3) * (-53);
                        i = ((iM55680 ^ i4) * (-19715)) ^ (-616468157);
                        i2 = -1984784212;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1261165658:
                case 1547553905:
                    menuInflater.inflate(iM55681, menu);
                    return true;
                case 1333646730:
                case 1791162260:
                    int i14 = i9 + i10;
                    if ((i14 + i14) - i8 >= 0) {
                        iM55680 = C0946.m55979("᩻ۘ") ^ i4;
                        i = ((iM55680 ^ i3) * (-449)) ^ 475009862;
                        i2 = 2076453726;
                    } else {
                        iM55680 = (i3 - C0946.m55979("ܰܳ")) * 37;
                        i = ((iM55680 ^ i4) * (-20911)) ^ 1069977311;
                        i2 = -264271721;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1885872180:
                case 1896614617:
                    if (C0992.f81922 < 0) {
                        iM55680 = C0946.m55979("ܰܰ") ^ i3;
                        i = ((iM55680 ^ i4) * 6531) ^ (-1025574858);
                        i2 = -21694884;
                    } else {
                        iM55680 = (C0946.m55979("ۢۡ") ^ i4) * (-121);
                        i = ((iM55680 ^ i3) * (-23719)) ^ (-1996493976);
                        i2 = 13080279;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                default:
                    i10 = 7828804;
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i3 - C0873.m55680("֨ܿ")) * (-117);
                        i = ((iM55680 ^ i4) * 10383) ^ (-1629342706);
                        i2 = -1888681362;
                    } else {
                        iM55680 = C0873.m55680("᩹ۘ") ^ i3;
                        i = ((iM55680 ^ i4) * 19617) ^ 513334739;
                        i2 = 202933262;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = null;
        AbstractC17043 abstractC17043M48002 = null;
        int i2 = -1121812551;
        int i3 = C0898.f81858;
        int i4 = C0992.f81922;
        int iM55979 = C0946.m55979("ۚۤ") ^ i3;
        int i5 = ((iM55979 ^ i4) * (-12799)) ^ 998682384;
        int i6 = 1824096464;
        while (true) {
            i2 = ((((i2 ^ i4) * (-29459)) >> 31) & i5) ^ (iM55979 ^ i6);
            switch (i2) {
                case -1943187076:
                case -823572814:
                    RunnableC1014.m56177();
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-19533)) ^ 1919145255;
                        i6 = -2057068965;
                    } else {
                        iM55979 = C0873.m55680("ۜ۫") ^ i4;
                        i5 = ((iM55979 ^ i3) * 16945) ^ 2034022081;
                        i6 = -1478073497;
                    }
                    break;
                case -1914208529:
                case 133926212:
                    C0937.m55918();
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("ۜ۫") ^ i4;
                        i5 = ((iM55979 ^ i3) * 16945) ^ 2034022081;
                        i6 = -1478073497;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                        i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    }
                    break;
                case -1556251440:
                case -264323060:
                    if (C0866.f81837 >= 0) {
                        iM55979 = (C0873.m55680("ᩴᩴ") ^ i3) * 79;
                        i5 = ((iM55979 ^ i4) * (-18435)) ^ (-418802074);
                        i6 = 764595268;
                    } else {
                        iM55979 = (C0946.m55979("ۡ֨") ^ i4) * (-11);
                        i5 = ((iM55979 ^ i3) * (-14931)) ^ 841957622;
                        i6 = -143523075;
                    }
                    break;
                case -1519075522:
                case 968578927:
                    if (C0882.f81846) {
                        iM55979 = C0946.m55979("ܿۛ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-19533)) ^ 1919145255;
                        i6 = -2057068965;
                    } else {
                        iM55979 = (C0873.m55680("֫ܺ") ^ i3) * 59;
                        i5 = ((iM55979 ^ i4) * (-2747)) ^ (-924985559);
                        i6 = -168274901;
                    }
                    break;
                case -1053563266:
                case 57444310:
                    if (C0894.m55769() >= 0) {
                        iM55979 = C0873.m55680("ۨ᩺") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-15885)) ^ 1550109975;
                        i6 = 806258273;
                    } else {
                        iM55979 = C0873.m55680("ۢ۫") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-3103)) ^ 1353788586;
                        i6 = -861408126;
                    }
                    break;
                case -976297424:
                case 1681742930:
                    if (C1024.f81946) {
                        iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                        i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM55979 = (i3 - C0873.m55680("۠᩺")) * 77;
                        i5 = ((iM55979 ^ i4) * 13489) ^ 479263363;
                        i6 = -864690780;
                    }
                    break;
                case -912238774:
                case -575668477:
                    C1229.m56410();
                    iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                    i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                    i6 = 115066508;
                    break;
                case -660030281:
                case 1125881970:
                    if (C1124.f82007 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                        i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM55979 = C0946.m55979("ܿۘ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 21703) ^ (-1099753599);
                        i6 = 80070036;
                    }
                    break;
                case -379278563:
                case 831101211:
                    if (C0898.f81858 <= 0) {
                        iM55979 = C0873.m55680("ۜ۫") ^ i4;
                        i5 = ((iM55979 ^ i3) * 16945) ^ 2034022081;
                        i6 = -1478073497;
                    } else {
                        iM55979 = C0946.m55979("֡ᩴ") ^ i3;
                        i5 = ((iM55979 ^ i4) * (-17931)) ^ (-1402269926);
                        i6 = 1993618488;
                    }
                    break;
                case -311103410:
                case 1456229401:
                    intent.setData(abstractC17043M48002.m38680());
                    C1044.m56284(this, intent);
                    break;
                case -248891968:
                case 554082619:
                    intent = new Intent(this, (Class<?>) ActivityC3652.class);
                    if (C0937.f81884) {
                        iM55979 = (C0873.m55680("۬ܶ") ^ i3) * 35;
                        i5 = ((iM55979 ^ i4) * 28013) ^ (-1355646589);
                        i6 = 1620675759;
                    } else {
                        iM55979 = (C0873.m55680("ᩴᩴ") ^ i3) * 79;
                        i5 = ((iM55979 ^ i4) * (-18435)) ^ (-418802074);
                        i6 = 764595268;
                    }
                    break;
                case 481408017:
                case 925825751:
                    C1025.m56230();
                    break;
                case 504184084:
                case 1253065449:
                    abstractC17043M48002 = ((C21249) C1929.m56563(this.f68513, i)).m48002();
                    if (C0947.f81895) {
                        iM55979 = (C0873.m55680("ᩴᩴ") ^ i3) * 79;
                        i5 = ((iM55979 ^ i4) * (-18435)) ^ (-418802074);
                        i6 = 764595268;
                    } else {
                        iM55979 = C0946.m55979("ۨᩴ") ^ i4;
                        i5 = ((iM55979 ^ i3) * 5311) ^ 1600594971;
                        i6 = -1150470811;
                    }
                    break;
                case 607225694:
                case 2119236355:
                    if (C0877.f81843 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                        i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM55979 = (i4 - C0873.m55680("֨᩸")) * (-119);
                        i5 = ((iM55979 ^ i3) * 14289) ^ (-985622604);
                        i6 = 695979504;
                    }
                    break;
                case 1246179608:
                case 1329926622:
                    if (!C0955.f81898) {
                        iM55979 = C0873.m55680("ۨ᩺") ^ i4;
                        i5 = ((iM55979 ^ i3) * (-15885)) ^ 1550109975;
                        i6 = 806258273;
                    } else {
                        iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                        i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    }
                    break;
                default:
                    if (C1036.f81953 >= 0) {
                        iM55979 = (i3 - C0873.m55680("᩸ۧ")) * (-27);
                        i5 = ((iM55979 ^ i4) * (-8563)) ^ 1214926799;
                        i6 = 115066508;
                    } else {
                        iM55979 = (i3 - C0946.m55979("ܰܳ")) * (-57);
                        i5 = ((iM55979 ^ i4) * 8899) ^ 1827869928;
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
    
        if (p067l.C0912.f81867 > 0) goto L51;
     */
    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        short[] sArr;
        int iM55680;
        int i;
        int i2;
        int iM55681;
        int i3;
        short s;
        int iM55682;
        int i4;
        int i5;
        int iM55683;
        ActivityC21758 activityC21758 = this;
        int i6 = C0992.f81922;
        int i7 = C1003.f81929;
        int iM55684 = C0873.m55680("ۚ᩻") ^ i7;
        int i8 = ((iM55684 ^ i6) * (-23007)) ^ (-1253393553);
        ListView listView = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i9 = iM55684 ^ (-1199641543);
        int i10 = 0;
        int iM55979 = 0;
        int i11 = 0;
        int iM55685 = 0;
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
                    C0890.m55736(activityC21758, C0946.m55979(ViewOnClickListenerC0939.m55947(sArr4, i12, i13, i14)) ^ 2121191642);
                    sArr5 = f82977;
                    if (C1404.f82149 >= 0) {
                        iM55680 = (C0946.m55979("ۗ᩸") + i7) * (-75);
                        i = ((iM55680 ^ i6) * 5503) ^ (-1138586839);
                        i2 = -1916232441;
                    } else {
                        iM55680 = (C0873.m55680("ᩳۨ") + i7) * (-35);
                        i = ((iM55680 ^ i6) * (-26705)) ^ (-2037602620);
                        i2 = -1603350891;
                    }
                    int i19 = iM55680 ^ i2;
                    sArr3 = sArr;
                    i9 = i19;
                    i8 = i;
                    break;
                case -2097011003:
                case 1581857291:
                    s = s2;
                    if ((s * 3828) - (i18 + 3663396) > 0) {
                        iM55682 = (i7 - C0946.m55979("᩸᩵")) * (-79);
                        i8 = ((iM55682 ^ i6) * 14937) ^ 374875289;
                        i4 = -1769877938;
                    } else {
                        iM55682 = C0946.m55979("᩹ܿ") ^ i6;
                        i8 = ((iM55682 ^ i7) * (-22129)) ^ 1841874495;
                        i4 = 497743155;
                    }
                    i9 = iM55682 ^ i4;
                    activityC21758 = this;
                    s2 = s;
                    break;
                case -1950187596:
                case 917610268:
                    if (C1229.f82066 >= 0) {
                        iM55681 = C0873.m55680("᩶ۚ") ^ i6;
                        i = ((iM55681 ^ i7) * 2513) ^ (-872894392);
                        i3 = -1314601849;
                    } else {
                        iM55681 = C0946.m55979("ᩳᩴ") ^ i7;
                        i = ((iM55681 ^ i6) * (-24111)) ^ 417655258;
                        i3 = 362383521;
                    }
                    i9 = iM55681 ^ i3;
                    i8 = i;
                    break;
                case -1836652384:
                case 1810212026:
                    C0949.m56012();
                    C1025.m56230();
                    iM55681 = C0873.m55680("᩶ۚ") ^ i6;
                    i = ((iM55681 ^ i7) * 2513) ^ (-872894392);
                    i3 = -1314601849;
                    i9 = iM55681 ^ i3;
                    i8 = i;
                    break;
                case -1710794064:
                case -339589818:
                    s = s2;
                    sArr2 = f82977;
                    c = 0;
                    if (C0873.f81841 <= 0) {
                        iM55682 = (C0873.m55680("ۤ᩹") + i6) * 9;
                        i8 = ((iM55682 ^ i7) * (-3305)) ^ (-2119634196);
                        i4 = -348978565;
                    } else {
                        iM55682 = (i7 - C0946.m55979("ۘᩳ")) * (-55);
                        i8 = ((iM55682 ^ i6) * 18353) ^ (-693893518);
                        i4 = 1378406379;
                    }
                    i9 = iM55682 ^ i4;
                    activityC21758 = this;
                    s2 = s;
                    break;
                case -1699821622:
                case 503123243:
                    sArr = sArr3;
                    RunnableC1014.m56172(activityC21758.f13392, new ViewOnClickListenerC21623(1, activityC21758));
                    if (C0937.f81884) {
                        C23769 c23769 = new C23769(activityC21758);
                        activityC21758.f68514 = c23769;
                        listView.setAdapter((ListAdapter) c23769);
                        listView.setOnItemClickListener(activityC21758);
                        listView.setOnItemLongClickListener(activityC21758);
                    }
                    iM55680 = (C0946.m55979("ۗ᩸") + i7) * (-75);
                    i = ((iM55680 ^ i6) * 5503) ^ (-1138586839);
                    i2 = -1916232441;
                    int i110 = iM55680 ^ i2;
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
                    iM55681 = (C0946.m55979("ܽۜ") ^ i6) * 85;
                    i = ((iM55681 ^ i7) * (-15615)) ^ (-1816245743);
                    i3 = -863890231;
                    i9 = iM55681 ^ i3;
                    i8 = i;
                    break;
                case -921006866:
                case -833130803:
                    sArr = sArr3;
                    listView = (ListView) C0890.m55736(activityC21758, i10);
                    RunnableC0897.m55774(activityC21758, activityC21758.f13392);
                    C0930.m55891(this);
                    if (!C0877.m55696()) {
                        sArr3 = sArr;
                        iM55683 = C0873.m55680("ܽ᩵") ^ i7;
                        i8 = ((iM55683 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                        i9 = iM55683 ^ i5;
                        activityC21758 = this;
                    } else {
                        iM55680 = C0946.m55979("ۨۜ") ^ i7;
                        i = ((iM55680 ^ i6) * 9553) ^ 2048856525;
                        i2 = -1193852074;
                        int i111 = iM55680 ^ i2;
                        sArr3 = sArr;
                        i9 = i111;
                        i8 = i;
                    }
                    break;
                case -905344226:
                case -364401127:
                    s2 = sArr2[c];
                    i18 = s2 * s2;
                    if (C1053.f81965 <= 0) {
                        iM55683 = C0873.m55680("ܽ᩵") ^ i7;
                        i8 = ((iM55683 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                    } else {
                        iM55683 = C0873.m55680("۫۫") ^ i6;
                        i8 = ((iM55683 ^ i7) * 9057) ^ (-1746285258);
                        i5 = 1856205397;
                    }
                    i9 = iM55683 ^ i5;
                    activityC21758 = this;
                    break;
                case -887957067:
                case 1680708351:
                    i14 = 39739;
                    iM55681 = (C0946.m55979("ܽۜ") ^ i6) * 85;
                    i = ((iM55681 ^ i7) * (-15615)) ^ (-1816245743);
                    i3 = -863890231;
                    i9 = iM55681 ^ i3;
                    i8 = i;
                    break;
                case -825632075:
                case 1335817329:
                    sArr = sArr3;
                    C0890.m55736(activityC21758, iM55979 ^ i11);
                    sArr4 = f82977;
                    i12 = 4;
                    i13 = 3;
                    if (C1028.m56247() >= 0) {
                        iM55680 = (C0946.m55979("ۗ᩸") + i7) * (-75);
                        i = ((iM55680 ^ i6) * 5503) ^ (-1138586839);
                        i2 = -1916232441;
                    } else {
                        iM55680 = C0946.m55979("ܺۛ") ^ i7;
                        i = ((iM55680 ^ i6) * (-745)) ^ (-1819900122);
                        i2 = 334138855;
                    }
                    int i112 = iM55680 ^ i2;
                    sArr3 = sArr;
                    i9 = i112;
                    i8 = i;
                    break;
                case -392622020:
                case -232291793:
                    sArr = sArr3;
                    iM55685 = C0873.m55680(C1124.m56373(sArr5, 7, 3, i14));
                    if (C1124.m56367() < 0) {
                        iM55680 = (C0873.m55680("֨ۘ") ^ i6) * (-11);
                        i = ((iM55680 ^ i7) * (-25789)) ^ 757163886;
                        i2 = 935437319;
                        int i113 = iM55680 ^ i2;
                        sArr3 = sArr;
                        i9 = i113;
                        i8 = i;
                    } else {
                        sArr3 = sArr;
                        iM55683 = C0873.m55680("ܽ᩵") ^ i7;
                        i8 = ((iM55683 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                        i9 = iM55683 ^ i5;
                        activityC21758 = this;
                    }
                    break;
                case -129900624:
                case 706469490:
                    super.onCreate(bundle);
                    sArr3 = f82977;
                    i15 = 1;
                    i16 = 3;
                    if (C0917.f81868) {
                        iM55681 = C0873.m55680("᩶ۚ") ^ i6;
                        i = ((iM55681 ^ i7) * 2513) ^ (-872894392);
                        i3 = -1314601849;
                    } else {
                        iM55681 = (i7 - C0873.m55680("ۡۡ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55681 ^ i6) * (-28807)) ^ (-1014836933);
                        i3 = 849997769;
                    }
                    i9 = iM55681 ^ i3;
                    i8 = i;
                    break;
                case -97126041:
                case 1543927379:
                    ViewOnClickListenerC0939.m55941();
                    break;
                case -36444473:
                case 1114714193:
                    sArr = sArr3;
                    activityC21758.f13392 = (C1326) C0890.m55736(activityC21758, 2098462871 ^ iM55685);
                    i10 = android.R.id.list;
                    if (C0906.f81862 < 0) {
                        iM55680 = C0946.m55979("ۙ᩵") ^ i6;
                        i = ((iM55680 ^ i7) * 7699) ^ (-1019279985);
                        i2 = 603326849;
                        int i114 = iM55680 ^ i2;
                        sArr3 = sArr;
                        i9 = i114;
                        i8 = i;
                    } else {
                        s = s2;
                        sArr3 = sArr;
                        iM55682 = (C0873.m55680("ۤ᩹") + i6) * 9;
                        i8 = ((iM55682 ^ i7) * (-3305)) ^ (-2119634196);
                        i4 = -348978565;
                        i9 = iM55682 ^ i4;
                        activityC21758 = this;
                        s2 = s;
                    }
                    break;
                case 519521339:
                case 937664168:
                    if (C0877.f81843 >= 0) {
                        s = s2;
                        iM55682 = (C0873.m55680("ۤ᩹") + i6) * 9;
                        i8 = ((iM55682 ^ i7) * (-3305)) ^ (-2119634196);
                        i4 = -348978565;
                        i9 = iM55682 ^ i4;
                        activityC21758 = this;
                        s2 = s;
                    } else {
                        sArr = sArr3;
                        iM55680 = (C0946.m55979("ۗ᩸") + i7) * (-75);
                        i = ((iM55680 ^ i6) * 5503) ^ (-1138586839);
                        i2 = -1916232441;
                        int i115 = iM55680 ^ i2;
                        sArr3 = sArr;
                        i9 = i115;
                        i8 = i;
                    }
                    break;
                default:
                    iM55979 = C0946.m55979(RunnableC0897.m55783(sArr3, i15, i16, i14));
                    i11 = 2100521780;
                    if (C0898.f81858 > 0) {
                        iM55681 = (C0873.m55680("۟ᩳ") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i = ((iM55681 ^ i7) * 9111) ^ 77991792;
                        i3 = -1184231247;
                        i9 = iM55681 ^ i3;
                        i8 = i;
                    } else {
                        iM55683 = C0873.m55680("ܽ᩵") ^ i7;
                        i8 = ((iM55683 ^ i6) * (-12307)) ^ (-1213519128);
                        i5 = -1447305980;
                        i9 = iM55683 ^ i5;
                        activityC21758 = this;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m49046(ActivityC21758 activityC21758) {
        List listM8151 = null;
        int i = 851868073;
        int i2 = C1071.f81975;
        int i3 = ViewOnClickListenerC0939.f81888;
        int iM55680 = (C0873.m55680("᩻ۡ") ^ i3) * 97;
        int i4 = ((iM55680 ^ i2) * (-30899)) ^ (-1233277472);
        int i5 = 100634531;
        while (true) {
            i = ((((i ^ i2) * 28469) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2001444657:
                case 1997258714:
                    if (C1071.f81975 <= 0) {
                        iM55680 = (C0873.m55680("ܿ᩺") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM55680 = (i2 - C0873.m55680("۫ᩳ")) * (-29);
                        i4 = ((iM55680 ^ i3) * (-24651)) ^ 1492257802;
                        i5 = 1939330276;
                    }
                    break;
                case -1903339102:
                case 1722576571:
                    if (C0854.f81826 != 0) {
                        iM55680 = (C0873.m55680("ۡۗ") ^ i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 27129) ^ (-1675012457);
                        i5 = 469765905;
                    } else {
                        iM55680 = C0873.m55680("۠۟") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-5899)) ^ (-20199272);
                        i5 = 1619817502;
                    }
                    break;
                case -1768054810:
                case 883887062:
                    if (C0890.f81849 != 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM55680 = C0946.m55979("ᩳ۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * 14777) ^ 1814708430;
                        i5 = 522262369;
                    }
                    break;
                case -1591480569:
                case 316840555:
                    activityC21758.f68514.notifyDataSetChanged();
                    break;
                case -1442115491:
                case 1567301946:
                    if (C1194.f82045 != 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۠ᩳ")) * (-85);
                        i4 = ((iM55680 ^ i2) * 19265) ^ (-21675964);
                        i5 = -406691176;
                    }
                    break;
                case -1149577956:
                case -138909932:
                    C0917.m55854();
                    if (C1028.m56247() >= 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM55680 = (C0873.m55680("ۡۗ") ^ i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 27129) ^ (-1675012457);
                        i5 = 469765905;
                    }
                    break;
                case -1094080289:
                case 1779535990:
                    activityC21758.f68513 = listM8151;
                    if (C0967.m56074()) {
                        iM55680 = (C0873.m55680("ۗۗ") + i2) * 101;
                        i4 = ((iM55680 ^ i3) * (-7183)) ^ 690660288;
                        i5 = 354295066;
                    } else {
                        iM55680 = (i2 - C0873.m55680("᩺ۢ")) * (-75);
                        i4 = ((iM55680 ^ i3) * (-18867)) ^ (-935269841);
                        i5 = -1257591405;
                    }
                    break;
                case -671502705:
                case -442296846:
                    listM8151 = C4069.m8151();
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0873.m55680("ܿ᩺") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ܽۗ")) * 45;
                        i4 = ((iM55680 ^ i3) * (-10869)) ^ (-1621310358);
                        i5 = -1468928971;
                    }
                    break;
                case -607563708:
                case -192623060:
                    if (C0946.f81894 != 0) {
                        iM55680 = (C0873.m55680("ܿ᩺") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM55680 = (C0873.m55680("ܺܳ") + i2) * 101;
                        i4 = ((iM55680 ^ i3) * 20923) ^ (-1545006735);
                        i5 = -1492787706;
                    }
                    break;
                case -280700308:
                case 1455459437:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM55680 = C0873.m55680("᩶᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 26921) ^ 1155764883;
                        i5 = -143382094;
                    }
                    break;
                case -276839109:
                case 1469473284:
                    if (C1012.m56134() <= 0) {
                        iM55680 = (C0873.m55680("ܿ᩺") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM55680 = C0946.m55979("ۛۖ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 16453) ^ (-198095799);
                        i5 = 589873334;
                    }
                    break;
                case 855044469:
                case 1772400205:
                    C0955.m56025();
                    if (C0854.m55595() >= 0) {
                        iM55680 = (C0873.m55680("ܿ᩺") + i2) * 3;
                        i4 = ((iM55680 ^ i3) * (-19923)) ^ 1507582753;
                        i5 = 1209965115;
                    } else {
                        iM55680 = (C0873.m55680("ۡۗ") ^ i3) * (-99);
                        i4 = ((iM55680 ^ i2) * 27129) ^ (-1675012457);
                        i5 = 469765905;
                    }
                    break;
                case 919088264:
                case 966390648:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM55680 = (C0946.m55979("۠ۘ") + i3) * (-89);
                        i4 = ((iM55680 ^ i2) * 3947) ^ (-2132356213);
                        i5 = 1271636357;
                    }
                    break;
                case 1009260458:
                case 1425296037:
                    RunnableC0871.m55672();
                    iM55680 = (C0873.m55680("ۡۗ") ^ i3) * (-99);
                    i4 = ((iM55680 ^ i2) * 27129) ^ (-1675012457);
                    i5 = 469765905;
                    break;
                case 1783137324:
                case 2089990830:
                    C0906.m55809();
                    break;
                default:
                    if (C0854.f81826 != 0) {
                        iM55680 = C0873.m55680("ۘ֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * 1291) ^ (-1125292398);
                        i5 = 1327475012;
                    } else {
                        iM55680 = C0946.m55979("֡᩻") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-20461)) ^ 493428318;
                        i5 = 1043528891;
                    }
                    break;
            }
            return;
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        List listM8151 = null;
        int i = -1872949616;
        int i2 = C0967.f81910;
        int i3 = C1012.f81938;
        int iM55680 = C0873.m55680("ܰۤ") ^ i2;
        int i4 = ((iM55680 ^ i3) * 6225) ^ 1306890805;
        int i5 = 1735879687;
        while (true) {
            i = ((((i ^ i3) * 24465) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -1980907703:
                case -589116038:
                    C1012.m56134();
                    iM55680 = (C0946.m55979("ᩳۜ") ^ i2) * 55;
                    i4 = ((iM55680 ^ i3) * 29973) ^ 1852680608;
                    i5 = -384546870;
                    break;
                case -1902335703:
                case -1061413480:
                    if (C0955.m56025()) {
                        iM55680 = (C0946.m55979("ܰ֨") + i3) * 97;
                        i4 = ((iM55680 ^ i2) * (-28201)) ^ 759131241;
                        i5 = -1590726446;
                    } else {
                        iM55680 = C0873.m55680("᩺۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * 23797) ^ 1712007825;
                        i5 = 1966121459;
                    }
                    break;
                case -1861007746:
                case 329290939:
                    C0866.m55645();
                    if (!C0937.f81884) {
                        iM55680 = (C0946.m55979("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    } else {
                        iM55680 = (C0873.m55680("᩶᩶") + i3) * 97;
                        i4 = ((iM55680 ^ i2) * (-14365)) ^ 2123608199;
                        i5 = 337305505;
                    }
                    break;
                case -1155518256:
                case -411033500:
                    if (C1044.f81959 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۨܽ")) * 49;
                        i4 = ((iM55680 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM55680 = C0873.m55680("ܶ۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 27501) ^ 1532753847;
                        i5 = -1753990619;
                    }
                    break;
                case -1098987565:
                case -965540383:
                    C0854.m55595();
                    if (AbstractC0942.f81890 <= 0) {
                        iM55680 = C0873.m55680("᩸᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-4453)) ^ (-739780130);
                        i5 = -1497923218;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    }
                    break;
                case -1071136387:
                case 884087630:
                    if (C0949.f81897 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۨܽ")) * 49;
                        i4 = ((iM55680 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM55680 = C0946.m55979("ܽۚ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-1805)) ^ 1224013880;
                        i5 = 1787409204;
                    }
                    break;
                case -1043429734:
                case -321699353:
                    super.onResume();
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۨܽ")) * 49;
                        i4 = ((iM55680 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM55680 = C0946.m55979("ۢܰ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 21497) ^ 189351579;
                        i5 = 1892532536;
                    }
                    break;
                case -1004073659:
                case 1922994358:
                    this.f68513 = listM8151;
                    this.f68514.notifyDataSetChanged();
                    break;
                case -750146789:
                case -76950046:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0946.m55979("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    } else {
                        iM55680 = C0946.m55979("ᩴۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20279) ^ 686435328;
                        i5 = 1584979058;
                    }
                    break;
                case -568508706:
                case -402565007:
                    C0927.m55873();
                    break;
                case -517104547:
                case 1409627606:
                    if (C0967.f81910 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۨܽ")) * 49;
                        i4 = ((iM55680 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM55680 = C0873.m55680("ۧۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 24377) ^ 1047772739;
                        i5 = 1385473951;
                    }
                    break;
                case -344998487:
                case 711532304:
                    if (C1048.f81963) {
                        iM55680 = (i2 - C0873.m55680("ۚܺ")) * (-43);
                        i4 = ((iM55680 ^ i3) * (-19535)) ^ 1927649693;
                        i5 = 1271603292;
                    } else {
                        iM55680 = C0873.m55680("᩸᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-4453)) ^ (-739780130);
                        i5 = -1497923218;
                    }
                    break;
                case 483398680:
                case 899302238:
                    if (C0946.m55980() != 0) {
                        iM55680 = (C0873.m55680("᩶᩶") + i3) * 97;
                        i4 = ((iM55680 ^ i2) * (-14365)) ^ 2123608199;
                        i5 = 337305505;
                    } else {
                        iM55680 = (C0946.m55979("֨᩸") + i3) * (-19);
                        i4 = ((iM55680 ^ i2) * (-32195)) ^ 799898954;
                        i5 = -1301545044;
                    }
                    break;
                case 1008888690:
                case 1957114615:
                    if (C1046.f81962 > 0) {
                        iM55680 = (i2 - C0946.m55979("ۨܽ")) * 49;
                        i4 = ((iM55680 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM55680 = (C0946.m55979("ᩳۜ") ^ i2) * 55;
                        i4 = ((iM55680 ^ i3) * 29973) ^ 1852680608;
                        i5 = -384546870;
                    }
                    break;
                case 1023786548:
                case 1725476578:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (i2 - C0946.m55979("ۨܽ")) * 49;
                        i4 = ((iM55680 ^ i3) * 18925) ^ (-1037958167);
                        i5 = 2083323694;
                    } else {
                        iM55680 = C0946.m55979("ۜ۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-31185)) ^ (-431896173);
                        i5 = -294096961;
                    }
                    break;
                default:
                    listM8151 = C4069.m8151();
                    if (C0992.m56107() <= 0) {
                        iM55680 = (C0946.m55979("ܰ֨") + i3) * 97;
                        i4 = ((iM55680 ^ i2) * (-28201)) ^ 759131241;
                        i5 = -1590726446;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֡ۘ")) * (-29);
                        i4 = ((iM55680 ^ i2) * (-30907)) ^ 1436413968;
                        i5 = -1193199082;
                    }
                    break;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49045(ActivityC21758 activityC21758, C21249 c21249) {
        AbstractC17043 abstractC17043M48002 = null;
        int i = -2100188035;
        int i2 = C0967.f81910;
        int i3 = C1404.f82149;
        int iM55680 = C0873.m55680("ᩳᩴ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-17801)) ^ (-668671831);
        int i5 = 1575914183;
        while (true) {
            i = ((((i ^ i3) * (-365)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2073395905:
                case 1810932522:
                    RunnableC0871.m55672();
                    if (C0930.m55885() <= 0) {
                        iM55680 = (C0946.m55979("ۖ᩺") + i3) * 109;
                        i4 = ((iM55680 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۙ") + i2) * (-23);
                        i4 = ((iM55680 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    }
                    break;
                case -1970650108:
                case -226325843:
                    if (C1012.f81938 >= 0) {
                        iM55680 = C0873.m55680("ܶܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21301) ^ (-1210653521);
                        i5 = 1865617135;
                    } else {
                        iM55680 = C0873.m55680("֨۬") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25565)) ^ 1089678503;
                        i5 = -374007425;
                    }
                    break;
                case -1875848461:
                case 1044024327:
                    if (!C0947.f81895) {
                        iM55680 = (C0946.m55979("᩷ۙ") + i2) * (-23);
                        i4 = ((iM55680 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ᩴۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 16481) ^ 727283876;
                        i5 = 1441819132;
                    }
                    break;
                case -1769128087:
                case 1290771756:
                    if (C0892.f81851) {
                        iM55680 = (C0946.m55979("᩹ۚ") ^ i3) * (-113);
                        i4 = ((iM55680 ^ i2) * 12533) ^ 1125506020;
                        i5 = 129178876;
                    } else {
                        iM55680 = (C0946.m55979("ۖ᩺") + i3) * 109;
                        i4 = ((iM55680 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    }
                    break;
                case -1429916695:
                case -1428585208:
                    activityC21758.f68514.notifyDataSetChanged();
                    break;
                case -1262782893:
                case 261423583:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ᩴۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 16481) ^ 727283876;
                        i5 = 1441819132;
                    } else {
                        iM55680 = C0873.m55680("᩵ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-26017)) ^ 520140027;
                        i5 = -1876428296;
                    }
                    break;
                case -1155936489:
                case -649728220:
                    C0866.m55645();
                    C0890.m55740();
                    iM55680 = (C0946.m55979("᩷ۙ") + i2) * (-23);
                    i4 = ((iM55680 ^ i3) * (-6865)) ^ (-1704644894);
                    i5 = -1621515590;
                    break;
                case -1096775308:
                case -699855630:
                    if (C0877.f81843 >= 0) {
                        iM55680 = C0873.m55680("ܶܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21301) ^ (-1210653521);
                        i5 = 1865617135;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩶ۖ")) * 115;
                        i4 = ((iM55680 ^ i2) * (-8923)) ^ 1874713961;
                        i5 = -1073833415;
                    }
                    break;
                case -1062048999:
                case 1660479677:
                    if (C0845.f81821 >= 0) {
                        iM55680 = C0946.m55979("᩸ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25673)) ^ (-1226756717);
                        i5 = -1076248620;
                    } else {
                        iM55680 = (C0946.m55979("ܰ֨") + i2) * (-31);
                        i4 = ((iM55680 ^ i3) * 30597) ^ 311638460;
                        i5 = 426054291;
                    }
                    break;
                case -323088580:
                case 1472330744:
                    C1071.m56343();
                    break;
                case -159465853:
                case 461376170:
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0946.m55979("ۖ᩺") + i3) * 109;
                        i4 = ((iM55680 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    } else {
                        iM55680 = C0946.m55979("᩶᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * 6305) ^ (-2057778963);
                        i5 = 1118066325;
                    }
                    break;
                case -12956431:
                case 1145061868:
                    activityC21758.f68513 = C4069.m8151();
                    if (C0949.f81897 >= 0) {
                        iM55680 = (i2 - C0873.m55680("ᩴۘ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((iM55680 ^ i3) * 16481) ^ 727283876;
                        i5 = 1441819132;
                    } else {
                        iM55680 = C0946.m55979("֫ۖ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8399) ^ 256620652;
                        i5 = 560024886;
                    }
                    break;
                case 76536892:
                case 1235355966:
                    AbstractC0942.m55966(abstractC17043M48002);
                    if (C1024.f81946) {
                        iM55680 = C0946.m55979("᩸ܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-25673)) ^ (-1226756717);
                        i5 = -1076248620;
                    } else {
                        iM55680 = C0946.m55979("ۚۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 10649) ^ 1495612386;
                        i5 = -1872052753;
                    }
                    break;
                case 850465272:
                case 1583959151:
                    abstractC17043M48002 = c21249.m48002();
                    if (C0937.m55918() >= 0) {
                        iM55680 = (C0946.m55979("᩷ۙ") + i2) * (-23);
                        i4 = ((iM55680 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    } else {
                        iM55680 = C0873.m55680("᩺۫") ^ i2;
                        i4 = ((iM55680 ^ i3) * 18837) ^ 1108547151;
                        i5 = -1039795493;
                    }
                    break;
                case 1318618852:
                case 2014282220:
                    C0930.m55885();
                    if (C0992.f81922 >= 0) {
                        iM55680 = C0873.m55680("ܶܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 21301) ^ (-1210653521);
                        i5 = 1865617135;
                    } else {
                        iM55680 = (C0946.m55979("᩷ۙ") + i2) * (-23);
                        i4 = ((iM55680 ^ i3) * (-6865)) ^ (-1704644894);
                        i5 = -1621515590;
                    }
                    break;
                default:
                    if (C1929.f83011 != 0) {
                        iM55680 = (C0946.m55979("ۖ᩺") + i3) * 109;
                        i4 = ((iM55680 ^ i2) * 13667) ^ (-1757062872);
                        i5 = 1751300391;
                    } else {
                        iM55680 = C0946.m55979("᩻ۧ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14643) ^ 1070818056;
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
        int iM55979;
        int i;
        int i2;
        int i3 = C0894.f81854;
        int i4 = C1044.f81959;
        int iM55680 = (C0873.m55680("᩸ۤ") ^ i3) * (-77);
        int i5 = ((iM55680 ^ i4) * 6701) ^ (-535586756);
        C17062 c17062 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = iM55680 ^ (-1107272262);
        int iM56307 = 0;
        int i7 = 0;
        int iM55681 = 0;
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
                    ServiceConnectionC1013.m56157();
                    iM55979 = C0873.m55680("ᩳ֨") ^ i3;
                    i = ((iM55979 ^ i4) * 2471) ^ (-915682032);
                    i2 = -1705981340;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1976466720:
                case 1517309721:
                    if (iM56307 == (C0873.m55680(C0937.m55921(sArr2, i12, i13, i11)) ^ 2128454002)) {
                        iM55979 = C0946.m55979("ۤ۟") ^ i4;
                        i = ((iM55979 ^ i3) * 8497) ^ 1643152676;
                        i2 = 2114284213;
                    } else {
                        iM55979 = C0946.m55979("ۨ֨") ^ i4;
                        i = ((iM55979 ^ i3) * (-24755)) ^ 328947324;
                        i2 = 518096179;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1973079965:
                case -1732275637:
                    iM56307 = C1048.m56307(menuItem);
                    sArr2 = f82977;
                    i12 = 22;
                    if (C0906.f81862 >= 0) {
                        iM55979 = C0873.m55680("ܽ᩷") ^ i3;
                        i = ((iM55979 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM55979 = C0946.m55979("ᩴۜ") ^ i4;
                        i = ((iM55979 ^ i3) * 705) ^ 1415659012;
                        i2 = 650989735;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1920514134:
                case 542279693:
                    c = 21;
                    if (RunnableC1014.f81941 <= 0) {
                        iM55979 = C0873.m55680("ܽ᩷") ^ i3;
                        i = ((iM55979 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM55979 = C0873.m55680("ۗ᩵") ^ i4;
                        i = ((iM55979 ^ i3) * (-13195)) ^ 684240954;
                        i2 = 1788748024;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1846715828:
                case 2108230590:
                    if ((s * s2) - i16 > 0) {
                        iM55979 = C0873.m55680("ۗܺ") ^ i3;
                        i = ((iM55979 ^ i4) * (-2403)) ^ (-790874228);
                        i2 = -1252979846;
                    } else {
                        iM55979 = (C0873.m55680("۠ۡ") ^ i4) * 85;
                        i = ((iM55979 ^ i3) * 17765) ^ 215131154;
                        i2 = 268408503;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1766174933:
                case 2131397290:
                    return false;
                case -1563758554:
                case 142587143:
                    c17062.m33365(i7);
                    c17062.m33352(true);
                    return true;
                case -1479307788:
                case 388757144:
                    C1124.m56367();
                    return false;
                case -1365935209:
                case -412359030:
                    i13 = 3;
                    if (C0946.f81894 != 0) {
                        iM55979 = (i4 - C0946.m55979("֫֡")) * (-25);
                        i = ((iM55979 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    } else {
                        iM55979 = (C0946.m55979("᩶᩺") + i3) * 21;
                        i = ((iM55979 ^ i4) * (-9573)) ^ (-215853462);
                        i2 = -1049778008;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -1066206209:
                case -490348706:
                    s = sArr[c];
                    i14 = s * s;
                    if (C1017.f81942 >= 0) {
                        iM55979 = (i4 - C0946.m55979("֫֡")) * (-25);
                        i = ((iM55979 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    } else {
                        iM55979 = C0873.m55680("۠ۜ") ^ i4;
                        i = ((iM55979 ^ i3) * (-18067)) ^ 1468317765;
                        i2 = 1405330373;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -965884546:
                case 1754906493:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55979 = (C0946.m55979("۬ܰ") + i3) * (-7);
                        i = ((iM55979 ^ i4) * 17563) ^ (-134275348);
                        i2 = -1504186208;
                    } else {
                        iM55979 = C0873.m55680("֫ۤ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -959869939:
                case 536336566:
                    iM55681 = C0873.m55680(C1028.m56235(sArr3, i9, i10, i11));
                    i8 = 2103107431;
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("ܽ᩷") ^ i3;
                        i = ((iM55979 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM55979 = C0946.m55979("ۛܳ") ^ i4;
                        i = ((iM55979 ^ i3) * (-14237)) ^ (-1626808991);
                        i2 = -750082503;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -833529004:
                case -309596447:
                    if (C1003.f81929 <= 0) {
                        iM55979 = (C0946.m55979("۬ܰ") + i3) * (-7);
                        i = ((iM55979 ^ i4) * 17563) ^ (-134275348);
                        i2 = -1504186208;
                    } else {
                        iM55979 = (i4 - C0946.m55979("֫֡")) * (-25);
                        i = ((iM55979 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -806484539:
                case 1638233506:
                    sArr = f82977;
                    if (C0863.f81833 <= 0) {
                        iM55979 = C0873.m55680("ܽ᩷") ^ i3;
                        i = ((iM55979 ^ i4) * (-11755)) ^ (-725491342);
                        i2 = 1126802663;
                    } else {
                        iM55979 = C0946.m55979("ۙۡ") ^ i3;
                        i = ((iM55979 ^ i4) * 11487) ^ 204860896;
                        i2 = 16751083;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -476665533:
                case 1527868505:
                    c17062.m33344(iM55681 ^ i8);
                    c17062.m33330();
                    i7 = 6;
                    if (C1046.f81962 <= 0) {
                        iM55979 = C0873.m55680("֫ۤ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                    } else {
                        iM55979 = (C0873.m55680("᩹۠") ^ i4) * 101;
                        i = ((iM55979 ^ i3) * 25297) ^ (-2116484717);
                        i2 = 1744979805;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -453180980:
                case 1120153760:
                    i9 = 25;
                    i10 = 3;
                    if (C0863.f81833 <= 0) {
                        iM55979 = (i4 - C0946.m55979("֫֡")) * (-25);
                        i = ((iM55979 ^ i3) * 11423) ^ 1117085754;
                        i2 = 1765880368;
                    } else {
                        iM55979 = (C0873.m55680("ۗ۠") + i3) * 115;
                        i = ((iM55979 ^ i4) * (-7121)) ^ (-1926446807);
                        i2 = 1267026139;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case -161569002:
                case 253057688:
                    c17062 = new C17062(this, this);
                    sArr3 = f82977;
                    if (C0992.m56107() <= 0) {
                        iM55979 = C0873.m55680("֫ۤ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                        i6 = iM55979 ^ i2;
                        i5 = i;
                    } else {
                        int iM55682 = (C0873.m55680("֫᩷") + i3) * 53;
                        i5 = ((iM55682 ^ i4) * (-17767)) ^ 879907829;
                        i6 = iM55682 ^ 147245433;
                    }
                    break;
                case 673378742:
                case 942265680:
                    i11 = 47187;
                    iM55979 = C0873.m55680("᩷ۤ") ^ i3;
                    i = ((iM55979 ^ i4) * 20881) ^ 78859156;
                    i2 = 119410247;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1164709084:
                case 1233440698:
                    i11 = 31762;
                    iM55979 = C0873.m55680("᩷ۤ") ^ i3;
                    i = ((iM55979 ^ i4) * 20881) ^ 78859156;
                    i2 = 119410247;
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                case 1686575894:
                case 2095850827:
                    if (C1024.m56209() < 0) {
                        iM55979 = C0873.m55680("ᩳ֨") ^ i3;
                        i = ((iM55979 ^ i4) * 2471) ^ (-915682032);
                        i2 = -1705981340;
                    } else {
                        iM55979 = (C0946.m55979("۬ܰ") + i3) * (-7);
                        i = ((iM55979 ^ i4) * 17563) ^ (-134275348);
                        i2 = -1504186208;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
                default:
                    i16 = i14 + 299013264;
                    s2 = 34584;
                    if (C0892.m55749()) {
                        iM55979 = C0946.m55979("ܳܺ") ^ i3;
                        i = ((iM55979 ^ i4) * 1325) ^ 2001439852;
                        i2 = -254678864;
                    } else {
                        iM55979 = C0873.m55680("֫ۤ") ^ i4;
                        i = ((iM55979 ^ i3) * (-30399)) ^ (-1514100107);
                        i2 = -321078185;
                    }
                    i6 = iM55979 ^ i2;
                    i5 = i;
                    break;
            }
        }
    }
}
