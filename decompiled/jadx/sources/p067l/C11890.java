package p067l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۤۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes4.dex */
public final class C11890 extends AbstractC25101 {

    /* JADX INFO: renamed from: ֫ */
    public final C13901 f33128;

    public C11890(C8810 c8810) {
        this.f33128 = new C13901(c8810);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11890 m27206(C21545 c21545) {
        C24903 c24903 = new C24903();
        c24903.m54679(C23223.f72994);
        c24903.m54678();
        c24903.m54680(C13076.m29939(4.0f));
        if (C23223.m51768()) {
            c24903.m54683(-14671840);
            c24903.m54681(-15724528);
            c24903.m54682(-14671840);
        } else {
            c24903.m54683(-1);
            c24903.m54681(-591622);
            c24903.m54682(-1);
        }
        return new C11890(new C8810(c24903));
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11895(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4116.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        if (textView.getTag(R.id.MT_Protector) == null) {
            ViewOnAttachStateChangeListenerC12834 viewOnAttachStateChangeListenerC12834 = new ViewOnAttachStateChangeListenerC12834(textView);
            textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC12834);
            textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC12834);
        }
        C19539 c19539 = new C19539(textView);
        for (Object obj : spans) {
            ((C4116) obj).m8315(c19539);
        }
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ۧ */
    public final void mo17758(TextView textView) {
        this.f33128.m31624();
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo11896(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC18868.m42941(textView);
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo17757(C15295 c15295) {
        c15295.m34823(Collections.singleton(new C5611()));
    }

    @Override // p067l.AbstractC25101, p067l.InterfaceC7667
    /* JADX INFO: renamed from: ֫ */
    public final void mo17244(InterfaceC21749 interfaceC21749) {
        interfaceC21749.mo28450(C3599.class, new C14571());
        C13901 c13901 = this.f33128;
        interfaceC21749.mo28450(C10305.class, new C5184(c13901));
        interfaceC21749.mo28450(C21705.class, new C6525(c13901));
        interfaceC21749.mo28450(C23716.class, new C21278(c13901));
        interfaceC21749.mo28450(C23046.class, new C23289(c13901));
    }
}
