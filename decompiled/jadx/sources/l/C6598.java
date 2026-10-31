package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۜۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6598 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f20319;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f20320;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20321;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f20322;

    public C6598(C15063 c15063, int i) {
        this.f20319 = c15063;
        this.f20321 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C15063 c15063 = this.f20319;
        C22933 c22933 = new C22933((AbstractActivityC3346) c15063.requireActivity());
        c22933.m51049(this.f20321);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f20322 = c22933;
        if (c15063.f45998 != null) {
            c15063.f45998 = null;
            c15063.f45999.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C15063 c15063;
        while (true) {
            c15063 = this.f20319;
            if (c15063.f45992 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        c15063.f45992.m30051();
        C12366 c12366 = c15063.f45992;
        final C23531 c23531 = new C23531(this);
        c12366.getClass();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC10942());
        ArrayList<InterfaceC13508> arrayListM30049 = c12366.m30049();
        final C19277 c19277 = new C19277(arrayListM30049.size());
        c19277.m44459(c23531);
        ExecutorService executorService = C1802.f6211;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        for (final InterfaceC13508 interfaceC13508 : arrayListM30049) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.᩶ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C12366.m30007(c23531, c19277, interfaceC13508, setNewSetFromMap);
                }
            });
        }
        C1802.m5992(executorServiceNewFixedThreadPool);
        C4925.m14315(new Runnable() { // from class: l.ܿۜۢ
            @Override // java.lang.Runnable
            public final void run() {
                C6598 c6598 = this.f52656;
                c6598.f20322.m51048();
                c6598.f20322.m51049(R.string.MT_Protector);
                c6598.f20322.m51041(true);
            }
        });
        ArrayList arrayList = new ArrayList(setNewSetFromMap.size());
        this.f20320 = arrayList;
        Iterator it = setNewSetFromMap.iterator();
        while (it.hasNext()) {
            arrayList.add(new C15769((String) it.next()));
        }
        Collections.sort(arrayList, new C14358());
        c15063.f45994 = false;
        c15063.f46000 = false;
        c15063.m35604(arrayList);
        C15063.m35612(c15063);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f20320;
        C15063 c15063 = this.f20319;
        c15063.f45998 = arrayList;
        c15063.f45999.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f20319.f46001.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f20319.f45992.m30061();
        this.f20322.m51051();
    }
}
