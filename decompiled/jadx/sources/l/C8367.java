package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8367 extends AbstractC12167 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25674;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1043 f25675;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18559 f25676;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient InterfaceC13305 f25677;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Object[] f25678 = C7829.f24229;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int[] f25673 = C19389.f62753;

    @Override // l.InterfaceC12600
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18559 mo21967() {
        if (this.f25677 == null) {
            this.f25677 = new C16127(this);
        }
        return this.f25677;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int m21964(Object obj) {
        Object[] objArr = this.f25678;
        int i = this.f25674;
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

    @Override // l.InterfaceC21773
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo21968(Object obj) {
        Object[] objArr = this.f25678;
        int i = this.f25674;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return 0;
            }
            if (C11003.equals(objArr[i2], obj)) {
                return this.f25673[i2];
            }
            i = i2;
        }
    }

    @Override // l.AbstractC12872, l.InterfaceC9893
    public final int size() {
        return this.f25674;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f25678;
        int i = this.f25674;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f25674 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        return m21964(obj) != -1;
    }

    @Override // l.InterfaceC12600
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo21969(int i) {
        int[] iArr = this.f25673;
        int i2 = this.f25674;
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
        return this.f25674 == 0;
    }

    @Override // l.AbstractC12872, l.InterfaceC21773
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo21965(int i, Object obj) {
        int iM21964 = m21964(obj);
        if (iM21964 != -1) {
            int[] iArr = this.f25673;
            int i2 = iArr[iM21964];
            iArr[iM21964] = i;
            return i2;
        }
        int i3 = this.f25674;
        if (i3 == this.f25678.length) {
            Object[] objArr = new Object[i3 == 0 ? 2 : i3 * 2];
            int[] iArr2 = new int[i3 != 0 ? i3 * 2 : 2];
            while (true) {
                int i4 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                objArr[i4] = this.f25678[i4];
                iArr2[i4] = this.f25673[i4];
                i3 = i4;
            }
            this.f25678 = objArr;
            this.f25673 = iArr2;
        }
        Object[] objArr2 = this.f25678;
        int i5 = this.f25674;
        objArr2[i5] = obj;
        this.f25673[i5] = i;
        this.f25674 = i5 + 1;
        return 0;
    }

    @Override // l.AbstractC12872, l.InterfaceC21773
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo21966(Object obj) {
        int iM21964 = m21964(obj);
        if (iM21964 == -1) {
            return 0;
        }
        int i = this.f25673[iM21964];
        int i2 = (this.f25674 - iM21964) - 1;
        Object[] objArr = this.f25678;
        int i3 = iM21964 + 1;
        System.arraycopy(objArr, i3, objArr, iM21964, i2);
        int[] iArr = this.f25673;
        System.arraycopy(iArr, i3, iArr, iM21964, i2);
        int i4 = this.f25674 - 1;
        this.f25674 = i4;
        this.f25678[i4] = null;
        return i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f25676 == null) {
            this.f25676 = new C18951(this);
        }
        return this.f25676;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f25675 == null) {
            this.f25675 = new C1311(this);
        }
        return this.f25675;
    }

    public final Object clone() {
        try {
            C8367 c8367 = (C8367) super.clone();
            c8367.f25678 = (Object[]) this.f25678.clone();
            c8367.f25673 = (int[]) this.f25673.clone();
            c8367.f25677 = null;
            c8367.f25676 = null;
            c8367.f25675 = null;
            return c8367;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.f25678;
        int[] iArr = this.f25673;
        int i = this.f25674;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeObject(objArr[i2]);
            objectOutputStream.writeInt(iArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f25674;
        Object[] objArr = new Object[i];
        this.f25678 = objArr;
        int[] iArr = new int[i];
        this.f25673 = iArr;
        for (int i2 = 0; i2 < this.f25674; i2++) {
            objArr[i2] = objectInputStream.readObject();
            iArr[i2] = objectInputStream.readInt();
        }
    }
}
