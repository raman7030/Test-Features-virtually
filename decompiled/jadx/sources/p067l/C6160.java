package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6160 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ String f15467;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC22924 f15468;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6160(ViewOnClickListenerC22924 viewOnClickListenerC22924, AbstractActivityC5549 abstractActivityC5549, String str) {
        super(abstractActivityC5549, -1);
        this.f15468 = viewOnClickListenerC22924;
        this.f15467 = str;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String lowerCase = m33346().toLowerCase();
        if (lowerCase.isEmpty()) {
            m33348();
            return;
        }
        if (!lowerCase.matches("[a-z0-9^\\-]+")) {
            m33349(R.string.MT_Protector);
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.f15467;
        sb.append(str);
        sb.append("/");
        sb.append(lowerCase);
        sb.append("/type-info");
        String string = sb.toString();
        ViewOnClickListenerC22924 viewOnClickListenerC22924 = this.f15468;
        if (viewOnClickListenerC22924.f72135.m47134(string)) {
            m33349(R.string.MT_Protector);
            return;
        }
        C20125 c20125M47138 = viewOnClickListenerC22924.f72135.m47138(str);
        int size = c20125M47138.size() + 1;
        while (c20125M47138.contains(size)) {
            size++;
        }
        try {
            viewOnClickListenerC22924.f72135.m47115(string, "<?xml version='1.0' encoding='utf-8' ?>\n" + String.format("<type id=\"0x%02x\">\n", Integer.valueOf(size)) + String.format("    <entry id=\"0x%02x%02x0000\" name=\"todo\" />\n", Integer.valueOf(viewOnClickListenerC22924.f72135.m47113(127, str)), Integer.valueOf(size)) + "</type>\n");
            viewOnClickListenerC22924.m51238();
            viewOnClickListenerC22924.m51239(string);
            m33348();
        } catch (Exception e) {
            viewOnClickListenerC22924.f72130.m13320((Throwable) e);
        }
    }
}
