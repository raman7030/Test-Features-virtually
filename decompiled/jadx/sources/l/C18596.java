package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes5.dex */
public final class C18596 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC2368 f57676;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC3779 f57677;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC5895 f57678;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f57679;

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43133(AbstractC5895[] abstractC5895Arr, C4484 c4484) {
        if (abstractC5895Arr == null) {
            throw new NullPointerException("sections == null");
        }
        if (((ArrayList) c4484.mo6834()).size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC5895 abstractC5895 : abstractC5895Arr) {
            EnumC3779 enumC3779 = null;
            AbstractC2368 abstractC2368 = null;
            AbstractC2368 abstractC2369 = null;
            int i = 0;
            for (AbstractC2368 abstractC23610 : abstractC5895.mo6834()) {
                EnumC3779 enumC3779Mo2862 = abstractC23610.mo2862();
                if (enumC3779Mo2862 != enumC3779) {
                    if (i != 0) {
                        arrayList.add(new C18596(enumC3779, abstractC5895, abstractC2368, abstractC2369, i));
                    }
                    i = 0;
                    abstractC2368 = abstractC23610;
                    enumC3779 = enumC3779Mo2862;
                }
                i++;
                abstractC2369 = abstractC23610;
            }
            if (i != 0) {
                arrayList.add(new C18596(enumC3779, abstractC5895, abstractC2368, abstractC2369, i));
            } else if (abstractC5895 == c4484) {
                arrayList.add(new C18596(c4484));
            }
        }
        c4484.m13220((AbstractC3073) new C14775(EnumC3779.TYPE_MAP_LIST, arrayList));
    }

    public C18596(EnumC3779 enumC3779, AbstractC5895 abstractC5895, AbstractC2368 abstractC2368, AbstractC2368 abstractC2369, int i) {
        super(4, 12);
        if (enumC3779 == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC2368 == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC2369 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f57677 = enumC3779;
        this.f57678 = abstractC5895;
        this.f57676 = abstractC2368;
        this.f57679 = i;
    }

    public C18596(C4484 c4484) {
        super(4, 12);
        if (c4484 == null) {
            throw new NullPointerException("section == null");
        }
        this.f57677 = EnumC3779.TYPE_MAP_LIST;
        this.f57678 = c4484;
        this.f57676 = null;
        this.f57679 = 1;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_MAP_ITEM;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C18596.class.getName());
        sb.append('{');
        sb.append(this.f57678.toString());
        sb.append(' ');
        sb.append(this.f57677.mo2463());
        sb.append('}');
        return sb.toString();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return toString();
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        int iMo13219;
        EnumC3779 enumC3779 = this.f57677;
        int iM11435 = enumC3779.m11435();
        AbstractC5895 abstractC5895 = this.f57678;
        AbstractC2368 abstractC2368 = this.f57676;
        if (abstractC2368 == null) {
            iMo13219 = abstractC5895.m16522();
        } else {
            iMo13219 = abstractC5895.mo13219(abstractC2368);
        }
        boolean zM42506 = c18241.m42506();
        int i = this.f57679;
        if (zM42506) {
            c18241.m42501(0, m9391() + ' ' + enumC3779.m11436() + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(C14712.m35006(iM11435));
            sb.append(" // ");
            sb.append(enumC3779.toString());
            c18241.m42501(2, sb.toString());
            c18241.m42501(2, "  unused: 0");
            c18241.m42501(4, "  size:   ".concat(C14712.m35008(i)));
            c18241.m42501(4, "  offset: ".concat(C14712.m35008(iMo13219)));
        }
        c18241.m42511(iM11435);
        c18241.m42511(0);
        c18241.m42514(i);
        c18241.m42514(iMo13219);
    }
}
