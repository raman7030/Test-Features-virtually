package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11527 extends AbstractC20244 {

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f32150;

    /* JADX INFO: renamed from: ۡ */
    public boolean f32151;

    /* JADX INFO: renamed from: ۢ */
    public int f32152;

    /* JADX INFO: renamed from: ܳ */
    public C18231 f32153 = new C18231();

    /* JADX INFO: renamed from: ܿ */
    public C10856 f32154;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f32155;

    /* JADX INFO: renamed from: ᩷ */
    public final C19082 f32156;

    /* JADX INFO: renamed from: ᩻ */
    public C4150 f32157;

    /* JADX INFO: renamed from: ۧ */
    public void mo26584(C10856 c10856) {
        C19082 c19082 = this.f32156;
        c19082.m43361(c19082.m43360() - 1);
        this.f32154.f30090 = this.f32157.mo8413(-1);
        C10856 c10857 = this.f32154;
        if (this.f32150 != null) {
            while (this.f32154 != c10856) {
                m26583();
                this.f32154 = this.f32154.f65695;
            }
        } else {
            this.f32154 = c10856;
        }
        c10857.f65695 = c10856;
        if (!this.f32155 || c10856 == null) {
            return;
        }
        c10856.m25015(c10857);
    }

    @Override // p067l.AbstractC20244
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26579(int i) {
        C19082 c19082 = this.f32156;
        return i >= c19082.m43358(c19082.m43360() - 1);
    }

    public AbstractC11527(C4150 c4150) {
        C19082 c19082 = new C19082();
        this.f32156 = c19082;
        c19082.m43357(0);
        this.f32155 = true;
        this.f32157 = null;
        C18231 c18231 = this.f32153;
        c18231.f54409 = false;
        c18231.f54411 = null;
        c18231.f54410 = -1;
        this.f32154 = null;
        this.f32152 = 0;
        this.f32151 = false;
        ArrayList arrayList = this.f32150;
        if (arrayList != null && arrayList.remove((Object) null) && this.f32150.isEmpty()) {
            this.f32150 = null;
        }
        c19082.m43356();
        c19082.m43357(0);
        AbstractC13538 abstractC13538 = this.f62583;
        if (abstractC13538 != null) {
            abstractC13538.mo14698();
        }
        this.f32157 = c4150;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26586(int i) {
        if (m26581().getType() == i) {
            if (i == -1) {
                this.f32151 = true;
            }
            C18231 c18231 = this.f32153;
            c18231.f54409 = false;
            c18231.f54411 = null;
            c18231.f54410 = -1;
            mo11991();
            return;
        }
        InterfaceC2808 interfaceC2808Mo28297 = this.f32153.mo28297(this);
        if (this.f32155 && interfaceC2808Mo28297.mo4432() == -1) {
            C10856 c10856 = this.f32154;
            C11036 c11036 = new C11036(interfaceC2808Mo28297);
            c10856.getClass();
            c11036.f63105 = c10856;
            c10856.m25015(c11036);
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m26582() {
        this.f32155 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26574(InterfaceC5001 interfaceC5001) {
        if (this.f32150 == null) {
            this.f32150 = new ArrayList();
        }
        this.f32150.add(interfaceC5001);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m26571() {
        Iterator it = this.f32150.iterator();
        while (it.hasNext()) {
            ((InterfaceC5001) it.next()).mo10607(this.f32154);
            this.f32154.getClass();
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m26583() {
        int size = this.f32150.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC5001 interfaceC5001 = (InterfaceC5001) this.f32150.get(size);
            this.f32154.getClass();
            interfaceC5001.mo10604(this.f32154);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final int m26588() {
        return this.f32152;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26578(C18231 c18231) {
        this.f32153 = c18231;
    }

    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC2808 m26581() {
        return this.f32157.mo8413(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26573(InterfaceC2808 interfaceC2808, String str, C4821 c4821) {
        this.f32152++;
        m45730().mo4327(this, interfaceC2808, interfaceC2808.getLine(), interfaceC2808.mo4429(), str, c4821);
    }

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC2808 mo11991() {
        InterfaceC2808 interfaceC2808M26581 = m26581();
        if (interfaceC2808M26581.getType() != -1) {
            this.f32157.mo8406();
        }
        ArrayList arrayList = this.f32150;
        boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (this.f32155 || z) {
            if (this.f32153.f54409) {
                C10856 c10856 = this.f32154;
                C11036 c11036 = new C11036(interfaceC2808M26581);
                c10856.getClass();
                c11036.f63105 = c10856;
                c10856.m25015(c11036);
                ArrayList arrayList2 = this.f32150;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC5001) it.next()).mo10605(c11036);
                    }
                }
            } else {
                C10856 c10857 = this.f32154;
                C20424 c20424 = new C20424(interfaceC2808M26581);
                c10857.getClass();
                c20424.f63105 = c10857;
                c10857.m25015(c20424);
                ArrayList arrayList3 = this.f32150;
                if (arrayList3 != null) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5001) it2.next()).mo10606(c20424);
                    }
                }
            }
        }
        return interfaceC2808M26581;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26576(C10856 c10856, int i, int i2) {
        C10856 c10857;
        C10856 c10858;
        m45728(i);
        this.f32154 = c10856;
        c10856.f30091 = this.f32157.mo8413(1);
        if (this.f32155 && (c10858 = (c10857 = this.f32154).f65695) != null) {
            c10858.m25015(c10857);
        }
        if (this.f32150 != null) {
            m26571();
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo26585() {
        if (this.f32151) {
            this.f32154.f30090 = this.f32157.mo8413(1);
        } else {
            this.f32154.f30090 = this.f32157.mo8413(-1);
        }
        if (this.f32150 != null) {
            m26583();
        }
        m45728(this.f32154.f65694);
        this.f32154 = this.f32154.f65695;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26575(C10856 c10856) {
        C10856 c10857;
        C10856 c10858;
        if (this.f32155 && (c10857 = this.f32154) != c10856 && (c10858 = c10857.f65695) != null) {
            ArrayList arrayList = c10858.f30089;
            if (arrayList != null) {
                C19925.m45229(arrayList, 1);
            }
            c10858.m25015(c10856);
        }
        this.f32154 = c10856;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m26570() {
        C19082 c19082 = this.f32156;
        if (c19082.m43359()) {
            return -1;
        }
        return c19082.m43358(c19082.m43360() - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo26577(C10856 c10856, int i, int i2, int i3) {
        m45728(i);
        this.f32156.m43357(i3);
        this.f32154 = c10856;
        c10856.f30091 = this.f32157.mo8413(1);
        if (this.f32150 != null) {
            m26571();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26572(int i, C10856 c10856) {
        C10856 c10857 = this.f32154;
        c10857.f65695 = c10856;
        c10857.f65694 = i;
        c10857.f30090 = this.f32157.mo8413(-1);
        this.f32154 = c10856;
        c10856.f30091 = c10857.f30091;
        if (this.f32155) {
            c10856.m25015(c10857);
        }
        if (this.f32150 != null) {
            m26571();
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final C10856 m26580() {
        return this.f32154;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C25117 m26587() {
        return mo3738().m51241(m45731(), this.f32154);
    }
}
