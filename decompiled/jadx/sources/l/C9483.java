package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9483 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f28811;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28812;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f28813;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28814;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7365 f28815;

    public C9483(ActivityC7365 activityC7365, String str, String str2, Collection collection) {
        this.f28815 = activityC7365;
        this.f28812 = str;
        this.f28814 = str2;
        this.f28811 = collection;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f28815);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f28812.split("\n")) {
            if (!str.isEmpty()) {
                arrayList.add(new C3153(str, true));
            }
        }
        Collections.sort(arrayList);
        C22203 c22203M49881 = C22203.m49881(this.f28814);
        ArrayList<C10220> arrayList2 = new ArrayList();
        boolean z2 = false;
        for (C2427 c2427 : this.f28811) {
            String str2 = c2427.f7744;
            String strM49882 = c22203M49881.m49882(str2);
            if (!c2427.f7743) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C3153 c3153 = (C3153) it.next();
                    if (c3153.m9583(strM49882)) {
                        z = !c3153.f9848;
                        break;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(new C10220(strM49882, str2));
                if (!c22203M49881.f72040.isEmpty() && !strM49882.equals(str2)) {
                    z2 = true;
                }
            }
        }
        Collections.sort(arrayList2, new C20772());
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) ((C10220) it2.next()).f30697);
            sb.append("\n");
        }
        if (z2) {
            sb.append("\n# mapping对照\n");
            for (C10220 c10220 : arrayList2) {
                Object obj = c10220.f30697;
                Object obj2 = c10220.f30698;
                if (!((String) obj).equals(obj2)) {
                    sb.append((String) obj2);
                    sb.append(" -> ");
                    sb.append((String) c10220.f30697);
                    sb.append("\n");
                }
            }
        }
        this.f28813 = sb.toString();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        String str = this.f28813;
        ActivityC7365 activityC7365 = this.f28815;
        ActivityC14946.m35399(activityC7365, str, activityC7365.getString(R.string.MT_Protector), null, null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f28815.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
