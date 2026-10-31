package l;

import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۛ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C5753 extends C0273 {

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f17707 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f17708;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f17709;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f17710;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f17711;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f17712;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C0813 f17713;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7765 f17714;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C22477 f17715;

    @Override // l.C0273, l.InterfaceC7785
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo1607() {
        return true;
    }

    public C5753(C23721 c23721, AbstractC15440 abstractC15440, InterfaceC20758 interfaceC20758, C22477 c22477) {
        super(c23721);
        this.f17708 = new FutureC3575();
        this.f17714 = InterfaceC7765.f24007;
        this.f17715 = c22477;
        this.f17711 = c23721;
        this.f17710 = abstractC15440;
        this.f17709 = interfaceC20758;
        if (c23721.m52370() == 0) {
            c23721.m52363(16777216L);
        }
        this.f17713 = new C0813(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m16201(AbstractC15440 abstractC15440) {
        return C6646.of(abstractC15440.mo23554() + ".editable2", new String[0]).toAbsolutePath().normalize();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16204(AbstractC15440 abstractC15440) {
        return this.f17709.equals(m16201(abstractC15440));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C5753 m16202(AbstractC15440 abstractC15440) {
        C23721 c23721M52300;
        InterfaceC20758 interfaceC20758M16201 = m16201(abstractC15440);
        ConcurrentMapC10942 concurrentMapC10942 = f17707;
        C5753 c5753 = (C5753) concurrentMapC10942.get(interfaceC20758M16201);
        if (c5753 != null) {
            if (!c5753.f17712) {
                throw new IOException("Text storage is already in use");
            }
            m16198(c5753.f17708);
        }
        C22477 c22477M50424 = C22477.m50424(interfaceC20758M16201);
        try {
            m16198(c22477M50424.m50427());
            C17229.createDirectories(interfaceC20758M16201.getParent(), new InterfaceC22168[0]);
            if (C17229.exists(interfaceC20758M16201, new EnumC14406[0])) {
                C17371 c17371M52316 = C23721.m52316(interfaceC20758M16201, C6417.m17744(), C6417.m17746());
                try {
                    c23721M52300 = c17371M52316.m40712();
                    try {
                        c17371M52316.close();
                    } catch (IOException e) {
                        e = e;
                        try {
                            if (c23721M52300 != null) {
                                try {
                                    c23721M52300.close();
                                } catch (IOException e2) {
                                    e.addSuppressed(e2);
                                }
                            }
                            throw e;
                        } finally {
                            c22477M50424.m50428((Throwable) null);
                        }
                    } catch (Error e3) {
                        e = e3;
                        if (c23721M52300 != null) {
                            c23721M52300.close();
                        }
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        if (c23721M52300 != null) {
                            c23721M52300.close();
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        c17371M52316.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                c23721M52300 = C23721.m52300(interfaceC20758M16201, C6417.m17744(), C6417.m17746());
            }
            C5753 c5754 = new C5753(c23721M52300, abstractC15440, interfaceC20758M16201, c22477M50424);
            concurrentMapC10942.put(interfaceC20758M16201, c5754);
            return c5754;
        } catch (IOException | Error | RuntimeException e5) {
            e = e5;
            c23721M52300 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5753 m16197(C12951 c12951, InterfaceC7765 interfaceC7765) {
        if (c12951.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        if (interfaceC7765 == null) {
            interfaceC7765 = InterfaceC7765.f24007;
        }
        try {
            AbstractC15440 abstractC15440Mo6269 = interfaceC7765.mo6269(c12951.m31504());
            if (!C17229.isDirectory(m16201(abstractC15440Mo6269), new EnumC14406[0])) {
                throw new IOException("Text storage is missing");
            }
            C5753 c5753M16202 = m16202(abstractC15440Mo6269);
            c5753M16202.f17714 = interfaceC7765;
            return c5753M16202;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m16196(C12951 c12951, AbstractC15440 abstractC15440) {
        if (c12951.readInt() != -500018348) {
            throw new IllegalArgumentException("Invalid stored text magic");
        }
        String strM31504 = c12951.m31504();
        if (abstractC15440 == null) {
            abstractC15440 = InterfaceC7765.f24007.mo6269(strM31504);
        }
        InterfaceC20758 interfaceC20758M16201 = m16201(abstractC15440);
        C5753 c5753 = (C5753) f17707.get(interfaceC20758M16201);
        if (c5753 != null && !c5753.f17712) {
            C12704 c12704M26565 = c5753.m26565();
            try {
                String string = c12704M26565.toString();
                c12704M26565.close();
                return string;
            } catch (Throwable th) {
                try {
                    c12704M26565.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C22477 c22477M50424 = C22477.m50424(interfaceC20758M16201);
        try {
            try {
                m16198(c22477M50424.m50427());
                C17371 c17371M52316 = C23721.m52316(interfaceC20758M16201, C6417.m17744(), C6417.m17746());
                try {
                    C12704 c12704M40714 = c17371M52316.m40714();
                    try {
                        String string2 = c12704M40714.toString();
                        c12704M40714.close();
                        c17371M52316.close();
                        c22477M50424.m50428((Throwable) null);
                        return string2;
                    } catch (Throwable th3) {
                        try {
                            c12704M40714.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c17371M52316.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                c22477M50424.m50428((Throwable) null);
                throw th7;
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C0273, l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final void mo1593(InterfaceC7765 interfaceC7765) {
        if (interfaceC7765 == null) {
            interfaceC7765 = InterfaceC7765.f24007;
        }
        this.f17714 = interfaceC7765;
    }

    @Override // l.C0273, l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final void mo1594(C10130 c10130) {
        m16203();
        c10130.writeInt(-500018348);
        c10130.m25423((CharSequence) this.f17714.mo6268(this.f17710));
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m16203() {
        try {
            C23721 c23721 = this.f17711;
            m16198(c23721.m52354(c23721.m52371()));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override // l.C0273, l.InterfaceC7785
    /* JADX INFO: renamed from: ܺۧ */
    public final void mo1602() {
        this.f17711.m52358();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m16205() {
        this.f17712 = true;
        this.f17713.close();
    }

    @Override // l.C0273, l.C10567, java.lang.AutoCloseable
    public final void close() {
        m16205();
        super.close();
    }

    @Override // l.C0273
    /* JADX INFO: renamed from: ۘ */
    public final void mo1598() {
        super.mo1598();
        this.f17711.m52366().m10910(new InterfaceC8017() { // from class: l.۬֫ܿ
            @Override // l.InterfaceC8017
            /* JADX INFO: renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                C5753.m16199(this.f38451, th);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16199(C5753 c5753, Throwable th) {
        FutureC3575 futureC3575 = c5753.f17708;
        f17707.remove(c5753.f17709, c5753);
        c5753.f17715.m50428(th);
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }

    @Override // l.C10567, l.InterfaceC7785
    /* JADX INFO: renamed from: ֫ */
    public final void mo13046(boolean z) {
        close();
        if (z) {
            try {
                m16198(this.f17708);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    @Override // l.C0273, l.InterfaceC7785
    /* JADX INFO: renamed from: ᩹֫ */
    public final void mo1608() {
        close();
        m16198(this.f17708);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m16200(AbstractC15440 abstractC15440) {
        InterfaceC20758 interfaceC20758M16201 = m16201(abstractC15440);
        final C22477 c22477M50424 = C22477.m50424(interfaceC20758M16201);
        return c22477M50424.m50427().m10920(new RunnableC12103(0, interfaceC20758M16201, abstractC15440), C1802.f6209).m10910(new InterfaceC8017() { // from class: l.ۤ֫ܿ
            @Override // l.InterfaceC8017
            /* JADX INFO: renamed from: ۧ */
            public final void mo4663(Object obj, Throwable th) {
                c22477M50424.m50428(th);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16198(FutureC3575 futureC3575) throws IOException {
        try {
            futureC3575.m10930();
        } catch (C13452 e) {
            throw new IOException("Text storage persistence failed", e.getCause());
        }
    }
}
