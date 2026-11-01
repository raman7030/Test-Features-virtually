package p067l;

/* JADX INFO: renamed from: l.ۨۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13437 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6100 f37732;

    public /* synthetic */ RunnableC13437(C6100 c6100) {
        this.f37732 = c6100;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0129 A[Catch: RuntimeException -> 0x01ab, TryCatch #0 {RuntimeException -> 0x01ab, blocks: (B:33:0x0080, B:35:0x00ac, B:38:0x00b8, B:40:0x00c1, B:42:0x00c7, B:44:0x00cd, B:46:0x00d5, B:48:0x00db, B:50:0x00e1, B:52:0x00e9, B:54:0x00f3, B:56:0x0105, B:58:0x010b, B:60:0x0113, B:68:0x0129, B:62:0x0117, B:64:0x011d, B:66:0x0125, B:69:0x015e, B:71:0x017c, B:73:0x0189, B:74:0x0193, B:75:0x01a0, B:37:0x00b6), top: B:81:0x0080 }] */
    @Override // java.lang.Runnable
    public final void run() {
        final C6100 c6100 = this.f37732;
        if (c6100.f15325 || c6100.f15321.f40319 != c6100) {
            return;
        }
        if (!c6100.m13890()) {
            c6100.m13889((AbstractC5390) null, (Throwable) null);
            return;
        }
        C14146 c14146 = c6100.f15321;
        if (c14146.f40228) {
            return;
        }
        if (c14146.f40275.mo11814() || c6100.f15321.f40294 || c6100.f15321.f40304 || c6100.f15321.f40204 || c6100.f15321.f40321 || c6100.f15321.f40322 != null || (c6100.f15321.f40217 != 0 && c6100.f15321.m32458() <= 0)) {
            C7050.m16213(new RunnableC13437(c6100), 10L);
            return;
        }
        C14146 c14147 = c6100.f15321;
        c6100.f15327 = c14147.f40275;
        if (!c6100.f15339) {
            c14147.m32549();
            c6100.f15330.setReadOnly(true);
            c6100.f15339 = true;
            c6100.f15321.m32346();
        }
        try {
            C9729 c9729Mo28589 = c6100.f15330.mo28589();
            c6100.f15340 = c9729Mo28589;
            c6100.f15333 = c9729Mo28589.m22747();
            c6100.f15338 = c6100.f15321.m32512();
            c6100.f15341 = c6100.f15321.f40217;
            C20182 c20182M32608 = c6100.f15321.m32608();
            if (!c6100.f15332.equals(c20182M32608) || !c6100.f15323.f12818.equals(c20182M32608)) {
                c6100.f15337 = null;
            }
            c6100.f15332 = c20182M32608;
            c6100.f15342 = null;
            C16611 c16611 = c6100.f15337;
            if (c16611 != null && !c16611.m37662() && c6100.f15336 == c6100.f15333) {
                AbstractC5390 abstractC5390 = c6100.f15323;
                if (abstractC5390.f12815 == c6100.f15330 && !abstractC5390.mo11814() && !c6100.f15323.f12819 && c6100.f15323.mo10204() == null && !c6100.f15323.f12798.isEmpty() && c6100.f15323.f12798.m49695().f38062 == c6100.f15337.m37663()) {
                    AbstractC5390 abstractC5391 = c6100.f15323;
                    if ((abstractC5391 instanceof C4816) && ((C4816) abstractC5391).m10194() && c6100.f15341 == 0) {
                        int iM37664 = c6100.f15337.m37664(0);
                        int iM37660 = c6100.f15337.m37660() - 1;
                        c6100.f15342 = new C5311(c6100.f15323, iM37664, c6100.f15337.m37666(iM37660) - iM37664, c6100.f15337.m37658(iM37660) - c6100.f15337.m37661(0), c6100.f15333, c6100.f15321.m32458());
                    } else {
                        AbstractC5390 abstractC5392 = c6100.f15323;
                        if ((abstractC5392 instanceof C18976) && ((C18976) abstractC5392).m43128() && c6100.f15341 != 0) {
                            int iM37665 = c6100.f15337.m37664(0);
                            int iM37661 = c6100.f15337.m37660() - 1;
                            c6100.f15342 = new C5311(c6100.f15323, iM37665, c6100.f15337.m37666(iM37661) - iM37665, c6100.f15337.m37658(iM37661) - c6100.f15337.m37661(0), c6100.f15333, c6100.f15321.m32458());
                        }
                    }
                }
            }
            c6100.f15337 = C16611.m37650(c6100.f15340.length(), new C9906[0]);
            c6100.f15336 = c6100.f15333;
            c6100.f15325 = true;
            if (c6100.f15321.f40252.m20523()) {
                c6100.f15321.f40252.m20551(c6100.f15330);
                C5311 c5311 = c6100.f15342;
                if (c5311 == null) {
                    c6100.f15321.f40252.m20533(c6100.f15330);
                } else {
                    c6100.f15321.f40252.m20529(c6100.f15330, c5311.f12489, c5311.f12486);
                }
            }
            C4081.f8987.execute(new Runnable() { // from class: l.᩷ۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    c6100.m13892();
                }
            });
        } catch (RuntimeException e) {
            c6100.m13889((AbstractC5390) null, e);
        }
    }
}
