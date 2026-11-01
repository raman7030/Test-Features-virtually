package p067l;

/* JADX INFO: renamed from: l.ۗ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5448 {
    lightInsertedColor(-4266306, -1706523, -5579094),
    lightRemovedColor(-2105377, -1052689, -3618616),
    lightChangedColor(-3483142, -1380099, -4666379),
    darkInsertedColor(-14072778, -14011089, -12291758),
    darkRemovedColor(-12039606, -13158601, -10129802),
    darkChangedColor(-13085328, -13616057, -12359283);


    /* JADX INFO: renamed from: ᩶ */
    public final int f13004;

    /* JADX INFO: renamed from: ᩸ */
    public final int f13005;

    /* JADX INFO: renamed from: ᩹ */
    public final int f13006;

    EnumC5448(int i, int i2, int i3) {
        this.f13005 = i;
        this.f13006 = i2;
        this.f13004 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5448 m11961(InterfaceC2812 interfaceC2812) {
        if (interfaceC2812.mo17398() == interfaceC2812.mo17388() && interfaceC2812.mo4445() == interfaceC2812.mo4443()) {
            return (EnumC5448) C23223.m51762(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC2812.mo17396() == interfaceC2812.mo17400() && interfaceC2812.mo4448() == interfaceC2812.mo4452()) {
            return (EnumC5448) C23223.m51762(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC5448) C23223.m51762(darkChangedColor, lightChangedColor);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC5448 m11962(InterfaceC20248 interfaceC20248) {
        if (interfaceC20248.mo17398() == interfaceC20248.mo17388()) {
            return (EnumC5448) C23223.m51762(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC20248.mo17396() == interfaceC20248.mo17400()) {
            return (EnumC5448) C23223.m51762(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC5448) C23223.m51762(darkChangedColor, lightChangedColor);
    }
}
