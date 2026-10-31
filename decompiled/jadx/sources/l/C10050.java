package l;

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
public final class C10050 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12871 f30211 = InterfaceC12166.f36291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f30212;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f30213;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2764 f30214;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C18516 f30215;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f30216;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f30217;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f30218;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f30216) {
            return;
        }
        try {
            this.f30214.close();
            this.f30216 = true;
        } catch (Throwable th) {
            this.f30216 = true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25232() {
        if (this.f30216) {
            throw new IllegalStateException("App migration is closed");
        }
        this.f30214.m8527(new C22044(this));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m25233() {
        if (this.f30216) {
            throw new IllegalStateException("App migration is closed");
        }
        InterfaceC20758 interfaceC20758Resolve = this.f30212.resolve("app-adopted");
        if (!C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
            return false;
        }
        byte[] bArr = this.f30217;
        if (Arrays.equals(bArr, m25229(interfaceC20758Resolve, bArr.length))) {
            return true;
        }
        throw new IOException("Invalid app migration adoption record");
    }

    public C10050(InterfaceC20758 interfaceC20758, String str, C2764 c2764, byte[] bArr, C18516 c18516) {
        this.f30218 = interfaceC20758;
        this.f30213 = str;
        this.f30214 = c2764;
        this.f30212 = c2764.m8526();
        this.f30215 = c18516;
        this.f30217 = m25228(c2764.m8528(), bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10050 m25221(InterfaceC20758 interfaceC20758, String str, C1143 c1143) throws IOException {
        InterfaceC20758 interfaceC20758M25230 = m25230(str, interfaceC20758);
        C11003.requireNonNull(c1143);
        InterfaceC20758 parent = interfaceC20758M25230.getParent();
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isDirectory(parent, enumC14406)) {
            throw new IOException("Legacy state root is not a directory");
        }
        if (C17229.exists(interfaceC20758M25230.resolve("app-adopted"), enumC14406) && !C17229.exists(interfaceC20758M25230.resolve("current"), enumC14406)) {
            throw new IOException("Adopted app migration has no recovery entry");
        }
        byte[] bArrM25227 = m25227(str);
        C2764 c2764M43828 = C18992.m43828(interfaceC20758M25230, bArrM25227, c1143, new C21339(interfaceC20758M25230, parent, str, c1143));
        try {
            C10050 c10050 = new C10050(parent, str, c2764M43828, bArrM25227, (C18516) c2764M43828.m8525(new C23909(c2764M43828, c1143)));
            c10050.m25233();
            return c10050;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c2764M43828.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25226(InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC20759, String str, C1143 c1143, C4175 c4175) throws Throwable {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("legacy.scratch");
        if (C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
            m25231(interfaceC20758Resolve);
            C17229.delete(interfaceC20758Resolve);
        }
        byte[] bArrM25229 = m25229(interfaceC20759.resolve(str.concat(".lit")), 8388608);
        if (bArrM25229.length > 8388608) {
            throw new IOException("Legacy fragment config exceeds limit");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArrM25229, 0, bArrM25229.length);
                parcelObtain.setDataPosition(0);
                Bundle bundle = new Bundle();
                bundle.readFromParcel(parcelObtain);
                if (parcelObtain.dataPosition() != bArrM25229.length) {
                    throw new IOException("Trailing legacy fragment config bytes");
                }
                C19222 c19222M44353 = C19222.m44353(8388608, bundle);
                parcelObtain.recycle();
                InterfaceC20758 interfaceC20758Resolve2 = interfaceC20759.resolve(str.concat(".dat"));
                m25231(interfaceC20758Resolve2);
                C9114 c9114M23478 = C9114.m23478(C17229.newInputStream(interfaceC20758Resolve2, EnumC14406.NOFOLLOW_LINKS), interfaceC20758Resolve, c1143, 8388608);
                try {
                    c4175.m12622(c9114M23478, new C19928(str, interfaceC20759), c19222M44353.m44359(), c19222M44353.m44355(), new C4405(str, interfaceC20759), c19222M44353.m44356(8388608));
                    c9114M23478.close();
                } catch (Throwable th) {
                    try {
                        c9114M23478.close();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InterfaceC20758 m25222(String str, InterfaceC20758 interfaceC20758) throws IOException {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve(str.concat(".tat"));
        m25231(interfaceC20758Resolve);
        return interfaceC20758Resolve;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m25220(InterfaceC20758 interfaceC20758, String str, int i) throws IOException {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve(str + "-" + i + ".dat");
        m25231(interfaceC20758Resolve);
        return C17229.newInputStream(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m25230(String str, InterfaceC20758 interfaceC20758) {
        if (str.isEmpty() || str.equals(".") || str.equals("..") || str.indexOf(47) >= 0 || str.indexOf(92) >= 0 || str.indexOf(0) >= 0) {
            throw new IllegalArgumentException("Invalid legacy state name");
        }
        return interfaceC20758.toAbsolutePath().normalize().resolve(str.concat(".e2"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25223(C10050 c10050) {
        C18516 c18516 = c10050.f30215;
        String str = c10050.f30213;
        InterfaceC20758 interfaceC20758 = c10050.f30218;
        C12871 c12871 = c10050.f30211;
        InterfaceC20758 interfaceC20759 = c10050.f30212;
        InterfaceC20758 interfaceC20758Resolve = interfaceC20759.resolve("app-adopted");
        InterfaceC20758 interfaceC20758Resolve2 = interfaceC20759.resolve("app-adopted.tmp");
        if (c10050.m25233()) {
            c12871.getClass();
            C2994.m9132(interfaceC20758Resolve);
        } else {
            c12871.m31306(interfaceC20758Resolve2);
            C2994.m9133(interfaceC20758Resolve2, c10050.f30217);
            C17229.move(interfaceC20758Resolve2, interfaceC20758Resolve, EnumC2413.ATOMIC_MOVE, EnumC2413.REPLACE_EXISTING);
            if (!c10050.m25233()) {
                throw new IOException("App migration adoption record was not published");
            }
        }
        c12871.getClass();
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        interfaceC23015.mo28630(interfaceC20759);
        if (c18516.f57385.m44357()) {
            for (int i = 0; i < c18516.f57385.m44359(); i++) {
                c12871.m31306(interfaceC20758.resolve(str + "-" + i + ".dat"));
            }
        }
        c12871.m31306(interfaceC20758.resolve(str.concat(".tat")));
        c12871.m31306(interfaceC20758.resolve(str.concat(".dat")));
        c12871.m31306(interfaceC20758.resolve(str.concat(".lit")));
        interfaceC23015.mo28630(interfaceC20758);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25225(InterfaceC20758 interfaceC20758, String str, UUID uuid) throws IOException {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("app-adopted");
        if (C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS) && !Arrays.equals(m25228(uuid, m25227(str)), m25229(interfaceC20758Resolve, 64))) {
            throw new IOException("Invalid app migration adoption record");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25227(String str) {
        MessageDigest messageDigestM34534 = C14460.m34534();
        C14460.m34528(messageDigestM34534, "MT editable2 legacy state v1:");
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            messageDigestM34534.update((byte) cCharAt);
            messageDigestM34534.update((byte) (cCharAt >>> '\b'));
        }
        return messageDigestM34534.digest();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25228(UUID uuid, byte[] bArr) {
        C10130 c10130 = new C10130(64);
        c10130.writeInt(1295139137);
        c10130.writeInt(1);
        c10130.m25431(uuid.getMostSignificantBits());
        c10130.m25431(uuid.getLeastSignificantBits());
        c10130.write(bArr);
        c10130.writeInt(0);
        CRC32 crc32 = new CRC32();
        crc32.update(c10130.m25438(), 0, c10130.size());
        c10130.writeInt((int) crc32.getValue());
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25231(InterfaceC20758 interfaceC20758) throws IOException {
        if (C17229.isRegularFile(interfaceC20758, EnumC14406.NOFOLLOW_LINKS)) {
            return;
        }
        throw new IOException("Legacy state path is not a regular file: " + interfaceC20758.getFileName());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25229(InterfaceC20758 interfaceC20758, int i) throws IOException {
        m25231(interfaceC20758);
        long size = C17229.size(interfaceC20758);
        if (size > i) {
            throw new IOException("Legacy state file exceeds limit");
        }
        int i2 = (int) size;
        byte[] bArr = new byte[i2];
        m25231(interfaceC20758);
        int i3 = 0;
        InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20758, EnumC14406.NOFOLLOW_LINKS);
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
