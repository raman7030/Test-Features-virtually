package p067l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۤܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A641 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12237 implements Serializable {
    public static final long serialVersionUID = 9010790363003271996L;

    /* JADX INFO: renamed from: ۗ */
    public final boolean[][] f34186;

    /* JADX INFO: renamed from: ۙ */
    public String f34187;

    /* JADX INFO: renamed from: ۛ */
    public String f34188;

    /* JADX INFO: renamed from: ۤ */
    public int f34189;

    /* JADX INFO: renamed from: ۫ */
    public long f34190;

    /* JADX INFO: renamed from: ۬ */
    public String f34191;

    /* JADX INFO: renamed from: ᩶ */
    public String f34192;

    /* JADX INFO: renamed from: ᩸ */
    public Calendar f34193;

    /* JADX INFO: renamed from: ᩹ */
    public String f34194;

    public C12237() {
        this.f34189 = 3;
        this.f34190 = -1L;
        this.f34188 = "";
        this.f34194 = "";
        this.f34186 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
    }

    public C12237(String str) {
        this.f34189 = 3;
        this.f34190 = -1L;
        this.f34188 = "";
        this.f34194 = "";
        this.f34186 = null;
        this.f34191 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28209() {
        return this.f34194;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m28219() {
        return this.f34192;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m28222() {
        return this.f34187;
    }

    public final String toString() {
        return this.f34191;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m28226() {
        return this.f34191;
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m28224() {
        return this.f34190;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Calendar m28221() {
        return this.f34193;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28229() {
        return this.f34189;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m28216() {
        return this.f34188;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m28215(int i, int i2) {
        boolean[][] zArr = this.f34186;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m28228() {
        return this.f34189 == 1;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m28218() {
        return this.f34189 == 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m28217() {
        return this.f34189 == 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28213(String str) {
        this.f34194 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28220(String str) {
        this.f34192 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m28223(String str) {
        this.f34187 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28211(int i, int i2, boolean z) {
        this.f34186[i][i2] = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m28227(String str) {
        this.f34191 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28212(long j) {
        this.f34190 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28214(Calendar calendar) {
        this.f34193 = calendar;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28210(int i) {
        this.f34189 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28225(String str) {
        this.f34188 = str;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
