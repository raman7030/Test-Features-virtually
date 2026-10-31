package l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩺᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes.dex */
public final class C23324 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f74953 = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f74954;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12741 f74955;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f74956;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12036 f74957;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74958;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f74959;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11813 f74960;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74961;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Executor f74962;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5272 f74963;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1038 f74964;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51714(final C23324 c23324, final C12036 c12036) {
        c23324.getClass();
        final C11813 c11813M11257 = null;
        try {
            if (!c12036.f36017) {
                if (c12036.f36018 == 4) {
                    c11813M11257 = c12036.f36020.mo9350(c12036.f36021, c12036.f36016, c12036.f36019);
                } else {
                    c11813M11257 = ((C3695) c12036.f36020).m11257(c12036.f36016, c12036.f36019, false);
                }
            }
        } catch (Throwable unused) {
        }
        C12741 c12741 = c23324.f74955;
        Runnable runnable = new Runnable() { // from class: l.ۤ᩻ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C23324.m51715(this.f31911, c12036, c11813M11257);
            }
        };
        c12741.getClass();
        C4925.m14315(runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51715(C23324 c23324, C12036 c12036, C11813 c11813) {
        c23324.getClass();
        if (c12036.f36015 != c23324.f74961) {
            if (c23324.f74957 == c12036) {
                c23324.f74957 = null;
                c23324.f74960 = null;
                c23324.f74958 = false;
            }
        } else {
            c23324.f74960 = c11813;
            c23324.f74958 = true;
        }
        c23324.f74963.accept(0L);
    }

    public C23324(C5272 c5272, C1038 c1038) {
        C12741 c12741 = new C12741();
        this.f74956 = new IdentityHashMap();
        this.f74954 = Collections.EMPTY_LIST;
        this.f74962 = f74953;
        this.f74955 = c12741;
        this.f74963 = c5272;
        this.f74964 = c1038;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51717() {
        this.f74961++;
        this.f74954 = Collections.EMPTY_LIST;
        this.f74956.clear();
        this.f74959 = 0L;
        C12036 c12036 = this.f74957;
        if (c12036 != null) {
            c12036.f36017 = true;
        }
        if (this.f74958) {
            this.f74957 = null;
            this.f74960 = null;
            this.f74958 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[EDGE_INSN: B:90:0x015f->B:93:0x0193 BREAK  A[LOOP:2: B:69:0x0116->B:86:0x0154]] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51718(List list, int i, AbstractC16891 abstractC16891, InterfaceC10834 interfaceC10834, int i2, long j) {
        int i3;
        long j2;
        C11813 c11813M11257;
        if (this.f74954 != list) {
            this.f74954 = list;
            this.f74956.keySet().retainAll(list);
        }
        int iMin = Math.min(i, list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) list.get(i4);
            C6391 c6391 = (C6391) this.f74956.get(interfaceC17889);
            if (c6391 == null) {
                c6391 = new C6391(0);
                this.f74956.put(interfaceC17889, c6391);
            }
            if (i4 >= iMin) {
                c6391.f19782 = -1L;
            } else if (c6391.f19782 < 0) {
                c6391.f19782 = j;
            }
        }
        C12036 c12036 = this.f74957;
        if (c12036 != null) {
            if (list.contains(c12036.f36016)) {
                C12036 c12037 = this.f74957;
                if (c12037.f36020 == interfaceC10834) {
                    if (c12037.f36021 != abstractC16891) {
                    }
                }
                this.f74957.f36017 = true;
            } else {
                this.f74957.f36017 = true;
            }
        }
        if (this.f74958) {
            C12036 c12038 = this.f74957;
            C11813 c11813 = this.f74960;
            this.f74957 = null;
            this.f74960 = null;
            this.f74958 = false;
            if (c12038.f36017 || c12038.f36015 != this.f74961) {
                C6391 c6392 = (C6391) this.f74956.get(c12038.f36016);
                if (c6392 != null) {
                    c6392.f19781 = 0;
                }
            } else if (c11813 != null) {
                InterfaceC17889 interfaceC178810 = c12038.f36016;
                C11813 icon = interfaceC178810.getIcon();
                interfaceC178810.mo36966(c11813);
                if (icon != c11813) {
                    this.f74964.n(interfaceC178810);
                }
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < iMin; i6++) {
            InterfaceC17889 interfaceC178811 = (InterfaceC17889) list.get(i6);
            int iMo36984 = interfaceC178811.mo36984();
            if (iMo36984 != 0 && !m51716(interfaceC178811, 1)) {
                ((C6391) this.f74956.get(interfaceC178811)).f19781 |= 1;
                try {
                    c11813M11257 = ((C3695) interfaceC10834).m11257(interfaceC178811, iMo36984, true);
                } catch (Throwable unused) {
                    c11813M11257 = null;
                }
                if (c11813M11257 != null) {
                    C11813 icon2 = interfaceC178811.getIcon();
                    interfaceC178811.mo36966(c11813M11257);
                    if (icon2 != c11813M11257) {
                        this.f74964.n(interfaceC178811);
                    }
                    i5++;
                    if (i5 == 2) {
                        this.f74963.accept(0L);
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.f74957 != null) {
            return;
        }
        if (i2 != 2) {
            iMin = list.size();
        }
        long jMin = C13132.FOREVER_NS;
        for (int i7 = 0; i7 < iMin; i7++) {
            InterfaceC17889 interfaceC178812 = (InterfaceC17889) list.get(i7);
            int iMo36985 = interfaceC178812.mo36984();
            if (iMo36985 != 0) {
                if (i2 == 2) {
                    if (m51716(interfaceC178812, 2)) {
                        if (!m51716(interfaceC178812, 4)) {
                            long j3 = ((C6391) this.f74956.get(interfaceC178812)).f19782 + 120;
                            if (j < j3) {
                                jMin = Math.min(jMin, j3);
                            }
                        }
                        i3 = 4;
                        if (!m51716(interfaceC178812, i3)) {
                            if (i2 == 2) {
                                j2 = this.f74959;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C6391) this.f74956.get(interfaceC178812)).f19781 |= i3;
                            final C12036 c12039 = new C12036(interfaceC178812, iMo36985, i3, abstractC16891, interfaceC10834, this.f74961);
                            this.f74957 = c12039;
                            this.f74959 = 80 + j;
                            this.f74962.execute(new Runnable() { // from class: l.۬᩻ܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C23324.m51714(this.f40168, c12039);
                                }
                            });
                            return;
                        }
                    } else {
                        i3 = 2;
                        if (!m51716(interfaceC178812, i3)) {
                            if (i2 == 2) {
                                j2 = this.f74959;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C6391) this.f74956.get(interfaceC178812)).f19781 |= i3;
                            final C12036 c120310 = new C12036(interfaceC178812, iMo36985, i3, abstractC16891, interfaceC10834, this.f74961);
                            this.f74957 = c120310;
                            this.f74959 = 80 + j;
                            this.f74962.execute(new Runnable() { // from class: l.۬᩻ܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C23324.m51714(this.f40168, c120310);
                                }
                            });
                            return;
                        }
                    }
                } else {
                    i3 = 4;
                    if (!m51716(interfaceC178812, i3)) {
                        if (i2 == 2) {
                            j2 = this.f74959;
                            if (j < j2) {
                                jMin = Math.min(jMin, j2);
                                break;
                            }
                        }
                        ((C6391) this.f74956.get(interfaceC178812)).f19781 |= i3;
                        final C12036 c120311 = new C12036(interfaceC178812, iMo36985, i3, abstractC16891, interfaceC10834, this.f74961);
                        this.f74957 = c120311;
                        this.f74959 = 80 + j;
                        this.f74962.execute(new Runnable() { // from class: l.۬᩻ܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23324.m51714(this.f40168, c120311);
                            }
                        });
                        return;
                    }
                }
            }
        }
        if (jMin != C13132.FOREVER_NS) {
            this.f74963.accept(jMin - j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m51716(InterfaceC17889 interfaceC17889, int i) {
        return (((C6391) this.f74956.get(interfaceC17889)).f19781 & i) != 0;
    }
}
