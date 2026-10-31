package l;

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
public class C19814 extends AbstractC11347 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f64007;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15578 f64008;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C16305 f64009;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public WeakReference f64010;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final List f64006 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f64004 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f64005 = C15578.m36720("baseUri");

    public C19814(C16305 c16305, String str, C15578 c15578) {
        C16990.m39822(c16305);
        this.f64007 = AbstractC11347.f33968;
        this.f64008 = c15578;
        this.f64009 = c16305;
        if (str != null) {
            m28098(str);
        }
    }

    public C19814(String str) {
        this(C16305.m38357(str, C1489.f5329), "", null);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2090 m45575(String str) {
        C16990.m39823(str);
        AbstractC21162 abstractC21162M38169 = C16221.m38169(str);
        C16990.m39822(abstractC21162M38169);
        return C11779.m28821(abstractC21162M38169, this);
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۜ */
    public final List mo25047() {
        if (this.f64007 == AbstractC11347.f33968) {
            this.f64007 = new C21930(this, 4);
        }
        return this.f64007;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo25054() {
        return this.f64008 != null;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public final C15578 mo25045() {
        if (this.f64008 == null) {
            this.f64008 = new C15578();
        }
        return this.f64008;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܽ */
    public final String mo25050() {
        for (C19814 c19814 = this; c19814 != null; c19814 = (C19814) c19814.f33969) {
            C15578 c15578 = c19814.f64008;
            if (c15578 != null) {
                String str = f64005;
                if (c15578.m36735(str)) {
                    return c19814.f64008.get(str);
                }
            }
        }
        return "";
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܽ */
    public final void mo25051(String str) {
        mo25045().put(f64005, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45562(int i, List list) {
        if (list == null) {
            throw new C14167("Children collection to be inserted must not be null.");
        }
        int size = this.f64007.size();
        if (i < 0) {
            i += size + 1;
        }
        if (!(i >= 0 && i <= size)) {
            throw new C14167("Insert position out of bounds.");
        }
        m28088(i, (AbstractC11347[]) new ArrayList(list).toArray(new AbstractC11347[0]));
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List m45567() {
        List list;
        if (this.f64007.size() == 0) {
            return f64006;
        }
        WeakReference weakReference = this.f64010;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.f64007.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC11347 abstractC11347 = (AbstractC11347) this.f64007.get(i);
            if (abstractC11347 instanceof C19814) {
                arrayList.add((C19814) abstractC11347);
            }
        }
        this.f64010 = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10981() {
        return this.f64007.size();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45590(String str) {
        if (mo25054()) {
            mo25045().m36733(str);
        }
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܺ */
    public String mo2915() {
        return this.f64009.getName();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m45573(String str) {
        if (str.length() == 0) {
            throw new C14167("The 'tagName' parameter must not be empty.");
        }
        this.f64009 = C16305.m38357(str, C22635.m50637(this).m26763());
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final String m45591() {
        return this.f64009.getName();
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final String m45588() {
        return this.f64009.m38362();
    }

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C16305 m45571() {
        return this.f64009;
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean m45565() {
        return this.f64009.m38365();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String m45572() {
        C15578 c15578 = this.f64008;
        return c15578 != null ? c15578.m36725("id") : "";
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int m45569() {
        C19814 c19814 = (C19814) this.f33969;
        if (c19814 == null) {
            return 0;
        }
        List listM45567 = c19814.m45567();
        int size = listM45567.size();
        for (int i = 0; i < size; i++) {
            if (listM45567.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩵ */
    public final AbstractC11347 mo28099() {
        return (C19814) this.f33969;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ᩵ */
    public final C19814 mo28099() {
        return (C19814) this.f33969;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֨ */
    public final AbstractC11347 mo28086() {
        AbstractC11347 abstractC11347 = this;
        while (true) {
            AbstractC11347 abstractC11348 = abstractC11347.f33969;
            if (abstractC11348 == null) {
                return (C19814) abstractC11347;
            }
            abstractC11347 = abstractC11348;
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19814 m45589() {
        return (C19814) m45567().get(0);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2090 m45579() {
        return new C2090(m45567());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45587(AbstractC11347 abstractC11347) {
        C16990.m39822(this.f33969);
        this.f33969.m28088(this.f33970, abstractC11347);
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final void m45585() {
        this.f64010 = null;
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final List m45574() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC11347 abstractC11347 : this.f64007) {
            if (abstractC11347 instanceof C10787) {
                arrayList.add((C10787) abstractC11347);
            }
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45584(AbstractC11347 abstractC11347) {
        AbstractC11347 abstractC11348 = abstractC11347.f33969;
        if (abstractC11348 != null) {
            abstractC11348.mo28095(abstractC11347);
        }
        abstractC11347.f33969 = this;
        mo25047();
        this.f64007.add(abstractC11347);
        abstractC11347.f33970 = this.f64007.size() - 1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19814 m45592(String str) {
        C19814 c19814 = new C19814(C16305.m38357(str, C22635.m50637(this).m26763()), mo25050(), null);
        m45584(c19814);
        return c19814;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC11347 mo10980() {
        this.f64007.clear();
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m45581() {
        this.f64007.clear();
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C2090 m45593() {
        AbstractC11347 abstractC11347 = this.f33969;
        if (abstractC11347 == null) {
            return new C2090(0);
        }
        List<C19814> listM45567 = ((C19814) abstractC11347).m45567();
        C2090 c2090 = new C2090(listM45567.size() - 1);
        for (C19814 c19814 : listM45567) {
            if (c19814 != this) {
                c2090.add(c19814);
            }
        }
        return c2090;
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C19814 m45583() {
        AbstractC11347 abstractC11347 = this.f33969;
        if (abstractC11347 == null) {
            return null;
        }
        List listM45567 = ((C19814) abstractC11347).m45567();
        int size = listM45567.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (listM45567.get(i2) == this) {
                i = i2;
                break;
            }
        }
        if (i > 0) {
            return (C19814) listM45567.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final String m45576() {
        StringBuilder sbM47000 = C20519.m47000();
        C22412.m50342(new C21225(sbM47000), this);
        return C20519.m46998(sbM47000).trim();
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final String m45568() {
        StringBuilder sbM47000 = C20519.m47000();
        C22412.m50342(new C14873(0, sbM47000), this);
        return C20519.m46998(sbM47000);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45560(StringBuilder sb, AbstractC11347 abstractC11347) {
        if (abstractC11347 instanceof C10787) {
            sb.append(((C10787) abstractC11347).m25053());
        } else if ((abstractC11347 instanceof C19814) && ((C19814) abstractC11347).f64009.m38362().equals("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final String m45566() {
        StringBuilder sbM47000 = C20519.m47000();
        int size = this.f64007.size();
        for (int i = 0; i < size; i++) {
            m45560(sbM47000, (AbstractC11347) this.f64007.get(i));
        }
        return C20519.m46998(sbM47000);
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final String m45586() {
        StringBuilder sbM47000 = C20519.m47000();
        for (int i = 0; i < this.f64007.size(); i++) {
            AbstractC11347 abstractC11347 = (AbstractC11347) this.f64007.get(i);
            if (abstractC11347 instanceof C10787) {
                C10787 c10787 = (C10787) abstractC11347;
                String strM25053 = c10787.m25053();
                if (m45561(c10787.f33969) || (c10787 instanceof C2174)) {
                    sbM47000.append(strM25053);
                } else {
                    C20519.m47002(strM25053, sbM47000, C10787.m26987(sbM47000));
                }
            } else if ((abstractC11347 instanceof C19814) && ((C19814) abstractC11347).f64009.m38362().equals("br") && !C10787.m26987(sbM47000)) {
                sbM47000.append(" ");
            }
        }
        return C20519.m46998(sbM47000).trim();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m45561(AbstractC11347 abstractC11347) {
        if (abstractC11347 instanceof C19814) {
            C19814 c19814 = (C19814) abstractC11347;
            int i = 0;
            while (!c19814.f64009.m38361()) {
                c19814 = (C19814) c19814.f33969;
                i++;
                if (i >= 6 || c19814 == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܺ */
    public void mo2916(String str) {
        C16990.m39822((Object) str);
        m45581();
        C0762 c0762M28090 = m28090();
        if (c0762M28090 != null && c0762M28090.m2911().m26760(this.f64009.m38362())) {
            m45584(new C18402(str));
        } else {
            m45584(new C10787(str));
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m45577() {
        StringBuilder sbM47000 = C20519.m47000();
        for (AbstractC11347 abstractC11347 : this.f64007) {
            if (abstractC11347 instanceof C18402) {
                sbM47000.append(((C18402) abstractC11347).m25053());
            } else if (abstractC11347 instanceof C3585) {
                sbM47000.append(((C3585) abstractC11347).m25053());
            } else if (abstractC11347 instanceof C19814) {
                sbM47000.append(((C19814) abstractC11347).m45577());
            } else if (abstractC11347 instanceof C2174) {
                sbM47000.append(((C2174) abstractC11347).m25053());
            }
        }
        return C20519.m46998(sbM47000);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m45570(String str) {
        C15578 c15578 = this.f64008;
        if (c15578 == null) {
            return false;
        }
        String strM36725 = c15578.m36725(Name.LABEL);
        int length = strM36725.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM36725);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM36725.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM36725.regionMatches(true, i, str, 0, length2)) {
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
                return strM36725.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m45582(String str) {
        C16990.m39822((Object) str);
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f64004.split(mo25048(Name.LABEL).trim())));
        linkedHashSet.remove("");
        linkedHashSet.add(str);
        if (linkedHashSet.isEmpty()) {
            mo25045().remove();
        } else {
            mo25045().put(Name.LABEL, C20519.m46999(linkedHashSet, " "));
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1614 m45578() {
        return C1614.m5476(this, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45564(C0056 c0056) {
        C19814 c19814;
        C19814 c19815;
        if (!c0056.m979()) {
            return false;
        }
        if (!this.f64009.m38359() && ((c19815 = (C19814) this.f33969) == null || !c19815.f64009.m38359())) {
            return false;
        }
        if (this.f64009.m38363() && ((c19814 = (C19814) this.f33969) == null || c19814.f64009.m38365())) {
            AbstractC11347 abstractC11347 = this.f33969;
            AbstractC11347 abstractC11348 = null;
            if (abstractC11347 != null && this.f33970 > 0) {
                abstractC11348 = (AbstractC11347) abstractC11347.mo25047().get(this.f33970 - 1);
            }
            if (abstractC11348 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public void mo7189(Appendable appendable, int i, C0056 c0056) throws IOException {
        if (m45564(c0056) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            AbstractC11347.m28084(appendable, i, c0056);
        }
        appendable.append('<').append(this.f64009.getName());
        C15578 c15578 = this.f64008;
        if (c15578 != null) {
            c15578.m36726(appendable, c0056);
        }
        if (this.f64007.isEmpty() && this.f64009.m38368()) {
            if (c0056.m984() == EnumC19108.html && this.f64009.m38367()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ۧ */
    public void mo7190(Appendable appendable, int i, C0056 c0056) throws IOException {
        if (this.f64007.isEmpty() && this.f64009.m38368()) {
            return;
        }
        if (c0056.m979() && !this.f64007.isEmpty() && this.f64009.m38359()) {
            AbstractC11347.m28084(appendable, i, c0056);
        }
        appendable.append("</").append(this.f64009.getName()).append('>');
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m45580() {
        StringBuilder sbM47000 = C20519.m47000();
        m45563(sbM47000);
        String strM46998 = C20519.m46998(sbM47000);
        C0762 c0762M28090 = m28090();
        if (c0762M28090 == null) {
            c0762M28090 = new C0762("");
        }
        return c0762M28090.m2907().m979() ? strM46998.trim() : strM46998;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45563(Appendable appendable) {
        int size = this.f64007.size();
        for (int i = 0; i < size; i++) {
            AbstractC11347 abstractC11347 = (AbstractC11347) this.f64007.get(i);
            C0762 c0762M28090 = abstractC11347.m28090();
            if (c0762M28090 == null) {
                c0762M28090 = new C0762("");
            }
            C22412.m50342(new C5702(appendable, c0762M28090.m2907()), abstractC11347);
        }
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C19814 mo2918clone() {
        return (C19814) super.mo2918clone();
    }

    @Override // l.AbstractC11347
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11347 mo25044(AbstractC11347 abstractC11347) {
        C19814 c19814 = (C19814) super.mo25044(abstractC11347);
        C15578 c15578 = this.f64008;
        c19814.f64008 = c15578 != null ? c15578.clone() : null;
        C21930 c21930 = new C21930(c19814, this.f64007.size());
        c19814.f64007 = c21930;
        c21930.addAll(this.f64007);
        return c19814;
    }
}
