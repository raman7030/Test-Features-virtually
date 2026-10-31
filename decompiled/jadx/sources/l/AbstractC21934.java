package l;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩹֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21934 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f70235;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile LinkedHashMap f70237;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19818 f70239;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f70234 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f70236 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f70233 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f70238 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo2920();

    public AbstractC21934(C19818 c19818, String str, LinkedHashMap linkedHashMap) {
        this.f70239 = c19818;
        this.f70235 = str;
        this.f70237 = new LinkedHashMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49403(AbstractC21934 abstractC21934) {
        boolean z;
        try {
            abstractC21934.mo2920();
            if (z) {
                return;
            }
        } catch (RuntimeException unused) {
            if (z) {
                return;
            }
        } finally {
            if (!abstractC21934.f70233 && !abstractC21934.f70236) {
                abstractC21934.m49405();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49407(int i, int i2, long j, boolean z) {
        if (this.f70233) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f70237);
        linkedHashMap.put("sizeBytes", Long.valueOf(j));
        linkedHashMap.put("fileCount", Integer.valueOf(i));
        linkedHashMap.put("folderCount", Integer.valueOf(i2));
        this.f70237 = linkedHashMap;
        if (z) {
            m49405();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49405() {
        this.f70236 = true;
        this.f70238 = SystemClock.uptimeMillis();
        C1802.m5990(this.f70234, 300000L, new Runnable() { // from class: l.᩸֡ۢ
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC21934 abstractC21934 = this.f68422;
                abstractC21934.f70239.f64027.remove(abstractC21934.f70235, abstractC21934);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49409() {
        this.f70233 = true;
        C1802.m5993().removeCallbacksAndMessages(this.f70234);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m49406() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("taskId", this.f70235);
        linkedHashMap.put("done", Boolean.valueOf(this.f70236));
        linkedHashMap.put("property", this.f70237);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m49410() {
        return this.f70233;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49408(long j) {
        return this.f70236 && this.f70238 > 0 && j - this.f70238 >= 300000;
    }
}
