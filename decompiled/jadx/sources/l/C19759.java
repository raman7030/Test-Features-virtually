package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩵᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19759 extends AbstractViewOnClickListenerC16166 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63816;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f63817;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19759(ActivityC21107 activityC21107, ActivityC21107 activityC21108, boolean z) {
        super(activityC21108);
        this.f63817 = activityC21107;
        this.f63816 = z;
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* JADX INFO: renamed from: ֫ */
    public final void mo2796(Pattern pattern, String str) {
        ActivityC21107 activityC21107 = this.f63817;
        if (!activityC21107.f68093.f56846.isEmpty()) {
            ((C0644) activityC21107.f68093.f56846.peek()).f2493 = activityC21107.f68089.getFirstVisiblePosition();
        }
        Collection collectionValues = this.f63816 ? ((C0644) activityC21107.f68093.f56846.peek()).f2492 : activityC21107.f68093.f56832.values();
        C0644 c0644 = new C0644();
        c0644.f2494 = str;
        RunnableC19053 runnableC19053 = new RunnableC19053(new ConcurrentLinkedQueue(collectionValues), pattern, c0644, 0);
        LinkedList linkedList = new LinkedList();
        int i = C17615.f53826 / 2;
        for (int i2 = 0; i2 < i; i2++) {
            Thread thread = new Thread(runnableC19053);
            thread.start();
            linkedList.add(thread);
        }
        runnableC19053.run();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException unused) {
            }
        }
        activityC21107.f68093.f56846.push(c0644);
        activityC21107.f68093.f56833 = activityC21107.f68093.m42621();
    }

    @Override // l.AbstractViewOnClickListenerC16166
    /* JADX INFO: renamed from: ֫ */
    public final void mo2795() {
        ActivityC21107 activityC21107 = this.f63817;
        activityC21107.setTitle(((C0644) activityC21107.f68093.f56846.peek()).f2494);
        activityC21107.m48049(EnumC6995.SEARCH_RESULT_CLASS);
    }
}
