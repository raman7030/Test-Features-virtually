package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.p080ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۖܳ' uses external variables
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
/* JADX INFO: renamed from: l.֨ۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F5XO */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3167 {

    /* JADX INFO: renamed from: ֡֫ */
    public static final EnumC3167 f5812;

    /* JADX INFO: renamed from: ֡ۜ */
    public static final EnumC3167 f5813;

    /* JADX INFO: renamed from: ֡ۧ */
    public static final EnumC3167 f5814;

    /* JADX INFO: renamed from: ֡ܳ */
    public static final EnumC3167 f5815;

    /* JADX INFO: renamed from: ֡ܽ */
    public static final EnumC3167 f5816;

    /* JADX INFO: renamed from: ֡ܿ */
    public static final EnumC3167 f5817;

    /* JADX INFO: renamed from: ֡ᩳ */
    public static final EnumC3167 f5818;

    /* JADX INFO: renamed from: ֡᩻ */
    public static final EnumC3167 f5819;

    /* JADX INFO: renamed from: ֨֫ */
    public static final EnumC3167 f5820;

    /* JADX INFO: renamed from: ֨ۜ */
    public static final EnumC3167 f5821;

    /* JADX INFO: renamed from: ֨ۧ */
    public static final EnumC3167 f5822;

    /* JADX INFO: renamed from: ֨ܳ */
    public static final EnumC3167 f5823;

    /* JADX INFO: renamed from: ֨ܽ */
    public static final EnumC3167 f5824;

    /* JADX INFO: renamed from: ֨ܿ */
    public static final EnumC3167 f5825;

    /* JADX INFO: renamed from: ֨ᩳ */
    public static final EnumC3167 f5826;

    /* JADX INFO: renamed from: ֨᩻ */
    public static final EnumC3167 f5827;

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC3167 f5828;

    /* JADX INFO: renamed from: ֫ۜ */
    public static final EnumC3167 f5829;

    /* JADX INFO: renamed from: ֫ۧ */
    public static final EnumC3167 f5830;

    /* JADX INFO: renamed from: ֫ܳ */
    public static final EnumC3167 f5831;

    /* JADX INFO: renamed from: ֫ܽ */
    public static final EnumC3167 f5832;

    /* JADX INFO: renamed from: ֫ܿ */
    public static final EnumC3167 f5833;

    /* JADX INFO: renamed from: ֫ᩳ */
    public static final EnumC3167 f5834;

    /* JADX INFO: renamed from: ֫᩻ */
    public static final EnumC3167 f5835;

    /* JADX INFO: renamed from: ۖ֫ */
    public static final int f5836 = -65536;

    /* JADX INFO: renamed from: ۖۜ */
    public static final EnumC3167 f5837;

    /* JADX INFO: renamed from: ۖۧ */
    public static final EnumC3167 f5838;

    /* JADX INFO: renamed from: ۖܳ */
    public static final EnumC3167 f5839;

    /* JADX INFO: renamed from: ۖܽ */
    public static final EnumC3167 f5840;

    /* JADX INFO: renamed from: ۖܿ */
    public static final EnumC3167 f5841;

    /* JADX INFO: renamed from: ۖᩳ */
    public static final EnumC3167 f5842;

    /* JADX INFO: renamed from: ۖ᩻ */
    public static final EnumC3167 f5843;

    /* JADX INFO: renamed from: ۗ֫ */
    public static final EnumC3167 f5844;

    /* JADX INFO: renamed from: ۗۜ */
    public static final EnumC3167 f5845;

    /* JADX INFO: renamed from: ۗۧ */
    public static final EnumC3167 f5846;

    /* JADX INFO: renamed from: ۗܳ */
    public static final EnumC3167 f5847;

    /* JADX INFO: renamed from: ۗܽ */
    public static final EnumC3167 f5848;

    /* JADX INFO: renamed from: ۗܿ */
    public static final EnumC3167 f5849;

    /* JADX INFO: renamed from: ۗᩳ */
    public static final EnumC3167 f5850;

    /* JADX INFO: renamed from: ۗ᩻ */
    public static final EnumC3167 f5851;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final EnumC3167 f5852;

    /* JADX INFO: renamed from: ۘۜ */
    public static final EnumC3167 f5853;

    /* JADX INFO: renamed from: ۘۧ */
    public static final EnumC3167 f5854;

    /* JADX INFO: renamed from: ۘܳ */
    public static final EnumC3167 f5855;

    /* JADX INFO: renamed from: ۘܽ */
    public static final EnumC3167 f5856;

    /* JADX INFO: renamed from: ۘܿ */
    public static final EnumC3167 f5857;

    /* JADX INFO: renamed from: ۘᩳ */
    public static final EnumC3167 f5858;

    /* JADX INFO: renamed from: ۘ᩻ */
    public static final EnumC3167 f5859;

    /* JADX INFO: renamed from: ۙ֫ */
    public static final EnumC3167 f5860;

    /* JADX INFO: renamed from: ۙۜ */
    public static final EnumC3167 f5861;

    /* JADX INFO: renamed from: ۙۧ */
    public static final EnumC3167 f5862;

    /* JADX INFO: renamed from: ۙܳ */
    public static final int f5863 = 64;

    /* JADX INFO: renamed from: ۙܽ */
    public static final EnumC3167 f5864;

    /* JADX INFO: renamed from: ۙܿ */
    public static final EnumC3167 f5865;

    /* JADX INFO: renamed from: ۙᩳ */
    public static final EnumC3167 f5866;

    /* JADX INFO: renamed from: ۙ᩻ */
    public static final EnumC3167 f5867;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final EnumC3167 f5868;

    /* JADX INFO: renamed from: ۚۜ */
    public static final EnumC3167 f5869;

    /* JADX INFO: renamed from: ۚۧ */
    public static final EnumC3167 f5870;

    /* JADX INFO: renamed from: ۚܳ */
    public static final EnumC3167 f5871;

    /* JADX INFO: renamed from: ۚܽ */
    public static final EnumC3167 f5872;

    /* JADX INFO: renamed from: ۚܿ */
    public static final EnumC3167 f5873;

    /* JADX INFO: renamed from: ۚᩳ */
    public static final EnumC3167 f5874;

    /* JADX INFO: renamed from: ۚ᩻ */
    public static final EnumC3167 f5875;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC3167 f5876;

    /* JADX INFO: renamed from: ۛ֫ */
    public static final int f5877 = 1024;

    /* JADX INFO: renamed from: ۛۜ */
    public static final EnumC3167 f5878;

    /* JADX INFO: renamed from: ۛۧ */
    public static final EnumC3167 f5879;

    /* JADX INFO: renamed from: ۛܳ */
    public static final EnumC3167 f5880;

    /* JADX INFO: renamed from: ۛܽ */
    public static final EnumC3167 f5881;

    /* JADX INFO: renamed from: ۛܿ */
    public static final EnumC3167 f5882;

    /* JADX INFO: renamed from: ۛᩳ */
    public static final EnumC3167 f5883;

    /* JADX INFO: renamed from: ۛ᩻ */
    public static final EnumC3167 f5884;

    /* JADX INFO: renamed from: ۜ֫ */
    public static final EnumC3167 f5885;

    /* JADX INFO: renamed from: ۜۜ */
    public static final EnumC3167 f5886;

    /* JADX INFO: renamed from: ۜۧ */
    public static final EnumC3167 f5887;

    /* JADX INFO: renamed from: ۜܳ */
    public static final EnumC3167 f5888;

    /* JADX INFO: renamed from: ۜܽ */
    public static final EnumC3167 f5889;

    /* JADX INFO: renamed from: ۜܿ */
    public static final EnumC3167 f5890;

    /* JADX INFO: renamed from: ۜᩳ */
    public static final EnumC3167 f5891;

    /* JADX INFO: renamed from: ۜ᩻ */
    public static final EnumC3167 f5892;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC3167 f5893;

    /* JADX INFO: renamed from: ۟֫ */
    public static final EnumC3167 f5894;

    /* JADX INFO: renamed from: ۟ۧ */
    public static final EnumC3167 f5895;

    /* JADX INFO: renamed from: ۟ܳ */
    public static final EnumC3167 f5896;

    /* JADX INFO: renamed from: ۟ܽ */
    public static final EnumC3167 f5897;

    /* JADX INFO: renamed from: ۟ܿ */
    public static final EnumC3167 f5898;

    /* JADX INFO: renamed from: ۟ᩳ */
    public static final EnumC3167 f5899;

    /* JADX INFO: renamed from: ۟᩻ */
    public static final EnumC3167 f5900;

    /* JADX INFO: renamed from: ۠֫ */
    public static final EnumC3167 f5901;

    /* JADX INFO: renamed from: ۠ۜ */
    public static final EnumC3167 f5902;

    /* JADX INFO: renamed from: ۠ۧ */
    public static final EnumC3167 f5903;

    /* JADX INFO: renamed from: ۠ܳ */
    public static final EnumC3167 f5904;

    /* JADX INFO: renamed from: ۠ܽ */
    public static final EnumC3167 f5905;

    /* JADX INFO: renamed from: ۠ܿ */
    public static final EnumC3167 f5906;

    /* JADX INFO: renamed from: ۠ᩳ */
    public static final EnumC3167 f5907;

    /* JADX INFO: renamed from: ۠᩻ */
    public static final EnumC3167 f5908;

    /* JADX INFO: renamed from: ۡ֫ */
    public static final EnumC3167 f5909;

    /* JADX INFO: renamed from: ۡۜ */
    public static final int f5910 = 256;

    /* JADX INFO: renamed from: ۡۧ */
    public static final EnumC3167 f5911;

    /* JADX INFO: renamed from: ۡܳ */
    public static final EnumC3167 f5912;

    /* JADX INFO: renamed from: ۡܽ */
    public static final EnumC3167 f5913;

    /* JADX INFO: renamed from: ۡܿ */
    public static final EnumC3167 f5914;

    /* JADX INFO: renamed from: ۡᩳ */
    public static final EnumC3167 f5915;

    /* JADX INFO: renamed from: ۡ᩻ */
    public static final int f5916 = 8;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final EnumC3167 f5917;

    /* JADX INFO: renamed from: ۢۜ */
    public static final EnumC3167 f5918;

    /* JADX INFO: renamed from: ۢۧ */
    public static final EnumC3167 f5919;

    /* JADX INFO: renamed from: ۢܳ */
    public static final EnumC3167 f5920;

    /* JADX INFO: renamed from: ۢܽ */
    public static final EnumC3167 f5921;

    /* JADX INFO: renamed from: ۢܿ */
    public static final EnumC3167 f5922;

    /* JADX INFO: renamed from: ۢᩳ */
    public static final EnumC3167 f5923;

    /* JADX INFO: renamed from: ۢ᩻ */
    public static final int f5924 = 16;

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ EnumC3167[] f5925;

    /* JADX INFO: renamed from: ۤ֫ */
    public static final int f5926 = 4;

    /* JADX INFO: renamed from: ۤۜ */
    public static final EnumC3167 f5927;

    /* JADX INFO: renamed from: ۤۧ */
    public static final EnumC3167 f5928;

    /* JADX INFO: renamed from: ۤܳ */
    public static final EnumC3167 f5929;

    /* JADX INFO: renamed from: ۤܽ */
    public static final EnumC3167 f5930;

    /* JADX INFO: renamed from: ۤܿ */
    public static final EnumC3167 f5931;

    /* JADX INFO: renamed from: ۤᩳ */
    public static final EnumC3167 f5932;

    /* JADX INFO: renamed from: ۤ᩻ */
    public static final EnumC3167 f5933;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC3167 f5934;

    /* JADX INFO: renamed from: ۧۜ */
    public static final EnumC3167 f5935;

    /* JADX INFO: renamed from: ۧۧ */
    public static final EnumC3167 f5936;

    /* JADX INFO: renamed from: ۧܳ */
    public static final EnumC3167 f5937;

    /* JADX INFO: renamed from: ۧܽ */
    public static final EnumC3167 f5938;

    /* JADX INFO: renamed from: ۧܿ */
    public static final EnumC3167 f5939;

    /* JADX INFO: renamed from: ۧᩳ */
    public static final EnumC3167 f5940;

    /* JADX INFO: renamed from: ۧ᩻ */
    public static final EnumC3167 f5941;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC3167 f5942;

    /* JADX INFO: renamed from: ۨ֫ */
    public static final int f5943 = 1;

    /* JADX INFO: renamed from: ۨۜ */
    public static final EnumC3167 f5944;

    /* JADX INFO: renamed from: ۨۧ */
    public static final EnumC3167 f5945;

    /* JADX INFO: renamed from: ۨܳ */
    public static final EnumC3167 f5946;

    /* JADX INFO: renamed from: ۨܽ */
    public static final EnumC3167 f5947;

    /* JADX INFO: renamed from: ۨܿ */
    public static final EnumC3167 f5948;

    /* JADX INFO: renamed from: ۨᩳ */
    public static final EnumC3167 f5949;

    /* JADX INFO: renamed from: ۨ᩻ */
    public static final EnumC3167 f5950;

    /* JADX INFO: renamed from: ۫֫ */
    public static final EnumC3167 f5951;

    /* JADX INFO: renamed from: ۫ۜ */
    public static final EnumC3167 f5952;

    /* JADX INFO: renamed from: ۫ۧ */
    public static final EnumC3167 f5953;

    /* JADX INFO: renamed from: ۫ܳ */
    public static final EnumC3167 f5954;

    /* JADX INFO: renamed from: ۫ܽ */
    public static final EnumC3167 f5955;

    /* JADX INFO: renamed from: ۫ܿ */
    public static final EnumC3167 f5956;

    /* JADX INFO: renamed from: ۫ᩳ */
    public static final EnumC3167 f5957;

    /* JADX INFO: renamed from: ۫᩻ */
    public static final EnumC3167 f5958;

    /* JADX INFO: renamed from: ۬֫ */
    public static final EnumC3167 f5959;

    /* JADX INFO: renamed from: ۬ۜ */
    public static final int f5960 = 128;

    /* JADX INFO: renamed from: ۬ۧ */
    public static final EnumC3167 f5961;

    /* JADX INFO: renamed from: ۬ܳ */
    public static final EnumC3167 f5962;

    /* JADX INFO: renamed from: ۬ܽ */
    public static final EnumC3167 f5963;

    /* JADX INFO: renamed from: ۬ܿ */
    public static final EnumC3167 f5964;

    /* JADX INFO: renamed from: ۬ᩳ */
    public static final EnumC3167 f5965;

    /* JADX INFO: renamed from: ۬᩻ */
    public static final EnumC3167 f5966;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC3167 f5967;

    /* JADX INFO: renamed from: ܰ֫ */
    public static final EnumC3167 f5968;

    /* JADX INFO: renamed from: ܰۜ */
    public static final EnumC3167 f5969;

    /* JADX INFO: renamed from: ܰۧ */
    public static final EnumC3167 f5970;

    /* JADX INFO: renamed from: ܰܳ */
    public static final EnumC3167 f5971;

    /* JADX INFO: renamed from: ܰܽ */
    public static final EnumC3167 f5972;

    /* JADX INFO: renamed from: ܰܿ */
    public static final EnumC3167 f5973;

    /* JADX INFO: renamed from: ܰᩳ */
    public static final EnumC3167 f5974;

    /* JADX INFO: renamed from: ܰ᩻ */
    public static final EnumC3167 f5975;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final EnumC3167 f5976;

    /* JADX INFO: renamed from: ܳۜ */
    public static final EnumC3167 f5977;

    /* JADX INFO: renamed from: ܳۧ */
    public static final EnumC3167 f5978;

    /* JADX INFO: renamed from: ܳܳ */
    public static final EnumC3167 f5979;

    /* JADX INFO: renamed from: ܳܽ */
    public static final EnumC3167 f5980;

    /* JADX INFO: renamed from: ܳܿ */
    public static final EnumC3167 f5981;

    /* JADX INFO: renamed from: ܳᩳ */
    public static final EnumC3167 f5982;

    /* JADX INFO: renamed from: ܳ᩻ */
    public static final EnumC3167 f5983;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final EnumC3167 f5984;

    /* JADX INFO: renamed from: ܶۜ */
    public static final EnumC3167 f5985;

    /* JADX INFO: renamed from: ܶۧ */
    public static final EnumC3167 f5986;

    /* JADX INFO: renamed from: ܶܳ */
    public static final EnumC3167 f5987;

    /* JADX INFO: renamed from: ܶܽ */
    public static final EnumC3167 f5988;

    /* JADX INFO: renamed from: ܶܿ */
    public static final EnumC3167 f5989;

    /* JADX INFO: renamed from: ܶᩳ */
    public static final EnumC3167 f5990;

    /* JADX INFO: renamed from: ܶ᩻ */
    public static final EnumC3167 f5991;

    /* JADX INFO: renamed from: ܺ֫ */
    public static final EnumC3167 f5992;

    /* JADX INFO: renamed from: ܺۜ */
    public static final EnumC3167 f5993;

    /* JADX INFO: renamed from: ܺۧ */
    public static final EnumC3167 f5994;

    /* JADX INFO: renamed from: ܺܳ */
    public static final EnumC3167 f5995;

    /* JADX INFO: renamed from: ܺܽ */
    public static final EnumC3167 f5996;

    /* JADX INFO: renamed from: ܺܿ */
    public static final int f5997 = 512;

    /* JADX INFO: renamed from: ܺᩳ */
    public static final EnumC3167 f5998;

    /* JADX INFO: renamed from: ܺ᩻ */
    public static final int f5999 = 32;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC3167 f6000;

    /* JADX INFO: renamed from: ܽۜ */
    public static final EnumC3167 f6001;

    /* JADX INFO: renamed from: ܽۧ */
    public static final EnumC3167 f6002;

    /* JADX INFO: renamed from: ܽܳ */
    public static final EnumC3167 f6003;

    /* JADX INFO: renamed from: ܽܽ */
    public static final EnumC3167 f6004;

    /* JADX INFO: renamed from: ܽܿ */
    public static final EnumC3167 f6005;

    /* JADX INFO: renamed from: ܽᩳ */
    public static final EnumC3167 f6006;

    /* JADX INFO: renamed from: ܽ᩻ */
    public static final EnumC3167 f6007;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final EnumC3167 f6008;

    /* JADX INFO: renamed from: ܿۜ */
    public static final EnumC3167 f6009;

    /* JADX INFO: renamed from: ܿۧ */
    public static final EnumC3167 f6010;

    /* JADX INFO: renamed from: ܿܳ */
    public static final EnumC3167 f6011;

    /* JADX INFO: renamed from: ܿܽ */
    public static final EnumC3167 f6012;

    /* JADX INFO: renamed from: ܿܿ */
    public static final EnumC3167 f6013;

    /* JADX INFO: renamed from: ܿᩳ */
    public static final EnumC3167 f6014;

    /* JADX INFO: renamed from: ܿ᩻ */
    public static final EnumC3167 f6015;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final EnumC3167 f6016;

    /* JADX INFO: renamed from: ᩳۜ */
    public static final EnumC3167 f6017;

    /* JADX INFO: renamed from: ᩳۧ */
    public static final EnumC3167 f6018;

    /* JADX INFO: renamed from: ᩳܳ */
    public static final EnumC3167 f6019;

    /* JADX INFO: renamed from: ᩳܽ */
    public static final EnumC3167 f6020;

    /* JADX INFO: renamed from: ᩳܿ */
    public static final EnumC3167 f6021;

    /* JADX INFO: renamed from: ᩳᩳ */
    public static final EnumC3167 f6022;

    /* JADX INFO: renamed from: ᩳ᩻ */
    public static final EnumC3167 f6023;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC3167 f6024;

    /* JADX INFO: renamed from: ᩴۜ */
    public static final EnumC3167 f6025;

    /* JADX INFO: renamed from: ᩴۧ */
    public static final EnumC3167 f6026;

    /* JADX INFO: renamed from: ᩴܳ */
    public static final EnumC3167 f6027;

    /* JADX INFO: renamed from: ᩴܽ */
    public static final EnumC3167 f6028;

    /* JADX INFO: renamed from: ᩴܿ */
    public static final EnumC3167 f6029;

    /* JADX INFO: renamed from: ᩴᩳ */
    public static final EnumC3167 f6030;

    /* JADX INFO: renamed from: ᩴ᩻ */
    public static final EnumC3167 f6031;

    /* JADX INFO: renamed from: ᩵֫ */
    public static final EnumC3167 f6032;

    /* JADX INFO: renamed from: ᩵ۜ */
    public static final EnumC3167 f6033;

    /* JADX INFO: renamed from: ᩵ۧ */
    public static final EnumC3167 f6034;

    /* JADX INFO: renamed from: ᩵ܳ */
    public static final int f6035 = 2;

    /* JADX INFO: renamed from: ᩵ܽ */
    public static final EnumC3167 f6036;

    /* JADX INFO: renamed from: ᩵ܿ */
    public static final EnumC3167 f6037;

    /* JADX INFO: renamed from: ᩵ᩳ */
    public static final EnumC3167 f6038;

    /* JADX INFO: renamed from: ᩵᩻ */
    public static final EnumC3167 f6039;

    /* JADX INFO: renamed from: ᩶֫ */
    public static final EnumC3167 f6040;

    /* JADX INFO: renamed from: ᩶ۜ */
    public static final EnumC3167 f6041;

    /* JADX INFO: renamed from: ᩶ۧ */
    public static final EnumC3167 f6042;

    /* JADX INFO: renamed from: ᩶ܳ */
    public static final EnumC3167 f6043;

    /* JADX INFO: renamed from: ᩶ܽ */
    public static final EnumC3167 f6044;

    /* JADX INFO: renamed from: ᩶ܿ */
    public static final EnumC3167 f6045;

    /* JADX INFO: renamed from: ᩶ᩳ */
    public static final EnumC3167 f6046;

    /* JADX INFO: renamed from: ᩶᩻ */
    public static final EnumC3167 f6047;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final EnumC3167 f6048;

    /* JADX INFO: renamed from: ᩷ۜ */
    public static final EnumC3167 f6049;

    /* JADX INFO: renamed from: ᩷ۧ */
    public static final EnumC3167 f6050;

    /* JADX INFO: renamed from: ᩷ܳ */
    public static final EnumC3167 f6051;

    /* JADX INFO: renamed from: ᩷ܽ */
    public static final EnumC3167 f6052;

    /* JADX INFO: renamed from: ᩷ܿ */
    public static final EnumC3167 f6053;

    /* JADX INFO: renamed from: ᩷ᩳ */
    public static final EnumC3167 f6054;

    /* JADX INFO: renamed from: ᩷᩻ */
    public static final EnumC3167 f6055;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final EnumC3167 f6056;

    /* JADX INFO: renamed from: ᩸ۜ */
    public static final EnumC3167 f6057;

    /* JADX INFO: renamed from: ᩸ۧ */
    public static final EnumC3167 f6058;

    /* JADX INFO: renamed from: ᩸ܳ */
    public static final EnumC3167 f6059;

    /* JADX INFO: renamed from: ᩸ܽ */
    public static final EnumC3167 f6060;

    /* JADX INFO: renamed from: ᩸ܿ */
    public static final EnumC3167 f6061;

    /* JADX INFO: renamed from: ᩸ᩳ */
    public static final EnumC3167 f6062;

    /* JADX INFO: renamed from: ᩸᩻ */
    public static final EnumC3167 f6063;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final EnumC3167 f6064;

    /* JADX INFO: renamed from: ᩹ۜ */
    public static final EnumC3167 f6065;

    /* JADX INFO: renamed from: ᩹ۧ */
    public static final EnumC3167 f6066;

    /* JADX INFO: renamed from: ᩹ܳ */
    public static final EnumC3167 f6067;

    /* JADX INFO: renamed from: ᩹ܽ */
    public static final EnumC3167 f6068;

    /* JADX INFO: renamed from: ᩹ܿ */
    public static final EnumC3167 f6069;

    /* JADX INFO: renamed from: ᩹ᩳ */
    public static final EnumC3167 f6070;

    /* JADX INFO: renamed from: ᩹᩻ */
    public static final EnumC3167 f6071;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC3167 f6072;

    /* JADX INFO: renamed from: ᩺֫ */
    public static final EnumC3167 f6073;

    /* JADX INFO: renamed from: ᩺ۜ */
    public static final EnumC3167 f6074;

    /* JADX INFO: renamed from: ᩺ۧ */
    public static final EnumC3167 f6075;

    /* JADX INFO: renamed from: ᩺ܳ */
    public static final EnumC3167 f6076;

    /* JADX INFO: renamed from: ᩺ܽ */
    public static final EnumC3167 f6077;

    /* JADX INFO: renamed from: ᩺ܿ */
    public static final EnumC3167 f6078;

    /* JADX INFO: renamed from: ᩺ᩳ */
    public static final EnumC3167 f6079;

    /* JADX INFO: renamed from: ᩺᩻ */
    public static final EnumC3167 f6080;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final EnumC3167 f6081;

    /* JADX INFO: renamed from: ᩻ۜ */
    public static final EnumC3167 f6082;

    /* JADX INFO: renamed from: ᩻ۧ */
    public static final EnumC3167 f6083;

    /* JADX INFO: renamed from: ᩻ܳ */
    public static final EnumC3167 f6084;

    /* JADX INFO: renamed from: ᩻ܽ */
    public static final EnumC3167 f6085;

    /* JADX INFO: renamed from: ᩻ܿ */
    public static final EnumC3167 f6086;

    /* JADX INFO: renamed from: ᩻ᩳ */
    public static final EnumC3167 f6087;

    /* JADX INFO: renamed from: ᩻᩻ */
    public static final EnumC3167 f6088;

    /* JADX INFO: renamed from: ۗ */
    public final String f6089;

    /* JADX INFO: renamed from: ۙ */
    public final EnumC5850 f6090;

    /* JADX INFO: renamed from: ۫ */
    public final int f6091;

    /* JADX INFO: renamed from: ۬ */
    public final int f6092;

    /* JADX INFO: renamed from: ᩶ */
    public final int f6093;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9410 f6094;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC9410 f6095;

    /* JADX INFO: renamed from: ܳ */
    public static int m5439(int i) {
        return (i & 65535) | (-65536);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m5441(int i) {
        return i << 16;
    }

    public static EnumC3167 valueOf(String str) {
        return (EnumC3167) Enum.valueOf(EnumC3167.class, str);
    }

    public static EnumC3167[] values() {
        return (EnumC3167[]) f5925.clone();
    }

    /* JADX INFO: renamed from: ֨ */
    public static /* synthetic */ EnumC3167[] m5433() {
        return new EnumC3167[]{f5839, f5873, f5989, f5825, f5956, f5882, f5931, f6061, f6045, f6069, f5865, f5964, f5849, f5906, f6023, f5941, f6088, f6007, f5978, f6010, f6018, f5887, f5854, f6026, f5838, f6034, f5911, f5994, f6083, f6037, f5817, f6073, f5940, f5959, f5995, f5912, f6075, f5970, f5895, f5902, f6020, f6012, f5980, f6067, f5975, f5936, f5894, f5830, f5968, f6002, f6085, f5816, f6028, f6052, f5913, f5840, f5889, f5872, f6036, f5921, f5996, f5856, f5976, f5992, f5917, f6081, f5885, f6048, f5909, f5901, f5844, f6040, f5984, f6056, f6064, f5860, f5824, f5972, f5848, f5905, f6060, f6044, f5881, f5932, f6053, f5939, f5883, f6079, f5899, f5981, f5843, f5991, f5819, f5859, f6031, f6039, f5827, f5829, f6049, f6009, f5935, f6001, f6017, f6082, f5866, f5990, f5915, f5826, f5858, f5957, f6046, f5842, f5907, f6030, f6051, f5855, f5920, f6027, f5888, f6084, f6087, f5982, f6014, f6029, f5857, f5841, f5938, f6004, f5832, f5953, f5928, f5961, f6006, f6022, f5891, f5893, f6033, f5831, f5986, f5880, f5852, f5815, f5952, f6071, f5958, f6057, f6016, f5869, f6011, f5862, f5896, f5868, f5987, f6074, f5851, f5950, f5861, f6072, f5853, f5973, f5822, f5954, f5876, f5993, f5948, f5814, f5847, f5828, f5813, f5937, f6058, f5946, f6024, f5871, f5927, f6047, f5933, f6065, f6008, f5821, f5979, f5846, f5835, f5820, f6059, f5969, f5966, f6080, f5845, f5967, f6025, f5898, f5903, f5929, f5942, f5837, f6078, f5870, f5962, f5934, f5892, f6003, f6066, f6076, f6032, f5823, f5878, f6000, f6055, f6019, f6042, f5971, f5812, f5904, f5944, f5867, f5884, f6041, f6077, f5890, f5908, f5886, f5955, f5834, f5914, f6063, f5918, f5985, f5879, f5945, f5998, f6038, f6015, f5983, f5930, f5897, f5963, f6013, f5922, f6005, f5949, f5974, f5833, f6086, f5988, f6068, f5864, f5947, f5850, f5965, f6062, f6070, f6021, f5875, f5977, f6043, f5900, f5951, f5818, f5874, f6054, f5923, f6050, f5919};
    }

    static {
        EnumC5850 enumC5850 = EnumC5850.Format10x;
        f5839 = new EnumC3167("NOP", 0, 0, "nop", 7, enumC5850, 4);
        EnumC5850 enumC5851 = EnumC5850.Format12x;
        f5873 = new EnumC3167("MOVE", 1, 1, "move", 7, enumC5851, 20);
        EnumC5850 enumC5852 = EnumC5850.Format22x;
        f5989 = new EnumC3167("MOVE_FROM16", 2, 2, "move/from16", 7, enumC5852, 20);
        EnumC5850 enumC5853 = EnumC5850.Format32x;
        f5825 = new EnumC3167("MOVE_16", 3, 3, "move/16", 7, enumC5853, 20);
        f5956 = new EnumC3167("MOVE_WIDE", 4, 4, "move-wide", 7, enumC5851, 52);
        f5882 = new EnumC3167("MOVE_WIDE_FROM16", 5, 5, "move-wide/from16", 7, enumC5852, 52);
        f5931 = new EnumC3167("MOVE_WIDE_16", 6, 6, "move-wide/16", 7, enumC5853, 52);
        f6061 = new EnumC3167("MOVE_OBJECT", 7, 7, "move-object", 7, enumC5851, 20);
        f6045 = new EnumC3167("MOVE_OBJECT_FROM16", 8, 8, "move-object/from16", 7, enumC5852, 20);
        f6069 = new EnumC3167("MOVE_OBJECT_16", 9, 9, "move-object/16", 7, enumC5853, 20);
        EnumC5850 enumC5854 = EnumC5850.Format11x;
        f5865 = new EnumC3167("MOVE_RESULT", 10, 10, "move-result", 7, enumC5854, 20);
        f5964 = new EnumC3167("MOVE_RESULT_WIDE", 11, 11, "move-result-wide", 7, enumC5854, 52);
        f5849 = new EnumC3167("MOVE_RESULT_OBJECT", 12, 12, "move-result-object", 7, enumC5854, 20);
        f5906 = new EnumC3167("MOVE_EXCEPTION", 13, 13, "move-exception", 7, enumC5854, 20);
        f6023 = new EnumC3167("RETURN_VOID", 14, 14, "return-void", 7, enumC5850);
        f5941 = new EnumC3167("RETURN", 15, 15, "return", 7, enumC5854);
        f6088 = new EnumC3167("RETURN_WIDE", 16, 16, "return-wide", 7, enumC5854);
        f6007 = new EnumC3167("RETURN_OBJECT", 17, 17, "return-object", 7, enumC5854);
        f5978 = new EnumC3167("CONST_4", 18, 18, "const/4", 7, EnumC5850.Format11n, 20);
        EnumC5850 enumC5855 = EnumC5850.Format21s;
        f6010 = new EnumC3167("CONST_16", 19, 19, "const/16", 7, enumC5855, 20);
        EnumC5850 enumC5856 = EnumC5850.Format31i;
        f6018 = new EnumC3167("CONST", 20, 20, "const", 7, enumC5856, 20);
        f5887 = new EnumC3167("CONST_HIGH16", 21, 21, "const/high16", 7, EnumC5850.Format21ih, 20);
        f5854 = new EnumC3167("CONST_WIDE_16", 22, 22, "const-wide/16", 7, enumC5855, 52);
        f6026 = new EnumC3167("CONST_WIDE_32", 23, 23, "const-wide/32", 7, enumC5856, 52);
        f5838 = new EnumC3167("CONST_WIDE", 24, 24, "const-wide", 7, EnumC5850.Format51l, 52);
        f6034 = new EnumC3167("CONST_WIDE_HIGH16", 25, 25, "const-wide/high16", 7, EnumC5850.Format21lh, 52);
        EnumC5850 enumC5857 = EnumC5850.Format21c;
        f5911 = new EnumC3167("CONST_STRING", 26, 26, "const-string", 0, enumC5857, 21);
        f5994 = new EnumC3167("CONST_STRING_JUMBO", 27, 27, "const-string/jumbo", 0, EnumC5850.Format31c, 21);
        f6083 = new EnumC3167("CONST_CLASS", 28, 28, "const-class", 1, enumC5857, 21);
        f6037 = new EnumC3167("MONITOR_ENTER", 29, 29, "monitor-enter", 7, enumC5854, 5);
        f5817 = new EnumC3167("MONITOR_EXIT", 30, 30, "monitor-exit", 7, enumC5854, 5);
        f6073 = new EnumC3167("CHECK_CAST", 31, 31, "check-cast", 1, enumC5857, 21);
        EnumC5850 enumC5858 = EnumC5850.Format22c;
        f5940 = new EnumC3167("INSTANCE_OF", 32, 32, "instance-of", 1, enumC5858, 21);
        f5959 = new EnumC3167("ARRAY_LENGTH", 33, 33, "array-length", 7, enumC5851, 21);
        f5995 = new EnumC3167("NEW_INSTANCE", 34, 34, "new-instance", 1, enumC5857, 21);
        f5912 = new EnumC3167("NEW_ARRAY", 35, 35, "new-array", 1, enumC5858, 21);
        EnumC5850 enumC5859 = EnumC5850.Format35c;
        f6075 = new EnumC3167("FILLED_NEW_ARRAY", 36, 36, "filled-new-array", 1, enumC5859, 13);
        EnumC5850 enumC58510 = EnumC5850.Format3rc;
        f5970 = new EnumC3167("FILLED_NEW_ARRAY_RANGE", 37, 37, "filled-new-array/range", 1, enumC58510, 13);
        EnumC5850 enumC58511 = EnumC5850.Format31t;
        f5895 = new EnumC3167("FILL_ARRAY_DATA", 38, 38, "fill-array-data", 7, enumC58511, 4);
        f5902 = new EnumC3167("THROW", 39, 39, "throw", 7, enumC5854, 1);
        f6020 = new EnumC3167("GOTO", 40, 40, "goto", 7, EnumC5850.Format10t);
        f6012 = new EnumC3167("GOTO_16", 41, 41, "goto/16", 7, EnumC5850.Format20t);
        f5980 = new EnumC3167("GOTO_32", 42, 42, "goto/32", 7, EnumC5850.Format30t);
        f6067 = new EnumC3167("PACKED_SWITCH", 43, 43, "packed-switch", 7, enumC58511, 4);
        f5975 = new EnumC3167("SPARSE_SWITCH", 44, 44, "sparse-switch", 7, enumC58511, 4);
        EnumC5850 enumC58512 = EnumC5850.Format23x;
        f5936 = new EnumC3167("CMPL_FLOAT", 45, 45, "cmpl-float", 7, enumC58512, 20);
        f5894 = new EnumC3167("CMPG_FLOAT", 46, 46, "cmpg-float", 7, enumC58512, 20);
        f5830 = new EnumC3167("CMPL_DOUBLE", 47, 47, "cmpl-double", 7, enumC58512, 20);
        f5968 = new EnumC3167("CMPG_DOUBLE", 48, 48, "cmpg-double", 7, enumC58512, 20);
        f6002 = new EnumC3167("CMP_LONG", 49, 49, "cmp-long", 7, enumC58512, 20);
        EnumC5850 enumC58513 = EnumC5850.Format22t;
        f6085 = new EnumC3167("IF_EQ", 50, 50, "if-eq", 7, enumC58513, 4);
        f5816 = new EnumC3167("IF_NE", 51, 51, "if-ne", 7, enumC58513, 4);
        f6028 = new EnumC3167("IF_LT", 52, 52, "if-lt", 7, enumC58513, 4);
        f6052 = new EnumC3167("IF_GE", 53, 53, "if-ge", 7, enumC58513, 4);
        f5913 = new EnumC3167("IF_GT", 54, 54, "if-gt", 7, enumC58513, 4);
        f5840 = new EnumC3167("IF_LE", 55, 55, "if-le", 7, enumC58513, 4);
        EnumC5850 enumC58514 = EnumC5850.Format21t;
        f5889 = new EnumC3167("IF_EQZ", 56, 56, "if-eqz", 7, enumC58514, 4);
        f5872 = new EnumC3167("IF_NEZ", 57, 57, "if-nez", 7, enumC58514, 4);
        f6036 = new EnumC3167("IF_LTZ", 58, 58, "if-ltz", 7, enumC58514, 4);
        f5921 = new EnumC3167("IF_GEZ", 59, 59, "if-gez", 7, enumC58514, 4);
        f5996 = new EnumC3167("IF_GTZ", 60, 60, "if-gtz", 7, enumC58514, 4);
        f5856 = new EnumC3167("IF_LEZ", 61, 61, "if-lez", 7, enumC58514, 4);
        f5976 = new EnumC3167("AGET", 62, 68, "aget", 7, enumC58512, 21);
        f5992 = new EnumC3167("AGET_WIDE", 63, 69, "aget-wide", 7, enumC58512, 53);
        f5917 = new EnumC3167("AGET_OBJECT", 64, 70, "aget-object", 7, enumC58512, 21);
        f6081 = new EnumC3167("AGET_BOOLEAN", 65, 71, "aget-boolean", 7, enumC58512, 21);
        f5885 = new EnumC3167("AGET_BYTE", 66, 72, "aget-byte", 7, enumC58512, 21);
        f6048 = new EnumC3167("AGET_CHAR", 67, 73, "aget-char", 7, enumC58512, 21);
        f5909 = new EnumC3167("AGET_SHORT", 68, 74, "aget-short", 7, enumC58512, 21);
        f5901 = new EnumC3167("APUT", 69, 75, "aput", 7, enumC58512, 5);
        f5844 = new EnumC3167("APUT_WIDE", 70, 76, "aput-wide", 7, enumC58512, 5);
        f6040 = new EnumC3167("APUT_OBJECT", 71, 77, "aput-object", 7, enumC58512, 5);
        f5984 = new EnumC3167("APUT_BOOLEAN", 72, 78, "aput-boolean", 7, enumC58512, 5);
        f6056 = new EnumC3167("APUT_BYTE", 73, 79, "aput-byte", 7, enumC58512, 5);
        f6064 = new EnumC3167("APUT_CHAR", 74, 80, "aput-char", 7, enumC58512, 5);
        f5860 = new EnumC3167("APUT_SHORT", 75, 81, "aput-short", 7, enumC58512, 5);
        f5824 = new EnumC3167("IGET", 76, 82, "iget", 2, enumC5858, 21);
        f5972 = new EnumC3167("IGET_WIDE", 77, 83, "iget-wide", 2, enumC5858, 53);
        f5848 = new EnumC3167("IGET_OBJECT", 78, 84, "iget-object", 2, enumC5858, 21);
        f5905 = new EnumC3167("IGET_BOOLEAN", 79, 85, "iget-boolean", 2, enumC5858, 21);
        f6060 = new EnumC3167("IGET_BYTE", 80, 86, "iget-byte", 2, enumC5858, 21);
        f6044 = new EnumC3167("IGET_CHAR", 81, 87, "iget-char", 2, enumC5858, 21);
        f5881 = new EnumC3167("IGET_SHORT", 82, 88, "iget-short", 2, enumC5858, 21);
        f5932 = new EnumC3167("IPUT", 83, 89, "iput", 2, enumC5858, 5);
        f6053 = new EnumC3167("IPUT_WIDE", 84, 90, "iput-wide", 2, enumC5858, 5);
        f5939 = new EnumC3167("IPUT_OBJECT", 85, 91, "iput-object", 2, enumC5858, 5);
        f5883 = new EnumC3167("IPUT_BOOLEAN", 86, 92, "iput-boolean", 2, enumC5858, 5);
        f6079 = new EnumC3167("IPUT_BYTE", 87, 93, "iput-byte", 2, enumC5858, 5);
        f5899 = new EnumC3167("IPUT_CHAR", 88, 94, "iput-char", 2, enumC5858, 5);
        f5981 = new EnumC3167("IPUT_SHORT", 89, 95, "iput-short", 2, enumC5858, 5);
        f5843 = new EnumC3167("SGET", 90, 96, "sget", 2, enumC5857, 277);
        f5991 = new EnumC3167("SGET_WIDE", 91, 97, "sget-wide", 2, enumC5857, 309);
        f5819 = new EnumC3167("SGET_OBJECT", 92, 98, "sget-object", 2, enumC5857, 277);
        f5859 = new EnumC3167("SGET_BOOLEAN", 93, 99, "sget-boolean", 2, enumC5857, 277);
        f6031 = new EnumC3167("SGET_BYTE", 94, 100, "sget-byte", 2, enumC5857, 277);
        f6039 = new EnumC3167("SGET_CHAR", 95, 101, "sget-char", 2, enumC5857, 277);
        f5827 = new EnumC3167("SGET_SHORT", 96, IShizukuService.Stub.TRANSACTION_attachUserService, "sget-short", 2, enumC5857, 277);
        f5829 = new EnumC3167("SPUT", 97, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "sput", 2, enumC5857, 261);
        f6049 = new EnumC3167("SPUT_WIDE", 98, IShizukuService.Stub.TRANSACTION_isHidden, "sput-wide", 2, enumC5857, 261);
        f6009 = new EnumC3167("SPUT_OBJECT", 99, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "sput-object", 2, enumC5857, 261);
        f5935 = new EnumC3167("SPUT_BOOLEAN", 100, IShizukuService.Stub.TRANSACTION_getFlagsForUid, "sput-boolean", 2, enumC5857, 261);
        f6001 = new EnumC3167("SPUT_BYTE", 101, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "sput-byte", 2, enumC5857, 261);
        f6017 = new EnumC3167("SPUT_CHAR", IShizukuService.Stub.TRANSACTION_attachUserService, 108, "sput-char", 2, enumC5857, 261);
        f6082 = new EnumC3167("SPUT_SHORT", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 109, "sput-short", 2, enumC5857, 261);
        f5866 = new EnumC3167("INVOKE_VIRTUAL", IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_JSON_FAILED, "invoke-virtual", 3, enumC5859, 13);
        f5990 = new EnumC3167("INVOKE_SUPER", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, UMErrorCode.E_UM_BE_CREATE_FAILED, "invoke-super", 3, enumC5859, 13);
        f5915 = new EnumC3167("INVOKE_DIRECT", IShizukuService.Stub.TRANSACTION_getFlagsForUid, UMErrorCode.E_UM_BE_DEFLATE_FAILED, "invoke-direct", 3, enumC5859, 1037);
        f5826 = new EnumC3167("INVOKE_STATIC", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, UMErrorCode.E_UM_BE_RAW_OVERSIZE, "invoke-static", 3, enumC5859, 13);
        f5858 = new EnumC3167("INVOKE_INTERFACE", 108, 114, "invoke-interface", 3, enumC5859, 13);
        f5957 = new EnumC3167("INVOKE_VIRTUAL_RANGE", 109, 116, "invoke-virtual/range", 3, enumC58510, 13);
        f6046 = new EnumC3167("INVOKE_SUPER_RANGE", UMErrorCode.E_UM_BE_JSON_FAILED, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, "invoke-super/range", 3, enumC58510, 13);
        f5842 = new EnumC3167("INVOKE_DIRECT_RANGE", UMErrorCode.E_UM_BE_CREATE_FAILED, 118, "invoke-direct/range", 3, enumC58510, 1037);
        f5907 = new EnumC3167("INVOKE_STATIC_RANGE", UMErrorCode.E_UM_BE_DEFLATE_FAILED, 119, "invoke-static/range", 3, enumC58510, 13);
        f6030 = new EnumC3167("INVOKE_INTERFACE_RANGE", UMErrorCode.E_UM_BE_RAW_OVERSIZE, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, "invoke-interface/range", 3, enumC58510, 13);
        f6051 = new EnumC3167("NEG_INT", 114, 123, "neg-int", 7, enumC5851, 20);
        f5855 = new EnumC3167("NOT_INT", 115, 124, "not-int", 7, enumC5851, 20);
        f5920 = new EnumC3167("NEG_LONG", 116, C0254q.f1218h, "neg-long", 7, enumC5851, 52);
        f6027 = new EnumC3167("NOT_LONG", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 126, "not-long", 7, enumC5851, 52);
        f5888 = new EnumC3167("NEG_FLOAT", 118, 127, "neg-float", 7, enumC5851, 20);
        f6084 = new EnumC3167("NEG_DOUBLE", 119, 128, "neg-double", 7, enumC5851, 52);
        f6087 = new EnumC3167("INT_TO_LONG", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 129, "int-to-long", 7, enumC5851, 52);
        f5982 = new EnumC3167("INT_TO_FLOAT", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 130, "int-to-float", 7, enumC5851, 20);
        f6014 = new EnumC3167("INT_TO_DOUBLE", 122, 131, "int-to-double", 7, enumC5851, 52);
        f6029 = new EnumC3167("LONG_TO_INT", 123, 132, "long-to-int", 7, enumC5851, 20);
        f5857 = new EnumC3167("LONG_TO_FLOAT", 124, 133, "long-to-float", 7, enumC5851, 20);
        f5841 = new EnumC3167("LONG_TO_DOUBLE", C0254q.f1218h, 134, "long-to-double", 7, enumC5851, 52);
        f5938 = new EnumC3167("FLOAT_TO_INT", 126, 135, "float-to-int", 7, enumC5851, 20);
        f6004 = new EnumC3167("FLOAT_TO_LONG", 127, 136, "float-to-long", 7, enumC5851, 52);
        f5832 = new EnumC3167("FLOAT_TO_DOUBLE", 128, 137, "float-to-double", 7, enumC5851, 52);
        f5953 = new EnumC3167("DOUBLE_TO_INT", 129, 138, "double-to-int", 7, enumC5851, 20);
        f5928 = new EnumC3167("DOUBLE_TO_LONG", 130, 139, "double-to-long", 7, enumC5851, 52);
        f5961 = new EnumC3167("DOUBLE_TO_FLOAT", 131, 140, "double-to-float", 7, enumC5851, 20);
        f6006 = new EnumC3167("INT_TO_BYTE", 132, 141, "int-to-byte", 7, enumC5851, 20);
        f6022 = new EnumC3167("INT_TO_CHAR", 133, 142, "int-to-char", 7, enumC5851, 20);
        f5891 = new EnumC3167("INT_TO_SHORT", 134, 143, "int-to-short", 7, enumC5851, 20);
        f5893 = new EnumC3167("ADD_INT", 135, 144, "add-int", 7, enumC58512, 20);
        f6033 = new EnumC3167("SUB_INT", 136, 145, "sub-int", 7, enumC58512, 20);
        f5831 = new EnumC3167("MUL_INT", 137, 146, "mul-int", 7, enumC58512, 20);
        f5986 = new EnumC3167("DIV_INT", 138, 147, "div-int", 7, enumC58512, 21);
        f5880 = new EnumC3167("REM_INT", 139, 148, "rem-int", 7, enumC58512, 21);
        f5852 = new EnumC3167("AND_INT", 140, 149, "and-int", 7, enumC58512, 20);
        f5815 = new EnumC3167("OR_INT", 141, 150, "or-int", 7, enumC58512, 20);
        f5952 = new EnumC3167("XOR_INT", 142, 151, "xor-int", 7, enumC58512, 20);
        f6071 = new EnumC3167("SHL_INT", 143, 152, "shl-int", 7, enumC58512, 20);
        f5958 = new EnumC3167("SHR_INT", 144, 153, "shr-int", 7, enumC58512, 20);
        f6057 = new EnumC3167("USHR_INT", 145, EnumC19222.f57460, "ushr-int", 7, enumC58512, 20);
        f6016 = new EnumC3167("ADD_LONG", 146, 155, "add-long", 7, enumC58512, 52);
        f5869 = new EnumC3167("SUB_LONG", 147, 156, "sub-long", 7, enumC58512, 52);
        f6011 = new EnumC3167("MUL_LONG", 148, 157, "mul-long", 7, enumC58512, 52);
        f5862 = new EnumC3167("DIV_LONG", 149, 158, "div-long", 7, enumC58512, 53);
        f5896 = new EnumC3167("REM_LONG", 150, 159, "rem-long", 7, enumC58512, 53);
        f5868 = new EnumC3167("AND_LONG", 151, DHParameters.DEFAULT_MINIMUM_LENGTH, "and-long", 7, enumC58512, 52);
        f5987 = new EnumC3167("OR_LONG", 152, 161, "or-long", 7, enumC58512, 52);
        f6074 = new EnumC3167("XOR_LONG", 153, 162, "xor-long", 7, enumC58512, 52);
        f5851 = new EnumC3167("SHL_LONG", EnumC19222.f57460, 163, "shl-long", 7, enumC58512, 52);
        f5950 = new EnumC3167("SHR_LONG", 155, 164, "shr-long", 7, enumC58512, 52);
        f5861 = new EnumC3167("USHR_LONG", 156, 165, "ushr-long", 7, enumC58512, 52);
        f6072 = new EnumC3167("ADD_FLOAT", 157, 166, "add-float", 7, enumC58512, 20);
        f5853 = new EnumC3167("SUB_FLOAT", 158, 167, "sub-float", 7, enumC58512, 20);
        f5973 = new EnumC3167("MUL_FLOAT", 159, 168, "mul-float", 7, enumC58512, 20);
        f5822 = new EnumC3167("DIV_FLOAT", DHParameters.DEFAULT_MINIMUM_LENGTH, 169, "div-float", 7, enumC58512, 20);
        f5954 = new EnumC3167("REM_FLOAT", 161, 170, "rem-float", 7, enumC58512, 20);
        f5876 = new EnumC3167("ADD_DOUBLE", 162, 171, "add-double", 7, enumC58512, 52);
        f5993 = new EnumC3167("SUB_DOUBLE", 163, 172, "sub-double", 7, enumC58512, 52);
        f5948 = new EnumC3167("MUL_DOUBLE", 164, 173, "mul-double", 7, enumC58512, 52);
        f5814 = new EnumC3167("DIV_DOUBLE", 165, 174, "div-double", 7, enumC58512, 52);
        f5847 = new EnumC3167("REM_DOUBLE", 166, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, "rem-double", 7, enumC58512, 52);
        f5828 = new EnumC3167("ADD_INT_2ADDR", 167, PicnicEngine.MAX_AUX_BYTES, "add-int/2addr", 7, enumC5851, 20);
        f5813 = new EnumC3167("SUB_INT_2ADDR", 168, 177, "sub-int/2addr", 7, enumC5851, 20);
        f5937 = new EnumC3167("MUL_INT_2ADDR", 169, 178, "mul-int/2addr", 7, enumC5851, 20);
        f6058 = new EnumC3167("DIV_INT_2ADDR", 170, 179, "div-int/2addr", 7, enumC5851, 21);
        f5946 = new EnumC3167("REM_INT_2ADDR", 171, 180, "rem-int/2addr", 7, enumC5851, 21);
        f6024 = new EnumC3167("AND_INT_2ADDR", 172, 181, "and-int/2addr", 7, enumC5851, 20);
        f5871 = new EnumC3167("OR_INT_2ADDR", 173, 182, "or-int/2addr", 7, enumC5851, 20);
        f5927 = new EnumC3167("XOR_INT_2ADDR", 174, 183, "xor-int/2addr", 7, enumC5851, 20);
        f6047 = new EnumC3167("SHL_INT_2ADDR", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 184, "shl-int/2addr", 7, enumC5851, 20);
        f5933 = new EnumC3167("SHR_INT_2ADDR", PicnicEngine.MAX_AUX_BYTES, 185, "shr-int/2addr", 7, enumC5851, 20);
        f6065 = new EnumC3167("USHR_INT_2ADDR", 177, 186, "ushr-int/2addr", 7, enumC5851, 20);
        f6008 = new EnumC3167("ADD_LONG_2ADDR", 178, 187, "add-long/2addr", 7, enumC5851, 52);
        f5821 = new EnumC3167("SUB_LONG_2ADDR", 179, 188, "sub-long/2addr", 7, enumC5851, 52);
        f5979 = new EnumC3167("MUL_LONG_2ADDR", 180, 189, "mul-long/2addr", 7, enumC5851, 52);
        f5846 = new EnumC3167("DIV_LONG_2ADDR", 181, 190, "div-long/2addr", 7, enumC5851, 53);
        f5835 = new EnumC3167("REM_LONG_2ADDR", 182, 191, "rem-long/2addr", 7, enumC5851, 53);
        f5820 = new EnumC3167("AND_LONG_2ADDR", 183, 192, "and-long/2addr", 7, enumC5851, 52);
        f6059 = new EnumC3167("OR_LONG_2ADDR", 184, 193, "or-long/2addr", 7, enumC5851, 52);
        f5969 = new EnumC3167("XOR_LONG_2ADDR", 185, 194, "xor-long/2addr", 7, enumC5851, 52);
        f5966 = new EnumC3167("SHL_LONG_2ADDR", 186, 195, "shl-long/2addr", 7, enumC5851, 52);
        f6080 = new EnumC3167("SHR_LONG_2ADDR", 187, 196, "shr-long/2addr", 7, enumC5851, 52);
        f5845 = new EnumC3167("USHR_LONG_2ADDR", 188, 197, "ushr-long/2addr", 7, enumC5851, 52);
        f5967 = new EnumC3167("ADD_FLOAT_2ADDR", 189, 198, "add-float/2addr", 7, enumC5851, 20);
        f6025 = new EnumC3167("SUB_FLOAT_2ADDR", 190, 199, "sub-float/2addr", 7, enumC5851, 20);
        f5898 = new EnumC3167("MUL_FLOAT_2ADDR", 191, 200, "mul-float/2addr", 7, enumC5851, 20);
        f5903 = new EnumC3167("DIV_FLOAT_2ADDR", 192, 201, "div-float/2addr", 7, enumC5851, 20);
        f5929 = new EnumC3167("REM_FLOAT_2ADDR", 193, 202, "rem-float/2addr", 7, enumC5851, 20);
        f5942 = new EnumC3167("ADD_DOUBLE_2ADDR", 194, 203, "add-double/2addr", 7, enumC5851, 52);
        f5837 = new EnumC3167("SUB_DOUBLE_2ADDR", 195, 204, "sub-double/2addr", 7, enumC5851, 52);
        f6078 = new EnumC3167("MUL_DOUBLE_2ADDR", 196, 205, "mul-double/2addr", 7, enumC5851, 52);
        f5870 = new EnumC3167("DIV_DOUBLE_2ADDR", 197, 206, "div-double/2addr", 7, enumC5851, 52);
        f5962 = new EnumC3167("REM_DOUBLE_2ADDR", 198, 207, "rem-double/2addr", 7, enumC5851, 52);
        EnumC5850 enumC58515 = EnumC5850.Format22s;
        f5934 = new EnumC3167("ADD_INT_LIT16", 199, 208, "add-int/lit16", 7, enumC58515, 20);
        f5892 = new EnumC3167("RSUB_INT", 200, 209, "rsub-int", 7, enumC58515, 20);
        f6003 = new EnumC3167("MUL_INT_LIT16", 201, 210, "mul-int/lit16", 7, enumC58515, 20);
        f6066 = new EnumC3167("DIV_INT_LIT16", 202, Primes.SMALL_FACTOR_LIMIT, "div-int/lit16", 7, enumC58515, 21);
        f6076 = new EnumC3167("REM_INT_LIT16", 203, 212, "rem-int/lit16", 7, enumC58515, 21);
        f6032 = new EnumC3167("AND_INT_LIT16", 204, 213, "and-int/lit16", 7, enumC58515, 20);
        f5823 = new EnumC3167("OR_INT_LIT16", 205, 214, "or-int/lit16", 7, enumC58515, 20);
        f5878 = new EnumC3167("XOR_INT_LIT16", 206, 215, "xor-int/lit16", 7, enumC58515, 20);
        EnumC5850 enumC58516 = EnumC5850.Format22b;
        f6000 = new EnumC3167("ADD_INT_LIT8", 207, 216, "add-int/lit8", 7, enumC58516, 20);
        f6055 = new EnumC3167("RSUB_INT_LIT8", 208, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, "rsub-int/lit8", 7, enumC58516, 20);
        f6019 = new EnumC3167("MUL_INT_LIT8", 209, 218, "mul-int/lit8", 7, enumC58516, 20);
        f6042 = new EnumC3167("DIV_INT_LIT8", 210, 219, "div-int/lit8", 7, enumC58516, 21);
        f5971 = new EnumC3167("REM_INT_LIT8", Primes.SMALL_FACTOR_LIMIT, 220, "rem-int/lit8", 7, enumC58516, 21);
        f5812 = new EnumC3167("AND_INT_LIT8", 212, 221, "and-int/lit8", 7, enumC58516, 20);
        f5904 = new EnumC3167("OR_INT_LIT8", 213, 222, "or-int/lit8", 7, enumC58516, 20);
        f5944 = new EnumC3167("XOR_INT_LIT8", 214, 223, "xor-int/lit8", 7, enumC58516, 20);
        f5867 = new EnumC3167("SHL_INT_LIT8", 215, BERTags.FLAGS, "shl-int/lit8", 7, enumC58516, 20);
        f5884 = new EnumC3167("SHR_INT_LIT8", 216, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, "shr-int/lit8", 7, enumC58516, 20);
        f6041 = new EnumC3167("USHR_INT_LIT8", IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 226, "ushr-int/lit8", 7, enumC58516, 20);
        f6077 = new EnumC3167("IGET_VOLATILE", 218, m5438(227, 9), "iget-volatile", 2, enumC5858, 151);
        f5890 = new EnumC3167("IPUT_VOLATILE", 219, m5438(228, 9), "iput-volatile", 2, enumC5858, 135);
        f5908 = new EnumC3167("SGET_VOLATILE", 220, m5438(229, 9), "sget-volatile", 2, enumC5857, 407);
        f5886 = new EnumC3167("SPUT_VOLATILE", 221, m5438(230, 9), "sput-volatile", 2, enumC5857, 391);
        f5955 = new EnumC3167("IGET_OBJECT_VOLATILE", 222, m5438(231, 9), "iget-object-volatile", 2, enumC5858, 151);
        f5834 = new EnumC3167("IGET_WIDE_VOLATILE", 223, m5438(232, 9), "iget-wide-volatile", 2, enumC5858, 183);
        f5914 = new EnumC3167("IPUT_WIDE_VOLATILE", BERTags.FLAGS, m5438(233, 9), "iput-wide-volatile", 2, enumC5858, 135);
        f6063 = new EnumC3167("SGET_WIDE_VOLATILE", HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, m5438(234, 9), "sget-wide-volatile", 2, enumC5857, 439);
        f5918 = new EnumC3167("SPUT_WIDE_VOLATILE", 226, m5438(235, 9), "sput-wide-volatile", 2, enumC5857, 391);
        f5985 = new EnumC3167("THROW_VERIFICATION_ERROR", 227, m5438(237, 5), "throw-verification-error", 7, EnumC5850.Format20bc, 3);
        f5879 = new EnumC3167("EXECUTE_INLINE", 228, m5434(238), "execute-inline", 7, EnumC5850.Format35mi, 15);
        f5945 = new EnumC3167("EXECUTE_INLINE_RANGE", 229, m5438(239, 8), "execute-inline/range", 7, EnumC5850.Format3rmi, 15);
        f5998 = new EnumC3167("INVOKE_DIRECT_EMPTY", 230, m5444(240, 13), "invoke-direct-empty", 3, enumC5859, 1039);
        f6038 = new EnumC3167("INVOKE_OBJECT_INIT_RANGE", 231, m5438(240, 14), "invoke-object-init/range", 3, enumC58510, 1039);
        f6015 = new EnumC3167("RETURN_VOID_BARRIER", 232, m5436(m5438(241, 11), m5442(115, 59)), "return-void-barrier", 7, enumC5850, 2);
        f5983 = new EnumC3167("RETURN_VOID_NO_BARRIER", 233, m5440(115, 60), "return-void-no-barrier", 7, enumC5850, 2);
        List listM5436 = m5436(m5434(242), m5437(227));
        EnumC5850 enumC58517 = EnumC5850.Format22cs;
        f5930 = new EnumC3167("IGET_QUICK", 234, listM5436, "iget-quick", 7, enumC58517, 87);
        f5897 = new EnumC3167("IGET_WIDE_QUICK", 235, m5436(m5434(243), m5437(228)), "iget-wide-quick", 7, enumC58517, 119);
        f5963 = new EnumC3167("IGET_OBJECT_QUICK", 236, m5436(m5434(244), m5437(229)), "iget-object-quick", 7, enumC58517, 87);
        f6013 = new EnumC3167("IPUT_QUICK", 237, m5436(m5434(245), m5437(230)), "iput-quick", 7, enumC58517, 71);
        f5922 = new EnumC3167("IPUT_WIDE_QUICK", 238, m5436(m5434(246), m5437(231)), "iput-wide-quick", 7, enumC58517, 71);
        f6005 = new EnumC3167("IPUT_OBJECT_QUICK", 239, m5436(m5434(247), m5437(232)), "iput-object-quick", 7, enumC58517, 71);
        f5949 = new EnumC3167("IPUT_BOOLEAN_QUICK", 240, m5437(235), "iput-boolean-quick", 7, enumC58517, 71);
        f5974 = new EnumC3167("IPUT_BYTE_QUICK", 241, m5437(236), "iput-byte-quick", 7, enumC58517, 71);
        f5833 = new EnumC3167("IPUT_CHAR_QUICK", 242, m5437(237), "iput-char-quick", 7, enumC58517, 71);
        f6086 = new EnumC3167("IPUT_SHORT_QUICK", 243, m5437(238), "iput-short-quick", 7, enumC58517, 71);
        f5988 = new EnumC3167("IGET_BOOLEAN_QUICK", 244, m5437(239), "iget-boolean-quick", 7, enumC58517, 87);
        f6068 = new EnumC3167("IGET_BYTE_QUICK", 245, m5437(240), "iget-byte-quick", 7, enumC58517, 87);
        f5864 = new EnumC3167("IGET_CHAR_QUICK", 246, m5437(241), "iget-char-quick", 7, enumC58517, 87);
        f5947 = new EnumC3167("IGET_SHORT_QUICK", 247, m5437(242), "iget-short-quick", 7, enumC58517, 87);
        List listM5437 = m5436(m5434(248), m5437(233));
        EnumC5850 enumC58518 = EnumC5850.Format35ms;
        f5850 = new EnumC3167("INVOKE_VIRTUAL_QUICK", 248, listM5437, "invoke-virtual-quick", 7, enumC58518, 15);
        List listM5438 = m5436(m5434(249), m5437(234));
        EnumC5850 enumC58519 = EnumC5850.Format3rms;
        f5965 = new EnumC3167("INVOKE_VIRTUAL_QUICK_RANGE", 249, listM5438, "invoke-virtual-quick/range", 7, enumC58519, 15);
        f6062 = new EnumC3167("INVOKE_SUPER_QUICK", 250, m5444(250, 25), "invoke-super-quick", 7, enumC58518, 15);
        f6070 = new EnumC3167("INVOKE_SUPER_QUICK_RANGE", 251, m5444(251, 25), "invoke-super-quick/range", 7, enumC58519, 15);
        f6021 = new EnumC3167("IPUT_OBJECT_VOLATILE", 252, m5438(252, 9), "iput-object-volatile", 2, enumC5858, 135);
        f5875 = new EnumC3167("SGET_OBJECT_VOLATILE", 253, m5438(253, 9), "sget-object-volatile", 2, enumC5857, 407);
        f5977 = new EnumC3167("SPUT_OBJECT_VOLATILE", Scalar25519.TARGET_LENGTH, m5435(Scalar25519.TARGET_LENGTH, 9, 19), "sput-object-volatile", 2, enumC5857, 391);
        f6043 = new EnumC3167("PACKED_SWITCH_PAYLOAD", 255, 256, "packed-switch-payload", 7, EnumC5850.PackedSwitchPayload, 0);
        f5900 = new EnumC3167("SPARSE_SWITCH_PAYLOAD", 256, 512, "sparse-switch-payload", 7, EnumC5850.SparseSwitchPayload, 0);
        f5951 = new EnumC3167("ARRAY_PAYLOAD", 257, 768, "array-payload", 7, EnumC5850.ArrayPayload, 0);
        f5818 = new EnumC3167("INVOKE_POLYMORPHIC", 258, m5440(250, 87), "invoke-polymorphic", 3, 4, EnumC5850.Format45cc, 13);
        f5874 = new EnumC3167("INVOKE_POLYMORPHIC_RANGE", 259, m5440(251, 87), "invoke-polymorphic/range", 3, 4, EnumC5850.Format4rcc, 13);
        f6054 = new EnumC3167("INVOKE_CUSTOM", 260, m5440(252, UMErrorCode.E_UM_BE_CREATE_FAILED), "invoke-custom", 5, enumC5859, 13);
        f5923 = new EnumC3167("INVOKE_CUSTOM_RANGE", 261, m5440(253, UMErrorCode.E_UM_BE_CREATE_FAILED), "invoke-custom/range", 5, enumC58510, 13);
        f6050 = new EnumC3167("CONST_METHOD_HANDLE", 262, m5440(Scalar25519.TARGET_LENGTH, 134), "const-method-handle", 6, enumC5857, 21);
        f5919 = new EnumC3167("CONST_METHOD_TYPE", 263, m5440(255, 134), "const-method-type", 4, enumC5857, 21);
        f5925 = m5433();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m5436(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public EnumC3167(String str, int i, int i2, String str2, int i3, EnumC5850 enumC5850) {
        this(str, i, i2, str2, i3, enumC5850, 0);
    }

    public EnumC3167(String str, int i, int i2, String str2, int i3, EnumC5850 enumC5850, int i4) {
        this(str, i, m5443(i2), str2, i3, enumC5850, i4);
    }

    public EnumC3167(String str, int i, List list, String str2, int i2, EnumC5850 enumC5850, int i3) {
        this(str, i, list, str2, i2, -1, enumC5850, i3);
    }

    public EnumC3167(String str, int i, List list, String str2, int i2, int i3, EnumC5850 enumC5850, int i4) {
        super(str, i);
        int i5 = C21558.f67994;
        C22899 c22899 = new C22899();
        C22899 c228910 = new C22899();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7191 c7191 = (C7191) it.next();
            C15444 c15444 = c7191.f18787;
            C15444 c15445 = c7191.f18788;
            int i6 = c7191.f18789;
            if (!c15444.m35187()) {
                c22899.m51127(c7191.f18787, Short.valueOf((short) i6));
            }
            if (!c15445.m35187()) {
                c228910.m51127(c15445, Short.valueOf((short) i6));
            }
        }
        this.f6094 = c22899.m51126();
        this.f6095 = c228910.m51126();
        this.f6089 = str2;
        this.f6092 = i2;
        this.f6091 = i3;
        this.f6090 = enumC5850;
        this.f6093 = i4;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m5438(int i, int i2) {
        return C9468.m21991(new C7191(C15444.m35180(Integer.valueOf(i2)), C15444.m35184(), i));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static List m5444(int i, int i2) {
        return C9468.m21991(new C7191(C15444.m35183(Integer.valueOf(i2)), C15444.m35184(), i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m5435(int i, int i2, int i3) {
        return C9468.m21991(new C7191(C15444.m35178(Integer.valueOf(i2), Integer.valueOf(i3)), C15444.m35184(), i));
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m5440(int i, int i2) {
        return C9468.m21991(new C7191(C15444.m35184(), C15444.m35180(Integer.valueOf(i2)), i));
    }

    /* JADX INFO: renamed from: ܿ */
    public static List m5442(int i, int i2) {
        return C9468.m21991(new C7191(C15444.m35184(), C15444.m35183(Integer.valueOf(i2)), i));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static List m5443(int i) {
        return C9468.m21991(new C7191(C15444.m35185(), C15444.m35185(), i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m5434(int i) {
        return C9468.m21991(new C7191(C15444.m35185(), C15444.m35184(), i));
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m5437(int i) {
        return C9468.m21991(new C7191(C15444.m35184(), C15444.m35185(), i));
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m5452() {
        return (this.f6093 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m5451() {
        return (this.f6093 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5446() {
        return (this.f6093 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m5445() {
        return (this.f6093 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m5453() {
        return (this.f6093 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m5447() {
        return (this.f6093 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m5454() {
        return (this.f6093 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m5448() {
        return (this.f6093 & 128) != 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m5449() {
        return (this.f6093 & 256) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m5455() {
        return (this.f6093 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m5450() {
        return (this.f6093 & 1024) != 0;
    }
}
