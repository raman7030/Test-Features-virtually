package l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.۠֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6PV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7869 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11481 f24405;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12641 f24406;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f24407;

    public C7869(long j, C12641 c12641, C11481 c11481) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        this.f24407 = j;
        this.f24406 = c12641;
        this.f24405 = c11481;
        if (c11481 != null && c12641 != null && !c11481.m28306().equals(c12641.m30920())) {
            throw new IllegalStateException("Editor state and migration belong to different sessions");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7869 m21143(byte[] bArr, Long l2) {
        C12641 c12641;
        C11481 c11481M28298 = null;
        if (bArr.length == 0 || (bArr.length >= 4 && new C12951(bArr).readInt() == 844322373)) {
            c12641 = null;
        } else {
            try {
                C12641 c12641M30913 = C12641.m30913(bArr);
                c12641 = c12641M30913;
                bArr = c12641M30913.m30921();
            } catch (IOException e) {
                throw new IllegalStateException("Invalid editor session metadata", e);
            }
        }
        if (bArr.length == 0) {
            if (l2 == null) {
                throw new IllegalStateException("Editor saved mark has not been initialized");
            }
            return new C7869(l2.longValue(), c12641, null);
        }
        if (bArr.length != 16 && bArr.length != 100) {
            throw new IllegalStateException("Invalid editor saved state length");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != 844322373) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        int i = c12951.readInt();
        if (i != (bArr.length == 16 ? 1 : 2)) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        long j = c12951.readLong();
        if (j < -1) {
            throw new IllegalStateException("Invalid editor saved mark");
        }
        if (l2 != null && l2.longValue() != j) {
            throw new IllegalStateException("Editor saved mark is already initialized");
        }
        if (i == 2) {
            try {
                byte[] bArr2 = new byte[84];
                c12951.m31489(84, bArr2);
                c11481M28298 = C11481.m28298(bArr2);
            } catch (IOException e2) {
                throw new IllegalStateException("Invalid editor recovery attachment", e2);
            }
        }
        return new C7869(j, c12641, c11481M28298);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m21148(long j) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        C11481 c11481 = this.f24405;
        C10130 c10130 = new C10130(c11481 == null ? 16 : 100);
        c10130.writeInt(844322373);
        c10130.writeInt(c11481 == null ? 1 : 2);
        c10130.m25431(j);
        if (c11481 != null) {
            c10130.write(c11481.m28304());
        }
        byte[] bArrM25444 = c10130.m25444();
        C12641 c12641 = this.f24406;
        return c12641 == null ? bArrM25444 : c12641.m30917(bArrM25444);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21145(byte[] bArr, C11481 c11481, UUID uuid) {
        C7869 c7869M21143 = m21143(bArr, (Long) null);
        long j = c7869M21143.f24407;
        c7869M21143.m21147(uuid);
        if (!c11481.m28306().equals(uuid)) {
            throw new IllegalStateException("Editor recovery attachment belongs to another session");
        }
        return new C7869(j, c7869M21143.f24406, c11481).m21148(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0.m30921().length == 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11481 m21144(UUID uuid, byte[] bArr) {
        if (uuid == null) {
            throw new IllegalStateException("Editor recovery session identity is missing");
        }
        if (bArr.length != 0) {
            if (bArr.length >= 4 && new C12951(bArr).readInt() != 844322373) {
                try {
                    C12641 c12641M30913 = C12641.m30913(bArr);
                    if (!c12641M30913.m30920().equals(uuid)) {
                        throw new IllegalStateException("Editor migration belongs to another session");
                    }
                } catch (IOException e) {
                    throw new IllegalStateException("Invalid editor migration metadata", e);
                }
            }
            C7869 c7869M21143 = m21143(bArr, (Long) null);
            c7869M21143.m21147(uuid);
            return c7869M21143.f24405;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m21146(UUID uuid, byte[] bArr) {
        m21143(bArr, (Long) null).m21147(uuid);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21147(UUID uuid) {
        C12641 c12641;
        C11481 c11481;
        if (uuid == null || !(((c12641 = this.f24406) == null || c12641.m30920().equals(uuid)) && ((c11481 = this.f24405) == null || c11481.m28306().equals(uuid)))) {
            throw new IllegalStateException("Editor recovery metadata belongs to another session");
        }
    }
}
