package p067l;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.۠֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6PV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9847 {

    /* JADX INFO: renamed from: ֫ */
    public final C13280 f27321;

    /* JADX INFO: renamed from: ۧ */
    public final C14383 f27322;

    /* JADX INFO: renamed from: ܽ */
    public final long f27323;

    public C9847(long j, C14383 c14383, C13280 c13280) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        this.f27323 = j;
        this.f27322 = c14383;
        this.f27321 = c13280;
        if (c13280 != null && c14383 != null && !c13280.m30350().equals(c14383.m32998())) {
            throw new IllegalStateException("Editor state and migration belong to different sessions");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9847 m23108(byte[] bArr, Long l2) {
        C14383 c14383;
        C13280 c13280M30342 = null;
        if (bArr.length == 0 || (bArr.length >= 4 && new C14677(bArr).readInt() == 844322373)) {
            c14383 = null;
        } else {
            try {
                C14383 c14383M32991 = C14383.m32991(bArr);
                c14383 = c14383M32991;
                bArr = c14383M32991.m32999();
            } catch (IOException e) {
                throw new IllegalStateException("Invalid editor session metadata", e);
            }
        }
        if (bArr.length == 0) {
            if (l2 == null) {
                throw new IllegalStateException("Editor saved mark has not been initialized");
            }
            return new C9847(l2.longValue(), c14383, null);
        }
        if (bArr.length != 16 && bArr.length != 100) {
            throw new IllegalStateException("Invalid editor saved state length");
        }
        C14677 c14677 = new C14677(bArr);
        if (c14677.readInt() != 844322373) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        int i = c14677.readInt();
        if (i != (bArr.length == 16 ? 1 : 2)) {
            throw new IllegalStateException("Unsupported editor saved state");
        }
        long j = c14677.readLong();
        if (j < -1) {
            throw new IllegalStateException("Invalid editor saved mark");
        }
        if (l2 != null && l2.longValue() != j) {
            throw new IllegalStateException("Editor saved mark is already initialized");
        }
        if (i == 2) {
            try {
                byte[] bArr2 = new byte[84];
                c14677.m33576(84, bArr2);
                c13280M30342 = C13280.m30342(bArr2);
            } catch (IOException e2) {
                throw new IllegalStateException("Invalid editor recovery attachment", e2);
            }
        }
        return new C9847(j, c14383, c13280M30342);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m23113(long j) {
        if (j < -1) {
            throw new IllegalArgumentException("Invalid saved text mark");
        }
        C13280 c13280 = this.f27321;
        C11996 c11996 = new C11996(c13280 == null ? 16 : 100);
        c11996.writeInt(844322373);
        c11996.writeInt(c13280 == null ? 1 : 2);
        c11996.m27451(j);
        if (c13280 != null) {
            c11996.write(c13280.m30348());
        }
        byte[] bArrM27464 = c11996.m27464();
        C14383 c14383 = this.f27322;
        return c14383 == null ? bArrM27464 : c14383.m32995(bArrM27464);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m23110(byte[] bArr, C13280 c13280, UUID uuid) {
        C9847 c9847M23108 = m23108(bArr, (Long) null);
        long j = c9847M23108.f27323;
        c9847M23108.m23112(uuid);
        if (!c13280.m30350().equals(uuid)) {
            throw new IllegalStateException("Editor recovery attachment belongs to another session");
        }
        return new C9847(j, c9847M23108.f27322, c13280).m23113(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0.m32999().length == 0) goto L14;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13280 m23109(UUID uuid, byte[] bArr) {
        if (uuid == null) {
            throw new IllegalStateException("Editor recovery session identity is missing");
        }
        if (bArr.length != 0) {
            if (bArr.length >= 4 && new C14677(bArr).readInt() != 844322373) {
                try {
                    C14383 c14383M32991 = C14383.m32991(bArr);
                    if (!c14383M32991.m32998().equals(uuid)) {
                        throw new IllegalStateException("Editor migration belongs to another session");
                    }
                } catch (IOException e) {
                    throw new IllegalStateException("Invalid editor migration metadata", e);
                }
            }
            C9847 c9847M23108 = m23108(bArr, (Long) null);
            c9847M23108.m23112(uuid);
            return c9847M23108.f27321;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m23111(UUID uuid, byte[] bArr) {
        m23108(bArr, (Long) null).m23112(uuid);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23112(UUID uuid) {
        C14383 c14383;
        C13280 c13280;
        if (uuid == null || !(((c14383 = this.f27322) == null || c14383.m32998().equals(uuid)) && ((c13280 = this.f27321) == null || c13280.m30350().equals(uuid)))) {
            throw new IllegalStateException("Editor recovery metadata belongs to another session");
        }
    }
}
