package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩺۠᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C24108 extends C9356 {
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53363(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        C15390.m35065(i, i2, i3, objArr, objArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53362(Object[] objArr, C16672 c16672, int i, int i2) {
        C13045.m29867(objArr, "<this>");
        Arrays.fill(objArr, i, i2, c16672);
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m53361(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C10893.f30179;
        }
        if (length == 1) {
            return C4187.m8475(objArr[0]);
        }
        return new ArrayList(new C8015(objArr));
    }
}
