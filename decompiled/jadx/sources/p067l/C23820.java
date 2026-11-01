package p067l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩹᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes.dex */
public final class C23820 implements InterfaceC19570 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C12421 f75704;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AtomicReference f75705;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C2777 f75706;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C14432 f75707;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AtomicBoolean f75708;

    public C23820(C12421 c12421, AtomicReference atomicReference, C2777 c2777, C14432 c14432, AtomicBoolean atomicBoolean) {
        this.f75704 = c12421;
        this.f75705 = atomicReference;
        this.f75706 = c2777;
        this.f75707 = c14432;
        this.f75708 = atomicBoolean;
    }

    @Override // p067l.InterfaceC19570
    /* JADX INFO: renamed from: ֫ */
    public final void mo44480(IOException iOException) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f75705;
            if (atomicReference.compareAndSet(null, iOException)) {
                break;
            }
        } while (atomicReference.get() == null);
        try {
            this.f75706.close();
        } catch (Exception unused) {
        }
    }

    @Override // p067l.InterfaceC19570
    /* JADX INFO: renamed from: ֫ */
    public final void mo44481(C20066 c20066) {
        AtomicReference atomicReference;
        try {
            if (this.f75707.f41241 && c20066.m45443() == 403) {
                this.f75704.m28617();
            }
            C19737.m44866(c20066);
            this.f75708.set(true);
        } catch (IOException e) {
            do {
                atomicReference = this.f75705;
                if (atomicReference.compareAndSet(null, e)) {
                    break;
                }
            } while (atomicReference.get() == null);
            try {
                c20066.close();
            } catch (Exception unused) {
            }
            try {
                this.f75706.close();
            } catch (Exception unused2) {
            }
        }
    }
}
