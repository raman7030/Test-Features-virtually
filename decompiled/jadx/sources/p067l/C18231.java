package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: MASO */
/* JADX INFO: loaded from: classes4.dex */
public class C18231 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f54409 = false;

    /* JADX INFO: renamed from: ۧ */
    public int f54410 = -1;

    /* JADX INFO: renamed from: ܽ */
    public C25117 f54411;

    /* JADX INFO: renamed from: ܿ */
    public int f54412;

    /* JADX INFO: renamed from: ᩳ */
    public C10856 f54413;

    /* JADX INFO: renamed from: ۧ */
    public final void m41466(AbstractC11527 abstractC11527) {
        if (this.f54409) {
            return;
        }
        this.f54409 = true;
        InterfaceC2808 interfaceC2808M26581 = abstractC11527.m26581();
        String strM41463 = m41463(interfaceC2808M26581);
        C25117 c25117M26587 = abstractC11527.m26587();
        StringBuilder sbM11879 = C5410.m11879("extraneous input ", strM41463, " expecting ");
        sbM11879.append(c25117M26587.m55124(abstractC11527.mo3739()));
        abstractC11527.m26573(interfaceC2808M26581, sbM11879.toString(), (C4821) null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX INFO: renamed from: ۧ */
    public final void m41467(AbstractC11527 abstractC11527, C4821 c4821) {
        String string;
        if (this.f54409) {
            return;
        }
        this.f54409 = true;
        if (!(c4821 instanceof C22256)) {
            if (c4821 instanceof C18902) {
                C4821 c4822 = (C18902) c4821;
                abstractC11527.m26573(c4822.m10225(), "mismatched input " + m41463(c4822.m10225()) + " expecting " + c4822.m10221().m55124(abstractC11527.mo3739()), c4822);
                return;
            }
            if (!(c4821 instanceof C19573)) {
                System.err.println("unknown recognition error type: ".concat(c4821.getClass().getName()));
                abstractC11527.m26573(c4821.m10225(), c4821.getMessage(), c4821);
                return;
            }
            C4821 c4823 = (C19573) c4821;
            StringBuilder sbM11879 = C5410.m11879("rule ", abstractC11527.mo6483()[abstractC11527.f32154.mo3481()], " ");
            sbM11879.append(c4823.getMessage());
            abstractC11527.m26573(c4823.m10225(), sbM11879.toString(), c4823);
            return;
        }
        C22256 c22256 = (C22256) c4821;
        C4150 c4150 = abstractC11527.f32157;
        if (c4150 == null) {
            string = "<unknown input>";
        } else if (c22256.m50084().getType() == -1) {
            string = "<EOF>";
        } else {
            InterfaceC2808 interfaceC2808M50084 = c22256.m50084();
            InterfaceC2808 interfaceC2808M10225 = c22256.m10225();
            c4150.getClass();
            if (interfaceC2808M50084 == null || interfaceC2808M10225 == null) {
                string = "";
            } else {
                C16399 c16399M37214 = C16399.m37214(interfaceC2808M50084.mo4432(), interfaceC2808M10225.mo4432());
                ArrayList arrayList = c4150.f9166;
                int i = c16399M37214.f48195;
                int size = c16399M37214.f48196;
                if (i < 0 || size < 0) {
                    string = "";
                } else {
                    c4150.m8414(size);
                    if (size >= arrayList.size()) {
                        size = arrayList.size() - 1;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i <= size) {
                        InterfaceC2808 interfaceC2808 = (InterfaceC2808) arrayList.get(i);
                        if (interfaceC2808.getType() == -1) {
                            break;
                        }
                        sb.append(interfaceC2808.getText());
                        i++;
                    }
                    string = sb.toString();
                }
            }
        }
        abstractC11527.m26573(c22256.m10225(), "no viable alternative at input " + m41462(string), c22256);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41465() {
        this.f54409 = false;
        this.f54411 = null;
        this.f54410 = -1;
    }

    /* JADX INFO: renamed from: ܿ */
    public static C25117 m41464(AbstractC11527 abstractC11527) {
        C22926 c22926 = ((C24525) abstractC11527.f62583).f38088;
        C25117 c25117 = new C25117(new int[0]);
        for (C10856 c10856 = abstractC11527.f32154; c10856 != null; c10856 = c10856.f65695) {
            int i = c10856.f65694;
            if (i < 0) {
                break;
            }
            c25117.m55127(c22926.m51242(((C10642) ((AbstractC24266) c22926.f72152.get(i)).m53604(0)).f29431));
        }
        c25117.m55130();
        return c25117;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo28299(AbstractC11527 abstractC11527) {
        AbstractC24266 abstractC24266 = (AbstractC24266) ((C24525) abstractC11527.f62583).f38088.f72152.get(abstractC11527.m45731());
        if (this.f54409) {
            return;
        }
        int iMo8405 = abstractC11527.f32157.mo8405(1);
        C25117 c25117M51242 = abstractC11527.mo3738().m51242(abstractC24266);
        if (c25117M51242.m55129(iMo8405)) {
            this.f54413 = null;
            this.f54412 = -1;
            return;
        }
        if (c25117M51242.m55129(-2)) {
            if (this.f54413 == null) {
                this.f54413 = abstractC11527.f32154;
                this.f54412 = abstractC11527.m45731();
                return;
            }
            return;
        }
        int iMo15093 = abstractC24266.mo15093();
        if (iMo15093 != 3 && iMo15093 != 4 && iMo15093 != 5) {
            switch (iMo15093) {
                case 9:
                case 11:
                    m41466(abstractC11527);
                    C25117 c25117M26587 = abstractC11527.m26587();
                    C25117 c25117M41464 = m41464(abstractC11527);
                    C25117 c25117 = new C25117(new int[0]);
                    c25117.m55127(c25117M26587);
                    c25117.m55127(c25117M41464);
                    int iMo8406 = abstractC11527.f32157.mo8405(1);
                    while (iMo8406 != -1 && !c25117.m55129(iMo8406)) {
                        abstractC11527.mo11991();
                        iMo8406 = abstractC11527.f32157.mo8405(1);
                    }
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m41468(abstractC11527) == null) {
            throw new C18902(abstractC11527);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo28298(AbstractC11527 abstractC11527, C4821 c4821) {
        C25117 c25117;
        if (this.f54410 == abstractC11527.f32157.index() && (c25117 = this.f54411) != null && c25117.m55129(abstractC11527.m45731())) {
            abstractC11527.mo11991();
        }
        this.f54410 = abstractC11527.f32157.index();
        if (this.f54411 == null) {
            this.f54411 = new C25117(new int[0]);
        }
        this.f54411.m55125(abstractC11527.m45731());
        C25117 c25117M41464 = m41464(abstractC11527);
        int iMo8405 = abstractC11527.f32157.mo8405(1);
        while (iMo8405 != -1 && !c25117M41464.m55129(iMo8405)) {
            abstractC11527.mo11991();
            iMo8405 = abstractC11527.f32157.mo8405(1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC2808 mo28297(AbstractC11527 abstractC11527) {
        String str;
        InterfaceC2808 interfaceC2808M41468 = m41468(abstractC11527);
        if (interfaceC2808M41468 != null) {
            abstractC11527.mo11991();
            return interfaceC2808M41468;
        }
        if (((C24525) abstractC11527.f62583).f38088.m51243(((AbstractC24266) ((C24525) abstractC11527.f62583).f38088.f72152.get(abstractC11527.m45731())).m53604(0).f41850, abstractC11527.f32154).m55129(abstractC11527.f32157.mo8405(1))) {
            if (!this.f54409) {
                this.f54409 = true;
                InterfaceC2808 interfaceC2808M26581 = abstractC11527.m26581();
                abstractC11527.m26573(interfaceC2808M26581, "missing " + abstractC11527.m26587().m55124(abstractC11527.mo3739()) + " at " + m41463(interfaceC2808M26581), (C4821) null);
            }
            InterfaceC2808 interfaceC2808M26582 = abstractC11527.m26581();
            C25117 c25117M26587 = abstractC11527.m26587();
            int iM55123 = !c25117M26587.m55128() ? c25117M26587.m55123() : 0;
            if (iM55123 == -1) {
                str = "<missing EOF>";
            } else {
                str = "<missing " + abstractC11527.mo3739().m38444(iM55123) + ">";
            }
            String str2 = str;
            InterfaceC2808 interfaceC2808Mo8413 = abstractC11527.f32157.mo8413(-1);
            if (interfaceC2808M26582.getType() == -1 && interfaceC2808Mo8413 != null) {
                interfaceC2808M26582 = interfaceC2808Mo8413;
            }
            return abstractC11527.f32157.f9165.mo6210().mo6090(new C22436(interfaceC2808M26582.mo4431(), interfaceC2808M26582.mo4431().getInputStream()), iM55123, str2, 0, -1, -1, interfaceC2808M26582.getLine(), interfaceC2808M26582.mo4429());
        }
        if (this.f54413 != null) {
            int i = this.f54412;
            C18902 c18902 = new C18902(abstractC11527, abstractC11527.f32157, this.f54413);
            c18902.m10222(i);
            c18902.m10223(abstractC11527.m26581());
            throw c18902;
        }
        throw new C18902(abstractC11527);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC2808 m41468(AbstractC11527 abstractC11527) {
        if (!abstractC11527.m26587().m55129(abstractC11527.f32157.mo8405(2))) {
            return null;
        }
        m41466(abstractC11527);
        abstractC11527.mo11991();
        InterfaceC2808 interfaceC2808M26581 = abstractC11527.m26581();
        this.f54409 = false;
        this.f54411 = null;
        this.f54410 = -1;
        return interfaceC2808M26581;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m41463(InterfaceC2808 interfaceC2808) {
        if (interfaceC2808 == null) {
            return "<no token>";
        }
        String text = interfaceC2808.getText();
        if (text == null) {
            if (interfaceC2808.getType() == -1) {
                text = "<EOF>";
            } else {
                text = "<" + interfaceC2808.getType() + ">";
            }
        }
        return m41462(text);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m41462(String str) {
        return C6988.m16053("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }
}
