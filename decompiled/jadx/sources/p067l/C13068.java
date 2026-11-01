package p067l;

/* JADX INFO: renamed from: l.ۧ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13068 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public C5511 f36737;

    /* JADX INFO: renamed from: ۙ */
    public int f36738;

    /* JADX INFO: renamed from: ۛ */
    public C13266 f36739;

    /* JADX INFO: renamed from: ۤ */
    public C15276 f36740;

    /* JADX INFO: renamed from: ۨ */
    public C15038 f36741;

    /* JADX INFO: renamed from: ۫ */
    public C23994 f36742;

    /* JADX INFO: renamed from: ۬ */
    public C9534 f36743;

    /* JADX INFO: renamed from: ᩺ */
    public C23994 f36744;

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return i + 32;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18864 - ((C13068) obj).f18864;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29921(C5651 c5651) {
        C23994 c23994M53164 = C23994.m53164(this.f36742.m53168(), c5651);
        int i = this.f36738;
        C23994 c23994M53165 = C23994.m53164(this.f36744.m53168(), c5651);
        C15276 c15276 = this.f36740;
        C15038 c15038M34413 = null;
        C15276 c15276M34778 = c15276 != null ? c15276.m34778(c5651) : null;
        C13266 c13266 = this.f36739;
        C13266 c13266M30314 = c13266 != null ? C13266.m30314(c13266.m30317(), c5651) : null;
        C5511 c5511 = this.f36737;
        C5511 c5511M12143 = c5511 != null ? c5511.m12143(c5651) : null;
        C9534 c9534 = this.f36743;
        C9534 c9534M22216 = c9534 != null ? c9534.m22216(c5651) : null;
        C15038 c15038 = this.f36741;
        if (c15038 != null) {
            AbstractC17958[] abstractC17958Arr = c15038.m34414().f22284;
            AbstractC17958[] abstractC17958Arr2 = new AbstractC17958[abstractC17958Arr.length];
            int length = abstractC17958Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                abstractC17958Arr2[i2] = AbstractC17958.m40874(c5651, abstractC17958Arr[i2]);
            }
            c15038M34413 = C15038.m34413(c5651, new C8333(abstractC17958Arr2));
        }
        C13068 c13068 = new C13068(c5651);
        c13068.f36742 = c23994M53164;
        c13068.f36738 = i;
        c13068.f36744 = c23994M53165;
        c13068.f36740 = c15276M34778;
        c13068.f36739 = c13266M30314;
        c13068.f36737 = c5511M12143;
        c13068.f36743 = c9534M22216;
        c13068.f36741 = c15038M34413;
        if (c9534M22216 != null) {
            c9534M22216.m22220(c13068);
        }
        if (c5511M12143 != null) {
            c5511M12143.m12146(c13068);
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        AbstractC7230 abstractC7230M3722;
        C5651 c5651 = this.f18865;
        this.f36742 = (C23994) c5651.f13727.m3722(c12556.m28944());
        this.f36738 = c12556.m28944();
        C2535 c2535 = c5651.f13727;
        int iM28944 = c12556.m28944();
        AbstractC7230 abstractC7230M3723 = null;
        if (iM28944 == -1) {
            c2535.getClass();
            abstractC7230M3722 = null;
        } else {
            abstractC7230M3722 = c2535.m3722(iM28944);
        }
        this.f36744 = (C23994) abstractC7230M3722;
        this.f36740 = (C15276) c13936.m31713(EnumC16617.TYPE_TYPE_LIST, c12556.m28944());
        C2535 c2536 = c5651.f13748;
        int iM28945 = c12556.m28944();
        if (iM28945 == -1) {
            c2536.getClass();
        } else {
            abstractC7230M3723 = c2536.m3722(iM28945);
        }
        this.f36739 = (C13266) abstractC7230M3723;
        this.f36737 = (C5511) c13936.m31713(EnumC16617.TYPE_ANNOTATIONS_DIRECTORY_ITEM, c12556.m28944());
        this.f36743 = (C9534) c13936.m31713(EnumC16617.TYPE_CLASS_DATA_ITEM, c12556.m28944());
        this.f36741 = (C15038) c13936.m31713(EnumC16617.TYPE_ENCODED_ARRAY_ITEM, c12556.m28944());
        C9534 c9534 = this.f36743;
        if (c9534 != null) {
            c9534.m22220(this);
        }
        C5511 c5511 = this.f36737;
        if (c5511 != null) {
            c5511.m12146(this);
        }
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7531(this.f36742.f18866);
        c3838.m7531(this.f36738);
        C23994 c23994 = this.f36744;
        c3838.m7531(c23994 == null ? -1 : c23994.f18866);
        C15276 c15276 = this.f36740;
        c3838.m7531(c15276 == null ? 0 : c15276.f18864);
        C13266 c13266 = this.f36739;
        c3838.m7531(c13266 != null ? c13266.f18866 : -1);
        C5511 c5511 = this.f36737;
        c3838.m7531(c5511 == null ? 0 : c5511.f18864);
        C9534 c9534 = this.f36743;
        c3838.m7531(c9534 == null ? 0 : c9534.f18864);
        C15038 c15038 = this.f36741;
        c3838.m7531(c15038 != null ? c15038.f18864 : 0);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "class_def_item: " + this.f36742.m53168();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C23994 m29923() {
        return this.f36742;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C9534 m29924() {
        return this.f36743;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C15038 m29922() {
        if (this.f36741 == null) {
            this.f36741 = C15038.m34413(this.f18865, new C8333(new AbstractC17958[0]));
        }
        return this.f36741;
    }
}
