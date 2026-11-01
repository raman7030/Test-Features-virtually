package p067l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4445 extends AbstractC7798 implements InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C19868 f9972;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4445(C19868 c19868, int i) {
        super(i);
        this.f9972 = c19868;
    }

    @Override // p067l.AbstractC11822
    /* JADX INFO: renamed from: ۧ */
    public final Object mo9280(int i) {
        C19868 c19868 = this.f9972;
        return c19868.f60379.f63463[c19868.f54863 + i];
    }

    @Override // p067l.AbstractC7798
    /* JADX INFO: renamed from: ֫ */
    public final void mo9279(int i, Object obj) {
        this.f9972.add(i, obj);
    }

    @Override // p067l.AbstractC7798
    /* JADX INFO: renamed from: ۧ */
    public final void mo9281(int i, Object obj) {
        this.f9972.set(i, obj);
    }

    @Override // p067l.AbstractC11822
    /* JADX INFO: renamed from: ܽ */
    public final void mo9282(int i) {
        this.f9972.remove(i);
    }

    @Override // p067l.AbstractC11822
    /* JADX INFO: renamed from: ֫ */
    public final int mo9278() {
        C19868 c19868 = this.f9972;
        return c19868.f54862 - c19868.f54863;
    }

    @Override // p067l.AbstractC11822, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C19868 c19868 = this.f9972;
        Object[] objArr = c19868.f60379.f63463;
        int i = c19868.f54863;
        int i2 = this.f32989;
        this.f32989 = i2 + 1;
        this.f32988 = i2;
        return objArr[i + i2];
    }

    @Override // p067l.AbstractC7798, p067l.InterfaceC16514
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C19868 c19868 = this.f9972;
        Object[] objArr = c19868.f60379.f63463;
        int i = c19868.f54863;
        int i2 = this.f32989 - 1;
        this.f32989 = i2;
        this.f32988 = i2;
        return objArr[i + i2];
    }

    @Override // p067l.AbstractC11822, java.util.Iterator, p067l.InterfaceC14185
    public final void forEachRemaining(Consumer consumer) {
        C19868 c19868 = this.f9972;
        Object[] objArr = c19868.f60379.f63463;
        int i = c19868.f54862 - c19868.f54863;
        while (true) {
            int i2 = this.f32989;
            if (i2 >= i) {
                return;
            }
            int i3 = c19868.f54863;
            this.f32989 = i2 + 1;
            this.f32988 = i2;
            consumer.m45213n(objArr[i3 + i2]);
        }
    }
}
