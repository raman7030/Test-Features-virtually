package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۤ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5608 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10313 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f31044;

    public C10313(Object[] objArr) {
        this.f31044 = objArr;
    }

    public Object readResolve() {
        return AbstractC6079.m16991(this.f31044);
    }
}
