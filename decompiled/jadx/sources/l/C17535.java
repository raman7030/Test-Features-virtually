package l;

import com.alipay.sdk.m.y.l;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45V6 */
/* JADX INFO: loaded from: classes5.dex */
public class C17535 extends C18947 implements InterfaceC0601 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object[] f53550;

    public C17535(int i) {
        super(i != 0);
        try {
            this.f53550 = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC10459 m40997get(int i) {
        return (InterfaceC10459) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC11870 m40998get(int i) {
        return (InterfaceC11870) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C9712 m40996get(int i) {
        return (C9712) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC15834 m41001get(int i) {
        return (AbstractC15834) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C18884 m41003get(int i) {
        return (C18884) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC13717 m40999get(int i) {
        return (AbstractC13717) m40978(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40984(int i, C7636 c7636) {
        m40981(i, (Object) c7636);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40987(int i, C16787 c16787) {
        m40981(i, (Object) c16787);
    }

    public C0559 get(int i) {
        return (C0559) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C1265 m40992get(int i) {
        return (C1265) m40978(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40986(int i, AbstractC15834 abstractC15834) {
        m40981(i, (Object) abstractC15834);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f53550, ((C17535) obj).f53550);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40982(int i, C1265 c1265) {
        m40981(i, (Object) c1265);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C1244 m40991get(int i) {
        return (C1244) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C13964 m41000get(int i) {
        return (C13964) m40978(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C16540 m41002get(int i) {
        return (C16540) m40978(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f53550);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40985(int i, C13964 c13964) {
        m40981(i, (Object) c13964);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C22911 m41005get(int i) {
        return (C22911) m40978(i);
    }

    public final String toString() {
        String name = getClass().getName();
        return m40977(name.substring(name.lastIndexOf(46) + 1) + '{', l.d, false);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC4793 m40993get(int i) {
        return (AbstractC4793) m40978(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo2463() {
        String name = getClass().getName();
        return m40977(name.substring(name.lastIndexOf(46) + 1) + '{', l.d, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40979(String str) {
        return m40977(str, l.d, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40989(int i, AbstractC23822 abstractC23822) {
        m40981(i, (Object) abstractC23822);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40980(String str, String str2) {
        return m40977(str, str2, true);
    }

    public final int size() {
        return this.f53550.length;
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C6826 m40994get(int i) {
        return (C6826) m40978(i);
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo38026() {
        int length = this.f53550.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f53550[i2] != null) {
                i++;
            }
        }
        if (length == i) {
            return;
        }
        m43734();
        Object[] objArr = new Object[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.f53550[i4];
            if (obj != null) {
                objArr[i3] = obj;
                i3++;
            }
        }
        this.f53550 = objArr;
        if (i == 0) {
            mo20349();
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C21480 m41004get(int i) {
        return (C21480) m40978(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12223(int i, AbstractC13717 abstractC13717) {
        m40981(i, (Object) abstractC13717);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m40978(int i) {
        try {
            Object obj = this.f53550[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40988(int i, C21480 c21480) {
        m40981(i, (Object) c21480);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m40990(int i) {
        return this.f53550[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40981(int i, Object obj) {
        m43734();
        try {
            this.f53550[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m40977(String str, String str2, boolean z) {
        int length = this.f53550.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC0601) this.f53550[i]).mo2463());
            } else {
                sb.append(this.f53550[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C7573 m40995get(int i) {
        return (C7573) m40978(i);
    }

    public C7573 getType(int i) {
        return (C7573) m40978(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40983(int i, C7573 c7573) {
        m40981(i, (Object) c7573);
    }
}
