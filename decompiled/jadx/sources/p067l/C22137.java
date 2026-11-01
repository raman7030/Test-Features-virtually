package p067l;

import java.util.NoSuchElementException;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩷ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1QM */
/* JADX INFO: loaded from: classes5.dex */
public final class C22137 extends AbstractC11388 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C10737 f70021;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22137(C10737 c10737, int i) {
        super(i);
        this.f70021 = c10737;
    }

    @Override // p067l.AbstractC22117
    /* JADX INFO: renamed from: ۧ */
    public final int mo34298(int i) {
        C10737 c10737 = this.f70021;
        return c10737.f29735.f52158[c10737.f40887 + i];
    }

    @Override // p067l.AbstractC11388
    /* JADX INFO: renamed from: ֫ */
    public final void mo26337(int i, int i2) {
        this.f70021.add(i, i2);
    }

    @Override // p067l.AbstractC11388
    /* JADX INFO: renamed from: ۧ */
    public final void mo26338(int i, int i2) {
        this.f70021.set(i, i2);
    }

    @Override // p067l.AbstractC22117
    /* JADX INFO: renamed from: ܽ */
    public final void mo34299(int i) {
        this.f70021.mo5829(i);
    }

    @Override // p067l.AbstractC22117
    /* JADX INFO: renamed from: ֫ */
    public final int mo34297() {
        C10737 c10737 = this.f70021;
        return c10737.f40886 - c10737.f40887;
    }

    @Override // p067l.AbstractC22117, p067l.InterfaceC16177
    public final int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C10737 c10737 = this.f70021;
        int[] iArr = c10737.f29735.f52158;
        int i = c10737.f40887;
        int i2 = this.f69977;
        this.f69977 = i2 + 1;
        this.f69976 = i2;
        return iArr[i + i2];
    }

    @Override // p067l.AbstractC11388, p067l.InterfaceC16750
    /* JADX INFO: renamed from: ۖ֫ */
    public final int mo7885() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C10737 c10737 = this.f70021;
        int[] iArr = c10737.f29735.f52158;
        int i = c10737.f40887;
        int i2 = this.f69977 - 1;
        this.f69977 = i2;
        this.f69976 = i2;
        return iArr[i + i2];
    }

    @Override // p067l.AbstractC23692, p067l.InterfaceC22214
    public final void forEachRemaining(IntConsumer intConsumer) {
        C10737 c10737 = this.f70021;
        int[] iArr = c10737.f29735.f52158;
        int i = c10737.f40886 - c10737.f40887;
        while (true) {
            int i2 = this.f69977;
            if (i2 >= i) {
                return;
            }
            int i3 = c10737.f40887;
            this.f69977 = i2 + 1;
            this.f69976 = i2;
            intConsumer.accept(iArr[i3 + i2]);
        }
    }
}
