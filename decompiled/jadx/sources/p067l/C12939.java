package p067l;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.crypto.prng.X931RNG;
import org.bouncycastle.math.p080ec.custom.sec.SecT409Field;

/* JADX INFO: renamed from: l.ۧܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C12939 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫ */
    public long f36362;

    /* JADX INFO: renamed from: ۗ */
    public C13868 f36363;

    /* JADX INFO: renamed from: ۙ */
    public long f36364;

    /* JADX INFO: renamed from: ۛ */
    public long f36365;

    /* JADX INFO: renamed from: ۟ */
    public final C19644 f36366;

    /* JADX INFO: renamed from: ۤ */
    public volatile boolean f36367;

    /* JADX INFO: renamed from: ۧ֫ */
    public Thread f36368;

    /* JADX INFO: renamed from: ۨ */
    public final IdentityHashMap f36369 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۫ */
    public final long f36370;

    /* JADX INFO: renamed from: ۬ */
    public long f36371;

    /* JADX INFO: renamed from: ܰ */
    public boolean f36372;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f36373;

    /* JADX INFO: renamed from: ܽ֫ */
    public long f36374;

    /* JADX INFO: renamed from: ܿ֫ */
    public C10967 f36375;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C6747 f36376;

    /* JADX INFO: renamed from: ᩶ */
    public final C9429 f36377;

    /* JADX INFO: renamed from: ᩸ */
    public C4221 f36378;

    /* JADX INFO: renamed from: ᩹ */
    public final C16804 f36379;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f36380;

    public C12939(C19644 c19644, C9429 c9429, long j, C16804 c16804) {
        this.f36366 = c19644;
        this.f36377 = c9429;
        this.f36370 = j;
        this.f36379 = c16804;
        this.f36375 = c9429.f25749;
        this.f36363 = c9429.f25753;
        this.f36364 = c9429.f25751;
        this.f36365 = c9429.f25752;
        this.f36362 = c9429.f25748;
        this.f36374 = c9429.f25756;
        this.f36371 = c9429.f25755;
    }

    public final int length() {
        int i;
        synchronized (this.f36366) {
            m29639();
            C10967 c10967 = this.f36375;
            i = c10967 == null ? 0 : c10967.f30368;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m29664(int i, int i2, byte[] bArr) {
        synchronized (this.f36366) {
            m29639();
            this.f36366.m44657();
            if (C19644.m44595((Iterable) this.f36369.keySet())) {
                m29639();
                C21026.m47421(i, 0, i2, this.f36375, bArr);
                this.f36366.m44657();
                if (!C19644.m44595((Iterable) this.f36369.keySet())) {
                    m29614();
                    throw new C7614();
                }
            } else {
                m29614();
                throw new C7614();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x018b  */
    /* JADX INFO: renamed from: ֫ */
    public final void m29660(int i, int i2, byte[] bArr, int i3, InterfaceC18588 interfaceC18588) {
        ArrayList arrayList;
        long j;
        C10967 c10967M51042;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        C10967 c10967M40186;
        C10967 c10967;
        boolean zM40187;
        boolean z3;
        C6273 c6273M47396;
        long jM55743;
        long jM55744;
        long jM14236;
        long j2;
        long jM47433;
        boolean z4;
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
        synchronized (this.f36366) {
            m29639();
            m29657();
            C12826.requireNonNull(bArr);
            C10927.m25189(bArr.length, 0, i3);
            m29615(i, i2, i3);
            if (interfaceC18588M40721.mo3924()) {
                throw new C25008();
            }
            if (i == i2 && i3 == 0) {
                return;
            }
            C16804 c16804M51043 = this.f36366.f59758.m51043();
            int i4 = i2 - i;
            boolean z5 = i4 == i3 && i3 <= 4096;
            try {
                if (z5) {
                    C17671 c17671M47406 = C21026.m47406(this.f36375, i, bArr, i3);
                    c10967M40186 = c17671M47406.m40186();
                    arrayList = null;
                    z3 = false;
                    c10967 = null;
                    z2 = false;
                    j = 0;
                    zM40187 = c17671M47406.m40187();
                } else {
                    if (m29623(i3)) {
                        arrayList2 = new ArrayList();
                        int i5 = 0;
                        C10967 c10967M47435 = null;
                        while (i5 < i3) {
                            try {
                                int iMin = Math.min(33554432, i3 - i5);
                                File file = this.f36366.f59756;
                                if (file != null && file.isDirectory()) {
                                    C6077 c6077M13829 = C6077.m13829(file, bArr, i5, iMin, interfaceC18588M40721);
                                    arrayList2.add(c6077M13829);
                                    c10967M47435 = C21026.m47435(c10967M47435, C21026.m47403(c6077M13829));
                                    i5 += iMin;
                                } else {
                                    throw new IOException("Hex literal spill directory is unavailable");
                                }
                            } catch (IOException e) {
                                e = e;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                }
                                this.f36366.f59758.m51044(c16804M51043);
                                throw e;
                            } catch (Error e2) {
                                e = e2;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                }
                                this.f36366.f59758.m51044(c16804M51043);
                                throw e;
                            } catch (RuntimeException e3) {
                                e = e3;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                }
                                this.f36366.f59758.m51044(c16804M51043);
                                throw e;
                            }
                        }
                        z = true;
                        arrayList = arrayList2;
                        j = 0;
                        c10967M51042 = c10967M47435;
                    } else {
                        j = 0;
                        arrayList = null;
                        c10967M51042 = this.f36366.f59758.m51042(i3, bArr);
                        z = false;
                    }
                    try {
                        C10967 c10967M47399 = C21026.m47399(this.f36375, i, i2, c10967M51042);
                        C10967 c10967M29613 = m29613(c10967M47399, i, this.f36366.f59758);
                        C10967 c10968 = c10967M51042;
                        boolean z6 = (i4 == 0 && c10967M29613 == c10967M47399) ? false : true;
                        boolean z7 = z | (((this.f36371 == j || i4 == 0) && c10967M29613 == c10967M47399) ? false : true);
                        z2 = z6;
                        c10967M40186 = c10967M29613;
                        c10967 = c10968;
                        zM40187 = false;
                        z3 = z7;
                    } catch (IOException | Error | RuntimeException e4) {
                        e = e4;
                        arrayList2 = arrayList;
                        arrayList = arrayList2;
                        if (arrayList != null) {
                            C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                        }
                        this.f36366.f59758.m51044(c16804M51043);
                        throw e;
                    }
                }
                try {
                    C13868 c13868M34644 = C15208.m34644(this.f36363, i, i2, i3);
                    m29616(c10967M40186, c13868M34644);
                    if (z5) {
                        jM14236 = this.f36364;
                        jM55744 = this.f36365;
                    } else {
                        if (z2) {
                            c6273M47396 = C21026.m47425(c10967M40186);
                        } else {
                            c6273M47396 = C21026.m47396(this.f36375, c10967, i);
                        }
                        if (z2) {
                            jM14236 = c6273M47396.m14236();
                            jM55744 = c6273M47396.m14237();
                        } else {
                            jM55743 = C0892.m55743(this.f36364, c6273M47396.m14236());
                            jM55744 = C0892.m55743(this.f36365, c6273M47396.m14237());
                        }
                    }
                    if (z3) {
                        jM14236 = jM55743;
                        long j3 = j;
                        jM47433 = C21026.m47433(c10967M40186);
                        j2 = j3;
                    } else {
                        jM14236 = jM55743;
                        j2 = j;
                        jM47433 = this.f36371;
                    }
                    if (jM14236 > X931RNG.BLOCK128_RESEED_MAX) {
                        throw new IllegalStateException("Literal heap storage exceeds memory limit");
                    }
                    if (interfaceC18588M40721.mo3924()) {
                        throw new C25008();
                    }
                    if (arrayList != null) {
                        m29622((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]));
                    }
                    this.f36375 = c10967M40186;
                    this.f36363 = c13868M34644;
                    this.f36364 = jM14236;
                    this.f36365 = jM55744;
                    this.f36371 = jM47433;
                    boolean z8 = this.f36380;
                    if (z5) {
                        z4 = zM40187;
                    } else if (i4 == 0) {
                        z4 = false;
                    } else {
                        if ((this.f36362 == j2 && this.f36374 == j2 && jM47433 == j2) ? false : true) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    this.f36380 = z8 | z4;
                    this.f36372 = true;
                } catch (IOException e5) {
                    e = e5;
                    if (arrayList != null) {
                        C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                    }
                    this.f36366.f59758.m51044(c16804M51043);
                    throw e;
                } catch (Error e6) {
                    e = e6;
                    if (arrayList != null) {
                        C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                    }
                    this.f36366.f59758.m51044(c16804M51043);
                    throw e;
                } catch (RuntimeException e7) {
                    e = e7;
                    if (arrayList != null) {
                        C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                    }
                    this.f36366.f59758.m51044(c16804M51043);
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e8) {
                e = e8;
                arrayList = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29659(int i, int i2) {
        synchronized (this.f36366) {
            m29639();
            m29657();
            int i3 = i2 - i;
            m29615(i, i2, i3);
            if (i3 == 0) {
                return;
            }
            C16804 c16804M51043 = this.f36366.f59758.m51043();
            try {
                C10967 c10967M29613 = m29613(C21026.m47399(this.f36375, i, i2, C21026.m47403(new C21500((byte) 0, i3))), i, this.f36366.f59758);
                C13868 c13868M34644 = C15208.m34644(this.f36363, i, i2, i3);
                m29616(c10967M29613, c13868M34644);
                C6273 c6273M47425 = C21026.m47425(c10967M29613);
                this.f36375 = c10967M29613;
                this.f36363 = c13868M34644;
                this.f36364 = c6273M47425.m14236();
                this.f36365 = c6273M47425.m14237();
                this.f36380 |= (this.f36362 == 0 && this.f36374 == 0 && this.f36371 == 0) ? false : true;
                this.f36372 = true;
            } catch (Error e) {
                e = e;
                this.f36366.f59758.m51044(c16804M51043);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                this.f36366.f59758.m51044(c16804M51043);
                throw e;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02a4 */
    /* JADX WARN: Code duplicated, block: B:157:0x02a6 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TRY_ENTER, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02ac A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x02b4 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02ba A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x02db A[Catch: all -> 0x013d, TRY_ENTER, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x02e0 A[Catch: all -> 0x013d, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x02f3 A[Catch: all -> 0x02f8, TryCatch #11 {, blocks: (B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:235:0x02ef, outer: #13 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0163 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0169 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0177 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0180 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0189 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0190 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0199 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x019e A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6 A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ac A[Catch: all -> 0x013d, Error -> 0x02c2, RuntimeException -> 0x02c4, IOException -> 0x02c6, TryCatch #13 {all -> 0x013d, blocks: (B:47:0x00dd, B:51:0x00f1, B:186:0x02db, B:188:0x02e0, B:189:0x02ec, B:190:0x02ee, B:195:0x02f7, B:198:0x02fa, B:52:0x0124, B:73:0x015f, B:75:0x0163, B:77:0x0169, B:79:0x0177, B:84:0x0189, B:89:0x0199, B:91:0x01a2, B:93:0x01a6, B:95:0x01ac, B:96:0x01ae, B:148:0x029d, B:157:0x02a6, B:158:0x02ab, B:159:0x02ac, B:160:0x02b3, B:90:0x019e, B:86:0x0190, B:81:0x0180, B:161:0x02b4, B:162:0x02b9, B:163:0x02ba, B:164:0x02c1, B:70:0x0158, B:71:0x015c, B:191:0x02ef, B:193:0x02f3, B:194:0x02f6), top: B:237:0x00db, inners: #11 }] */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m29661(int i, C11598 c11598, C24756 c24756) {
        File file;
        InterfaceC20315[] interfaceC20315Arr;
        ArrayList arrayList;
        C10967 c10967M47435;
        int i2;
        InterfaceC20315[] interfaceC20315Arr2;
        long j;
        long j2;
        InterfaceC18588 interfaceC18588;
        InterfaceC20315[] interfaceC20315ArrM26692;
        boolean z;
        long jM47419;
        long jM44565;
        long jM47393;
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c24756);
        synchronized (this.f36366) {
            try {
                try {
                    m29639();
                    m29657();
                    C12826.requireNonNull(c11598, "range");
                    if (!interfaceC18588M40721.mo3924()) {
                        C10967 c10967 = this.f36375;
                        int i3 = c10967 == null ? 0 : c10967.f30368;
                        C10927.m25190(i3, i, 0);
                        int length = c11598.length();
                        if (length == 0) {
                            return;
                        }
                        long j3 = length;
                        if (((long) i3) + j3 > 2147483647L) {
                            throw new C9174();
                        }
                        boolean z2 = C0892.m55743(C0892.m55743(this.f36364, C21026.m47396(this.f36375, c11598.f32346, i).m14236()), 65536L) > X931RNG.BLOCK128_RESEED_MAX;
                        if (z2) {
                            file = this.f36366.f59756;
                            if (file == null || !file.isDirectory()) {
                                throw new IOException("Hex literal spill directory is unavailable");
                            }
                        } else {
                            file = null;
                        }
                        long j4 = (j3 + SecT409Field.M25) / 33554432;
                        C10967 c10968 = this.f36375;
                        long j5 = c10968 == null ? 0 : c10968.f30365;
                        if (!z2) {
                            C10967 c10969 = c11598.f32346;
                            j4 = c10969 == null ? 0 : c10969.f30365;
                        }
                        InterfaceC18588 interfaceC18589 = interfaceC18588M40721;
                        File file2 = file;
                        if (!C19644.m44621(C0892.m55743(C21026.m47390(j5 + j4 + 2), C0892.m55743(C21026.m47424(this.f36375), C0892.m55743(this.f36362, C0892.m55743(this.f36374, C15208.m34660(this.f36363))))))) {
                            throw new IllegalStateException("Edit span structure exceeds memory limit");
                        }
                        C10967 c109610 = this.f36375;
                        C13868 c13868 = this.f36363;
                        long j6 = this.f36362;
                        long j7 = this.f36374;
                        long j8 = this.f36371;
                        m29648();
                        InterfaceC20315[] interfaceC20315Arr3 = new InterfaceC20315[0];
                        try {
                            if (z2) {
                                try {
                                    c11598.m26693();
                                    arrayList = new ArrayList();
                                    int i4 = 0;
                                    c10967M47435 = null;
                                    i2 = length;
                                    while (i4 < i2) {
                                        interfaceC20315Arr2 = interfaceC20315Arr3;
                                        try {
                                            int iMin = Math.min(33554432, i2 - i4);
                                            InterfaceC18588 interfaceC185810 = interfaceC18589;
                                            long j9 = j7;
                                            File file3 = file2;
                                            C6077 c6077M13828 = C6077.m13828(file3, C21026.m47398(c11598.f32346, i4, iMin), interfaceC185810);
                                            arrayList.add(c6077M13828);
                                            c10967M47435 = C21026.m47435(c10967M47435, C21026.m47403(c6077M13828));
                                            i4 += iMin;
                                            interfaceC18589 = interfaceC185810;
                                            interfaceC20315Arr3 = interfaceC20315Arr2;
                                            j8 = j8;
                                            file2 = file3;
                                            j7 = j9;
                                        } catch (IOException | Error | RuntimeException e) {
                                            e = e;
                                            interfaceC20315ArrM26692 = interfaceC20315Arr2;
                                            z = false;
                                            if (!z) {
                                                C19644.m44593(interfaceC20315ArrM26692);
                                                if (arrayList != null) {
                                                    C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                                }
                                            }
                                            synchronized (this.f36366) {
                                                if (!this.f36367) {
                                                    m29614();
                                                }
                                                throw e;
                                            }
                                        }
                                    }
                                    interfaceC20315Arr2 = interfaceC20315Arr3;
                                    j = j7;
                                    j2 = j8;
                                    interfaceC18588 = interfaceC18589;
                                    c11598.m26693();
                                    interfaceC20315ArrM26692 = interfaceC20315Arr2;
                                    try {
                                        if (!this.f36367) {
                                            throw new IllegalStateException("Transaction is not active");
                                        }
                                        if (!interfaceC18588.mo3924()) {
                                            C10967 c10967M47399 = C21026.m47399(c109610, i, i, c10967M47435);
                                            C13868 c13868M34644 = C15208.m34644(c13868, i, i, i2);
                                            if (j6 == 0) {
                                                jM47419 = C21026.m47438(c10967M47435);
                                            } else {
                                                jM47419 = C21026.m47419(c109610, c10967M47435);
                                            }
                                            long j10 = jM47419;
                                            if (j == 0) {
                                                jM44565 = C19644.m44612(c10967M47435);
                                            } else {
                                                jM44565 = C19644.m44565(c109610, c10967M47435);
                                            }
                                            long j11 = jM44565;
                                            if (j2 == 0) {
                                                jM47393 = C21026.m47433(c10967M47435);
                                            } else {
                                                jM47393 = C21026.m47393(c109610, c10967M47435);
                                            }
                                            if (!this.f36367) {
                                                throw new IllegalStateException("Transaction is not active");
                                            }
                                            if (!interfaceC18588.mo3924()) {
                                                synchronized (this.f36366) {
                                                    try {
                                                        m29639();
                                                        m29657();
                                                        if (this.f36375 == c109610 || this.f36363 != c13868) {
                                                            throw new IllegalStateException("Transaction root changed during range transfer");
                                                        }
                                                        if (!interfaceC18588.mo3924()) {
                                                            if (C19644.m44595((Iterable) Arrays.asList(interfaceC20315ArrM26692))) {
                                                                if (arrayList != null) {
                                                                    m29622((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]));
                                                                    arrayList = null;
                                                                } else {
                                                                    m29636(interfaceC20315ArrM26692);
                                                                }
                                                                try {
                                                                    this.f36375 = c10967M47399;
                                                                    C10967 c10967M29613 = m29613(c10967M47399, i, this.f36366.f59758);
                                                                    this.f36375 = c10967M29613;
                                                                    this.f36363 = c13868M34644;
                                                                    if (c10967M29613 != c10967M47399) {
                                                                        this.f36362 = C21026.m47438(c10967M29613);
                                                                        this.f36374 = C19644.m44612(this.f36375);
                                                                        this.f36371 = C21026.m47433(this.f36375);
                                                                    } else {
                                                                        this.f36362 = C0892.m55743(j6, j10);
                                                                        this.f36374 = C0892.m55743(j, j11);
                                                                        this.f36371 = C0892.m55743(j2, jM47393);
                                                                    }
                                                                    C6273 c6273M47425 = C21026.m47425(this.f36375);
                                                                    this.f36364 = c6273M47425.m14236();
                                                                    this.f36365 = c6273M47425.m14237();
                                                                    if (this.f36364 > X931RNG.BLOCK128_RESEED_MAX) {
                                                                        throw new IllegalStateException("Literal heap storage exceeds memory limit");
                                                                    }
                                                                    this.f36373 |= j10 >= 1048576 || jM47393 >= 1048576;
                                                                    m29616(this.f36375, this.f36363);
                                                                    this.f36372 = true;
                                                                    synchronized (this.f36366) {
                                                                        if (this.f36368 == Thread.currentThread()) {
                                                                            this.f36368 = null;
                                                                        }
                                                                        this.f36366.notifyAll();
                                                                    }
                                                                    return;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    z = true;
                                                                    while (true) {
                                                                        try {
                                                                            throw th;
                                                                        } catch (IOException e2) {
                                                                            e = e2;
                                                                        } catch (Error e3) {
                                                                            e = e3;
                                                                        } catch (RuntimeException e4) {
                                                                            e = e4;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                throw new C7614();
                                                            }
                                                        } else {
                                                            m29614();
                                                            throw new C25008();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z = false;
                                                    }
                                                }
                                            } else {
                                                throw new C25008();
                                            }
                                        } else {
                                            throw new C25008();
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                        z = false;
                                    } catch (Error e6) {
                                        e = e6;
                                        z = false;
                                    } catch (RuntimeException e7) {
                                        e = e7;
                                        z = false;
                                    }
                                } catch (IOException | Error | RuntimeException e8) {
                                    e = e8;
                                    interfaceC20315Arr = interfaceC20315Arr3;
                                    interfaceC20315ArrM26692 = interfaceC20315Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C19644.m44593(interfaceC20315ArrM26692);
                                        if (arrayList != null) {
                                            C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                        }
                                    }
                                    synchronized (this.f36366) {
                                        if (!this.f36367) {
                                            m29614();
                                        }
                                        throw e;
                                    }
                                }
                            } else {
                                interfaceC20315Arr = interfaceC20315Arr3;
                                j2 = j8;
                                i2 = length;
                                interfaceC18588 = interfaceC18589;
                                j = j7;
                                try {
                                    interfaceC20315ArrM26692 = c11598.m26692();
                                    try {
                                        c10967M47435 = c11598.f32346;
                                        arrayList = null;
                                        if (!this.f36367) {
                                            throw new IllegalStateException("Transaction is not active");
                                        }
                                        if (!interfaceC18588.mo3924()) {
                                            C10967 c10967M473910 = C21026.m47399(c109610, i, i, c10967M47435);
                                            C13868 c13868M34645 = C15208.m34644(c13868, i, i, i2);
                                            if (j6 == 0) {
                                                jM47419 = C21026.m47438(c10967M47435);
                                            } else {
                                                jM47419 = C21026.m47419(c109610, c10967M47435);
                                            }
                                            long j12 = jM47419;
                                            if (j == 0) {
                                                jM44565 = C19644.m44612(c10967M47435);
                                            } else {
                                                jM44565 = C19644.m44565(c109610, c10967M47435);
                                            }
                                            long j13 = jM44565;
                                            if (j2 == 0) {
                                                jM47393 = C21026.m47433(c10967M47435);
                                            } else {
                                                jM47393 = C21026.m47393(c109610, c10967M47435);
                                            }
                                            if (!this.f36367) {
                                                throw new IllegalStateException("Transaction is not active");
                                            }
                                            if (!interfaceC18588.mo3924()) {
                                                synchronized (this.f36366) {
                                                    m29639();
                                                    m29657();
                                                    if (this.f36375 == c109610) {
                                                    }
                                                    throw new IllegalStateException("Transaction root changed during range transfer");
                                                }
                                            }
                                            throw new C25008();
                                        }
                                        throw new C25008();
                                    } catch (IOException e9) {
                                        e = e9;
                                        arrayList = null;
                                        z = false;
                                        if (!z) {
                                            C19644.m44593(interfaceC20315ArrM26692);
                                            if (arrayList != null) {
                                                C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                            }
                                        }
                                        synchronized (this.f36366) {
                                            if (!this.f36367) {
                                                m29614();
                                            }
                                            throw e;
                                        }
                                    } catch (Error e10) {
                                        e = e10;
                                        arrayList = null;
                                        z = false;
                                        if (!z) {
                                            C19644.m44593(interfaceC20315ArrM26692);
                                            if (arrayList != null) {
                                                C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                            }
                                        }
                                        synchronized (this.f36366) {
                                            if (!this.f36367) {
                                                m29614();
                                            }
                                            throw e;
                                        }
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        arrayList = null;
                                        z = false;
                                        if (!z) {
                                            C19644.m44593(interfaceC20315ArrM26692);
                                            if (arrayList != null) {
                                                C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                            }
                                        }
                                        synchronized (this.f36366) {
                                            if (!this.f36367) {
                                                m29614();
                                            }
                                            throw e;
                                        }
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    interfaceC20315ArrM26692 = interfaceC20315Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C19644.m44593(interfaceC20315ArrM26692);
                                        if (arrayList != null) {
                                            C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                        }
                                    }
                                    synchronized (this.f36366) {
                                        if (!this.f36367) {
                                            m29614();
                                        }
                                        throw e;
                                    }
                                } catch (Error e13) {
                                    e = e13;
                                    interfaceC20315ArrM26692 = interfaceC20315Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C19644.m44593(interfaceC20315ArrM26692);
                                        if (arrayList != null) {
                                            C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                        }
                                    }
                                    synchronized (this.f36366) {
                                        if (!this.f36367) {
                                            m29614();
                                        }
                                        throw e;
                                    }
                                } catch (RuntimeException e14) {
                                    e = e14;
                                    interfaceC20315ArrM26692 = interfaceC20315Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C19644.m44593(interfaceC20315ArrM26692);
                                        if (arrayList != null) {
                                            C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                        }
                                    }
                                    synchronized (this.f36366) {
                                        if (!this.f36367) {
                                            m29614();
                                        }
                                        throw e;
                                    }
                                }
                            }
                            if (!z) {
                                C19644.m44593(interfaceC20315ArrM26692);
                                if (arrayList != null) {
                                    C19644.m44620((InterfaceC20315[]) arrayList.toArray(new InterfaceC20315[0]), e);
                                }
                            }
                            synchronized (this.f36366) {
                                if (!this.f36367) {
                                    m29614();
                                }
                            }
                            throw e;
                        } catch (Throwable th3) {
                            synchronized (this.f36366) {
                                if (this.f36368 == Thread.currentThread()) {
                                    this.f36368 = null;
                                }
                                this.f36366.notifyAll();
                                throw th3;
                            }
                        }
                    }
                    m29614();
                    throw new C25008();
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (IOException | Error | RuntimeException e15) {
                if (!this.f36367) {
                    m29614();
                }
                throw e15;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29663(int i, int i2) {
        synchronized (this.f36366) {
            m29639();
            m29657();
            int i3 = 0;
            C6747 c6747 = new C6747(i, i2, true, false);
            C10967 c10967 = this.f36375;
            if (c10967 != null) {
                i3 = c10967.f30368;
            }
            C6747.m15405(c6747, i3);
            this.f36376 = c6747;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29662(InterfaceC18588 interfaceC18588) {
        InterfaceC18588 interfaceC18588M40721 = interfaceC18588 == null ? null : C17917.m40721(interfaceC18588);
        synchronized (this.f36366) {
            m29639();
            m29657();
            if (interfaceC18588M40721 != null && interfaceC18588M40721.mo3924()) {
                m29614();
                return false;
            }
            InterfaceC20315[] interfaceC20315ArrM44603 = C19644.m44603(this.f36366, this, interfaceC18588M40721);
            if (interfaceC20315ArrM44603 == null) {
                return false;
            }
            C19644.m44593(interfaceC20315ArrM44603);
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4221 m29658(int i, byte[] bArr) {
        C4221 c4221;
        synchronized (this.f36366) {
            m29639();
            m29657();
            if (!this.f36372) {
                C10967 c10967 = this.f36375;
                C9429 c9429 = this.f36377;
                if (c10967 == c9429.f25749 && this.f36363 == c9429.f25753) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Pattern must not be empty");
                    }
                    if (bArr.length > 67108864) {
                        throw new IllegalStateException("Replacement metadata exceeds memory limit");
                    }
                    if (!C19644.m44621(C0892.m55743(C0892.m55743(C21026.m47414(c10967), C0892.m55743(C21026.m47424(this.f36375), C0892.m55743(this.f36362, C0892.m55743(this.f36374, C15208.m34660(this.f36363))))), C0892.m55743(bArr.length, 16384L)))) {
                        throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                    }
                    this.f36374 = C19644.m44612(this.f36375);
                    this.f36362 = C21026.m47438(this.f36375);
                    c4221 = new C4221(this, i, (byte[]) bArr.clone());
                    this.f36378 = c4221;
                }
            }
            throw new IllegalStateException("Batch replacement requires a pristine transaction");
        }
        return c4221;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f36366) {
            if (!this.f36367) {
                C19644.m44589(this.f36366, this);
            }
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public static void m29637(C12939 c12939) throws C7614 {
        if (C19644.m44595((Iterable) c12939.f36369.keySet())) {
            return;
        }
        c12939.m29614();
        throw new C7614();
    }

    /* JADX INFO: renamed from: ۙ */
    public static void m29627(C12939 c12939) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C21026.m47430(c12939.f36375, identityHashMap);
        IdentityHashMap identityHashMap2 = c12939.f36369;
        for (InterfaceC20315 interfaceC20315 : identityHashMap2.keySet()) {
            if (!identityHashMap.containsKey(interfaceC20315) || c12939.f36366.f59759.put(interfaceC20315, Boolean.TRUE) != null) {
                C19644.m44593(new InterfaceC20315[]{interfaceC20315});
            }
        }
        identityHashMap2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m29636(InterfaceC20315[] interfaceC20315Arr) {
        Set setKeySet = this.f36366.f59759.keySet();
        IdentityHashMap identityHashMap = this.f36369;
        Set setKeySet2 = identityHashMap.keySet();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayDeque.push((InterfaceC20315) it.next());
        }
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            arrayDeque.push((InterfaceC20315) it2.next());
        }
        for (InterfaceC20315 interfaceC20315 : interfaceC20315Arr) {
            arrayDeque.push(interfaceC20315);
        }
        while (!arrayDeque.isEmpty()) {
            InterfaceC20315 interfaceC20316 = (InterfaceC20315) arrayDeque.pop();
            Boolean bool = Boolean.TRUE;
            if (identityHashMap2.put(interfaceC20316, bool) == null) {
                if (interfaceC20316 instanceof C7574) {
                    identityHashMap3.put((C7574) interfaceC20316, bool);
                } else if (interfaceC20316 instanceof C8088) {
                    for (InterfaceC20315 interfaceC20317 : ((C8088) interfaceC20316).f21333) {
                        arrayDeque.push(interfaceC20317);
                    }
                }
            }
        }
        if (identityHashMap3.size() > 64) {
            throw new IllegalStateException("Too many external file sources");
        }
        for (InterfaceC20315 interfaceC20318 : interfaceC20315Arr) {
            if (identityHashMap.put(interfaceC20318, Boolean.TRUE) != null) {
                C19644.m44593(new InterfaceC20315[]{interfaceC20318});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m29622(InterfaceC20315[] interfaceC20315Arr) {
        int length = interfaceC20315Arr.length;
        int i = 0;
        while (true) {
            IdentityHashMap identityHashMap = this.f36369;
            if (i >= length) {
                for (InterfaceC20315 interfaceC20315 : interfaceC20315Arr) {
                    identityHashMap.put(interfaceC20315, Boolean.TRUE);
                }
                return;
            } else {
                InterfaceC20315 interfaceC20316 = interfaceC20315Arr[i];
                if (identityHashMap.containsKey(interfaceC20316) || this.f36366.f59759.containsKey(interfaceC20316)) {
                    throw new IllegalStateException("Created source is already owned");
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۗ */
    public static void m29625(C12939 c12939) {
        IdentityHashMap identityHashMap = c12939.f36369;
        InterfaceC20315[] interfaceC20315Arr = (InterfaceC20315[]) identityHashMap.keySet().toArray(new InterfaceC20315[0]);
        identityHashMap.clear();
        C19644.m44593(interfaceC20315Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29620(C12939 c12939, InterfaceC18588 interfaceC18588) throws C25008 {
        if (interfaceC18588.mo3924()) {
            c12939.m29614();
            throw new C25008();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C10967 m29613(C10967 c10967, int i, C22841 c22841) {
        if (this.f36364 > 8323072) {
            return c10967;
        }
        if ((c10967 == null ? 0 : c10967.f30365) <= 256) {
            return c10967;
        }
        C11638 c11638M47427 = C21026.m47427(i, c10967);
        if (c11638M47427.m26746() == null) {
            return c10967;
        }
        C10967 c10967M26746 = c11638M47427.m26746();
        if ((c10967M26746 != null ? c10967M26746.f30365 : 0) <= 256) {
            return c10967;
        }
        int length = c11638M47427.length();
        byte[] bArr = new byte[length];
        C21026.m47410(c11638M47427.m26746(), bArr);
        return C21026.m47399(c10967, c11638M47427.m26745(), c11638M47427.m26745() + c11638M47427.length(), c22841.m51042(length, bArr));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29615(int i, int i2, int i3) {
        int length = length();
        if (i < 0 || i2 < i || i2 > length) {
            StringBuilder sbM49005 = C21720.m49005("start=", i, ", end=", ", length=", i2);
            sbM49005.append(length);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if ((((long) length) - ((long) (i2 - i))) + ((long) i3) > 2147483647L) {
            throw new C9174();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m29639() {
        m29643();
        if (this.f36367 || this.f36366.f59764 != this || this.f36370 != this.f36366.f59760 || this.f36366.f59750 != this.f36377) {
            throw new IllegalStateException("Transaction is not active");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m29648() {
        if (this.f36368 != null) {
            throw new IllegalStateException("Range transfer is already active");
        }
        this.f36368 = Thread.currentThread();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m29643() {
        Thread thread;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z = false;
        while (!this.f36367 && (thread = this.f36368) != null && thread != threadCurrentThread) {
            try {
                this.f36366.wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            threadCurrentThread.interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m29657() {
        if (this.f36378 != null) {
            throw new IllegalStateException("A batch replacement is active");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m29614() {
        m29643();
        if (this.f36367 || this.f36366.f59764 != this) {
            return;
        }
        C4221 c4221 = this.f36378;
        if (c4221 != null) {
            c4221.f9282 = true;
            this.f36378 = null;
        }
        this.f36366.f59758.m51044(this.f36379);
        IdentityHashMap identityHashMap = this.f36369;
        InterfaceC20315[] interfaceC20315Arr = (InterfaceC20315[]) identityHashMap.keySet().toArray(new InterfaceC20315[0]);
        identityHashMap.clear();
        C19644.m44593(interfaceC20315Arr);
        this.f36366.f59764 = null;
        this.f36367 = true;
        this.f36366.notifyAll();
    }

    /* JADX INFO: renamed from: ᩶ */
    public static void m29652(C12939 c12939) {
        c12939.m29616(c12939.f36375, c12939.f36363);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29616(C10967 c10967, C13868 c13868) {
        if (!C19644.m44621(C0892.m55743(C0892.m55743(C0892.m55743(C0892.m55743(C21026.m47424(c10967), this.f36362), C21026.m47414(c10967)), this.f36374), C15208.m34660(c13868)))) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m29623(int i) {
        if (i == 0) {
            return false;
        }
        if (i >= 0) {
            return C0892.m55743(this.f36364, C0892.m55743(((((long) i) + 65535) / 65536) * 65536, 65536L)) > X931RNG.BLOCK128_RESEED_MAX;
        }
        throw new IllegalArgumentException("Negative literal length");
    }
}
