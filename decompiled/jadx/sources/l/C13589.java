package l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13589 extends C13548 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9316 f40531;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13589(C9316 c9316, C16696 c16696, InterfaceC19150 interfaceC19150) {
        super(c16696, interfaceC19150);
        this.f40531 = c9316;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // l.InterfaceC19150
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo3817() {
        String strMo3566;
        int iMo3612;
        String strM23986;
        List listAsList = Arrays.asList((InterfaceC22677[]) C8882.m22953(this.f40437.mo3817(), InterfaceC22677.class));
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listAsList.size();
            byte b = 1;
            C9316 c9316 = this.f40531;
            if (i >= size) {
                for (Map.Entry entry : map.entrySet()) {
                    listAsList.set(((Integer) entry.getKey()).intValue(), (InterfaceC22677) entry.getValue());
                }
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    InterfaceC22677 interfaceC22677 = (InterfaceC22677) listAsList.get(i2);
                    String strM23982 = C9316.m23982(interfaceC22677);
                    if (strM23982 != null && !strM23982.isEmpty()) {
                        String strM23987 = C9316.m23987(strM23982);
                        if (C7416.m19937(1, strM23987) == ';') {
                            String strM23988 = C9316.m23988(c9316, strM23987);
                            if (!strM23987.equals(strM23988)) {
                                listAsList.set(i2, new C11015(((InterfaceC1779) interfaceC22677).mo1790(), C9316.m23990(strM23988)));
                            }
                        }
                    }
                }
                return C21908.m49308(listAsList, this.f40438.m39239());
            }
            InterfaceC22677 interfaceC22678 = (InterfaceC22677) listAsList.get(i);
            if (interfaceC22678.mo3975() == EnumC0841.f3052) {
                InterfaceC11116 interfaceC11116 = (InterfaceC11116) interfaceC22678;
                if (C9316.m23985((InterfaceC5471) interfaceC11116.getReference())) {
                    C9316.m23976(c9316, listAsList, map, C9316.m23989(i, interfaceC11116.mo3614(), listAsList), interfaceC11116.mo3614());
                }
            } else if (interfaceC22678.mo3975() == EnumC0841.f3092) {
                InterfaceC11116 interfaceC11117 = (InterfaceC11116) interfaceC22678;
                InterfaceC5471 interfaceC5471 = (InterfaceC5471) interfaceC11117.getReference();
                String strMo3567 = interfaceC5471.mo3566();
                String name = interfaceC5471.getName();
                String strMo3568 = interfaceC5471.mo3568();
                strMo3567.getClass();
                switch (strMo3567.hashCode()) {
                    case -1945282323:
                        if (strMo3567.equals("Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1253042716:
                        if (!strMo3567.equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                            b = -1;
                        }
                        break;
                    case 652536721:
                        if (strMo3567.equals("Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1518216451:
                        if (strMo3567.equals("Ljava/lang/Class;")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 2:
                        if (name.equals("newUpdater") && strMo3568.equals(strMo3567)) {
                            int iMo3614 = interfaceC11117.mo3614();
                            if (interfaceC5471.mo3566().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo3612 = interfaceC11117.mo3611();
                            } else {
                                iMo3612 = interfaceC11117.mo3612();
                            }
                            int i3 = iMo3612;
                            strM23986 = C9316.m23986(i, iMo3614, listAsList);
                            if (strM23986 == null && c9316.f28267.m11182(strM23986)) {
                                C9316.m23977(c9316, listAsList, map, c9316.f28267.m11184(strM23986), i, i3);
                            }
                        } else {
                            strMo3566 = interfaceC5471.mo3566();
                            String name2 = interfaceC5471.getName();
                            String strMo3569 = interfaceC5471.mo3568();
                            if (!strMo3566.equals("Ljava/lang/Class;") && ((name2.equals("getMethod") || name2.equals("getDeclaredMethod")) && strMo3569.equals("Ljava/lang/reflect/Method;"))) {
                                int iMo3615 = interfaceC11117.mo3614();
                                int iMo3613 = interfaceC11117.mo3612();
                                int iMo3611 = interfaceC11117.mo3611();
                                String strM23989 = C9316.m23986(i, iMo3615, listAsList);
                                if (strM23989 != null && c9316.f28267.m11182(strM23989)) {
                                    C9316.m23978(c9316, listAsList, map, c9316.f28267.m11184(strM23989), i, iMo3613, iMo3611);
                                }
                            }
                        }
                        break;
                    case 3:
                        if (strMo3568.equals("Ljava/lang/reflect/Field;") && (name.equals("getField") || name.equals("getDeclaredField"))) {
                            int iMo3616 = interfaceC11117.mo3614();
                            if (interfaceC5471.mo3566().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo3612 = interfaceC11117.mo3611();
                            } else {
                                iMo3612 = interfaceC11117.mo3612();
                            }
                            int i4 = iMo3612;
                            strM23986 = C9316.m23986(i, iMo3616, listAsList);
                            if (strM23986 == null) {
                            }
                        } else {
                            strMo3566 = interfaceC5471.mo3566();
                            String name3 = interfaceC5471.getName();
                            String strMo35610 = interfaceC5471.mo3568();
                            if (!strMo3566.equals("Ljava/lang/Class;")) {
                            }
                        }
                        break;
                    default:
                        strMo3566 = interfaceC5471.mo3566();
                        String name4 = interfaceC5471.getName();
                        String strMo35611 = interfaceC5471.mo3568();
                        if (!strMo3566.equals("Ljava/lang/Class;")) {
                        }
                        break;
                }
            }
            i++;
        }
    }
}
