package l;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13674 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ReentrantLock f40813 = new ReentrantLock(true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40812 = new ArrayList(100);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4365 f40814 = new C4365(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32889(AbstractC15440 abstractC15440, long j) {
        this.f40812.add(abstractC15440);
        this.f40814.add(j);
        if (this.f40812.size() == 100) {
            C1802.f6208.execute(new RunnableC22847(this, this.f40812, this.f40814));
            this.f40812 = new ArrayList(100);
            this.f40814 = new C4365(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32888() {
        if (this.f40812.isEmpty()) {
            return;
        }
        try {
            C1802.f6208.submit(new RunnableC22847(this, this.f40812, this.f40814)).get();
        } catch (Exception unused) {
        }
    }
}
