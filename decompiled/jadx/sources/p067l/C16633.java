package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܶۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16633 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C22670 f48884;

    /* JADX INFO: renamed from: ۙ */
    public int f48885 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f48886;

    /* JADX INFO: renamed from: ᩸ */
    public int f48887;

    /* JADX INFO: renamed from: ᩹ */
    public C7009 f48888;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C16633(C22670 c22670) {
        this.f48884 = c22670;
        int length = ((String) c22670.f71504).length();
        if (length < 0) {
            throw new IllegalArgumentException(C19768.m44906(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f48887 = length;
        this.f48886 = length;
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m37697() {
        int i = this.f48886;
        if (i < 0) {
            this.f48885 = 0;
            this.f48888 = null;
            return;
        }
        C22670 c22670 = this.f48884;
        if (i <= ((String) c22670.f71504).length()) {
            C17402 c17402 = (C17402) ((C15292) c22670.f71503).mo9100(c22670.f71504, Integer.valueOf(this.f48886));
            if (c17402 == null) {
                this.f48888 = new C7009(this.f48887, C9258.m21362(c22670.f71504), 1);
                this.f48886 = -1;
            } else {
                int iIntValue = ((Number) c17402.m39622()).intValue();
                int iIntValue2 = ((Number) c17402.m39623()).intValue();
                this.f48888 = iIntValue <= Integer.MIN_VALUE ? C7009.f18261 : new C7009(this.f48887, iIntValue - 1, 1);
                int i2 = iIntValue + iIntValue2;
                this.f48887 = i2;
                this.f48886 = i2 + (iIntValue2 == 0 ? 1 : 0);
            }
        } else {
            this.f48888 = new C7009(this.f48887, C9258.m21362(c22670.f71504), 1);
            this.f48886 = -1;
        }
        this.f48885 = 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f48885 == -1) {
            m37697();
        }
        if (this.f48885 == 0) {
            throw new NoSuchElementException();
        }
        C7009 c7009 = this.f48888;
        C13045.m29862((Object) c7009, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f48888 = null;
        this.f48885 = -1;
        return c7009;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48885 == -1) {
            m37697();
        }
        return this.f48885 == 1;
    }
}
