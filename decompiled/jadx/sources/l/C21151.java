package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩷᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes5.dex */
public final class C21151 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f68191;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68192;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public CharSequence f68193;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f68194;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9170 f68195;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f68196;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Charset f68197;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11915 f68198;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f68199;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22749 f68200;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7744 f68201;

    public C21151(C12392 c12392, C11915 c11915, int[] iArr, ActivityC16315 activityC16315, Charset charset, int i) {
        this.f68191 = c12392;
        this.f68198 = c11915;
        this.f68199 = iArr;
        this.f68194 = activityC16315;
        this.f68197 = charset;
        this.f68192 = i;
        this.f68195 = C9170.m23578(c12392);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C13576 c13576;
        this.f68201 = this.f68191.m30436().mo26562();
        C11915 c11915 = this.f68198;
        if (c11915 != null && (c13576 = c11915.f35628) != null && c13576.m32656() > 1) {
            int[] iArr = this.f68199;
            if (iArr[0] == iArr[1]) {
                this.f68200 = c11915.f35628.m32649(c11915.f35631, this.f68201, c11915.f35622.f77236);
            }
        }
        m20266(this.f68194);
        this.f23322.m31860(new RunnableC23972(0, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48101(C21151 c21151) {
        c21151.f68196 = true;
        c21151.m20273();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        OutputStreamWriter outputStreamWriter;
        int i;
        Charset charset = this.f68197;
        C7744 c7744 = this.f68201;
        try {
            if (this.f68196) {
                throw new CancellationException("Text statistics canceled");
            }
            c7744.m20766(new RunnableC7039(0, this));
            int[] iArr = this.f68199;
            int i2 = iArr[0];
            int length = iArr[1];
            boolean z = i2 != length;
            if (!z) {
                i2 = 0;
            }
            if (!z) {
                length = c7744.length();
            }
            int i3 = length;
            if (this.f68200 == null) {
                this.f68193 = C16210.m38160(c7744, i2, i3, this.f68197, this.f68192, new RunnableC7039(0, this), null, null, true).m23563();
            } else {
                C9156 c9156 = new C9156(0L, 0L, 0L, 0L, 1L, 0);
                C2806 c2806 = new C2806();
                C9862 c9862 = new C9862();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c9862, charset);
                C9156 c9156M23564 = c9156;
                int i4 = 0;
                while (i4 < this.f68200.f73465.m32656()) {
                    try {
                        if (this.f68196) {
                            throw new CancellationException("Text statistics canceled");
                        }
                        if (i4 == this.f68200.m50825()) {
                            int i5 = i4;
                            C9156 c9157 = c9156M23564;
                            outputStreamWriter = outputStreamWriter2;
                            try {
                                C9156 c9156M38160 = C16210.m38160(c7744, 0, c7744.length(), this.f68197, this.f68192, new RunnableC7039(0, this), c2806, outputStreamWriter2, true);
                                this.f68193 = c9156M38160.m23563();
                                c9156M23564 = c9157.m23564(c9156M38160);
                                i = i5;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            C9156 c9158 = c9156M23564;
                            outputStreamWriter = outputStreamWriter2;
                            i = i4;
                            C7744 c7744M50826 = this.f68200.m50826(i);
                            try {
                                c7744M50826.m20766(new RunnableC7039(0, this));
                                C9156 c9156M23565 = c9158.m23564(C16210.m38160(c7744M50826, 0, c7744M50826.length(), this.f68197, this.f68192, new RunnableC7039(0, this), c2806, outputStreamWriter, false));
                                c7744M50826.close();
                                c9156M23564 = c9156M23565;
                            } catch (Throwable th2) {
                                try {
                                    c7744M50826.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                        i4 = i + 1;
                        outputStreamWriter2 = outputStreamWriter;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStreamWriter = outputStreamWriter2;
                    }
                    Throwable th5 = th;
                    try {
                        outputStreamWriter.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
                C9156 c9159 = c9156M23564;
                outputStreamWriter2.close();
                C9156 c91510 = new C9156(((c9159.f27715 - 1) * ((long) (this.f68192 - "\n".getBytes(charset).length))) + c9862.f29835, c9159.f27712, c2806.m8680(), c9159.f27713, c9159.f27715, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strM14327 = C4925.m14327(R.string.MT_Protector);
                StyleSpan styleSpan = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.05f);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM14327);
                spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append(this.f68193);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(4, true);
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "\n \n");
                spannableStringBuilder.setSpan(absoluteSizeSpan, length3, spannableStringBuilder.length(), 17);
                String strM14328 = C4925.m14327(R.string.MT_Protector);
                StyleSpan styleSpan2 = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.05f);
                int length4 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM14328);
                spannableStringBuilder.setSpan(styleSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c91510.m23563());
                this.f68193 = spannableStringBuilder;
            }
            c7744.close();
        } catch (Throwable th7) {
            if (c7744 == null) {
                throw th7;
            }
            try {
                c7744.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f68196 || !this.f68195.m23581()) {
            return;
        }
        C19258 c19258BuildDialog = this.f68194.buildDialog();
        int[] iArr = this.f68199;
        c19258BuildDialog.m44433(iArr[0] != iArr[1] ? R.string.MT_Protector : R.string.MT_Protector);
        c19258BuildDialog.m44424(this.f68193);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        C8960.m23095(c19258BuildDialog.m44438());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f68196 || !this.f68195.m23581()) {
            return;
        }
        this.f68194.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f68201;
        if (c7744 != null) {
            c7744.close();
        }
        C22749 c22749 = this.f68200;
        if (c22749 != null) {
            c22749.close();
        }
        m20273();
    }
}
