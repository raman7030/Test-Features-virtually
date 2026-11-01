package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes.dex */
public final class C24948 {

    /* JADX INFO: renamed from: ֫ */
    public long f79657;

    /* JADX INFO: renamed from: ۧ */
    public final List f79658 = C18426.m41997();

    /* JADX INFO: renamed from: ֫ */
    public final void m54815() {
        Iterator it = new ArrayList(this.f79658).iterator();
        while (it.hasNext()) {
            ((RunnableC18242) it.next()).m41503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54816(RunnableC18242 runnableC18242) {
        this.f79658.remove(runnableC18242);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54817(RunnableC18242 runnableC18242) {
        this.f79657++;
        Thread thread = new Thread(runnableC18242);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.f79657 + MotionUtils.EASING_TYPE_FORMAT_END);
        this.f79658.add(runnableC18242);
        thread.start();
    }
}
