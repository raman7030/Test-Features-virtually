package l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۨܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 9ARP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11753 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13643 f35088;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21631 f35089;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17878 f35090;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12834();

    static {
        C13643 c13643 = new C13643(new C13163());
        f35088 = c13643;
        c13643.f40684 = Integer.MAX_VALUE;
    }

    public AbstractC11753(C21631 c21631, C17878 c17878) {
        this.f35089 = c21631;
        this.f35090 = c17878;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC16466 mo22940(AbstractC16466 abstractC16466) {
        AbstractC16466 abstractC16466M38771;
        C17878 c17878 = this.f35090;
        if (c17878 == null) {
            return abstractC16466;
        }
        synchronized (c17878) {
            abstractC16466M38771 = AbstractC16466.m38771(abstractC16466, this.f35090, new IdentityHashMap());
        }
        return abstractC16466M38771;
    }
}
