package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩳ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19546 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f59506;

    public C19546(Object[] objArr) {
        this.f59506 = objArr;
    }

    public Object readResolve() {
        return AbstractC16192.m36882(this.f59506);
    }
}
