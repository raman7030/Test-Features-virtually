package p067l;

import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plugin.api.p002ui.PluginProgressBar;
import bin.p000mt.plugin.api.util.Consumer;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۖ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4444 implements InterfaceC9934, InterfaceC24686, InterfaceC16176, InterfaceC20295, ISequentialOutStream, InterfaceC3986, Consumer, InterfaceC8453 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f9970;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f9971;

    public /* synthetic */ C4444(int i, Object obj) {
        this.f9970 = i;
        this.f9971 = obj;
    }

    public /* synthetic */ C4444(C2772 c2772, Object obj, long j) {
        this.f9970 = 1;
        this.f9971 = obj;
    }

    @Override // p067l.InterfaceC24686
    public void accept(Object obj) {
        switch (this.f9970) {
            case 2:
                C18361.m41811((C18361) this.f9971, (C14596) obj);
                break;
            default:
                ((PluginProgressBar) this.f9971).setProgress(((Integer) obj).intValue());
                break;
        }
    }

    @Override // p067l.InterfaceC3986
    /* JADX INFO: renamed from: ֫ */
    public void mo7947(TextView textView) {
        C13087 c13087 = (C13087) this.f9971;
        c13087.f36785.m36529(R.string.MT_Protector, new C22894(c13087, textView));
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public void mo9171(AbstractC7783 abstractC7783) {
        ((C5473) this.f9971).m12081((C2417) abstractC7783);
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo9173() {
        return false;
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC5761 interfaceC5761 = (InterfaceC5761) this.f9971;
        try {
            int iRemaining = byteBuffer.remaining();
            interfaceC5761.mo12855(byteBuffer);
            return iRemaining;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // p067l.InterfaceC16176
    /* JADX INFO: renamed from: ֫ */
    public void mo9277(boolean z) {
        ProgressBar progressBar = (ProgressBar) this.f9971;
        int i = AbstractActivityC3102.f5632;
        progressBar.setVisibility(z ? 0 : 8);
    }

    @Override // p067l.InterfaceC20295
    /* JADX INFO: renamed from: ۧ */
    public void mo8469(AbstractC17043 abstractC17043) {
        C20966.m47311((C18107) this.f9971, abstractC17043);
    }
}
