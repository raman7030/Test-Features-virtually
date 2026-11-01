package p067l;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩹֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23214 {

    /* JADX INFO: renamed from: ܳ */
    public final String f72947;

    /* JADX INFO: renamed from: ܿ */
    public volatile LinkedHashMap f72949;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C21203 f72951;

    /* JADX INFO: renamed from: ۧ */
    public final Object f72946 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f72948 = false;

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f72945 = false;

    /* JADX INFO: renamed from: ᩳ */
    public volatile long f72950 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo5248();

    public AbstractC23214(C21203 c21203, String str, LinkedHashMap linkedHashMap) {
        this.f72951 = c21203;
        this.f72947 = str;
        this.f72949 = new LinkedHashMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51740(AbstractC23214 abstractC23214) {
        boolean z;
        try {
            abstractC23214.mo5248();
            if (z) {
                return;
            }
        } catch (RuntimeException unused) {
            if (z) {
                return;
            }
        } finally {
            if (!abstractC23214.f72945 && !abstractC23214.f72948) {
                abstractC23214.m51742();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51744(int i, int i2, long j, boolean z) {
        if (this.f72945) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f72949);
        linkedHashMap.put("sizeBytes", Long.valueOf(j));
        linkedHashMap.put("fileCount", Integer.valueOf(i));
        linkedHashMap.put("folderCount", Integer.valueOf(i2));
        this.f72949 = linkedHashMap;
        if (z) {
            m51742();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m51742() {
        this.f72948 = true;
        this.f72950 = SystemClock.uptimeMillis();
        C4081.m8187(this.f72946, 300000L, new Runnable() { // from class: l.᩸֡ۢ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23214 abstractC23214 = this.f71105;
                abstractC23214.f72951.f66664.remove(abstractC23214.f72947, abstractC23214);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51746() {
        this.f72945 = true;
        C4081.m8190().removeCallbacksAndMessages(this.f72946);
    }

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap m51743() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("taskId", this.f72947);
        linkedHashMap.put("done", Boolean.valueOf(this.f72948));
        linkedHashMap.put("property", this.f72949);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m51747() {
        return this.f72945;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51745(long j) {
        return this.f72948 && this.f72950 > 0 && j - this.f72950 >= 300000;
    }
}
