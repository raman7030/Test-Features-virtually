package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩷ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C22291 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f70418;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC17043 f70419;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC17874 f70420;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f70421;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ String f70422;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C23631 f70423;

    /* JADX INFO: renamed from: ᩻ */
    public C22739 f70424;

    public C22291(C23631 c23631, ActivityC17874 activityC17874, String str, AbstractC17043 abstractC17043) {
        this.f70423 = c23631;
        this.f70420 = activityC17874;
        this.f70422 = str;
        this.f70419 = abstractC17043;
        this.f70418 = C11084.m25530(c23631.getViewLifecycleOwner());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f70421 = this.f70423.f75242.m32500().mo28595();
        m22246(this.f70420, this.f70418);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C9729 c9729 = this.f70421;
        try {
            C22739 c22739M32671 = C14201.m32671(c9729);
            this.f70424 = c22739M32671;
            c22739M32671.m50886("<--id-c5skl23kjndf-->", this.f70422);
            this.f70419.m38668(this.f70424.mo16897());
            c9729.close();
        } catch (Throwable th) {
            if (c9729 != null) {
                try {
                    c9729.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f70418.m25532()) {
            long jMo25091 = this.f70419.mo25091();
            C23631 c23631 = this.f70423;
            c23631.f75215 = jMo25091;
            c23631.startActivity(new Intent(c23631.getContext(), (Class<?>) ActivityC13531.class));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        String message;
        if (this.f70418.m25532()) {
            this.f70420.m12259(exc, (DialogInterface.OnDismissListener) null);
            if (!(exc instanceof C16322) || (message = ((C16322) exc).getMessage()) == null) {
                return;
            }
            Matcher matcher = Pattern.compile("at line (\\d+) column (\\d+)").matcher(message);
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                C12826.requireNonNull(strGroup);
                this.f70423.f75242.m32436(Integer.parseInt(strGroup) - 1);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f70421;
        if (c9729 != null) {
            c9729.close();
        }
        m22249();
    }
}
