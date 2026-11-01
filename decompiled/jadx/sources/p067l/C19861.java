package p067l;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19861 {

    /* JADX INFO: renamed from: ֫ */
    public final InetAddress f60362;

    /* JADX INFO: renamed from: ۧ */
    public final InetAddress f60363;

    /* JADX INFO: renamed from: ܽ */
    public final InetAddress f60364;

    /* JADX INFO: renamed from: ᩳ */
    public final List f60365;

    public C19861(InetAddress inetAddress, InetAddress inetAddress2, InetAddress inetAddress3, List list) {
        this.f60364 = inetAddress;
        this.f60363 = inetAddress2;
        this.f60362 = inetAddress3;
        this.f60365 = C21562.unmodifiableList(new ArrayList(list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19861(InetAddress inetAddress, InetAddress inetAddress2, List list) {
        InetAddress inetAddressM12960;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            inetAddressM12960 = ((C5779) it.next()).m12960();
            if (inetAddressM12960 != null) {
                this(inetAddress, inetAddress2, inetAddressM12960, list);
            }
        }
        inetAddressM12960 = null;
        this(inetAddress, inetAddress2, inetAddressM12960, list);
    }
}
