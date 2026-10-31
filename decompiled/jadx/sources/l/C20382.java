package l;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩶᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20382 implements InterfaceC7961, InterfaceC15071 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m46695(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m46696(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        configurableProvider.addAlgorithm(str3, str4);
        return new StringBuilder();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m46697(C12619 c12619, C17760 c17760, String str, String str2, String str3) {
        EnumC3447 enumC3447M30885 = c12619.m30885();
        c17760.getClass();
        return C17760.m41603(str, str2, str3, enumC3447M30885);
    }

    @Override // l.InterfaceC15071
    /* JADX INFO: renamed from: ֫ */
    public Object mo25124(Object obj, Throwable th) {
        return th;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }
}
