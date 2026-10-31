package l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12201 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f36414;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f36415;

    public C12201(String str, String[] strArr) {
        if (str.isEmpty() && strArr.length == 0) {
            strArr = new String[]{""};
        }
        this.f36415 = strArr;
        this.f36414 = str;
    }

    public C12201(IOException iOException) {
        this.f36415 = new String[0];
        this.f36414 = iOException.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29683() {
        return this.f36414.length() > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{lines=");
        sb.append(Arrays.toString(this.f36415));
        sb.append(", error='");
        return C9045.m23341(sb, this.f36414, "'}");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m29682() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f36415) {
            sb.append(str);
        }
        if (m29683()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(this.f36414);
        }
        return sb.toString();
    }
}
