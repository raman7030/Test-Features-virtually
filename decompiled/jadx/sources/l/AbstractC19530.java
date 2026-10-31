package l;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import net.sf.sevenzipjbinding.IArchiveOpenCallback;
import net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.PropID;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩵ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19530 extends C1184 implements IArchiveOpenCallback, IArchiveOpenVolumeCallback, InterfaceC17066, Closeable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f63102;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f63103;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final HashMap f63104;

    @Override // net.sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setTotal(Long l2, Long l3) {
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo19103(String str);

    public AbstractC19530(AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346);
        this.f63104 = new HashMap();
        this.f63102 = false;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setCompleted(Long l2, Long l3) throws SevenZipException {
        if (mo1526()) {
            throw new SevenZipException("Canceled");
        }
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final Object getProperty(PropID propID) {
        if (propID == PropID.NAME) {
            return this.f63103;
        }
        return null;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final IInStream getStream(String str) throws SevenZipException {
        HashMap map = this.f63104;
        if (this.f63102) {
            throw new SevenZipException("Closed");
        }
        try {
            InterfaceC7889 interfaceC7889 = (InterfaceC7889) map.get(str);
            if (interfaceC7889 != null && !interfaceC7889.isClosed()) {
                interfaceC7889.seek(0L);
                this.f63103 = str;
                return new C4260(interfaceC7889);
            }
            boolean z = interfaceC7889 == null;
            C23411 c23411M36513 = C16999.m39866(str, new String[0]).m36513("r");
            map.put(str, c23411M36513);
            if (z) {
                mo19103(str);
            }
            this.f63103 = str;
            return new C4260(c23411M36513);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SevenZipException e) {
            throw e;
        } catch (Exception e2) {
            throw new SevenZipException(e2);
        }
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final void m44933() {
        Iterator it = this.f63104.values().iterator();
        while (it.hasNext()) {
            C0349.m1793((InterfaceC7889) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f63102) {
            return;
        }
        this.f63102 = true;
        m44933();
        this.f63104.clear();
    }
}
