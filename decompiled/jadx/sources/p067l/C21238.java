package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79J1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21238 {

    /* JADX INFO: renamed from: ֫ */
    public C6485 f66770;

    /* JADX INFO: renamed from: ۧ */
    public C23839 f66771;

    public C21238() {
        C6485 c6485 = new C6485(0);
        this.f66770 = c6485;
        this.f66771 = new C23839(c6485.f16768);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47984(C4473 c4473) {
        this.f66770.f16758 = c4473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47985(C22065 c22065) {
        this.f66770.f16753 = c22065;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47988(EnumC23366... enumC23366Arr) {
        List<EnumC23366> listAsList = Arrays.asList(enumC23366Arr);
        if (listAsList == null) {
            throw new IllegalArgumentException("Dialects may not be null");
        }
        C6485 c6485 = this.f66770;
        c6485.f16764.clear();
        for (EnumC23366 enumC23366 : listAsList) {
            if (enumC23366 == null) {
                throw new IllegalArgumentException("Dialect may not be null");
            }
            c6485.f16764.add(enumC23366);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47981(UUID uuid) {
        if (uuid == null) {
            throw new IllegalArgumentException("Client GUID may not be null");
        }
        this.f66770.f16762 = uuid;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47980(ArrayList arrayList) {
        C6485 c6485 = this.f66770;
        c6485.f16759.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC23580 interfaceC23580 = (InterfaceC23580) it.next();
            if (interfaceC23580 == null) {
                throw new IllegalArgumentException("Authenticator may not be null");
            }
            c6485.f16759.add(interfaceC23580);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m47992() {
        this.f66770.getClass();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47994(boolean z) {
        this.f66770.f16757 = z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m47995() {
        this.f66770.f16763 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47989() {
        C6485 c6485 = this.f66770;
        c6485.f16756 = 1048576;
        c6485.f16755 = 1048576;
        c6485.f16754 = 1048576;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47990(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(60L);
        C6485 c6485 = this.f66770;
        c6485.f16767 = millis;
        c6485.f16751 = timeUnit.toMillis(60L);
        c6485.f16765 = timeUnit.toMillis(60L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47983(C0932 c0932) {
        if (c0932 == null) {
            throw new IllegalArgumentException("Transport layer factory may not be null");
        }
        this.f66770.f16766 = c0932;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47982(TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(0L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("Socket timeout should be less than 2147483647ms");
        }
        this.f66770.f16761 = (int) millis;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6485 m47979() {
        C6485 c6485 = this.f66770;
        if (c6485.f16764.isEmpty()) {
            throw new IllegalStateException("At least one SMB dialect should be specified");
        }
        if (!c6485.f16757 && EnumC23366.m52017(c6485.f16764)) {
            throw new IllegalStateException("Signing cannot be disabled when using SMB3.x dialects");
        }
        if (c6485.f16752 && !EnumC23366.m52017(c6485.f16764)) {
            throw new IllegalStateException("If encryption is advertised, at least one dialect should be SMB3.x compatible");
        }
        c6485.f16760 = this.f66771.m52906();
        return new C6485(c6485);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47993() {
        this.f66770.getClass();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47991(boolean z) {
        this.f66770.f16750 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47986(C22579 c22579) {
        this.f66770.getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47987(boolean z) {
        this.f66770.f16752 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m47996() {
        this.f66770.getClass();
    }
}
