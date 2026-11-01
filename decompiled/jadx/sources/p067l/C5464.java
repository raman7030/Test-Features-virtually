package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5464 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC16192 f13033;

    public C5464(AbstractC16192 abstractC16192) {
        this.f13033 = abstractC16192;
    }

    public Object readResolve() {
        AbstractC16192 abstractC16192 = this.f13033;
        if (abstractC16192.isEmpty()) {
            return C14851.m33945();
        }
        if (abstractC16192.equals(AbstractC16192.m36873of((Object) C15444.m35185()))) {
            return C14851.m33944();
        }
        return new C14851(abstractC16192);
    }
}
