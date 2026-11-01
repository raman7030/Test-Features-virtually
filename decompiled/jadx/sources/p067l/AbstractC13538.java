package p067l;

import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ۨܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 9ARP */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13538 {

    /* JADX INFO: renamed from: ܽ */
    public static final C15334 f38087;

    /* JADX INFO: renamed from: ֫ */
    public final C22926 f38088;

    /* JADX INFO: renamed from: ۧ */
    public final C19359 f38089;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo14698();

    static {
        C15334 c15334 = new C15334(new C14878());
        f38087 = c15334;
        c15334.f43765 = Integer.MAX_VALUE;
    }

    public AbstractC13538(C22926 c22926, C19359 c19359) {
        this.f38088 = c22926;
        this.f38089 = c19359;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC18017 mo24911(AbstractC18017 abstractC18017) {
        AbstractC18017 abstractC18017M40997;
        C19359 c19359 = this.f38089;
        if (c19359 == null) {
            return abstractC18017;
        }
        synchronized (c19359) {
            abstractC18017M40997 = AbstractC18017.m40997(abstractC18017, this.f38089, new IdentityHashMap());
        }
        return abstractC18017M40997;
    }
}
