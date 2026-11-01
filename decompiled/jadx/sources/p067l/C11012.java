package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11012 implements InterfaceC13833, InterfaceC14185 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C6318 f30497;

    /* JADX INFO: renamed from: ᩹ */
    public C7659 f30500;

    /* JADX INFO: renamed from: ᩸ */
    public int f30499 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f30498 = 0;

    public C11012(C6318 c6318) {
        this.f30497 = c6318;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30498 < this.f30497.f16375.f72520;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C23082 c23082 = this.f30497.f16375;
        int i = this.f30498;
        this.f30498 = i + 1;
        this.f30499 = i;
        C7659 c7659 = new C7659(c23082, i);
        this.f30500 = c7659;
        return c7659;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f30499 == -1) {
            throw new IllegalStateException();
        }
        this.f30499 = -1;
        C6318 c6318 = this.f30497;
        C23082 c23082 = c6318.f16375;
        int i = c23082.f72520;
        c23082.f72520 = i - 1;
        int i2 = this.f30498;
        int i3 = i2 - 1;
        this.f30498 = i3;
        int i4 = i - i2;
        Object[] objArr = c23082.f72524;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c6318.f16375.f72519;
        int i5 = this.f30498;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f30500.f20086 = -1;
        C23082 c23083 = c6318.f16375;
        Object[] objArr3 = c23083.f72524;
        int i6 = c23083.f72520;
        objArr3[i6] = null;
        c23083.f72519[i6] = null;
    }

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C6318 c6318 = this.f30497;
        int i = c6318.f16375.f72520;
        while (true) {
            int i2 = this.f30498;
            if (i2 >= i) {
                return;
            }
            C23082 c23082 = c6318.f16375;
            this.f30498 = i2 + 1;
            this.f30499 = i2;
            C7659 c7659 = new C7659(c23082, i2);
            this.f30500 = c7659;
            consumer.accept(c7659);
        }
    }
}
