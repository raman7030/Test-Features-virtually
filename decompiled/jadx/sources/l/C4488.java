package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: renamed from: l.ۙۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4488 extends AbstractC1269 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient Object[] f14279;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14280;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f14281;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11606 f14282;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22832 f14283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient int[] f14284;

    public C4488() {
        this.f14284 = C19389.f62753;
        this.f14279 = C7829.f24229;
    }

    public C4488(int i) {
        this.f14284 = new int[i];
        this.f14279 = new Object[i];
    }

    @Override // l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC22832 mo5869() {
        if (this.f14283 == null) {
            this.f14283 = new C0254(this);
        }
        return this.f14283;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int m13236(int i) {
        int[] iArr = this.f14284;
        int i2 = this.f14280;
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

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        int[] iArr = this.f14284;
        int i2 = this.f14280;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return null;
            }
            if (iArr[i3] == i) {
                return this.f14279[i3];
            }
            i2 = i3;
        }
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        return this.f14280;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f14279;
        int i = this.f14280;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f14280 = 0;
                return;
            }
        }
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m13236(i) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f14279;
        int i = this.f14280;
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
        return this.f14280 == 0;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        int iM13236 = m13236(i);
        if (iM13236 != -1) {
            Object[] objArr = this.f14279;
            Object obj2 = objArr[iM13236];
            objArr[iM13236] = obj;
            return obj2;
        }
        int i2 = this.f14280;
        if (i2 == this.f14284.length) {
            int[] iArr = new int[i2 == 0 ? 2 : i2 * 2];
            Object[] objArr2 = new Object[i2 != 0 ? i2 * 2 : 2];
            while (true) {
                int i3 = i2 - 1;
                if (i2 == 0) {
                    break;
                }
                iArr[i3] = this.f14284[i3];
                objArr2[i3] = this.f14279[i3];
                i2 = i3;
            }
            this.f14284 = iArr;
            this.f14279 = objArr2;
        }
        int[] iArr2 = this.f14284;
        int i4 = this.f14280;
        iArr2[i4] = i;
        this.f14279[i4] = obj;
        this.f14280 = i4 + 1;
        return null;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    public final Object remove(int i) {
        int iM13236 = m13236(i);
        if (iM13236 == -1) {
            return null;
        }
        Object obj = this.f14279[iM13236];
        int i2 = (this.f14280 - iM13236) - 1;
        int[] iArr = this.f14284;
        int i3 = iM13236 + 1;
        System.arraycopy(iArr, i3, iArr, iM13236, i2);
        Object[] objArr = this.f14279;
        System.arraycopy(objArr, i3, objArr, iM13236, i2);
        int i4 = this.f14280 - 1;
        this.f14280 = i4;
        this.f14279[i4] = null;
        return obj;
    }

    @Override // java.util.Map
    public final InterfaceC11606 keySet() {
        if (this.f14282 == null) {
            this.f14282 = new C8016(this);
        }
        return this.f14282;
    }

    @Override // java.util.Map
    public final InterfaceC19825 values() {
        if (this.f14281 == null) {
            this.f14281 = new C20011(this);
        }
        return this.f14281;
    }

    public final Object clone() {
        try {
            C4488 c4488 = (C4488) super.clone();
            c4488.f14284 = (int[]) this.f14284.clone();
            c4488.f14279 = (Object[]) this.f14279.clone();
            c4488.f14283 = null;
            c4488.f14282 = null;
            c4488.f14281 = null;
            return c4488;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int[] iArr = this.f14284;
        Object[] objArr = this.f14279;
        int i = this.f14280;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeInt(iArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f14280;
        int[] iArr = new int[i];
        this.f14284 = iArr;
        Object[] objArr = new Object[i];
        this.f14279 = objArr;
        for (int i2 = 0; i2 < this.f14280; i2++) {
            iArr[i2] = objectInputStream.readInt();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
