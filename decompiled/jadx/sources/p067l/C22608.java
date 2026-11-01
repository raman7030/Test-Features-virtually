package p067l;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C22608 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21267 f71352;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22608(C21267 c21267) {
        super(6, 0.75f, true);
        this.f71352 = c21267;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= 5) {
            return false;
        }
        try {
            ((InterfaceC4502) entry.getValue()).close();
            return true;
        } catch (IOException e) {
            this.f71352.f66895 = e;
            return true;
        }
    }
}
