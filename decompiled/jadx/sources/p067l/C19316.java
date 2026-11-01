package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19316 implements InterfaceC15962 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15962[] f57676a;

    /* JADX INFO: renamed from: b */
    public final boolean f57677b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C19316(List list, boolean z) {
        ArrayList arrayList = (ArrayList) list;
        this((InterfaceC15962[]) arrayList.toArray(new InterfaceC15962[arrayList.size()]), z);
    }

    public C19316(InterfaceC15962[] interfaceC15962Arr, boolean z) {
        this.f57676a = interfaceC15962Arr;
        this.f57677b = z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_GENERATE] */
    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f57677b;
        if (z) {
            c11940.f33255c++;
        }
        try {
            for (InterfaceC15962 interfaceC15962 : this.f57676a) {
                if (!interfaceC15962.mo9636l(c11940, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                c11940.f33255c--;
            }
        }
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        boolean z = this.f57677b;
        InterfaceC15962[] interfaceC15962Arr = this.f57676a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = c5234.f12337d;
            C17974 c17974M11288c = c5234.m11288c();
            c17974M11288c.getClass();
            C17974 c17974 = new C17974();
            ((HashMap) c17974.f53681a).putAll(c17974M11288c.f53681a);
            c17974.f53682b = c17974M11288c.f53682b;
            c17974.f53683c = c17974M11288c.f53683c;
            c17974.f53684d = c17974M11288c.f53684d;
            arrayList.add(c17974);
            int length = interfaceC15962Arr.length;
            int iMo9637m = i;
            while (i2 < length) {
                iMo9637m = interfaceC15962Arr[i2].mo9637m(c5234, charSequence, iMo9637m);
                if (iMo9637m < 0) {
                    ArrayList arrayList2 = c5234.f12337d;
                    arrayList2.remove(arrayList2.size() - 1);
                    return i;
                }
                i2++;
            }
            ArrayList arrayList3 = c5234.f12337d;
            arrayList3.remove(arrayList3.size() - 2);
            return iMo9637m;
        }
        int length2 = interfaceC15962Arr.length;
        while (i2 < length2) {
            i = interfaceC15962Arr[i2].mo9637m(c5234, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC15962[] interfaceC15962Arr = this.f57676a;
        if (interfaceC15962Arr != null) {
            boolean z = this.f57677b;
            sb.append(z ? "[" : MotionUtils.EASING_TYPE_FORMAT_START);
            for (InterfaceC15962 interfaceC15962 : interfaceC15962Arr) {
                sb.append(interfaceC15962);
            }
            sb.append(z ? "]" : MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return sb.toString();
    }
}
