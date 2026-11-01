package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22905 implements Predicate {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f72088;

    public /* synthetic */ C22905(int i) {
        this.f72088 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C20697.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo55838negate() {
        switch (this.f72088) {
            case 0:
                break;
        }
        return C20697.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m51160or(Predicate predicate) {
        return C20697.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        String strM38720;
        switch (this.f72088) {
            case 0:
                String name = ((AbstractC17043) obj).getName();
                if (name.toLowerCase().endsWith(".zip") && (strM38720 = C17073.m38720(4, 0, name)) != null && !strM38720.isEmpty()) {
                    for (int i = 0; i < strM38720.length(); i++) {
                        char cCharAt = strM38720.charAt(i);
                        if ((cCharAt >= '0' && cCharAt <= '9') || (i == 0 && cCharAt == '-')) {
                        }
                    }
                    if (strM38720.length() < 19) {
                        return true;
                    }
                    try {
                        Long.parseLong(strM38720);
                        return true;
                    } catch (NumberFormatException unused) {
                    }
                }
                return false;
            default:
                int i2 = ActivityC18686.f55776;
                return !((AbstractC16003) obj).m36370();
        }
    }
}
