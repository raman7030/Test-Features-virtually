package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p052u0.C0226b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0708d;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.internal.C0773c;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۬ۧ' uses external variables
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
/* JADX INFO: renamed from: l.ܶۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F0 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC16818 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final EnumC16818 f49563;

    /* JADX INFO: renamed from: ֡ۧ */
    public static final EnumC16818 f49564;

    /* JADX INFO: renamed from: ֡ܳ */
    public static final EnumC16818 f49565;

    /* JADX INFO: renamed from: ֡ܽ */
    public static final EnumC16818 f49566;

    /* JADX INFO: renamed from: ֡ܿ */
    public static final EnumC16818 f49567;

    /* JADX INFO: renamed from: ֡ᩳ */
    public static final EnumC16818 f49568;

    /* JADX INFO: renamed from: ֨֫ */
    public static final EnumC16818 f49569;

    /* JADX INFO: renamed from: ֨ۧ */
    public static final EnumC16818 f49570;

    /* JADX INFO: renamed from: ֨ܳ */
    public static final EnumC16818 f49571;

    /* JADX INFO: renamed from: ֨ܽ */
    public static final EnumC16818 f49572;

    /* JADX INFO: renamed from: ֨ܿ */
    public static final EnumC16818 f49573;

    /* JADX INFO: renamed from: ֨ᩳ */
    public static final EnumC16818 f49574;

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC16818 f49575;

    /* JADX INFO: renamed from: ֫ۧ */
    public static final EnumC16818 f49576;

    /* JADX INFO: renamed from: ֫ܳ */
    public static final EnumC16818 f49577;

    /* JADX INFO: renamed from: ֫ܽ */
    public static final EnumC16818 f49578;

    /* JADX INFO: renamed from: ֫ܿ */
    public static final EnumC16818 f49579;

    /* JADX INFO: renamed from: ֫ᩳ */
    public static final EnumC16818 f49580;

    /* JADX INFO: renamed from: ֫᩻ */
    public static final EnumC16818 f49581;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final EnumC16818 f49582;

    /* JADX INFO: renamed from: ۖۧ */
    public static final EnumC16818 f49583;

    /* JADX INFO: renamed from: ۖܳ */
    public static final EnumC16818 f49584;

    /* JADX INFO: renamed from: ۖܽ */
    public static final EnumC16818 f49585;

    /* JADX INFO: renamed from: ۖܿ */
    public static final EnumC16818 f49586;

    /* JADX INFO: renamed from: ۖᩳ */
    public static final EnumC16818 f49587;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final EnumC16818 f49588;

    /* JADX INFO: renamed from: ۗۧ */
    public static final EnumC16818 f49589;

    /* JADX INFO: renamed from: ۗܳ */
    public static final EnumC16818 f49590;

    /* JADX INFO: renamed from: ۗܽ */
    public static final EnumC16818 f49591;

    /* JADX INFO: renamed from: ۗܿ */
    public static final EnumC16818 f49592;

    /* JADX INFO: renamed from: ۗᩳ */
    public static final EnumC16818 f49593;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC16818 f49594;

    /* JADX INFO: renamed from: ۘۧ */
    public static final EnumC16818 f49595;

    /* JADX INFO: renamed from: ۘܳ */
    public static final EnumC16818 f49596;

    /* JADX INFO: renamed from: ۘܽ */
    public static final EnumC16818 f49597;

    /* JADX INFO: renamed from: ۘܿ */
    public static final EnumC16818 f49598;

    /* JADX INFO: renamed from: ۘᩳ */
    public static final EnumC16818 f49599;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final EnumC16818 f49600;

    /* JADX INFO: renamed from: ۙۧ */
    public static final EnumC16818 f49601;

    /* JADX INFO: renamed from: ۙܳ */
    public static final EnumC16818 f49602;

    /* JADX INFO: renamed from: ۙܽ */
    public static final EnumC16818 f49603;

    /* JADX INFO: renamed from: ۙܿ */
    public static final EnumC16818 f49604;

    /* JADX INFO: renamed from: ۙᩳ */
    public static final EnumC16818 f49605;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final EnumC16818 f49606;

    /* JADX INFO: renamed from: ۚۧ */
    public static final EnumC16818 f49607;

    /* JADX INFO: renamed from: ۚܳ */
    public static final EnumC16818 f49608;

    /* JADX INFO: renamed from: ۚܽ */
    public static final EnumC16818 f49609;

    /* JADX INFO: renamed from: ۚܿ */
    public static final EnumC16818 f49610;

    /* JADX INFO: renamed from: ۚᩳ */
    public static final EnumC16818 f49611;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC16818 f49612;

    /* JADX INFO: renamed from: ۛ֫ */
    public static final EnumC16818 f49613;

    /* JADX INFO: renamed from: ۛۧ */
    public static final EnumC16818 f49614;

    /* JADX INFO: renamed from: ۛܳ */
    public static final EnumC16818 f49615;

    /* JADX INFO: renamed from: ۛܽ */
    public static final EnumC16818 f49616;

    /* JADX INFO: renamed from: ۛܿ */
    public static final EnumC16818 f49617;

    /* JADX INFO: renamed from: ۛᩳ */
    public static final EnumC16818 f49618;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC16818 f49619;

    /* JADX INFO: renamed from: ۜۧ */
    public static final EnumC16818 f49620;

    /* JADX INFO: renamed from: ۜܳ */
    public static final EnumC16818 f49621;

    /* JADX INFO: renamed from: ۜܽ */
    public static final EnumC16818 f49622;

    /* JADX INFO: renamed from: ۜܿ */
    public static final EnumC16818 f49623;

    /* JADX INFO: renamed from: ۜᩳ */
    public static final EnumC16818 f49624;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC16818 f49625;

    /* JADX INFO: renamed from: ۟֫ */
    public static final EnumC16818 f49626;

    /* JADX INFO: renamed from: ۟ۧ */
    public static final EnumC16818 f49627;

    /* JADX INFO: renamed from: ۟ܳ */
    public static final EnumC16818 f49628;

    /* JADX INFO: renamed from: ۟ܽ */
    public static final EnumC16818 f49629;

    /* JADX INFO: renamed from: ۟ܿ */
    public static final EnumC16818 f49630;

    /* JADX INFO: renamed from: ۟ᩳ */
    public static final EnumC16818 f49631;

    /* JADX INFO: renamed from: ۠֫ */
    public static final EnumC16818 f49632;

    /* JADX INFO: renamed from: ۠ۧ */
    public static final EnumC16818 f49633;

    /* JADX INFO: renamed from: ۠ܳ */
    public static final EnumC16818 f49634;

    /* JADX INFO: renamed from: ۠ܽ */
    public static final EnumC16818 f49635;

    /* JADX INFO: renamed from: ۠ܿ */
    public static final EnumC16818 f49636;

    /* JADX INFO: renamed from: ۠ᩳ */
    public static final EnumC16818 f49637;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC16818 f49638;

    /* JADX INFO: renamed from: ۡۧ */
    public static final EnumC16818 f49639;

    /* JADX INFO: renamed from: ۡܳ */
    public static final EnumC16818 f49640;

    /* JADX INFO: renamed from: ۡܽ */
    public static final EnumC16818 f49641;

    /* JADX INFO: renamed from: ۡܿ */
    public static final EnumC16818 f49642;

    /* JADX INFO: renamed from: ۡᩳ */
    public static final EnumC16818 f49643;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC16818 f49644;

    /* JADX INFO: renamed from: ۢۧ */
    public static final EnumC16818 f49645;

    /* JADX INFO: renamed from: ۢܳ */
    public static final EnumC16818 f49646;

    /* JADX INFO: renamed from: ۢܽ */
    public static final EnumC16818 f49647;

    /* JADX INFO: renamed from: ۢܿ */
    public static final EnumC16818 f49648;

    /* JADX INFO: renamed from: ۢᩳ */
    public static final EnumC16818 f49649;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC16818 f49650;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final EnumC16818 f49651;

    /* JADX INFO: renamed from: ۤۧ */
    public static final EnumC16818 f49652;

    /* JADX INFO: renamed from: ۤܳ */
    public static final EnumC16818 f49653;

    /* JADX INFO: renamed from: ۤܽ */
    public static final EnumC16818 f49654;

    /* JADX INFO: renamed from: ۤܿ */
    public static final EnumC16818 f49655;

    /* JADX INFO: renamed from: ۤᩳ */
    public static final EnumC16818 f49656;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC16818 f49657;

    /* JADX INFO: renamed from: ۧۧ */
    public static final EnumC16818 f49658;

    /* JADX INFO: renamed from: ۧܳ */
    public static final EnumC16818 f49659;

    /* JADX INFO: renamed from: ۧܽ */
    public static final EnumC16818 f49660;

    /* JADX INFO: renamed from: ۧܿ */
    public static final EnumC16818 f49661;

    /* JADX INFO: renamed from: ۧᩳ */
    public static final EnumC16818 f49662;

    /* JADX INFO: renamed from: ۧ᩻ */
    public static final EnumC16818 f49663;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumSet f49664;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final EnumC16818 f49665;

    /* JADX INFO: renamed from: ۨۧ */
    public static final EnumC16818 f49666;

    /* JADX INFO: renamed from: ۨܳ */
    public static final EnumC16818 f49667;

    /* JADX INFO: renamed from: ۨܽ */
    public static final EnumC16818 f49668;

    /* JADX INFO: renamed from: ۨܿ */
    public static final EnumC16818 f49669;

    /* JADX INFO: renamed from: ۨᩳ */
    public static final EnumC16818 f49670;

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ EnumC16818[] f49671;

    /* JADX INFO: renamed from: ۫֫ */
    public static final EnumC16818 f49672;

    /* JADX INFO: renamed from: ۫ۧ */
    public static final EnumC16818 f49673;

    /* JADX INFO: renamed from: ۫ܳ */
    public static final EnumC16818 f49674;

    /* JADX INFO: renamed from: ۫ܽ */
    public static final EnumC16818 f49675;

    /* JADX INFO: renamed from: ۫ܿ */
    public static final EnumC16818 f49676;

    /* JADX INFO: renamed from: ۫ᩳ */
    public static final EnumC16818 f49677;

    /* JADX INFO: renamed from: ۬֫ */
    public static final EnumC16818 f49678;

    /* JADX INFO: renamed from: ۬ۧ */
    public static final EnumC16818 f49679;

    /* JADX INFO: renamed from: ۬ܳ */
    public static final EnumC16818 f49680;

    /* JADX INFO: renamed from: ۬ܽ */
    public static final EnumC16818 f49681;

    /* JADX INFO: renamed from: ۬ܿ */
    public static final EnumC16818 f49682;

    /* JADX INFO: renamed from: ۬ᩳ */
    public static final EnumC16818 f49683;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC16818 f49684;

    /* JADX INFO: renamed from: ܰ֫ */
    public static final EnumC16818 f49685;

    /* JADX INFO: renamed from: ܰۧ */
    public static final EnumC16818 f49686;

    /* JADX INFO: renamed from: ܰܳ */
    public static final EnumC16818 f49687;

    /* JADX INFO: renamed from: ܰܽ */
    public static final EnumC16818 f49688;

    /* JADX INFO: renamed from: ܰܿ */
    public static final EnumC16818 f49689;

    /* JADX INFO: renamed from: ܰᩳ */
    public static final EnumC16818 f49690;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC16818 f49691;

    /* JADX INFO: renamed from: ܳۧ */
    public static final EnumC16818 f49692;

    /* JADX INFO: renamed from: ܳܳ */
    public static final EnumC16818 f49693;

    /* JADX INFO: renamed from: ܳܽ */
    public static final EnumC16818 f49694;

    /* JADX INFO: renamed from: ܳܿ */
    public static final EnumC16818 f49695;

    /* JADX INFO: renamed from: ܳᩳ */
    public static final EnumC16818 f49696;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final EnumC16818 f49697;

    /* JADX INFO: renamed from: ܶۧ */
    public static final EnumC16818 f49698;

    /* JADX INFO: renamed from: ܶܳ */
    public static final EnumC16818 f49699;

    /* JADX INFO: renamed from: ܶܽ */
    public static final EnumC16818 f49700;

    /* JADX INFO: renamed from: ܶܿ */
    public static final EnumC16818 f49701;

    /* JADX INFO: renamed from: ܶᩳ */
    public static final EnumC16818 f49702;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final EnumC16818 f49703;

    /* JADX INFO: renamed from: ܺۧ */
    public static final EnumC16818 f49704;

    /* JADX INFO: renamed from: ܺܳ */
    public static final EnumC16818 f49705;

    /* JADX INFO: renamed from: ܺܽ */
    public static final EnumC16818 f49706;

    /* JADX INFO: renamed from: ܺܿ */
    public static final EnumC16818 f49707;

    /* JADX INFO: renamed from: ܺᩳ */
    public static final EnumC16818 f49708;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC16818 f49709;

    /* JADX INFO: renamed from: ܽۧ */
    public static final EnumC16818 f49710;

    /* JADX INFO: renamed from: ܽܳ */
    public static final EnumC16818 f49711;

    /* JADX INFO: renamed from: ܽܽ */
    public static final EnumC16818 f49712;

    /* JADX INFO: renamed from: ܽܿ */
    public static final EnumC16818 f49713;

    /* JADX INFO: renamed from: ܽᩳ */
    public static final EnumC16818 f49714;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC16818 f49715;

    /* JADX INFO: renamed from: ܿۧ */
    public static final EnumC16818 f49716;

    /* JADX INFO: renamed from: ܿܳ */
    public static final EnumC16818 f49717;

    /* JADX INFO: renamed from: ܿܽ */
    public static final EnumC16818 f49718;

    /* JADX INFO: renamed from: ܿܿ */
    public static final EnumC16818 f49719;

    /* JADX INFO: renamed from: ܿᩳ */
    public static final EnumC16818 f49720;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC16818 f49721;

    /* JADX INFO: renamed from: ᩳۧ */
    public static final EnumC16818 f49722;

    /* JADX INFO: renamed from: ᩳܳ */
    public static final EnumC16818 f49723;

    /* JADX INFO: renamed from: ᩳܽ */
    public static final EnumC16818 f49724;

    /* JADX INFO: renamed from: ᩳܿ */
    public static final EnumC16818 f49725;

    /* JADX INFO: renamed from: ᩳᩳ */
    public static final EnumC16818 f49726;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC16818 f49727;

    /* JADX INFO: renamed from: ᩴۧ */
    public static final EnumC16818 f49728;

    /* JADX INFO: renamed from: ᩴܳ */
    public static final EnumC16818 f49729;

    /* JADX INFO: renamed from: ᩴܽ */
    public static final EnumC16818 f49730;

    /* JADX INFO: renamed from: ᩴܿ */
    public static final EnumC16818 f49731;

    /* JADX INFO: renamed from: ᩴᩳ */
    public static final EnumC16818 f49732;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final EnumC16818 f49733;

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final EnumC16818 f49734;

    /* JADX INFO: renamed from: ᩵ܳ */
    public static final EnumC16818 f49735;

    /* JADX INFO: renamed from: ᩵ܽ */
    public static final EnumC16818 f49736;

    /* JADX INFO: renamed from: ᩵ܿ */
    public static final EnumC16818 f49737;

    /* JADX INFO: renamed from: ᩵ᩳ */
    public static final EnumC16818 f49738;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final EnumC16818 f49739;

    /* JADX INFO: renamed from: ᩶ۧ */
    public static final EnumC16818 f49740;

    /* JADX INFO: renamed from: ᩶ܳ */
    public static final EnumC16818 f49741;

    /* JADX INFO: renamed from: ᩶ܽ */
    public static final EnumC16818 f49742;

    /* JADX INFO: renamed from: ᩶ܿ */
    public static final EnumC16818 f49743;

    /* JADX INFO: renamed from: ᩶ᩳ */
    public static final EnumC16818 f49744;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC16818 f49745;

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final EnumC16818 f49746;

    /* JADX INFO: renamed from: ᩷ܳ */
    public static final EnumC16818 f49747;

    /* JADX INFO: renamed from: ᩷ܽ */
    public static final EnumC16818 f49748;

    /* JADX INFO: renamed from: ᩷ܿ */
    public static final EnumC16818 f49749;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public static final EnumC16818 f49750;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final EnumC16818 f49751;

    /* JADX INFO: renamed from: ᩸ۧ */
    public static final EnumC16818 f49752;

    /* JADX INFO: renamed from: ᩸ܳ */
    public static final EnumC16818 f49753;

    /* JADX INFO: renamed from: ᩸ܽ */
    public static final EnumC16818 f49754;

    /* JADX INFO: renamed from: ᩸ܿ */
    public static final EnumC16818 f49755;

    /* JADX INFO: renamed from: ᩸ᩳ */
    public static final EnumC16818 f49756;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final EnumC16818 f49757;

    /* JADX INFO: renamed from: ᩹ۧ */
    public static final EnumC16818 f49758;

    /* JADX INFO: renamed from: ᩹ܳ */
    public static final EnumC16818 f49759;

    /* JADX INFO: renamed from: ᩹ܽ */
    public static final EnumC16818 f49760;

    /* JADX INFO: renamed from: ᩹ܿ */
    public static final EnumC16818 f49761;

    /* JADX INFO: renamed from: ᩹ᩳ */
    public static final EnumC16818 f49762;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC16818 f49763;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final EnumC16818 f49764;

    /* JADX INFO: renamed from: ᩺ۧ */
    public static final EnumC16818 f49765;

    /* JADX INFO: renamed from: ᩺ܳ */
    public static final EnumC16818 f49766;

    /* JADX INFO: renamed from: ᩺ܽ */
    public static final EnumC16818 f49767;

    /* JADX INFO: renamed from: ᩺ܿ */
    public static final EnumC16818 f49768;

    /* JADX INFO: renamed from: ᩺ᩳ */
    public static final EnumC16818 f49769;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC16818 f49770;

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final EnumC16818 f49771;

    /* JADX INFO: renamed from: ᩻ܳ */
    public static final EnumC16818 f49772;

    /* JADX INFO: renamed from: ᩻ܽ */
    public static final EnumC16818 f49773;

    /* JADX INFO: renamed from: ᩻ܿ */
    public static final EnumC16818 f49774;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public static final EnumC16818 f49775;

    /* JADX INFO: renamed from: ۗ */
    public final EnumSet f49776;

    /* JADX INFO: renamed from: ۙ */
    public final String f49777;

    /* JADX INFO: renamed from: ۬ */
    public final Integer f49778;

    /* JADX INFO: renamed from: ᩶ */
    public final String f49779;

    /* JADX INFO: renamed from: ᩸ */
    public final String f49780;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC20844 f49781;

    public static EnumC16818 valueOf(String str) {
        return (EnumC16818) Enum.valueOf(EnumC16818.class, str);
    }

    public static EnumC16818[] values() {
        return (EnumC16818[]) f49671.clone();
    }

    /* JADX INFO: renamed from: ᩴ */
    public static /* synthetic */ EnumC16818[] m38118() {
        return new EnumC16818[]{f49679, f49716, f49733, f49638, f49745, f49703, f49715, f49594, f49644, f49582, f49727, f49691, f49770, f49619, f49620, f49713, f49763, f49632, f49751, f49606, f49756, f49673, f49585, f49730, f49688, f49587, f49675, f49643, f49761, f49590, f49612, f49621, f49570, f49573, f49611, f49764, f49774, f49762, f49618, f49569, f49642, f49648, f49683, f49656, f49677, f49749, f49623, f49724, f49732, f49709, f49593, f49700, f49595, f49639, f49627, f49657, f49597, f49736, f49739, f49613, f49576, f49682, f49668, f49750, f49647, f49752, f49772, f49672, f49626, f49592, f49654, f49624, f49748, f49698, f49766, f49757, f49699, f49712, f49596, f49747, f49670, f49729, f49646, f49609, f49758, f49641, f49628, f49633, f49640, f49665, f49734, f49588, f49645, f49701, f49753, f49685, f49622, f49735, f49723, f49578, f49728, f49615, f49635, f49658, f49694, f49710, f49660, f49572, f49616, f49725, f49589, f49599, f49565, f49625, f49707, f49731, f49586, f49746, f49717, f49571, f49705, f49702, f49773, f49687, f49650, f49634, f49579, f49563, f49604, f49722, f49737, f49767, f49567, f49649, f49755, f49708, f49743, f49765, f49614, f49666, f49652, f49692, f49759, f49629, f49603, f49760, f49742, f49738, f49718, f49689, f49726, f49704, f49583, f49676, f49697, f49754, f49637, f49591, f49690, f49584, f49693, f49564, f49667, f49568, f49684, f49719, f49653, f49678, f49600, f49744, f49655, f49605, f49610, f49771, f49695, f49768, f49740, f49669, f49636, f49686, f49608, f49680, f49598, f49663, f49661, f49721, f49681, f49581, f49741, f49714, f49577, f49659, f49662, f49696, f49775, f49580, f49711, f49617, f49574, f49607, f49769, f49706, f49601, f49631, f49651, f49630, f49720, f49602, f49575, f49566, f49674};
    }

    static {
        EnumC22855 enumC22855 = EnumC22855.MISC;
        EnumC22855 enumC22856 = EnumC22855.CLASS_NAME;
        EnumC22855 enumC22857 = EnumC22855.MODULE_NAME;
        f49679 = new EnumC16818("EOF", 0, -1, "EOF", "EOF", EnumSet.of(enumC22855, enumC22856, enumC22857));
        EnumC22855 enumC22858 = EnumC22855.OPERATOR;
        f49716 = new EnumC16818("COMMA", 1, 0, "COMMA", ",", EnumSet.of(enumC22858));
        f49733 = new EnumC16818("ASSIGN", 2, 1, "ASSIGN", "=", EnumSet.of(enumC22858));
        f49638 = new EnumC16818("ASGMUL", 3, 2, "ASGMUL", "*=", EnumSet.of(enumC22858));
        f49745 = new EnumC16818("ASGDIV", 4, 3, "ASGDIV", "/=", EnumSet.of(enumC22858));
        f49703 = new EnumC16818("ASGREM", 5, 4, "ASGREM", "%=", EnumSet.of(enumC22858));
        f49715 = new EnumC16818("ASGADD", 6, 5, "ASGADD", "+=", EnumSet.of(enumC22858));
        f49594 = new EnumC16818("ASGSUB", 7, 6, "ASGSUB", "-=", EnumSet.of(enumC22858));
        f49644 = new EnumC16818("ASGLSHIFT", 8, 7, "ASGLSHIFT", "<<=", EnumSet.of(enumC22858));
        f49582 = new EnumC16818("ASGRSHIFT", 9, 8, "ASGRSHIFT", ">>=", EnumSet.of(enumC22858));
        f49727 = new EnumC16818("ASGURSHIFT", 10, 9, "ASGURSHIFT", "<<<=", EnumSet.of(enumC22858));
        f49691 = new EnumC16818("ASGBITAND", 11, 10, "ASGBITAND", "&=", EnumSet.of(enumC22858));
        f49770 = new EnumC16818("ASGBITOR", 12, 11, "ASGBITOR", "|=", EnumSet.of(enumC22858));
        f49619 = new EnumC16818("ASGBITXOR", 13, 12, "ASGBITXOR", "^=", EnumSet.of(enumC22858));
        f49620 = new EnumC16818("COND", 14, 13, "COND", "?:", EnumSet.of(enumC22858));
        f49713 = new EnumC16818("OR", 15, 14, "OR", "||", EnumSet.of(enumC22858));
        f49763 = new EnumC16818("AND", 16, 15, "AND", "&&", EnumSet.of(enumC22858));
        f49632 = new EnumC16818("BITOR", 17, 16, "BITOR", "|", EnumSet.of(enumC22858));
        f49751 = new EnumC16818("BITXOR", 18, 17, "BITXOR", "^", EnumSet.of(enumC22858));
        f49606 = new EnumC16818("BITAND", 19, 18, "BITAND", C0233a.f1084p, EnumSet.of(enumC22858));
        f49756 = new EnumC16818("NE", 20, 19, "NE", "!=", EnumSet.of(enumC22858));
        f49673 = new EnumC16818("EQ", 21, 20, "EQ", "==", EnumSet.of(enumC22858));
        f49585 = new EnumC16818("GE", 22, 21, "GE", ">=", EnumSet.of(enumC22858));
        f49730 = new EnumC16818("GT", 23, 22, "GT", ">", EnumSet.of(enumC22858));
        f49688 = new EnumC16818("LE", 24, 23, "LE", "<=", EnumSet.of(enumC22858));
        f49587 = new EnumC16818("LT", 25, 24, "LT", "<", EnumSet.of(enumC22858));
        f49675 = new EnumC16818("INSTANCEOF", 26, 25, "INSTANCEOF", "instanceof", EnumSet.of(enumC22858));
        f49643 = new EnumC16818("LSHIFT", 27, 26, "LSHIFT", "<<", EnumSet.of(enumC22858));
        f49761 = new EnumC16818("RSHIFT", 28, 27, "RSHIFT", ">>", EnumSet.of(enumC22858));
        f49590 = new EnumC16818("URSHIFT", 29, 28, "URSHIFT", "<<<", EnumSet.of(enumC22858));
        f49612 = new EnumC16818("ADD", 30, 29, "ADD", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, EnumSet.of(enumC22858));
        f49621 = new EnumC16818("SUB", 31, 30, "SUB", "-", EnumSet.of(enumC22858));
        f49570 = new EnumC16818("DIV", 32, 31, "DIV", "/", EnumSet.of(enumC22858));
        f49573 = new EnumC16818("REM", 33, 32, "REM", "%", EnumSet.of(enumC22858));
        f49611 = new EnumC16818("MUL", 34, 33, "MUL", "*", EnumSet.of(enumC22858));
        f49764 = new EnumC16818("CAST", 35, 34, "CAST", "cast", EnumSet.of(enumC22858, enumC22856, enumC22857));
        f49774 = new EnumC16818("POS", 36, 35, "POS", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, EnumSet.of(enumC22858));
        f49762 = new EnumC16818("NEG", 37, 36, "NEG", "-", EnumSet.of(enumC22858));
        f49618 = new EnumC16818("NOT", 38, 37, "NOT", "!", EnumSet.of(enumC22858));
        f49569 = new EnumC16818("BITNOT", 39, 38, "BITNOT", "~", EnumSet.of(enumC22858));
        f49642 = new EnumC16818("PREINC", 40, 39, "PREINC", "++", EnumSet.of(enumC22858));
        f49648 = new EnumC16818("PREDEC", 41, 40, "PREDEC", "--", EnumSet.of(enumC22858));
        f49683 = new EnumC16818("NEWARRAY", 42, 41, "NEWARRAY", "new", EnumSet.of(enumC22858));
        f49656 = new EnumC16818("NEWINSTANCE", 43, 42, "NEWINSTANCE", "new", EnumSet.of(enumC22858));
        f49677 = new EnumC16818("NEWFROMNAME", 44, 43, "NEWFROMNAME", "new", EnumSet.of(enumC22858));
        f49749 = new EnumC16818("POSTINC", 45, 44, "POSTINC", "++", EnumSet.of(enumC22858));
        f49623 = new EnumC16818("POSTDEC", 46, 45, "POSTDEC", "--", EnumSet.of(enumC22858));
        f49724 = new EnumC16818("FIELD", 47, 46, "FIELD", "field", EnumSet.of(enumC22858, enumC22856, enumC22857));
        f49732 = new EnumC16818("METHOD", 48, 47, "METHOD", AbstractC0213e.f995s, EnumSet.of(enumC22858, enumC22856, enumC22857));
        f49709 = new EnumC16818("ARRAYACCESS", 49, 48, "ARRAYACCESS", "[]", EnumSet.of(enumC22858));
        f49593 = new EnumC16818("NEW", 50, 49, "NEW", "new", EnumSet.of(enumC22858));
        f49700 = new EnumC16818("INC", 51, 50, "INC", "++", EnumSet.of(enumC22858));
        f49595 = new EnumC16818("DEC", 52, 51, "DEC", "--", EnumSet.of(enumC22858));
        f49639 = new EnumC16818("CONVERT", 53, 55, "CONVERT", "convert", EnumSet.of(enumC22858, enumC22856, enumC22857));
        f49627 = new EnumC16818("EXPR", 54, 56, "EXPR", "expr", EnumSet.of(enumC22858, enumC22856, enumC22857));
        f49657 = new EnumC16818("ARRAY", 55, 57, "ARRAY", "array", EnumSet.of(enumC22858, enumC22856, enumC22857));
        f49597 = new EnumC16818("GOTO", 56, 58, "GOTO", "goto", EnumSet.of(enumC22858));
        EnumC22855 enumC22859 = EnumC22855.VALUE;
        EnumC22855 enumC228510 = EnumC22855.JASM_IDENT;
        EnumSet enumSetOf = EnumSet.of(enumC22859, enumC22856, enumC22857, enumC228510);
        EnumC20844 enumC20844 = EnumC20844.VALUE;
        f49736 = new EnumC16818("IDENT", 57, 60, "IDENT", "Identifier", enumSetOf, enumC20844);
        f49739 = new EnumC16818("BOOLEANVAL", 58, 61, "BOOLEANVAL", "Boolean", EnumSet.of(enumC22859, enumC22856, enumC22857), enumC20844);
        f49613 = new EnumC16818("BYTEVAL", 59, 62, "BYTEVAL", "Byte", EnumSet.of(enumC22859, enumC22856, enumC22857));
        f49576 = new EnumC16818("CHARVAL", 60, 63, "CHARVAL", "Char", EnumSet.of(enumC22859, enumC22856, enumC22857));
        f49682 = new EnumC16818("SHORTVAL", 61, 64, "SHORTVAL", "Short", EnumSet.of(enumC22859, enumC22856, enumC22857));
        f49668 = new EnumC16818("INTVAL", 62, 65, "INTVAL", "Integer", EnumSet.of(enumC22859, enumC22856, enumC22857), enumC20844);
        f49750 = new EnumC16818("LONGVAL", 63, 66, "LONGVAL", "Long", EnumSet.of(enumC22859, enumC22856, enumC22857), enumC20844);
        f49647 = new EnumC16818("FLOATVAL", 64, 67, "FLOATVAL", "Float", EnumSet.of(enumC22859, enumC22856, enumC22857), enumC20844);
        f49752 = new EnumC16818("DOUBLEVAL", 65, 68, "DOUBLEVAL", "Double", EnumSet.of(enumC22859, enumC22856, enumC22857), enumC20844);
        f49772 = new EnumC16818("STRINGVAL", 66, 69, "STRINGVAL", "String", EnumSet.of(enumC22859, enumC22856, enumC22857), enumC20844);
        EnumC22855 enumC228511 = EnumC22855.TYPE;
        f49672 = new EnumC16818("BYTE", 67, 70, "BYTE", ClassTransform.BYTE, EnumSet.of(enumC228511));
        f49626 = new EnumC16818("CHAR", 68, 71, "CHAR", ClassTransform.CHARACTER, EnumSet.of(enumC228511));
        f49592 = new EnumC16818("SHORT", 69, 72, "SHORT", ClassTransform.SHORT, EnumSet.of(enumC228511));
        f49654 = new EnumC16818("INT", 70, 73, "INT", ClassTransform.INTEGER, EnumSet.of(enumC228511));
        f49624 = new EnumC16818("LONG", 71, 74, "LONG", ClassTransform.LONG, EnumSet.of(enumC228511));
        f49748 = new EnumC16818("FLOAT", 72, 75, "FLOAT", ClassTransform.FLOAT, EnumSet.of(enumC228511));
        f49698 = new EnumC16818("DOUBLE", 73, 76, "DOUBLE", ClassTransform.DOUBLE, EnumSet.of(enumC228511));
        f49766 = new EnumC16818("VOID", 74, 77, "VOID", ClassTransform.VOID, EnumSet.of(enumC228511));
        f49757 = new EnumC16818("BOOLEAN", 75, 78, "BOOLEAN", ClassTransform.BOOLEAN, EnumSet.of(enumC228511));
        EnumC22855 enumC228512 = EnumC22855.EXPRESSION;
        f49699 = new EnumC16818("TRUE", 76, 80, "TRUE", "true", EnumSet.of(enumC228512, enumC22856, enumC22857));
        f49712 = new EnumC16818("FALSE", 77, 81, "FALSE", "false", EnumSet.of(enumC228512, enumC22856, enumC22857));
        f49596 = new EnumC16818("THIS", 78, 82, "THIS", "this", EnumSet.of(enumC228512));
        EnumC22855 enumC228513 = EnumC22855.MODIFIER;
        EnumSet enumSetOf2 = EnumSet.of(enumC228513);
        EnumC20844 enumC20845 = EnumC20844.KEYWORD;
        f49747 = new EnumC16818("SUPER", 79, 83, "SUPER", "super", enumSetOf2, enumC20845);
        f49670 = new EnumC16818("NULL", 80, 84, "NULL", "null", EnumSet.of(enumC228512, enumC22856, enumC22857));
        EnumC22855 enumC228514 = EnumC22855.DECLARATION;
        f49729 = new EnumC16818("THIS_CLASS", 81, 85, "this_class", "this_class", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49646 = new EnumC16818("SUPER_CLASS", 82, 86, "super_class", "super_class", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        EnumC22855 enumC228515 = EnumC22855.STATEMENT;
        f49609 = new EnumC16818("IF", 83, 90, "IF", "if", EnumSet.of(enumC228515));
        f49758 = new EnumC16818("ELSE", 84, 91, "ELSE", "else", EnumSet.of(enumC228515));
        f49641 = new EnumC16818("FOR", 85, 92, "FOR", "for", EnumSet.of(enumC228515));
        f49628 = new EnumC16818("WHILE", 86, 93, "WHILE", "while", EnumSet.of(enumC228515));
        f49633 = new EnumC16818("DO", 87, 94, "DO", "do", EnumSet.of(enumC228515));
        f49640 = new EnumC16818("SWITCH", 88, 95, "SWITCH", "switch", EnumSet.of(enumC228515));
        f49665 = new EnumC16818("CASE", 89, 96, "CASE", "case", EnumSet.of(enumC228515));
        f49734 = new EnumC16818("DEFAULT", 90, 97, "DEFAULT", "default", EnumSet.of(enumC228515), enumC20845);
        f49588 = new EnumC16818("BREAK", 91, 98, "BREAK", "break", EnumSet.of(enumC228515));
        f49645 = new EnumC16818("CONTINUE", 92, 99, "CONTINUE", "continue", EnumSet.of(enumC228515));
        f49701 = new EnumC16818("RETURN", 93, 100, "RETURN", "return", EnumSet.of(enumC228515));
        f49753 = new EnumC16818("TRY", 94, 101, "TRY", "try", EnumSet.of(enumC228515));
        f49685 = new EnumC16818("CATCH", 95, Integer.valueOf(IShizukuService.Stub.TRANSACTION_attachUserService), "CATCH", "catch", EnumSet.of(enumC228515));
        f49622 = new EnumC16818("FINALLY", 96, Integer.valueOf(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged), "FINALLY", "finally", EnumSet.of(enumC228515));
        f49735 = new EnumC16818("THROW", 97, Integer.valueOf(IShizukuService.Stub.TRANSACTION_isHidden), "THROW", "throw", EnumSet.of(enumC228515));
        f49723 = new EnumC16818("STAT", 98, Integer.valueOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult), "STAT", C0773c.f3251h, EnumSet.of(enumC228515, enumC22856, enumC22857));
        f49578 = new EnumC16818("EXPRESSION", 99, Integer.valueOf(IShizukuService.Stub.TRANSACTION_getFlagsForUid), "EXPRESSION", "expression", EnumSet.of(enumC228515, enumC22856, enumC22857));
        f49728 = new EnumC16818("DECLARATION", 100, Integer.valueOf(IShizukuService.Stub.TRANSACTION_updateFlagsForUid), "DECLARATION", "declaration", EnumSet.of(enumC228515, enumC22856, enumC22857));
        f49615 = new EnumC16818("VARDECLARATION", 101, 108, "VARDECLARATION", "vdeclaration", EnumSet.of(enumC228515, enumC22856, enumC22857));
        f49635 = new EnumC16818("IMPORT", IShizukuService.Stub.TRANSACTION_attachUserService, Integer.valueOf(UMErrorCode.E_UM_BE_JSON_FAILED), "IMPORT", "import", EnumSet.of(enumC228514, enumC22856, enumC22857));
        f49658 = new EnumC16818("CLASS", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, Integer.valueOf(UMErrorCode.E_UM_BE_CREATE_FAILED), "CLASS", Name.LABEL, EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49694 = new EnumC16818("FILE", IShizukuService.Stub.TRANSACTION_isHidden, 52, "FILE", "file", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49710 = new EnumC16818("CLASS_FILE", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 53, "CLASSFILE", "classfile", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49660 = new EnumC16818("EXTENDS", IShizukuService.Stub.TRANSACTION_getFlagsForUid, Integer.valueOf(UMErrorCode.E_UM_BE_DEFLATE_FAILED), "EXTENDS", "extends", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49572 = new EnumC16818("IMPLEMENTS", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, Integer.valueOf(UMErrorCode.E_UM_BE_RAW_OVERSIZE), "IMPLEMENTS", "implements", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49616 = new EnumC16818("INTERFACE", 108, 114, "INTERFACE", "interface", EnumSet.of(enumC228514, enumC22856, enumC22857), enumC20845);
        f49725 = new EnumC16818("PACKAGE", 109, 115, "PACKAGE", "package", EnumSet.of(enumC228514), enumC20845);
        f49589 = new EnumC16818("ENUM", UMErrorCode.E_UM_BE_JSON_FAILED, 116, "ENUM", "enum", EnumSet.of(enumC228514), enumC20845);
        f49599 = new EnumC16818("MANDATED", UMErrorCode.E_UM_BE_CREATE_FAILED, Integer.valueOf(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION), "MANDATED", "mandated", EnumSet.of(enumC228514, enumC22856), enumC20845);
        f49565 = new EnumC16818("THROWS", UMErrorCode.E_UM_BE_DEFLATE_FAILED, 118, "THROWS", "throws", EnumSet.of(enumC228514), enumC20845);
        f49625 = new EnumC16818("ANNOTATION_ACCESS", UMErrorCode.E_UM_BE_RAW_OVERSIZE, 119, "ANNOTATION_ACCESS", "annotation", EnumSet.of(enumC228513, enumC22856, enumC22857), enumC20845);
        f49707 = new EnumC16818("PRIVATE", 114, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS), "PRIVATE", "private", EnumSet.of(enumC228513), enumC20845);
        f49731 = new EnumC16818("PUBLIC", 115, Integer.valueOf(UMErrorCode.E_UM_BE_EMPTY_URL_PATH), "PUBLIC", "public", EnumSet.of(enumC228513), enumC20845);
        f49586 = new EnumC16818("PROTECTED", 116, 122, "PROTECTED", "protected", EnumSet.of(enumC228513), enumC20845);
        f49746 = new EnumC16818("CONST", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 123, "CONST", "const", EnumSet.of(enumC228514), enumC20845);
        f49717 = new EnumC16818("STATIC", 118, 124, "STATIC", "static", EnumSet.of(enumC228513), enumC20845);
        f49571 = new EnumC16818("TRANSIENT", 119, Integer.valueOf(C0254q.f1218h), "TRANSIENT", "transient", EnumSet.of(enumC228513, enumC22856, enumC22857), enumC20845);
        f49705 = new EnumC16818("SYNCHRONIZED", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 126, "SYNCHRONIZED", MessageHandler.Properties.IsSynchronized, EnumSet.of(enumC228513), enumC20845);
        f49702 = new EnumC16818("NATIVE", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 127, "NATIVE", UMConfigure.WRAPER_TYPE_NATIVE, EnumSet.of(enumC228513), enumC20845);
        f49773 = new EnumC16818("FINAL", 122, 128, "FINAL", "final", EnumSet.of(enumC228513), enumC20845);
        f49687 = new EnumC16818("VOLATILE", 123, 129, "VOLATILE", "volatile", EnumSet.of(enumC228513), enumC20845);
        f49650 = new EnumC16818("ABSTRACT", 124, 130, "ABSTRACT", "abstract", EnumSet.of(enumC228513), enumC20845);
        f49634 = new EnumC16818("TRANSITIVE", C0254q.f1218h, 131, "TRANSITIVE", "transitive", EnumSet.of(enumC228513, enumC22856), enumC20845);
        f49579 = new EnumC16818("OPEN", 126, 132, "OPEN", "open", EnumSet.of(enumC228513, enumC22856), enumC20845);
        EnumC22855 enumC228516 = EnumC22855.PUNCTUATION;
        f49563 = new EnumC16818("AT_SIGN", 127, 133, "AT", "@", EnumSet.of(enumC228516), enumC20844);
        f49604 = new EnumC16818("SEMICOLON", 128, 134, "SEMICOLON", C0249l.f1196b, EnumSet.of(enumC228516), enumC20844);
        f49722 = new EnumC16818("COLON", 129, 135, "COLON", ":", EnumSet.of(enumC228516), enumC20844);
        f49737 = new EnumC16818("QUESTIONMARK", 130, 136, "QUESTIONMARK", "?", EnumSet.of(enumC228516));
        f49767 = new EnumC16818("LBRACE", 131, 137, "LBRACE", "{", EnumSet.of(enumC228516), enumC20844);
        f49567 = new EnumC16818("RBRACE", 132, 138, "RBRACE", C0249l.f1198d, EnumSet.of(enumC228516), enumC20844);
        f49649 = new EnumC16818("LPAREN", 133, 139, "LPAREN", MotionUtils.EASING_TYPE_FORMAT_START, EnumSet.of(enumC228516));
        f49755 = new EnumC16818("RPAREN", 134, 140, "RPAREN", MotionUtils.EASING_TYPE_FORMAT_END, EnumSet.of(enumC228516));
        f49708 = new EnumC16818("LSQBRACKET", 135, 141, "LSQBRACKET", "[", EnumSet.of(enumC228516));
        f49743 = new EnumC16818("RSQBRACKET", 136, 142, "RSQBRACKET", "]", EnumSet.of(enumC228516));
        f49765 = new EnumC16818("ESCAPED_COLON", 137, 201, "ESCCOLON", "\\:", EnumSet.of(enumC228516));
        f49614 = new EnumC16818("ESCAPED_ATSIGH", 138, 202, "ESCATSIGH", "\\@", EnumSet.of(enumC228516));
        f49666 = new EnumC16818("ESCAPED_BACKSLASH", 139, 203, "ESCBACKSLASH", "\\\\", EnumSet.of(enumC228516));
        f49652 = new EnumC16818("ERROR", 140, 145, "ERROR", C0708d.f2599O, EnumSet.of(enumC228513, enumC22856, enumC22857));
        f49692 = new EnumC16818("COMMENT", 141, 146, "COMMENT", "comment", EnumSet.of(enumC228513, enumC22856, enumC22857));
        f49759 = new EnumC16818("TYPE", 142, 147, "TYPE", "type", EnumSet.of(enumC228513, enumC22856, enumC22857));
        f49629 = new EnumC16818("LENGTH", 143, 148, "LENGTH", "Length", Name.LENGTH, EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49603 = new EnumC16818("INLINERETURN", 144, 149, "INLINERETURN", "inline-return", EnumSet.of(enumC228513));
        f49760 = new EnumC16818("INLINEMETHOD", 145, 150, "INLINEMETHOD", "inline-method", EnumSet.of(enumC228513));
        f49742 = new EnumC16818("INLINENEWINSTANCE", 146, 151, "INLINENEWINSTANCE", "inline-new", EnumSet.of(enumC228513));
        f49738 = new EnumC16818("METHODREF", 147, 152, "METHODREF", "Method", "Methodref", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49718 = new EnumC16818("FIELDREF", 148, 153, "FIELD", "Field", "Fieldref", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49689 = new EnumC16818("STACK", 149, Integer.valueOf(EnumC19222.f57460), "STACK", "stack", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49726 = new EnumC16818("LOCAL", 150, 155, "LOCAL", "locals", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49704 = new EnumC16818("CPINDEX", 151, 156, "CPINDEX", "CPINDEX", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857));
        f49583 = new EnumC16818("CPNAME", 152, 157, "CPNAME", "CPName", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857));
        f49676 = new EnumC16818("SIGN", 153, 158, "SIGN", "SIGN", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857));
        f49697 = new EnumC16818("BITS", EnumC19222.f57460, 159, "BITS", "bits", EnumSet.of(enumC22855, enumC228510, enumC22856, enumC22857), enumC20845);
        f49754 = new EnumC16818("INF", 155, Integer.valueOf(DHParameters.DEFAULT_MINIMUM_LENGTH), "INF", "Inf", "Infinity", EnumSet.of(enumC22855, enumC22856, enumC22857), enumC20845);
        f49637 = new EnumC16818("NAN", 156, 161, "NAN", "NaN", EnumSet.of(enumC22855, enumC228510, enumC22856, enumC22857), enumC20845);
        f49591 = new EnumC16818("INNERCLASS", 157, 162, "INNERCLASS", "InnerClass", "InnerClasses", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49690 = new EnumC16818("OF", 158, 163, "OF", "of", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49584 = new EnumC16818("SYNTHETIC", 159, 164, "SYNTHETIC", "synthetic", EnumSet.of(enumC228513, enumC228510, enumC22856), enumC20845);
        f49693 = new EnumC16818("STRICT", DHParameters.DEFAULT_MINIMUM_LENGTH, 165, "STRICT", "strict", EnumSet.of(enumC228513, enumC228510, enumC22856, enumC22857), enumC20845);
        f49564 = new EnumC16818("DEPRECATED", 161, 166, "DEPRECATED", "deprecated", EnumSet.of(enumC228513, enumC228510, enumC22856), enumC20845);
        f49667 = new EnumC16818("VERSION", 162, 167, "VERSION", "version", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49568 = new EnumC16818("MODULE", 163, 168, "MODULE", C0655am.f2344e, EnumSet.of(enumC228514, enumC22856), enumC20845);
        f49684 = new EnumC16818("ANNOTATION", 164, 169, "ANNOTATION", "@", EnumSet.of(enumC22855));
        f49719 = new EnumC16818("PARAM_NAME", 165, 170, "PARAM_NAME", "#", EnumSet.of(enumC22855));
        f49653 = new EnumC16818("VARARGS", 166, 171, "VARARGS", "varargs", EnumSet.of(enumC228513, enumC22856, enumC22857), enumC20845);
        f49678 = new EnumC16818("BRIDGE", 167, 172, "BRIDGE", "bridge", EnumSet.of(enumC228513, enumC22856, enumC22857), enumC20845);
        f49600 = new EnumC16818("BOOTSTRAPMETHOD", 168, 173, "BOOTSTRAPMETHOD", "BootstrapMethod", "BootstrapMethods", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49744 = new EnumC16818("NESTHOST", 169, 174, "NESTHOST", "NestHost", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49655 = new EnumC16818("SIGNATURE", 170, Integer.valueOf(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS), "SIGNATURE", "Signature", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49605 = new EnumC16818("NESTMEMBERS", 171, Integer.valueOf(PicnicEngine.MAX_AUX_BYTES), "NESTMEMBERS", "NestMembers", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49610 = new EnumC16818("RECORD", 172, 177, "RECORD", "Record", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49771 = new EnumC16818("COMPONENT", 173, 178, "COMPONENT", "Component", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49695 = new EnumC16818("PERMITTEDSUBCLASSES", 174, 179, "PERMITTEDSUBCLASSES", "PermittedSubclasses", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49768 = new EnumC16818("SOURCEFILE", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 180, "SOURCEFILE", "SourceFile", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49740 = new EnumC16818("ENCLOSINGMETHOD", PicnicEngine.MAX_AUX_BYTES, 181, "ENCLOSINGMETHOD", "EnclosingMethod", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49669 = new EnumC16818("SOURCEDEBUGEXTENSION", 177, 182, "SOURCEDEBUGEXTENSION", "SourceDebugExtension", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49636 = new EnumC16818("REQUIRES", 178, 183, "REQUIRES", "requires", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49686 = new EnumC16818("EXPORTS", 179, 184, "EXPORTS", "exports", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49608 = new EnumC16818("TO", 180, 185, "TO", "to", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49680 = new EnumC16818("USES", 181, 186, "USES", "uses", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49598 = new EnumC16818("PROVIDES", 182, 187, "PROVIDES", "provides", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49663 = new EnumC16818("WITH", 183, 188, "WITH", "with", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        f49661 = new EnumC16818("OPENS", 184, 189, "OPENS", "opens", EnumSet.of(enumC228514, enumC228510, enumC22856), enumC20845);
        EnumC12517 enumC12517 = EnumC12517.ARRAY;
        String strM28847 = enumC12517.m28847();
        String strM28848 = enumC12517.m28847();
        EnumC22855 enumC228517 = EnumC22855.TYPE_PATH_KIND;
        f49721 = new EnumC16818("ARRAY_TYPEPATH", 185, 190, strM28847, strM28848, EnumSet.of(enumC228517, enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        EnumC12517 enumC12518 = EnumC12517.INNER_TYPE;
        f49681 = new EnumC16818("INNER_TYPE_TYPEPATH", 186, 191, enumC12518.m28847(), enumC12518.m28847(), EnumSet.of(enumC228517, enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        EnumC12517 enumC12519 = EnumC12517.WILDCARD;
        f49581 = new EnumC16818("WILDCARD_TYPEPATH", 187, 192, enumC12519.m28847(), enumC12519.m28847(), EnumSet.of(enumC228517, enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        EnumC12517 enumC125110 = EnumC12517.TYPE_ARGUMENT;
        f49741 = new EnumC16818("TYPE_ARGUMENT_TYPEPATH", 188, 193, enumC125110.m28847(), enumC125110.m28847(), EnumSet.of(enumC228517, enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49714 = new EnumC16818("LOADABLEDESCRIPTORS", 189, 203, "LOADABLEDESCRIPTORS", "LoadableDescriptors", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49577 = new EnumC16818("STACKMAPTABLE_HEADER", 190, 208, "STACKMAPTABLE", "StackMapTable", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49659 = new EnumC16818("STACKMAP_HEADER", 191, 209, "STACKMAP", "StackMap", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49662 = new EnumC16818("LINETABLE_HEADER", 192, 210, "LINETABLE", "LineTable", "LineNumberTable", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49696 = new EnumC16818("LOCALVARIABLES_HEADER", 193, Integer.valueOf(Primes.SMALL_FACTOR_LIMIT), "LOCALVARIABLES", "LocalVariables", "LocalVariableTable", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49775 = new EnumC16818("LOCALVARIABLETYPES_HEADER", 194, 212, "LOCALVARIABLETYPES", "LocalVariableTypes", "LocalVariableTypeTable", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49580 = new EnumC16818("LINE", 195, 214, "LINE", "line", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49711 = new EnumC16818("START", 196, 215, "START", "Start", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49617 = new EnumC16818("SLOT", 197, 216, "SLOT", "Slot", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49574 = new EnumC16818("NAME", 198, Integer.valueOf(IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION), "NAME", "Name", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49607 = new EnumC16818("DESCRIPTOR", 199, 218, "DESCRIPTOR", "Descriptor", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49769 = new EnumC16818("NUMBEROFENTRIES", 200, 219, "NUMBEROFENTRIES", "number_of_entries", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49706 = new EnumC16818("FRAMETYPE", 201, 220, "FRAMETYPE", "frame_type", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49601 = new EnumC16818("ENTRYTYPE", 202, 221, "ENTRYTYPE", "entry_type", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49631 = new EnumC16818("OFFSETDELTA", 203, 222, "OFFSETDELTA", "offset_delta", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49651 = new EnumC16818("BYTECODEOFFSET", 204, 223, "BYTECODEOFFSET", "offset", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49630 = new EnumC16818("STACKMAP", 205, Integer.valueOf(BERTags.FLAGS), "STACKMAP", "stack_map", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49720 = new EnumC16818("LOCALSMAP", 206, Integer.valueOf(HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS), "LOCALSMAP", "locals_map", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49602 = new EnumC16818("UNSETFIELDS", 207, 226, "UNSETFIELDS", "unset_fields", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49575 = new EnumC16818("ARGUMENTS", 208, 227, "ARGUMENTS", "Arguments", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49566 = new EnumC16818("IDENTITY", 209, 228, "IDENTITY", "identity", EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49674 = new EnumC16818("VALUE", 210, 229, "VALUE", C0226b.f1011d, EnumSet.of(enumC228514, enumC228510, enumC22856, enumC22857), enumC20845);
        f49671 = m38118();
        f49664 = EnumSet.allOf(EnumC16818.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18189 m38108(final String str, final EnumC20844 enumC20844) {
        return C7480.stream(f49664).filter(new Predicate() { // from class: l.֨ۨۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m6037or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC16818.m38116(enumC20844, (EnumC16818) obj);
            }
        }).filter(new Predicate() { // from class: l.۠ۨۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m23589or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC16818.m38113(str, (EnumC16818) obj);
            }
        }).findFirst();
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ boolean m38116(EnumC20844 enumC20844, EnumC16818 enumC16818) {
        return enumC16818.f49781 == enumC20844;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m38113(String str, EnumC16818 enumC16818) {
        if (enumC16818.f49779.equals(str)) {
            return true;
        }
        String str2 = enumC16818.f49780;
        return str2 != null && str2.equals(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Set m38112(final EnumC22855 enumC22855) {
        return (Set) C7480.stream(f49664).filter(new Predicate() { // from class: l.֡ۨۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m4274or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC16818.m38115(enumC22855, (EnumC16818) obj);
            }
        }).collect(C24205.toSet());
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m38115(EnumC22855 enumC22855, EnumC16818 enumC16818) {
        return enumC16818.f49776.contains(enumC22855);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Set m38107(final EnumC20844 enumC20844) {
        return (Set) C7480.stream(f49664).filter(new Predicate() { // from class: l.ۚۨۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m17171or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC16818.m38117(enumC20844, (EnumC16818) obj);
            }
        }).collect(C24205.toSet());
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ boolean m38117(EnumC20844 enumC20844, EnumC16818 enumC16818) {
        return enumC16818.f49781.equals(enumC20844);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m38121(EnumC16818... enumC16818Arr) {
        return enumC16818Arr != null && Arrays.asList(enumC16818Arr).contains(this);
    }

    public EnumC16818(String str, int i, Integer num, String str2, String str3, EnumSet enumSet) {
        this(str, i, num, str2, str3, null, enumSet, EnumC20844.TOKEN);
    }

    public EnumC16818(String str, int i, Integer num, String str2, String str3, EnumSet enumSet, EnumC20844 enumC20844) {
        this(str, i, num, str2, str3, null, enumSet, enumC20844);
    }

    public EnumC16818(String str, int i, Integer num, String str2, String str3, String str4, EnumSet enumSet, EnumC20844 enumC20844) {
        super(str, i);
        this.f49778 = num;
        this.f49777 = str2;
        this.f49779 = str3;
        this.f49776 = enumSet;
        this.f49781 = enumC20844;
        this.f49780 = str4;
    }

    /* JADX INFO: renamed from: ۡ */
    public String m38122() {
        return this.f49777;
    }

    /* JADX INFO: renamed from: ᩷ */
    public String m38127() {
        return this.f49779;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m38119() {
        return this.f49780;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m38120(EnumC22855 enumC22855) {
        return this.f49776.contains(enumC22855);
    }

    /* JADX INFO: renamed from: ܺ */
    public int m38125() {
        return this.f49778.intValue();
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean m38126() {
        return this.f49776.contains(EnumC22855.JASM_IDENT);
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean m38128() {
        return this.f49776.contains(EnumC22855.MODULE_NAME);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m38124() {
        return this.f49776.contains(EnumC22855.CLASS_NAME);
    }

    /* JADX INFO: renamed from: ۢ */
    public boolean m38123() {
        return this.f49776.contains(EnumC22855.TYPE_PATH_KIND);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "<" + this.f49777 + "> [" + this.f49778 + "]";
    }
}
