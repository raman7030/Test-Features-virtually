package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.UUID;

/* JADX INFO: renamed from: l.ܺۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes4.dex */
public final class C15704 extends AbstractDialogInterfaceOnClickListenerC1828 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f48454;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f48455;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18528 f48456;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15704(AbstractActivityC3346 abstractActivityC3346, C18528 c18528, AbstractActivityC3346 abstractActivityC3347, Runnable runnable) {
        super(abstractActivityC3346, "smur");
        this.f48456 = c18528;
        this.f48454 = abstractActivityC3347;
        this.f48455 = runnable;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* JADX INFO: renamed from: ܿ */
    public final void mo6058() {
        String strTrim = m6057().trim();
        EnumC12178 enumC12178M25250 = C10062.m25250(strTrim);
        if (enumC12178M25250 == EnumC12178.MPD_UNSUPPORTED) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        if (enumC12178M25250 != EnumC12178.VALID) {
            C21374.m48463(R.string.MT_Protector);
            return;
        }
        if (strTrim.length() <= 2000) {
            m6055().m14601(strTrim);
            m6056();
        }
        C14293 c14293M43049 = this.f48456.m43049(strTrim);
        String string = UUID.randomUUID().toString();
        C2956.m9014(null, new C10062(strTrim, c14293M43049), C20094.m46315("VideoPlayerUrlArguments:", string));
        AbstractActivityC3346 abstractActivityC3346 = this.f48454;
        abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC10227.class).putExtra("bin.mt.media.extra.URL_ARGUMENTS_TOKEN", string));
        m6051();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f48455;
        if (runnable != null) {
            runnable.run();
        }
    }
}
