package l;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩸ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17JK */
/* JADX INFO: loaded from: classes4.dex */
public final class C21296 extends LinkedHashMap {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19885 f68661;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21296(C19885 c19885) {
        super(6, 0.75f, true);
        this.f68661 = c19885;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= 5) {
            return false;
        }
        try {
            ((InterfaceC2245) entry.getValue()).close();
            return true;
        } catch (IOException e) {
            this.f68661.f64259 = e;
            return true;
        }
    }
}
