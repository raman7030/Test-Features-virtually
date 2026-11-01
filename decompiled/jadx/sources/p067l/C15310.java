package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ܰۚᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15310 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f43694;

    /* JADX INFO: renamed from: ۧ */
    public C23631 f43695;

    /* JADX INFO: renamed from: ܽ */
    public LinkedList f43696;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC17874 f43697;

    public C15310() {
        throw null;
    }

    public C15310(ActivityC17874 activityC17874, LinkedList linkedList, C23631 c23631, boolean z) {
        this.f43697 = activityC17874;
        this.f43696 = linkedList;
        this.f43695 = c23631;
        this.f43694 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34845() {
        if (!this.f43694) {
            C23631 c23631 = this.f43695;
            if (c23631.m7655()) {
                ActivityC17874 activityC17874 = this.f43697;
                activityC17874.m40676();
                activityC17874.m40668(c23631);
                C20671 c20671BuildDialog = activityC17874.buildDialog();
                c20671BuildDialog.m46730(c23631.m7649().f17850.getName());
                c20671BuildDialog.m46710(R.string.MT_Protector);
                c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۚᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final C15310 c15310 = this.f20815;
                        c15310.f43695.m52562(c15310.f43697, new Runnable() { // from class: l.᩺ۚᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c15310.m34843();
                            }
                        });
                    }
                });
                c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۚᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f37356.m34843();
                    }
                });
                c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
                c20671BuildDialog.m46732();
                return;
            }
        }
        m34843();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m34843() {
        ActivityC17874 activityC17874 = this.f43697;
        try {
            C23631 c23631 = this.f43695;
            c23631.getClass();
            activityC17874.m40663(c23631);
        } catch (Throwable th) {
            activityC17874.f53419.m48823(th);
        }
        LinkedList linkedList = this.f43696;
        if (!linkedList.isEmpty()) {
            ((C15310) linkedList.removeFirst()).m34845();
        } else {
            activityC17874.f53410 = false;
        }
    }
}
