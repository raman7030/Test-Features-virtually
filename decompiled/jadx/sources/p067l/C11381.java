package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C11381 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Collection f31760;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f31761;

    /* JADX INFO: renamed from: ܳ */
    public String f31762;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f31763;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC9368 f31764;

    public C11381(ActivityC9368 activityC9368, String str, String str2, Collection collection) {
        this.f31764 = activityC9368;
        this.f31761 = str;
        this.f31763 = str2;
        this.f31760 = collection;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22242(this.f31764);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f31761.split("\n")) {
            if (!str.isEmpty()) {
                arrayList.add(new C5365(str, true));
            }
        }
        Collections.sort(arrayList);
        C23470 c23470M52208 = C23470.m52208(this.f31763);
        ArrayList<C1349> arrayList2 = new ArrayList();
        boolean z2 = false;
        for (C4675 c4675 : this.f31760) {
            String str2 = c4675.f10535;
            String strM52209 = c23470M52208.m52209(str2);
            if (!c4675.f10534) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C5365 c5365 = (C5365) it.next();
                    if (c5365.m11627(strM52209)) {
                        z = !c5365.f12651;
                        break;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(new C1349(strM52209, str2));
                if (!c23470M52208.f74761.isEmpty() && !strM52209.equals(str2)) {
                    z2 = true;
                }
            }
        }
        Collections.sort(arrayList2, new C22110());
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) ((C1349) it2.next()).f33658);
            sb.append("\n");
        }
        if (z2) {
            sb.append("\n# mapping对照\n");
            for (C1349 c1349 : arrayList2) {
                Object obj = c1349.f33658;
                Object obj2 = c1349.f33659;
                if (!((String) obj).equals(obj2)) {
                    sb.append((String) obj2);
                    sb.append(" -> ");
                    sb.append((String) c1349.f33658);
                    sb.append("\n");
                }
            }
        }
        this.f31762 = sb.toString();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        String str = this.f31762;
        ActivityC9368 activityC9368 = this.f31764;
        ActivityC16573.m37551(activityC9368, str, activityC9368.getString(R.string.MT_Protector), null, null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f31764.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
