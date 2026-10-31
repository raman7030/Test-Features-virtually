package l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۗܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3270 extends AbstractC0447 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11737 f10303;

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C3270(C11737 c11737) {
        this.f10303 = c11737;
    }

    @Override // l.InterfaceC5755
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8956(char c) {
        return this.f10303.m28640(c) != -1;
    }

    @Override // l.AbstractC0447
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2004(char c) {
        C11737 c11737 = this.f10303;
        int iM28640 = c11737.m28640(c);
        if (iM28640 == -1) {
            return false;
        }
        int i = (c11737.f35006 - iM28640) - 1;
        char[] cArr = c11737.f35010;
        int i2 = iM28640 + 1;
        System.arraycopy(cArr, i2, cArr, iM28640, i);
        char[] cArr2 = c11737.f35005;
        System.arraycopy(cArr2, i2, cArr2, iM28640, i);
        c11737.f35006--;
        return true;
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C20204(this);
    }

    @Override // l.AbstractC20910, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15900 iterator() {
        return new C20204(this);
    }

    @Override // l.AbstractC0447, l.AbstractC20910, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16770 spliterator() {
        return new C4681(this, 0, this.f10303.f35006);
    }

    @Override // l.AbstractC20910, l.InterfaceC9552
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10076(InterfaceC23662 interfaceC23662) {
        C11737 c11737 = this.f10303;
        char[] cArr = c11737.f35010;
        int i = c11737.f35006;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC23662.mo18328(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f10303.f35006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f10303.f35006 = 0;
    }
}
