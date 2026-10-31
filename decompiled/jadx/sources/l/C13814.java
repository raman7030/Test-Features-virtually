package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ۫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13814 implements InterfaceC0612 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f41212;

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2491(int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2492(int i, int i2) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2493(int i, C5552 c5552, C5552 c5553) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2494(int i, boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2495(List list) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2496(C2730 c2730) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2501(C11902 c11902) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2505(C18958 c18958) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2507(C23896 c23896) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo2508(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2509(int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2510(int i, boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo2511(C16134 c16134) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ void mo2514(boolean z) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo2515() {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo2516(int i) {
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ void mo2517(boolean z) {
    }

    public C13814(ActivityC10227 activityC10227) {
        this.f41212 = activityC10227;
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ܽ */
    public final void mo2513(int i) {
        ActivityC10227 activityC10227 = this.f41212;
        activityC10227.m25742(i);
        if (i == 4) {
            if (activityC10227.f30745) {
                if (activityC10227.f30727) {
                    return;
                }
                activityC10227.f30757 = true;
                activityC10227.m25787();
                return;
            }
            String str = activityC10227.f30825;
            if (!TextUtils.isEmpty(str)) {
                C22926.m51017(str);
            }
            if (ActivityC10227.m25747()) {
                if (activityC10227.f30777.f26873 == 0) {
                    return;
                }
                if (ActivityC10227.m25727() || !activityC10227.f30775.mo16335()) {
                    ActivityC10227.m25735(activityC10227);
                    return;
                } else {
                    if (activityC10227.f30775.size() > 1) {
                        C21374.m48463(R.string.MT_Protector);
                        return;
                    }
                    return;
                }
            }
            if (ActivityC10227.m25727()) {
                activityC10227.f30786.mo4581();
                activityC10227.f30786.mo4601();
            }
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2500(C11197 c11197, int i) {
        ActivityC10227 activityC10227 = this.f41212;
        ActivityC10227.m25718(activityC10227, c11197);
        ActivityC10227.m25812(activityC10227, c11197);
        ActivityC10227.m25797(activityC10227, c11197);
        ActivityC10227.m25769(activityC10227, c11197);
        ActivityC10227.m25709(activityC10227, (CharSequence) null, c11197);
        ActivityC10227.m25791(activityC10227);
        activityC10227.m25693((CharSequence) activityC10227.getString(R.string.MT_Protector));
        activityC10227.m25763((CharSequence) activityC10227.getString(R.string.MT_Protector));
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2498(AbstractC4846 abstractC4846, int i) {
        if (abstractC4846.m14110()) {
            return;
        }
        ActivityC10227 activityC10227 = this.f41212;
        if (activityC10227.f30786 != null) {
            ActivityC10227.m25824(activityC10227);
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2506(C19664 c19664) {
        ActivityC10227 activityC10227 = this.f41212;
        if (activityC10227.f30745) {
            activityC10227.m25843(true);
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2503(C16134 c16134) {
        ActivityC10227 activityC10227 = this.f41212;
        ActivityC10227.m25740(activityC10227);
        if (activityC10227.f30788) {
            return;
        }
        if (C2175.m7191(c16134)) {
            activityC10227.finish();
            return;
        }
        int i = C3586.f11375;
        for (Throwable cause = c16134; cause != null; cause = cause.getCause()) {
            if (cause instanceof C3586) {
                return;
            }
        }
        if (ActivityC10227.m25725(activityC10227, c16134) || ActivityC10227.m25821(activityC10227)) {
            return;
        }
        int i2 = C22510.f72833;
        for (Throwable cause2 = c16134; cause2 != null; cause2 = cause2.getCause()) {
            if (cause2 instanceof C22510) {
                ActivityC10227.m25676(activityC10227);
                return;
            }
        }
        if (ActivityC10227.m25818(activityC10227)) {
            return;
        }
        if (activityC10227.f30745) {
            ActivityC10227.m25750(activityC10227);
            return;
        }
        if (activityC10227.f30785 || activityC10227.f30780) {
            C21374.m48463(R.string.MT_Protector);
            ActivityC10227.m25745(activityC10227);
            return;
        }
        String message = c16134.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = c16134.toString();
        }
        final InterfaceC17889 interfaceC17889Mo16334 = activityC10227.f30775.mo16334();
        if (message.contains("MediaCodecVideoRenderer error") && interfaceC17889Mo16334 != null && activityC10227.f30744 != null && (activityC10227.f30744.m38743() instanceof C2499)) {
            C19258 c19258BuildDialog = activityC10227.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44416(R.string.MT_Protector);
            c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۤ۫ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ActivityC10227 activityC10228 = this.f30993.f41212;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Uri uriM29045 = C11914.m29045(interfaceC17889Mo16334.getPath());
                    intent.setDataAndType(uriM29045, "video/*");
                    intent.addFlags(268435456);
                    C2837.m8731(intent, uriM29045);
                    try {
                        activityC10228.startActivity(intent);
                    } catch (Exception e) {
                        activityC10228.m10223(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛ۫ۜ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f18554.m33168((C21374) null);
                }
            });
            c19258BuildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۨ۫ۜ
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f34902.m33168((C21374) null);
                }
            });
            c19258BuildDialog.m44438();
            return;
        }
        m33168(C21374.m48459((CharSequence) message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m33168(final C21374 c21374) {
        final InterfaceC4162 interfaceC4162;
        if (ActivityC10227.m25747()) {
            boolean zM25727 = ActivityC10227.m25727();
            ActivityC10227 activityC10227 = this.f41212;
            if ((zM25727 || !activityC10227.f30775.mo16335()) && (interfaceC4162 = activityC10227.f30786) != null) {
                C4925.m14316(new Runnable() { // from class: l.᩺۫ۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC10227 activityC10228 = this.f74010.f41212;
                        C21374 c21375 = c21374;
                        if (c21375 != null) {
                            c21375.m48466();
                        }
                        InterfaceC4162 interfaceC4163 = activityC10228.f30786;
                        InterfaceC4162 interfaceC4164 = interfaceC4162;
                        if (interfaceC4164 == interfaceC4163 && !interfaceC4164.mo12587() && interfaceC4164.mo4603() == 1) {
                            ActivityC10227.m25735(activityC10228);
                        }
                    }
                }, 2000L);
            }
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2504(C17546 c17546) {
        CharSequence charSequence = c17546.f53612;
        ActivityC10227 activityC10227 = this.f41212;
        ActivityC10227.m25709(activityC10227, charSequence, activityC10227.f30786 == null ? null : activityC10227.f30786.mo4595());
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2499(C6404 c6404) {
        ActivityC10227 activityC10227 = this.f41212;
        activityC10227.f30808 = c6404;
        if (activityC10227.f30814 != null && activityC10227.f30814.getVisibility() == 0) {
            activityC10227.m25762(activityC10227.f30805, activityC10227.f30763);
        }
        activityC10227.m25698(c6404);
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2497(C4288 c4288) {
        ActivityC10227 activityC10227 = this.f41212;
        if (activityC10227.f30755 != null) {
            activityC10227.f30755.m1636(ActivityC10227.m25684(activityC10227, c4288.f13839));
            activityC10227.m25823();
        }
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ֫ */
    public final void mo2502(C14017 c14017) {
        ActivityC10227 activityC10227 = this.f41212;
        if (activityC10227.f30814 != null && activityC10227.f30814.getVisibility() == 0) {
            activityC10227.m25762(activityC10227.f30805, activityC10227.f30763);
        }
        boolean zM25724 = ActivityC10227.m25724(activityC10227, c14017);
        boolean zM25800 = ActivityC10227.m25800(activityC10227, c14017);
        boolean zM25772 = ActivityC10227.m25772(activityC10227, c14017);
        activityC10227.m25842(c14017);
        if (!zM25772) {
            ActivityC10227.m25831(activityC10227);
        }
        if (!zM25724 && !zM25800) {
            ActivityC10227.m25779(activityC10227);
        }
        activityC10227.m25844(c14017);
    }

    @Override // l.InterfaceC0612
    /* JADX INFO: renamed from: ۧ */
    public final void mo2512(boolean z) {
        ActivityC10227 activityC10227 = this.f41212;
        if (z) {
            activityC10227.getWindow().addFlags(128);
        } else {
            activityC10227.getWindow().clearFlags(128);
        }
    }
}
