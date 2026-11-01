package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BDC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10456 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public C3079 f28932;

    /* JADX INFO: renamed from: ۤ */
    public ArrayList f28933;

    /* JADX INFO: renamed from: ۫ */
    public ArrayList f28934;

    /* JADX INFO: renamed from: ۬ */
    public ArrayList f28935;

    public C10456() {
        super(4, -1);
        this.f28932 = null;
        this.f28935 = null;
        this.f28934 = null;
        this.f28933 = null;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m24174() {
        return this.f28932 == null && this.f28935 == null && this.f28934 == null && this.f28933 == null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m24175() {
        return this.f28932 != null && this.f28935 == null && this.f28934 == null && this.f28933 == null;
    }

    public final int hashCode() {
        C3079 c3079 = this.f28932;
        if (c3079 == null) {
            return 0;
        }
        return c3079.hashCode();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ֫ */
    public final int mo5190(AbstractC5289 abstractC5289) {
        if (!m24175()) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        C3079 c3079 = this.f28932;
        C3079 c30710 = ((C10456) abstractC5289).f28932;
        if (c3079 == c30710) {
            c3079.getClass();
            return 0;
        }
        EnumC5960 enumC5960Mo5191 = c3079.mo5191();
        EnumC5960 enumC5960Mo5192 = c30710.mo5191();
        if (enumC5960Mo5191 != enumC5960Mo5192) {
            return enumC5960Mo5191.compareTo(enumC5960Mo5192);
        }
        return c3079.mo5190(c30710);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24173(C24143 c24143, C3948 c3948) {
        if (this.f28932 != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.f28932 = new C3079(c24143, c3948);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24170(C10908 c10908, C24143 c24143, C3948 c3948) {
        if (this.f28935 == null) {
            this.f28935 = new ArrayList();
        }
        this.f28935.add(new C16017(c10908, new C3079(c24143, c3948)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24172(C23648 c23648, C24143 c24143, C3948 c3948) {
        if (this.f28934 == null) {
            this.f28934 = new ArrayList();
        }
        this.f28934.add(new C7301(c23648, new C3079(c24143, c3948)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24171(C23648 c23648, C15425 c15425, C3948 c3948) {
        if (this.f28933 == null) {
            this.f28933 = new ArrayList();
        }
        this.f28933.add(new C14676(c23648, c15425, c3948));
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C6630 c6630M7850 = c3948.m7850();
        C3079 c3079 = this.f28932;
        if (c3079 != null) {
            this.f28932 = (C3079) c6630M7850.m15105(c3079);
        }
        ArrayList arrayList = this.f28935;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C16017) it.next()).m36395(c3948);
            }
        }
        ArrayList arrayList2 = this.f28934;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C7301) it2.next()).m16863(c3948);
            }
        }
        ArrayList arrayList3 = this.f28933;
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C14676) it3.next()).m33570(c3948);
            }
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        throw new RuntimeException("unsupported");
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        m11431(((m24169(this.f28935) + m24169(this.f28934) + m24169(this.f28933)) * 8) + 16);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        boolean zM44765 = c19705.m44765();
        C3079 c3079 = this.f28932;
        int iM11432 = c3079 == null ? 0 : c3079.m11432();
        int iM24169 = m24169(this.f28935);
        int iM241610 = m24169(this.f28934);
        int iM241611 = m24169(this.f28933);
        if (zM44765) {
            c19705.m44760(0, m11433() + " annotations directory");
            c19705.m44760(4, "  class_annotations_off: ".concat(C16351.m37155(iM11432)));
            c19705.m44760(4, "  fields_size:           ".concat(C16351.m37155(iM24169)));
            c19705.m44760(4, "  methods_size:          ".concat(C16351.m37155(iM241610)));
            c19705.m44760(4, "  parameters_size:       ".concat(C16351.m37155(iM241611)));
        }
        c19705.m44773(iM11432);
        c19705.m44773(iM24169);
        c19705.m44773(iM241610);
        c19705.m44773(iM241611);
        if (iM24169 != 0) {
            Collections.sort(this.f28935);
            if (zM44765) {
                c19705.m44760(0, "  fields:");
            }
            Iterator it = this.f28935.iterator();
            while (it.hasNext()) {
                ((C16017) it.next()).m36396(c3948, c19705);
            }
        }
        if (iM241610 != 0) {
            Collections.sort(this.f28934);
            if (zM44765) {
                c19705.m44760(0, "  methods:");
            }
            Iterator it2 = this.f28934.iterator();
            while (it2.hasNext()) {
                ((C7301) it2.next()).m16864(c3948, c19705);
            }
        }
        if (iM241611 != 0) {
            Collections.sort(this.f28933);
            if (zM44765) {
                c19705.m44760(0, "  parameters:");
            }
            Iterator it3 = this.f28933.iterator();
            while (it3.hasNext()) {
                ((C14676) it3.next()).m33571(c3948, c19705);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m24169(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
