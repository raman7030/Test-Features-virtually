package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ܽܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16698 extends AbstractC11055 implements InterfaceC2050 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC11055 f51260;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f51261;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f51262;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Collection f51263;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f51264;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51265;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f51266;

    @Override // l.InterfaceC2050
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6726() {
        return getName().matches("\\bMODULE\\b");
    }

    public C16698(C22343 c22343, AbstractC11055 abstractC11055, String str, String str2, Collection collection, boolean z) {
        this.f51262 = c22343;
        this.f51260 = abstractC11055;
        this.f51264 = str;
        this.f51266 = str2;
        this.f51263 = collection;
        this.f51261 = z;
    }

    @Override // l.InterfaceC2050
    public final String getName() {
        return this.f51264;
    }

    @Override // l.InterfaceC2050
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6727() {
        return this.f51261;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܽ */
    public final Collection mo6225() {
        return C20195.unmodifiableCollection(this.f51263);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        this.f51260.mo23049(iterable, this.f51266);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo23049(Iterable iterable, String str) {
        throw new UnsupportedOperationException("not supported for " + this.f51264);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ᩳ */
    public final String mo27439() {
        return this.f51266;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        return C22343.m50079(this.f51262, this.f51263, interfaceC20758);
    }

    public final String toString() {
        return this.f51264;
    }
}
