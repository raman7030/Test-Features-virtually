package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBG4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15834 implements InterfaceC0601 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20069 f48929;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21480 f48930;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3135 f48931;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10191 f48932;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC15834 mo3529(C7573 c7573);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC15834 mo3530(C21480 c21480, C20069 c20069);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3531(InterfaceC8780 interfaceC8780);

    /* JADX INFO: renamed from: ۘ */
    public AbstractC15834 mo3532() {
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract InterfaceC10711 mo3533();

    /* JADX INFO: renamed from: ᩳ */
    public String mo11590() {
        return null;
    }

    public AbstractC15834(C3135 c3135, C10191 c10191, C21480 c21480, C20069 c20069) {
        if (c3135 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c10191 == null) {
            throw new NullPointerException("position == null");
        }
        if (c20069 == null) {
            throw new NullPointerException("sources == null");
        }
        this.f48931 = c3135;
        this.f48932 = c10191;
        this.f48930 = c21480;
        this.f48929 = c20069;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo11590 = mo11590();
        StringBuilder sbM32307 = C13325.m32307(80, "Insn{");
        sbM32307.append(this.f48932);
        sbM32307.append(' ');
        sbM32307.append(this.f48931);
        if (strMo11590 != null) {
            sbM32307.append(' ');
            sbM32307.append(strMo11590);
        }
        sbM32307.append(" :: ");
        C21480 c21480 = this.f48930;
        if (c21480 != null) {
            sbM32307.append(c21480);
            sbM32307.append(" <- ");
        }
        sbM32307.append(this.f48929);
        sbM32307.append('}');
        return sbM32307.toString();
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        String strMo11590 = mo11590();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f48932);
        sb.append(": ");
        sb.append(this.f48931.m9560());
        if (strMo11590 != null) {
            C20177.m46410(sb, MotionUtils.EASING_TYPE_FORMAT_START, strMo11590, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C21480 c21480 = this.f48930;
        if (c21480 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c21480.mo2463());
        }
        sb.append(" <-");
        C20069 c20069 = this.f48929;
        int size = c20069.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(c20069.m41004get(i).mo2463());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3135 m37484() {
        return this.f48931;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10191 m37480() {
        return this.f48932;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21480 m37483() {
        return this.f48930;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21480 m37482() {
        C21480 c21480M41004get;
        if (this.f48931.m9562() == 54) {
            c21480M41004get = this.f48929.m41004get(0);
        } else {
            c21480M41004get = this.f48930;
        }
        if (c21480M41004get == null || c21480M41004get.m48653() == null) {
            return null;
        }
        return c21480M41004get;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20069 m37479() {
        return this.f48929;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37481() {
        return this.f48931.m9556();
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo16681(AbstractC15834 abstractC15834) {
        Object obj;
        C21480 c21480;
        if (this.f48931 != abstractC15834.f48931 || !this.f48932.equals(abstractC15834.f48932) || getClass() != abstractC15834.getClass() || ((c21480 = this.f48930) != (obj = abstractC15834.f48930) && (c21480 == null || !c21480.equals(obj)))) {
            return false;
        }
        Object obj2 = abstractC15834.f48929;
        C20069 c20069 = this.f48929;
        if (c20069 != obj2 && (c20069 == null || !c20069.equals(obj2))) {
            return false;
        }
        InterfaceC10711 interfaceC10711Mo3533 = mo3533();
        InterfaceC10711 interfaceC10711Mo3534 = abstractC15834.mo3533();
        C13922 c13922 = C13922.f41594;
        int size = interfaceC10711Mo3533.size();
        if (interfaceC10711Mo3534.size() == size) {
            for (int i = 0; i < size; i++) {
                if (interfaceC10711Mo3533.getType(i).equals(interfaceC10711Mo3534.getType(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
