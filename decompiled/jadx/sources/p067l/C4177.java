package p067l;

/* JADX INFO: renamed from: l.֫ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 544J */
/* JADX INFO: loaded from: classes2.dex */
public final class C4177 {

    /* JADX INFO: renamed from: ֫ */
    public final int f9197;

    /* JADX INFO: renamed from: ۧ */
    public final int f9198;

    public C4177(C18258 c18258) {
        int iMo11523 = c18258.f54532 == null ? -1 : c18258.f54532.mo11523();
        if (iMo11523 == -1 || c18258.f54530 == null) {
            this.f9197 = -1;
            this.f9198 = -1;
        } else {
            this.f9198 = c18258.f54530.m36526(iMo11523);
            this.f9197 = c18258.f54530.m36523(iMo11523, true);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m8456() {
        return this.f9198;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8455() {
        return this.f9197;
    }
}
