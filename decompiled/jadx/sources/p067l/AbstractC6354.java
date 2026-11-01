package p067l;

/* JADX INFO: renamed from: l.ۘ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBCN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6354 {

    /* JADX INFO: renamed from: ֫ */
    public final int f16464;

    /* JADX INFO: renamed from: ۧ */
    public final long f16465;

    /* JADX INFO: renamed from: ܽ */
    public final int f16466;

    /* JADX INFO: renamed from: ᩳ */
    public final int f16467;

    /* JADX INFO: renamed from: ֫ */
    public int mo5044() {
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo5045() {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo5046() {
        return 0;
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo14527() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo5047() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo5048();

    public AbstractC6354(EnumC10062 enumC10062, int i, int i2, int i3, long j) {
        if (enumC10062 == null) {
            throw new NullPointerException("format == null");
        }
        if (!C22187.m50001(i)) {
            throw new IllegalArgumentException("invalid opcode");
        }
        this.f16466 = i;
        this.f16464 = i2;
        this.f16467 = i3;
        this.f16465 = j;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m14525() {
        return this.f16466;
    }

    /* JADX INFO: renamed from: ۖ */
    public final short m14518() {
        return (short) this.f16466;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m14524() {
        return this.f16464;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m14517(int i) {
        return this.f16467 - i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m14523(int i) {
        int i2 = this.f16467 - i;
        if (i2 == ((byte) i2)) {
            return i2 & 255;
        }
        throw new C2724("Target out of range: ".concat(C16351.m37150(i2)), null);
    }

    /* JADX INFO: renamed from: ܽ */
    public final short m14526(int i) {
        int i2 = this.f16467 - i;
        short s = (short) i2;
        if (i2 == s) {
            return s;
        }
        throw new C2724("Target out of range: ".concat(C16351.m37150(i2)), null);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final long m14529() {
        return this.f16465;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m14528() {
        long j = this.f16465;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new C2724("Literal out of range: ".concat(C16351.m37151(j)), null);
    }

    /* JADX INFO: renamed from: ۡ */
    public final short m14521() {
        long j = this.f16465;
        short s = (short) j;
        if (j == s) {
            return s;
        }
        throw new C2724("Literal out of range: ".concat(C16351.m37151(j)), null);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m14520() {
        long j = this.f16465;
        int i = (int) j;
        if (j == ((byte) i)) {
            return i & 255;
        }
        throw new C2724("Literal out of range: ".concat(C16351.m37151(j)), null);
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m14522() {
        long j = this.f16465;
        if (j < -8 || j > 7) {
            throw new C2724("Literal out of range: ".concat(C16351.m37151(j)), null);
        }
        return ((int) j) & 15;
    }

    /* JADX INFO: renamed from: ۘ */
    public short mo14519() {
        throw new IllegalStateException(getClass().toString());
    }
}
