package l;

/* JADX INFO: renamed from: l.ۧۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E1RG */
/* JADX INFO: loaded from: classes3.dex */
public final class C10824 implements Cloneable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f32556 = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f32557 = {4, 8, 24, 48};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f32558;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f32559;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f32560;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f32561;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32562;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32563;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f32564;

    public C10824() {
        try {
            m27068(6);
        } catch (C9413 unused) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27068(int i) throws C9413 {
        int i2;
        if (i < 0 || i > 9) {
            throw new C9413(C19370.m44628(i, "Unsupported preset: "));
        }
        this.f32562 = 3;
        this.f32560 = 2;
        this.f32564 = f32556[i];
        if (i <= 3) {
            this.f32558 = 1;
            this.f32559 = 4;
            this.f32561 = i <= 1 ? 128 : 273;
            this.f32563 = f32557[i];
            return;
        }
        this.f32558 = 2;
        this.f32559 = 20;
        if (i == 4) {
            i2 = 16;
        } else {
            i2 = i == 5 ? 32 : 64;
        }
        this.f32561 = i2;
        this.f32563 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27064(int i) throws C9413 {
        if (i < 4096) {
            throw new C9413(C18307.m42645(i, "LZMA2 dictionary size must be at least 4 KiB: ", " B"));
        }
        if (i > 805306368) {
            throw new C9413(C18307.m42645(i, "LZMA2 dictionary size must not exceed 768 MiB: ", " B"));
        }
        this.f32564 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27067() {
        return this.f32564;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27070() {
        return this.f32562;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m27071() {
        return this.f32560;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m27066() {
        return this.f32558;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m27065() {
        return this.f32561;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m27069() {
        return this.f32559;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27062() {
        return this.f32563;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6381 m27063(AbstractC6381 abstractC6381, C4265 c4265) {
        if (this.f32558 == 0) {
            return new C20702(abstractC6381, c4265);
        }
        return new C16467(abstractC6381, this, c4265);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
