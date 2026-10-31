package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܰۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C13735 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f41012;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    public C13735(ActivityC7365 activityC7365) {
        this.f41012 = activityC7365;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f41012.f22616.m29958(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        C1926.m6344();
        boolean zM37767 = C15972.m37767();
        ActivityC7365 activityC7365 = this.f41012;
        if (zM37767) {
            List list = Collections.EMPTY_LIST;
            activityC7365.f22617 = list;
            activityC7365.f22625 = list;
        } else {
            List listM40798 = C17448.m40798();
            ArrayList arrayListM40795 = C17448.m40795();
            activityC7365.f22617 = C20195.unmodifiableList(listM40798);
            activityC7365.f22625 = C20195.unmodifiableList(arrayListM40795);
            new RunnableC19361(activityC7365);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if ((exc instanceof C1637) || (exc instanceof C19401)) {
            C21374.m48459((CharSequence) exc.getMessage());
        } else {
            C21374.m48459((CharSequence) exc.toString());
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        ActivityC7365 activityC7365 = this.f41012;
        activityC7365.f22621.setVisibility(0);
        if (C15972.m37751()) {
            activityC7365.f22621.setText(R.string.MT_Protector);
            activityC7365.f22621.setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۢۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ActivityC7365.m19801(this.f73844.f41012);
                }
            });
            activityC7365.m10241(R.id.MT_Protector).setVisibility(8);
        } else if (C15972.m37767()) {
            activityC7365.f22621.setText(R.string.MT_Protector);
            activityC7365.f22621.setOnClickListener(null);
            activityC7365.m10241(R.id.MT_Protector).setVisibility(8);
        } else {
            activityC7365.f22621.setText(R.string.MT_Protector);
            activityC7365.f22621.setOnClickListener(null);
            activityC7365.m10241(R.id.MT_Protector).setVisibility(0);
        }
        activityC7365.f22624.notifyDataSetChanged();
        activityC7365.f22616.m29958(false);
    }
}
