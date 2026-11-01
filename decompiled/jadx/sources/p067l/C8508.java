package p067l;

import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۜ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8508 extends AbstractC2793 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20579 f22846;

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C8508(C20579 c20579) {
        this.f22846 = c20579;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC17480 iterator() {
        return new C24601(this.f22846);
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C21920(this.f22846);
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public final void mo12109(InterfaceC24857 interfaceC24857) {
        C20579 c20579 = this.f22846;
        char[] cArr = c20579.f63607;
        if (c20579.f63615) {
            interfaceC24857.mo20276(cArr[c20579.f63608]);
        }
        int i = c20579.f63608;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            char c = cArr[i2];
            if (c != 0) {
                interfaceC24857.mo20276(c);
            }
            i = i2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22846.f63610;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        return this.f22846.mo15130(c);
    }

    @Override // p067l.AbstractC2793
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4381(char c) {
        C20579 c20579 = this.f22846;
        int i = c20579.f63610;
        c20579.mo15134(c);
        return c20579.f63610 != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f22846.clear();
    }
}
