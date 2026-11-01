package p067l;

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
public final class C8348 {
    /* JADX INFO: renamed from: ֫ */
    public static C14383 m19268(InterfaceC22097 interfaceC22097, UUID uuid, InputStream inputStream, long j, C3455 c3455, InterfaceC24242 interfaceC24242) {
        long j2 = 0;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("Invalid migration state length");
        }
        C7479 c7479M6162 = c3455.m6162(16384L);
        try {
            int i = 0;
            FileChannel fileChannelOpen = C13853.open(interfaceC22097.resolve("migration-state.bin"), EnumC6003.CREATE_NEW, EnumC6003.WRITE);
            try {
                C11996 c11996 = new C11996(32);
                c11996.writeInt(1295143764);
                c11996.writeInt(1);
                c11996.m27451(uuid.getMostSignificantBits());
                c11996.m27451(uuid.getLeastSignificantBits());
                c11996.m27451(j);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(c11996.m27458(), 0, c11996.size());
                do {
                    String str = "Migration state write made no progress";
                    if (!byteBufferWrap.hasRemaining()) {
                        int i2 = 8192;
                        byte[] bArr = new byte[8192];
                        MessageDigest messageDigestM36668 = C16111.m36668();
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
                                    messageDigestM36668.update(bArr, 0, i3);
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
                        interfaceC24242.mo30677(fileChannelOpen);
                        interfaceC24242.mo30678(interfaceC22097);
                        C14383 c14383 = new C14383(uuid, j, messageDigestM36668.digest(), new byte[0]);
                        fileChannelOpen.close();
                        c7479M6162.close();
                        return c14383;
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
                c7479M6162.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m19267(InterfaceC22097 interfaceC22097, C14383 c14383, C3455 c3455, InterfaceC24242 interfaceC24242) throws IOException {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("migration-state.bin");
        if (!C18743.isRegularFile(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state is not a regular file");
        }
        FileChannel fileChannelOpen = interfaceC24242 == null ? C13853.open(interfaceC22097Resolve, EnumC6003.READ) : C13853.open(interfaceC22097Resolve, EnumC6003.READ, EnumC6003.WRITE);
        try {
            C7479 c7479M6162 = c3455.m6162(16384L);
            try {
                long size = fileChannelOpen.size();
                long j = c14383.f41112;
                if (size != j + 32) {
                    throw new IOException("Migration state length does not match commit");
                }
                int i = 8192;
                byte[] bArr = new byte[8192];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 32);
                do {
                    if (!byteBufferWrap.hasRemaining()) {
                        C14677 c14677 = new C14677(bArr);
                        if (c14677.readInt() != 1295143764 || c14677.readInt() != 1 || !new UUID(c14677.readLong(), c14677.readLong()).equals(c14383.f41110) || c14677.readLong() != j) {
                            throw new IOException("Migration state identity does not match commit");
                        }
                        MessageDigest messageDigestM36668 = C16111.m36668();
                        long j2 = j;
                        while (j2 != 0) {
                            int iMin = (int) Math.min(j2, i);
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
                            while (byteBufferWrap2.hasRemaining()) {
                                if (fileChannelOpen.read(byteBufferWrap2) <= 0) {
                                    throw new EOFException("Truncated migration state file");
                                }
                            }
                            messageDigestM36668.update(bArr, 0, iMin);
                            j2 -= (long) iMin;
                            i = 8192;
                        }
                        if (!Arrays.equals(c14383.f41111, messageDigestM36668.digest()) || fileChannelOpen.size() != j + 32) {
                            throw new IOException("Migration state checksum does not match commit");
                        }
                        if (interfaceC24242 != null) {
                            interfaceC24242.mo30677(fileChannelOpen);
                        }
                        c7479M6162.close();
                        fileChannelOpen.position(32L);
                        return new C12372(c14383, fileChannelOpen);
                    }
                } while (fileChannelOpen.read(byteBufferWrap) > 0);
                throw new EOFException("Truncated migration state file");
            } catch (Throwable th) {
                try {
                    c7479M6162.close();
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
