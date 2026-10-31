package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֡۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0434 extends AbstractC15710 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient int f1918;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC9608 f1919;

    @Override // l.InterfaceC0353
    public abstract AbstractC22725 get(Object obj);

    public AbstractC0434(AbstractC9608 abstractC9608, int i) {
        this.f1919 = abstractC9608;
        this.f1918 = i;
    }

    @Override // l.InterfaceC0353
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1989(Object obj) {
        return obj != null && super.mo1989(obj);
    }

    @Override // l.InterfaceC0353
    public final int size() {
        return this.f1918;
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set mo1991() {
        throw new AssertionError("unreachable");
    }

    @Override // l.AbstractC14299, l.InterfaceC0353
    /* JADX INFO: renamed from: ֫ */
    public AbstractC9608 mo1226() {
        return this.f1919;
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map mo1990() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC14299
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Collection mo1992() {
        return new C19486(this);
    }
}
