package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ۗᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Y43E */
/* JADX INFO: loaded from: classes3.dex */
public final class C3419 extends C12696 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f10792 = {"", EnumC0121.f1143, ASN1Dump.TAB, "      ", EnumC0121.f1160, "          ", "            ", "              ", "                ", "                  ", "                    "};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4935 f10793;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10794 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PrintWriter f10795;

    public C3419(PrintWriter printWriter, C21290 c21290) {
        this.f10795 = new PrintWriter(printWriter);
        this.f10793 = c21290;
    }

    @Override // l.C10580, l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10386(C0052 c0052, Object obj) {
        m10394((InterfaceC11970) c0052, Boolean.FALSE);
        boolean zM954 = c0052.m954();
        PrintWriter printWriter = this.f10795;
        if (zM954) {
            printWriter.println("// Unnamed module");
            return this;
        }
        if (c0052.f916.contains(EnumC18398.OPEN)) {
            printWriter.print("open ");
        }
        printWriter.println("module " + ((Object) c0052.f17562) + " {");
        this.f10794 = this.f10794 + 1;
        c0052.m16103();
        InterfaceC6403 interfaceC6403 = c0052.f923;
        InterfaceC6403 interfaceC6404 = InterfaceC6403.f19811;
        if (interfaceC6403 != interfaceC6404) {
            c0052.f923 = interfaceC6404;
            interfaceC6403.mo7076(c0052);
        }
        for (InterfaceC11286 interfaceC11286 : C20195.unmodifiableList(c0052.f920)) {
            m10381();
            interfaceC11286.mo24769(new C4830(printWriter));
            printWriter.println(l.b);
        }
        this.f10794--;
        printWriter.println(l.d);
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10387(C3581 c3581, Object obj) {
        EnumC23258 enumC23258Mo952 = c3581.mo952();
        if (enumC23258Mo952 != EnumC23258.STATIC_INIT && enumC23258Mo952 != EnumC23258.INSTANCE_INIT) {
            InterfaceC11970 interfaceC11970Mo7176 = c3581.mo7176();
            if (enumC23258Mo952 != EnumC23258.CONSTRUCTOR || interfaceC11970Mo7176 == null || EnumC23985.ANONYMOUS != interfaceC11970Mo7176.mo951(new C22469(), null)) {
                m10394((InterfaceC11970) c3581, Boolean.TRUE);
                m10383((InterfaceC7052) c3581, true);
                int i = C15412.f47205[enumC23258Mo952.ordinal()];
                PrintWriter printWriter = this.f10795;
                if (i == 1) {
                    printWriter.print(c3581.mo7176().mo960());
                } else if (i == 2) {
                    printWriter.print(c3581.mo7179().toString());
                    printWriter.print(" ");
                    printWriter.print(c3581.mo960().toString());
                }
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                m10384((InterfaceC14085) c3581);
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
                AbstractC8624 abstractC8624Mo7175 = c3581.mo7175();
                if (abstractC8624Mo7175 != null) {
                    printWriter.print(" default " + abstractC8624Mo7175);
                }
                C2609<InterfaceC5641> c2609Mo7174 = c3581.mo7174();
                int iM8245 = c2609Mo7174.m8245();
                if (iM8245 != 0) {
                    printWriter.print(" throws");
                    int i2 = 1;
                    for (InterfaceC5641 interfaceC5641 : c2609Mo7174) {
                        if (i2 == 1) {
                            printWriter.print(" ");
                        }
                        if (i2 == 2) {
                            this.f10794++;
                        }
                        if (i2 >= 2) {
                            m10381();
                        }
                        printWriter.print(interfaceC5641);
                        if (i2 != iM8245) {
                            printWriter.println(", ");
                        }
                        i2++;
                    }
                    if (iM8245 >= 2) {
                        this.f10794--;
                    }
                }
                printWriter.println(l.b);
            }
        }
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10388(C4287 c4287, Object obj) {
        this.f10795.print(c4287.f17562);
        return this;
    }

    @Override // l.C10580
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo10389(AbstractC5698 abstractC5698, Object obj) {
        m10394((InterfaceC11970) abstractC5698, (Boolean) obj);
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10390(C7814 c7814, Object obj) {
        m10394((InterfaceC11970) c7814, Boolean.FALSE);
        boolean zM20880 = c7814.m20880();
        PrintWriter printWriter = this.f10795;
        if (!zM20880) {
            printWriter.println("package " + ((Object) c7814.f24143) + l.b);
            return this;
        }
        printWriter.println("// Unnamed package");
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10391(C12048 c12048, Object obj) {
        EnumC23258 enumC23258Mo952 = c12048.mo952();
        m10394((InterfaceC11970) c12048, (Boolean) obj);
        EnumC23258 enumC23258 = EnumC23258.ENUM_CONSTANT;
        PrintWriter printWriter = this.f10795;
        if (enumC23258Mo952 == enumC23258) {
            printWriter.print(c12048.mo960());
            return this;
        }
        printWriter.print(c12048.mo29242().toString() + " " + ((Object) c12048.mo960()));
        Object objM29424 = c12048.m29424();
        if (objM29424 != null) {
            printWriter.print(" = ");
            ((C21290) this.f10793).getClass();
            printWriter.print(C21953.m49443(objM29424));
        }
        printWriter.println(l.b);
        return this;
    }

    @Override // l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10392(C14163 c14163, Object obj) {
        EnumC23258 enumC23258Mo952 = c14163.mo952();
        EnumC23985 enumC23985M33812 = c14163.m33812();
        EnumC23985 enumC23985 = EnumC23985.ANONYMOUS;
        int i = 0;
        PrintWriter printWriter = this.f10795;
        if (enumC23985 == enumC23985M33812) {
            printWriter.print("new ");
            C2609 c2609M33806 = c14163.m33806();
            if (c2609M33806.isEmpty()) {
                printWriter.print(c14163.mo23577());
            } else {
                printWriter.print(c2609M33806.get(0));
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c2609M33806.isEmpty()) {
                ArrayList arrayListM36585 = C15517.m36585(c14163.mo958());
                if (!arrayListM36585.isEmpty()) {
                    m10384((InterfaceC14085) arrayListM36585.get(0));
                }
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            if (enumC23985M33812 == EnumC23985.TOP_LEVEL) {
                C7814 c7814M48321 = ((C21290) this.f10793).m48321(c14163);
                if (!c7814M48321.m20880()) {
                    printWriter.print("package " + ((Object) c7814M48321.f24143) + ";\n");
                }
            }
            m10394((InterfaceC11970) c14163, Boolean.TRUE);
            if (C15412.f47205[enumC23258Mo952.ordinal()] != 3) {
                printWriter.print(enumC23258Mo952.toString().toLowerCase(Locale.US));
            } else {
                printWriter.print("@interface");
            }
            printWriter.print(" ");
            printWriter.print(c14163.f17562);
            m10383((InterfaceC7052) c14163, false);
            if (enumC23258Mo952 == EnumC23258.RECORD) {
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                printWriter.print((String) C5378.stream(c14163.m33809()).map(new C14205(this)).collect(C22976.joining(", ")));
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (enumC23258Mo952 == EnumC23258.CLASS) {
                InterfaceC5641 interfaceC5641Mo23577 = c14163.mo23577();
                EnumC0701 enumC0701Mo3256 = interfaceC5641Mo23577.mo3256();
                EnumC0701 enumC0701 = EnumC0701.NONE;
                if (enumC0701Mo3256 != enumC0701 && ((InterfaceC9169) ((InterfaceC19753) interfaceC5641Mo23577).mo45454()).mo23577().mo3256() != enumC0701) {
                    printWriter.print(" extends " + interfaceC5641Mo23577);
                }
            }
            EnumC23258 enumC23258Mo953 = c14163.mo952();
            if (enumC23258Mo953 != EnumC23258.ANNOTATION_TYPE) {
                C2609 c2609M33807 = c14163.m33806();
                if (!c2609M33807.isEmpty()) {
                    printWriter.print(enumC23258Mo953.m51578() ? " implements " : " extends ");
                    printWriter.print((String) C5378.stream(c2609M33807).map(new C16599(7)).collect(C22976.joining(", ")));
                }
            }
            C2609 c2609M8243 = c14163.f42765.m8243((Function) new C22827(6));
            if (!c2609M8243.isEmpty()) {
                printWriter.print(" permits ");
                printWriter.print((String) C5378.stream(c2609M8243).map(new C6639(6)).collect(C22976.joining(", ")));
            }
        }
        printWriter.println(" {");
        this.f10794++;
        if (enumC23258Mo952 == EnumC23258.ENUM) {
            ArrayList<InterfaceC11970> arrayList = new ArrayList(c14163.mo958());
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC11970 interfaceC11970 : arrayList) {
                if (interfaceC11970.mo952() == EnumC23258.ENUM_CONSTANT) {
                    arrayList2.add(interfaceC11970);
                }
            }
            if (!arrayList2.isEmpty()) {
                while (i < arrayList2.size() - 1) {
                    ((InterfaceC11970) arrayList2.get(i)).mo951(this, Boolean.TRUE);
                    printWriter.print(",");
                    i++;
                }
                ((InterfaceC11970) arrayList2.get(i)).mo951(this, Boolean.TRUE);
                printWriter.println(";\n");
                arrayList.removeAll(arrayList2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC11970) it.next()).mo951(this, null);
            }
        } else {
            Iterator it2 = (enumC23258Mo952 != EnumC23258.RECORD ? c14163.mo958() : C5378.stream(c14163.mo958()).filter(new Predicate() { // from class: l.᩸ᩴ۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((C21290) this.f69733.f10793).m48326((InterfaceC11970) obj2) == EnumC20458.EXPLICIT;
                }
            }).toList()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC11970) it2.next()).mo951(this, null);
            }
        }
        this.f10794--;
        m10381();
        printWriter.println(l.d);
        return this;
    }

    @Override // l.C10580, l.AbstractC8463
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo10393(C21221 c21221, Object obj) {
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10394(InterfaceC11970 interfaceC11970, Boolean bool) {
        PrintWriter printWriter = this.f10795;
        if (bool != null && bool.booleanValue()) {
            printWriter.println();
        }
        String strM48325 = ((C21290) this.f10793).m48325(interfaceC11970);
        if (strM48325 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM48325, "\n\r");
            m10381();
            printWriter.println("/**");
            while (stringTokenizer.hasMoreTokens()) {
                m10381();
                printWriter.print(" *");
                printWriter.println(stringTokenizer.nextToken());
            }
            m10381();
            printWriter.println(" */");
        }
        m10385(interfaceC11970);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m10378(InterfaceC9875 interfaceC9875) {
        return m10379((InterfaceC11970) interfaceC9875) + interfaceC9875.mo29242().toString() + " " + ((Object) interfaceC9875.mo960());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m10385(InterfaceC11970 interfaceC11970) {
        EnumC23258 enumC23258Mo952 = interfaceC11970.mo952();
        EnumC23258 enumC23258 = EnumC23258.PARAMETER;
        PrintWriter printWriter = this.f10795;
        if (enumC23258Mo952 == enumC23258 || enumC23258Mo952 == EnumC23258.RECORD_COMPONENT) {
            printWriter.print(m10379(interfaceC11970));
        } else {
            for (InterfaceC12675 interfaceC12675 : interfaceC11970.mo7180()) {
                boolean zBooleanValue = false;
                if (((C21290) this.f10793).m48323(interfaceC12675) == EnumC20458.MANDATED) {
                    Set setEntrySet = interfaceC12675.mo30950().entrySet();
                    if (setEntrySet.size() == 1) {
                        AbstractC19810 abstractC19810Mo45454 = interfaceC12675.mo30951().mo45454();
                        InterfaceC10559 interfaceC10559 = (InterfaceC10559) ((Map.Entry) setEntrySet.iterator().next()).getValue();
                        if (abstractC19810Mo45454.mo952() == EnumC23258.ANNOTATION_TYPE) {
                            ArrayList arrayListM36586 = C15517.m36586(abstractC19810Mo45454.mo958());
                            if (arrayListM36586.size() == 1) {
                                InterfaceC14085 interfaceC14085 = (InterfaceC14085) arrayListM36586.get(0);
                                AbstractC4308 abstractC4308Mo7179 = interfaceC14085.mo7179();
                                if (b.d.equals(interfaceC14085.mo960().toString()) && abstractC4308Mo7179.mo3256() == EnumC0701.ARRAY) {
                                    zBooleanValue = ((Boolean) interfaceC10559.mo5381(new C20353(this))).booleanValue();
                                }
                            }
                        }
                    }
                }
                if (!zBooleanValue) {
                    m10381();
                    printWriter.println(interfaceC12675);
                }
            }
            m10381();
        }
        if (enumC23258Mo952 == EnumC23258.ENUM_CONSTANT || enumC23258Mo952 == EnumC23258.RECORD_COMPONENT) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(interfaceC11970.mo10965());
        switch (C15412.f47205[enumC23258Mo952.ordinal()]) {
            case 2:
            case 7:
                InterfaceC11970 interfaceC11970Mo7176 = interfaceC11970.mo7176();
                if (interfaceC11970Mo7176 != null && interfaceC11970Mo7176.mo952().m51580()) {
                    linkedHashSet.remove(EnumC2113.f7050);
                    linkedHashSet.remove(EnumC2113.f7060);
                    linkedHashSet.remove(EnumC2113.f7061);
                    linkedHashSet.remove(EnumC2113.f7049);
                }
                break;
            case 3:
            case 4:
                linkedHashSet.remove(EnumC2113.f7060);
                break;
            case 5:
                linkedHashSet.remove(EnumC2113.f7049);
                linkedHashSet.remove(EnumC2113.f7060);
                linkedHashSet.remove(EnumC2113.f7054);
                break;
            case 6:
                linkedHashSet.remove(EnumC2113.f7049);
                break;
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        printWriter.print((String) C5378.stream(linkedHashSet).map(new C17576(9)).collect(C22976.joining(" ", "", " ")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10383(InterfaceC7052 interfaceC7052, boolean z) {
        C2609 c2609Mo7178 = interfaceC7052.mo7178();
        if (c2609Mo7178.isEmpty()) {
            return;
        }
        String str = (String) C5378.stream(c2609Mo7178).map(new C22536(this)).collect(C22976.joining(", ", "<", ">"));
        PrintWriter printWriter = this.f10795;
        printWriter.print(str);
        if (z) {
            printWriter.print(" ");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m10380(InterfaceC16223 interfaceC16223) {
        return m10379((InterfaceC11970) interfaceC16223) + interfaceC16223.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10379(InterfaceC11970 interfaceC11970) {
        C2609 c2609Mo7180 = interfaceC11970.mo7180();
        return c2609Mo7180.isEmpty() ? "" : (String) C5378.stream(c2609Mo7180).map(new C21673(5)).collect(C22976.joining(" ", "", " "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10384(InterfaceC14085 interfaceC14085) {
        C2609<InterfaceC4230> parameters = interfaceC14085.getParameters();
        int iM8245 = parameters.m8245();
        if (iM8245 != 0) {
            PrintWriter printWriter = this.f10795;
            if (iM8245 == 1) {
                for (InterfaceC4230 interfaceC4230 : parameters) {
                    m10385(interfaceC4230);
                    if (interfaceC14085.mo10957()) {
                        AbstractC4308 abstractC4308Mo29242 = interfaceC4230.mo29242();
                        if (abstractC4308Mo29242.mo3256() != EnumC0701.ARRAY) {
                            throw new AssertionError("Var-args parameter is not an array type: " + abstractC4308Mo29242);
                        }
                        printWriter.print(((InterfaceC19047) InterfaceC19047.class.cast(abstractC4308Mo29242)).mo1358());
                        printWriter.print("...");
                    } else {
                        printWriter.print(interfaceC4230.mo29242());
                    }
                    printWriter.print(" " + ((Object) interfaceC4230.mo960()));
                }
                return;
            }
            int i = 1;
            for (InterfaceC4230 interfaceC4231 : parameters) {
                if (i == 2) {
                    this.f10794++;
                }
                if (i > 1) {
                    m10381();
                }
                m10385(interfaceC4231);
                if (i == iM8245 && interfaceC14085.mo10957()) {
                    AbstractC4308 abstractC4308Mo29243 = interfaceC4231.mo29242();
                    if (abstractC4308Mo29243.mo3256() != EnumC0701.ARRAY) {
                        throw new AssertionError("Var-args parameter is not an array type: " + abstractC4308Mo29243);
                    }
                    printWriter.print(((InterfaceC19047) InterfaceC19047.class.cast(abstractC4308Mo29243)).mo1358());
                    printWriter.print("...");
                } else {
                    printWriter.print(interfaceC4231.mo29242());
                }
                printWriter.print(" " + ((Object) interfaceC4231.mo960()));
                if (i < iM8245) {
                    printWriter.println(",");
                }
                i++;
            }
            if (parameters.m8245() >= 2) {
                this.f10794--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m10381() {
        int i = this.f10794;
        if (i < 0) {
            return;
        }
        while (true) {
            String[] strArr = f10792;
            PrintWriter printWriter = this.f10795;
            if (i > 10) {
                printWriter.print(strArr[10]);
                i -= 10;
            } else {
                printWriter.print(strArr[i]);
                return;
            }
        }
    }
}
