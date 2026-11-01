package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠ܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7G8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10246 extends C9164 {
    @Override // p067l.C9164
    /* JADX INFO: renamed from: ۙ */
    public final void mo21125() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = this.f24830.length - 1;
        boolean z = this.f32275;
        String str = z ? "" : C0249l.f1196b;
        int i = 0;
        while (i <= length) {
            String str2 = ", ";
            if (z) {
                sb.append("#");
                sb.append(this.f24830[i]);
                sb.append(i == length ? C0249l.f1196b : ", ");
            }
            sb2.append(this.f38266.m27986(this.f24830[i]));
            if (i == length) {
                str2 = str;
            }
            sb2.append(str2);
            i++;
        }
        m26672(m26671(mo20624(), this.f24829.m38127()));
        if (z) {
            if (this.f32292) {
                m26676(sb.toString());
                return;
            }
            this.f32274.mo4344(m26671(m26665(), sb.toString()));
            m26676(" // " + ((Object) sb2));
            return;
        }
        m26676(sb2.toString());
    }

    @Override // p067l.C9164
    /* JADX INFO: renamed from: ᩹ */
    public final void mo21126() {
        String string;
        String strM38127 = this.f24829.m38127();
        int length = strM38127.length();
        if (length < 0) {
            throw new IllegalArgumentException(C20778.m46922(length, "count is negative: "));
        }
        if (length != 0) {
            string = " ";
            if (length != 1) {
                if (1 > Integer.MAX_VALUE / length) {
                    throw new OutOfMemoryError(C19768.m44906(length, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
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
        int length2 = this.f24830.length - 1;
        int i2 = 0;
        while (i2 <= length2) {
            if (!this.f32275) {
                m26672(m26671(mo20624(), i2 == 0 ? strM38127 : string));
                this.f32274.mo4344(this.f38266.m27986(this.f24830[i2]));
                m26676(i2 == length2 ? C0249l.f1196b : ",");
            } else if (this.f32292) {
                m26672(m26671(mo20624(), i2 == 0 ? strM38127 : string));
                this.f32274.mo4344(String.format("#%d", Integer.valueOf(this.f24830[i2])));
                m26676(i2 == length2 ? C0249l.f1196b : ",");
            } else {
                m26672(m26671(mo20624(), i2 == 0 ? strM38127 : string));
                this.f32274.mo4344(m26671(m26665(), String.format("#%d%s", Integer.valueOf(this.f24830[i2]), i2 == length2 ? C0249l.f1196b : ",")));
                m26676(" // " + this.f38266.m27986(this.f24830[i2]));
            }
            i2++;
        }
    }
}
