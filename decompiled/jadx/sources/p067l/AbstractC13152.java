package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13152 implements Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public static final List f36966 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC13152 f36967;

    /* JADX INFO: renamed from: ᩹ */
    public int f36968;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C17173 mo27062();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9268(Appendable appendable, int i, C2421 c2421);

    /* JADX INFO: renamed from: ۜ */
    public abstract List mo27064();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo9269(Appendable appendable, int i, C2421 c2421);

    /* JADX INFO: renamed from: ܳ */
    public abstract AbstractC13152 mo12956();

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo5244();

    /* JADX INFO: renamed from: ܽ */
    public abstract String mo27067();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo27068(String str);

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo12957();

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo27071();

    /* JADX INFO: renamed from: ۢ */
    public final boolean m30138() {
        return this.f36967 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo27065(String str) {
        C18515.m42065((Object) str);
        if (!mo27071()) {
            return "";
        }
        String strM38886 = mo27062().m38886(str);
        if (strM38886.length() > 0) {
            return strM38886;
        }
        return str.startsWith("abs:") ? mo27060(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC13152 mo22866(String str, String str2) {
        mo27062().m38893(C23880.m52963(this).m28802().m7395(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo27069(String str) {
        C18515.m42065((Object) str);
        if (!mo27071()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo27062().m38899(strSubstring) && !mo27060(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo27062().m38899(str);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m30142(String str) {
        C18515.m42065((Object) str);
        mo27068(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo27060(String str) {
        C18515.m42066(str);
        return (mo27071() && mo27062().m38899(str)) ? C21869.m49320(mo27067(), mo27062().m38886(str)) : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13152 m30131(int i) {
        return (AbstractC13152) mo27064().get(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m30141() {
        if (mo12957() == 0) {
            return f36966;
        }
        List listMo27064 = mo27064();
        ArrayList arrayList = new ArrayList(listMo27064.size());
        arrayList.addAll(listMo27064);
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ᩵ */
    public AbstractC13152 mo30143() {
        return this.f36967;
    }

    /* JADX INFO: renamed from: ֡ */
    public final AbstractC13152 m30129() {
        return this.f36967;
    }

    /* JADX INFO: renamed from: ֨ */
    public AbstractC13152 mo30130() {
        AbstractC13152 abstractC13152 = this;
        while (true) {
            AbstractC13152 abstractC13153 = abstractC13152.f36967;
            if (abstractC13153 == null) {
                return abstractC13152;
            }
            abstractC13152 = abstractC13153;
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final C3092 m30134() {
        AbstractC13152 abstractC13152Mo30130 = mo30130();
        if (abstractC13152Mo30130 instanceof C3092) {
            return (C3092) abstractC13152Mo30130;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m30135() {
        C18515.m42065(this.f36967);
        this.f36967.mo30139(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30133(C15162 c15162) {
        C18515.m42065(this.f36967);
        AbstractC13152 abstractC13152 = this.f36967;
        abstractC13152.getClass();
        C18515.m42068(this.f36967 == abstractC13152);
        AbstractC13152 abstractC13153 = c15162.f36967;
        if (abstractC13153 != null) {
            abstractC13153.mo30139(c15162);
        }
        int i = this.f36968;
        abstractC13152.mo27064().set(i, c15162);
        c15162.f36967 = abstractC13152;
        c15162.f36968 = i;
        this.f36967 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo30139(AbstractC13152 abstractC13152) {
        C18515.m42068(abstractC13152.f36967 == this);
        int i = abstractC13152.f36968;
        mo27064().remove(i);
        m30127(i);
        abstractC13152.f36967 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30132(int i, AbstractC13152... abstractC13152Arr) {
        C18515.m42065(abstractC13152Arr);
        if (abstractC13152Arr.length == 0) {
            return;
        }
        List listMo27064 = mo27064();
        AbstractC13152 abstractC13152Mo30143 = abstractC13152Arr[0].mo30143();
        if (abstractC13152Mo30143 != null && abstractC13152Mo30143.mo12957() == abstractC13152Arr.length) {
            List listMo27065 = abstractC13152Mo30143.mo27064();
            int length = abstractC13152Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (abstractC13152Arr[i2] != listMo27065.get(i2)) {
                        break;
                    } else {
                        length = i2;
                    }
                } else {
                    boolean z = mo12957() == 0;
                    abstractC13152Mo30143.mo12956();
                    listMo27064.addAll(i, Arrays.asList(abstractC13152Arr));
                    int length2 = abstractC13152Arr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC13152Arr[i3].f36967 = this;
                        length2 = i3;
                    }
                    if (z && abstractC13152Arr[0].f36968 == 0) {
                        return;
                    }
                    m30127(i);
                    return;
                }
            }
        }
        for (AbstractC13152 abstractC13152 : abstractC13152Arr) {
            if (abstractC13152 == null) {
                throw new C15832("Array must not contain any null objects");
            }
        }
        for (AbstractC13152 abstractC13153 : abstractC13152Arr) {
            abstractC13153.getClass();
            AbstractC13152 abstractC13154 = abstractC13153.f36967;
            if (abstractC13154 != null) {
                abstractC13154.mo30139(abstractC13153);
            }
            abstractC13153.f36967 = this;
        }
        listMo27064.addAll(i, Arrays.asList(abstractC13152Arr));
        m30127(i);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m30127(int i) {
        int iMo12957 = mo12957();
        if (iMo12957 == 0) {
            return;
        }
        List listMo27064 = mo27064();
        while (i < iMo12957) {
            ((AbstractC13152) listMo27064.get(i)).f36968 = i;
            i++;
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final List m30140() {
        AbstractC13152 abstractC13152 = this.f36967;
        if (abstractC13152 == null) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC13152> listMo27064 = abstractC13152.mo27064();
        ArrayList arrayList = new ArrayList(listMo27064.size() - 1);
        for (AbstractC13152 abstractC13153 : listMo27064) {
            if (abstractC13153 != this) {
                arrayList.add(abstractC13153);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۡ */
    public final AbstractC13152 m30137() {
        AbstractC13152 abstractC13152 = this.f36967;
        if (abstractC13152 == null) {
            return null;
        }
        List listMo27064 = abstractC13152.mo27064();
        int i = this.f36968 + 1;
        if (listMo27064.size() > i) {
            return (AbstractC13152) listMo27064.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m30136() {
        return this.f36968;
    }

    /* JADX INFO: renamed from: ۖ */
    public String mo5239() {
        StringBuilder sbM49323 = C21869.m49323();
        C3092 c3092M30134 = m30134();
        if (c3092M30134 == null) {
            c3092M30134 = new C3092("");
        }
        C23669.m52682(new C7787(sbM49323, c3092M30134.m5236()), this);
        return C21869.m49321(sbM49323);
    }

    /* JADX INFO: renamed from: ᩹ */
    public final C3902 m30144() {
        return C3902.m7706(this, true);
    }

    public String toString() {
        return mo5239();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m30128(Appendable appendable, int i, C2421 c2421) {
        appendable.append('\n');
        c2421.getClass();
        appendable.append(C21869.m49319(c2421.m3378() * i, c2421.m3377()));
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC13152 mo55709clone() {
        AbstractC13152 abstractC13152Mo27061 = mo27061((AbstractC13152) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC13152Mo27061);
        while (!linkedList.isEmpty()) {
            AbstractC13152 abstractC13152 = (AbstractC13152) linkedList.remove();
            int iMo12957 = abstractC13152.mo12957();
            for (int i = 0; i < iMo12957; i++) {
                List listMo27064 = abstractC13152.mo27064();
                AbstractC13152 abstractC13152Mo27062 = ((AbstractC13152) listMo27064.get(i)).mo27061(abstractC13152);
                listMo27064.set(i, abstractC13152Mo27062);
                linkedList.add(abstractC13152Mo27062);
            }
        }
        return abstractC13152Mo27061;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC13152 mo27061(AbstractC13152 abstractC13152) {
        C3092 c3092M30134;
        try {
            AbstractC13152 abstractC13153 = (AbstractC13152) super.clone();
            abstractC13153.f36967 = abstractC13152;
            abstractC13153.f36968 = abstractC13152 == null ? 0 : this.f36968;
            if (abstractC13152 == null && !(this instanceof C3092) && (c3092M30134 = m30134()) != null) {
                C3092 c3092M5242 = c3092M30134.m5242();
                abstractC13153.f36967 = c3092M5242;
                c3092M5242.mo27064().add(abstractC13153);
            }
            return abstractC13153;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
