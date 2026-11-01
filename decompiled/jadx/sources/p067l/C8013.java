package p067l;

import android.os.Bundle;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۛ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8013 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ ActivityC17874 f21079;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ ResultCallback f21080;

    /* JADX INFO: renamed from: ۜ */
    public C10123 f21081;

    /* JADX INFO: renamed from: ۡ */
    public long f21082;

    /* JADX INFO: renamed from: ۢ */
    public boolean f21083;

    /* JADX INFO: renamed from: ܳ */
    public boolean f21084;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C23631 f21085;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean f21086;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ C6867 f21087;

    /* JADX INFO: renamed from: ᩷ */
    public C10891 f21088;

    /* JADX INFO: renamed from: ᩻ */
    public FutureC5767 f21089;

    public C8013(C23631 c23631, ActivityC17874 activityC17874, C6867 c6867, boolean z, ResultCallback resultCallback) {
        this.f21085 = c23631;
        this.f21079 = activityC17874;
        this.f21087 = c6867;
        this.f21086 = z;
        this.f21080 = resultCallback;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f21079, this.f21085.m52513() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        synchronized (this.f21085.f75223) {
            C10891 c10891M52482 = C23631.m52482(this.f21085, (C24301) null);
            this.f21088 = c10891M52482;
            try {
                c10891M52482.f30177.m37350(this.f21087);
                this.f21082 = this.f21087.f17850.mo25091();
                final C6867 c6867 = this.f21087;
                C23631.m52518(new Callable() { // from class: l.۫۠ᩳ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C8013.m18595(this.f39616, c6867);
                        return null;
                    }
                });
                if (this.f21084) {
                    FutureC5767 futureC5767 = this.f21089;
                    if (futureC5767 != null) {
                        futureC5767.get();
                    }
                    c10891M52482.f30177.m37349();
                    C23631.m52518(new Callable() { // from class: l.ۤ۠ᩳ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C8013.m18594(this.f33536);
                            return null;
                        }
                    });
                }
                c10891M52482.close();
            } catch (Throwable th) {
                if (c10891M52482 != null) {
                    try {
                        c10891M52482.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18595(C8013 c8013, C6867 c6867) {
        AbstractC17043 abstractC17043 = c6867.f17850;
        C23631 c23631 = c8013.f21085;
        if (c8013.f21088.m25104()) {
            C10891 c10891 = c8013.f21088;
            boolean zM25103 = c10891.m25103();
            boolean z = false;
            if (c10891.m25104()) {
                if (!zM25103) {
                    c10891.f30174.m32520(true);
                }
                if (zM25103 && c10891.m25104()) {
                    z = true;
                }
            }
            c8013.f21083 = z;
            if (c8013.f21088.m25104()) {
                C16689 c16689M20943 = C9038.m20943(abstractC17043.getName());
                String strM37815 = c16689M20943 == null ? "Text" : c16689M20943.m37815();
                if (SharedPreferencesOnSharedPreferenceChangeListenerC23180.m51633() && !strM37815.equals(c23631.f75229.m38855()) && !strM37815.equals("Text")) {
                    c23631.f75229.m38848(strM37815);
                }
                if (c8013.f21088.m25104()) {
                    C14146 c14146 = c23631.f75242;
                    Bundle bundle = c23631.f8386;
                    c23631.m7638(c23631.m52576(c14146.m32361()));
                    bundle.remove("save_as_path");
                    bundle.putString("filePath", abstractC17043.mo25505());
                    c23631.mo7637("filePath");
                    c23631.f75235 = false;
                    c23631.f75217 = null;
                    c23631.f8387.m26130(c23631.m52576(c23631.f75242.m32361()));
                    c23631.f8387.m26114(c23631.m52578());
                    c23631.f8387.m26113(C23223.f72998);
                    c23631.m7654();
                    c23631.m7636(c8013.f21082);
                    c23631.m7645(true);
                    c8013.f21081 = c8013.f21088.f30174.m32594();
                    if (c23631.f75231 != null) {
                        c8013.f21089 = c23631.m52533();
                    }
                    c8013.f21084 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18594(C8013 c8013) {
        C14146 c14146;
        C23631 c23631 = c8013.f21085;
        if (c23631.f75228 && (c14146 = c23631.f75242) == c8013.f21088.f30174 && c14146.m32500() == c8013.f21088.f30176) {
            c23631.m7638(c23631.m52576(c23631.f75242.m32361()));
            c23631.m52538();
            c23631.f8387.m26130(c23631.m7655());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C14146 c14146;
        if (this.f21084) {
            C22682.m50793(R.string.MT_Protector);
        }
        boolean z = this.f21084;
        C23631 c23631 = this.f21085;
        boolean z2 = z && this.f21083 && (c14146 = c23631.f75242) == this.f21088.f30174 && c14146.m32500() == this.f21088.f30176 && this.f21087.f17850.mo25505().equals(c23631.m7649().f17850.mo25505()) && c23631.f75242.m32498(this.f21081) && !c23631.m7655();
        if (this.f21086 && z2) {
            c23631.getClass();
            this.f21079.m40663(c23631);
        }
        ResultCallback resultCallback = this.f21080;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f21085.m52484(exc, this.f21079);
        ResultCallback resultCallback = this.f21080;
        if (resultCallback != null) {
            resultCallback.onFailure(C19781.m44958(exc));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
