package l;

/* JADX INFO: renamed from: l.ۨۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11646 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3926 f34736;

    public /* synthetic */ RunnableC11646(C3926 c3926) {
        this.f34736 = c3926;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0129 A[Catch: RuntimeException -> 0x01ab, TryCatch #0 {RuntimeException -> 0x01ab, blocks: (B:33:0x0080, B:35:0x00ac, B:38:0x00b8, B:40:0x00c1, B:42:0x00c7, B:44:0x00cd, B:46:0x00d5, B:48:0x00db, B:50:0x00e1, B:52:0x00e9, B:54:0x00f3, B:56:0x0105, B:58:0x010b, B:60:0x0113, B:68:0x0129, B:62:0x0117, B:64:0x011d, B:66:0x0125, B:69:0x015e, B:71:0x017c, B:73:0x0189, B:74:0x0193, B:75:0x01a0, B:37:0x00b6), top: B:81:0x0080 }] */
    @Override // java.lang.Runnable
    public final void run() {
        final C3926 c3926 = this.f34736;
        if (c3926.f12518 || c3926.f12514.f37302 != c3926) {
            return;
        }
        if (!c3926.m11970()) {
            c3926.m11969((AbstractC3179) null, (Throwable) null);
            return;
        }
        C12392 c12392 = c3926.f12514;
        if (c12392.f37211) {
            return;
        }
        if (c12392.f37258.mo9770() || c3926.f12514.f37277 || c3926.f12514.f37287 || c3926.f12514.f37187 || c3926.f12514.f37304 || c3926.f12514.f37305 != null || (c3926.f12514.f37200 != 0 && c3926.f12514.m30394() <= 0)) {
            C4925.m14316(new RunnableC11646(c3926), 10L);
            return;
        }
        C12392 c12393 = c3926.f12514;
        c3926.f12520 = c12393.f37258;
        if (!c3926.f12532) {
            c12393.m30485();
            c3926.f12523.setReadOnly(true);
            c3926.f12532 = true;
            c3926.f12514.m30282();
        }
        try {
            C7744 c7744Mo26556 = c3926.f12523.mo26556();
            c3926.f12533 = c7744Mo26556;
            c3926.f12526 = c7744Mo26556.m20767();
            c3926.f12531 = c3926.f12514.m30448();
            c3926.f12534 = c3926.f12514.f37200;
            C18743 c18743M30544 = c3926.f12514.m30544();
            if (!c3926.f12525.equals(c18743M30544) || !c3926.f12516.f10018.equals(c18743M30544)) {
                c3926.f12530 = null;
            }
            c3926.f12525 = c18743M30544;
            c3926.f12535 = null;
            C14986 c14986 = c3926.f12530;
            if (c14986 != null && !c14986.m35506() && c3926.f12529 == c3926.f12526) {
                AbstractC3179 abstractC3179 = c3926.f12516;
                if (abstractC3179.f10015 == c3926.f12523 && !abstractC3179.mo9770() && !c3926.f12516.f10019 && c3926.f12516.mo8171() == null && !c3926.f12516.f9998.isEmpty() && c3926.f12516.f9998.m47368().f35063 == c3926.f12530.m35507()) {
                    AbstractC3179 abstractC31710 = c3926.f12516;
                    if ((abstractC31710 instanceof C2575) && ((C2575) abstractC31710).m8161() && c3926.f12534 == 0) {
                        int iM35508 = c3926.f12530.m35508(0);
                        int iM35504 = c3926.f12530.m35504() - 1;
                        c3926.f12535 = new C3096(c3926.f12516, iM35508, c3926.f12530.m35510(iM35504) - iM35508, c3926.f12530.m35502(iM35504) - c3926.f12530.m35505(0), c3926.f12526, c3926.f12514.m30394());
                    } else {
                        AbstractC3179 abstractC31711 = c3926.f12516;
                        if ((abstractC31711 instanceof C17474) && ((C17474) abstractC31711).m40870() && c3926.f12534 != 0) {
                            int iM35509 = c3926.f12530.m35508(0);
                            int iM35505 = c3926.f12530.m35504() - 1;
                            c3926.f12535 = new C3096(c3926.f12516, iM35509, c3926.f12530.m35510(iM35505) - iM35509, c3926.f12530.m35502(iM35505) - c3926.f12530.m35505(0), c3926.f12526, c3926.f12514.m30394());
                        }
                    }
                }
            }
            c3926.f12530 = C14986.m35494(c3926.f12533.length(), new C7931[0]);
            c3926.f12529 = c3926.f12526;
            c3926.f12518 = true;
            if (c3926.f12514.f37235.m18574()) {
                c3926.f12514.f37235.m18602(c3926.f12523);
                C3096 c3096 = c3926.f12535;
                if (c3096 == null) {
                    c3926.f12514.f37235.m18584(c3926.f12523);
                } else {
                    c3926.f12514.f37235.m18580(c3926.f12523, c3096.f9687, c3096.f9684);
                }
            }
            C1802.f6208.execute(new Runnable() { // from class: l.᩷ۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    c3926.m11972();
                }
            });
        } catch (RuntimeException e) {
            c3926.m11969((AbstractC3179) null, e);
        }
    }
}
