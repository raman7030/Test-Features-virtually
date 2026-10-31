package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8509 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0747 f26017;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f26018;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f26019;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f26020;

    public C8509() {
        super(4, -1);
        this.f26017 = null;
        this.f26020 = null;
        this.f26019 = null;
        this.f26018 = null;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m22206() {
        return this.f26017 == null && this.f26020 == null && this.f26019 == null && this.f26018 == null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m22207() {
        return this.f26017 != null && this.f26020 == null && this.f26019 == null && this.f26018 == null;
    }

    public final int hashCode() {
        C0747 c0747 = this.f26017;
        if (c0747 == null) {
            return 0;
        }
        return c0747.hashCode();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ֫ */
    public final int mo2861(AbstractC3073 abstractC3073) {
        if (!m22207()) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        C0747 c0747 = this.f26017;
        C0747 c0748 = ((C8509) abstractC3073).f26017;
        if (c0747 == c0748) {
            c0747.getClass();
            return 0;
        }
        EnumC3779 enumC3779Mo2862 = c0747.mo2862();
        EnumC3779 enumC3779Mo2863 = c0748.mo2862();
        if (enumC3779Mo2862 != enumC3779Mo2863) {
            return enumC3779Mo2862.compareTo(enumC3779Mo2863);
        }
        return c0747.mo2861(c0748);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22205(C22911 c22911, C1662 c1662) {
        if (this.f26017 != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.f26017 = new C0747(c22911, c1662);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22202(C8985 c8985, C22911 c22911, C1662 c1662) {
        if (this.f26020 == null) {
            this.f26020 = new ArrayList();
        }
        this.f26020.add(new C14361(c8985, new C0747(c22911, c1662)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22204(C22390 c22390, C22911 c22911, C1662 c1662) {
        if (this.f26019 == null) {
            this.f26019 = new ArrayList();
        }
        this.f26019.add(new C5190(c22390, new C0747(c22911, c1662)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22203(C22390 c22390, C13738 c13738, C1662 c1662) {
        if (this.f26018 == null) {
            this.f26018 = new ArrayList();
        }
        this.f26018.add(new C12950(c22390, c13738, c1662));
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C4484 c4484M5620 = c1662.m5620();
        C0747 c0747 = this.f26017;
        if (c0747 != null) {
            this.f26017 = (C0747) c4484M5620.m13223(c0747);
        }
        ArrayList arrayList = this.f26020;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C14361) it.next()).m34262(c1662);
            }
        }
        ArrayList arrayList2 = this.f26019;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C5190) it2.next()).m14953(c1662);
            }
        }
        ArrayList arrayList3 = this.f26018;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C12950) it3.next()).m31483(c1662);
            }
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        throw new RuntimeException("unsupported");
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        m9389(((m22201(this.f26020) + m22201(this.f26019) + m22201(this.f26018)) * 8) + 16);
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        boolean zM42506 = c18241.m42506();
        C0747 c0747 = this.f26017;
        int iM9390 = c0747 == null ? 0 : c0747.m9390();
        int iM22201 = m22201(this.f26020);
        int iM22202 = m22201(this.f26019);
        int iM22203 = m22201(this.f26018);
        if (zM42506) {
            c18241.m42501(0, m9391() + " annotations directory");
            c18241.m42501(4, "  class_annotations_off: ".concat(C14712.m35008(iM9390)));
            c18241.m42501(4, "  fields_size:           ".concat(C14712.m35008(iM22201)));
            c18241.m42501(4, "  methods_size:          ".concat(C14712.m35008(iM22202)));
            c18241.m42501(4, "  parameters_size:       ".concat(C14712.m35008(iM22203)));
        }
        c18241.m42514(iM9390);
        c18241.m42514(iM22201);
        c18241.m42514(iM22202);
        c18241.m42514(iM22203);
        if (iM22201 != 0) {
            Collections.sort(this.f26020);
            if (zM42506) {
                c18241.m42501(0, "  fields:");
            }
            Iterator it = this.f26020.iterator();
            while (it.hasNext()) {
                ((C14361) it.next()).m34263(c1662, c18241);
            }
        }
        if (iM22202 != 0) {
            Collections.sort(this.f26019);
            if (zM42506) {
                c18241.m42501(0, "  methods:");
            }
            Iterator it2 = this.f26019.iterator();
            while (it2.hasNext()) {
                ((C5190) it2.next()).m14954(c1662, c18241);
            }
        }
        if (iM22203 != 0) {
            Collections.sort(this.f26018);
            if (zM42506) {
                c18241.m42501(0, "  parameters:");
            }
            Iterator it3 = this.f26018.iterator();
            while (it3.hasNext()) {
                ((C12950) it3.next()).m31484(c1662, c18241);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22201(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
