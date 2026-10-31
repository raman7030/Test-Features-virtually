package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩸ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes4.dex */
public class C21517 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15165 f69181;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20177 f69182;

    public C21517() {
        C20177 c20177 = C21834.f69951;
        this.f69181 = new C15165(new C8111[0]);
        this.f69182 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48687(int i, int i2, C21834 c21834) {
        if (i2 < i) {
            throw new IllegalArgumentException();
        }
        if (i == i2) {
            return;
        }
        C15165 c15165 = this.f69181;
        if (c15165.isEmpty()) {
            c15165.add(new C8111(i, i2, c21834));
            return;
        }
        C8111 c8111 = (C8111) c15165.get(c15165.size() - 1);
        int i3 = c8111.f25066;
        if (i3 == i) {
            if (c8111.f25068.equals(c21834)) {
                c8111.f25066 = i2;
                return;
            } else {
                c15165.add(new C8111(i, i2, c21834));
                return;
            }
        }
        if (i < i3) {
            int size = c15165.size();
            int i4 = size - 1;
            C8111[] c8111Arr = (C8111[]) c15165.m44068();
            int i5 = 0;
            while (i5 <= i4) {
                int iM19938 = C7416.m19938(i4, i5, 2, i5);
                if (c8111Arr[iM19938].f25066 > i) {
                    i4 = iM19938 - 1;
                    size = iM19938;
                } else {
                    i5 = iM19938 + 1;
                }
            }
            if (size == c15165.size() || i2 <= ((C8111) c15165.get(size)).f25067) {
                c15165.add(size, new C8111(i, i2, c21834));
                return;
            }
            while (size < c15165.size()) {
                C8111 c8112 = (C8111) c15165.get(size);
                int i6 = c8112.f25067;
                if (i2 <= i6) {
                    c15165.add(size, new C8111(i, i2, c21834));
                    return;
                }
                int i7 = c8112.f25066;
                if (i < i7) {
                    C20177 c20177 = this.f69182;
                    if (i < i6) {
                        if (i2 < i7) {
                            Object obj = c8112.f25068;
                            c20177.getClass();
                            C21834 c21834M49203 = ((C21834) obj).m49203(c21834);
                            int i8 = c8112.f25067;
                            C8111 c8113 = new C8111(i, i8, c21834);
                            C8111 c8114 = new C8111(i8, i2, c21834M49203);
                            c8112.f25067 = i2;
                            c15165.m35869(size, c8113, c8114);
                            return;
                        }
                        if (i2 == i7) {
                            c15165.add(size, new C8111(i, i6, c21834));
                            Object obj2 = c8112.f25068;
                            c20177.getClass();
                            c8112.f25068 = ((C21834) obj2).m49203(c21834);
                            return;
                        }
                        c15165.add(size, new C8111(i, i6, c21834));
                        Object obj3 = c8112.f25068;
                        c20177.getClass();
                        c8112.f25068 = ((C21834) obj3).m49203(c21834);
                        i = c8112.f25066;
                    } else if (i == i6) {
                        if (i2 < i7) {
                            Object obj4 = c8112.f25068;
                            c20177.getClass();
                            c15165.add(size, new C8111(i, i2, ((C21834) obj4).m49203(c21834)));
                            c8112.f25067 = i2;
                            return;
                        }
                        if (i2 == i7) {
                            Object obj5 = c8112.f25068;
                            c20177.getClass();
                            c8112.f25068 = ((C21834) obj5).m49203(c21834);
                            return;
                        } else {
                            Object obj6 = c8112.f25068;
                            c20177.getClass();
                            c8112.f25068 = ((C21834) obj6).m49203(c21834);
                            i = c8112.f25066;
                        }
                    } else {
                        if (i2 < i7) {
                            Object obj7 = c8112.f25068;
                            c20177.getClass();
                            C21834 c21834M49204 = ((C21834) obj7).m49203(c21834);
                            C8111 c8115 = new C8111(c8112.f25067, i, c8112.f25068);
                            C8111 c8116 = new C8111(i, i2, c21834M49204);
                            c8112.f25067 = i2;
                            c15165.m35869(size, c8115, c8116);
                            return;
                        }
                        if (i2 == i7) {
                            c15165.add(size, new C8111(i6, i, c8112.f25068));
                            Object obj8 = c8112.f25068;
                            c20177.getClass();
                            c8112.f25068 = ((C21834) obj8).m49203(c21834);
                            c8112.f25067 = i;
                            return;
                        }
                        c15165.add(size, new C8111(i6, i, c8112.f25068));
                        Object obj9 = c8112.f25068;
                        c20177.getClass();
                        c8112.f25068 = ((C21834) obj9).m49203(c21834);
                        c8112.f25067 = i;
                        i = c8112.f25066;
                    }
                }
                size++;
            }
            c15165.add(new C8111(i, i2, c21834));
            return;
        }
        c15165.add(new C8111(i, i2, c21834));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48689() {
        C15165 c15165 = this.f69181;
        int size = c15165.size();
        int i = 1;
        if (size <= 1) {
            return;
        }
        C8111[] c8111Arr = (C8111[]) c15165.m44068();
        int i2 = 0;
        C8111 c8111 = c8111Arr[0];
        while (i < size) {
            C8111 c8112 = c8111Arr[i];
            if (c8111.f25066 == c8112.f25067 && C11003.equals(c8111.f25068, c8112.f25068)) {
                c8112.f25067 = c8111.f25067;
            } else {
                c8111Arr[i2] = c8111;
                i2++;
            }
            i++;
            c8111 = c8112;
        }
        int i3 = i2 + 1;
        c8111Arr[i2] = c8111;
        if (i3 < size) {
            c15165.m44067(i3);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m48688() {
        return this.f69181;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48686() {
        this.f69181.clear();
    }
}
