package l;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18406 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InetAddress f57143;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InetAddress f57144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InetAddress f57145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f57146;

    public C18406(InetAddress inetAddress, InetAddress inetAddress2, InetAddress inetAddress3, List list) {
        this.f57145 = inetAddress;
        this.f57144 = inetAddress2;
        this.f57143 = inetAddress3;
        this.f57146 = C20195.unmodifiableList(new ArrayList(list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C18406(InetAddress inetAddress, InetAddress inetAddress2, List list) {
        InetAddress inetAddressM10984;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            inetAddressM10984 = ((C3589) it.next()).m10984();
            if (inetAddressM10984 != null) {
                this(inetAddress, inetAddress2, inetAddressM10984, list);
            }
        }
        inetAddressM10984 = null;
        this(inetAddress, inetAddress2, inetAddressM10984, list);
    }
}
