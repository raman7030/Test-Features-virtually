package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45V6 */
/* JADX INFO: loaded from: classes5.dex */
public class C19034 extends C20376 implements InterfaceC2940 {

    /* JADX INFO: renamed from: ᩹ */
    public Object[] f56741;

    public C19034(int i) {
        super(i != 0);
        try {
            this.f56741 = new Object[i];
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC12309 m56517get(int i) {
        return (InterfaceC12309) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public InterfaceC13650 m56518get(int i) {
        return (InterfaceC13650) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C11599 m56516get(int i) {
        return (C11599) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC17417 m56521get(int i) {
        return (AbstractC17417) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C20316 m56523get(int i) {
        return (C20316) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC15405 m56519get(int i) {
        return (AbstractC15405) m43238(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43244(int i, C9626 c9626) {
        m43241(i, (Object) c9626);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43247(int i, C18323 c18323) {
        m43241(i, (Object) c18323);
    }

    public C2900 get(int i) {
        return (C2900) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C3571 m56512get(int i) {
        return (C3571) m43238(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43246(int i, AbstractC17417 abstractC17417) {
        m43241(i, (Object) abstractC17417);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f56741, ((C19034) obj).f56741);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43242(int i, C3571 c3571) {
        m43241(i, (Object) c3571);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C3551 m56511get(int i) {
        return (C3551) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C15640 m56520get(int i) {
        return (C15640) m43238(i);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C18088 m56522get(int i) {
        return (C18088) m43238(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f56741);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43245(int i, C15640 c15640) {
        m43241(i, (Object) c15640);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C24143 m56525get(int i) {
        return (C24143) m43238(i);
    }

    public final String toString() {
        String name = getClass().getName();
        return m43237(name.substring(name.lastIndexOf(46) + 1) + '{', C0249l.f1198d, false);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public AbstractC6924 m56513get(int i) {
        return (AbstractC6924) m43238(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo4819() {
        String name = getClass().getName();
        return m43237(name.substring(name.lastIndexOf(46) + 1) + '{', C0249l.f1198d, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43239(String str) {
        return m43237(str, C0249l.f1198d, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43249(int i, AbstractC25009 abstractC25009) {
        m43241(i, (Object) abstractC25009);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43240(String str, String str2) {
        return m43237(str, str2, true);
    }

    public final int size() {
        return this.f56741.length;
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C8856 m56514get(int i) {
        return (C8856) m43238(i);
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo40218() {
        int length = this.f56741.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f56741[i2] != null) {
                i++;
            }
        }
        if (length == i) {
            return;
        }
        m46001();
        Object[] objArr = new Object[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = this.f56741[i4];
            if (obj != null) {
                objArr[i3] = obj;
                i3++;
            }
        }
        this.f56741 = objArr;
        if (i == 0) {
            mo22326();
        }
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C22783 m56524get(int i) {
        return (C22783) m43238(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo14144(int i, AbstractC15405 abstractC15405) {
        m43241(i, (Object) abstractC15405);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m43238(int i) {
        try {
            Object obj = this.f56741[i];
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

    /* JADX INFO: renamed from: ֫ */
    public void m43248(int i, C22783 c22783) {
        m43241(i, (Object) c22783);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m43250(int i) {
        return this.f56741[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43241(int i, Object obj) {
        m46001();
        try {
            this.f56741[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IndexOutOfBoundsException("n < 0");
            }
            throw new IndexOutOfBoundsException("n >= size()");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m43237(String str, String str2, boolean z) {
        int length = this.f56741.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            if (z) {
                sb.append(((InterfaceC2940) this.f56741[i]).mo4819());
            } else {
                sb.append(this.f56741[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public C9566 m56515get(int i) {
        return (C9566) m43238(i);
    }

    public C9566 getType(int i) {
        return (C9566) m43238(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public void m43243(int i, C9566 c9566) {
        m43241(i, (Object) c9566);
    }
}
