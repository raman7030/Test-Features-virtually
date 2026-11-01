package p067l;

import android.text.Selection;
import android.view.View;

/* JADX INFO: renamed from: l.ۙᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6946 extends C12962 {

    /* JADX INFO: renamed from: ᩻ */
    public static final C21699 f18071 = new C21699();

    /* JADX INFO: renamed from: ܳ */
    public final String f18072;

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15922() {
        return true;
    }

    public C6946(String str) {
        super(0);
        C12826.requireNonNull(str);
        this.f18072 = str;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ֫ */
    public final String mo15919() {
        return this.f18072;
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15921(View view, C12096 c12096) {
        int[] iArrM15918 = m15918(c12096.m32500());
        if (iArrM15918 != null) {
            c12096.mo27944(iArrM15918[0], iArrM15918[1]);
            return;
        }
        int iM32508 = c12096.m32508();
        int iM32512 = c12096.m32512();
        if (iM32508 != iM32512) {
            c12096.mo27941(iM32512);
        }
    }

    @Override // p067l.C12962
    /* JADX INFO: renamed from: ֫ */
    public final void mo15920(View view, InterfaceC4244 interfaceC4244) {
        C14146 c14146Mo8623 = interfaceC4244.mo8623();
        if (c14146Mo8623 == null) {
            return;
        }
        int[] iArrM15918 = m15918(c14146Mo8623.m32500());
        if (iArrM15918 != null) {
            c14146Mo8623.mo27944(iArrM15918[0], iArrM15918[1]);
            c14146Mo8623.m32575();
        } else {
            int iM32508 = c14146Mo8623.m32508();
            int iM32512 = c14146Mo8623.m32512();
            if (iM32508 != iM32512) {
                c14146Mo8623.mo27941(iM32512);
            }
        }
        c14146Mo8623.m32409(false);
    }

    /* JADX INFO: renamed from: ֫ */
    private int[] m15918(InterfaceC9768 interfaceC9768) {
        StringBuilder sb = new StringBuilder();
        int selectionEnd = Selection.getSelectionEnd(interfaceC9768);
        int[] iArr = {Selection.getSelectionStart(interfaceC9768), selectionEnd};
        int i = iArr[0];
        if (i > selectionEnd) {
            iArr[0] = selectionEnd;
            iArr[1] = i;
        }
        InterfaceC16809 interfaceC16809M4229 = C2728.m4229(this.f18072.toCharArray());
        int[] iArr2 = null;
        while (interfaceC16809M4229.hasNext()) {
            char cMo9752 = interfaceC16809M4229.mo9752();
            if (cMo9752 == '$' && interfaceC16809M4229.hasNext()) {
                char cMo9753 = interfaceC16809M4229.mo9752();
                if (cMo9753 == '$') {
                    sb.append('$');
                } else if (cMo9753 != 'E') {
                    if (cMo9753 == 'S') {
                        iArr2 = new int[]{sb.length(), sb.length()};
                    } else if (cMo9753 == 'T') {
                        sb.append(interfaceC9768.subSequence(iArr[0], iArr[1]).toString());
                    }
                } else if (iArr2 != null) {
                    iArr2[1] = sb.length();
                } else {
                    iArr2 = new int[]{sb.length(), sb.length()};
                }
            } else {
                sb.append(cMo9752);
            }
        }
        interfaceC9768.replace(iArr[0], iArr[1], sb.toString());
        if (iArr2 != null) {
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[0];
        }
        return iArr2;
    }
}
