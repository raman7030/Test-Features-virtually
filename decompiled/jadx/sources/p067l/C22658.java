package p067l;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C22658 extends AbstractC25101 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f71480;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f71481 = new ArrayList(0);

    /* JADX INFO: renamed from: ۧ */
    public static C22658 m50717() {
        return new C22658();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50718() {
        this.f71480 = true;
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11897(InterfaceC3643 interfaceC3643) {
        C7905 c7905 = new C7905();
        interfaceC3643.mo6909(C5238.class, new C12560());
        interfaceC3643.mo6909(C18649.class, new C23998());
        interfaceC3643.mo6909(C23875.class, new C11929());
        interfaceC3643.mo6909(C9123.class, new C13270());
        interfaceC3643.mo6909(C15966.class, c7905);
        interfaceC3643.mo6909(C17307.class, c7905);
        interfaceC3643.mo6909(C20662.class, new C3842());
        interfaceC3643.mo6909(C8591.class, new C15280());
        interfaceC3643.mo6909(C4568.class, new C9246());
        interfaceC3643.mo6909(C13955.class, new C17923());
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11896(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        C4513.m9543(textView, spannableStringBuilder);
        C20607[] c20607Arr = (C20607[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C20607.class);
        if (c20607Arr != null) {
            for (C20607 c20607 : c20607Arr) {
                spannableStringBuilder.removeSpan(c20607);
            }
        }
        spannableStringBuilder.setSpan(new C20607(textView), 0, spannableStringBuilder.length(), 18);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11895(TextView textView) {
        if (this.f71480 || textView.getMovementMethod() != null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo17244(InterfaceC21749 interfaceC21749) {
        interfaceC21749.mo28450(C14625.class, new C10587(this));
        interfaceC21749.mo28450(C5238.class, new C17291());
        interfaceC21749.mo28450(C18649.class, new C4552());
        interfaceC21749.mo28450(C23875.class, new C5893());
        interfaceC21749.mo28450(C9123.class, new C19975());
        interfaceC21749.mo28450(C15966.class, new C20646());
        interfaceC21749.mo28450(C17307.class, new C2539());
        interfaceC21749.mo28450(C10603.class, new C7234());
        interfaceC21749.mo28450(C15157.class, new C13940());
        interfaceC21749.mo28450(C16636.class, new C13940());
        interfaceC21749.mo28450(C20662.class, new C9916());
        interfaceC21749.mo28450(C13955.class, new C18633());
        interfaceC21749.mo28450(C8591.class, new C15950());
        interfaceC21749.mo28450(C23343.class, new C24668());
        interfaceC21749.mo28450(C24684.class, new C8575());
        interfaceC21749.mo28450(C22673.class, new C21987());
        interfaceC21749.mo28450(C4568.class, new C11258());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50716(InterfaceC5655 interfaceC5655, String str, String str2, AbstractC13147 abstractC13147) {
        interfaceC5655.mo12600(abstractC13147);
        int length = interfaceC5655.length();
        C19304 c19304Builder = interfaceC5655.builder();
        c19304Builder.append((char) 160);
        c19304Builder.append('\n');
        interfaceC5655.mo12595().m46077().getClass();
        c19304Builder.append((CharSequence) str2);
        interfaceC5655.mo12597();
        interfaceC5655.builder().append((char) 160);
        AbstractC6564.f16935.m31139(interfaceC5655.mo12591(), str);
        interfaceC5655.mo12593(abstractC13147, length);
        interfaceC5655.mo12598(abstractC13147);
    }
}
