package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۡ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9114 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final FileChannel f27613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27614;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9820 f27615;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9820 f27616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9820 f27617;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C9820 f27618;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f27620;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9820 f27621;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f27622;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27623;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9820 f27624;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27625;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5377 f27626;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9820[] f27619 = new C9820[255];

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C5089 f27612 = new C5089(-1, -1);

    public C9114(InterfaceC20758 interfaceC20758, FileChannel fileChannel, C5377 c5377) {
        this.f27622 = interfaceC20758;
        this.f27613 = fileChannel;
        this.f27626 = c5377;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9114 m23478(InputStream inputStream, InterfaceC20758 interfaceC20758, C1143 c1143, long j) throws Throwable {
        boolean z;
        Throwable e;
        FileChannel fileChannelOpen;
        boolean z2 = false;
        C9114 c9114 = null;
        try {
            if (j < 0 || j > 2147483647L) {
                throw new IllegalArgumentException("Invalid legacy state size limit");
            }
            C5377 c5377M3921 = c1143.m3921(65536L);
            try {
                try {
                    z = true;
                    OutputStream outputStreamNewOutputStream = C17229.newOutputStream(interfaceC20758, EnumC3824.CREATE_NEW, EnumC3824.WRITE);
                    try {
                        C21814.m49169(inputStream, j, outputStreamNewOutputStream);
                        if (outputStreamNewOutputStream != null) {
                            outputStreamNewOutputStream.close();
                        }
                        try {
                            c5377M3921.close();
                            C5377 c5377M3922 = c1143.m3921(24576L);
                            try {
                                fileChannelOpen = C12084.open(interfaceC20758, EnumC3824.READ);
                                try {
                                    C9114 c9115 = new C9114(interfaceC20758, fileChannelOpen, c5377M3922);
                                    try {
                                        c9115.m23476();
                                        if (inputStream == null) {
                                            return c9115;
                                        }
                                        try {
                                            inputStream.close();
                                            return c9115;
                                        } catch (IOException e2) {
                                            e = e2;
                                            if (c9115 == null) {
                                                try {
                                                    c9115.close();
                                                } catch (IOException e3) {
                                                    e.addSuppressed(e3);
                                                }
                                            } else if (z) {
                                                try {
                                                    C17229.delete(interfaceC20758);
                                                } catch (IOException e4) {
                                                    e.addSuppressed(e4);
                                                }
                                            }
                                            throw e;
                                        } catch (Error e5) {
                                            e = e5;
                                            if (c9115 == null) {
                                                c9115.close();
                                            } else if (z) {
                                                C17229.delete(interfaceC20758);
                                            }
                                            throw e;
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            if (c9115 == null) {
                                                c9115.close();
                                            } else if (z) {
                                                C17229.delete(interfaceC20758);
                                            }
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c9114 = c9115;
                                        z = true;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    th.addSuppressed(th2);
                                                } catch (IOException | Error | RuntimeException e7) {
                                                    e = e7;
                                                    c9115 = c9114;
                                                    if (c9115 == null) {
                                                        c9115.close();
                                                    } else if (z) {
                                                        C17229.delete(interfaceC20758);
                                                    }
                                                    throw e;
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    if (fileChannelOpen != null) {
                                        try {
                                            fileChannelOpen.close();
                                        } catch (IOException e9) {
                                            e.addSuppressed(e9);
                                        }
                                    }
                                    c5377M3922.close();
                                    throw e;
                                } catch (Error e10) {
                                    e = e10;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c5377M3922.close();
                                    throw e;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c5377M3922.close();
                                    throw e;
                                }
                            } catch (IOException | Error | RuntimeException e12) {
                                e = e12;
                                fileChannelOpen = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z = true;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        if (outputStreamNewOutputStream != null) {
                            try {
                                outputStreamNewOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        c5377M3921.close();
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                z2 = true;
                c5377M3921.close();
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
            z = z2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9820 m23486() {
        return this.f27617;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C9820 m23491() {
        return this.f27618;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9820 m23482() {
        return this.f27624;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9820 m23487() {
        return this.f27621;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9820 m23485() {
        return this.f27616;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9820 m23484() {
        return this.f27615;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5089 m23490() {
        return this.f27612;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23489() {
        return this.f27614;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m23492() {
        return this.f27620;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m23488() {
        return this.f27623;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9820 m23483(int i) {
        if (i >= 0) {
            C9820[] c9820Arr = this.f27619;
            if (i < c9820Arr.length) {
                return c9820Arr[i];
            }
        }
        throw new IllegalArgumentException("Invalid legacy state record type");
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m23476() throws IOException {
        long j;
        C6997 c6997 = new C6997(this, this.f27613.size());
        c6997.m18928(1382224737);
        long j2 = c6997.f21603;
        if (c6997.m18923() != 0) {
            c6997.m18929(9L);
            if (c6997.m18923() != 0) {
                while (c6997.m18923() != 0) {
                }
            }
            c6997.m18929(1L);
            int iM18924 = c6997.m18924(20);
            for (int i = 0; i < iM18924; i++) {
                c6997.m18931();
                c6997.m18929(8L);
                c6997.m18931();
                int iM18925 = c6997.m18924(12);
                for (int i2 = 0; i2 < iM18925; i2++) {
                    c6997.m18929(8L);
                    c6997.m18931();
                }
            }
        }
        this.f27617 = m23479(j2, c6997.f21603);
        c6997.m18928(1382224738);
        c6997.m18928(-249340294);
        long jM18925 = c6997.m18925(c6997.m18927());
        long j3 = c6997.f21604;
        c6997.f21604 = jM18925;
        while (true) {
            int iM18923 = c6997.m18923();
            if (iM18923 == 255) {
                c6997.m18932();
                c6997.f21604 = j3;
                c6997.m18928(-249340294);
                if (this.f27618 == null) {
                    throw new IOException("Legacy editor state has no text record");
                }
                if (Integer.compare(this.f27623 ^ Integer.MIN_VALUE, this.f27620 ^ Integer.MIN_VALUE) > 0) {
                    throw new IOException("Invalid legacy current mark");
                }
                c6997.m18928(1382224739);
                long j4 = c6997.f21603;
                c6997.m18929(2L);
                c6997.m18931();
                c6997.m18931();
                long j5 = c6997.f21603;
                int iM18926 = c6997.m18923() | (c6997.m18923() << 8);
                c6997.f21603 = j5;
                if (iM18926 == 29298) {
                    c6997.m18929(3L);
                }
                this.f27616 = m23479(j4, c6997.f21603);
                c6997.m18928(1382224740);
                long j6 = c6997.f21603;
                int iM18927 = c6997.m18927();
                c6997.f21603 = j6;
                if (iM18927 < 388441878 || iM18927 > 388441882) {
                    iM18927 = 0;
                } else {
                    c6997.m18929(4L);
                }
                c6997.m18931();
                c6997.m18929(10L);
                if (iM18927 >= 388441879) {
                    j = 1;
                    c6997.m18929(1L);
                } else {
                    j = 1;
                }
                c6997.m18929(j);
                if (iM18927 >= 388441878) {
                    c6997.m18929(4L);
                }
                c6997.m18929(4L);
                if (iM18927 >= 388441880) {
                    while (c6997.m18923() != 0) {
                    }
                }
                if (iM18927 >= 388441881) {
                    c6997.m18929(1L);
                }
                if (iM18927 >= 388441882) {
                    c6997.m18929(1L);
                }
                c6997.m18932();
                this.f27615 = m23479(j6, c6997.f21603);
                return;
            }
            C9820[] c9820Arr = this.f27619;
            if (c9820Arr[iM18923] != null) {
                throw new IOException("Duplicate legacy editor record");
            }
            int iM18928 = c6997.m18927();
            long j7 = c6997.f21603;
            long j8 = jM18925;
            long jM18926 = c6997.m18925(iM18928);
            c9820Arr[iM18923] = m23479(j7, jM18926);
            c6997.f21604 = jM18926;
            if (iM18923 == 0) {
                if (iM18928 < 8) {
                    throw new IOException("Invalid legacy text record");
                }
                long j9 = jM18926 - 4;
                this.f27618 = m23479(j7, j9);
                c6997.f21603 = j9;
                this.f27614 = c6997.m18927();
            } else if (iM18923 == 1) {
                this.f27620 = c6997.m18927();
                c6997.m18927();
                this.f27623 = c6997.m18927();
            } else if (iM18923 == 2) {
                int iM18929 = c6997.m18927();
                int iM189210 = c6997.m18927();
                if (iM18929 < -1 || iM189210 < -1) {
                    throw new IOException("Invalid legacy selection");
                }
                this.f27612 = new C5089(iM18929, iM189210);
                c6997.m18929(12L);
            } else if (iM18923 != 3) {
                c6997.f21603 = jM18926;
            } else {
                int[] iArr = new int[2];
                c6997.m18926(iArr);
                c6997.m18926(iArr);
                this.f27624 = c6997.m18930();
                this.f27621 = c6997.m18930();
            }
            c6997.m18932();
            c6997.f21604 = j8;
            jM18925 = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9820 m23479(long j, long j2) {
        return new C9820(this, j, j2 - j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23481(C9114 c9114) throws IOException {
        if (c9114.f27625) {
            throw new IOException("Legacy state index is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C5377 c5377 = this.f27626;
        InterfaceC20758 interfaceC20758 = this.f27622;
        if (this.f27625) {
            return;
        }
        this.f27625 = true;
        try {
            try {
                this.f27613.close();
                C17229.delete(interfaceC20758);
                c5377.close();
            } catch (Throwable th) {
                C17229.delete(interfaceC20758);
                throw th;
            }
        } catch (Throwable th2) {
            c5377.close();
            throw th2;
        }
    }
}
