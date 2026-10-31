package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16425 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f50514 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class f50515 = C3726.class;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class m38696() {
        return this.f50515;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38699(C16425 c16425) {
        for (Map.Entry entry : c16425.f50514.entrySet()) {
            C13843.putIfAbsent(this.f50514, (String) entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38698(String str, C3726 c3726) {
        C13843.putIfAbsent(this.f50514, C12047.m29419(str), c3726);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m38697(String str) {
        return this.f50514.get(C12047.m29419(str));
    }
}
