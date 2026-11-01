package p067l;

import android.content.SharedPreferences;
import android.widget.TextView;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۢܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O3YD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11545 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C24543 f32189;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC10874 f32190;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ C19456 f32191;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ String f32192;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11545(ViewOnClickListenerC10874 viewOnClickListenerC10874, AbstractActivityC5549 abstractActivityC5549, C24543 c24543, String str, C19456 c19456) {
        super(abstractActivityC5549, -1);
        int i = -1868051307;
        int i2 = RunnableC0938.f81886;
        int i3 = C0845.f81821;
        this.f32190 = viewOnClickListenerC10874;
        this.f32189 = c24543;
        this.f32192 = str;
        this.f32191 = c19456;
        int iM55979 = (i3 - C0946.m55979("ۙۧ")) * 85;
        int i4 = ((iM55979 ^ i2) * 25767) ^ 2019728701;
        int i5 = -1319652625;
        while (true) {
            i = (iM55979 ^ i5) ^ (i4 & (((i ^ i2) * (-1687)) >> 31));
            switch (i) {
                case -1936833184:
                case 2125219547:
                    RunnableC0897.m55784();
                    C1012.m56134();
                    throw new RuntimeException();
                case -1752486778:
                case -1570024007:
                    C0898.m55800();
                    C0947.m55997();
                    break;
                case -1679753442:
                case 1356438001:
                    if (!C1024.f81946) {
                        iM55979 = C0873.m55680("᩷᩹") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-7547)) ^ (-1421156560);
                        i5 = 864797809;
                    }
                    break;
                case -960176417:
                case 750596855:
                    return;
                case -349091064:
                case 884429856:
                    ServiceConnectionC1013.m56157();
                    if (!RunnableC0897.f81856) {
                        iM55979 = C0946.m55979("ۙܺ") ^ i2;
                        i4 = ((iM55979 ^ i3) * 12371) ^ (-239447613);
                        i5 = -92377246;
                    }
                    break;
                case 145971626:
                case 1805478857:
                    C0898.m55800();
                    if (C0845.f81821 >= 0) {
                        iM55979 = (C0873.m55680("ܶܶ") ^ i3) * 31;
                        i4 = ((iM55979 ^ i2) * (-8599)) ^ 102965880;
                        i5 = -926880732;
                    }
                    break;
                default:
                    if (C1071.m56343() != 0) {
                        iM55979 = (i3 - C0873.m55680("ܶ۬")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55979 ^ i2) * 18125) ^ (-724029045);
                        i5 = 1867349773;
                    } else {
                        iM55979 = (C0873.m55680("ܽ᩺") ^ i3) * 61;
                        i4 = ((iM55979 ^ i2) * 22375) ^ (-486632796);
                        i5 = 523574345;
                        continue;
                    }
                    break;
            }
            iM55979 = C0946.m55979("ۙܿ") ^ i2;
            i4 = ((iM55979 ^ i3) * 14459) ^ 612039238;
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
    
        if (p067l.C1124.f82007 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
    
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        if (p067l.C0877.f81843 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        r18 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (p067l.C0927.f81875 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (p067l.C0863.m55643() == false) goto L27;
     */
    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4537() {
        PluginPreference.Input.Validator validator;
        int iM55680;
        int i;
        int i2;
        int iM55979;
        int i3;
        PluginPreference.Input.Validator validator2;
        int iM559710;
        PluginPreference.Input.Validator validator3;
        int i4;
        int i5 = C1017.f81942;
        int i6 = C0912.f81867;
        int iM55681 = (C0873.m55680("֫۟") ^ i5) * 13;
        int i7 = ((iM55681 ^ i6) * (-28483)) ^ 2029922409;
        PluginPreference.Input.Validator validator4 = null;
        String str = null;
        int i8 = iM55681 ^ 307012228;
        int i9 = 865113934;
        C24543 c24543 = null;
        C19456 c19456 = null;
        String strM33346 = null;
        SharedPreferences.Editor editorPutString = null;
        ActivityC20262 activityC20262 = null;
        String str2 = null;
        TextView textView = null;
        SharedPreferences.Editor editorEdit = null;
        ViewOnClickListenerC10874 viewOnClickListenerC10874 = null;
        PluginContext pluginContext = null;
        String strValidate = null;
        while (true) {
            i9 = i8 ^ (i7 & (((i9 ^ i6) * 10839) >> 31));
            switch (i9) {
                case -1983828195:
                case -1682267313:
                    validator2 = validator4;
                    strValidate = validator2.validate(strM33346);
                    if (strValidate == null) {
                        validator4 = validator2;
                        iM55979 = C0873.m55680("ܶܿ") ^ i6;
                        i = ((iM55979 ^ i5) * (-24627)) ^ (-1419661953);
                        i3 = -283537858;
                        i8 = iM55979 ^ i3;
                        i7 = i;
                    } else {
                        iM559710 = (C0946.m55979("ᩴ֡") ^ i5) * (-73);
                        validator3 = validator2;
                        i7 = ((iM559710 ^ i6) * 17415) ^ 452539690;
                        i4 = -77472916;
                        int i10 = iM559710 ^ i4;
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
                    str2 = c24543.f27036;
                    if (C0949.f81897 >= 0) {
                        iM55979 = (C0946.m55979("ᩴ᩵") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i6) * 27217) ^ 884408861;
                        i3 = -239842306;
                    } else {
                        iM55979 = (C0873.m55680("ۨۧ") ^ i6) * (-101);
                        i = ((iM55979 ^ i5) * 6601) ^ 74408409;
                        i3 = -91237261;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -1708801297:
                case -1497295717:
                    editorPutString.apply();
                    c19456 = this.f32191;
                    if (C1025.m56230()) {
                        iM55979 = (C0873.m55680("ۧۧ") + i5) * (-125);
                        i = ((iM55979 ^ i6) * (-22609)) ^ (-467166737);
                        i3 = 1721959919;
                    } else {
                        iM55979 = C0946.m55979("۫۬") ^ i6;
                        i = ((iM55979 ^ i5) * (-30989)) ^ (-1165262097);
                        i3 = 965222853;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -1611115798:
                case -168703349:
                    validator = validator4;
                    if (ServiceConnectionC1013.f81940 >= 0) {
                        iM55680 = C0873.m55680("۠᩷") ^ i5;
                        i = ((iM55680 ^ i6) * 14425) ^ (-806002985);
                        i2 = -340925079;
                    } else {
                        iM55680 = (i5 - C0873.m55680("ۚܿ")) * 71;
                        i = ((iM55680 ^ i6) * 18597) ^ 128365621;
                        i2 = 1487369714;
                    }
                    int i11 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i11;
                    i7 = i;
                    break;
                case -1598458327:
                case -589560155:
                    m33337(str);
                    break;
                case -1560133878:
                case -1319927887:
                    if (ViewOnClickListenerC0939.m55949(strM33346, this.f32192)) {
                        iM55979 = C0873.m55680("ۖۗ") ^ i6;
                        i = ((iM55979 ^ i5) * 32737) ^ (-1158296252);
                        i3 = 486307526;
                    } else {
                        iM55979 = C0946.m55979("ۢ᩵") ^ i6;
                        i = ((iM55979 ^ i5) * (-12437)) ^ (-956263575);
                        i3 = -2037712124;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -1491696009:
                case -1395412125:
                    validator = validator4;
                    if (c24543.f77736) {
                        iM55680 = C0873.m55680("ܳܽ") ^ i5;
                        i = ((iM55680 ^ i6) * (-6977)) ^ (-1263102844);
                        i2 = -1391278263;
                    } else {
                        iM55680 = C0946.m55979("ۢ᩹") ^ i6;
                        i = ((iM55680 ^ i5) * (-23693)) ^ (-63461456);
                        i2 = -523760823;
                    }
                    int i12 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i12;
                    i7 = i;
                    break;
                case -1272782910:
                case 1297071777:
                    validator = validator4;
                    viewOnClickListenerC10874 = this.f32190;
                    if (C1048.f81963) {
                        iM55680 = C0873.m55680("ۤ᩵") ^ i5;
                        i = ((iM55680 ^ i6) * 16187) ^ 1858996144;
                        i2 = 512663727;
                    } else {
                        iM55680 = (i6 - C0873.m55680("᩷֨")) * (-121);
                        i = ((iM55680 ^ i5) * 31805) ^ (-1223031395);
                        i2 = -1511830766;
                    }
                    int i13 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i13;
                    i7 = i;
                    break;
                case -1243190871:
                case -433232656:
                    String strM55711 = C0882.m55711(pluginContext, strValidate);
                    if (strM55711 != null) {
                        str = strM55711;
                    } else {
                        str = strValidate;
                    }
                    iM55979 = (i5 - C0946.m55979("۠۟")) * (-13);
                    i = ((iM55979 ^ i6) * 17181) ^ 1592290365;
                    i3 = -2055632236;
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -1230027023:
                case -818455308:
                    validator = validator4;
                    if (C0955.f81898) {
                        iM55680 = C0873.m55680("۠᩷") ^ i5;
                        i = ((iM55680 ^ i6) * 14425) ^ (-806002985);
                        i2 = -340925079;
                    } else {
                        iM55680 = C0873.m55680("ܺۤ") ^ i6;
                        i = ((iM55680 ^ i5) * 2847) ^ (-1323479697);
                        i2 = 368133141;
                    }
                    int i14 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i14;
                    i7 = i;
                    break;
                case -1144731974:
                case -859891528:
                    editorPutString = editorEdit.putString(str2, strM33346);
                    if (C1404.m56468()) {
                        iM55979 = C0873.m55680("᩸֫") ^ i5;
                        i = ((iM55979 ^ i6) * (-12561)) ^ (-1810825161);
                        i3 = 2004558562;
                    } else {
                        iM55979 = C0873.m55680("۟ۙ") ^ i6;
                        i = ((iM55979 ^ i5) * (-25273)) ^ (-282498271);
                        i3 = 1814071559;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -1092682297:
                case -491228432:
                    break;
                case -985608381:
                case 707636293:
                    editorEdit = activityC20262.f62626.edit();
                    if (C0930.f81879 <= 0) {
                        iM55979 = C0873.m55680("᩹ܿ") ^ i6;
                        i = ((iM55979 ^ i5) * (-19167)) ^ (-202464129);
                        i3 = 839391248;
                    } else {
                        iM55979 = C0946.m55979("᩶᩷") ^ i5;
                        i = ((iM55979 ^ i6) * (-14087)) ^ 555400720;
                        i3 = 1190070121;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -897090995:
                case 1068573076:
                    pluginContext = activityC20262.f62621;
                    if (C0882.m55719(strValidate) >= 3) {
                        iM55979 = C0873.m55680("֨֫") ^ i6;
                        i = ((iM55979 ^ i5) * (-8391)) ^ 1672545380;
                        i3 = -1903600865;
                    } else {
                        str = strValidate;
                        iM55979 = (i5 - C0946.m55979("۠۟")) * (-13);
                        i = ((iM55979 ^ i6) * 17181) ^ 1592290365;
                        i3 = -2055632236;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -851233400:
                case 352368601:
                    if (C0882.m55712(strValidate, 0) == '{') {
                        iM55979 = (C0873.m55680("ۛۤ") ^ i5) * (-87);
                        i = ((iM55979 ^ i6) * (-30041)) ^ (-1535439193);
                        i3 = -1342768000;
                    } else {
                        str = strValidate;
                        iM55979 = (i5 - C0946.m55979("۠۟")) * (-13);
                        i = ((iM55979 ^ i6) * 17181) ^ 1592290365;
                        i3 = -2055632236;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -722108279:
                case -191683158:
                    RunnableC0938.m55928(textView, c24543.f27037);
                    validator = validator4;
                    iM55680 = C0946.m55979("ۢ᩹") ^ i6;
                    i = ((iM55680 ^ i5) * (-23693)) ^ (-63461456);
                    i2 = -523760823;
                    int i15 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i15;
                    i7 = i;
                    break;
                case -528405644:
                case 803899721:
                    C0906.m55809();
                    if (C0882.f81846) {
                        iM55979 = C0873.m55680("᩹ܿ") ^ i6;
                        i = ((iM55979 ^ i5) * (-19167)) ^ (-202464129);
                        i3 = 839391248;
                    } else {
                        iM55979 = C0946.m55979("᩸۬") ^ i6;
                        i = ((iM55979 ^ i5) * 26341) ^ (-1591083227);
                        i3 = -48816857;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case -339750654:
                case 974390964:
                    C0989.m56095();
                    break;
                case -253917038:
                case 2051155760:
                    ViewOnClickListenerC10874.m25044(viewOnClickListenerC10874, c19456, viewOnClickListenerC10874.f30130, strM33346);
                    iM55979 = C0873.m55680("ۖۗ") ^ i6;
                    i = ((iM55979 ^ i5) * 32737) ^ (-1158296252);
                    i3 = 486307526;
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case 44558965:
                case 371269531:
                    if (C1404.m56458(1, strValidate) == '}') {
                        iM55979 = C0946.m55979("۫۠") ^ i6;
                        i = ((iM55979 ^ i5) * 24263) ^ 1183265108;
                        i3 = -1511562703;
                    } else {
                        str = strValidate;
                        iM55979 = (i5 - C0946.m55979("۠۟")) * (-13);
                        i = ((iM55979 ^ i6) * 17181) ^ 1592290365;
                        i3 = -2055632236;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case 204108145:
                case 1644014910:
                    RunnableC0938.m55928(textView, strM33346);
                    validator = validator4;
                    iM55680 = C0946.m55979("ۢ᩹") ^ i6;
                    i = ((iM55680 ^ i5) * (-23693)) ^ (-63461456);
                    i2 = -523760823;
                    int i16 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i16;
                    i7 = i;
                    break;
                case 795038696:
                case 1597405075:
                    m33348();
                    break;
                case 1051121767:
                case 1500356903:
                    break;
                case 1211499848:
                case 1446738283:
                    validator = validator4;
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        iM55680 = C0946.m55979("᩹۠") ^ i5;
                        i = ((iM55680 ^ i6) * (-25395)) ^ (-166461519);
                        i2 = -2142109944;
                    } else {
                        iM55680 = (C0946.m55979("ᩴ۬") + i6) * 77;
                        i = ((iM55680 ^ i5) * 6323) ^ 540655683;
                        i2 = -1861418345;
                    }
                    int i17 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i17;
                    i7 = i;
                    break;
                case 1232426789:
                case 1908537442:
                    RunnableC1014.m56177();
                    validator = validator4;
                    iM55680 = C0873.m55680("۠᩷") ^ i5;
                    i = ((iM55680 ^ i6) * 14425) ^ (-806002985);
                    i2 = -340925079;
                    int i18 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i18;
                    i7 = i;
                    break;
                case 1249348665:
                case 1397219847:
                    C0894.m55769();
                    if (C0947.f81895) {
                        iM55979 = C0873.m55680("᩹ܿ") ^ i6;
                        i = ((iM55979 ^ i5) * (-19167)) ^ (-202464129);
                        i3 = 839391248;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ᩵") ^ i5) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((iM55979 ^ i6) * 27217) ^ 884408861;
                        i3 = -239842306;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                case 1459229207:
                case 1924270129:
                    validator = validator4;
                    textView = viewOnClickListenerC10874.f30131;
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("᩹۠") ^ i5;
                        i = ((iM55680 ^ i6) * (-25395)) ^ (-166461519);
                        i2 = -2142109944;
                    } else {
                        iM55680 = (C0946.m55979("ᩳ۬") + i5) * (-127);
                        i = ((iM55680 ^ i6) * 27491) ^ (-1464694435);
                        i2 = -1851900416;
                    }
                    int i19 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i19;
                    i7 = i;
                    break;
                case 1644596131:
                case 1766170299:
                    validator = validator4;
                    activityC20262 = viewOnClickListenerC10874.f30128;
                    if (C0906.f81862 >= 0) {
                        iM55680 = C0873.m55680("۠᩷") ^ i5;
                        i = ((iM55680 ^ i6) * 14425) ^ (-806002985);
                        i2 = -340925079;
                    } else {
                        iM55680 = C0946.m55979("ܿۨ") ^ i6;
                        i = ((iM55680 ^ i5) * 32257) ^ 1249498471;
                        i2 = -1725997928;
                    }
                    int i110 = iM55680 ^ i2;
                    validator4 = validator;
                    i8 = i110;
                    i7 = i;
                    break;
                case 1654643873:
                case 2091593065:
                    if (C0937.m55923(strM33346)) {
                        iM55979 = (C0873.m55680("۟ۛ") + i6) * (-45);
                        i = ((iM55979 ^ i5) * 24425) ^ (-1614323575);
                        i3 = -1044037159;
                    } else {
                        iM55979 = C0946.m55979("᩹ۗ") ^ i5;
                        i = ((iM55979 ^ i6) * (-22701)) ^ 1435421615;
                        i3 = -577747387;
                    }
                    i8 = iM55979 ^ i3;
                    i7 = i;
                    break;
                default:
                    strM33346 = m33346();
                    c24543 = this.f32189;
                    validator2 = c24543.f77734;
                    if (validator2 == null) {
                        validator4 = validator2;
                        iM55979 = C0873.m55680("ܶܿ") ^ i6;
                        i = ((iM55979 ^ i5) * (-24627)) ^ (-1419661953);
                        i3 = -283537858;
                        i8 = iM55979 ^ i3;
                        i7 = i;
                    } else {
                        iM559710 = C0873.m55680("۠ۨ") ^ i5;
                        validator3 = validator2;
                        i7 = ((iM559710 ^ i6) * 29209) ^ (-1694826572);
                        i4 = 1241740045;
                        int i111 = iM559710 ^ i4;
                        validator4 = validator3;
                        i8 = i111;
                    }
                    break;
            }
            return;
        }
    }
}
