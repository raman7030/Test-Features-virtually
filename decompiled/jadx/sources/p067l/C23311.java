package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes.dex */
public class C23311 {

    /* JADX INFO: renamed from: ֫ */
    public final C4848 f73355;

    /* JADX INFO: renamed from: ۧ */
    public final int f73356;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC21300 f73357;

    /* JADX INFO: renamed from: ᩳ */
    public final int f73358;

    public C23311(EnumC21300 enumC21300, int i, int i2, C4848 c4848) {
        this.f73357 = enumC21300;
        this.f73358 = i;
        this.f73356 = i2;
        this.f73355 = c4848;
        mo5507();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5507() {
        EnumC22641 enumC22641 = this.f73357.f67121;
        EnumC22641 enumC22642 = EnumC22641.DEFAULT;
        if (enumC22641 == enumC22642) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC22642);
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC12224 mo5508() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܳ */
    public String mo37618() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo23180() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC7217 m51914() {
        C4848 c4848M51913 = m51913(EnumC2522.JAVADOC);
        if (c4848M51913.isEmpty()) {
            return null;
        }
        return (InterfaceC7217) c4848M51913.f11034;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m51915() {
        Iterator it = m51913(EnumC2522.JAVADOC).iterator();
        while (it.hasNext()) {
            if (((InterfaceC7217) it.next()).isDeprecated()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private C4848 m51913(EnumC2522 enumC2522) {
        C4848<InterfaceC7217> c4848 = this.f73355;
        if (c4848 == null) {
            return C4848.m10283();
        }
        C20271 c20271 = new C20271();
        for (InterfaceC7217 interfaceC7217 : c4848) {
            if (interfaceC7217.getStyle() == enumC2522) {
                c20271.m45777(interfaceC7217);
            }
        }
        return c20271.m45783();
    }
}
