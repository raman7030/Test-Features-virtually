package p067l;

import android.util.SparseArray;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۗܿ' uses external variables
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
/* JADX INFO: renamed from: l.᩻᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5XO */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC25097 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final EnumC25097 f80079;

    /* JADX INFO: renamed from: ֡ۧ */
    public static final EnumC25097 f80080;

    /* JADX INFO: renamed from: ֡ܳ */
    public static final EnumC25097 f80081;

    /* JADX INFO: renamed from: ֡ܽ */
    public static final EnumC25097 f80082;

    /* JADX INFO: renamed from: ֡ܿ */
    public static final EnumC25097 f80083;

    /* JADX INFO: renamed from: ֡ᩳ */
    public static final EnumC25097 f80084;

    /* JADX INFO: renamed from: ֡᩻ */
    public static final EnumC25097 f80085;

    /* JADX INFO: renamed from: ֨֫ */
    public static final EnumC25097 f80086;

    /* JADX INFO: renamed from: ֨ۧ */
    public static final EnumC25097 f80087;

    /* JADX INFO: renamed from: ֨ܳ */
    public static final EnumC25097 f80088;

    /* JADX INFO: renamed from: ֨ܽ */
    public static final EnumC25097 f80089;

    /* JADX INFO: renamed from: ֨ܿ */
    public static final EnumC25097 f80090;

    /* JADX INFO: renamed from: ֨ᩳ */
    public static final EnumC25097 f80091;

    /* JADX INFO: renamed from: ֨᩻ */
    public static final EnumC25097 f80092;

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC25097 f80093;

    /* JADX INFO: renamed from: ֫ۜ */
    public static final EnumC25097 f80094;

    /* JADX INFO: renamed from: ֫ۧ */
    public static final EnumC25097 f80095;

    /* JADX INFO: renamed from: ֫ܳ */
    public static final EnumC25097 f80096;

    /* JADX INFO: renamed from: ֫ܽ */
    public static final EnumC25097 f80097;

    /* JADX INFO: renamed from: ֫ܿ */
    public static final EnumC25097 f80098;

    /* JADX INFO: renamed from: ֫ᩳ */
    public static final EnumC25097 f80099;

    /* JADX INFO: renamed from: ֫᩻ */
    public static final EnumC25097 f80100;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final EnumC25097 f80101;

    /* JADX INFO: renamed from: ۖۧ */
    public static final EnumC25097 f80102;

    /* JADX INFO: renamed from: ۖܳ */
    public static final EnumC25097 f80103;

    /* JADX INFO: renamed from: ۖܽ */
    public static final EnumC25097 f80104;

    /* JADX INFO: renamed from: ۖܿ */
    public static final EnumC25097 f80105;

    /* JADX INFO: renamed from: ۖᩳ */
    public static final EnumC25097 f80106;

    /* JADX INFO: renamed from: ۖ᩻ */
    public static final EnumC25097 f80107;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final int f80108 = 1;

    /* JADX INFO: renamed from: ۗۧ */
    public static final EnumC25097 f80109;

    /* JADX INFO: renamed from: ۗܳ */
    public static final EnumC25097 f80110;

    /* JADX INFO: renamed from: ۗܽ */
    public static final EnumC25097 f80111;

    /* JADX INFO: renamed from: ۗܿ */
    public static final EnumC25097 f80112;

    /* JADX INFO: renamed from: ۗᩳ */
    public static final EnumC25097 f80113;

    /* JADX INFO: renamed from: ۗ᩻ */
    public static final EnumC25097 f80114;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC25097 f80115;

    /* JADX INFO: renamed from: ۘۧ */
    public static final EnumC25097 f80116;

    /* JADX INFO: renamed from: ۘܳ */
    public static final EnumC25097 f80117;

    /* JADX INFO: renamed from: ۘܽ */
    public static final EnumC25097 f80118;

    /* JADX INFO: renamed from: ۘܿ */
    public static final EnumC25097 f80119;

    /* JADX INFO: renamed from: ۘᩳ */
    public static final EnumC25097 f80120;

    /* JADX INFO: renamed from: ۘ᩻ */
    public static final EnumC25097 f80121;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final int f80122 = 4;

    /* JADX INFO: renamed from: ۙۧ */
    public static final EnumC25097 f80123;

    /* JADX INFO: renamed from: ۙܳ */
    public static final EnumC25097 f80124;

    /* JADX INFO: renamed from: ۙܽ */
    public static final EnumC25097 f80125;

    /* JADX INFO: renamed from: ۙܿ */
    public static final EnumC25097 f80126;

    /* JADX INFO: renamed from: ۙᩳ */
    public static final EnumC25097 f80127;

    /* JADX INFO: renamed from: ۙ᩻ */
    public static final EnumC25097 f80128;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final EnumC25097 f80129;

    /* JADX INFO: renamed from: ۚۧ */
    public static final EnumC25097 f80130;

    /* JADX INFO: renamed from: ۚܳ */
    public static final EnumC25097 f80131;

    /* JADX INFO: renamed from: ۚܽ */
    public static final EnumC25097 f80132;

    /* JADX INFO: renamed from: ۚܿ */
    public static final EnumC25097 f80133;

    /* JADX INFO: renamed from: ۚᩳ */
    public static final EnumC25097 f80134;

    /* JADX INFO: renamed from: ۚ᩻ */
    public static final EnumC25097 f80135;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC25097 f80136;

    /* JADX INFO: renamed from: ۛ֫ */
    public static final EnumC25097 f80137;

    /* JADX INFO: renamed from: ۛۧ */
    public static final EnumC25097 f80138;

    /* JADX INFO: renamed from: ۛܳ */
    public static final EnumC25097 f80139;

    /* JADX INFO: renamed from: ۛܽ */
    public static final EnumC25097 f80140;

    /* JADX INFO: renamed from: ۛܿ */
    public static final int f80141 = 128;

    /* JADX INFO: renamed from: ۛᩳ */
    public static final EnumC25097 f80142;

    /* JADX INFO: renamed from: ۛ᩻ */
    public static final EnumC25097 f80143;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC25097 f80144;

    /* JADX INFO: renamed from: ۜۜ */
    public static SparseArray f80145 = null;

    /* JADX INFO: renamed from: ۜۧ */
    public static final EnumC25097 f80146;

    /* JADX INFO: renamed from: ۜܳ */
    public static final EnumC25097 f80147;

    /* JADX INFO: renamed from: ۜܽ */
    public static final EnumC25097 f80148;

    /* JADX INFO: renamed from: ۜܿ */
    public static final EnumC25097 f80149;

    /* JADX INFO: renamed from: ۜᩳ */
    public static final EnumC25097 f80150;

    /* JADX INFO: renamed from: ۜ᩻ */
    public static final EnumC25097 f80151;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC25097 f80152;

    /* JADX INFO: renamed from: ۟֫ */
    public static final EnumC25097 f80153;

    /* JADX INFO: renamed from: ۟ۧ */
    public static final EnumC25097 f80154;

    /* JADX INFO: renamed from: ۟ܳ */
    public static final EnumC25097 f80155;

    /* JADX INFO: renamed from: ۟ܽ */
    public static final EnumC25097 f80156;

    /* JADX INFO: renamed from: ۟ܿ */
    public static final EnumC25097 f80157;

    /* JADX INFO: renamed from: ۟ᩳ */
    public static final EnumC25097 f80158;

    /* JADX INFO: renamed from: ۟᩻ */
    public static final EnumC25097 f80159;

    /* JADX INFO: renamed from: ۠֫ */
    public static final EnumC25097 f80160;

    /* JADX INFO: renamed from: ۠ۧ */
    public static final EnumC25097 f80161;

    /* JADX INFO: renamed from: ۠ܳ */
    public static final EnumC25097 f80162;

    /* JADX INFO: renamed from: ۠ܽ */
    public static final EnumC25097 f80163;

    /* JADX INFO: renamed from: ۠ܿ */
    public static final EnumC25097 f80164;

    /* JADX INFO: renamed from: ۠ᩳ */
    public static final EnumC25097 f80165;

    /* JADX INFO: renamed from: ۠᩻ */
    public static final EnumC25097 f80166;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC25097 f80167;

    /* JADX INFO: renamed from: ۡۧ */
    public static final EnumC25097 f80168;

    /* JADX INFO: renamed from: ۡܳ */
    public static final EnumC25097 f80169;

    /* JADX INFO: renamed from: ۡܽ */
    public static final EnumC25097 f80170;

    /* JADX INFO: renamed from: ۡܿ */
    public static final EnumC25097 f80171;

    /* JADX INFO: renamed from: ۡᩳ */
    public static final EnumC25097 f80172;

    /* JADX INFO: renamed from: ۡ᩻ */
    public static final EnumC25097 f80173;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC25097 f80174;

    /* JADX INFO: renamed from: ۢۧ */
    public static final EnumC25097 f80175;

    /* JADX INFO: renamed from: ۢܳ */
    public static final EnumC25097 f80176;

    /* JADX INFO: renamed from: ۢܽ */
    public static final EnumC25097 f80177;

    /* JADX INFO: renamed from: ۢܿ */
    public static final EnumC25097 f80178;

    /* JADX INFO: renamed from: ۢᩳ */
    public static final EnumC25097 f80179;

    /* JADX INFO: renamed from: ۢ᩻ */
    public static final EnumC25097 f80180;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC25097 f80181;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final EnumC25097 f80182;

    /* JADX INFO: renamed from: ۤۧ */
    public static final EnumC25097 f80183;

    /* JADX INFO: renamed from: ۤܳ */
    public static final EnumC25097 f80184;

    /* JADX INFO: renamed from: ۤܽ */
    public static final EnumC25097 f80185;

    /* JADX INFO: renamed from: ۤܿ */
    public static final int f80186 = 64;

    /* JADX INFO: renamed from: ۤᩳ */
    public static final EnumC25097 f80187;

    /* JADX INFO: renamed from: ۤ᩻ */
    public static final EnumC25097 f80188;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC25097 f80189;

    /* JADX INFO: renamed from: ۧۜ */
    public static final EnumC25097 f80190;

    /* JADX INFO: renamed from: ۧۧ */
    public static final EnumC25097 f80191;

    /* JADX INFO: renamed from: ۧܳ */
    public static final EnumC25097 f80192;

    /* JADX INFO: renamed from: ۧܽ */
    public static final EnumC25097 f80193;

    /* JADX INFO: renamed from: ۧܿ */
    public static final EnumC25097 f80194;

    /* JADX INFO: renamed from: ۧᩳ */
    public static final EnumC25097 f80195;

    /* JADX INFO: renamed from: ۧ᩻ */
    public static final EnumC25097 f80196;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC25097 f80197;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final EnumC25097 f80198;

    /* JADX INFO: renamed from: ۨۧ */
    public static final EnumC25097 f80199;

    /* JADX INFO: renamed from: ۨܳ */
    public static final EnumC25097 f80200;

    /* JADX INFO: renamed from: ۨܽ */
    public static final EnumC25097 f80201;

    /* JADX INFO: renamed from: ۨܿ */
    public static final int f80202 = 256;

    /* JADX INFO: renamed from: ۨᩳ */
    public static final EnumC25097 f80203;

    /* JADX INFO: renamed from: ۨ᩻ */
    public static final EnumC25097 f80204;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC25097 f80205;

    /* JADX INFO: renamed from: ۫֫ */
    public static final EnumC25097 f80206;

    /* JADX INFO: renamed from: ۫ۧ */
    public static final EnumC25097 f80207;

    /* JADX INFO: renamed from: ۫ܳ */
    public static final EnumC25097 f80208;

    /* JADX INFO: renamed from: ۫ܽ */
    public static final EnumC25097 f80209;

    /* JADX INFO: renamed from: ۫ܿ */
    public static final EnumC25097 f80210;

    /* JADX INFO: renamed from: ۫ᩳ */
    public static final EnumC25097 f80211;

    /* JADX INFO: renamed from: ۫᩻ */
    public static final EnumC25097 f80212;

    /* JADX INFO: renamed from: ۬ */
    public static final /* synthetic */ EnumC25097[] f80213;

    /* JADX INFO: renamed from: ۬֫ */
    public static final EnumC25097 f80214;

    /* JADX INFO: renamed from: ۬ۧ */
    public static final EnumC25097 f80215;

    /* JADX INFO: renamed from: ۬ܳ */
    public static final EnumC25097 f80216;

    /* JADX INFO: renamed from: ۬ܽ */
    public static final EnumC25097 f80217;

    /* JADX INFO: renamed from: ۬ܿ */
    public static final EnumC25097 f80218;

    /* JADX INFO: renamed from: ۬ᩳ */
    public static final EnumC25097 f80219;

    /* JADX INFO: renamed from: ۬᩻ */
    public static final EnumC25097 f80220;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC25097 f80221;

    /* JADX INFO: renamed from: ܰ֫ */
    public static final EnumC25097 f80222;

    /* JADX INFO: renamed from: ܰۧ */
    public static final EnumC25097 f80223;

    /* JADX INFO: renamed from: ܰܳ */
    public static final EnumC25097 f80224;

    /* JADX INFO: renamed from: ܰܽ */
    public static final EnumC25097 f80225;

    /* JADX INFO: renamed from: ܰܿ */
    public static final EnumC25097 f80226;

    /* JADX INFO: renamed from: ܰᩳ */
    public static final EnumC25097 f80227;

    /* JADX INFO: renamed from: ܰ᩻ */
    public static final EnumC25097 f80228;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC25097 f80229;

    /* JADX INFO: renamed from: ܳۜ */
    public static final EnumC25097 f80230;

    /* JADX INFO: renamed from: ܳۧ */
    public static final EnumC25097 f80231;

    /* JADX INFO: renamed from: ܳܳ */
    public static final EnumC25097 f80232;

    /* JADX INFO: renamed from: ܳܽ */
    public static final EnumC25097 f80233;

    /* JADX INFO: renamed from: ܳܿ */
    public static final EnumC25097 f80234;

    /* JADX INFO: renamed from: ܳᩳ */
    public static final EnumC25097 f80235;

    /* JADX INFO: renamed from: ܳ᩻ */
    public static final EnumC25097 f80236;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final EnumC25097 f80237;

    /* JADX INFO: renamed from: ܶۧ */
    public static final EnumC25097 f80238;

    /* JADX INFO: renamed from: ܶܳ */
    public static final EnumC25097 f80239;

    /* JADX INFO: renamed from: ܶܽ */
    public static final EnumC25097 f80240;

    /* JADX INFO: renamed from: ܶܿ */
    public static final EnumC25097 f80241;

    /* JADX INFO: renamed from: ܶᩳ */
    public static final EnumC25097 f80242;

    /* JADX INFO: renamed from: ܶ᩻ */
    public static final EnumC25097 f80243;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final EnumC25097 f80244;

    /* JADX INFO: renamed from: ܺۧ */
    public static final EnumC25097 f80245;

    /* JADX INFO: renamed from: ܺܳ */
    public static final EnumC25097 f80246;

    /* JADX INFO: renamed from: ܺܽ */
    public static final EnumC25097 f80247;

    /* JADX INFO: renamed from: ܺܿ */
    public static final EnumC25097 f80248;

    /* JADX INFO: renamed from: ܺᩳ */
    public static final EnumC25097 f80249;

    /* JADX INFO: renamed from: ܺ᩻ */
    public static final EnumC25097 f80250;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC25097 f80251;

    /* JADX INFO: renamed from: ܽۜ */
    public static final EnumC25097 f80252;

    /* JADX INFO: renamed from: ܽۧ */
    public static final EnumC25097 f80253;

    /* JADX INFO: renamed from: ܽܳ */
    public static final EnumC25097 f80254;

    /* JADX INFO: renamed from: ܽܽ */
    public static final EnumC25097 f80255;

    /* JADX INFO: renamed from: ܽܿ */
    public static final EnumC25097 f80256;

    /* JADX INFO: renamed from: ܽᩳ */
    public static final EnumC25097 f80257;

    /* JADX INFO: renamed from: ܽ᩻ */
    public static final EnumC25097 f80258;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC25097 f80259;

    /* JADX INFO: renamed from: ܿۜ */
    public static final EnumC25097 f80260;

    /* JADX INFO: renamed from: ܿۧ */
    public static final EnumC25097 f80261;

    /* JADX INFO: renamed from: ܿܳ */
    public static final EnumC25097 f80262;

    /* JADX INFO: renamed from: ܿܽ */
    public static final EnumC25097 f80263;

    /* JADX INFO: renamed from: ܿܿ */
    public static final EnumC25097 f80264;

    /* JADX INFO: renamed from: ܿᩳ */
    public static final EnumC25097 f80265;

    /* JADX INFO: renamed from: ܿ᩻ */
    public static final EnumC25097 f80266;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC25097 f80267;

    /* JADX INFO: renamed from: ᩳۜ */
    public static final EnumC25097 f80268;

    /* JADX INFO: renamed from: ᩳۧ */
    public static final EnumC25097 f80269;

    /* JADX INFO: renamed from: ᩳܳ */
    public static final EnumC25097 f80270;

    /* JADX INFO: renamed from: ᩳܽ */
    public static final EnumC25097 f80271;

    /* JADX INFO: renamed from: ᩳܿ */
    public static final EnumC25097 f80272;

    /* JADX INFO: renamed from: ᩳᩳ */
    public static final EnumC25097 f80273;

    /* JADX INFO: renamed from: ᩳ᩻ */
    public static final EnumC25097 f80274;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC25097 f80275;

    /* JADX INFO: renamed from: ᩴۧ */
    public static final EnumC25097 f80276;

    /* JADX INFO: renamed from: ᩴܳ */
    public static final EnumC25097 f80277;

    /* JADX INFO: renamed from: ᩴܽ */
    public static final EnumC25097 f80278;

    /* JADX INFO: renamed from: ᩴܿ */
    public static final EnumC25097 f80279;

    /* JADX INFO: renamed from: ᩴᩳ */
    public static final EnumC25097 f80280;

    /* JADX INFO: renamed from: ᩴ᩻ */
    public static final EnumC25097 f80281;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final EnumC25097 f80282;

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final EnumC25097 f80283;

    /* JADX INFO: renamed from: ᩵ܳ */
    public static final EnumC25097 f80284;

    /* JADX INFO: renamed from: ᩵ܽ */
    public static final EnumC25097 f80285;

    /* JADX INFO: renamed from: ᩵ܿ */
    public static final EnumC25097 f80286;

    /* JADX INFO: renamed from: ᩵ᩳ */
    public static final EnumC25097 f80287;

    /* JADX INFO: renamed from: ᩵᩻ */
    public static final EnumC25097 f80288;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final EnumC25097 f80289;

    /* JADX INFO: renamed from: ᩶ۧ */
    public static final EnumC25097 f80290;

    /* JADX INFO: renamed from: ᩶ܳ */
    public static final int f80291 = 32;

    /* JADX INFO: renamed from: ᩶ܽ */
    public static final EnumC25097 f80292;

    /* JADX INFO: renamed from: ᩶ܿ */
    public static final EnumC25097 f80293;

    /* JADX INFO: renamed from: ᩶ᩳ */
    public static final EnumC25097 f80294;

    /* JADX INFO: renamed from: ᩶᩻ */
    public static final EnumC25097 f80295;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC25097 f80296;

    /* JADX INFO: renamed from: ᩷ۜ */
    public static EnumC25097[] f80297 = null;

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final EnumC25097 f80298;

    /* JADX INFO: renamed from: ᩷ܳ */
    public static final EnumC25097 f80299;

    /* JADX INFO: renamed from: ᩷ܽ */
    public static final EnumC25097 f80300;

    /* JADX INFO: renamed from: ᩷ܿ */
    public static final EnumC25097 f80301;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public static final EnumC25097 f80302;

    /* JADX INFO: renamed from: ᩷᩻ */
    public static final EnumC25097 f80303;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final EnumC25097 f80304;

    /* JADX INFO: renamed from: ᩸ۧ */
    public static final EnumC25097 f80305;

    /* JADX INFO: renamed from: ᩸ܳ */
    public static final int f80306 = 16;

    /* JADX INFO: renamed from: ᩸ܽ */
    public static final EnumC25097 f80307;

    /* JADX INFO: renamed from: ᩸ܿ */
    public static final EnumC25097 f80308;

    /* JADX INFO: renamed from: ᩸ᩳ */
    public static final EnumC25097 f80309;

    /* JADX INFO: renamed from: ᩸᩻ */
    public static final EnumC25097 f80310;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final EnumC25097 f80311;

    /* JADX INFO: renamed from: ᩹ۧ */
    public static final EnumC25097 f80312;

    /* JADX INFO: renamed from: ᩹ܳ */
    public static final int f80313 = 8;

    /* JADX INFO: renamed from: ᩹ܽ */
    public static final EnumC25097 f80314;

    /* JADX INFO: renamed from: ᩹ܿ */
    public static final EnumC25097 f80315;

    /* JADX INFO: renamed from: ᩹ᩳ */
    public static final EnumC25097 f80316;

    /* JADX INFO: renamed from: ᩹᩻ */
    public static final EnumC25097 f80317;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC25097 f80318;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final EnumC25097 f80319;

    /* JADX INFO: renamed from: ᩺ۧ */
    public static final EnumC25097 f80320;

    /* JADX INFO: renamed from: ᩺ܳ */
    public static final EnumC25097 f80321;

    /* JADX INFO: renamed from: ᩺ܽ */
    public static final EnumC25097 f80322;

    /* JADX INFO: renamed from: ᩺ܿ */
    public static final int f80323 = 2;

    /* JADX INFO: renamed from: ᩺ᩳ */
    public static final EnumC25097 f80324;

    /* JADX INFO: renamed from: ᩺᩻ */
    public static final EnumC25097 f80325;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC25097 f80326;

    /* JADX INFO: renamed from: ᩻ۜ */
    public static final EnumC25097 f80327;

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final EnumC25097 f80328;

    /* JADX INFO: renamed from: ᩻ܳ */
    public static final EnumC25097 f80329;

    /* JADX INFO: renamed from: ᩻ܽ */
    public static final EnumC25097 f80330;

    /* JADX INFO: renamed from: ᩻ܿ */
    public static final EnumC25097 f80331;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public static final EnumC25097 f80332;

    /* JADX INFO: renamed from: ᩻᩻ */
    public static final EnumC25097 f80333;

    /* JADX INFO: renamed from: ۗ */
    public final byte f80334;

    /* JADX INFO: renamed from: ۙ */
    public final EnumC9004 f80335;

    /* JADX INFO: renamed from: ᩶ */
    public final String f80336;

    /* JADX INFO: renamed from: ᩸ */
    public final int f80337;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC25137 f80338;

    public static EnumC25097 valueOf(String str) {
        return (EnumC25097) Enum.valueOf(EnumC25097.class, str);
    }

    public static EnumC25097[] values() {
        return (EnumC25097[]) f80213.clone();
    }

    /* JADX INFO: renamed from: ֡ */
    public static /* synthetic */ EnumC25097[] m55080() {
        return new EnumC25097[]{f80112, f80203, f80158, f80324, f80331, f80301, f80149, f80098, f80256, f80194, f80272, f80234, f80264, f80227, f80131, f80284, f80088, f80081, f80095, f80153, f80222, f80253, f80328, f80146, f80231, f80298, f80269, f80261, f80191, f80187, f80142, f80214, f80125, f80289, f80126, f80293, f80123, f80109, f80215, f80143, f80199, f80320, f80223, f80262, f80173, f80198, f80182, f80137, f80206, f80319, f80154, f80177, f80148, f80193, f80271, f80233, f80097, f80170, f80300, f80255, f80263, f80330, f80267, f80174, f80144, f80259, f80229, f80326, f80296, f80079, f80311, f80237, f80129, f80086, f80160, f80304, f80247, f80307, f80285, f80104, f80118, f80278, f80163, f80106, f80316, f80084, f80120, f80280, f80287, f80242, f80124, f80224, f80184, f80110, f80216, f80208, f80200, f80250, f80166, f80288, f80107, f80121, f80281, f80135, f80302, f80265, f80322, f80257, f80099, f80249, f80150, f80156, f80273, f80195, f80308, f80218, f80315, f80210, f80241, f80164, f80140, f80185, f80209, f80211, f80219, f80113, f80183, f80138, f80207, f80238, f80305, f80161, f80111, f80217, f80201, f80318, f80114, f80119, f80116, f80176, f80167, f80226, f80190, f80100, f80236, f80204, f80189, f80212, f80133, f80130, f80117, f80275, f80254, f80230, f80274, f80303, f80159, f80136, f80295, f80248, f80245, f80147, f80205, f80310, f80178, f80175, f80232, f80221, f80220, f80279, f80276, f80169, f80244, f80157, f80252, f80196, f80333, f80325, f80251, f80188, f80090, f80087, f80277, f80282, f80270, f80327, f80266, f80180, f80094, f80197, f80128, f80105, f80102, f80299, f80181, f80317, f80171, f80168, f80329, f80152, f80162, f80286, f80283, f80246, f80101, f80096, f80268, f80093, f80239, f80083, f80080, f80103, f80115, f80192, f80260, f80258, f80151, f80228, f80240, f80309, f80321, f80092, f80132, f80292, f80127, f80155, f80243, f80312, f80290, f80225, f80089, f80314, f80082, f80165, f80294, f80134, f80179, f80172, f80235, f80332, f80091, f80139, f80085};
    }

    static {
        EnumC9004 enumC9004 = EnumC9004.none;
        EnumC25137 enumC25137 = EnumC25137.Format10x;
        f80112 = new EnumC25097("NOP", 0, (byte) 0, "nop", enumC9004, enumC25137, 4);
        EnumC25137 enumC25138 = EnumC25137.Format12x;
        f80203 = new EnumC25097("MOVE", 1, (byte) 1, "move", enumC9004, enumC25138, 20);
        EnumC25137 enumC25139 = EnumC25137.Format22x;
        f80158 = new EnumC25097("MOVE_FROM16", 2, (byte) 2, "move/from16", enumC9004, enumC25139, 20);
        EnumC25137 enumC251310 = EnumC25137.Format32x;
        f80324 = new EnumC25097("MOVE_16", 3, (byte) 3, "move/16", enumC9004, enumC251310, 20);
        f80331 = new EnumC25097("MOVE_WIDE", 4, (byte) 4, "move-wide", enumC9004, enumC25138, 52);
        f80301 = new EnumC25097("MOVE_WIDE_FROM16", 5, (byte) 5, "move-wide/from16", enumC9004, enumC25139, 52);
        f80149 = new EnumC25097("MOVE_WIDE_16", 6, (byte) 6, "move-wide/16", enumC9004, enumC251310, 52);
        f80098 = new EnumC25097("MOVE_OBJECT", 7, (byte) 7, "move-object", enumC9004, enumC25138, 20);
        f80256 = new EnumC25097("MOVE_OBJECT_FROM16", 8, (byte) 8, "move-object/from16", enumC9004, enumC25139, 20);
        f80194 = new EnumC25097("MOVE_OBJECT_16", 9, (byte) 9, "move-object/16", enumC9004, enumC251310, 20);
        EnumC25137 enumC251311 = EnumC25137.Format11x;
        f80272 = new EnumC25097("MOVE_RESULT", 10, (byte) 10, "move-result", enumC9004, enumC251311, 20);
        f80234 = new EnumC25097("MOVE_RESULT_WIDE", 11, (byte) 11, "move-result-wide", enumC9004, enumC251311, 52);
        f80264 = new EnumC25097("MOVE_RESULT_OBJECT", 12, (byte) 12, "move-result-object", enumC9004, enumC251311, 20);
        f80227 = new EnumC25097("MOVE_EXCEPTION", 13, C0698cb.f2569k, "move-exception", enumC9004, enumC251311, 20);
        f80131 = new EnumC25097("RETURN_VOID", 14, C0698cb.f2570l, "return-void", enumC9004, enumC25137);
        f80284 = new EnumC25097("RETURN", 15, (byte) 15, "return", enumC9004, enumC251311);
        f80088 = new EnumC25097("RETURN_WIDE", 16, (byte) 16, "return-wide", enumC9004, enumC251311);
        f80081 = new EnumC25097("RETURN_OBJECT", 17, (byte) 17, "return-object", enumC9004, enumC251311);
        f80095 = new EnumC25097("CONST_4", 18, (byte) 18, "const/4", enumC9004, EnumC25137.Format11n, 20);
        EnumC25137 enumC251312 = EnumC25137.Format21s;
        f80153 = new EnumC25097("CONST_16", 19, (byte) 19, "const/16", enumC9004, enumC251312, 20);
        EnumC25137 enumC251313 = EnumC25137.Format31i;
        f80222 = new EnumC25097("CONST", 20, (byte) 20, "const", enumC9004, enumC251313, 20);
        EnumC25137 enumC251314 = EnumC25137.Format21h;
        f80253 = new EnumC25097("CONST_HIGH16", 21, (byte) 21, "const/high16", enumC9004, enumC251314, 20);
        f80328 = new EnumC25097("CONST_WIDE_16", 22, (byte) 22, "const-wide/16", enumC9004, enumC251312, 52);
        f80146 = new EnumC25097("CONST_WIDE_32", 23, (byte) 23, "const-wide/32", enumC9004, enumC251313, 52);
        f80231 = new EnumC25097("CONST_WIDE", 24, (byte) 24, "const-wide", enumC9004, EnumC25137.Format51l, 52);
        f80298 = new EnumC25097("CONST_WIDE_HIGH16", 25, (byte) 25, "const-wide/high16", enumC9004, enumC251314, 52);
        EnumC9004 enumC9005 = EnumC9004.string;
        EnumC25137 enumC251315 = EnumC25137.Format21c;
        f80269 = new EnumC25097("CONST_STRING", 26, (byte) 26, "const-string", enumC9005, enumC251315, 21);
        f80261 = new EnumC25097("CONST_STRING_JUMBO", 27, (byte) 27, "const-string/jumbo", enumC9005, EnumC25137.Format31c, 21);
        EnumC9004 enumC9006 = EnumC9004.type;
        f80191 = new EnumC25097("CONST_CLASS", 28, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, "const-class", enumC9006, enumC251315, 21);
        f80187 = new EnumC25097("MONITOR_ENTER", 29, (byte) 29, "monitor-enter", enumC9004, enumC251311, 5);
        f80142 = new EnumC25097("MONITOR_EXIT", 30, (byte) 30, "monitor-exit", enumC9004, enumC251311, 5);
        f80214 = new EnumC25097("CHECK_CAST", 31, C0684bo.f2505j, "check-cast", enumC9006, enumC251315, 21);
        EnumC25137 enumC251316 = EnumC25137.Format22c;
        f80125 = new EnumC25097("INSTANCE_OF", 32, UTF8.S_CS3, "instance-of", enumC9006, enumC251316, 21);
        f80289 = new EnumC25097("ARRAY_LENGTH", 33, PublicSuffixDatabase.EXCEPTION_MARKER, "array-length", enumC9004, enumC25138, 21);
        f80126 = new EnumC25097("NEW_INSTANCE", 34, (byte) 34, "new-instance", enumC9006, enumC251315, 21);
        f80293 = new EnumC25097("NEW_ARRAY", 35, (byte) 35, "new-array", enumC9006, enumC251316, 21);
        EnumC25137 enumC251317 = EnumC25137.Format35c;
        f80123 = new EnumC25097("FILLED_NEW_ARRAY", 36, (byte) 36, "filled-new-array", enumC9006, enumC251317, 13);
        EnumC25137 enumC251318 = EnumC25137.Format3rc;
        f80109 = new EnumC25097("FILLED_NEW_ARRAY_RANGE", 37, (byte) 37, "filled-new-array/range", enumC9006, enumC251318, 13);
        EnumC25137 enumC251319 = EnumC25137.Format31t;
        f80215 = new EnumC25097("FILL_ARRAY_DATA", 38, (byte) 38, "fill-array-data", enumC9004, enumC251319, 4);
        f80143 = new EnumC25097("THROW", 39, (byte) 39, "throw", enumC9004, enumC251311, 1);
        f80199 = new EnumC25097("GOTO", 40, (byte) 40, "goto", enumC9004, EnumC25137.Format10t);
        f80320 = new EnumC25097("GOTO_16", 41, (byte) 41, "goto/16", enumC9004, EnumC25137.Format20t);
        f80223 = new EnumC25097("GOTO_32", 42, (byte) 42, "goto/32", enumC9004, EnumC25137.Format30t);
        f80262 = new EnumC25097("PACKED_SWITCH", 43, (byte) 43, "packed-switch", enumC9004, enumC251319, 4);
        f80173 = new EnumC25097("SPARSE_SWITCH", 44, (byte) 44, "sparse-switch", enumC9004, enumC251319, 4);
        EnumC25137 enumC251320 = EnumC25137.Format23x;
        f80198 = new EnumC25097("CMPL_FLOAT", 45, (byte) 45, "cmpl-float", enumC9004, enumC251320, 20);
        f80182 = new EnumC25097("CMPG_FLOAT", 46, (byte) 46, "cmpg-float", enumC9004, enumC251320, 20);
        f80137 = new EnumC25097("CMPL_DOUBLE", 47, (byte) 47, "cmpl-double", enumC9004, enumC251320, 20);
        f80206 = new EnumC25097("CMPG_DOUBLE", 48, UTF8.S_P3A, "cmpg-double", enumC9004, enumC251320, 20);
        f80319 = new EnumC25097("CMP_LONG", 49, (byte) 49, "cmp-long", enumC9004, enumC251320, 20);
        EnumC25137 enumC251321 = EnumC25137.Format22t;
        f80154 = new EnumC25097("IF_EQ", 50, (byte) 50, "if-eq", enumC9004, enumC251321, 4);
        f80177 = new EnumC25097("IF_NE", 51, (byte) 51, "if-ne", enumC9004, enumC251321, 4);
        f80148 = new EnumC25097("IF_LT", 52, (byte) 52, "if-lt", enumC9004, enumC251321, 4);
        f80193 = new EnumC25097("IF_GE", 53, (byte) 53, "if-ge", enumC9004, enumC251321, 4);
        f80271 = new EnumC25097("IF_GT", 54, (byte) 54, "if-gt", enumC9004, enumC251321, 4);
        f80233 = new EnumC25097("IF_LE", 55, (byte) 55, "if-le", enumC9004, enumC251321, 4);
        EnumC25137 enumC251322 = EnumC25137.Format21t;
        f80097 = new EnumC25097("IF_EQZ", 56, (byte) 56, "if-eqz", enumC9004, enumC251322, 4);
        f80170 = new EnumC25097("IF_NEZ", 57, (byte) 57, "if-nez", enumC9004, enumC251322, 4);
        f80300 = new EnumC25097("IF_LTZ", 58, (byte) 58, "if-ltz", enumC9004, enumC251322, 4);
        f80255 = new EnumC25097("IF_GEZ", 59, (byte) 59, "if-gez", enumC9004, enumC251322, 4);
        f80263 = new EnumC25097("IF_GTZ", 60, (byte) 60, "if-gtz", enumC9004, enumC251322, 4);
        f80330 = new EnumC25097("IF_LEZ", 61, Base32Encoder.DEFAULT_PADDING, "if-lez", enumC9004, enumC251322, 4);
        f80267 = new EnumC25097("AGET", 62, (byte) 68, "aget", enumC9004, enumC251320, 21);
        f80174 = new EnumC25097("AGET_WIDE", 63, (byte) 69, "aget-wide", enumC9004, enumC251320, 53);
        f80144 = new EnumC25097("AGET_OBJECT", 64, (byte) 70, "aget-object", enumC9004, enumC251320, 21);
        f80259 = new EnumC25097("AGET_BOOLEAN", 65, (byte) 71, "aget-boolean", enumC9004, enumC251320, 21);
        f80229 = new EnumC25097("AGET_BYTE", 66, (byte) 72, "aget-byte", enumC9004, enumC251320, 21);
        f80326 = new EnumC25097("AGET_CHAR", 67, (byte) 73, "aget-char", enumC9004, enumC251320, 21);
        f80296 = new EnumC25097("AGET_SHORT", 68, (byte) 74, "aget-short", enumC9004, enumC251320, 21);
        f80079 = new EnumC25097("APUT", 69, (byte) 75, "aput", enumC9004, enumC251320, 5);
        f80311 = new EnumC25097("APUT_WIDE", 70, (byte) 76, "aput-wide", enumC9004, enumC251320, 5);
        f80237 = new EnumC25097("APUT_OBJECT", 71, (byte) 77, "aput-object", enumC9004, enumC251320, 5);
        f80129 = new EnumC25097("APUT_BOOLEAN", 72, (byte) 78, "aput-boolean", enumC9004, enumC251320, 5);
        f80086 = new EnumC25097("APUT_BYTE", 73, (byte) 79, "aput-byte", enumC9004, enumC251320, 5);
        f80160 = new EnumC25097("APUT_CHAR", 74, UTF8.S_P4A, "aput-char", enumC9004, enumC251320, 5);
        f80304 = new EnumC25097("APUT_SHORT", 75, (byte) 81, "aput-short", enumC9004, enumC251320, 5);
        EnumC9004 enumC9007 = EnumC9004.field;
        f80247 = new EnumC25097("IGET", 76, (byte) 82, "iget", enumC9007, enumC251316, 21);
        f80307 = new EnumC25097("IGET_WIDE", 77, (byte) 83, "iget-wide", enumC9007, enumC251316, 53);
        f80285 = new EnumC25097("IGET_OBJECT", 78, (byte) 84, "iget-object", enumC9007, enumC251316, 21);
        f80104 = new EnumC25097("IGET_BOOLEAN", 79, (byte) 85, "iget-boolean", enumC9007, enumC251316, 21);
        f80118 = new EnumC25097("IGET_BYTE", 80, (byte) 86, "iget-byte", enumC9007, enumC251316, 21);
        f80278 = new EnumC25097("IGET_CHAR", 81, (byte) 87, "iget-char", enumC9007, enumC251316, 21);
        f80163 = new EnumC25097("IGET_SHORT", 82, (byte) 88, "iget-short", enumC9007, enumC251316, 21);
        f80106 = new EnumC25097("IPUT", 83, (byte) 89, "iput", enumC9007, enumC251316, 5);
        f80316 = new EnumC25097("IPUT_WIDE", 84, (byte) 90, "iput-wide", enumC9007, enumC251316, 5);
        f80084 = new EnumC25097("IPUT_OBJECT", 85, (byte) 91, "iput-object", enumC9007, enumC251316, 5);
        f80120 = new EnumC25097("IPUT_BOOLEAN", 86, (byte) 92, "iput-boolean", enumC9007, enumC251316, 5);
        f80280 = new EnumC25097("IPUT_BYTE", 87, (byte) 93, "iput-byte", enumC9007, enumC251316, 5);
        f80287 = new EnumC25097("IPUT_CHAR", 88, (byte) 94, "iput-char", enumC9007, enumC251316, 5);
        f80242 = new EnumC25097("IPUT_SHORT", 89, (byte) 95, "iput-short", enumC9007, enumC251316, 5);
        f80124 = new EnumC25097("SGET", 90, UTF8.S_P4B, "sget", enumC9007, enumC251315, 21);
        f80224 = new EnumC25097("SGET_WIDE", 91, (byte) 97, "sget-wide", enumC9007, enumC251315, 53);
        f80184 = new EnumC25097("SGET_OBJECT", 92, (byte) 98, "sget-object", enumC9007, enumC251315, 21);
        f80110 = new EnumC25097("SGET_BOOLEAN", 93, (byte) 99, "sget-boolean", enumC9007, enumC251315, 21);
        f80216 = new EnumC25097("SGET_BYTE", 94, (byte) 100, "sget-byte", enumC9007, enumC251315, 21);
        f80208 = new EnumC25097("SGET_CHAR", 95, (byte) 101, "sget-char", enumC9007, enumC251315, 21);
        f80200 = new EnumC25097("SGET_SHORT", 96, (byte) 102, "sget-short", enumC9007, enumC251315, 21);
        f80250 = new EnumC25097("SPUT", 97, (byte) 103, "sput", enumC9007, enumC251315, 5);
        f80166 = new EnumC25097("SPUT_WIDE", 98, (byte) 104, "sput-wide", enumC9007, enumC251315, 5);
        f80288 = new EnumC25097("SPUT_OBJECT", 99, (byte) 105, "sput-object", enumC9007, enumC251315, 5);
        f80107 = new EnumC25097("SPUT_BOOLEAN", 100, (byte) 106, "sput-boolean", enumC9007, enumC251315, 5);
        f80121 = new EnumC25097("SPUT_BYTE", 101, (byte) 107, "sput-byte", enumC9007, enumC251315, 5);
        f80281 = new EnumC25097("SPUT_CHAR", IShizukuService.Stub.TRANSACTION_attachUserService, (byte) 108, "sput-char", enumC9007, enumC251315, 5);
        f80135 = new EnumC25097("SPUT_SHORT", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, (byte) 109, "sput-short", enumC9007, enumC251315, 5);
        EnumC9004 enumC9008 = EnumC9004.method;
        f80302 = new EnumC25097("INVOKE_VIRTUAL", IShizukuService.Stub.TRANSACTION_isHidden, KeyFactorySpi.x25519_type, "invoke-virtual", enumC9008, enumC251317, 13);
        f80265 = new EnumC25097("INVOKE_SUPER", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, KeyFactorySpi.x448_type, "invoke-super", enumC9008, enumC251317, 13);
        f80322 = new EnumC25097("INVOKE_DIRECT", IShizukuService.Stub.TRANSACTION_getFlagsForUid, KeyFactorySpi.Ed25519_type, "invoke-direct", enumC9008, enumC251317, 13);
        f80257 = new EnumC25097("INVOKE_STATIC", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, KeyFactorySpi.Ed448_type, "invoke-static", enumC9008, enumC251317, 13);
        f80099 = new EnumC25097("INVOKE_INTERFACE", 108, (byte) 114, "invoke-interface", enumC9008, enumC251317, 13);
        f80249 = new EnumC25097("INVOKE_VIRTUAL_RANGE", 109, (byte) 116, "invoke-virtual/range", enumC9008, enumC251318, 13);
        f80150 = new EnumC25097("INVOKE_SUPER_RANGE", UMErrorCode.E_UM_BE_JSON_FAILED, (byte) 117, "invoke-super/range", enumC9008, enumC251318, 13);
        f80156 = new EnumC25097("INVOKE_DIRECT_RANGE", UMErrorCode.E_UM_BE_CREATE_FAILED, (byte) 118, "invoke-direct/range", enumC9008, enumC251318, 13);
        f80273 = new EnumC25097("INVOKE_STATIC_RANGE", UMErrorCode.E_UM_BE_DEFLATE_FAILED, (byte) 119, "invoke-static/range", enumC9008, enumC251318, 13);
        f80195 = new EnumC25097("INVOKE_INTERFACE_RANGE", UMErrorCode.E_UM_BE_RAW_OVERSIZE, (byte) 120, "invoke-interface/range", enumC9008, enumC251318, 13);
        f80308 = new EnumC25097("NEG_INT", 114, (byte) 123, "neg-int", enumC9004, enumC25138, 20);
        f80218 = new EnumC25097("NOT_INT", 115, (byte) 124, "not-int", enumC9004, enumC25138, 20);
        f80315 = new EnumC25097("NEG_LONG", 116, (byte) 125, "neg-long", enumC9004, enumC25138, 52);
        f80210 = new EnumC25097("NOT_LONG", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, (byte) 126, "not-long", enumC9004, enumC25138, 52);
        f80241 = new EnumC25097("NEG_FLOAT", 118, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, "neg-float", enumC9004, enumC25138, 20);
        f80164 = new EnumC25097("NEG_DOUBLE", 119, GCMSIVBlockCipher.MASK, "neg-double", enumC9004, enumC25138, 52);
        f80140 = new EnumC25097("INT_TO_LONG", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, (byte) -127, "int-to-long", enumC9004, enumC25138, 52);
        f80185 = new EnumC25097("INT_TO_FLOAT", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, C0684bo.f2503h, "int-to-float", enumC9004, enumC25138, 20);
        f80209 = new EnumC25097("INT_TO_DOUBLE", 122, (byte) -125, "int-to-double", enumC9004, enumC25138, 52);
        f80211 = new EnumC25097("LONG_TO_INT", 123, (byte) -124, "long-to-int", enumC9004, enumC25138, 20);
        f80219 = new EnumC25097("LONG_TO_FLOAT", 124, (byte) -123, "long-to-float", enumC9004, enumC25138, 20);
        f80113 = new EnumC25097("LONG_TO_DOUBLE", C0254q.f1218h, (byte) -122, "long-to-double", enumC9004, enumC25138, 52);
        f80183 = new EnumC25097("FLOAT_TO_INT", 126, (byte) -121, "float-to-int", enumC9004, enumC25138, 20);
        f80138 = new EnumC25097("FLOAT_TO_LONG", 127, (byte) -120, "float-to-long", enumC9004, enumC25138, 52);
        f80207 = new EnumC25097("FLOAT_TO_DOUBLE", 128, (byte) -119, "float-to-double", enumC9004, enumC25138, 52);
        f80238 = new EnumC25097("DOUBLE_TO_INT", 129, (byte) -118, "double-to-int", enumC9004, enumC25138, 20);
        f80305 = new EnumC25097("DOUBLE_TO_LONG", 130, (byte) -117, "double-to-long", enumC9004, enumC25138, 52);
        f80161 = new EnumC25097("DOUBLE_TO_FLOAT", 131, (byte) -116, "double-to-float", enumC9004, enumC25138, 20);
        f80111 = new EnumC25097("INT_TO_BYTE", 132, (byte) -115, "int-to-byte", enumC9004, enumC25138, 20);
        f80217 = new EnumC25097("INT_TO_CHAR", 133, (byte) -114, "int-to-char", enumC9004, enumC25138, 20);
        f80201 = new EnumC25097("INT_TO_SHORT", 134, (byte) -113, "int-to-short", enumC9004, enumC25138, 20);
        f80318 = new EnumC25097("ADD_INT", 135, (byte) -112, "add-int", enumC9004, enumC251320, 20);
        f80114 = new EnumC25097("SUB_INT", 136, (byte) -111, "sub-int", enumC9004, enumC251320, 20);
        f80119 = new EnumC25097("MUL_INT", 137, (byte) -110, "mul-int", enumC9004, enumC251320, 20);
        f80116 = new EnumC25097("DIV_INT", 138, (byte) -109, "div-int", enumC9004, enumC251320, 21);
        f80176 = new EnumC25097("REM_INT", 139, (byte) -108, "rem-int", enumC9004, enumC251320, 21);
        f80167 = new EnumC25097("AND_INT", 140, (byte) -107, "and-int", enumC9004, enumC251320, 20);
        f80226 = new EnumC25097("OR_INT", 141, (byte) -106, "or-int", enumC9004, enumC251320, 20);
        f80190 = new EnumC25097("XOR_INT", 142, (byte) -105, "xor-int", enumC9004, enumC251320, 20);
        f80100 = new EnumC25097("SHL_INT", 143, (byte) -104, "shl-int", enumC9004, enumC251320, 20);
        f80236 = new EnumC25097("SHR_INT", 144, (byte) -103, "shr-int", enumC9004, enumC251320, 20);
        f80204 = new EnumC25097("USHR_INT", 145, (byte) -102, "ushr-int", enumC9004, enumC251320, 20);
        f80189 = new EnumC25097("ADD_LONG", 146, (byte) -101, "add-long", enumC9004, enumC251320, 52);
        f80212 = new EnumC25097("SUB_LONG", 147, (byte) -100, "sub-long", enumC9004, enumC251320, 52);
        f80133 = new EnumC25097("MUL_LONG", 148, (byte) -99, "mul-long", enumC9004, enumC251320, 52);
        f80130 = new EnumC25097("DIV_LONG", 149, (byte) -98, "div-long", enumC9004, enumC251320, 53);
        f80117 = new EnumC25097("REM_LONG", 150, (byte) -97, "rem-long", enumC9004, enumC251320, 53);
        f80275 = new EnumC25097("AND_LONG", 151, (byte) -96, "and-long", enumC9004, enumC251320, 52);
        f80254 = new EnumC25097("OR_LONG", 152, (byte) -95, "or-long", enumC9004, enumC251320, 52);
        f80230 = new EnumC25097("XOR_LONG", 153, (byte) -94, "xor-long", enumC9004, enumC251320, 52);
        f80274 = new EnumC25097("SHL_LONG", EnumC19222.f57460, (byte) -93, "shl-long", enumC9004, enumC251320, 52);
        f80303 = new EnumC25097("SHR_LONG", 155, (byte) -92, "shr-long", enumC9004, enumC251320, 52);
        f80159 = new EnumC25097("USHR_LONG", 156, (byte) -91, "ushr-long", enumC9004, enumC251320, 52);
        f80136 = new EnumC25097("ADD_FLOAT", 157, (byte) -90, "add-float", enumC9004, enumC251320, 20);
        f80295 = new EnumC25097("SUB_FLOAT", 158, (byte) -89, "sub-float", enumC9004, enumC251320, 20);
        f80248 = new EnumC25097("MUL_FLOAT", 159, (byte) -88, "mul-float", enumC9004, enumC251320, 20);
        f80245 = new EnumC25097("DIV_FLOAT", DHParameters.DEFAULT_MINIMUM_LENGTH, (byte) -87, "div-float", enumC9004, enumC251320, 20);
        f80147 = new EnumC25097("REM_FLOAT", 161, (byte) -86, "rem-float", enumC9004, enumC251320, 20);
        f80205 = new EnumC25097("ADD_DOUBLE", 162, (byte) -85, "add-double", enumC9004, enumC251320, 52);
        f80310 = new EnumC25097("SUB_DOUBLE", 163, (byte) -84, "sub-double", enumC9004, enumC251320, 52);
        f80178 = new EnumC25097("MUL_DOUBLE", 164, (byte) -83, "mul-double", enumC9004, enumC251320, 52);
        f80175 = new EnumC25097("DIV_DOUBLE", 165, (byte) -82, "div-double", enumC9004, enumC251320, 52);
        f80232 = new EnumC25097("REM_DOUBLE", 166, (byte) -81, "rem-double", enumC9004, enumC251320, 52);
        f80221 = new EnumC25097("ADD_INT_2ADDR", 167, (byte) -80, "add-int/2addr", enumC9004, enumC25138, 20);
        f80220 = new EnumC25097("SUB_INT_2ADDR", 168, (byte) -79, "sub-int/2addr", enumC9004, enumC25138, 20);
        f80279 = new EnumC25097("MUL_INT_2ADDR", 169, (byte) -78, "mul-int/2addr", enumC9004, enumC25138, 20);
        f80276 = new EnumC25097("DIV_INT_2ADDR", 170, (byte) -77, "div-int/2addr", enumC9004, enumC25138, 21);
        f80169 = new EnumC25097("REM_INT_2ADDR", 171, (byte) -76, "rem-int/2addr", enumC9004, enumC25138, 21);
        f80244 = new EnumC25097("AND_INT_2ADDR", 172, (byte) -75, "and-int/2addr", enumC9004, enumC25138, 20);
        f80157 = new EnumC25097("OR_INT_2ADDR", 173, (byte) -74, "or-int/2addr", enumC9004, enumC25138, 20);
        f80252 = new EnumC25097("XOR_INT_2ADDR", 174, (byte) -73, "xor-int/2addr", enumC9004, enumC25138, 20);
        f80196 = new EnumC25097("SHL_INT_2ADDR", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, (byte) -72, "shl-int/2addr", enumC9004, enumC25138, 20);
        f80333 = new EnumC25097("SHR_INT_2ADDR", PicnicEngine.MAX_AUX_BYTES, (byte) -71, "shr-int/2addr", enumC9004, enumC25138, 20);
        f80325 = new EnumC25097("USHR_INT_2ADDR", 177, (byte) -70, "ushr-int/2addr", enumC9004, enumC25138, 20);
        f80251 = new EnumC25097("ADD_LONG_2ADDR", 178, (byte) -69, "add-long/2addr", enumC9004, enumC25138, 52);
        f80188 = new EnumC25097("SUB_LONG_2ADDR", 179, PSSSigner.TRAILER_IMPLICIT, "sub-long/2addr", enumC9004, enumC25138, 52);
        f80090 = new EnumC25097("MUL_LONG_2ADDR", 180, (byte) -67, "mul-long/2addr", enumC9004, enumC25138, 52);
        f80087 = new EnumC25097("DIV_LONG_2ADDR", 181, (byte) -66, "div-long/2addr", enumC9004, enumC25138, 53);
        f80277 = new EnumC25097("REM_LONG_2ADDR", 182, (byte) -65, "rem-long/2addr", enumC9004, enumC25138, 53);
        f80282 = new EnumC25097("AND_LONG_2ADDR", 183, (byte) -64, "and-long/2addr", enumC9004, enumC25138, 52);
        f80270 = new EnumC25097("OR_LONG_2ADDR", 184, (byte) -63, "or-long/2addr", enumC9004, enumC25138, 52);
        f80327 = new EnumC25097("XOR_LONG_2ADDR", 185, (byte) -62, "xor-long/2addr", enumC9004, enumC25138, 52);
        f80266 = new EnumC25097("SHL_LONG_2ADDR", 186, (byte) -61, "shl-long/2addr", enumC9004, enumC25138, 52);
        f80180 = new EnumC25097("SHR_LONG_2ADDR", 187, (byte) -60, "shr-long/2addr", enumC9004, enumC25138, 52);
        f80094 = new EnumC25097("USHR_LONG_2ADDR", 188, (byte) -59, "ushr-long/2addr", enumC9004, enumC25138, 52);
        f80197 = new EnumC25097("ADD_FLOAT_2ADDR", 189, (byte) -58, "add-float/2addr", enumC9004, enumC25138, 20);
        f80128 = new EnumC25097("SUB_FLOAT_2ADDR", 190, (byte) -57, "sub-float/2addr", enumC9004, enumC25138, 20);
        f80105 = new EnumC25097("MUL_FLOAT_2ADDR", 191, (byte) -56, "mul-float/2addr", enumC9004, enumC25138, 20);
        f80102 = new EnumC25097("DIV_FLOAT_2ADDR", 192, (byte) -55, "div-float/2addr", enumC9004, enumC25138, 20);
        f80299 = new EnumC25097("REM_FLOAT_2ADDR", 193, (byte) -54, "rem-float/2addr", enumC9004, enumC25138, 20);
        f80181 = new EnumC25097("ADD_DOUBLE_2ADDR", 194, (byte) -53, "add-double/2addr", enumC9004, enumC25138, 52);
        f80317 = new EnumC25097("SUB_DOUBLE_2ADDR", 195, (byte) -52, "sub-double/2addr", enumC9004, enumC25138, 52);
        f80171 = new EnumC25097("MUL_DOUBLE_2ADDR", 196, (byte) -51, "mul-double/2addr", enumC9004, enumC25138, 52);
        f80168 = new EnumC25097("DIV_DOUBLE_2ADDR", 197, (byte) -50, "div-double/2addr", enumC9004, enumC25138, 52);
        f80329 = new EnumC25097("REM_DOUBLE_2ADDR", 198, (byte) -49, "rem-double/2addr", enumC9004, enumC25138, 52);
        EnumC25137 enumC251323 = EnumC25137.Format22s;
        f80152 = new EnumC25097("ADD_INT_LIT16", 199, (byte) -48, "add-int/lit16", enumC9004, enumC251323, 20);
        f80162 = new EnumC25097("RSUB_INT", 200, (byte) -47, "rsub-int", enumC9004, enumC251323, 20);
        f80286 = new EnumC25097("MUL_INT_LIT16", 201, (byte) -46, "mul-int/lit16", enumC9004, enumC251323, 20);
        f80283 = new EnumC25097("DIV_INT_LIT16", 202, (byte) -45, "div-int/lit16", enumC9004, enumC251323, 21);
        f80246 = new EnumC25097("REM_INT_LIT16", 203, (byte) -44, "rem-int/lit16", enumC9004, enumC251323, 21);
        f80101 = new EnumC25097("AND_INT_LIT16", 204, (byte) -43, "and-int/lit16", enumC9004, enumC251323, 20);
        f80096 = new EnumC25097("OR_INT_LIT16", 205, (byte) -42, "or-int/lit16", enumC9004, enumC251323, 20);
        f80268 = new EnumC25097("XOR_INT_LIT16", 206, (byte) -41, "xor-int/lit16", enumC9004, enumC251323, 20);
        EnumC25137 enumC251324 = EnumC25137.Format22b;
        f80093 = new EnumC25097("ADD_INT_LIT8", 207, (byte) -40, "add-int/lit8", enumC9004, enumC251324, 20);
        f80239 = new EnumC25097("RSUB_INT_LIT8", 208, (byte) -39, "rsub-int/lit8", enumC9004, enumC251324, 20);
        f80083 = new EnumC25097("MUL_INT_LIT8", 209, (byte) -38, "mul-int/lit8", enumC9004, enumC251324, 20);
        f80080 = new EnumC25097("DIV_INT_LIT8", 210, (byte) -37, "div-int/lit8", enumC9004, enumC251324, 21);
        f80103 = new EnumC25097("REM_INT_LIT8", Primes.SMALL_FACTOR_LIMIT, (byte) -36, "rem-int/lit8", enumC9004, enumC251324, 21);
        f80115 = new EnumC25097("AND_INT_LIT8", 212, (byte) -35, "and-int/lit8", enumC9004, enumC251324, 20);
        f80192 = new EnumC25097("OR_INT_LIT8", 213, (byte) -34, "or-int/lit8", enumC9004, enumC251324, 20);
        f80260 = new EnumC25097("XOR_INT_LIT8", 214, (byte) -33, "xor-int/lit8", enumC9004, enumC251324, 20);
        f80258 = new EnumC25097("SHL_INT_LIT8", 215, C0684bo.f2506k, "shl-int/lit8", enumC9004, enumC251324, 20);
        f80151 = new EnumC25097("SHR_INT_LIT8", 216, GCMSIVBlockCipher.ADD, "shr-int/lit8", enumC9004, enumC251324, 20);
        f80228 = new EnumC25097("USHR_INT_LIT8", IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, (byte) -30, "ushr-int/lit8", enumC9004, enumC251324, 20);
        f80240 = new EnumC25097("IGET_VOLATILE", 218, (byte) -29, "iget-volatile", enumC9007, enumC251316, 151);
        f80309 = new EnumC25097("IPUT_VOLATILE", 219, (byte) -28, "iput-volatile", enumC9007, enumC251316, 135);
        f80321 = new EnumC25097("SGET_VOLATILE", 220, (byte) -27, "sget-volatile", enumC9007, enumC251315, 279);
        f80092 = new EnumC25097("SPUT_VOLATILE", 221, (byte) -26, "sput-volatile", enumC9007, enumC251315, 263);
        f80132 = new EnumC25097("IGET_OBJECT_VOLATILE", 222, (byte) -25, "iget-object-volatile", enumC9007, enumC251316, 151);
        f80292 = new EnumC25097("IGET_WIDE_VOLATILE", 223, (byte) -24, "iget-wide-volatile", enumC9007, enumC251316, 183);
        f80127 = new EnumC25097("IPUT_WIDE_VOLATILE", BERTags.FLAGS, (byte) -23, "iput-wide-volatile", enumC9007, enumC251316, 135);
        f80155 = new EnumC25097("SGET_WIDE_VOLATILE", HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, (byte) -22, "sget-wide-volatile", enumC9007, enumC251315, 311);
        f80243 = new EnumC25097("SPUT_WIDE_VOLATILE", 226, (byte) -21, "sput-wide-volatile", enumC9007, enumC251315, 263);
        EnumC25137 enumC251325 = EnumC25137.Format35ms;
        f80312 = new EnumC25097("EXECUTE_INLINE", 227, (byte) -18, "execute-inline", enumC9004, enumC251325, 15);
        EnumC25137 enumC251326 = EnumC25137.Format3rms;
        f80290 = new EnumC25097("EXECUTE_INLINE_RANGE", 228, (byte) -17, "execute-inline/range", enumC9004, enumC251326, 15);
        f80225 = new EnumC25097("INVOKE_DIRECT_EMPTY", 229, (byte) -16, "invoke-direct-empty", enumC9008, EnumC25137.Format35s, 15);
        EnumC25137 enumC251327 = EnumC25137.Format22cs;
        f80089 = new EnumC25097("IGET_QUICK", 230, (byte) -14, "iget-quick", enumC9004, enumC251327, 87);
        f80314 = new EnumC25097("IGET_WIDE_QUICK", 231, (byte) -13, "iget-wide-quick", enumC9004, enumC251327, 119);
        f80082 = new EnumC25097("IGET_OBJECT_QUICK", 232, (byte) -12, "iget-object-quick", enumC9004, enumC251327, 87);
        f80165 = new EnumC25097("IPUT_QUICK", 233, (byte) -11, "iput-quick", enumC9004, enumC251327, 71);
        f80294 = new EnumC25097("IPUT_WIDE_QUICK", 234, (byte) -10, "iput-wide-quick", enumC9004, enumC251327, 71);
        f80134 = new EnumC25097("IPUT_OBJECT_QUICK", 235, (byte) -9, "iput-object-quick", enumC9004, enumC251327, 71);
        f80179 = new EnumC25097("INVOKE_VIRTUAL_QUICK", 236, (byte) -8, "invoke-virtual-quick", enumC9004, enumC251325, 15);
        f80172 = new EnumC25097("INVOKE_VIRTUAL_QUICK_RANGE", 237, (byte) -7, "invoke-virtual-quick/range", enumC9004, enumC251326, 15);
        f80235 = new EnumC25097("INVOKE_SUPER_QUICK", 238, (byte) -6, "invoke-super-quick", enumC9004, enumC251325, 15);
        f80332 = new EnumC25097("INVOKE_SUPER_QUICK_RANGE", 239, (byte) -5, "invoke-super-quick/range", enumC9004, enumC251326, 15);
        f80091 = new EnumC25097("IPUT_OBJECT_VOLATILE", 240, (byte) -4, "iput-object-volatile", enumC9007, enumC251316, 135);
        f80139 = new EnumC25097("SGET_OBJECT_VOLATILE", 241, (byte) -3, "sget-object-volatile", enumC9007, enumC251315, 279);
        f80085 = new EnumC25097("SPUT_OBJECT_VOLATILE", 242, (byte) -2, "sput-object-volatile", enumC9007, enumC251315, 263);
        f80213 = m55080();
        f80297 = new EnumC25097[256];
        f80145 = new SparseArray();
        for (EnumC25097 enumC25097 : values()) {
            f80297[enumC25097.f80334 & 255] = enumC25097;
            f80145.put(enumC25097.f80336.hashCode(), enumC25097);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC25097 m55082(String str) {
        return (EnumC25097) f80145.get(str.toLowerCase().hashCode());
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC25097 m55081(byte b) {
        return f80297[b & 255];
    }

    public EnumC25097(String str, int i, byte b, String str2, EnumC9004 enumC9004, EnumC25137 enumC25137) {
        this(str, i, b, str2, enumC9004, enumC25137, 0);
    }

    public EnumC25097(String str, int i, byte b, String str2, EnumC9004 enumC9004, EnumC25137 enumC25137, int i2) {
        super(str, i);
        this.f80334 = b;
        this.f80336 = str2;
        this.f80335 = enumC9004;
        this.f80338 = enumC25137;
        this.f80337 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m55086() {
        return (this.f80337 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m55085() {
        return (this.f80337 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m55083() {
        return (this.f80337 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m55087() {
        return (this.f80337 & 8) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m55084() {
        return (this.f80337 & 16) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m55089() {
        return (this.f80337 & 32) != 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m55088() {
        return (this.f80337 & 64) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m55091() {
        return (this.f80337 & 128) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m55090() {
        return (this.f80337 & 256) != 0;
    }
}
