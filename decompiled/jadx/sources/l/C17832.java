package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17832 implements InterfaceC14303 {
    public final InterfaceC14303[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C17832(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC14303[]) arrayList.toArray(new InterfaceC14303[arrayList.size()]), z);
    }

    public C17832(InterfaceC14303[] interfaceC14303Arr, boolean z) {
        this.a = interfaceC14303Arr;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_GENERATE] */
    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            c10071.c++;
        }
        try {
            for (InterfaceC14303 interfaceC14303 : this.a) {
                if (!interfaceC14303.l(c10071, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                c10071.c--;
            }
        }
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        boolean z = this.b;
        InterfaceC14303[] interfaceC14303Arr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = c3015.d;
            C16420 c16420C = c3015.c();
            c16420C.getClass();
            C16420 c16420 = new C16420();
            ((HashMap) c16420.a).putAll(c16420C.a);
            c16420.b = c16420C.b;
            c16420.c = c16420C.c;
            c16420.d = c16420C.d;
            arrayList.add(c16420);
            int length = interfaceC14303Arr.length;
            int iM = i;
            while (i2 < length) {
                iM = interfaceC14303Arr[i2].m(c3015, charSequence, iM);
                if (iM < 0) {
                    ArrayList arrayList2 = c3015.d;
                    arrayList2.remove(arrayList2.size() - 1);
                    return i;
                }
                i2++;
            }
            ArrayList arrayList3 = c3015.d;
            arrayList3.remove(arrayList3.size() - 2);
            return iM;
        }
        int length2 = interfaceC14303Arr.length;
        while (i2 < length2) {
            i = interfaceC14303Arr[i2].m(c3015, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC14303[] interfaceC14303Arr = this.a;
        if (interfaceC14303Arr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : MotionUtils.EASING_TYPE_FORMAT_START);
            for (InterfaceC14303 interfaceC14303 : interfaceC14303Arr) {
                sb.append(interfaceC14303);
            }
            sb.append(z ? "]" : MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
