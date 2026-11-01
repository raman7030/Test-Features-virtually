package p067l;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import net.p069sf.sevenzipjbinding.IArchiveOpenCallback;
import net.p069sf.sevenzipjbinding.IArchiveOpenVolumeCallback;
import net.p069sf.sevenzipjbinding.IInStream;
import net.p069sf.sevenzipjbinding.PropID;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩵ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20930 extends C3494 implements IArchiveOpenCallback, IArchiveOpenVolumeCallback, InterfaceC18588, Closeable {

    /* JADX INFO: renamed from: ۛ */
    public boolean f65722;

    /* JADX INFO: renamed from: ۨ */
    public String f65723;

    /* JADX INFO: renamed from: ᩺ */
    public final HashMap f65724;

    @Override // net.p069sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setTotal(Long l2, Long l3) {
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract void mo21061(String str);

    public AbstractC20930(AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549);
        this.f65724 = new HashMap();
        this.f65722 = false;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveOpenCallback
    public final void setCompleted(Long l2, Long l3) throws SevenZipException {
        if (mo3924()) {
            throw new SevenZipException("Canceled");
        }
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final Object getProperty(PropID propID) {
        if (propID == PropID.NAME) {
            return this.f65723;
        }
        return null;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveOpenVolumeCallback
    public final IInStream getStream(String str) throws SevenZipException {
        HashMap map = this.f65724;
        if (this.f65722) {
            throw new SevenZipException("Closed");
        }
        try {
            InterfaceC9866 interfaceC9866 = (InterfaceC9866) map.get(str);
            if (interfaceC9866 != null && !interfaceC9866.isClosed()) {
                interfaceC9866.seek(0L);
                this.f65723 = str;
                return new C6418(interfaceC9866);
            }
            boolean z = interfaceC9866 == null;
            C24618 c24618M38671 = C18524.m42109(str, new String[0]).m38671("r");
            map.put(str, c24618M38671);
            if (z) {
                mo21061(str);
            }
            this.f65723 = str;
            return new C6418(c24618M38671);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SevenZipException e) {
            throw e;
        } catch (Exception e2) {
            throw new SevenZipException(e2);
        }
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public final void m47231() {
        Iterator it = this.f65724.values().iterator();
        while (it.hasNext()) {
            C2700.m4192((InterfaceC9866) it.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f65722) {
            return;
        }
        this.f65722 = true;
        m47231();
        this.f65724.clear();
    }
}
