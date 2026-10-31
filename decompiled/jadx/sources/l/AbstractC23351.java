package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩻֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23351 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f75020;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75021;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9241 f75022;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75023;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f75024;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f75025;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC23351 mo33645(int i, int i2, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo33646(int i, Object obj);

    public AbstractC23351(C9241 c9241) {
        this.f75022 = c9241;
        this.f75020 = 0;
        this.f75023 = c9241.f27977;
        this.f75024 = 0;
        this.f75021 = c9241.f27985;
        this.f75025 = false;
    }

    public AbstractC23351(C9241 c9241, int i, int i2, boolean z) {
        this.f75022 = c9241;
        this.f75024 = 0;
        this.f75020 = i;
        this.f75023 = i2;
        this.f75021 = z;
        this.f75025 = true;
    }

    public boolean tryAdvance(Consumer consumer) {
        boolean z = this.f75021;
        C9241 c9241 = this.f75022;
        if (z) {
            this.f75021 = false;
            this.f75024++;
            mo33646(c9241.f27977, consumer);
        } else {
            Object[] objArr = c9241.f27976;
            while (true) {
                int i = this.f75020;
                if (i >= this.f75023) {
                    return false;
                }
                if (objArr[i] != null) {
                    this.f75024++;
                    this.f75020 = i + 1;
                    mo33646(i, consumer);
                } else {
                    this.f75020 = i + 1;
                }
            }
        }
        return true;
    }

    public void forEachRemaining(Consumer consumer) {
        boolean z = this.f75021;
        C9241 c9241 = this.f75022;
        if (z) {
            this.f75021 = false;
            this.f75024++;
            mo33646(c9241.f27977, consumer);
        }
        Object[] objArr = c9241.f27976;
        while (true) {
            int i = this.f75020;
            if (i >= this.f75023) {
                return;
            }
            if (objArr[i] != null) {
                mo33646(i, consumer);
                this.f75024++;
            }
            this.f75020++;
        }
    }

    public final long estimateSize() {
        boolean z = this.f75025;
        C9241 c9241 = this.f75022;
        if (!z) {
            return c9241.f27980 - this.f75024;
        }
        int i = c9241.f27980;
        long j = i - this.f75024;
        if (c9241.f27985) {
            i--;
        }
        return Math.min(j, ((long) ((((double) i) / ((double) c9241.f27977)) * ((double) (this.f75023 - this.f75020)))) + (this.f75021 ? 1L : 0L));
    }

    public InterfaceC15234 trySplit() {
        Object objMo33645;
        int i;
        int i2 = this.f75020;
        int i3 = this.f75023;
        if (i2 < i3 - 1 && (i = (i3 - i2) >> 1) > 1) {
            int i4 = i + i2;
            objMo33645 = mo33645(i2, i4, this.f75021);
            this.f75020 = i4;
            this.f75021 = false;
            this.f75025 = true;
        } else {
            objMo33645 = null;
        }
        return (InterfaceC15234) objMo33645;
    }
}
