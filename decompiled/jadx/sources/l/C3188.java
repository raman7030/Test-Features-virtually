package l;

import java.io.IOError;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z40Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C3188 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m9805(InterfaceC13206 interfaceC13206) {
        AbstractC5144 abstractC5144 = (AbstractC5144) interfaceC13206;
        abstractC5144.getClass();
        return C7260.m19455(abstractC5144);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9806(InterfaceC1918 interfaceC1918, C3644 c3644) {
        try {
            return c3644.m11138().mo4614().mo7388(false).subSequence(m9805((InterfaceC13206) interfaceC1918), C7260.m19431((AbstractC5144) interfaceC1918, ((C1323) c3644.m11138()).f4743)).toString();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14812 m9808(InterfaceC17440 interfaceC17440) {
        InterfaceC20058 interfaceC20058Mo36749 = interfaceC17440.mo36749();
        if (interfaceC20058Mo36749 instanceof InterfaceC18146) {
            return ((InterfaceC18146) interfaceC20058Mo36749).mo17273();
        }
        return ((InterfaceC13001) interfaceC20058Mo36749).getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9807(InterfaceC20058 interfaceC20058) {
        EnumC18550 enumC18550Mo989 = ((AbstractC5144) interfaceC20058).mo989();
        if (enumC18550Mo989 == EnumC18550.f57522) {
            return "=";
        }
        boolean z = interfaceC20058 instanceof InterfaceC2419;
        if (z) {
            enumC18550Mo989 = enumC18550Mo989.m43096();
        }
        new C21372(null, true);
        String strM48437 = C21372.m48437(enumC18550Mo989);
        return z ? strM48437.concat("=") : strM48437;
    }
}
