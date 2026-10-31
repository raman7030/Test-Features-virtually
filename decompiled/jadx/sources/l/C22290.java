package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public final class C22290 implements TextWatcher {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72294;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72295;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7473 f72296;

    public C22290(C7473 c7473, boolean z) {
        this.f72296 = c7473;
        this.f72294 = z;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list = this.f72296.f23019;
        if (list == null || list.isEmpty() || i2 == 0) {
            return;
        }
        C7744 c7744Mo26556 = ((InterfaceC20445) charSequence).mo26556();
        if (i2 == 1) {
            int i4 = i + 1;
            try {
                if (i4 < c7744Mo26556.length() && c7744Mo26556.charAt(i) == '\n' && c7744Mo26556.charAt(i4) == '\n') {
                    i = i4;
                }
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m50010(i, i2, list);
        int iM20765 = c7744Mo26556.m20765(i);
        this.f72295 = iM20765;
        int iM20766 = c7744Mo26556.m20765(i + i2) - iM20765;
        boolean z = this.f72294;
        if (iM20766 > 0) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i5);
                int iMo2066 = interfaceC0467.mo2066(z);
                if (iMo2066 > iM20765) {
                    interfaceC0467.mo2069(Math.max(iM20765, iMo2066 - iM20766), z);
                }
                int iMo2070 = interfaceC0467.mo2070(z);
                if (iMo2070 > iM20765) {
                    interfaceC0467.mo2061(Math.max(iM20765, iMo2070 - iM20766), z);
                }
            }
        }
        C19408.m44725(z, list, new C20880(c7744Mo26556, i, i2));
        c7744Mo26556.close();
        C6055.m16891(list, new C21585());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50010(int i, int i2, List list) {
        int i3 = i + i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            boolean z = this.f72294;
            int iMo15478 = interfaceC0467.mo15478(z);
            int iMo15483 = interfaceC0467.mo15483(z);
            List listMo2067 = interfaceC0467.mo2067();
            if (i <= iMo15478 && i3 >= iMo15483) {
                it.remove();
            } else if (i3 <= iMo15478) {
                interfaceC0467.mo15481(iMo15478 - i2, z);
                interfaceC0467.mo15488(iMo15483 - i2, z);
            } else if (i < iMo15483) {
                if (i > iMo15478 && i3 < iMo15483) {
                    interfaceC0467.mo15488(iMo15483 - i2, z);
                    if (listMo2067 != null) {
                        m50012(i - iMo15478, i2, listMo2067);
                    }
                } else if (i <= iMo15478) {
                    interfaceC0467.mo15481(i, z);
                    interfaceC0467.mo15488(iMo15483 - i2, z);
                    if (listMo2067 != null) {
                        m50012(0, i2 - (iMo15478 - i), listMo2067);
                    }
                } else {
                    interfaceC0467.mo15488(i, z);
                    if (listMo2067 != null) {
                        m50012(i - iMo15478, iMo15483 - i, listMo2067);
                    }
                }
            }
            if (listMo2067 != null && listMo2067.isEmpty()) {
                interfaceC0467.mo2062((List) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50012(int i, int i2, List list) {
        int i3 = i + i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC18813 interfaceC18813 = (InterfaceC18813) list.get(size);
            boolean z = this.f72294;
            int iMo15478 = interfaceC18813.mo15478(z);
            int iMo15483 = interfaceC18813.mo15483(z);
            if (iMo15478 >= 0 && iMo15483 >= 0) {
                if (i3 <= iMo15478) {
                    interfaceC18813.mo15481(iMo15478 - i2, z);
                    interfaceC18813.mo15488(iMo15483 - i2, z);
                } else if (i < iMo15483) {
                    if (i <= iMo15478 && i3 >= iMo15483) {
                        boolean z2 = !z;
                        if (interfaceC18813.mo15478(z2) == -1 && interfaceC18813.mo15483(z2) == -1) {
                            list.remove(size);
                        } else {
                            interfaceC18813.mo15481(-1, z);
                            interfaceC18813.mo15488(-1, z);
                        }
                    } else if (i > iMo15478 && i3 < iMo15483) {
                        interfaceC18813.mo15488(iMo15483 - i2, z);
                    } else if (i <= iMo15478) {
                        interfaceC18813.mo15481(i, z);
                        interfaceC18813.mo15488(iMo15483 - i2, z);
                    } else {
                        interfaceC18813.mo15488(i, z);
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int iMax;
        List list = this.f72296.f23019;
        if (list == null) {
            return;
        }
        if (i3 > 0 && !list.isEmpty()) {
            C7744 c7744Mo26556 = ((InterfaceC20445) charSequence).mo26556();
            try {
                m50011(i, i3, list);
                int iM20765 = i2 > 0 ? this.f72295 : c7744Mo26556.m20765(i);
                int iM20766 = c7744Mo26556.m20765(i + i3) - c7744Mo26556.m20765(i);
                if (iM20766 > 0) {
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        InterfaceC0467 interfaceC0467 = (InterfaceC0467) list.get(i6);
                        int iMo2066 = interfaceC0467.mo2066(this.f72294);
                        if (iMo2066 > iM20765) {
                            interfaceC0467.mo2069(iMo2066 + iM20766, this.f72294);
                        }
                        int iMo2070 = interfaceC0467.mo2070(this.f72294);
                        if (iMo2070 > iM20765) {
                            interfaceC0467.mo2061(iMo2070 + iM20766, this.f72294);
                        }
                    }
                }
                C19408.m44725(this.f72294, list, c7744Mo26556);
                c7744Mo26556.close();
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C6062 c6062 = this.f72296.f23029;
        boolean z = this.f72294;
        synchronized (c6062) {
            try {
                if (z) {
                    i4 = c6062.f18575;
                    i5 = c6062.f18574;
                } else {
                    i4 = c6062.f18577;
                    i5 = c6062.f18576;
                }
                if (i4 == -1 && i5 == -1) {
                    iMax = i3 + i;
                } else {
                    if (i < i4) {
                        i4 = i;
                    }
                    if (i2 > 0 && i < i5 && (i5 = i5 - i2) < i) {
                        i5 = i;
                    }
                    if (i3 > 0) {
                        iMax = i3 + Math.max(i, i5);
                        i = i4;
                    } else {
                        i = i4;
                        iMax = i5;
                    }
                }
                if (z) {
                    c6062.f18575 = i;
                    c6062.f18574 = iMax;
                } else {
                    c6062.f18577 = i;
                    c6062.f18576 = iMax;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f72296.f23023 == 0) {
            this.f72296.m20082(true);
        } else {
            C1802.m5990(this.f72296.f23029, this.f72296.f23023, new RunnableC15048(1, this));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50011(int i, int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0467 interfaceC0467 = (InterfaceC0467) it.next();
            boolean z = this.f72294;
            int iMo15478 = interfaceC0467.mo15478(z);
            int iMo15483 = interfaceC0467.mo15483(z);
            if (i <= iMo15478) {
                interfaceC0467.mo15481(iMo15478 + i2, z);
                interfaceC0467.mo15488(iMo15483 + i2, z);
            } else if (i < iMo15483) {
                interfaceC0467.mo15488(iMo15483 + i2, z);
                List<InterfaceC18813> listMo2067 = interfaceC0467.mo2067();
                if (listMo2067 != null) {
                    int i3 = i - iMo15478;
                    for (InterfaceC18813 interfaceC18813 : listMo2067) {
                        int iMo15479 = interfaceC18813.mo15478(z);
                        int iMo15484 = interfaceC18813.mo15483(z);
                        if (iMo15479 >= 0 && iMo15484 >= 0) {
                            if (i3 <= iMo15479) {
                                interfaceC18813.mo15481(iMo15479 + i2, z);
                                interfaceC18813.mo15488(iMo15484 + i2, z);
                            } else if (i3 < iMo15484) {
                                interfaceC18813.mo15488(iMo15484 + i2, z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f72296.invalidate();
    }
}
