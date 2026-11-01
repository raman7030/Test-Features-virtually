package p067l;

/* JADX INFO: renamed from: l.᩹ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4PA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23696 {

    /* JADX INFO: renamed from: ֫ */
    public C25017 f75419;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo12334(int i, InterfaceC13638 interfaceC13638);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo12335(InterfaceC13638 interfaceC13638);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo25143(C16299 c16299, String[] strArr);

    /* JADX INFO: renamed from: ۧ */
    public abstract String[] mo14376();

    public AbstractC23696(C25017 c25017) {
        this.f75419 = c25017;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m52705(InterfaceC13638 interfaceC13638, int i, C21685 c21685) {
        Object objMo12335 = mo12335(interfaceC13638);
        if (interfaceC13638.mo31015(1) == i) {
            interfaceC13638.mo31016();
            this.f75419.f79863 = false;
            return objMo12335;
        }
        return mo12336(interfaceC13638, i, c21685);
    }

    /* JADX INFO: renamed from: ۧ */
    public Object mo12336(InterfaceC13638 interfaceC13638, int i, C21685 c21685) throws C9614 {
        if (interfaceC13638.mo31015(2) == i) {
            C16299 c11607 = new C11607(i, interfaceC13638);
            interfaceC13638.mo31016();
            m52707(c11607);
            Object objMo12335 = mo12335(interfaceC13638);
            interfaceC13638.mo31016();
            return objMo12335;
        }
        if (c21685 != null) {
            if (c21685.m48960(1)) {
                C21685 c21685M52706 = m52706(true);
                c21685 = (C21685) c21685.clone();
                c21685.m48959(c21685M52706);
                if (this.f75419.f79862 >= 0) {
                    c21685.m48958();
                }
            }
            if (c21685.m48960(interfaceC13638.mo31015(1)) || c21685.m48960(1)) {
                Object objMo12334 = mo12334(i, interfaceC13638);
                C12948 c12948 = new C12948(i, interfaceC13638);
                c12948.f36409 = objMo12334;
                m52707(c12948);
                return objMo12334;
            }
        }
        throw new C9614(i, interfaceC13638);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52707(C16299 c16299) {
        C25017 c25017 = this.f75419;
        if (c25017.f79863) {
            return;
        }
        c25017.f79865++;
        c25017.f79863 = true;
        mo25143(c16299, mo14376());
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo12337(C16299 c16299, String[] strArr) {
        String message = c16299.getMessage();
        if (c16299 instanceof C11607) {
            C11607 c11607 = (C11607) c16299;
            int i = c11607.f26484;
            return "extraneous input " + mo35610(c11607.f47905) + " expecting " + (i != -1 ? strArr[i] : "EOF");
        }
        if (c16299 instanceof C12948) {
            int i2 = ((C12948) c16299).f26484;
            StringBuilder sbM11879 = C5410.m11879("missing ", i2 != -1 ? strArr[i2] : "EOF", " at ");
            sbM11879.append(mo35610(c16299.f47905));
            return sbM11879.toString();
        }
        if (c16299 instanceof C9614) {
            int i3 = ((C9614) c16299).f26484;
            return "mismatched input " + mo35610(c16299.f47905) + " expecting " + (i3 != -1 ? strArr[i3] : "EOF");
        }
        if (c16299 instanceof C4230) {
            C4230 c4230 = (C4230) c16299;
            int i4 = c4230.f9310;
            return "mismatched tree node: " + c4230.f47903 + " expecting " + (i4 != -1 ? strArr[i4] : "EOF");
        }
        if (c16299 instanceof C18311) {
            return "no viable alternative at input " + mo35610(c16299.f47905);
        }
        if (c16299 instanceof C12297) {
            return "required (...)+ loop did not match anything at input " + mo35610(c16299.f47905);
        }
        if (c16299 instanceof C15648) {
            return "mismatched input " + mo35610(c16299.f47905) + " expecting set null";
        }
        if (c16299 instanceof C24366) {
            return "mismatched input " + mo35610(c16299.f47905) + " expecting set null";
        }
        if (!(c16299 instanceof C8273)) {
            return message;
        }
        C8273 c8273 = (C8273) c16299;
        StringBuilder sb = new StringBuilder("rule ");
        sb.append(c8273.f21915);
        sb.append(" failed predicate: {");
        return C10965.m25286(sb, c8273.f21916, "}?");
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52704() {
        return this.f75419.f79865;
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo35610(InterfaceC8924 interfaceC8924) {
        String text = interfaceC8924.getText();
        if (text == null) {
            if (interfaceC8924.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC8924.getType() + ">";
            }
        }
        return C6988.m16053("'", text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t"), "'");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52709(InterfaceC13638 interfaceC13638) {
        C25017 c25017 = this.f75419;
        if (c25017.f79866 == interfaceC13638.index()) {
            interfaceC13638.mo31016();
        }
        c25017.f79866 = interfaceC13638.index();
        C21685 c21685M52706 = m52706(false);
        int iMo31015 = interfaceC13638.mo31015(1);
        while (iMo31015 != -1 && !c21685M52706.m48960(iMo31015)) {
            interfaceC13638.mo31016();
            iMo31015 = interfaceC13638.mo31015(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21685 m52706(boolean z) {
        C25017 c25017 = this.f75419;
        C21685 c21685 = new C21685();
        for (int i = c25017.f79862; i >= 0; i--) {
            C21685 c21686 = c25017.f79864[i];
            c21685.m48959(c21686);
            if (z) {
                if (!c21686.m48960(1)) {
                    break;
                }
                if (i > 0) {
                    c21685.m48958();
                }
            }
        }
        return c21685;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52708(C21685 c21685) {
        C25017 c25017 = this.f75419;
        int i = c25017.f79862 + 1;
        C21685[] c21685Arr = c25017.f79864;
        if (i >= c21685Arr.length) {
            C21685[] c21685Arr2 = new C21685[c21685Arr.length * 2];
            System.arraycopy(c21685Arr, 0, c21685Arr2, 0, c21685Arr.length);
            c25017.f79864 = c21685Arr2;
        }
        C21685[] c21685Arr3 = c25017.f79864;
        int i2 = c25017.f79862 + 1;
        c25017.f79862 = i2;
        c21685Arr3[i2] = c21685;
    }
}
