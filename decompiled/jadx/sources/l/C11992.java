package l;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.ۨ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11992 extends C11224 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35900;

    public C11992(C9813 c9813, Element element, String str) {
        super(c9813, element, str);
        this.f35900 = new ArrayList();
    }

    @Override // l.C11224, l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final C11992 mo6729() {
        C11992 c11992 = new C11992(this.f45039, this.f45035, this.f45038);
        c11992.m27789((C11224) this);
        Iterator it = this.f35900.iterator();
        while (it.hasNext()) {
            c11992.m29300((AbstractC14750) it.next());
        }
        return c11992;
    }

    @Override // l.C11224
    /* JADX INFO: renamed from: ֫ */
    public final void mo27790(AbstractC14750 abstractC14750) {
        this.f33663.add(abstractC14750);
        abstractC14750.m35053(this.f45037);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29300(AbstractC14750 abstractC14750) {
        this.f35900.add(abstractC14750);
        abstractC14750.m35053(this.f45037);
    }

    @Override // l.C11224, l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final void mo6733(C0639 c0639) {
        C0639 c06310;
        Iterator it = this.f33663.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c06310 = this.f45040;
            if (!zHasNext) {
                break;
            }
            AbstractC14750 abstractC14750 = (AbstractC14750) it.next();
            c06310.m2616(c0639);
            c06310.m2606(this.f45036);
            abstractC14750.mo6733(c06310);
        }
        c06310.m2616(c0639);
        Iterator it2 = this.f35900.iterator();
        while (it2.hasNext()) {
            ((AbstractC14750) it2.next()).mo6733(c06310);
        }
        c06310.m2606(this.f45036);
        if (!this.f45037.containsKey("stroke-width") || (c06310.m2614() & 6) == 0) {
            return;
        }
        m35055("Scaling of the stroke width is ignored");
    }

    @Override // l.C11224, l.AbstractC14750
    /* JADX INFO: renamed from: ܽ */
    public final void mo27793() {
        String strM35052;
        super.mo27793();
        if (this.f45035.getTagName().equals("mask")) {
            String str = (String) this.f45037.get("fill");
            if (str == null || (strM35052 = m35052(str, "#000")) == null || C18985.m43818(strM35052) != -1) {
                m35054("Semitransparent mask cannot be represented by a vector drawable");
            }
        }
    }

    @Override // l.C11224, l.AbstractC14750
    /* JADX INFO: renamed from: ۧ */
    public final void mo6736(C0639 c0639) {
        Iterator it = C8882.m22948(this.f33663, this.f35900).iterator();
        while (it.hasNext()) {
            ((AbstractC14750) it.next()).mo6736(c0639);
        }
    }

    @Override // l.C11224, l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final void mo6730(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        outputStreamWriter.write(str);
        outputStreamWriter.write("<group>");
        outputStreamWriter.write("\n");
        String str2 = str + EnumC0121.f1143;
        EnumMap enumMap = new EnumMap(EnumC18279.class);
        C2184 c2184 = new C2184(7, enumMap);
        Iterator it = this.f33663.iterator();
        while (it.hasNext()) {
            ((AbstractC14750) it.next()).mo27788(c2184);
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            EnumC18279 enumC18279 = (EnumC18279) entry.getKey();
            List list = (List) entry.getValue();
            outputStreamWriter.write(str2);
            outputStreamWriter.write(60);
            outputStreamWriter.write("clip-path");
            outputStreamWriter.write("\n");
            outputStreamWriter.write(str2);
            outputStreamWriter.write(EnumC0121.f1143);
            outputStreamWriter.write(EnumC0121.f1143);
            outputStreamWriter.write("android:pathData=\"");
            for (int i = 0; i < list.size(); i++) {
                String str3 = (String) list.get(i);
                if (i > 0 && !str3.startsWith("M")) {
                    outputStreamWriter.write("M 0,0");
                }
                outputStreamWriter.write(str3);
            }
            outputStreamWriter.write(34);
            if (enumC18279 == EnumC18279.EVEN_ODD) {
                outputStreamWriter.write("\n");
                outputStreamWriter.write(str2);
                outputStreamWriter.write(EnumC0121.f1143);
                outputStreamWriter.write(EnumC0121.f1143);
                outputStreamWriter.write("android:fillType=\"evenOdd\"");
            }
            outputStreamWriter.write("/>");
            outputStreamWriter.write("\n");
        }
        Iterator it2 = this.f35900.iterator();
        while (it2.hasNext()) {
            ((AbstractC14750) it2.next()).mo6730(outputStreamWriter, str2);
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</group>");
        outputStreamWriter.write("\n");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC17573 m29299(EnumMap enumMap, AbstractC14750 abstractC14750) {
        String strM39643;
        EnumC18279 enumC18279;
        if ((abstractC14750 instanceof C16867) && (strM39643 = ((C16867) abstractC14750).m39643()) != null && !strM39643.isEmpty()) {
            if ("evenOdd".equals(abstractC14750.f45037.get("clip-rule"))) {
                enumC18279 = EnumC18279.EVEN_ODD;
            } else {
                enumC18279 = EnumC18279.NON_ZERO;
            }
            ((List) C13843.computeIfAbsent(enumMap, enumC18279, new C23147(2))).add(strM39643);
        }
        return EnumC17573.CONTINUE;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29301() {
        Iterator it = this.f35900.iterator();
        while (it.hasNext()) {
            this.f45036.m2606(((AbstractC14750) it.next()).f45036);
        }
    }
}
