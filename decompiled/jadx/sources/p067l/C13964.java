package p067l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4UC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13964 {

    /* JADX INFO: renamed from: ֫ */
    public final String f39429;

    /* JADX INFO: renamed from: ۧ */
    public final String[] f39430;

    public C13964(String str, String[] strArr) {
        if (str.isEmpty() && strArr.length == 0) {
            strArr = new String[]{""};
        }
        this.f39430 = strArr;
        this.f39429 = str;
    }

    public C13964(IOException iOException) {
        this.f39430 = new String[0];
        this.f39429 = iOException.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m31745() {
        return this.f39429.length() > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result{lines=");
        sb.append(Arrays.toString(this.f39430));
        sb.append(", error='");
        return C10965.m25286(sb, this.f39429, "'}");
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m31744() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f39430) {
            sb.append(str);
        }
        if (m31745()) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(this.f39429);
        }
        return sb.toString();
    }
}
