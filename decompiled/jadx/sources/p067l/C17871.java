package p067l;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public class C17871 {

    /* JADX INFO: renamed from: ܽ */
    public C11286 f53391 = null;

    /* JADX INFO: renamed from: ֫ */
    public C14360 f53389 = new C14360();

    /* JADX INFO: renamed from: ۧ */
    public HashMap f53390 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static C17871 m40606(InputStream inputStream) {
        return new C5132().m10957(inputStream, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17871 m40609(InputStream inputStream) {
        return new C5132().m10957(inputStream, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Picture m40611(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        C19193 c19193 = new C19193();
        c19193.f57368 = new C18522(0.0f, 0.0f, i, i2);
        new C19884(canvasBeginRecording, false).m45173(this, c19193);
        picture.endRecording();
        return picture;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40617(Canvas canvas, RectF rectF) {
        C19193 c19193 = new C19193();
        c19193.f57368 = new C18522(rectF.left, rectF.top, rectF.width(), rectF.height());
        new C19884(canvas, true).m45173(this, c19193);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40616(Canvas canvas) {
        C19193 c19193 = new C19193();
        if (c19193.f57368 == null) {
            c19193.f57368 = new C18522(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C19884(canvas, true).m45173(this, c19193);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m40625() {
        if (this.f53391 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m40610().f55314;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40621(float f) {
        C11286 c11286 = this.f53391;
        if (c11286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c11286.f31447 = new C3099(f);
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m40620() {
        if (this.f53391 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m40610().f55311;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40614(float f) {
        C11286 c11286 = this.f53391;
        if (c11286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c11286.f31450 = new C3099(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40615(float f, float f2) {
        C11286 c11286 = this.f53391;
        if (c11286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c11286.f71564 = new C18522(0.0f, 0.0f, f, f2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final RectF m40623() {
        C11286 c11286 = this.f53391;
        if (c11286 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C18522 c18522 = c11286.f71564;
        if (c18522 == null) {
            return null;
        }
        return new RectF(c18522.f55312, c18522.f55313, c18522.m42099(), c18522.m42100());
    }

    /* JADX INFO: renamed from: ܿ */
    public final C11286 m40624() {
        return this.f53391;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40618(C11286 c11286) {
        this.f53391 = c11286;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20674 m40613(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strM40608 = m40608(str);
        if (strM40608.length() <= 1 || !strM40608.startsWith("#") || (strSubstring = strM40608.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f53391.f63863)) {
            return this.f53391;
        }
        HashMap map = this.f53390;
        if (map.containsKey(strSubstring)) {
            return (AbstractC20674) map.get(strSubstring);
        }
        AbstractC20674 abstractC20674M40607 = m40607(this.f53391, strSubstring);
        map.put(strSubstring, abstractC20674M40607);
        return abstractC20674M40607;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m40608(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* JADX INFO: renamed from: ᩻ */
    private C18522 m40610() {
        EnumC9273 enumC9273;
        EnumC9273 enumC9274;
        EnumC9273 enumC9275;
        EnumC9273 enumC9276;
        float fM5256;
        EnumC9273 enumC9277;
        C11286 c11286 = this.f53391;
        C3099 c3099 = c11286.f31447;
        C3099 c30910 = c11286.f31450;
        if (c3099 == null || c3099.m5262() || (enumC9273 = c3099.f5626) == (enumC9274 = EnumC9273.percent) || enumC9273 == (enumC9275 = EnumC9273.em) || enumC9273 == (enumC9276 = EnumC9273.ex)) {
            return new C18522(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fM5257 = c3099.m5256(96.0f);
        if (c30910 != null) {
            if (c30910.m5262() || (enumC9277 = c30910.f5626) == enumC9274 || enumC9277 == enumC9275 || enumC9277 == enumC9276) {
                return new C18522(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fM5256 = c30910.m5256(96.0f);
        } else {
            C18522 c18522 = this.f53391.f71564;
            fM5256 = c18522 != null ? (c18522.f55311 * fM5257) / c18522.f55314 : fM5257;
        }
        return new C18522(0.0f, 0.0f, fM5257, fM5256);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40619(C14360 c14360) {
        this.f53389.m32955(c14360);
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m40612() {
        return this.f53389.m32954();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m40622() {
        return !this.f53389.m32957();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC20674 m40607(InterfaceC5921 interfaceC5921, String str) {
        AbstractC20674 abstractC20674M40607;
        AbstractC20674 abstractC20674 = (AbstractC20674) interfaceC5921;
        if (str.equals(abstractC20674.f63863)) {
            return abstractC20674;
        }
        for (Object obj : interfaceC5921.getChildren()) {
            if (obj instanceof AbstractC20674) {
                AbstractC20674 abstractC20675 = (AbstractC20674) obj;
                if (str.equals(abstractC20675.f63863)) {
                    return abstractC20675;
                }
                if ((obj instanceof InterfaceC5921) && (abstractC20674M40607 = m40607((InterfaceC5921) obj, str)) != null) {
                    return abstractC20674M40607;
                }
            }
        }
        return null;
    }
}
