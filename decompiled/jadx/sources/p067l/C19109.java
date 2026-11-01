package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B3ZP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19109 extends AbstractC17195 {

    /* JADX INFO: renamed from: ᩻ */
    public static final Set f57018;

    /* JADX INFO: renamed from: ܳ */
    public C19780 f57019;

    public C19109(C13565 c13565) {
        super(null, new C10491(c13565, EnumSet.of(EnumC23266.SUMMARY, EnumC23266.DETAILS, EnumC23266.SUBDIAGNOSTICS)));
    }

    @Override // p067l.AbstractC17195
    /* JADX INFO: renamed from: ܿ */
    public final String mo16418(C18258 c18258, Locale locale) {
        try {
            this.f57019 = new C19780(c18258);
            StringBuilder sb = new StringBuilder();
            if (c18258.m41594() != -1) {
                sb.append(AbstractC17195.m38933(c18258, false));
                sb.append(':');
                sb.append(AbstractC17195.m38932(c18258, EnumC5161.LINE));
                sb.append(':');
                sb.append(AbstractC17195.m38932(c18258, EnumC5161.COLUMN));
                sb.append(':');
            } else if (c18258.m41586() != null && c18258.m41586().mo23287() == EnumC18398.CLASS) {
                sb.append(AbstractC17195.m38933(c18258, false));
                sb.append(":-:-:");
            } else {
                sb.append('-');
            }
            sb.append(' ');
            sb.append(mo10700(c18258, null));
            if (m38939(c18258)) {
                sb.append("\n");
                sb.append(m38937(c18258, 0));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        } finally {
            this.f57019 = null;
        }
    }

    @Override // p067l.InterfaceC14548
    /* JADX INFO: renamed from: ۜ, reason: merged with bridge method [inline-methods] */
    public final String mo10700(C18258 c18258, Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo38936((Locale) null, c18258.mo31353(), m38942(c18258, locale).toArray()));
        if ((c18258 instanceof C24098) && EnumSet.copyOf(getConfiguration().f29048).contains(EnumC23266.SUBDIAGNOSTICS) && m38943(c18258, null).m10293()) {
            sb.append(",{");
            Iterator it = m38943(c18258, null).iterator();
            String str = "";
            while (it.hasNext()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, str, MotionUtils.EASING_TYPE_FORMAT_START, (String) it.next(), MotionUtils.EASING_TYPE_FORMAT_END);
                str = ",";
            }
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC17195
    /* JADX INFO: renamed from: ֫ */
    public final String mo38938(C18258 c18258, Object obj, Locale locale) {
        String strMo38938;
        if (obj instanceof InterfaceC11867) {
            strMo38938 = obj.toString();
        } else if (obj instanceof AbstractC14355) {
            C1446.m31699(this.f57019);
            strMo38938 = "@" + this.f57019.m44954((AbstractC14355) obj);
        } else if (obj instanceof AbstractC14215) {
            strMo38938 = ((AbstractC14215) obj).mo32691();
        } else if (obj instanceof EnumC19998) {
            strMo38938 = "compiler.misc.tree.tag." + ((EnumC19998) obj).name().toLowerCase(Locale.US);
        } else {
            strMo38938 = ((obj instanceof EnumC17840) && obj == EnumC17840.f53233 && f57018.contains(c18258.mo31353())) ? "DEFAULT" : super.mo38938(c18258, obj, (Locale) null);
        }
        return obj instanceof C18258 ? C6988.m16053(MotionUtils.EASING_TYPE_FORMAT_START, strMo38938, MotionUtils.EASING_TYPE_FORMAT_END) : strMo38938;
    }

    static {
        Object[] objArr = {"compiler.note.preview.filename", "compiler.note.preview.plural"};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f57018 = C21562.unmodifiableSet(hashSet);
    }

    @Override // p067l.AbstractC17195
    /* JADX INFO: renamed from: ֫ */
    public final String mo38936(Locale locale, String str, Object... objArr) {
        StringBuilder sbM17248 = C7470.m17248(str);
        int length = objArr.length;
        String str2 = ": ";
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            sbM17248.append(str2);
            sbM17248.append(obj);
            i++;
            str2 = ", ";
        }
        return sbM17248.toString();
    }
}
