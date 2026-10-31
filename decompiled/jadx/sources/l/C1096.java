package l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C1096 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f3994 = {12582912, 25165824, 50331648};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5330 f3995;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC0390 f3996;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static volatile InterfaceC5330 f3997;

    static {
        C18736 c18736 = new C18736();
        C19442 c19442 = new C19442();
        f3995 = c19442;
        f3996 = c18736;
        f3997 = c19442;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m3765(InputStream inputStream) {
        InterfaceC0390 interfaceC0390 = f3996;
        C11003.requireNonNull(inputStream, "inputStream");
        return interfaceC0390.mo1886(inputStream);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OutputStream m3766(OutputStream outputStream, int i) {
        C11003.requireNonNull(outputStream, "outputStream");
        InterfaceC5330 interfaceC5330 = f3997;
        if (!interfaceC5330.mo15276(i)) {
            interfaceC5330 = f3995;
        }
        return interfaceC5330.mo15275(outputStream, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10824 m3767(int i) throws C9413 {
        C10824 c10824 = new C10824();
        c10824.m27068(i);
        if (i >= 7 && i <= 9) {
            c10824.m27064(f3994[i - 7]);
        }
        return c10824;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3769(C17665 c17665) {
        f3996 = c17665;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3768(InterfaceC5330 interfaceC5330) {
        f3997 = interfaceC5330;
    }
}
