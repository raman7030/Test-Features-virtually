package p067l;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: renamed from: l.۠ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9976 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7353 f27637;

    /* JADX INFO: renamed from: ۧ */
    public final C17351 f27638;

    /* JADX INFO: renamed from: ܳ */
    public boolean f27639 = false;

    /* JADX INFO: renamed from: ܽ */
    public int f27640 = 0;

    /* JADX INFO: renamed from: ܿ */
    public final int f27641;

    /* JADX INFO: renamed from: ᩳ */
    public final C17351 f27642;

    public C9976(InterfaceC7353 interfaceC7353, C17351 c17351, int i) throws IOException {
        this.f27641 = c17351.getPosition();
        this.f27637 = interfaceC7353;
        this.f27642 = c17351;
        int i2 = i * 4;
        C17351.m39336(c17351, 0);
        this.f27638 = AbstractC22717.m50858(interfaceC7353, c17351.getPosition());
        for (int i3 = 0; i3 < i2; i3++) {
            this.f27642.write(0);
        }
        this.f27642.flush();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23286() throws IOException {
        if (!this.f27639) {
            C17351 c17351 = this.f27638;
            c17351.getClass();
            C17351.m39336(c17351, 0);
        }
        this.f27639 = false;
        this.f27640 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23285(Set set) throws IOException {
        boolean zIsEmpty = set.isEmpty();
        C17351 c17351 = this.f27642;
        if (zIsEmpty) {
            if (this.f27639) {
                int value = EnumC19932.WHITELIST.getValue();
                c17351.getClass();
                C17351.m39338(c17351, value);
                return;
            }
            this.f27640++;
            return;
        }
        if (!this.f27639) {
            this.f27639 = true;
            int position = c17351.getPosition() - this.f27641;
            C17351 c17352 = this.f27638;
            c17352.getClass();
            C17351.m39336(c17352, position);
            for (int i = 0; i < this.f27640; i++) {
                C17351.m39338(c17351, EnumC19932.WHITELIST.getValue());
            }
            this.f27640 = 0;
        }
        int iM45242 = EnumC19932.m45242(set);
        c17351.getClass();
        C17351.m39338(c17351, iM45242);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23284() {
        int i = this.f27641;
        this.f27638.close();
        C17351 c17351M50858 = null;
        try {
            c17351M50858 = AbstractC22717.m50858(this.f27637, i);
            C17351.m39336(c17351M50858, this.f27642.getPosition() - i);
            c17351M50858.close();
        } catch (Throwable th) {
            if (c17351M50858 != null) {
                c17351M50858.close();
            }
            throw th;
        }
    }
}
