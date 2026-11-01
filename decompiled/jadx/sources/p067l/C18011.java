package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܽۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18011 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C18107 f53773;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC17043 f53774;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractC17043 f53775;

    public C18011(C18107 c18107, AbstractC17043 abstractC17043) {
        this.f53773 = c18107;
        this.f53775 = abstractC17043;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f53773.m41282(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws XmlPullParserException {
        C14281 c14281;
        AbstractC17043 abstractC17043 = this.f53775;
        AbstractC17043 abstractC17043M38682 = abstractC17043.m38682("resources.arsc");
        if (abstractC17043M38682.mo25094()) {
            try {
                c14281 = new C14281(abstractC17043M38682);
            } catch (Exception unused) {
                c14281 = null;
            }
        } else {
            c14281 = null;
        }
        if (c14281 == null) {
            c14281 = new C14281();
        }
        C17117 c17117M38746 = C17117.m38746(C16820.m38138(abstractC17043.m38664()).m38154(), c14281, true);
        AbstractC17043 abstractC17043M38650 = this.f53773.m41219(abstractC17043.m38675() + ".svg", false).m38650(true);
        this.f53774 = abstractC17043M38650;
        abstractC17043M38650.m38668(c17117M38746.m38748());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f53773.m41231(this.f53774);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f53773.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        C17127.m38756();
    }
}
