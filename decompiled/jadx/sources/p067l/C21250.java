package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21250 implements InterfaceC17480, InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C5156 f66789;

    /* JADX INFO: renamed from: ᩸ */
    public int f66790 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public int f66791 = 0;

    @Override // java.util.Iterator, p067l.InterfaceC14185
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C10776.m24825(this, consumer);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Character.valueOf(mo9752());
    }

    public C21250(C5156 c5156) {
        this.f66789 = c5156;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f66791 < this.f66789.f12130;
    }

    @Override // p067l.InterfaceC17480
    /* JADX INFO: renamed from: ֡ۧ */
    public final char mo9752() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        char[] cArr = this.f66789.f12129;
        int i = this.f66791;
        this.f66791 = i + 1;
        this.f66790 = i;
        return cArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f66790 == -1) {
            throw new IllegalStateException();
        }
        this.f66790 = -1;
        C5156 c5156 = this.f66789;
        int i = c5156.f12130;
        c5156.f12130 = i - 1;
        int i2 = this.f66791;
        int i3 = i2 - 1;
        this.f66791 = i3;
        char[] cArr = c5156.f12129;
        System.arraycopy(cArr, i2, cArr, i3, i - i2);
    }

    @Override // p067l.InterfaceC22214
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public final void forEachRemaining(InterfaceC24857 interfaceC24857) {
        C5156 c5156 = this.f66789;
        char[] cArr = c5156.f12129;
        while (true) {
            int i = this.f66791;
            if (i >= c5156.f12130) {
                return;
            }
            this.f66791 = i + 1;
            interfaceC24857.mo20276(cArr[i]);
        }
    }
}
