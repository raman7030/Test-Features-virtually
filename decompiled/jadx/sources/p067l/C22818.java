package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.᩸ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes4.dex */
public class C22818 {

    /* JADX INFO: renamed from: ֫ */
    public C16781 f71877;

    /* JADX INFO: renamed from: ۧ */
    public final C21545 f71878;

    public C22818() {
        C21545 c21545 = C23120.f72660;
        this.f71877 = new C16781(new C10077[0]);
        this.f71878 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51024(int i, int i2, C23120 c23120) {
        if (i2 < i) {
            throw new IllegalArgumentException();
        }
        if (i == i2) {
            return;
        }
        C16781 c16781 = this.f71877;
        if (c16781.isEmpty()) {
            c16781.add(new C10077(i, i2, c23120));
            return;
        }
        C10077 c10077 = (C10077) c16781.get(c16781.size() - 1);
        int i3 = c10077.f27975;
        if (i3 == i) {
            if (c10077.f27977.equals(c23120)) {
                c10077.f27975 = i2;
                return;
            } else {
                c16781.add(new C10077(i, i2, c23120));
                return;
            }
        }
        if (i < i3) {
            int size = c16781.size();
            int i4 = size - 1;
            C10077[] c10077Arr = (C10077[]) c16781.m46362();
            int i5 = 0;
            while (i5 <= i4) {
                int iM21912 = C9417.m21912(i4, i5, 2, i5);
                if (c10077Arr[iM21912].f27975 > i) {
                    i4 = iM21912 - 1;
                    size = iM21912;
                } else {
                    i5 = iM21912 + 1;
                }
            }
            if (size == c16781.size() || i2 <= ((C10077) c16781.get(size)).f27976) {
                c16781.add(size, new C10077(i, i2, c23120));
                return;
            }
            while (size < c16781.size()) {
                C10077 c10078 = (C10077) c16781.get(size);
                int i6 = c10078.f27976;
                if (i2 <= i6) {
                    c16781.add(size, new C10077(i, i2, c23120));
                    return;
                }
                int i7 = c10078.f27975;
                if (i < i7) {
                    C21545 c21545 = this.f71878;
                    if (i < i6) {
                        if (i2 < i7) {
                            Object obj = c10078.f27977;
                            c21545.getClass();
                            C23120 c23120M51554 = ((C23120) obj).m51554(c23120);
                            int i8 = c10078.f27976;
                            C10077 c10079 = new C10077(i, i8, c23120);
                            C10077 c100710 = new C10077(i8, i2, c23120M51554);
                            c10078.f27976 = i2;
                            c16781.m38027(size, c10079, c100710);
                            return;
                        }
                        if (i2 == i7) {
                            c16781.add(size, new C10077(i, i6, c23120));
                            Object obj2 = c10078.f27977;
                            c21545.getClass();
                            c10078.f27977 = ((C23120) obj2).m51554(c23120);
                            return;
                        }
                        c16781.add(size, new C10077(i, i6, c23120));
                        Object obj3 = c10078.f27977;
                        c21545.getClass();
                        c10078.f27977 = ((C23120) obj3).m51554(c23120);
                        i = c10078.f27975;
                    } else if (i == i6) {
                        if (i2 < i7) {
                            Object obj4 = c10078.f27977;
                            c21545.getClass();
                            c16781.add(size, new C10077(i, i2, ((C23120) obj4).m51554(c23120)));
                            c10078.f27976 = i2;
                            return;
                        }
                        if (i2 == i7) {
                            Object obj5 = c10078.f27977;
                            c21545.getClass();
                            c10078.f27977 = ((C23120) obj5).m51554(c23120);
                            return;
                        } else {
                            Object obj6 = c10078.f27977;
                            c21545.getClass();
                            c10078.f27977 = ((C23120) obj6).m51554(c23120);
                            i = c10078.f27975;
                        }
                    } else {
                        if (i2 < i7) {
                            Object obj7 = c10078.f27977;
                            c21545.getClass();
                            C23120 c23120M51555 = ((C23120) obj7).m51554(c23120);
                            C10077 c100711 = new C10077(c10078.f27976, i, c10078.f27977);
                            C10077 c100712 = new C10077(i, i2, c23120M51555);
                            c10078.f27976 = i2;
                            c16781.m38027(size, c100711, c100712);
                            return;
                        }
                        if (i2 == i7) {
                            c16781.add(size, new C10077(i6, i, c10078.f27977));
                            Object obj8 = c10078.f27977;
                            c21545.getClass();
                            c10078.f27977 = ((C23120) obj8).m51554(c23120);
                            c10078.f27976 = i;
                            return;
                        }
                        c16781.add(size, new C10077(i6, i, c10078.f27977));
                        Object obj9 = c10078.f27977;
                        c21545.getClass();
                        c10078.f27977 = ((C23120) obj9).m51554(c23120);
                        c10078.f27976 = i;
                        i = c10078.f27975;
                    }
                }
                size++;
            }
            c16781.add(new C10077(i, i2, c23120));
            return;
        }
        c16781.add(new C10077(i, i2, c23120));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51026() {
        C16781 c16781 = this.f71877;
        int size = c16781.size();
        int i = 1;
        if (size <= 1) {
            return;
        }
        C10077[] c10077Arr = (C10077[]) c16781.m46362();
        int i2 = 0;
        C10077 c10077 = c10077Arr[0];
        while (i < size) {
            C10077 c10078 = c10077Arr[i];
            if (c10077.f27975 == c10078.f27976 && C12826.equals(c10077.f27977, c10078.f27977)) {
                c10078.f27976 = c10077.f27976;
            } else {
                c10077Arr[i2] = c10077;
                i2++;
            }
            i++;
            c10077 = c10078;
        }
        int i3 = i2 + 1;
        c10077Arr[i2] = c10077;
        if (i3 < size) {
            c16781.m46361(i3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m51025() {
        return this.f71877;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51023() {
        this.f71877.clear();
    }
}
