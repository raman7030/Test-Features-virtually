package l;

/* JADX INFO: renamed from: l.ۧܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11115 implements InterfaceC16758 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f33348;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f33349;

    public C11115(String str, int i) {
        this.f33348 = str;
        this.f33349 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27545() {
        return this.f33348;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27546() {
        return this.f33349;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11115.class != obj.getClass()) {
            return false;
        }
        C11115 c11115 = (C11115) obj;
        if (this.f33349 != c11115.f33349) {
            return false;
        }
        return this.f33348.equals(c11115.f33348);
    }

    public final int hashCode() {
        return (this.f33348.hashCode() * 31) + this.f33349;
    }
}
