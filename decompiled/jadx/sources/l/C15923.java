package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 2781 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15923 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f49178;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f49179;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9907 f49180;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C12918 f49181;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12953 f49182;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f49183;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12953 m37694() {
        if (this.f49182 == null) {
            this.f49182 = new C12953();
        }
        return this.f49182;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9907 m37696() {
        if (this.f49180 == null) {
            this.f49180 = new C9907();
        }
        return this.f49180;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12918 m37693(String str, String str2, C18657 c18657) {
        if (this.f49181 != null && str.equals(this.f49183) && str2.equals(this.f49179)) {
            return this.f49181;
        }
        this.f49181 = null;
        this.f49183 = null;
        this.f49179 = null;
        C11691 c11691 = (C11691) c18657.f58971;
        C14852 c14852 = (C14852) c18657.f58972;
        c11691.getClass();
        C12918 c12918M35252 = c14852.m35252(str2);
        this.f49181 = c12918M35252;
        this.f49183 = str;
        this.f49179 = str2;
        return c12918M35252;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m37692(String str) {
        HashMap map = this.f49178;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37695(Object obj, String str) {
        if (this.f49178 == null) {
            this.f49178 = new HashMap();
        }
        this.f49178.put(str, obj);
    }
}
