package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16148 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4155 f49746;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49747 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49748 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5566 f49749;

    public C16148(C4155 c4155) {
        this.f49746 = c4155;
        this.f49749 = new C5566(c4155.f13561);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49747 < this.f49746.f13561.f69812;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f49747;
        this.f49747 = i + 1;
        this.f49748 = i;
        C5566 c5566 = this.f49749;
        c5566.f17246 = i;
        return c5566;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f49748 == -1) {
            throw new IllegalStateException();
        }
        this.f49748 = -1;
        C4155 c4155 = this.f49746;
        C21794 c21794 = c4155.f13561;
        int i = c21794.f69812;
        c21794.f69812 = i - 1;
        int i2 = this.f49747;
        int i3 = i2 - 1;
        this.f49747 = i3;
        int i4 = i - i2;
        Object[] objArr = c21794.f69816;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        Object[] objArr2 = c4155.f13561.f69811;
        int i5 = this.f49747;
        System.arraycopy(objArr2, i5 + 1, objArr2, i5, i4);
        this.f49749.f17246 = -1;
        C21794 c21795 = c4155.f13561;
        Object[] objArr3 = c21795.f69816;
        int i6 = c21795.f69812;
        objArr3[i6] = null;
        c21795.f69811[i6] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        int i = this.f49746.f13561.f69812;
        while (true) {
            int i2 = this.f49747;
            if (i2 >= i) {
                return;
            }
            this.f49747 = i2 + 1;
            this.f49748 = i2;
            C5566 c5566 = this.f49749;
            c5566.f17246 = i2;
            consumer.accept(c5566);
        }
    }
}
