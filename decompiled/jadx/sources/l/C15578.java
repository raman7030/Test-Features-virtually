package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܺ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15578 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f47997 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String[] f47996 = new String[3];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object[] f47995 = new Object[3];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m36719(C15578 c15578, String str) {
        c15578.getClass();
        return m36722(str);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m36720(String str) {
        return C20094.m46315("/", str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36716(int i) {
        C16990.m39825(i >= this.f47997);
        String[] strArr = this.f47996;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f47997 * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f47996 = (String[]) Arrays.copyOf(strArr, i);
        this.f47995 = Arrays.copyOf(this.f47995, i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m36736(String str) {
        C16990.m39822((Object) str);
        for (int i = 0; i < this.f47997; i++) {
            if (str.equals(this.f47996[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m36723(String str) {
        C16990.m39822((Object) str);
        for (int i = 0; i < this.f47997; i++) {
            if (str.equalsIgnoreCase(this.f47996[i])) {
                return i;
            }
        }
        return -1;
    }

    public final String get(String str) {
        Object obj;
        int iM36736 = m36736(str);
        return (iM36736 == -1 || (obj = this.f47995[iM36736]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36725(String str) {
        Object obj;
        int iM36723 = m36723(str);
        return (iM36723 == -1 || (obj = this.f47995[iM36723]) == null) ? "" : (String) obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m36731(String str) {
        C16990.m39822((Object) str);
        if (!m36722(str)) {
            str = m36720(str);
        }
        int iM36723 = m36723(str);
        if (iM36723 == -1) {
            return null;
        }
        return this.f47995[iM36723];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36727(String str, String str2) {
        m36717((Object) str2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36717(Object obj, String str) {
        m36716(this.f47997 + 1);
        String[] strArr = this.f47996;
        int i = this.f47997;
        strArr[i] = str;
        this.f47995[i] = obj;
        this.f47997 = i + 1;
    }

    public final void put(String str, String str2) {
        C16990.m39822((Object) str);
        int iM36736 = m36736(str);
        if (iM36736 == -1) {
            m36717((Object) str2, str);
        } else {
            this.f47995[iM36736] = str2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36728(String str, C1614 c1614) {
        C16990.m39822((Object) str);
        if (!m36722(str)) {
            str = m36720(str);
        }
        int iM36736 = m36736(str);
        if (iM36736 != -1) {
            this.f47995[iM36736] = c1614;
        } else {
            m36717(c1614, str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36732(String str, String str2) {
        int iM36723 = m36723(str);
        if (iM36723 == -1) {
            m36717((Object) str2, str);
            return;
        }
        this.f47995[iM36723] = str2;
        if (this.f47996[iM36723].equals(str)) {
            return;
        }
        this.f47996[iM36723] = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36729(C9230 c9230) {
        put(c9230.getKey(), c9230.getValue());
        c9230.f27937 = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        int i2 = this.f47997;
        if (i >= i2) {
            throw new C14167("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = this.f47996;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            Object[] objArr = this.f47995;
            System.arraycopy(objArr, i4, objArr, i, i3);
        }
        int i5 = this.f47997 - 1;
        this.f47997 = i5;
        this.f47996[i5] = null;
        this.f47995[i5] = null;
    }

    public final void remove() {
        int iM36736 = m36736(Name.LABEL);
        if (iM36736 != -1) {
            remove(iM36736);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36733(String str) {
        int iM36723 = m36723(str);
        if (iM36723 != -1) {
            remove(iM36723);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36735(String str) {
        return m36736(str) != -1;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m36738(String str) {
        return m36723(str) != -1;
    }

    public final int size() {
        return this.f47997;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36730(C15578 c15578) {
        int i = c15578.f47997;
        if (i == 0) {
            return;
        }
        m36716(this.f47997 + i);
        int i2 = 0;
        boolean z = this.f47997 != 0;
        while (true) {
            if (i2 < c15578.f47997 && m36722(c15578.f47996[i2])) {
                i2++;
            } else {
                if (i2 >= c15578.f47997) {
                    return;
                }
                C9230 c9230 = new C9230(c15578.f47996[i2], (String) c15578.f47995[i2], c15578);
                i2++;
                if (!z) {
                    m36717((Object) c9230.getValue(), c9230.getKey());
                } else {
                    m36729(c9230);
                }
            }
        }
    }

    public final boolean isEmpty() {
        return this.f47997 == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C8524(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m36734() {
        ArrayList arrayList = new ArrayList(this.f47997);
        for (int i = 0; i < this.f47997; i++) {
            if (!m36722(this.f47996[i])) {
                arrayList.add(new C9230(this.f47996[i], (String) this.f47995[i], this));
            }
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m36737() {
        StringBuilder sbM47000 = C20519.m47000();
        try {
            m36726(sbM47000, new C0762("").m2907());
            return C20519.m46998(sbM47000);
        } catch (IOException e) {
            throw new C1468(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36726(Appendable appendable, C0056 c0056) {
        String strM23668;
        int i = this.f47997;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m36722(this.f47996[i2]) && (strM23668 = C9230.m23668(this.f47996[i2], c0056.m984())) != null) {
                C9230.m23669(strM23668, (String) this.f47995[i2], appendable.append(' '), c0056);
            }
        }
    }

    public final String toString() {
        return m36737();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15578.class != obj.getClass()) {
            return false;
        }
        C15578 c15578 = (C15578) obj;
        if (this.f47997 != c15578.f47997) {
            return false;
        }
        for (int i = 0; i < this.f47997; i++) {
            int iM36736 = c15578.m36736(this.f47996[i]);
            if (iM36736 == -1) {
                return false;
            }
            Object obj2 = this.f47995[i];
            Object obj3 = c15578.f47995[iM36736];
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
        return Arrays.hashCode(this.f47995) + (((this.f47997 * 31) + Arrays.hashCode(this.f47996)) * 31);
    }

    public final C15578 clone() {
        try {
            C15578 c15578 = (C15578) super.clone();
            c15578.f47997 = this.f47997;
            c15578.f47996 = (String[]) Arrays.copyOf(this.f47996, this.f47997);
            c15578.f47995 = Arrays.copyOf(this.f47995, this.f47997);
            return c15578;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void normalize() {
        for (int i = 0; i < this.f47997; i++) {
            String[] strArr = this.f47996;
            strArr[i] = C23340.m51750(strArr[i]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36724(C1489 c1489) {
        String str;
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean zM5155 = c1489.m5155();
        int i2 = 0;
        while (i < this.f47996.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f47996;
                if (i4 >= strArr.length || (str = strArr[i4]) == null) {
                    break;
                }
                if (zM5155 && strArr[i].equals(str)) {
                    i2++;
                    remove(i4);
                    i4--;
                } else if (!zM5155) {
                    String[] strArr2 = this.f47996;
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m36722(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }
}
