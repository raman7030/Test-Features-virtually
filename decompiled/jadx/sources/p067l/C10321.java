package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10321 extends AbstractC13932 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ */
    public int f28587;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC3360 f28588;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC20007 f28589;

    /* JADX INFO: renamed from: ᩸ */
    public transient InterfaceC15014 f28590;

    /* JADX INFO: renamed from: ᩹ */
    public transient Object[] f28591 = C9809.f27145;

    /* JADX INFO: renamed from: ۗ */
    public transient int[] f28586 = C20796.f65364;

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ֫֫ */
    public final InterfaceC20007 mo23938() {
        if (this.f28590 == null) {
            this.f28590 = new C17696(this);
        }
        return this.f28590;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public int m23935(Object obj) {
        Object[] objArr = this.f28591;
        int i = this.f28587;
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

    @Override // p067l.InterfaceC23062
    /* JADX INFO: renamed from: ۧ */
    public final int mo23939(Object obj) {
        Object[] objArr = this.f28591;
        int i = this.f28587;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return 0;
            }
            if (C12826.equals(objArr[i2], obj)) {
                return this.f28586[i2];
            }
            i = i2;
        }
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC11771
    public final int size() {
        return this.f28587;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f28591;
        int i = this.f28587;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f28587 = 0;
                return;
            }
        }
    }

    @Override // p067l.InterfaceC11771
    public final boolean containsKey(Object obj) {
        return m23935(obj) != -1;
    }

    @Override // p067l.InterfaceC14344
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo23940(int i) {
        int[] iArr = this.f28586;
        int i2 = this.f28587;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (iArr[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f28587 == 0;
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public final int mo23936(int i, Object obj) {
        int iM23935 = m23935(obj);
        if (iM23935 != -1) {
            int[] iArr = this.f28586;
            int i2 = iArr[iM23935];
            iArr[iM23935] = i;
            return i2;
        }
        int i3 = this.f28587;
        if (i3 == this.f28591.length) {
            Object[] objArr = new Object[i3 == 0 ? 2 : i3 * 2];
            int[] iArr2 = new int[i3 != 0 ? i3 * 2 : 2];
            while (true) {
                int i4 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                objArr[i4] = this.f28591[i4];
                iArr2[i4] = this.f28586[i4];
                i3 = i4;
            }
            this.f28591 = objArr;
            this.f28586 = iArr2;
        }
        Object[] objArr2 = this.f28591;
        int i5 = this.f28587;
        objArr2[i5] = obj;
        this.f28586[i5] = i;
        this.f28587 = i5 + 1;
        return 0;
    }

    @Override // p067l.AbstractC14602, p067l.InterfaceC23062
    /* JADX INFO: renamed from: ֫ */
    public final int mo23937(Object obj) {
        int iM23935 = m23935(obj);
        if (iM23935 == -1) {
            return 0;
        }
        int i = this.f28586[iM23935];
        int i2 = (this.f28587 - iM23935) - 1;
        Object[] objArr = this.f28591;
        int i3 = iM23935 + 1;
        System.arraycopy(objArr, i3, objArr, iM23935, i2);
        int[] iArr = this.f28586;
        System.arraycopy(iArr, i3, iArr, iM23935, i2);
        int i4 = this.f28587 - 1;
        this.f28587 = i4;
        this.f28591[i4] = null;
        return i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f28589 == null) {
            this.f28589 = new C20380(this);
        }
        return this.f28589;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f28588 == null) {
            this.f28588 = new C3615(this);
        }
        return this.f28588;
    }

    public final Object clone() {
        try {
            C10321 c10321 = (C10321) super.clone();
            c10321.f28591 = (Object[]) this.f28591.clone();
            c10321.f28586 = (int[]) this.f28586.clone();
            c10321.f28590 = null;
            c10321.f28589 = null;
            c10321.f28588 = null;
            return c10321;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f28591;
        int[] iArr = this.f28586;
        int i = this.f28587;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeInt(iArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f28587;
        Object[] objArr = new Object[i];
        this.f28591 = objArr;
        int[] iArr = new int[i];
        this.f28586 = iArr;
        for (int i2 = 0; i2 < this.f28587; i2++) {
            objArr[i2] = objectInputStream.readObject();
            iArr[i2] = objectInputStream.readInt();
        }
    }
}
