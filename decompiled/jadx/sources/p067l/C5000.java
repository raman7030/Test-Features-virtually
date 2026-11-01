package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5000 implements InterfaceC24317 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C10844 f11392;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ HashMap f11393;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20423 f11394;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ IOException[] f11395;

    public C5000(C20423 c20423, HashMap map, C10844 c10844, IOException[] iOExceptionArr) {
        this.f11394 = c20423;
        this.f11393 = map;
        this.f11392 = c10844;
        this.f11395 = iOExceptionArr;
    }

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final void mo10593(InterfaceC19370 interfaceC19370, InputStream inputStream) throws IOException {
        C20423 c20423 = this.f11394;
        c20423.f63102.m50045();
        if (inputStream == null) {
            return;
        }
        C7475 c7475 = (C7475) this.f11393.get(interfaceC19370);
        C12826.requireNonNull(c7475);
        InterfaceC6341 interfaceC6341 = c20423.f63101;
        c20423.f63102.m50044();
        c20423.f63102.getClass();
        interfaceC6341.mo14502(c7475);
        c20423.f63101.getClass();
        c20423.f63101.setProgress(c20423.f63102.m50042());
        C5738 c5738 = new C5738(c7475.m6141());
        c5738.setTime(c7475.m6128());
        C20423.m46101(c5738, c7475);
        C10844 c10844 = this.f11392;
        c10844.m24987(c5738);
        try {
            C15841.m35957(inputStream, c10844.m24981(), interfaceC19370.getSize(), new C17739(this));
            inputStream.close();
            if (c20423.f63101.mo3924()) {
                return;
            }
            c20423.f63102.m50038(c7475.m6154());
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC24317
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10594(IOException iOException) {
        System.out.println("onError");
        this.f11395[0] = iOException;
        return false;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f11394.f63101.mo3924();
    }
}
