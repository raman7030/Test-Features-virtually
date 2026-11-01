package p067l;

/* JADX INFO: renamed from: l.֫ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K434 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3864 {

    /* JADX INFO: renamed from: ֫ */
    public C13370 f8358;

    /* JADX INFO: renamed from: ۧ */
    public EnumC12582 f8359;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C15933 f8360;

    public C3864(C15933 c15933) {
        this.f8360 = c15933;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7620(C11281 c11281) {
        AbstractC14355 abstractC14355 = c11281.f31437;
        AbstractC12224 abstractC12224 = c11281.f31433;
        C15933 c15933 = this.f8360;
        if (abstractC14355 != null && abstractC12224 != c15933.f46073.f21725) {
            if (c15933.m36090(c11281.f31437, false) != null) {
                m7619(EnumC12582.VAR);
            } else {
                m7619(EnumC12582.EXPLICIT);
            }
        }
        if ((c11281.f31437 != null || abstractC12224 == c15933.f46073.f21725) && (c11281.f31437 == null || abstractC12224 != c15933.f46073.f21725)) {
            return;
        }
        m7619(EnumC12582.IMPLICIT);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7619(EnumC12582 enumC12582) {
        EnumC12582 enumC12583;
        EnumC12582 enumC12584 = this.f8359;
        if (enumC12584 == null) {
            this.f8359 = enumC12582;
            return;
        }
        if (enumC12584 == enumC12582 || enumC12584 == (enumC12583 = EnumC12582.ERROR)) {
            return;
        }
        this.f8359 = enumC12583;
        int i = enumC12584.f35349;
        EnumC12582 enumC12585 = EnumC12582.VAR;
        this.f8358 = (EnumC12477.f34956.m28726(this.f8360.f46076) || !(i == enumC12585.f35349 || enumC12582.f35349 == enumC12585.f35349)) ? C15933.f46071[enumC12584.f35349][enumC12582.f35349] : null;
    }
}
