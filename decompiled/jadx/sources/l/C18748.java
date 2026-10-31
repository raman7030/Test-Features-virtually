package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: l.ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: UT8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18748 implements InterfaceC19454 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Locale[] f59248 = new Locale[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Locale[] f59249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f59250;

    @Override // l.InterfaceC19454
    /* JADX INFO: renamed from: ۧ */
    public final Object mo1896() {
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

    @Override // l.InterfaceC19454
    public final Locale get(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.f59249;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // l.InterfaceC19454
    public final boolean isEmpty() {
        return this.f59249.length == 0;
    }

    @Override // l.InterfaceC19454
    public final int size() {
        return this.f59249.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18748)) {
            return false;
        }
        Locale[] localeArr = ((C18748) obj).f59249;
        Locale[] localeArr2 = this.f59249;
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
        for (Locale locale : this.f59249) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f59249;
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

    @Override // l.InterfaceC19454
    /* JADX INFO: renamed from: ֫ */
    public final String mo1895() {
        return this.f59250;
    }

    public C18748(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f59249 = f59248;
            this.f59250 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(C18307.m42645(i, "list[", "] is null"));
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
        this.f59249 = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f59250 = sb.toString();
    }
}
