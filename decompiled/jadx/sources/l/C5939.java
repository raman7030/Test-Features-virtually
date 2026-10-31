package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۛ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5939 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f18225;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f18226;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8159 f18227;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f18228;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f18229;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f18230;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f18231;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f18232;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4733 f18233;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8967 f18234;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FutureC3575 f18235;

    public C5939(C22372 c22372, ActivityC16315 activityC16315, C4733 c4733, boolean z, ResultCallback resultCallback) {
        this.f18231 = c22372;
        this.f18225 = activityC16315;
        this.f18233 = c4733;
        this.f18232 = z;
        this.f18226 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f18225, this.f18231.m50173() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        synchronized (this.f18231.f72498) {
            C8967 c8967M50142 = C22372.m50142(this.f18231, (C23077) null);
            this.f18234 = c8967M50142;
            try {
                c8967M50142.f27243.m35203(this.f18233);
                this.f18228 = this.f18233.f15019.mo23117();
                final C4733 c4733 = this.f18233;
                C22372.m50178(new Callable() { // from class: l.۫۠ᩳ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C5939.m16669(this.f36600, c4733);
                        return null;
                    }
                });
                if (this.f18230) {
                    FutureC3575 futureC3575 = this.f18235;
                    if (futureC3575 != null) {
                        futureC3575.get();
                    }
                    c8967M50142.f27243.m35202();
                    C22372.m50178(new Callable() { // from class: l.ۤ۠ᩳ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C5939.m16668(this.f30574);
                            return null;
                        }
                    });
                }
                c8967M50142.close();
            } catch (Throwable th) {
                if (c8967M50142 != null) {
                    try {
                        c8967M50142.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16669(C5939 c5939, C4733 c4733) {
        AbstractC15440 abstractC15440 = c4733.f15019;
        C22372 c22372 = c5939.f18231;
        if (c5939.f18234.m23130()) {
            C8967 c8967 = c5939.f18234;
            boolean zM23129 = c8967.m23129();
            boolean z = false;
            if (c8967.m23130()) {
                if (!zM23129) {
                    c8967.f27240.m30456(true);
                }
                if (zM23129 && c8967.m23130()) {
                    z = true;
                }
            }
            c5939.f18229 = z;
            if (c5939.f18234.m23130()) {
                C15068 c15068M18986 = C7017.m18986(abstractC15440.getName());
                String strM35657 = c15068M18986 == null ? "Text" : c15068M18986.m35657();
                if (SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49280() && !strM35657.equals(c22372.f72504.m36694()) && !strM35657.equals("Text")) {
                    c22372.f72504.m36687(strM35657);
                }
                if (c5939.f18234.m23130()) {
                    C12392 c12392 = c22372.f72517;
                    Bundle bundle = c22372.f5606;
                    c22372.m5409(c22372.m50236(c12392.m30297()));
                    bundle.remove("save_as_path");
                    bundle.putString("filePath", abstractC15440.mo23554());
                    c22372.mo5408("filePath");
                    c22372.f72510 = false;
                    c22372.f72492 = null;
                    c22372.f5607.m24121(c22372.m50236(c22372.f72517.m30297()));
                    c22372.f5607.m24105(c22372.m50238());
                    c22372.f5607.m24104(C21943.f70287);
                    c22372.m5425();
                    c22372.m5407(c5939.f18228);
                    c22372.m5416(true);
                    c5939.f18227 = c5939.f18234.f27240.m30530();
                    if (c22372.f72506 != null) {
                        c5939.f18235 = c22372.m50193();
                    }
                    c5939.f18230 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16668(C5939 c5939) {
        C12392 c12392;
        C22372 c22372 = c5939.f18231;
        if (c22372.f72503 && (c12392 = c22372.f72517) == c5939.f18234.f27240 && c12392.m30436() == c5939.f18234.f27242) {
            c22372.m5409(c22372.m50236(c22372.f72517.m30297()));
            c22372.m50198();
            c22372.f5607.m24121(c22372.m5426());
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C12392 c12392;
        if (this.f18230) {
            C21374.m48457(R.string.MT_Protector);
        }
        boolean z = this.f18230;
        C22372 c22372 = this.f18231;
        boolean z2 = z && this.f18229 && (c12392 = c22372.f72517) == this.f18234.f27240 && c12392.m30436() == this.f18234.f27242 && this.f18233.f15019.mo23554().equals(c22372.m5420().f15019.mo23554()) && c22372.f72517.m30434(this.f18227) && !c22372.m5426();
        if (this.f18232 && z2) {
            c22372.getClass();
            this.f18225.m38448(c22372);
        }
        ResultCallback resultCallback = this.f18226;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f18231.m50144(exc, this.f18225);
        ResultCallback resultCallback = this.f18226;
        if (resultCallback != null) {
            resultCallback.onFailure(C18321.m42696(exc));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
