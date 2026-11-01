package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes4.dex */
public final class C22436 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final Object f70786;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f70787;

    public C22436(Object obj, Object obj2) {
        this.f70786 = obj;
        this.f70787 = obj2;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22436)) {
            return false;
        }
        C22436 c22436 = (C22436) obj;
        Object obj2 = c22436.f70786;
        Object obj3 = this.f70786;
        if (obj3 == null) {
            zEquals = obj2 == null;
        } else {
            zEquals = obj3.equals(obj2);
        }
        if (zEquals) {
            Object obj4 = c22436.f70787;
            Object obj5 = this.f70787;
            if (obj5 == null) {
                zEquals2 = obj4 == null;
            } else {
                zEquals2 = obj5.equals(obj4);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9000(C4358.m9000(0, this.f70786), this.f70787), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f70786, this.f70787);
    }
}
