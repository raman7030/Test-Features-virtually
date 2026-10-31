package l;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V1EH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3223 implements InterfaceC13965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f10151;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22706 f10152;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10753 f10153;

    public C3223(String str, C22706 c22706) throws IOException {
        this.f10151 = str;
        C10753 c10753 = new C10753(true);
        this.f10153 = c10753;
        c22706.m50718();
        this.f10152 = c22706;
        c10753.setOutput(c22706);
        c10753.startDocument("utf-8", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4634 m9891(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, C10130 c10130) {
        C22706 c22706 = this.f10152;
        int length = c22706.m50717().length();
        String str = this.f10151;
        C10753 c10753 = this.f10153;
        if (length <= 51200) {
            String string = c22706.toString();
            C19220 c19220M26953 = c10753.m26953();
            C4634 c4634 = new C4634();
            c4634.f14714 = str;
            c4634.f14713 = string;
            c4634.f14717 = c19220M26953;
            return c4634;
        }
        BufferedOutputStream bufferedOutputStreamM36525 = abstractC15440.m36525();
        try {
            C5773.m16236(bufferedOutputStreamM36525, c22706.m50717());
            bufferedOutputStreamM36525.close();
            C19220 c19220M26954 = c10753.m26953();
            C11003.requireNonNull(c19220M26954);
            c19220M26954.m44344(c10130);
            abstractC15441.m36496(c10130);
            c10130.m25440();
            if (c10130.m25438().length > 20480) {
                c10130.m25443();
            }
            C4634 c4635 = new C4634();
            c4635.f14714 = str;
            c4635.f14715 = abstractC15440;
            c4635.f14710 = abstractC15441;
            return c4635;
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM36525.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ۧ */
    public final void mo1294(String str) {
        this.f10153.startTag(null, str);
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫ */
    public final void mo1290(String str) {
        this.f10153.endTag(null, str);
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫ */
    public final void mo1291(String str, String str2) {
        this.f10153.attribute(null, str, str2);
    }

    @Override // l.InterfaceC13965
    public final void text(String str) {
        this.f10153.text(str);
    }
}
