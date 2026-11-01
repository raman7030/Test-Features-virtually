package p067l;

/* JADX INFO: renamed from: l.ۧۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12600 extends AbstractC17054 {

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15951 f35390;

    public C12600(int i, AbstractC17054 abstractC17054, AbstractC15951 abstractC15951) {
        super(i, abstractC17054);
        this.f35390 = abstractC15951;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29008() {
        AbstractC15773 abstractC15773Mo29008 = super.mo29008();
        return abstractC15773Mo29008 == null ? abstractC15773Mo29008 : m29012((String) null, abstractC15773Mo29008);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29013(String str, boolean z) {
        this.f35390.getClass();
        AbstractC15773 abstractC15773Mo29013 = super.mo29013(AbstractC15951.m36202(str), z);
        return abstractC15773Mo29013 == null ? abstractC15773Mo29013 : m29012(str, abstractC15773Mo29013);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15773 mo29022(int i, C24431 c24431, String str, boolean z) {
        this.f35390.getClass();
        AbstractC15773 abstractC15773Mo29022 = super.mo29022(i, c24431, AbstractC15951.m36202(str), z);
        return abstractC15773Mo29022 == null ? abstractC15773Mo29022 : m29012(str, abstractC15773Mo29022);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29009(int i, String str, boolean z) {
        this.f35390.getClass();
        AbstractC15773 abstractC15773Mo29009 = super.mo29009(i, AbstractC15951.m36202(str), z);
        return abstractC15773Mo29009 == null ? abstractC15773Mo29009 : m29012(str, abstractC15773Mo29009);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29014(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super.mo29014(i, i2, i3, m29007(i2, objArr), m29007(i3, objArr2));
    }

    /* JADX INFO: renamed from: ֫ */
    private Object[] m29007(int i, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i];
                    System.arraycopy(objArr, 0, objArr2, 0, i);
                }
                String str = (String) objArr[i2];
                this.f35390.getClass();
                objArr2[i2] = AbstractC15951.m36206(str);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29017(String str, int i, String str2, String str3) {
        this.f35390.getClass();
        super.mo29017(AbstractC15951.m36206(str), i, str2, AbstractC15951.m36202(str3));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo14009(int i, String str, String str2, String str3, boolean z) {
        if (this.f50439 < 327680 && (i & 256) == 0) {
            super.mo14009(i, str, str2, str3, z);
        } else {
            this.f35390.getClass();
            super.mo14009(i, AbstractC15951.m36206(str), str2, AbstractC15951.m36205(str3), z);
        }
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29019(String str, String str2, C2973 c2973, Object... objArr) {
        this.f35390.getClass();
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = AbstractC15951.m36201(objArr[i]);
        }
        super.mo29019(str, AbstractC15951.m36205(str2), (C2973) AbstractC15951.m36201(c2973), objArr2);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ܽ */
    public final void mo29023(int i, String str) {
        this.f35390.getClass();
        super.mo29023(i, AbstractC15951.m36206(str));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29016(Object obj) {
        this.f35390.getClass();
        super.mo29016(AbstractC15951.m36201(obj));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29015(int i, String str) {
        this.f35390.getClass();
        super.mo29015(i, AbstractC15951.m36202(str));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29010(int i, C24431 c24431, String str, boolean z) {
        this.f35390.getClass();
        AbstractC15773 abstractC15773Mo29010 = super.mo29010(i, c24431, AbstractC15951.m36202(str), z);
        return abstractC15773Mo29010 == null ? abstractC15773Mo29010 : m29012(str, abstractC15773Mo29010);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29020(C3644 c3644, C3644 c3645, C3644 c3646, String str) {
        String strM36206;
        if (str == null) {
            strM36206 = null;
        } else {
            this.f35390.getClass();
            strM36206 = AbstractC15951.m36206(str);
        }
        super.mo29020(c3644, c3645, c3646, strM36206);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15773 mo29021(int i, C24431 c24431, String str, boolean z) {
        this.f35390.getClass();
        AbstractC15773 abstractC15773Mo29021 = super.mo29021(i, c24431, AbstractC15951.m36202(str), z);
        return abstractC15773Mo29021 == null ? abstractC15773Mo29021 : m29012(str, abstractC15773Mo29021);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29018(String str, String str2, String str3, C3644 c3644, C3644 c3645, int i) {
        AbstractC15951 abstractC15951 = this.f35390;
        abstractC15951.getClass();
        super.mo29018(str, AbstractC15951.m36202(str2), abstractC15951.m36207(str3, true), c3644, c3645, i);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29011(int i, C24431 c24431, C3644[] c3644Arr, C3644[] c3644Arr2, int[] iArr, String str, boolean z) {
        this.f35390.getClass();
        AbstractC15773 abstractC15773Mo29011 = super.mo29011(i, c24431, c3644Arr, c3644Arr2, iArr, AbstractC15951.m36202(str), z);
        return abstractC15773Mo29011 == null ? abstractC15773Mo29011 : m29012(str, abstractC15773Mo29011);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 m29012(String str, AbstractC15773 abstractC15773) {
        int i = this.f50439;
        AbstractC15951 abstractC15951 = this.f35390;
        return new C15713(i, str, abstractC15773, abstractC15951).m35771(new C15713(i, null, abstractC15773, abstractC15951));
    }
}
