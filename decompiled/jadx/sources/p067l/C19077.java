package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6SW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19077 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C7479 f56921;

    /* JADX INFO: renamed from: ۙ */
    public final long f56922;

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f56923;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f56924;

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f56925;

    public C19077(ArrayList arrayList, int i, int i2, C7479 c7479) {
        this.f56925 = arrayList;
        this.f56921 = c7479;
        C11996 c11996 = new C11996(20);
        c11996.writeInt(1295139155);
        c11996.writeInt(i2 < 0 ? 1 : 2);
        c11996.writeInt(i);
        if (i2 >= 0) {
            c11996.writeInt(i2);
        }
        c11996.writeInt(arrayList.size());
        byte[] bArrM27464 = c11996.m27464();
        this.f56923 = bArrM27464;
        long length = bArrM27464.length;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18406 c18406 = (C18406) it.next();
            C11702 c11702 = c18406.f54961;
            length += (c11702 == null ? c18406.f54960.length : c11702.m26908()) + 12;
        }
        if (length > 2147483647L) {
            throw new IllegalArgumentException("Legacy app state exceeds size limit");
        }
        this.f56922 = length;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19077 m43349(C11031 c11031, int i, int i2, byte[] bArr, C3455 c3455) {
        if (i2 < 0 || ((long) i) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid legacy page length");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy page prefix");
        }
        C7479 c7479M6162 = c3455.m6162(((long) (bArr == null ? 0 : bArr.length)) + 16384);
        try {
            return m43350(c11031, i, i2, bArr, c7479M6162);
        } catch (Error | RuntimeException e) {
            c7479M6162.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19077 m43350(C11031 c11031, int i, int i2, byte[] bArr, C7479 c7479) {
        C11702 c11702M25430;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C18406(256, c11031.m25433()));
        for (int i3 = 1; i3 < 255; i3++) {
            if (i3 != 3 && (c11702M25430 = c11031.m25430(i3)) != null) {
                arrayList.add(new C18406(i3, c11702M25430));
            }
        }
        if (c11031.m25429() != null) {
            arrayList.add(new C18406(259, c11031.m25429()));
        }
        if (c11031.m25434() != null) {
            arrayList.add(new C18406(260, c11031.m25434()));
        }
        arrayList.add(new C18406(257, c11031.m25432()));
        arrayList.add(new C18406(258, c11031.m25431()));
        if (bArr != null) {
            arrayList.add(new C18406((byte[]) bArr.clone()));
        }
        return new C19077(arrayList, i, i2, c7479);
    }

    public final long length() {
        return this.f56922;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m43355() {
        if (this.f56924) {
            throw new IllegalStateException("Legacy app state source is closed");
        }
        return new C4325(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43351(InputStream inputStream, long j, C3455 c3455, InterfaceC19748 interfaceC19748) throws Throwable {
        try {
            C7479 c7479M6162 = c3455.m6162(16384L);
            try {
                if (j >= 16) {
                    try {
                        if (j <= 2147483647L) {
                            try {
                                C13043 c13043 = new C13043(j, inputStream);
                                if (c13043.m29857() != 1295139155) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int iM29857 = c13043.m29857();
                                int i = 1;
                                if (iM29857 != 1 && iM29857 != 2) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int iM29858 = c13043.m29857();
                                int iM29859 = iM29857 == 2 ? c13043.m29857() : -1;
                                int iM298510 = c13043.m29857();
                                if (iM29858 >= 0) {
                                    int i2 = 3;
                                    if (iM298510 >= 3 && iM298510 <= 259 && ((long) iM298510) * 12 <= c13043.f36675) {
                                        if (iM29857 == 2 && (iM29859 < 0 || ((long) iM29858) + ((long) iM29859) > 2147483647L)) {
                                            throw new IOException("Invalid legacy app page range");
                                        }
                                        interfaceC19748.mo13231(iM29858, iM29859);
                                        boolean[] zArr = new boolean[262];
                                        byte[] bArr = new byte[8192];
                                        int i3 = 0;
                                        while (i3 < iM298510) {
                                            int iM298511 = c13043.m29857();
                                            int i4 = i3;
                                            long j2 = c13043.m29858(8).readLong();
                                            if (iM298511 < i || iM298511 > 261 || iM298511 == i2 || iM298511 == 255 || zArr[iM298511] || j2 < 0 || j2 > c13043.f36675) {
                                                throw new IOException("Invalid legacy app state field");
                                            }
                                            zArr[iM298511] = true;
                                            C13043 c13044 = new C13043(j2, c13043);
                                            try {
                                                interfaceC19748.mo13232(iM298511, j2, c13044);
                                                c13044.f36676 = false;
                                                for (long j3 = c13044.f36675; j3 != 0; j3 -= (long) c13043.read(bArr, 0, (int) Math.min(j3, 8192))) {
                                                }
                                                i3 = i4 + 1;
                                                i = 1;
                                                i2 = 3;
                                            } catch (Throwable th) {
                                                c13044.f36676 = false;
                                                throw th;
                                            }
                                        }
                                        if (!zArr[256] || !zArr[257] || !zArr[258] || c13043.f36675 != 0 || inputStream.read() != -1) {
                                            throw new IOException("Incomplete or trailing legacy app state fields");
                                        }
                                        c7479M6162.close();
                                        inputStream.close();
                                        return;
                                    }
                                }
                                throw new IOException("Invalid legacy app state header");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            Throwable th3 = th;
                            try {
                                c7479M6162.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            inputStream.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                }
                throw new IOException("Invalid legacy app state length");
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f56924) {
            return;
        }
        this.f56924 = true;
        this.f56921.close();
    }
}
