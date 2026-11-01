package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩴ۫ */
/* JADX INFO: compiled from: UT8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1772 implements InterfaceC1807 {

    /* JADX INFO: renamed from: ܽ */
    public static final Locale[] f62471 = new Locale[0];

    /* JADX INFO: renamed from: ֫ */
    public final Locale[] f62472;

    /* JADX INFO: renamed from: ۧ */
    public final String f62473;

    @Override // p067l.InterfaceC1807
    /* JADX INFO: renamed from: ۧ */
    public final Object mo4288() {
        return null;
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length == 1) {
                new Locale(strArrSplit[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    @Override // p067l.InterfaceC1807
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.f62472;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // p067l.InterfaceC1807
    public final boolean isEmpty() {
        return this.f62472.length == 0;
    }

    @Override // p067l.InterfaceC1807
    public final int size() {
        return this.f62472.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1772)) {
            return false;
        }
        Locale[] localeArr = ((C1772) obj).f62472;
        Locale[] localeArr2 = this.f62472;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f62472) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f62472;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    @Override // p067l.InterfaceC1807
    /* JADX INFO: renamed from: ֫ */
    public final String mo4287() {
        return this.f62473;
    }

    public C1772(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f62472 = f62471;
            this.f62473 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(C19768.m44906(i, "list[", "] is null"));
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f62472 = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f62473 = sb.toString();
    }
}
