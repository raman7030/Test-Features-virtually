package p067l;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C9420 {

    /* JADX INFO: renamed from: ܳ */
    public static final ThreadLocal f25710 = new ThreadLocal();

    /* JADX INFO: renamed from: ܿ */
    public C15454 f25714;

    /* JADX INFO: renamed from: ܽ */
    public final C1012 f25713 = new C1012();

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f25711 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final C12103 f25712 = new C12103(this);

    /* JADX INFO: renamed from: ᩳ */
    public boolean f25715 = false;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13444 m21917() {
        if (this.f25714 == null) {
            this.f25714 = new C15454(this.f25712);
        }
        return this.f25714;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21919(AbstractC3541 abstractC3541) {
        this.f25713.remove(abstractC3541);
        ArrayList arrayList = this.f25711;
        int iIndexOf = arrayList.indexOf(abstractC3541);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
            this.f25715 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21918(long j) {
        ArrayList arrayList;
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = this.f25711;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC8079 interfaceC8079 = (InterfaceC8079) arrayList.get(i);
            if (interfaceC8079 != null) {
                C1012 c1012 = this.f25713;
                Long l2 = (Long) c1012.getOrDefault(interfaceC8079, null);
                if (l2 == null) {
                    interfaceC8079.mo6315(j);
                } else if (l2.longValue() < jUptimeMillis) {
                    c1012.remove(interfaceC8079);
                    interfaceC8079.mo6315(j);
                }
            }
            i++;
        }
        if (!this.f25715) {
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
                this.f25715 = false;
                return;
            }
        }
    }
}
