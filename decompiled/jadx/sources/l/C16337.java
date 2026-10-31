package l;

import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܽ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16337 extends AbstractC11462 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f50297;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C16337(C19161 c19161) {
        this.f50297 = c19161;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C3638(this.f50297);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C18455(this.f50297);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19161 c19161 = this.f50297;
        char[] cArr = c19161.f60376;
        Object[] objArr = c19161.f60386;
        if (c19161.f60384) {
            consumer.accept(objArr[c19161.f60377]);
        }
        int i = c19161.f60377;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (cArr[i2] != 0) {
                consumer.accept(objArr[i2]);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f50297.f60379;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f50297.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f50297.clear();
    }
}
