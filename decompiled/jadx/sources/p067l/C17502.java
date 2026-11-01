package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 2781 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17502 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f52325;

    /* JADX INFO: renamed from: ۧ */
    public String f52326;

    /* JADX INFO: renamed from: ܳ */
    public C11785 f52327;

    /* JADX INFO: renamed from: ܽ */
    public C14645 f52328;

    /* JADX INFO: renamed from: ܿ */
    public C14679 f52329;

    /* JADX INFO: renamed from: ᩳ */
    public String f52330;

    /* JADX INFO: renamed from: ֫ */
    public final C14679 m39869() {
        if (this.f52329 == null) {
            this.f52329 = new C14679();
        }
        return this.f52329;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C11785 m39871() {
        if (this.f52327 == null) {
            this.f52327 = new C11785();
        }
        return this.f52327;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14645 m39868(String str, String str2, C20100 c20100) {
        if (this.f52328 != null && str.equals(this.f52330) && str2.equals(this.f52326)) {
            return this.f52328;
        }
        this.f52328 = null;
        this.f52330 = null;
        this.f52326 = null;
        C13480 c13480 = (C13480) c20100.f62194;
        C16484 c16484 = (C16484) c20100.f62195;
        c13480.getClass();
        C14645 c14645M37408 = c16484.m37408(str2);
        this.f52328 = c14645M37408;
        this.f52330 = str;
        this.f52326 = str2;
        return c14645M37408;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m39867(String str) {
        HashMap map = this.f52325;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39870(Object obj, String str) {
        if (this.f52325 == null) {
            this.f52325 = new HashMap();
        }
        this.f52325.put(str, obj);
    }
}
