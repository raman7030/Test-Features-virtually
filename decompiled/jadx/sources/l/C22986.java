package l;

/* JADX INFO: renamed from: l.᩺۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes.dex */
public final class C22986 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6491 f74006;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f74007;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6491 f74008;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51137(C15869 c15869) {
        C6491 c6491 = this.f74006;
        if (c6491.f20042 != null) {
            c6491.f20042 = c15869;
        } else {
            this.f74008.f20042 = c15869;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15869 m51139() {
        Object obj = this.f74006.f20042;
        return obj != null ? (C15869) obj : (C15869) this.f74008.f20042;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15869 m51138() {
        Object obj = this.f74006.f20043;
        return obj != null ? (C15869) obj : (C15869) this.f74008.f20043;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m51135() {
        if (this.f74007 == null) {
            this.f74007 = m51134();
        }
        return this.f74007;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m51134() {
        Object obj = this.f74008.f20042;
        if (obj == null) {
            return null;
        }
        Object obj2 = ((C22096) ((C15869) ((C14334) ((C15869) obj).f49042).f7866).f49042).f7866;
        this.f74007 = (String) obj2;
        return (String) obj2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51136(C3046 c3046) {
        Object obj;
        C6491 c6491 = this.f74008;
        C6491 c6492 = this.f74006;
        Object obj2 = c6492.f20042;
        if (obj2 != null && ((C15869) obj2).f20943 != ((C15869) c6491.f20042).f20943) {
            m51134();
            c3046.m9326((C15869) c6491.f20042);
        }
        Object obj3 = c6492.f20043;
        if (obj3 == null || (obj = c6491.f20043) == null) {
            return;
        }
        C15869 c15869 = (C15869) obj;
        if (((C15869) obj3).f20943 != c15869.f20943) {
            c3046.m9326(c15869);
        }
    }
}
