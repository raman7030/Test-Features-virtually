package l;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11802 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collator f35204;

    public C11802() {
        Collator collator = Collator.getInstance(Locale.US);
        this.f35204 = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f35204.compare(((EnumC0121) obj).f1214, ((EnumC0121) obj2).f1214);
    }
}
