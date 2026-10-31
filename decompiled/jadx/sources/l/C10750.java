package l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۧۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8M2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10750 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26947(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = C23202.m51496(uuidArr.length, 16, 4, length);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        } else {
            byteBufferAllocate.putInt(0);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26946(UUID uuid, byte[] bArr) {
        C1577 c1577M26945 = m26945(bArr);
        if (c1577M26945 == null) {
            return null;
        }
        UUID uuid2 = c1577M26945.f5584;
        if (!uuid.equals(uuid2)) {
            C19956.m46037("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return c1577M26945.f5583;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1577 m26945(byte[] bArr) {
        UUID[] uuidArr;
        C17714 c17714 = new C17714(bArr);
        if (c17714.m41483() < 32) {
            return null;
        }
        c17714.m41484(0);
        int iM41457 = c17714.m41457();
        int iM41493 = c17714.m41493();
        if (iM41493 != iM41457) {
            C19956.m46037("Advertised atom size (" + iM41493 + ") does not match buffer size: " + iM41457);
            return null;
        }
        int iM41494 = c17714.m41493();
        if (iM41494 != 1886614376) {
            C8083.m21451(iM41494, "Atom type is not pssh: ");
            return null;
        }
        int iM49483 = C21998.m49483(c17714.m41493());
        if (iM49483 > 1) {
            C8083.m21451(iM49483, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(c17714.m41487(), c17714.m41487());
        if (iM49483 == 1) {
            int iM41492 = c17714.m41492();
            uuidArr = new UUID[iM41492];
            for (int i = 0; i < iM41492; i++) {
                uuidArr[i] = new UUID(c17714.m41487(), c17714.m41487());
            }
        } else {
            uuidArr = null;
        }
        int iM41495 = c17714.m41492();
        int iM41458 = c17714.m41457();
        if (iM41495 == iM41458) {
            byte[] bArr2 = new byte[iM41495];
            c17714.m41461(0, iM41495, bArr2);
            return new C1577(uuid, iM49483, bArr2, uuidArr);
        }
        C19956.m46037("Atom data size (" + iM41495 + ") does not match the bytes left: " + iM41458);
        return null;
    }
}
