package p067l;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.ۨ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13761 extends AbstractC20407 {

    /* JADX INFO: renamed from: ۬ */
    public static final Object f38898 = new Object();

    /* JADX INFO: renamed from: ۗ */
    public Object f38899;

    public C13761(Object obj) {
        super(EnumC3642.CONSTANT);
        this.f38899 = obj;
    }

    @Override // p067l.AbstractC20407, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C13761(this.f38899);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C13761(this.f38899);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        Object obj = this.f38899;
        if (f38898 == obj) {
            return "null";
        }
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof Number) {
            if (obj instanceof Float) {
                return this.f38899.toString() + "F";
            }
            if (!(obj instanceof Long)) {
                return obj.toString();
            }
            return this.f38899.toString() + "L";
        }
        int i = 0;
        if (!(obj instanceof String)) {
            if (obj instanceof C24094) {
                return C2805.m4425(((C24094) this.f38899).f76489) + ".class";
            }
            if (!obj.getClass().isArray()) {
                return "" + this.f38899;
            }
            StringBuilder sbM17248 = C7470.m17248("[");
            int length = Array.getLength(this.f38899);
            while (i < length) {
                sbM17248.append(Array.get(this.f38899, i));
                sbM17248.append(",");
                i++;
            }
            if (length > 0) {
                sbM17248.setLength(sbM17248.length() - 1);
            }
            sbM17248.append("]");
            return sbM17248.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("\"");
        String str = (String) this.f38899;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                stringBuffer.append("\\n");
            } else if (cCharAt == '\r') {
                stringBuffer.append("\\r");
            } else if (cCharAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (cCharAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (cCharAt < ' ' || cCharAt > 127) {
                stringBuffer.append("\\u");
                if (cCharAt < 16) {
                    stringBuffer.append("000");
                } else if (cCharAt < 256) {
                    stringBuffer.append(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT);
                } else if (cCharAt < 4096) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toString(cCharAt, 16));
            } else {
                stringBuffer.append(cCharAt);
            }
            i++;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }
}
