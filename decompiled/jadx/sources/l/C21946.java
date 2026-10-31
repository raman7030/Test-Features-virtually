package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩹֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LR */
/* JADX INFO: loaded from: classes.dex */
public final class C21946 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f70307;

    public C21946() {
        int iM23073 = 0;
        Object[] objArr = {a.s, b.a, "mailto", e.m};
        ArrayList arrayList = new ArrayList(4);
        while (iM23073 < 4) {
            Object obj = objArr[iM23073];
            iM23073 = C8954.m23073(obj, arrayList, obj, iM23073, 1);
        }
        this.f70307 = new HashSet(C20195.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m49435(String str) {
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '\t' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == '\r' || cCharAt == ' ')) {
            length--;
        }
        int i = 0;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 != '\t' && cCharAt2 != '\n' && cCharAt2 != '\f' && cCharAt2 != '\r' && cCharAt2 != ' ') {
                break;
            }
            i++;
        }
        if (i != 0 || length != str.length()) {
            str = str.substring(i, length);
        }
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt3 = str.charAt(i2);
            if (cCharAt3 == '#' || cCharAt3 == '/') {
                return str;
            }
            if (cCharAt3 == ':') {
                return !this.f70307.contains(str.substring(0, i2).toLowerCase()) ? "" : str;
            }
            if (cCharAt3 == '?') {
                return str;
            }
        }
        return str;
    }
}
