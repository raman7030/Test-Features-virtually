package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9304 extends AbstractC21689 implements Cloneable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28192;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f28193;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18517 f28194;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19182 f28195;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient long[] f28196 = C10010.f30148;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient Object[] f28191 = C7829.f24229;

    @Override // l.InterfaceC0130
    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC18559 mo1202() {
        if (this.f28195 == null) {
            this.f28195 = new C10715(this);
        }
        return this.f28195;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int m23889(long j) {
        long[] jArr = this.f28196;
        int i = this.f28192;
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

    @Override // l.InterfaceC15652
    /* JADX INFO: renamed from: ۧ */
    public final Object mo7450(long j) {
        long[] jArr = this.f28196;
        int i = this.f28192;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return null;
            }
            if (jArr[i2] == j) {
                return this.f28191[i2];
            }
            i = i2;
        }
    }

    @Override // l.InterfaceC9893
    public final int size() {
        return this.f28192;
    }

    @Override // java.util.Map
    public final void clear() {
        Object[] objArr = this.f28191;
        int i = this.f28192;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                objArr[i2] = null;
                i = i2;
            } else {
                this.f28192 = 0;
                return;
            }
        }
    }

    @Override // l.InterfaceC15652
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7449(long j) {
        return m23889(j) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Object[] objArr = this.f28191;
        int i = this.f28192;
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
        return this.f28192 == 0;
    }

    @Override // l.AbstractC15337
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo23890(long j, Object obj) {
        int iM23889 = m23889(j);
        if (iM23889 != -1) {
            Object[] objArr = this.f28191;
            Object obj2 = objArr[iM23889];
            objArr[iM23889] = obj;
            return obj2;
        }
        int i = this.f28192;
        if (i == this.f28196.length) {
            long[] jArr = new long[i == 0 ? 2 : i * 2];
            Object[] objArr2 = new Object[i != 0 ? i * 2 : 2];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                jArr[i2] = this.f28196[i2];
                objArr2[i2] = this.f28191[i2];
                i = i2;
            }
            this.f28196 = jArr;
            this.f28191 = objArr2;
        }
        long[] jArr2 = this.f28196;
        int i3 = this.f28192;
        jArr2[i3] = j;
        this.f28191[i3] = obj;
        this.f28192 = i3 + 1;
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m23891(long j) {
        int iM23889 = m23889(j);
        if (iM23889 == -1) {
            return null;
        }
        Object obj = this.f28191[iM23889];
        int i = (this.f28192 - iM23889) - 1;
        long[] jArr = this.f28196;
        int i2 = iM23889 + 1;
        System.arraycopy(jArr, i2, jArr, iM23889, i);
        Object[] objArr = this.f28191;
        System.arraycopy(objArr, i2, objArr, iM23889, i);
        int i3 = this.f28192 - 1;
        this.f28192 = i3;
        this.f28191[i3] = null;
        return obj;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f28194 == null) {
            this.f28194 = new C17064(this);
        }
        return this.f28194;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f28193 == null) {
            this.f28193 = new C20593(this);
        }
        return this.f28193;
    }

    public final Object clone() {
        try {
            C9304 c9304 = (C9304) super.clone();
            c9304.f28196 = (long[]) this.f28196.clone();
            c9304.f28191 = (Object[]) this.f28191.clone();
            c9304.f28195 = null;
            c9304.f28194 = null;
            c9304.f28193 = null;
            return c9304;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        long[] jArr = this.f28196;
        Object[] objArr = this.f28191;
        int i = this.f28192;
        for (int i2 = 0; i2 < i; i2++) {
            objectOutputStream.writeLong(jArr[i2]);
            objectOutputStream.writeObject(objArr[i2]);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = this.f28192;
        long[] jArr = new long[i];
        this.f28196 = jArr;
        Object[] objArr = new Object[i];
        this.f28191 = objArr;
        for (int i2 = 0; i2 < this.f28192; i2++) {
            jArr[i2] = objectInputStream.readLong();
            objArr[i2] = objectInputStream.readObject();
        }
    }
}
