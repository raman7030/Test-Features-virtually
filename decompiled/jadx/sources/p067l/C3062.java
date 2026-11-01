package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.p000mt.plus.R;
import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.֡᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes2.dex */
public final class C3062 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C15802 f5513;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C14698 f5514;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f5515;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ InterfaceC9768 f5516;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int f5517;

    /* JADX INFO: renamed from: ܳ */
    public StringBuilder f5518;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ int f5519;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ int f5520;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f5521;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C17143 f5522;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
    }

    public C3062(C17143 c17143, C15802 c15802, InterfaceC9768 interfaceC9768, int i, String str, int i2, String str2, C14698 c14698, int i3) {
        this.f5522 = c17143;
        this.f5513 = c15802;
        this.f5516 = interfaceC9768;
        this.f5520 = i;
        this.f5521 = str;
        this.f5519 = i2;
        this.f5515 = str2;
        this.f5514 = c14698;
        this.f5517 = i3;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        String str = this.f5515;
        String str2 = this.f5521;
        C15802 c15802 = this.f5513;
        c15802.m35874();
        C9729 c9729Mo28595 = this.f5516.mo28595();
        try {
            c9729Mo28595.m22746(new RunnableC21169(0, c15802));
            c15802.m35874();
            if (c9729Mo28595.m22747() != this.f5520) {
                throw new CancellationException();
            }
            if (str2.isEmpty()) {
                throw new C16150(R.string.MT_Protector);
            }
            C13259 c13259M30303 = C13259.m30303(this.f5519, str2);
            C15269.m34740(c13259M30303, str);
            C13929 c13929Matcher = c13259M30303.matcher((CharSequence) c9729Mo28595);
            c13929Matcher.m31669();
            c13929Matcher.m31664(new RunnableC21169(0, c15802));
            C14698 c14698 = this.f5514;
            if (c14698 != null) {
                c13929Matcher.m56472region(c14698.f41923, c14698.f41922);
            }
            this.f5518 = new StringBuilder();
            boolean z = false;
            while (C14028.m31865(c13929Matcher)) {
                c15802.m35874();
                c13929Matcher.expandReplacementInto(this.f5518, str);
                z = true;
            }
            c15802.m35874();
            if (!z) {
                throw new C16150(R.string.MT_Protector);
            }
            c9729Mo28595.close();
        } catch (Throwable th) {
            try {
                c9729Mo28595.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C17143 c17143 = this.f5522;
        int i = this.f5517;
        if (!(i == 3 && c17143.f51063.m32505()) && this.f5513.m35869()) {
            if (i == 1) {
                ActivityC16573.m37551(c17143.f51047, this.f5518.toString(), C7050.m16224(R.string.MT_Protector), null, null);
                return;
            }
            if (i == 2) {
                C7050.m16211(this.f5518);
                return;
            }
            if (i == 3) {
                InterfaceC9768 interfaceC9768 = this.f5516;
                interfaceC9768.replace(0, interfaceC9768.length(), this.f5518);
                c17143.f51063.mo27941(c17143.f51063.m32590());
            } else {
                if (i == 4) {
                    Intent intent = new Intent(c17143.f51047, (Class<?>) ActivityC17874.class);
                    intent.setAction("bin.mt.edit2.ACTION_CREATE_WITH_TEXT");
                    ActivityC17874.m40627(this.f5518);
                    AbstractActivityC5549 abstractActivityC5549 = c17143.f51047;
                    if (abstractActivityC5549 instanceof ActivityC17874) {
                        ((ActivityC17874) abstractActivityC5549).m40673(intent);
                        return;
                    } else {
                        c17143.f51047.startActivity(intent);
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f5513.m35870()) {
            boolean z = exc instanceof RuntimeException;
            C17143 c17143 = this.f5522;
            if (z) {
                if (c17143.f51063.m32421(this.f5516, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof PatternSyntaxException) {
                C17143.m38812(c17143, (PatternSyntaxException) exc);
            } else {
                c17143.f51047.m12259(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f5518 = null;
        C15802 c15802 = this.f5513;
        c15802.m35873();
        C17143 c17143 = this.f5522;
        if (c17143.f51058 == c15802) {
            c17143.f51058 = null;
        }
    }
}
