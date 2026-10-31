package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11347 implements Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final List f33968 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11347 f33969;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33970;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C15578 mo25045();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7189(Appendable appendable, int i, C0056 c0056);

    /* JADX INFO: renamed from: ۜ */
    public abstract List mo25047();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo7190(Appendable appendable, int i, C0056 c0056);

    /* JADX INFO: renamed from: ܳ */
    public abstract AbstractC11347 mo10980();

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo2915();

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo25050();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo25051(String str);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo10981();

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo25054();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m28094() {
        return this.f33969 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo25048(String str) {
        C16990.m39822((Object) str);
        if (!mo25054()) {
            return "";
        }
        String strM36725 = mo25045().m36725(str);
        if (strM36725.length() > 0) {
            return strM36725;
        }
        return str.startsWith("abs:") ? mo25043(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC11347 mo20901(String str, String str2) {
        mo25045().m36732(C22635.m50637(this).m26763().m5153(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo25052(String str) {
        C16990.m39822((Object) str);
        if (!mo25054()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo25045().m36738(strSubstring) && !mo25043(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo25045().m36738(str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28098(String str) {
        C16990.m39822((Object) str);
        mo25051(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo25043(String str) {
        C16990.m39823(str);
        return (mo25054() && mo25045().m36738(str)) ? C20519.m46997(mo25050(), mo25045().m36725(str)) : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 m28087(int i) {
        return (AbstractC11347) mo25047().get(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m28097() {
        if (mo10981() == 0) {
            return f33968;
        }
        List listMo25047 = mo25047();
        ArrayList arrayList = new ArrayList(listMo25047.size());
        arrayList.addAll(listMo25047);
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC11347 mo28099() {
        return this.f33969;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 m28085() {
        return this.f33969;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC11347 mo28086() {
        AbstractC11347 abstractC11347 = this;
        while (true) {
            AbstractC11347 abstractC11348 = abstractC11347.f33969;
            if (abstractC11348 == null) {
                return abstractC11347;
            }
            abstractC11347 = abstractC11348;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0762 m28090() {
        AbstractC11347 abstractC11347Mo28086 = mo28086();
        if (abstractC11347Mo28086 instanceof C0762) {
            return (C0762) abstractC11347Mo28086;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m28091() {
        C16990.m39822(this.f33969);
        this.f33969.mo28095(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28089(C13462 c13462) {
        C16990.m39822(this.f33969);
        AbstractC11347 abstractC11347 = this.f33969;
        abstractC11347.getClass();
        C16990.m39825(this.f33969 == abstractC11347);
        AbstractC11347 abstractC11348 = c13462.f33969;
        if (abstractC11348 != null) {
            abstractC11348.mo28095(c13462);
        }
        int i = this.f33970;
        abstractC11347.mo25047().set(i, c13462);
        c13462.f33969 = abstractC11347;
        c13462.f33970 = i;
        this.f33969 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo28095(AbstractC11347 abstractC11347) {
        C16990.m39825(abstractC11347.f33969 == this);
        int i = abstractC11347.f33970;
        mo25047().remove(i);
        m28083(i);
        abstractC11347.f33969 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28088(int i, AbstractC11347... abstractC11347Arr) {
        C16990.m39822(abstractC11347Arr);
        if (abstractC11347Arr.length == 0) {
            return;
        }
        List listMo25047 = mo25047();
        AbstractC11347 abstractC11347Mo28099 = abstractC11347Arr[0].mo28099();
        if (abstractC11347Mo28099 != null && abstractC11347Mo28099.mo10981() == abstractC11347Arr.length) {
            List listMo25048 = abstractC11347Mo28099.mo25047();
            int length = abstractC11347Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (abstractC11347Arr[i2] != listMo25048.get(i2)) {
                        break;
                    } else {
                        length = i2;
                    }
                } else {
                    boolean z = mo10981() == 0;
                    abstractC11347Mo28099.mo10980();
                    listMo25047.addAll(i, Arrays.asList(abstractC11347Arr));
                    int length2 = abstractC11347Arr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC11347Arr[i3].f33969 = this;
                        length2 = i3;
                    }
                    if (z && abstractC11347Arr[0].f33970 == 0) {
                        return;
                    }
                    m28083(i);
                    return;
                }
            }
        }
        for (AbstractC11347 abstractC11347 : abstractC11347Arr) {
            if (abstractC11347 == null) {
                throw new C14167("Array must not contain any null objects");
            }
        }
        for (AbstractC11347 abstractC11348 : abstractC11347Arr) {
            abstractC11348.getClass();
            AbstractC11347 abstractC11349 = abstractC11348.f33969;
            if (abstractC11349 != null) {
                abstractC11349.mo28095(abstractC11348);
            }
            abstractC11348.f33969 = this;
        }
        listMo25047.addAll(i, Arrays.asList(abstractC11347Arr));
        m28083(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m28083(int i) {
        int iMo10981 = mo10981();
        if (iMo10981 == 0) {
            return;
        }
        List listMo25047 = mo25047();
        while (i < iMo10981) {
            ((AbstractC11347) listMo25047.get(i)).f33970 = i;
            i++;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m28096() {
        AbstractC11347 abstractC11347 = this.f33969;
        if (abstractC11347 == null) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC11347> listMo25047 = abstractC11347.mo25047();
        ArrayList arrayList = new ArrayList(listMo25047.size() - 1);
        for (AbstractC11347 abstractC11348 : listMo25047) {
            if (abstractC11348 != this) {
                arrayList.add(abstractC11348);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC11347 m28093() {
        AbstractC11347 abstractC11347 = this.f33969;
        if (abstractC11347 == null) {
            return null;
        }
        List listMo25047 = abstractC11347.mo25047();
        int i = this.f33970 + 1;
        if (listMo25047.size() > i) {
            return (AbstractC11347) listMo25047.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m28092() {
        return this.f33970;
    }

    /* JADX INFO: renamed from: ۖ */
    public String mo2910() {
        StringBuilder sbM47000 = C20519.m47000();
        C0762 c0762M28090 = m28090();
        if (c0762M28090 == null) {
            c0762M28090 = new C0762("");
        }
        C22412.m50342(new C5702(sbM47000, c0762M28090.m2907()), this);
        return C20519.m46998(sbM47000);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1614 m28100() {
        return C1614.m5476(this, true);
    }

    public String toString() {
        return mo2910();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m28084(Appendable appendable, int i, C0056 c0056) {
        appendable.append('\n');
        c0056.getClass();
        appendable.append(C20519.m46996(c0056.m983() * i, c0056.m982()));
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC11347 mo2918clone() {
        AbstractC11347 abstractC11347Mo25044 = mo25044((AbstractC11347) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC11347Mo25044);
        while (!linkedList.isEmpty()) {
            AbstractC11347 abstractC11347 = (AbstractC11347) linkedList.remove();
            int iMo10981 = abstractC11347.mo10981();
            for (int i = 0; i < iMo10981; i++) {
                List listMo25047 = abstractC11347.mo25047();
                AbstractC11347 abstractC11347Mo25045 = ((AbstractC11347) listMo25047.get(i)).mo25044(abstractC11347);
                listMo25047.set(i, abstractC11347Mo25045);
                linkedList.add(abstractC11347Mo25045);
            }
        }
        return abstractC11347Mo25044;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC11347 mo25044(AbstractC11347 abstractC11347) {
        C0762 c0762M28090;
        try {
            AbstractC11347 abstractC11348 = (AbstractC11347) super.clone();
            abstractC11348.f33969 = abstractC11347;
            abstractC11348.f33970 = abstractC11347 == null ? 0 : this.f33970;
            if (abstractC11347 == null && !(this instanceof C0762) && (c0762M28090 = m28090()) != null) {
                C0762 c0762M2913 = c0762M28090.m2913();
                abstractC11348.f33969 = c0762M2913;
                c0762M2913.mo25047().add(abstractC11348);
            }
            return abstractC11348;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
