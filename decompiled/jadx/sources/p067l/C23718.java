package p067l;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes.dex */
public final class C23718 {

    /* JADX INFO: renamed from: ֫ */
    public C21707 f75474;

    /* JADX INFO: renamed from: ۜ */
    public C24388 f75475;

    /* JADX INFO: renamed from: ۡ */
    public Object f75476;

    /* JADX INFO: renamed from: ۢ */
    public AbstractC16192 f75477;

    /* JADX INFO: renamed from: ۧ */
    public C15000 f75478;

    /* JADX INFO: renamed from: ܳ */
    public C19044 f75479;

    /* JADX INFO: renamed from: ܺ */
    public Uri f75480;

    /* JADX INFO: renamed from: ܽ */
    public long f75481;

    /* JADX INFO: renamed from: ܿ */
    public String f75482;

    /* JADX INFO: renamed from: ᩳ */
    public C12319 f75483;

    /* JADX INFO: renamed from: ᩷ */
    public List f75484;

    /* JADX INFO: renamed from: ᩻ */
    public String f75485;

    public C23718() {
        this.f75474 = new C21707();
        this.f75478 = new C15000();
        this.f75484 = Collections.EMPTY_LIST;
        this.f75477 = AbstractC16192.m36872of();
        this.f75483 = new C12319();
        this.f75475 = C24388.f77209;
        this.f75481 = -9223372036854775807L;
    }

    public C23718(C13010 c13010) {
        C15000 c15000;
        this();
        this.f75474 = new C21707(c13010.f36608);
        this.f75482 = c13010.f36613;
        this.f75479 = c13010.f36612;
        this.f75483 = new C12319(c13010.f36609);
        this.f75475 = c13010.f36610;
        C13660 c13660 = c13010.f36611;
        if (c13660 != null) {
            this.f75485 = c13660.f38433;
            this.f75480 = c13660.f38436;
            this.f75484 = c13660.f38435;
            this.f75477 = c13660.f38434;
            this.f75476 = c13660.f38432;
            C14330 c14330 = c13660.f38430;
            if (c14330 == null) {
                c15000 = new C15000();
            } else {
                c15000 = new C15000(c14330);
            }
            this.f75478 = c15000;
            this.f75481 = c13660.f38431;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52742(String str) {
        this.f75480 = str == null ? null : Uri.parse(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52738(String str) {
        str.getClass();
        this.f75482 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52736(Uri uri) {
        this.f75480 = uri;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52741() {
        this.f75485 = "application/x-mpegURL";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52739(List list) {
        this.f75477 = AbstractC16192.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52737(Object obj) {
        this.f75476 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13010 m52735() {
        C13660 c13660;
        C14330 c14330;
        C23877.m52960(this.f75478.f42855 == null || this.f75478.f42851 != null);
        Uri uri = this.f75480;
        if (uri != null) {
            String str = this.f75485;
            if (this.f75478.f42851 != null) {
                C15000 c15000 = this.f75478;
                c15000.getClass();
                c14330 = new C14330(c15000);
            } else {
                c14330 = null;
            }
            c13660 = new C13660(uri, str, c14330, this.f75484, this.f75477, this.f75476, this.f75481);
        } else {
            c13660 = null;
        }
        String str2 = this.f75482;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        C21707 c21707 = this.f75474;
        c21707.getClass();
        C5613 c5613 = new C5613(c21707);
        C12319 c12319 = this.f75483;
        c12319.getClass();
        C8295 c8295 = new C8295(c12319);
        C19044 c19044 = this.f75479;
        if (c19044 == null) {
            c19044 = C19044.f56787;
        }
        return new C13010(str3, c5613, c13660, c8295, c19044, this.f75475);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52740(C8295 c8295) {
        this.f75483 = new C12319(c8295);
    }
}
