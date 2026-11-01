package p067l;

import com.umeng.analytics.pro.C0684bo;

/* JADX INFO: renamed from: l.۬ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14898 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public int f42482;

    /* JADX INFO: renamed from: ۙ */
    public C14368 f42483;

    /* JADX INFO: renamed from: ۬ */
    public EnumC13558 f42484;

    public C14898(C5651 c5651) {
        super(c5651);
        this.f42482 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14898 m34106(C5651 c5651) {
        EnumC13558 enumC13558 = this.f42484;
        C14368 c14368 = this.f42483;
        C23994 c23994 = c14368.f41076;
        C13266[] c13266Arr = null;
        C23994 c23994M53164 = c23994 == null ? null : C23994.m53164(c23994.m53168(), c5651);
        C13266[] c13266Arr2 = c14368.f41075;
        if (c13266Arr2 != null) {
            int length = c13266Arr2.length;
            C13266[] c13266Arr3 = new C13266[length];
            for (int i = 0; i < length; i++) {
                c13266Arr3[i] = C13266.m30314(c13266Arr2[i].m30317(), c5651);
            }
            c13266Arr = c13266Arr3;
        }
        C14368 c14369 = new C14368(c23994M53164, c13266Arr, c14368.m32969(c5651));
        C14898 c14898 = new C14898(c5651);
        c14898.f42482 = 0;
        c14898.f42484 = enumC13558;
        c14898.f42483 = c14369;
        return (C14898) c5651.f13746.m27254(c14898);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        this.f42484 = EnumC13558.m30859(c12556.m28941());
        this.f42483 = new C14368(this.f18865, c12556);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return this.f42483.mo7662(i + 1);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7529(this.f42484.f38136);
        this.f42483.mo7663(c3838);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return C1514.m34687(new StringBuilder("annotation_item @0x"), this.f18864);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C14898 c14898) {
        int i = this.f42484.f38136 - c14898.f42484.f38136;
        return i == 0 ? this.f42483.compareTo(c14898.f42483) : i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C14368 m34107() {
        return this.f42483;
    }

    public final int hashCode() {
        if (this.f42482 == 0) {
            byte b = this.f42484.f38136;
            this.f42482 = b;
            this.f42482 = this.f42483.hashCode() + (b * C0684bo.f2505j);
        }
        return this.f42482;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14898.class.equals(obj.getClass())) {
            C14898 c14898 = (C14898) obj;
            if (this.f42484 == c14898.f42484 && this.f42483.equals(c14898.f42483)) {
                return true;
            }
        }
        return false;
    }
}
