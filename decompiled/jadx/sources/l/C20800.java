package l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20800 extends AbstractC9490 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8805 f67338;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20800(C8805 c8805, int i) {
        super(i);
        this.f67338 = c8805;
    }

    @Override // l.AbstractC20779
    /* JADX INFO: renamed from: ۧ */
    public final int mo32199(int i) {
        C8805 c8805 = this.f67338;
        return c8805.f26810.f49020[c8805.f37861 + i];
    }

    @Override // l.AbstractC9490
    /* JADX INFO: renamed from: ֫ */
    public final void mo24327(int i, int i2) {
        this.f67338.add(i, i2);
    }

    @Override // l.AbstractC9490
    /* JADX INFO: renamed from: ۧ */
    public final void mo24328(int i, int i2) {
        this.f67338.set(i, i2);
    }

    @Override // l.AbstractC20779
    /* JADX INFO: renamed from: ܽ */
    public final void mo32200(int i) {
        this.f67338.mo3542(i);
    }

    @Override // l.AbstractC20779
    /* JADX INFO: renamed from: ֫ */
    public final int mo32198() {
        C8805 c8805 = this.f67338;
        return c8805.f37860 - c8805.f37861;
    }

    @Override // l.AbstractC20779, l.InterfaceC14529
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C8805 c8805 = this.f67338;
        int[] iArr = c8805.f26810.f49020;
        int i = c8805.f37861;
        int i2 = this.f67293;
        this.f67293 = i2 + 1;
        this.f67292 = i2;
        return iArr[i + i2];
    }

    @Override // l.AbstractC9490, l.InterfaceC15132
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo5655() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C8805 c8805 = this.f67338;
        int[] iArr = c8805.f26810.f49020;
        int i = c8805.f37861;
        int i2 = this.f67293 - 1;
        this.f67293 = i2;
        this.f67292 = i2;
        return iArr[i + i2];
    }

    @Override // l.AbstractC22436, l.InterfaceC20881
    public final void forEachRemaining(IntConsumer intConsumer) {
        C8805 c8805 = this.f67338;
        int[] iArr = c8805.f26810.f49020;
        int i = c8805.f37860 - c8805.f37861;
        while (true) {
            int i2 = this.f67293;
            if (i2 >= i) {
                return;
            }
            int i3 = c8805.f37861;
            this.f67293 = i2 + 1;
            this.f67292 = i2;
            intConsumer.accept(iArr[i3 + i2]);
        }
    }
}
