package p067l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֡۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2781 extends AbstractC17299 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ */
    public final transient int f4694;

    /* JADX INFO: renamed from: ۙ */
    public final transient AbstractC11500 f4695;

    @Override // p067l.InterfaceC2704
    public abstract AbstractC23966 get(Object obj);

    public AbstractC2781(AbstractC11500 abstractC11500, int i) {
        this.f4695 = abstractC11500;
        this.f4694 = i;
    }

    @Override // p067l.InterfaceC2704
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4365(Object obj) {
        return obj != null && super.mo4365(obj);
    }

    @Override // p067l.InterfaceC2704
    public final int size() {
        return this.f4694;
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ܽ */
    public final Set mo4367() {
        throw new AssertionError("unreachable");
    }

    @Override // p067l.AbstractC15958, p067l.InterfaceC2704
    /* JADX INFO: renamed from: ֫ */
    public AbstractC11500 mo3628() {
        return this.f4695;
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ۧ */
    public final Map mo4366() {
        throw new AssertionError("should never be called");
    }

    @Override // p067l.AbstractC15958
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo4368() {
        return new C20888(this);
    }
}
