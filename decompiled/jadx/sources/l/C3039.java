package l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3039 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f9575;

    public C3039(boolean z) {
        super(z ? R.string.MT_Protector : R.string.MT_Protector, z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        this.f9575 = z;
        m5604();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        return c2450.m7916("payload") && c16560M7919.m39035("local") && !c16560M7919.m39038();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c2450.m7907("payload");
        c16560M7919.m38998("local");
        boolean z = this.f9575;
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        CharSequence charSequenceM5600 = AbstractC1661.m5600(c2450, i);
        if (z) {
            List listM7909 = c2450.m7909();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM5600);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "\n \n");
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), length, spannableStringBuilder.length(), 33);
            int length2 = spannableStringBuilder.length();
            Iterator it = listM7909.iterator();
            long jM44212 = 0;
            while (it.hasNext()) {
                jM44212 += ((C19143) ((InterfaceC17889) it.next())).m44212();
            }
            spannableStringBuilder.append((CharSequence) C4925.m14306(R.string.MT_Protector, C22927.m51028(jM44212)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C11266.m27880(15.0f)), length2, spannableStringBuilder.length(), 33);
            charSequenceM5600 = spannableStringBuilder;
        }
        m5602(c2450, i, charSequenceM5600);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 c16560M7919 = c2450.m7919();
        c16560M7919.m38998("local");
        AbstractC15440 abstractC15440M39866 = C16999.m39866(c16560M7919.m39058(), new String[0]);
        if (!abstractC15440M39866.mo23120() || abstractC15440M39866.mo27924()) {
            List listM7909 = c2450.m7909();
            int i = C15104.f46193;
            C0994 c0994 = new C0994(C4450.class);
            c0994.m3478(listM7909);
            c0994.m3484(c2450);
            c0994.m3481(c2450.m7922());
            c0994.m3474("targetPath", c16560M7919.m39058());
            c0994.m3469();
            return;
        }
        c2450.m7917().m10221(C4925.m14306(this.f9575 ? R.string.MT_Protector : R.string.MT_Protector, c16560M7919.m39058()), false);
    }
}
