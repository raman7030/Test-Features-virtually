package l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ᩴۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18501 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f57342;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f57338 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f57341 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f57337 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f57339 = new AtomicLong();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19913 f57340 = new C19913();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43000(C18501 c18501) {
        c18501.f57342++;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43002(C18501 c18501) {
        c18501.f57342--;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 m43003() {
        return this.f57337;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m43004() {
        return this.f57338;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19913 m43005() {
        return this.f57340;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong m43006() {
        return this.f57339;
    }

    public final String toString() {
        return "ObjectDeque [idleObjects=" + this.f57340 + ", createCount=" + this.f57338 + ", allObjects=" + this.f57337 + ", numInterested=" + this.f57339 + "]";
    }
}
