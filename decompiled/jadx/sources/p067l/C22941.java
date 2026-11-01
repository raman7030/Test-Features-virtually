package p067l;

import java.io.IOException;
import net.p069sf.sevenzipjbinding.IOutCreateCallback;
import net.p069sf.sevenzipjbinding.IOutItemBase;
import net.p069sf.sevenzipjbinding.ISequentialInStream;
import net.p069sf.sevenzipjbinding.SevenZipException;
import net.p069sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.᩸ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes5.dex */
public class C22941 implements IOutCreateCallback {

    /* JADX INFO: renamed from: ۗ */
    public long f72180;

    /* JADX INFO: renamed from: ۙ */
    public int f72181 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public ISequentialInStream f72182 = null;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC6847 f72183;

    /* JADX INFO: renamed from: ᩹ */
    public long f72184;

    public C22941(InterfaceC6847 interfaceC6847) {
        this.f72183 = interfaceC6847;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutCreateCallback
    public IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC6847 interfaceC6847 = this.f72183;
        if (interfaceC6847.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC6847.getItemInformation(i, outItemFactory);
    }

    @Override // net.p069sf.sevenzipjbinding.IOutCreateCallback
    public final ISequentialInStream getStream(int i) throws SevenZipException {
        InterfaceC6847 interfaceC6847 = this.f72183;
        if (interfaceC6847.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialInStream stream = interfaceC6847.getStream(i);
            this.f72182 = stream;
            return stream;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.p069sf.sevenzipjbinding.IOutCreateCallback
    public final void setOperationResult(boolean z) throws SevenZipException {
        C2700.m4192(this.f72182);
        this.f72182 = null;
        if (!z) {
            throw new SevenZipException();
        }
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) throws SevenZipException {
        this.f72180 = j;
        m51260(this.f72184, j);
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) throws SevenZipException {
        this.f72184 = j;
        m51260(j, this.f72180);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51260(long j, long j2) throws SevenZipException {
        if (this.f72183.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        final int iM46750 = C20689.m46750(j, j2);
        if (iM46750 != this.f72181) {
            this.f72181 = iM46750;
            C7050.m16212(new Runnable() { // from class: l.۠ܳᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28279.f72183.mo11907(iM46750);
                }
            });
        }
    }
}
