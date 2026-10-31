package l;

/* JADX INFO: renamed from: l.ۖۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6OY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2303 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7566(CharSequence charSequence, C3463 c3463, C12635 c12635, EnumC13340 enumC13340, boolean z, C19012 c19012) {
        C8931 c8931M24172;
        try {
            C20813.m47630();
            C23218 c23218 = new C23218(new C20813(charSequence));
            c23218.m43458();
            C15707 c15707 = new C15707(c23218);
            c15707.m6206();
            int iMax = 0;
            for (InterfaceC0463 interfaceC0463 : c15707.m6210()) {
                C20813.m47630();
                int type = interfaceC0463.getType();
                if (type == 15 || type == 19 || type == 8 || type == 17) {
                    iMax++;
                    if (iMax > 128) {
                        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
                    }
                } else if (type == 16 || type == 20 || type == 18) {
                    iMax = Math.max(0, iMax - 1);
                }
            }
            C9359 c9359 = new C9359(c15707);
            c9359.m43458();
            int i = C8653.f26410[enumC13340.ordinal()];
            if (i == 1) {
                c8931M24172 = c9359.m24172();
            } else if (i == 2) {
                c8931M24172 = c9359.m24170();
            } else {
                if (i != 3) {
                    throw new IncompatibleClassChangeError();
                }
                c8931M24172 = c9359.m24171();
            }
            C11930 c11930 = new C11930(charSequence, c15707, c8931M24172, c3463, c12635, z, c19012);
            c11930.m29115(enumC13340);
            c11930.m29114();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C6701 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }
}
