package l;

import java.util.concurrent.CancellationException;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܺۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15898 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14134 f49129;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12973 f49130;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49131;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11459 f49132;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f49133;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6374 f49134;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49135;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f49136;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20758 f49137;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1082 f49138;

    public C15898(C1082 c1082, C14134 c14134, InterfaceC7785 interfaceC7785, int i, C11459 c11459, C12973 c12973, String str, boolean z, InterfaceC20758 interfaceC20758) {
        this.f49138 = c1082;
        this.f49129 = c14134;
        this.f49133 = interfaceC7785;
        this.f49136 = i;
        this.f49132 = c11459;
        this.f49130 = c12973;
        this.f49135 = str;
        this.f49131 = z;
        this.f49137 = interfaceC20758;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C1082.m3690(this.f49138);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C14134 c14134 = this.f49129;
        c14134.m33742();
        RunnableC19781 runnableC19781 = new RunnableC19781(0, c14134);
        C7744 c7744Mo26562 = this.f49133.mo26562();
        try {
            c7744Mo26562.m20766(runnableC19781);
            c14134.m33742();
            if (c7744Mo26562.m20767() != this.f49136) {
                throw new CancellationException();
            }
            C12164 c12164Matcher = this.f49132.matcher((CharSequence) c7744Mo26562);
            c12164Matcher.m29604();
            c12164Matcher.m29599(runnableC19781);
            C12973 c12973 = this.f49130;
            if (c12973 != null) {
                c12164Matcher.m29614region(c12973.f38879, c12973.f38878);
            }
            this.f49134 = C6374.m17676(c7744Mo26562, c12164Matcher, this.f49135, this.f49131, 0, false, runnableC19781, new C15795(1, this.f49137));
            c14134.m33742();
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
        if (this.f49129.m33737()) {
            int iCount = this.f49134.count();
            C1082 c1082 = this.f49138;
            if (iCount != 0) {
                this.f49134.m17689(c1082.f3963, this.f49133, false);
                C1082.m3674(c1082, this.f49134.count());
            } else {
                c1082.m3700(true);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f49129.m33738()) {
            boolean z = exc instanceof RuntimeException;
            C1082 c1082 = this.f49138;
            if (z) {
                if (c1082.f3963.m30357(this.f49133, (RuntimeException) exc)) {
                    return;
                }
            }
            if (exc instanceof CancellationException) {
                return;
            }
            if (exc instanceof C14501) {
                C21374.m48464(exc.getMessage());
            } else if (exc instanceof PatternSyntaxException) {
                c1082.m3673((PatternSyntaxException) exc);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C14134 c14134 = this.f49129;
        C1082 c1082 = this.f49138;
        try {
            C6374 c6374 = this.f49134;
            if (c6374 != null) {
                c6374.close();
            }
        } finally {
            c14134.m33741();
            if (c1082.f3964 == c14134) {
                c1082.f3964 = null;
            }
            C1082.m3689(c1082);
        }
    }
}
