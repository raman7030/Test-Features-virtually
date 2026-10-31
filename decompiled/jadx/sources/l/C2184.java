package l;

import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginProgressBar;
import bin.mt.plugin.api.util.Consumer;
import bin.mt.plus.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۖ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2184 implements InterfaceC7961, InterfaceC23483, InterfaceC14528, InterfaceC18862, ISequentialOutStream, InterfaceC1702, Consumer, InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7185;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7186;

    public /* synthetic */ C2184(int i, Object obj) {
        this.f7185 = i;
        this.f7186 = obj;
    }

    public /* synthetic */ C2184(C0425 c0425, Object obj, long j) {
        this.f7185 = 1;
        this.f7186 = obj;
    }

    @Override // l.InterfaceC23483
    public void accept(Object obj) {
        switch (this.f7185) {
            case 2:
                C16827.m39575((C16827) this.f7186, (C12866) obj);
                break;
            default:
                ((PluginProgressBar) this.f7186).setProgress(((Integer) obj).intValue());
                break;
        }
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        C11277 c11277 = (C11277) this.f7186;
        c11277.f33786.m34395(R.string.MT_Protector, new C21597(c11277, textView));
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public void mo7076(AbstractC5698 abstractC5698) {
        ((C3267) this.f7186).m10048((C0052) abstractC5698);
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo7078() {
        return false;
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC3569 interfaceC3569 = (InterfaceC3569) this.f7186;
        try {
            int iRemaining = byteBuffer.remaining();
            interfaceC3569.mo10875(byteBuffer);
            return iRemaining;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // l.InterfaceC14528
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7198(boolean z) {
        ProgressBar progressBar = (ProgressBar) this.f7186;
        int i = AbstractActivityC0772.f2860;
        progressBar.setVisibility(z ? 0 : 8);
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        C19568.m45016((C16560) this.f7186, abstractC15440);
    }
}
