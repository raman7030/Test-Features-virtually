package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17716 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C6318 f52912;

    /* JADX INFO: renamed from: ᩶ */
    public int f52913 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public int f52914 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C7659 f52915;

    public C17716(C6318 c6318) {
        this.f52912 = c6318;
        this.f52915 = new C7659(c6318.f16375);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52913 < this.f52912.f16375.f72520;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f52913;
        this.f52913 = i + 1;
        this.f52914 = i;
        C7659 c7659 = this.f52915;
        c7659.f20086 = i;
        return c7659;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f52914 == -1) {
            throw new IllegalStateException();
        }
        this.f52914 = -1;
        C6318 c6318 = this.f52912;
        C23082 c23082 = c6318.f16375;
        int i = c23082.f72520;
        c23082.f72520 = i - 1;
        int i2 = this.f52913;
        int i3 = i2 - 1;
        this.f52913 = i3;
        int i4 = i - i2;
        Object[] objArr = c23082.f72524;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c6318.f16375.f72519;
        int i5 = this.f52913;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f52915.f20086 = -1;
        C23082 c23083 = c6318.f16375;
        Object[] objArr3 = c23083.f72524;
        int i6 = c23083.f72520;
        objArr3[i6] = null;
        c23083.f72519[i6] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f52912.f16375.f72520;
        while (true) {
            int i2 = this.f52913;
            if (i2 >= i) {
                return;
            }
            this.f52913 = i2 + 1;
            this.f52914 = i2;
            C7659 c7659 = this.f52915;
            c7659.f20086 = i2;
            consumer.accept(c7659);
        }
    }
}
