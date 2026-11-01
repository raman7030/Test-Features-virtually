package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAL0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18975 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f56579;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ֫ */
    public final List m43093() {
        return this.f56579;
    }

    public C18975(List list) {
        this.f56579 = list;
    }

    public final String toString() {
        return C4187.m8474((Collection) this.f56579, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18975.class.equals(obj.getClass())) {
            return false;
        }
        return this.f56579.equals(((C18975) obj).f56579);
    }

    public final int hashCode() {
        return this.f56579.hashCode();
    }
}
