package l;

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
public final class C17614 extends AbstractC15601 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f53824;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18320 f53825;

    public C17614(C11781 c11781) {
        super(null, new C8547(c11781, EnumSet.of(EnumC21989.SUMMARY, EnumC21989.DETAILS, EnumC21989.SUBDIAGNOSTICS)));
    }

    @Override // l.AbstractC15601
    /* JADX INFO: renamed from: ܿ */
    public final String mo14514(C16719 c16719, Locale locale) {
        try {
            this.f53825 = new C18320(c16719);
            StringBuilder sb = new StringBuilder();
            if (c16719.m39358() != -1) {
                sb.append(AbstractC15601.m36772(c16719, false));
                sb.append(':');
                sb.append(AbstractC15601.m36771(c16719, EnumC2939.LINE));
                sb.append(':');
                sb.append(AbstractC15601.m36771(c16719, EnumC2939.COLUMN));
                sb.append(':');
            } else if (c16719.m39350() != null && c16719.m39350().mo21321() == EnumC16866.CLASS) {
                sb.append(AbstractC15601.m36772(c16719, false));
                sb.append(":-:-:");
            } else {
                sb.append('-');
            }
            sb.append(' ');
            sb.append(mo8640(c16719, null));
            if (m36778(c16719)) {
                sb.append("\n");
                sb.append(m36776(c16719, 0));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        } finally {
            this.f53825 = null;
        }
    }

    @Override // l.InterfaceC12816
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final String mo8640(C16719 c16719, Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo36775((Locale) null, c16719.mo29298(), m36781(c16719, locale).toArray()));
        if ((c16719 instanceof C22864) && EnumSet.copyOf(getConfiguration().f26133).contains(EnumC21989.SUBDIAGNOSTICS) && m36782(c16719, null).m8249()) {
            sb.append(",{");
            Iterator it = m36782(c16719, null).iterator();
            String str = "";
            while (it.hasNext()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str, MotionUtils.EASING_TYPE_FORMAT_START, (String) it.next(), MotionUtils.EASING_TYPE_FORMAT_END);
                str = ",";
            }
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // l.AbstractC15601
    /* JADX INFO: renamed from: ֫ */
    public final String mo36777(C16719 c16719, Object obj, Locale locale) {
        String strMo36777;
        if (obj instanceof InterfaceC9995) {
            strMo36777 = obj.toString();
        } else if (obj instanceof AbstractC12612) {
            C12171.m29637(this.f53825);
            strMo36777 = "@" + this.f53825.m42692((AbstractC12612) obj);
        } else if (obj instanceof AbstractC12465) {
            strMo36777 = ((AbstractC12465) obj).mo30626();
        } else if (obj instanceof EnumC18550) {
            strMo36777 = "compiler.misc.tree.tag." + ((EnumC18550) obj).name().toLowerCase(Locale.US);
        } else {
            strMo36777 = ((obj instanceof EnumC16280) && obj == EnumC16280.f50066 && f53824.contains(c16719.mo29298())) ? "DEFAULT" : super.mo36777(c16719, obj, (Locale) null);
        }
        return obj instanceof C16719 ? C4860.m14172(MotionUtils.EASING_TYPE_FORMAT_START, strMo36777, MotionUtils.EASING_TYPE_FORMAT_END) : strMo36777;
    }

    static {
        Object[] objArr = {"compiler.note.preview.filename", "compiler.note.preview.plural"};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f53824 = C20195.unmodifiableSet(hashSet);
    }

    @Override // l.AbstractC15601
    /* JADX INFO: renamed from: ֫ */
    public final String mo36775(Locale locale, String str, Object... objArr) {
        StringBuilder sbM15339 = C5368.m15339(str);
        int length = objArr.length;
        String str2 = ": ";
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            sbM15339.append(str2);
            sbM15339.append(obj);
            i++;
            str2 = ", ";
        }
        return sbM15339.toString();
    }
}
