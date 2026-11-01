package p067l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import bin.p000mt.plus.R;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩷᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q92M */
/* JADX INFO: loaded from: classes5.dex */
public final class C22471 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C14146 f70873;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ int f70874;

    /* JADX INFO: renamed from: ۜ */
    public CharSequence f70875;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractActivityC5549 f70876;

    /* JADX INFO: renamed from: ۢ */
    public final C11084 f70877;

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f70878;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ Charset f70879;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ C13693 f70880;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ int[] f70881;

    /* JADX INFO: renamed from: ᩷ */
    public C23989 f70882;

    /* JADX INFO: renamed from: ᩻ */
    public C9729 f70883;

    public C22471(C14146 c14146, C13693 c13693, int[] iArr, ActivityC17874 activityC17874, Charset charset, int i) {
        this.f70873 = c14146;
        this.f70880 = c13693;
        this.f70881 = iArr;
        this.f70876 = activityC17874;
        this.f70879 = charset;
        this.f70874 = i;
        this.f70877 = C11084.m25529(c14146);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        C15271 c15271;
        this.f70883 = this.f70873.m32500().mo28595();
        C13693 c13693 = this.f70880;
        if (c13693 != null && (c15271 = c13693.f38637) != null && c15271.m34768() > 1) {
            int[] iArr = this.f70881;
            if (iArr[0] == iArr[1]) {
                this.f70882 = c13693.f38637.m34761(c13693.f38640, this.f70883, c13693.f38631.f79987);
            }
        }
        m22242(this.f70876);
        this.f26234.m33952(new RunnableC25152(0, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50431(C22471 c22471) {
        c22471.f70878 = true;
        c22471.m22249();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        OutputStreamWriter outputStreamWriter;
        int i;
        Charset charset = this.f70879;
        C9729 c9729 = this.f70883;
        try {
            if (this.f70878) {
                throw new CancellationException("Text statistics canceled");
            }
            c9729.m22746(new RunnableC9059(0, this));
            int[] iArr = this.f70881;
            int i2 = iArr[0];
            int length = iArr[1];
            boolean z = i2 != length;
            if (!z) {
                i2 = 0;
            }
            if (!z) {
                length = c9729.length();
            }
            int i3 = length;
            if (this.f70882 == null) {
                this.f70875 = C17775.m40372(c9729, i2, i3, this.f70879, this.f70874, new RunnableC9059(0, this), null, null, true).m25514();
            } else {
                C11071 c11071 = new C11071(0L, 0L, 0L, 0L, 1L, 0);
                C5036 c5036 = new C5036();
                C11742 c11742 = new C11742();
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c11742, charset);
                C11071 c11071M25515 = c11071;
                int i4 = 0;
                while (i4 < this.f70882.f76191.m34768()) {
                    try {
                        if (this.f70878) {
                            throw new CancellationException("Text statistics canceled");
                        }
                        if (i4 == this.f70882.m53158()) {
                            int i5 = i4;
                            C11071 c11072 = c11071M25515;
                            outputStreamWriter = outputStreamWriter2;
                            try {
                                C11071 c11071M40372 = C17775.m40372(c9729, 0, c9729.length(), this.f70879, this.f70874, new RunnableC9059(0, this), c5036, outputStreamWriter2, true);
                                this.f70875 = c11071M40372.m25514();
                                c11071M25515 = c11072.m25515(c11071M40372);
                                i = i5;
                            } catch (Throwable th) {
                                th = th;
                            }
                        } else {
                            C11071 c11073 = c11071M25515;
                            outputStreamWriter = outputStreamWriter2;
                            i = i4;
                            C9729 c9729M53159 = this.f70882.m53159(i);
                            try {
                                c9729M53159.m22746(new RunnableC9059(0, this));
                                C11071 c11071M25516 = c11073.m25515(C17775.m40372(c9729M53159, 0, c9729M53159.length(), this.f70879, this.f70874, new RunnableC9059(0, this), c5036, outputStreamWriter, false));
                                c9729M53159.close();
                                c11071M25515 = c11071M25516;
                            } catch (Throwable th2) {
                                try {
                                    c9729M53159.close();
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
                C11071 c11074 = c11071M25515;
                outputStreamWriter2.close();
                C11071 c11075 = new C11071(((c11074.f30655 - 1) * ((long) (this.f70874 - "\n".getBytes(charset).length))) + c11742.f32788, c11074.f30652, c5036.m10740(), c11074.f30653, c11074.f30655, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String strM16224 = C7050.m16224(R.string.MT_Protector);
                StyleSpan styleSpan = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.05f);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM16224);
                spannableStringBuilder.setSpan(styleSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan, length2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append(this.f70875);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(4, true);
                int length3 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "\n \n");
                spannableStringBuilder.setSpan(absoluteSizeSpan, length3, spannableStringBuilder.length(), 17);
                String strM16225 = C7050.m16224(R.string.MT_Protector);
                StyleSpan styleSpan2 = new StyleSpan(1);
                RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(1.05f);
                int length4 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) strM16225);
                spannableStringBuilder.setSpan(styleSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.setSpan(relativeSizeSpan2, length4, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c11075.m25514());
                this.f70875 = spannableStringBuilder;
            }
            c9729.close();
        } catch (Throwable th7) {
            if (c9729 == null) {
                throw th7;
            }
            try {
                c9729.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f70878 || !this.f70877.m25532()) {
            return;
        }
        C20671 c20671BuildDialog = this.f70876.buildDialog();
        int[] iArr = this.f70881;
        c20671BuildDialog.m46727(iArr[0] != iArr[1] ? R.string.MT_Protector : R.string.MT_Protector);
        c20671BuildDialog.m46718(this.f70875);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        C10884.m25069(c20671BuildDialog.m46732());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f70878 || !this.f70877.m25532()) {
            return;
        }
        this.f70876.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f70883;
        if (c9729 != null) {
            c9729.close();
        }
        C23989 c23989 = this.f70882;
        if (c23989 != null) {
            c23989.close();
        }
        m22249();
    }
}
