package p067l;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.Channel;

/* JADX INFO: renamed from: l.ۤ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11842 implements Channel {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC23437[] f33036b = new InterfaceC23437[0];

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AsynchronousFileChannel f33037a;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f33037a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.f33037a;
        if (obj instanceof C11842) {
            obj = ((C11842) obj).f33037a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33037a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.f33037a.isOpen();
    }

    public C11842(AsynchronousFileChannel asynchronousFileChannel) {
        this.f33037a = asynchronousFileChannel;
    }
}
