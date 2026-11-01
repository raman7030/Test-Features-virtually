package p067l;

import java.io.File;

/* JADX INFO: renamed from: l.᩺ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 173H */
/* JADX INFO: loaded from: classes.dex */
public class C24288 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final long f76933;

    /* JADX INFO: renamed from: ۙ */
    public final long f76934;

    /* JADX INFO: renamed from: ۬ */
    public final long f76935;

    /* JADX INFO: renamed from: ᩶ */
    public final String f76936;

    /* JADX INFO: renamed from: ᩸ */
    public final File f76937;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f76938;

    public C24288(String str, long j, long j2, long j3, File file) {
        this.f76936 = str;
        this.f76935 = j;
        this.f76933 = j2;
        this.f76938 = file != null;
        this.f76937 = file;
        this.f76934 = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C24288 c24288) {
        String str = c24288.f76936;
        String str2 = this.f76936;
        if (!str2.equals(str)) {
            return str2.compareTo(c24288.f76936);
        }
        long j = this.f76935 - c24288.f76935;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f76935);
        sb.append(", ");
        return C17520.m39893(sb, this.f76933, "]");
    }
}
