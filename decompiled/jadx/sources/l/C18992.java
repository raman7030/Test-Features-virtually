package l;

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
public final class C18992 {
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2764 m43828(InterfaceC20758 interfaceC20758, byte[] bArr, C1143 c1143, C21339 c21339) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Migration identity must have 32 bytes");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        C7247 c7247M19378 = C7247.m19378(absolutePath);
        C2764 c2764 = null;
        try {
            UUID uuidM43826 = m43826(absolutePath, bArr2, c7247M19378.m19392());
            if (!c7247M19378.m19392()) {
                C22769 c22769M19384 = c7247M19378.m19384(c1143, uuidM43826);
                try {
                    C21605 c21605 = c22769M19384.f73520;
                    C4175 c4175 = new C4175(c21605, absolutePath);
                    try {
                        c21339.m48374(c4175);
                        C4175.m12617(c4175);
                        C12704 c12704 = new C12704(c4175.f13623, 0L);
                        try {
                            new C8617(c21605).m22373(c12704, c4175.f13615.m7496(), c4175.f13613);
                            c12704.close();
                            C12641.m30913(c4175.f13615.m7496()).m30918(absolutePath, c1143);
                            c7247M19378.m19387(c22769M19384, 0L);
                            c4175.close();
                            c22769M19384.close();
                        } catch (Throwable th) {
                            try {
                                c12704.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            c4175.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        c22769M19384.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            }
            C2764 c2765 = new C2764(absolutePath, c7247M19378, uuidM43826, c1143);
            try {
                C2764.m8523(c2765);
                return c2765;
            } catch (Throwable th7) {
                th = th7;
                c2764 = c2765;
                if (c2764 == null) {
                    c7247M19378.close();
                } else {
                    c2764.close();
                }
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            if (c2764 == null) {
                c7247M19378.close();
            } else {
                c2764.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static UUID m43826(InterfaceC20758 interfaceC20758, byte[] bArr, boolean z) throws IOException {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758.resolve("migration.id");
        InterfaceC20758 interfaceC20758Resolve2 = interfaceC20758.resolve("migration.id.tmp");
        boolean zExists = C17229.exists(interfaceC20758Resolve, EnumC14406.NOFOLLOW_LINKS);
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        if (zExists) {
            UUID uuidM43827 = m43827(m43830(interfaceC20758Resolve), bArr);
            FileChannel fileChannelOpen = C12084.open(interfaceC20758Resolve, EnumC3824.WRITE);
            try {
                fileChannelOpen.force(true);
                fileChannelOpen.close();
                interfaceC23015.mo28630(interfaceC20758);
                return uuidM43827;
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
        DirectoryStream directoryStreamNewDirectoryStream = C17229.newDirectoryStream(interfaceC20758);
        try {
            Iterator it = directoryStreamNewDirectoryStream.iterator();
            while (it.hasNext()) {
                String string = ((InterfaceC20758) it.next()).getFileName().toString();
                if (!string.equals("session.lock") && !string.equals("migration.id.tmp")) {
                    throw new IOException("Unidentified migration directory contains data");
                }
            }
            directoryStreamNewDirectoryStream.close();
            EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
            if (C17229.exists(interfaceC20758Resolve2, enumC14406)) {
                if (!C17229.isRegularFile(interfaceC20758Resolve2, enumC14406)) {
                    throw new IOException("Migration identity temporary is not a regular file");
                }
                if (C17229.size(interfaceC20758Resolve2) == 64) {
                    byte[] bArrM43830 = m43830(interfaceC20758Resolve2);
                    if (m43829(bArrM43830)) {
                        m43827(bArrM43830, bArr);
                    }
                }
                interfaceC23015.mo28633(interfaceC20758Resolve2);
                interfaceC23015.mo28630(interfaceC20758);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            C10130 c10130 = new C10130(64);
            c10130.writeInt(1295139913);
            c10130.writeInt(1);
            c10130.m25431(uuidRandomUUID.getMostSignificantBits());
            c10130.m25431(uuidRandomUUID.getLeastSignificantBits());
            c10130.write(bArr, 0, bArr.length);
            c10130.writeInt(0);
            c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
            interfaceC23015.mo28632(interfaceC20758Resolve2, c10130.m25444());
            interfaceC23015.mo28631(interfaceC20758Resolve2, interfaceC20758Resolve);
            interfaceC23015.mo28630(interfaceC20758);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m43830(InterfaceC20758 interfaceC20758) throws IOException {
        int i = 0;
        if (!C17229.isRegularFile(interfaceC20758, EnumC14406.NOFOLLOW_LINKS) || C17229.size(interfaceC20758) != 64) {
            throw new IOException("Invalid migration identity file");
        }
        InputStream inputStreamNewInputStream = C17229.newInputStream(interfaceC20758, new InterfaceC23579[0]);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43829(byte[] bArr) {
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() == 1295139913 && c12951.readInt() == 1) {
            c12951.seek(56L);
            if (c12951.readInt() == 0 && c12951.readInt() == C1829.m6061(0, 60, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static UUID m43827(byte[] bArr, byte[] bArr2) throws IOException {
        if (!m43829(bArr)) {
            throw new IOException("Invalid migration identity format or checksum");
        }
        C12951 c12951 = new C12951(bArr);
        c12951.seek(8L);
        UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
        byte[] bArr3 = new byte[32];
        c12951.m31489(32, bArr3);
        if (Arrays.equals(bArr2, bArr3)) {
            return uuid;
        }
        throw new IOException("Migration belongs to a different legacy source");
    }
}
