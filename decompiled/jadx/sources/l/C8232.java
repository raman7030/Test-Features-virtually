package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.۠ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes4.dex */
public class C8232 extends AbstractC13959 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f25347;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Collection f25348;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8232(C22343 c22343, InterfaceC2050 interfaceC2050, EnumC0121... enumC0121Arr) {
        super(interfaceC2050, enumC0121Arr);
        this.f25347 = c22343;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public boolean mo20401(EnumC0121 enumC0121, String str) {
        Collection collectionUnmodifiableCollection;
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        if (str == null) {
            collectionUnmodifiableCollection = null;
        } else {
            C1176 c1176Mo6224 = mo6224();
            c1176Mo6224.m3980(str);
            collectionUnmodifiableCollection = C20195.unmodifiableCollection(c1176Mo6224);
        }
        this.f25348 = collectionUnmodifiableCollection;
        return true;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܽ */
    public Collection mo6225() {
        return this.f25348;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public void mo20400(Iterable iterable) {
        C1176 c1176Mo6226;
        if (iterable == null) {
            c1176Mo6226 = mo6226();
        } else {
            this.f41660 = true;
            C1176 c1176Mo6224 = mo6224();
            c1176Mo6224.m3979(iterable, c1176Mo6224.f4224.f72410);
            c1176Mo6226 = c1176Mo6224;
        }
        this.f25348 = C20195.unmodifiableCollection(c1176Mo6226);
    }

    /* JADX INFO: renamed from: ᩻ */
    public C1176 mo6226() {
        C1176 c1176Mo6224 = mo6224();
        c1176Mo6224.m3980((String) null);
        return c1176Mo6224;
    }

    /* JADX INFO: renamed from: ۜ */
    public C1176 mo6224() {
        return new C1176(this.f25347);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public boolean mo20402(InterfaceC20758 interfaceC20758) {
        return C22343.m50079(this.f25347, this.f25348, interfaceC20758);
    }
}
