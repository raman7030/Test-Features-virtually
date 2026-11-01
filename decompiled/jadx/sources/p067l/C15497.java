package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15497 implements InterfaceC2950 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ActivityC12088 f44290;

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4847(int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4848(int i, int i2) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4849(int i, C7645 c7645, C7645 c7646) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4850(int i, boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4851(List list) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4852(C4963 c4963) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4857(C13680 c13680) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4861(C20386 c20386) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4863(C25079 c25079) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4864(boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4865(int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4866(int i, boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4867(C17702 c17702) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo4870(boolean z) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo4871() {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo4872(int i) {
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo4873(boolean z) {
    }

    public C15497(ActivityC12088 activityC12088) {
        this.f44290 = activityC12088;
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ܽ */
    public final void mo4869(int i) {
        ActivityC12088 activityC12088 = this.f44290;
        activityC12088.m27764(i);
        if (i == 4) {
            if (activityC12088.f33706) {
                if (activityC12088.f33688) {
                    return;
                }
                activityC12088.f33718 = true;
                activityC12088.m27809();
                return;
            }
            String str = activityC12088.f33786;
            if (!TextUtils.isEmpty(str)) {
                C24157.m53408(str);
            }
            if (ActivityC12088.m27769()) {
                if (activityC12088.f33738.f29798 == 0) {
                    return;
                }
                if (ActivityC12088.m27749() || !activityC12088.f33736.mo18260()) {
                    ActivityC12088.m27757(activityC12088);
                    return;
                } else {
                    if (activityC12088.f33736.size() > 1) {
                        C22682.m50799(R.string.MT_Protector);
                        return;
                    }
                    return;
                }
            }
            if (ActivityC12088.m27749()) {
                activityC12088.f33747.mo6813();
                activityC12088.f33747.mo6833();
            }
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4856(C13010 c13010, int i) {
        ActivityC12088 activityC12088 = this.f44290;
        ActivityC12088.m27740(activityC12088, c13010);
        ActivityC12088.m27834(activityC12088, c13010);
        ActivityC12088.m27819(activityC12088, c13010);
        ActivityC12088.m27791(activityC12088, c13010);
        ActivityC12088.m27731(activityC12088, (CharSequence) null, c13010);
        ActivityC12088.m27813(activityC12088);
        activityC12088.m27715((CharSequence) activityC12088.getString(R.string.MT_Protector));
        activityC12088.m27785((CharSequence) activityC12088.getString(R.string.MT_Protector));
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4854(AbstractC6974 abstractC6974, int i) {
        if (abstractC6974.m15990()) {
            return;
        }
        ActivityC12088 activityC12088 = this.f44290;
        if (activityC12088.f33747 != null) {
            ActivityC12088.m27846(activityC12088);
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4862(C21057 c21057) {
        ActivityC12088 activityC12088 = this.f44290;
        if (activityC12088.f33706) {
            activityC12088.m27865(true);
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4859(C17702 c17702) {
        ActivityC12088 activityC12088 = this.f44290;
        ActivityC12088.m27762(activityC12088);
        if (activityC12088.f33749) {
            return;
        }
        if (C4435.m9270(c17702)) {
            activityC12088.finish();
            return;
        }
        int i = C5776.f14180;
        for (Throwable cause = c17702; cause != null; cause = cause.getCause()) {
            if (cause instanceof C5776) {
                return;
            }
        }
        if (ActivityC12088.m27747(activityC12088, c17702) || ActivityC12088.m27843(activityC12088)) {
            return;
        }
        int i2 = C23762.f75559;
        for (Throwable cause2 = c17702; cause2 != null; cause2 = cause2.getCause()) {
            if (cause2 instanceof C23762) {
                ActivityC12088.m27698(activityC12088);
                return;
            }
        }
        if (ActivityC12088.m27840(activityC12088)) {
            return;
        }
        if (activityC12088.f33706) {
            ActivityC12088.m27772(activityC12088);
            return;
        }
        if (activityC12088.f33746 || activityC12088.f33741) {
            C22682.m50799(R.string.MT_Protector);
            ActivityC12088.m27767(activityC12088);
            return;
        }
        String message = c17702.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = c17702.toString();
        }
        final InterfaceC19370 interfaceC19370Mo18259 = activityC12088.f33736.mo18259();
        if (message.contains("MediaCodecVideoRenderer error") && interfaceC19370Mo18259 != null && activityC12088.f33705 != null && (activityC12088.f33705.m40968() instanceof C4744)) {
            C20671 c20671BuildDialog = activityC12088.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46710(R.string.MT_Protector);
            c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ۫ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ActivityC12088 activityC12089 = this.f33956.f44290;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Uri uriM31097 = C13692.m31097(interfaceC19370Mo18259.getPath());
                    intent.setDataAndType(uriM31097, "video/*");
                    intent.addFlags(268435456);
                    C5065.m10798(intent, uriM31097);
                    try {
                        activityC12089.startActivity(intent);
                    } catch (Exception e) {
                        activityC12089.m12259(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ۫ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f21410.m35285((C22682) null);
                }
            });
            c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ۨ۫ۜ
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f37901.m35285((C22682) null);
                }
            });
            c20671BuildDialog.m46732();
            return;
        }
        m35285(C22682.m50795((CharSequence) message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m35285(final C22682 c22682) {
        final InterfaceC6324 interfaceC6324;
        if (ActivityC12088.m27769()) {
            boolean zM27749 = ActivityC12088.m27749();
            ActivityC12088 activityC12088 = this.f44290;
            if ((zM27749 || !activityC12088.f33736.mo18260()) && (interfaceC6324 = activityC12088.f33747) != null) {
                C7050.m16213(new Runnable() { // from class: l.᩺۫ۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC12088 activityC12089 = this.f76745.f44290;
                        C22682 c22683 = c22682;
                        if (c22683 != null) {
                            c22683.m50802();
                        }
                        InterfaceC6324 interfaceC6325 = activityC12089.f33747;
                        InterfaceC6324 interfaceC6326 = interfaceC6324;
                        if (interfaceC6326 == interfaceC6325 && !interfaceC6326.mo14461() && interfaceC6326.mo6835() == 1) {
                            ActivityC12088.m27757(activityC12089);
                        }
                    }
                }, 2000L);
            }
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4860(C19044 c19044) {
        CharSequence charSequence = c19044.f56802;
        ActivityC12088 activityC12088 = this.f44290;
        ActivityC12088.m27731(activityC12088, charSequence, activityC12088.f33747 == null ? null : activityC12088.f33747.mo6827());
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4855(C8454 c8454) {
        ActivityC12088 activityC12088 = this.f44290;
        activityC12088.f33769 = c8454;
        if (activityC12088.f33775 != null && activityC12088.f33775.getVisibility() == 0) {
            activityC12088.m27784(activityC12088.f33766, activityC12088.f33724);
        }
        activityC12088.m27720(c8454);
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4853(C6443 c6443) {
        ActivityC12088 activityC12088 = this.f44290;
        if (activityC12088.f33716 != null) {
            activityC12088.f33716.m4036(ActivityC12088.m27706(activityC12088, c6443.f16655));
            activityC12088.m27845();
        }
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ֫ */
    public final void mo4858(C15690 c15690) {
        ActivityC12088 activityC12088 = this.f44290;
        if (activityC12088.f33775 != null && activityC12088.f33775.getVisibility() == 0) {
            activityC12088.m27784(activityC12088.f33766, activityC12088.f33724);
        }
        boolean zM27746 = ActivityC12088.m27746(activityC12088, c15690);
        boolean zM27822 = ActivityC12088.m27822(activityC12088, c15690);
        boolean zM27794 = ActivityC12088.m27794(activityC12088, c15690);
        activityC12088.m27864(c15690);
        if (!zM27794) {
            ActivityC12088.m27853(activityC12088);
        }
        if (!zM27746 && !zM27822) {
            ActivityC12088.m27801(activityC12088);
        }
        activityC12088.m27866(c15690);
    }

    @Override // p067l.InterfaceC2950
    /* JADX INFO: renamed from: ۧ */
    public final void mo4868(boolean z) {
        ActivityC12088 activityC12088 = this.f44290;
        if (z) {
            activityC12088.getWindow().addFlags(128);
        } else {
            activityC12088.getWindow().clearFlags(128);
        }
    }
}
