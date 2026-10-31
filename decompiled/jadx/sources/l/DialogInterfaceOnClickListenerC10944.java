package l;

import android.content.DialogInterface;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10944 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32962;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32963;

    public /* synthetic */ DialogInterfaceOnClickListenerC10944(int i, Object obj) {
        this.f32962 = i;
        this.f32963 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f32962;
        Object obj = this.f32963;
        switch (i2) {
            case 0:
                ActivityC17169.m40338((ActivityC17169) obj);
                break;
            case 1:
                AbstractActivityC12266 abstractActivityC12266 = (AbstractActivityC12266) obj;
                int i3 = AbstractActivityC12266.f36524;
                Iterator it = abstractActivityC12266.m29793().iterator();
                while (it.hasNext()) {
                    ((C8739) it.next()).m22593((String) null);
                }
                abstractActivityC12266.m29797();
                abstractActivityC12266.m29792();
                break;
            case 2:
                C18844.m43538(Collections.singleton(((C4027) obj).f12783));
                C15528.m36596();
                break;
            default:
                AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) obj;
                abstractActivityC3346.mo10220(abstractActivityC3346.getPackageName());
                break;
        }
    }
}
