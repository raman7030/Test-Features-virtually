package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.ܽۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W3ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16484 extends AbstractC7809 implements PluginPreference.Switch {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f50674;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public CharSequence f50675;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f50676;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch defaultValue(boolean z) {
        this.f50674 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summary(CharSequence charSequence) {
        this.f24120 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOn(CharSequence charSequence) {
        this.f50675 = charSequence;
        return this;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫ */
    public final void mo5659(bin.mt.plugin.api.PluginContext r29) {
        /*
            Method dump skipped, instruction units count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16484.mo5659(bin.mt.plugin.api.PluginContext):void");
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOff(CharSequence charSequence) {
        this.f50676 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f24121 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch visible(boolean z) {
        this.f24122 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch enable(boolean z) {
        this.f24116 = z;
        return this;
    }

    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫ */
    public final EnumC14158 mo5657() {
        return EnumC14158.f42719;
    }

    @Override // l.AbstractC7809
    /* JADX INFO: renamed from: ֫ */
    public final void mo5658(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i = 631645377;
        int i2 = C0630.f2410;
        int i3 = C1047.f3863;
        int iM2566 = (C0630.m2566("۠֡") ^ i2) * 37;
        int i4 = ((iM2566 ^ i3) * (-26775)) ^ (-949471564);
        int i5 = 73235224;
        while (true) {
            i = ((((i ^ i3) * 25377) >> 31) & i4) ^ (iM2566 ^ i5);
            switch (i) {
                case -2146586917:
                case -1174511315:
                    this.f24118 = C20510.m46981(localString, (String) charSequence);
                    iM2566 = C0630.m2566("ۡܳ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-14377)) ^ (-216479087);
                    i5 = -336654169;
                    break;
                case -2040292997:
                case 1456009448:
                    if (RunnableC0588.f2309 >= 0) {
                        iM2566 = C2105.m6981("ܳܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30321)) ^ 1244829804;
                        i5 = 9961287;
                    } else {
                        iM2566 = (i3 - C2105.m6981("֫ۚ")) * (-125);
                        i4 = ((iM2566 ^ i2) * (-5869)) ^ (-447893018);
                        i5 = 210663158;
                    }
                    break;
                case -2005382716:
                case 2083776893:
                    charSequence = this.f24118;
                    if (charSequence instanceof String) {
                        iM2566 = (C2105.m6981("ۢ֨") ^ i3) * (-113);
                        i4 = ((iM2566 ^ i2) * (-13499)) ^ (-1423517227);
                        i5 = 878424108;
                    } else {
                        iM2566 = C0630.m2566("ۡܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-14377)) ^ (-216479087);
                        i5 = -336654169;
                    }
                    break;
                case -1996309879:
                case 1091054205:
                    C1711.m5736();
                    RunnableC1108.m3790();
                    break;
                case -1948806224:
                case 1871793258:
                    break;
                case -1693234900:
                case 1512568417:
                    C0964.m3413();
                    if (C0714.f2697 >= 0) {
                        iM2566 = (i3 - C0630.m2566("ۚۢ")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-24341)) ^ (-1911622977);
                        i5 = 406965853;
                    } else {
                        iM2566 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    }
                    break;
                case -1456846746:
                case 225691396:
                    C7811.m20844();
                    if (C1128.f4106 <= 0) {
                        iM2566 = C2105.m6981("ܳܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30321)) ^ 1244829804;
                        i5 = 9961287;
                    } else {
                        iM2566 = (i3 - C0630.m2566("ۚۢ")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-24341)) ^ (-1911622977);
                        i5 = 406965853;
                    }
                    break;
                case -1319165037:
                case -414377447:
                    charSequence2 = this.f24120;
                    if (charSequence2 instanceof String) {
                        iM2566 = (i3 - C0630.m2566("۠ۘ")) * 11;
                        i4 = ((iM2566 ^ i2) * (-21905)) ^ 24633970;
                        i5 = -276018538;
                    } else {
                        iM2566 = C2105.m6981("᩻ۜ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-28077)) ^ 434495287;
                        i5 = 1875568976;
                    }
                    break;
                case -1249337959:
                case -5178968:
                    if (AbstractC2021.m6574()) {
                        iM2566 = (C0630.m2566("ۙ֨") ^ i3) * 57;
                        i4 = ((iM2566 ^ i2) * (-6901)) ^ (-1182406830);
                        i5 = -691842640;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۬ۧ")) * (-65);
                        i4 = ((iM2566 ^ i3) * 17927) ^ 1578168035;
                        i5 = 1622242999;
                    }
                    break;
                case -1158884329:
                case -945474203:
                    if (C0422.f1886 <= 0) {
                        iM2566 = (C0630.m2566("ۙ֨") ^ i3) * 57;
                        i4 = ((iM2566 ^ i2) * (-6901)) ^ (-1182406830);
                        i5 = -691842640;
                    } else {
                        iM2566 = C0630.m2566("ۘ᩶") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-28599)) ^ (-716140566);
                        i5 = 186348172;
                    }
                    break;
                case -1087460156:
                case 1632734973:
                    if (C2167.f7158 >= 0) {
                        iM2566 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    } else {
                        iM2566 = C2105.m6981("֨ܰ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 20203) ^ 685818139;
                        i5 = 1206395454;
                    }
                    break;
                case -1049577515:
                case 522897307:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        iM2566 = C2105.m6981("᩻ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3709)) ^ 1825360951;
                        i5 = 1688057737;
                    } else {
                        iM2566 = (i2 - C2105.m6981("۬ۗ")) * 99;
                        i4 = ((iM2566 ^ i3) * 1407) ^ (-1676680431);
                        i5 = 1934059852;
                    }
                    break;
                case -1017659511:
                case -896495137:
                    if (C3746.f11829 <= 0) {
                        iM2566 = C2105.m6981("ܳܳ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-30321)) ^ 1244829804;
                        i5 = 9961287;
                    } else {
                        iM2566 = C2105.m6981("ܿܺ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26449)) ^ 1982729725;
                        i5 = 1925716762;
                    }
                    break;
                case -922528464:
                case -888331018:
                    if (RunnableC0588.m2441() >= 0) {
                        iM2566 = C2105.m6981("᩻ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3709)) ^ 1825360951;
                        i5 = 1688057737;
                    } else {
                        iM2566 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    }
                    break;
                case -856379015:
                case 1990077977:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = C2105.m6981("᩻ۙ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-3709)) ^ 1825360951;
                        i5 = 1688057737;
                    } else {
                        iM2566 = C0630.m2566("۟ۛ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 17499) ^ (-342789539);
                        i5 = 482936309;
                    }
                    break;
                case -647627846:
                case 1409647693:
                    this.f50675 = C20510.m46981(localString, (String) charSequence3);
                    iM2566 = (C2105.m6981("ܺᩴ") ^ i2) * 109;
                    i4 = ((iM2566 ^ i3) * (-8153)) ^ 1901361896;
                    i5 = -2067854724;
                    break;
                case -533722760:
                case 829390406:
                    if (C1047.f3863 >= 0) {
                        iM2566 = (C0630.m2566("ۙ֨") ^ i3) * 57;
                        i4 = ((iM2566 ^ i2) * (-6901)) ^ (-1182406830);
                        i5 = -691842640;
                    } else {
                        iM2566 = C0630.m2566("ۤ᩶") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12381) ^ 483874960;
                        i5 = -758622576;
                    }
                    break;
                case -507596293:
                case 407240944:
                    charSequence4 = this.f50676;
                    if (charSequence4 instanceof String) {
                        iM2566 = (C2105.m6981("ۢ᩸") + i2) * (-33);
                        i4 = ((iM2566 ^ i3) * (-30019)) ^ (-250058162);
                        i5 = 1592431896;
                    } else {
                        iM2566 = C0630.m2566("ܿۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-17003)) ^ (-541730923);
                        i5 = 112161189;
                    }
                    break;
                case -370767522:
                case -114361510:
                    RunnableC3474.m10630();
                    iM2566 = C2105.m6981("ܶᩴ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-6945)) ^ (-585828357);
                    i5 = 465059013;
                    break;
                case -74281651:
                case 1631301932:
                    this.f24120 = C20510.m46981(localString, (String) charSequence2);
                    iM2566 = C2105.m6981("᩻ۜ") ^ i2;
                    i4 = ((iM2566 ^ i3) * (-28077)) ^ 434495287;
                    i5 = 1875568976;
                    break;
                case 301508732:
                case 1920311723:
                    this.f50676 = C20510.m46981(localString, (String) charSequence4);
                    iM2566 = C0630.m2566("ܿۛ") ^ i3;
                    i4 = ((iM2566 ^ i2) * (-17003)) ^ (-541730923);
                    i5 = 112161189;
                    break;
                case 897138135:
                case 1316761290:
                    charSequence3 = this.f50675;
                    if (charSequence3 instanceof String) {
                        iM2566 = (C2105.m6981("ۢۘ") ^ i3) * 25;
                        i4 = ((iM2566 ^ i2) * 19765) ^ 142481858;
                        i5 = 162054653;
                    } else {
                        iM2566 = (C2105.m6981("ܺᩴ") ^ i2) * 109;
                        i4 = ((iM2566 ^ i3) * (-8153)) ^ 1901361896;
                        i5 = -2067854724;
                    }
                    break;
                case 1182347631:
                case 1283853907:
                    if (C2958.m9034() <= 0) {
                        iM2566 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    } else {
                        iM2566 = C2105.m6981("۬ۢ") ^ i2;
                        i4 = ((iM2566 ^ i3) * (-27105)) ^ 1192900789;
                        i5 = -530782681;
                    }
                    break;
                default:
                    if (C1294.m4372() <= 0) {
                        iM2566 = (i3 - C0630.m2566("ۚۢ")) * (-51);
                        i4 = ((iM2566 ^ i2) * (-24341)) ^ (-1911622977);
                        i5 = 406965853;
                    } else {
                        iM2566 = (C2105.m6981("᩶ۧ") + i3) * 25;
                        i4 = ((iM2566 ^ i2) * 12763) ^ (-1257229724);
                        i5 = -1483251437;
                    }
                    break;
            }
            return;
        }
    }
}
