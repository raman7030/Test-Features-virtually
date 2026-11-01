package p067l;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15283 extends C15244 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C11222 f43608;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15283(C11222 c11222, C18236 c18236, InterfaceC20568 interfaceC20568) {
        super(c18236, interfaceC20568);
        this.f43608 = c11222;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // p067l.InterfaceC20568
    /* JADX INFO: renamed from: ᩷ */
    public final Iterable mo6074() {
        String strMo5853;
        int iMo5883;
        String strM25995;
        List listAsList = Arrays.asList((InterfaceC23920[]) C10810.m24924(this.f43507.mo6074(), InterfaceC23920.class));
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            int size = listAsList.size();
            byte b = 1;
            C11222 c11222 = this.f43608;
            if (i >= size) {
                for (Map.Entry entry : map.entrySet()) {
                    listAsList.set(((Integer) entry.getKey()).intValue(), (InterfaceC23920) entry.getValue());
                }
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    InterfaceC23920 interfaceC23920 = (InterfaceC23920) listAsList.get(i2);
                    String strM25991 = C11222.m25991(interfaceC23920);
                    if (strM25991 != null && !strM25991.isEmpty()) {
                        String strM25996 = C11222.m25996(strM25991);
                        if (C9417.m21911(1, strM25996) == ';') {
                            String strM25997 = C11222.m25997(c11222, strM25996);
                            if (!strM25996.equals(strM25997)) {
                                listAsList.set(i2, new C12837(((InterfaceC4059) interfaceC23920).mo4189(), C11222.m25999(strM25997)));
                            }
                        }
                    }
                }
                return C23190.m51661(listAsList, this.f43508.m41475());
            }
            InterfaceC23920 interfaceC23921 = (InterfaceC23920) listAsList.get(i);
            if (interfaceC23921.mo6217() == EnumC3167.f5826) {
                InterfaceC12933 interfaceC12933 = (InterfaceC12933) interfaceC23921;
                if (C11222.m25994((InterfaceC7568) interfaceC12933.getReference())) {
                    C11222.m25985(c11222, listAsList, map, C11222.m25998(i, interfaceC12933.mo5885(), listAsList), interfaceC12933.mo5885());
                }
            } else if (interfaceC23921.mo6217() == EnumC3167.f5866) {
                InterfaceC12933 interfaceC12934 = (InterfaceC12933) interfaceC23921;
                InterfaceC7568 interfaceC7568 = (InterfaceC7568) interfaceC12934.getReference();
                String strMo5854 = interfaceC7568.mo5853();
                String name = interfaceC7568.getName();
                String strMo5855 = interfaceC7568.mo5855();
                strMo5854.getClass();
                switch (strMo5854.hashCode()) {
                    case -1945282323:
                        if (strMo5854.equals("Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1253042716:
                        if (!strMo5854.equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                            b = -1;
                        }
                        break;
                    case 652536721:
                        if (strMo5854.equals("Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1518216451:
                        if (strMo5854.equals("Ljava/lang/Class;")) {
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
                        if (name.equals("newUpdater") && strMo5855.equals(strMo5854)) {
                            int iMo5885 = interfaceC12934.mo5885();
                            if (interfaceC7568.mo5853().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo5883 = interfaceC12934.mo5882();
                            } else {
                                iMo5883 = interfaceC12934.mo5883();
                            }
                            int i3 = iMo5883;
                            strM25995 = C11222.m25995(i, iMo5885, listAsList);
                            if (strM25995 == null && c11222.f31216.m13142(strM25995)) {
                                C11222.m25986(c11222, listAsList, map, c11222.f31216.m13144(strM25995), i, i3);
                            }
                        } else {
                            strMo5853 = interfaceC7568.mo5853();
                            String name2 = interfaceC7568.getName();
                            String strMo5856 = interfaceC7568.mo5855();
                            if (!strMo5853.equals("Ljava/lang/Class;") && ((name2.equals("getMethod") || name2.equals("getDeclaredMethod")) && strMo5856.equals("Ljava/lang/reflect/Method;"))) {
                                int iMo5886 = interfaceC12934.mo5885();
                                int iMo5884 = interfaceC12934.mo5883();
                                int iMo5882 = interfaceC12934.mo5882();
                                String strM25998 = C11222.m25995(i, iMo5886, listAsList);
                                if (strM25998 != null && c11222.f31216.m13142(strM25998)) {
                                    C11222.m25987(c11222, listAsList, map, c11222.f31216.m13144(strM25998), i, iMo5884, iMo5882);
                                }
                            }
                        }
                        break;
                    case 3:
                        if (strMo5855.equals("Ljava/lang/reflect/Field;") && (name.equals("getField") || name.equals("getDeclaredField"))) {
                            int iMo5887 = interfaceC12934.mo5885();
                            if (interfaceC7568.mo5853().equals("Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;")) {
                                iMo5883 = interfaceC12934.mo5882();
                            } else {
                                iMo5883 = interfaceC12934.mo5883();
                            }
                            int i4 = iMo5883;
                            strM25995 = C11222.m25995(i, iMo5887, listAsList);
                            if (strM25995 == null) {
                            }
                        } else {
                            strMo5853 = interfaceC7568.mo5853();
                            String name3 = interfaceC7568.getName();
                            String strMo5857 = interfaceC7568.mo5855();
                            if (!strMo5853.equals("Ljava/lang/Class;")) {
                            }
                        }
                        break;
                    default:
                        strMo5853 = interfaceC7568.mo5853();
                        String name4 = interfaceC7568.getName();
                        String strMo5858 = interfaceC7568.mo5855();
                        if (!strMo5853.equals("Ljava/lang/Class;")) {
                        }
                        break;
                }
            }
            i++;
        }
    }
}
