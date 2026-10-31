package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.֫ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1719 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4314 f5948 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13359 f5949;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17013 f5950;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20661 f5951;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6136 f5952;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f5953;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22406 f5954;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6319 f5955;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7715 mo5770(C9085 c9085);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC7715 mo5771(C9791 c9791);

    public AbstractC1719(C2903 c2903) {
        c2903.m8841(f5948, this);
        this.f5949 = C13359.m32330(c2903);
        this.f5951 = C20661.m47250(c2903);
        this.f5955 = C6319.m17456(c2903);
        this.f5952 = C6136.m17057(c2903);
        this.f5950 = C17013.m39896(c2903);
        this.f5954 = C22406.m50289(c2903);
        this.f5953 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m5768(AbstractC5144 abstractC5144) {
        return m5769(abstractC5144, C2609.m8239());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m5769(AbstractC5144 abstractC5144, C2609 c2609) {
        AbstractC5144 abstractC5144M19471 = C7260.m19471(abstractC5144);
        if (abstractC5144M19471.m14709(EnumC18550.f57545) && abstractC5144M19471.f16086.mo12915() == null) {
            C9085 c9085 = (C9085) abstractC5144M19471;
            C0758 c0758 = c9085.f2830;
            if (c0758.f17559 == EnumC1296.f4571 && c0758.f2814 == 256) {
                C2609 c2609M8248 = m5769(c9085.f27533, c2609).m8248(c2609);
                C2609 c2609M5769 = m5769(c9085.f27532, c2609);
                c2609M8248.getClass();
                return c2609M5769.m8248(c2609M8248);
            }
        }
        return c2609.m8242(abstractC5144M19471);
    }
}
