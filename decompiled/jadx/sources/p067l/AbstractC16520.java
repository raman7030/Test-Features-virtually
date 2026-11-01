package p067l;

/* JADX INFO: renamed from: l.ܶ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16520 {

    /* JADX INFO: renamed from: ֫ */
    public final int f48556;

    public AbstractC16520(int i) {
        this.f48556 = i;
    }

    public String toString() {
        return m37479(this.f48556);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37479(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }
}
