package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L73L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7241 implements InterfaceC9934 {
    /* JADX INFO: renamed from: ֫ */
    public static String m16586(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16587(int i, String str, String str2) {
        int upperCase;
        int upperCase2;
        int iCharCount = 0;
        while (iCharCount < str2.length()) {
            if (i >= str.length()) {
                return false;
            }
            int iCodePointAt = str.codePointAt(i);
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt != iCodePointAt2 && (upperCase = Character.toUpperCase(iCodePointAt)) != (upperCase2 = Character.toUpperCase(iCodePointAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
            i += Character.charCount(iCodePointAt);
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public C17317 m16588() {
        return new C17317(2, 1, InterfaceC8974.f24307, new C11157(C14849.FOREVER_NS), new C21874(24));
    }
}
