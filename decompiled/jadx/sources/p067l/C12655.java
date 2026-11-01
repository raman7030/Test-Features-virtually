package p067l;

/* JADX INFO: renamed from: l.ۧۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E1RG */
/* JADX INFO: loaded from: classes3.dex */
public final class C12655 implements Cloneable {

    /* JADX INFO: renamed from: ۛ */
    public static final int[] f35532 = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f35533 = {4, 8, 24, 48};

    /* JADX INFO: renamed from: ۗ */
    public int f35534;

    /* JADX INFO: renamed from: ۙ */
    public int f35535;

    /* JADX INFO: renamed from: ۫ */
    public int f35536;

    /* JADX INFO: renamed from: ۬ */
    public int f35537;

    /* JADX INFO: renamed from: ᩶ */
    public int f35538;

    /* JADX INFO: renamed from: ᩸ */
    public int f35539;

    /* JADX INFO: renamed from: ᩹ */
    public int f35540;

    public C12655() {
        try {
            m29113(6);
        } catch (C11314 unused) {
            throw new RuntimeException();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29113(int i) throws C11314 {
        int i2;
        if (i < 0 || i > 9) {
            throw new C11314(C20778.m46922(i, "Unsupported preset: "));
        }
        this.f35538 = 3;
        this.f35536 = 2;
        this.f35540 = f35532[i];
        if (i <= 3) {
            this.f35534 = 1;
            this.f35535 = 4;
            this.f35537 = i <= 1 ? 128 : 273;
            this.f35539 = f35533[i];
            return;
        }
        this.f35534 = 2;
        this.f35535 = 20;
        if (i == 4) {
            i2 = 16;
        } else {
            i2 = i == 5 ? 32 : 64;
        }
        this.f35537 = i2;
        this.f35539 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29109(int i) throws C11314 {
        if (i < 4096) {
            throw new C11314(C19768.m44906(i, "LZMA2 dictionary size must be at least 4 KiB: ", " B"));
        }
        if (i > 805306368) {
            throw new C11314(C19768.m44906(i, "LZMA2 dictionary size must not exceed 768 MiB: ", " B"));
        }
        this.f35540 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m29112() {
        return this.f35540;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m29115() {
        return this.f35538;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m29116() {
        return this.f35536;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m29111() {
        return this.f35534;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m29110() {
        return this.f35537;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m29114() {
        return this.f35535;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29107() {
        return this.f35539;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8433 m29108(AbstractC8433 abstractC8433, C6422 c6422) {
        if (this.f35534 == 0) {
            return new C22043(abstractC8433, c6422);
        }
        return new C18018(abstractC8433, this, c6422);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
