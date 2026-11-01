package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C11211 extends AbstractC22982 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ */
    public int f31141;

    /* JADX INFO: renamed from: ۬ */
    public transient InterfaceC21210 f31142;

    /* JADX INFO: renamed from: ᩶ */
    public transient InterfaceC19967 f31143;

    /* JADX INFO: renamed from: ᩸ */
    public transient InterfaceC20599 f31144;

    /* JADX INFO: renamed from: ᩹ */
    public transient long[] f31145 = C11882.f33108;

    /* JADX INFO: renamed from: ۗ */
    public transient Object[] f31140 = C9809.f27145;

    @Override // p067l.InterfaceC2492
    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC20007 mo3604() {
        if (this.f31144 == null) {
            this.f31144 = new C12552(this);
        }
        return this.f31144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public int m25898(long j) {
        long[] jArr = this.f31145;
        int i = this.f31141;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return -1;
            }
            if (jArr[i2] == j) {
                return i2;
            }
            i = i2;
        }
    }

    @Override // p067l.InterfaceC17244
    /* JADX INFO: renamed from: ۧ */
    public final Object mo9532(long j) {
        long[] jArr = this.f31145;
        int i = this.f31141;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (jArr[i2] == j) {
                return this.f31140[i2];
            }
            i = i2;
        }
    }

    @Override // p067l.InterfaceC11771
    public final int size() {
        return this.f31141;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f31140;
        int i = this.f31141;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f31141 = 0;
                return;
            }
        }
    }

    @Override // p067l.InterfaceC17244
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9531(long j) {
        return m25898(j) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f31140;
        int i = this.f31141;
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
        return this.f31141 == 0;
    }

    @Override // p067l.AbstractC16945
    /* JADX INFO: renamed from: ֫ */
    public final Object mo25899(long j, Object obj) {
        int iM25898 = m25898(j);
        if (iM25898 != -1) {
            Object[] objArr = this.f31140;
            Object obj2 = objArr[iM25898];
            objArr[iM25898] = obj;
            return obj2;
        }
        int i = this.f31141;
        if (i == this.f31145.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            Object[] objArr2 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f31145[i2];
                objArr2[i2] = this.f31140[i2];
                i = i2;
            }
            this.f31145 = jArr;
            this.f31140 = objArr2;
        }
        long[] jArr2 = this.f31145;
        int i3 = this.f31141;
        jArr2[i3] = j;
        this.f31140[i3] = obj;
        this.f31141 = i3 + 1;
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m25900(long j) {
        int iM25898 = m25898(j);
        if (iM25898 == -1) {
            return null;
        }
        Object obj = this.f31140[iM25898];
        int i = (this.f31141 - iM25898) - 1;
        long[] jArr = this.f31145;
        int i2 = iM25898 + 1;
        System.arraycopy(jArr, i2, jArr, iM25898, i);
        Object[] objArr = this.f31140;
        System.arraycopy(objArr, i2, objArr, iM25898, i);
        int i3 = this.f31141 - 1;
        this.f31141 = i3;
        this.f31140[i3] = null;
        return obj;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f31143 == null) {
            this.f31143 = new C18586(this);
        }
        return this.f31143;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f31142 == null) {
            this.f31142 = new C21940(this);
        }
        return this.f31142;
    }

    public final Object clone() {
        try {
            C11211 c11211 = (C11211) super.clone();
            c11211.f31145 = (long[]) this.f31145.clone();
            c11211.f31140 = (Object[]) this.f31140.clone();
            c11211.f31144 = null;
            c11211.f31143 = null;
            c11211.f31142 = null;
            return c11211;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f31145;
        Object[] objArr = this.f31140;
        int i = this.f31141;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeLong(jArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f31141;
        long[] jArr = new long[i];
        this.f31145 = jArr;
        Object[] objArr = new Object[i];
        this.f31140 = objArr;
        for (int i2 = 0; i2 < this.f31141; i2++) {
            jArr[i2] = objectInputStream.readLong();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
