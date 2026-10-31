package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12442 implements InterfaceC15900, InterfaceC12433 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f37436 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6092 f37437;

    @Override // java.util.Iterator, l.InterfaceC12433
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C8846.m22855(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo7691());
    }

    public C12442(C6092 c6092) {
        this.f37437 = c6092;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37436 < this.f37437.f18671.f35006;
    }

    @Override // l.InterfaceC15900
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo7691() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f37437.f18671.f35005;
        int i = this.f37436;
        this.f37436 = i + 1;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f37436;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C6092 c6092 = this.f37437;
        C11737 c11737 = c6092.f18671;
        int i2 = c11737.f35006 - i;
        char[] cArr = c11737.f35010;
        System.arraycopy(cArr, i, cArr, i - 1, i2);
        char[] cArr2 = c6092.f18671.f35005;
        int i3 = this.f37436;
        System.arraycopy(cArr2, i3, cArr2, i3 - 1, i2);
        c6092.f18671.f35006--;
        this.f37436--;
    }

    @Override // l.InterfaceC20881
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC23662 interfaceC23662) {
        C11737 c11737 = this.f37437.f18671;
        char[] cArr = c11737.f35005;
        int i = c11737.f35006;
        while (true) {
            int i2 = this.f37436;
            if (i2 >= i) {
                return;
            }
            this.f37436 = i2 + 1;
            interfaceC23662.mo18328(cArr[i2]);
        }
    }
}
