package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.۫᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6SQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14383 {

    /* JADX INFO: renamed from: ֫ */
    public final UUID f41110;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f41111;

    /* JADX INFO: renamed from: ܽ */
    public final long f41112;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f41113;

    public C14383(UUID uuid, long j, byte[] bArr, byte[] bArr2) {
        this.f41110 = uuid;
        this.f41112 = j;
        this.f41111 = bArr == null ? null : (byte[]) bArr.clone();
        this.f41113 = (byte[]) bArr2.clone();
    }

    /* JADX INFO: renamed from: ܽ */
    public final UUID m32998() {
        return this.f41110;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m32997() {
        return this.f41111 != null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m33000() {
        return this.f41112;
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m32999() {
        return (byte[]) this.f41113.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m32995(byte[] bArr) {
        return m32992(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m32994() {
        return m32992(this.f41113);
    }

    /* JADX INFO: renamed from: ܽ */
    private byte[] m32992(byte[] bArr) {
        if (bArr.length > 8112) {
            throw new IllegalArgumentException("Migration user metadata is too large");
        }
        C11996 c11996 = new C11996(bArr.length + 80);
        c11996.writeInt(1295142215);
        c11996.writeInt(1);
        UUID uuid = this.f41110;
        c11996.m27451(uuid.getMostSignificantBits());
        c11996.m27451(uuid.getLeastSignificantBits());
        c11996.writeInt(m32997() ? 1 : 0);
        c11996.writeInt(0);
        c11996.m27451(this.f41112);
        c11996.write(m32997() ? this.f41111 : new byte[32]);
        c11996.writeInt(bArr.length);
        c11996.write(bArr, 0, bArr.length);
        c11996.writeInt(C4107.m8259(0, c11996.size(), c11996.m27458()));
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14383 m32991(byte[] bArr) throws IOException {
        if (bArr.length < 80 || bArr.length > 8192) {
            throw new IOException("Invalid migration metadata length");
        }
        C14677 c14677 = new C14677(bArr);
        if (c14677.readInt() != 1295142215 || c14677.readInt() != 1) {
            throw new IOException("Unsupported migration metadata");
        }
        UUID uuid = new UUID(c14677.readLong(), c14677.readLong());
        int i = c14677.readInt();
        int i2 = c14677.readInt();
        long j = c14677.readLong();
        byte[] bArr2 = new byte[32];
        c14677.m33576(32, bArr2);
        int i3 = c14677.readInt();
        if ((i != 0 && i != 1) || i2 != 0 || j < 0 || j > 2147483647L || i3 != bArr.length - 80 || (i == 0 && (j != 0 || !Arrays.equals(bArr2, new byte[32])))) {
            throw new IOException("Invalid migration metadata fields");
        }
        byte[] bArr3 = new byte[i3];
        c14677.m33576(i3, bArr3);
        if (c14677.readInt() != C4107.m8259(0, bArr.length - 4, bArr)) {
            throw new IOException("Invalid migration metadata checksum");
        }
        return new C14383(uuid, j, i == 0 ? null : bArr2, bArr3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m32993(InterfaceC22097 interfaceC22097, C3455 c3455) throws IOException {
        if (!m32997()) {
            throw new IOException("Migration has no external state");
        }
        return C8348.m19267(interfaceC22097, this, c3455, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32996(InterfaceC22097 interfaceC22097, C3455 c3455) throws IOException {
        if (m32997()) {
            C8348.m19267(interfaceC22097, this, c3455, InterfaceC24242.f76829).close();
        } else if (C18743.exists(interfaceC22097.resolve("migration-state.bin"), EnumC16060.NOFOLLOW_LINKS)) {
            throw new IOException("Migration state file is not bound to its commit");
        }
    }
}
