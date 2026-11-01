package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QX */
/* JADX INFO: loaded from: classes2.dex */
public final class C8263 {

    /* JADX INFO: renamed from: ۧ */
    public final Context f21884;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f21885;

    /* JADX INFO: renamed from: ܿ */
    public int f21886 = 2000;

    /* JADX INFO: renamed from: ֫ */
    public C15849 f21883 = InterfaceC17980.f53699;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f21887 = true;

    public C8263(ContextWrapper contextWrapper) {
        this.f21884 = contextWrapper.getApplicationContext();
        HashMap map = new HashMap(8);
        this.f21885 = map;
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13628 m19055() {
        return new C13628(this.f21884, this.f21885, this.f21886, this.f21883, this.f21887);
    }
}
