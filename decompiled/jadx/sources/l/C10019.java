package l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۤۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 690O */
/* JADX INFO: loaded from: classes4.dex */
public final class C10019 extends AbstractC23919 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12135 f30169;

    public C10019(C6778 c6778) {
        this.f30169 = new C12135(c6778);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10019 m25189(C20177 c20177) {
        C23711 c23711 = new C23711();
        c23711.m52276(C21943.f70283);
        c23711.m52275();
        c23711.m52277(C11266.m27878(4.0f));
        if (C21943.m49431()) {
            c23711.m52280(-14671840);
            c23711.m52278(-15724528);
            c23711.m52279(-14671840);
        } else {
            c23711.m52280(-1);
            c23711.m52278(-591622);
            c23711.m52279(-1);
        }
        return new C10019(new C6778(c23711));
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9848(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C1839.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        if (textView.getTag(R.id.MT_Protector) == null) {
            ViewOnAttachStateChangeListenerC11012 viewOnAttachStateChangeListenerC11012 = new ViewOnAttachStateChangeListenerC11012(textView);
            textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC11012);
            textView.setTag(R.id.MT_Protector, viewOnAttachStateChangeListenerC11012);
        }
        C18067 c18067 = new C18067(textView);
        for (Object obj : spans) {
            ((C1839) obj).m6117(c18067);
        }
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ۧ */
    public final void mo15843(TextView textView) {
        this.f30169.m29559();
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo9849(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        AbstractC17361.m40690(textView);
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo15842(C13602 c13602) {
        c13602.m32711(Collections.singleton(new C3412()));
    }

    @Override // l.AbstractC23919, l.InterfaceC5575
    /* JADX INFO: renamed from: ֫ */
    public final void mo15335(InterfaceC20392 interfaceC20392) {
        interfaceC20392.mo26417(C1295.class, new C12840());
        C12135 c12135 = this.f30169;
        interfaceC20392.mo26417(C8351.class, new C2963(c12135));
        interfaceC20392.mo26417(C20346.class, new C4374(c12135));
        interfaceC20392.mo26417(C22462.class, new C19897(c12135));
        interfaceC20392.mo26417(C21757.class, new C22013(c12135));
    }
}
