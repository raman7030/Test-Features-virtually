package l;

import com.alipay.sdk.m.y.q;
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
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
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
public final class EnumC0841 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3038;

    /* JADX INFO: renamed from: ֡ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3039;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3040;

    /* JADX INFO: renamed from: ֡ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3041;

    /* JADX INFO: renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3042;

    /* JADX INFO: renamed from: ֡ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3043;

    /* JADX INFO: renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3044;

    /* JADX INFO: renamed from: ֡᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3045;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3046;

    /* JADX INFO: renamed from: ֨ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3047;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3048;

    /* JADX INFO: renamed from: ֨ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3049;

    /* JADX INFO: renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3050;

    /* JADX INFO: renamed from: ֨ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3051;

    /* JADX INFO: renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3052;

    /* JADX INFO: renamed from: ֨᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3053;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3054;

    /* JADX INFO: renamed from: ֫ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3055;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3056;

    /* JADX INFO: renamed from: ֫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3057;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3058;

    /* JADX INFO: renamed from: ֫ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3059;

    /* JADX INFO: renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3060;

    /* JADX INFO: renamed from: ֫᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3061;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final int f3062 = -65536;

    /* JADX INFO: renamed from: ۖۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3063;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3064;

    /* JADX INFO: renamed from: ۖܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3065;

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3066;

    /* JADX INFO: renamed from: ۖܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3067;

    /* JADX INFO: renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3068;

    /* JADX INFO: renamed from: ۖ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3069;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3070;

    /* JADX INFO: renamed from: ۗۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3071;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3072;

    /* JADX INFO: renamed from: ۗܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3073;

    /* JADX INFO: renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3074;

    /* JADX INFO: renamed from: ۗܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3075;

    /* JADX INFO: renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3076;

    /* JADX INFO: renamed from: ۗ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3077;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3078;

    /* JADX INFO: renamed from: ۘۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3079;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3080;

    /* JADX INFO: renamed from: ۘܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3081;

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3082;

    /* JADX INFO: renamed from: ۘܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3083;

    /* JADX INFO: renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3084;

    /* JADX INFO: renamed from: ۘ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3085;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3086;

    /* JADX INFO: renamed from: ۙۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3087;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3088;

    /* JADX INFO: renamed from: ۙܳ, reason: not valid java name and contains not printable characters */
    public static final int f3089 = 64;

    /* JADX INFO: renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3090;

    /* JADX INFO: renamed from: ۙܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3091;

    /* JADX INFO: renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3092;

    /* JADX INFO: renamed from: ۙ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3093;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3094;

    /* JADX INFO: renamed from: ۚۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3095;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3096;

    /* JADX INFO: renamed from: ۚܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3097;

    /* JADX INFO: renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3098;

    /* JADX INFO: renamed from: ۚܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3099;

    /* JADX INFO: renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3100;

    /* JADX INFO: renamed from: ۚ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3101;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3102;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final int f3103 = 1024;

    /* JADX INFO: renamed from: ۛۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3104;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3105;

    /* JADX INFO: renamed from: ۛܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3106;

    /* JADX INFO: renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3107;

    /* JADX INFO: renamed from: ۛܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3108;

    /* JADX INFO: renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3109;

    /* JADX INFO: renamed from: ۛ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3110;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3111;

    /* JADX INFO: renamed from: ۜۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3112;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3113;

    /* JADX INFO: renamed from: ۜܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3114;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3115;

    /* JADX INFO: renamed from: ۜܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3116;

    /* JADX INFO: renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3117;

    /* JADX INFO: renamed from: ۜ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3118;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3119;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3120;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3121;

    /* JADX INFO: renamed from: ۟ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3122;

    /* JADX INFO: renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3123;

    /* JADX INFO: renamed from: ۟ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3124;

    /* JADX INFO: renamed from: ۟ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3125;

    /* JADX INFO: renamed from: ۟᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3126;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3127;

    /* JADX INFO: renamed from: ۠ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3128;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3129;

    /* JADX INFO: renamed from: ۠ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3130;

    /* JADX INFO: renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3131;

    /* JADX INFO: renamed from: ۠ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3132;

    /* JADX INFO: renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3133;

    /* JADX INFO: renamed from: ۠᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3134;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3135;

    /* JADX INFO: renamed from: ۡۜ, reason: not valid java name and contains not printable characters */
    public static final int f3136 = 256;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3137;

    /* JADX INFO: renamed from: ۡܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3138;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3139;

    /* JADX INFO: renamed from: ۡܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3140;

    /* JADX INFO: renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3141;

    /* JADX INFO: renamed from: ۡ᩻, reason: not valid java name and contains not printable characters */
    public static final int f3142 = 8;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3143;

    /* JADX INFO: renamed from: ۢۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3144;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3145;

    /* JADX INFO: renamed from: ۢܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3146;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3147;

    /* JADX INFO: renamed from: ۢܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3148;

    /* JADX INFO: renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3149;

    /* JADX INFO: renamed from: ۢ᩻, reason: not valid java name and contains not printable characters */
    public static final int f3150 = 16;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0841[] f3151;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final int f3152 = 4;

    /* JADX INFO: renamed from: ۤۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3153;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3154;

    /* JADX INFO: renamed from: ۤܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3155;

    /* JADX INFO: renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3156;

    /* JADX INFO: renamed from: ۤܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3157;

    /* JADX INFO: renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3158;

    /* JADX INFO: renamed from: ۤ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3159;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3160;

    /* JADX INFO: renamed from: ۧۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3161;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3162;

    /* JADX INFO: renamed from: ۧܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3163;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3164;

    /* JADX INFO: renamed from: ۧܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3165;

    /* JADX INFO: renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3166;

    /* JADX INFO: renamed from: ۧ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3167;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3168;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final int f3169 = 1;

    /* JADX INFO: renamed from: ۨۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3170;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3171;

    /* JADX INFO: renamed from: ۨܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3172;

    /* JADX INFO: renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3173;

    /* JADX INFO: renamed from: ۨܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3174;

    /* JADX INFO: renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3175;

    /* JADX INFO: renamed from: ۨ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3176;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3177;

    /* JADX INFO: renamed from: ۫ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3178;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3179;

    /* JADX INFO: renamed from: ۫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3180;

    /* JADX INFO: renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3181;

    /* JADX INFO: renamed from: ۫ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3182;

    /* JADX INFO: renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3183;

    /* JADX INFO: renamed from: ۫᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3184;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3185;

    /* JADX INFO: renamed from: ۬ۜ, reason: not valid java name and contains not printable characters */
    public static final int f3186 = 128;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3187;

    /* JADX INFO: renamed from: ۬ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3188;

    /* JADX INFO: renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3189;

    /* JADX INFO: renamed from: ۬ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3190;

    /* JADX INFO: renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3191;

    /* JADX INFO: renamed from: ۬᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3192;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3193;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3194;

    /* JADX INFO: renamed from: ܰۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3195;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3196;

    /* JADX INFO: renamed from: ܰܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3197;

    /* JADX INFO: renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3198;

    /* JADX INFO: renamed from: ܰܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3199;

    /* JADX INFO: renamed from: ܰᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3200;

    /* JADX INFO: renamed from: ܰ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3201;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3202;

    /* JADX INFO: renamed from: ܳۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3203;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3204;

    /* JADX INFO: renamed from: ܳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3205;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3206;

    /* JADX INFO: renamed from: ܳܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3207;

    /* JADX INFO: renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3208;

    /* JADX INFO: renamed from: ܳ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3209;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3210;

    /* JADX INFO: renamed from: ܶۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3211;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3212;

    /* JADX INFO: renamed from: ܶܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3213;

    /* JADX INFO: renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3214;

    /* JADX INFO: renamed from: ܶܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3215;

    /* JADX INFO: renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3216;

    /* JADX INFO: renamed from: ܶ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3217;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3218;

    /* JADX INFO: renamed from: ܺۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3219;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3220;

    /* JADX INFO: renamed from: ܺܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3221;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3222;

    /* JADX INFO: renamed from: ܺܿ, reason: not valid java name and contains not printable characters */
    public static final int f3223 = 512;

    /* JADX INFO: renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3224;

    /* JADX INFO: renamed from: ܺ᩻, reason: not valid java name and contains not printable characters */
    public static final int f3225 = 32;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3226;

    /* JADX INFO: renamed from: ܽۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3227;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3228;

    /* JADX INFO: renamed from: ܽܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3229;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3230;

    /* JADX INFO: renamed from: ܽܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3231;

    /* JADX INFO: renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3232;

    /* JADX INFO: renamed from: ܽ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3233;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3234;

    /* JADX INFO: renamed from: ܿۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3235;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3236;

    /* JADX INFO: renamed from: ܿܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3237;

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3238;

    /* JADX INFO: renamed from: ܿܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3239;

    /* JADX INFO: renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3240;

    /* JADX INFO: renamed from: ܿ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3241;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3242;

    /* JADX INFO: renamed from: ᩳۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3243;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3244;

    /* JADX INFO: renamed from: ᩳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3245;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3246;

    /* JADX INFO: renamed from: ᩳܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3247;

    /* JADX INFO: renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3248;

    /* JADX INFO: renamed from: ᩳ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3249;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3250;

    /* JADX INFO: renamed from: ᩴۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3251;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3252;

    /* JADX INFO: renamed from: ᩴܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3253;

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3254;

    /* JADX INFO: renamed from: ᩴܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3255;

    /* JADX INFO: renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3256;

    /* JADX INFO: renamed from: ᩴ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3257;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3258;

    /* JADX INFO: renamed from: ᩵ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3259;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3260;

    /* JADX INFO: renamed from: ᩵ܳ, reason: not valid java name and contains not printable characters */
    public static final int f3261 = 2;

    /* JADX INFO: renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3262;

    /* JADX INFO: renamed from: ᩵ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3263;

    /* JADX INFO: renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3264;

    /* JADX INFO: renamed from: ᩵᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3265;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3266;

    /* JADX INFO: renamed from: ᩶ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3267;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3268;

    /* JADX INFO: renamed from: ᩶ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3269;

    /* JADX INFO: renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3270;

    /* JADX INFO: renamed from: ᩶ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3271;

    /* JADX INFO: renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3272;

    /* JADX INFO: renamed from: ᩶᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3273;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3274;

    /* JADX INFO: renamed from: ᩷ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3275;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3276;

    /* JADX INFO: renamed from: ᩷ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3277;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3278;

    /* JADX INFO: renamed from: ᩷ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3279;

    /* JADX INFO: renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3280;

    /* JADX INFO: renamed from: ᩷᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3281;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3282;

    /* JADX INFO: renamed from: ᩸ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3283;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3284;

    /* JADX INFO: renamed from: ᩸ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3285;

    /* JADX INFO: renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3286;

    /* JADX INFO: renamed from: ᩸ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3287;

    /* JADX INFO: renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3288;

    /* JADX INFO: renamed from: ᩸᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3289;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3290;

    /* JADX INFO: renamed from: ᩹ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3291;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3292;

    /* JADX INFO: renamed from: ᩹ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3293;

    /* JADX INFO: renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3294;

    /* JADX INFO: renamed from: ᩹ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3295;

    /* JADX INFO: renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3296;

    /* JADX INFO: renamed from: ᩹᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3297;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3298;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3299;

    /* JADX INFO: renamed from: ᩺ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3300;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3301;

    /* JADX INFO: renamed from: ᩺ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3302;

    /* JADX INFO: renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3303;

    /* JADX INFO: renamed from: ᩺ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3304;

    /* JADX INFO: renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3305;

    /* JADX INFO: renamed from: ᩺᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3306;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3307;

    /* JADX INFO: renamed from: ᩻ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3308;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3309;

    /* JADX INFO: renamed from: ᩻ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3310;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3311;

    /* JADX INFO: renamed from: ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3312;

    /* JADX INFO: renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3313;

    /* JADX INFO: renamed from: ᩻᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f3314;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f3315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3664 f3316;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f3317;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f3318;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f3319;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7409 f3320;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7409 f3321;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m3125(int i) {
        return (i & 65535) | (-65536);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m3127(int i) {
        return i << 16;
    }

    public static EnumC0841 valueOf(String str) {
        return (EnumC0841) Enum.valueOf(EnumC0841.class, str);
    }

    public static EnumC0841[] values() {
        return (EnumC0841[]) f3151.clone();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0841[] m3119() {
        return new EnumC0841[]{f3065, f3099, f3215, f3051, f3182, f3108, f3157, f3287, f3271, f3295, f3091, f3190, f3075, f3132, f3249, f3167, f3314, f3233, f3204, f3236, f3244, f3113, f3080, f3252, f3064, f3260, f3137, f3220, f3309, f3263, f3043, f3299, f3166, f3185, f3221, f3138, f3301, f3196, f3121, f3128, f3246, f3238, f3206, f3293, f3201, f3162, f3120, f3056, f3194, f3228, f3311, f3042, f3254, f3278, f3139, f3066, f3115, f3098, f3262, f3147, f3222, f3082, f3202, f3218, f3143, f3307, f3111, f3274, f3135, f3127, f3070, f3266, f3210, f3282, f3290, f3086, f3050, f3198, f3074, f3131, f3286, f3270, f3107, f3158, f3279, f3165, f3109, f3305, f3125, f3207, f3069, f3217, f3045, f3085, f3257, f3265, f3053, f3055, f3275, f3235, f3161, f3227, f3243, f3308, f3092, f3216, f3141, f3052, f3084, f3183, f3272, f3068, f3133, f3256, f3277, f3081, f3146, f3253, f3114, f3310, f3313, f3208, f3240, f3255, f3083, f3067, f3164, f3230, f3058, f3179, f3154, f3187, f3232, f3248, f3117, f3119, f3259, f3057, f3212, f3106, f3078, f3041, f3178, f3297, f3184, f3283, f3242, f3095, f3237, f3088, f3122, f3094, f3213, f3300, f3077, f3176, f3087, f3298, f3079, f3199, f3048, f3180, f3102, f3219, f3174, f3040, f3073, f3054, f3039, f3163, f3284, f3172, f3250, f3097, f3153, f3273, f3159, f3291, f3234, f3047, f3205, f3072, f3061, f3046, f3285, f3195, f3192, f3306, f3071, f3193, f3251, f3124, f3129, f3155, f3168, f3063, f3304, f3096, f3188, f3160, f3118, f3229, f3292, f3302, f3258, f3049, f3104, f3226, f3281, f3245, f3268, f3197, f3038, f3130, f3170, f3093, f3110, f3267, f3303, f3116, f3134, f3112, f3181, f3060, f3140, f3289, f3144, f3211, f3105, f3171, f3224, f3264, f3241, f3209, f3156, f3123, f3189, f3239, f3148, f3231, f3175, f3200, f3059, f3312, f3214, f3294, f3090, f3173, f3076, f3191, f3288, f3296, f3247, f3101, f3203, f3269, f3126, f3177, f3044, f3100, f3280, f3149, f3276, f3145};
    }

    static {
        EnumC3664 enumC3664 = EnumC3664.Format10x;
        f3065 = new EnumC0841("NOP", 0, 0, "nop", 7, enumC3664, 4);
        EnumC3664 enumC3665 = EnumC3664.Format12x;
        f3099 = new EnumC0841("MOVE", 1, 1, "move", 7, enumC3665, 20);
        EnumC3664 enumC3666 = EnumC3664.Format22x;
        f3215 = new EnumC0841("MOVE_FROM16", 2, 2, "move/from16", 7, enumC3666, 20);
        EnumC3664 enumC3667 = EnumC3664.Format32x;
        f3051 = new EnumC0841("MOVE_16", 3, 3, "move/16", 7, enumC3667, 20);
        f3182 = new EnumC0841("MOVE_WIDE", 4, 4, "move-wide", 7, enumC3665, 52);
        f3108 = new EnumC0841("MOVE_WIDE_FROM16", 5, 5, "move-wide/from16", 7, enumC3666, 52);
        f3157 = new EnumC0841("MOVE_WIDE_16", 6, 6, "move-wide/16", 7, enumC3667, 52);
        f3287 = new EnumC0841("MOVE_OBJECT", 7, 7, "move-object", 7, enumC3665, 20);
        f3271 = new EnumC0841("MOVE_OBJECT_FROM16", 8, 8, "move-object/from16", 7, enumC3666, 20);
        f3295 = new EnumC0841("MOVE_OBJECT_16", 9, 9, "move-object/16", 7, enumC3667, 20);
        EnumC3664 enumC3668 = EnumC3664.Format11x;
        f3091 = new EnumC0841("MOVE_RESULT", 10, 10, "move-result", 7, enumC3668, 20);
        f3190 = new EnumC0841("MOVE_RESULT_WIDE", 11, 11, "move-result-wide", 7, enumC3668, 52);
        f3075 = new EnumC0841("MOVE_RESULT_OBJECT", 12, 12, "move-result-object", 7, enumC3668, 20);
        f3132 = new EnumC0841("MOVE_EXCEPTION", 13, 13, "move-exception", 7, enumC3668, 20);
        f3249 = new EnumC0841("RETURN_VOID", 14, 14, "return-void", 7, enumC3664);
        f3167 = new EnumC0841("RETURN", 15, 15, "return", 7, enumC3668);
        f3314 = new EnumC0841("RETURN_WIDE", 16, 16, "return-wide", 7, enumC3668);
        f3233 = new EnumC0841("RETURN_OBJECT", 17, 17, "return-object", 7, enumC3668);
        f3204 = new EnumC0841("CONST_4", 18, 18, "const/4", 7, EnumC3664.Format11n, 20);
        EnumC3664 enumC3669 = EnumC3664.Format21s;
        f3236 = new EnumC0841("CONST_16", 19, 19, "const/16", 7, enumC3669, 20);
        EnumC3664 enumC36610 = EnumC3664.Format31i;
        f3244 = new EnumC0841("CONST", 20, 20, "const", 7, enumC36610, 20);
        f3113 = new EnumC0841("CONST_HIGH16", 21, 21, "const/high16", 7, EnumC3664.Format21ih, 20);
        f3080 = new EnumC0841("CONST_WIDE_16", 22, 22, "const-wide/16", 7, enumC3669, 52);
        f3252 = new EnumC0841("CONST_WIDE_32", 23, 23, "const-wide/32", 7, enumC36610, 52);
        f3064 = new EnumC0841("CONST_WIDE", 24, 24, "const-wide", 7, EnumC3664.Format51l, 52);
        f3260 = new EnumC0841("CONST_WIDE_HIGH16", 25, 25, "const-wide/high16", 7, EnumC3664.Format21lh, 52);
        EnumC3664 enumC36611 = EnumC3664.Format21c;
        f3137 = new EnumC0841("CONST_STRING", 26, 26, "const-string", 0, enumC36611, 21);
        f3220 = new EnumC0841("CONST_STRING_JUMBO", 27, 27, "const-string/jumbo", 0, EnumC3664.Format31c, 21);
        f3309 = new EnumC0841("CONST_CLASS", 28, 28, "const-class", 1, enumC36611, 21);
        f3263 = new EnumC0841("MONITOR_ENTER", 29, 29, "monitor-enter", 7, enumC3668, 5);
        f3043 = new EnumC0841("MONITOR_EXIT", 30, 30, "monitor-exit", 7, enumC3668, 5);
        f3299 = new EnumC0841("CHECK_CAST", 31, 31, "check-cast", 1, enumC36611, 21);
        EnumC3664 enumC36612 = EnumC3664.Format22c;
        f3166 = new EnumC0841("INSTANCE_OF", 32, 32, "instance-of", 1, enumC36612, 21);
        f3185 = new EnumC0841("ARRAY_LENGTH", 33, 33, "array-length", 7, enumC3665, 21);
        f3221 = new EnumC0841("NEW_INSTANCE", 34, 34, "new-instance", 1, enumC36611, 21);
        f3138 = new EnumC0841("NEW_ARRAY", 35, 35, "new-array", 1, enumC36612, 21);
        EnumC3664 enumC36613 = EnumC3664.Format35c;
        f3301 = new EnumC0841("FILLED_NEW_ARRAY", 36, 36, "filled-new-array", 1, enumC36613, 13);
        EnumC3664 enumC36614 = EnumC3664.Format3rc;
        f3196 = new EnumC0841("FILLED_NEW_ARRAY_RANGE", 37, 37, "filled-new-array/range", 1, enumC36614, 13);
        EnumC3664 enumC36615 = EnumC3664.Format31t;
        f3121 = new EnumC0841("FILL_ARRAY_DATA", 38, 38, "fill-array-data", 7, enumC36615, 4);
        f3128 = new EnumC0841("THROW", 39, 39, "throw", 7, enumC3668, 1);
        f3246 = new EnumC0841("GOTO", 40, 40, "goto", 7, EnumC3664.Format10t);
        f3238 = new EnumC0841("GOTO_16", 41, 41, "goto/16", 7, EnumC3664.Format20t);
        f3206 = new EnumC0841("GOTO_32", 42, 42, "goto/32", 7, EnumC3664.Format30t);
        f3293 = new EnumC0841("PACKED_SWITCH", 43, 43, "packed-switch", 7, enumC36615, 4);
        f3201 = new EnumC0841("SPARSE_SWITCH", 44, 44, "sparse-switch", 7, enumC36615, 4);
        EnumC3664 enumC36616 = EnumC3664.Format23x;
        f3162 = new EnumC0841("CMPL_FLOAT", 45, 45, "cmpl-float", 7, enumC36616, 20);
        f3120 = new EnumC0841("CMPG_FLOAT", 46, 46, "cmpg-float", 7, enumC36616, 20);
        f3056 = new EnumC0841("CMPL_DOUBLE", 47, 47, "cmpl-double", 7, enumC36616, 20);
        f3194 = new EnumC0841("CMPG_DOUBLE", 48, 48, "cmpg-double", 7, enumC36616, 20);
        f3228 = new EnumC0841("CMP_LONG", 49, 49, "cmp-long", 7, enumC36616, 20);
        EnumC3664 enumC36617 = EnumC3664.Format22t;
        f3311 = new EnumC0841("IF_EQ", 50, 50, "if-eq", 7, enumC36617, 4);
        f3042 = new EnumC0841("IF_NE", 51, 51, "if-ne", 7, enumC36617, 4);
        f3254 = new EnumC0841("IF_LT", 52, 52, "if-lt", 7, enumC36617, 4);
        f3278 = new EnumC0841("IF_GE", 53, 53, "if-ge", 7, enumC36617, 4);
        f3139 = new EnumC0841("IF_GT", 54, 54, "if-gt", 7, enumC36617, 4);
        f3066 = new EnumC0841("IF_LE", 55, 55, "if-le", 7, enumC36617, 4);
        EnumC3664 enumC36618 = EnumC3664.Format21t;
        f3115 = new EnumC0841("IF_EQZ", 56, 56, "if-eqz", 7, enumC36618, 4);
        f3098 = new EnumC0841("IF_NEZ", 57, 57, "if-nez", 7, enumC36618, 4);
        f3262 = new EnumC0841("IF_LTZ", 58, 58, "if-ltz", 7, enumC36618, 4);
        f3147 = new EnumC0841("IF_GEZ", 59, 59, "if-gez", 7, enumC36618, 4);
        f3222 = new EnumC0841("IF_GTZ", 60, 60, "if-gtz", 7, enumC36618, 4);
        f3082 = new EnumC0841("IF_LEZ", 61, 61, "if-lez", 7, enumC36618, 4);
        f3202 = new EnumC0841("AGET", 62, 68, "aget", 7, enumC36616, 21);
        f3218 = new EnumC0841("AGET_WIDE", 63, 69, "aget-wide", 7, enumC36616, 53);
        f3143 = new EnumC0841("AGET_OBJECT", 64, 70, "aget-object", 7, enumC36616, 21);
        f3307 = new EnumC0841("AGET_BOOLEAN", 65, 71, "aget-boolean", 7, enumC36616, 21);
        f3111 = new EnumC0841("AGET_BYTE", 66, 72, "aget-byte", 7, enumC36616, 21);
        f3274 = new EnumC0841("AGET_CHAR", 67, 73, "aget-char", 7, enumC36616, 21);
        f3135 = new EnumC0841("AGET_SHORT", 68, 74, "aget-short", 7, enumC36616, 21);
        f3127 = new EnumC0841("APUT", 69, 75, "aput", 7, enumC36616, 5);
        f3070 = new EnumC0841("APUT_WIDE", 70, 76, "aput-wide", 7, enumC36616, 5);
        f3266 = new EnumC0841("APUT_OBJECT", 71, 77, "aput-object", 7, enumC36616, 5);
        f3210 = new EnumC0841("APUT_BOOLEAN", 72, 78, "aput-boolean", 7, enumC36616, 5);
        f3282 = new EnumC0841("APUT_BYTE", 73, 79, "aput-byte", 7, enumC36616, 5);
        f3290 = new EnumC0841("APUT_CHAR", 74, 80, "aput-char", 7, enumC36616, 5);
        f3086 = new EnumC0841("APUT_SHORT", 75, 81, "aput-short", 7, enumC36616, 5);
        f3050 = new EnumC0841("IGET", 76, 82, "iget", 2, enumC36612, 21);
        f3198 = new EnumC0841("IGET_WIDE", 77, 83, "iget-wide", 2, enumC36612, 53);
        f3074 = new EnumC0841("IGET_OBJECT", 78, 84, "iget-object", 2, enumC36612, 21);
        f3131 = new EnumC0841("IGET_BOOLEAN", 79, 85, "iget-boolean", 2, enumC36612, 21);
        f3286 = new EnumC0841("IGET_BYTE", 80, 86, "iget-byte", 2, enumC36612, 21);
        f3270 = new EnumC0841("IGET_CHAR", 81, 87, "iget-char", 2, enumC36612, 21);
        f3107 = new EnumC0841("IGET_SHORT", 82, 88, "iget-short", 2, enumC36612, 21);
        f3158 = new EnumC0841("IPUT", 83, 89, "iput", 2, enumC36612, 5);
        f3279 = new EnumC0841("IPUT_WIDE", 84, 90, "iput-wide", 2, enumC36612, 5);
        f3165 = new EnumC0841("IPUT_OBJECT", 85, 91, "iput-object", 2, enumC36612, 5);
        f3109 = new EnumC0841("IPUT_BOOLEAN", 86, 92, "iput-boolean", 2, enumC36612, 5);
        f3305 = new EnumC0841("IPUT_BYTE", 87, 93, "iput-byte", 2, enumC36612, 5);
        f3125 = new EnumC0841("IPUT_CHAR", 88, 94, "iput-char", 2, enumC36612, 5);
        f3207 = new EnumC0841("IPUT_SHORT", 89, 95, "iput-short", 2, enumC36612, 5);
        f3069 = new EnumC0841("SGET", 90, 96, "sget", 2, enumC36611, 277);
        f3217 = new EnumC0841("SGET_WIDE", 91, 97, "sget-wide", 2, enumC36611, 309);
        f3045 = new EnumC0841("SGET_OBJECT", 92, 98, "sget-object", 2, enumC36611, 277);
        f3085 = new EnumC0841("SGET_BOOLEAN", 93, 99, "sget-boolean", 2, enumC36611, 277);
        f3257 = new EnumC0841("SGET_BYTE", 94, 100, "sget-byte", 2, enumC36611, 277);
        f3265 = new EnumC0841("SGET_CHAR", 95, 101, "sget-char", 2, enumC36611, 277);
        f3053 = new EnumC0841("SGET_SHORT", 96, IShizukuService.Stub.TRANSACTION_attachUserService, "sget-short", 2, enumC36611, 277);
        f3055 = new EnumC0841("SPUT", 97, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "sput", 2, enumC36611, 261);
        f3275 = new EnumC0841("SPUT_WIDE", 98, IShizukuService.Stub.TRANSACTION_isHidden, "sput-wide", 2, enumC36611, 261);
        f3235 = new EnumC0841("SPUT_OBJECT", 99, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "sput-object", 2, enumC36611, 261);
        f3161 = new EnumC0841("SPUT_BOOLEAN", 100, IShizukuService.Stub.TRANSACTION_getFlagsForUid, "sput-boolean", 2, enumC36611, 261);
        f3227 = new EnumC0841("SPUT_BYTE", 101, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "sput-byte", 2, enumC36611, 261);
        f3243 = new EnumC0841("SPUT_CHAR", IShizukuService.Stub.TRANSACTION_attachUserService, 108, "sput-char", 2, enumC36611, 261);
        f3308 = new EnumC0841("SPUT_SHORT", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 109, "sput-short", 2, enumC36611, 261);
        f3092 = new EnumC0841("INVOKE_VIRTUAL", IShizukuService.Stub.TRANSACTION_isHidden, UMErrorCode.E_UM_BE_JSON_FAILED, "invoke-virtual", 3, enumC36613, 13);
        f3216 = new EnumC0841("INVOKE_SUPER", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, UMErrorCode.E_UM_BE_CREATE_FAILED, "invoke-super", 3, enumC36613, 13);
        f3141 = new EnumC0841("INVOKE_DIRECT", IShizukuService.Stub.TRANSACTION_getFlagsForUid, UMErrorCode.E_UM_BE_DEFLATE_FAILED, "invoke-direct", 3, enumC36613, 1037);
        f3052 = new EnumC0841("INVOKE_STATIC", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, UMErrorCode.E_UM_BE_RAW_OVERSIZE, "invoke-static", 3, enumC36613, 13);
        f3084 = new EnumC0841("INVOKE_INTERFACE", 108, 114, "invoke-interface", 3, enumC36613, 13);
        f3183 = new EnumC0841("INVOKE_VIRTUAL_RANGE", 109, 116, "invoke-virtual/range", 3, enumC36614, 13);
        f3272 = new EnumC0841("INVOKE_SUPER_RANGE", UMErrorCode.E_UM_BE_JSON_FAILED, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, "invoke-super/range", 3, enumC36614, 13);
        f3068 = new EnumC0841("INVOKE_DIRECT_RANGE", UMErrorCode.E_UM_BE_CREATE_FAILED, 118, "invoke-direct/range", 3, enumC36614, 1037);
        f3133 = new EnumC0841("INVOKE_STATIC_RANGE", UMErrorCode.E_UM_BE_DEFLATE_FAILED, 119, "invoke-static/range", 3, enumC36614, 13);
        f3256 = new EnumC0841("INVOKE_INTERFACE_RANGE", UMErrorCode.E_UM_BE_RAW_OVERSIZE, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, "invoke-interface/range", 3, enumC36614, 13);
        f3277 = new EnumC0841("NEG_INT", 114, 123, "neg-int", 7, enumC3665, 20);
        f3081 = new EnumC0841("NOT_INT", 115, 124, "not-int", 7, enumC3665, 20);
        f3146 = new EnumC0841("NEG_LONG", 116, q.h, "neg-long", 7, enumC3665, 52);
        f3253 = new EnumC0841("NOT_LONG", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 126, "not-long", 7, enumC3665, 52);
        f3114 = new EnumC0841("NEG_FLOAT", 118, 127, "neg-float", 7, enumC3665, 20);
        f3310 = new EnumC0841("NEG_DOUBLE", 119, 128, "neg-double", 7, enumC3665, 52);
        f3313 = new EnumC0841("INT_TO_LONG", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 129, "int-to-long", 7, enumC3665, 52);
        f3208 = new EnumC0841("INT_TO_FLOAT", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 130, "int-to-float", 7, enumC3665, 20);
        f3240 = new EnumC0841("INT_TO_DOUBLE", 122, 131, "int-to-double", 7, enumC3665, 52);
        f3255 = new EnumC0841("LONG_TO_INT", 123, 132, "long-to-int", 7, enumC3665, 20);
        f3083 = new EnumC0841("LONG_TO_FLOAT", 124, 133, "long-to-float", 7, enumC3665, 20);
        f3067 = new EnumC0841("LONG_TO_DOUBLE", q.h, 134, "long-to-double", 7, enumC3665, 52);
        f3164 = new EnumC0841("FLOAT_TO_INT", 126, 135, "float-to-int", 7, enumC3665, 20);
        f3230 = new EnumC0841("FLOAT_TO_LONG", 127, 136, "float-to-long", 7, enumC3665, 52);
        f3058 = new EnumC0841("FLOAT_TO_DOUBLE", 128, 137, "float-to-double", 7, enumC3665, 52);
        f3179 = new EnumC0841("DOUBLE_TO_INT", 129, 138, "double-to-int", 7, enumC3665, 20);
        f3154 = new EnumC0841("DOUBLE_TO_LONG", 130, 139, "double-to-long", 7, enumC3665, 52);
        f3187 = new EnumC0841("DOUBLE_TO_FLOAT", 131, 140, "double-to-float", 7, enumC3665, 20);
        f3232 = new EnumC0841("INT_TO_BYTE", 132, 141, "int-to-byte", 7, enumC3665, 20);
        f3248 = new EnumC0841("INT_TO_CHAR", 133, 142, "int-to-char", 7, enumC3665, 20);
        f3117 = new EnumC0841("INT_TO_SHORT", 134, 143, "int-to-short", 7, enumC3665, 20);
        f3119 = new EnumC0841("ADD_INT", 135, 144, "add-int", 7, enumC36616, 20);
        f3259 = new EnumC0841("SUB_INT", 136, 145, "sub-int", 7, enumC36616, 20);
        f3057 = new EnumC0841("MUL_INT", 137, 146, "mul-int", 7, enumC36616, 20);
        f3212 = new EnumC0841("DIV_INT", 138, 147, "div-int", 7, enumC36616, 21);
        f3106 = new EnumC0841("REM_INT", 139, 148, "rem-int", 7, enumC36616, 21);
        f3078 = new EnumC0841("AND_INT", 140, 149, "and-int", 7, enumC36616, 20);
        f3041 = new EnumC0841("OR_INT", 141, 150, "or-int", 7, enumC36616, 20);
        f3178 = new EnumC0841("XOR_INT", 142, 151, "xor-int", 7, enumC36616, 20);
        f3297 = new EnumC0841("SHL_INT", 143, 152, "shl-int", 7, enumC36616, 20);
        f3184 = new EnumC0841("SHR_INT", 144, 153, "shr-int", 7, enumC36616, 20);
        f3283 = new EnumC0841("USHR_INT", 145, EnumC17734.f54268, "ushr-int", 7, enumC36616, 20);
        f3242 = new EnumC0841("ADD_LONG", 146, 155, "add-long", 7, enumC36616, 52);
        f3095 = new EnumC0841("SUB_LONG", 147, 156, "sub-long", 7, enumC36616, 52);
        f3237 = new EnumC0841("MUL_LONG", 148, 157, "mul-long", 7, enumC36616, 52);
        f3088 = new EnumC0841("DIV_LONG", 149, 158, "div-long", 7, enumC36616, 53);
        f3122 = new EnumC0841("REM_LONG", 150, 159, "rem-long", 7, enumC36616, 53);
        f3094 = new EnumC0841("AND_LONG", 151, DHParameters.DEFAULT_MINIMUM_LENGTH, "and-long", 7, enumC36616, 52);
        f3213 = new EnumC0841("OR_LONG", 152, 161, "or-long", 7, enumC36616, 52);
        f3300 = new EnumC0841("XOR_LONG", 153, 162, "xor-long", 7, enumC36616, 52);
        f3077 = new EnumC0841("SHL_LONG", EnumC17734.f54268, 163, "shl-long", 7, enumC36616, 52);
        f3176 = new EnumC0841("SHR_LONG", 155, 164, "shr-long", 7, enumC36616, 52);
        f3087 = new EnumC0841("USHR_LONG", 156, 165, "ushr-long", 7, enumC36616, 52);
        f3298 = new EnumC0841("ADD_FLOAT", 157, 166, "add-float", 7, enumC36616, 20);
        f3079 = new EnumC0841("SUB_FLOAT", 158, 167, "sub-float", 7, enumC36616, 20);
        f3199 = new EnumC0841("MUL_FLOAT", 159, 168, "mul-float", 7, enumC36616, 20);
        f3048 = new EnumC0841("DIV_FLOAT", DHParameters.DEFAULT_MINIMUM_LENGTH, 169, "div-float", 7, enumC36616, 20);
        f3180 = new EnumC0841("REM_FLOAT", 161, 170, "rem-float", 7, enumC36616, 20);
        f3102 = new EnumC0841("ADD_DOUBLE", 162, 171, "add-double", 7, enumC36616, 52);
        f3219 = new EnumC0841("SUB_DOUBLE", 163, 172, "sub-double", 7, enumC36616, 52);
        f3174 = new EnumC0841("MUL_DOUBLE", 164, 173, "mul-double", 7, enumC36616, 52);
        f3040 = new EnumC0841("DIV_DOUBLE", 165, 174, "div-double", 7, enumC36616, 52);
        f3073 = new EnumC0841("REM_DOUBLE", 166, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, "rem-double", 7, enumC36616, 52);
        f3054 = new EnumC0841("ADD_INT_2ADDR", 167, PicnicEngine.MAX_AUX_BYTES, "add-int/2addr", 7, enumC3665, 20);
        f3039 = new EnumC0841("SUB_INT_2ADDR", 168, 177, "sub-int/2addr", 7, enumC3665, 20);
        f3163 = new EnumC0841("MUL_INT_2ADDR", 169, 178, "mul-int/2addr", 7, enumC3665, 20);
        f3284 = new EnumC0841("DIV_INT_2ADDR", 170, 179, "div-int/2addr", 7, enumC3665, 21);
        f3172 = new EnumC0841("REM_INT_2ADDR", 171, 180, "rem-int/2addr", 7, enumC3665, 21);
        f3250 = new EnumC0841("AND_INT_2ADDR", 172, 181, "and-int/2addr", 7, enumC3665, 20);
        f3097 = new EnumC0841("OR_INT_2ADDR", 173, 182, "or-int/2addr", 7, enumC3665, 20);
        f3153 = new EnumC0841("XOR_INT_2ADDR", 174, 183, "xor-int/2addr", 7, enumC3665, 20);
        f3273 = new EnumC0841("SHL_INT_2ADDR", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 184, "shl-int/2addr", 7, enumC3665, 20);
        f3159 = new EnumC0841("SHR_INT_2ADDR", PicnicEngine.MAX_AUX_BYTES, 185, "shr-int/2addr", 7, enumC3665, 20);
        f3291 = new EnumC0841("USHR_INT_2ADDR", 177, 186, "ushr-int/2addr", 7, enumC3665, 20);
        f3234 = new EnumC0841("ADD_LONG_2ADDR", 178, 187, "add-long/2addr", 7, enumC3665, 52);
        f3047 = new EnumC0841("SUB_LONG_2ADDR", 179, 188, "sub-long/2addr", 7, enumC3665, 52);
        f3205 = new EnumC0841("MUL_LONG_2ADDR", 180, 189, "mul-long/2addr", 7, enumC3665, 52);
        f3072 = new EnumC0841("DIV_LONG_2ADDR", 181, 190, "div-long/2addr", 7, enumC3665, 53);
        f3061 = new EnumC0841("REM_LONG_2ADDR", 182, 191, "rem-long/2addr", 7, enumC3665, 53);
        f3046 = new EnumC0841("AND_LONG_2ADDR", 183, 192, "and-long/2addr", 7, enumC3665, 52);
        f3285 = new EnumC0841("OR_LONG_2ADDR", 184, 193, "or-long/2addr", 7, enumC3665, 52);
        f3195 = new EnumC0841("XOR_LONG_2ADDR", 185, 194, "xor-long/2addr", 7, enumC3665, 52);
        f3192 = new EnumC0841("SHL_LONG_2ADDR", 186, 195, "shl-long/2addr", 7, enumC3665, 52);
        f3306 = new EnumC0841("SHR_LONG_2ADDR", 187, 196, "shr-long/2addr", 7, enumC3665, 52);
        f3071 = new EnumC0841("USHR_LONG_2ADDR", 188, 197, "ushr-long/2addr", 7, enumC3665, 52);
        f3193 = new EnumC0841("ADD_FLOAT_2ADDR", 189, 198, "add-float/2addr", 7, enumC3665, 20);
        f3251 = new EnumC0841("SUB_FLOAT_2ADDR", 190, 199, "sub-float/2addr", 7, enumC3665, 20);
        f3124 = new EnumC0841("MUL_FLOAT_2ADDR", 191, 200, "mul-float/2addr", 7, enumC3665, 20);
        f3129 = new EnumC0841("DIV_FLOAT_2ADDR", 192, 201, "div-float/2addr", 7, enumC3665, 20);
        f3155 = new EnumC0841("REM_FLOAT_2ADDR", 193, 202, "rem-float/2addr", 7, enumC3665, 20);
        f3168 = new EnumC0841("ADD_DOUBLE_2ADDR", 194, 203, "add-double/2addr", 7, enumC3665, 52);
        f3063 = new EnumC0841("SUB_DOUBLE_2ADDR", 195, 204, "sub-double/2addr", 7, enumC3665, 52);
        f3304 = new EnumC0841("MUL_DOUBLE_2ADDR", 196, 205, "mul-double/2addr", 7, enumC3665, 52);
        f3096 = new EnumC0841("DIV_DOUBLE_2ADDR", 197, 206, "div-double/2addr", 7, enumC3665, 52);
        f3188 = new EnumC0841("REM_DOUBLE_2ADDR", 198, 207, "rem-double/2addr", 7, enumC3665, 52);
        EnumC3664 enumC36619 = EnumC3664.Format22s;
        f3160 = new EnumC0841("ADD_INT_LIT16", 199, 208, "add-int/lit16", 7, enumC36619, 20);
        f3118 = new EnumC0841("RSUB_INT", 200, 209, "rsub-int", 7, enumC36619, 20);
        f3229 = new EnumC0841("MUL_INT_LIT16", 201, 210, "mul-int/lit16", 7, enumC36619, 20);
        f3292 = new EnumC0841("DIV_INT_LIT16", 202, Primes.SMALL_FACTOR_LIMIT, "div-int/lit16", 7, enumC36619, 21);
        f3302 = new EnumC0841("REM_INT_LIT16", 203, 212, "rem-int/lit16", 7, enumC36619, 21);
        f3258 = new EnumC0841("AND_INT_LIT16", 204, 213, "and-int/lit16", 7, enumC36619, 20);
        f3049 = new EnumC0841("OR_INT_LIT16", 205, 214, "or-int/lit16", 7, enumC36619, 20);
        f3104 = new EnumC0841("XOR_INT_LIT16", 206, 215, "xor-int/lit16", 7, enumC36619, 20);
        EnumC3664 enumC36620 = EnumC3664.Format22b;
        f3226 = new EnumC0841("ADD_INT_LIT8", 207, 216, "add-int/lit8", 7, enumC36620, 20);
        f3281 = new EnumC0841("RSUB_INT_LIT8", 208, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, "rsub-int/lit8", 7, enumC36620, 20);
        f3245 = new EnumC0841("MUL_INT_LIT8", 209, 218, "mul-int/lit8", 7, enumC36620, 20);
        f3268 = new EnumC0841("DIV_INT_LIT8", 210, 219, "div-int/lit8", 7, enumC36620, 21);
        f3197 = new EnumC0841("REM_INT_LIT8", Primes.SMALL_FACTOR_LIMIT, 220, "rem-int/lit8", 7, enumC36620, 21);
        f3038 = new EnumC0841("AND_INT_LIT8", 212, 221, "and-int/lit8", 7, enumC36620, 20);
        f3130 = new EnumC0841("OR_INT_LIT8", 213, 222, "or-int/lit8", 7, enumC36620, 20);
        f3170 = new EnumC0841("XOR_INT_LIT8", 214, 223, "xor-int/lit8", 7, enumC36620, 20);
        f3093 = new EnumC0841("SHL_INT_LIT8", 215, BERTags.FLAGS, "shl-int/lit8", 7, enumC36620, 20);
        f3110 = new EnumC0841("SHR_INT_LIT8", 216, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, "shr-int/lit8", 7, enumC36620, 20);
        f3267 = new EnumC0841("USHR_INT_LIT8", IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 226, "ushr-int/lit8", 7, enumC36620, 20);
        f3303 = new EnumC0841("IGET_VOLATILE", 218, m3124(227, 9), "iget-volatile", 2, enumC36612, 151);
        f3116 = new EnumC0841("IPUT_VOLATILE", 219, m3124(228, 9), "iput-volatile", 2, enumC36612, 135);
        f3134 = new EnumC0841("SGET_VOLATILE", 220, m3124(229, 9), "sget-volatile", 2, enumC36611, 407);
        f3112 = new EnumC0841("SPUT_VOLATILE", 221, m3124(230, 9), "sput-volatile", 2, enumC36611, 391);
        f3181 = new EnumC0841("IGET_OBJECT_VOLATILE", 222, m3124(231, 9), "iget-object-volatile", 2, enumC36612, 151);
        f3060 = new EnumC0841("IGET_WIDE_VOLATILE", 223, m3124(232, 9), "iget-wide-volatile", 2, enumC36612, 183);
        f3140 = new EnumC0841("IPUT_WIDE_VOLATILE", BERTags.FLAGS, m3124(233, 9), "iput-wide-volatile", 2, enumC36612, 135);
        f3289 = new EnumC0841("SGET_WIDE_VOLATILE", HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, m3124(234, 9), "sget-wide-volatile", 2, enumC36611, 439);
        f3144 = new EnumC0841("SPUT_WIDE_VOLATILE", 226, m3124(235, 9), "sput-wide-volatile", 2, enumC36611, 391);
        f3211 = new EnumC0841("THROW_VERIFICATION_ERROR", 227, m3124(237, 5), "throw-verification-error", 7, EnumC3664.Format20bc, 3);
        f3105 = new EnumC0841("EXECUTE_INLINE", 228, m3120(238), "execute-inline", 7, EnumC3664.Format35mi, 15);
        f3171 = new EnumC0841("EXECUTE_INLINE_RANGE", 229, m3124(239, 8), "execute-inline/range", 7, EnumC3664.Format3rmi, 15);
        f3224 = new EnumC0841("INVOKE_DIRECT_EMPTY", 230, m3130(240, 13), "invoke-direct-empty", 3, enumC36613, 1039);
        f3264 = new EnumC0841("INVOKE_OBJECT_INIT_RANGE", 231, m3124(240, 14), "invoke-object-init/range", 3, enumC36614, 1039);
        f3241 = new EnumC0841("RETURN_VOID_BARRIER", 232, m3122(m3124(241, 11), m3128(115, 59)), "return-void-barrier", 7, enumC3664, 2);
        f3209 = new EnumC0841("RETURN_VOID_NO_BARRIER", 233, m3126(115, 60), "return-void-no-barrier", 7, enumC3664, 2);
        List listM3122 = m3122(m3120(242), m3123(227));
        EnumC3664 enumC36621 = EnumC3664.Format22cs;
        f3156 = new EnumC0841("IGET_QUICK", 234, listM3122, "iget-quick", 7, enumC36621, 87);
        f3123 = new EnumC0841("IGET_WIDE_QUICK", 235, m3122(m3120(243), m3123(228)), "iget-wide-quick", 7, enumC36621, 119);
        f3189 = new EnumC0841("IGET_OBJECT_QUICK", 236, m3122(m3120(244), m3123(229)), "iget-object-quick", 7, enumC36621, 87);
        f3239 = new EnumC0841("IPUT_QUICK", 237, m3122(m3120(245), m3123(230)), "iput-quick", 7, enumC36621, 71);
        f3148 = new EnumC0841("IPUT_WIDE_QUICK", 238, m3122(m3120(246), m3123(231)), "iput-wide-quick", 7, enumC36621, 71);
        f3231 = new EnumC0841("IPUT_OBJECT_QUICK", 239, m3122(m3120(247), m3123(232)), "iput-object-quick", 7, enumC36621, 71);
        f3175 = new EnumC0841("IPUT_BOOLEAN_QUICK", 240, m3123(235), "iput-boolean-quick", 7, enumC36621, 71);
        f3200 = new EnumC0841("IPUT_BYTE_QUICK", 241, m3123(236), "iput-byte-quick", 7, enumC36621, 71);
        f3059 = new EnumC0841("IPUT_CHAR_QUICK", 242, m3123(237), "iput-char-quick", 7, enumC36621, 71);
        f3312 = new EnumC0841("IPUT_SHORT_QUICK", 243, m3123(238), "iput-short-quick", 7, enumC36621, 71);
        f3214 = new EnumC0841("IGET_BOOLEAN_QUICK", 244, m3123(239), "iget-boolean-quick", 7, enumC36621, 87);
        f3294 = new EnumC0841("IGET_BYTE_QUICK", 245, m3123(240), "iget-byte-quick", 7, enumC36621, 87);
        f3090 = new EnumC0841("IGET_CHAR_QUICK", 246, m3123(241), "iget-char-quick", 7, enumC36621, 87);
        f3173 = new EnumC0841("IGET_SHORT_QUICK", 247, m3123(242), "iget-short-quick", 7, enumC36621, 87);
        List listM3123 = m3122(m3120(248), m3123(233));
        EnumC3664 enumC36622 = EnumC3664.Format35ms;
        f3076 = new EnumC0841("INVOKE_VIRTUAL_QUICK", 248, listM3123, "invoke-virtual-quick", 7, enumC36622, 15);
        List listM3124 = m3122(m3120(249), m3123(234));
        EnumC3664 enumC36623 = EnumC3664.Format3rms;
        f3191 = new EnumC0841("INVOKE_VIRTUAL_QUICK_RANGE", 249, listM3124, "invoke-virtual-quick/range", 7, enumC36623, 15);
        f3288 = new EnumC0841("INVOKE_SUPER_QUICK", 250, m3130(250, 25), "invoke-super-quick", 7, enumC36622, 15);
        f3296 = new EnumC0841("INVOKE_SUPER_QUICK_RANGE", 251, m3130(251, 25), "invoke-super-quick/range", 7, enumC36623, 15);
        f3247 = new EnumC0841("IPUT_OBJECT_VOLATILE", 252, m3124(252, 9), "iput-object-volatile", 2, enumC36612, 135);
        f3101 = new EnumC0841("SGET_OBJECT_VOLATILE", 253, m3124(253, 9), "sget-object-volatile", 2, enumC36611, 407);
        f3203 = new EnumC0841("SPUT_OBJECT_VOLATILE", Scalar25519.TARGET_LENGTH, m3121(Scalar25519.TARGET_LENGTH, 9, 19), "sput-object-volatile", 2, enumC36611, 391);
        f3269 = new EnumC0841("PACKED_SWITCH_PAYLOAD", 255, 256, "packed-switch-payload", 7, EnumC3664.PackedSwitchPayload, 0);
        f3126 = new EnumC0841("SPARSE_SWITCH_PAYLOAD", 256, 512, "sparse-switch-payload", 7, EnumC3664.SparseSwitchPayload, 0);
        f3177 = new EnumC0841("ARRAY_PAYLOAD", 257, 768, "array-payload", 7, EnumC3664.ArrayPayload, 0);
        f3044 = new EnumC0841("INVOKE_POLYMORPHIC", 258, m3126(250, 87), "invoke-polymorphic", 3, 4, EnumC3664.Format45cc, 13);
        f3100 = new EnumC0841("INVOKE_POLYMORPHIC_RANGE", 259, m3126(251, 87), "invoke-polymorphic/range", 3, 4, EnumC3664.Format4rcc, 13);
        f3280 = new EnumC0841("INVOKE_CUSTOM", 260, m3126(252, UMErrorCode.E_UM_BE_CREATE_FAILED), "invoke-custom", 5, enumC36613, 13);
        f3149 = new EnumC0841("INVOKE_CUSTOM_RANGE", 261, m3126(253, UMErrorCode.E_UM_BE_CREATE_FAILED), "invoke-custom/range", 5, enumC36614, 13);
        f3276 = new EnumC0841("CONST_METHOD_HANDLE", 262, m3126(Scalar25519.TARGET_LENGTH, 134), "const-method-handle", 6, enumC36611, 21);
        f3145 = new EnumC0841("CONST_METHOD_TYPE", 263, m3126(255, 134), "const-method-type", 4, enumC36611, 21);
        f3151 = m3119();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m3122(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public EnumC0841(String str, int i, int i2, String str2, int i3, EnumC3664 enumC3664) {
        this(str, i, i2, str2, i3, enumC3664, 0);
    }

    public EnumC0841(String str, int i, int i2, String str2, int i3, EnumC3664 enumC3664, int i4) {
        this(str, i, m3129(i2), str2, i3, enumC3664, i4);
    }

    public EnumC0841(String str, int i, List list, String str2, int i2, EnumC3664 enumC3664, int i3) {
        this(str, i, list, str2, i2, -1, enumC3664, i3);
    }

    public EnumC0841(String str, int i, List list, String str2, int i2, int i3, EnumC3664 enumC3664, int i4) {
        super(str, i);
        int i5 = C20191.f65346;
        C21602 c21602 = new C21602();
        C21602 c21603 = new C21602();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5075 c5075 = (C5075) it.next();
            C13758 c13758 = c5075.f15951;
            C13758 c13759 = c5075.f15952;
            int i6 = c5075.f15953;
            if (!c13758.m33072()) {
                c21602.m48780(c5075.f15951, Short.valueOf((short) i6));
            }
            if (!c13759.m33072()) {
                c21603.m48780(c13759, Short.valueOf((short) i6));
            }
        }
        this.f3320 = c21602.m48779();
        this.f3321 = c21603.m48779();
        this.f3315 = str2;
        this.f3318 = i2;
        this.f3317 = i3;
        this.f3316 = enumC3664;
        this.f3319 = i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m3124(int i, int i2) {
        return C7470.m20016(new C5075(C13758.m33065(Integer.valueOf(i2)), C13758.m33069(), i));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m3130(int i, int i2) {
        return C7470.m20016(new C5075(C13758.m33068(Integer.valueOf(i2)), C13758.m33069(), i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m3121(int i, int i2, int i3) {
        return C7470.m20016(new C5075(C13758.m33063(Integer.valueOf(i2), Integer.valueOf(i3)), C13758.m33069(), i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m3126(int i, int i2) {
        return C7470.m20016(new C5075(C13758.m33069(), C13758.m33065(Integer.valueOf(i2)), i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static List m3128(int i, int i2) {
        return C7470.m20016(new C5075(C13758.m33069(), C13758.m33068(Integer.valueOf(i2)), i));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m3129(int i) {
        return C7470.m20016(new C5075(C13758.m33070(), C13758.m33070(), i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m3120(int i) {
        return C7470.m20016(new C5075(C13758.m33070(), C13758.m33069(), i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m3123(int i) {
        return C7470.m20016(new C5075(C13758.m33069(), C13758.m33070(), i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m3138() {
        return (this.f3319 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m3137() {
        return (this.f3319 & 2) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3132() {
        return (this.f3319 & 4) != 0;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m3131() {
        return (this.f3319 & 8) != 0;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m3139() {
        return (this.f3319 & 16) != 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m3133() {
        return (this.f3319 & 32) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3140() {
        return (this.f3319 & 64) != 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m3134() {
        return (this.f3319 & 128) != 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m3135() {
        return (this.f3319 & 256) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m3141() {
        return (this.f3319 & 512) != 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m3136() {
        return (this.f3319 & 1024) != 0;
    }
}
