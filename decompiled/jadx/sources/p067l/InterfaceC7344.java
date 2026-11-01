package p067l;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7344 extends Closeable {
    InterfaceC2649 poll();

    InterfaceC2649 poll(long j, TimeUnit timeUnit);

    InterfaceC2649 take();
}
