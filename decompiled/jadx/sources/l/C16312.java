package l;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public class C16312 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9383 f50224 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12617 f50222 = new C12617();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f50223 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16312 m38391(InputStream inputStream) {
        return new C2908().m8890(inputStream, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16312 m38394(InputStream inputStream) {
        return new C2908().m8890(inputStream, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Picture m38396(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        C17703 c17703 = new C17703();
        c17703.f54176 = new C16997(0.0f, 0.0f, i, i2);
        new C18430(canvasBeginRecording, false).m42900(this, c17703);
        picture.endRecording();
        return picture;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38402(Canvas canvas, RectF rectF) {
        C17703 c17703 = new C17703();
        c17703.f54176 = new C16997(rectF.left, rectF.top, rectF.width(), rectF.height());
        new C18430(canvas, true).m42900(this, c17703);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38401(Canvas canvas) {
        C17703 c17703 = new C17703();
        if (c17703.f54176 == null) {
            c17703.f54176 = new C16997(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C18430(canvas, true).m42900(this, c17703);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m38410() {
        if (this.f50224 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m38395().f52134;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38406(float f) {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c9383.f28498 = new C0769(f);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m38405() {
        if (this.f50224 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m38395().f52131;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38399(float f) {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c9383.f28501 = new C0769(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38400(float f, float f2) {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c9383.f68869 = new C16997(0.0f, 0.0f, f, f2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RectF m38408() {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C16997 c16997 = c9383.f68869;
        if (c16997 == null) {
            return null;
        }
        return new RectF(c16997.f52132, c16997.f52133, c16997.m39856(), c16997.m39857());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9383 m38409() {
        return this.f50224;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38403(C9383 c9383) {
        this.f50224 = c9383;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19261 m38398(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strM38393 = m38393(str);
        if (strM38393.length() <= 1 || !strM38393.startsWith("#") || (strSubstring = strM38393.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f50224.f60633)) {
            return this.f50224;
        }
        HashMap map = this.f50223;
        if (map.containsKey(strSubstring)) {
            return (AbstractC19261) map.get(strSubstring);
        }
        AbstractC19261 abstractC19261M38392 = m38392(this.f50224, strSubstring);
        map.put(strSubstring, abstractC19261M38392);
        return abstractC19261M38392;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m38393(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C16997 m38395() {
        EnumC7265 enumC7265;
        EnumC7265 enumC7266;
        EnumC7265 enumC7267;
        EnumC7265 enumC7268;
        float fM2928;
        EnumC7265 enumC7269;
        C9383 c9383 = this.f50224;
        C0769 c0769 = c9383.f28498;
        C0769 c07610 = c9383.f28501;
        if (c0769 == null || c0769.m2934() || (enumC7265 = c0769.f2854) == (enumC7266 = EnumC7265.percent) || enumC7265 == (enumC7267 = EnumC7265.em) || enumC7265 == (enumC7268 = EnumC7265.ex)) {
            return new C16997(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM2929 = c0769.m2928(96.0f);
        if (c07610 != null) {
            if (c07610.m2934() || (enumC7269 = c07610.f2854) == enumC7266 || enumC7269 == enumC7267 || enumC7269 == enumC7268) {
                return new C16997(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM2928 = c07610.m2928(96.0f);
        } else {
            C16997 c16997 = this.f50224.f68869;
            fM2928 = c16997 != null ? (c16997.f52131 * fM2929) / c16997.f52134 : fM2929;
        }
        return new C16997(0.0f, 0.0f, fM2929, fM2928);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38404(C12617 c12617) {
        this.f50222.m30878(c12617);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m38397() {
        return this.f50222.m30877();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m38407() {
        return !this.f50222.m30880();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC19261 m38392(InterfaceC3738 interfaceC3738, String str) {
        AbstractC19261 abstractC19261M38392;
        AbstractC19261 abstractC19261 = (AbstractC19261) interfaceC3738;
        if (str.equals(abstractC19261.f60633)) {
            return abstractC19261;
        }
        for (Object obj : interfaceC3738.getChildren()) {
            if (obj instanceof AbstractC19261) {
                AbstractC19261 abstractC19262 = (AbstractC19261) obj;
                if (str.equals(abstractC19262.f60633)) {
                    return abstractC19262;
                }
                if ((obj instanceof InterfaceC3738) && (abstractC19261M38392 = m38392((InterfaceC3738) obj, str)) != null) {
                    return abstractC19261M38392;
                }
            }
        }
        return null;
    }
}
