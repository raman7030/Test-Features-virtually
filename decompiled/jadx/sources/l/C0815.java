package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֨֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UCGS */
/* JADX INFO: loaded from: classes3.dex */
public final class C0815 implements InterfaceC16770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21983 f2980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f2981;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2982;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2983;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 16720;
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
        C21983 c21983 = this.f2980;
        char[] cArr = c21983.f70388;
        int i = this.f2982 ? this.f2983 : c21983.f70389;
        while (true) {
            int i2 = this.f2981;
            if (i2 >= i) {
                return;
            }
            interfaceC23662.mo18328(cArr[i2]);
            this.f2981++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC23662 interfaceC23662 = (InterfaceC23662) obj;
        int i = this.f2981;
        boolean z = this.f2982;
        C21983 c21983 = this.f2980;
        if (i >= (z ? this.f2983 : c21983.f70389)) {
            return false;
        }
        char[] cArr = c21983.f70388;
        this.f2981 = i + 1;
        interfaceC23662.mo18328(cArr[i]);
        return true;
    }

    public C0815(C21983 c21983) {
        this(c21983, 0, c21983.f70389, false);
    }

    public C0815(C21983 c21983, int i, int i2, boolean z) {
        this.f2980 = c21983;
        this.f2981 = i;
        this.f2983 = i2;
        this.f2982 = z;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return (this.f2982 ? this.f2983 : this.f2980.f70389) - this.f2981;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16770 trySplit() {
        boolean z = this.f2982;
        C21983 c21983 = this.f2980;
        int i = z ? this.f2983 : c21983.f70389;
        int i2 = this.f2981;
        int i3 = (i - i2) >> 1;
        if (i3 <= 1) {
            return null;
        }
        this.f2983 = i;
        int i4 = i3 + i2;
        this.f2981 = i4;
        this.f2982 = true;
        return new C0815(c21983, i2, i4, true);
    }
}
