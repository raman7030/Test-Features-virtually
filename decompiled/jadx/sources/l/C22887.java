package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes.dex */
public final class C22887 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13714 f73806;

    public C22887(ViewOnClickListenerC13714 viewOnClickListenerC13714) {
        this.f73806 = viewOnClickListenerC13714;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f73806.f40922, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f73806;
        C16742 c16742 = viewOnClickListenerC13714.f40919;
        if (c16742.f51388 != -1) {
            int i = C1926.f6460;
            if (C15972.m37751()) {
                throw new C1637(C1575.m5392(new C23881(2), R.string.MT_Protector));
            }
            if (C15972.m37767()) {
                throw new C1637(C1575.m5392(new C23881(1702), R.string.MT_Protector));
            }
            C18237 c18237M42480 = C18237.m42480(4167);
            c18237M42480.m42490(c16742.f51388);
            C23881 c23881M42496 = c18237M42480.m42496();
            if (!c23881M42496.m52607()) {
                throw new C1637(C1575.m5392(c23881M42496, R.string.MT_Protector));
            }
        }
        C17448.m40799(viewOnClickListenerC13714.f40919).mo23552();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f73806;
        ActivityC7365 activityC7365 = viewOnClickListenerC13714.f40922;
        C16742 c16742 = viewOnClickListenerC13714.f40919;
        if (c16742.f51388 == -1) {
            ServiceC8982.f27296.add(c16742.f51390);
            int iIndexOf = activityC7365.f22625.indexOf(viewOnClickListenerC13714.f40919);
            if (iIndexOf == -1) {
                new C13735(activityC7365).m20274();
                return;
            }
            ArrayList arrayList = new ArrayList(activityC7365.f22625);
            arrayList.remove(iIndexOf);
            activityC7365.f22625 = C20195.unmodifiableList(arrayList);
            activityC7365.f22624.notifyItemRemoved(iIndexOf);
            return;
        }
        int iIndexOf2 = activityC7365.f22617.indexOf(viewOnClickListenerC13714.f40919);
        if (iIndexOf2 == -1) {
            new C13735(activityC7365).m20274();
            return;
        }
        ArrayList arrayList2 = new ArrayList(activityC7365.f22617);
        arrayList2.remove(iIndexOf2);
        activityC7365.f22617 = C20195.unmodifiableList(arrayList2);
        activityC7365.f22624.notifyItemRemoved(activityC7365.f22625.size() + iIndexOf2);
        new RunnableC19361(activityC7365);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!(exc instanceof C1637) && !(exc instanceof C19401)) {
            this.f73806.f40922.m10223(exc, (DialogInterface.OnDismissListener) null);
        } else {
            C21374.m48459((CharSequence) exc.getMessage());
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
