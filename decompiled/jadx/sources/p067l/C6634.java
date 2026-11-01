package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: l.ۙۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6634 extends AbstractC3575 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public transient Object[] f17106;

    /* JADX INFO: renamed from: ۙ */
    public int f17107;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC21210 f17108;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC13399 f17109;

    /* JADX INFO: renamed from: ᩸ */
    public transient InterfaceC24068 f17110;

    /* JADX INFO: renamed from: ᩹ */
    public transient int[] f17111;

    public C6634() {
        this.f17111 = C20796.f65364;
        this.f17106 = C9809.f27145;
    }

    public C6634(int i) {
        this.f17111 = new int[i];
        this.f17106 = new Object[i];
    }

    @Override // p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC24068 mo8079() {
        if (this.f17110 == null) {
            this.f17110 = new C2610(this);
        }
        return this.f17110;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public int m15118(int i) {
        int[] iArr = this.f17111;
        int i2 = this.f17107;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            if (iArr[i3] == i) {
                return i3;
            }
            i2 = i3;
        }
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        int[] iArr = this.f17111;
        int i2 = this.f17107;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return null;
            }
            if (iArr[i3] == i) {
                return this.f17106[i3];
            }
            i2 = i3;
        }
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final int size() {
        return this.f17107;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f17106;
        int i = this.f17107;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f17107 = 0;
                return;
            }
        }
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        return m15118(i) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f17106;
        int i = this.f17107;
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
        return this.f17107 == 0;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        int iM15118 = m15118(i);
        if (iM15118 != -1) {
            Object[] objArr = this.f17106;
            Object obj2 = objArr[iM15118];
            objArr[iM15118] = obj;
            return obj2;
        }
        int i2 = this.f17107;
        if (i2 == this.f17111.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            Object[] objArr2 = new Object[i2 != 0 ? i2 * 2 : 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f17111[i3];
                objArr2[i3] = this.f17106[i3];
                i2 = i3;
            }
            this.f17111 = iArr;
            this.f17106 = objArr2;
        }
        int[] iArr2 = this.f17111;
        int i4 = this.f17107;
        iArr2[i4] = i;
        this.f17106[i4] = obj;
        this.f17107 = i4 + 1;
        return null;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    public final Object remove(int i) {
        int iM15118 = m15118(i);
        if (iM15118 == -1) {
            return null;
        }
        Object obj = this.f17106[iM15118];
        int i2 = (this.f17107 - iM15118) - 1;
        int[] iArr = this.f17111;
        int i3 = iM15118 + 1;
        System.arraycopy(iArr, i3, iArr, iM15118, i2);
        Object[] objArr = this.f17106;
        System.arraycopy(objArr, i3, objArr, iM15118, i2);
        int i4 = this.f17107 - 1;
        this.f17107 = i4;
        this.f17106[i4] = null;
        return obj;
    }

    @Override // java.util.Map
    public final InterfaceC13399 keySet() {
        if (this.f17109 == null) {
            this.f17109 = new C9987(this);
        }
        return this.f17109;
    }

    @Override // java.util.Map
    public final InterfaceC21210 values() {
        if (this.f17108 == null) {
            this.f17108 = new C21387(this);
        }
        return this.f17108;
    }

    public final Object clone() {
        try {
            C6634 c6634 = (C6634) super.clone();
            c6634.f17111 = (int[]) this.f17111.clone();
            c6634.f17106 = (Object[]) this.f17106.clone();
            c6634.f17110 = null;
            c6634.f17109 = null;
            c6634.f17108 = null;
            return c6634;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f17111;
        Object[] objArr = this.f17106;
        int i = this.f17107;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeInt(iArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f17107;
        int[] iArr = new int[i];
        this.f17111 = iArr;
        Object[] objArr = new Object[i];
        this.f17106 = objArr;
        for (int i2 = 0; i2 < this.f17107; i2++) {
            iArr[i2] = objectInputStream.readInt();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
