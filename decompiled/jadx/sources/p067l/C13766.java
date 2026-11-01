package p067l;

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
public final class C13766 extends C13036 {

    /* JADX INFO: renamed from: ۢ */
    public final ArrayList f38910;

    public C13766(C11695 c11695, Element element, String str) {
        super(c11695, element, str);
        this.f38910 = new ArrayList();
    }

    @Override // p067l.C13036, p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final C13766 mo8855() {
        C13766 c13766 = new C13766(this.f48152, this.f48148, this.f48151);
        c13766.m29851((C13036) this);
        Iterator it = this.f38910.iterator();
        while (it.hasNext()) {
            c13766.m31355((AbstractC16387) it.next());
        }
        return c13766;
    }

    @Override // p067l.C13036
    /* JADX INFO: renamed from: ֫ */
    public final void mo29852(AbstractC16387 abstractC16387) {
        this.f36662.add(abstractC16387);
        abstractC16387.m37200(this.f48150);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31355(AbstractC16387 abstractC16387) {
        this.f38910.add(abstractC16387);
        abstractC16387.m37200(this.f48150);
    }

    @Override // p067l.C13036, p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8859(C2976 c2976) {
        C2976 c2977;
        Iterator it = this.f36662.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2977 = this.f48153;
            if (!zHasNext) {
                break;
            }
            AbstractC16387 abstractC16387 = (AbstractC16387) it.next();
            c2977.m4956(c2976);
            c2977.m4946(this.f48149);
            abstractC16387.mo8859(c2977);
        }
        c2977.m4956(c2976);
        Iterator it2 = this.f38910.iterator();
        while (it2.hasNext()) {
            ((AbstractC16387) it2.next()).mo8859(c2977);
        }
        c2977.m4946(this.f48149);
        if (!this.f48150.containsKey("stroke-width") || (c2977.m4954() & 6) == 0) {
            return;
        }
        m37202("Scaling of the stroke width is ignored");
    }

    @Override // p067l.C13036, p067l.AbstractC16387
    /* JADX INFO: renamed from: ܽ */
    public final void mo29855() {
        String strM37199;
        super.mo29855();
        if (this.f48148.getTagName().equals("mask")) {
            String str = (String) this.f48150.get("fill");
            if (str == null || (strM37199 = m37199(str, "#000")) == null || C20412.m46086(strM37199) != -1) {
                m37201("Semitransparent mask cannot be represented by a vector drawable");
            }
        }
    }

    @Override // p067l.C13036, p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final void mo8862(C2976 c2976) {
        Iterator it = C10810.m24919(this.f36662, this.f38910).iterator();
        while (it.hasNext()) {
            ((AbstractC16387) it.next()).mo8862(c2976);
        }
    }

    @Override // p067l.C13036, p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8856(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        outputStreamWriter.write(str);
        outputStreamWriter.write("<group>");
        outputStreamWriter.write("\n");
        String str2 = str + EnumC2483.f3919;
        EnumMap enumMap = new EnumMap(EnumC19741.class);
        C4444 c4444 = new C4444(7, enumMap);
        Iterator it = this.f36662.iterator();
        while (it.hasNext()) {
            ((AbstractC16387) it.next()).mo29850(c4444);
        }
        for (Map.Entry entry : enumMap.entrySet()) {
            EnumC19741 enumC19741 = (EnumC19741) entry.getKey();
            List list = (List) entry.getValue();
            outputStreamWriter.write(str2);
            outputStreamWriter.write(60);
            outputStreamWriter.write("clip-path");
            outputStreamWriter.write("\n");
            outputStreamWriter.write(str2);
            outputStreamWriter.write(EnumC2483.f3919);
            outputStreamWriter.write(EnumC2483.f3919);
            outputStreamWriter.write("android:pathData=\"");
            for (int i = 0; i < list.size(); i++) {
                String str3 = (String) list.get(i);
                if (i > 0 && !str3.startsWith("M")) {
                    outputStreamWriter.write("M 0,0");
                }
                outputStreamWriter.write(str3);
            }
            outputStreamWriter.write(34);
            if (enumC19741 == EnumC19741.EVEN_ODD) {
                outputStreamWriter.write("\n");
                outputStreamWriter.write(str2);
                outputStreamWriter.write(EnumC2483.f3919);
                outputStreamWriter.write(EnumC2483.f3919);
                outputStreamWriter.write("android:fillType=\"evenOdd\"");
            }
            outputStreamWriter.write("/>");
            outputStreamWriter.write("\n");
        }
        Iterator it2 = this.f38910.iterator();
        while (it2.hasNext()) {
            ((AbstractC16387) it2.next()).mo8856(outputStreamWriter, str2);
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</group>");
        outputStreamWriter.write("\n");
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC19070 m31354(EnumMap enumMap, AbstractC16387 abstractC16387) {
        String strM41879;
        EnumC19741 enumC19741;
        if ((abstractC16387 instanceof C18399) && (strM41879 = ((C18399) abstractC16387).m41879()) != null && !strM41879.isEmpty()) {
            if ("evenOdd".equals(abstractC16387.f48150.get("clip-rule"))) {
                enumC19741 = EnumC19741.EVEN_ODD;
            } else {
                enumC19741 = EnumC19741.NON_ZERO;
            }
            ((List) C15525.computeIfAbsent(enumMap, enumC19741, new C24367(2))).add(strM41879);
        }
        return EnumC19070.CONTINUE;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m31356() {
        Iterator it = this.f38910.iterator();
        while (it.hasNext()) {
            this.f48149.m4946(((AbstractC16387) it.next()).f48149);
        }
    }
}
