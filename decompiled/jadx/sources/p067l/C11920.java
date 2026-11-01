package p067l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۤۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11920 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C14601 f33169 = InterfaceC13931.f39302;

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22097 f33170;

    /* JADX INFO: renamed from: ۤ */
    public final String f33171;

    /* JADX INFO: renamed from: ۫ */
    public final C4996 f33172;

    /* JADX INFO: renamed from: ۬ */
    public final C19966 f33173;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f33174;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f33175;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC22097 f33176;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f33174) {
            return;
        }
        try {
            this.f33172.close();
            this.f33174 = true;
        } catch (Throwable th) {
            this.f33174 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m27249() {
        if (this.f33174) {
            throw new IllegalStateException("App migration is closed");
        }
        this.f33172.m10575(new C23319(this));
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized boolean m27250() {
        if (this.f33174) {
            throw new IllegalStateException("App migration is closed");
        }
        InterfaceC22097 interfaceC22097Resolve = this.f33170.resolve("app-adopted");
        if (!C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
            return false;
        }
        byte[] bArr = this.f33175;
        if (Arrays.equals(bArr, m27246(interfaceC22097Resolve, bArr.length))) {
            return true;
        }
        throw new IOException("Invalid app migration adoption record");
    }

    public C11920(InterfaceC22097 interfaceC22097, String str, C4996 c4996, byte[] bArr, C19966 c19966) {
        this.f33176 = interfaceC22097;
        this.f33171 = str;
        this.f33172 = c4996;
        this.f33170 = c4996.m10574();
        this.f33173 = c19966;
        this.f33175 = m27245(c4996.m10576(), bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11920 m27238(InterfaceC22097 interfaceC22097, String str, C3455 c3455) throws IOException {
        InterfaceC22097 interfaceC22097M27247 = m27247(str, interfaceC22097);
        C12826.requireNonNull(c3455);
        InterfaceC22097 parent = interfaceC22097M27247.getParent();
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (!C18743.isDirectory(parent, enumC16060)) {
            throw new IOException("Legacy state root is not a directory");
        }
        if (C18743.exists(interfaceC22097M27247.resolve("app-adopted"), enumC16060) && !C18743.exists(interfaceC22097M27247.resolve("current"), enumC16060)) {
            throw new IOException("Adopted app migration has no recovery entry");
        }
        byte[] bArrM27244 = m27244(str);
        C4996 c4996M46096 = C20419.m46096(interfaceC22097M27247, bArrM27244, c3455, new C22649(interfaceC22097M27247, parent, str, c3455));
        try {
            C11920 c11920 = new C11920(parent, str, c4996M46096, bArrM27244, (C19966) c4996M46096.m10573(new C25092(c4996M46096, c3455)));
            c11920.m27250();
            return c11920;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c4996M46096.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27243(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098, String str, C3455 c3455, C6337 c6337) throws Throwable {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("legacy.scratch");
        if (C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
            m27248(interfaceC22097Resolve);
            C18743.delete(interfaceC22097Resolve);
        }
        byte[] bArrM27246 = m27246(interfaceC22098.resolve(str.concat(".lit")), 8388608);
        if (bArrM27246.length > 8388608) {
            throw new IOException("Legacy fragment config exceeds limit");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArrM27246, 0, bArrM27246.length);
                parcelObtain.setDataPosition(0);
                Bundle bundle = new Bundle();
                bundle.readFromParcel(parcelObtain);
                if (parcelObtain.dataPosition() != bArrM27246.length) {
                    throw new IOException("Trailing legacy fragment config bytes");
                }
                C20637 c20637M46647 = C20637.m46647(8388608, bundle);
                parcelObtain.recycle();
                InterfaceC22097 interfaceC22097Resolve2 = interfaceC22098.resolve(str.concat(".dat"));
                m27248(interfaceC22097Resolve2);
                C11031 c11031M25425 = C11031.m25425(C18743.newInputStream(interfaceC22097Resolve2, EnumC16060.NOFOLLOW_LINKS), interfaceC22097Resolve, c3455, 8388608);
                try {
                    c6337.m14497(c11031M25425, new C21308(str, interfaceC22098), c20637M46647.m46653(), c20637M46647.m46649(), new C6555(str, interfaceC22098), c20637M46647.m46650(8388608));
                    c11031M25425.close();
                } catch (Throwable th) {
                    try {
                        c11031M25425.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RuntimeException e) {
                throw new IOException("Invalid legacy fragment parcel", e);
            }
        } catch (Throwable th3) {
            parcelObtain.recycle();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ InterfaceC22097 m27239(String str, InterfaceC22097 interfaceC22097) throws IOException {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve(str.concat(".tat"));
        m27248(interfaceC22097Resolve);
        return interfaceC22097Resolve;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m27237(InterfaceC22097 interfaceC22097, String str, int i) throws IOException {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve(str + "-" + i + ".dat");
        m27248(interfaceC22097Resolve);
        return C18743.newInputStream(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC22097 m27247(String str, InterfaceC22097 interfaceC22097) {
        if (str.isEmpty() || str.equals(".") || str.equals("..") || str.indexOf(47) >= 0 || str.indexOf(92) >= 0 || str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("Invalid legacy state name");
        }
        return interfaceC22097.toAbsolutePath().normalize().resolve(str.concat(".e2"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27240(C11920 c11920) {
        C19966 c19966 = c11920.f33173;
        String str = c11920.f33171;
        InterfaceC22097 interfaceC22097 = c11920.f33176;
        C14601 c14601 = c11920.f33169;
        InterfaceC22097 interfaceC22098 = c11920.f33170;
        InterfaceC22097 interfaceC22097Resolve = interfaceC22098.resolve("app-adopted");
        InterfaceC22097 interfaceC22097Resolve2 = interfaceC22098.resolve("app-adopted.tmp");
        if (c11920.m27250()) {
            c14601.getClass();
            C5214.m11183(interfaceC22097Resolve);
        } else {
            c14601.m33392(interfaceC22097Resolve2);
            C5214.m11184(interfaceC22097Resolve2, c11920.f33175);
            C18743.move(interfaceC22097Resolve2, interfaceC22097Resolve, EnumC4662.ATOMIC_MOVE, EnumC4662.REPLACE_EXISTING);
            if (!c11920.m27250()) {
                throw new IOException("App migration adoption record was not published");
            }
        }
        c14601.getClass();
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        interfaceC24242.mo30678(interfaceC22098);
        if (c19966.f60606.m46651()) {
            for (int i = 0; i < c19966.f60606.m46653(); i++) {
                c14601.m33392(interfaceC22097.resolve(str + "-" + i + ".dat"));
            }
        }
        c14601.m33392(interfaceC22097.resolve(str.concat(".tat")));
        c14601.m33392(interfaceC22097.resolve(str.concat(".dat")));
        c14601.m33392(interfaceC22097.resolve(str.concat(".lit")));
        interfaceC24242.mo30678(interfaceC22097);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27242(InterfaceC22097 interfaceC22097, String str, UUID uuid) throws IOException {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("app-adopted");
        if (C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS) && !Arrays.equals(m27245(uuid, m27244(str)), m27246(interfaceC22097Resolve, 64))) {
            throw new IOException("Invalid app migration adoption record");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27244(String str) {
        MessageDigest messageDigestM36668 = C16111.m36668();
        C16111.m36662(messageDigestM36668, "MT editable2 legacy state v1:");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            messageDigestM36668.update((byte) cCharAt);
            messageDigestM36668.update((byte) (cCharAt >>> '\b'));
        }
        return messageDigestM36668.digest();
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27245(UUID uuid, byte[] bArr) {
        C11996 c11996 = new C11996(64);
        c11996.writeInt(1295139137);
        c11996.writeInt(1);
        c11996.m27451(uuid.getMostSignificantBits());
        c11996.m27451(uuid.getLeastSignificantBits());
        c11996.write(bArr);
        c11996.writeInt(0);
        CRC32 crc32 = new CRC32();
        crc32.update(c11996.m27458(), 0, c11996.size());
        c11996.writeInt((int) crc32.getValue());
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27248(InterfaceC22097 interfaceC22097) throws IOException {
        if (C18743.isRegularFile(interfaceC22097, EnumC16060.NOFOLLOW_LINKS)) {
            return;
        }
        throw new IOException("Legacy state path is not a regular file: " + interfaceC22097.getFileName());
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27246(InterfaceC22097 interfaceC22097, int i) throws IOException {
        m27248(interfaceC22097);
        long size = C18743.size(interfaceC22097);
        if (size > i) {
            throw new IOException("Legacy state file exceeds limit");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        m27248(interfaceC22097);
        int i3 = 0;
        InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22097, EnumC16060.NOFOLLOW_LINKS);
        while (i3 < i2) {
            try {
                int i4 = inputStreamNewInputStream.read(bArr, i3, i2 - i3);
                if (i4 <= 0) {
                    throw new IOException("Legacy state file was truncated");
                }
                i3 += i4;
            } catch (Throwable th) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (inputStreamNewInputStream.read() != -1) {
            throw new IOException("Legacy state file changed during reading");
        }
        inputStreamNewInputStream.close();
        return bArr;
    }
}
