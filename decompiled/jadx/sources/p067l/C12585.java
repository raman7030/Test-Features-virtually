package p067l;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۧۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8M2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12585 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28991(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = C24420.m53892(uuidArr.length, 16, 4, length);
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28990(UUID uuid, byte[] bArr) {
        C3867 c3867M28989 = m28989(bArr);
        if (c3867M28989 == null) {
            return null;
        }
        UUID uuid2 = c3867M28989.f8364;
        if (!uuid.equals(uuid2)) {
            C21334.m48351("UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return c3867M28989.f8363;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3867 m28989(byte[] bArr) {
        UUID[] uuidArr;
        C19203 c19203 = new C19203(bArr);
        if (c19203.m43729() < 32) {
            return null;
        }
        c19203.m43730(0);
        int iM43703 = c19203.m43703();
        int iM43739 = c19203.m43739();
        if (iM43739 != iM43703) {
            C21334.m48351("Advertised atom size (" + iM43739 + ") does not match buffer size: " + iM43703);
            return null;
        }
        int iM437310 = c19203.m43739();
        if (iM437310 != 1886614376) {
            C10050.m23419(iM437310, "Atom type is not pssh: ");
            return null;
        }
        int iM51818 = C23275.m51818(c19203.m43739());
        if (iM51818 > 1) {
            C10050.m23419(iM51818, "Unsupported pssh version: ");
            return null;
        }
        UUID uuid = new UUID(c19203.m43733(), c19203.m43733());
        if (iM51818 == 1) {
            int iM43738 = c19203.m43738();
            uuidArr = new UUID[iM43738];
            for (int i = 0; i < iM43738; i++) {
                uuidArr[i] = new UUID(c19203.m43733(), c19203.m43733());
            }
        } else {
            uuidArr = null;
        }
        int iM437311 = c19203.m43738();
        int iM43704 = c19203.m43703();
        if (iM437311 == iM43704) {
            byte[] bArr2 = new byte[iM437311];
            c19203.m43707(0, iM437311, bArr2);
            return new C3867(uuid, iM51818, bArr2, uuidArr);
        }
        C21334.m48351("Atom data size (" + iM437311 + ") does not match the bytes left: " + iM43704);
        return null;
    }
}
