package p067l;

import bin.p000mt.plugin.api.LocalString;
import bin.p000mt.plugin.api.PluginContext;
import bin.p000mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.ᩳۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3ZW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19377 extends AbstractC9791 implements PluginPreference.Text {

    /* JADX INFO: renamed from: ۜ */
    public PluginPreference.OnTextItemClickListener f57847;

    /* JADX INFO: renamed from: ᩷ */
    public String f57848;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text summary(CharSequence charSequence) {
        this.f27037 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text url(String str) {
        this.f57848 = str;
        return this;
    }

    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7888(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        int i = -2095753833;
        int i2 = C1025.f81947;
        int i3 = C0873.f81841;
        int iM55979 = (C0946.m55979("۠۫") ^ i3) * (-73);
        int i4 = ((iM55979 ^ i2) * (-849)) ^ 757529810;
        int i5 = 373454904;
        while (true) {
            i = ((((i ^ i2) * (-11245)) >> 31) & i4) ^ (iM55979 ^ i5);
            switch (i) {
                case -2107519172:
                case 301764245:
                    if (C1017.f81942 >= 0) {
                        iM55979 = C0873.m55680("ۚۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30695)) ^ (-1729325607);
                        i5 = -1677443920;
                    } else {
                        iM55979 = C0946.m55979("᩹֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-839)) ^ 1860695885;
                        i5 = 1605650185;
                    }
                    break;
                case -2060403057:
                case 191312058:
                    this.f27035 = C21862.m49304(localString, (String) charSequence);
                    iM55979 = (C0873.m55680("ۜᩴ") ^ i2) * 109;
                    i4 = ((iM55979 ^ i3) * 25169) ^ (-537217317);
                    i5 = -1487367673;
                    break;
                case -2002030019:
                case -470725881:
                    if (C1229.m56410() != 0) {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14413) ^ (-1173001751);
                        i5 = 914440032;
                    } else {
                        iM55979 = C0873.m55680("ܶ֨") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-27689)) ^ (-1504836842);
                        i5 = -1764551280;
                    }
                    break;
                case -1565967155:
                case 752185950:
                    this.f27037 = C21862.m49304(localString, (String) charSequence2);
                    iM55979 = (C0946.m55979("ܽ᩶") ^ i2) * 93;
                    i4 = ((iM55979 ^ i3) * 17337) ^ (-726811875);
                    i5 = -856567758;
                    break;
                case -1310845049:
                case -986039166:
                    if (!C0947.f81895) {
                        iM55979 = (i2 - C0873.m55680("ܰ֫")) * (-85);
                        i4 = ((iM55979 ^ i3) * (-7009)) ^ 2097128457;
                        i5 = 1297724954;
                    } else {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14413) ^ (-1173001751);
                        i5 = 914440032;
                    }
                    break;
                case -1160352682:
                case 671280330:
                    charSequence2 = this.f27037;
                    if (charSequence2 instanceof String) {
                        iM55979 = C0873.m55680("۟ۤ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-6117)) ^ (-1365524055);
                        i5 = 1986348797;
                    } else {
                        iM55979 = (C0946.m55979("ܽ᩶") ^ i2) * 93;
                        i4 = ((iM55979 ^ i3) * 17337) ^ (-726811875);
                        i5 = -856567758;
                    }
                    break;
                case -911925871:
                case 872556040:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55979 = C0873.m55680("ܿۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5223)) ^ (-13437052);
                        i5 = 1163473384;
                    } else {
                        iM55979 = (i3 - C0946.m55979("᩻᩸")) * 91;
                        i4 = ((iM55979 ^ i2) * 28253) ^ 1121276102;
                        i5 = 1889890068;
                    }
                    break;
                case -865919004:
                case -452541299:
                    if (C0892.m55749()) {
                        iM55979 = (C0946.m55979("᩶֨") + i2) * (-3);
                        i4 = ((iM55979 ^ i3) * (-3427)) ^ (-250250200);
                        i5 = 375204459;
                    } else {
                        iM55979 = C0873.m55680("ܿۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5223)) ^ (-13437052);
                        i5 = 1163473384;
                    }
                    break;
                case -406761337:
                case 1259518151:
                    if (C0854.m55595() >= 0) {
                        iM55979 = (i2 - C0873.m55680("ܰ֫")) * (-85);
                        i4 = ((iM55979 ^ i3) * (-7009)) ^ 2097128457;
                        i5 = 1297724954;
                    } else {
                        iM55979 = C0946.m55979("ۛۗ") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-24329)) ^ (-272030039);
                        i5 = -1493856587;
                    }
                    break;
                case -205050007:
                case 407415867:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55979 = C0873.m55680("ܿۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5223)) ^ (-13437052);
                        i5 = 1163473384;
                    } else {
                        iM55979 = (C0946.m55979("ۙۤ") ^ i2) * 15;
                        i4 = ((iM55979 ^ i3) * 2635) ^ 757988174;
                        i5 = -1340351843;
                    }
                    break;
                case -62539089:
                case 139275607:
                    if (C1229.f82066 >= 0) {
                        iM55979 = C0873.m55680("ܿۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5223)) ^ (-13437052);
                        i5 = 1163473384;
                    } else {
                        iM55979 = (i2 - C0873.m55680("۫ۘ")) * (-111);
                        i4 = ((iM55979 ^ i3) * 19631) ^ 117745871;
                        i5 = -114392536;
                    }
                    break;
                case 11295880:
                case 1904775293:
                    charSequence = this.f27035;
                    if (charSequence instanceof String) {
                        iM55979 = (C0946.m55979("ᩴ֡") + i3) * (-97);
                        i4 = ((iM55979 ^ i2) * (-4223)) ^ 1978217525;
                        i5 = -1428468905;
                    } else {
                        iM55979 = (C0873.m55680("ۜᩴ") ^ i2) * 109;
                        i4 = ((iM55979 ^ i3) * 25169) ^ (-537217317);
                        i5 = -1487367673;
                    }
                    break;
                case 84382237:
                case 2024744609:
                    if (C1929.f83011 != 0) {
                        iM55979 = C0873.m55680("ۚۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30695)) ^ (-1729325607);
                        i5 = -1677443920;
                    } else {
                        iM55979 = C0873.m55680("ܽۖ") ^ i3;
                        i4 = ((iM55979 ^ i2) * 14413) ^ (-1173001751);
                        i5 = 914440032;
                    }
                    break;
                case 137533457:
                case 884780615:
                    if (C0866.f81837 >= 0) {
                        iM55979 = C0873.m55680("ۚۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30695)) ^ (-1729325607);
                        i5 = -1677443920;
                    } else {
                        iM55979 = (C0873.m55680("᩺۫") ^ i2) * 7;
                        i4 = ((iM55979 ^ i3) * 14373) ^ 1290184754;
                        i5 = 1103246984;
                    }
                    break;
                case 376364251:
                case 897787699:
                    if (C1028.m56247() >= 0) {
                        iM55979 = C0873.m55680("ۚۢ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-30695)) ^ (-1729325607);
                        i5 = -1677443920;
                    } else {
                        iM55979 = (C0946.m55979("ᩴ۬") + i2) * 5;
                        i4 = ((iM55979 ^ i3) * (-16947)) ^ 791130704;
                        i5 = -1628968644;
                    }
                    break;
                case 433148374:
                case 1093186521:
                    break;
                case 567223142:
                case 1481709893:
                    if (C1024.f81946) {
                        iM55979 = (i2 - C0873.m55680("ܰ֫")) * (-85);
                        i4 = ((iM55979 ^ i3) * (-7009)) ^ 2097128457;
                        i5 = 1297724954;
                    } else {
                        iM55979 = C0946.m55979("ۨ֫") ^ i3;
                        i4 = ((iM55979 ^ i2) * (-18589)) ^ 1445398894;
                        i5 = 1846319810;
                    }
                    break;
                case 945498343:
                case 1753425429:
                    C0947.m55997();
                    iM55979 = C0873.m55680("ܽۖ") ^ i3;
                    i4 = ((iM55979 ^ i2) * 14413) ^ (-1173001751);
                    i5 = 914440032;
                    break;
                case 1291570716:
                case 1815164703:
                    C1046.m56302();
                    C0912.m55833();
                    break;
                default:
                    if (C0917.f81868) {
                        iM55979 = C0873.m55680("ܿۡ") ^ i2;
                        i4 = ((iM55979 ^ i3) * (-5223)) ^ (-13437052);
                        i5 = 1163473384;
                    } else {
                        iM55979 = C0946.m55979("ᩴ᩻") ^ i3;
                        i4 = ((iM55979 ^ i2) * 7119) ^ (-1980635962);
                        i5 = 1123749370;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text onClick(PluginPreference.OnTextItemClickListener onTextItemClickListener) {
        this.f57847 = onTextItemClickListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f27038 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text visible(boolean z) {
        this.f27039 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Text
    public final PluginPreference.Text enable(boolean z) {
        this.f27033 = z;
        return this;
    }

    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final EnumC15825 mo7887() {
        return EnumC15825.f45810;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0364  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x019b A[PHI: r11 r14
      0x019b: PHI (r11v4 java.lang.CharSequence) = 
      (r11v3 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
      (r11v2 java.lang.CharSequence)
     binds: [B:55:0x0182, B:47:0x0143, B:41:0x0107, B:35:0x00ce, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r14v5 java.lang.String) = 
      (r14v2 java.lang.String)
      (r14v4 java.lang.String)
      (r14v2 java.lang.String)
      (r14v2 java.lang.String)
      (r14v2 java.lang.String)
     binds: [B:55:0x0182, B:47:0x0143, B:41:0x0107, B:35:0x00ce, B:29:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x01cd A[PHI: r8 r9 r12
      0x01cd: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v2 int), (r8v2 int), (r8v2 int) binds: [B:60:0x01b6, B:52:0x0164, B:44:0x0125, B:38:0x00e9, B:32:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r9v4 int) = (r9v3 int), (r9v2 int), (r9v2 int), (r9v2 int), (r9v2 int) binds: [B:60:0x01b6, B:52:0x0164, B:44:0x0125, B:38:0x00e9, B:32:0x00c5] A[DONT_GENERATE, DONT_INLINE]
      0x01cd: PHI (r12v5 java.lang.String) = 
      (r12v2 java.lang.String)
      (r12v4 java.lang.String)
      (r12v2 java.lang.String)
      (r12v2 java.lang.String)
      (r12v2 java.lang.String)
     binds: [B:60:0x01b6, B:52:0x0164, B:44:0x0125, B:38:0x00e9, B:32:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0264  */
    /* JADX WARN: Code duplicated, block: B:83:0x0298  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e6 A[PHI: r3
      0x02e6: PHI (r3v4 java.lang.CharSequence) = 
      (r3v2 java.lang.CharSequence)
      (r3v3 java.lang.CharSequence)
      (r3v2 java.lang.CharSequence)
      (r3v2 java.lang.CharSequence)
     binds: [B:90:0x02e4, B:74:0x0244, B:12:0x005a, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0335  */
    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7889(PluginContext pluginContext) {
        int iM55680;
        int i;
        int i2;
        int i3 = C1071.f81975;
        int i4 = RunnableC0938.f81886;
        int iM55979 = C0946.m55979("֨ᩳ") ^ i4;
        int i5 = ((iM55979 ^ i3) * (-16499)) ^ (-1332871502);
        String str = null;
        int i6 = iM55979 ^ (-2096707420);
        CharSequence charSequence = null;
        char c = 0;
        int i7 = 0;
        char c2 = 0;
        int i8 = 0;
        int i9 = 915195768;
        boolean z = false;
        CharSequence charSequence2 = null;
        String str2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i10 = 0;
        while (true) {
            i9 = i6 ^ (i5 & (((i9 ^ i3) * (-31419)) >> 31));
            switch (i9) {
                case -2074962552:
                case 617113126:
                    if (RunnableC1014.f81941 <= 0) {
                        iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                        i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                        i2 = 810645118;
                    } else {
                        iM55680 = C0946.m55979("ۙܿ") ^ i3;
                        i = ((iM55680 ^ i4) * 16661) ^ 831922119;
                        i2 = 438106249;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1898819186:
                case 393691765:
                    if (C1017.f81942 < 0) {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 6757) ^ 1242302109;
                        i2 = -763955084;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֫ۢ")) * 95;
                        i = ((iM55680 ^ i4) * 11347) ^ 774692383;
                        i2 = -1042232119;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1802586924:
                case 1017642447:
                    if (C0949.m56012()) {
                        iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                        i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                        i2 = 810645118;
                    } else {
                        iM55680 = (C0873.m55680("ۡۚ") ^ i4) * (-91);
                        i = ((iM55680 ^ i3) * (-28887)) ^ 536386450;
                        i2 = 769154803;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1709776560:
                case -793427204:
                    charSequence = this.f27035;
                    if (C0949.f81897 >= 0) {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 6757) ^ 1242302109;
                        i2 = -763955084;
                    } else {
                        iM55680 = C0873.m55680("ۗۖ") ^ i4;
                        i = ((iM55680 ^ i3) * (-14615)) ^ (-1410820719);
                        i2 = -419531483;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1668674374:
                case 336311777:
                    C1194.m56396();
                    C1053.m56327();
                    break;
                case -1647013757:
                case -677758916:
                    String strM55876 = C0927.m55876(pluginContext, str2);
                    if (strM55876 != null) {
                        charSequence4 = strM55876;
                    } else {
                        charSequence4 = charSequence;
                    }
                    iM55680 = C0873.m55680("᩺᩹") ^ i4;
                    i = ((iM55680 ^ i3) * (-451)) ^ (-1359912857);
                    i2 = 1784361760;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1634522114:
                case 1926813830:
                    C1003.m56123();
                    if (C0930.f81879 > 0) {
                        iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                        i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                        i2 = 810645118;
                    } else {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 6757) ^ 1242302109;
                        i2 = -763955084;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1446702391:
                case 1717627164:
                    if (C1017.f81942 >= 0) {
                        iM55680 = (i4 - C0873.m55680("ۚܺ")) * (-3);
                        i = ((iM55680 ^ i3) * (-27695)) ^ (-1188000870);
                        i2 = -554798377;
                    } else {
                        iM55680 = (C0946.m55979("֡ۙ") ^ i3) * 99;
                        i = ((iM55680 ^ i4) * (-13597)) ^ (-410662124);
                        i2 = -1279272814;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1351688813:
                case -71589067:
                    this.f27035 = charSequence4;
                    charSequence3 = this.f27037;
                    if (charSequence3 instanceof String) {
                        iM55680 = (C0946.m55979("ۧۤ") + i3) * 109;
                        i = ((iM55680 ^ i4) * (-23595)) ^ 769272506;
                        i2 = 320242785;
                    } else {
                        charSequence2 = charSequence3;
                        iM55680 = (C0946.m55979("ܰܿ") + i4) * 15;
                        i = ((iM55680 ^ i3) * (-30865)) ^ 262842832;
                        i2 = 1283645173;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1173918739:
                case 597555877:
                    i7 = 1;
                    c2 = '{';
                    if (C1025.f81947 >= 0) {
                        iM55680 = C0873.m55680("᩷ۨ") ^ i4;
                        i = ((iM55680 ^ i3) * 22099) ^ (-2115252390);
                        i2 = -2036881906;
                    } else {
                        iM55680 = C0873.m55680("֨۬") ^ i3;
                        i = ((iM55680 ^ i4) * (-9965)) ^ 779214773;
                        i2 = 217707886;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1172250584:
                case 1237664602:
                    C0967.m56074();
                    if (C0967.m56074()) {
                        iM55680 = (i4 - C0873.m55680("ۚܺ")) * (-3);
                        i = ((iM55680 ^ i3) * (-27695)) ^ (-1188000870);
                        i2 = -554798377;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                        i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                        i2 = 810645118;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -1058713438:
                case 1008757515:
                    this.f27037 = charSequence2;
                    break;
                case -999629391:
                case 778693292:
                    if (C0927.m55870(str2, i8) == c2) {
                        iM55680 = C0873.m55680("ۨۧ") ^ i3;
                        i = ((iM55680 ^ i4) * (-8987)) ^ (-505455840);
                        i2 = 2079386174;
                    } else {
                        charSequence4 = charSequence;
                        iM55680 = C0873.m55680("᩺᩹") ^ i4;
                        i = ((iM55680 ^ i3) * (-451)) ^ (-1359912857);
                        i2 = 1784361760;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -973515219:
                case 1833788856:
                    str = (String) charSequence3;
                    if (C0882.m55719(str) >= i10) {
                        iM55680 = C0946.m55979("֨᩻") ^ i3;
                        i = ((iM55680 ^ i4) * (-26869)) ^ 1826910808;
                        i2 = 1840791009;
                    } else {
                        charSequence2 = charSequence3;
                        iM55680 = (C0946.m55979("ܰܿ") + i4) * 15;
                        i = ((iM55680 ^ i3) * (-30865)) ^ 262842832;
                        i2 = 1283645173;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -746718758:
                case 317054533:
                    if (C1036.f81953 >= 0) {
                        iM55680 = (C0946.m55979("֡ۙ") ^ i3) * 99;
                        i = ((iM55680 ^ i4) * (-13597)) ^ (-410662124);
                        i2 = -1279272814;
                    } else {
                        iM55680 = C0873.m55680("۫᩺") ^ i4;
                        i = ((iM55680 ^ i3) * (-30259)) ^ (-625648209);
                        i2 = -1255454237;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -638780539:
                case 1872021173:
                    C1071.m56343();
                    C0863.m55643();
                    iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                    i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                    i2 = 810645118;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -614517450:
                case 849982287:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                        i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                        i2 = 810645118;
                    } else {
                        iM55680 = (C0946.m55979("ᩴۚ") + i4) * (-25);
                        i = ((iM55680 ^ i3) * (-11435)) ^ (-442275528);
                        i2 = 966544496;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -509750151:
                case 1967929687:
                    if (ViewOnClickListenerC0939.m55941() >= 0) {
                        iM55680 = (i3 - C0873.m55680("֨ۨ")) * 127;
                        i = ((iM55680 ^ i4) * 19675) ^ (-466741247);
                        i2 = 22272247;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۛ֡")) * (-29);
                        i = ((iM55680 ^ i4) * (-9369)) ^ (-1837804720);
                        i2 = 1281702002;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -496164540:
                case 341428351:
                    String strM55711 = C0882.m55711(pluginContext, str);
                    if (strM55711 != null) {
                        charSequence2 = strM55711;
                    } else {
                        charSequence2 = charSequence3;
                    }
                    iM55680 = (C0946.m55979("ܰܿ") + i4) * 15;
                    i = ((iM55680 ^ i3) * (-30865)) ^ 262842832;
                    i2 = 1283645173;
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -199508407:
                case 160793132:
                    if (C0898.f81858 <= 0) {
                        iM55680 = (C0873.m55680("᩶ۘ") ^ i4) * (-83);
                        i = ((iM55680 ^ i3) * 6757) ^ 1242302109;
                        i2 = -763955084;
                    } else {
                        iM55680 = C0946.m55979("ۤ۬") ^ i3;
                        i = ((iM55680 ^ i4) * (-10949)) ^ (-1111684625);
                        i2 = 336769287;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -101566464:
                case 161606984:
                    if (C0937.f81884) {
                        iM55680 = C0946.m55979("ܰۜ") ^ i3;
                        i = ((iM55680 ^ i4) * (-23311)) ^ 1014255816;
                        i2 = 1408696891;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֫ۢ")) * 95;
                        i = ((iM55680 ^ i4) * 11347) ^ 774692383;
                        i2 = -1042232119;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case -48606469:
                case 182346205:
                    if (C1404.m56458(i7, str) == c) {
                        iM55680 = C0873.m55680("᩵᩹") ^ i3;
                        i = ((iM55680 ^ i4) * (-11249)) ^ (-91433815);
                        i2 = 853628955;
                    } else {
                        charSequence2 = charSequence3;
                        iM55680 = (C0946.m55979("ܰܿ") + i4) * 15;
                        i = ((iM55680 ^ i3) * (-30865)) ^ 262842832;
                        i2 = 1283645173;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 262062943:
                case 1305853030:
                    str2 = (String) charSequence;
                    if (C0882.m55719(str2) >= i10) {
                        iM55680 = C0873.m55680("᩸ۢ") ^ i4;
                        i = ((iM55680 ^ i3) * (-27977)) ^ 890300061;
                        i2 = -1081536788;
                    } else {
                        charSequence4 = charSequence;
                        iM55680 = C0873.m55680("᩺᩹") ^ i4;
                        i = ((iM55680 ^ i3) * (-451)) ^ (-1359912857);
                        i2 = 1784361760;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 329866677:
                case 709008874:
                    i8 = 0;
                    i10 = 3;
                    if (z) {
                        iM55680 = C0946.m55979("ܰ۠") ^ i3;
                        i = ((iM55680 ^ i4) * (-25479)) ^ (-1382303309);
                        i2 = 1802405654;
                    } else {
                        charSequence4 = charSequence;
                        iM55680 = C0873.m55680("᩺᩹") ^ i4;
                        i = ((iM55680 ^ i3) * (-451)) ^ (-1359912857);
                        i2 = 1784361760;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 931843959:
                case 1366881816:
                    ViewOnClickListenerC0939.m55941();
                    if (C0873.m55678()) {
                        iM55680 = (C0873.m55680("᩶۬") + i4) * 7;
                        i = ((iM55680 ^ i3) * (-18787)) ^ (-1420741168);
                        i2 = 616383269;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۬ۨ")) * 97;
                        i = ((iM55680 ^ i4) * 31879) ^ 834630105;
                        i2 = 810645118;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1072856296:
                case 1565255681:
                    if (C1404.m56458(i7, str2) == c) {
                        iM55680 = (C0873.m55680("۟ᩴ") ^ i4) * 33;
                        i = ((iM55680 ^ i3) * (-4297)) ^ (-1588232842);
                        i2 = 1402842300;
                    } else {
                        charSequence4 = charSequence;
                        iM55680 = C0873.m55680("᩺᩹") ^ i4;
                        i = ((iM55680 ^ i3) * (-451)) ^ (-1359912857);
                        i2 = 1784361760;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1258498802:
                case 1364615641:
                    if (C0927.m55870(str, i8) == c2) {
                        iM55680 = (i4 - C0946.m55979("ۡۧ")) * (-91);
                        i = ((iM55680 ^ i3) * 3725) ^ (-273879454);
                        i2 = -648560785;
                    } else {
                        charSequence2 = charSequence3;
                        iM55680 = (C0946.m55979("ܰܿ") + i4) * 15;
                        i = ((iM55680 ^ i3) * (-30865)) ^ 262842832;
                        i2 = 1283645173;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
                case 1656775804:
                case 1998418128:
                    boolean z2 = charSequence instanceof String;
                    if (C1044.f81959 >= 0) {
                        z = z2;
                        c = '}';
                        iM55680 = C0873.m55680("᩷ۨ") ^ i4;
                        i = ((iM55680 ^ i3) * 22099) ^ (-2115252390);
                        i2 = -2036881906;
                        i6 = iM55680 ^ i2;
                        i5 = i;
                    } else {
                        int iM559710 = C0946.m55979("۟᩺") ^ i4;
                        z = z2;
                        i6 = iM559710 ^ 736385980;
                        i5 = ((iM559710 ^ i3) * (-7735)) ^ (-1233825391);
                        c = '}';
                    }
                    break;
                default:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (C0873.m55680("᩶۬") + i4) * 7;
                        i = ((iM55680 ^ i3) * (-18787)) ^ (-1420741168);
                        i2 = 616383269;
                    } else {
                        iM55680 = (i3 - C0873.m55680("֨ۨ")) * 127;
                        i = ((iM55680 ^ i4) * 19675) ^ (-466741247);
                        i2 = 22272247;
                    }
                    i6 = iM55680 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }
}
