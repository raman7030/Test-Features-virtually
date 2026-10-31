package l;

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
public abstract class AbstractC5650 implements Serializable {
    public static final Map a;
    public static final long serialVersionUID = 8352817235686L;

    public abstract C15960 W();

    public abstract void a0(DataOutput dataOutput);

    public abstract String k();

    static {
        Map.Entry[] entryArr = {AbstractC22791.C("ACT", "Australia/Darwin"), AbstractC22791.C("AET", "Australia/Sydney"), AbstractC22791.C("AGT", "America/Argentina/Buenos_Aires"), AbstractC22791.C("ART", "Africa/Cairo"), AbstractC22791.C("AST", "America/Anchorage"), AbstractC22791.C("BET", "America/Sao_Paulo"), AbstractC22791.C("BST", "Asia/Dhaka"), AbstractC22791.C("CAT", "Africa/Harare"), AbstractC22791.C("CNT", "America/St_Johns"), AbstractC22791.C("CST", "America/Chicago"), AbstractC22791.C("CTT", "Asia/Shanghai"), AbstractC22791.C("EAT", "Africa/Addis_Ababa"), AbstractC22791.C("ECT", "Europe/Paris"), AbstractC22791.C("IET", "America/Indiana/Indianapolis"), AbstractC22791.C("IST", "Asia/Kolkata"), AbstractC22791.C("JST", "Asia/Tokyo"), AbstractC22791.C("MIT", "Pacific/Apia"), AbstractC22791.C("NET", "Asia/Yerevan"), AbstractC22791.C("NST", "Pacific/Auckland"), AbstractC22791.C("PLT", "Asia/Karachi"), AbstractC22791.C("PNT", "America/Phoenix"), AbstractC22791.C("PRT", "America/Puerto_Rico"), AbstractC22791.C("PST", "America/Los_Angeles"), AbstractC22791.C("SST", "Pacific/Guadalcanal"), AbstractC22791.C("VST", "Asia/Ho_Chi_Minh"), AbstractC22791.C("EST", "-05:00"), AbstractC22791.C("MST", "-07:00"), AbstractC22791.C("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = C11003.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, C11003.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        a = Collections.unmodifiableMap(map);
    }

    public static AbstractC5650 systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        C11003.requireNonNull(id, "zoneId");
        C11003.requireNonNull(map, "aliasMap");
        return X((String) C11003.requireNonNullElse((String) map.get(id), id), true);
    }

    public static AbstractC5650 Y(String str, C18078 c18078) {
        C11003.requireNonNull(str, "prefix");
        C11003.requireNonNull(c18078, "offset");
        if (str.isEmpty()) {
            return c18078;
        }
        if (!str.equals("GMT") && !str.equals(UtcDates.UTC) && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (c18078.b != 0) {
            str = str.concat(c18078.c);
        }
        return new C17372(str, c18078.W());
    }

    public static AbstractC5650 X(String str, boolean z) {
        C11003.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX) || str.startsWith("-")) {
            return C18078.c0(str);
        }
        if (str.startsWith(UtcDates.UTC) || str.startsWith("GMT")) {
            return Z(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return Z(str, 2, z);
        }
        return C17372.b0(str, z);
    }

    public static AbstractC5650 Z(String str, int i, boolean z) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return Y(strSubstring, C18078.f);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return C17372.b0(str, z);
        }
        try {
            C18078 c18078C0 = C18078.c0(str.substring(i));
            if (c18078C0 == C18078.f) {
                return Y(strSubstring, c18078C0);
            }
            return Y(strSubstring, c18078C0);
        } catch (C16232 e) {
            throw new C16232("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static AbstractC5650 V(InterfaceC2268 interfaceC2268) {
        AbstractC5650 abstractC5650 = (AbstractC5650) interfaceC2268.T(AbstractC5796.e);
        if (abstractC5650 != null) {
            return abstractC5650;
        }
        throw new C16232("Unable to obtain ZoneId from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName());
    }

    public AbstractC5650() {
        if (getClass() != C18078.class && getClass() != C17372.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC5650) {
            return k().equals(((AbstractC5650) obj).k());
        }
        return false;
    }

    public int hashCode() {
        return k().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return k();
    }

    private Object writeReplace() {
        return new C20613((byte) 7, this);
    }
}
