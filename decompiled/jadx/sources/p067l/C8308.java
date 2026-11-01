package p067l;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۛᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C8308 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public C7896 f22192;

    /* JADX INFO: renamed from: ۙ */
    public C7479 f22193;

    /* JADX INFO: renamed from: ۛ */
    public final UUID f22194;

    /* JADX INFO: renamed from: ۤ */
    public C5486 f22195;

    /* JADX INFO: renamed from: ۨ */
    public final int f22196;

    /* JADX INFO: renamed from: ۫ */
    public final long f22197;

    /* JADX INFO: renamed from: ۬ */
    public C6827 f22198;

    /* JADX INFO: renamed from: ܰ */
    public C5154 f22199;

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f22200;

    /* JADX INFO: renamed from: ᩸ */
    public C20637 f22201;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f22202;

    /* JADX INFO: renamed from: ᩺ */
    public final long f22203;

    public C8308(C20637 c20637, C7896 c7896, C5154 c5154, C5486 c5486, C6827 c6827, long j, int i, UUID uuid, long j2, byte[] bArr, byte[] bArr2) {
        this.f22201 = c20637;
        this.f22192 = c7896;
        this.f22199 = c5154;
        this.f22195 = c5486;
        this.f22198 = c6827;
        this.f22200 = bArr;
        this.f22202 = bArr2;
        this.f22203 = j;
        this.f22196 = i;
        this.f22194 = uuid;
        this.f22197 = j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8308 m19152(C18878 c18878, InterfaceC22097 interfaceC22097, C3455 c3455, int i) {
        UUID uuidM42962;
        long jM42964;
        C13280 c13280M23109;
        long j;
        C14443 c14443M42965;
        synchronized (c18878) {
            uuidM42962 = c18878.m42962();
            jM42964 = c18878.m42964();
            try {
                c13280M23109 = C9847.m23109(uuidM42962, c18878.m42961());
                if (c13280M23109 == null) {
                    throw new IOException("Fragment recovery attachment is missing");
                }
                j = i;
                if (c13280M23109.m30349() > j) {
                    throw new IOException("Fragment state exceeds recovery limit");
                }
                c14443M42965 = c18878.m42965();
            } catch (IllegalStateException e) {
                throw new IOException("Invalid fragment recovery metadata", e);
            }
        }
        try {
            C7479 c7479M6162 = c3455.m6162(c13280M23109.m30349() + 32);
            try {
                InputStream inputStreamM30347 = c13280M23109.m30347(interfaceC22097, uuidM42962, j, c3455);
                try {
                    int iM30349 = (int) c13280M23109.m30349();
                    byte[] bArr = new byte[iM30349];
                    int i2 = 0;
                    while (i2 < iM30349) {
                        int i3 = inputStreamM30347.read(bArr, i2, iM30349 - i2);
                        if (i3 <= 0) {
                            throw new IOException("Truncated fragment recovery attachment");
                        }
                        i2 += i3;
                    }
                    if (inputStreamM30347.read() != -1) {
                        throw new IOException("Trailing fragment recovery attachment bytes");
                    }
                    C8308 c8308M19156 = m19156(bArr, i, c14443M42965);
                    try {
                        C8308 c8308M19151 = c8308M19156.m19151(uuidM42962, jM42964);
                        c8308M19156.close();
                        inputStreamM30347.close();
                        c7479M6162.close();
                        c14443M42965.close();
                        return c8308M19151;
                    } catch (Throwable th) {
                        try {
                            c8308M19156.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamM30347.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                c7479M6162.close();
                throw th5;
            }
            try {
                c7479M6162.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        } catch (Throwable th7) {
            try {
                c14443M42965.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12332 m19159(C24913 c24913, C24301 c24301) {
        C12332 c12332;
        synchronized (c24913) {
            C14443 c14443M54760 = c24913.m54760();
            try {
                if (c14443M54760.m33057() != this.f22203 || c14443M54760.length() != this.f22196) {
                    throw new IllegalStateException("Migrated fragment text no longer matches");
                }
                c14443M54760.close();
                C8308 c8308M19151 = m19151(c24913.m54755(), c24913.m54774());
                try {
                    c12332 = new C12332(c8308M19151, c24301);
                } catch (Error e) {
                    e = e;
                    c8308M19151.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    c8308M19151.close();
                    throw e;
                }
            } catch (Throwable th) {
                try {
                    c14443M54760.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
        return c12332;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14343 m19154(C14443 c14443, Bundle bundle, C24301 c24301, C5154 c5154, byte[] bArr, byte[] bArr2, int i) throws Throwable {
        long jM23418 = 12;
        for (String str : bundle.keySet()) {
            if (str == null) {
                throw new IOException("Invalid fragment config key");
            }
            long jM23419 = C10050.m23418(str.length(), 2L, 5L, jM23418);
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                jM23418 = C10050.m23418(((String) obj).length(), 2L, 4L, jM23419);
            } else {
                if (obj instanceof Boolean) {
                    jM23419++;
                } else if (obj instanceof Integer) {
                    jM23419 += 4;
                } else if (obj instanceof Long) {
                    jM23419 += 8;
                } else if (obj != null) {
                    throw new IOException("Unsupported fragment config value");
                }
                jM23418 = jM23419;
            }
        }
        boolean z = false;
        long jM11010 = c5154.m11010() + 49 + jM23418 + ((long) (c24301 == null ? 0 : c24301.m53630(i))) + ((long) bArr.length) + ((long) bArr2.length);
        if (i < 48 || jM11010 > i || jM11010 > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C7479 c7479M33056 = c14443.m33056(C10050.m23418(bundle.size(), 128L, jM11010 + jM23418, 8192L));
        Long.signum(jM11010);
        try {
            C7479 c7479M33057 = c14443.m33056((jM11010 * 8) + 8192);
            try {
                C14343 c14343 = new C14343(m19157(c14443, bundle, c24301, c5154, bArr, bArr2, i), c7479M33056);
                if (c7479M33057 == null) {
                    return c14343;
                }
                try {
                    c7479M33057.close();
                    return c14343;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c7479M33056 != null) {
                        c7479M33056.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c7479M33057 == null) {
                    throw th2;
                }
                try {
                    c7479M33057.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z) {
                c7479M33056.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m19157(C14443 c14443, Bundle bundle, C24301 c24301, C5154 c5154, byte[] bArr, byte[] bArr2, int i) throws IOException {
        if (i < 48 || bArr.length > i || bArr2.length > i) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        byte[] bArrM46650 = C20637.m46647(i, bundle).m46650(i);
        long jM53630 = ((long) (c24301 == null ? 0 : c24301.m53630(i))) + 1;
        long jM11010 = c5154.m11010();
        long length = ((long) bArrM46650.length) + 48 + jM53630 + jM11010 + ((long) bArr.length) + ((long) bArr2.length);
        if (length > i || length > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C5486.m12122(new ByteArrayInputStream(bArr), bArr.length, i);
        C6827.m15642(new ByteArrayInputStream(bArr2), bArr2.length, i);
        int i2 = (int) length;
        C11996 c11996 = new C11996(i2);
        c11996.writeInt(843469637);
        c11996.writeInt(1);
        c11996.writeInt(i2);
        c11996.m27451(c14443.m33057());
        c11996.writeInt(c14443.length());
        c11996.m27454(bArrM46650);
        c11996.writeInt((int) jM53630);
        c11996.m27445(c24301 != null);
        if (c24301 != null) {
            c24301.m53632(c11996);
        }
        c11996.writeInt((int) jM11010);
        c5154.m11015(c11996);
        c11996.m27454(bArr);
        c11996.m27454(bArr2);
        if (c11996.size() != length - 4) {
            throw new IllegalStateException("Fragment state changed while being captured");
        }
        byte[] bArrM27458 = c11996.m27458();
        int size = c11996.size();
        CRC32 crc32 = new CRC32();
        crc32.update(bArrM27458, 0, size);
        c11996.writeInt((int) crc32.getValue());
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C8308 m19156(byte[] bArr, int i, C14443 c14443) throws Throwable {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C7479 c7479M33056 = c14443.m33056((((long) bArr.length) * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        boolean z = false;
        try {
            C7479 c7479M33057 = c14443.m33056((((long) bArr.length) * 4) + 8192);
            try {
                C8308 c8308M19153 = m19153(bArr, i, c14443);
                c8308M19153.f22193 = c7479M33056;
                if (c7479M33057 == null) {
                    return c8308M19153;
                }
                try {
                    c7479M33057.close();
                    return c8308M19153;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && c7479M33056 != null) {
                        c7479M33056.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (c7479M33057 != null) {
                    try {
                        c7479M33057.close();
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

    /* JADX INFO: renamed from: ֫ */
    public static C8308 m19153(byte[] bArr, int i, C14443 c14443) throws IOException {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C14677 c14677 = new C14677(bArr);
        c14677.seek(bArr.length - 4);
        int i2 = c14677.readInt();
        int length = bArr.length - 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, length);
        if (i2 != ((int) crc32.getValue())) {
            throw new IOException("Invalid fragment recovery state checksum");
        }
        c14677.seek(0L);
        if (c14677.readInt() != 843469637 || c14677.readInt() != 1 || c14677.readInt() != bArr.length) {
            throw new IOException("Unsupported fragment recovery state");
        }
        long j = c14677.readLong();
        int i3 = c14677.readInt();
        if (j != c14443.m33057() || i3 != c14443.length()) {
            throw new IOException("Fragment state belongs to another text revision");
        }
        byte[] bArrM19155 = m19155(c14677);
        byte[] bArrM19156 = m19155(c14677);
        byte[] bArrM19157 = m19155(c14677);
        byte[] bArrM19158 = m19155(c14677);
        byte[] bArrM19159 = m19155(c14677);
        if (c14677.available() != 4) {
            throw new IOException("Trailing fragment recovery state fields");
        }
        return new C8308(C20637.m46646(i, bArrM19155.length, new ByteArrayInputStream(bArrM19155)), C7896.m18241(i, bArrM19156.length, new ByteArrayInputStream(bArrM19156)), C5154.m11004(i, bArrM19157), C5486.m12122(new ByteArrayInputStream(bArrM19158), bArrM19158.length, i), C6827.m15642(new ByteArrayInputStream(bArrM19159), bArrM19159.length, i), j, i3, null, -1L, bArrM19158, bArrM19159);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14343 m19161(C14443 c14443, Bundle bundle, C24301 c24301, String str, int i, int i2, boolean z) throws IOException {
        C5154 c5154M11013 = this.f22199.m11013(i, i2, str);
        if (z) {
            c5154M11013 = C3614.m6778(bundle, c5154M11013, c14443.length());
        }
        return m19154(c14443, bundle, c24301, c5154M11013, this.f22200, this.f22202, 8388608);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14343 m19160(C14443 c14443, Bundle bundle, C24301 c24301) {
        return m19154(c14443, bundle, c24301, this.f22199, this.f22200, this.f22202, 8388608);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14343 m19162(C14443 c14443, Bundle bundle, C24301 c24301, String str, boolean z, int i) {
        C5154 c5154M11017 = this.f22199.m11017(str);
        if (z) {
            c5154M11017 = C3614.m6778(bundle, c5154M11017, c14443.length());
        }
        return m19154(c14443, bundle, c24301, c5154M11017, this.f22200, this.f22202, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12332 m19158() {
        if (this.f22194 == null) {
            throw new IllegalStateException("Fragment state is not bound to a recovery candidate");
        }
        try {
            return new C12332(this, this.f22192.m18242());
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19163(C24913 c24913) {
        synchronized (c24913) {
            UUID uuid = this.f22194;
            if (uuid == null || !uuid.equals(c24913.m54755()) || this.f22197 != c24913.m54774()) {
                throw new IllegalStateException("Fragment recovery candidate is no longer current");
            }
            C14443 c14443M54760 = c24913.m54760();
            try {
                if (c14443M54760.m33057() != this.f22203 || c14443M54760.length() != this.f22196) {
                    throw new IllegalStateException("Fragment recovery text no longer matches");
                }
                c14443M54760.close();
            } catch (Throwable th) {
                try {
                    c14443M54760.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C8308 m19151(UUID uuid, long j) {
        C8308 c8308 = new C8308(this.f22201, this.f22192, this.f22199, this.f22195, this.f22198, this.f22203, this.f22196, uuid, j, this.f22200, this.f22202);
        c8308.f22193 = this.f22193;
        this.f22193 = null;
        this.f22201 = null;
        this.f22192 = null;
        this.f22199 = null;
        this.f22195 = null;
        this.f22198 = null;
        this.f22202 = null;
        this.f22200 = null;
        return c8308;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f22201 = null;
        this.f22192 = null;
        this.f22199 = null;
        this.f22195 = null;
        this.f22198 = null;
        this.f22202 = null;
        this.f22200 = null;
        C7479 c7479 = this.f22193;
        this.f22193 = null;
        if (c7479 != null) {
            c7479.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m19155(C14677 c14677) throws IOException {
        if (c14677.available() < 8) {
            throw new IOException("Missing fragment recovery field");
        }
        int i = c14677.readInt();
        if (i >= 0 && i <= c14677.available() - 4) {
            byte[] bArr = new byte[i];
            c14677.m33576(i, bArr);
            return bArr;
        }
        throw new IOException("Invalid fragment recovery field length");
    }
}
