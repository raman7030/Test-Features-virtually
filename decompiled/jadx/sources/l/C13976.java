package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ܰᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAZN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13976 extends Number {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f41688;

    public C13976(String str) {
        this.f41688 = str;
    }

    private Object writeReplace() {
        return C6901.m18686(this.f41688);
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f41688;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return C6901.m18686(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f41688;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return C6901.m18686(str).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f41688);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f41688);
    }

    public final String toString() {
        return this.f41688;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.f41688.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13976) {
            return this.f41688.equals(((C13976) obj).f41688);
        }
        return false;
    }
}
