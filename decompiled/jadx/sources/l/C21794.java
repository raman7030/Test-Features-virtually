package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes2.dex */
public class C21794 extends AbstractC5817 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient Object[] f69811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69812;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f69813;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18559 f69814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient InterfaceC13326 f69815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Object[] f69816;

    public C21794() {
        Object[] objArr = C7829.f24229;
        this.f69816 = objArr;
        this.f69811 = objArr;
    }

    @Override // l.InterfaceC12621
    /* JADX INFO: renamed from: ۢۧ */
    public final InterfaceC18559 mo23689() {
        if (this.f69815 == null) {
            this.f69815 = new C4155(this);
        }
        return this.f69815;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int m49130(Object obj) {
        Object[] objArr = this.f69816;
        int i = this.f69812;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (C11003.equals(objArr[i2], obj)) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC9893
    public final Object get(Object obj) {
        Object[] objArr = this.f69816;
        int i = this.f69812;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (C11003.equals(objArr[i2], obj)) {
                return this.f69811[i2];
            }
            i = i2;
        }
    }

    @Override // l.AbstractC10051, l.InterfaceC9893
    public final int size() {
        return this.f69812;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f69816;
        Object[] objArr2 = this.f69811;
        int i = this.f69812;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                objArr2[i2] = null;
                i = i2;
            } else {
                this.f69812 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        return m49130(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f69811;
        int i = this.f69812;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f69812 == 0;
    }

    @Override // l.InterfaceC12621, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iM49130 = m49130(obj);
        if (iM49130 != -1) {
            Object[] objArr = this.f69811;
            Object obj3 = objArr[iM49130];
            objArr[iM49130] = obj2;
            return obj3;
        }
        int i = this.f69812;
        if (i == this.f69816.length) {
            Object[] objArr2 = new Object[i == 0 ? 2 : i * 2];
            Object[] objArr3 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr2[i2] = this.f69816[i2];
                objArr3[i2] = this.f69811[i2];
                i = i2;
            }
            this.f69816 = objArr2;
            this.f69811 = objArr3;
        }
        Object[] objArr4 = this.f69816;
        int i3 = this.f69812;
        objArr4[i3] = obj;
        this.f69811[i3] = obj2;
        this.f69812 = i3 + 1;
        return null;
    }

    @Override // l.InterfaceC12621, java.util.Map
    public final Object remove(Object obj) {
        int iM49130 = m49130(obj);
        if (iM49130 == -1) {
            return null;
        }
        Object obj2 = this.f69811[iM49130];
        int i = (this.f69812 - iM49130) - 1;
        Object[] objArr = this.f69816;
        int i2 = iM49130 + 1;
        System.arraycopy(objArr, i2, objArr, iM49130, i);
        Object[] objArr2 = this.f69811;
        System.arraycopy(objArr2, i2, objArr2, iM49130, i);
        int i3 = this.f69812 - 1;
        this.f69812 = i3;
        this.f69816[i3] = null;
        this.f69811[i3] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f69814 == null) {
            this.f69814 = new C0626(this);
        }
        return this.f69814;
    }

    @Override // java.util.Map
    public final InterfaceC19825 values() {
        if (this.f69813 == null) {
            this.f69813 = new C15442(this);
        }
        return this.f69813;
    }

    public final Object clone() {
        try {
            C21794 c21794 = (C21794) super.clone();
            c21794.f69816 = (Object[]) this.f69816.clone();
            c21794.f69811 = (Object[]) this.f69811.clone();
            c21794.f69815 = null;
            c21794.f69814 = null;
            c21794.f69813 = null;
            return c21794;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f69816;
        Object[] objArr2 = this.f69811;
        int i = this.f69812;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeObject(objArr2[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f69812;
        Object[] objArr = new Object[i];
        this.f69816 = objArr;
        Object[] objArr2 = new Object[i];
        this.f69811 = objArr2;
        for (int i2 = 0; i2 < this.f69812; i2++) {
            objArr[i2] = objectInputStream.readObject();
            objArr2[i2] = objectInputStream.readObject();
        }
    }
}
