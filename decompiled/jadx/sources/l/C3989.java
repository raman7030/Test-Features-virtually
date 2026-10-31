package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3989 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f12651;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f12652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3989(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str) {
        super(abstractActivityC3346, -1);
        this.f12652 = viewOnClickListenerC21628;
        this.f12651 = str;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String lowerCase = m31260().toLowerCase();
        if (lowerCase.isEmpty()) {
            m31262();
            return;
        }
        if (!lowerCase.matches("[a-z0-9^\\-]+")) {
            m31263(R.string.MT_Protector);
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.f12651;
        sb.append(str);
        sb.append("/");
        sb.append(lowerCase);
        sb.append("/type-info");
        String string = sb.toString();
        ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f12652;
        if (viewOnClickListenerC21628.f69432.m44838(string)) {
            m31263(R.string.MT_Protector);
            return;
        }
        C18683 c18683M44842 = viewOnClickListenerC21628.f69432.m44842(str);
        int size = c18683M44842.size() + 1;
        while (c18683M44842.contains(size)) {
            size++;
        }
        try {
            viewOnClickListenerC21628.f69432.m44819(string, "<?xml version='1.0' encoding='utf-8' ?>\n" + String.format("<type id=\"0x%02x\">\n", Integer.valueOf(size)) + String.format("    <entry id=\"0x%02x%02x0000\" name=\"todo\" />\n", Integer.valueOf(viewOnClickListenerC21628.f69432.m44817(127, str)), Integer.valueOf(size)) + "</type>\n");
            viewOnClickListenerC21628.m48890();
            viewOnClickListenerC21628.m48891(string);
            m31262();
        } catch (Exception e) {
            viewOnClickListenerC21628.f69427.m11384((Throwable) e);
        }
    }
}
