package l;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22204 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f72041;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f72042;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int[] f72043 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f72044 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19714 f72045;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72046;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f72047;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] f72048;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f72049;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f72050;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f72051;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f72052;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f72053;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f72054;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72055;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f72056;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f72057;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f72058;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC9505 f72059;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f72060;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72061;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f72062;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    static {
        String str = C3603.f11424;
        Charset charset = StandardCharsets.UTF_8;
        f72041 = "#!AMR\n".getBytes(charset);
        f72042 = "#!AMR-WB\n".getBytes(charset);
    }

    public C22204(int i) {
        this.f72050 = (i & 2) != 0 ? i | 1 : i;
        this.f72048 = new byte[1];
        this.f72062 = -1;
        C19714 c19714 = new C19714();
        this.f72045 = c19714;
        this.f72058 = c19714;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return m49884(interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f72057 = interfaceC21830;
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(0, 1);
        this.f72047 = interfaceC19383Mo3429;
        this.f72058 = interfaceC19383Mo3429;
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f72056 = 0L;
        this.f72053 = 0;
        this.f72046 = 0;
        this.f72060 = j2;
        InterfaceC9505 interfaceC9505 = this.f72059;
        if (interfaceC9505 instanceof C17971) {
            long jM41982 = ((C17971) interfaceC9505).m41982(j);
            this.f72049 = jM41982;
            if (Math.abs(this.f72060 - jM41982) < 20000) {
                return;
            }
            this.f72052 = true;
            this.f72058 = this.f72045;
            return;
        }
        if (j != 0 && (interfaceC9505 instanceof C9130)) {
            this.f72049 = ((C9130) interfaceC9505).m23502(j);
        } else {
            this.f72049 = 0L;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m49884(InterfaceC8424 interfaceC8424) {
        interfaceC8424.mo22066();
        byte[] bArr = f72041;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC8424.mo22061(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f72051 = false;
            interfaceC8424.mo22070(bArr.length);
            return true;
        }
        interfaceC8424.mo22066();
        byte[] bArr3 = f72042;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC8424.mo22061(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f72051 = true;
        interfaceC8424.mo22070(bArr3.length);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m49883(InterfaceC8424 interfaceC8424) throws C9080 {
        boolean z;
        interfaceC8424.mo22066();
        byte[] bArr = this.f72048;
        interfaceC8424.mo22061(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C9080.m23440("Invalid padding bits for frame header " + ((int) b), (Throwable) null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f72051) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f72044[i] : f72043[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f72051 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C9080.m23440(sb.toString(), (Throwable) null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        int i;
        int i2;
        int iMo8451;
        int i3;
        C22632.m50632(this.f72047);
        String str = C3603.f11424;
        if (interfaceC8424.getPosition() == 0 && !m49884(interfaceC8424)) {
            throw C9080.m23440("Could not find AMR header.", (Throwable) null);
        }
        if (!this.f72061) {
            this.f72061 = true;
            boolean z = this.f72051;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            int i5 = z ? f72044[8] : f72043[7];
            InterfaceC19383 interfaceC19383 = this.f72047;
            C1297 c1297 = new C1297();
            c1297.m4462(str2);
            c1297.m4465(str3);
            c1297.m4451(i5);
            c1297.m4472(1);
            c1297.m4456(i4);
            interfaceC19383.mo8456(c1297.m4440());
        }
        if (this.f72046 == 0) {
            try {
                int iM49883 = m49883(interfaceC8424);
                this.f72053 = iM49883;
                this.f72046 = iM49883;
                if (this.f72062 == -1) {
                    this.f72054 = interfaceC8424.getPosition();
                    this.f72062 = this.f72053;
                }
                if (this.f72062 == this.f72053) {
                    this.f72055++;
                }
                InterfaceC9505 interfaceC9505 = this.f72059;
                if (interfaceC9505 instanceof C17971) {
                    C17971 c17971 = (C17971) interfaceC9505;
                    long j = this.f72049 + this.f72056 + 20000;
                    long position = interfaceC8424.getPosition() + ((long) this.f72053);
                    if (!c17971.m41983(j)) {
                        c17971.m41981(j, position);
                    }
                    if (this.f72052 && Math.abs(this.f72060 - j) < 20000) {
                        this.f72052 = false;
                        this.f72058 = this.f72047;
                    }
                }
                iMo8451 = this.f72058.mo8451((InterfaceC9765) interfaceC8424, this.f72046, true);
                if (iMo8451 == -1) {
                    i = -1;
                } else {
                    i3 = this.f72046 - iMo8451;
                    this.f72046 = i3;
                    if (i3 <= 0) {
                        this.f72058.mo8455(this.f72049 + this.f72056, 1, this.f72053, 0, null);
                        this.f72056 += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo8451 = this.f72058.mo8451((InterfaceC9765) interfaceC8424, this.f72046, true);
            if (iMo8451 == -1) {
                i = -1;
            } else {
                i3 = this.f72046 - iMo8451;
                this.f72046 = i3;
                if (i3 <= 0) {
                    this.f72058.mo8455(this.f72049 + this.f72056, 1, this.f72053, 0, null);
                    this.f72056 += 20000;
                }
                i = 0;
            }
        }
        long length = interfaceC8424.getLength();
        if (this.f72059 == null) {
            int i6 = this.f72050;
            if ((i6 & 4) != 0) {
                this.f72059 = new C17971(-9223372036854775807L, new long[]{this.f72054}, new long[]{0});
            } else if ((i6 & 1) == 0 || ((i2 = this.f72062) != -1 && i2 != this.f72053)) {
                this.f72059 = new C20794(-9223372036854775807L);
            } else if (this.f72055 >= 20 || i == -1) {
                C9130 c9130 = new C9130((int) ((((long) i2) * 8000000) / 20000), i2, length, this.f72054, (i6 & 2) != 0);
                this.f72059 = c9130;
                this.f72047.mo8454(c9130.mo6827());
            }
            InterfaceC9505 interfaceC9506 = this.f72059;
            if (interfaceC9506 != null) {
                this.f72057.mo3430(interfaceC9506);
            }
        }
        if (i == -1) {
            InterfaceC9505 interfaceC9507 = this.f72059;
            if (interfaceC9507 instanceof C17971) {
                long j2 = this.f72049 + this.f72056;
                ((C17971) interfaceC9507).m41984(j2);
                this.f72057.mo3430(this.f72059);
                this.f72047.mo8454(j2);
            }
        }
        return i;
    }
}
