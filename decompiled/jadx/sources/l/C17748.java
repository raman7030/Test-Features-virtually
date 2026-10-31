package l;

import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C17748 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f54301;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f54302;

    public C17748(C23326 c23326) {
        InterfaceC4277 interfaceC4277 = null;
        for (InterfaceC4277 interfaceC4278 : c23326.mo21936()) {
            if (interfaceC4278.getPackageName().equals("bin.mt.plus.TranslationData")) {
                interfaceC4277 = interfaceC4278;
            }
        }
        if (interfaceC4277 != null) {
            InterfaceC0748 type = interfaceC4277.getType(am.av);
            InterfaceC0748 type2 = interfaceC4277.getType("b");
            InterfaceC0748 type3 = interfaceC4277.getType(am.aF);
            if (type3 != null) {
                this.f54301 = new HashMap();
                for (InterfaceC7099 interfaceC7099 : type3.mo2872()) {
                    HashMap map = new HashMap();
                    this.f54301.put(interfaceC7099.mo18743().toString(), map);
                    for (int i = 0; i <= interfaceC7099.mo2344(); i++) {
                        if (interfaceC7099.mo2347(i)) {
                            try {
                                InterfaceC21211 interfaceC21211Mo2346 = interfaceC7099.mo2346(i);
                                C11003.requireNonNull(interfaceC21211Mo2346);
                                map.put(new C10693(interfaceC21211Mo2346.getParent(), interfaceC21211Mo2346.getValue().mo5006()), new C16336(interfaceC21211Mo2346.getValue(0).mo5008(), interfaceC21211Mo2346.getValue(1).mo5008()));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return;
            }
            if (type == null || type2 == null || type.mo2871() != type2.mo2871() || type.mo2878() != type2.mo2878()) {
                return;
            }
            this.f54302 = new HashMap();
            for (int i2 = 0; i2 < type.mo2871(); i2++) {
                InterfaceC7099 interfaceC7099Mo2877 = type.mo2877(i2);
                InterfaceC7099 interfaceC7099Mo2878 = type2.mo2877(i2);
                if (interfaceC7099Mo2877.mo18743().toString().equals(interfaceC7099Mo2878.mo18743().toString())) {
                    HashMap map2 = new HashMap();
                    this.f54302.put(interfaceC7099Mo2877.mo18743().toString(), map2);
                    for (int i3 = 0; i3 <= interfaceC7099Mo2877.mo2344(); i3++) {
                        if (interfaceC7099Mo2877.mo2347(i3) && interfaceC7099Mo2878.mo2347(i3)) {
                            try {
                                map2.put(interfaceC7099Mo2878.mo2346(i3).getValue().mo5008(), interfaceC7099Mo2877.mo2346(i3).getValue().mo5008());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1520 m41563(String str) {
        C1520 c1520 = new C1520();
        c1520.f5388 = null;
        c1520.f5389 = null;
        HashMap map = this.f54301;
        if (map != null) {
            c1520.f5388 = (Map) map.get(str);
            return c1520;
        }
        HashMap map2 = this.f54302;
        if (map2 != null) {
            c1520.f5389 = (Map) map2.get(str);
        }
        return c1520;
    }
}
