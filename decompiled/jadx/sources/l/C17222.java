package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: l.ܿ۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAXL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17222 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C17222 f52832 = new C17222(0);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C17222 f52833 = new C17222(2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f52834;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f52835;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f52836;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52837;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f52838;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52839;

    public C17222(int i) {
        this.f52836 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C17222 m40520() {
        return f52832;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C17222 m40521() {
        return f52833;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17222 m40518(String str) {
        C17222 c17222 = new C17222(1);
        c17222.f52835 = str;
        return c17222;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17222 m40517(Exception exc) {
        Throwable cause;
        C17222 c17222 = new C17222(1);
        if (!(exc instanceof ExecutionException) || (cause = exc.getCause()) == null) {
            cause = exc;
        }
        if (cause instanceof C14501) {
            c17222.f52835 = cause.getMessage();
            c17222.f52838 = true;
            return c17222;
        }
        String message = cause.getMessage() != null ? cause.getMessage() : cause.toString();
        if ((cause instanceof FileNotFoundException) && !message.contains("EISDIR")) {
            message = "File not found: ".concat(message);
        }
        c17222.f52835 = C6554.m18061(500, message);
        String message2 = cause.getMessage();
        if (message2 != null) {
            if (!C23196.m51460() && (message2.contains(C4925.m14327(R.string.MT_Protector)) || message2.contains(C4925.m14327(R.string.MT_Protector)))) {
                c17222.f52837 = true;
                return c17222;
            }
            if (!C23196.m51454() && message2.contains(C4925.m14327(R.string.MT_Protector))) {
                c17222.f52839 = true;
                return c17222;
            }
        }
        if (!(cause instanceof C1637) && !(cause instanceof C19401)) {
            if (cause instanceof C12598) {
                c17222.f52834 = C19445.m44784((C12598) cause);
                return c17222;
            }
            c17222.f52834 = C18494.m42989(exc);
        }
        return c17222;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m40526() {
        return this.f52836 == 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40525() {
        return this.f52836 == 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40524() {
        return this.f52836 == 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40522() {
        return this.f52835;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40523(AbstractActivityC3346 abstractActivityC3346) {
        if (m40525()) {
            if (TextUtils.isEmpty(this.f52835)) {
                return;
            }
            if (this.f52838) {
                C21374.m48459((CharSequence) this.f52835);
                return;
            }
            String str = this.f52834;
            if (str != null && str.startsWith("AndroidDataFileUnreadableException///")) {
                C19445.m44785(abstractActivityC3346, this.f52834);
                return;
            }
            C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
            c19258BuildDialog.m44433(R.string.MT_Protector);
            c19258BuildDialog.m44424(this.f52835);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            C8960.m23098(dialogInterfaceC0206M44438);
            if (this.f52837) {
                dialogInterfaceC0206M44438.m1448().setText(R.string.MT_Protector);
                C7261.f22281.m1668(dialogInterfaceC0206M44438, new C1700(dialogInterfaceC0206M44438, 0));
                dialogInterfaceC0206M44438.m1448().setOnClickListener(new ViewOnClickListenerC10873(abstractActivityC3346, 0));
                return;
            } else if (this.f52839) {
                dialogInterfaceC0206M44438.m1448().setText(R.string.MT_Protector);
                dialogInterfaceC0206M44438.m1448().setOnClickListener(new ViewOnClickListenerC16516(abstractActivityC3346, 0));
                return;
            } else if (this.f52834 != null) {
                dialogInterfaceC0206M44438.m1448().setOnClickListener(new ViewOnClickListenerC17928(0, this, abstractActivityC3346));
                return;
            } else {
                dialogInterfaceC0206M44438.m1448().setVisibility(8);
                return;
            }
        }
        throw new RuntimeException("Not a failure result");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40519(C17222 c17222, AbstractActivityC3346 abstractActivityC3346) {
        ActivityC14946.m35399(abstractActivityC3346, c17222.f52834, C4925.m14327(R.string.MT_Protector), null, null);
    }
}
