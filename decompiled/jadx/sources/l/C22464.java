package l;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes.dex */
public final class C22464 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20348 f72746;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23169 f72747;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f72748;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f72749;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13291 f72750;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C17546 f72751;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Uri f72752;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f72753;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f72754;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10470 f72755;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f72756;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f72757;

    public C22464() {
        this.f72746 = new C20348();
        this.f72750 = new C13291();
        this.f72756 = Collections.EMPTY_LIST;
        this.f72749 = AbstractC14545.of();
        this.f72755 = new C10470();
        this.f72747 = C23169.f74464;
        this.f72753 = -9223372036854775807L;
    }

    public C22464(C11197 c11197) {
        C13291 c13291;
        this();
        this.f72746 = new C20348(c11197.f33609);
        this.f72754 = c11197.f33614;
        this.f72751 = c11197.f33613;
        this.f72755 = new C10470(c11197.f33610);
        this.f72747 = c11197.f33611;
        C11881 c11881 = c11197.f33612;
        if (c11881 != null) {
            this.f72757 = c11881.f35423;
            this.f72752 = c11881.f35426;
            this.f72756 = c11881.f35425;
            this.f72749 = c11881.f35424;
            this.f72748 = c11881.f35422;
            C12586 c12586 = c11881.f35420;
            if (c12586 == null) {
                c13291 = new C13291();
            } else {
                c13291 = new C13291(c12586);
            }
            this.f72750 = c13291;
            this.f72753 = c11881.f35421;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50401(String str) {
        this.f72752 = str == null ? null : Uri.parse(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50397(String str) {
        str.getClass();
        this.f72754 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50395(Uri uri) {
        this.f72752 = uri;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50400() {
        this.f72757 = "application/x-mpegURL";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50398(List list) {
        this.f72749 = AbstractC14545.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50396(Object obj) {
        this.f72748 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11197 m50394() {
        C11881 c11881;
        C12586 c12586;
        C22632.m50634(this.f72750.f39788 == null || this.f72750.f39784 != null);
        Uri uri = this.f72752;
        if (uri != null) {
            String str = this.f72757;
            if (this.f72750.f39784 != null) {
                C13291 c13291 = this.f72750;
                c13291.getClass();
                c12586 = new C12586(c13291);
            } else {
                c12586 = null;
            }
            c11881 = new C11881(uri, str, c12586, this.f72756, this.f72749, this.f72748, this.f72753);
        } else {
            c11881 = null;
        }
        String str2 = this.f72754;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C20348 c20348 = this.f72746;
        c20348.getClass();
        C3414 c3414 = new C3414(c20348);
        C10470 c10470 = this.f72755;
        c10470.getClass();
        C6236 c6236 = new C6236(c10470);
        C17546 c17546 = this.f72751;
        if (c17546 == null) {
            c17546 = C17546.f53597;
        }
        return new C11197(str3, c3414, c11881, c6236, c17546, this.f72747);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50399(C6236 c6236) {
        this.f72755 = new C10470(c6236);
    }
}
