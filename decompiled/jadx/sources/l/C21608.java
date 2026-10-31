package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21608 implements Predicate {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69385;

    public /* synthetic */ C21608(int i) {
        this.f69385 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f69385) {
            case 0:
                break;
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        String strM36561;
        switch (this.f69385) {
            case 0:
                String name = ((AbstractC15440) obj).getName();
                if (name.toLowerCase().endsWith(".zip") && (strM36561 = C15472.m36561(4, 0, name)) != null && !strM36561.isEmpty()) {
                    for (int i = 0; i < strM36561.length(); i++) {
                        char cCharAt = strM36561.charAt(i);
                        if ((cCharAt >= '0' && cCharAt <= '9') || (i == 0 && cCharAt == '-')) {
                        }
                    }
                    if (strM36561.length() < 19) {
                        return true;
                    }
                    try {
                        Long.parseLong(strM36561);
                        return true;
                    } catch (NumberFormatException unused) {
                    }
                }
                return false;
            default:
                int i2 = ActivityC17169.f52595;
                return !((AbstractC14346) obj).m34237();
        }
    }
}
