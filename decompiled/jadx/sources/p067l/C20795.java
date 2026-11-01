package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1Y4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20795 {

    /* JADX INFO: renamed from: ۧ */
    public C18762 f65359;

    /* JADX INFO: renamed from: ᩳ */
    public HashSet f65362 = new HashSet();

    /* JADX INFO: renamed from: ܿ */
    public ArrayList f65361 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public HashSet f65358 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public int f65360 = 0;

    public C20795(C18762 c18762) {
        this.f65359 = c18762;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46950(C3349 c3349) {
        m46947(c3349, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46947(InterfaceC7568 interfaceC7568, int i) {
        C3349 c3349;
        String string = interfaceC7568.toString();
        HashSet hashSet = this.f65362;
        if (hashSet.contains(string)) {
            return;
        }
        hashSet.add(string);
        this.f65361.add(interfaceC7568);
        if (interfaceC7568.getName().equals("<clinit>")) {
            this.f65358.add(interfaceC7568.mo5853());
        }
        C2993 c2993 = (C2993) this.f65359.f56062.get(interfaceC7568.mo5853());
        if (c2993 == null) {
            return;
        }
        if (i > this.f65360) {
            this.f65360 = i;
        }
        if (!interfaceC7568.getName().equals("<clinit>")) {
            m46945(c2993, i);
        }
        Iterator it = c2993.getMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                c3349 = null;
                break;
            }
            c3349 = (C3349) it.next();
            if (c3349.equals(interfaceC7568)) {
                InterfaceC20568 interfaceC20568Mo5857 = c3349.mo5857();
                if (interfaceC20568Mo5857 == null) {
                    break;
                }
                for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                    int i2 = interfaceC23920.mo6217().f6092;
                    if (i2 == 1) {
                        m46944(i + 1, ((InterfaceC22991) ((InterfaceC12777) interfaceC23920).getReference()).getType());
                    } else if (i2 == 2) {
                        m46944(i + 1, ((InterfaceC20309) ((InterfaceC12777) interfaceC23920).getReference()).mo10231());
                    } else if (i2 == 3) {
                        m46947((InterfaceC7568) ((InterfaceC12777) interfaceC23920).getReference(), i + 1);
                    }
                }
                break;
            }
        }
        if (c3349 == null || !(EnumC17248.STATIC.m39032(c3349.mo5854()) || EnumC17248.PRIVATE.m39032(c3349.mo5854()))) {
            String strM36382 = C16010.m36382(interfaceC7568, true);
            m46946(c2993, strM36382, i);
            m46948(c2993, strM36382, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46946(C2993 c2993, String str, int i) {
        String type = c2993.getType();
        for (C2993 c2994 : this.f65359.f56062.values()) {
            if (type.equals(c2994.mo5034())) {
                for (C3349 c3349 : c2994.getMethods()) {
                    if (str.equals(C16010.m36382((InterfaceC7568) c3349, true))) {
                        m46947(c3349, i);
                        break;
                    }
                }
                m46946(c2994, str, i);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m46948(C2993 c2993, String str, int i) {
        C2993 c2994 = (C2993) this.f65359.f56062.get(c2993.mo5034());
        if (c2994 != null) {
            for (C3349 c3349 : c2994.getMethods()) {
                if (str.equals(C16010.m36382((InterfaceC7568) c3349, true))) {
                    m46947(c3349, i);
                    break;
                }
            }
            m46948(c2994, str, i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46945(C2993 c2993, int i) {
        if (this.f65358.contains(c2993.getType())) {
            return;
        }
        for (C3349 c3349 : c2993.mo5035()) {
            if (c3349.getName().equals("<clinit>")) {
                m46947(c3349, i);
                break;
            }
        }
        String strMo5034 = c2993.mo5034();
        if (strMo5034 != null) {
            m46944(i, strMo5034);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46944(int i, String str) {
        HashSet hashSet = this.f65358;
        if (hashSet.contains(str)) {
            return;
        }
        C2993 c2993 = (C2993) this.f65359.f56062.get(str);
        if (c2993 != null) {
            m46945(c2993, i);
        } else {
            hashSet.add(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m46949() {
        return this.f65361;
    }
}
