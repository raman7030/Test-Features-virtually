package l;

import android.content.SharedPreferences;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9655 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23331 f29240;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8949 f29241;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17979 f29242;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f29243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9655(ViewOnClickListenerC8949 viewOnClickListenerC8949, AbstractActivityC3346 abstractActivityC3346, C23331 c23331, String str, C17979 c17979) {
        super(abstractActivityC3346, -1);
        int i = -1868051307;
        int i2 = RunnableC1937.f6483;
        int i3 = C0050.f910;
        this.f29241 = viewOnClickListenerC8949;
        this.f29240 = c23331;
        this.f29243 = str;
        this.f29242 = c17979;
        int iM6981 = (i3 - C2105.m6981("ۙۧ")) * 85;
        int i4 = ((iM6981 ^ i2) * 25767) ^ 2019728701;
        int i5 = -1319652625;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i2) * (-1687)) >> 31));
            switch (i) {
                case -1936833184:
                case 2125219547:
                    RunnableC1108.m3790();
                    C3432.m10477();
                    throw new RuntimeException();
                case -1752486778:
                case -1570024007:
                    C1128.m3851();
                    C2126.m7040();
                    break;
                case -1679753442:
                case 1356438001:
                    if (!C3663.f11553) {
                        iM6981 = C0630.m2566("᩷᩹") ^ i2;
                        i4 = ((iM6981 ^ i3) * (-7547)) ^ (-1421156560);
                        i5 = 864797809;
                    }
                    break;
                case -960176417:
                case 750596855:
                    return;
                case -349091064:
                case 884429856:
                    ServiceConnectionC3453.m10564();
                    if (!RunnableC1108.f4040) {
                        iM6981 = C2105.m6981("ۙܺ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 12371) ^ (-239447613);
                        i5 = -92377246;
                    }
                    break;
                case 145971626:
                case 1805478857:
                    C1128.m3851();
                    if (C0050.f910 >= 0) {
                        iM6981 = (C0630.m2566("ܶܶ") ^ i3) * 31;
                        i4 = ((iM6981 ^ i2) * (-8599)) ^ 102965880;
                        i5 = -926880732;
                    }
                    break;
                default:
                    if (C4616.m13552() != 0) {
                        iM6981 = (i3 - C0630.m2566("ܶ۬")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM6981 ^ i2) * 18125) ^ (-724029045);
                        i5 = 1867349773;
                    } else {
                        iM6981 = (C0630.m2566("ܽ᩺") ^ i3) * 61;
                        i4 = ((iM6981 ^ i2) * 22375) ^ (-486632796);
                        i5 = 523574345;
                        continue;
                    }
                    break;
            }
            iM6981 = C2105.m6981("ۙܿ") ^ i2;
            i4 = ((iM6981 ^ i3) * 14459) ^ 612039238;
            i5 = 493699532;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0374 A[PHI: r3 r18
      0x0374: PHI (r3v5 android.widget.TextView) = (r3v2 android.widget.TextView), (r3v3 android.widget.TextView), (r3v2 android.widget.TextView) binds: [B:99:0x0372, B:91:0x0333, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]
      0x0374: PHI (r18v47 bin.mt.plugin.api.preference.PluginPreference$Input$Validator) = 
      (r18v4 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
      (r18v6 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
      (r18v48 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
     binds: [B:99:0x0372, B:91:0x0333, B:15:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x03a6 A[PHI: r4 r18
      0x03a6: PHI (r4v4 l.ᩴܳ᩷) = (r4v2 l.ᩴܳ᩷), (r4v2 l.ᩴܳ᩷), (r4v3 l.ᩴܳ᩷), (r4v2 l.ᩴܳ᩷) binds: [B:103:0x03a4, B:95:0x0351, B:87:0x0313, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x03a6: PHI (r18v37 bin.mt.plugin.api.preference.PluginPreference$Input$Validator) = 
      (r18v3 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
      (r18v5 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
      (r18v7 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
      (r18v38 bin.mt.plugin.api.preference.PluginPreference$Input$Validator)
     binds: [B:103:0x03a4, B:95:0x0351, B:87:0x0313, B:27:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0195 A[PHI: r11
      0x0195: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v2 java.lang.String), (r11v2 java.lang.String) binds: [B:55:0x0193, B:23:0x00ac, B:20:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d0 A[PHI: r10
      0x01d0: PHI (r10v4 android.content.SharedPreferences$Editor) = 
      (r10v3 android.content.SharedPreferences$Editor)
      (r10v2 android.content.SharedPreferences$Editor)
      (r10v2 android.content.SharedPreferences$Editor)
      (r10v2 android.content.SharedPreferences$Editor)
     binds: [B:59:0x01ce, B:26:0x00b4, B:23:0x00ac, B:10:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0220 A[PHI: r9
      0x0220: PHI (r9v4 bin.mt.plugin.api.PluginContext) = 
      (r9v3 bin.mt.plugin.api.PluginContext)
      (r9v2 bin.mt.plugin.api.PluginContext)
      (r9v2 bin.mt.plugin.api.PluginContext)
      (r9v2 bin.mt.plugin.api.PluginContext)
     binds: [B:65:0x0208, B:38:0x00f1, B:35:0x00d2, B:32:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (l.C5695.f17556 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        if (l.C0714.f2697 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (l.C1711.f5919 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (l.C0422.m1963() == false) goto L27;
     */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2170() {
        PluginPreference.Input.Validator validator;
        int iM2566;
        int i;
        int i2;
        int iM6981;
        int i3;
        PluginPreference.Input.Validator validator2;
        int iM6982;
        PluginPreference.Input.Validator validator3;
        int i4;
        int i5 = C3537.f11231;
        int i6 = C1420.f5096;
        int iM2567 = (C0630.m2566("֫۟") ^ i5) * 13;
        int i7 = ((iM2567 ^ i6) * (-28483)) ^ 2029922409;
        PluginPreference.Input.Validator validator4 = null;
        String str = null;
        int i8 = iM2567 ^ 307012228;
        int i9 = 865113934;
        C23331 c23331 = null;
        C17979 c17979 = null;
        String strM31260 = null;
        SharedPreferences.Editor editorPutString = null;
        ActivityC18827 activityC18827 = null;
        String str2 = null;
        TextView textView = null;
        SharedPreferences.Editor editorEdit = null;
        ViewOnClickListenerC8949 viewOnClickListenerC8949 = null;
        PluginContext pluginContext = null;
        String strValidate = null;
        while (true) {
            i9 = i8 ^ (i7 & (((i9 ^ i6) * 10839) >> 31));
            switch (i9) {
                case -1983828195:
                case -1682267313:
                    validator2 = validator4;
                    strValidate = validator2.validate(strM31260);
                    if (strValidate == null) {
                        validator4 = validator2;
                        iM6981 = C0630.m2566("ܶܿ") ^ i6;
                        i = ((iM6981 ^ i5) * (-24627)) ^ (-1419661953);
                        i3 = -283537858;
                        i8 = iM6981 ^ i3;
                        i7 = i;
                    } else {
                        iM6982 = (C2105.m6981("ᩴ֡") ^ i5) * (-73);
                        validator3 = validator2;
                        i7 = ((iM6982 ^ i6) * 17415) ^ 452539690;
                        i4 = -77472916;
                        int i10 = iM6982 ^ i4;
                        validator4 = validator3;
                        i8 = i10;
                    }
                    break;
                case -1880995791:
                case 1374406853:
                    break;
                case -1841724792:
                case -23452783:
                    break;
                case -1756019230:
                case 2018106581:
                    str2 = c23331.f24119;
                    if (C2167.f7158 >= 0) {
                        iM6981 = (C2105.m6981("ᩴ᩵") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM6981 ^ i6) * 27217) ^ 884408861;
                        i3 = -239842306;
                    } else {
                        iM6981 = (C0630.m2566("ۨۧ") ^ i6) * (-101);
                        i = ((iM6981 ^ i5) * 6601) ^ 74408409;
                        i3 = -91237261;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -1708801297:
                case -1497295717:
                    editorPutString.apply();
                    c17979 = this.f29242;
                    if (C3683.m11222()) {
                        iM6981 = (C0630.m2566("ۧۧ") + i5) * (-125);
                        i = ((iM6981 ^ i6) * (-22609)) ^ (-467166737);
                        i3 = 1721959919;
                    } else {
                        iM6981 = C2105.m6981("۫۬") ^ i6;
                        i = ((iM6981 ^ i5) * (-30989)) ^ (-1165262097);
                        i3 = 965222853;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -1611115798:
                case -168703349:
                    validator = validator4;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        iM2566 = C0630.m2566("۠᩷") ^ i5;
                        i = ((iM2566 ^ i6) * 14425) ^ (-806002985);
                        i2 = -340925079;
                    } else {
                        iM2566 = (i5 - C0630.m2566("ۚܿ")) * 71;
                        i = ((iM2566 ^ i6) * 18597) ^ 128365621;
                        i2 = 1487369714;
                    }
                    int i11 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i11;
                    i7 = i;
                    break;
                case -1598458327:
                case -589560155:
                    m31251(str);
                    break;
                case -1560133878:
                case -1319927887:
                    if (ViewOnClickListenerC1958.m6437(strM31260, this.f29243)) {
                        iM6981 = C0630.m2566("ۖۗ") ^ i6;
                        i = ((iM6981 ^ i5) * 32737) ^ (-1158296252);
                        i3 = 486307526;
                    } else {
                        iM6981 = C2105.m6981("ۢ᩵") ^ i6;
                        i = ((iM6981 ^ i5) * (-12437)) ^ (-956263575);
                        i3 = -2037712124;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -1491696009:
                case -1395412125:
                    validator = validator4;
                    if (c23331.f74989) {
                        iM2566 = C0630.m2566("ܳܽ") ^ i5;
                        i = ((iM2566 ^ i6) * (-6977)) ^ (-1263102844);
                        i2 = -1391278263;
                    } else {
                        iM2566 = C2105.m6981("ۢ᩹") ^ i6;
                        i = ((iM2566 ^ i5) * (-23693)) ^ (-63461456);
                        i2 = -523760823;
                    }
                    int i12 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i12;
                    i7 = i;
                    break;
                case -1272782910:
                case 1297071777:
                    validator = validator4;
                    viewOnClickListenerC8949 = this.f29241;
                    if (C4159.f13567) {
                        iM2566 = C0630.m2566("ۤ᩵") ^ i5;
                        i = ((iM2566 ^ i6) * 16187) ^ 1858996144;
                        i2 = 512663727;
                    } else {
                        iM2566 = (i6 - C0630.m2566("᩷֨")) * (-121);
                        i = ((iM2566 ^ i5) * 31805) ^ (-1223031395);
                        i2 = -1511830766;
                    }
                    int i13 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i13;
                    i7 = i;
                    break;
                case -1243190871:
                case -433232656:
                    String strM2999 = C0798.m2999(pluginContext, strValidate);
                    if (strM2999 != null) {
                        str = strM2999;
                    } else {
                        str = strValidate;
                    }
                    iM6981 = (i5 - C2105.m6981("۠۟")) * (-13);
                    i = ((iM6981 ^ i6) * 17181) ^ 1592290365;
                    i3 = -2055632236;
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -1230027023:
                case -818455308:
                    validator = validator4;
                    if (C2272.f7362) {
                        iM2566 = C0630.m2566("۠᩷") ^ i5;
                        i = ((iM2566 ^ i6) * 14425) ^ (-806002985);
                        i2 = -340925079;
                    } else {
                        iM2566 = C0630.m2566("ܺۤ") ^ i6;
                        i = ((iM2566 ^ i5) * 2847) ^ (-1323479697);
                        i2 = 368133141;
                    }
                    int i14 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i14;
                    i7 = i;
                    break;
                case -1144731974:
                case -859891528:
                    editorPutString = editorEdit.putString(str2, strM31260);
                    if (C11340.m28031()) {
                        iM6981 = C0630.m2566("᩸֫") ^ i5;
                        i = ((iM6981 ^ i6) * (-12561)) ^ (-1810825161);
                        i3 = 2004558562;
                    } else {
                        iM6981 = C0630.m2566("۟ۙ") ^ i6;
                        i = ((iM6981 ^ i5) * (-25273)) ^ (-282498271);
                        i3 = 1814071559;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -1092682297:
                case -491228432:
                    break;
                case -985608381:
                case 707636293:
                    editorEdit = activityC18827.f59398.edit();
                    if (C1773.f6144 <= 0) {
                        iM6981 = C0630.m2566("᩹ܿ") ^ i6;
                        i = ((iM6981 ^ i5) * (-19167)) ^ (-202464129);
                        i3 = 839391248;
                    } else {
                        iM6981 = C2105.m6981("᩶᩷") ^ i5;
                        i = ((iM6981 ^ i6) * (-14087)) ^ 555400720;
                        i3 = 1190070121;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -897090995:
                case 1068573076:
                    pluginContext = activityC18827.f59393;
                    if (C0798.m3007(strValidate) >= 3) {
                        iM6981 = C0630.m2566("֨֫") ^ i6;
                        i = ((iM6981 ^ i5) * (-8391)) ^ 1672545380;
                        i3 = -1903600865;
                    } else {
                        str = strValidate;
                        iM6981 = (i5 - C2105.m6981("۠۟")) * (-13);
                        i = ((iM6981 ^ i6) * 17181) ^ 1592290365;
                        i3 = -2055632236;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -851233400:
                case 352368601:
                    if (C0798.m3000(strValidate, 0) == '{') {
                        iM6981 = (C0630.m2566("ۛۤ") ^ i5) * (-87);
                        i = ((iM6981 ^ i6) * (-30041)) ^ (-1535439193);
                        i3 = -1342768000;
                    } else {
                        str = strValidate;
                        iM6981 = (i5 - C2105.m6981("۠۟")) * (-13);
                        i = ((iM6981 ^ i6) * 17181) ^ 1592290365;
                        i3 = -2055632236;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -722108279:
                case -191683158:
                    RunnableC1937.m6377(textView, c23331.f24120);
                    validator = validator4;
                    iM2566 = C2105.m6981("ۢ᩹") ^ i6;
                    i = ((iM2566 ^ i5) * (-23693)) ^ (-63461456);
                    i2 = -523760823;
                    int i15 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i15;
                    i7 = i;
                    break;
                case -528405644:
                case 803899721:
                    C1294.m4372();
                    if (C0798.f2919) {
                        iM6981 = C0630.m2566("᩹ܿ") ^ i6;
                        i = ((iM6981 ^ i5) * (-19167)) ^ (-202464129);
                        i3 = 839391248;
                    } else {
                        iM6981 = C2105.m6981("᩸۬") ^ i6;
                        i = ((iM6981 ^ i5) * 26341) ^ (-1591083227);
                        i3 = -48816857;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case -339750654:
                case 974390964:
                    C2958.m9034();
                    break;
                case -253917038:
                case 2051155760:
                    ViewOnClickListenerC8949.m23070(viewOnClickListenerC8949, c17979, viewOnClickListenerC8949.f27196, strM31260);
                    iM6981 = C0630.m2566("ۖۗ") ^ i6;
                    i = ((iM6981 ^ i5) * 32737) ^ (-1158296252);
                    i3 = 486307526;
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 44558965:
                case 371269531:
                    if (C11340.m28021(1, strValidate) == '}') {
                        iM6981 = C2105.m6981("۫۠") ^ i6;
                        i = ((iM6981 ^ i5) * 24263) ^ 1183265108;
                        i3 = -1511562703;
                    } else {
                        str = strValidate;
                        iM6981 = (i5 - C2105.m6981("۠۟")) * (-13);
                        i = ((iM6981 ^ i6) * 17181) ^ 1592290365;
                        i3 = -2055632236;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 204108145:
                case 1644014910:
                    RunnableC1937.m6377(textView, strM31260);
                    validator = validator4;
                    iM2566 = C2105.m6981("ۢ᩹") ^ i6;
                    i = ((iM2566 ^ i5) * (-23693)) ^ (-63461456);
                    i2 = -523760823;
                    int i16 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i16;
                    i7 = i;
                    break;
                case 795038696:
                case 1597405075:
                    m31262();
                    break;
                case 1051121767:
                case 1500356903:
                    break;
                case 1211499848:
                case 1446738283:
                    validator = validator4;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        iM2566 = C2105.m6981("᩹۠") ^ i5;
                        i = ((iM2566 ^ i6) * (-25395)) ^ (-166461519);
                        i2 = -2142109944;
                    } else {
                        iM2566 = (C2105.m6981("ᩴ۬") + i6) * 77;
                        i = ((iM2566 ^ i5) * 6323) ^ 540655683;
                        i2 = -1861418345;
                    }
                    int i17 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i17;
                    i7 = i;
                    break;
                case 1232426789:
                case 1908537442:
                    RunnableC3474.m10630();
                    validator = validator4;
                    iM2566 = C0630.m2566("۠᩷") ^ i5;
                    i = ((iM2566 ^ i6) * 14425) ^ (-806002985);
                    i2 = -340925079;
                    int i18 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i18;
                    i7 = i;
                    break;
                case 1249348665:
                case 1397219847:
                    C1047.m3599();
                    if (C2126.f7087) {
                        iM6981 = C0630.m2566("᩹ܿ") ^ i6;
                        i = ((iM6981 ^ i5) * (-19167)) ^ (-202464129);
                        i3 = 839391248;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ᩵") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM6981 ^ i6) * 27217) ^ 884408861;
                        i3 = -239842306;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                case 1459229207:
                case 1924270129:
                    validator = validator4;
                    textView = viewOnClickListenerC8949.f27197;
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("᩹۠") ^ i5;
                        i = ((iM2566 ^ i6) * (-25395)) ^ (-166461519);
                        i2 = -2142109944;
                    } else {
                        iM2566 = (C2105.m6981("ᩳ۬") + i5) * (-127);
                        i = ((iM2566 ^ i6) * 27491) ^ (-1464694435);
                        i2 = -1851900416;
                    }
                    int i19 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i19;
                    i7 = i;
                    break;
                case 1644596131:
                case 1766170299:
                    validator = validator4;
                    activityC18827 = viewOnClickListenerC8949.f27194;
                    if (C1294.f4556 >= 0) {
                        iM2566 = C0630.m2566("۠᩷") ^ i5;
                        i = ((iM2566 ^ i6) * 14425) ^ (-806002985);
                        i2 = -340925079;
                    } else {
                        iM2566 = C2105.m6981("ܿۨ") ^ i6;
                        i = ((iM2566 ^ i5) * 32257) ^ 1249498471;
                        i2 = -1725997928;
                    }
                    int i110 = iM2566 ^ i2;
                    validator4 = validator;
                    i8 = i110;
                    i7 = i;
                    break;
                case 1654643873:
                case 2091593065:
                    if (C1916.m6313(strM31260)) {
                        iM6981 = (C0630.m2566("۟ۛ") + i6) * (-45);
                        i = ((iM6981 ^ i5) * 24425) ^ (-1614323575);
                        i3 = -1044037159;
                    } else {
                        iM6981 = C2105.m6981("᩹ۗ") ^ i5;
                        i = ((iM6981 ^ i6) * (-22701)) ^ 1435421615;
                        i3 = -577747387;
                    }
                    i8 = iM6981 ^ i3;
                    i7 = i;
                    break;
                default:
                    strM31260 = m31260();
                    c23331 = this.f29240;
                    validator2 = c23331.f74987;
                    if (validator2 == null) {
                        validator4 = validator2;
                        iM6981 = C0630.m2566("ܶܿ") ^ i6;
                        i = ((iM6981 ^ i5) * (-24627)) ^ (-1419661953);
                        i3 = -283537858;
                        i8 = iM6981 ^ i3;
                        i7 = i;
                    } else {
                        iM6982 = C0630.m2566("۠ۨ") ^ i5;
                        validator3 = validator2;
                        i7 = ((iM6982 ^ i6) * 29209) ^ (-1694826572);
                        i4 = 1241740045;
                        int i111 = iM6982 ^ i4;
                        validator4 = validator3;
                        i8 = i111;
                    }
                    break;
            }
            return;
        }
    }
}
