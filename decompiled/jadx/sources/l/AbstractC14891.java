package l;

/* JADX INFO: renamed from: l.ܶ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8SG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14891 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f45441;

    public AbstractC14891(int i) {
        this.f45441 = i;
    }

    public String toString() {
        return m35327(this.f45441);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35327(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }
}
