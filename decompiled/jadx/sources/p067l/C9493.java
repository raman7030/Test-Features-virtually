package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 81ID */
/* JADX INFO: loaded from: classes3.dex */
public final class C9493 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C23575 f25997;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C4110 f25998;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9493(C4110 c4110, AbstractActivityC5549 abstractActivityC5549, C23575 c23575) {
        super(abstractActivityC5549, -1);
        this.f25998 = c4110;
        this.f25997 = c23575;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        m33348();
        String strM33346 = m33346();
        if (strM33346.isEmpty()) {
            return;
        }
        C23575 c23575 = this.f25997;
        if (strM33346.equals(c23575.f75056)) {
            return;
        }
        try {
            c23575.f75054.m38668(strM33346);
        } catch (IOException unused) {
        }
        C4110 c4110 = this.f25998;
        c4110.f9052 = c4110.f9054.m48752();
        c4110.f9056.notifyDataSetChanged();
    }
}
