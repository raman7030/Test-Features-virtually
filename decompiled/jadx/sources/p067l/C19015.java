package p067l;

import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BJB */
/* JADX INFO: loaded from: classes4.dex */
public final class C19015 {

    /* JADX INFO: renamed from: ۧ */
    public static final C19015 f56681 = new C19015(null);

    /* JADX INFO: renamed from: ֫ */
    public List f56682;

    public C19015(InterfaceC11799 interfaceC11799) {
        if (interfaceC11799 == null) {
            this.f56682 = Collections.EMPTY_LIST;
            return;
        }
        ArrayList arrayList = new ArrayList(interfaceC11799.mo16866());
        Iterator it = interfaceC11799.mo23906().iterator();
        while (it.hasNext()) {
            arrayList.add(new C19686((InterfaceC6434) it.next()));
        }
        this.f56682 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18344 m43188(String str) {
        Iterator it = this.f56682.iterator();
        while (it.hasNext()) {
            C18344 c18344M44705 = ((C19686) it.next()).m44705(str);
            if (c18344M44705 != null) {
                return c18344M44705;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18344 m43187(int i) {
        Iterator it = this.f56682.iterator();
        while (it.hasNext()) {
            C18344 c18344M44704 = ((C19686) it.next()).m44704(i);
            if (c18344M44704 != null) {
                return c18344M44704;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18344 m43190(String str, boolean z) {
        C18344 c18344M44705;
        if (z) {
            for (C19686 c19686 : this.f56682) {
                if (c19686.m44707() == 1 && (c18344M44705 = c19686.m44705(str)) != null) {
                    return c18344M44705;
                }
            }
            return C12981.m29766().m43188(str);
        }
        return m43188(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18344 m43191(int i) {
        C18344 c18344M44704;
        int i2 = (i >>> 24) & 255;
        if (i2 != 1) {
            return m43187(i);
        }
        if (i2 != 1) {
            throw new IllegalArgumentException();
        }
        for (C19686 c19686 : this.f56682) {
            if (c19686.m44707() == 1 && (c18344M44704 = c19686.m44704(i)) != null) {
                return c18344M44704;
            }
        }
        return C12981.m29766().m43187(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18344 m43189(String str, String str2, Map map) {
        boolean zEquals = Chip.NAMESPACE_ANDROID.equals(str);
        C18344 c18344M43190 = m43190(str2, zEquals);
        if (c18344M43190 == null && str2.length() == 10 && str2.startsWith("id")) {
            String strSubstring = str2.substring(2);
            if (C11774.m27005(strSubstring)) {
                c18344M43190 = m43191(C11774.m27008(strSubstring));
            }
        }
        if (c18344M43190 == null && map != null) {
            c18344M43190 = (C18344) map.get(str + ":" + str2);
        }
        return (c18344M43190 != null || zEquals) ? c18344M43190 : C12981.m29766().m43188(str2);
    }
}
