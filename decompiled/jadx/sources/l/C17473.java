package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAL0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17473 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f53392;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m40835() {
        return this.f53392;
    }

    public C17473(List list) {
        this.f53392 = list;
    }

    public final String toString() {
        return C1913.m6272((Collection) this.f53392, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C17473.class.equals(obj.getClass())) {
            return false;
        }
        return this.f53392.equals(((C17473) obj).f53392);
    }

    public final int hashCode() {
        return this.f53392.hashCode();
    }
}
