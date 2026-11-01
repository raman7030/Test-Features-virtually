package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2783 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final long f4697;

    /* JADX INFO: renamed from: ۙ */
    public final String f4698;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f4699;

    /* JADX INFO: renamed from: ᩸ */
    public String f4700;

    /* JADX INFO: renamed from: ᩹ */
    public IOException f4701;

    /* JADX INFO: renamed from: ֫ */
    public abstract InputStream mo4369();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4698.compareTo(((AbstractC2783) obj).f4698);
    }

    public AbstractC2783(String str, long j, Object obj) {
        this.f4698 = str;
        this.f4697 = j;
        this.f4699 = obj;
    }
}
