package p067l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.p000mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5257 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public final boolean f12376;

    public C5257(boolean z) {
        super(z ? R.string.MT_Protector : R.string.MT_Protector, z ? R.drawable.MT_Protector : R.drawable.MT_Protector);
        this.f12376 = z;
        m7834();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        return c4697.m9964("payload") && c18107M9967.m41261("local") && !c18107M9967.m41264();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c4697.m9955("payload");
        c18107M9967.m41224("local");
        boolean z = this.f12376;
        int i = z ? R.string.MT_Protector : R.string.MT_Protector;
        CharSequence charSequenceM7830 = AbstractC3947.m7830(c4697, i);
        if (z) {
            List listM9957 = c4697.m9957();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM7830);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "\n \n");
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), length, spannableStringBuilder.length(), 33);
            int length2 = spannableStringBuilder.length();
            Iterator it = listM9957.iterator();
            long jM46506 = 0;
            while (it.hasNext()) {
                jM46506 += ((C20562) ((InterfaceC19370) it.next())).m46506();
            }
            spannableStringBuilder.append((CharSequence) C7050.m16203(R.string.MT_Protector, C24158.m53419(jM46506)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C23223.f72980), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C13076.m29941(15.0f)), length2, spannableStringBuilder.length(), 33);
            charSequenceM7830 = spannableStringBuilder;
        }
        m7832(c4697, i, charSequenceM7830);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܿ */
    public final void mo4692(C4697 c4697) {
        C18107 c18107M9967 = c4697.m9967();
        c18107M9967.m41224("local");
        AbstractC17043 abstractC17043M42109 = C18524.m42109(c18107M9967.m41284(), new String[0]);
        if (!abstractC17043M42109.mo25094() || abstractC17043M42109.mo29985()) {
            List listM9957 = c4697.m9957();
            int i = C16723.f49313;
            C3313 c3313 = new C3313(C6598.class);
            c3313.m5781(listM9957);
            c3313.m5787(c4697);
            c3313.m5784(c4697.m9970());
            c3313.m5777("targetPath", c18107M9967.m41284());
            c3313.m5772();
            return;
        }
        c4697.m9965().m12257(C7050.m16203(this.f12376 ? R.string.MT_Protector : R.string.MT_Protector, c18107M9967.m41284()), false);
    }
}
