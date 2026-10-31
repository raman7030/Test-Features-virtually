package l;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9277 implements InterfaceC3901 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Looper f28091;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC4846 f28092;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13830 f28093;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28090 = new ArrayList(1);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashSet f28096 = new HashSet(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8134 f28094 = new C8134();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15036 f28095 = new C15036();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9820(InterfaceC0486 interfaceC0486);

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo9822(C11197 c11197) {
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void mo23798() {
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo11885() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void mo23799() {
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ᩳ */
    public /* synthetic */ AbstractC4846 mo11886() {
        return null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo9824();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23794(AbstractC4846 abstractC4846) {
        this.f28092 = abstractC4846;
        Iterator it = this.f28090.iterator();
        while (it.hasNext()) {
            ((InterfaceC2490) it.next()).mo3045(this, abstractC4846);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8134 m23797(C15894 c15894) {
        return this.f28094.m21589(0, c15894);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8134 m23796(int i, C15894 c15894) {
        return this.f28094.m21589(i, c15894);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo11877(Handler handler, InterfaceC15188 interfaceC15188) {
        handler.getClass();
        this.f28094.m21590(handler, interfaceC15188);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo11878(Handler handler, InterfaceC21388 interfaceC21388) {
        handler.getClass();
        this.f28095.m35563(handler, interfaceC21388);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15036 m23793(C15894 c15894) {
        return this.f28095.m35560(0, c15894);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15036 m23792(int i, C15894 c15894) {
        return this.f28095.m35560(i, c15894);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m23795() {
        return !this.f28096.isEmpty();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13830 m23800() {
        C13830 c13830 = this.f28093;
        C22632.m50632(c13830);
        return c13830;
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo11881(InterfaceC15188 interfaceC15188) {
        this.f28094.m21594(interfaceC15188);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo11882(InterfaceC21388 interfaceC21388) {
        this.f28095.m35565(interfaceC21388);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo11880(InterfaceC2490 interfaceC2490, InterfaceC0486 interfaceC0486, C13830 c13830) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f28091;
        C22632.m50631(looper == null || looper == looperMyLooper);
        this.f28093 = c13830;
        AbstractC4846 abstractC4846 = this.f28092;
        this.f28090.add(interfaceC2490);
        if (this.f28091 == null) {
            this.f28091 = looperMyLooper;
            this.f28096.add(interfaceC2490);
            mo9820(interfaceC0486);
        } else if (abstractC4846 != null) {
            mo11879(interfaceC2490);
            interfaceC2490.mo3045(this, abstractC4846);
        }
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫ */
    public final void mo11879(InterfaceC2490 interfaceC2490) {
        this.f28091.getClass();
        HashSet hashSet = this.f28096;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC2490);
        if (zIsEmpty) {
            mo23798();
        }
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ܽ */
    public final void mo11884(InterfaceC2490 interfaceC2490) {
        HashSet hashSet = this.f28096;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC2490);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo23799();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ */
    public final void mo11883(InterfaceC2490 interfaceC2490) {
        ArrayList arrayList = this.f28090;
        arrayList.remove(interfaceC2490);
        if (arrayList.isEmpty()) {
            this.f28091 = null;
            this.f28092 = null;
            this.f28093 = null;
            this.f28096.clear();
            mo9824();
            return;
        }
        mo11884(interfaceC2490);
    }
}
