package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۡ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V656 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10829 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC11500 f29996;

    public C10829(AbstractC11500 abstractC11500) {
        this.f29996 = abstractC11500;
    }

    public Object readResolve() {
        return this.f29996.entrySet();
    }
}
