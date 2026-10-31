package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15008 implements InterfaceC14303 {
    public final InterfaceC10030 a;
    public final EnumC20655 b;
    public final C14052 c;
    public volatile C2310 d;

    public C15008(InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, C14052 c14052) {
        this.a = interfaceC10030;
        this.b = enumC20655;
        this.c = c14052;
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        String strC;
        Long lA = c10071.a(this.a);
        C6292 c6292 = c10071.b;
        if (lA == null) {
            return false;
        }
        InterfaceC2765 interfaceC2765 = (InterfaceC2765) c10071.a.T(AbstractC5796.b);
        if (interfaceC2765 == null || interfaceC2765 == C8409.c) {
            strC = this.c.c(this.a, lA.longValue(), this.b, c6292.b);
        } else {
            strC = this.c.b(interfaceC2765, this.a, lA.longValue(), this.b, c6292.b);
        }
        if (strC != null) {
            sb.append(strC);
            return true;
        }
        if (this.d == null) {
            this.d = new C2310(this.a, 1, 19, EnumC23476.NORMAL);
        }
        return this.d.l(c10071, sb);
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        Iterator itE;
        C14052 c14052 = this.c;
        InterfaceC10030 interfaceC10030 = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = c3015.c;
            C6292 c6292 = c3015.a;
            EnumC20655 enumC20655 = z ? this.b : null;
            InterfaceC2765 interfaceC2765 = c3015.c().c;
            if (interfaceC2765 == null && (interfaceC2765 = c3015.a.e) == null) {
                interfaceC2765 = C8409.c;
            }
            InterfaceC2765 interfaceC2766 = interfaceC2765;
            if (interfaceC2766 == null || interfaceC2766 == C8409.c) {
                itE = c14052.e(interfaceC10030, enumC20655, c6292.b);
            } else {
                itE = c14052.d(interfaceC2766, interfaceC10030, enumC20655, c6292.b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (c3015.g(str, 0, charSequence, i, str.length())) {
                        return c3015.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (interfaceC10030 == EnumC18496.ERA && !c3015.c) {
                    for (InterfaceC4176 interfaceC4176 : interfaceC2766.x()) {
                        String string = interfaceC4176.toString();
                        if (c3015.g(string, 0, charSequence, i, string.length())) {
                            return c3015.f(this.a, interfaceC4176.getValue(), i, string.length() + i);
                        }
                    }
                }
                if (c3015.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new C2310(this.a, 1, 19, EnumC23476.NORMAL);
            }
            return this.d.m(c3015, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        EnumC20655 enumC20655 = EnumC20655.FULL;
        InterfaceC10030 interfaceC10030 = this.a;
        EnumC20655 enumC20656 = this.b;
        if (enumC20656 == enumC20655) {
            return "Text(" + interfaceC10030 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Text(" + interfaceC10030 + "," + enumC20656 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
