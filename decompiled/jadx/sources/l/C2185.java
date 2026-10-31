package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1NC */
/* JADX INFO: loaded from: classes3.dex */
public final class C2185 extends AbstractC5713 implements InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18413 f7187;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2185(C18413 c18413, int i) {
        super(i);
        this.f7187 = c18413;
    }

    @Override // l.AbstractC9947
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo7201(int i) {
        C18413 c18413 = this.f7187;
        return c18413.f57160.f60231[c18413.f51683 + i];
    }

    @Override // l.AbstractC5713
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7200(int i, Object obj) {
        this.f7187.add(i, obj);
    }

    @Override // l.AbstractC5713
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7202(int i, Object obj) {
        this.f7187.set(i, obj);
    }

    @Override // l.AbstractC9947
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo7203(int i) {
        this.f7187.remove(i);
    }

    @Override // l.AbstractC9947
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo7199() {
        C18413 c18413 = this.f7187;
        return c18413.f51682 - c18413.f51683;
    }

    @Override // l.AbstractC9947, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C18413 c18413 = this.f7187;
        Object[] objArr = c18413.f57160.f60231;
        int i = c18413.f51683;
        int i2 = this.f30032;
        this.f30032 = i2 + 1;
        this.f30031 = i2;
        return objArr[i + i2];
    }

    @Override // l.AbstractC5713, l.InterfaceC14884
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        C18413 c18413 = this.f7187;
        Object[] objArr = c18413.f57160.f60231;
        int i = c18413.f51683;
        int i2 = this.f30032 - 1;
        this.f30032 = i2;
        this.f30031 = i2;
        return objArr[i + i2];
    }

    @Override // l.AbstractC9947, java.util.Iterator, l.InterfaceC12433
    public final void forEachRemaining(Consumer consumer) {
        C18413 c18413 = this.f7187;
        Object[] objArr = c18413.f57160.f60231;
        int i = c18413.f51682 - c18413.f51683;
        while (true) {
            int i2 = this.f30032;
            if (i2 >= i) {
                return;
            }
            int i3 = c18413.f51683;
            this.f30032 = i2 + 1;
            this.f30031 = i2;
            consumer.n(objArr[i3 + i2]);
        }
    }
}
