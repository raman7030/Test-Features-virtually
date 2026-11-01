package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۡ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11031 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final FileChannel f30550;

    /* JADX INFO: renamed from: ۙ */
    public int f30551;

    /* JADX INFO: renamed from: ۛ */
    public C11702 f30552;

    /* JADX INFO: renamed from: ۟ */
    public C11702 f30553;

    /* JADX INFO: renamed from: ۤ */
    public C11702 f30554;

    /* JADX INFO: renamed from: ۧ֫ */
    public C11702 f30555;

    /* JADX INFO: renamed from: ۫ */
    public int f30557;

    /* JADX INFO: renamed from: ۬ */
    public C11702 f30558;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22097 f30559;

    /* JADX INFO: renamed from: ᩶ */
    public int f30560;

    /* JADX INFO: renamed from: ᩸ */
    public C11702 f30561;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f30562;

    /* JADX INFO: renamed from: ᩺ */
    public final C7479 f30563;

    /* JADX INFO: renamed from: ۨ */
    public final C11702[] f30556 = new C11702[255];

    /* JADX INFO: renamed from: ֫֫ */
    public C7205 f30549 = new C7205(-1, -1);

    public C11031(InterfaceC22097 interfaceC22097, FileChannel fileChannel, C7479 c7479) {
        this.f30559 = interfaceC22097;
        this.f30550 = fileChannel;
        this.f30563 = c7479;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static C11031 m25425(InputStream inputStream, InterfaceC22097 interfaceC22097, C3455 c3455, long j) throws Throwable {
        boolean z;
        Throwable e;
        FileChannel fileChannelOpen;
        boolean z2 = false;
        C11031 c11031 = null;
        try {
            if (j < 0 || j > 2147483647L) {
                throw new IllegalArgumentException("Invalid legacy state size limit");
            }
            C7479 c7479M6162 = c3455.m6162(65536L);
            try {
                try {
                    z = true;
                    OutputStream outputStreamNewOutputStream = C18743.newOutputStream(interfaceC22097, EnumC6003.CREATE_NEW, EnumC6003.WRITE);
                    try {
                        C23101.m51520(inputStream, j, outputStreamNewOutputStream);
                        if (outputStreamNewOutputStream != null) {
                            outputStreamNewOutputStream.close();
                        }
                        try {
                            c7479M6162.close();
                            C7479 c7479M6163 = c3455.m6162(24576L);
                            try {
                                fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.READ);
                                try {
                                    C11031 c11032 = new C11031(interfaceC22097, fileChannelOpen, c7479M6163);
                                    try {
                                        c11032.m25423();
                                        if (inputStream == null) {
                                            return c11032;
                                        }
                                        try {
                                            inputStream.close();
                                            return c11032;
                                        } catch (IOException e2) {
                                            e = e2;
                                            if (c11032 == null) {
                                                try {
                                                    c11032.close();
                                                } catch (IOException e3) {
                                                    e.addSuppressed(e3);
                                                }
                                            } else if (z) {
                                                try {
                                                    C18743.delete(interfaceC22097);
                                                } catch (IOException e4) {
                                                    e.addSuppressed(e4);
                                                }
                                            }
                                            throw e;
                                        } catch (Error e5) {
                                            e = e5;
                                            if (c11032 == null) {
                                                c11032.close();
                                            } else if (z) {
                                                C18743.delete(interfaceC22097);
                                            }
                                            throw e;
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            if (c11032 == null) {
                                                c11032.close();
                                            } else if (z) {
                                                C18743.delete(interfaceC22097);
                                            }
                                            throw e;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        c11031 = c11032;
                                        z = true;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th2) {
                                                try {
                                                    th.addSuppressed(th2);
                                                } catch (IOException | Error | RuntimeException e7) {
                                                    e = e7;
                                                    c11032 = c11031;
                                                    if (c11032 == null) {
                                                        c11032.close();
                                                    } else if (z) {
                                                        C18743.delete(interfaceC22097);
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
                                    c7479M6163.close();
                                    throw e;
                                } catch (Error e10) {
                                    e = e10;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c7479M6163.close();
                                    throw e;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    if (fileChannelOpen != null) {
                                        fileChannelOpen.close();
                                    }
                                    c7479M6163.close();
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
                        c7479M6162.close();
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                    }
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                z2 = true;
                c7479M6162.close();
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

    /* JADX INFO: renamed from: ۜ */
    public final C11702 m25433() {
        return this.f30554;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C11702 m25438() {
        return this.f30555;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11702 m25429() {
        return this.f30561;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C11702 m25434() {
        return this.f30558;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C11702 m25432() {
        return this.f30553;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C11702 m25431() {
        return this.f30552;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C7205 m25437() {
        return this.f30549;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m25436() {
        return this.f30551;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m25439() {
        return this.f30557;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m25435() {
        return this.f30560;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11702 m25430(int i) {
        if (i >= 0) {
            C11702[] c11702Arr = this.f30556;
            if (i < c11702Arr.length) {
                return c11702Arr[i];
            }
        }
        throw new IllegalArgumentException("Invalid legacy state record type");
    }

    /* JADX INFO: renamed from: ֡ */
    private void m25423() throws IOException {
        long j;
        C9019 c9019 = new C9019(this, this.f30550.size());
        c9019.m20882(1382224737);
        long j2 = c9019.f24483;
        if (c9019.m20877() != 0) {
            c9019.m20883(9L);
            if (c9019.m20877() != 0) {
                while (c9019.m20877() != 0) {
                }
            }
            c9019.m20883(1L);
            int iM20878 = c9019.m20878(20);
            for (int i = 0; i < iM20878; i++) {
                c9019.m20885();
                c9019.m20883(8L);
                c9019.m20885();
                int iM20879 = c9019.m20878(12);
                for (int i2 = 0; i2 < iM20879; i2++) {
                    c9019.m20883(8L);
                    c9019.m20885();
                }
            }
        }
        this.f30554 = m25426(j2, c9019.f24483);
        c9019.m20882(1382224738);
        c9019.m20882(-249340294);
        long jM20879 = c9019.m20879(c9019.m20881());
        long j3 = c9019.f24484;
        c9019.f24484 = jM20879;
        while (true) {
            int iM20877 = c9019.m20877();
            if (iM20877 == 255) {
                c9019.m20886();
                c9019.f24484 = j3;
                c9019.m20882(-249340294);
                if (this.f30555 == null) {
                    throw new IOException("Legacy editor state has no text record");
                }
                if (Integer.compare(this.f30560 ^ Integer.MIN_VALUE, this.f30557 ^ Integer.MIN_VALUE) > 0) {
                    throw new IOException("Invalid legacy current mark");
                }
                c9019.m20882(1382224739);
                long j4 = c9019.f24483;
                c9019.m20883(2L);
                c9019.m20885();
                c9019.m20885();
                long j5 = c9019.f24483;
                int iM208710 = c9019.m20877() | (c9019.m20877() << 8);
                c9019.f24483 = j5;
                if (iM208710 == 29298) {
                    c9019.m20883(3L);
                }
                this.f30553 = m25426(j4, c9019.f24483);
                c9019.m20882(1382224740);
                long j6 = c9019.f24483;
                int iM20881 = c9019.m20881();
                c9019.f24483 = j6;
                if (iM20881 < 388441878 || iM20881 > 388441882) {
                    iM20881 = 0;
                } else {
                    c9019.m20883(4L);
                }
                c9019.m20885();
                c9019.m20883(10L);
                if (iM20881 >= 388441879) {
                    j = 1;
                    c9019.m20883(1L);
                } else {
                    j = 1;
                }
                c9019.m20883(j);
                if (iM20881 >= 388441878) {
                    c9019.m20883(4L);
                }
                c9019.m20883(4L);
                if (iM20881 >= 388441880) {
                    while (c9019.m20877() != 0) {
                    }
                }
                if (iM20881 >= 388441881) {
                    c9019.m20883(1L);
                }
                if (iM20881 >= 388441882) {
                    c9019.m20883(1L);
                }
                c9019.m20886();
                this.f30552 = m25426(j6, c9019.f24483);
                return;
            }
            C11702[] c11702Arr = this.f30556;
            if (c11702Arr[iM20877] != null) {
                throw new IOException("Duplicate legacy editor record");
            }
            int iM20882 = c9019.m20881();
            long j7 = c9019.f24483;
            long j8 = jM20879;
            long jM208710 = c9019.m20879(iM20882);
            c11702Arr[iM20877] = m25426(j7, jM208710);
            c9019.f24484 = jM208710;
            if (iM20877 == 0) {
                if (iM20882 < 8) {
                    throw new IOException("Invalid legacy text record");
                }
                long j9 = jM208710 - 4;
                this.f30555 = m25426(j7, j9);
                c9019.f24483 = j9;
                this.f30551 = c9019.m20881();
            } else if (iM20877 == 1) {
                this.f30557 = c9019.m20881();
                c9019.m20881();
                this.f30560 = c9019.m20881();
            } else if (iM20877 == 2) {
                int iM20883 = c9019.m20881();
                int iM20884 = c9019.m20881();
                if (iM20883 < -1 || iM20884 < -1) {
                    throw new IOException("Invalid legacy selection");
                }
                this.f30549 = new C7205(iM20883, iM20884);
                c9019.m20883(12L);
            } else if (iM20877 != 3) {
                c9019.f24483 = jM208710;
            } else {
                int[] iArr = new int[2];
                c9019.m20880(iArr);
                c9019.m20880(iArr);
                this.f30561 = c9019.m20884();
                this.f30558 = c9019.m20884();
            }
            c9019.m20886();
            c9019.f24484 = j8;
            jM20879 = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C11702 m25426(long j, long j2) {
        return new C11702(this, j, j2 - j);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25428(C11031 c11031) throws IOException {
        if (c11031.f30562) {
            throw new IOException("Legacy state index is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C7479 c7479 = this.f30563;
        InterfaceC22097 interfaceC22097 = this.f30559;
        if (this.f30562) {
            return;
        }
        this.f30562 = true;
        try {
            try {
                this.f30550.close();
                C18743.delete(interfaceC22097);
                c7479.close();
            } catch (Throwable th) {
                C18743.delete(interfaceC22097);
                throw th;
            }
        } catch (Throwable th2) {
            c7479.close();
            throw th2;
        }
    }
}
