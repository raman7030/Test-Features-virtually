package p067l;

import android.R;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܳۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16013 extends AbstractC17354 {

    /* JADX INFO: renamed from: ۜ */
    public final String f46382;

    /* JADX INFO: renamed from: ۧ */
    public final String f46383;

    /* JADX INFO: renamed from: ܳ */
    public final String f46384;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17354 f46385;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17354 f46386;

    /* JADX INFO: renamed from: ᩳ */
    public final String f46387;

    /* JADX INFO: renamed from: ᩷ */
    public final String f46388;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC17354 f46389;

    public C16013(C14677 c14677) {
        super(5);
        this.f46388 = c14677.m33593();
        this.f46383 = c14677.m33593();
        if (c14677.m33585()) {
            this.f46382 = c14677.m33593();
            this.f46389 = c14677.m33585() ? AbstractC17354.m39349(c14677) : null;
        } else {
            this.f46382 = null;
            this.f46389 = null;
        }
        if (c14677.m33585()) {
            this.f46387 = c14677.m33593();
            this.f46385 = c14677.m33585() ? AbstractC17354.m39349(c14677) : null;
        } else {
            this.f46387 = null;
            this.f46385 = null;
        }
        if (c14677.m33585()) {
            this.f46384 = c14677.m33593();
            this.f46386 = c14677.m33585() ? AbstractC17354.m39349(c14677) : null;
        } else {
            this.f46384 = null;
            this.f46386 = null;
        }
    }

    @Override // p067l.AbstractC17354
    /* JADX INFO: renamed from: ֫ */
    public final void mo7829(AbstractActivityC5549 abstractActivityC5549) {
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46730(this.f46388);
        c20671BuildDialog.m46718("");
        String str = this.f46382;
        if (str != null) {
            c20671BuildDialog.m46735(str, new DialogInterfaceOnClickListenerC13339(5, this, abstractActivityC5549));
        }
        String str2 = this.f46387;
        if (str2 != null) {
            c20671BuildDialog.m46719(str2, new DialogInterfaceOnClickListenerC18025(0, this, abstractActivityC5549));
        }
        String str3 = this.f46384;
        if (str3 != null) {
            c20671BuildDialog.m46731(str3, new DialogInterfaceOnClickListenerC19367(0, this, abstractActivityC5549));
        }
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C10884.m25071(dialogInterfaceC2564M46732);
        TextView textView = (TextView) dialogInterfaceC2564M46732.m3846(R.id.message);
        textView.setLineSpacing(C13076.m29939(2.0f), 1.0f);
        textView.setTextIsSelectable(true);
        InterfaceC11020 interfaceC11020M40278 = AbstractC17724.m40278(abstractActivityC5549);
        interfaceC11020M40278.mo10552(new C18696(true).m49291());
        interfaceC11020M40278.build().mo40282(textView, this.f46383);
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m36394(C16013 c16013, AbstractActivityC5549 abstractActivityC5549) {
        AbstractC17354 abstractC17354 = c16013.f46389;
        if (abstractC17354 != null) {
            abstractC17354.mo7829(abstractActivityC5549);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m36393(C16013 c16013, AbstractActivityC5549 abstractActivityC5549) {
        AbstractC17354 abstractC17354 = c16013.f46385;
        if (abstractC17354 != null) {
            abstractC17354.mo7829(abstractActivityC5549);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m36392(C16013 c16013, AbstractActivityC5549 abstractActivityC5549) {
        AbstractC17354 abstractC17354 = c16013.f46386;
        if (abstractC17354 != null) {
            abstractC17354.mo7829(abstractActivityC5549);
        }
    }
}
