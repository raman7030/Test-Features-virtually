package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۘ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6337 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f16425;

    /* JADX INFO: renamed from: ۛ */
    public boolean f16427;

    /* JADX INFO: renamed from: ۤ */
    public C4523 f16428;

    /* JADX INFO: renamed from: ۨ */
    public final C22902 f16429;

    /* JADX INFO: renamed from: ۫ */
    public boolean f16430;

    /* JADX INFO: renamed from: ᩶ */
    public C14383 f16433;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22097 f16435;

    /* JADX INFO: renamed from: ᩺ */
    public C13773 f16436;

    /* JADX INFO: renamed from: ܰ */
    public final Thread f16432 = Thread.currentThread();

    /* JADX INFO: renamed from: ۙ */
    public C4563 f16426 = new C4563();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16434 = true;

    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC24242 f16431 = InterfaceC24242.f76829;

    public C6337(C22902 c22902, InterfaceC22097 interfaceC22097) {
        this.f16429 = c22902;
        this.f16435 = interfaceC22097;
        this.f16428 = C4523.m9576(c22902.f72073, new byte[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14497(C11031 c11031, C21308 c21308, int i, int i2, C6555 c6555, byte[] bArr) throws Throwable {
        m14489();
        if (this.f16436 != null || this.f16433 != null) {
            throw new IllegalStateException("Legacy editor state already supplied");
        }
        try {
            if (i < 1 || i > 1024 || i2 < 0 || i2 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C11702 c11702M25438 = c11031.m25438();
            C11031.m25428(c11702M25438.f32629);
            m14495(new C22431(c11702M25438), c11031.m25438().m26908(), c21308, c11031.m25436());
            int iM31402 = this.f16436.m31402();
            m14496(c11031.m25437(), c11031.m25435(), c11031.m25439());
            int iM14493 = m14493(i, i2, new C4183(c6555));
            C14443 c14443 = new C14443(this.f16436, 0L);
            try {
                C2983 c2983 = new C2983(c14443, iM14493, iM31402);
                try {
                    C11702 c11702M25430 = c11031.m25430(7);
                    if (c11702M25430 != null) {
                        C11031.m25428(c11702M25430.f32629);
                        C25112 c25112 = new C25112(c11702M25430.m26908(), new C22431(c11702M25430));
                        try {
                            c2983.m4999(c25112.readInt());
                            c2983.m4999(c25112.readInt());
                            c25112.m55115();
                            c25112.close();
                        } catch (Throwable th) {
                            try {
                                c25112.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    C11702[] c11702Arr = {c11031.m25429(), c11031.m25434()};
                    for (int i3 = 0; i3 < 2; i3++) {
                        C11702 c11702 = c11702Arr[i3];
                        if (c11702 != null) {
                            C11031.m25428(c11702.f32629);
                            c2983.m5000(new C22431(c11702), c11702.m26908(), new C10927());
                        }
                    }
                    c2983.close();
                    c14443.close();
                    C19077 c19077M43349 = C19077.m43349(c11031, iM14493, iM31402, bArr, this.f16429.f72073);
                    try {
                        m14494(c19077M43349.length(), c19077M43349.m43355());
                        c19077M43349.close();
                    } catch (Throwable th3) {
                        try {
                            c19077M43349.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c2983.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    c14443.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (IOException e) {
            e = e;
            this.f16427 = true;
            throw e;
        } catch (Error e2) {
            e = e2;
            this.f16427 = true;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            this.f16427 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14495(InputStream inputStream, long j, C21308 c21308, int i) {
        Integer numValueOf = Integer.valueOf(i);
        try {
            C25112 c25112 = new C25112(j, inputStream);
            m14489();
            if (this.f16436 != null) {
                throw new IllegalStateException("Legacy text already supplied");
            }
            try {
                C13773 c13773M55108 = c25112.m55108(this.f16429, new C6395(2, c21308), numValueOf);
                c25112.m55115();
                this.f16436 = c13773M55108;
                ((C22431) inputStream).f70781 = true;
            } catch (C7007 e) {
                this.f16427 = true;
                throw e;
            }
        } catch (Throwable th) {
            try {
                ((C22431) inputStream).f70781 = true;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14496(C7205 c7205, int i, int i2) {
        m14489();
        if (this.f16436 != null) {
            if (this.f16425 || this.f16430) {
                throw new IllegalStateException("Legacy history already supplied or pages joined");
            }
            if (c7205.m16550() > this.f16436.m31402() || c7205.m16548() > this.f16436.m31402()) {
                throw new IllegalArgumentException("Legacy selection exceeds text");
            }
            this.f16426 = new C4563(new C11503(), c7205, ((long) i) & 4294967295L, ((long) i2) & 4294967295L, 16777216L);
            this.f16425 = true;
            return;
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m14493(int i, int i2, C4183 c4183) throws Throwable {
        String str;
        int i3;
        C13773 c13773M49053;
        int i4 = i2;
        m14489();
        C13773 c13773 = this.f16436;
        if (c13773 != null) {
            if (this.f16430) {
                throw new IllegalStateException("Legacy pages already joined");
            }
            C4563 c4563 = this.f16426;
            if (i < 1 || i > 1024 || i4 < 0 || i4 >= i) {
                throw new IOException("Invalid legacy page manifest");
            }
            C22902 c22902 = c13773.f38940;
            if (c22902 == null) {
                throw new IllegalArgumentException("Legacy page migration requires a page store");
            }
            C13773 c13773M31388 = C13773.m31388(c22902.f72072, c22902.f72076, c22902);
            int i5 = 0;
            int iM31402 = 0;
            while (i5 < i) {
                if (i5 == i4) {
                    iM31402 = c13773M31388.m31402();
                    c13773M49053 = c13773;
                } else {
                    C3654 c3654M6948 = C3654.m6948(((C6555) c4183.f9212).m14998(i5), c22902.f72073);
                    try {
                        c13773M49053 = C21760.m49053(c3654M6948, c22902, Integer.MAX_VALUE - c13773M31388.m31402(), null);
                        c3654M6948.close();
                    } catch (Throwable th) {
                        try {
                            c3654M6948.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                C13773 c13774 = c13773;
                if (((long) c13773M31388.m31402()) + ((long) c13773M49053.m31402()) > Integer.MAX_VALUE) {
                    throw new IOException("Legacy pages exceed migration coordinate limit");
                }
                c13773M31388 = c13773M31388.m31401(c13773M49053);
                i5++;
                i4 = i2;
                c13773 = c13774;
            }
            C11503 c11503 = new C11503();
            C7205 c7205 = c4563.f10229;
            int iM16550 = c7205.m16550();
            int i6 = -1;
            if (iM16550 == -1) {
                i3 = -1;
                str = "Legacy page coordinate exceeds limit";
            } else {
                str = "Legacy page coordinate exceeds limit";
                if (((long) iM16550) + ((long) iM31402) > 2147483647L) {
                    throw new IOException(str);
                }
                i3 = iM16550 + iM31402;
            }
            int iM16548 = c7205.m16548();
            if (iM16548 != -1) {
                if (((long) iM16548) + ((long) iM31402) > 2147483647L) {
                    throw new IOException(str);
                }
                i6 = iM16548 + iM31402;
            }
            C7678 c7678 = new C7678(c13773M31388, new C4563(c11503, new C7205(i3, i6), c4563.f10226, c4563.f10230, c4563.f10228), iM31402);
            this.f16436 = c7678.m17791();
            this.f16426 = c7678.m17790();
            this.f16430 = true;
            return c7678.m17789();
        }
        throw new IllegalStateException("Legacy text has not been supplied");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14494(long j, InputStream inputStream) throws IOException {
        try {
            m14489();
            if (this.f16433 != null) {
                throw new IllegalStateException("Migration state already supplied");
            }
            this.f16427 = true;
            InterfaceC22097 interfaceC22097 = this.f16435;
            C22902 c22902 = this.f16429;
            this.f16433 = C8348.m19268(interfaceC22097, c22902.f72077, inputStream, j, c22902.f72073, this.f16431);
            inputStream.close();
            this.f16427 = false;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14489() {
        if (!this.f16434 || this.f16427 || this.f16432 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer is outside its converter callback or failed");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m14492(C6337 c6337) {
        C14383 c14383;
        C22902 c22902 = c6337.f16429;
        c6337.m14489();
        C13773 c13773 = c6337.f16436;
        if (c13773 == null) {
            throw new IllegalStateException("Legacy text has not been supplied");
        }
        C15921.m36039(c6337.f16426.f10227, c13773.m31402());
        C14383 c14384 = c6337.f16433;
        if (c14384 == null) {
            c14383 = new C14383(c22902.f72077, 0L, null, c6337.f16428.m9578());
        } else {
            c14383 = new C14383(c22902.f72077, c14384.f41112, c14384.f41111, c6337.f16428.m9578());
        }
        C4523 c4523M9576 = C4523.m9576(c22902.f72073, c14383.m32994());
        c6337.f16428.close();
        c6337.f16428 = c4523M9576;
        c6337.f16434 = false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f16432 != Thread.currentThread()) {
            throw new IllegalStateException("Migration writer belongs to its converter thread");
        }
        this.f16434 = false;
        this.f16436 = null;
        this.f16426 = null;
        C4523 c4523 = this.f16428;
        if (c4523 != null) {
            c4523.close();
            this.f16428 = null;
        }
    }
}
