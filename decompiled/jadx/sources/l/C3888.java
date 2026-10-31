package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3888 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18705 f12437;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f12438;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f12439;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f12440;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f12441 = new IdentityHashMap();

    public C3888(C18705 c18705, LinkedHashMap linkedHashMap, AbstractC15440 abstractC15440) {
        this.f12437 = c18705;
        this.f12438 = linkedHashMap;
        this.f12440 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f12437.f59141, R.string.MT_Protector);
        for (C12392 c12392 : this.f12438.values()) {
            this.f12441.put(c12392, Boolean.valueOf(c12392.m30441()));
            c12392.m30407(true);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        AbstractC15440 abstractC15440 = this.f12440;
        LinkedHashMap linkedHashMap = this.f12438;
        ActivityC17169 activityC17169 = this.f12437.f59141;
        activityC17169.f52608.m29734();
        if (activityC17169.f52606 != null) {
            activityC17169.f52606.m30051();
        }
        Exception exc = null;
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C12392) it.next()).m30447().m10930();
            }
            C22477.m50426(C6646.of(activityC17169.f52620.m27339(), new String[0])).m10930();
            if (!activityC17169.f52620.m27340().mo23551(abstractC15440)) {
                throw new C19401("Move project directory failed.");
            }
            activityC17169.f52620.m27331(abstractC15440);
            this.f12439 = true;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC14346) entry.getKey()).mo17427() == entry.getValue()) {
                        ((C12392) entry.getValue()).m30336(((AbstractC14346) entry.getKey()).m34236(activityC17169.m40356()).m27340());
                    }
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    } else {
                        exc.addSuppressed(e);
                    }
                }
            }
            if (activityC17169.f52606 != null) {
                activityC17169.f52606.m30061();
            }
            if (exc != null) {
                throw exc;
            }
        } catch (Exception e2) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC14346) entry2.getKey()).mo17427() == entry2.getValue()) {
                        ((C12392) entry2.getValue()).m30336(((AbstractC14346) entry2.getKey()).m34236(activityC17169.m40356()).m27340());
                    }
                } catch (Exception e3) {
                    e2.addSuppressed(e3);
                }
            }
            if (activityC17169.f52606 != null) {
                activityC17169.f52606.m30061();
            }
            exc = e2;
        } catch (Throwable th) {
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC14346) entry3.getKey()).mo17427() == entry3.getValue()) {
                        ((C12392) entry3.getValue()).m30336(((AbstractC14346) entry3.getKey()).m34236(activityC17169.m40356()).m27340());
                    }
                } catch (Exception e4) {
                    if (exc == null) {
                        exc = e4;
                    } else {
                        exc.addSuppressed(e4);
                    }
                }
            }
            if (activityC17169.f52606 != null) {
                activityC17169.f52606.m30061();
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C18705 c18705 = this.f12437;
        c18705.m31262();
        ActivityC17169 activityC17169 = c18705.f59141;
        DialogInterfaceOnClickListenerC10816.m27035(activityC17169, "save_as_project1", activityC17169.getString(R.string.MT_Protector), true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f12437.f59141.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC17169 activityC17169 = this.f12437.f59141;
        if (this.f12439) {
            activityC17169.f52619 = null;
            activityC17169.f52607.m11403().mo1664((Object) activityC17169.f52620.getName());
            activityC17169.f52607.m11418().mo1669(Boolean.FALSE);
        }
        for (Map.Entry entry : this.f12438.entrySet()) {
            if (((AbstractC14346) entry.getKey()).getView() != null) {
                ((C12392) entry.getValue()).m30407(((Boolean) this.f12441.get(entry.getValue())).booleanValue());
            }
        }
        m20273();
    }
}
