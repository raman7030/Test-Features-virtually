package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۤۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11892 implements InterfaceC14573 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f33130;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC14573 f33131;

    /* JADX INFO: renamed from: ܽ */
    public final C13823 f33132;

    /* JADX INFO: renamed from: ᩳ */
    public C24292 f33133;

    public C11892(Context context, C13823 c13823, C24292 c24292) {
        this.f33130 = context;
        this.f33132 = c13823;
        this.f33133 = c24292;
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final Bitmap mo11120(long j, int i, int i2, InterfaceC21280 interfaceC21280) throws InterruptedIOException {
        InterfaceC14573 interfaceC14573 = this.f33131;
        if (interfaceC14573 != null) {
            return interfaceC14573.mo11120(j, i, i2, interfaceC21280);
        }
        C24292 c24292 = this.f33133;
        if (c24292 != null) {
            try {
                return c24292.mo11120(j, i, i2, interfaceC21280);
            } catch (InterruptedIOException e) {
                throw e;
            } catch (IOException | RuntimeException unused) {
                interfaceC21280.mo23161();
            }
        }
        C24292 c24293 = this.f33133;
        this.f33133 = null;
        C23961.m53094(c24293);
        InterfaceC14573 interfaceC14573M31628 = C13903.m31628(this.f33130, this.f33132);
        this.f33131 = interfaceC14573M31628;
        return interfaceC14573M31628.mo11120(j, i, i2, interfaceC21280);
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ᩳ */
    public final C15243 mo11124() {
        InterfaceC14573 interfaceC14573 = this.f33131;
        if (interfaceC14573 == null) {
            interfaceC14573 = this.f33133;
        }
        if (interfaceC14573 == null) {
            return null;
        }
        return interfaceC14573.mo11124();
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11122() {
        return this.f33133 != null;
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ܽ */
    public final void mo11123() {
        C24292 c24292 = this.f33133;
        if (c24292 != null) {
            c24292.mo11123();
        }
    }

    @Override // p067l.InterfaceC14573
    /* JADX INFO: renamed from: ֫ */
    public final void mo11121() {
        C24292 c24292 = this.f33133;
        InterfaceC14573 interfaceC14573 = this.f33131;
        this.f33133 = null;
        this.f33131 = null;
        C23961.m53094(c24292);
        C23961.m53094(interfaceC14573);
    }
}
