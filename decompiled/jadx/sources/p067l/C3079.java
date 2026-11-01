package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5E8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3079 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final C24143 f5569;

    /* JADX INFO: renamed from: ۬ */
    public final C21186[] f5570;

    public C3079(C24143 c24143, C3948 c3948) {
        try {
            super(4, (c24143.size() * 4) + 4);
            this.f5569 = c24143;
            this.f5570 = new C21186[c24143.size()];
            Iterator it = c24143.getAnnotations().iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f5570[i] = new C21186(c3948, (C8050) it.next());
                i++;
            }
        } catch (NullPointerException unused) {
            throw new NullPointerException("list == null");
        }
    }

    public final int hashCode() {
        return this.f5569.hashCode();
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ֫ */
    public final int mo5190(AbstractC5289 abstractC5289) {
        return this.f5569.compareTo(((C3079) abstractC5289).f5569);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_ANNOTATION_SET_ITEM;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return this.f5569.toString();
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C6630 c6630M7844 = c3948.m7844();
        C21186[] c21186Arr = this.f5570;
        int length = c21186Arr.length;
        for (int i = 0; i < length; i++) {
            c21186Arr[i] = (C21186) c6630M7844.m15105(c21186Arr[i]);
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        C21186.m47851(this.f5570);
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        boolean zM44765 = c19705.m44765();
        C21186[] c21186Arr = this.f5570;
        int length = c21186Arr.length;
        if (zM44765) {
            c19705.m44760(0, m11433() + " annotation set");
            c19705.m44760(4, "  size: ".concat(C16351.m37155(length)));
        }
        c19705.m44773(length);
        for (int i = 0; i < length; i++) {
            int iM11432 = c21186Arr[i].m11432();
            if (zM44765) {
                c19705.m44760(4, "  entries[" + Integer.toHexString(i) + "]: " + C16351.m37155(iM11432));
                c21186Arr[i].m47852(c19705);
            }
            c19705.m44773(iM11432);
        }
    }
}
