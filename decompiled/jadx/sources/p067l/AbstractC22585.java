package p067l;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22585 extends AbstractC11185 {

    /* JADX INFO: renamed from: ۛ */
    public Handler f71299;

    /* JADX INFO: renamed from: ۤ */
    public final HashMap f71300 = new HashMap();

    /* JADX INFO: renamed from: ۨ */
    public InterfaceC2830 f71301;

    /* JADX INFO: renamed from: ֫ */
    public int mo50616(int i, Object obj) {
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public long mo50617(long j, Object obj) {
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C17474 mo11863(Object obj, C17474 c17474);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo11864(Object obj, AbstractC11185 abstractC11185, AbstractC6974 abstractC6974);

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ֫ */
    public void mo11865(InterfaceC2830 interfaceC2830) {
        this.f71301 = interfaceC2830;
        this.f71299 = C5792.m12995((Handler.Callback) null);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public void mo11868() {
        Iterator it = this.f71300.values().iterator();
        while (it.hasNext()) {
            ((C16548) it.next()).f48610.mo11868();
        }
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ܳ */
    public final void mo25807() {
        for (C16548 c16548 : this.f71300.values()) {
            c16548.f48610.mo13815(c16548.f48608);
        }
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ܿ */
    public final void mo25808() {
        for (C16548 c16548 : this.f71300.values()) {
            c16548.f48610.mo13820(c16548.f48608);
        }
    }

    @Override // p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public void mo11869() {
        HashMap map = this.f71300;
        for (C16548 c16548 : map.values()) {
            InterfaceC6076 interfaceC6076 = c16548.f48610;
            C9843 c9843 = c16548.f48609;
            interfaceC6076.mo13819(c16548.f48608);
            interfaceC6076.mo13817((InterfaceC16803) c9843);
            interfaceC6076.mo13818((InterfaceC22695) c9843);
        }
        map.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.֨֫ۧ, l.ۖۧۧ] */
    /* JADX INFO: renamed from: ֫ */
    public final void m50618(final Object obj, InterfaceC6076 interfaceC6076) {
        HashMap map = this.f71300;
        C23877.m52957(!map.containsKey(obj));
        ?? r1 = new InterfaceC4735() { // from class: l.֨֫ۧ
            @Override // p067l.InterfaceC4735
            /* JADX INFO: renamed from: ֫ */
            public final void mo5358(AbstractC11185 abstractC11185, AbstractC6974 abstractC6974) {
                this.f5720.mo11864(obj, abstractC11185, abstractC6974);
            }
        };
        C9843 c9843 = new C9843(this, obj);
        map.put(obj, new C16548(interfaceC6076, r1, c9843));
        Handler handler = this.f71299;
        handler.getClass();
        interfaceC6076.mo13813(handler, (InterfaceC16803) c9843);
        Handler handler2 = this.f71299;
        handler2.getClass();
        interfaceC6076.mo13814(handler2, (InterfaceC22695) c9843);
        interfaceC6076.mo13816((InterfaceC4735) r1, this.f71301, m25809());
        if (m25804()) {
            return;
        }
        interfaceC6076.mo13820(r1);
    }
}
