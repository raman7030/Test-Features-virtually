package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩷ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21068 implements InterfaceC12063, InterfaceC12433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16127 f67969;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19657 f67972;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67971 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67970 = 0;

    public C21068(C16127 c16127) {
        this.f67969 = c16127;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67970 < this.f67969.f49693.f25674;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C8367 c8367 = this.f67969.f49693;
        int i = this.f67970;
        this.f67970 = i + 1;
        this.f67971 = i;
        C19657 c19657 = new C19657(c8367, i);
        this.f67972 = c19657;
        return c19657;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f67971 == -1) {
            throw new IllegalStateException();
        }
        this.f67971 = -1;
        C16127 c16127 = this.f67969;
        C8367 c8367 = c16127.f49693;
        int i = c8367.f25674;
        c8367.f25674 = i - 1;
        int i2 = this.f67970;
        int i3 = i2 - 1;
        this.f67970 = i3;
        int i4 = i - i2;
        Object[] objArr = c8367.f25678;
        System.arraycopy(objArr, i2, objArr, i3, i4);
        int[] iArr = c16127.f49693.f25673;
        int i5 = this.f67970;
        System.arraycopy(iArr, i5 + 1, iArr, i5, i4);
        this.f67972.f63466 = -1;
        C8367 c8368 = c16127.f49693;
        c8368.f25678[c8368.f25674] = null;
    }

    @Override // java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C16127 c16127 = this.f67969;
        int i = c16127.f49693.f25674;
        while (true) {
            int i2 = this.f67970;
            if (i2 >= i) {
                return;
            }
            C8367 c8367 = c16127.f49693;
            this.f67970 = i2 + 1;
            this.f67971 = i2;
            C19657 c19657 = new C19657(c8367, i2);
            this.f67972 = c19657;
            consumer.accept(c19657);
        }
    }
}
