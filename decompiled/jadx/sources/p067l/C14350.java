package p067l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۫᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14350 {

    /* JADX INFO: renamed from: ֫ */
    public final C15020 f41039;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 f41040;

    static {
        C5792.m13032(0);
        C5792.m13032(1);
    }

    public C14350(C15020 c15020, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c15020.f42921)) {
            throw new IndexOutOfBoundsException();
        }
        this.f41039 = c15020;
        this.f41040 = AbstractC16192.copyOf((Collection) list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14350.class == obj.getClass()) {
            C14350 c14350 = (C14350) obj;
            if (this.f41039.equals(c14350.f41039) && this.f41040.equals(c14350.f41040)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f41040.hashCode() * 31) + this.f41039.hashCode();
    }
}
