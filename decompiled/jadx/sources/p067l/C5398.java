package p067l;

import java.io.IOError;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z40Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C5398 {
    /* JADX INFO: renamed from: ֫ */
    public static int m11850(InterfaceC14919 interfaceC14919) {
        AbstractC7257 abstractC7257 = (AbstractC7257) interfaceC14919;
        abstractC7257.getClass();
        return C9268.m21421(abstractC7257);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static String m11851(InterfaceC4191 interfaceC4191, C5831 c5831) {
        try {
            return c5831.m13114().mo6846().mo9471(false).subSequence(m11850((InterfaceC14919) interfaceC4191), C9268.m21397((AbstractC7257) interfaceC4191, ((C3626) c5831.m13114()).f7514)).toString();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC16446 m11853(InterfaceC18943 interfaceC18943) {
        InterfaceC21431 interfaceC21431Mo38909 = interfaceC18943.mo38909();
        if (interfaceC21431Mo38909 instanceof InterfaceC19614) {
            return ((InterfaceC19614) interfaceC21431Mo38909).mo19211();
        }
        return ((InterfaceC14724) interfaceC21431Mo38909).getName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static String m11852(InterfaceC21431 interfaceC21431) {
        EnumC19998 enumC19998Mo3383 = ((AbstractC7257) interfaceC21431).mo3383();
        if (enumC19998Mo3383 == EnumC19998.f60746) {
            return "=";
        }
        boolean z = interfaceC21431 instanceof InterfaceC4667;
        if (z) {
            enumC19998Mo3383 = enumC19998Mo3383.m45374();
        }
        new C22680(null, true);
        String strM50773 = C22680.m50773(enumC19998Mo3383);
        return z ? strM50773.concat("=") : strM50773;
    }
}
