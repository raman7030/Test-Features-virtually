package p067l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.datepicker.UtcDates;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.ۚ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7739 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Map f20290a;
    public static final long serialVersionUID = 8352817235686L;

    /* JADX INFO: renamed from: W */
    public abstract C17537 mo17864W();

    /* JADX INFO: renamed from: a0 */
    public abstract void mo17865a0(DataOutput dataOutput);

    /* JADX INFO: renamed from: k */
    public abstract String mo17866k();

    static {
        Map.Entry[] entryArr = {AbstractC24029.m53213C("ACT", "Australia/Darwin"), AbstractC24029.m53213C("AET", "Australia/Sydney"), AbstractC24029.m53213C("AGT", "America/Argentina/Buenos_Aires"), AbstractC24029.m53213C("ART", "Africa/Cairo"), AbstractC24029.m53213C("AST", "America/Anchorage"), AbstractC24029.m53213C("BET", "America/Sao_Paulo"), AbstractC24029.m53213C("BST", "Asia/Dhaka"), AbstractC24029.m53213C("CAT", "Africa/Harare"), AbstractC24029.m53213C("CNT", "America/St_Johns"), AbstractC24029.m53213C("CST", "America/Chicago"), AbstractC24029.m53213C("CTT", "Asia/Shanghai"), AbstractC24029.m53213C("EAT", "Africa/Addis_Ababa"), AbstractC24029.m53213C("ECT", "Europe/Paris"), AbstractC24029.m53213C("IET", "America/Indiana/Indianapolis"), AbstractC24029.m53213C("IST", "Asia/Kolkata"), AbstractC24029.m53213C("JST", "Asia/Tokyo"), AbstractC24029.m53213C("MIT", "Pacific/Apia"), AbstractC24029.m53213C("NET", "Asia/Yerevan"), AbstractC24029.m53213C("NST", "Pacific/Auckland"), AbstractC24029.m53213C("PLT", "Asia/Karachi"), AbstractC24029.m53213C("PNT", "America/Phoenix"), AbstractC24029.m53213C("PRT", "America/Puerto_Rico"), AbstractC24029.m53213C("PST", "America/Los_Angeles"), AbstractC24029.m53213C("SST", "Pacific/Guadalcanal"), AbstractC24029.m53213C("VST", "Asia/Ho_Chi_Minh"), AbstractC24029.m53213C("EST", "-05:00"), AbstractC24029.m53213C("MST", "-07:00"), AbstractC24029.m53213C("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = C12826.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, C12826.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        f20290a = Collections.unmodifiableMap(map);
    }

    public static AbstractC7739 systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = f20290a;
        C12826.requireNonNull(id, "zoneId");
        C12826.requireNonNull(map, "aliasMap");
        return m17861X((String) C12826.requireNonNullElse((String) map.get(id), id), true);
    }

    /* JADX INFO: renamed from: Y */
    public static AbstractC7739 m17862Y(String str, C19550 c19550) {
        C12826.requireNonNull(str, "prefix");
        C12826.requireNonNull(c19550, "offset");
        if (str.isEmpty()) {
            return c19550;
        }
        if (!str.equals("GMT") && !str.equals(UtcDates.UTC) && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (c19550.f59520b != 0) {
            str = str.concat(c19550.f59521c);
        }
        return new C18879(str, c19550.mo17864W());
    }

    /* JADX INFO: renamed from: X */
    public static AbstractC7739 m17861X(String str, boolean z) {
        C12826.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || str.startsWith("-")) {
            return C19550.m44393c0(str);
        }
        if (str.startsWith(UtcDates.UTC) || str.startsWith("GMT")) {
            return m17863Z(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return m17863Z(str, 2, z);
        }
        return C18879.m42966b0(str, z);
    }

    /* JADX INFO: renamed from: Z */
    public static AbstractC7739 m17863Z(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return m17862Y(strSubstring, C19550.f59517f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C18879.m42966b0(str, z);
        }
        try {
            C19550 c19550M44393c0 = C19550.m44393c0(str.substring(i));
            if (c19550M44393c0 == C19550.f59517f) {
                return m17862Y(strSubstring, c19550M44393c0);
            }
            return m17862Y(strSubstring, c19550M44393c0);
        } catch (C17796 e) {
            throw new C17796("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: V */
    public static AbstractC7739 m17860V(InterfaceC4524 interfaceC4524) {
        AbstractC7739 abstractC7739 = (AbstractC7739) interfaceC4524.mo6950T(AbstractC7877.f20683e);
        if (abstractC7739 != null) {
            return abstractC7739;
        }
        throw new C17796("Unable to obtain ZoneId from TemporalAccessor: " + interfaceC4524 + " of type " + interfaceC4524.getClass().getName());
    }

    public AbstractC7739() {
        if (getClass() != C19550.class && getClass() != C18879.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC7739) {
            return mo17866k().equals(((AbstractC7739) obj).mo17866k());
        }
        return false;
    }

    public int hashCode() {
        return mo17866k().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return mo17866k();
    }

    private Object writeReplace() {
        return new C21959((byte) 7, this);
    }
}
