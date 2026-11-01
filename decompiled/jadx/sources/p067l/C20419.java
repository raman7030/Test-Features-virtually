package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46SG */
/* JADX INFO: loaded from: classes4.dex */
public final class C20419 {
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: ֫ */
    public static C4996 m46096(InterfaceC22097 interfaceC22097, byte[] bArr, C3455 c3455, C22649 c22649) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Migration identity must have 32 bytes");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        InterfaceC22097 absolutePath = interfaceC22097.toAbsolutePath();
        C9256 c9256M21327 = C9256.m21327(absolutePath);
        C4996 c4996 = null;
        try {
            UUID uuidM46094 = m46094(absolutePath, bArr2, c9256M21327.m21341());
            if (!c9256M21327.m21341()) {
                C24008 c24008M21333 = c9256M21327.m21333(c3455, uuidM46094);
                try {
                    C22902 c22902 = c24008M21333.f76246;
                    C6337 c6337 = new C6337(c22902, absolutePath);
                    try {
                        c22649.m50709(c6337);
                        C6337.m14492(c6337);
                        C14443 c14443 = new C14443(c6337.f16436, 0L);
                        try {
                            new C10558(c22902).m24342(c14443, c6337.f16428.m9578(), c6337.f16426);
                            c14443.close();
                            C14383.m32991(c6337.f16428.m9578()).m32996(absolutePath, c3455);
                            c9256M21327.m21336(c24008M21333, 0L);
                            c6337.close();
                            c24008M21333.close();
                        } catch (Throwable th) {
                            try {
                                c14443.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            c6337.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c24008M21333.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
            C4996 c4997 = new C4996(absolutePath, c9256M21327, uuidM46094, c3455);
            try {
                C4996.m10571(c4997);
                return c4997;
            } catch (Throwable th7) {
                th = th7;
                c4996 = c4997;
                if (c4996 == null) {
                    c9256M21327.close();
                } else {
                    c4996.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (c4996 == null) {
                c9256M21327.close();
            } else {
                c4996.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static UUID m46094(InterfaceC22097 interfaceC22097, byte[] bArr, boolean z) throws IOException {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097.resolve("migration.id");
        InterfaceC22097 interfaceC22097Resolve2 = interfaceC22097.resolve("migration.id.tmp");
        boolean zExists = C18743.exists(interfaceC22097Resolve, EnumC16060.NOFOLLOW_LINKS);
        InterfaceC24242 interfaceC24242 = InterfaceC24242.f76829;
        if (zExists) {
            UUID uuidM46095 = m46095(m46098(interfaceC22097Resolve), bArr);
            FileChannel fileChannelOpen = C13853.open(interfaceC22097Resolve, EnumC6003.WRITE);
            try {
                fileChannelOpen.force(true);
                fileChannelOpen.close();
                interfaceC24242.mo30678(interfaceC22097);
                return uuidM46095;
            } catch (Throwable th) {
                if (fileChannelOpen != null) {
                    try {
                        fileChannelOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z) {
            throw new IOException("Existing recovery entry has no migration identity");
        }
        DirectoryStream directoryStreamNewDirectoryStream = C18743.newDirectoryStream(interfaceC22097);
        try {
            Iterator it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                String string = ((InterfaceC22097) it.next()).getFileName().toString();
                if (!string.equals("session.lock") && !string.equals("migration.id.tmp")) {
                    throw new IOException("Unidentified migration directory contains data");
                }
            }
            directoryStreamNewDirectoryStream.close();
            EnumC16060 enumC16060 = EnumC16060.NOFOLLOW_LINKS;
            if (C18743.exists(interfaceC22097Resolve2, enumC16060)) {
                if (!C18743.isRegularFile(interfaceC22097Resolve2, enumC16060)) {
                    throw new IOException("Migration identity temporary is not a regular file");
                }
                if (C18743.size(interfaceC22097Resolve2) == 64) {
                    byte[] bArrM46098 = m46098(interfaceC22097Resolve2);
                    if (m46097(bArrM46098)) {
                        m46095(bArrM46098, bArr);
                    }
                }
                interfaceC24242.mo30681(interfaceC22097Resolve2);
                interfaceC24242.mo30678(interfaceC22097);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            C11996 c11996 = new C11996(64);
            c11996.writeInt(1295139913);
            c11996.writeInt(1);
            c11996.m27451(uuidRandomUUID.getMostSignificantBits());
            c11996.m27451(uuidRandomUUID.getLeastSignificantBits());
            c11996.write(bArr, 0, bArr.length);
            c11996.writeInt(0);
            c11996.writeInt(C4107.m8259(0, c11996.size(), c11996.m27458()));
            interfaceC24242.mo30680(interfaceC22097Resolve2, c11996.m27464());
            interfaceC24242.mo30679(interfaceC22097Resolve2, interfaceC22097Resolve);
            interfaceC24242.mo30678(interfaceC22097);
            return uuidRandomUUID;
        } catch (Throwable th3) {
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    directoryStreamNewDirectoryStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46098(InterfaceC22097 interfaceC22097) throws IOException {
        int i = 0;
        if (!C18743.isRegularFile(interfaceC22097, EnumC16060.NOFOLLOW_LINKS) || C18743.size(interfaceC22097) != 64) {
            throw new IOException("Invalid migration identity file");
        }
        InputStream inputStreamNewInputStream = C18743.newInputStream(interfaceC22097, new InterfaceC24778[0]);
        try {
            byte[] bArr = new byte[64];
            while (i < 64) {
                int i2 = inputStreamNewInputStream.read(bArr, i, 64 - i);
                if (i2 <= 0) {
                    throw new IOException("Migration identity read made no progress");
                }
                i += i2;
            }
            if (inputStreamNewInputStream.read() != -1) {
                throw new IOException("Migration identity changed during reading");
            }
            inputStreamNewInputStream.close();
            return bArr;
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46097(byte[] bArr) {
        C14677 c14677 = new C14677(bArr);
        if (c14677.readInt() == 1295139913 && c14677.readInt() == 1) {
            c14677.seek(56L);
            if (c14677.readInt() == 0 && c14677.readInt() == C4107.m8259(0, 60, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static UUID m46095(byte[] bArr, byte[] bArr2) throws IOException {
        if (!m46097(bArr)) {
            throw new IOException("Invalid migration identity format or checksum");
        }
        C14677 c14677 = new C14677(bArr);
        c14677.seek(8L);
        UUID uuid = new UUID(c14677.readLong(), c14677.readLong());
        byte[] bArr3 = new byte[32];
        c14677.m33576(32, bArr3);
        if (Arrays.equals(bArr2, bArr3)) {
            return uuid;
        }
        throw new IOException("Migration belongs to a different legacy source");
    }
}
