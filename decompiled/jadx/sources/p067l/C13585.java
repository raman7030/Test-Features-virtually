package p067l;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13585 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final Collator f38206;

    public C13585() {
        Collator collator = Collator.getInstance(Locale.US);
        this.f38206 = collator;
        collator.setStrength(0);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f38206.compare(((EnumC2483) obj).f3990, ((EnumC2483) obj2).f3990);
    }
}
