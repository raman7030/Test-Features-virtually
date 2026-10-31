package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12745 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f38318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12745(ActivityC6604 activityC6604, ActivityC6604 activityC6605) {
        super(activityC6605, -1);
        this.f38318 = activityC6604;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        ActivityC6604.f20334 = m31260();
        String strTrim = ActivityC6604.f20334.toLowerCase().trim();
        if (strTrim.length() > 0) {
            if (strTrim.startsWith("@") || strTrim.startsWith("?")) {
                strTrim = strTrim.substring(1);
            } else if (strTrim.startsWith("0x")) {
                strTrim = strTrim.substring(2);
            }
            if (!C9896.m24990(strTrim)) {
                m31263(R.string.MT_Protector);
                return;
            }
            int iM24993 = C9896.m24993(strTrim);
            int i = (iM24993 >>> 24) & 255;
            int i2 = (iM24993 >>> 16) & 255;
            int i3 = iM24993 & 65535;
            ActivityC6604 activityC6604 = this.f38318;
            for (InterfaceC4277 interfaceC4277 : activityC6604.f20336.f75578.mo21936()) {
                if (interfaceC4277.mo12858() == i) {
                    for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                        if (interfaceC0748.mo2870() == i2) {
                            Iterator it = interfaceC0748.mo2872().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC21211 interfaceC21211 : ((InterfaceC7099) it.next()).mo18746()) {
                                    if (interfaceC21211.mo47883() == i3) {
                                        activityC6604.f20336.f75572.add((C18906) interfaceC21211);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            activityC6604.setTitle(ActivityC6604.f20334);
            activityC6604.m18107(EnumC4487.SEARCH_BY_ID);
            m31262();
        }
    }
}
