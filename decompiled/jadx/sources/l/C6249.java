package l;

import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۛᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6249 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5816 f19328;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5377 f19329;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final UUID f19330;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3280 f19331;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f19332;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f19333;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4691 f19334;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2931 f19335;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f19336;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19222 f19337;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f19338;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f19339;

    public C6249(C19222 c19222, C5816 c5816, C2931 c2931, C3280 c3280, C4691 c4691, long j, int i, UUID uuid, long j2, byte[] bArr, byte[] bArr2) {
        this.f19337 = c19222;
        this.f19328 = c5816;
        this.f19335 = c2931;
        this.f19331 = c3280;
        this.f19334 = c4691;
        this.f19336 = bArr;
        this.f19338 = bArr2;
        this.f19339 = j;
        this.f19332 = i;
        this.f19330 = uuid;
        this.f19333 = j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6249 m17214(C17371 c17371, InterfaceC20758 interfaceC20758, C1143 c1143, int i) {
        UUID uuidM40711;
        long jM40713;
        C11481 c11481M21144;
        long j;
        C12704 c12704M40714;
        synchronized (c17371) {
            uuidM40711 = c17371.m40711();
            jM40713 = c17371.m40713();
            try {
                c11481M21144 = C7869.m21144(uuidM40711, c17371.m40710());
                if (c11481M21144 == null) {
                    throw new IOException("Fragment recovery attachment is missing");
                }
                j = i;
                if (c11481M21144.m28305() > j) {
                    throw new IOException("Fragment state exceeds recovery limit");
                }
                c12704M40714 = c17371.m40714();
            } catch (IllegalStateException e) {
                throw new IOException("Invalid fragment recovery metadata", e);
            }
        }
        try {
            C5377 c5377M3921 = c1143.m3921(c11481M21144.m28305() + 32);
            try {
                InputStream inputStreamM28303 = c11481M21144.m28303(interfaceC20758, uuidM40711, j, c1143);
                try {
                    int iM28305 = (int) c11481M21144.m28305();
                    byte[] bArr = new byte[iM28305];
                    int i2 = 0;
                    while (i2 < iM28305) {
                        int i3 = inputStreamM28303.read(bArr, i2, iM28305 - i2);
                        if (i3 <= 0) {
                            throw new IOException("Truncated fragment recovery attachment");
                        }
                        i2 += i3;
                    }
                    if (inputStreamM28303.read() != -1) {
                        throw new IOException("Trailing fragment recovery attachment bytes");
                    }
                    C6249 c6249M17218 = m17218(bArr, i, c12704M40714);
                    try {
                        C6249 c6249M17213 = c6249M17218.m17213(uuidM40711, jM40713);
                        c6249M17218.close();
                        inputStreamM28303.close();
                        c5377M3921.close();
                        c12704M40714.close();
                        return c6249M17213;
                    } catch (Throwable th) {
                        try {
                            c6249M17218.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamM28303.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c5377M3921.close();
                throw th5;
            }
            try {
                c5377M3921.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        } catch (Throwable th7) {
            try {
                c12704M40714.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10483 m17221(C23721 c23721, C23077 c23077) {
        C10483 c10483;
        synchronized (c23721) {
            C12704 c12704M52357 = c23721.m52357();
            try {
                if (c12704M52357.m30979() != this.f19339 || c12704M52357.length() != this.f19332) {
                    throw new IllegalStateException("Migrated fragment text no longer matches");
                }
                c12704M52357.close();
                C6249 c6249M17213 = m17213(c23721.m52352(), c23721.m52371());
                try {
                    c10483 = new C10483(c6249M17213, c23077);
                } catch (Error e) {
                    e = e;
                    c6249M17213.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c6249M17213.close();
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    c12704M52357.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
        return c10483;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12599 m17216(C12704 c12704, Bundle bundle, C23077 c23077, C2931 c2931, byte[] bArr, byte[] bArr2, int i) throws Throwable {
        long jM21450 = 12;
        for (String str : bundle.keySet()) {
            if (str == null) {
                throw new IOException("Invalid fragment config key");
            }
            long jM21451 = C8083.m21450(str.length(), 2L, 5L, jM21450);
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                jM21450 = C8083.m21450(((String) obj).length(), 2L, 4L, jM21451);
            } else {
                if (obj instanceof Boolean) {
                    jM21451++;
                } else if (obj instanceof Integer) {
                    jM21451 += 4;
                } else if (obj instanceof Long) {
                    jM21451 += 8;
                } else if (obj != null) {
                    throw new IOException("Unsupported fragment config value");
                }
                jM21450 = jM21451;
            }
        }
        boolean z = false;
        long jM8942 = c2931.m8942() + 49 + jM21450 + ((long) (c23077 == null ? 0 : c23077.m51237(i))) + ((long) bArr.length) + ((long) bArr2.length);
        if (i < 48 || jM8942 > i || jM8942 > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C5377 c5377M30978 = c12704.m30978(C8083.m21450(bundle.size(), 128L, jM8942 + jM21450, 8192L));
        Long.signum(jM8942);
        try {
            C5377 c5377M30979 = c12704.m30978((jM8942 * 8) + 8192);
            try {
                C12599 c12599 = new C12599(m17219(c12704, bundle, c23077, c2931, bArr, bArr2, i), c5377M30978);
                if (c5377M30979 == null) {
                    return c12599;
                }
                try {
                    c5377M30979.close();
                    return c12599;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c5377M30978 != null) {
                        c5377M30978.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c5377M30979 == null) {
                    throw th2;
                }
                try {
                    c5377M30979.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
                c5377M30978.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m17219(C12704 c12704, Bundle bundle, C23077 c23077, C2931 c2931, byte[] bArr, byte[] bArr2, int i) throws IOException {
        if (i < 48 || bArr.length > i || bArr2.length > i) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        byte[] bArrM44356 = C19222.m44353(i, bundle).m44356(i);
        long jM51237 = ((long) (c23077 == null ? 0 : c23077.m51237(i))) + 1;
        long jM8942 = c2931.m8942();
        long length = ((long) bArrM44356.length) + 48 + jM51237 + jM8942 + ((long) bArr.length) + ((long) bArr2.length);
        if (length > i || length > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C3280.m10089(new ByteArrayInputStream(bArr), bArr.length, i);
        C4691.m13767(new ByteArrayInputStream(bArr2), bArr2.length, i);
        int i2 = (int) length;
        C10130 c10130 = new C10130(i2);
        c10130.writeInt(843469637);
        c10130.writeInt(1);
        c10130.writeInt(i2);
        c10130.m25431(c12704.m30979());
        c10130.writeInt(c12704.length());
        c10130.m25434(bArrM44356);
        c10130.writeInt((int) jM51237);
        c10130.m25425(c23077 != null);
        if (c23077 != null) {
            c23077.m51239(c10130);
        }
        c10130.writeInt((int) jM8942);
        c2931.m8947(c10130);
        c10130.m25434(bArr);
        c10130.m25434(bArr2);
        if (c10130.size() != length - 4) {
            throw new IllegalStateException("Fragment state changed while being captured");
        }
        byte[] bArrM25438 = c10130.m25438();
        int size = c10130.size();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM25438, 0, size);
        c10130.writeInt((int) crc32.getValue());
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6249 m17218(byte[] bArr, int i, C12704 c12704) throws Throwable {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C5377 c5377M30978 = c12704.m30978((((long) bArr.length) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        boolean z = false;
        try {
            C5377 c5377M30979 = c12704.m30978((((long) bArr.length) * 4) + 8192);
            try {
                C6249 c6249M17215 = m17215(bArr, i, c12704);
                c6249M17215.f19329 = c5377M30978;
                if (c5377M30979 == null) {
                    return c6249M17215;
                }
                try {
                    c5377M30979.close();
                    return c6249M17215;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c5377M30978 != null) {
                        c5377M30978.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c5377M30979 != null) {
                    try {
                        c5377M30979.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6249 m17215(byte[] bArr, int i, C12704 c12704) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C12951 c12951 = new C12951(bArr);
        c12951.seek(bArr.length - 4);
        int i2 = c12951.readInt();
        int length = bArr.length - 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, length);
        if (i2 != ((int) crc32.getValue())) {
            throw new IOException("Invalid fragment recovery state checksum");
        }
        c12951.seek(0L);
        if (c12951.readInt() != 843469637 || c12951.readInt() != 1 || c12951.readInt() != bArr.length) {
            throw new IOException("Unsupported fragment recovery state");
        }
        long j = c12951.readLong();
        int i3 = c12951.readInt();
        if (j != c12704.m30979() || i3 != c12704.length()) {
            throw new IOException("Fragment state belongs to another text revision");
        }
        byte[] bArrM17217 = m17217(c12951);
        byte[] bArrM17218 = m17217(c12951);
        byte[] bArrM17219 = m17217(c12951);
        byte[] bArrM172110 = m17217(c12951);
        byte[] bArrM172111 = m17217(c12951);
        if (c12951.available() != 4) {
            throw new IOException("Trailing fragment recovery state fields");
        }
        return new C6249(C19222.m44352(i, bArrM17217.length, new ByteArrayInputStream(bArrM17217)), C5816.m16316(i, bArrM17218.length, new ByteArrayInputStream(bArrM17218)), C2931.m8936(i, bArrM17219), C3280.m10089(new ByteArrayInputStream(bArrM172110), bArrM172110.length, i), C4691.m13767(new ByteArrayInputStream(bArrM172111), bArrM172111.length, i), j, i3, null, -1L, bArrM172110, bArrM172111);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12599 m17223(C12704 c12704, Bundle bundle, C23077 c23077, String str, int i, int i2, boolean z) throws IOException {
        C2931 c2931M8945 = this.f19335.m8945(i, i2, str);
        if (z) {
            c2931M8945 = C1310.m4546(bundle, c2931M8945, c12704.length());
        }
        return m17216(c12704, bundle, c23077, c2931M8945, this.f19336, this.f19338, 8388608);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12599 m17222(C12704 c12704, Bundle bundle, C23077 c23077) {
        return m17216(c12704, bundle, c23077, this.f19335, this.f19336, this.f19338, 8388608);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12599 m17224(C12704 c12704, Bundle bundle, C23077 c23077, String str, boolean z, int i) {
        C2931 c2931M8949 = this.f19335.m8949(str);
        if (z) {
            c2931M8949 = C1310.m4546(bundle, c2931M8949, c12704.length());
        }
        return m17216(c12704, bundle, c23077, c2931M8949, this.f19336, this.f19338, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10483 m17220() {
        if (this.f19330 == null) {
            throw new IllegalStateException("Fragment state is not bound to a recovery candidate");
        }
        try {
            return new C10483(this, this.f19328.m16317());
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17225(C23721 c23721) {
        synchronized (c23721) {
            UUID uuid = this.f19330;
            if (uuid == null || !uuid.equals(c23721.m52352()) || this.f19333 != c23721.m52371()) {
                throw new IllegalStateException("Fragment recovery candidate is no longer current");
            }
            C12704 c12704M52357 = c23721.m52357();
            try {
                if (c12704M52357.m30979() != this.f19339 || c12704M52357.length() != this.f19332) {
                    throw new IllegalStateException("Fragment recovery text no longer matches");
                }
                c12704M52357.close();
            } catch (Throwable th) {
                try {
                    c12704M52357.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6249 m17213(UUID uuid, long j) {
        C6249 c6249 = new C6249(this.f19337, this.f19328, this.f19335, this.f19331, this.f19334, this.f19339, this.f19332, uuid, j, this.f19336, this.f19338);
        c6249.f19329 = this.f19329;
        this.f19329 = null;
        this.f19337 = null;
        this.f19328 = null;
        this.f19335 = null;
        this.f19331 = null;
        this.f19334 = null;
        this.f19338 = null;
        this.f19336 = null;
        return c6249;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f19337 = null;
        this.f19328 = null;
        this.f19335 = null;
        this.f19331 = null;
        this.f19334 = null;
        this.f19338 = null;
        this.f19336 = null;
        C5377 c5377 = this.f19329;
        this.f19329 = null;
        if (c5377 != null) {
            c5377.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m17217(C12951 c12951) throws IOException {
        if (c12951.available() < 8) {
            throw new IOException("Missing fragment recovery field");
        }
        int i = c12951.readInt();
        if (i >= 0 && i <= c12951.available() - 4) {
            byte[] bArr = new byte[i];
            c12951.m31489(i, bArr);
            return bArr;
        }
        throw new IOException("Invalid fragment recovery field length");
    }
}
