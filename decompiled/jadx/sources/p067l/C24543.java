package p067l;

import bin.p000mt.plugin.api.LocalString;
import bin.p000mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.᩺᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B3YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24543 extends AbstractC9791 implements PluginPreference.Input {

    /* JADX INFO: renamed from: ۜ */
    public CharSequence f77733;

    /* JADX INFO: renamed from: ۡ */
    public PluginPreference.Input.Validator f77734;

    /* JADX INFO: renamed from: ۢ */
    public int f77735;

    /* JADX INFO: renamed from: ܺ */
    public boolean f77736;

    /* JADX INFO: renamed from: ᩷ */
    public CharSequence f77737;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input defaultValue(CharSequence charSequence) {
        this.f77733 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input summary(CharSequence charSequence) {
        this.f27037 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input hint(CharSequence charSequence) {
        this.f77737 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input valueAsSummary() {
        this.f77736 = true;
        return this;
    }

    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7888(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        int i = -1190653567;
        int i2 = AbstractC0942.f81890;
        int i3 = C0992.f81922;
        int iM55680 = C0873.m55680("ۚ۬") ^ i3;
        int i4 = ((iM55680 ^ i2) * 15873) ^ (-1125726828);
        int i5 = 1983255114;
        while (true) {
            i = ((((i ^ i2) * (-31329)) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2094150604:
                case -1491740727:
                    charSequence3 = this.f77737;
                    if (charSequence3 instanceof String) {
                        iM55680 = C0873.m55680("᩻᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * 14699) ^ (-1841005317);
                        i5 = 1374426805;
                    } else {
                        iM55680 = (C0946.m55979("ᩴܺ") + i2) * (-43);
                        i4 = ((iM55680 ^ i3) * 13995) ^ (-2060317937);
                        i5 = 1884885122;
                    }
                    break;
                case -2087350507:
                case 1344072523:
                    C0949.m56012();
                    if (C1003.f81929 > 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM55680 = (i3 - C0873.m55680("᩻ۘ")) * 41;
                        i4 = ((iM55680 ^ i2) * (-443)) ^ 1912009673;
                        i5 = -1453186423;
                    }
                    break;
                case -2065302308:
                case 1275032357:
                    if (C0882.f81846) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM55680 = C0873.m55680("۬᩺") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-14551)) ^ (-783697138);
                        i5 = 1293160594;
                    }
                    break;
                case -1948807644:
                case 452194585:
                    charSequence2 = this.f27037;
                    if (charSequence2 instanceof String) {
                        iM55680 = (i3 - C0946.m55979("ۚ۟")) * (-61);
                        i4 = ((iM55680 ^ i2) * (-21543)) ^ (-1506582831);
                        i5 = -1266543973;
                    } else {
                        iM55680 = C0946.m55979("ᩳ᩷") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-23625)) ^ (-1803340148);
                        i5 = -712765997;
                    }
                    break;
                case -1850720035:
                case -75787156:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3937)) ^ 1975855003;
                        i5 = -717472770;
                    } else {
                        iM55680 = (C0946.m55979("᩷۫") ^ i3) * 15;
                        i4 = ((iM55680 ^ i2) * (-8601)) ^ (-632597967);
                        i5 = 753203853;
                    }
                    break;
                case -1601425308:
                case -1226193353:
                    if (C1053.f81965 <= 0) {
                        iM55680 = C0873.m55680("۠۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۘ֫")) * 9;
                        i4 = ((iM55680 ^ i2) * 3693) ^ (-1821236141);
                        i5 = 224424628;
                    }
                    break;
                case -1598723988:
                case 993205607:
                    if (C1028.f81950 <= 0) {
                        iM55680 = (C0873.m55680("ۤᩳ") ^ i3) * (-45);
                        i4 = ((iM55680 ^ i2) * (-24405)) ^ (-1437663560);
                        i5 = 1729374814;
                    } else {
                        iM55680 = (C0873.m55680("ۘ֨") + i2) * 57;
                        i4 = ((iM55680 ^ i3) * (-14091)) ^ (-300775259);
                        i5 = 1337266;
                    }
                    break;
                case -1533609364:
                case 665450600:
                    C0949.m56012();
                    if (C0912.f81867 > 0) {
                        iM55680 = (i3 - C0873.m55680("᩻ۘ")) * 41;
                        i4 = ((iM55680 ^ i2) * (-443)) ^ 1912009673;
                        i5 = -1453186423;
                    } else {
                        iM55680 = (C0873.m55680("ۤᩳ") ^ i3) * (-45);
                        i4 = ((iM55680 ^ i2) * (-24405)) ^ (-1437663560);
                        i5 = 1729374814;
                    }
                    break;
                case -1489460062:
                case -833544925:
                    if (C0882.m55710() != 0) {
                        iM55680 = (C0873.m55680("ۤᩳ") ^ i3) * (-45);
                        i4 = ((iM55680 ^ i2) * (-24405)) ^ (-1437663560);
                        i5 = 1729374814;
                    } else {
                        iM55680 = C0873.m55680("۠۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    }
                    break;
                case -1389529829:
                case 626020558:
                    if (C0967.f81910 >= 0) {
                        iM55680 = C0873.m55680("۠۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    } else {
                        iM55680 = (C0873.m55680("᩵᩺") ^ i2) * (-47);
                        i4 = ((iM55680 ^ i3) * (-28271)) ^ (-773579857);
                        i5 = 1563097379;
                    }
                    break;
                case -1135685606:
                case 717999493:
                    this.f77737 = C21862.m49304(localString, (String) charSequence3);
                    iM55680 = (C0946.m55979("ᩴܺ") + i2) * (-43);
                    i4 = ((iM55680 ^ i3) * 13995) ^ (-2060317937);
                    i5 = 1884885122;
                    break;
                case -1066627823:
                case 624585049:
                    if (C0955.m56025()) {
                        iM55680 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3937)) ^ 1975855003;
                        i5 = -717472770;
                    } else {
                        iM55680 = C0946.m55979("᩺֡") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-17555)) ^ 1577723429;
                        i5 = -1105555746;
                    }
                    break;
                case -923096926:
                case 1621613885:
                    C1964.m56597();
                    C0989.m56095();
                    break;
                case -734759974:
                case 825808249:
                    this.f27037 = C21862.m49304(localString, (String) charSequence2);
                    iM55680 = C0946.m55979("ᩳ᩷") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-23625)) ^ (-1803340148);
                    i5 = -712765997;
                    break;
                case -677433791:
                case 1138660143:
                    if (C0955.m56025()) {
                        iM55680 = C0946.m55979("᩵ܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-3937)) ^ 1975855003;
                        i5 = -717472770;
                    } else {
                        iM55680 = (C0946.m55979("᩺ۘ") + i2) * (-13);
                        i4 = ((iM55680 ^ i3) * (-17511)) ^ 344919486;
                        i5 = -1132658787;
                    }
                    break;
                case -588698213:
                case -390907078:
                    charSequence = this.f27035;
                    if (charSequence instanceof String) {
                        iM55680 = C0873.m55680("ۡ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-4579)) ^ (-387327424);
                        i5 = 529141510;
                    } else {
                        iM55680 = (C0946.m55979("᩷᩶") + i2) * (-79);
                        i4 = ((iM55680 ^ i3) * (-829)) ^ 215031595;
                        i5 = -879767066;
                    }
                    break;
                case -232036029:
                case 1126906989:
                    this.f27035 = C21862.m49304(localString, (String) charSequence);
                    iM55680 = (C0946.m55979("᩷᩶") + i2) * (-79);
                    i4 = ((iM55680 ^ i3) * (-829)) ^ 215031595;
                    i5 = -879767066;
                    break;
                case 9953471:
                case 679637599:
                    break;
                case 392959212:
                case 1472611249:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0873.m55680("۠۟") ^ i2;
                        i4 = ((iM55680 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    } else {
                        iM55680 = C0873.m55680("ۢۨ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-25615)) ^ 64640596;
                        i5 = -1378760791;
                    }
                    break;
                case 1279136969:
                case 1577370475:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM55680 = (C0946.m55979("ۤ۟") ^ i3) * 31;
                        i4 = ((iM55680 ^ i2) * 9329) ^ (-1077336155);
                        i5 = 1885380066;
                    }
                    break;
                case 1569301619:
                case 1608222193:
                    C0947.m55997();
                    C1028.m56247();
                    iM55680 = C0873.m55680("۠۟") ^ i2;
                    i4 = ((iM55680 ^ i3) * 5083) ^ 1288347483;
                    i5 = -1638859554;
                    break;
                default:
                    if (C1929.f83011 != 0) {
                        iM55680 = C0946.m55979("᩹᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM55680 = C0873.m55680("ۙ᩵") ^ i3;
                        i4 = ((iM55680 ^ i2) * 15617) ^ 96765601;
                        i5 = 977160461;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input inputType(int i) {
        this.f77735 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input validator(PluginPreference.Input.Validator validator) {
        this.f77734 = validator;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f27038 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input visible(boolean z) {
        this.f27039 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input enable(boolean z) {
        this.f27033 = z;
        return this;
    }

    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final EnumC15825 mo7887() {
        return EnumC15825.f45811;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7889(bin.p000mt.plugin.api.PluginContext r24) {
        /*
            Method dump skipped, instruction units count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C24543.mo7889(bin.mt.plugin.api.PluginContext):void");
    }
}
