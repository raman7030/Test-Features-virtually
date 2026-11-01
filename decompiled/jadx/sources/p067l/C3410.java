package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3410 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f6765 = {12582912, 25165824, 50331648};

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC7434 f6766;

    /* JADX INFO: renamed from: ܽ */
    public static volatile InterfaceC2739 f6767;

    /* JADX INFO: renamed from: ᩳ */
    public static volatile InterfaceC7434 f6768;

    static {
        C20175 c20175 = new C20175();
        C20846 c20846 = new C20846();
        f6766 = c20846;
        f6767 = c20175;
        f6768 = c20846;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m6038(InputStream inputStream) {
        InterfaceC2739 interfaceC2739 = f6767;
        C12826.requireNonNull(inputStream, "inputStream");
        return interfaceC2739.mo4278(inputStream);
    }

    /* JADX INFO: renamed from: ֫ */
    public static OutputStream m6039(OutputStream outputStream, int i) {
        C12826.requireNonNull(outputStream, "outputStream");
        InterfaceC7434 interfaceC7434 = f6768;
        if (!interfaceC7434.mo17183(i)) {
            interfaceC7434 = f6766;
        }
        return interfaceC7434.mo17182(outputStream, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12655 m6040(int i) throws C11314 {
        C12655 c12655 = new C12655();
        c12655.m29113(i);
        if (i >= 7 && i <= 9) {
            c12655.m29109(f6765[i - 7]);
        }
        return c12655;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6042(C19158 c19158) {
        f6767 = c19158;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6041(InterfaceC7434 interfaceC7434) {
        f6768 = interfaceC7434;
    }
}
