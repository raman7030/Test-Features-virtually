package l;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۛܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QX */
/* JADX INFO: loaded from: classes2.dex */
public final class C6202 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Context f19023;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f19024;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f19025 = 2000;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14185 f19022 = InterfaceC16427.f50519;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f19026 = true;

    public C6202(ContextWrapper contextWrapper) {
        this.f19023 = contextWrapper.getApplicationContext();
        HashMap map = new HashMap(8);
        this.f19024 = map;
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11847 m17123() {
        return new C11847(this.f19023, this.f19024, this.f19025, this.f19022, this.f19026);
    }
}
