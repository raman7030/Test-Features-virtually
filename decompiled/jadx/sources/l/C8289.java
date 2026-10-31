package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7G8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8289 extends C7151 {
    @Override // l.C7151
    /* JADX INFO: renamed from: ۙ */
    public final void mo19182() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = this.f21951.length - 1;
        boolean z = this.f29326;
        String str = z ? "" : l.b;
        int i = 0;
        while (i <= length) {
            String str2 = ", ";
            if (z) {
                sb.append("#");
                sb.append(this.f21951[i]);
                sb.append(i == length ? l.b : ", ");
            }
            sb2.append(this.f35264.m25964(this.f21951[i]));
            if (i == length) {
                str2 = str;
            }
            sb2.append(str2);
            i++;
        }
        m24658(m24657(mo18675(), this.f21950.m35967()));
        if (z) {
            if (this.f29343) {
                m24662(sb.toString());
                return;
            }
            this.f29325.mo1968(m24657(m24651(), sb.toString()));
            m24662(" // " + ((Object) sb2));
            return;
        }
        m24662(sb2.toString());
    }

    @Override // l.C7151
    /* JADX INFO: renamed from: ᩹ */
    public final void mo19183() {
        String string;
        String strM35967 = this.f21950.m35967();
        int length = strM35967.length();
        if (length < 0) {
            throw new IllegalArgumentException(C19370.m44628(length, "count is negative: "));
        }
        if (length != 0) {
            string = " ";
            if (length != 1) {
                if (1 > Integer.MAX_VALUE / length) {
                    throw new OutOfMemoryError(C18307.m42645(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(length);
                for (int i = 0; i < length; i++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        } else {
            string = "";
        }
        int length2 = this.f21951.length - 1;
        int i2 = 0;
        while (i2 <= length2) {
            if (!this.f29326) {
                m24658(m24657(mo18675(), i2 == 0 ? strM35967 : string));
                this.f29325.mo1968(this.f35264.m25964(this.f21951[i2]));
                m24662(i2 == length2 ? l.b : ",");
            } else if (this.f29343) {
                m24658(m24657(mo18675(), i2 == 0 ? strM35967 : string));
                this.f29325.mo1968(String.format("#%d", Integer.valueOf(this.f21951[i2])));
                m24662(i2 == length2 ? l.b : ",");
            } else {
                m24658(m24657(mo18675(), i2 == 0 ? strM35967 : string));
                this.f29325.mo1968(m24657(m24651(), String.format("#%d%s", Integer.valueOf(this.f21951[i2]), i2 == length2 ? l.b : ",")));
                m24662(" // " + this.f35264.m25964(this.f21951[i2]));
            }
            i2++;
        }
    }
}
