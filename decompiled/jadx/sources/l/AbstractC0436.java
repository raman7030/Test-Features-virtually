package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AK0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0436 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f1921;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f1922;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f1923;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f1924;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f1925;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract InputStream mo1993();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f1922.compareTo(((AbstractC0436) obj).f1922);
    }

    public AbstractC0436(String str, long j, Object obj) {
        this.f1922 = str;
        this.f1921 = j;
        this.f1923 = obj;
    }
}
