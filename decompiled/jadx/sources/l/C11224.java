package l;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ۧ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BJC */
/* JADX INFO: loaded from: classes4.dex */
public class C11224 extends AbstractC14750 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Logger f33662 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f33663;

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6737() {
        return true;
    }

    public C11224(C9813 c9813, Element element, String str) {
        super(c9813, element, str);
        this.f33663 = new ArrayList();
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public C11224 mo6729() {
        C11224 c11224 = new C11224(this.f45039, this.f45035, this.f45038);
        c11224.m27789(this);
        return c11224;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo27790(AbstractC14750 abstractC14750) {
        this.f33663.add(abstractC14750);
        abstractC14750.m35053(this.f45037);
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final void mo6731(String str) {
        Level level = Level.FINE;
        StringBuilder sbM19190 = C7166.m19190(str, "group: ");
        sbM19190.append(this.f45038);
        f33662.log(level, sbM19190.toString());
        Iterator it = this.f33663.iterator();
        while (it.hasNext()) {
            ((AbstractC14750) it.next()).mo6731(C16014.m37867(str, EnumC0121.f1143));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11224 m27791(AbstractC14750 abstractC14750) {
        C11224 c11224M27791;
        for (AbstractC14750 abstractC14751 : this.f33663) {
            if (abstractC14751 == abstractC14750) {
                return this;
            }
            if (abstractC14751.mo6737() && (c11224M27791 = ((C11224) abstractC14751).m27791(abstractC14750)) != null) {
                return c11224M27791;
            }
        }
        return null;
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ */
    public void mo6736(C0639 c0639) {
        Iterator it = this.f33663.iterator();
        while (it.hasNext()) {
            ((AbstractC14750) it.next()).mo6736(c0639);
        }
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public void mo6733(C0639 c0639) {
        for (AbstractC14750 abstractC14750 : this.f33663) {
            C0639 c06310 = this.f45040;
            c06310.m2616(c0639);
            c06310.m2606(this.f45036);
            abstractC14750.mo6733(c06310);
        }
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo27793() {
        Iterator it = this.f33663.iterator();
        while (it.hasNext()) {
            ((AbstractC14750) it.next()).mo27793();
        }
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public void mo6730(OutputStreamWriter outputStreamWriter, String str) {
        Iterator it = this.f33663.iterator();
        while (it.hasNext()) {
            ((AbstractC14750) it.next()).mo6730(outputStreamWriter, str);
        }
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC17573 mo27788(C2184 c2184) {
        EnumC17573 enumC17573M29299 = C11992.m29299((EnumMap) c2184.f7186, this);
        if (enumC17573M29299 == EnumC17573.CONTINUE) {
            Iterator it = this.f33663.iterator();
            while (it.hasNext()) {
                EnumC17573 enumC17573Mo27788 = ((AbstractC14750) it.next()).mo27788(c2184);
                EnumC17573 enumC17573 = EnumC17573.ABORT;
                if (enumC17573Mo27788 == enumC17573) {
                    return enumC17573;
                }
            }
        }
        return enumC17573M29299 == EnumC17573.SKIP_CHILDREN ? EnumC17573.CONTINUE : enumC17573M29299;
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo27792(String str, String str2) {
        super.mo27792(str, str2);
        for (AbstractC14750 abstractC14750 : this.f33663) {
            if (!abstractC14750.f45037.containsKey(str)) {
                abstractC14750.mo27792(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27789(C11224 c11224) {
        m35053(c11224.f45037);
        this.f45036 = (C0639) c11224.f45036.clone();
        Iterator it = c11224.f33663.iterator();
        while (it.hasNext()) {
            mo27790(((AbstractC14750) it.next()).mo6729());
        }
    }
}
