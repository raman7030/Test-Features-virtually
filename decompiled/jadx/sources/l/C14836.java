package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܳ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14836 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1764[] f45249;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f45252 = new AtomicLong(0);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f45253 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f45251 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f45250 = new AtomicInteger(0);

    public C14836(AbstractC22366 abstractC22366, String[] strArr, boolean z) {
        this.f45249 = new C1764[strArr.length];
        for (int i = 0; i < strArr.length && !abstractC22366.mo1526(); i++) {
            C1764[] c1764Arr = this.f45249;
            C1764 c1764M52845 = C24009.m52845(abstractC22366, new String[]{strArr[i]}, z);
            c1764Arr[i] = c1764M52845;
            this.f45252.addAndGet(c1764M52845.m5896());
            this.f45253.addAndGet(c1764M52845.m5894());
            this.f45251.addAndGet(c1764M52845.m5893());
            this.f45250.addAndGet(c1764M52845.m5889());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1764 m35238(int i) {
        return this.f45249[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m35243() {
        return this.f45252.get();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m35240() {
        return this.f45251.get();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m35241() {
        return this.f45253.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35237() {
        return this.f45250.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35239(long j) {
        this.f45251.addAndGet(j);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m35242() {
        this.f45250.incrementAndGet();
    }
}
