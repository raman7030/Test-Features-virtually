package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.֡᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C0729 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14134 f2741;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12973 f2742;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2743;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f2744;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2745;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f2746;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2747;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2748;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f2749;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f2750;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
    }

    public C0729(C15545 c15545, C14134 c14134, InterfaceC7785 interfaceC7785, int i, String str, int i2, String str2, C12973 c12973, int i3) {
        this.f2750 = c15545;
        this.f2741 = c14134;
        this.f2744 = interfaceC7785;
        this.f2748 = i;
        this.f2749 = str;
        this.f2747 = i2;
        this.f2743 = str2;
        this.f2742 = c12973;
        this.f2745 = i3;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        String str = this.f2743;
        String str2 = this.f2749;
        C14134 c14134 = this.f2741;
        c14134.m33742();
        C7744 c7744Mo26562 = this.f2744.mo26562();
        try {
            c7744Mo26562.m20766(new RunnableC19781(0, c14134));
            c14134.m33742();
            if (c7744Mo26562.m20767() != this.f2748) {
                throw new CancellationException();
            }
            if (str2.isEmpty()) {
                throw new C14501(R.string.MT_Protector);
            }
            C11459 c11459M28259 = C11459.m28259(this.f2747, str2);
            C13574.m32628(c11459M28259, str);
            C12164 c12164Matcher = c11459M28259.matcher((CharSequence) c7744Mo26562);
            c12164Matcher.m29604();
            c12164Matcher.m29599(new RunnableC19781(0, c14134));
            C12973 c12973 = this.f2742;
            if (c12973 != null) {
                c12164Matcher.m29614region(c12973.f38879, c12973.f38878);
            }
            this.f2746 = new StringBuilder();
            boolean z = false;
            while (C12268.m29803(c12164Matcher)) {
                c14134.m33742();
                c12164Matcher.expandReplacementInto(this.f2746, str);
                z = true;
            }
            c14134.m33742();
            if (!z) {
                throw new C14501(R.string.MT_Protector);
            }
            c7744Mo26562.close();
        } catch (Throwable th) {
            try {
                c7744Mo26562.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C15545 c15545 = this.f2750;
        int i = this.f2745;
        if (!(i == 3 && c15545.f47931.m30441()) && this.f2741.m33737()) {
            if (i == 1) {
                ActivityC14946.m35399(c15545.f47915, this.f2746.toString(), C4925.m14327(R.string.MT_Protector), null, null);
                return;
            }
            if (i == 2) {
                C4925.m14314(this.f2746);
                return;
            }
            if (i == 3) {
                InterfaceC7785 interfaceC7785 = this.f2744;
                interfaceC7785.replace(0, interfaceC7785.length(), this.f2746);
                c15545.f47931.mo25919(c15545.f47931.m30526());
            } else {
                if (i == 4) {
                    Intent intent = new Intent(c15545.f47915, (Class<?>) ActivityC16315.class);
                    intent.setAction("bin.mt.edit2.ACTION_CREATE_WITH_TEXT");
                    ActivityC16315.m38412(this.f2746);
                    AbstractActivityC3346 abstractActivityC3346 = c15545.f47915;
                    if (abstractActivityC3346 instanceof ActivityC16315) {
                        ((ActivityC16315) abstractActivityC3346).m38458(intent);
                        return;
                    } else {
                        c15545.f47915.startActivity(intent);
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f2741.m33738()) {
            boolean z = exc instanceof RuntimeException;
            C15545 c15545 = this.f2750;
            if (z) {
                if (c15545.f47931.m30357(this.f2744, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof PatternSyntaxException) {
                C15545.m36651(c15545, (PatternSyntaxException) exc);
            } else {
                c15545.f47915.m10223(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f2746 = null;
        C14134 c14134 = this.f2741;
        c14134.m33741();
        C15545 c15545 = this.f2750;
        if (c15545.f47926 == c14134) {
            c15545.f47926 = null;
        }
    }
}
