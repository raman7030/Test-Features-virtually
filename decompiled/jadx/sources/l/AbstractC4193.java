package l;

/* JADX INFO: renamed from: l.ۘ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBCN */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4193 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f13651;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f13652;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f13653;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f13654;

    /* JADX INFO: renamed from: ֫ */
    public int mo2705() {
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo2706() {
        return 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo2707() {
        return 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int mo12651() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public int mo2708() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract int mo2709();

    public AbstractC4193(EnumC8095 enumC8095, int i, int i2, int i3, long j) {
        if (enumC8095 == null) {
            throw new NullPointerException("format == null");
        }
        if (!C20853.m47673(i)) {
            throw new IllegalArgumentException("invalid opcode");
        }
        this.f13653 = i;
        this.f13651 = i2;
        this.f13654 = i3;
        this.f13652 = j;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m12649() {
        return this.f13653;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short m12642() {
        return (short) this.f13653;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m12648() {
        return this.f13651;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12641(int i) {
        return this.f13654 - i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12647(int i) {
        int i2 = this.f13654 - i;
        if (i2 == ((byte) i2)) {
            return i2 & 255;
        }
        throw new C0374("Target out of range: ".concat(C14712.m35003(i2)), null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m12650(int i) {
        int i2 = this.f13654 - i;
        short s = (short) i2;
        if (i2 == s) {
            return s;
        }
        throw new C0374("Target out of range: ".concat(C14712.m35003(i2)), null);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m12653() {
        return this.f13652;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m12652() {
        long j = this.f13652;
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new C0374("Literal out of range: ".concat(C14712.m35004(j)), null);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final short m12645() {
        long j = this.f13652;
        short s = (short) j;
        if (j == s) {
            return s;
        }
        throw new C0374("Literal out of range: ".concat(C14712.m35004(j)), null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m12644() {
        long j = this.f13652;
        int i = (int) j;
        if (j == ((byte) i)) {
            return i & 255;
        }
        throw new C0374("Literal out of range: ".concat(C14712.m35004(j)), null);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m12646() {
        long j = this.f13652;
        if (j < -8 || j > 7) {
            throw new C0374("Literal out of range: ".concat(C14712.m35004(j)), null);
        }
        return ((int) j) & 15;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public short mo12643() {
        throw new IllegalStateException(getClass().toString());
    }
}
