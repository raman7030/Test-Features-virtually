package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.p000mt.plus.R;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܺۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes4.dex */
public final class C17293 extends AbstractDialogInterfaceOnClickListenerC4106 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AbstractActivityC5549 f51592;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ Runnable f51593;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C19977 f51594;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17293(AbstractActivityC5549 abstractActivityC5549, C19977 c19977, AbstractActivityC5549 abstractActivityC55410, Runnable runnable) {
        super(abstractActivityC5549, "smur");
        this.f51594 = c19977;
        this.f51592 = abstractActivityC55410;
        this.f51593 = runnable;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC4106
    /* JADX INFO: renamed from: ܿ */
    public final void mo8256() {
        String strTrim = m8255().trim();
        EnumC13942 enumC13942M27267 = C11931.m27267(strTrim);
        if (enumC13942M27267 == EnumC13942.MPD_UNSUPPORTED) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        if (enumC13942M27267 != EnumC13942.VALID) {
            C22682.m50799(R.string.MT_Protector);
            return;
        }
        if (strTrim.length() <= 2000) {
            m8253().m16508(strTrim);
            m8254();
        }
        C15952 c15952M45327 = this.f51594.m45327(strTrim);
        String string = UUID.randomUUID().toString();
        C5178.m11082(null, new C11931(strTrim, c15952M45327), C21466.m48631("VideoPlayerUrlArguments:", string));
        AbstractActivityC5549 abstractActivityC5549 = this.f51592;
        abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC12088.class).putExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN", string));
        m8249();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC4106, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f51593;
        if (runnable != null) {
            runnable.run();
        }
    }
}
