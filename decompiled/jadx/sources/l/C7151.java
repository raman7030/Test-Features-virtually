package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 77DE */
/* JADX INFO: loaded from: classes3.dex */
public class C7151 extends AbstractC11817 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public EnumC15204 f21950;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int[] f21951;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19181(int i, DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (i != (unsignedShort * 2) + 2) {
            throw new ClassFormatError(C16014.m37867(this.f21950.m35967(), "_attribute: Invalid attribute length"));
        }
        this.f21951 = new int[unsignedShort];
        for (int i2 = 0; i2 < unsignedShort; i2++) {
            this.f21951[i2] = dataInputStream.readUnsignedShort();
        }
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩴ */
    public final void mo18679() {
        if (this.f21951.length > 2) {
            mo19183();
        } else {
            mo19182();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo19182() {
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

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void mo19183() {
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

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ۚ */
    public final void mo18674() {
        mo18679();
    }
}
