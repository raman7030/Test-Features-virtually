package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J89P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8476 implements InterfaceC19995 {

    /* JADX INFO: renamed from: ֫ */
    public int f22746;

    /* JADX INFO: renamed from: ۧ */
    public int f22747;

    /* JADX INFO: renamed from: ܽ */
    public String f22748 = "";

    public final int hashCode() {
        return C12826.hash(Boolean.TRUE, this.f22748);
    }

    public final String toString() {
        String str = this.f22748;
        return str == null ? "null" : C6988.m16053("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m19735() {
        return this.f22748;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19736(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Expected non-null value");
        }
        this.f22748 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m19739(C4572 c4572) throws IOException {
        c4572.m9649(EnumC5913.FOUR);
        c4572.m9651(this.f22748.length() + 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19738(C4572 c4572) throws IOException {
        c4572.m9649(EnumC5913.FOUR);
        c4572.m9651(0);
        c4572.m9651(this.f22748.length() + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19737(C4572 c4572) throws IOException {
        c4572.m9648(this.f22748);
        c4572.m9652(0);
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ܽ */
    public final void mo7394(C17311 c17311) throws EOFException {
        c17311.m39276(EnumC5913.FOUR);
        c17311.m39275(4);
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ۧ */
    public final void mo7393(C17311 c17311) {
        c17311.m39276(EnumC5913.FOUR);
        this.f22747 = m19734("Offset", c17311);
        this.f22746 = m19734("ActualCount", c17311);
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ֫ */
    public final void mo7392(C17311 c17311) throws EOFException {
        boolean z;
        c17311.m39276(EnumC5913.TWO);
        c17311.m39275(this.f22747 * 2);
        int i = this.f22746;
        if (i > 0) {
            i--;
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(c17311.m39279());
        }
        this.f22748 = sb.toString();
        if (z) {
            c17311.m39275(2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8476) && C12826.equals(this.f22748, ((AbstractC8476) obj).f22748);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m19734(String str, C17311 c17311) throws C10607 {
        long jM39281 = c17311.m39281();
        if (jM39281 <= 2147483647L) {
            return (int) jM39281;
        }
        throw new C10607(String.format("%s %d > %d", str, Long.valueOf(jM39281), Integer.MAX_VALUE));
    }
}
