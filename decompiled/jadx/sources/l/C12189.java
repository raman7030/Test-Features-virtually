package l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۫ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12189 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f36337;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f36338;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f36339 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f36340;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5839 f36341;

    public C12189(C5839 c5839, AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, String str) {
        this.f36341 = c5839;
        this.f36337 = abstractActivityC3346;
        this.f36340 = abstractC15440;
        this.f36338 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        final AbstractActivityC3346 abstractActivityC3346 = this.f36337;
        C4925.m14309(200L, new Runnable() { // from class: l.۬ۙ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C12189.m29664(this.f38701, abstractActivityC3346);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29664(C12189 c12189, AbstractActivityC3346 abstractActivityC3346) {
        if (c12189.f36339) {
            return;
        }
        c12189.m20267(abstractActivityC3346, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C14501, IOException {
        AbstractC15440 abstractC15440 = this.f36340;
        boolean zM36488 = abstractC15440.m36488();
        String strM36517 = null;
        C5839 c5839 = this.f36341;
        if (zM36488) {
            Typeface typefaceCreateFromFile = Typeface.createFromFile(this.f36338);
            if (typefaceCreateFromFile == null || typefaceCreateFromFile == Typeface.DEFAULT) {
                throw new C14501(R.string.MT_Protector);
            }
            abstractC15440.m36500(c5839.f17903.f30302, (C17558) null, (InterfaceC5627) null);
            c5839.f17903.f30303 = true;
        } else {
            abstractC15440.m36500(c5839.f17903.f30302, (C17558) null, (InterfaceC5627) null);
            c5839.f17903.f30303 = true;
            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(c5839.f17903.f30302.mo23554());
            if (typefaceCreateFromFile2 == null || typefaceCreateFromFile2 == Typeface.DEFAULT) {
                throw new C14501(R.string.MT_Protector);
            }
        }
        try {
            InputStream inputStreamMo27926 = c5839.f17903.f30302.mo27926();
            try {
                String strM25024 = C9913.m25023(inputStreamMo27926).m25024(4, c5839.m6886().getResources().getConfiguration().locale);
                if (!TextUtils.isEmpty(strM25024)) {
                    if (inputStreamMo27926 != null) {
                        inputStreamMo27926.close();
                    }
                    strM36517 = strM25024;
                } else if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
        }
        if (strM36517 == null) {
            strM36517 = abstractC15440.m36517();
        }
        c5839.f17903.f30300 = strM36517;
        c5839.f17903.f30301 = C20812.m47627(c5839.f17903.f30302, "MD5");
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C5839 c5839 = this.f36341;
        c5839.f17903.m25285();
        String[] strArr = c5839.f17903.f30295;
        int i = c5839.f17903.f30299;
        String strM14327 = c5839.f17903.f30300;
        if (strM14327 == null) {
            strM14327 = C4925.m14327(R.string.MT_Protector);
        }
        strArr[i] = C4925.m14306(R.string.MT_Protector, strM14327);
        ((BaseAdapter) c5839.f17903.f30298.m1443().getAdapter()).notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!(exc instanceof IOException)) {
            C21374.m48463(R.string.MT_Protector);
        } else {
            this.f36337.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f36339 = true;
        m20273();
    }
}
