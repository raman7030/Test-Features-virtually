package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19867 implements InterfaceC15900, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2933 f64152;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f64153 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64154 = 0;

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo7691());
    }

    public C19867(C2933 c2933) {
        this.f64152 = c2933;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f64154 < this.f64152.f9331;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f64152.f9330;
        int i = this.f64154;
        this.f64154 = i + 1;
        this.f64153 = i;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f64153 == -1) {
            throw new IllegalStateException();
        }
        this.f64153 = -1;
        C2933 c2933 = this.f64152;
        int i = c2933.f9331;
        c2933.f9331 = i - 1;
        int i2 = this.f64154;
        int i3 = i2 - 1;
        this.f64154 = i3;
        char[] cArr = c2933.f9330;
        System.arraycopy(cArr, i2, cArr, i3, i - i2);
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C2933 c2933 = this.f64152;
        char[] cArr = c2933.f9330;
        while (true) {
            int i = this.f64154;
            if (i >= c2933.f9331) {
                return;
            }
            this.f64154 = i + 1;
            interfaceC23662.mo18328(cArr[i]);
        }
    }
}
