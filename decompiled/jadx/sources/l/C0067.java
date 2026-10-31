package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21EP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0067 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0773 f978;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f979 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f980 = 0;

    public C0067(C0773 c0773) {
        this.f978 = c0773;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f980 < this.f978.f2872;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f978.f2871;
        int i = this.f980;
        this.f980 = i + 1;
        this.f979 = i;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f979 == -1) {
            throw new IllegalStateException();
        }
        this.f979 = -1;
        C0773 c0773 = this.f978;
        int i = c0773.f2872;
        c0773.f2872 = i - 1;
        int i2 = this.f980;
        int i3 = i2 - 1;
        this.f980 = i3;
        Object[] objArr = c0773.f2871;
        System.arraycopy(objArr, i2, objArr, i3, i - i2);
        c0773.f2871[c0773.f2872] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C0773 c0773 = this.f978;
        Object[] objArr = c0773.f2871;
        while (true) {
            int i = this.f980;
            if (i >= c0773.f2872) {
                return;
            }
            this.f980 = i + 1;
            consumer.accept(objArr[i]);
        }
    }
}
