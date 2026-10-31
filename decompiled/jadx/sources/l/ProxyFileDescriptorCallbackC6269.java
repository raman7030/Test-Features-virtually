package l;

import android.os.ProxyFileDescriptorCallback;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X13G */
/* JADX INFO: loaded from: classes2.dex */
public final class ProxyFileDescriptorCallbackC6269 extends ProxyFileDescriptorCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23411 f19411;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f19412;

    public ProxyFileDescriptorCallbackC6269(long j, C23411 c23411) {
        this.f19412 = j;
        this.f19411 = c23411;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final long onGetSize() {
        return this.f19412;
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final int onRead(long j, int i, byte[] bArr) throws ErrnoException {
        try {
            this.f19411.seek(j);
            return this.f19411.mo21175(0, i, bArr);
        } catch (IOException e) {
            throw new ErrnoException("onRead", OsConstants.EIO, e);
        }
    }

    @Override // android.os.ProxyFileDescriptorCallback
    public final void onRelease() {
        C0349.m1793(this.f19411);
    }
}
