package p067l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.p000mt.plus.R;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ܿ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18736 {

    /* JADX INFO: renamed from: ۜ */
    public static final C18736 f56014 = new C18736(0);

    /* JADX INFO: renamed from: ᩻ */
    public static final C18736 f56015 = new C18736(2);

    /* JADX INFO: renamed from: ֫ */
    public String f56016;

    /* JADX INFO: renamed from: ۧ */
    public String f56017;

    /* JADX INFO: renamed from: ܳ */
    public final int f56018;

    /* JADX INFO: renamed from: ܽ */
    public boolean f56019;

    /* JADX INFO: renamed from: ܿ */
    public boolean f56020;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f56021;

    public C18736(int i) {
        this.f56018 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public static C18736 m42767() {
        return f56014;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C18736 m42768() {
        return f56015;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18736 m42765(String str) {
        C18736 c18736 = new C18736(1);
        c18736.f56017 = str;
        return c18736;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18736 m42764(Exception exc) {
        Throwable cause;
        C18736 c18736 = new C18736(1);
        if (!(exc instanceof ExecutionException) || (cause = exc.getCause()) == null) {
            cause = exc;
        }
        if (cause instanceof C16150) {
            c18736.f56017 = cause.getMessage();
            c18736.f56020 = true;
            return c18736;
        }
        String message = cause.getMessage() != null ? cause.getMessage() : cause.toString();
        if ((cause instanceof FileNotFoundException) && !message.contains("EISDIR")) {
            message = "File not found: ".concat(message);
        }
        c18736.f56017 = C8597.m20011(500, message);
        String message2 = cause.getMessage();
        if (message2 != null) {
            if (!C24414.m53856() && (message2.contains(C7050.m16224(R.string.MT_Protector)) || message2.contains(C7050.m16224(R.string.MT_Protector)))) {
                c18736.f56019 = true;
                return c18736;
            }
            if (!C24414.m53850() && message2.contains(C7050.m16224(R.string.MT_Protector))) {
                c18736.f56021 = true;
                return c18736;
            }
        }
        if (!(cause instanceof C3924) && !(cause instanceof C20807)) {
            if (cause instanceof C14342) {
                c18736.f56016 = C20849.m47079((C14342) cause);
                return c18736;
            }
            c18736.f56016 = C19945.m45265(exc);
        }
        return c18736;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m42773() {
        return this.f56018 == 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m42772() {
        return this.f56018 == 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m42771() {
        return this.f56018 == 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m42769() {
        return this.f56017;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42770(AbstractActivityC5549 abstractActivityC5549) {
        if (m42772()) {
            if (TextUtils.isEmpty(this.f56017)) {
                return;
            }
            if (this.f56020) {
                C22682.m50795((CharSequence) this.f56017);
                return;
            }
            String str = this.f56016;
            if (str != null && str.startsWith("AndroidDataFileUnreadableException///")) {
                C20849.m47080(abstractActivityC5549, this.f56016);
                return;
            }
            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
            c20671BuildDialog.m46727(R.string.MT_Protector);
            c20671BuildDialog.m46718(this.f56017);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            C10884.m25072(dialogInterfaceC2564M46732);
            if (this.f56019) {
                dialogInterfaceC2564M46732.m3861().setText(R.string.MT_Protector);
                C9269.f25170.m4066(dialogInterfaceC2564M46732, new C3984(dialogInterfaceC2564M46732, 0));
                dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC12702(abstractActivityC5549, 0));
                return;
            } else if (this.f56021) {
                dialogInterfaceC2564M46732.m3861().setText(R.string.MT_Protector);
                dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC18065(abstractActivityC5549, 0));
                return;
            } else if (this.f56016 != null) {
                dialogInterfaceC2564M46732.m3861().setOnClickListener(new ViewOnClickListenerC19407(0, this, abstractActivityC5549));
                return;
            } else {
                dialogInterfaceC2564M46732.m3861().setVisibility(8);
                return;
            }
        }
        throw new RuntimeException("Not a failure result");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42766(C18736 c18736, AbstractActivityC5549 abstractActivityC5549) {
        ActivityC16573.m37551(abstractActivityC5549, c18736.f56016, C7050.m16224(R.string.MT_Protector), null, null);
    }
}
