package p067l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15690 {

    /* JADX INFO: renamed from: ۧ */
    public static final C15690 f45476 = new C15690(AbstractC16192.m36872of());

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 f45477;

    static {
        C5792.m13032(0);
    }

    public C15690(List list) {
        this.f45477 = AbstractC16192.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 m35728() {
        return this.f45477;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35730() {
        return this.f45477.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35729(int i) {
        int i2 = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f45477;
            if (i2 >= abstractC16192.size()) {
                return false;
            }
            if (((C24408) abstractC16192.get(i2)).m53836() == i) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m35732() {
        int i = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f45477;
            if (i >= abstractC16192.size()) {
                return false;
            }
            if (((C24408) abstractC16192.get(i)).m53836() == 2 && ((C24408) abstractC16192.get(i)).m53839()) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m35731(int i) {
        int i2 = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f45477;
            if (i2 >= abstractC16192.size()) {
                return false;
            }
            C24408 c24408 = (C24408) abstractC16192.get(i2);
            if (c24408.m53838() && c24408.m53836() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15690.class != obj.getClass()) {
            return false;
        }
        return this.f45477.equals(((C15690) obj).f45477);
    }

    public final int hashCode() {
        return this.f45477.hashCode();
    }
}
