package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۫ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14193 implements InterfaceC17480, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩸ */
    public int f40453 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8158 f40454;

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C10776.m24825(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo9752());
    }

    public C14193(C8158 c8158) {
        this.f40454 = c8158;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40453 < this.f40454.f21527.f38006;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f40454.f21527.f38005;
        int i = this.f40453;
        this.f40453 = i + 1;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f40453;
        if (i == 0) {
            throw new IllegalStateException();
        }
        C8158 c8158 = this.f40454;
        C13523 c13523 = c8158.f21527;
        int i2 = c13523.f38006 - i;
        char[] cArr = c13523.f38010;
        System.arraycopy(cArr, i, cArr, i - 1, i2);
        char[] cArr2 = c8158.f21527.f38005;
        int i3 = this.f40453;
        System.arraycopy(cArr2, i3, cArr2, i3 - 1, i2);
        c8158.f21527.f38006--;
        this.f40453--;
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C13523 c13523 = this.f40454.f21527;
        char[] cArr = c13523.f38005;
        int i = c13523.f38006;
        while (true) {
            int i2 = this.f40453;
            if (i2 >= i) {
                return;
            }
            this.f40453 = i2 + 1;
            interfaceC24857.mo20276(cArr[i2]);
        }
    }
}
