package p067l;

import bin.p000mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14482 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ActivityC8645 f41358;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14482(ActivityC8645 activityC8645, ActivityC8645 activityC8646) {
        super(activityC8646, -1);
        this.f41358 = activityC8645;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        ActivityC8645.f23211 = m33346();
        String strTrim = ActivityC8645.f23211.toLowerCase().trim();
        if (strTrim.length() > 0) {
            if (strTrim.startsWith("@") || strTrim.startsWith("?")) {
                strTrim = strTrim.substring(1);
            } else if (strTrim.startsWith("0x")) {
                strTrim = strTrim.substring(2);
            }
            if (!C11774.m27005(strTrim)) {
                m33349(R.string.MT_Protector);
                return;
            }
            int iM27008 = C11774.m27008(strTrim);
            int i = (iM27008 >>> 24) & 255;
            int i2 = (iM27008 >>> 16) & 255;
            int i3 = iM27008 & 65535;
            ActivityC8645 activityC8645 = this.f41358;
            for (InterfaceC6434 interfaceC6434 : activityC8645.f23213.f78324.mo23906()) {
                if (interfaceC6434.mo14722() == i) {
                    for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                        if (interfaceC3080.mo5199() == i2) {
                            Iterator it = interfaceC3080.mo5201().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC22528 interfaceC22528 : ((InterfaceC9116) it.next()).mo20696()) {
                                    if (interfaceC22528.mo50213() == i3) {
                                        activityC8645.f23213.f78318.add((C20337) interfaceC22528);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            activityC8645.setTitle(ActivityC8645.f23211);
            activityC8645.m20059(EnumC6633.SEARCH_BY_ID);
            m33348();
        }
    }
}
