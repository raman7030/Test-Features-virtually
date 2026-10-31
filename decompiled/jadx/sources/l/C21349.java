package l;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C21349 extends AbstractC23919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f68786;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68787 = new ArrayList(0);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21349 m48382() {
        return new C21349();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48383() {
        this.f68786 = true;
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9850(InterfaceC1341 interfaceC1341) {
        C5826 c5826 = new C5826();
        interfaceC1341.mo4677(C3020.class, new C10724());
        interfaceC1341.mo4677(C17131.class, new C22759());
        interfaceC1341.mo4677(C22630.class, new C10060());
        interfaceC1341.mo4677(C7108.class, new C11471());
        interfaceC1341.mo4677(C14308.class, c5826);
        interfaceC1341.mo4677(C15719.class, c5826);
        interfaceC1341.mo4677(C19249.class, new C1551());
        interfaceC1341.mo4677(C6548.class, new C13586());
        interfaceC1341.mo4677(C2315.class, new C7237());
        interfaceC1341.mo4677(C12192.class, new C16367());
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9849(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C2257.m7461(textView, spannableStringBuilder);
        C19191[] c19191Arr = (C19191[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C19191.class);
        if (c19191Arr != null) {
            for (C19191 c19191 : c19191Arr) {
                spannableStringBuilder.removeSpan(c19191);
            }
        }
        spannableStringBuilder.setSpan(new C19191(textView), 0, spannableStringBuilder.length(), 18);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9848(TextView textView) {
        if (this.f68786 || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo15335(InterfaceC20392 interfaceC20392) {
        interfaceC20392.mo26417(C12897.class, new C8648(this));
        interfaceC20392.mo26417(C3020.class, new C15702());
        interfaceC20392.mo26417(C17131.class, new C2298());
        interfaceC20392.mo26417(C22630.class, new C3709());
        interfaceC20392.mo26417(C7108.class, new C18526());
        interfaceC20392.mo26417(C14308.class, new C19232());
        interfaceC20392.mo26417(C15719.class, new C0180());
        interfaceC20392.mo26417(C8665.class, new C5120());
        interfaceC20392.mo26417(C13457.class, new C12176());
        interfaceC20392.mo26417(C15013.class, new C12176());
        interfaceC20392.mo26417(C19249.class, new C7942());
        interfaceC20392.mo26417(C12192.class, new C17114());
        interfaceC20392.mo26417(C6548.class, new C14291());
        interfaceC20392.mo26417(C22070.class, new C23464());
        interfaceC20392.mo26417(C23481.class, new C6531());
        interfaceC20392.mo26417(C21365.class, new C20643());
        interfaceC20392.mo26417(C2315.class, new C9354());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48381(InterfaceC3458 interfaceC3458, String str, String str2, AbstractC11342 abstractC11342) {
        interfaceC3458.mo10592(abstractC11342);
        int length = interfaceC3458.length();
        C17820 c17820Builder = interfaceC3458.builder();
        c17820Builder.append((char) 160);
        c17820Builder.append('\n');
        interfaceC3458.mo10587().m43810().getClass();
        c17820Builder.append((CharSequence) str2);
        interfaceC3458.mo10589();
        interfaceC3458.builder().append((char) 160);
        AbstractC4415.f14119.m29086(interfaceC3458.mo10583(), str);
        interfaceC3458.mo10585(abstractC11342, length);
        interfaceC3458.mo10590(abstractC11342);
    }
}
