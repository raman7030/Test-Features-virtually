package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21099 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0636 f68040;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object[] f68041;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f68042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f68043;

    public C21099(String str, String str2, C0636 c0636, Object... objArr) {
        this.f68043 = str;
        this.f68042 = str2;
        this.f68040 = c0636;
        this.f68041 = objArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m48009() {
        return this.f68043;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m48010() {
        return this.f68042;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0636 m48006() {
        return this.f68040;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m48007() {
        return this.f68041.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m48005(int i) {
        return this.f68041[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object[] m48008() {
        return this.f68041;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21099)) {
            return false;
        }
        C21099 c21099 = (C21099) obj;
        return this.f68043.equals(c21099.f68043) && this.f68042.equals(c21099.f68042) && this.f68040.equals(c21099.f68040) && Arrays.equals(this.f68041, c21099.f68041);
    }

    public final int hashCode() {
        return ((this.f68043.hashCode() ^ Integer.rotateLeft(this.f68042.hashCode(), 8)) ^ Integer.rotateLeft(this.f68040.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f68041), 24);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f68040);
        String string = Arrays.toString(this.f68041);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f68043);
        sb.append(" : ");
        sb.append(this.f68042);
        sb.append(" ");
        sb.append(strValueOf);
        return C9045.m23341(sb, " ", string);
    }
}
