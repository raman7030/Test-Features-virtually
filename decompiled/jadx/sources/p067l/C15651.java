package p067l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ܰᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C15651 extends Number {

    /* JADX INFO: renamed from: ᩸ */
    public final String f44771;

    public C15651(String str) {
        this.f44771 = str;
    }

    private Object writeReplace() {
        return C8927.m20635(this.f44771);
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f44771;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return C8927.m20635(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f44771;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return C8927.m20635(str).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f44771);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f44771);
    }

    public final String toString() {
        return this.f44771;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.f44771.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15651) {
            return this.f44771.equals(((C15651) obj).f44771);
        }
        return false;
    }
}
