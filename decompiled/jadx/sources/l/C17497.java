package l;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17497 implements InterfaceC16791 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f53453;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53454;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f53455;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float[] f53456;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f53457;

    @Override // l.InterfaceC15234
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C11148.m27665(this, consumer);
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
        return C11148.m27666(this, consumer);
    }

    @Override // l.InterfaceC15234
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // l.InterfaceC1124
    public final void forEachRemaining(Object obj) {
        InterfaceC4113 interfaceC4113 = (InterfaceC4113) obj;
        C11003.requireNonNull(interfaceC4113);
        while (true) {
            int i = this.f53455;
            if (i >= this.f53454) {
                return;
            }
            interfaceC4113.mo12346(this.f53456[this.f53453 + i]);
            this.f53455++;
        }
    }

    @Override // l.InterfaceC1124
    public final boolean tryAdvance(Object obj) {
        InterfaceC4113 interfaceC4113 = (InterfaceC4113) obj;
        if (this.f53455 >= this.f53454) {
            return false;
        }
        C11003.requireNonNull(interfaceC4113);
        int i = this.f53455;
        this.f53455 = i + 1;
        interfaceC4113.mo12346(this.f53456[this.f53453 + i]);
        return true;
    }

    public C17497(int i, int i2, int i3, float[] fArr) {
        this.f53456 = fArr;
        this.f53453 = i;
        this.f53454 = i2;
        this.f53457 = i3 | 16720;
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        return this.f53454 - this.f53455;
    }

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return this.f53457;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC16791 trySplit() {
        int i = this.f53455;
        int i2 = (this.f53454 - i) >> 1;
        if (i2 <= 1) {
            return null;
        }
        int i3 = this.f53453 + i;
        this.f53455 = i + i2;
        return new C17497(i3, i2, this.f53457, this.f53456);
    }
}
