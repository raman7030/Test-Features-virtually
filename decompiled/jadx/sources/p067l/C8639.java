package p067l;

import android.os.SystemClock;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۜۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8639 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C16684 f23196;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f23197;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int f23198;

    /* JADX INFO: renamed from: ᩻ */
    public C24164 f23199;

    public C8639(C16684 c16684, int i) {
        this.f23196 = c16684;
        this.f23198 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C16684 c16684 = this.f23196;
        C24164 c24164 = new C24164((AbstractActivityC5549) c16684.requireActivity());
        c24164.m53440(this.f23198);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f23199 = c24164;
        if (c16684.f49116 != null) {
            c16684.f49116 = null;
            c16684.f49117.notifyDataSetChanged();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C16684 c16684;
        while (true) {
            c16684 = this.f23196;
            if (c16684.f49110 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        c16684.f49110.m32112();
        C14121 c14121 = c16684.f49110;
        final C24732 c24732 = new C24732(this);
        c14121.getClass();
        final Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentMapC12768());
        ArrayList<InterfaceC15206> arrayListM32110 = c14121.m32110();
        final C20689 c20689 = new C20689(arrayListM32110.size());
        c20689.m46753(c24732);
        ExecutorService executorService = C4081.f8990;
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(C19110.f57020);
        for (final InterfaceC15206 interfaceC15206 : arrayListM32110) {
            executorServiceNewFixedThreadPool.submit(new Runnable() { // from class: l.᩶ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C14121.m32068(c24732, c20689, interfaceC15206, setNewSetFromMap);
                }
            });
        }
        C4081.m8189(executorServiceNewFixedThreadPool);
        C7050.m16212(new Runnable() { // from class: l.ܿۜۢ
            @Override // java.lang.Runnable
            public final void run() {
                C8639 c8639 = this.f55837;
                c8639.f23199.m53439();
                c8639.f23199.m53440(R.string.MT_Protector);
                c8639.f23199.m53432(true);
            }
        });
        ArrayList arrayList = new ArrayList(setNewSetFromMap.size());
        this.f23197 = arrayList;
        Iterator it = setNewSetFromMap.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17355((String) it.next()));
        }
        Collections.sort(arrayList, new C16014());
        c16684.f49112 = false;
        c16684.f49118 = false;
        c16684.m37762(arrayList);
        C16684.m37770(c16684);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ArrayList arrayList = this.f23197;
        C16684 c16684 = this.f23196;
        c16684.f49116 = arrayList;
        c16684.f49117.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f23196.f49119.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f23196.f49110.m32122();
        this.f23199.m53442();
    }
}
