package l;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۨܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C11768 extends AbstractC18824 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f35121;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13883 f35122;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ISequentialOutStream[] f35123;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f35124;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f35125;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11768(AbstractActivityC3346 abstractActivityC3346, InterfaceC13883 interfaceC13883, IInArchive iInArchive, ISequentialOutStream[] iSequentialOutStreamArr) {
        super(abstractActivityC3346);
        this.f35122 = interfaceC13883;
        this.f35121 = iInArchive;
        this.f35123 = iSequentialOutStreamArr;
        this.f35125 = -1;
    }

    @Override // l.C1184, net.sf.sevenzipjbinding.ICryptoGetTextPassword
    public final String cryptoGetTextPassword() throws SevenZipException {
        InterfaceC13883 interfaceC13883 = this.f35122;
        if (interfaceC13883.mo7145()) {
            return super.cryptoGetTextPassword();
        }
        String strMo7144 = interfaceC13883.mo7144();
        if (interfaceC13883.mo1526() || TextUtils.isEmpty(strMo7144)) {
            throw new SevenZipException(new IOException("Archive password interaction required"));
        }
        return strMo7144;
    }

    @Override // l.AbstractC18824
    public final ISequentialOutStream getStream(int i) throws SevenZipException {
        ISequentialOutStream[] iSequentialOutStreamArr = this.f35123;
        InterfaceC13883 interfaceC13883 = this.f35122;
        if (interfaceC13883.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        boolean zBooleanValue = ((Boolean) this.f35121.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f35124 = zBooleanValue;
        if (zBooleanValue) {
            interfaceC13883.mo7142(i);
            return null;
        }
        interfaceC13883.mo14155(i);
        if (interfaceC13883.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialOutStream iSequentialOutStreamMo14153 = interfaceC13883.mo14153();
            iSequentialOutStreamArr[0] = iSequentialOutStreamMo14153;
            if (iSequentialOutStreamMo14153 == null) {
                return null;
            }
            return new C6123(interfaceC13883, iSequentialOutStreamMo14153);
        } catch (SevenZipException e) {
            throw e;
        } catch (Throwable th) {
            throw new SevenZipException(th);
        }
    }

    @Override // l.AbstractC18824
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ISequentialOutStream mo28807(int i) {
        this.f35124 = false;
        return new C11010(3);
    }

    @Override // l.AbstractC18824
    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final void mo28809() {
        this.f35124 = true;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        if (this.f35124) {
            return;
        }
        ISequentialOutStream[] iSequentialOutStreamArr = this.f35123;
        boolean z = false;
        ISequentialOutStream iSequentialOutStream = iSequentialOutStreamArr[0];
        boolean z2 = iSequentialOutStream instanceof Closeable;
        InterfaceC13883 interfaceC13883 = this.f35122;
        if (z2) {
            Closeable closeable = (Closeable) iSequentialOutStream;
            if (extractOperationResult == ExtractOperationResult.OK && !interfaceC13883.mo1526()) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            } else {
                C0349.m1793(closeable);
            }
        }
        if (iSequentialOutStreamArr[0] != null) {
            iSequentialOutStreamArr[0] = null;
            z = true;
        }
        if (extractOperationResult != ExtractOperationResult.OK) {
            if (z) {
                interfaceC13883.mo7139();
            }
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (interfaceC13883.mo1526()) {
            return;
        }
        interfaceC13883.mo14156();
    }

    @Override // l.AbstractC18824
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo28808(long j, long j2) throws SevenZipException {
        InterfaceC13883 interfaceC13883 = this.f35122;
        if (interfaceC13883.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        int iM44456 = C19277.m44456(j, j2);
        if (iM44456 != this.f35125) {
            this.f35125 = iM44456;
            interfaceC13883.mo14152(iM44456);
        }
    }

    @Override // l.C1184
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo4002() {
        return super.mo4002() || this.f35122.mo1526();
    }
}
