package p067l;

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
public class C13036 extends AbstractC16387 {

    /* JADX INFO: renamed from: ᩷ */
    public static final Logger f36661 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f36662;

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8863() {
        return true;
    }

    public C13036(C11695 c11695, Element element, String str) {
        super(c11695, element, str);
        this.f36662 = new ArrayList();
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public C13036 mo8855() {
        C13036 c13036 = new C13036(this.f48152, this.f48148, this.f48151);
        c13036.m29851(this);
        return c13036;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo29852(AbstractC16387 abstractC16387) {
        this.f36662.add(abstractC16387);
        abstractC16387.m37200(this.f48150);
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8857(String str) {
        Level level = Level.FINE;
        StringBuilder sbM21133 = C9179.m21133(str, "group: ");
        sbM21133.append(this.f48151);
        f36661.log(level, sbM21133.toString());
        Iterator it = this.f36662.iterator();
        while (it.hasNext()) {
            ((AbstractC16387) it.next()).mo8857(C17588.m40053(str, EnumC2483.f3919));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13036 m29853(AbstractC16387 abstractC16387) {
        C13036 c13036M29853;
        for (AbstractC16387 abstractC16388 : this.f36662) {
            if (abstractC16388 == abstractC16387) {
                return this;
            }
            if (abstractC16388.mo8863() && (c13036M29853 = ((C13036) abstractC16388).m29853(abstractC16387)) != null) {
                return c13036M29853;
            }
        }
        return null;
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public void mo8862(C2976 c2976) {
        Iterator it = this.f36662.iterator();
        while (it.hasNext()) {
            ((AbstractC16387) it.next()).mo8862(c2976);
        }
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public void mo8859(C2976 c2976) {
        for (AbstractC16387 abstractC16387 : this.f36662) {
            C2976 c2977 = this.f48153;
            c2977.m4956(c2976);
            c2977.m4946(this.f48149);
            abstractC16387.mo8859(c2977);
        }
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ܽ */
    public void mo29855() {
        Iterator it = this.f36662.iterator();
        while (it.hasNext()) {
            ((AbstractC16387) it.next()).mo29855();
        }
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public void mo8856(OutputStreamWriter outputStreamWriter, String str) {
        Iterator it = this.f36662.iterator();
        while (it.hasNext()) {
            ((AbstractC16387) it.next()).mo8856(outputStreamWriter, str);
        }
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final EnumC19070 mo29850(C4444 c4444) {
        EnumC19070 enumC19070M31354 = C13766.m31354((EnumMap) c4444.f9971, this);
        if (enumC19070M31354 == EnumC19070.CONTINUE) {
            Iterator it = this.f36662.iterator();
            while (it.hasNext()) {
                EnumC19070 enumC19070Mo29850 = ((AbstractC16387) it.next()).mo29850(c4444);
                EnumC19070 enumC19070 = EnumC19070.ABORT;
                if (enumC19070Mo29850 == enumC19070) {
                    return enumC19070;
                }
            }
        }
        return enumC19070M31354 == EnumC19070.SKIP_CHILDREN ? EnumC19070.CONTINUE : enumC19070M31354;
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final void mo29854(String str, String str2) {
        super.mo29854(str, str2);
        for (AbstractC16387 abstractC16387 : this.f36662) {
            if (!abstractC16387.f48150.containsKey(str)) {
                abstractC16387.mo29854(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29851(C13036 c13036) {
        m37200(c13036.f48150);
        this.f48149 = (C2976) c13036.f48149.clone();
        Iterator it = c13036.f36662.iterator();
        while (it.hasNext()) {
            mo29852(((AbstractC16387) it.next()).mo8855());
        }
    }
}
