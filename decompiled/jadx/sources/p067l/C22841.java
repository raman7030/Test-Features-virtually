package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.᩸ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C22841 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayDeque f71927 = new ArrayDeque();

    /* JADX INFO: renamed from: ֫ */
    public final C16804 m51043() {
        ArrayDeque arrayDeque = this.f71927;
        C19488 c19488 = (C19488) arrayDeque.peekLast();
        return new C16804(arrayDeque.size(), c19488 == null ? 0 : c19488.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10967 m51042(int i, byte[] bArr) {
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        C10967 c10967M47435 = null;
        while (i > 0) {
            ArrayDeque arrayDeque = this.f71927;
            C19488 c19488 = (C19488) arrayDeque.peekLast();
            if (c19488 == null || c19488.m44318() == 0) {
                c19488 = new C19488(65536);
                arrayDeque.addLast(c19488);
            }
            int iMin = Math.min(i, c19488.m44318());
            c10967M47435 = C21026.m47435(c10967M47435, C21026.m47404(new C22367(c19488, c19488.m44319(i2, iMin, bArr), iMin, null)));
            i2 += iMin;
            i -= iMin;
        }
        return c10967M47435;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51044(C16804 c16804) {
        ArrayDeque arrayDeque;
        while (true) {
            arrayDeque = this.f71927;
            if (arrayDeque.size() <= c16804.f49529) {
                break;
            } else {
                arrayDeque.removeLast();
            }
        }
        C19488 c19488 = (C19488) arrayDeque.peekLast();
        if (c19488 != null) {
            c19488.m44317(c16804.f49530);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51045() {
        while (true) {
            ArrayDeque arrayDeque = this.f71927;
            if (arrayDeque.size() <= 1) {
                return;
            } else {
                arrayDeque.removeFirst();
            }
        }
    }
}
