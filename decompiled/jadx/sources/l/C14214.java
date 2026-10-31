package l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7MF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14214 implements InterfaceC15995 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15995 f42881;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f42882;

    public C14214(InterfaceC15995 interfaceC15995, List list) {
        this.f42881 = interfaceC15995;
        this.f42882 = list;
    }

    @Override // l.InterfaceC15995
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo33873(Uri uri, C20038 c20038) {
        AbstractC10596 abstractC10596 = (AbstractC10596) this.f42881.mo33873(uri, c20038);
        List list = this.f42882;
        return (list == null || list.isEmpty()) ? abstractC10596 : (AbstractC10596) abstractC10596.mo14390(list);
    }
}
