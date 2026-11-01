package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۖܿ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۖ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O56L */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5044 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final EnumC5044 f11593;

    /* JADX INFO: renamed from: ֡ۧ */
    public static final EnumC5044 f11594;

    /* JADX INFO: renamed from: ֡ܳ */
    public static final EnumC5044 f11595;

    /* JADX INFO: renamed from: ֡ܽ */
    public static final EnumC5044 f11596;

    /* JADX INFO: renamed from: ֡ܿ */
    public static final EnumC5044 f11597;

    /* JADX INFO: renamed from: ֡ᩳ */
    public static final EnumC5044 f11598;

    /* JADX INFO: renamed from: ֨֫ */
    public static final EnumC5044 f11599;

    /* JADX INFO: renamed from: ֨ۧ */
    public static final EnumC5044 f11600;

    /* JADX INFO: renamed from: ֨ܳ */
    public static final EnumC5044 f11601;

    /* JADX INFO: renamed from: ֨ܽ */
    public static final EnumC5044 f11602;

    /* JADX INFO: renamed from: ֨ܿ */
    public static final EnumC5044 f11603;

    /* JADX INFO: renamed from: ֨ᩳ */
    public static final EnumC5044 f11604;

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC5044 f11605;

    /* JADX INFO: renamed from: ֫ۧ */
    public static final EnumC5044 f11606;

    /* JADX INFO: renamed from: ֫ܳ */
    public static final EnumC5044 f11607;

    /* JADX INFO: renamed from: ֫ܽ */
    public static final EnumC5044 f11608;

    /* JADX INFO: renamed from: ֫ܿ */
    public static final EnumC5044 f11609;

    /* JADX INFO: renamed from: ֫ᩳ */
    public static final EnumC5044 f11610;

    /* JADX INFO: renamed from: ֫᩻ */
    public static final EnumC5044 f11611;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final EnumC5044 f11612;

    /* JADX INFO: renamed from: ۖۧ */
    public static final EnumC5044 f11613;

    /* JADX INFO: renamed from: ۖܳ */
    public static final EnumC5044 f11614;

    /* JADX INFO: renamed from: ۖܽ */
    public static final EnumC5044 f11615;

    /* JADX INFO: renamed from: ۖܿ */
    public static final EnumC5044 f11616;

    /* JADX INFO: renamed from: ۖᩳ */
    public static final EnumC5044 f11617;

    /* JADX INFO: renamed from: ۖ᩻ */
    public static final EnumC5044 f11618;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final EnumC5044 f11619;

    /* JADX INFO: renamed from: ۗۧ */
    public static final EnumC5044 f11620;

    /* JADX INFO: renamed from: ۗܳ */
    public static final EnumC5044 f11621;

    /* JADX INFO: renamed from: ۗܽ */
    public static final EnumC5044 f11622;

    /* JADX INFO: renamed from: ۗܿ */
    public static final EnumC5044 f11623;

    /* JADX INFO: renamed from: ۗᩳ */
    public static final EnumC5044 f11624;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC5044 f11625;

    /* JADX INFO: renamed from: ۘۧ */
    public static final EnumC5044 f11626;

    /* JADX INFO: renamed from: ۘܳ */
    public static final EnumC5044 f11627;

    /* JADX INFO: renamed from: ۘܽ */
    public static final EnumC5044 f11628;

    /* JADX INFO: renamed from: ۘܿ */
    public static final EnumC5044 f11629;

    /* JADX INFO: renamed from: ۘᩳ */
    public static final EnumC5044 f11630;

    /* JADX INFO: renamed from: ۘ᩻ */
    public static final EnumC5044 f11631;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final EnumC5044 f11632;

    /* JADX INFO: renamed from: ۙۧ */
    public static final EnumC5044 f11633;

    /* JADX INFO: renamed from: ۙܳ */
    public static final EnumC5044 f11634;

    /* JADX INFO: renamed from: ۙܽ */
    public static final EnumC5044 f11635;

    /* JADX INFO: renamed from: ۙܿ */
    public static final EnumC5044 f11636;

    /* JADX INFO: renamed from: ۙᩳ */
    public static final EnumC5044 f11637;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final EnumC5044 f11638;

    /* JADX INFO: renamed from: ۚۧ */
    public static final EnumC5044 f11639;

    /* JADX INFO: renamed from: ۚܳ */
    public static final EnumC5044 f11640;

    /* JADX INFO: renamed from: ۚܽ */
    public static final EnumC5044 f11641;

    /* JADX INFO: renamed from: ۚܿ */
    public static final EnumC5044 f11642;

    /* JADX INFO: renamed from: ۚᩳ */
    public static final EnumC5044 f11643;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC5044 f11644;

    /* JADX INFO: renamed from: ۛ֫ */
    public static final EnumC5044 f11645;

    /* JADX INFO: renamed from: ۛۧ */
    public static final EnumC5044 f11646;

    /* JADX INFO: renamed from: ۛܳ */
    public static final EnumC5044 f11647;

    /* JADX INFO: renamed from: ۛܽ */
    public static final EnumC5044 f11648;

    /* JADX INFO: renamed from: ۛܿ */
    public static final EnumC5044 f11649;

    /* JADX INFO: renamed from: ۛᩳ */
    public static final EnumC5044 f11650;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC5044 f11651;

    /* JADX INFO: renamed from: ۜۧ */
    public static final EnumC5044 f11652;

    /* JADX INFO: renamed from: ۜܳ */
    public static final EnumC5044 f11653;

    /* JADX INFO: renamed from: ۜܽ */
    public static final EnumC5044 f11654;

    /* JADX INFO: renamed from: ۜܿ */
    public static final EnumC5044 f11655;

    /* JADX INFO: renamed from: ۜᩳ */
    public static final EnumC5044 f11656;

    /* JADX INFO: renamed from: ۜ᩻ */
    public static final EnumC5044 f11657;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC5044 f11658;

    /* JADX INFO: renamed from: ۟֫ */
    public static final EnumC5044 f11659;

    /* JADX INFO: renamed from: ۟ۧ */
    public static final EnumC5044 f11660;

    /* JADX INFO: renamed from: ۟ܳ */
    public static final EnumC5044 f11661;

    /* JADX INFO: renamed from: ۟ܽ */
    public static final EnumC5044 f11662;

    /* JADX INFO: renamed from: ۟ܿ */
    public static final EnumC5044 f11663;

    /* JADX INFO: renamed from: ۟ᩳ */
    public static final EnumC5044 f11664;

    /* JADX INFO: renamed from: ۠֫ */
    public static final EnumC5044 f11665;

    /* JADX INFO: renamed from: ۠ۧ */
    public static final EnumC5044 f11666;

    /* JADX INFO: renamed from: ۠ܳ */
    public static final EnumC5044 f11667;

    /* JADX INFO: renamed from: ۠ܽ */
    public static final EnumC5044 f11668;

    /* JADX INFO: renamed from: ۠ܿ */
    public static final EnumC5044 f11669;

    /* JADX INFO: renamed from: ۠ᩳ */
    public static final EnumC5044 f11670;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC5044 f11671;

    /* JADX INFO: renamed from: ۡۧ */
    public static final EnumC5044 f11672;

    /* JADX INFO: renamed from: ۡܳ */
    public static final EnumC5044 f11673;

    /* JADX INFO: renamed from: ۡܽ */
    public static final EnumC5044 f11674;

    /* JADX INFO: renamed from: ۡܿ */
    public static final EnumC5044 f11675;

    /* JADX INFO: renamed from: ۡᩳ */
    public static final EnumC5044 f11676;

    /* JADX INFO: renamed from: ۡ᩻ */
    public static final EnumC5044 f11677;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC5044 f11678;

    /* JADX INFO: renamed from: ۢۧ */
    public static final EnumC5044 f11679;

    /* JADX INFO: renamed from: ۢܳ */
    public static final EnumC5044 f11680;

    /* JADX INFO: renamed from: ۢܽ */
    public static final EnumC5044 f11681;

    /* JADX INFO: renamed from: ۢܿ */
    public static final EnumC5044 f11682;

    /* JADX INFO: renamed from: ۢᩳ */
    public static final EnumC5044 f11683;

    /* JADX INFO: renamed from: ۢ᩻ */
    public static final EnumC5044 f11684;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC5044 f11685;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final EnumC5044 f11686;

    /* JADX INFO: renamed from: ۤۧ */
    public static final EnumC5044 f11687;

    /* JADX INFO: renamed from: ۤܳ */
    public static final EnumC5044 f11688;

    /* JADX INFO: renamed from: ۤܽ */
    public static final EnumC5044 f11689;

    /* JADX INFO: renamed from: ۤܿ */
    public static final EnumC5044 f11690;

    /* JADX INFO: renamed from: ۤᩳ */
    public static final EnumC5044 f11691;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC5044 f11692;

    /* JADX INFO: renamed from: ۧۧ */
    public static final EnumC5044 f11693;

    /* JADX INFO: renamed from: ۧܳ */
    public static final EnumC5044 f11694;

    /* JADX INFO: renamed from: ۧܽ */
    public static final EnumC5044 f11695;

    /* JADX INFO: renamed from: ۧܿ */
    public static final EnumC5044 f11696;

    /* JADX INFO: renamed from: ۧᩳ */
    public static final EnumC5044 f11697;

    /* JADX INFO: renamed from: ۧ᩻ */
    public static final EnumC5044 f11698;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC5044 f11699;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final EnumC5044 f11700;

    /* JADX INFO: renamed from: ۨۧ */
    public static final EnumC5044 f11701;

    /* JADX INFO: renamed from: ۨܳ */
    public static final EnumC5044 f11702;

    /* JADX INFO: renamed from: ۨܽ */
    public static final EnumC5044 f11703;

    /* JADX INFO: renamed from: ۨܿ */
    public static final EnumC5044 f11704;

    /* JADX INFO: renamed from: ۨᩳ */
    public static final EnumC5044 f11705;

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ EnumC5044[] f11706;

    /* JADX INFO: renamed from: ۫֫ */
    public static final EnumC5044 f11707;

    /* JADX INFO: renamed from: ۫ۧ */
    public static final EnumC5044 f11708;

    /* JADX INFO: renamed from: ۫ܳ */
    public static final EnumC5044 f11709;

    /* JADX INFO: renamed from: ۫ܽ */
    public static final EnumC5044 f11710;

    /* JADX INFO: renamed from: ۫ܿ */
    public static final EnumC5044 f11711;

    /* JADX INFO: renamed from: ۫ᩳ */
    public static final EnumC5044 f11712;

    /* JADX INFO: renamed from: ۬֫ */
    public static final EnumC5044 f11713;

    /* JADX INFO: renamed from: ۬ۧ */
    public static final EnumC5044 f11714;

    /* JADX INFO: renamed from: ۬ܳ */
    public static final EnumC5044 f11715;

    /* JADX INFO: renamed from: ۬ܽ */
    public static final EnumC5044 f11716;

    /* JADX INFO: renamed from: ۬ܿ */
    public static final EnumC5044 f11717;

    /* JADX INFO: renamed from: ۬ᩳ */
    public static final EnumC5044 f11718;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC5044 f11719;

    /* JADX INFO: renamed from: ܰ֫ */
    public static final EnumC5044 f11720;

    /* JADX INFO: renamed from: ܰۧ */
    public static final EnumC5044 f11721;

    /* JADX INFO: renamed from: ܰܳ */
    public static final EnumC5044 f11722;

    /* JADX INFO: renamed from: ܰܽ */
    public static final EnumC5044 f11723;

    /* JADX INFO: renamed from: ܰܿ */
    public static final EnumC5044 f11724;

    /* JADX INFO: renamed from: ܰᩳ */
    public static final EnumC5044 f11725;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC5044 f11726;

    /* JADX INFO: renamed from: ܳۧ */
    public static final EnumC5044 f11727;

    /* JADX INFO: renamed from: ܳܳ */
    public static final EnumC5044 f11728;

    /* JADX INFO: renamed from: ܳܽ */
    public static final EnumC5044 f11729;

    /* JADX INFO: renamed from: ܳܿ */
    public static final EnumC5044 f11730;

    /* JADX INFO: renamed from: ܳᩳ */
    public static final EnumC5044 f11731;

    /* JADX INFO: renamed from: ܳ᩻ */
    public static final EnumC5044 f11732;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final EnumC5044 f11733;

    /* JADX INFO: renamed from: ܶۧ */
    public static final EnumC5044 f11734;

    /* JADX INFO: renamed from: ܶܳ */
    public static final EnumC5044 f11735;

    /* JADX INFO: renamed from: ܶܽ */
    public static final EnumC5044 f11736;

    /* JADX INFO: renamed from: ܶܿ */
    public static final EnumC5044 f11737;

    /* JADX INFO: renamed from: ܶᩳ */
    public static final EnumC5044 f11738;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final EnumC5044 f11739;

    /* JADX INFO: renamed from: ܺۧ */
    public static final EnumC5044 f11740;

    /* JADX INFO: renamed from: ܺܳ */
    public static final EnumC5044 f11741;

    /* JADX INFO: renamed from: ܺܽ */
    public static final EnumC5044 f11742;

    /* JADX INFO: renamed from: ܺܿ */
    public static final EnumC5044 f11743;

    /* JADX INFO: renamed from: ܺᩳ */
    public static final EnumC5044 f11744;

    /* JADX INFO: renamed from: ܺ᩻ */
    public static final EnumC5044 f11745;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC5044 f11746;

    /* JADX INFO: renamed from: ܽۧ */
    public static final EnumC5044 f11747;

    /* JADX INFO: renamed from: ܽܳ */
    public static final EnumC5044 f11748;

    /* JADX INFO: renamed from: ܽܽ */
    public static final EnumC5044 f11749;

    /* JADX INFO: renamed from: ܽܿ */
    public static final EnumC5044 f11750;

    /* JADX INFO: renamed from: ܽᩳ */
    public static final EnumC5044 f11751;

    /* JADX INFO: renamed from: ܽ᩻ */
    public static final EnumC5044 f11752;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC5044 f11753;

    /* JADX INFO: renamed from: ܿۧ */
    public static final EnumC5044 f11754;

    /* JADX INFO: renamed from: ܿܳ */
    public static final EnumC5044 f11755;

    /* JADX INFO: renamed from: ܿܽ */
    public static final EnumC5044 f11756;

    /* JADX INFO: renamed from: ܿܿ */
    public static final EnumC5044 f11757;

    /* JADX INFO: renamed from: ܿᩳ */
    public static final EnumC5044 f11758;

    /* JADX INFO: renamed from: ܿ᩻ */
    public static final EnumC5044 f11759;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC5044 f11760;

    /* JADX INFO: renamed from: ᩳۧ */
    public static final EnumC5044 f11761;

    /* JADX INFO: renamed from: ᩳܳ */
    public static final EnumC5044 f11762;

    /* JADX INFO: renamed from: ᩳܽ */
    public static final EnumC5044 f11763;

    /* JADX INFO: renamed from: ᩳܿ */
    public static final EnumC5044 f11764;

    /* JADX INFO: renamed from: ᩳᩳ */
    public static final EnumC5044 f11765;

    /* JADX INFO: renamed from: ᩳ᩻ */
    public static final EnumC5044 f11766;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC5044 f11767;

    /* JADX INFO: renamed from: ᩴۧ */
    public static final EnumC5044 f11768;

    /* JADX INFO: renamed from: ᩴܳ */
    public static final EnumC5044 f11769;

    /* JADX INFO: renamed from: ᩴܽ */
    public static final EnumC5044 f11770;

    /* JADX INFO: renamed from: ᩴܿ */
    public static final EnumC5044 f11771;

    /* JADX INFO: renamed from: ᩴᩳ */
    public static final EnumC5044 f11772;

    /* JADX INFO: renamed from: ᩴ᩻ */
    public static final EnumC5044 f11773;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final EnumC5044 f11774;

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final EnumC5044 f11775;

    /* JADX INFO: renamed from: ᩵ܳ */
    public static final EnumC5044 f11776;

    /* JADX INFO: renamed from: ᩵ܽ */
    public static final EnumC5044 f11777;

    /* JADX INFO: renamed from: ᩵ܿ */
    public static final EnumC5044 f11778;

    /* JADX INFO: renamed from: ᩵ᩳ */
    public static final EnumC5044 f11779;

    /* JADX INFO: renamed from: ᩵᩻ */
    public static final EnumC5044[] f11780;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final EnumC5044 f11781;

    /* JADX INFO: renamed from: ᩶ۧ */
    public static final EnumC5044 f11782;

    /* JADX INFO: renamed from: ᩶ܳ */
    public static final EnumC5044 f11783;

    /* JADX INFO: renamed from: ᩶ܽ */
    public static final EnumC5044 f11784;

    /* JADX INFO: renamed from: ᩶ܿ */
    public static final EnumC5044 f11785;

    /* JADX INFO: renamed from: ᩶ᩳ */
    public static final EnumC5044 f11786;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC5044 f11787;

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final EnumC5044 f11788;

    /* JADX INFO: renamed from: ᩷ܳ */
    public static final EnumC5044 f11789;

    /* JADX INFO: renamed from: ᩷ܽ */
    public static final EnumC5044 f11790;

    /* JADX INFO: renamed from: ᩷ܿ */
    public static final EnumC5044 f11791;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public static final EnumC5044 f11792;

    /* JADX INFO: renamed from: ᩷᩻ */
    public static final EnumC5044 f11793;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final EnumC5044 f11794;

    /* JADX INFO: renamed from: ᩸ۧ */
    public static final EnumC5044 f11795;

    /* JADX INFO: renamed from: ᩸ܳ */
    public static final EnumC5044 f11796;

    /* JADX INFO: renamed from: ᩸ܽ */
    public static final EnumC5044 f11797;

    /* JADX INFO: renamed from: ᩸ܿ */
    public static final EnumC5044 f11798;

    /* JADX INFO: renamed from: ᩸ᩳ */
    public static final EnumC5044 f11799;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final EnumC5044 f11800;

    /* JADX INFO: renamed from: ᩹ۧ */
    public static final EnumC5044 f11801;

    /* JADX INFO: renamed from: ᩹ܳ */
    public static final EnumC5044 f11802;

    /* JADX INFO: renamed from: ᩹ܽ */
    public static final EnumC5044 f11803;

    /* JADX INFO: renamed from: ᩹ܿ */
    public static final EnumC5044 f11804;

    /* JADX INFO: renamed from: ᩹ᩳ */
    public static final EnumC5044 f11805;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC5044 f11806;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final EnumC5044 f11807;

    /* JADX INFO: renamed from: ᩺ۧ */
    public static final EnumC5044 f11808;

    /* JADX INFO: renamed from: ᩺ܳ */
    public static final EnumC5044 f11809;

    /* JADX INFO: renamed from: ᩺ܽ */
    public static final EnumC5044 f11810;

    /* JADX INFO: renamed from: ᩺ܿ */
    public static final EnumC5044 f11811;

    /* JADX INFO: renamed from: ᩺ᩳ */
    public static final EnumC5044 f11812;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC5044 f11813;

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final EnumC5044 f11814;

    /* JADX INFO: renamed from: ᩻ܳ */
    public static final EnumC5044 f11815;

    /* JADX INFO: renamed from: ᩻ܽ */
    public static final EnumC5044 f11816;

    /* JADX INFO: renamed from: ᩻ܿ */
    public static final EnumC5044 f11817;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public static final EnumC5044 f11818;

    /* JADX INFO: renamed from: ᩻᩻ */
    public static final EnumC5044 f11819;

    /* JADX INFO: renamed from: ۗ */
    public EnumC17783 f11820;

    /* JADX INFO: renamed from: ۙ */
    public EnumC11079 f11821;

    /* JADX INFO: renamed from: ۬ */
    public int f11822;

    /* JADX INFO: renamed from: ᩶ */
    public int f11823;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f11824;

    /* JADX INFO: renamed from: ᩹ */
    public String f11825;

    public static EnumC5044 valueOf(String str) {
        return (EnumC5044) Enum.valueOf(EnumC5044.class, str);
    }

    public static EnumC5044[] values() {
        return (EnumC5044[]) f11706.clone();
    }

    /* JADX INFO: renamed from: ۢ */
    public static /* synthetic */ EnumC5044[] m10758() {
        return new EnumC5044[]{f11616, f11643, f11738, f11604, f11712, f11650, f11691, f11799, f11786, f11805, f11637, f11718, f11624, f11670, f11607, f11724, f11694, f11663, f11606, f11659, f11720, f11747, f11788, f11679, f11652, f11672, f11727, f11814, f11693, f11779, f11598, f11713, f11602, f11632, f11743, f11675, f11633, f11620, f11714, f11766, f11701, f11808, f11721, f11798, f11796, f11700, f11686, f11645, f11707, f11807, f11660, f11681, f11654, f11695, f11763, f11729, f11608, f11674, f11790, f11749, f11756, f11816, f11753, f11671, f11787, f11726, f11813, f11651, f11678, f11638, f11781, f11794, f11599, f11665, f11733, f11800, f11742, f11641, f11777, f11615, f11628, f11770, f11596, f11731, f11744, f11683, f11818, f11656, f11792, f11676, f11755, f11673, f11789, f11728, f11815, f11653, f11680, f11802, f11688, f11715, f11783, f11634, f11621, f11709, f11765, f11697, f11710, f11662, f11648, f11758, f11751, f11689, f11610, f11703, f11791, f11629, f11682, f11771, f11655, f11817, f11784, f11803, f11797, f11772, f11630, f11617, f11687, f11646, f11708, f11801, f11782, f11795, f11668, f11736, f11635, f11719, f11661, f11609, f11775, f11717, f11739, f11778, f11684, f11741, f11595, f11759, f11746, f11698, f11757, f11666, f11704, f11774, f11669, f11631, f11769, f11667, f11657, f11699, f11809, f11725, f11626, f11636, f11685, f11647, f11705, f11740, f11804, f11658, f11611, f11696, f11594, f11711, f11612, f11597, f11677, f11614, f11640, f11732, f11760, f11752, f11730, f11734, f11811, f11593, f11737, f11773, f11776, f11735, f11793, f11806, f11722, f11664, f11768, f11623, f11644, f11702, f11812, f11613, f11785, f11605, f11748, f11750, f11639, f11690, f11625, f11642, f11745, f11692, f11762, f11764, f11600, f11649, f11767, f11603, f11618, f11627, f11601, f11819, f11810, f11723, f11622, f11716, f11761, f11754, f11619};
    }

    static {
        EnumC11079 enumC11079 = EnumC11079.kFmt10x;
        EnumC17783 enumC17783 = EnumC17783.kIndexNone;
        f11616 = new EnumC5044("NOP", 0, 0, "nop", enumC11079, enumC17783, 2, false);
        EnumC11079 enumC110710 = EnumC11079.kFmt12x;
        f11643 = new EnumC5044("MOVE", 1, 1, "move", enumC110710, enumC17783, 2, true);
        EnumC11079 enumC110711 = EnumC11079.kFmt22x;
        f11738 = new EnumC5044("MOVE_FROM16", 2, 2, "move/from16", enumC110711, enumC17783, 2, true);
        EnumC11079 enumC110712 = EnumC11079.kFmt32x;
        f11604 = new EnumC5044("MOVE_16", 3, 3, "move/16", enumC110712, enumC17783, 2, true);
        f11712 = new EnumC5044("MOVE_WIDE", 4, 4, "move-wide", enumC110710, enumC17783, 2, true);
        f11650 = new EnumC5044("MOVE_WIDE_FROM16", 5, 5, "move-wide/from16", enumC110711, enumC17783, 2, true);
        f11691 = new EnumC5044("MOVE_WIDE_16", 6, 6, "move-wide/16", enumC110712, enumC17783, 2, true);
        f11799 = new EnumC5044("MOVE_OBJECT", 7, 7, "move-object", enumC110710, enumC17783, 2, true);
        f11786 = new EnumC5044("MOVE_OBJECT_FROM16", 8, 8, "move-object/from16", enumC110711, enumC17783, 2, true);
        f11805 = new EnumC5044("MOVE_OBJECT_16", 9, 9, "move-object/16", enumC110712, enumC17783, 2, true);
        EnumC11079 enumC110713 = EnumC11079.kFmt11x;
        f11637 = new EnumC5044("MOVE_RESULT", 10, 10, "move-result", enumC110713, enumC17783, 2, true);
        f11718 = new EnumC5044("MOVE_RESULT_WIDE", 11, 11, "move-result-wide", enumC110713, enumC17783, 2, true);
        f11624 = new EnumC5044("MOVE_RESULT_OBJECT", 12, 12, "move-result-object", enumC110713, enumC17783, 2, true);
        f11670 = new EnumC5044("MOVE_EXCEPTION", 13, 13, "move-exception", enumC110713, enumC17783, 2, true);
        f11607 = new EnumC5044("RETURN_VOID", 14, 14, "return-void", enumC11079, enumC17783, 16, false);
        f11724 = new EnumC5044("RETURN", 15, 15, "return", enumC110713, enumC17783, 16, false);
        f11694 = new EnumC5044("RETURN_WIDE", 16, 16, "return-wide", enumC110713, enumC17783, 16, false);
        f11663 = new EnumC5044("RETURN_OBJECT", 17, 17, "return-object", enumC110713, enumC17783, 16, false);
        f11606 = new EnumC5044("CONST_4", 18, 18, "const/4", EnumC11079.kFmt11n, enumC17783, 2, true);
        EnumC11079 enumC110714 = EnumC11079.kFmt21s;
        f11659 = new EnumC5044("CONST_16", 19, 19, "const/16", enumC110714, enumC17783, 2, true);
        EnumC11079 enumC110715 = EnumC11079.kFmt31i;
        f11720 = new EnumC5044("CONST", 20, 20, "const", enumC110715, enumC17783, 2, true);
        EnumC11079 enumC110716 = EnumC11079.kFmt21h;
        f11747 = new EnumC5044("CONST_HIGH16", 21, 21, "const/high16", enumC110716, enumC17783, 2, true);
        f11788 = new EnumC5044("CONST_WIDE_16", 22, 22, "const-wide/16", enumC110714, enumC17783, 2, true);
        f11679 = new EnumC5044("CONST_WIDE_32", 23, 23, "const-wide/32", enumC110715, enumC17783, 2, true);
        f11652 = new EnumC5044("CONST_WIDE", 24, 24, "const-wide", EnumC11079.kFmt51l, enumC17783, 2, true);
        f11672 = new EnumC5044("CONST_WIDE_HIGH16", 25, 25, "const-wide/high16", enumC110716, enumC17783, 2, true);
        EnumC11079 enumC110717 = EnumC11079.kFmt21c;
        EnumC17783 enumC17784 = EnumC17783.kIndexStringRef;
        f11727 = new EnumC5044("CONST_STRING", 26, 26, "const-string", enumC110717, enumC17784, 10, true);
        f11814 = new EnumC5044("CONST_STRING_JUMBO", 27, 27, "const-string/jumbo", EnumC11079.kFmt31c, enumC17784, 10, true);
        EnumC17783 enumC17785 = EnumC17783.kIndexTypeRef;
        f11693 = new EnumC5044("CONST_CLASS", 28, 28, "const-class", enumC110717, enumC17785, 10, true);
        f11779 = new EnumC5044("MONITOR_ENTER", 29, 29, "monitor-enter", enumC110713, enumC17783, 10, false);
        f11598 = new EnumC5044("MONITOR_EXIT", 30, 30, "monitor-exit", enumC110713, enumC17783, 10, false);
        f11713 = new EnumC5044("CHECK_CAST", 31, 31, "check-cast", enumC110717, enumC17785, 10, true);
        EnumC11079 enumC110718 = EnumC11079.kFmt22c;
        f11602 = new EnumC5044("INSTANCE_OF", 32, 32, "instance-of", enumC110718, enumC17785, 10, true);
        f11632 = new EnumC5044("ARRAY_LENGTH", 33, 33, "array-length", enumC110710, enumC17783, 10, true);
        f11743 = new EnumC5044("NEW_INSTANCE", 34, 34, "new-instance", enumC110717, enumC17785, 10, true);
        f11675 = new EnumC5044("NEW_ARRAY", 35, 35, "new-array", enumC110718, enumC17785, 10, true);
        EnumC11079 enumC110719 = EnumC11079.kFmt35c;
        f11633 = new EnumC5044("FILLED_NEW_ARRAY", 36, 36, "filled-new-array", enumC110719, enumC17785, 10, true);
        EnumC11079 enumC110720 = EnumC11079.kFmt3rc;
        f11620 = new EnumC5044("FILLED_NEW_ARRAY_RANGE", 37, 37, "filled-new-array/range", enumC110720, enumC17785, 10, true);
        EnumC11079 enumC110721 = EnumC11079.kFmt31t;
        f11714 = new EnumC5044("FILL_ARRAY_DATA", 38, 38, "fill-array-data", enumC110721, enumC17783, 2, false);
        f11766 = new EnumC5044("THROW", 39, 39, "throw", enumC110713, enumC17783, 8, false);
        f11701 = new EnumC5044("GOTO", 40, 40, "goto", EnumC11079.kFmt10t, enumC17783, 1, false);
        f11808 = new EnumC5044("GOTO_16", 41, 41, "goto/16", EnumC11079.kFmt20t, enumC17783, 1, false);
        f11721 = new EnumC5044("GOTO_32", 42, 42, "goto/32", EnumC11079.kFmt30t, enumC17783, 1, false);
        f11798 = new EnumC5044("PACKED_SWITCH", 43, 43, "packed-switch", enumC110721, enumC17783, 6, false);
        f11796 = new EnumC5044("SPARSE_SWITCH", 44, 44, "sparse-switch", enumC110721, enumC17783, 6, false);
        EnumC11079 enumC110722 = EnumC11079.kFmt23x;
        f11700 = new EnumC5044("CMPL_FLOAT", 45, 45, "cmpl-float", enumC110722, enumC17783, 2, false);
        f11686 = new EnumC5044("CMPG_FLOAT", 46, 46, "cmpg-float", enumC110722, enumC17783, 2, false);
        f11645 = new EnumC5044("CMPL_DOUBLE", 47, 47, "cmpl-double", enumC110722, enumC17783, 2, false);
        f11707 = new EnumC5044("CMPG_DOUBLE", 48, 48, "cmpg-double", enumC110722, enumC17783, 2, false);
        f11807 = new EnumC5044("CMP_LONG", 49, 49, "cmp-long", enumC110722, enumC17783, 2, false);
        EnumC11079 enumC110723 = EnumC11079.kFmt22t;
        f11660 = new EnumC5044("IF_EQ", 50, 50, "if-eq", enumC110723, enumC17783, 3, false);
        f11681 = new EnumC5044("IF_NE", 51, 51, "if-ne", enumC110723, enumC17783, 3, false);
        f11654 = new EnumC5044("IF_LT", 52, 52, "if-lt", enumC110723, enumC17783, 3, false);
        f11695 = new EnumC5044("IF_GE", 53, 53, "if-ge", enumC110723, enumC17783, 3, false);
        f11763 = new EnumC5044("IF_GT", 54, 54, "if-gt", enumC110723, enumC17783, 3, false);
        f11729 = new EnumC5044("IF_LE", 55, 55, "if-le", enumC110723, enumC17783, 3, false);
        EnumC11079 enumC110724 = EnumC11079.kFmt21t;
        f11608 = new EnumC5044("IF_EQZ", 56, 56, "if-eqz", enumC110724, enumC17783, 3, false);
        f11674 = new EnumC5044("IF_NEZ", 57, 57, "if-nez", enumC110724, enumC17783, 3, false);
        f11790 = new EnumC5044("IF_LTZ", 58, 58, "if-ltz", enumC110724, enumC17783, 3, false);
        f11749 = new EnumC5044("IF_GEZ", 59, 59, "if-gez", enumC110724, enumC17783, 3, false);
        f11756 = new EnumC5044("IF_GTZ", 60, 60, "if-gtz", enumC110724, enumC17783, 3, false);
        f11816 = new EnumC5044("IF_LEZ", 61, 61, "if-lez", enumC110724, enumC17783, 3, false);
        f11753 = new EnumC5044("AGET", 62, 68, "aget", enumC110722, enumC17783, 10, true);
        f11671 = new EnumC5044("AGET_WIDE", 63, 69, "aget-wide", enumC110722, enumC17783, 10, true);
        f11787 = new EnumC5044("AGET_OBJECT", 64, 70, "aget-object", enumC110722, enumC17783, 10, true);
        f11726 = new EnumC5044("AGET_BOOLEAN", 65, 71, "aget-boolean", enumC110722, enumC17783, 10, true);
        f11813 = new EnumC5044("AGET_BYTE", 66, 72, "aget-byte", enumC110722, enumC17783, 10, true);
        f11651 = new EnumC5044("AGET_CHAR", 67, 73, "aget-char", enumC110722, enumC17783, 10, true);
        f11678 = new EnumC5044("AGET_SHORT", 68, 74, "aget-short", enumC110722, enumC17783, 10, true);
        f11638 = new EnumC5044("APUT", 69, 75, "aput", enumC110722, enumC17783, 10, false);
        f11781 = new EnumC5044("APUT_WIDE", 70, 76, "aput-wide", enumC110722, enumC17783, 10, false);
        f11794 = new EnumC5044("APUT_OBJECT", 71, 77, "aput-object", enumC110722, enumC17783, 10, false);
        f11599 = new EnumC5044("APUT_BOOLEAN", 72, 78, "aput-boolean", enumC110722, enumC17783, 10, false);
        f11665 = new EnumC5044("APUT_BYTE", 73, 79, "aput-byte", enumC110722, enumC17783, 10, false);
        f11733 = new EnumC5044("APUT_CHAR", 74, 80, "aput-char", enumC110722, enumC17783, 10, false);
        f11800 = new EnumC5044("APUT_SHORT", 75, 81, "aput-short", enumC110722, enumC17783, 10, false);
        EnumC17783 enumC17786 = EnumC17783.kIndexFieldRef;
        f11742 = new EnumC5044("IGET", 76, 82, "iget", enumC110718, enumC17786, 10, true);
        f11641 = new EnumC5044("IGET_WIDE", 77, 83, "iget-wide", enumC110718, enumC17786, 10, true);
        f11777 = new EnumC5044("IGET_OBJECT", 78, 84, "iget-object", enumC110718, enumC17786, 10, true);
        f11615 = new EnumC5044("IGET_BOOLEAN", 79, 85, "iget-boolean", enumC110718, enumC17786, 10, true);
        f11628 = new EnumC5044("IGET_BYTE", 80, 86, "iget-byte", enumC110718, enumC17786, 10, true);
        f11770 = new EnumC5044("IGET_CHAR", 81, 87, "iget-char", enumC110718, enumC17786, 10, true);
        f11596 = new EnumC5044("IGET_SHORT", 82, 88, "iget-short", enumC110718, enumC17786, 10, true);
        f11731 = new EnumC5044("IPUT", 83, 89, "iput", enumC110718, enumC17786, 10, false);
        f11744 = new EnumC5044("IPUT_WIDE", 84, 90, "iput-wide", enumC110718, enumC17786, 10, false);
        f11683 = new EnumC5044("IPUT_OBJECT", 85, 91, "iput-object", enumC110718, enumC17786, 10, false);
        f11818 = new EnumC5044("IPUT_BOOLEAN", 86, 92, "iput-boolean", enumC110718, enumC17786, 10, false);
        f11656 = new EnumC5044("IPUT_BYTE", 87, 93, "iput-byte", enumC110718, enumC17786, 10, false);
        f11792 = new EnumC5044("IPUT_CHAR", 88, 94, "iput-char", enumC110718, enumC17786, 10, false);
        f11676 = new EnumC5044("IPUT_SHORT", 89, 95, "iput-short", enumC110718, enumC17786, 10, false);
        f11755 = new EnumC5044("SGET", 90, 96, "sget", enumC110717, enumC17786, 10, true);
        f11673 = new EnumC5044("SGET_WIDE", 91, 97, "sget-wide", enumC110717, enumC17786, 10, true);
        f11789 = new EnumC5044("SGET_OBJECT", 92, 98, "sget-object", enumC110717, enumC17786, 10, true);
        f11728 = new EnumC5044("SGET_BOOLEAN", 93, 99, "sget-boolean", enumC110717, enumC17786, 10, true);
        f11815 = new EnumC5044("SGET_BYTE", 94, 100, "sget-byte", enumC110717, enumC17786, 10, true);
        f11653 = new EnumC5044("SGET_CHAR", 95, 101, "sget-char", enumC110717, enumC17786, 10, true);
        f11680 = new EnumC5044("SGET_SHORT", 96, IShizukuService.Stub.TRANSACTION_attachUserService, "sget-short", enumC110717, enumC17786, 10, true);
        f11802 = new EnumC5044("SPUT", 97, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "sput", enumC110717, enumC17786, 10, false);
        f11688 = new EnumC5044("SPUT_WIDE", 98, IShizukuService.Stub.TRANSACTION_isHidden, "sput-wide", enumC110717, enumC17786, 10, false);
        f11715 = new EnumC5044("SPUT_OBJECT", 99, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "sput-object", enumC110717, enumC17786, 10, false);
        f11783 = new EnumC5044("SPUT_BOOLEAN", 100, IShizukuService.Stub.TRANSACTION_getFlagsForUid, "sput-boolean", enumC110717, enumC17786, 10, false);
        f11634 = new EnumC5044("SPUT_BYTE", 101, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "sput-byte", enumC110717, enumC17786, 10, false);
        f11621 = new EnumC5044("SPUT_CHAR", IShizukuService.Stub.TRANSACTION_attachUserService, 108, "sput-char", enumC110717, enumC17786, 10, false);
        f11709 = new EnumC5044("SPUT_SHORT", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 109, "sput-short", enumC110717, enumC17786, 10, false);
        EnumC17783 enumC17787 = EnumC17783.kIndexMethodRef;
        f11765 = new EnumC5044("INVOKE_VIRTUAL", IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_JSON_FAILED, "invoke-virtual", enumC110719, enumC17787, 42, true);
        f11697 = new EnumC5044("INVOKE_SUPER", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, UMErrorCode.E_UM_BE_CREATE_FAILED, "invoke-super", enumC110719, enumC17787, 42, true);
        f11710 = new EnumC5044("INVOKE_DIRECT", IShizukuService.Stub.TRANSACTION_getFlagsForUid, UMErrorCode.E_UM_BE_DEFLATE_FAILED, "invoke-direct", enumC110719, enumC17787, 42, true);
        f11662 = new EnumC5044("INVOKE_STATIC", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, UMErrorCode.E_UM_BE_RAW_OVERSIZE, "invoke-static", enumC110719, enumC17787, 42, true);
        f11648 = new EnumC5044("INVOKE_INTERFACE", 108, 114, "invoke-interface", enumC110719, enumC17787, 42, true);
        f11758 = new EnumC5044("INVOKE_VIRTUAL_RANGE", 109, 116, "invoke-virtual/range", enumC110720, enumC17787, 42, true);
        f11751 = new EnumC5044("INVOKE_SUPER_RANGE", UMErrorCode.E_UM_BE_JSON_FAILED, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, "invoke-super/range", enumC110720, enumC17787, 42, true);
        f11689 = new EnumC5044("INVOKE_DIRECT_RANGE", UMErrorCode.E_UM_BE_CREATE_FAILED, 118, "invoke-direct/range", enumC110720, enumC17787, 42, true);
        f11610 = new EnumC5044("INVOKE_STATIC_RANGE", UMErrorCode.E_UM_BE_DEFLATE_FAILED, 119, "invoke-static/range", enumC110720, enumC17787, 42, true);
        f11703 = new EnumC5044("INVOKE_INTERFACE_RANGE", UMErrorCode.E_UM_BE_RAW_OVERSIZE, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, "invoke-interface/range", enumC110720, enumC17787, 42, true);
        f11791 = new EnumC5044("NEG_INT", 114, 123, "neg-int", enumC110710, enumC17783, 2, true);
        f11629 = new EnumC5044("NOT_INT", 115, 124, "not-int", enumC110710, enumC17783, 2, true);
        f11682 = new EnumC5044("NEG_LONG", 116, C0254q.f1218h, "neg-long", enumC110710, enumC17783, 2, true);
        f11771 = new EnumC5044("NOT_LONG", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 126, "not-long", enumC110710, enumC17783, 2, true);
        f11655 = new EnumC5044("NEG_FLOAT", 118, 127, "neg-float", enumC110710, enumC17783, 2, true);
        f11817 = new EnumC5044("NEG_DOUBLE", 119, 128, "neg-double", enumC110710, enumC17783, 2, true);
        f11784 = new EnumC5044("INT_TO_LONG", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 129, "int-to-long", enumC110710, enumC17783, 2, true);
        f11803 = new EnumC5044("INT_TO_FLOAT", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 130, "int-to-float", enumC110710, enumC17783, 2, true);
        f11797 = new EnumC5044("INT_TO_DOUBLE", 122, 131, "int-to-double", enumC110710, enumC17783, 2, true);
        f11772 = new EnumC5044("LONG_TO_INT", 123, 132, "long-to-int", enumC110710, enumC17783, 2, true);
        f11630 = new EnumC5044("LONG_TO_FLOAT", 124, 133, "long-to-float", enumC110710, enumC17783, 2, true);
        f11617 = new EnumC5044("LONG_TO_DOUBLE", C0254q.f1218h, 134, "long-to-double", enumC110710, enumC17783, 2, true);
        f11687 = new EnumC5044("FLOAT_TO_INT", 126, 135, "float-to-int", enumC110710, enumC17783, 2, true);
        f11646 = new EnumC5044("FLOAT_TO_LONG", 127, 136, "float-to-long", enumC110710, enumC17783, 2, true);
        f11708 = new EnumC5044("FLOAT_TO_DOUBLE", 128, 137, "float-to-double", enumC110710, enumC17783, 2, true);
        f11801 = new EnumC5044("DOUBLE_TO_INT", 129, 138, "double-to-int", enumC110710, enumC17783, 2, true);
        f11782 = new EnumC5044("DOUBLE_TO_LONG", 130, 139, "double-to-long", enumC110710, enumC17783, 2, true);
        f11795 = new EnumC5044("DOUBLE_TO_FLOAT", 131, 140, "double-to-float", enumC110710, enumC17783, 2, true);
        f11668 = new EnumC5044("INT_TO_BYTE", 132, 141, "int-to-byte", enumC110710, enumC17783, 2, true);
        f11736 = new EnumC5044("INT_TO_CHAR", 133, 142, "int-to-char", enumC110710, enumC17783, 2, true);
        f11635 = new EnumC5044("INT_TO_SHORT", 134, 143, "int-to-short", enumC110710, enumC17783, 2, true);
        f11719 = new EnumC5044("ADD_INT", 135, 144, "add-int", enumC110722, enumC17783, 2, true);
        f11661 = new EnumC5044("SUB_INT", 136, 145, "sub-int", enumC110722, enumC17783, 2, true);
        f11609 = new EnumC5044("MUL_INT", 137, 146, "mul-int", enumC110722, enumC17783, 2, true);
        f11775 = new EnumC5044("DIV_INT", 138, 147, "div-int", enumC110722, enumC17783, 10, true);
        f11717 = new EnumC5044("REM_INT", 139, 148, "rem-int", enumC110722, enumC17783, 10, true);
        f11739 = new EnumC5044("AND_INT", 140, 149, "and-int", enumC110722, enumC17783, 2, true);
        f11778 = new EnumC5044("OR_INT", 141, 150, "or-int", enumC110722, enumC17783, 2, true);
        f11684 = new EnumC5044("XOR_INT", 142, 151, "xor-int", enumC110722, enumC17783, 2, true);
        f11741 = new EnumC5044("SHL_INT", 143, 152, "shl-int", enumC110722, enumC17783, 2, true);
        f11595 = new EnumC5044("SHR_INT", 144, 153, "shr-int", enumC110722, enumC17783, 2, true);
        f11759 = new EnumC5044("USHR_INT", 145, EnumC19222.f57460, "ushr-int", enumC110722, enumC17783, 2, true);
        f11746 = new EnumC5044("ADD_LONG", 146, 155, "add-long", enumC110722, enumC17783, 2, true);
        f11698 = new EnumC5044("SUB_LONG", 147, 156, "sub-long", enumC110722, enumC17783, 2, true);
        f11757 = new EnumC5044("MUL_LONG", 148, 157, "mul-long", enumC110722, enumC17783, 2, true);
        f11666 = new EnumC5044("DIV_LONG", 149, 158, "div-long", enumC110722, enumC17783, 10, true);
        f11704 = new EnumC5044("REM_LONG", 150, 159, "rem-long", enumC110722, enumC17783, 10, true);
        f11774 = new EnumC5044("AND_LONG", 151, DHParameters.DEFAULT_MINIMUM_LENGTH, "and-long", enumC110722, enumC17783, 2, true);
        f11669 = new EnumC5044("OR_LONG", 152, 161, "or-long", enumC110722, enumC17783, 2, true);
        f11631 = new EnumC5044("XOR_LONG", 153, 162, "xor-long", enumC110722, enumC17783, 2, true);
        f11769 = new EnumC5044("SHL_LONG", EnumC19222.f57460, 163, "shl-long", enumC110722, enumC17783, 2, true);
        f11667 = new EnumC5044("SHR_LONG", 155, 164, "shr-long", enumC110722, enumC17783, 2, true);
        f11657 = new EnumC5044("USHR_LONG", 156, 165, "ushr-long", enumC110722, enumC17783, 2, true);
        f11699 = new EnumC5044("ADD_FLOAT", 157, 166, "add-float", enumC110722, enumC17783, 2, true);
        f11809 = new EnumC5044("SUB_FLOAT", 158, 167, "sub-float", enumC110722, enumC17783, 2, true);
        f11725 = new EnumC5044("MUL_FLOAT", 159, 168, "mul-float", enumC110722, enumC17783, 2, true);
        f11626 = new EnumC5044("DIV_FLOAT", DHParameters.DEFAULT_MINIMUM_LENGTH, 169, "div-float", enumC110722, enumC17783, 2, true);
        f11636 = new EnumC5044("REM_FLOAT", 161, 170, "rem-float", enumC110722, enumC17783, 2, true);
        f11685 = new EnumC5044("ADD_DOUBLE", 162, 171, "add-double", enumC110722, enumC17783, 2, true);
        f11647 = new EnumC5044("SUB_DOUBLE", 163, 172, "sub-double", enumC110722, enumC17783, 2, true);
        f11705 = new EnumC5044("MUL_DOUBLE", 164, 173, "mul-double", enumC110722, enumC17783, 2, true);
        f11740 = new EnumC5044("DIV_DOUBLE", 165, 174, "div-double", enumC110722, enumC17783, 2, true);
        f11804 = new EnumC5044("REM_DOUBLE", 166, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, "rem-double", enumC110722, enumC17783, 2, true);
        f11658 = new EnumC5044("ADD_INT_2ADDR", 167, PicnicEngine.MAX_AUX_BYTES, "add-int/2addr", enumC110710, enumC17783, 2, true);
        f11611 = new EnumC5044("SUB_INT_2ADDR", 168, 177, "sub-int/2addr", enumC110710, enumC17783, 2, true);
        f11696 = new EnumC5044("MUL_INT_2ADDR", 169, 178, "mul-int/2addr", enumC110710, enumC17783, 2, true);
        f11594 = new EnumC5044("DIV_INT_2ADDR", 170, 179, "div-int/2addr", enumC110710, enumC17783, 10, true);
        f11711 = new EnumC5044("REM_INT_2ADDR", 171, 180, "rem-int/2addr", enumC110710, enumC17783, 10, true);
        f11612 = new EnumC5044("AND_INT_2ADDR", 172, 181, "and-int/2addr", enumC110710, enumC17783, 2, true);
        f11597 = new EnumC5044("OR_INT_2ADDR", 173, 182, "or-int/2addr", enumC110710, enumC17783, 2, true);
        f11677 = new EnumC5044("XOR_INT_2ADDR", 174, 183, "xor-int/2addr", enumC110710, enumC17783, 2, true);
        f11614 = new EnumC5044("SHL_INT_2ADDR", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 184, "shl-int/2addr", enumC110710, enumC17783, 2, true);
        f11640 = new EnumC5044("SHR_INT_2ADDR", PicnicEngine.MAX_AUX_BYTES, 185, "shr-int/2addr", enumC110710, enumC17783, 2, true);
        f11732 = new EnumC5044("USHR_INT_2ADDR", 177, 186, "ushr-int/2addr", enumC110710, enumC17783, 2, true);
        f11760 = new EnumC5044("ADD_LONG_2ADDR", 178, 187, "add-long/2addr", enumC110710, enumC17783, 2, true);
        f11752 = new EnumC5044("SUB_LONG_2ADDR", 179, 188, "sub-long/2addr", enumC110710, enumC17783, 2, true);
        f11730 = new EnumC5044("MUL_LONG_2ADDR", 180, 189, "mul-long/2addr", enumC110710, enumC17783, 2, true);
        f11734 = new EnumC5044("DIV_LONG_2ADDR", 181, 190, "div-long/2addr", enumC110710, enumC17783, 10, true);
        f11811 = new EnumC5044("REM_LONG_2ADDR", 182, 191, "rem-long/2addr", enumC110710, enumC17783, 10, true);
        f11593 = new EnumC5044("AND_LONG_2ADDR", 183, 192, "and-long/2addr", enumC110710, enumC17783, 2, true);
        f11737 = new EnumC5044("OR_LONG_2ADDR", 184, 193, "or-long/2addr", enumC110710, enumC17783, 2, true);
        f11773 = new EnumC5044("XOR_LONG_2ADDR", 185, 194, "xor-long/2addr", enumC110710, enumC17783, 2, true);
        f11776 = new EnumC5044("SHL_LONG_2ADDR", 186, 195, "shl-long/2addr", enumC110710, enumC17783, 2, true);
        f11735 = new EnumC5044("SHR_LONG_2ADDR", 187, 196, "shr-long/2addr", enumC110710, enumC17783, 2, true);
        f11793 = new EnumC5044("USHR_LONG_2ADDR", 188, 197, "ushr-long/2addr", enumC110710, enumC17783, 2, true);
        f11806 = new EnumC5044("ADD_FLOAT_2ADDR", 189, 198, "add-float/2addr", enumC110710, enumC17783, 2, true);
        f11722 = new EnumC5044("SUB_FLOAT_2ADDR", 190, 199, "sub-float/2addr", enumC110710, enumC17783, 2, true);
        f11664 = new EnumC5044("MUL_FLOAT_2ADDR", 191, 200, "mul-float/2addr", enumC110710, enumC17783, 2, true);
        f11768 = new EnumC5044("DIV_FLOAT_2ADDR", 192, 201, "div-float/2addr", enumC110710, enumC17783, 2, true);
        f11623 = new EnumC5044("REM_FLOAT_2ADDR", 193, 202, "rem-float/2addr", enumC110710, enumC17783, 2, true);
        f11644 = new EnumC5044("ADD_DOUBLE_2ADDR", 194, 203, "add-double/2addr", enumC110710, enumC17783, 2, true);
        f11702 = new EnumC5044("SUB_DOUBLE_2ADDR", 195, 204, "sub-double/2addr", enumC110710, enumC17783, 2, true);
        f11812 = new EnumC5044("MUL_DOUBLE_2ADDR", 196, 205, "mul-double/2addr", enumC110710, enumC17783, 2, true);
        f11613 = new EnumC5044("DIV_DOUBLE_2ADDR", 197, 206, "div-double/2addr", enumC110710, enumC17783, 2, true);
        f11785 = new EnumC5044("REM_DOUBLE_2ADDR", 198, 207, "rem-double/2addr", enumC110710, enumC17783, 2, true);
        EnumC11079 enumC110725 = EnumC11079.kFmt22s;
        f11605 = new EnumC5044("ADD_INT_LIT16", 199, 208, "add-int/lit16", enumC110725, enumC17783, 2, true);
        f11748 = new EnumC5044("RSUB_INT", 200, 209, "rsub-int", enumC110725, enumC17783, 2, true);
        f11750 = new EnumC5044("MUL_INT_LIT16", 201, 210, "mul-int/lit16", enumC110725, enumC17783, 2, true);
        f11639 = new EnumC5044("DIV_INT_LIT16", 202, Primes.SMALL_FACTOR_LIMIT, "div-int/lit16", enumC110725, enumC17783, 10, true);
        f11690 = new EnumC5044("REM_INT_LIT16", 203, 212, "rem-int/lit16", enumC110725, enumC17783, 10, true);
        f11625 = new EnumC5044("AND_INT_LIT16", 204, 213, "and-int/lit16", enumC110725, enumC17783, 2, true);
        f11642 = new EnumC5044("OR_INT_LIT16", 205, 214, "or-int/lit16", enumC110725, enumC17783, 2, true);
        f11745 = new EnumC5044("XOR_INT_LIT16", 206, 215, "xor-int/lit16", enumC110725, enumC17783, 2, true);
        EnumC11079 enumC110726 = EnumC11079.kFmt22b;
        f11692 = new EnumC5044("ADD_INT_LIT8", 207, 216, "add-int/lit8", enumC110726, enumC17783, 2, true);
        f11762 = new EnumC5044("RSUB_INT_LIT8", 208, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, "rsub-int/lit8", enumC110726, enumC17783, 2, true);
        f11764 = new EnumC5044("MUL_INT_LIT8", 209, 218, "mul-int/lit8", enumC110726, enumC17783, 2, true);
        f11600 = new EnumC5044("DIV_INT_LIT8", 210, 219, "div-int/lit8", enumC110726, enumC17783, 10, true);
        f11649 = new EnumC5044("REM_INT_LIT8", Primes.SMALL_FACTOR_LIMIT, 220, "rem-int/lit8", enumC110726, enumC17783, 10, true);
        f11767 = new EnumC5044("AND_INT_LIT8", 212, 221, "and-int/lit8", enumC110726, enumC17783, 2, true);
        f11603 = new EnumC5044("OR_INT_LIT8", 213, 222, "or-int/lit8", enumC110726, enumC17783, 2, true);
        f11618 = new EnumC5044("XOR_INT_LIT8", 214, 223, "xor-int/lit8", enumC110726, enumC17783, 2, true);
        f11627 = new EnumC5044("SHL_INT_LIT8", 215, BERTags.FLAGS, "shl-int/lit8", enumC110726, enumC17783, 2, true);
        f11601 = new EnumC5044("SHR_INT_LIT8", 216, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, "shr-int/lit8", enumC110726, enumC17783, 2, true);
        f11819 = new EnumC5044("USHR_INT_LIT8", IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 226, "ushr-int/lit8", enumC110726, enumC17783, 2, true);
        EnumC11079 enumC110727 = EnumC11079.kFmt45cc;
        EnumC17783 enumC17788 = EnumC17783.kIndexMethodAndProtoRef;
        f11810 = new EnumC5044("INVOKE_POLYMORPHIC", 218, 250, "invoke-polymorphic", enumC110727, enumC17788, 42, true);
        f11723 = new EnumC5044("INVOKE_POLYMORPHIC_RANGE", 219, 251, "invoke-polymorphic/range", EnumC11079.kFmt4rcc, enumC17788, 42, true);
        EnumC17783 enumC17789 = EnumC17783.kIndexCallSiteRef;
        f11622 = new EnumC5044("INVOKE_CUSTOM", 220, 252, "invoke-custom", enumC110719, enumC17789, 42, true);
        f11716 = new EnumC5044("INVOKE_CUSTOM_RANGE", 221, 253, "invoke-custom/range", enumC110720, enumC17789, 42, true);
        f11761 = new EnumC5044("CONST_METHOD_HANDLE", 222, Scalar25519.TARGET_LENGTH, "const-method-handle", enumC110717, EnumC17783.kIndexMethodHandleRef, 10, true);
        f11754 = new EnumC5044("CONST_METHOD_TYPE", 223, 255, "const-method-type", enumC110717, EnumC17783.kIndexProtoRef, 10, true);
        f11619 = new EnumC5044("BAD_OP", BERTags.FLAGS, -1, "bad-opcode", null, enumC17783, 0, false);
        f11706 = m10758();
        EnumC5044[] enumC5044Arr = new EnumC5044[256];
        f11780 = enumC5044Arr;
        for (EnumC5044 enumC5044 : values()) {
            int i = enumC5044.f11822;
            if (i >= 0) {
                enumC5044Arr[i] = enumC5044;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m10759() {
        return (this.f11823 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m10760() {
        return (this.f11823 & 2) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m10761() {
        return (this.f11823 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m10763() {
        return (this.f11823 & 4) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean m10762() {
        return (this.f11823 & 8) != 0;
    }

    public EnumC5044(String str, int i, int i2, String str2, EnumC11079 enumC11079, EnumC17783 enumC17783, int i3, boolean z) {
        super(str, i);
        this.f11822 = i2;
        this.f11825 = str2;
        this.f11821 = enumC11079;
        this.f11820 = enumC17783;
        this.f11823 = i3;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11825;
    }
}
