package p067l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۧ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12674 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC12674 f35569 = new C12178();

    /* JADX INFO: renamed from: ֫ */
    public abstract Set mo7901();

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC15529 mo7902();

    /* JADX INFO: renamed from: ܽ */
    public abstract InterfaceC15529 mo7903();

    /* JADX INFO: renamed from: ᩳ */
    public abstract InterfaceC15529 mo7904();

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC12674 m29153(C14645 c14645, int i) {
        if (i == 0) {
            return f35569;
        }
        return new C3956(c14645, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Set m29151(C14645 c14645, int i) {
        if (i != 0) {
            return new C8154(c14645, i, c14645.m33504().mo13855(i));
        }
        return AbstractC8146.m18915of();
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m29152(C14645 c14645, int i) {
        if (i > 0) {
            return new C13519(c14645, i, c14645.m33504().mo13855(i));
        }
        return AbstractC16192.m36872of();
    }
}
