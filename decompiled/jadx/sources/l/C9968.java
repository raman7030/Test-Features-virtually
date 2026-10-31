package l;

import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.Channel;

/* JADX INFO: renamed from: l.ۤ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9968 implements Channel {
    public static final InterfaceC22168[] b = new InterfaceC22168[0];
    public final /* synthetic */ AsynchronousFileChannel a;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.a;
        if (obj instanceof C9968) {
            obj = ((C9968) obj).a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    public C9968(AsynchronousFileChannel asynchronousFileChannel) {
        this.a = asynchronousFileChannel;
    }
}
