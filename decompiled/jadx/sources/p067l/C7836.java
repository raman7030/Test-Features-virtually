package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۛ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7836 extends C2628 {

    /* JADX INFO: renamed from: ֨֫ */
    public static final ConcurrentMapC12768 f20552 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֡֫ */
    public final FutureC5767 f20553;

    /* JADX INFO: renamed from: ۖ֫ */
    public final InterfaceC22097 f20554;

    /* JADX INFO: renamed from: ۘ֫ */
    public final AbstractC17043 f20555;

    /* JADX INFO: renamed from: ۚ֫ */
    public final C24913 f20556;

    /* JADX INFO: renamed from: ۡ֫ */
    public volatile boolean f20557;

    /* JADX INFO: renamed from: ܺ֫ */
    public final C3141 f20558;

    /* JADX INFO: renamed from: ᩴ֫ */
    public InterfaceC9749 f20559;

    /* JADX INFO: renamed from: ᩵֫ */
    public final C23731 f20560;

    @Override // p067l.C2628, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo4005() {
        return true;
    }

    public C7836(C24913 c24913, AbstractC17043 abstractC17043, InterfaceC22097 interfaceC22097, C23731 c23731) {
        super(c24913);
        this.f20553 = new FutureC5767();
        this.f20559 = InterfaceC9749.f26921;
        this.f20560 = c23731;
        this.f20556 = c24913;
        this.f20555 = abstractC17043;
        this.f20554 = interfaceC22097;
        if (c24913.m54773() == 0) {
            c24913.m54766(16777216L);
        }
        this.f20558 = new C3141(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC22097 m18120(AbstractC17043 abstractC17043) {
        return C8685.m20115of(abstractC17043.mo25505() + ".editable2", new String[0]).toAbsolutePath().normalize();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m18123(AbstractC17043 abstractC17043) {
        return this.f20554.equals(m18120(abstractC17043));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ */
    public static C7836 m18121(AbstractC17043 abstractC17043) {
        C24913 c24913M54703;
        InterfaceC22097 interfaceC22097M18120 = m18120(abstractC17043);
        ConcurrentMapC12768 concurrentMapC12768 = f20552;
        C7836 c7836 = (C7836) concurrentMapC12768.get(interfaceC22097M18120);
        if (c7836 != null) {
            if (!c7836.f20557) {
                throw new IOException("Text storage is already in use");
            }
            m18117(c7836.f20553);
        }
        C23731 c23731M52765 = C23731.m52765(interfaceC22097M18120);
        try {
            m18117(c23731M52765.m52768());
            C18743.createDirectories(interfaceC22097M18120.getParent(), new InterfaceC23437[0]);
            if (C18743.exists(interfaceC22097M18120, new EnumC16060[0])) {
                C18878 c18878M54719 = C24913.m54719(interfaceC22097M18120, C8467.m19691(), C8467.m19693());
                try {
                    c24913M54703 = c18878M54719.m42963();
                    try {
                        c18878M54719.close();
                    } catch (IOException e) {
                        e = e;
                        try {
                            if (c24913M54703 != null) {
                                try {
                                    c24913M54703.close();
                                } catch (IOException e2) {
                                    e.addSuppressed(e2);
                                }
                            }
                            throw e;
                        } finally {
                            c23731M52765.m52769((Throwable) null);
                        }
                    } catch (Error e3) {
                        e = e3;
                        if (c24913M54703 != null) {
                            c24913M54703.close();
                        }
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (c24913M54703 != null) {
                            c24913M54703.close();
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        c18878M54719.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                c24913M54703 = C24913.m54703(interfaceC22097M18120, C8467.m19691(), C8467.m19693());
            }
            C7836 c7837 = new C7836(c24913M54703, abstractC17043, interfaceC22097M18120, c23731M52765);
            concurrentMapC12768.put(interfaceC22097M18120, c7837);
            return c7837;
        } catch (IOException | Error | RuntimeException e5) {
            e = e5;
            c24913M54703 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7836 m18116(C14677 c14677, InterfaceC9749 interfaceC9749) {
        if (c14677.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        if (interfaceC9749 == null) {
            interfaceC9749 = InterfaceC9749.f26921;
        }
        try {
            AbstractC17043 abstractC17043Mo8471 = interfaceC9749.mo8471(c14677.m33591());
            if (!C18743.isDirectory(m18120(abstractC17043Mo8471), new EnumC16060[0])) {
                throw new IOException("Text storage is missing");
            }
            C7836 c7836M18121 = m18121(abstractC17043Mo8471);
            c7836M18121.f20559 = interfaceC9749;
            return c7836M18121;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m18115(C14677 c14677, AbstractC17043 abstractC17043) {
        if (c14677.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        String strM33591 = c14677.m33591();
        if (abstractC17043 == null) {
            abstractC17043 = InterfaceC9749.f26921.mo8471(strM33591);
        }
        InterfaceC22097 interfaceC22097M18120 = m18120(abstractC17043);
        C7836 c7836 = (C7836) f20552.get(interfaceC22097M18120);
        if (c7836 != null && !c7836.f20557) {
            C14443 c14443M28598 = c7836.m28598();
            try {
                String string = c14443M28598.toString();
                c14443M28598.close();
                return string;
            } catch (Throwable th) {
                try {
                    c14443M28598.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C23731 c23731M52765 = C23731.m52765(interfaceC22097M18120);
        try {
            try {
                m18117(c23731M52765.m52768());
                C18878 c18878M54719 = C24913.m54719(interfaceC22097M18120, C8467.m19691(), C8467.m19693());
                try {
                    C14443 c14443M42965 = c18878M54719.m42965();
                    try {
                        String string2 = c14443M42965.toString();
                        c14443M42965.close();
                        c18878M54719.close();
                        c23731M52765.m52769((Throwable) null);
                        return string2;
                    } catch (Throwable th3) {
                        try {
                            c14443M42965.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c18878M54719.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                c23731M52765.m52769((Throwable) null);
                throw th7;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // p067l.C2628, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo3991(InterfaceC9749 interfaceC9749) {
        if (interfaceC9749 == null) {
            interfaceC9749 = InterfaceC9749.f26921;
        }
        this.f20559 = interfaceC9749;
    }

    @Override // p067l.C2628, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo3992(C11996 c11996) {
        m18122();
        c11996.writeInt(-500018348);
        c11996.m27443((CharSequence) this.f20559.mo8470(this.f20555));
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m18122() {
        try {
            C24913 c24913 = this.f20556;
            m18117(c24913.m54757(c24913.m54774()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // p067l.C2628, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ܺۧ */
    public final void mo4000() {
        this.f20556.m54761();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m18124() {
        this.f20557 = true;
        this.f20558.close();
    }

    @Override // p067l.C2628, p067l.C12412, java.lang.AutoCloseable
    public final void close() {
        m18124();
        super.close();
    }

    @Override // p067l.C2628
    /* JADX INFO: renamed from: ۘ */
    public final void mo3996() {
        super.mo3996();
        this.f20556.m54769().m12887(new InterfaceC9988() { // from class: l.۬֫ܿ
            @Override // p067l.InterfaceC9988
            /* JADX INFO: renamed from: ۧ */
            public final void mo6895(Object obj, Throwable th) {
                C7836.m18118(this.f41493, th);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18118(C7836 c7836, Throwable th) {
        FutureC5767 futureC5767 = c7836.f20553;
        f20552.remove(c7836.f20554, c7836);
        c7836.f20560.m52769(th);
        if (th == null) {
            futureC5767.m12889((Object) null);
        } else {
            futureC5767.m12891(th);
        }
    }

    @Override // p067l.C12412, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ֫ */
    public final void mo14910(boolean z) {
        close();
        if (z) {
            try {
                m18117(this.f20553);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    @Override // p067l.C2628, p067l.InterfaceC9768
    /* JADX INFO: renamed from: ᩹֫ */
    public final void mo4006() {
        close();
        m18117(this.f20553);
    }

    /* JADX INFO: renamed from: ۧ */
    public static FutureC5767 m18119(AbstractC17043 abstractC17043) {
        InterfaceC22097 interfaceC22097M18120 = m18120(abstractC17043);
        final C23731 c23731M52765 = C23731.m52765(interfaceC22097M18120);
        return c23731M52765.m52768().m12897(new RunnableC13871(0, interfaceC22097M18120, abstractC17043), C4081.f8988).m12887(new InterfaceC9988() { // from class: l.ۤ֫ܿ
            @Override // p067l.InterfaceC9988
            /* JADX INFO: renamed from: ۧ */
            public final void mo6895(Object obj, Throwable th) {
                c23731M52765.m52769(th);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18117(FutureC5767 futureC5767) throws IOException {
        try {
            futureC5767.m12907();
        } catch (C15154 e) {
            throw new IOException("Text storage persistence failed", e.getCause());
        }
    }
}
