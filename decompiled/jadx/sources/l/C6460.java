package l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۜ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6460 extends AbstractC0447 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f19973;

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C6460(C19161 c19161) {
        this.f19973 = c19161;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15900 iterator() {
        return new C23393(this.f19973);
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C20572(this.f19973);
    }

    @Override // l.AbstractC20910, l.InterfaceC9552
    /* JADX INFO: renamed from: ֫ */
    public final void mo10076(InterfaceC23662 interfaceC23662) {
        C19161 c19161 = this.f19973;
        char[] cArr = c19161.f60376;
        if (c19161.f60384) {
            interfaceC23662.mo18328(cArr[c19161.f60377]);
        }
        int i = c19161.f60377;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC23662.mo18328(c);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19973.f60379;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8956(char c) {
        return this.f19973.mo13247(c);
    }

    @Override // l.AbstractC0447
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2004(char c) {
        C19161 c19161 = this.f19973;
        int i = c19161.f60379;
        c19161.mo13251(c);
        return c19161.f60379 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f19973.clear();
    }
}
