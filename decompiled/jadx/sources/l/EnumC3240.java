package l;

/* JADX INFO: renamed from: l.ۗ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3240 {
    lightInsertedColor(-4266306, -1706523, -5579094),
    lightRemovedColor(-2105377, -1052689, -3618616),
    lightChangedColor(-3483142, -1380099, -4666379),
    darkInsertedColor(-14072778, -14011089, -12291758),
    darkRemovedColor(-12039606, -13158601, -10129802),
    darkChangedColor(-13085328, -13616057, -12359283);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10197;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f10198;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f10199;

    EnumC3240(int i, int i2, int i3) {
        this.f10198 = i;
        this.f10199 = i2;
        this.f10197 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3240 m9913(InterfaceC0467 interfaceC0467) {
        if (interfaceC0467.mo15487() == interfaceC0467.mo15477() && interfaceC0467.mo2065() == interfaceC0467.mo2063()) {
            return (EnumC3240) C21943.m49425(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC0467.mo15485() == interfaceC0467.mo15489() && interfaceC0467.mo2068() == interfaceC0467.mo2072()) {
            return (EnumC3240) C21943.m49425(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC3240) C21943.m49425(darkChangedColor, lightChangedColor);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC3240 m9914(InterfaceC18813 interfaceC18813) {
        if (interfaceC18813.mo15487() == interfaceC18813.mo15477()) {
            return (EnumC3240) C21943.m49425(darkInsertedColor, lightInsertedColor);
        }
        if (interfaceC18813.mo15485() == interfaceC18813.mo15489()) {
            return (EnumC3240) C21943.m49425(darkRemovedColor, lightRemovedColor);
        }
        return (EnumC3240) C21943.m49425(darkChangedColor, lightChangedColor);
    }
}
