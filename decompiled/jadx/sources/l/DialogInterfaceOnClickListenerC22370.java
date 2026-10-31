package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC22370 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72481;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72482;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72483;

    public /* synthetic */ DialogInterfaceOnClickListenerC22370(int i, Object obj, Object obj2) {
        this.f72482 = i;
        this.f72483 = obj;
        this.f72481 = obj2;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC22370(C16560 c16560, InterfaceC17889 interfaceC17889) {
        this.f72482 = 2;
        this.f72481 = c16560;
        this.f72483 = interfaceC17889;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f72482;
        Object obj = this.f72481;
        Object obj2 = this.f72483;
        switch (i2) {
            case 0:
                C7309 c7309 = (C7309) obj2;
                c7309.m19592();
                AbstractC15440 abstractC15440 = c7309.f22436;
                AbstractC15440 abstractC15441 = c7309.f22437;
                AbstractC15440 abstractC15440M51761 = C23346.m51761((C16560) obj, R.string.MT_Protector, "mtcr");
                int i3 = C15104.f46193;
                C0994 c0994 = new C0994(C13197.class);
                c0994.m3474("saveAsPath", abstractC15440M51761.mo23554());
                c0994.m3474("inputPath1", abstractC15440.mo23554());
                c0994.m3474("inputPath2", abstractC15441.mo23554());
                c0994.m3469();
                break;
            case 1:
                ActivityC20401.m46722((ActivityC20401) obj2, (C19866) obj);
                break;
            case 2:
                C16560 c16560 = (C16560) obj;
                C19568.m45009(c16560, (InterfaceC17889) obj2, new C22244(2, c16560));
                break;
            default:
                C4918.m14291((C4918) obj2, (C20441) obj);
                break;
        }
    }
}
