package p067l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۨۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C13280 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f37285;

    /* JADX INFO: renamed from: ۧ */
    public final long f37286;

    /* JADX INFO: renamed from: ܽ */
    public final UUID f37287;

    /* JADX INFO: renamed from: ᩳ */
    public final UUID f37288;

    public C13280(UUID uuid, UUID uuid2, long j, byte[] bArr) {
        this.f37288 = uuid;
        this.f37287 = uuid2;
        this.f37286 = j;
        this.f37285 = bArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final UUID m30350() {
        return this.f37288;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m30349() {
        return this.f37286;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m30348() {
        C11996 c11996 = new C11996(84);
        c11996.writeInt(843142226);
        c11996.writeInt(1);
        UUID uuid = this.f37288;
        c11996.m27451(uuid.getMostSignificantBits());
        c11996.m27451(uuid.getLeastSignificantBits());
        UUID uuid2 = this.f37287;
        c11996.m27451(uuid2.getMostSignificantBits());
        c11996.m27451(uuid2.getLeastSignificantBits());
        c11996.m27451(this.f37286);
        c11996.write(this.f37285);
        c11996.writeInt(C4107.m8259(0, c11996.size(), c11996.m27458()));
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13280 m30342(byte[] bArr) {
        if (bArr.length == 84) {
            int iM8259 = C4107.m8259(0, 80, bArr);
            C14677 c14677 = new C14677(bArr);
            c14677.seek(80);
            if (iM8259 == c14677.readInt()) {
                C14677 c14678 = new C14677(bArr);
                if (c14678.readInt() != 843142226 || c14678.readInt() != 1) {
                    throw new IOException("Unsupported recovery attachment reference");
                }
                UUID uuid = new UUID(c14678.readLong(), c14678.readLong());
                UUID uuid2 = new UUID(c14678.readLong(), c14678.readLong());
                long j = c14678.readLong();
                if (j < 0 || j > 2147483647L) {
                    throw new IOException("Invalid recovery attachment length");
                }
                byte[] bArr2 = new byte[32];
                c14678.m33576(32, bArr2);
                return new C13280(uuid, uuid2, j, bArr2);
            }
        }
        throw new IOException("Invalid recovery attachment reference");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0116 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13280 m30341(InterfaceC22097 interfaceC22097, UUID uuid, ByteArrayInputStream byteArrayInputStream, long j, long j2, C3455 c3455) throws Throwable {
        Throwable th;
        InterfaceC22097 interfaceC22098 = interfaceC22097;
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        InterfaceC22097 interfaceC22099 = null;
        try {
            C12826.requireNonNull(uuid);
            m30344(j, j2);
            UUID uuidRandomUUID = UUID.randomUUID();
            InterfaceC22097 interfaceC22097M30343 = m30343(interfaceC22098, uuidRandomUUID);
            C7479 c7479M6162 = c3455.m6162(16384L);
            try {
                try {
                    FileChannel fileChannelOpen = C13853.open(interfaceC22097M30343, EnumC6003.CREATE_NEW, EnumC6003.READ, EnumC6003.WRITE);
                    int i = 8192;
                    try {
                        byte[] bArr = new byte[8192];
                        MessageDigest messageDigestM36668 = C16111.m36668();
                        fileChannelOpen.position(84L);
                        long j3 = j;
                        while (j3 != 0) {
                            try {
                                int iMin = (int) Math.min(j3, i);
                                try {
                                    int i2 = byteArrayInputStream.read(bArr, 0, iMin);
                                    if (i2 <= 0 || i2 > iMin) {
                                        throw new EOFException("Truncated or stalled recovery attachment input");
                                    }
                                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i2);
                                    while (byteBufferWrap.hasRemaining()) {
                                        if (fileChannelOpen.write(byteBufferWrap) <= 0) {
                                            throw new IOException("Recovery attachment write made no progress");
                                        }
                                    }
                                    messageDigestM36668.update(bArr, 0, i2);
                                    j3 -= (long) i2;
                                    i = 8192;
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC22098 = interfaceC22097;
                                    Throwable th3 = th;
                                    if (fileChannelOpen == null) {
                                        throw th3;
                                    }
                                    try {
                                        fileChannelOpen.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        if (byteArrayInputStream.read() != -1) {
                            throw new IOException("Trailing recovery attachment input");
                        }
                        C13280 c13280 = new C13280(uuid, uuidRandomUUID, j, messageDigestM36668.digest());
                        fileChannelOpen.position(0L);
                        byte[] bArrM30348 = c13280.m30348();
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrM30348, 0, bArrM30348.length);
                        while (byteBufferWrap2.hasRemaining()) {
                            if (fileChannelOpen.write(byteBufferWrap2) <= 0) {
                                throw new IOException("Recovery attachment write made no progress");
                            }
                        }
                        interfaceC24242.mo30677(fileChannelOpen);
                        c13280.m30345(fileChannelOpen, bArr);
                        try {
                            fileChannelOpen.close();
                            try {
                                c7479M6162.close();
                                interfaceC22098 = interfaceC22097;
                                interfaceC24242.mo30678(interfaceC22098);
                                try {
                                    byteArrayInputStream.close();
                                    return c13280;
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (interfaceC22097M30343 != null) {
                                        try {
                                            interfaceC24242.mo30681(interfaceC22097M30343);
                                            interfaceC24242.mo30678(interfaceC22098);
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                interfaceC22098 = interfaceC22097;
                                interfaceC22099 = interfaceC22097M30343;
                                InterfaceC22097 interfaceC220910 = interfaceC22099;
                                th = th;
                                try {
                                    byteArrayInputStream.close();
                                    throw th;
                                } catch (Throwable th8) {
                                    th.addSuppressed(th8);
                                    throw th;
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            interfaceC22098 = interfaceC22097;
                            Throwable th10 = th;
                            try {
                                c7479M6162.close();
                                throw th10;
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                                throw th10;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    interfaceC22099 = interfaceC22097M30343;
                    InterfaceC22097 interfaceC220911 = interfaceC22099;
                    th = th;
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (Throwable th14) {
                th = th14;
                interfaceC22097M30343 = null;
            }
        } catch (Throwable th15) {
            th = th15;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m30347(InterfaceC22097 interfaceC22097, UUID uuid, long j, C3455 c3455) throws IOException {
        if (!this.f37288.equals(uuid)) {
            throw new IOException("Recovery attachment belongs to another session");
        }
        m30344(this.f37286, j);
        InterfaceC22097 interfaceC22097M30343 = m30343(interfaceC22097, this.f37287);
        EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
        if (!C18743.isRegularFile(interfaceC22097M30343, enumC16060)) {
            throw new IOException("Recovery attachment is not a regular file");
        }
        FileChannel fileChannelOpen = C13853.open(interfaceC22097M30343, EnumC6003.READ, enumC16060);
        try {
            C7479 c7479M6162 = c3455.m6162(16384L);
            try {
                m30345(fileChannelOpen, new byte[8192]);
                c7479M6162.close();
                fileChannelOpen.position(84L);
                return new C7915(this, fileChannelOpen);
            } catch (Throwable th) {
                try {
                    c7479M6162.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            fileChannelOpen.close();
            throw th3;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00da */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m30346(InterfaceC22097 interfaceC22097, UUID uuid, List list) throws Throwable {
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                C13280 c13280 = (C13280) it.next();
                if (!c13280.f37288.equals(uuid)) {
                    throw new IOException("Live attachment belongs to another session");
                }
                String string = m30343(interfaceC22097, c13280.f37287).getFileName().toString();
                if (!C18743.isRegularFile(interfaceC22097.resolve(string), EnumC16060.NOFOLLOW_LINKS)) {
                    throw new IOException("Live attachment is missing");
                }
                hashSet.add(string);
            } else {
                if (hashSet.isEmpty()) {
                    throw new IOException("Attachment collection requires a durable live reference");
                }
                DirectoryStream<InterfaceC22097> directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22097, "state-*.bin");
                try {
                    boolean z2 = false;
                    for (InterfaceC22097 interfaceC22098 : directoryStreamNewDirectoryStream) {
                        try {
                            String string2 = interfaceC22098.getFileName().toString();
                            if (!hashSet.contains(string2) && C18743.isRegularFile(interfaceC22098, EnumC16060.NOFOLLOW_LINKS) && string2.length() == 46) {
                                try {
                                    if (string2.equals("state-" + UUID.fromString(string2.substring(6, 42)) + ".bin")) {
                                        C18743.delete(interfaceC22098);
                                        z2 = true;
                                    }
                                } catch (IllegalArgumentException unused) {
                                    continue;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            z = z2;
                            if (directoryStreamNewDirectoryStream != null) {
                                try {
                                    directoryStreamNewDirectoryStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        directoryStreamNewDirectoryStream.close();
                        if (z2) {
                            interfaceC24242.mo30678(interfaceC22097);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        if (z2) {
                            interfaceC24242.mo30678(interfaceC22097);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30345(FileChannel fileChannel, byte[] bArr) throws IOException {
        long size = fileChannel.size();
        long j = this.f37286;
        long j2 = 84 + j;
        if (size != j2) {
            throw new IOException("Recovery attachment length does not match reference");
        }
        fileChannel.position(0L);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 84);
        while (byteBufferWrap.hasRemaining()) {
            if (fileChannel.read(byteBufferWrap) <= 0) {
                throw new EOFException("Truncated recovery attachment");
            }
        }
        if (!Arrays.equals(m30348(), Arrays.copyOf(bArr, 84))) {
            throw new IOException("Recovery attachment identity does not match reference");
        }
        MessageDigest messageDigestM36668 = C16111.m36668();
        while (j != 0) {
            int iMin = (int) Math.min(j, bArr.length);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
            while (byteBufferWrap2.hasRemaining()) {
                if (fileChannel.read(byteBufferWrap2) <= 0) {
                    throw new EOFException("Truncated recovery attachment");
                }
            }
            messageDigestM36668.update(bArr, 0, iMin);
            j -= (long) iMin;
        }
        if (!Arrays.equals(this.f37285, messageDigestM36668.digest()) || fileChannel.size() != j2) {
            throw new IOException("Recovery attachment checksum does not match reference");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30344(long j, long j2) throws IOException {
        if (j < 0 || j > 2147483647L || j2 < 0 || j > j2) {
            throw new IOException("Recovery attachment exceeds state limit");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC22097 m30343(InterfaceC22097 interfaceC22097, UUID uuid) {
        return interfaceC22097.resolve("state-" + uuid + ".bin");
    }
}
