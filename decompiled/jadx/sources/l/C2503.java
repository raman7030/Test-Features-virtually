package l;

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
public final class C2503 implements InterfaceC22258 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f7965 = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7966;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC6950 f7967 = new C10045();

    /* JADX WARN: Code duplicated, block: B:84:0x0170  */
    /* JADX WARN: Code duplicated, block: B:98:0x0161 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8853 m8004(Uri uri, C8353 c8353, List list, C9248 c9248, Map map, C16184 c16184) {
        InterfaceC1368 c16289;
        InterfaceC1368 interfaceC1368;
        boolean zMo4841;
        InterfaceC1368 c23345;
        boolean z;
        List listSingletonList;
        int i;
        InterfaceC6950 interfaceC6950;
        C8353 c8354 = c8353;
        int iM45749 = C19893.m45749(c8354.f25614);
        List list2 = (List) map.get("Content-Type");
        int iM457410 = C19893.m45749((list2 == null || list2.isEmpty()) ? null : (String) list2.get(0));
        int iM45748 = C19893.m45748(uri);
        int i2 = 7;
        ArrayList arrayList = new ArrayList(7);
        m8000(arrayList, iM45749);
        m8000(arrayList, iM457410);
        m8000(arrayList, iM45748);
        for (int i3 = 0; i3 < 7; i3++) {
            m8000(arrayList, f7965[i3]);
        }
        c16184.mo22066();
        InterfaceC1368 interfaceC1369 = null;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i4)).intValue();
            try {
                if (iIntValue == 0) {
                    c16289 = new C16289();
                } else if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        c23345 = new C23345(0);
                    } else if (iIntValue != i2) {
                        InterfaceC6950 interfaceC6951 = InterfaceC6950.f21425;
                        if (iIntValue == 8) {
                            InterfaceC6950 interfaceC6952 = this.f7967;
                            boolean z2 = this.f7966;
                            C23896 c23896 = c8354.f25612;
                            if (c23896 == null) {
                                z = false;
                                break;
                            }
                            int i5 = 0;
                            while (true) {
                                if (i5 >= c23896.m52639()) {
                                    z = false;
                                    break;
                                }
                                InterfaceC14723 interfaceC14723M52640 = c23896.m52640(i5);
                                if (interfaceC14723M52640 instanceof C24001) {
                                    z = !((C24001) interfaceC14723M52640).f77792.isEmpty();
                                    break;
                                }
                                i5++;
                            }
                            int i6 = z ? 4 : 0;
                            if (z2) {
                                interfaceC6951 = interfaceC6952;
                            } else {
                                i6 |= 32;
                            }
                            c23345 = new C12825(interfaceC6951, i6, c9248, list != null ? list : AbstractC14545.of());
                        } else if (iIntValue != 11) {
                            c23345 = iIntValue != 13 ? null : new C9891(c8354.f25603, c9248, this.f7967, this.f7966);
                        } else {
                            InterfaceC6950 interfaceC6953 = this.f7967;
                            boolean z3 = this.f7966;
                            if (list != null) {
                                i = 48;
                                listSingletonList = list;
                            } else {
                                C1297 c1297 = new C1297();
                                c1297.m4465("application/cea-608");
                                listSingletonList = Collections.singletonList(c1297.m4440());
                                i = 16;
                            }
                            String str = c8354.f25619;
                            if (TextUtils.isEmpty(str)) {
                                interfaceC6950 = interfaceC6953;
                            } else {
                                interfaceC6950 = interfaceC6953;
                                if (C9786.m24803(str, "audio/mp4a-latm") == null) {
                                    i |= 2;
                                }
                                if (C9786.m24803(str, "video/avc") == null) {
                                    i |= 4;
                                }
                            }
                            if (!z3) {
                                interfaceC6950 = interfaceC6951;
                            }
                            c23345 = new C15729(2, !z3 ? 1 : 0, interfaceC6950, c9248, new C20524(i, listSingletonList));
                        }
                    } else {
                        c16289 = new C17058(0, 0L);
                    }
                    interfaceC1368 = c23345;
                    interfaceC1368.getClass();
                    zMo4841 = interfaceC1368.mo4841(c16184);
                    c16184.mo22066();
                    if (zMo4841) {
                        return new C8853(interfaceC1368, c8353, c9248, this.f7967, this.f7966);
                    }
                    if (interfaceC1369 != null && (iIntValue == iM45749 || iIntValue == iM457410 || iIntValue == iM45748 || iIntValue == 11)) {
                        interfaceC1369 = interfaceC1368;
                    }
                    i4++;
                    c8354 = c8353;
                    i2 = 7;
                } else {
                    c16289 = new C16995();
                }
                zMo4841 = interfaceC1368.mo4841(c16184);
                c16184.mo22066();
            } catch (EOFException unused) {
                c16184.mo22066();
                zMo4841 = false;
            } catch (Throwable th) {
                c16184.mo22066();
                throw th;
            }
            interfaceC1368 = c16289;
            interfaceC1368.getClass();
            if (zMo4841) {
                return new C8853(interfaceC1368, c8353, c9248, this.f7967, this.f7966);
            }
            if (interfaceC1369 != null) {
            }
            i4++;
            c8354 = c8353;
            i2 = 7;
        }
        interfaceC1369.getClass();
        return new C8853(interfaceC1369, c8353, c9248, this.f7967, this.f7966);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8000(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (f7965[i2] == i) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2503 m8001(C10045 c10045) {
        this.f7967 = c10045;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2503 m8002(boolean z) {
        this.f7966 = z;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m8003(C8353 c8353) {
        if (!this.f7966 || !this.f7967.mo18777(c8353)) {
            return c8353;
        }
        C1297 c1297M21948 = c8353.m21948();
        String str = c8353.f25619;
        c1297M21948.m4465("application/x-media3-cues");
        c1297M21948.m4464(this.f7967.mo18778(c8353));
        StringBuilder sb = new StringBuilder();
        sb.append(c8353.f25614);
        sb.append(str != null ? " ".concat(str) : "");
        c1297M21948.m4445(sb.toString());
        c1297M21948.m4443(C13132.FOREVER_NS);
        return c1297M21948.m4440();
    }
}
