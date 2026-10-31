package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8469 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25897;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f25898;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25899;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8469(ActivityC21107 activityC21107, ActivityC21107 activityC21108, String str, boolean z) {
        super(activityC21108, -1);
        this.f25898 = activityC21107;
        this.f25897 = str;
        this.f25899 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().replace('.', '/').trim();
        if (strTrim.length() != 0) {
            String str = this.f25897;
            if (!strTrim.equals(str)) {
                ActivityC21107 activityC21107 = this.f25898;
                Iterator it = activityC21107.f68093.f56843.f77604.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(strTrim)) {
                        m31251(String.format(activityC21107.getString(R.string.MT_Protector), strTrim));
                        return;
                    }
                }
                String strReplace = str.replace('.', '/');
                if (this.f25899) {
                    strTrim = strTrim.concat("/");
                    strReplace = C16014.m37867(strReplace, "/");
                }
                ActivityC21107.m48054(activityC21107, C9045.m23341(new StringBuilder(), activityC21107.f68093.f56843.f77599, strReplace), C9045.m23341(new StringBuilder(), activityC21107.f68093.f56843.f77599, strTrim));
                ActivityC21107.f68088 = true;
                activityC21107.f68093.f56832.clear();
                for (C11258 c11258 : activityC21107.f68093.f56840.f10940.m25236()) {
                    activityC21107.f68093.f56832.put(C15472.m36561(1, 1, c11258.m27862().m50835()), c11258);
                }
                activityC21107.f68093.f56847.m35066(activityC21107.f68093.f56832.keySet());
                activityC21107.m48061();
                m31262();
                return;
            }
        }
        m31262();
    }
}
