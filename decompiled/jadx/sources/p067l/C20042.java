package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052C */
/* JADX INFO: loaded from: classes5.dex */
public final class C20042 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC4619 f60899;

    /* JADX INFO: renamed from: ۤ */
    public final EnumC5960 f60900;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC7971 f60901;

    /* JADX INFO: renamed from: ۬ */
    public final int f60902;

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45398(AbstractC7971[] abstractC7971Arr, C6630 c6630) {
        if (abstractC7971Arr == null) {
            throw new NullPointerException("sections == null");
        }
        if (((ArrayList) c6630.mo8960()).size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC7971 abstractC7971 : abstractC7971Arr) {
            EnumC5960 enumC5960 = null;
            AbstractC4619 abstractC4619 = null;
            AbstractC4619 abstractC46110 = null;
            int i = 0;
            for (AbstractC4619 abstractC46111 : abstractC7971.mo8960()) {
                EnumC5960 enumC5960Mo5191 = abstractC46111.mo5191();
                if (enumC5960Mo5191 != enumC5960) {
                    if (i != 0) {
                        arrayList.add(new C20042(enumC5960, abstractC7971, abstractC4619, abstractC46110, i));
                    }
                    i = 0;
                    abstractC4619 = abstractC46111;
                    enumC5960 = enumC5960Mo5191;
                }
                i++;
                abstractC46110 = abstractC46111;
            }
            if (i != 0) {
                arrayList.add(new C20042(enumC5960, abstractC7971, abstractC4619, abstractC46110, i));
            } else if (abstractC7971 == c6630) {
                arrayList.add(new C20042(c6630));
            }
        }
        c6630.m15102((AbstractC5289) new C16411(EnumC5960.TYPE_MAP_LIST, arrayList));
    }

    public C20042(EnumC5960 enumC5960, AbstractC7971 abstractC7971, AbstractC4619 abstractC4619, AbstractC4619 abstractC46110, int i) {
        super(4, 12);
        if (enumC5960 == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC4619 == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC46110 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f60900 = enumC5960;
        this.f60901 = abstractC7971;
        this.f60899 = abstractC4619;
        this.f60902 = i;
    }

    public C20042(C6630 c6630) {
        super(4, 12);
        if (c6630 == null) {
            throw new NullPointerException("section == null");
        }
        this.f60900 = EnumC5960.TYPE_MAP_LIST;
        this.f60901 = c6630;
        this.f60899 = null;
        this.f60902 = 1;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_MAP_ITEM;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C20042.class.getName());
        sb.append('{');
        sb.append(this.f60901.toString());
        sb.append(' ');
        sb.append(this.f60900.mo4819());
        sb.append('}');
        return sb.toString();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return toString();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        int iMo15101;
        EnumC5960 enumC5960 = this.f60900;
        int iM13371 = enumC5960.m13371();
        AbstractC7971 abstractC7971 = this.f60901;
        AbstractC4619 abstractC4619 = this.f60899;
        if (abstractC4619 == null) {
            iMo15101 = abstractC7971.m18448();
        } else {
            iMo15101 = abstractC7971.mo15101(abstractC4619);
        }
        boolean zM44765 = c19705.m44765();
        int i = this.f60902;
        if (zM44765) {
            c19705.m44760(0, m11433() + ' ' + enumC5960.m13372() + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(C16351.m37153(iM13371));
            sb.append(" // ");
            sb.append(enumC5960.toString());
            c19705.m44760(2, sb.toString());
            c19705.m44760(2, "  unused: 0");
            c19705.m44760(4, "  size:   ".concat(C16351.m37155(i)));
            c19705.m44760(4, "  offset: ".concat(C16351.m37155(iMo15101)));
        }
        c19705.m44770(iM13371);
        c19705.m44770(0);
        c19705.m44773(i);
        c19705.m44773(iMo15101);
    }
}
