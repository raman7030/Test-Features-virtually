package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C4344 implements InterfaceC16770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2933 f13980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f13981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f13983;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16721;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11127.m27611(this, consumer);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C11127.m27612(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final /* bridge */ /* synthetic */ Comparator getComparator() {
        getComparator();
        throw null;
    }

    @Override // l.InterfaceC16770, l.InterfaceC15234
    public final InterfaceC1790 getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        C2933 c2933 = this.f13980;
        char[] cArr = c2933.f9330;
        int i = this.f13982 ? this.f13983 : c2933.f9331;
        while (true) {
            int i2 = this.f13981;
            if (i2 >= i) {
                return;
            }
            interfaceC23662.mo18328(cArr[i2]);
            this.f13981++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        int i = this.f13981;
        boolean z = this.f13982;
        C2933 c2933 = this.f13980;
        if (i >= (z ? this.f13983 : c2933.f9331)) {
            return false;
        }
        char[] cArr = c2933.f9330;
        this.f13981 = i + 1;
        interfaceC23662.mo18328(cArr[i]);
        return true;
    }

    public C4344(C2933 c2933) {
        this(c2933, 0, c2933.f9331, false);
    }

    public C4344(C2933 c2933, int i, int i2, boolean z) {
        this.f13980 = c2933;
        this.f13981 = i;
        this.f13983 = i2;
        this.f13982 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f13982 ? this.f13983 : this.f13980.f9331) - this.f13981;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16770 trySplit() {
        boolean z = this.f13982;
        C2933 c2933 = this.f13980;
        int i = z ? this.f13983 : c2933.f9331;
        int i2 = this.f13981;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f13983 = i;
        int i4 = i3 + i2;
        this.f13981 = i4;
        this.f13982 = true;
        return new C4344(c2933, i2, i4, true);
    }
}
