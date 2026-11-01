package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9RN */
/* JADX INFO: loaded from: classes4.dex */
public final class C19236 {

    /* JADX INFO: renamed from: ֫ */
    public HashMap f57493;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f57494;

    public C19236(C24538 c24538) {
        InterfaceC6434 interfaceC6434 = null;
        for (InterfaceC6434 interfaceC6435 : c24538.mo23906()) {
            if (interfaceC6435.getPackageName().equals("bin.mt.plus.TranslationData")) {
                interfaceC6434 = interfaceC6435;
            }
        }
        if (interfaceC6434 != null) {
            InterfaceC3080 type = interfaceC6434.getType(C0655am.f2320av);
            InterfaceC3080 type2 = interfaceC6434.getType("b");
            InterfaceC3080 type3 = interfaceC6434.getType(C0655am.f2278aF);
            if (type3 != null) {
                this.f57493 = new HashMap();
                for (InterfaceC9116 interfaceC9116 : type3.mo5201()) {
                    HashMap map = new HashMap();
                    this.f57493.put(interfaceC9116.mo20693().toString(), map);
                    for (int i = 0; i <= interfaceC9116.mo4715(); i++) {
                        if (interfaceC9116.mo4718(i)) {
                            try {
                                InterfaceC22528 interfaceC22528Mo4717 = interfaceC9116.mo4717(i);
                                C12826.requireNonNull(interfaceC22528Mo4717);
                                map.put(new C12531(interfaceC22528Mo4717.getParent(), interfaceC22528Mo4717.getValue().mo7249()), new C17894(interfaceC22528Mo4717.getValue(0).mo7251(), interfaceC22528Mo4717.getValue(1).mo7251()));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                return;
            }
            if (type == null || type2 == null || type.mo5200() != type2.mo5200() || type.mo5207() != type2.mo5207()) {
                return;
            }
            this.f57494 = new HashMap();
            for (int i2 = 0; i2 < type.mo5200(); i2++) {
                InterfaceC9116 interfaceC9116Mo5206 = type.mo5206(i2);
                InterfaceC9116 interfaceC9116Mo5207 = type2.mo5206(i2);
                if (interfaceC9116Mo5206.mo20693().toString().equals(interfaceC9116Mo5207.mo20693().toString())) {
                    HashMap map2 = new HashMap();
                    this.f57494.put(interfaceC9116Mo5206.mo20693().toString(), map2);
                    for (int i3 = 0; i3 <= interfaceC9116Mo5206.mo4715(); i3++) {
                        if (interfaceC9116Mo5206.mo4718(i3) && interfaceC9116Mo5207.mo4718(i3)) {
                            try {
                                map2.put(interfaceC9116Mo5207.mo4717(i3).getValue().mo7251(), interfaceC9116Mo5206.mo4717(i3).getValue().mo7251());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3813 m43808(String str) {
        C3813 c3813 = new C3813();
        c3813.f8169 = null;
        c3813.f8170 = null;
        HashMap map = this.f57493;
        if (map != null) {
            c3813.f8169 = (Map) map.get(str);
            return c3813;
        }
        HashMap map2 = this.f57494;
        if (map2 != null) {
            c3813.f8170 = (Map) map2.get(str);
        }
        return c3813;
    }
}
