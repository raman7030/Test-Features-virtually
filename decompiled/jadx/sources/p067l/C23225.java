package p067l;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩹֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I6LR */
/* JADX INFO: loaded from: classes.dex */
public final class C23225 {

    /* JADX INFO: renamed from: ֫ */
    public HashSet f73018;

    public C23225() {
        int iM25047 = 0;
        Object[] objArr = {C0170a.f680s, C0171b.f688a, "mailto", AbstractC0213e.f989m};
        ArrayList arrayList = new ArrayList(4);
        while (iM25047 < 4) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList, obj, iM25047, 1);
        }
        this.f73018 = new HashSet(C21562.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m51772(String str) {
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
                return !this.f73018.contains(str.substring(0, i2).toLowerCase()) ? "" : str;
            }
            if (cCharAt3 == '?') {
                return str;
            }
        }
        return str;
    }
}
