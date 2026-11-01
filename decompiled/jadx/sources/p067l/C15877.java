package p067l;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7MF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15877 implements InterfaceC17570 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17570 f45971;

    /* JADX INFO: renamed from: ۧ */
    public final List f45972;

    public C15877(InterfaceC17570 interfaceC17570, List list) {
        this.f45971 = interfaceC17570;
        this.f45972 = list;
    }

    @Override // p067l.InterfaceC17570
    /* JADX INFO: renamed from: ֫ */
    public final Object mo36005(Uri uri, C21412 c21412) {
        AbstractC12439 abstractC12439 = (AbstractC12439) this.f45971.mo36005(uri, c21412);
        List list = this.f45972;
        return (list == null || list.isEmpty()) ? abstractC12439 : (AbstractC12439) abstractC12439.mo16293(list);
    }
}
