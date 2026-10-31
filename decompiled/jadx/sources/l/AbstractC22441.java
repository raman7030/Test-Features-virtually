package l;

/* JADX INFO: renamed from: l.᩹ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4PA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22441 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23831 f72693;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo10297(int i, InterfaceC11858 interfaceC11858);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo10298(InterfaceC11858 interfaceC11858);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo23199(C14658 c14658, String[] strArr);

    /* JADX INFO: renamed from: ۧ */
    public abstract String[] mo12486();

    public AbstractC22441(C23831 c23831) {
        this.f72693 = c23831;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50364(InterfaceC11858 interfaceC11858, int i, C20325 c20325) {
        Object objMo10298 = mo10298(interfaceC11858);
        if (interfaceC11858.mo28964(1) == i) {
            interfaceC11858.mo28965();
            this.f72693.f77112 = false;
            return objMo10298;
        }
        return mo10299(interfaceC11858, i, c20325);
    }

    /* JADX INFO: renamed from: ۧ */
    public Object mo10299(InterfaceC11858 interfaceC11858, int i, C20325 c20325) throws C7624 {
        if (interfaceC11858.mo28964(2) == i) {
            C14658 c9721 = new C9721(i, interfaceC11858);
            interfaceC11858.mo28965();
            m50366(c9721);
            Object objMo10298 = mo10298(interfaceC11858);
            interfaceC11858.mo28965();
            return objMo10298;
        }
        if (c20325 != null) {
            if (c20325.m46637(1)) {
                C20325 c20325M50365 = m50365(true);
                c20325 = (C20325) c20325.clone();
                c20325.m46636(c20325M50365);
                if (this.f72693.f77111 >= 0) {
                    c20325.m46635();
                }
            }
            if (c20325.m46637(interfaceC11858.mo28964(1)) || c20325.m46637(1)) {
                Object objMo10297 = mo10297(i, interfaceC11858);
                C11132 c11132 = new C11132(i, interfaceC11858);
                c11132.f33409 = objMo10297;
                m50366(c11132);
                return objMo10297;
            }
        }
        throw new C7624(i, interfaceC11858);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50366(C14658 c14658) {
        C23831 c23831 = this.f72693;
        if (c23831.f77112) {
            return;
        }
        c23831.f77114++;
        c23831.f77112 = true;
        mo23199(c14658, mo12486());
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo10300(C14658 c14658, String[] strArr) {
        String message = c14658.getMessage();
        if (c14658 instanceof C9721) {
            C9721 c9721 = (C9721) c14658;
            int i = c9721.f23571;
            return "extraneous input " + mo33490(c9721.f44795) + " expecting " + (i != -1 ? strArr[i] : "EOF");
        }
        if (c14658 instanceof C11132) {
            int i2 = ((C11132) c14658).f23571;
            StringBuilder sbM9834 = C3200.m9834("missing ", i2 != -1 ? strArr[i2] : "EOF", " at ");
            sbM9834.append(mo33490(c14658.f44795));
            return sbM9834.toString();
        }
        if (c14658 instanceof C7624) {
            int i3 = ((C7624) c14658).f23571;
            return "mismatched input " + mo33490(c14658.f44795) + " expecting " + (i3 != -1 ? strArr[i3] : "EOF");
        }
        if (c14658 instanceof C1959) {
            C1959 c1959 = (C1959) c14658;
            int i4 = c1959.f6531;
            return "mismatched tree node: " + c1959.f44793 + " expecting " + (i4 != -1 ? strArr[i4] : "EOF");
        }
        if (c14658 instanceof C16775) {
            return "no viable alternative at input " + mo33490(c14658.f44795);
        }
        if (c14658 instanceof C10447) {
            return "required (...)+ loop did not match anything at input " + mo33490(c14658.f44795);
        }
        if (c14658 instanceof C13973) {
            return "mismatched input " + mo33490(c14658.f44795) + " expecting set null";
        }
        if (c14658 instanceof C23146) {
            return "mismatched input " + mo33490(c14658.f44795) + " expecting set null";
        }
        if (!(c14658 instanceof C6213)) {
            return message;
        }
        C6213 c6213 = (C6213) c14658;
        StringBuilder sb = new StringBuilder("rule ");
        sb.append(c6213.f19052);
        sb.append(" failed predicate: {");
        return C9045.m23341(sb, c6213.f19053, "}?");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50363() {
        return this.f72693.f77114;
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo33490(InterfaceC6898 interfaceC6898) {
        String text = interfaceC6898.getText();
        if (text == null) {
            if (interfaceC6898.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC6898.getType() + ">";
            }
        }
        return C4860.m14172("'", text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t"), "'");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50368(InterfaceC11858 interfaceC11858) {
        C23831 c23831 = this.f72693;
        if (c23831.f77115 == interfaceC11858.index()) {
            interfaceC11858.mo28965();
        }
        c23831.f77115 = interfaceC11858.index();
        C20325 c20325M50365 = m50365(false);
        int iMo28964 = interfaceC11858.mo28964(1);
        while (iMo28964 != -1 && !c20325M50365.m46637(iMo28964)) {
            interfaceC11858.mo28965();
            iMo28964 = interfaceC11858.mo28964(1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20325 m50365(boolean z) {
        C23831 c23831 = this.f72693;
        C20325 c20325 = new C20325();
        for (int i = c23831.f77111; i >= 0; i--) {
            C20325 c20326 = c23831.f77113[i];
            c20325.m46636(c20326);
            if (z) {
                if (!c20326.m46637(1)) {
                    break;
                }
                if (i > 0) {
                    c20325.m46635();
                }
            }
        }
        return c20325;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50367(C20325 c20325) {
        C23831 c23831 = this.f72693;
        int i = c23831.f77111 + 1;
        C20325[] c20325Arr = c23831.f77113;
        if (i >= c20325Arr.length) {
            C20325[] c20325Arr2 = new C20325[c20325Arr.length * 2];
            System.arraycopy(c20325Arr, 0, c20325Arr2, 0, c20325Arr.length);
            c23831.f77113 = c20325Arr2;
        }
        C20325[] c20325Arr3 = c23831.f77113;
        int i2 = c23831.f77111 + 1;
        c23831.f77111 = i2;
        c20325Arr3[i2] = c20325;
    }
}
