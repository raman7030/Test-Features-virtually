package l;

import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BHG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17514 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f53490 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9048 f53491;

    public C17514(C9048 c9048) {
        this.f53491 = c9048;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14691 m40928(C7573 c7573) {
        HashMap map = this.f53490;
        C14691 c14691 = (C14691) map.get(c7573);
        if (c14691 != null) {
            return c14691;
        }
        C14691 c14692 = new C14691(this.f53491.f27441.mo18741(), c7573);
        map.put(c7573, c14692);
        return c14692;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection m40927() {
        return this.f53490.values();
    }
}
