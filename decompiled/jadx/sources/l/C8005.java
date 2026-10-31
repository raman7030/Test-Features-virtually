package l;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8005 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5245 f24723;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15765 f24724;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24725 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24726 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f24727;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15765 f24728;

    public C8005(InterfaceC5245 interfaceC5245, C15765 c15765, int i) throws IOException {
        this.f24727 = c15765.getPosition();
        this.f24723 = interfaceC5245;
        this.f24728 = c15765;
        int i2 = i * 4;
        C15765.m37166(c15765, 0);
        this.f24724 = AbstractC21411.m48522(interfaceC5245, c15765.getPosition());
        for (int i3 = 0; i3 < i2; i3++) {
            this.f24728.write(0);
        }
        this.f24728.flush();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21320() throws IOException {
        if (!this.f24725) {
            C15765 c15765 = this.f24724;
            c15765.getClass();
            C15765.m37166(c15765, 0);
        }
        this.f24725 = false;
        this.f24726 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21319(Set set) throws IOException {
        boolean zIsEmpty = set.isEmpty();
        C15765 c15765 = this.f24728;
        if (zIsEmpty) {
            if (this.f24725) {
                int value = EnumC18481.WHITELIST.getValue();
                c15765.getClass();
                C15765.m37168(c15765, value);
                return;
            }
            this.f24726++;
            return;
        }
        if (!this.f24725) {
            this.f24725 = true;
            int position = c15765.getPosition() - this.f24727;
            C15765 c15766 = this.f24724;
            c15766.getClass();
            C15765.m37166(c15766, position);
            for (int i = 0; i < this.f24726; i++) {
                C15765.m37168(c15765, EnumC18481.WHITELIST.getValue());
            }
            this.f24726 = 0;
        }
        int iM42966 = EnumC18481.m42966(set);
        c15765.getClass();
        C15765.m37168(c15765, iM42966);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21318() {
        int i = this.f24727;
        this.f24724.close();
        C15765 c15765M48522 = null;
        try {
            c15765M48522 = AbstractC21411.m48522(this.f24723, i);
            C15765.m37166(c15765M48522, this.f24728.getPosition() - i);
            c15765M48522.close();
        } catch (Throwable th) {
            if (c15765M48522 != null) {
                c15765M48522.close();
            }
            throw th;
        }
    }
}
