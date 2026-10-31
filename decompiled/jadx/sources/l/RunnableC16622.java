package l;

import com.google.android.material.timepicker.MaterialTimePicker;

/* JADX INFO: renamed from: l.ܽۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16622 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51063;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51064;

    public /* synthetic */ RunnableC16622(int i, Object obj) {
        this.f51063 = i;
        this.f51064 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f51063) {
            case 0:
                Exception exc = null;
                for (InterfaceC17664 interfaceC17664 : (InterfaceC17664[]) this.f51064) {
                    try {
                        interfaceC17664.close();
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        } else {
                            exc.addSuppressed(e);
                        }
                    }
                }
                if (exc != null) {
                    throw exc;
                }
                return;
            case 1:
                ((C19655) this.f51064).m10426();
                return;
            case 2:
                ((C4027) this.f51064).m12123();
                return;
            case 3:
                ((ActivityC1355) this.f51064).finish();
                return;
            default:
                ((MaterialTimePicker) this.f51064).lambda$onViewCreated$0();
                return;
        }
    }
}
