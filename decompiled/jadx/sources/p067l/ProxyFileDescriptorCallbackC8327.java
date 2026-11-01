package p067l;

import android.os.ProxyFileDescriptorCallback;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes2.dex */
public final class ProxyFileDescriptorCallbackC8327 extends ProxyFileDescriptorCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24618 f22274;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ long f22275;

    public ProxyFileDescriptorCallbackC8327(long j, C24618 c24618) {
        this.f22275 = j;
        this.f22274 = c24618;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final long onGetSize() {
        return this.f22275;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final int onRead(long j, int i, byte[] bArr) throws ErrnoException {
        try {
            this.f22274.seek(j);
            return this.f22274.mo23140(0, i, bArr);
        } catch (IOException e) {
            throw new ErrnoException("onRead", OsConstants.EIO, e);
        }
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final void onRelease() {
        C2700.m4192(this.f22274);
    }
}
