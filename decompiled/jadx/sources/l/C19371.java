package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19371 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7379 f62705;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f62706;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f62708;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f62709;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1848 f62710;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f62711;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f62712;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f62714;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f62707 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4300 f62713 = new C4300(0);

    public C19371(C5259 c5259, C16560 c16560, C20765 c20765, List list, Runnable runnable) {
        this.f62708 = c5259;
        this.f62712 = c16560;
        this.f62705 = c20765;
        this.f62706 = list;
        this.f62711 = runnable;
        this.f62714 = c5259.f51870.m36526(C4303.m12893(c5259.m39741()));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C1848 c1848 = new C1848(this.f62712.m39056());
        c1848.m6158(C4925.m14333(R.string.MT_Protector));
        c1848.m6147((RunnableC1126) null);
        c1848.m6153();
        this.f62710 = c1848;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m44632() {
        return this.f62710.m6160() || this.f62705.mo19832() == EnumC13728.DESTROYED;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440 = this.f62714;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        ArrayList<C0319> arrayList = new ArrayList();
        final AbstractC3163 abstractC3163Mo6020 = this.f62708.mo6020();
        long size = 0;
        for (C10211 c10211 : this.f62706) {
            InterfaceC17889 interfaceC17889Mo7638 = abstractC3163Mo6020.mo7638(c10211.m25623());
            if (interfaceC17889Mo7638 != null) {
                C15688 c15688 = (C15688) interfaceC17889Mo7638;
                if (c15688.mo36969()) {
                    size += c15688.getSize();
                    C0319 c0319 = new C0319(0);
                    c0319.f1702 = c10211;
                    c0319.f1701 = interfaceC17889Mo7638;
                    c0319.f1700 = abstractC15440.m36526(c10211.m25628());
                    arrayList.add(c0319);
                }
            }
            c10211.m25619();
        }
        C20876 c20876 = new C20876(arrayList.size(), size);
        this.f62710.m6150(true);
        C8102 c8102 = new C8102(abstractC3163Mo6020);
        C18665 c18665 = new C18665(this, c20876);
        C4300 c4300 = this.f62713;
        c4300.m12878();
        try {
            InterfaceC17664 interfaceC17664Distinct = C5378.stream(arrayList).map(new C2437()).distinct();
            C11003.requireNonNull(abstractC3163Mo6020);
            interfaceC17664Distinct.forEach(new Consumer() { // from class: l.ۘۡ᩻
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj) {
                    abstractC3163Mo6020.mo9692((String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
            for (C0319 c03110 : arrayList) {
                this.f62710.m6156(c03110.f1702.m25626());
                c8102.m21534(c03110.f1701.getPath(), c03110.f1700, c18665);
                if (!m44632()) {
                    c03110.f1702.m25620(c03110.f1700);
                    this.f62707.add(new C5977(c03110.f1700, c03110.f1700.getName(), c03110.f1701.getPath()));
                    c20876.m47715();
                } else {
                    c4300.m12879();
                    return;
                }
            }
            c4300.m12879();
        } catch (Throwable th) {
            c4300.m12879();
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (m44632()) {
            Iterator it = this.f62707.iterator();
            while (it.hasNext()) {
                ((C5977) it.next()).m16768().mo27929();
            }
            return;
        }
        this.f62709 = true;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f62712.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
        Iterator it = this.f62707.iterator();
        while (it.hasNext()) {
            ((C5977) it.next()).m16768().mo27929();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f62710.m6151();
        C15528.m36596();
        if (this.f62709) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = this.f62707;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C5977) it.next()).m16770().toLowerCase());
            }
            C5259 c5259 = this.f62708;
            int i = 0;
            for (C5977 c5977 : c5259.m39739()) {
                if (c5977.m16773() && hashSet.add(c5977.m16770().toLowerCase())) {
                    arrayList.add(i, c5977);
                    i++;
                }
            }
            c5259.m39735(arrayList);
            try {
                this.f62711.run();
            } catch (Throwable th) {
                this.f62712.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
