package p067l;

/* JADX INFO: renamed from: l.ۖۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6OY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4557 {
    /* JADX INFO: renamed from: ֫ */
    public static void m9634(CharSequence charSequence, C5660 c5660, C14377 c14377, EnumC15047 enumC15047, boolean z, C20438 c20438) {
        C10856 c10856M26182;
        try {
            C22149.m49958();
            C24435 c24435 = new C24435(new C22149(charSequence));
            c24435.m45727();
            C17296 c17296 = new C17296(c24435);
            c17296.m8408();
            int iMax = 0;
            for (InterfaceC2808 interfaceC2808 : c17296.m8412()) {
                C22149.m49958();
                int type = interfaceC2808.getType();
                if (type == 15 || type == 19 || type == 8 || type == 17) {
                    iMax++;
                    if (iMax > 128) {
                        throw new IllegalArgumentException("Source nesting exceeds formatter limit");
                    }
                } else if (type == 16 || type == 20 || type == 18) {
                    iMax = Math.max(0, iMax - 1);
                }
            }
            C11263 c11263 = new C11263(c17296);
            c11263.m45727();
            int i = C10592.f29328[enumC15047.ordinal()];
            if (i == 1) {
                c10856M26182 = c11263.m26182();
            } else if (i == 2) {
                c10856M26182 = c11263.m26180();
            } else {
                if (i != 3) {
                    throw new IncompatibleClassChangeError();
                }
                c10856M26182 = c11263.m26181();
            }
            C13707 c13707 = new C13707(charSequence, c17296, c10856M26182, c5660, c14377, z, c20438);
            c13707.m31168(enumC15047);
            c13707.m31167();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C8737 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }
}
