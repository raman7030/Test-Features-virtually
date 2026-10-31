package l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3772 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19357 f11891;

    public C3772(C19357 c19357) {
        this.f11891 = c19357;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C19357 c19357 = this.f11891;
        C3480 c3480 = c19357.f68950;
        C2775 c2775 = c19357.f68926;
        return Integer.compare(c3480.mo10659(c2775.m8572((InterfaceC4060) ((Map.Entry) obj).getKey())), c3480.mo10659(c2775.m8572((InterfaceC4060) ((Map.Entry) obj2).getKey())));
    }
}
