package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C22421 {

    /* JADX INFO: renamed from: ֫ */
    public final C2973 f70722;

    /* JADX INFO: renamed from: ۧ */
    public final Object[] f70723;

    /* JADX INFO: renamed from: ܽ */
    public final String f70724;

    /* JADX INFO: renamed from: ᩳ */
    public final String f70725;

    public C22421(String str, String str2, C2973 c2973, Object... objArr) {
        this.f70725 = str;
        this.f70724 = str2;
        this.f70722 = c2973;
        this.f70723 = objArr;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m50339() {
        return this.f70725;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m50340() {
        return this.f70724;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2973 m50336() {
        return this.f70722;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50337() {
        return this.f70723.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m50335(int i) {
        return this.f70723[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object[] m50338() {
        return this.f70723;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22421)) {
            return false;
        }
        C22421 c22421 = (C22421) obj;
        return this.f70725.equals(c22421.f70725) && this.f70724.equals(c22421.f70724) && this.f70722.equals(c22421.f70722) && Arrays.equals(this.f70723, c22421.f70723);
    }

    public final int hashCode() {
        return ((this.f70725.hashCode() ^ Integer.rotateLeft(this.f70724.hashCode(), 8)) ^ Integer.rotateLeft(this.f70722.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f70723), 24);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f70722);
        String string = Arrays.toString(this.f70723);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70725);
        sb.append(" : ");
        sb.append(this.f70724);
        sb.append(" ");
        sb.append(strValueOf);
        return C10965.m25286(sb, " ", string);
    }
}
