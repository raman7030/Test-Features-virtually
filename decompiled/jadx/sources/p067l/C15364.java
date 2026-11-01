package p067l;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C15364 {

    /* JADX INFO: renamed from: ۧ */
    public ReentrantLock f43894 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f43893 = new ArrayList(100);

    /* JADX INFO: renamed from: ܽ */
    public C6517 f43895 = new C6517(0);

    /* JADX INFO: renamed from: ֫ */
    public final void m35004(AbstractC17043 abstractC17043, long j) {
        this.f43893.add(abstractC17043);
        this.f43895.add(j);
        if (this.f43893.size() == 100) {
            C4081.f8987.execute(new RunnableC24082(this, this.f43893, this.f43895));
            this.f43893 = new ArrayList(100);
            this.f43895 = new C6517(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35003() {
        if (this.f43893.isEmpty()) {
            return;
        }
        try {
            C4081.f8987.submit(new RunnableC24082(this, this.f43893, this.f43895)).get();
        } catch (Exception unused) {
        }
    }
}
