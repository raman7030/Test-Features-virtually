package l;

import bin.mt.plus.Features;

/* JADX INFO: renamed from: l.۟۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7469 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f22994;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f22995;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f22996;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f22997;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f22998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f22999;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f23000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f23001;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f23002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f23003;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23004;

    public C7469(AbstractC15440 abstractC15440, String str) {
        this.f22994 = abstractC15440;
        this.f22995 = str;
        this.f23002 = abstractC15440.mo23113();
        this.f23003 = abstractC15440.mo23127();
        this.f22997 = abstractC15440.mo23117();
        this.f23001 = abstractC15440.m36533();
        this.f22999 = abstractC15440.mo27935();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20013() {
        AbstractC15440 abstractC15440 = this.f22994;
        try {
            if (abstractC15440.mo27917()) {
                C17642 c17642M27928 = abstractC15440.mo27925().m27928();
                this.f23004 = c17642M27928.m41291();
                this.f22996 = Features.m56(c17642M27928.m41283());
                this.f22998 = Features.m56(c17642M27928.m41281());
                this.f23000 = true;
                return;
            }
            if (abstractC15440 instanceof C13198) {
                C3321 c3321M32035 = ((C13198) abstractC15440).m32035();
                this.f23004 = c3321M32035.m10171();
                this.f22996 = Features.m56(c3321M32035.m10169());
                this.f22998 = Features.m56(c3321M32035.m10167());
                this.f23000 = true;
                return;
            }
            if (abstractC15440.mo35196()) {
                return;
            }
            C17642 c17642M46724 = C20402.m46724(abstractC15440.mo23554());
            this.f23004 = c17642M46724.m41291();
            this.f22996 = Features.m56(c17642M46724.m41283());
            this.f22998 = Features.m56(c17642M46724.m41281());
            this.f23000 = true;
        } catch (Exception unused) {
        }
    }
}
