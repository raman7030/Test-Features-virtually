package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۠᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C22874 extends C7352 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50973(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        C13701.m32950(i, i2, i3, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50972(Object[] objArr, C15050 c15050, int i, int i2) {
        C11233.m27805(objArr, "<this>");
        Arrays.fill(objArr, i, i2, c15050);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m50971(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C8969.f27244;
        }
        if (length == 1) {
            return C1913.m6273(objArr[0]);
        }
        return new ArrayList(new C5941(objArr));
    }
}
