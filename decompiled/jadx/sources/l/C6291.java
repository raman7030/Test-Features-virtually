package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۛ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6S5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6291 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12641 m17329(InterfaceC20758 interfaceC20758, UUID uuid, InputStream inputStream, long j, C1143 c1143, InterfaceC23015 interfaceC23015) {
        long j2 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("Invalid migration state length");
        }
        C5377 c5377M3921 = c1143.m3921(16384L);
        try {
            int i = 0;
            FileChannel fileChannelOpen = C12084.open(interfaceC20758.resolve("migration-state.bin"), EnumC3824.CREATE_NEW, EnumC3824.WRITE);
            try {
                C10130 c10130 = new C10130(32);
                c10130.writeInt(1295143764);
                c10130.writeInt(1);
                c10130.m25431(uuid.getMostSignificantBits());
                c10130.m25431(uuid.getLeastSignificantBits());
                c10130.m25431(j);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(c10130.m25438(), 0, c10130.size());
                do {
                    String str = "Migration state write made no progress";
                    if (!byteBufferWrap.hasRemaining()) {
                        int i2 = 8192;
                        byte[] bArr = new byte[8192];
                        MessageDigest messageDigestM34534 = C14460.m34534();
                        long j3 = j;
                        while (j3 != j2) {
                            int i3 = inputStream.read(bArr, i, (int) Math.min(j3, i2));
                            if (i3 > 0) {
                                String str2 = str;
                                long j4 = i3;
                                if (j4 <= j3) {
                                    ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, i3);
                                    while (byteBufferWrap2.hasRemaining()) {
                                        if (fileChannelOpen.write(byteBufferWrap2) <= 0) {
                                            throw new IOException(str2);
                                        }
                                    }
                                    messageDigestM34534.update(bArr, 0, i3);
                                    j3 -= j4;
                                    j2 = 0;
                                    str = str2;
                                    i2 = 8192;
                                    i = 0;
                                }
                            }
                            throw new EOFException("Truncated or stalled migration state input");
                        }
                        if (inputStream.read() != -1) {
                            throw new IOException("Trailing bytes in migration state input");
                        }
                        interfaceC23015.mo28629(fileChannelOpen);
                        interfaceC23015.mo28630(interfaceC20758);
                        C12641 c12641 = new C12641(uuid, j, messageDigestM34534.digest(), new byte[0]);
                        fileChannelOpen.close();
                        c5377M3921.close();
                        return c12641;
                    }
                } while (fileChannelOpen.write(byteBufferWrap) > 0);
                throw new IOException("Migration state write made no progress");
            } catch (Throwable th) {
                if (fileChannelOpen == null) {
                    throw th;
                }
                try {
                    fileChannelOpen.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c5377M3921.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m17328(InterfaceC20758 interfaceC20758, C12641 c12641, C1143 c1143, InterfaceC23015 interfaceC23015) throws IOException {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("migration-state.bin");
        if (!C17229.isRegularFile(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state is not a regular file");
        }
        FileChannel fileChannelOpen = interfaceC23015 == null ? C12084.open(interfaceC20758Resolve, EnumC3824.READ) : C12084.open(interfaceC20758Resolve, EnumC3824.READ, EnumC3824.WRITE);
        try {
            C5377 c5377M3921 = c1143.m3921(16384L);
            try {
                long size = fileChannelOpen.size();
                long j = c12641.f38086;
                if (size != j + 32) {
                    throw new IOException("Migration state length does not match commit");
                }
                int i = 8192;
                byte[] bArr = new byte[8192];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 32);
                do {
                    if (!byteBufferWrap.hasRemaining()) {
                        C12951 c12951 = new C12951(bArr);
                        if (c12951.readInt() != 1295143764 || c12951.readInt() != 1 || !new UUID(c12951.readLong(), c12951.readLong()).equals(c12641.f38084) || c12951.readLong() != j) {
                            throw new IOException("Migration state identity does not match commit");
                        }
                        MessageDigest messageDigestM34534 = C14460.m34534();
                        long j2 = j;
                        while (j2 != 0) {
                            int iMin = (int) Math.min(j2, i);
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
                            while (byteBufferWrap2.hasRemaining()) {
                                if (fileChannelOpen.read(byteBufferWrap2) <= 0) {
                                    throw new EOFException("Truncated migration state file");
                                }
                            }
                            messageDigestM34534.update(bArr, 0, iMin);
                            j2 -= (long) iMin;
                            i = 8192;
                        }
                        if (!Arrays.equals(c12641.f38085, messageDigestM34534.digest()) || fileChannelOpen.size() != j + 32) {
                            throw new IOException("Migration state checksum does not match commit");
                        }
                        if (interfaceC23015 != null) {
                            interfaceC23015.mo28629(fileChannelOpen);
                        }
                        c5377M3921.close();
                        fileChannelOpen.position(32L);
                        return new C10525(c12641, fileChannelOpen);
                    }
                } while (fileChannelOpen.read(byteBufferWrap) > 0);
                throw new EOFException("Truncated migration state file");
            } catch (Throwable th) {
                try {
                    c5377M3921.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            fileChannelOpen.close();
            throw th3;
        }
    }
}
