package l;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7420 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f22797 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13769 f22801;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3432 f22800 = new C3432();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f22798 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10243 f22799 = new C10243(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f22802 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11654 m19943() {
        if (this.f22801 == null) {
            this.f22801 = new C13769(this.f22799);
        }
        return this.f22801;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19945(AbstractC1234 abstractC1234) {
        this.f22800.remove(abstractC1234);
        ArrayList arrayList = this.f22798;
        int iIndexOf = arrayList.indexOf(abstractC1234);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            this.f22802 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19944(long j) {
        ArrayList arrayList;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = this.f22798;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC6009 interfaceC6009 = (InterfaceC6009) arrayList.get(i);
            if (interfaceC6009 != null) {
                C3432 c3432 = this.f22800;
                Long l2 = (Long) c3432.getOrDefault(interfaceC6009, null);
                if (l2 == null) {
                    interfaceC6009.mo4071(j);
                } else if (l2.longValue() < jUptimeMillis) {
                    c3432.remove(interfaceC6009);
                    interfaceC6009.mo4071(j);
                }
            }
            i++;
        }
        if (!this.f22802) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                this.f22802 = false;
                return;
            }
        }
    }
}
