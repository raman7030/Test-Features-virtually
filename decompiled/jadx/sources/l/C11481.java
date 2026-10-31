package l;

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
public final class C11481 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f34289;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f34290;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID f34291;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID f34292;

    public C11481(UUID uuid, UUID uuid2, long j, byte[] bArr) {
        this.f34292 = uuid;
        this.f34291 = uuid2;
        this.f34290 = j;
        this.f34289 = bArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID m28306() {
        return this.f34292;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m28305() {
        return this.f34290;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m28304() {
        C10130 c10130 = new C10130(84);
        c10130.writeInt(843142226);
        c10130.writeInt(1);
        UUID uuid = this.f34292;
        c10130.m25431(uuid.getMostSignificantBits());
        c10130.m25431(uuid.getLeastSignificantBits());
        UUID uuid2 = this.f34291;
        c10130.m25431(uuid2.getMostSignificantBits());
        c10130.m25431(uuid2.getLeastSignificantBits());
        c10130.m25431(this.f34290);
        c10130.write(this.f34289);
        c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11481 m28298(byte[] bArr) {
        if (bArr.length == 84) {
            int iM6061 = C1829.m6061(0, 80, bArr);
            C12951 c12951 = new C12951(bArr);
            c12951.seek(80);
            if (iM6061 == c12951.readInt()) {
                C12951 c12952 = new C12951(bArr);
                if (c12952.readInt() != 843142226 || c12952.readInt() != 1) {
                    throw new IOException("Unsupported recovery attachment reference");
                }
                UUID uuid = new UUID(c12952.readLong(), c12952.readLong());
                UUID uuid2 = new UUID(c12952.readLong(), c12952.readLong());
                long j = c12952.readLong();
                if (j < 0 || j > 2147483647L) {
                    throw new IOException("Invalid recovery attachment length");
                }
                byte[] bArr2 = new byte[32];
                c12952.m31489(32, bArr2);
                return new C11481(uuid, uuid2, j, bArr2);
            }
        }
        throw new IOException("Invalid recovery attachment reference");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00f7 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0116 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11481 m28297(InterfaceC20758 interfaceC20758, UUID uuid, ByteArrayInputStream byteArrayInputStream, long j, long j2, C1143 c1143) throws Throwable {
        Throwable th;
        InterfaceC20758 interfaceC20759 = interfaceC20758;
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 interfaceC207510 = null;
        try {
            C11003.requireNonNull(uuid);
            m28300(j, j2);
            UUID uuidRandomUUID = UUID.randomUUID();
            InterfaceC20758 interfaceC20758M28299 = m28299(interfaceC20759, uuidRandomUUID);
            C5377 c5377M3921 = c1143.m3921(16384L);
            try {
                try {
                    FileChannel fileChannelOpen = C12084.open(interfaceC20758M28299, EnumC3824.CREATE_NEW, EnumC3824.READ, EnumC3824.WRITE);
                    int i = 8192;
                    try {
                        byte[] bArr = new byte[8192];
                        MessageDigest messageDigestM34534 = C14460.m34534();
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
                                    messageDigestM34534.update(bArr, 0, i2);
                                    j3 -= (long) i2;
                                    i = 8192;
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC20759 = interfaceC20758;
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
                        C11481 c11481 = new C11481(uuid, uuidRandomUUID, j, messageDigestM34534.digest());
                        fileChannelOpen.position(0L);
                        byte[] bArrM28304 = c11481.m28304();
                        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrM28304, 0, bArrM28304.length);
                        while (byteBufferWrap2.hasRemaining()) {
                            if (fileChannelOpen.write(byteBufferWrap2) <= 0) {
                                throw new IOException("Recovery attachment write made no progress");
                            }
                        }
                        interfaceC23015.mo28629(fileChannelOpen);
                        c11481.m28301(fileChannelOpen, bArr);
                        try {
                            fileChannelOpen.close();
                            try {
                                c5377M3921.close();
                                interfaceC20759 = interfaceC20758;
                                interfaceC23015.mo28630(interfaceC20759);
                                try {
                                    byteArrayInputStream.close();
                                    return c11481;
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (interfaceC20758M28299 != null) {
                                        try {
                                            interfaceC23015.mo28633(interfaceC20758M28299);
                                            interfaceC23015.mo28630(interfaceC20759);
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                interfaceC20759 = interfaceC20758;
                                interfaceC207510 = interfaceC20758M28299;
                                InterfaceC20758 interfaceC207511 = interfaceC207510;
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
                            interfaceC20759 = interfaceC20758;
                            Throwable th10 = th;
                            try {
                                c5377M3921.close();
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
                    interfaceC207510 = interfaceC20758M28299;
                    InterfaceC20758 interfaceC207512 = interfaceC207510;
                    th = th;
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (Throwable th14) {
                th = th14;
                interfaceC20758M28299 = null;
            }
        } catch (Throwable th15) {
            th = th15;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m28303(InterfaceC20758 interfaceC20758, UUID uuid, long j, C1143 c1143) throws IOException {
        if (!this.f34292.equals(uuid)) {
            throw new IOException("Recovery attachment belongs to another session");
        }
        m28300(this.f34290, j);
        InterfaceC20758 interfaceC20758M28299 = m28299(interfaceC20758, this.f34291);
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(interfaceC20758M28299, enumC14406)) {
            throw new IOException("Recovery attachment is not a regular file");
        }
        FileChannel fileChannelOpen = C12084.open(interfaceC20758M28299, EnumC3824.READ, enumC14406);
        try {
            C5377 c5377M3921 = c1143.m3921(16384L);
            try {
                m28301(fileChannelOpen, new byte[8192]);
                c5377M3921.close();
                fileChannelOpen.position(84L);
                return new C5836(this, fileChannelOpen);
            } catch (Throwable th) {
                try {
                    c5377M3921.close();
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

    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28302(InterfaceC20758 interfaceC20758, UUID uuid, List list) throws Throwable {
        boolean z;
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (it.hasNext()) {
                C11481 c11481 = (C11481) it.next();
                if (!c11481.f34292.equals(uuid)) {
                    throw new IOException("Live attachment belongs to another session");
                }
                String string = m28299(interfaceC20758, c11481.f34291).getFileName().toString();
                if (!C17229.isRegularFile(interfaceC20758.resolve(string), EnumC14406.NOFOLLOW_LINKS)) {
                    throw new IOException("Live attachment is missing");
                }
                hashSet.add(string);
            } else {
                if (hashSet.isEmpty()) {
                    throw new IOException("Attachment collection requires a durable live reference");
                }
                try {
                    DirectoryStream<InterfaceC20758> directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20758, "state-*.bin");
                    try {
                        z = false;
                        for (InterfaceC20758 interfaceC20759 : directoryStreamNewDirectoryStream) {
                            try {
                                String string2 = interfaceC20759.getFileName().toString();
                                if (!hashSet.contains(string2) && C17229.isRegularFile(interfaceC20759, EnumC14406.NOFOLLOW_LINKS) && string2.length() == 46) {
                                    try {
                                        if (string2.equals("state-" + UUID.fromString(string2.substring(6, 42)) + ".bin")) {
                                            C17229.delete(interfaceC20759);
                                            z = true;
                                        }
                                    } catch (IllegalArgumentException unused) {
                                        continue;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = z;
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
                            if (z) {
                                interfaceC23015.mo28630(interfaceC20758);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            if (z) {
                                interfaceC23015.mo28630(interfaceC20758);
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z = z2;
                    if (z) {
                        interfaceC23015.mo28630(interfaceC20758);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28301(FileChannel fileChannel, byte[] bArr) throws IOException {
        long size = fileChannel.size();
        long j = this.f34290;
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
        if (!Arrays.equals(m28304(), Arrays.copyOf(bArr, 84))) {
            throw new IOException("Recovery attachment identity does not match reference");
        }
        MessageDigest messageDigestM34534 = C14460.m34534();
        while (j != 0) {
            int iMin = (int) Math.min(j, bArr.length);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, 0, iMin);
            while (byteBufferWrap2.hasRemaining()) {
                if (fileChannel.read(byteBufferWrap2) <= 0) {
                    throw new EOFException("Truncated recovery attachment");
                }
            }
            messageDigestM34534.update(bArr, 0, iMin);
            j -= (long) iMin;
        }
        if (!Arrays.equals(this.f34289, messageDigestM34534.digest()) || fileChannel.size() != j2) {
            throw new IOException("Recovery attachment checksum does not match reference");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28300(long j, long j2) throws IOException {
        if (j < 0 || j > 2147483647L || j2 < 0 || j > j2) {
            throw new IOException("Recovery attachment exceeds state limit");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20758 m28299(InterfaceC20758 interfaceC20758, UUID uuid) {
        return interfaceC20758.resolve("state-" + uuid + ".bin");
    }
}
