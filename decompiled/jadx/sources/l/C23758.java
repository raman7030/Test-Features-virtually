package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes.dex */
public final class C23758 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f76905;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f76906 = C16895.m39756();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52406() {
        Iterator it = new ArrayList(this.f76906).iterator();
        while (it.hasNext()) {
            ((RunnableC16702) it.next()).m39267();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52407(RunnableC16702 runnableC16702) {
        this.f76906.remove(runnableC16702);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52408(RunnableC16702 runnableC16702) {
        this.f76905++;
        Thread thread = new Thread(runnableC16702);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f76905 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.f76906.add(runnableC16702);
        thread.start();
    }
}
