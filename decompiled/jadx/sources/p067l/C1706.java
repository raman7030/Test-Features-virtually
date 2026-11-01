package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿܶ */
/* JADX INFO: compiled from: 81CV */
/* JADX INFO: loaded from: classes5.dex */
public class C1706 implements InterfaceC1391 {

    /* JADX INFO: renamed from: ۜ */
    public AbstractC1251 f56454;

    /* JADX INFO: renamed from: ܺ */
    public int f56459;

    /* JADX INFO: renamed from: ܽ */
    public int f56460;

    /* JADX INFO: renamed from: ۡ */
    public AbstractC1251 f56455 = null;

    /* JADX INFO: renamed from: ֫ */
    public boolean f56453 = false;

    /* JADX INFO: renamed from: ܳ */
    public boolean f56458 = false;

    /* JADX INFO: renamed from: ۢ */
    public EnumC1741 f56456 = EnumC1741.UNKNOWN;

    /* JADX INFO: renamed from: ܿ */
    public int f56461 = 1;

    /* JADX INFO: renamed from: ᩳ */
    public C1566 f56462 = null;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f56464 = false;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f56457 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f56463 = new ArrayList();

    public C1706(AbstractC1251 abstractC1251) {
        this.f56454 = abstractC1251;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f56454.f28286.m37909());
        sb.append(":");
        sb.append(this.f56456);
        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f56464 ? Integer.valueOf(this.f56459) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f56463.size());
        sb.append(":d=");
        sb.append(this.f56457.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo37000(int i) {
        if (this.f56464) {
            return;
        }
        this.f56464 = true;
        this.f56459 = i;
        for (InterfaceC1391 interfaceC1391 : this.f56457) {
            interfaceC1391.mo8443(interfaceC1391);
        }
    }

    @Override // p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public final void mo8443(InterfaceC1391 interfaceC1391) {
        ArrayList<C1706> arrayList = this.f56463;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1706) it.next()).f56464) {
                return;
            }
        }
        this.f56458 = true;
        AbstractC1251 abstractC1251 = this.f56455;
        if (abstractC1251 != null) {
            abstractC1251.mo8443(this);
        }
        if (this.f56453) {
            this.f56454.mo8443(this);
            return;
        }
        C1706 c1706 = null;
        int i = 0;
        for (C1706 c1707 : arrayList) {
            if (!(c1707 instanceof C1566)) {
                i++;
                c1706 = c1707;
            }
        }
        if (c1706 != null && i == 1 && c1706.f56464) {
            C1566 c1566 = this.f56462;
            if (c1566 != null) {
                if (!c1566.f56464) {
                    return;
                } else {
                    this.f56460 = this.f56461 * c1566.f56459;
                }
            }
            mo37000(c1706.f56459 + this.f56460);
        }
        AbstractC1251 abstractC1252 = this.f56455;
        if (abstractC1252 != null) {
            abstractC1252.mo8443(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43020(AbstractC1251 abstractC1251) {
        this.f56457.add(abstractC1251);
        if (this.f56464) {
            abstractC1251.mo8443(abstractC1251);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43019() {
        this.f56463.clear();
        this.f56457.clear();
        this.f56464 = false;
        this.f56459 = 0;
        this.f56458 = false;
        this.f56453 = false;
    }
}
