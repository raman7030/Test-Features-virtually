package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public final class C22015 implements Cloneable {

    /* JADX INFO: renamed from: ֡֫ */
    public EnumC17990 f69258;

    /* JADX INFO: renamed from: ֨֫ */
    public Float f69259;

    /* JADX INFO: renamed from: ֫֫ */
    public EnumC19332 f69260;

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC3238 f69261;

    /* JADX INFO: renamed from: ۗ */
    public EnumC24696 f69262;

    /* JADX INFO: renamed from: ۗ֫ */
    public Boolean f69263;

    /* JADX INFO: renamed from: ۘ֫ */
    public C3099[] f69264;

    /* JADX INFO: renamed from: ۙ */
    public C21876 f69265;

    /* JADX INFO: renamed from: ۙ֫ */
    public Float f69266;

    /* JADX INFO: renamed from: ۚ֫ */
    public Float f69267;

    /* JADX INFO: renamed from: ۛ */
    public EnumC9135 f69268;

    /* JADX INFO: renamed from: ۜ֫ */
    public AbstractC3238 f69269;

    /* JADX INFO: renamed from: ۟ */
    public Integer f69270;

    /* JADX INFO: renamed from: ۠֫ */
    public C3099 f69271;

    /* JADX INFO: renamed from: ۡ֫ */
    public AbstractC3238 f69272;

    /* JADX INFO: renamed from: ۢ֫ */
    public long f69273 = 0;

    /* JADX INFO: renamed from: ۤ */
    public Float f69274;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f69275;

    /* JADX INFO: renamed from: ۨ */
    public ArrayList f69276;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC3238 f69277;

    /* JADX INFO: renamed from: ۬ */
    public Boolean f69278;

    /* JADX INFO: renamed from: ܰ */
    public EnumC3909 f69279;

    /* JADX INFO: renamed from: ܳ֫ */
    public Float f69280;

    /* JADX INFO: renamed from: ܶ֫ */
    public EnumC18661 f69281;

    /* JADX INFO: renamed from: ܺ֫ */
    public Float f69282;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f69283;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f69284;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f69285;

    /* JADX INFO: renamed from: ᩴ֫ */
    public C3099 f69286;

    /* JADX INFO: renamed from: ᩵֫ */
    public EnumC12627 f69287;

    /* JADX INFO: renamed from: ᩶ */
    public EnumC9135 f69288;

    /* JADX INFO: renamed from: ᩶֫ */
    public AbstractC3238 f69289;

    /* JADX INFO: renamed from: ᩷֫ */
    public Float f69290;

    /* JADX INFO: renamed from: ᩸ */
    public C15839 f69291;

    /* JADX INFO: renamed from: ᩸֫ */
    public EnumC15978 f69292;

    /* JADX INFO: renamed from: ᩹ */
    public String f69293;

    /* JADX INFO: renamed from: ᩹֫ */
    public EnumC8603 f69294;

    /* JADX INFO: renamed from: ᩺ */
    public C3099 f69295;

    /* JADX INFO: renamed from: ᩻֫ */
    public Boolean f69296;

    /* JADX INFO: renamed from: ֫ */
    public static C22015 m49618() {
        C22015 c22015 = new C22015();
        c22015.f69273 = -1L;
        C21876 c21876 = C21876.f68815;
        c22015.f69277 = c21876;
        EnumC9135 enumC9135 = EnumC9135.NonZero;
        c22015.f69268 = enumC9135;
        Float fValueOf = Float.valueOf(1.0f);
        c22015.f69274 = fValueOf;
        c22015.f69261 = null;
        c22015.f69259 = fValueOf;
        c22015.f69271 = new C3099(1.0f);
        c22015.f69287 = EnumC12627.Butt;
        c22015.f69258 = EnumC17990.Miter;
        c22015.f69267 = Float.valueOf(4.0f);
        c22015.f69264 = null;
        c22015.f69286 = new C3099(0.0f);
        c22015.f69280 = fValueOf;
        c22015.f69265 = c21876;
        c22015.f69276 = null;
        c22015.f69295 = new C3099(12.0f, EnumC9273.pt);
        c22015.f69270 = 400;
        c22015.f69279 = EnumC3909.Normal;
        c22015.f69292 = EnumC15978.None;
        c22015.f69262 = EnumC24696.LTR;
        c22015.f69281 = EnumC18661.Start;
        Boolean bool = Boolean.TRUE;
        c22015.f69296 = bool;
        c22015.f69291 = null;
        c22015.f69285 = null;
        c22015.f69283 = null;
        c22015.f69275 = null;
        c22015.f69278 = bool;
        c22015.f69263 = bool;
        c22015.f69272 = c21876;
        c22015.f69282 = fValueOf;
        c22015.f69293 = null;
        c22015.f69288 = enumC9135;
        c22015.f69284 = null;
        c22015.f69269 = null;
        c22015.f69290 = fValueOf;
        c22015.f69289 = null;
        c22015.f69266 = fValueOf;
        c22015.f69294 = EnumC8603.None;
        c22015.f69260 = EnumC19332.auto;
        return c22015;
    }

    public final Object clone() {
        C22015 c22015 = (C22015) super.clone();
        C3099[] c3099Arr = this.f69264;
        if (c3099Arr != null) {
            c22015.f69264 = (C3099[]) c3099Arr.clone();
        }
        return c22015;
    }
}
