package p067l;

import android.content.DialogInterface;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۤ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12770 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f35954;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f35955;

    public /* synthetic */ DialogInterfaceOnClickListenerC12770(int i, Object obj) {
        this.f35954 = i;
        this.f35955 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f35954;
        Object obj = this.f35955;
        switch (i2) {
            case 0:
                ActivityC18686.m42583((ActivityC18686) obj);
                break;
            case 1:
                AbstractActivityC14026 abstractActivityC14026 = (AbstractActivityC14026) obj;
                int i3 = AbstractActivityC14026.f39540;
                Iterator it = abstractActivityC14026.m31855().iterator();
                while (it.hasNext()) {
                    ((C10674) it.next()).m24562((String) null);
                }
                abstractActivityC14026.m31859();
                abstractActivityC14026.m31854();
                break;
            case 2:
                C20278.m45804(Collections.singleton(((C6196) obj).f15598));
                C17127.m38756();
                break;
            default:
                AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) obj;
                abstractActivityC5549.mo12256(abstractActivityC5549.getPackageName());
                break;
        }
    }
}
