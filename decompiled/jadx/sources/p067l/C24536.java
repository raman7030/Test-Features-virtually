package p067l;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.᩺᩻ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6KI */
/* JADX INFO: loaded from: classes.dex */
public final class C24536 {

    /* JADX INFO: renamed from: ܺ */
    public static final ExecutorService f77700 = Executors.newFixedThreadPool(2);

    /* JADX INFO: renamed from: ֫ */
    public List f77701;

    /* JADX INFO: renamed from: ۜ */
    public final C14478 f77702;

    /* JADX INFO: renamed from: ۡ */
    public final IdentityHashMap f77703;

    /* JADX INFO: renamed from: ۢ */
    public C13808 f77704;

    /* JADX INFO: renamed from: ۧ */
    public boolean f77705;

    /* JADX INFO: renamed from: ܳ */
    public long f77706;

    /* JADX INFO: renamed from: ܽ */
    public C13596 f77707;

    /* JADX INFO: renamed from: ܿ */
    public int f77708;

    /* JADX INFO: renamed from: ᩳ */
    public final Executor f77709;

    /* JADX INFO: renamed from: ᩷ */
    public final C7379 f77710;

    /* JADX INFO: renamed from: ᩻ */
    public final C3355 f77711;

    /* JADX INFO: renamed from: ֫ */
    public static void m54111(final C24536 c24536, final C13808 c13808) {
        c24536.getClass();
        final C13596 c13596M13203 = null;
        try {
            if (!c13808.f39028) {
                if (c13808.f39029 == 4) {
                    c13596M13203 = c13808.f39031.mo11392(c13808.f39032, c13808.f39027, c13808.f39030);
                } else {
                    c13596M13203 = ((C5880) c13808.f39031).m13203(c13808.f39027, c13808.f39030, false);
                }
            }
        } catch (Throwable unused) {
        }
        C14478 c14478 = c24536.f77702;
        Runnable runnable = new Runnable() { // from class: l.ۤ᩻ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C24536.m54112(this.f34883, c13808, c13596M13203);
            }
        };
        c14478.getClass();
        C7050.m16212(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54112(C24536 c24536, C13808 c13808, C13596 c13596) {
        c24536.getClass();
        if (c13808.f39026 != c24536.f77708) {
            if (c24536.f77704 == c13808) {
                c24536.f77704 = null;
                c24536.f77707 = null;
                c24536.f77705 = false;
            }
        } else {
            c24536.f77707 = c13596;
            c24536.f77705 = true;
        }
        c24536.f77710.accept(0L);
    }

    public C24536(C7379 c7379, C3355 c3355) {
        C14478 c14478 = new C14478();
        this.f77703 = new IdentityHashMap();
        this.f77701 = Collections.EMPTY_LIST;
        this.f77709 = f77700;
        this.f77702 = c14478;
        this.f77710 = c7379;
        this.f77711 = c3355;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54114() {
        this.f77708++;
        this.f77701 = Collections.EMPTY_LIST;
        this.f77703.clear();
        this.f77706 = 0L;
        C13808 c13808 = this.f77704;
        if (c13808 != null) {
            c13808.f39028 = true;
        }
        if (this.f77705) {
            this.f77704 = null;
            this.f77707 = null;
            this.f77705 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f A[EDGE_INSN: B:90:0x015f->B:93:0x0193 BREAK  A[LOOP:2: B:69:0x0116->B:86:0x0154]] */
    /* JADX INFO: renamed from: ֫ */
    public final void m54115(List list, int i, AbstractC18422 abstractC18422, InterfaceC12665 interfaceC12665, int i2, long j) {
        int i3;
        long j2;
        C13596 c13596M13203;
        if (this.f77701 != list) {
            this.f77701 = list;
            this.f77703.keySet().retainAll(list);
        }
        int iMin = Math.min(i, list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) list.get(i4);
            C8443 c8443 = (C8443) this.f77703.get(interfaceC19370);
            if (c8443 == null) {
                c8443 = new C8443(0);
                this.f77703.put(interfaceC19370, c8443);
            }
            if (i4 >= iMin) {
                c8443.f22655 = -1L;
            } else if (c8443.f22655 < 0) {
                c8443.f22655 = j;
            }
        }
        C13808 c13808 = this.f77704;
        if (c13808 != null) {
            if (list.contains(c13808.f39027)) {
                C13808 c13809 = this.f77704;
                if (c13809.f39031 == interfaceC12665) {
                    if (c13809.f39032 != abstractC18422) {
                    }
                }
                this.f77704.f39028 = true;
            } else {
                this.f77704.f39028 = true;
            }
        }
        if (this.f77705) {
            C13808 c138010 = this.f77704;
            C13596 c13596 = this.f77707;
            this.f77704 = null;
            this.f77707 = null;
            this.f77705 = false;
            if (c138010.f39028 || c138010.f39026 != this.f77708) {
                C8443 c8444 = (C8443) this.f77703.get(c138010.f39027);
                if (c8444 != null) {
                    c8444.f22654 = 0;
                }
            } else if (c13596 != null) {
                InterfaceC19370 interfaceC19371 = c138010.f39027;
                C13596 icon = interfaceC19371.getIcon();
                interfaceC19371.mo39132(c13596);
                if (icon != c13596) {
                    this.f77711.m45213n(interfaceC19371);
                }
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < iMin; i6++) {
            InterfaceC19370 interfaceC19372 = (InterfaceC19370) list.get(i6);
            int iMo39150 = interfaceC19372.mo39150();
            if (iMo39150 != 0 && !m54113(interfaceC19372, 1)) {
                ((C8443) this.f77703.get(interfaceC19372)).f22654 |= 1;
                try {
                    c13596M13203 = ((C5880) interfaceC12665).m13203(interfaceC19372, iMo39150, true);
                } catch (Throwable unused) {
                    c13596M13203 = null;
                }
                if (c13596M13203 != null) {
                    C13596 icon2 = interfaceC19372.getIcon();
                    interfaceC19372.mo39132(c13596M13203);
                    if (icon2 != c13596M13203) {
                        this.f77711.m45213n(interfaceC19372);
                    }
                    i5++;
                    if (i5 == 2) {
                        this.f77710.accept(0L);
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.f77704 != null) {
            return;
        }
        if (i2 != 2) {
            iMin = list.size();
        }
        long jMin = C14849.FOREVER_NS;
        for (int i7 = 0; i7 < iMin; i7++) {
            InterfaceC19370 interfaceC19373 = (InterfaceC19370) list.get(i7);
            int iMo39151 = interfaceC19373.mo39150();
            if (iMo39151 != 0) {
                if (i2 == 2) {
                    if (m54113(interfaceC19373, 2)) {
                        if (!m54113(interfaceC19373, 4)) {
                            long j3 = ((C8443) this.f77703.get(interfaceC19373)).f22655 + 120;
                            if (j < j3) {
                                jMin = Math.min(jMin, j3);
                            }
                        }
                        i3 = 4;
                        if (!m54113(interfaceC19373, i3)) {
                            if (i2 == 2) {
                                j2 = this.f77706;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C8443) this.f77703.get(interfaceC19373)).f22654 |= i3;
                            final C13808 c138011 = new C13808(interfaceC19373, iMo39151, i3, abstractC18422, interfaceC12665, this.f77708);
                            this.f77704 = c138011;
                            this.f77706 = 80 + j;
                            this.f77709.execute(new Runnable() { // from class: l.۬᩻ܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C24536.m54111(this.f43239, c138011);
                                }
                            });
                            return;
                        }
                    } else {
                        i3 = 2;
                        if (!m54113(interfaceC19373, i3)) {
                            if (i2 == 2) {
                                j2 = this.f77706;
                                if (j < j2) {
                                    jMin = Math.min(jMin, j2);
                                    break;
                                }
                            }
                            ((C8443) this.f77703.get(interfaceC19373)).f22654 |= i3;
                            final C13808 c138012 = new C13808(interfaceC19373, iMo39151, i3, abstractC18422, interfaceC12665, this.f77708);
                            this.f77704 = c138012;
                            this.f77706 = 80 + j;
                            this.f77709.execute(new Runnable() { // from class: l.۬᩻ܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C24536.m54111(this.f43239, c138012);
                                }
                            });
                            return;
                        }
                    }
                } else {
                    i3 = 4;
                    if (!m54113(interfaceC19373, i3)) {
                        if (i2 == 2) {
                            j2 = this.f77706;
                            if (j < j2) {
                                jMin = Math.min(jMin, j2);
                                break;
                            }
                        }
                        ((C8443) this.f77703.get(interfaceC19373)).f22654 |= i3;
                        final C13808 c138013 = new C13808(interfaceC19373, iMo39151, i3, abstractC18422, interfaceC12665, this.f77708);
                        this.f77704 = c138013;
                        this.f77706 = 80 + j;
                        this.f77709.execute(new Runnable() { // from class: l.۬᩻ܳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C24536.m54111(this.f43239, c138013);
                            }
                        });
                        return;
                    }
                }
            }
        }
        if (jMin != C14849.FOREVER_NS) {
            this.f77710.accept(jMin - j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m54113(InterfaceC19370 interfaceC19370, int i) {
        return (((C8443) this.f77703.get(interfaceC19370)).f22654 & i) != 0;
    }
}
