package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15422 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC9368 f44091;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    public C15422(ActivityC9368 activityC9368) {
        this.f44091 = activityC9368;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f44091.f25529.m32018(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        C4199.m8517();
        boolean zM39951 = C17548.m39951();
        ActivityC9368 activityC9368 = this.f44091;
        if (zM39951) {
            List list = Collections.EMPTY_LIST;
            activityC9368.f25530 = list;
            activityC9368.f25538 = list;
        } else {
            List listM43056 = C18951.m43056();
            ArrayList arrayListM43053 = C18951.m43053();
            activityC9368.f25530 = C21562.unmodifiableList(listM43056);
            activityC9368.f25538 = C21562.unmodifiableList(arrayListM43053);
            new RunnableC20769(activityC9368);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if ((exc instanceof C3924) || (exc instanceof C20807)) {
            C22682.m50795((CharSequence) exc.getMessage());
        } else {
            C22682.m50795((CharSequence) exc.toString());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        ActivityC9368 activityC9368 = this.f44091;
        activityC9368.f25534.setVisibility(0);
        if (C17548.m39935()) {
            activityC9368.f25534.setText(R.string.MT_Protector);
            activityC9368.f25534.setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۢۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC9368.m21774(this.f76574.f44091);
                }
            });
            activityC9368.m12277(R.id.MT_Protector).setVisibility(8);
        } else if (C17548.m39951()) {
            activityC9368.f25534.setText(R.string.MT_Protector);
            activityC9368.f25534.setOnClickListener(null);
            activityC9368.m12277(R.id.MT_Protector).setVisibility(8);
        } else {
            activityC9368.f25534.setText(R.string.MT_Protector);
            activityC9368.f25534.setOnClickListener(null);
            activityC9368.m12277(R.id.MT_Protector).setVisibility(0);
        }
        activityC9368.f25537.notifyDataSetChanged();
        activityC9368.f25529.m32018(false);
    }
}
