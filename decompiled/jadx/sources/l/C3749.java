package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3749 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12586 f11837;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f11838 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2338 f11839;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4454 m11377(C11197 c11197) {
        C2338 c2338;
        c11197.f33612.getClass();
        C12586 c12586 = c11197.f33612.f35420;
        if (c12586 == null) {
            return InterfaceC4454.f14211;
        }
        synchronized (this.f11838) {
            if (!c12586.equals(this.f11837)) {
                this.f11837 = c12586;
                this.f11839 = m11376(c12586);
            }
            c2338 = this.f11839;
            c2338.getClass();
        }
        return c2338;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2338 m11376(C12586 c12586) {
        C10160 c10160 = new C10160();
        Uri uri = c12586.f37955;
        C17319 c17319 = new C17319(uri == null ? null : uri.toString(), c12586.f37950, c10160);
        AbstractC20151 it = c12586.f37956.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c17319.m40635((String) entry.getKey(), (String) entry.getValue());
        }
        C16448 c16448 = new C16448();
        c16448.m38754(c12586.f37951);
        c16448.m38755(c12586.f37953);
        c16448.m38757(c12586.f37957);
        c16448.m38756(C13426.m32449(c12586.f37952));
        C2338 c2338M38753 = c16448.m38753(c17319);
        c2338M38753.m7628(c12586.m30850());
        return c2338M38753;
    }
}
