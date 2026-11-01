package p067l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۜۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8597 implements InterfaceC6037, InterfaceC4699, InterfaceC23209, InterfaceC9515 {
    /* JADX INFO: renamed from: ֫ */
    public static String m20011(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + "…";
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20012(InterfaceC19370 interfaceC19370) {
        return interfaceC19370 != null && interfaceC19370.mo39135() && interfaceC19370.mo39137().startsWith("video/") && !C11931.m27266(interfaceC19370.getName());
    }

    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public void mo4126(C17613 c17613) {
        int iM31222 = ((C13731) c17613.m40106()).m31222();
        Random random = new Random();
        StringBuilder sb = new StringBuilder(iM31222);
        sb.append(((random.nextInt() & 255) % 9) + 1);
        for (int i = 1; i < iM31222; i++) {
            sb.append((random.nextInt() & 255) % 10);
        }
        C13731 c13731 = new C13731();
        c13731.m31209(sb.toString());
        c17613.m40105(c13731);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m20013(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return "…" + str.substring((str.length() - i) + 1);
    }

    @Override // p067l.InterfaceC23209
    /* JADX INFO: renamed from: ֫ */
    public Object mo20014(float f, Float f2, Float f3) {
        float fFloatValue = f2.floatValue();
        return Float.valueOf(((f3.floatValue() - fFloatValue) * f) + fFloatValue);
    }

    @Override // p067l.InterfaceC9515
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC4410 mo20015(String str) {
        return C9104.f24670;
    }
}
