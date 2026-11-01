package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܺ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17173 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ᩹ */
    public int f51129 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public String[] f51128 = new String[3];

    /* JADX INFO: renamed from: ᩶ */
    public Object[] f51127 = new Object[3];

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ boolean m38880(C17173 c17173, String str) {
        c17173.getClass();
        return m38883(str);
    }

    /* JADX INFO: renamed from: ۜ */
    public static String m38881(String str) {
        return C21466.m48631("/", str);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38877(int i) {
        C18515.m42068(i >= this.f51129);
        String[] strArr = this.f51128;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f51129 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f51128 = (String[]) Arrays.copyOf(strArr, i);
        this.f51127 = Arrays.copyOf(this.f51127, i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m38897(String str) {
        C18515.m42065((Object) str);
        for (int i = 0; i < this.f51129; i++) {
            if (str.equals(this.f51128[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m38884(String str) {
        C18515.m42065((Object) str);
        for (int i = 0; i < this.f51129; i++) {
            if (str.equalsIgnoreCase(this.f51128[i])) {
                return i;
            }
        }
        return -1;
    }

    public final String get(String str) {
        Object obj;
        int iM38897 = m38897(str);
        return (iM38897 == -1 || (obj = this.f51127[iM38897]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m38886(String str) {
        Object obj;
        int iM38884 = m38884(str);
        return (iM38884 == -1 || (obj = this.f51127[iM38884]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m38892(String str) {
        C18515.m42065((Object) str);
        if (!m38883(str)) {
            str = m38881(str);
        }
        int iM38884 = m38884(str);
        if (iM38884 == -1) {
            return null;
        }
        return this.f51127[iM38884];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38888(String str, String str2) {
        m38878((Object) str2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38878(Object obj, String str) {
        m38877(this.f51129 + 1);
        String[] strArr = this.f51128;
        int i = this.f51129;
        strArr[i] = str;
        this.f51127[i] = obj;
        this.f51129 = i + 1;
    }

    public final void put(String str, String str2) {
        C18515.m42065((Object) str);
        int iM38897 = m38897(str);
        if (iM38897 == -1) {
            m38878((Object) str2, str);
        } else {
            this.f51127[iM38897] = str2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38889(String str, C3902 c3902) {
        C18515.m42065((Object) str);
        if (!m38883(str)) {
            str = m38881(str);
        }
        int iM38897 = m38897(str);
        if (iM38897 != -1) {
            this.f51127[iM38897] = c3902;
        } else {
            m38878(c3902, str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38893(String str, String str2) {
        int iM38884 = m38884(str);
        if (iM38884 == -1) {
            m38878((Object) str2, str);
            return;
        }
        this.f51127[iM38884] = str2;
        if (this.f51128[iM38884].equals(str)) {
            return;
        }
        this.f51128[iM38884] = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38890(C11140 c11140) {
        put(c11140.getKey(), c11140.getValue());
        c11140.f30883 = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        int i2 = this.f51129;
        if (i >= i2) {
            throw new C15832("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.f51128;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.f51127;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.f51129 - 1;
        this.f51129 = i5;
        this.f51128[i5] = null;
        this.f51127[i5] = null;
    }

    public final void remove() {
        int iM38897 = m38897(Name.LABEL);
        if (iM38897 != -1) {
            remove(iM38897);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m38894(String str) {
        int iM38884 = m38884(str);
        if (iM38884 != -1) {
            remove(iM38884);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m38896(String str) {
        return m38897(str) != -1;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m38899(String str) {
        return m38884(str) != -1;
    }

    public final int size() {
        return this.f51129;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38891(C17173 c17173) {
        int i = c17173.f51129;
        if (i == 0) {
            return;
        }
        m38877(this.f51129 + i);
        int i2 = 0;
        boolean z = this.f51129 != 0;
        while (true) {
            if (i2 < c17173.f51129 && m38883(c17173.f51128[i2])) {
                i2++;
            } else {
                if (i2 >= c17173.f51129) {
                    return;
                }
                C11140 c11140 = new C11140(c17173.f51128[i2], (String) c17173.f51127[i2], c17173);
                i2++;
                if (!z) {
                    m38878((Object) c11140.getValue(), c11140.getKey());
                } else {
                    m38890(c11140);
                }
            }
        }
    }

    public final boolean isEmpty() {
        return this.f51129 == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10469(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m38895() {
        ArrayList arrayList = new ArrayList(this.f51129);
        for (int i = 0; i < this.f51129; i++) {
            if (!m38883(this.f51128[i])) {
                arrayList.add(new C11140(this.f51128[i], (String) this.f51127[i], this));
            }
        }
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m38898() {
        StringBuilder sbM49323 = C21869.m49323();
        try {
            m38887(sbM49323, new C3092("").m5236());
            return C21869.m49321(sbM49323);
        } catch (IOException e) {
            throw new C3763(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38887(Appendable appendable, C2421 c2421) {
        String strM25667;
        int i = this.f51129;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m38883(this.f51128[i2]) && (strM25667 = C11140.m25667(this.f51128[i2], c2421.m3379())) != null) {
                C11140.m25668(strM25667, (String) this.f51127[i2], appendable.append(' '), c2421);
            }
        }
    }

    public final String toString() {
        return m38898();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17173.class != obj.getClass()) {
            return false;
        }
        C17173 c17173 = (C17173) obj;
        if (this.f51129 != c17173.f51129) {
            return false;
        }
        for (int i = 0; i < this.f51129; i++) {
            int iM38897 = c17173.m38897(this.f51128[i]);
            if (iM38897 == -1) {
                return false;
            }
            Object obj2 = this.f51127[i];
            Object obj3 = c17173.f51127[iM38897];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f51127) + (((this.f51129 * 31) + Arrays.hashCode(this.f51128)) * 31);
    }

    public final C17173 clone() {
        try {
            C17173 c17173 = (C17173) super.clone();
            c17173.f51129 = this.f51129;
            c17173.f51128 = (String[]) Arrays.copyOf(this.f51128, this.f51129);
            c17173.f51127 = Arrays.copyOf(this.f51127, this.f51129);
            return c17173;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void normalize() {
        for (int i = 0; i < this.f51129; i++) {
            String[] strArr = this.f51128;
            strArr[i] = C24550.m54147(strArr[i]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX INFO: renamed from: ֫ */
    public final int m38885(C3783 c3783) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zM7397 = c3783.m7397();
        int i2 = 0;
        while (i < this.f51128.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f51128;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (zM7397 && strArr[i].equals(str)) {
                    i2++;
                    remove(i4);
                    i4--;
                } else if (!zM7397) {
                    String[] strArr2 = this.f51128;
                    if (strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                        i2++;
                        remove(i4);
                        i4--;
                    }
                }
                i4++;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m38883(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }
}
