package p067l;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩶᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21740 implements InterfaceC9934, InterfaceC16692 {
    /* JADX INFO: renamed from: ֫ */
    public static float m49018(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m49019(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m49020(C14362 c14362, C19247 c19247, String str, String str2, String str3) {
        EnumC5645 enumC5645M32962 = c14362.m32962();
        c19247.getClass();
        return C19247.m43848(str, str2, str3, enumC5645M32962);
    }

    @Override // p067l.InterfaceC16692
    /* JADX INFO: renamed from: ֫ */
    public Object mo27141(Object obj, Throwable th) {
        return th;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }
}
