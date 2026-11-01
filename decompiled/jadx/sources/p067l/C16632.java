package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16632 implements InterfaceC15962 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11901 f48880a;

    /* JADX INFO: renamed from: b */
    public final EnumC21999 f48881b;

    /* JADX INFO: renamed from: c */
    public final C15724 f48882c;

    /* JADX INFO: renamed from: d */
    public volatile C4564 f48883d;

    public C16632(InterfaceC11901 interfaceC11901, EnumC21999 enumC21999, C15724 c15724) {
        this.f48880a = interfaceC11901;
        this.f48881b = enumC21999;
        this.f48882c = c15724;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        String strMo35780c;
        Long lM27302a = c11940.m27302a(this.f48880a);
        C8349 c8349 = c11940.f33254b;
        if (lM27302a == null) {
            return false;
        }
        InterfaceC4997 interfaceC4997 = (InterfaceC4997) c11940.f33253a.mo6950T(AbstractC7877.f20680b);
        if (interfaceC4997 == null || interfaceC4997 == C10361.f28676c) {
            strMo35780c = this.f48882c.mo35780c(this.f48880a, lM27302a.longValue(), this.f48881b, c8349.f22322b);
        } else {
            strMo35780c = this.f48882c.mo35779b(interfaceC4997, this.f48880a, lM27302a.longValue(), this.f48881b, c8349.f22322b);
        }
        if (strMo35780c != null) {
            sb.append(strMo35780c);
            return true;
        }
        if (this.f48883d == null) {
            this.f48883d = new C4564(this.f48880a, 1, 19, EnumC24680.NORMAL);
        }
        return this.f48883d.mo9636l(c11940, sb);
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        Iterator itMo35782e;
        C15724 c15724 = this.f48882c;
        InterfaceC11901 interfaceC11901 = this.f48880a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = c5234.f12336c;
            C8349 c8349 = c5234.f12334a;
            EnumC21999 enumC21999 = z ? this.f48881b : null;
            InterfaceC4997 interfaceC4997 = c5234.m11288c().f53683c;
            if (interfaceC4997 == null && (interfaceC4997 = c5234.f12334a.f22325e) == null) {
                interfaceC4997 = C10361.f28676c;
            }
            InterfaceC4997 interfaceC4998 = interfaceC4997;
            if (interfaceC4998 == null || interfaceC4998 == C10361.f28676c) {
                itMo35782e = c15724.mo35782e(interfaceC11901, enumC21999, c8349.f22322b);
            } else {
                itMo35782e = c15724.mo35781d(interfaceC4998, interfaceC11901, enumC21999, c8349.f22322b);
            }
            Iterator it = itMo35782e;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (c5234.m11292g(str, 0, charSequence, i, str.length())) {
                        return c5234.m11291f(this.f48880a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (interfaceC11901 == EnumC19947.ERA && !c5234.f12336c) {
                    for (InterfaceC6338 interfaceC6338 : interfaceC4998.mo10589x()) {
                        String string = interfaceC6338.toString();
                        if (c5234.m11292g(string, 0, charSequence, i, string.length())) {
                            return c5234.m11291f(this.f48880a, interfaceC6338.getValue(), i, string.length() + i);
                        }
                    }
                }
                if (c5234.f12336c) {
                    return ~i;
                }
            }
            if (this.f48883d == null) {
                this.f48883d = new C4564(this.f48880a, 1, 19, EnumC24680.NORMAL);
            }
            return this.f48883d.mo9637m(c5234, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        EnumC21999 enumC21999 = EnumC21999.FULL;
        InterfaceC11901 interfaceC11901 = this.f48880a;
        EnumC21999 enumC219910 = this.f48881b;
        if (enumC219910 == enumC21999) {
            return "Text(" + interfaceC11901 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Text(" + interfaceC11901 + "," + enumC219910 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
