package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes.dex */
public final class C23553 implements TextWatcher {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ boolean f75017;

    /* JADX INFO: renamed from: ᩸ */
    public int f75018;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9471 f75019;

    public C23553(C9471 c9471, boolean z) {
        this.f75019 = c9471;
        this.f75017 = z;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list = this.f75019.f25931;
        if (list == null || list.isEmpty() || i2 == 0) {
            return;
        }
        C9729 c9729Mo28589 = ((InterfaceC21800) charSequence).mo28589();
        if (i2 == 1) {
            int i4 = i + 1;
            try {
                if (i4 < c9729Mo28589.length() && c9729Mo28589.charAt(i) == '\n' && c9729Mo28589.charAt(i4) == '\n') {
                    i = i4;
                }
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m52338(i, i2, list);
        int iM22745 = c9729Mo28589.m22745(i);
        this.f75018 = iM22745;
        int iM22746 = c9729Mo28589.m22745(i + i2) - iM22745;
        boolean z = this.f75017;
        if (iM22746 > 0) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                InterfaceC2812 interfaceC2812 = (InterfaceC2812) list.get(i5);
                int iMo4446 = interfaceC2812.mo4446(z);
                if (iMo4446 > iM22745) {
                    interfaceC2812.mo4449(Math.max(iM22745, iMo4446 - iM22746), z);
                }
                int iMo4450 = interfaceC2812.mo4450(z);
                if (iMo4450 > iM22745) {
                    interfaceC2812.mo4441(Math.max(iM22745, iMo4450 - iM22746), z);
                }
            }
        }
        C20814.m47019(z, list, new C22213(c9729Mo28589, i, i2));
        c9729Mo28589.close();
        C8123.m18820(list, new C22883());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m52338(int i, int i2, List list) {
        int i3 = i + i2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2812 interfaceC2812 = (InterfaceC2812) it.next();
            boolean z = this.f75017;
            int iMo17389 = interfaceC2812.mo17389(z);
            int iMo17394 = interfaceC2812.mo17394(z);
            List listMo4447 = interfaceC2812.mo4447();
            if (i <= iMo17389 && i3 >= iMo17394) {
                it.remove();
            } else if (i3 <= iMo17389) {
                interfaceC2812.mo17392(iMo17389 - i2, z);
                interfaceC2812.mo17399(iMo17394 - i2, z);
            } else if (i < iMo17394) {
                if (i > iMo17389 && i3 < iMo17394) {
                    interfaceC2812.mo17399(iMo17394 - i2, z);
                    if (listMo4447 != null) {
                        m52340(i - iMo17389, i2, listMo4447);
                    }
                } else if (i <= iMo17389) {
                    interfaceC2812.mo17392(i, z);
                    interfaceC2812.mo17399(iMo17394 - i2, z);
                    if (listMo4447 != null) {
                        m52340(0, i2 - (iMo17389 - i), listMo4447);
                    }
                } else {
                    interfaceC2812.mo17399(i, z);
                    if (listMo4447 != null) {
                        m52340(i - iMo17389, iMo17394 - i, listMo4447);
                    }
                }
            }
            if (listMo4447 != null && listMo4447.isEmpty()) {
                interfaceC2812.mo4442((List) null);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m52340(int i, int i2, List list) {
        int i3 = i + i2;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            InterfaceC20248 interfaceC20248 = (InterfaceC20248) list.get(size);
            boolean z = this.f75017;
            int iMo17389 = interfaceC20248.mo17389(z);
            int iMo17394 = interfaceC20248.mo17394(z);
            if (iMo17389 >= 0 && iMo17394 >= 0) {
                if (i3 <= iMo17389) {
                    interfaceC20248.mo17392(iMo17389 - i2, z);
                    interfaceC20248.mo17399(iMo17394 - i2, z);
                } else if (i < iMo17394) {
                    if (i <= iMo17389 && i3 >= iMo17394) {
                        boolean z2 = !z;
                        if (interfaceC20248.mo17389(z2) == -1 && interfaceC20248.mo17394(z2) == -1) {
                            list.remove(size);
                        } else {
                            interfaceC20248.mo17392(-1, z);
                            interfaceC20248.mo17399(-1, z);
                        }
                    } else if (i > iMo17389 && i3 < iMo17394) {
                        interfaceC20248.mo17399(iMo17394 - i2, z);
                    } else if (i <= iMo17389) {
                        interfaceC20248.mo17392(i, z);
                        interfaceC20248.mo17399(iMo17394 - i2, z);
                    } else {
                        interfaceC20248.mo17399(i, z);
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
        List list = this.f75019.f25931;
        if (list == null) {
            return;
        }
        if (i3 > 0 && !list.isEmpty()) {
            C9729 c9729Mo28589 = ((InterfaceC21800) charSequence).mo28589();
            try {
                m52339(i, i3, list);
                int iM22745 = i2 > 0 ? this.f75018 : c9729Mo28589.m22745(i);
                int iM22746 = c9729Mo28589.m22745(i + i3) - c9729Mo28589.m22745(i);
                if (iM22746 > 0) {
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        InterfaceC2812 interfaceC2812 = (InterfaceC2812) list.get(i6);
                        int iMo4446 = interfaceC2812.mo4446(this.f75017);
                        if (iMo4446 > iM22745) {
                            interfaceC2812.mo4449(iMo4446 + iM22746, this.f75017);
                        }
                        int iMo4450 = interfaceC2812.mo4450(this.f75017);
                        if (iMo4450 > iM22745) {
                            interfaceC2812.mo4441(iMo4450 + iM22746, this.f75017);
                        }
                    }
                }
                C20814.m47019(this.f75017, list, c9729Mo28589);
                c9729Mo28589.close();
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C8130 c8130 = this.f75019.f25941;
        boolean z = this.f75017;
        synchronized (c8130) {
            try {
                if (z) {
                    i4 = c8130.f21431;
                    i5 = c8130.f21430;
                } else {
                    i4 = c8130.f21433;
                    i5 = c8130.f21432;
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
                    c8130.f21431 = i;
                    c8130.f21430 = iMax;
                } else {
                    c8130.f21433 = i;
                    c8130.f21432 = iMax;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f75019.f25935 == 0) {
            this.f75019.m22057(true);
        } else {
            C4081.m8187(this.f75019.f25941, this.f75019.f25935, new RunnableC16670(1, this));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m52339(int i, int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2812 interfaceC2812 = (InterfaceC2812) it.next();
            boolean z = this.f75017;
            int iMo17389 = interfaceC2812.mo17389(z);
            int iMo17394 = interfaceC2812.mo17394(z);
            if (i <= iMo17389) {
                interfaceC2812.mo17392(iMo17389 + i2, z);
                interfaceC2812.mo17399(iMo17394 + i2, z);
            } else if (i < iMo17394) {
                interfaceC2812.mo17399(iMo17394 + i2, z);
                List<InterfaceC20248> listMo4447 = interfaceC2812.mo4447();
                if (listMo4447 != null) {
                    int i3 = i - iMo17389;
                    for (InterfaceC20248 interfaceC20248 : listMo4447) {
                        int iMo173810 = interfaceC20248.mo17389(z);
                        int iMo17395 = interfaceC20248.mo17394(z);
                        if (iMo173810 >= 0 && iMo17395 >= 0) {
                            if (i3 <= iMo173810) {
                                interfaceC20248.mo17392(iMo173810 + i2, z);
                                interfaceC20248.mo17399(iMo17395 + i2, z);
                            } else if (i3 < iMo17395) {
                                interfaceC20248.mo17399(iMo17395 + i2, z);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f75019.invalidate();
    }
}
