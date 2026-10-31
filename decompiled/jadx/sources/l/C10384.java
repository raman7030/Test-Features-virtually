package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۤܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A641 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10384 implements Serializable {
    public static final long serialVersionUID = 9010790363003271996L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean[][] f31221;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f31222;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f31223;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31224;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f31225;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f31226;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f31227;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Calendar f31228;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f31229;

    public C10384() {
        this.f31224 = 3;
        this.f31225 = -1L;
        this.f31223 = "";
        this.f31229 = "";
        this.f31221 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
    }

    public C10384(String str) {
        this.f31224 = 3;
        this.f31225 = -1L;
        this.f31223 = "";
        this.f31229 = "";
        this.f31221 = null;
        this.f31226 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26180() {
        return this.f31229;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m26190() {
        return this.f31227;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m26193() {
        return this.f31222;
    }

    public final String toString() {
        return this.f31226;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m26197() {
        return this.f31226;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m26195() {
        return this.f31225;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Calendar m26192() {
        return this.f31228;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m26200() {
        return this.f31224;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m26187() {
        return this.f31223;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26186(int i, int i2) {
        boolean[][] zArr = this.f31221;
        if (zArr == null) {
            return false;
        }
        return zArr[i][i2];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26199() {
        return this.f31224 == 1;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m26189() {
        return this.f31224 == 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m26188() {
        return this.f31224 == 2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26184(String str) {
        this.f31229 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26191(String str) {
        this.f31227 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m26194(String str) {
        this.f31222 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26182(int i, int i2, boolean z) {
        this.f31221[i][i2] = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26198(String str) {
        this.f31226 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26183(long j) {
        this.f31225 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26185(Calendar calendar) {
        this.f31228 = calendar;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26181(int i) {
        this.f31224 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26196(String str) {
        this.f31223 = str;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
