package l;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21272 extends AbstractC9277 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Handler f68616;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f68617 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC0486 f68618;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo48285(int i, Object obj) {
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long mo48286(long j, Object obj) {
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C15894 mo9818(Object obj, C15894 c15894);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9819(Object obj, AbstractC9277 abstractC9277, AbstractC4846 abstractC4846);

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ֫ */
    public void mo9820(InterfaceC0486 interfaceC0486) {
        this.f68618 = interfaceC0486;
        this.f68616 = C3603.m11019((Handler.Callback) null);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ */
    public void mo9823() {
        Iterator it = this.f68617.values().iterator();
        while (it.hasNext()) {
            ((C14920) it.next()).f45495.mo9823();
        }
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ܳ */
    public final void mo23798() {
        for (C14920 c14920 : this.f68617.values()) {
            c14920.f45495.mo11879(c14920.f45493);
        }
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ܿ */
    public final void mo23799() {
        for (C14920 c14920 : this.f68617.values()) {
            c14920.f45495.mo11884(c14920.f45493);
        }
    }

    @Override // l.AbstractC9277
    /* JADX INFO: renamed from: ᩷ */
    public void mo9824() {
        HashMap map = this.f68617;
        for (C14920 c14920 : map.values()) {
            InterfaceC3901 interfaceC3901 = c14920.f45495;
            C7865 c7865 = c14920.f45494;
            interfaceC3901.mo11883(c14920.f45493);
            interfaceC3901.mo11881((InterfaceC15188) c7865);
            interfaceC3901.mo11882((InterfaceC21388) c7865);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.֨֫ۧ, l.ۖۧۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48287(final Object obj, InterfaceC3901 interfaceC3901) {
        HashMap map = this.f68617;
        C22632.m50631(!map.containsKey(obj));
        ?? r1 = new InterfaceC2490() { // from class: l.֨֫ۧ
            @Override // l.InterfaceC2490
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo3045(AbstractC9277 abstractC9277, AbstractC4846 abstractC4846) {
                this.f2949.mo9819(obj, abstractC9277, abstractC4846);
            }
        };
        C7865 c7865 = new C7865(this, obj);
        map.put(obj, new C14920(interfaceC3901, r1, c7865));
        Handler handler = this.f68616;
        handler.getClass();
        interfaceC3901.mo11877(handler, (InterfaceC15188) c7865);
        Handler handler2 = this.f68616;
        handler2.getClass();
        interfaceC3901.mo11878(handler2, (InterfaceC21388) c7865);
        interfaceC3901.mo11880((InterfaceC2490) r1, this.f68618, m23800());
        if (m23795()) {
            return;
        }
        interfaceC3901.mo11884(r1);
    }
}
