package l;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import org.bouncycastle.crypto.prng.X931RNG;
import org.bouncycastle.math.ec.custom.sec.SecT409Field;

/* JADX INFO: renamed from: l.ۧܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C11122 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f33362;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C12100 f33363;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f33364;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f33365;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18177 f33366;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f33367;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Thread f33368;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f33369 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f33370;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f33371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f33372;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f33373;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f33374;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C9047 f33375;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C4607 f33376;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7429 f33377;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1949 f33378;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15189 f33379;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f33380;

    public C11122(C18177 c18177, C7429 c7429, long j, C15189 c15189) {
        this.f33366 = c18177;
        this.f33377 = c7429;
        this.f33370 = j;
        this.f33379 = c15189;
        this.f33375 = c7429.f22836;
        this.f33363 = c7429.f22840;
        this.f33364 = c7429.f22838;
        this.f33365 = c7429.f22839;
        this.f33362 = c7429.f22835;
        this.f33374 = c7429.f22843;
        this.f33371 = c7429.f22842;
    }

    public final int length() {
        int i;
        synchronized (this.f33366) {
            m27577();
            C9047 c9047 = this.f33375;
            i = c9047 == null ? 0 : c9047.f27431;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27602(int i, int i2, byte[] bArr) {
        synchronized (this.f33366) {
            m27577();
            this.f33366.m42396();
            if (C18177.m42334((Iterable) this.f33369.keySet())) {
                m27577();
                C19631.m45125(i, 0, i2, this.f33375, bArr);
                this.f33366.m42396();
                if (!C18177.m42334((Iterable) this.f33369.keySet())) {
                    m27552();
                    throw new C5519();
                }
            } else {
                m27552();
                throw new C5519();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x018b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27598(int i, int i2, byte[] bArr, int i3, InterfaceC17066 interfaceC17066) {
        ArrayList arrayList;
        long j;
        C9047 c9047M48697;
        boolean z;
        ArrayList arrayList2;
        boolean z2;
        C9047 c9047M37995;
        C9047 c9047;
        boolean zM37996;
        boolean z3;
        C4108 c4108M45100;
        long jM3495;
        long jM3496;
        long jM12331;
        long j2;
        long jM45137;
        boolean z4;
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
        synchronized (this.f33366) {
            m27577();
            m27595();
            C11003.requireNonNull(bArr);
            C9005.m23245(bArr.length, 0, i3);
            m27553(i, i2, i3);
            if (interfaceC17066M38504.mo1526()) {
                throw new C23821();
            }
            if (i == i2 && i3 == 0) {
                return;
            }
            C15189 c15189M48698 = this.f33366.f56545.m48698();
            int i4 = i2 - i;
            boolean z5 = i4 == i3 && i3 <= 4096;
            try {
                if (z5) {
                    C16101 c16101M45110 = C19631.m45110(this.f33375, i, bArr, i3);
                    c9047M37995 = c16101M45110.m37995();
                    arrayList = null;
                    z3 = false;
                    c9047 = null;
                    z2 = false;
                    j = 0;
                    zM37996 = c16101M45110.m37996();
                } else {
                    if (m27561(i3)) {
                        arrayList2 = new ArrayList();
                        int i5 = 0;
                        C9047 c9047M45139 = null;
                        while (i5 < i3) {
                            try {
                                int iMin = Math.min(33554432, i3 - i5);
                                File file = this.f33366.f56543;
                                if (file != null && file.isDirectory()) {
                                    C3902 c3902M11893 = C3902.m11893(file, bArr, i5, iMin, interfaceC17066M38504);
                                    arrayList2.add(c3902M11893);
                                    c9047M45139 = C19631.m45139(c9047M45139, C19631.m45107(c3902M11893));
                                    i5 += iMin;
                                } else {
                                    throw new IOException("Hex literal spill directory is unavailable");
                                }
                            } catch (IOException e) {
                                e = e;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                }
                                this.f33366.f56545.m48699(c15189M48698);
                                throw e;
                            } catch (Error e2) {
                                e = e2;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                }
                                this.f33366.f56545.m48699(c15189M48698);
                                throw e;
                            } catch (RuntimeException e3) {
                                e = e3;
                                arrayList = arrayList2;
                                if (arrayList != null) {
                                    C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                }
                                this.f33366.f56545.m48699(c15189M48698);
                                throw e;
                            }
                        }
                        z = true;
                        arrayList = arrayList2;
                        j = 0;
                        c9047M48697 = c9047M45139;
                    } else {
                        j = 0;
                        arrayList = null;
                        c9047M48697 = this.f33366.f56545.m48697(i3, bArr);
                        z = false;
                    }
                    try {
                        C9047 c9047M45103 = C19631.m45103(this.f33375, i, i2, c9047M48697);
                        C9047 c9047M27551 = m27551(c9047M45103, i, this.f33366.f56545);
                        C9047 c9048 = c9047M48697;
                        boolean z6 = (i4 == 0 && c9047M27551 == c9047M45103) ? false : true;
                        boolean z7 = z | (((this.f33371 == j || i4 == 0) && c9047M27551 == c9047M45103) ? false : true);
                        z2 = z6;
                        c9047M37995 = c9047M27551;
                        c9047 = c9048;
                        zM37996 = false;
                        z3 = z7;
                    } catch (IOException | Error | RuntimeException e4) {
                        e = e4;
                        arrayList2 = arrayList;
                        arrayList = arrayList2;
                        if (arrayList != null) {
                            C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                        }
                        this.f33366.f56545.m48699(c15189M48698);
                        throw e;
                    }
                }
                try {
                    C12100 c12100M32542 = C13510.m32542(this.f33363, i, i2, i3);
                    m27554(c9047M37995, c12100M32542);
                    if (z5) {
                        jM12331 = this.f33364;
                        jM3496 = this.f33365;
                    } else {
                        if (z2) {
                            c4108M45100 = C19631.m45129(c9047M37995);
                        } else {
                            c4108M45100 = C19631.m45100(this.f33375, c9047, i);
                        }
                        if (z2) {
                            jM12331 = c4108M45100.m12331();
                            jM3496 = c4108M45100.m12332();
                        } else {
                            jM3495 = C1005.m3495(this.f33364, c4108M45100.m12331());
                            jM3496 = C1005.m3495(this.f33365, c4108M45100.m12332());
                        }
                    }
                    if (z3) {
                        jM12331 = jM3495;
                        long j3 = j;
                        jM45137 = C19631.m45137(c9047M37995);
                        j2 = j3;
                    } else {
                        jM12331 = jM3495;
                        j2 = j;
                        jM45137 = this.f33371;
                    }
                    if (jM12331 > X931RNG.BLOCK128_RESEED_MAX) {
                        throw new IllegalStateException("Literal heap storage exceeds memory limit");
                    }
                    if (interfaceC17066M38504.mo1526()) {
                        throw new C23821();
                    }
                    if (arrayList != null) {
                        m27560((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]));
                    }
                    this.f33375 = c9047M37995;
                    this.f33363 = c12100M32542;
                    this.f33364 = jM12331;
                    this.f33365 = jM3496;
                    this.f33371 = jM45137;
                    boolean z8 = this.f33380;
                    if (z5) {
                        z4 = zM37996;
                    } else if (i4 == 0) {
                        z4 = false;
                    } else {
                        if ((this.f33362 == j2 && this.f33374 == j2 && jM45137 == j2) ? false : true) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    this.f33380 = z8 | z4;
                    this.f33372 = true;
                } catch (IOException e5) {
                    e = e5;
                    if (arrayList != null) {
                        C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                    }
                    this.f33366.f56545.m48699(c15189M48698);
                    throw e;
                } catch (Error e6) {
                    e = e6;
                    if (arrayList != null) {
                        C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                    }
                    this.f33366.f56545.m48699(c15189M48698);
                    throw e;
                } catch (RuntimeException e7) {
                    e = e7;
                    if (arrayList != null) {
                        C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                    }
                    this.f33366.f56545.m48699(c15189M48698);
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e8) {
                e = e8;
                arrayList = null;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27597(int i, int i2) {
        synchronized (this.f33366) {
            m27577();
            m27595();
            int i3 = i2 - i;
            m27553(i, i2, i3);
            if (i3 == 0) {
                return;
            }
            C15189 c15189M48698 = this.f33366.f56545.m48698();
            try {
                C9047 c9047M27551 = m27551(C19631.m45103(this.f33375, i, i2, C19631.m45107(new C20130((byte) 0, i3))), i, this.f33366.f56545);
                C12100 c12100M32542 = C13510.m32542(this.f33363, i, i2, i3);
                m27554(c9047M27551, c12100M32542);
                C4108 c4108M45129 = C19631.m45129(c9047M27551);
                this.f33375 = c9047M27551;
                this.f33363 = c12100M32542;
                this.f33364 = c4108M45129.m12331();
                this.f33365 = c4108M45129.m12332();
                this.f33380 |= (this.f33362 == 0 && this.f33374 == 0 && this.f33371 == 0) ? false : true;
                this.f33372 = true;
            } catch (Error e) {
                e = e;
                this.f33366.f56545.m48699(c15189M48698);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                this.f33366.f56545.m48699(c15189M48698);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27599(int i, C9711 c9711, C23556 c23556) {
        File file;
        InterfaceC18883[] interfaceC18883Arr;
        ArrayList arrayList;
        C9047 c9047M45139;
        int i2;
        InterfaceC18883[] interfaceC18883Arr2;
        long j;
        long j2;
        InterfaceC17066 interfaceC17066;
        InterfaceC18883[] interfaceC18883ArrM24678;
        boolean z;
        long jM45123;
        long jM42304;
        long jM45097;
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(c23556);
        synchronized (this.f33366) {
            try {
                try {
                    m27577();
                    m27595();
                    C11003.requireNonNull(c9711, "range");
                    if (!interfaceC17066M38504.mo1526()) {
                        C9047 c9047 = this.f33375;
                        int i3 = c9047 == null ? 0 : c9047.f27431;
                        C9005.m23246(i3, i, 0);
                        int length = c9711.length();
                        if (length == 0) {
                            return;
                        }
                        long j3 = length;
                        if (((long) i3) + j3 > 2147483647L) {
                            throw new C7161();
                        }
                        boolean z2 = C1005.m3495(C1005.m3495(this.f33364, C19631.m45100(this.f33375, c9711.f29397, i).m12331()), 65536L) > X931RNG.BLOCK128_RESEED_MAX;
                        if (z2) {
                            file = this.f33366.f56543;
                            if (file == null || !file.isDirectory()) {
                                throw new IOException("Hex literal spill directory is unavailable");
                            }
                        } else {
                            file = null;
                        }
                        long j4 = (j3 + SecT409Field.M25) / 33554432;
                        C9047 c9048 = this.f33375;
                        long j5 = c9048 == null ? 0 : c9048.f27428;
                        if (!z2) {
                            C9047 c9049 = c9711.f29397;
                            j4 = c9049 == null ? 0 : c9049.f27428;
                        }
                        InterfaceC17066 interfaceC17067 = interfaceC17066M38504;
                        File file2 = file;
                        if (!C18177.m42360(C1005.m3495(C19631.m45094(j5 + j4 + 2), C1005.m3495(C19631.m45128(this.f33375), C1005.m3495(this.f33362, C1005.m3495(this.f33374, C13510.m32558(this.f33363))))))) {
                            throw new IllegalStateException("Edit span structure exceeds memory limit");
                        }
                        C9047 c90410 = this.f33375;
                        C12100 c12100 = this.f33363;
                        long j6 = this.f33362;
                        long j7 = this.f33374;
                        long j8 = this.f33371;
                        m27586();
                        InterfaceC18883[] interfaceC18883Arr3 = new InterfaceC18883[0];
                        try {
                            if (z2) {
                                try {
                                    c9711.m24679();
                                    arrayList = new ArrayList();
                                    int i4 = 0;
                                    c9047M45139 = null;
                                    i2 = length;
                                    while (i4 < i2) {
                                        interfaceC18883Arr2 = interfaceC18883Arr3;
                                        try {
                                            int iMin = Math.min(33554432, i2 - i4);
                                            InterfaceC17066 interfaceC17068 = interfaceC17067;
                                            long j9 = j7;
                                            File file3 = file2;
                                            C3902 c3902M11892 = C3902.m11892(file3, C19631.m45102(c9711.f29397, i4, iMin), interfaceC17068);
                                            arrayList.add(c3902M11892);
                                            c9047M45139 = C19631.m45139(c9047M45139, C19631.m45107(c3902M11892));
                                            i4 += iMin;
                                            interfaceC17067 = interfaceC17068;
                                            interfaceC18883Arr3 = interfaceC18883Arr2;
                                            j8 = j8;
                                            file2 = file3;
                                            j7 = j9;
                                        } catch (IOException | Error | RuntimeException e) {
                                            e = e;
                                            interfaceC18883ArrM24678 = interfaceC18883Arr2;
                                            z = false;
                                            if (!z) {
                                                C18177.m42332(interfaceC18883ArrM24678);
                                                if (arrayList != null) {
                                                    C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                                }
                                            }
                                            synchronized (this.f33366) {
                                                if (!this.f33367) {
                                                    m27552();
                                                }
                                                throw e;
                                            }
                                        }
                                    }
                                    interfaceC18883Arr2 = interfaceC18883Arr3;
                                    j = j7;
                                    j2 = j8;
                                    interfaceC17066 = interfaceC17067;
                                    c9711.m24679();
                                    interfaceC18883ArrM24678 = interfaceC18883Arr2;
                                    try {
                                        if (!this.f33367) {
                                            throw new IllegalStateException("Transaction is not active");
                                        }
                                        if (!interfaceC17066.mo1526()) {
                                            C9047 c9047M45103 = C19631.m45103(c90410, i, i, c9047M45139);
                                            C12100 c12100M32542 = C13510.m32542(c12100, i, i, i2);
                                            if (j6 == 0) {
                                                jM45123 = C19631.m45142(c9047M45139);
                                            } else {
                                                jM45123 = C19631.m45123(c90410, c9047M45139);
                                            }
                                            long j10 = jM45123;
                                            if (j == 0) {
                                                jM42304 = C18177.m42351(c9047M45139);
                                            } else {
                                                jM42304 = C18177.m42304(c90410, c9047M45139);
                                            }
                                            long j11 = jM42304;
                                            if (j2 == 0) {
                                                jM45097 = C19631.m45137(c9047M45139);
                                            } else {
                                                jM45097 = C19631.m45097(c90410, c9047M45139);
                                            }
                                            if (!this.f33367) {
                                                throw new IllegalStateException("Transaction is not active");
                                            }
                                            if (!interfaceC17066.mo1526()) {
                                                synchronized (this.f33366) {
                                                    try {
                                                        m27577();
                                                        m27595();
                                                        if (this.f33375 == c90410 || this.f33363 != c12100) {
                                                            throw new IllegalStateException("Transaction root changed during range transfer");
                                                        }
                                                        if (!interfaceC17066.mo1526()) {
                                                            if (C18177.m42334((Iterable) Arrays.asList(interfaceC18883ArrM24678))) {
                                                                if (arrayList != null) {
                                                                    m27560((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]));
                                                                    arrayList = null;
                                                                } else {
                                                                    m27574(interfaceC18883ArrM24678);
                                                                }
                                                                try {
                                                                    this.f33375 = c9047M45103;
                                                                    C9047 c9047M27551 = m27551(c9047M45103, i, this.f33366.f56545);
                                                                    this.f33375 = c9047M27551;
                                                                    this.f33363 = c12100M32542;
                                                                    if (c9047M27551 != c9047M45103) {
                                                                        this.f33362 = C19631.m45142(c9047M27551);
                                                                        this.f33374 = C18177.m42351(this.f33375);
                                                                        this.f33371 = C19631.m45137(this.f33375);
                                                                    } else {
                                                                        this.f33362 = C1005.m3495(j6, j10);
                                                                        this.f33374 = C1005.m3495(j, j11);
                                                                        this.f33371 = C1005.m3495(j2, jM45097);
                                                                    }
                                                                    C4108 c4108M45129 = C19631.m45129(this.f33375);
                                                                    this.f33364 = c4108M45129.m12331();
                                                                    this.f33365 = c4108M45129.m12332();
                                                                    if (this.f33364 > X931RNG.BLOCK128_RESEED_MAX) {
                                                                        throw new IllegalStateException("Literal heap storage exceeds memory limit");
                                                                    }
                                                                    this.f33373 |= j10 >= 1048576 || jM45097 >= 1048576;
                                                                    m27554(this.f33375, this.f33363);
                                                                    this.f33372 = true;
                                                                    synchronized (this.f33366) {
                                                                        if (this.f33368 == Thread.currentThread()) {
                                                                            this.f33368 = null;
                                                                        }
                                                                        this.f33366.notifyAll();
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
                                                                throw new C5519();
                                                            }
                                                        } else {
                                                            m27552();
                                                            throw new C23821();
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z = false;
                                                    }
                                                }
                                            } else {
                                                throw new C23821();
                                            }
                                        } else {
                                            throw new C23821();
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
                                    interfaceC18883Arr = interfaceC18883Arr3;
                                    interfaceC18883ArrM24678 = interfaceC18883Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C18177.m42332(interfaceC18883ArrM24678);
                                        if (arrayList != null) {
                                            C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                        }
                                    }
                                    synchronized (this.f33366) {
                                        if (!this.f33367) {
                                            m27552();
                                        }
                                        throw e;
                                    }
                                }
                            } else {
                                interfaceC18883Arr = interfaceC18883Arr3;
                                j2 = j8;
                                i2 = length;
                                interfaceC17066 = interfaceC17067;
                                j = j7;
                                try {
                                    interfaceC18883ArrM24678 = c9711.m24678();
                                    try {
                                        c9047M45139 = c9711.f29397;
                                        arrayList = null;
                                        if (!this.f33367) {
                                            throw new IllegalStateException("Transaction is not active");
                                        }
                                        if (!interfaceC17066.mo1526()) {
                                            C9047 c9047M45104 = C19631.m45103(c90410, i, i, c9047M45139);
                                            C12100 c12100M32543 = C13510.m32542(c12100, i, i, i2);
                                            if (j6 == 0) {
                                                jM45123 = C19631.m45142(c9047M45139);
                                            } else {
                                                jM45123 = C19631.m45123(c90410, c9047M45139);
                                            }
                                            long j12 = jM45123;
                                            if (j == 0) {
                                                jM42304 = C18177.m42351(c9047M45139);
                                            } else {
                                                jM42304 = C18177.m42304(c90410, c9047M45139);
                                            }
                                            long j13 = jM42304;
                                            if (j2 == 0) {
                                                jM45097 = C19631.m45137(c9047M45139);
                                            } else {
                                                jM45097 = C19631.m45097(c90410, c9047M45139);
                                            }
                                            if (!this.f33367) {
                                                throw new IllegalStateException("Transaction is not active");
                                            }
                                            if (!interfaceC17066.mo1526()) {
                                                synchronized (this.f33366) {
                                                    m27577();
                                                    m27595();
                                                    if (this.f33375 == c90410) {
                                                    }
                                                    throw new IllegalStateException("Transaction root changed during range transfer");
                                                }
                                            }
                                            throw new C23821();
                                        }
                                        throw new C23821();
                                    } catch (IOException e9) {
                                        e = e9;
                                        arrayList = null;
                                        z = false;
                                        if (!z) {
                                            C18177.m42332(interfaceC18883ArrM24678);
                                            if (arrayList != null) {
                                                C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                            }
                                        }
                                        synchronized (this.f33366) {
                                            if (!this.f33367) {
                                                m27552();
                                            }
                                            throw e;
                                        }
                                    } catch (Error e10) {
                                        e = e10;
                                        arrayList = null;
                                        z = false;
                                        if (!z) {
                                            C18177.m42332(interfaceC18883ArrM24678);
                                            if (arrayList != null) {
                                                C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                            }
                                        }
                                        synchronized (this.f33366) {
                                            if (!this.f33367) {
                                                m27552();
                                            }
                                            throw e;
                                        }
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        arrayList = null;
                                        z = false;
                                        if (!z) {
                                            C18177.m42332(interfaceC18883ArrM24678);
                                            if (arrayList != null) {
                                                C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                            }
                                        }
                                        synchronized (this.f33366) {
                                            if (!this.f33367) {
                                                m27552();
                                            }
                                            throw e;
                                        }
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    interfaceC18883ArrM24678 = interfaceC18883Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C18177.m42332(interfaceC18883ArrM24678);
                                        if (arrayList != null) {
                                            C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                        }
                                    }
                                    synchronized (this.f33366) {
                                        if (!this.f33367) {
                                            m27552();
                                        }
                                        throw e;
                                    }
                                } catch (Error e13) {
                                    e = e13;
                                    interfaceC18883ArrM24678 = interfaceC18883Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C18177.m42332(interfaceC18883ArrM24678);
                                        if (arrayList != null) {
                                            C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                        }
                                    }
                                    synchronized (this.f33366) {
                                        if (!this.f33367) {
                                            m27552();
                                        }
                                        throw e;
                                    }
                                } catch (RuntimeException e14) {
                                    e = e14;
                                    interfaceC18883ArrM24678 = interfaceC18883Arr;
                                    arrayList = null;
                                    z = false;
                                    if (!z) {
                                        C18177.m42332(interfaceC18883ArrM24678);
                                        if (arrayList != null) {
                                            C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                        }
                                    }
                                    synchronized (this.f33366) {
                                        if (!this.f33367) {
                                            m27552();
                                        }
                                        throw e;
                                    }
                                }
                            }
                            if (!z) {
                                C18177.m42332(interfaceC18883ArrM24678);
                                if (arrayList != null) {
                                    C18177.m42359((InterfaceC18883[]) arrayList.toArray(new InterfaceC18883[0]), e);
                                }
                            }
                            synchronized (this.f33366) {
                                if (!this.f33367) {
                                    m27552();
                                }
                            }
                            throw e;
                        } catch (Throwable th3) {
                            synchronized (this.f33366) {
                                if (this.f33368 == Thread.currentThread()) {
                                    this.f33368 = null;
                                }
                                this.f33366.notifyAll();
                                throw th3;
                            }
                        }
                    }
                    m27552();
                    throw new C23821();
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (IOException | Error | RuntimeException e15) {
                if (!this.f33367) {
                    m27552();
                }
                throw e15;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27601(int i, int i2) {
        synchronized (this.f33366) {
            m27577();
            m27595();
            int i3 = 0;
            C4607 c4607 = new C4607(i, i2, true, false);
            C9047 c9047 = this.f33375;
            if (c9047 != null) {
                i3 = c9047.f27431;
            }
            C4607.m13516(c4607, i3);
            this.f33376 = c4607;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27600(InterfaceC17066 interfaceC17066) {
        InterfaceC17066 interfaceC17066M38504 = interfaceC17066 == null ? null : C16360.m38504(interfaceC17066);
        synchronized (this.f33366) {
            m27577();
            m27595();
            if (interfaceC17066M38504 != null && interfaceC17066M38504.mo1526()) {
                m27552();
                return false;
            }
            InterfaceC18883[] interfaceC18883ArrM42342 = C18177.m42342(this.f33366, this, interfaceC17066M38504);
            if (interfaceC18883ArrM42342 == null) {
                return false;
            }
            C18177.m42332(interfaceC18883ArrM42342);
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1949 m27596(int i, byte[] bArr) {
        C1949 c1949;
        synchronized (this.f33366) {
            m27577();
            m27595();
            if (!this.f33372) {
                C9047 c9047 = this.f33375;
                C7429 c7429 = this.f33377;
                if (c9047 == c7429.f22836 && this.f33363 == c7429.f22840) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Pattern must not be empty");
                    }
                    if (bArr.length > 67108864) {
                        throw new IllegalStateException("Replacement metadata exceeds memory limit");
                    }
                    if (!C18177.m42360(C1005.m3495(C1005.m3495(C19631.m45118(c9047), C1005.m3495(C19631.m45128(this.f33375), C1005.m3495(this.f33362, C1005.m3495(this.f33374, C13510.m32558(this.f33363))))), C1005.m3495(bArr.length, 16384L)))) {
                        throw new IllegalStateException("Replacement edit metadata exceeds memory limit");
                    }
                    this.f33374 = C18177.m42351(this.f33375);
                    this.f33362 = C19631.m45142(this.f33375);
                    c1949 = new C1949(this, i, (byte[]) bArr.clone());
                    this.f33378 = c1949;
                }
            }
            throw new IllegalStateException("Batch replacement requires a pristine transaction");
        }
        return c1949;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33366) {
            if (!this.f33367) {
                C18177.m42328(this.f33366, this);
            }
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m27575(C11122 c11122) throws C5519 {
        if (C18177.m42334((Iterable) c11122.f33369.keySet())) {
            return;
        }
        c11122.m27552();
        throw new C5519();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27565(C11122 c11122) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        C19631.m45134(c11122.f33375, identityHashMap);
        IdentityHashMap identityHashMap2 = c11122.f33369;
        for (InterfaceC18883 interfaceC18883 : identityHashMap2.keySet()) {
            if (!identityHashMap.containsKey(interfaceC18883) || c11122.f33366.f56546.put(interfaceC18883, Boolean.TRUE) != null) {
                C18177.m42332(new InterfaceC18883[]{interfaceC18883});
            }
        }
        identityHashMap2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m27574(InterfaceC18883[] interfaceC18883Arr) {
        Set setKeySet = this.f33366.f56546.keySet();
        IdentityHashMap identityHashMap = this.f33369;
        Set setKeySet2 = identityHashMap.keySet();
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        IdentityHashMap identityHashMap3 = new IdentityHashMap();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayDeque.push((InterfaceC18883) it.next());
        }
        Iterator it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            arrayDeque.push((InterfaceC18883) it2.next());
        }
        for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
            arrayDeque.push(interfaceC18883);
        }
        while (!arrayDeque.isEmpty()) {
            InterfaceC18883 interfaceC18884 = (InterfaceC18883) arrayDeque.pop();
            Boolean bool = Boolean.TRUE;
            if (identityHashMap2.put(interfaceC18884, bool) == null) {
                if (interfaceC18884 instanceof C5477) {
                    identityHashMap3.put((C5477) interfaceC18884, bool);
                } else if (interfaceC18884 instanceof C6018) {
                    for (InterfaceC18883 interfaceC18885 : ((C6018) interfaceC18884).f18478) {
                        arrayDeque.push(interfaceC18885);
                    }
                }
            }
        }
        if (identityHashMap3.size() > 64) {
            throw new IllegalStateException("Too many external file sources");
        }
        for (InterfaceC18883 interfaceC18886 : interfaceC18883Arr) {
            if (identityHashMap.put(interfaceC18886, Boolean.TRUE) != null) {
                C18177.m42332(new InterfaceC18883[]{interfaceC18886});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27560(InterfaceC18883[] interfaceC18883Arr) {
        int length = interfaceC18883Arr.length;
        int i = 0;
        while (true) {
            IdentityHashMap identityHashMap = this.f33369;
            if (i >= length) {
                for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
                    identityHashMap.put(interfaceC18883, Boolean.TRUE);
                }
                return;
            } else {
                InterfaceC18883 interfaceC18884 = interfaceC18883Arr[i];
                if (identityHashMap.containsKey(interfaceC18884) || this.f33366.f56546.containsKey(interfaceC18884)) {
                    throw new IllegalStateException("Created source is already owned");
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static void m27563(C11122 c11122) {
        IdentityHashMap identityHashMap = c11122.f33369;
        InterfaceC18883[] interfaceC18883Arr = (InterfaceC18883[]) identityHashMap.keySet().toArray(new InterfaceC18883[0]);
        identityHashMap.clear();
        C18177.m42332(interfaceC18883Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27558(C11122 c11122, InterfaceC17066 interfaceC17066) throws C23821 {
        if (interfaceC17066.mo1526()) {
            c11122.m27552();
            throw new C23821();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9047 m27551(C9047 c9047, int i, C21541 c21541) {
        if (this.f33364 > 8323072) {
            return c9047;
        }
        if ((c9047 == null ? 0 : c9047.f27428) <= 256) {
            return c9047;
        }
        C9753 c9753M45131 = C19631.m45131(i, c9047);
        if (c9753M45131.m24732() == null) {
            return c9047;
        }
        C9047 c9047M24732 = c9753M45131.m24732();
        if ((c9047M24732 != null ? c9047M24732.f27428 : 0) <= 256) {
            return c9047;
        }
        int length = c9753M45131.length();
        byte[] bArr = new byte[length];
        C19631.m45114(c9753M45131.m24732(), bArr);
        return C19631.m45103(c9047, c9753M45131.m24731(), c9753M45131.m24731() + c9753M45131.length(), c21541.m48697(length, bArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27553(int i, int i2, int i3) {
        int length = length();
        if (i < 0 || i2 < i || i2 > length) {
            StringBuilder sbM46682 = C20361.m46682("start=", i, ", end=", ", length=", i2);
            sbM46682.append(length);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        if ((((long) length) - ((long) (i2 - i))) + ((long) i3) > 2147483647L) {
            throw new C7161();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m27577() {
        m27581();
        if (this.f33367 || this.f33366.f56551 != this || this.f33370 != this.f33366.f56547 || this.f33366.f56537 != this.f33377) {
            throw new IllegalStateException("Transaction is not active");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m27586() {
        if (this.f33368 != null) {
            throw new IllegalStateException("Range transfer is already active");
        }
        this.f33368 = Thread.currentThread();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m27581() {
        Thread thread;
        Thread threadCurrentThread = Thread.currentThread();
        boolean z = false;
        while (!this.f33367 && (thread = this.f33368) != null && thread != threadCurrentThread) {
            try {
                this.f33366.wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            threadCurrentThread.interrupt();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m27595() {
        if (this.f33378 != null) {
            throw new IllegalStateException("A batch replacement is active");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m27552() {
        m27581();
        if (this.f33367 || this.f33366.f56551 != this) {
            return;
        }
        C1949 c1949 = this.f33378;
        if (c1949 != null) {
            c1949.f6503 = true;
            this.f33378 = null;
        }
        this.f33366.f56545.m48699(this.f33379);
        IdentityHashMap identityHashMap = this.f33369;
        InterfaceC18883[] interfaceC18883Arr = (InterfaceC18883[]) identityHashMap.keySet().toArray(new InterfaceC18883[0]);
        identityHashMap.clear();
        C18177.m42332(interfaceC18883Arr);
        this.f33366.f56551 = null;
        this.f33367 = true;
        this.f33366.notifyAll();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static void m27590(C11122 c11122) {
        c11122.m27554(c11122.f33375, c11122.f33363);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27554(C9047 c9047, C12100 c12100) {
        if (!C18177.m42360(C1005.m3495(C1005.m3495(C1005.m3495(C1005.m3495(C19631.m45128(c9047), this.f33362), C19631.m45118(c9047)), this.f33374), C13510.m32558(c12100)))) {
            throw new IllegalStateException("Edit metadata exceeds memory limit");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m27561(int i) {
        if (i == 0) {
            return false;
        }
        if (i >= 0) {
            return C1005.m3495(this.f33364, C1005.m3495(((((long) i) + 65535) / 65536) * 65536, 65536L)) > X931RNG.BLOCK128_RESEED_MAX;
        }
        throw new IllegalArgumentException("Negative literal length");
    }
}
