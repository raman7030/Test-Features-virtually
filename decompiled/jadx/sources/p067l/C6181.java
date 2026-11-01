package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OAHZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6181 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C4697 f15547;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ AbstractC5375 f15548;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f15549;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ String f15550;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f15551;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ Main f15552;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ int f15553;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f15554;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC14580 f15555;

    public C6181(Main main, int i, String str, AbstractC5375 abstractC5375, String str2, String str3, C4697 c4697, String str4, AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580) {
        this.f15552 = main;
        this.f15553 = i;
        this.f15550 = str;
        this.f15548 = abstractC5375;
        this.f15554 = str2;
        this.f15551 = str3;
        this.f15547 = c4697;
        this.f15549 = str4;
        this.f15555 = abstractDialogInterfaceOnClickListenerC14580;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f15552, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        String str = this.f15550;
        String str2 = this.f15551;
        String str3 = this.f15554;
        AbstractC5375 abstractC5375 = this.f15548;
        int i = this.f15553;
        if (i == 0) {
            String strM26403 = C11419.m26403(str, System.currentTimeMillis() + ".tmp");
            abstractC5375.mo11728(str3, strM26403);
            try {
                abstractC5375.mo11728(str2, str3);
                abstractC5375.mo11728(strM26403, str2);
                return;
            } catch (Exception e) {
                try {
                    abstractC5375.mo11728(strM26403, str3);
                } catch (Exception unused) {
                }
                throw e;
            }
        }
        if (i == 1) {
            String strM26404 = C11419.m26403(str, System.currentTimeMillis() + ".tmp");
            abstractC5375.mo11728(str3, strM26404);
            try {
                abstractC5375.mo11728(str2, str3);
                abstractC5375.mo11745(strM26404, false);
                return;
            } catch (Exception e2) {
                try {
                    abstractC5375.mo11728(strM26404, str3);
                } catch (Exception unused2) {
                }
                throw e2;
            }
        }
        if (i != 2) {
            return;
        }
        String strMo11753 = abstractC5375.mo11753(str3 + ".bak");
        abstractC5375.mo11728(str3, strMo11753);
        try {
            abstractC5375.mo11728(str2, str3);
        } catch (Exception e3) {
            try {
                abstractC5375.mo11728(strMo11753, str3);
            } catch (Exception unused3) {
            }
            throw e3;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f15547.m9968(this.f15549);
        this.f15555.m33348();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f15552.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        this.f15547.m9953();
        C17127.m38755(this.f15548.mo11732());
    }
}
