package p067l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.PropID;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۨܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C13553 extends AbstractC20259 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ IInArchive f38120;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ InterfaceC15563 f38121;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ ISequentialOutStream[] f38122;

    /* JADX INFO: renamed from: ܰ */
    public boolean f38123;

    /* JADX INFO: renamed from: ᩺ */
    public int f38124;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13553(AbstractActivityC5549 abstractActivityC5549, InterfaceC15563 interfaceC15563, IInArchive iInArchive, ISequentialOutStream[] iSequentialOutStreamArr) {
        super(abstractActivityC5549);
        this.f38121 = interfaceC15563;
        this.f38120 = iInArchive;
        this.f38122 = iSequentialOutStreamArr;
        this.f38124 = -1;
    }

    @Override // p067l.C3494, net.p069sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() throws SevenZipException {
        InterfaceC15563 interfaceC15563 = this.f38121;
        if (interfaceC15563.mo9240()) {
            return super.cryptoGetTextPassword();
        }
        String strMo9239 = interfaceC15563.mo9239();
        if (interfaceC15563.mo3924() || TextUtils.isEmpty(strMo9239)) {
            throw new SevenZipException(new IOException("Archive password interaction required"));
        }
        return strMo9239;
    }

    @Override // p067l.AbstractC20259
    public final ISequentialOutStream getStream(int i) throws SevenZipException {
        ISequentialOutStream[] iSequentialOutStreamArr = this.f38122;
        InterfaceC15563 interfaceC15563 = this.f38121;
        if (interfaceC15563.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        boolean zBooleanValue = ((Boolean) this.f38120.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f38123 = zBooleanValue;
        if (zBooleanValue) {
            interfaceC15563.mo9237(i);
            return null;
        }
        interfaceC15563.mo16036(i);
        if (interfaceC15563.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialOutStream iSequentialOutStreamMo16034 = interfaceC15563.mo16034();
            iSequentialOutStreamArr[0] = iSequentialOutStreamMo16034;
            if (iSequentialOutStreamMo16034 == null) {
                return null;
            }
            return new C8188(interfaceC15563, iSequentialOutStreamMo16034);
        } catch (SevenZipException e) {
            throw e;
        } catch (Throwable th) {
            throw new SevenZipException(th);
        }
    }

    @Override // p067l.AbstractC20259
    /* JADX INFO: renamed from: ۢ */
    public final ISequentialOutStream mo30854(int i) {
        this.f38123 = false;
        return new C12832(3);
    }

    @Override // p067l.AbstractC20259
    /* JADX INFO: renamed from: ᩶֫ */
    public final void mo30856() {
        this.f38123 = true;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        if (this.f38123) {
            return;
        }
        ISequentialOutStream[] iSequentialOutStreamArr = this.f38122;
        boolean z = false;
        ISequentialOutStream iSequentialOutStream = iSequentialOutStreamArr[0];
        boolean z2 = iSequentialOutStream instanceof Closeable;
        InterfaceC15563 interfaceC15563 = this.f38121;
        if (z2) {
            Closeable closeable = (Closeable) iSequentialOutStream;
            if (extractOperationResult == ExtractOperationResult.OK && !interfaceC15563.mo3924()) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            } else {
                C2700.m4192(closeable);
            }
        }
        if (iSequentialOutStreamArr[0] != null) {
            iSequentialOutStreamArr[0] = null;
            z = true;
        }
        if (extractOperationResult != ExtractOperationResult.OK) {
            if (z) {
                interfaceC15563.mo9234();
            }
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (interfaceC15563.mo3924()) {
            return;
        }
        interfaceC15563.mo16037();
    }

    @Override // p067l.AbstractC20259
    /* JADX INFO: renamed from: ᩳ */
    public final void mo30855(long j, long j2) throws SevenZipException {
        InterfaceC15563 interfaceC15563 = this.f38121;
        if (interfaceC15563.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        int iM46750 = C20689.m46750(j, j2);
        if (iM46750 != this.f38124) {
            this.f38124 = iM46750;
            interfaceC15563.mo16033(iM46750);
        }
    }

    @Override // p067l.C3494
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo6244() {
        return super.mo6244() || this.f38121.mo3924();
    }
}
