package l;

/* JADX INFO: renamed from: l.ܰᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B8B */
/* JADX INFO: loaded from: classes3.dex */
public final class C14006 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f42368;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21085 f42369;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f42370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f42371;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16850 f42372;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f42373;

    public C14006(C21085 c21085, C16850 c16850, Object obj, String str) {
        int i;
        synchronized (this) {
            i = f42368;
            f42368 = i + 1;
        }
        this.f42373 = i;
        this.f42369 = c21085;
        this.f42372 = c16850;
        this.f42370 = obj;
        this.f42371 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21085 c21085 = this.f42369;
        if (c21085 != null) {
            sb.append(c21085);
            sb.append(':');
        }
        sb.append(this.f42372);
        Object obj = this.f42370;
        if (obj != null && !c21085.equals(obj)) {
            sb.append(":");
            sb.append(obj);
        }
        sb.append(" -> ");
        sb.append(this.f42371);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14006)) {
            return false;
        }
        C14006 c14006 = (C14006) obj;
        return C11003.equals(this.f42369, c14006.f42369) && C11003.equals(this.f42370, c14006.f42370) && this.f42372.equals(c14006.f42372) && this.f42371.equals(c14006.f42371);
    }

    public final int hashCode() {
        return this.f42371.hashCode() + ((this.f42372.hashCode() + ((C11003.hashCode(this.f42370) + (C11003.hashCode(this.f42369) * 31)) * 31)) * 31);
    }
}
