package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.ۙ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B99Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C7049 extends AbstractC14050 implements InterfaceC23813, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public final Enum[] f18351;

    public C7049(Enum[] enumArr) {
        C13045.m29867(enumArr, "entries");
        this.f18351 = enumArr;
    }

    @Override // p067l.AbstractC23438, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.f18351;
        C13045.m29867(enumArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4;
    }

    @Override // p067l.AbstractC14050, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f18351;
        C13045.m29867(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p067l.AbstractC14050, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f18351;
        C13045.m29867(enumArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p067l.AbstractC23438
    /* JADX INFO: renamed from: ۧ */
    public final int mo16197() {
        return this.f18351.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f18351;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    private final Object writeReplace() {
        return new C5708(this.f18351);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
