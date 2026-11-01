package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩵ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20779 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ AbstractC9381 f65316;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ List f65317;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C7367 f65319;

    /* JADX INFO: renamed from: ۢ */
    public boolean f65320;

    /* JADX INFO: renamed from: ܳ */
    public C4125 f65321;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ Runnable f65322;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ C18107 f65323;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f65325;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f65318 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public C6455 f65324 = new C6455(0);

    public C20779(C7367 c7367, C18107 c18107, C22103 c22103, List list, Runnable runnable) {
        this.f65319 = c7367;
        this.f65323 = c18107;
        this.f65316 = c22103;
        this.f65317 = list;
        this.f65322 = runnable;
        this.f65325 = c7367.f55050.m38684(C6458.m14757(c7367.m41982()));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C4125 c4125 = new C4125(this.f65323.m41282());
        c4125.m8356(C7050.m16230(R.string.MT_Protector));
        c4125.m8345((RunnableC3439) null);
        c4125.m8351();
        this.f65321 = c4125;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m46926() {
        return this.f65321.m8358() || this.f65316.mo21805() == EnumC15415.DESTROYED;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractC17043 abstractC17043 = this.f65325;
        if (abstractC17043.mo25093()) {
            abstractC17043.mo25503();
        }
        abstractC17043.m38666();
        ArrayList<C2672> arrayList = new ArrayList();
        final AbstractC5375 abstractC5375Mo8217 = this.f65319.mo8217();
        long size = 0;
        for (C12073 c12073 : this.f65317) {
            InterfaceC19370 interfaceC19370Mo9709 = abstractC5375Mo8217.mo9709(c12073.m27645());
            if (interfaceC19370Mo9709 != null) {
                C17278 c17278 = (C17278) interfaceC19370Mo9709;
                if (c17278.mo39135()) {
                    size += c17278.getSize();
                    C2672 c2672 = new C2672(0);
                    c2672.f4478 = c12073;
                    c2672.f4477 = interfaceC19370Mo9709;
                    c2672.f4476 = abstractC17043.m38684(c12073.m27650());
                    arrayList.add(c2672);
                }
            }
            c12073.m27641();
        }
        C22209 c22209 = new C22209(arrayList.size(), size);
        this.f65321.m8348(true);
        C10069 c10069 = new C10069(abstractC5375Mo8217);
        C20108 c20108 = new C20108(this, c22209);
        C6455 c6455 = this.f65324;
        c6455.m14742();
        try {
            InterfaceC19157 interfaceC19157Distinct = C7480.stream(arrayList).map(new C4685()).distinct();
            C12826.requireNonNull(abstractC5375Mo8217);
            interfaceC19157Distinct.forEach(new Consumer() { // from class: l.ۘۡ᩻
                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj) {
                    abstractC5375Mo8217.mo11736((String) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }
            });
            for (C2672 c2673 : arrayList) {
                this.f65321.m8354(c2673.f4478.m27648());
                c10069.m23502(c2673.f4477.getPath(), c2673.f4476, c20108);
                if (!m46926()) {
                    c2673.f4478.m27642(c2673.f4476);
                    this.f65318.add(new C8049(c2673.f4476, c2673.f4476.getName(), c2673.f4477.getPath()));
                    c22209.m50045();
                } else {
                    c6455.m14743();
                    return;
                }
            }
            c6455.m14743();
        } catch (Throwable th) {
            c6455.m14743();
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (m46926()) {
            Iterator it = this.f65318.iterator();
            while (it.hasNext()) {
                ((C8049) it.next()).m18694().mo29990();
            }
            return;
        }
        this.f65320 = true;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f65323.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
        Iterator it = this.f65318.iterator();
        while (it.hasNext()) {
            ((C8049) it.next()).m18694().mo29990();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f65321.m8349();
        C17127.m38756();
        if (this.f65320) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = this.f65318;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C8049) it.next()).m18696().toLowerCase());
            }
            C7367 c7367 = this.f65319;
            int i = 0;
            for (C8049 c8049 : c7367.m41980()) {
                if (c8049.m18699() && hashSet.add(c8049.m18696().toLowerCase())) {
                    arrayList.add(i, c8049);
                    i++;
                }
            }
            c7367.m41976(arrayList);
            try {
                this.f65322.run();
            } catch (Throwable th) {
                this.f65323.m41282().m12259(th, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
