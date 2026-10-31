package l;

/* JADX INFO: renamed from: l.ۧۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C10766 extends AbstractC15452 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14292 f32415;

    public C10766(int i, AbstractC15452 abstractC15452, AbstractC14292 abstractC14292) {
        super(i, abstractC15452);
        this.f32415 = abstractC14292;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26963() {
        AbstractC14104 abstractC14104Mo26963 = super.mo26963();
        return abstractC14104Mo26963 == null ? abstractC14104Mo26963 : m26967((String) null, abstractC14104Mo26963);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26968(String str, boolean z) {
        this.f32415.getClass();
        AbstractC14104 abstractC14104Mo26968 = super.mo26968(AbstractC14292.m34069(str), z);
        return abstractC14104Mo26968 == null ? abstractC14104Mo26968 : m26967(str, abstractC14104Mo26968);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26977(int i, C23214 c23214, String str, boolean z) {
        this.f32415.getClass();
        AbstractC14104 abstractC14104Mo26977 = super.mo26977(i, c23214, AbstractC14292.m34069(str), z);
        return abstractC14104Mo26977 == null ? abstractC14104Mo26977 : m26967(str, abstractC14104Mo26977);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26964(int i, String str, boolean z) {
        this.f32415.getClass();
        AbstractC14104 abstractC14104Mo26964 = super.mo26964(i, AbstractC14292.m34069(str), z);
        return abstractC14104Mo26964 == null ? abstractC14104Mo26964 : m26967(str, abstractC14104Mo26964);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26969(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super.mo26969(i, i2, i3, m26962(i2, objArr), m26962(i3, objArr2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object[] m26962(int i, Object[] objArr) {
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
                this.f32415.getClass();
                objArr2[i2] = AbstractC14292.m34073(str);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26972(String str, int i, String str2, String str3) {
        this.f32415.getClass();
        super.mo26972(AbstractC14292.m34073(str), i, str2, AbstractC14292.m34069(str3));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo12089(int i, String str, String str2, String str3, boolean z) {
        if (this.f47310 < 327680 && (i & 256) == 0) {
            super.mo12089(i, str, str2, str3, z);
        } else {
            this.f32415.getClass();
            super.mo12089(i, AbstractC14292.m34073(str), str2, AbstractC14292.m34072(str3), z);
        }
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26974(String str, String str2, C0636 c0636, Object... objArr) {
        this.f32415.getClass();
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = AbstractC14292.m34068(objArr[i]);
        }
        super.mo26974(str, AbstractC14292.m34072(str2), (C0636) AbstractC14292.m34068(c0636), objArr2);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo26978(int i, String str) {
        this.f32415.getClass();
        super.mo26978(i, AbstractC14292.m34073(str));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26971(Object obj) {
        this.f32415.getClass();
        super.mo26971(AbstractC14292.m34068(obj));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26970(int i, String str) {
        this.f32415.getClass();
        super.mo26970(i, AbstractC14292.m34069(str));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26965(int i, C23214 c23214, String str, boolean z) {
        this.f32415.getClass();
        AbstractC14104 abstractC14104Mo26965 = super.mo26965(i, c23214, AbstractC14292.m34069(str), z);
        return abstractC14104Mo26965 == null ? abstractC14104Mo26965 : m26967(str, abstractC14104Mo26965);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26975(C1342 c1342, C1342 c1343, C1342 c1344, String str) {
        String strM34073;
        if (str == null) {
            strM34073 = null;
        } else {
            this.f32415.getClass();
            strM34073 = AbstractC14292.m34073(str);
        }
        super.mo26975(c1342, c1343, c1344, strM34073);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26976(int i, C23214 c23214, String str, boolean z) {
        this.f32415.getClass();
        AbstractC14104 abstractC14104Mo26976 = super.mo26976(i, c23214, AbstractC14292.m34069(str), z);
        return abstractC14104Mo26976 == null ? abstractC14104Mo26976 : m26967(str, abstractC14104Mo26976);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26973(String str, String str2, String str3, C1342 c1342, C1342 c1343, int i) {
        AbstractC14292 abstractC14292 = this.f32415;
        abstractC14292.getClass();
        super.mo26973(str, AbstractC14292.m34069(str2), abstractC14292.m34074(str3, true), c1342, c1343, i);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo26966(int i, C23214 c23214, C1342[] c1342Arr, C1342[] c1342Arr2, int[] iArr, String str, boolean z) {
        this.f32415.getClass();
        AbstractC14104 abstractC14104Mo26966 = super.mo26966(i, c23214, c1342Arr, c1342Arr2, iArr, AbstractC14292.m34069(str), z);
        return abstractC14104Mo26966 == null ? abstractC14104Mo26966 : m26967(str, abstractC14104Mo26966);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 m26967(String str, AbstractC14104 abstractC14104) {
        int i = this.f47310;
        AbstractC14292 abstractC14292 = this.f32415;
        return new C14041(i, str, abstractC14104, abstractC14292).m33651(new C14041(i, null, abstractC14104, abstractC14292));
    }
}
