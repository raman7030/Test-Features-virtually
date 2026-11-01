package p067l;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩶֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes5.dex */
public class C21199 extends AbstractC13152 {

    /* JADX INFO: renamed from: ۗ */
    public List f66644;

    /* JADX INFO: renamed from: ۙ */
    public C17173 f66645;

    /* JADX INFO: renamed from: ۫ */
    public C17864 f66646;

    /* JADX INFO: renamed from: ۬ */
    public WeakReference f66647;

    /* JADX INFO: renamed from: ۨ */
    public static final List f66643 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۛ */
    public static final Pattern f66641 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ۤ */
    public static final String f66642 = C17173.m38881("baseUri");

    public C21199(C17864 c17864, String str, C17173 c17173) {
        C18515.m42065(c17864);
        this.f66644 = AbstractC13152.f36966;
        this.f66645 = c17173;
        this.f66646 = c17864;
        if (str != null) {
            m30142(str);
        }
    }

    public C21199(String str) {
        this(C17864.m40572(str, C3783.f8102), "", null);
    }

    /* JADX INFO: renamed from: ۢ */
    public final C4355 m47886(String str) {
        C18515.m42066(str);
        AbstractC22481 abstractC22481M40381 = C17785.m40381(str);
        C18515.m42065(abstractC22481M40381);
        return C13563.m30869(abstractC22481M40381, this);
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۜ */
    public final List mo27064() {
        if (this.f66644 == AbstractC13152.f36966) {
            this.f66644 = new C23210(this, 4);
        }
        return this.f66644;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo27071() {
        return this.f66645 != null;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final C17173 mo27062() {
        if (this.f66645 == null) {
            this.f66645 = new C17173();
        }
        return this.f66645;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܽ */
    public final String mo27067() {
        for (C21199 c21199 = this; c21199 != null; c21199 = (C21199) c21199.f36967) {
            C17173 c17173 = c21199.f66645;
            if (c17173 != null) {
                String str = f66642;
                if (c17173.m38896(str)) {
                    return c21199.f66645.get(str);
                }
            }
        }
        return "";
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܽ */
    public final void mo27068(String str) {
        mo27062().put(f66642, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47873(int i, List list) {
        if (list == null) {
            throw new C15832("Children collection to be inserted must not be null.");
        }
        int size = this.f66644.size();
        if (i < 0) {
            i += size + 1;
        }
        if (!(i >= 0 && i <= size)) {
            throw new C15832("Insert position out of bounds.");
        }
        m30132(i, (AbstractC13152[]) new ArrayList(list).toArray(new AbstractC13152[0]));
    }

    /* JADX INFO: renamed from: ۗ */
    public final List m47878() {
        List list;
        if (this.f66644.size() == 0) {
            return f66643;
        }
        WeakReference weakReference = this.f66647;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f66644.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC13152 abstractC13152 = (AbstractC13152) this.f66644.get(i);
            if (abstractC13152 instanceof C21199) {
                arrayList.add((C21199) abstractC13152);
            }
        }
        this.f66647 = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12957() {
        return this.f66644.size();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m47901(String str) {
        if (mo27071()) {
            mo27062().m38894(str);
        }
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܺ */
    public String mo5244() {
        return this.f66646.getName();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m47884(String str) {
        if (str.length() == 0) {
            throw new C15832("The 'tagName' parameter must not be empty.");
        }
        this.f66646 = C17864.m40572(str, C23880.m52963(this).m28802());
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final String m47902() {
        return this.f66646.getName();
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final String m47899() {
        return this.f66646.m40577();
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public final C17864 m47882() {
        return this.f66646;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean m47876() {
        return this.f66646.m40580();
    }

    /* JADX INFO: renamed from: ۟ */
    public final String m47883() {
        C17173 c17173 = this.f66645;
        return c17173 != null ? c17173.m38886("id") : "";
    }

    /* JADX INFO: renamed from: ۛ */
    public final int m47880() {
        C21199 c21199 = (C21199) this.f36967;
        if (c21199 == null) {
            return 0;
        }
        List listM47878 = c21199.m47878();
        int size = listM47878.size();
        for (int i = 0; i < size; i++) {
            if (listM47878.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC13152 mo30143() {
        return (C21199) this.f36967;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ᩵ */
    public final C21199 mo30143() {
        return (C21199) this.f36967;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֨ */
    public final AbstractC13152 mo30130() {
        AbstractC13152 abstractC13152 = this;
        while (true) {
            AbstractC13152 abstractC13153 = abstractC13152.f36967;
            if (abstractC13153 == null) {
                return (C21199) abstractC13152;
            }
            abstractC13152 = abstractC13153;
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final C21199 m47900() {
        return (C21199) m47878().get(0);
    }

    /* JADX INFO: renamed from: ۫ */
    public final C4355 m47890() {
        return new C4355(m47878());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m47898(AbstractC13152 abstractC13152) {
        C18515.m42065(this.f36967);
        this.f36967.m30132(this.f36968, abstractC13152);
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public final void m47896() {
        this.f66647 = null;
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final List m47885() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC13152 abstractC13152 : this.f66644) {
            if (abstractC13152 instanceof C12620) {
                arrayList.add((C12620) abstractC13152);
            }
        }
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47895(AbstractC13152 abstractC13152) {
        AbstractC13152 abstractC13153 = abstractC13152.f36967;
        if (abstractC13153 != null) {
            abstractC13153.mo30139(abstractC13152);
        }
        abstractC13152.f36967 = this;
        mo27064();
        this.f66644.add(abstractC13152);
        abstractC13152.f36968 = this.f66644.size() - 1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C21199 m47903(String str) {
        C21199 c21199 = new C21199(C17864.m40572(str, C23880.m52963(this).m28802()), mo27067(), null);
        m47895(c21199);
        return c21199;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC13152 mo12956() {
        this.f66644.clear();
        return this;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m47892() {
        this.f66644.clear();
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final C4355 m47904() {
        AbstractC13152 abstractC13152 = this.f36967;
        if (abstractC13152 == null) {
            return new C4355(0);
        }
        List<C21199> listM47878 = ((C21199) abstractC13152).m47878();
        C4355 c4355 = new C4355(listM47878.size() - 1);
        for (C21199 c21199 : listM47878) {
            if (c21199 != this) {
                c4355.add(c21199);
            }
        }
        return c4355;
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final C21199 m47894() {
        AbstractC13152 abstractC13152 = this.f36967;
        if (abstractC13152 == null) {
            return null;
        }
        List listM47878 = ((C21199) abstractC13152).m47878();
        int size = listM47878.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (listM47878.get(i2) == this) {
                i = i2;
                break;
            }
        }
        if (i > 0) {
            return (C21199) listM47878.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final String m47887() {
        StringBuilder sbM49323 = C21869.m49323();
        C23669.m52682(new C22540(sbM49323), this);
        return C21869.m49321(sbM49323).trim();
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final String m47879() {
        StringBuilder sbM49323 = C21869.m49323();
        C23669.m52682(new C16503(0, sbM49323), this);
        return C21869.m49321(sbM49323);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m47871(StringBuilder sb, AbstractC13152 abstractC13152) {
        if (abstractC13152 instanceof C12620) {
            sb.append(((C12620) abstractC13152).m27070());
        } else if ((abstractC13152 instanceof C21199) && ((C21199) abstractC13152).f66646.m40577().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public final String m47877() {
        StringBuilder sbM49323 = C21869.m49323();
        int size = this.f66644.size();
        for (int i = 0; i < size; i++) {
            m47871(sbM49323, (AbstractC13152) this.f66644.get(i));
        }
        return C21869.m49321(sbM49323);
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final String m47897() {
        StringBuilder sbM49323 = C21869.m49323();
        for (int i = 0; i < this.f66644.size(); i++) {
            AbstractC13152 abstractC13152 = (AbstractC13152) this.f66644.get(i);
            if (abstractC13152 instanceof C12620) {
                C12620 c12620 = (C12620) abstractC13152;
                String strM27070 = c12620.m27070();
                if (m47872(c12620.f36967) || (c12620 instanceof C4434)) {
                    sbM49323.append(strM27070);
                } else {
                    C21869.m49325(strM27070, sbM49323, C12620.m29032(sbM49323));
                }
            } else if ((abstractC13152 instanceof C21199) && ((C21199) abstractC13152).f66646.m40577().equals("br") && !C12620.m29032(sbM49323)) {
                sbM49323.append(" ");
            }
        }
        return C21869.m49321(sbM49323).trim();
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m47872(AbstractC13152 abstractC13152) {
        if (abstractC13152 instanceof C21199) {
            C21199 c21199 = (C21199) abstractC13152;
            int i = 0;
            while (!c21199.f66646.m40576()) {
                c21199 = (C21199) c21199.f36967;
                i++;
                if (i >= 6 || c21199 == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo5245(String str) {
        C18515.m42065((Object) str);
        m47892();
        C3092 c3092M30134 = m30134();
        if (c3092M30134 != null && c3092M30134.m5240().m28799(this.f66646.m40577())) {
            m47895(new C19857(str));
        } else {
            m47895(new C12620(str));
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public final String m47888() {
        StringBuilder sbM49323 = C21869.m49323();
        for (AbstractC13152 abstractC13152 : this.f66644) {
            if (abstractC13152 instanceof C19857) {
                sbM49323.append(((C19857) abstractC13152).m27070());
            } else if (abstractC13152 instanceof C5775) {
                sbM49323.append(((C5775) abstractC13152).m27070());
            } else if (abstractC13152 instanceof C21199) {
                sbM49323.append(((C21199) abstractC13152).m47888());
            } else if (abstractC13152 instanceof C4434) {
                sbM49323.append(((C4434) abstractC13152).m27070());
            }
        }
        return C21869.m49321(sbM49323);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m47881(String str) {
        C17173 c17173 = this.f66645;
        if (c17173 == null) {
            return false;
        }
        String strM38886 = c17173.m38886(Name.LABEL);
        int length = strM38886.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM38886);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM38886.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM38886.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strM38886.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m47893(String str) {
        C18515.m42065((Object) str);
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f66641.split(mo27065(Name.LABEL).trim())));
        linkedHashSet.remove("");
        linkedHashSet.add(str);
        if (linkedHashSet.isEmpty()) {
            mo27062().remove();
        } else {
            mo27062().put(Name.LABEL, C21869.m49322(linkedHashSet, " "));
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public final C3902 m47889() {
        return C3902.m7706(this, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m47875(C2421 c2421) {
        C21199 c21199;
        C21199 c211910;
        if (!c2421.m3374()) {
            return false;
        }
        if (!this.f66646.m40574() && ((c211910 = (C21199) this.f36967) == null || !c211910.f66646.m40574())) {
            return false;
        }
        if (this.f66646.m40578() && ((c21199 = (C21199) this.f36967) == null || c21199.f66646.m40580())) {
            AbstractC13152 abstractC13152 = this.f36967;
            AbstractC13152 abstractC13153 = null;
            if (abstractC13152 != null && this.f36968 > 0) {
                abstractC13153 = (AbstractC13152) abstractC13152.mo27064().get(this.f36968 - 1);
            }
            if (abstractC13153 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public void mo9268(Appendable appendable, int i, C2421 c2421) throws IOException {
        if (m47875(c2421) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            AbstractC13152.m30128(appendable, i, c2421);
        }
        appendable.append('<').append(this.f66646.getName());
        C17173 c17173 = this.f66645;
        if (c17173 != null) {
            c17173.m38887(appendable, c2421);
        }
        if (this.f66644.isEmpty() && this.f66646.m40583()) {
            if (c2421.m3379() == EnumC20528.html && this.f66646.m40582()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ۧ */
    public void mo9269(Appendable appendable, int i, C2421 c2421) throws IOException {
        if (this.f66644.isEmpty() && this.f66646.m40583()) {
            return;
        }
        if (c2421.m3374() && !this.f66644.isEmpty() && this.f66646.m40574()) {
            AbstractC13152.m30128(appendable, i, c2421);
        }
        appendable.append("</").append(this.f66646.getName()).append('>');
    }

    /* JADX INFO: renamed from: ܰ */
    public final String m47891() {
        StringBuilder sbM49323 = C21869.m49323();
        m47874(sbM49323);
        String strM49321 = C21869.m49321(sbM49323);
        C3092 c3092M30134 = m30134();
        if (c3092M30134 == null) {
            c3092M30134 = new C3092("");
        }
        return c3092M30134.m5236().m3374() ? strM49321.trim() : strM49321;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47874(Appendable appendable) {
        int size = this.f66644.size();
        for (int i = 0; i < size; i++) {
            AbstractC13152 abstractC13152 = (AbstractC13152) this.f66644.get(i);
            C3092 c3092M30134 = abstractC13152.m30134();
            if (c3092M30134 == null) {
                c3092M30134 = new C3092("");
            }
            C23669.m52682(new C7787(appendable, c3092M30134.m5236()), abstractC13152);
        }
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C21199 mo55709clone() {
        return (C21199) super.mo55709clone();
    }

    @Override // p067l.AbstractC13152
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13152 mo27061(AbstractC13152 abstractC13152) {
        C21199 c21199 = (C21199) super.mo27061(abstractC13152);
        C17173 c17173 = this.f66645;
        c21199.f66645 = c17173 != null ? c17173.clone() : null;
        C23210 c23210 = new C23210(c21199, this.f66644.size());
        c21199.f66644 = c23210;
        c23210.addAll(this.f66644);
        return c21199;
    }
}
