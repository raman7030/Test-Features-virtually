package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3257 implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f10224;

    public C3257(AbstractC14545 abstractC14545) {
        this.f10224 = abstractC14545;
    }

    public Object readResolve() {
        AbstractC14545 abstractC14545 = this.f10224;
        if (abstractC14545.isEmpty()) {
            return C13134.m31853();
        }
        if (abstractC14545.equals(AbstractC14545.of((Object) C13758.m33070()))) {
            return C13134.m31852();
        }
        return new C13134(abstractC14545);
    }
}
