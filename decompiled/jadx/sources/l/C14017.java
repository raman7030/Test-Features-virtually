package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14017 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C14017 f42393 = new C14017(AbstractC14545.of());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f42394;

    static {
        C3603.m11056(0);
    }

    public C14017(List list) {
        this.f42394 = AbstractC14545.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m33608() {
        return this.f42394;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33610() {
        return this.f42394.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33609(int i) {
        int i2 = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f42394;
            if (i2 >= abstractC14545.size()) {
                return false;
            }
            if (((C23190) abstractC14545.get(i2)).m51440() == i) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m33612() {
        int i = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f42394;
            if (i >= abstractC14545.size()) {
                return false;
            }
            if (((C23190) abstractC14545.get(i)).m51440() == 2 && ((C23190) abstractC14545.get(i)).m51443()) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33611(int i) {
        int i2 = 0;
        while (true) {
            AbstractC14545 abstractC14545 = this.f42394;
            if (i2 >= abstractC14545.size()) {
                return false;
            }
            C23190 c23190 = (C23190) abstractC14545.get(i2);
            if (c23190.m51442() && c23190.m51440() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14017.class != obj.getClass()) {
            return false;
        }
        return this.f42394.equals(((C14017) obj).f42394);
    }

    public final int hashCode() {
        return this.f42394.hashCode();
    }
}
