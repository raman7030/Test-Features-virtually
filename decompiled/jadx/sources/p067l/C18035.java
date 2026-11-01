package p067l;

import bin.p000mt.plugin.api.LocalString;
import bin.p000mt.plugin.api.preference.PluginPreference;

/* JADX INFO: renamed from: l.ܽۜ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W3ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18035 extends AbstractC9791 implements PluginPreference.Switch {

    /* JADX INFO: renamed from: ۜ */
    public boolean f53851;

    /* JADX INFO: renamed from: ۢ */
    public CharSequence f53852;

    /* JADX INFO: renamed from: ᩷ */
    public CharSequence f53853;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch defaultValue(boolean z) {
        this.f53851 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summary(CharSequence charSequence) {
        this.f27037 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOn(CharSequence charSequence) {
        this.f53852 = charSequence;
        return this;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19301. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7889(bin.p000mt.plugin.api.PluginContext r29) {
        /*
            Method dump skipped, instruction units count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C18035.mo7889(bin.mt.plugin.api.PluginContext):void");
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch summaryOff(CharSequence charSequence) {
        this.f53853 = charSequence;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch interceptClick(PluginPreference.OnClickInterceptListener onClickInterceptListener) {
        this.f27038 = onClickInterceptListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch visible(boolean z) {
        this.f27039 = z;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Switch
    public final PluginPreference.Switch enable(boolean z) {
        this.f27033 = z;
        return this;
    }

    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final EnumC15825 mo7887() {
        return EnumC15825.f45808;
    }

    @Override // p067l.AbstractC9791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7888(LocalString localString) {
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        int i = 631645377;
        int i2 = C0873.f81841;
        int i3 = C0894.f81854;
        int iM55680 = (C0873.m55680("۠֡") ^ i2) * 37;
        int i4 = ((iM55680 ^ i3) * (-26775)) ^ (-949471564);
        int i5 = 73235224;
        while (true) {
            i = ((((i ^ i3) * 25377) >> 31) & i4) ^ (iM55680 ^ i5);
            switch (i) {
                case -2146586917:
                case -1174511315:
                    this.f27035 = C21862.m49304(localString, (String) charSequence);
                    iM55680 = C0873.m55680("ۡܳ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-14377)) ^ (-216479087);
                    i5 = -336654169;
                    break;
                case -2040292997:
                case 1456009448:
                    if (RunnableC0871.f81839 >= 0) {
                        iM55680 = C0946.m55979("ܳܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30321)) ^ 1244829804;
                        i5 = 9961287;
                    } else {
                        iM55680 = (i3 - C0946.m55979("֫ۚ")) * (-125);
                        i4 = ((iM55680 ^ i2) * (-5869)) ^ (-447893018);
                        i5 = 210663158;
                    }
                    break;
                case -2005382716:
                case 2083776893:
                    charSequence = this.f27035;
                    if (charSequence instanceof String) {
                        iM55680 = (C0946.m55979("ۢ֨") ^ i3) * (-113);
                        i4 = ((iM55680 ^ i2) * (-13499)) ^ (-1423517227);
                        i5 = 878424108;
                    } else {
                        iM55680 = C0873.m55680("ۡܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-14377)) ^ (-216479087);
                        i5 = -336654169;
                    }
                    break;
                case -1996309879:
                case 1091054205:
                    C0927.m55873();
                    RunnableC0897.m55784();
                    break;
                case -1948806224:
                case 1871793258:
                    break;
                case -1693234900:
                case 1512568417:
                    C0890.m55740();
                    if (C0877.f81843 >= 0) {
                        iM55680 = (i3 - C0873.m55680("ۚۢ")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-24341)) ^ (-1911622977);
                        i5 = 406965853;
                    } else {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    }
                    break;
                case -1456846746:
                case 225691396:
                    C1229.m56410();
                    if (C0898.f81858 <= 0) {
                        iM55680 = C0946.m55979("ܳܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30321)) ^ 1244829804;
                        i5 = 9961287;
                    } else {
                        iM55680 = (i3 - C0873.m55680("ۚۢ")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-24341)) ^ (-1911622977);
                        i5 = 406965853;
                    }
                    break;
                case -1319165037:
                case -414377447:
                    charSequence2 = this.f27037;
                    if (charSequence2 instanceof String) {
                        iM55680 = (i3 - C0873.m55680("۠ۘ")) * 11;
                        i4 = ((iM55680 ^ i2) * (-21905)) ^ 24633970;
                        i5 = -276018538;
                    } else {
                        iM55680 = C0946.m55979("᩻ۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-28077)) ^ 434495287;
                        i5 = 1875568976;
                    }
                    break;
                case -1249337959:
                case -5178968:
                    if (AbstractC0942.m55971()) {
                        iM55680 = (C0873.m55680("ۙ֨") ^ i3) * 57;
                        i4 = ((iM55680 ^ i2) * (-6901)) ^ (-1182406830);
                        i5 = -691842640;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۬ۧ")) * (-65);
                        i4 = ((iM55680 ^ i3) * 17927) ^ 1578168035;
                        i5 = 1622242999;
                    }
                    break;
                case -1158884329:
                case -945474203:
                    if (C0863.f81833 <= 0) {
                        iM55680 = (C0873.m55680("ۙ֨") ^ i3) * 57;
                        i4 = ((iM55680 ^ i2) * (-6901)) ^ (-1182406830);
                        i5 = -691842640;
                    } else {
                        iM55680 = C0873.m55680("ۘ᩶") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-28599)) ^ (-716140566);
                        i5 = 186348172;
                    }
                    break;
                case -1087460156:
                case 1632734973:
                    if (C0949.f81897 >= 0) {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    } else {
                        iM55680 = C0946.m55979("֨ܰ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 20203) ^ 685818139;
                        i5 = 1206395454;
                    }
                    break;
                case -1049577515:
                case 522897307:
                    if (ViewOnClickListenerC0939.f81888 <= 0) {
                        iM55680 = C0946.m55979("᩻ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3709)) ^ 1825360951;
                        i5 = 1688057737;
                    } else {
                        iM55680 = (i2 - C0946.m55979("۬ۗ")) * 99;
                        i4 = ((iM55680 ^ i3) * 1407) ^ (-1676680431);
                        i5 = 1934059852;
                    }
                    break;
                case -1017659511:
                case -896495137:
                    if (C1028.f81950 <= 0) {
                        iM55680 = C0946.m55979("ܳܳ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-30321)) ^ 1244829804;
                        i5 = 9961287;
                    } else {
                        iM55680 = C0946.m55979("ܿܺ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26449)) ^ 1982729725;
                        i5 = 1925716762;
                    }
                    break;
                case -922528464:
                case -888331018:
                    if (RunnableC0871.m55672() >= 0) {
                        iM55680 = C0946.m55979("᩻ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3709)) ^ 1825360951;
                        i5 = 1688057737;
                    } else {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    }
                    break;
                case -856379015:
                case 1990077977:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = C0946.m55979("᩻ۙ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-3709)) ^ 1825360951;
                        i5 = 1688057737;
                    } else {
                        iM55680 = C0873.m55680("۟ۛ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 17499) ^ (-342789539);
                        i5 = 482936309;
                    }
                    break;
                case -647627846:
                case 1409647693:
                    this.f53852 = C21862.m49304(localString, (String) charSequence3);
                    iM55680 = (C0946.m55979("ܺᩴ") ^ i2) * 109;
                    i4 = ((iM55680 ^ i3) * (-8153)) ^ 1901361896;
                    i5 = -2067854724;
                    break;
                case -533722760:
                case 829390406:
                    if (C0894.f81854 >= 0) {
                        iM55680 = (C0873.m55680("ۙ֨") ^ i3) * 57;
                        i4 = ((iM55680 ^ i2) * (-6901)) ^ (-1182406830);
                        i5 = -691842640;
                    } else {
                        iM55680 = C0873.m55680("ۤ᩶") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12381) ^ 483874960;
                        i5 = -758622576;
                    }
                    break;
                case -507596293:
                case 407240944:
                    charSequence4 = this.f53853;
                    if (charSequence4 instanceof String) {
                        iM55680 = (C0946.m55979("ۢ᩸") + i2) * (-33);
                        i4 = ((iM55680 ^ i3) * (-30019)) ^ (-250058162);
                        i5 = 1592431896;
                    } else {
                        iM55680 = C0873.m55680("ܿۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-17003)) ^ (-541730923);
                        i5 = 112161189;
                    }
                    break;
                case -370767522:
                case -114361510:
                    RunnableC1014.m56177();
                    iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-6945)) ^ (-585828357);
                    i5 = 465059013;
                    break;
                case -74281651:
                case 1631301932:
                    this.f27037 = C21862.m49304(localString, (String) charSequence2);
                    iM55680 = C0946.m55979("᩻ۜ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-28077)) ^ 434495287;
                    i5 = 1875568976;
                    break;
                case 301508732:
                case 1920311723:
                    this.f53853 = C21862.m49304(localString, (String) charSequence4);
                    iM55680 = C0873.m55680("ܿۛ") ^ i3;
                    i4 = ((iM55680 ^ i2) * (-17003)) ^ (-541730923);
                    i5 = 112161189;
                    break;
                case 897138135:
                case 1316761290:
                    charSequence3 = this.f53852;
                    if (charSequence3 instanceof String) {
                        iM55680 = (C0946.m55979("ۢۘ") ^ i3) * 25;
                        i4 = ((iM55680 ^ i2) * 19765) ^ 142481858;
                        i5 = 162054653;
                    } else {
                        iM55680 = (C0946.m55979("ܺᩴ") ^ i2) * 109;
                        i4 = ((iM55680 ^ i3) * (-8153)) ^ 1901361896;
                        i5 = -2067854724;
                    }
                    break;
                case 1182347631:
                case 1283853907:
                    if (C0989.m56095() <= 0) {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-6945)) ^ (-585828357);
                        i5 = 465059013;
                    } else {
                        iM55680 = C0946.m55979("۬ۢ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-27105)) ^ 1192900789;
                        i5 = -530782681;
                    }
                    break;
                default:
                    if (C0906.m55809() <= 0) {
                        iM55680 = (i3 - C0873.m55680("ۚۢ")) * (-51);
                        i4 = ((iM55680 ^ i2) * (-24341)) ^ (-1911622977);
                        i5 = 406965853;
                    } else {
                        iM55680 = (C0946.m55979("᩶ۧ") + i3) * 25;
                        i4 = ((iM55680 ^ i2) * 12763) ^ (-1257229724);
                        i5 = -1483251437;
                    }
                    break;
            }
            return;
        }
    }
}
