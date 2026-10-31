package l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C12607 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13312 f38012;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f38013;

    static {
        C3603.m11056(0);
        C3603.m11056(1);
    }

    public C12607(C13312 c13312, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c13312.f39854)) {
            throw new IndexOutOfBoundsException();
        }
        this.f38012 = c13312;
        this.f38013 = AbstractC14545.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12607.class == obj.getClass()) {
            C12607 c12607 = (C12607) obj;
            if (this.f38012.equals(c12607.f38012) && this.f38013.equals(c12607.f38013)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f38013.hashCode() * 31) + this.f38012.hashCode();
    }
}
