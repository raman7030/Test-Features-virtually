package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15604 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12552 f44679;

    /* JADX INFO: renamed from: ᩹ */
    public C15903 f44682;

    /* JADX INFO: renamed from: ᩸ */
    public int f44681 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f44680 = 0;

    public C15604(C12552 c12552) {
        this.f44679 = c12552;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44680 < this.f44679.f35271.f31141;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C11211 c11211 = this.f44679.f35271;
        int i = this.f44680;
        this.f44680 = i + 1;
        this.f44681 = i;
        C15903 c15903 = new C15903(c11211, i);
        this.f44682 = c15903;
        return c15903;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f44681 == -1) {
            throw new IllegalStateException();
        }
        this.f44681 = -1;
        C12552 c12552 = this.f44679;
        C11211 c11211 = c12552.f35271;
        int i = c11211.f31141;
        c11211.f31141 = i - 1;
        int i2 = this.f44680;
        int i3 = i2 - 1;
        this.f44680 = i3;
        int i4 = i - i2;
        long[] jArr = c11211.f31145;
        System.arraycopy(jArr, i2, jArr, i3, i4);
        Object[] objArr = c12552.f35271.f31140;
        int i5 = this.f44680;
        System.arraycopy(objArr, i5 + 1, objArr, i5, i4);
        this.f44682.f46008 = -1;
        C11211 c11212 = c12552.f35271;
        c11212.f31140[c11212.f31141] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C12552 c12552 = this.f44679;
        int i = c12552.f35271.f31141;
        while (true) {
            int i2 = this.f44680;
            if (i2 >= i) {
                return;
            }
            C11211 c11211 = c12552.f35271;
            this.f44680 = i2 + 1;
            this.f44681 = i2;
            C15903 c15903 = new C15903(c11211, i2);
            this.f44682 = c15903;
            consumer.accept(c15903);
        }
    }
}
