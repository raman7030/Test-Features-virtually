package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9637 extends AbstractC18809 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f29201;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f29202;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f29203;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16691 f29204 = new C16691();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8931 f29205;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f29206;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17586 f29207;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1875 f29208;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo24570(C8931 c8931) {
        C17586 c17586 = this.f29207;
        c17586.m41115(c17586.m41114() - 1);
        this.f29205.f27155 = this.f29208.mo6211(-1);
        C8931 c8932 = this.f29205;
        if (this.f29201 != null) {
            while (this.f29205 != c8931) {
                m24569();
                this.f29205 = this.f29205.f63075;
            }
        } else {
            this.f29205 = c8931;
        }
        c8932.f63075 = c8931;
        if (!this.f29206 || c8931 == null) {
            return;
        }
        c8931.m23041(c8932);
    }

    @Override // l.AbstractC18809
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo24565(int i) {
        C17586 c17586 = this.f29207;
        return i >= c17586.m41112(c17586.m41114() - 1);
    }

    public AbstractC9637(C1875 c1875) {
        C17586 c17586 = new C17586();
        this.f29207 = c17586;
        c17586.m41111(0);
        this.f29206 = true;
        this.f29208 = null;
        C16691 c16691 = this.f29204;
        c16691.f51224 = false;
        c16691.f51226 = null;
        c16691.f51225 = -1;
        this.f29205 = null;
        this.f29203 = 0;
        this.f29202 = false;
        ArrayList arrayList = this.f29201;
        if (arrayList != null && arrayList.remove((Object) null) && this.f29201.isEmpty()) {
            this.f29201 = null;
        }
        c17586.m41110();
        c17586.m41111(0);
        AbstractC11753 abstractC11753 = this.f59356;
        if (abstractC11753 != null) {
            abstractC11753.mo12834();
        }
        this.f29208 = c1875;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24572(int i) {
        if (m24567().getType() == i) {
            if (i == -1) {
                this.f29202 = true;
            }
            C16691 c16691 = this.f29204;
            c16691.f51224 = false;
            c16691.f51226 = null;
            c16691.f51225 = -1;
            mo9958();
            return;
        }
        InterfaceC0463 interfaceC0463Mo26268 = this.f29204.mo26268(this);
        if (this.f29206 && interfaceC0463Mo26268.mo2052() == -1) {
            C8931 c8931 = this.f29205;
            C9120 c9120 = new C9120(interfaceC0463Mo26268);
            c8931.getClass();
            c9120.f59876 = c8931;
            c8931.m23041(c9120);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24568() {
        this.f29206 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24560(InterfaceC2770 interfaceC2770) {
        if (this.f29201 == null) {
            this.f29201 = new ArrayList();
        }
        this.f29201.add(interfaceC2770);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m24557() {
        Iterator it = this.f29201.iterator();
        while (it.hasNext()) {
            ((InterfaceC2770) it.next()).mo8544(this.f29205);
            this.f29205.getClass();
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m24569() {
        int size = this.f29201.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC2770 interfaceC2770 = (InterfaceC2770) this.f29201.get(size);
            this.f29205.getClass();
            interfaceC2770.mo8541(this.f29205);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m24574() {
        return this.f29203;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24564(C16691 c16691) {
        this.f29204 = c16691;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m24567() {
        return this.f29208.mo6211(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24559(InterfaceC0463 interfaceC0463, String str, C2581 c2581) {
        this.f29203++;
        m43461().mo1935(this, interfaceC0463, interfaceC0463.getLine(), interfaceC0463.mo2049(), str, c2581);
    }

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC0463 mo9958() {
        InterfaceC0463 interfaceC0463M24567 = m24567();
        if (interfaceC0463M24567.getType() != -1) {
            this.f29208.mo6204();
        }
        ArrayList arrayList = this.f29201;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.f29206 || z) {
            if (this.f29204.f51224) {
                C8931 c8931 = this.f29205;
                C9120 c9120 = new C9120(interfaceC0463M24567);
                c8931.getClass();
                c9120.f59876 = c8931;
                c8931.m23041(c9120);
                ArrayList arrayList2 = this.f29201;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2770) it.next()).mo8542(c9120);
                    }
                }
            } else {
                C8931 c8932 = this.f29205;
                C18998 c18998 = new C18998(interfaceC0463M24567);
                c8932.getClass();
                c18998.f59876 = c8932;
                c8932.m23041(c18998);
                ArrayList arrayList3 = this.f29201;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC2770) it2.next()).mo8543(c18998);
                    }
                }
            }
        }
        return interfaceC0463M24567;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo24562(C8931 c8931, int i, int i2) {
        C8931 c8932;
        C8931 c8933;
        m43459(i);
        this.f29205 = c8931;
        c8931.f27156 = this.f29208.mo6211(1);
        if (this.f29206 && (c8933 = (c8932 = this.f29205).f63075) != null) {
            c8933.m23041(c8932);
        }
        if (this.f29201 != null) {
            m24557();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void mo24571() {
        if (this.f29202) {
            this.f29205.f27155 = this.f29208.mo6211(1);
        } else {
            this.f29205.f27155 = this.f29208.mo6211(-1);
        }
        if (this.f29201 != null) {
            m24569();
        }
        m43459(this.f29205.f63074);
        this.f29205 = this.f29205.f63075;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24561(C8931 c8931) {
        C8931 c8932;
        C8931 c8933;
        if (this.f29206 && (c8932 = this.f29205) != c8931 && (c8933 = c8932.f63075) != null) {
            ArrayList arrayList = c8933.f27154;
            if (arrayList != null) {
                C18473.m42953(arrayList, 1);
            }
            c8933.m23041(c8931);
        }
        this.f29205 = c8931;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m24556() {
        C17586 c17586 = this.f29207;
        if (c17586.m41113()) {
            return -1;
        }
        return c17586.m41112(c17586.m41114() - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo24563(C8931 c8931, int i, int i2, int i3) {
        m43459(i);
        this.f29207.m41111(i3);
        this.f29205 = c8931;
        c8931.f27156 = this.f29208.mo6211(1);
        if (this.f29201 != null) {
            m24557();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24558(int i, C8931 c8931) {
        C8931 c8932 = this.f29205;
        c8932.f63075 = c8931;
        c8932.f63074 = i;
        c8932.f27155 = this.f29208.mo6211(-1);
        this.f29205 = c8931;
        c8931.f27156 = c8932.f27156;
        if (this.f29206) {
            c8931.m23041(c8932);
        }
        if (this.f29201 != null) {
            m24557();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8931 m24566() {
        return this.f29205;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23936 m24573() {
        return mo1330().m48893(m43462(), this.f29205);
    }
}
