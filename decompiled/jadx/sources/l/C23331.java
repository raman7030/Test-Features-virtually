package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.᩺᩻᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B3YQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23331 extends AbstractC7809 implements PluginPreference.Input {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f74986;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public PluginPreference.Input.Validator f74987;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f74988;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f74989;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f74990;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input defaultValue(CharSequence charSequence) {
        this.f74986 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input summary(CharSequence charSequence) {
        this.f24120 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input hint(CharSequence charSequence) {
        this.f74990 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input valueAsSummary() {
        this.f74989 = true;
        return this;
    }

    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫ */
    public final void mo5658(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        int i = -1190653567;
        int i2 = AbstractC2021.f6743;
        int i3 = C3019.f9544;
        int iM2566 = C0630.m2566("ۚ۬") ^ i3;
        int i4 = ((iM2566 ^ i2) * 15873) ^ (-1125726828);
        int i5 = 1983255114;
        while (true) {
            i = ((((i ^ i2) * (-31329)) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2094150604:
                case -1491740727:
                    charSequence3 = this.f74990;
                    if (charSequence3 instanceof String) {
                        iM2566 = C0630.m2566("᩻᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * 14699) ^ (-1841005317);
                        i5 = 1374426805;
                    } else {
                        iM2566 = (C2105.m6981("ᩴܺ") + i2) * (-43);
                        i4 = ((iM2566 ^ i3) * 13995) ^ (-2060317937);
                        i5 = 1884885122;
                    }
                    break;
                case -2087350507:
                case 1344072523:
                    C2167.m7155();
                    if (C3245.f10203 > 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM2566 = (i3 - C0630.m2566("᩻ۘ")) * 41;
                        i4 = ((iM2566 ^ i2) * (-443)) ^ 1912009673;
                        i5 = -1453186423;
                    }
                    break;
                case -2065302308:
                case 1275032357:
                    if (C0798.f2919) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM2566 = C0630.m2566("۬᩺") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-14551)) ^ (-783697138);
                        i5 = 1293160594;
                    }
                    break;
                case -1948807644:
                case 452194585:
                    charSequence2 = this.f24120;
                    if (charSequence2 instanceof String) {
                        iM2566 = (i3 - C2105.m6981("ۚ۟")) * (-61);
                        i4 = ((iM2566 ^ i2) * (-21543)) ^ (-1506582831);
                        i5 = -1266543973;
                    } else {
                        iM2566 = C2105.m6981("ᩳ᩷") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-23625)) ^ (-1803340148);
                        i5 = -712765997;
                    }
                    break;
                case -1850720035:
                case -75787156:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3937)) ^ 1975855003;
                        i5 = -717472770;
                    } else {
                        iM2566 = (C2105.m6981("᩷۫") ^ i3) * 15;
                        i4 = ((iM2566 ^ i2) * (-8601)) ^ (-632597967);
                        i5 = 753203853;
                    }
                    break;
                case -1601425308:
                case -1226193353:
                    if (C4263.f13799 <= 0) {
                        iM2566 = C0630.m2566("۠۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۘ֫")) * 9;
                        i4 = ((iM2566 ^ i2) * 3693) ^ (-1821236141);
                        i5 = 224424628;
                    }
                    break;
                case -1598723988:
                case 993205607:
                    if (C3746.f11829 <= 0) {
                        iM2566 = (C0630.m2566("ۤᩳ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-24405)) ^ (-1437663560);
                        i5 = 1729374814;
                    } else {
                        iM2566 = (C0630.m2566("ۘ֨") + i2) * 57;
                        i4 = ((iM2566 ^ i3) * (-14091)) ^ (-300775259);
                        i5 = 1337266;
                    }
                    break;
                case -1533609364:
                case 665450600:
                    C2167.m7155();
                    if (C1420.f5096 > 0) {
                        iM2566 = (i3 - C0630.m2566("᩻ۘ")) * 41;
                        i4 = ((iM2566 ^ i2) * (-443)) ^ 1912009673;
                        i5 = -1453186423;
                    } else {
                        iM2566 = (C0630.m2566("ۤᩳ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-24405)) ^ (-1437663560);
                        i5 = 1729374814;
                    }
                    break;
                case -1489460062:
                case -833544925:
                    if (C0798.m2998() != 0) {
                        iM2566 = (C0630.m2566("ۤᩳ") ^ i3) * (-45);
                        i4 = ((iM2566 ^ i2) * (-24405)) ^ (-1437663560);
                        i5 = 1729374814;
                    } else {
                        iM2566 = C0630.m2566("۠۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    }
                    break;
                case -1389529829:
                case 626020558:
                    if (C2520.f8000 >= 0) {
                        iM2566 = C0630.m2566("۠۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    } else {
                        iM2566 = (C0630.m2566("᩵᩺") ^ i2) * (-47);
                        i4 = ((iM2566 ^ i3) * (-28271)) ^ (-773579857);
                        i5 = 1563097379;
                    }
                    break;
                case -1135685606:
                case 717999493:
                    this.f74990 = C20510.m46981(localString, (String) charSequence3);
                    iM2566 = (C2105.m6981("ᩴܺ") + i2) * (-43);
                    i4 = ((iM2566 ^ i3) * 13995) ^ (-2060317937);
                    i5 = 1884885122;
                    break;
                case -1066627823:
                case 624585049:
                    if (C2272.m7503()) {
                        iM2566 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3937)) ^ 1975855003;
                        i5 = -717472770;
                    } else {
                        iM2566 = C2105.m6981("᩺֡") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-17555)) ^ 1577723429;
                        i5 = -1105555746;
                    }
                    break;
                case -923096926:
                case 1621613885:
                    C22628.m50615();
                    C2958.m9034();
                    break;
                case -734759974:
                case 825808249:
                    this.f24120 = C20510.m46981(localString, (String) charSequence2);
                    iM2566 = C2105.m6981("ᩳ᩷") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-23625)) ^ (-1803340148);
                    i5 = -712765997;
                    break;
                case -677433791:
                case 1138660143:
                    if (C2272.m7503()) {
                        iM2566 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-3937)) ^ 1975855003;
                        i5 = -717472770;
                    } else {
                        iM2566 = (C2105.m6981("᩺ۘ") + i2) * (-13);
                        i4 = ((iM2566 ^ i3) * (-17511)) ^ 344919486;
                        i5 = -1132658787;
                    }
                    break;
                case -588698213:
                case -390907078:
                    charSequence = this.f24118;
                    if (charSequence instanceof String) {
                        iM2566 = C0630.m2566("ۡ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-4579)) ^ (-387327424);
                        i5 = 529141510;
                    } else {
                        iM2566 = (C2105.m6981("᩷᩶") + i2) * (-79);
                        i4 = ((iM2566 ^ i3) * (-829)) ^ 215031595;
                        i5 = -879767066;
                    }
                    break;
                case -232036029:
                case 1126906989:
                    this.f24118 = C20510.m46981(localString, (String) charSequence);
                    iM2566 = (C2105.m6981("᩷᩶") + i2) * (-79);
                    i4 = ((iM2566 ^ i3) * (-829)) ^ 215031595;
                    i5 = -879767066;
                    break;
                case 9953471:
                case 679637599:
                    break;
                case 392959212:
                case 1472611249:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C0630.m2566("۠۟") ^ i2;
                        i4 = ((iM2566 ^ i3) * 5083) ^ 1288347483;
                        i5 = -1638859554;
                    } else {
                        iM2566 = C0630.m2566("ۢۨ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-25615)) ^ 64640596;
                        i5 = -1378760791;
                    }
                    break;
                case 1279136969:
                case 1577370475:
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM2566 = (C2105.m6981("ۤ۟") ^ i3) * 31;
                        i4 = ((iM2566 ^ i2) * 9329) ^ (-1077336155);
                        i5 = 1885380066;
                    }
                    break;
                case 1569301619:
                case 1608222193:
                    C2126.m7040();
                    C3746.m11369();
                    iM2566 = C0630.m2566("۠۟") ^ i2;
                    i4 = ((iM2566 ^ i3) * 5083) ^ 1288347483;
                    i5 = -1638859554;
                    break;
                default:
                    if (C21923.f70183 != 0) {
                        iM2566 = C2105.m6981("᩹᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17335) ^ 1562068390;
                        i5 = 1895839990;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩵") ^ i3;
                        i4 = ((iM2566 ^ i2) * 15617) ^ 96765601;
                        i5 = 977160461;
                    }
                    break;
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input inputType(int i) {
        this.f74988 = i;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input validator(PluginPreference.Input.Validator validator) {
        this.f74987 = validator;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f24121 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input visible(boolean z) {
        this.f24122 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Input
    public final PluginPreference.Input enable(boolean z) {
        this.f24116 = z;
        return this;
    }

    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫ */
    public final EnumC14158 mo5657() {
        return EnumC14158.f42723;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫ */
    public final void mo5659(bin.mt.plugin.api.PluginContext r24) {
        /*
            Method dump skipped, instruction units count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23331.mo5659(bin.mt.plugin.api.PluginContext):void");
    }
}
