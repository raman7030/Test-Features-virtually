package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֫ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1647 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f5745;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f5746;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedList f5747;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f5748;

    public C1647() {
        throw null;
    }

    public C1647(ActivityC17169 activityC17169, LinkedList linkedList, AbstractC14346 abstractC14346, boolean z) {
        this.f5748 = activityC17169;
        this.f5747 = linkedList;
        this.f5746 = abstractC14346;
        this.f5745 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5530() {
        boolean z = this.f5745;
        ActivityC17169 activityC17169 = this.f5748;
        AbstractC14346 abstractC14346 = this.f5746;
        if (z || !abstractC14346.mo17426()) {
            abstractC14346.m34228(activityC17169);
            m5529();
            return;
        }
        activityC17169.m40358();
        ActivityC17169.m40326(activityC17169, abstractC14346);
        C19258 c19258BuildDialog = activityC17169.buildDialog();
        c19258BuildDialog.m44436(C6554.m18061(25, abstractC14346.mo14421()));
        c19258BuildDialog.m44416(R.string.MT_Protector);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩺ۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C1647 c1647 = this.f73916;
                c1647.f5746.mo17424(c1647.f5748, false, new Runnable() { // from class: l.۟ۤ᩷
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1647 c1648 = c1647;
                        c1648.f5746.m34228(c1648.f5748);
                        c1648.m5529();
                    }
                });
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰۤ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1647 c1647 = this.f41064;
                c1647.f5746.m34228(c1647.f5748);
                c1647.m5529();
            }
        });
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5529() {
        LinkedList linkedList = this.f5747;
        if (linkedList.isEmpty()) {
            return;
        }
        ((C1647) linkedList.removeFirst()).m5530();
    }
}
