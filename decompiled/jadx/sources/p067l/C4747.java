package p067l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4747 implements InterfaceC23522 {

    /* JADX INFO: renamed from: ܽ */
    public static final int[] f10756 = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: ֫ */
    public boolean f10757;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC8974 f10758 = new C11915();

    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x0161 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final C10782 m10052(Uri uri, C10307 c10307, List list, C11157 c11157, Map map, C17750 c17750) {
        InterfaceC3669 c17849;
        InterfaceC3669 interfaceC3669;
        boolean zMo7079;
        InterfaceC3669 c24555;
        boolean z;
        List listSingletonList;
        int i;
        InterfaceC8974 interfaceC8974;
        C10307 c10308 = c10307;
        int iM48060 = C21274.m48060(c10308.f28528);
        List list2 = (List) map.get("Content-Type");
        int iM48061 = C21274.m48060((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
        int iM48059 = C21274.m48059(uri);
        int i2 = 7;
        ArrayList arrayList = new ArrayList(7);
        m10048(arrayList, iM48060);
        m10048(arrayList, iM48061);
        m10048(arrayList, iM48059);
        for (int i3 = 0; i3 < 7; i3++) {
            m10048(arrayList, f10756[i3]);
        }
        c17750.mo24036();
        InterfaceC3669 interfaceC36610 = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i4)).intValue();
            try {
                if (iIntValue == 0) {
                    c17849 = new C17849();
                } else if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        c24555 = new C24555(0);
                    } else if (iIntValue != i2) {
                        InterfaceC8974 interfaceC8975 = InterfaceC8974.f24307;
                        if (iIntValue == 8) {
                            InterfaceC8974 interfaceC8976 = this.f10758;
                            boolean z2 = this.f10757;
                            C25079 c25079 = c10308.f28526;
                            if (c25079 == null) {
                                z = false;
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= c25079.m55048()) {
                                    z = false;
                                    break;
                                }
                                InterfaceC16361 interfaceC16361M55049 = c25079.m55049(i5);
                                if (interfaceC16361M55049 instanceof C25179) {
                                    z = !((C25179) interfaceC16361M55049).f80544.isEmpty();
                                    break;
                                }
                                i5++;
                            }
                            int i6 = z ? 4 : 0;
                            if (z2) {
                                interfaceC8975 = interfaceC8976;
                            } else {
                                i6 |= 32;
                            }
                            c24555 = new C14557(interfaceC8975, i6, c11157, list != null ? list : AbstractC16192.m36872of());
                        } else if (iIntValue != 11) {
                            c24555 = iIntValue != 13 ? null : new C11769(c10308.f28517, c11157, this.f10758, this.f10757);
                        } else {
                            InterfaceC8974 interfaceC8977 = this.f10758;
                            boolean z3 = this.f10757;
                            if (list != null) {
                                i = 48;
                                listSingletonList = list;
                            } else {
                                C3601 c3601 = new C3601();
                                c3601.m6697("application/cea-608");
                                listSingletonList = Collections.singletonList(c3601.m6672());
                                i = 16;
                            }
                            String str = c10308.f28533;
                            if (TextUtils.isEmpty(str)) {
                                interfaceC8974 = interfaceC8977;
                            } else {
                                interfaceC8974 = interfaceC8977;
                                if (C11669.m26818(str, "audio/mp4a-latm") == null) {
                                    i |= 2;
                                }
                                if (C11669.m26818(str, "video/avc") == null) {
                                    i |= 4;
                                }
                            }
                            if (!z3) {
                                interfaceC8974 = interfaceC8975;
                            }
                            c24555 = new C17317(2, !z3 ? 1 : 0, interfaceC8974, c11157, new C21874(i, listSingletonList));
                        }
                    } else {
                        c17849 = new C18580(0, 0L);
                    }
                    interfaceC3669 = c24555;
                    interfaceC3669.getClass();
                    zMo7079 = interfaceC3669.mo7079(c17750);
                    c17750.mo24036();
                    if (zMo7079) {
                        return new C10782(interfaceC3669, c10307, c11157, this.f10758, this.f10757);
                    }
                    if (interfaceC36610 != null && (iIntValue == iM48060 || iIntValue == iM48061 || iIntValue == iM48059 || iIntValue == 11)) {
                        interfaceC36610 = interfaceC3669;
                    }
                    i4++;
                    c10308 = c10307;
                    i2 = 7;
                } else {
                    c17849 = new C18520();
                }
                zMo7079 = interfaceC3669.mo7079(c17750);
                c17750.mo24036();
            } catch (EOFException unused) {
                c17750.mo24036();
                zMo7079 = false;
            } catch (Throwable th) {
                c17750.mo24036();
                throw th;
            }
            interfaceC3669 = c17849;
            interfaceC3669.getClass();
            if (zMo7079) {
                return new C10782(interfaceC3669, c10307, c11157, this.f10758, this.f10757);
            }
            if (interfaceC36610 != null) {
            }
            i4++;
            c10308 = c10307;
            i2 = 7;
        }
        interfaceC36610.getClass();
        return new C10782(interfaceC36610, c10307, c11157, this.f10758, this.f10757);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10048(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (f10756[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4747 m10049(C11915 c11915) {
        this.f10758 = c11915;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4747 m10050(boolean z) {
        this.f10757 = z;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10307 m10051(C10307 c10307) {
        if (!this.f10757 || !this.f10758.mo20731(c10307)) {
            return c10307;
        }
        C3601 c3601M23918 = c10307.m23918();
        String str = c10307.f28533;
        c3601M23918.m6697("application/x-media3-cues");
        c3601M23918.m6696(this.f10758.mo20732(c10307));
        StringBuilder sb = new StringBuilder();
        sb.append(c10307.f28528);
        sb.append(str != null ? " ".concat(str) : "");
        c3601M23918.m6677(sb.toString());
        c3601M23918.m6675(C14849.FOREVER_NS);
        return c3601M23918.m6672();
    }
}
