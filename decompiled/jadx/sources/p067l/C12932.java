package p067l;

/* JADX INFO: renamed from: l.ۧܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9IR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12932 implements InterfaceC18295 {

    /* JADX INFO: renamed from: ֫ */
    public String f36348;

    /* JADX INFO: renamed from: ۧ */
    public int f36349;

    public C12932(String str, int i) {
        this.f36348 = str;
        this.f36349 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m29607() {
        return this.f36348;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29608() {
        return this.f36349;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12932.class != obj.getClass()) {
            return false;
        }
        C12932 c12932 = (C12932) obj;
        if (this.f36349 != c12932.f36349) {
            return false;
        }
        return this.f36348.equals(c12932.f36348);
    }

    public final int hashCode() {
        return (this.f36348.hashCode() * 31) + this.f36349;
    }
}
