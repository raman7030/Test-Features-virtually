package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۛۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7971 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20956;

    /* JADX INFO: renamed from: ۧ */
    public final C3948 f20957;

    /* JADX INFO: renamed from: ܽ */
    public int f20958;

    /* JADX INFO: renamed from: ܿ */
    public boolean f20959;

    /* JADX INFO: renamed from: ᩳ */
    public final String f20960;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo15101(AbstractC4619 abstractC4619);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo15106(C19705 c19705);

    /* JADX INFO: renamed from: ܳ */
    public abstract void mo15107();

    /* JADX INFO: renamed from: ᩳ */
    public abstract Collection mo8960();

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo15108();

    public AbstractC7971(String str, C3948 c3948, int i) {
        if (c3948 == null) {
            throw new NullPointerException("file == null");
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        this.f20960 = str;
        this.f20957 = c3948;
        this.f20956 = i;
        this.f20958 = -1;
        this.f20959 = false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C3948 m18447() {
        return this.f20957;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m18442() {
        return this.f20956;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m18448() {
        int i = this.f20958;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("fileOffset not set");
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m18446(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("fileOffset < 0");
        }
        if (this.f20958 >= 0) {
            throw new RuntimeException("fileOffset already set");
        }
        int i2 = this.f20956 - 1;
        int i3 = (i + i2) & (~i2);
        this.f20958 = i3;
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18444(C19705 c19705) {
        m18450();
        c19705.m44759(this.f20956);
        int iM44769 = c19705.m44769();
        int i = this.f20958;
        if (i < 0) {
            this.f20958 = iM44769;
        } else if (i != iM44769) {
            throw new RuntimeException("alignment mismatch: for " + this + ", at " + iM44769 + ", but expected " + this.f20958);
        }
        if (c19705.m44765()) {
            String str = this.f20960;
            if (str != null) {
                c19705.m44760(0, "\n" + str + ":");
            } else if (iM44769 != 0) {
                c19705.m44760(0, "\n");
            }
        }
        mo15106(c19705);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m18443(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("relative < 0");
        }
        int i2 = this.f20958;
        if (i2 >= 0) {
            return i2 + i;
        }
        throw new RuntimeException("fileOffset not yet set");
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m18449() {
        m18445();
        mo15107();
        this.f20959 = true;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m18450() {
        if (!this.f20959) {
            throw new RuntimeException("not prepared");
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m18445() {
        if (this.f20959) {
            throw new RuntimeException("already prepared");
        }
    }
}
