package p067l;

import com.google.android.material.timepicker.MaterialTimePicker;

/* JADX INFO: renamed from: l.ܽۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18166 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f54240;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f54241;

    public /* synthetic */ RunnableC18166(int i, Object obj) {
        this.f54240 = i;
        this.f54241 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f54240) {
            case 0:
                Exception exc = null;
                for (InterfaceC19157 interfaceC19157 : (InterfaceC19157[]) this.f54241) {
                    try {
                        interfaceC19157.close();
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
                ((C21049) this.f54241).m12465();
                return;
            case 2:
                ((C6196) this.f54241).m14043();
                return;
            case 3:
                ((ActivityC3657) this.f54241).finish();
                return;
            default:
                ((MaterialTimePicker) this.f54241).lambda$onViewCreated$0();
                return;
        }
    }
}
