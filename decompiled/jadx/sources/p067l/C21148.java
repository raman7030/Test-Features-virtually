package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21148 extends AbstractViewOnClickListenerC17733 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean f66451;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ActivityC22429 f66452;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21148(ActivityC22429 activityC22429, ActivityC22429 activityC224210, boolean z) {
        super(activityC224210);
        this.f66452 = activityC22429;
        this.f66451 = z;
    }

    @Override // p067l.AbstractViewOnClickListenerC17733
    /* JADX INFO: renamed from: ֫ */
    public final void mo5141(Pattern pattern, String str) {
        ActivityC22429 activityC22429 = this.f66452;
        if (!activityC22429.f70775.f60063.isEmpty()) {
            ((C2981) activityC22429.f70775.f60063.peek()).f5265 = activityC22429.f70771.getFirstVisiblePosition();
        }
        Collection collectionValues = this.f66451 ? ((C2981) activityC22429.f70775.f60063.peek()).f5264 : activityC22429.f70775.f60049.values();
        C2981 c2981 = new C2981();
        c2981.f5266 = str;
        RunnableC20477 runnableC20477 = new RunnableC20477(new ConcurrentLinkedQueue(collectionValues), pattern, c2981, 0);
        LinkedList linkedList = new LinkedList();
        int i = C19110.f57020 / 2;
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnableC20477);
            thread.start();
            linkedList.add(thread);
        }
        runnableC20477.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
        activityC22429.f70775.f60063.push(c2981);
        activityC22429.f70775.f60050 = activityC22429.f70775.m44881();
    }

    @Override // p067l.AbstractViewOnClickListenerC17733
    /* JADX INFO: renamed from: ֫ */
    public final void mo5140() {
        ActivityC22429 activityC22429 = this.f66452;
        activityC22429.setTitle(((C2981) activityC22429.f70775.f60063.peek()).f5266);
        activityC22429.m50379(EnumC9017.SEARCH_RESULT_CLASS);
    }
}
