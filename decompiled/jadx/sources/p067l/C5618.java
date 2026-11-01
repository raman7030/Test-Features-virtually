package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C5618 extends C14435 {

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f13598 = {"", EnumC2483.f3919, ASN1Dump.TAB, "      ", EnumC2483.f3936, "          ", "            ", "              ", "                ", "                  ", "                    "};

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7059 f13599;

    /* JADX INFO: renamed from: ۧ */
    public int f13600 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final PrintWriter f13601;

    public C5618(PrintWriter printWriter, C22602 c22602) {
        this.f13601 = new PrintWriter(printWriter);
        this.f13599 = c22602;
    }

    @Override // p067l.C12424, p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12425(C2417 c2417, Object obj) {
        m12433((InterfaceC13745) c2417, Boolean.FALSE);
        boolean zM3349 = c2417.m3349();
        PrintWriter printWriter = this.f13601;
        if (zM3349) {
            printWriter.println("// Unnamed module");
            return this;
        }
        if (c2417.f3692.contains(EnumC19853.OPEN)) {
            printWriter.print("open ");
        }
        printWriter.println("module " + ((Object) c2417.f20408) + " {");
        this.f13600 = this.f13600 + 1;
        c2417.m18022();
        InterfaceC8453 interfaceC8453 = c2417.f3699;
        InterfaceC8453 interfaceC8454 = InterfaceC8453.f22683;
        if (interfaceC8453 != interfaceC8454) {
            c2417.f3699 = interfaceC8454;
            interfaceC8453.mo9171(c2417);
        }
        for (InterfaceC13095 interfaceC13095 : C21562.unmodifiableList(c2417.f3696)) {
            m12420();
            interfaceC13095.mo26783(new C6959(printWriter));
            printWriter.println(C0249l.f1196b);
        }
        this.f13600--;
        printWriter.println(C0249l.f1198d);
        return this;
    }

    @Override // p067l.C12424, p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12426(C5771 c5771, Object obj) {
        EnumC24473 enumC24473Mo3347 = c5771.mo3347();
        if (enumC24473Mo3347 != EnumC24473.STATIC_INIT && enumC24473Mo3347 != EnumC24473.INSTANCE_INIT) {
            InterfaceC13745 interfaceC13745Mo9255 = c5771.mo9255();
            if (enumC24473Mo3347 != EnumC24473.CONSTRUCTOR || interfaceC13745Mo9255 == null || EnumC25164.ANONYMOUS != interfaceC13745Mo9255.mo3346(new C23723(), null)) {
                m12433((InterfaceC13745) c5771, Boolean.TRUE);
                m12422((InterfaceC9071) c5771, true);
                int i = C17016.f50335[enumC24473Mo3347.ordinal()];
                PrintWriter printWriter = this.f13601;
                if (i == 1) {
                    printWriter.print(c5771.mo9255().mo3355());
                } else if (i == 2) {
                    printWriter.print(c5771.mo9258().toString());
                    printWriter.print(" ");
                    printWriter.print(c5771.mo3355().toString());
                }
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                m12423((InterfaceC15755) c5771);
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
                AbstractC10564 abstractC10564Mo9254 = c5771.mo9254();
                if (abstractC10564Mo9254 != null) {
                    printWriter.print(" default " + abstractC10564Mo9254);
                }
                C4848<InterfaceC7730> c4848Mo9253 = c5771.mo9253();
                int iM10289 = c4848Mo9253.m10289();
                if (iM10289 != 0) {
                    printWriter.print(" throws");
                    int i2 = 1;
                    for (InterfaceC7730 interfaceC7730 : c4848Mo9253) {
                        if (i2 == 1) {
                            printWriter.print(" ");
                        }
                        if (i2 == 2) {
                            this.f13600++;
                        }
                        if (i2 >= 2) {
                            m12420();
                        }
                        printWriter.print(interfaceC7730);
                        if (i2 != iM10289) {
                            printWriter.println(", ");
                        }
                        i2++;
                    }
                    if (iM10289 >= 2) {
                        this.f13600--;
                    }
                }
                printWriter.println(C0249l.f1196b);
            }
        }
        return this;
    }

    @Override // p067l.C12424, p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12427(C6442 c6442, Object obj) {
        this.f13601.print(c6442.f20408);
        return this;
    }

    @Override // p067l.C12424
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo12428(AbstractC7783 abstractC7783, Object obj) {
        m12433((InterfaceC13745) abstractC7783, (Boolean) obj);
        return this;
    }

    @Override // p067l.C12424, p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12429(C9794 c9794, Object obj) {
        m12433((InterfaceC13745) c9794, Boolean.FALSE);
        boolean zM22845 = c9794.m22845();
        PrintWriter printWriter = this.f13601;
        if (!zM22845) {
            printWriter.println("package " + ((Object) c9794.f27059) + C0249l.f1196b);
            return this;
        }
        printWriter.println("// Unnamed package");
        return this;
    }

    @Override // p067l.C12424, p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12430(C13818 c13818, Object obj) {
        EnumC24473 enumC24473Mo3347 = c13818.mo3347();
        m12433((InterfaceC13745) c13818, (Boolean) obj);
        EnumC24473 enumC24473 = EnumC24473.ENUM_CONSTANT;
        PrintWriter printWriter = this.f13601;
        if (enumC24473Mo3347 == enumC24473) {
            printWriter.print(c13818.mo3355());
            return this;
        }
        printWriter.print(c13818.mo31296().toString() + " " + ((Object) c13818.mo3355()));
        Object objM31486 = c13818.m31486();
        if (objM31486 != null) {
            printWriter.print(" = ");
            ((C22602) this.f13599).getClass();
            printWriter.print(C23232.m51780(objM31486));
        }
        printWriter.println(C0249l.f1196b);
        return this;
    }

    @Override // p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12431(C15828 c15828, Object obj) {
        EnumC24473 enumC24473Mo3347 = c15828.mo3347();
        EnumC25164 enumC25164M35944 = c15828.m35944();
        EnumC25164 enumC25164 = EnumC25164.ANONYMOUS;
        int i = 0;
        PrintWriter printWriter = this.f13601;
        if (enumC25164 == enumC25164M35944) {
            printWriter.print("new ");
            C4848 c4848M35938 = c15828.m35938();
            if (c4848M35938.isEmpty()) {
                printWriter.print(c15828.mo25528());
            } else {
                printWriter.print(c4848M35938.get(0));
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
            if (c4848M35938.isEmpty()) {
                ArrayList arrayListM38744 = C17116.m38744(c15828.mo3353());
                if (!arrayListM38744.isEmpty()) {
                    m12423((InterfaceC15755) arrayListM38744.get(0));
                }
            }
            printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            if (enumC25164M35944 == EnumC25164.TOP_LEVEL) {
                C9794 c9794M50655 = ((C22602) this.f13599).m50655(c15828);
                if (!c9794M50655.m22845()) {
                    printWriter.print("package " + ((Object) c9794M50655.f27059) + ";\n");
                }
            }
            m12433((InterfaceC13745) c15828, Boolean.TRUE);
            if (C17016.f50335[enumC24473Mo3347.ordinal()] != 3) {
                printWriter.print(enumC24473Mo3347.toString().toLowerCase(Locale.US));
            } else {
                printWriter.print("@interface");
            }
            printWriter.print(" ");
            printWriter.print(c15828.f20408);
            m12422((InterfaceC9071) c15828, false);
            if (enumC24473Mo3347 == EnumC24473.RECORD) {
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_START);
                printWriter.print((String) C7480.stream(c15828.m35941()).map(new C15868(this)).collect(C24205.joining(", ")));
                printWriter.print(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            if (enumC24473Mo3347 == EnumC24473.CLASS) {
                InterfaceC7730 interfaceC7730Mo25528 = c15828.mo25528();
                EnumC3035 enumC3035Mo5575 = interfaceC7730Mo25528.mo5575();
                EnumC3035 enumC3035 = EnumC3035.NONE;
                if (enumC3035Mo5575 != enumC3035 && ((InterfaceC11083) ((InterfaceC21142) interfaceC7730Mo25528).mo47761()).mo25528().mo5575() != enumC3035) {
                    printWriter.print(" extends " + interfaceC7730Mo25528);
                }
            }
            EnumC24473 enumC24473Mo3348 = c15828.mo3347();
            if (enumC24473Mo3348 != EnumC24473.ANNOTATION_TYPE) {
                C4848 c4848M35939 = c15828.m35938();
                if (!c4848M35939.isEmpty()) {
                    printWriter.print(enumC24473Mo3348.m53974() ? " implements " : " extends ");
                    printWriter.print((String) C7480.stream(c4848M35939).map(new C18144(7)).collect(C24205.joining(", ")));
                }
            }
            C4848 c4848M10287 = c15828.f45853.m10287((Function) new C24063(6));
            if (!c4848M10287.isEmpty()) {
                printWriter.print(" permits ");
                printWriter.print((String) C7480.stream(c4848M10287).map(new C8678(6)).collect(C24205.joining(", ")));
            }
        }
        printWriter.println(" {");
        this.f13600++;
        if (enumC24473Mo3347 == EnumC24473.ENUM) {
            ArrayList<InterfaceC13745> arrayList = new ArrayList(c15828.mo3353());
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC13745 interfaceC13745 : arrayList) {
                if (interfaceC13745.mo3347() == EnumC24473.ENUM_CONSTANT) {
                    arrayList2.add(interfaceC13745);
                }
            }
            if (!arrayList2.isEmpty()) {
                while (i < arrayList2.size() - 1) {
                    ((InterfaceC13745) arrayList2.get(i)).mo3346(this, Boolean.TRUE);
                    printWriter.print(",");
                    i++;
                }
                ((InterfaceC13745) arrayList2.get(i)).mo3346(this, Boolean.TRUE);
                printWriter.println(";\n");
                arrayList.removeAll(arrayList2);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC13745) it.next()).mo3346(this, null);
            }
        } else {
            Iterator it2 = (enumC24473Mo3347 != EnumC24473.RECORD ? c15828.mo3353() : C7480.stream(c15828.mo3353()).filter(new Predicate() { // from class: l.᩸ᩴ۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C20697.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo55838negate() {
                    return C20697.$default$negate(this);
                }

                /* JADX INFO: renamed from: or */
                public /* synthetic */ Predicate m51439or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((C22602) this.f72442.f13599).m50660((InterfaceC13745) obj2) == EnumC21812.EXPLICIT;
                }
            }).toList()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC13745) it2.next()).mo3346(this, null);
            }
        }
        this.f13600--;
        m12420();
        printWriter.println(C0249l.f1198d);
        return this;
    }

    @Override // p067l.C12424, p067l.AbstractC10412
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12432(C22536 c22536, Object obj) {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12433(InterfaceC13745 interfaceC13745, Boolean bool) {
        PrintWriter printWriter = this.f13601;
        if (bool != null && bool.booleanValue()) {
            printWriter.println();
        }
        String strM50659 = ((C22602) this.f13599).m50659(interfaceC13745);
        if (strM50659 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM50659, "\n\r");
            m12420();
            printWriter.println("/**");
            while (stringTokenizer.hasMoreTokens()) {
                m12420();
                printWriter.print(" *");
                printWriter.println(stringTokenizer.nextToken());
            }
            m12420();
            printWriter.println(" */");
        }
        m12424(interfaceC13745);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m12417(InterfaceC11754 interfaceC11754) {
        return m12418((InterfaceC13745) interfaceC11754) + interfaceC11754.mo31296().toString() + " " + ((Object) interfaceC11754.mo3355());
    }

    /* JADX INFO: renamed from: ۧ */
    private void m12424(InterfaceC13745 interfaceC13745) {
        EnumC24473 enumC24473Mo3347 = interfaceC13745.mo3347();
        EnumC24473 enumC24473 = EnumC24473.PARAMETER;
        PrintWriter printWriter = this.f13601;
        if (enumC24473Mo3347 == enumC24473 || enumC24473Mo3347 == EnumC24473.RECORD_COMPONENT) {
            printWriter.print(m12418(interfaceC13745));
        } else {
            for (InterfaceC14415 interfaceC14415 : interfaceC13745.mo9259()) {
                boolean zBooleanValue = false;
                if (((C22602) this.f13599).m50657(interfaceC14415) == EnumC21812.MANDATED) {
                    Set setEntrySet = interfaceC14415.mo33028().entrySet();
                    if (setEntrySet.size() == 1) {
                        AbstractC21195 abstractC21195Mo47761 = interfaceC14415.mo33029().mo47761();
                        InterfaceC12404 interfaceC12404 = (InterfaceC12404) ((Map.Entry) setEntrySet.iterator().next()).getValue();
                        if (abstractC21195Mo47761.mo3347() == EnumC24473.ANNOTATION_TYPE) {
                            ArrayList arrayListM38745 = C17116.m38745(abstractC21195Mo47761.mo3353());
                            if (arrayListM38745.size() == 1) {
                                InterfaceC15755 interfaceC15755 = (InterfaceC15755) arrayListM38745.get(0);
                                AbstractC6462 abstractC6462Mo9258 = interfaceC15755.mo9258();
                                if (C0226b.f1011d.equals(interfaceC15755.mo3355().toString()) && abstractC6462Mo9258.mo5575() == EnumC3035.ARRAY) {
                                    zBooleanValue = ((Boolean) interfaceC12404.mo7610(new C21712(this))).booleanValue();
                                }
                            }
                        }
                    }
                }
                if (!zBooleanValue) {
                    m12420();
                    printWriter.println(interfaceC14415);
                }
            }
            m12420();
        }
        if (enumC24473Mo3347 == EnumC24473.ENUM_CONSTANT || enumC24473Mo3347 == EnumC24473.RECORD_COMPONENT) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(interfaceC13745.mo12941());
        switch (C17016.f50335[enumC24473Mo3347.ordinal()]) {
            case 2:
            case 7:
                InterfaceC13745 interfaceC13745Mo9255 = interfaceC13745.mo9255();
                if (interfaceC13745Mo9255 != null && interfaceC13745Mo9255.mo3347().m53976()) {
                    linkedHashSet.remove(EnumC4377.f9835);
                    linkedHashSet.remove(EnumC4377.f9845);
                    linkedHashSet.remove(EnumC4377.f9846);
                    linkedHashSet.remove(EnumC4377.f9834);
                }
                break;
            case 3:
            case 4:
                linkedHashSet.remove(EnumC4377.f9845);
                break;
            case 5:
                linkedHashSet.remove(EnumC4377.f9834);
                linkedHashSet.remove(EnumC4377.f9845);
                linkedHashSet.remove(EnumC4377.f9839);
                break;
            case 6:
                linkedHashSet.remove(EnumC4377.f9834);
                break;
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        printWriter.print((String) C7480.stream(linkedHashSet).map(new C19073(9)).collect(C24205.joining(" ", "", " ")));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12422(InterfaceC9071 interfaceC9071, boolean z) {
        C4848 c4848Mo9257 = interfaceC9071.mo9257();
        if (c4848Mo9257.isEmpty()) {
            return;
        }
        String str = (String) C7480.stream(c4848Mo9257).map(new C23787(this)).collect(C24205.joining(", ", "<", ">"));
        PrintWriter printWriter = this.f13601;
        printWriter.print(str);
        if (z) {
            printWriter.print(" ");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ String m12419(InterfaceC17787 interfaceC17787) {
        return m12418((InterfaceC13745) interfaceC17787) + interfaceC17787.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12418(InterfaceC13745 interfaceC13745) {
        C4848 c4848Mo9259 = interfaceC13745.mo9259();
        return c4848Mo9259.isEmpty() ? "" : (String) C7480.stream(c4848Mo9259).map(new C22966(5)).collect(C24205.joining(" ", "", " "));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12423(InterfaceC15755 interfaceC15755) {
        C4848<InterfaceC6389> parameters = interfaceC15755.getParameters();
        int iM10289 = parameters.m10289();
        if (iM10289 != 0) {
            PrintWriter printWriter = this.f13601;
            if (iM10289 == 1) {
                for (InterfaceC6389 interfaceC6389 : parameters) {
                    m12424(interfaceC6389);
                    if (interfaceC15755.mo12933()) {
                        AbstractC6462 abstractC6462Mo31296 = interfaceC6389.mo31296();
                        if (abstractC6462Mo31296.mo5575() != EnumC3035.ARRAY) {
                            throw new AssertionError("Var-args parameter is not an array type: " + abstractC6462Mo31296);
                        }
                        printWriter.print(((InterfaceC20471) InterfaceC20471.class.cast(abstractC6462Mo31296)).mo3771());
                        printWriter.print("...");
                    } else {
                        printWriter.print(interfaceC6389.mo31296());
                    }
                    printWriter.print(" " + ((Object) interfaceC6389.mo3355()));
                }
                return;
            }
            int i = 1;
            for (InterfaceC6389 interfaceC63810 : parameters) {
                if (i == 2) {
                    this.f13600++;
                }
                if (i > 1) {
                    m12420();
                }
                m12424(interfaceC63810);
                if (i == iM10289 && interfaceC15755.mo12933()) {
                    AbstractC6462 abstractC6462Mo31297 = interfaceC63810.mo31296();
                    if (abstractC6462Mo31297.mo5575() != EnumC3035.ARRAY) {
                        throw new AssertionError("Var-args parameter is not an array type: " + abstractC6462Mo31297);
                    }
                    printWriter.print(((InterfaceC20471) InterfaceC20471.class.cast(abstractC6462Mo31297)).mo3771());
                    printWriter.print("...");
                } else {
                    printWriter.print(interfaceC63810.mo31296());
                }
                printWriter.print(" " + ((Object) interfaceC63810.mo3355()));
                if (i < iM10289) {
                    printWriter.println(",");
                }
                i++;
            }
            if (parameters.m10289() >= 2) {
                this.f13600--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m12420() {
        int i = this.f13600;
        if (i < 0) {
            return;
        }
        while (true) {
            String[] strArr = f13598;
            PrintWriter printWriter = this.f13601;
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
