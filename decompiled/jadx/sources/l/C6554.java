package l;

import java.util.Random;

/* JADX INFO: renamed from: l.ۜۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6554 implements InterfaceC3860, InterfaceC2452, InterfaceC21929, InterfaceC7520 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18061(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + "…";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18062(InterfaceC17889 interfaceC17889) {
        return interfaceC17889 != null && interfaceC17889.mo36969() && interfaceC17889.mo36971().startsWith("video/") && !C10062.m25249(interfaceC17889.getName());
    }

    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        int iM29168 = ((C11955) c16040.m37919()).m29168();
        Random random = new Random();
        StringBuilder sb = new StringBuilder(iM29168);
        sb.append(((random.nextInt() & 255) % 9) + 1);
        for (int i = 1; i < iM29168; i++) {
            sb.append((random.nextInt() & 255) % 10);
        }
        C11955 c11955 = new C11955();
        c11955.m29155(sb.toString());
        c16040.m37918(c11955);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18063(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return "…" + str.substring((str.length() - i) + 1);
    }

    @Override // l.InterfaceC21929
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo18064(float f, Float f2, Float f3) {
        float fFloatValue = f2.floatValue();
        return Float.valueOf(((f3.floatValue() - fFloatValue) * f) + fFloatValue);
    }

    @Override // l.InterfaceC7520
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2148 mo18065(String str) {
        return C7087.f21789;
    }
}
