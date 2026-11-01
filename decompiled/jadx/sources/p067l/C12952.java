package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C12952 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f36417 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8848 f36418;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f36419;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f36420;

    public C12952(InterfaceC8848 interfaceC8848, CharSequence charSequence, CharSequence charSequence2) {
        this.f36418 = interfaceC8848;
        this.f36419 = charSequence;
        this.f36420 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4154 m29683() {
        Iterator itMo8422 = this.f36418.mo8420().f44736.mo8422();
        while (true) {
            boolean zHasNext = itMo8422.hasNext();
            ArrayList arrayList = this.f36417;
            CharSequence charSequence = this.f36420;
            CharSequence charSequence2 = this.f36419;
            if (zHasNext) {
                C23600 c23600 = (C23600) itMo8422.next();
                int i = c23600.f75123;
                int i2 = c23600.f75124;
                int i3 = c23600.f75122;
                int i4 = c23600.f75121;
                int i5 = i4;
                for (int i6 = i3; i < i5 && i2 < i6; i6--) {
                    int i7 = i5 - 1;
                    if (charSequence2.charAt(i7) != charSequence.charAt(i6 - 1) || !C13061.m29890(charSequence2.charAt(i7))) {
                        break;
                    }
                    i5--;
                }
                int i8 = i4 - i5;
                int i9 = i4 - i8;
                int i10 = i3 - i8;
                int iM12343 = C5575.m12343(charSequence2, charSequence, c23600.f75123, c23600.f75124, i9, i10);
                C23600 c23601 = new C23600(c23600.f75123 + iM12343, i9, i2 + iM12343, i10);
                if (!c23601.m52411()) {
                    arrayList.add(c23601);
                }
            } else {
                return C24941.m54809(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
