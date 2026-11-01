package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6064 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C20146 f15245;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ LinkedHashMap f15246;

    /* JADX INFO: renamed from: ܳ */
    public boolean f15247;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC17043 f15248;

    /* JADX INFO: renamed from: ᩻ */
    public final IdentityHashMap f15249 = new IdentityHashMap();

    public C6064(C20146 c20146, LinkedHashMap linkedHashMap, AbstractC17043 abstractC17043) {
        this.f15245 = c20146;
        this.f15246 = linkedHashMap;
        this.f15248 = abstractC17043;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f15245.f62365, R.string.MT_Protector);
        for (C14146 c14146 : this.f15246.values()) {
            this.f15249.put(c14146, Boolean.valueOf(c14146.m32505()));
            c14146.m32471(true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        AbstractC17043 abstractC17043 = this.f15248;
        LinkedHashMap linkedHashMap = this.f15246;
        ActivityC18686 activityC18686 = this.f15245.f62365;
        activityC18686.f55789.m31796();
        if (activityC18686.f55787 != null) {
            activityC18686.f55787.m32112();
        }
        Exception exc = null;
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C14146) it.next()).m32511().m12907();
            }
            C23731.m52767(C8685.m20115of(activityC18686.f55801.m29401(), new String[0])).m12907();
            if (!activityC18686.f55801.m29402().mo25502(abstractC17043)) {
                throw new C20807("Move project directory failed.");
            }
            activityC18686.f55801.m29393(abstractC17043);
            this.f15247 = true;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC16003) entry.getKey()).mo19367() == entry.getValue()) {
                        ((C14146) entry.getValue()).m32400(((AbstractC16003) entry.getKey()).m36369(activityC18686.m42601()).m29402());
                    }
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    } else {
                        exc.addSuppressed(e);
                    }
                }
            }
            if (activityC18686.f55787 != null) {
                activityC18686.f55787.m32122();
            }
            if (exc != null) {
                throw exc;
            }
        } catch (Exception e2) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC16003) entry2.getKey()).mo19367() == entry2.getValue()) {
                        ((C14146) entry2.getValue()).m32400(((AbstractC16003) entry2.getKey()).m36369(activityC18686.m42601()).m29402());
                    }
                } catch (Exception e3) {
                    e2.addSuppressed(e3);
                }
            }
            if (activityC18686.f55787 != null) {
                activityC18686.f55787.m32122();
            }
            exc = e2;
        } catch (Throwable th) {
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC16003) entry3.getKey()).mo19367() == entry3.getValue()) {
                        ((C14146) entry3.getValue()).m32400(((AbstractC16003) entry3.getKey()).m36369(activityC18686.m42601()).m29402());
                    }
                } catch (Exception e4) {
                    if (exc == null) {
                        exc = e4;
                    } else {
                        exc.addSuppressed(e4);
                    }
                }
            }
            if (activityC18686.f55787 != null) {
                activityC18686.f55787.m32122();
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C20146 c20146 = this.f15245;
        c20146.m33348();
        ActivityC18686 activityC18686 = c20146.f62365;
        DialogInterfaceOnClickListenerC12648.m29080(activityC18686, "save_as_project1", activityC18686.getString(R.string.MT_Protector), true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f15245.f62365.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC18686 activityC18686 = this.f15245.f62365;
        if (this.f15247) {
            activityC18686.f55800 = null;
            activityC18686.f55788.m13339().mo4062((Object) activityC18686.f55801.getName());
            activityC18686.f55788.m13354().mo4067(Boolean.FALSE);
        }
        for (Map.Entry entry : this.f15246.entrySet()) {
            if (((AbstractC16003) entry.getKey()).getView() != null) {
                ((C14146) entry.getValue()).m32471(((Boolean) this.f15249.get(entry.getValue())).booleanValue());
            }
        }
        m22249();
    }
}
