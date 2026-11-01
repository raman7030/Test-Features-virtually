package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QB */
/* JADX INFO: loaded from: classes2.dex */
public final class C5931 {

    /* JADX INFO: renamed from: ֫ */
    public C14330 f14643;

    /* JADX INFO: renamed from: ۧ */
    public final Object f14644 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public C4590 f14645;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6601 m13313(C13010 c13010) {
        C4590 c4590;
        c13010.f36611.getClass();
        C14330 c14330 = c13010.f36611.f38430;
        if (c14330 == null) {
            return InterfaceC6601.f17035;
        }
        synchronized (this.f14644) {
            if (!c14330.equals(this.f14643)) {
                this.f14643 = c14330;
                this.f14645 = m13312(c14330);
            }
            c4590 = this.f14645;
            c4590.getClass();
        }
        return c4590;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4590 m13312(C14330 c14330) {
        C12024 c12024 = new C12024();
        Uri uri = c14330.f40983;
        C18828 c18828 = new C18828(uri == null ? null : uri.toString(), c14330.f40978, c12024);
        AbstractC21520 it = c14330.f40984.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c18828.m42886((String) entry.getKey(), (String) entry.getValue());
        }
        C18000 c18000 = new C18000();
        c18000.m40979(c14330.f40979);
        c18000.m40980(c14330.f40981);
        c18000.m40982(c14330.f40985);
        c18000.m40981(C15129.m34551(c14330.f40980));
        C4590 c4590M40978 = c18000.m40978(c18828);
        c4590M40978.m9699(c14330.m32927());
        return c4590M40978;
    }
}
