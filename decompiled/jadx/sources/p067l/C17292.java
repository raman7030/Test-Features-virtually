package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R65Z */
/* JADX INFO: loaded from: classes4.dex */
public class C17292 extends AbstractC15773 {

    /* JADX INFO: renamed from: ܽ */
    public String f51590;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f51591;

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22771() {
    }

    public C17292(String str) {
        this(str, 0);
        if (getClass() != C17292.class) {
            throw new IllegalStateException();
        }
    }

    public C17292(String str, int i) {
        this.f51590 = str;
    }

    public C17292(ArrayList arrayList) {
        this.f51591 = arrayList;
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22773(Object obj, String str) {
        ArrayList arrayList = this.f51591;
        String str2 = this.f51590;
        if (arrayList == null) {
            this.f51591 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f51591.add(str);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            ArrayList arrayList2 = this.f51591;
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            int length = bArr.length;
            while (i < length) {
                arrayList3.add(Byte.valueOf(bArr[i]));
                i++;
            }
            arrayList2.add(arrayList3);
            return;
        }
        if (obj instanceof boolean[]) {
            ArrayList arrayList4 = this.f51591;
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList5 = new ArrayList(zArr.length);
            int length2 = zArr.length;
            while (i < length2) {
                arrayList5.add(Boolean.valueOf(zArr[i]));
                i++;
            }
            arrayList4.add(arrayList5);
            return;
        }
        if (obj instanceof short[]) {
            ArrayList arrayList6 = this.f51591;
            short[] sArr = (short[]) obj;
            ArrayList arrayList7 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i < length3) {
                arrayList7.add(Short.valueOf(sArr[i]));
                i++;
            }
            arrayList6.add(arrayList7);
            return;
        }
        if (obj instanceof char[]) {
            ArrayList arrayList8 = this.f51591;
            char[] cArr = (char[]) obj;
            ArrayList arrayList9 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i < length4) {
                arrayList9.add(Character.valueOf(cArr[i]));
                i++;
            }
            arrayList8.add(arrayList9);
            return;
        }
        if (obj instanceof int[]) {
            this.f51591.add(C19266.m43902((int[]) obj));
            return;
        }
        if (obj instanceof long[]) {
            ArrayList arrayList10 = this.f51591;
            long[] jArr = (long[]) obj;
            ArrayList arrayList11 = new ArrayList(jArr.length);
            int length5 = jArr.length;
            while (i < length5) {
                arrayList11.add(Long.valueOf(jArr[i]));
                i++;
            }
            arrayList10.add(arrayList11);
            return;
        }
        if (obj instanceof float[]) {
            ArrayList arrayList12 = this.f51591;
            float[] fArr = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr.length);
            int length6 = fArr.length;
            while (i < length6) {
                arrayList13.add(Float.valueOf(fArr[i]));
                i++;
            }
            arrayList12.add(arrayList13);
            return;
        }
        if (obj instanceof double[]) {
            ArrayList arrayList14 = this.f51591;
            double[] dArr = (double[]) obj;
            ArrayList arrayList15 = new ArrayList(dArr.length);
            int length7 = dArr.length;
            while (i < length7) {
                arrayList15.add(Double.valueOf(dArr[i]));
                i++;
            }
            arrayList14.add(arrayList15);
            return;
        }
        this.f51591.add(obj);
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final void mo22774(String str, String str2, String str3) {
        ArrayList arrayList = this.f51591;
        String str4 = this.f51590;
        if (arrayList == null) {
            this.f51591 = new ArrayList(str4 != null ? 2 : 1);
        }
        if (str4 != null) {
            this.f51591.add(str);
        }
        this.f51591.add(new String[]{str2, str3});
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo22770(String str, String str2) {
        ArrayList arrayList = this.f51591;
        String str3 = this.f51590;
        if (arrayList == null) {
            this.f51591 = new ArrayList(str3 != null ? 2 : 1);
        }
        if (str3 != null) {
            this.f51591.add(str);
        }
        C17292 c17292 = new C17292(str2);
        this.f51591.add(c17292);
        return c17292;
    }

    @Override // p067l.AbstractC15773
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo22769(String str) {
        ArrayList arrayList = this.f51591;
        String str2 = this.f51590;
        if (arrayList == null) {
            this.f51591 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f51591.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        this.f51591.add(arrayList2);
        return new C17292(arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39204(AbstractC15773 abstractC15773) {
        if (abstractC15773 != null) {
            ArrayList arrayList = this.f51591;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i += 2) {
                    m39203(abstractC15773, (String) this.f51591.get(i), this.f51591.get(i + 1));
                }
            }
            abstractC15773.mo22771();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39203(AbstractC15773 abstractC15773, String str, Object obj) {
        if (abstractC15773 != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                abstractC15773.mo22774(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof C17292) {
                C17292 c17292 = (C17292) obj;
                c17292.m39204(abstractC15773.mo22770(str, c17292.f51590));
                return;
            }
            if (obj instanceof List) {
                AbstractC15773 abstractC15773Mo22769 = abstractC15773.mo22769(str);
                if (abstractC15773Mo22769 != null) {
                    List list = (List) obj;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        m39203(abstractC15773Mo22769, (String) null, list.get(i));
                    }
                    abstractC15773Mo22769.mo22771();
                    return;
                }
                return;
            }
            abstractC15773.mo22773(obj, str);
        }
    }
}
