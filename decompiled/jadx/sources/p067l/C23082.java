package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes2.dex */
public class C23082 extends AbstractC7897 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public transient Object[] f72519;

    /* JADX INFO: renamed from: ۙ */
    public int f72520;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC21210 f72521;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC20007 f72522;

    /* JADX INFO: renamed from: ᩸ */
    public transient InterfaceC15034 f72523;

    /* JADX INFO: renamed from: ᩹ */
    public transient Object[] f72524;

    public C23082() {
        Object[] objArr = C9809.f27145;
        this.f72524 = objArr;
        this.f72519 = objArr;
    }

    @Override // p067l.InterfaceC14364
    /* JADX INFO: renamed from: ۢۧ */
    public final InterfaceC20007 mo25689() {
        if (this.f72523 == null) {
            this.f72523 = new C6318(this);
        }
        return this.f72523;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public int m51480(Object obj) {
        Object[] objArr = this.f72524;
        int i = this.f72520;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C12826.equals(objArr[i2], obj)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.InterfaceC11771
    public final Object get(Object obj) {
        Object[] objArr = this.f72524;
        int i = this.f72520;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (C12826.equals(objArr[i2], obj)) {
                return this.f72519[i2];
            }
            i = i2;
        }
    }

    @Override // p067l.AbstractC11921, p067l.InterfaceC11771
    public final int size() {
        return this.f72520;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f72524;
        Object[] objArr2 = this.f72519;
        int i = this.f72520;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                objArr2[i2] = null;
                i = i2;
            } else {
                this.f72520 = 0;
                return;
            }
        }
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        return m51480(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f72519;
        int i = this.f72520;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C12826.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f72520 == 0;
    }

    @Override // p067l.InterfaceC14364, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM51480 = m51480(obj);
        if (iM51480 != -1) {
            Object[] objArr = this.f72519;
            Object obj3 = objArr[iM51480];
            objArr[iM51480] = obj2;
            return obj3;
        }
        int i = this.f72520;
        if (i == this.f72524.length) {
            Object[] objArr2 = new Object[i == 0 ? 2 : i * 2];
            Object[] objArr3 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr2[i2] = this.f72524[i2];
                objArr3[i2] = this.f72519[i2];
                i = i2;
            }
            this.f72524 = objArr2;
            this.f72519 = objArr3;
        }
        Object[] objArr4 = this.f72524;
        int i3 = this.f72520;
        objArr4[i3] = obj;
        this.f72519[i3] = obj2;
        this.f72520 = i3 + 1;
        return null;
    }

    @Override // p067l.InterfaceC14364, java.util.Map
    public final Object remove(Object obj) {
        int iM51480 = m51480(obj);
        if (iM51480 == -1) {
            return null;
        }
        Object obj2 = this.f72519[iM51480];
        int i = (this.f72520 - iM51480) - 1;
        Object[] objArr = this.f72524;
        int i2 = iM51480 + 1;
        System.arraycopy(objArr, i2, objArr, iM51480, i);
        Object[] objArr2 = this.f72519;
        System.arraycopy(objArr2, i2, objArr2, iM51480, i);
        int i3 = this.f72520 - 1;
        this.f72520 = i3;
        this.f72524[i3] = null;
        this.f72519[i3] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f72522 == null) {
            this.f72522 = new C2964(this);
        }
        return this.f72522;
    }

    @Override // java.util.Map
    public final InterfaceC21210 values() {
        if (this.f72521 == null) {
            this.f72521 = new C17045(this);
        }
        return this.f72521;
    }

    public final Object clone() {
        try {
            C23082 c23082 = (C23082) super.clone();
            c23082.f72524 = (Object[]) this.f72524.clone();
            c23082.f72519 = (Object[]) this.f72519.clone();
            c23082.f72523 = null;
            c23082.f72522 = null;
            c23082.f72521 = null;
            return c23082;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f72524;
        Object[] objArr2 = this.f72519;
        int i = this.f72520;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeObject(objArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f72520;
        Object[] objArr = new Object[i];
        this.f72524 = objArr;
        Object[] objArr2 = new Object[i];
        this.f72519 = objArr2;
        for (int i2 = 0; i2 < this.f72520; i2++) {
            objArr[i2] = objectInputStream.readObject();
            objArr2[i2] = objectInputStream.readObject();
        }
    }
}
