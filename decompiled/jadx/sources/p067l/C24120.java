package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final class C24120 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ViewOnClickListenerC15402 f76537;

    public C24120(ViewOnClickListenerC15402 viewOnClickListenerC15402) {
        this.f76537 = viewOnClickListenerC15402;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f76537.f44003, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f76537;
        C18280 c18280 = viewOnClickListenerC15402.f44000;
        if (c18280.f54571 != -1) {
            int i = C4199.f9241;
            if (C17548.m39935()) {
                throw new C3924(C3865.m7621(new C25065(2), R.string.MT_Protector));
            }
            if (C17548.m39951()) {
                throw new C3924(C3865.m7621(new C25065(1702), R.string.MT_Protector));
            }
            C19701 c19701M44739 = C19701.m44739(4167);
            c19701M44739.m44749(c18280.f54571);
            C25065 c25065M44755 = c19701M44739.m44755();
            if (!c25065M44755.m55016()) {
                throw new C3924(C3865.m7621(c25065M44755, R.string.MT_Protector));
            }
        }
        C18951.m43057(viewOnClickListenerC15402.f44000).mo25503();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        ViewOnClickListenerC15402 viewOnClickListenerC15402 = this.f76537;
        ActivityC9368 activityC9368 = viewOnClickListenerC15402.f44003;
        C18280 c18280 = viewOnClickListenerC15402.f44000;
        if (c18280.f54571 == -1) {
            ServiceC10905.f30231.add(c18280.f54573);
            int iIndexOf = activityC9368.f25538.indexOf(viewOnClickListenerC15402.f44000);
            if (iIndexOf == -1) {
                new C15422(activityC9368).m22250();
                return;
            }
            ArrayList arrayList = new ArrayList(activityC9368.f25538);
            arrayList.remove(iIndexOf);
            activityC9368.f25538 = C21562.unmodifiableList(arrayList);
            activityC9368.f25537.notifyItemRemoved(iIndexOf);
            return;
        }
        int iIndexOf2 = activityC9368.f25530.indexOf(viewOnClickListenerC15402.f44000);
        if (iIndexOf2 == -1) {
            new C15422(activityC9368).m22250();
            return;
        }
        ArrayList arrayList2 = new ArrayList(activityC9368.f25530);
        arrayList2.remove(iIndexOf2);
        activityC9368.f25530 = C21562.unmodifiableList(arrayList2);
        activityC9368.f25537.notifyItemRemoved(activityC9368.f25538.size() + iIndexOf2);
        new RunnableC20769(activityC9368);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (!(exc instanceof C3924) && !(exc instanceof C20807)) {
            this.f76537.f44003.m12259(exc, (DialogInterface.OnDismissListener) null);
        } else {
            C22682.m50795((CharSequence) exc.getMessage());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
