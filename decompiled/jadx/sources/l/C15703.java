package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R65Z */
/* JADX INFO: loaded from: classes4.dex */
public class C15703 extends AbstractC14104 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f48452;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f48453;

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final void mo20790() {
    }

    public C15703(String str) {
        this(str, 0);
        if (getClass() != C15703.class) {
            throw new IllegalStateException();
        }
    }

    public C15703(String str, int i) {
        this.f48452 = str;
    }

    public C15703(ArrayList arrayList) {
        this.f48453 = arrayList;
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final void mo20792(Object obj, String str) {
        ArrayList arrayList = this.f48453;
        String str2 = this.f48452;
        if (arrayList == null) {
            this.f48453 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f48453.add(str);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            ArrayList arrayList2 = this.f48453;
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
            ArrayList arrayList4 = this.f48453;
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
            ArrayList arrayList6 = this.f48453;
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
            ArrayList arrayList8 = this.f48453;
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
            this.f48453.add(C17780.m41656((int[]) obj));
            return;
        }
        if (obj instanceof long[]) {
            ArrayList arrayList10 = this.f48453;
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
            ArrayList arrayList12 = this.f48453;
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
            ArrayList arrayList14 = this.f48453;
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
        this.f48453.add(obj);
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final void mo20793(String str, String str2, String str3) {
        ArrayList arrayList = this.f48453;
        String str4 = this.f48452;
        if (arrayList == null) {
            this.f48453 = new ArrayList(str4 != null ? 2 : 1);
        }
        if (str4 != null) {
            this.f48453.add(str);
        }
        this.f48453.add(new String[]{str2, str3});
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo20789(String str, String str2) {
        ArrayList arrayList = this.f48453;
        String str3 = this.f48452;
        if (arrayList == null) {
            this.f48453 = new ArrayList(str3 != null ? 2 : 1);
        }
        if (str3 != null) {
            this.f48453.add(str);
        }
        C15703 c15703 = new C15703(str2);
        this.f48453.add(c15703);
        return c15703;
    }

    @Override // l.AbstractC14104
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo20788(String str) {
        ArrayList arrayList = this.f48453;
        String str2 = this.f48452;
        if (arrayList == null) {
            this.f48453 = new ArrayList(str2 != null ? 2 : 1);
        }
        if (str2 != null) {
            this.f48453.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        this.f48453.add(arrayList2);
        return new C15703(arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37037(AbstractC14104 abstractC14104) {
        if (abstractC14104 != null) {
            ArrayList arrayList = this.f48453;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i += 2) {
                    m37036(abstractC14104, (String) this.f48453.get(i), this.f48453.get(i + 1));
                }
            }
            abstractC14104.mo20790();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37036(AbstractC14104 abstractC14104, String str, Object obj) {
        if (abstractC14104 != null) {
            if (obj instanceof String[]) {
                String[] strArr = (String[]) obj;
                abstractC14104.mo20793(str, strArr[0], strArr[1]);
                return;
            }
            if (obj instanceof C15703) {
                C15703 c15703 = (C15703) obj;
                c15703.m37037(abstractC14104.mo20789(str, c15703.f48452));
                return;
            }
            if (obj instanceof List) {
                AbstractC14104 abstractC14104Mo20788 = abstractC14104.mo20788(str);
                if (abstractC14104Mo20788 != null) {
                    List list = (List) obj;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        m37036(abstractC14104Mo20788, (String) null, list.get(i));
                    }
                    abstractC14104Mo20788.mo20790();
                    return;
                }
                return;
            }
            abstractC14104.mo20792(obj, str);
        }
    }
}
