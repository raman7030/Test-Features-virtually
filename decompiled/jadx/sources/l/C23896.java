package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AVI */
/* JADX INFO: loaded from: classes.dex */
public final class C23896 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14723[] f77253;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f77254;

    public C23896() {
        throw null;
    }

    public C23896(InterfaceC14723... interfaceC14723Arr) {
        this(-9223372036854775807L, interfaceC14723Arr);
    }

    public C23896(long j, InterfaceC14723... interfaceC14723Arr) {
        this.f77254 = j;
        this.f77253 = interfaceC14723Arr;
    }

    public C23896(List list) {
        this((InterfaceC14723[]) list.toArray(new InterfaceC14723[0]));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52639() {
        return this.f77253.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14723 m52640(int i) {
        return this.f77253[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 m52642(C23896 c23896) {
        return c23896 == null ? this : m52643(c23896.f77253);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 m52643(InterfaceC14723... interfaceC14723Arr) {
        if (interfaceC14723Arr.length == 0) {
            return this;
        }
        String str = C3603.f11424;
        InterfaceC14723[] interfaceC14723Arr2 = this.f77253;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC14723Arr2, interfaceC14723Arr2.length + interfaceC14723Arr.length);
        System.arraycopy(interfaceC14723Arr, 0, objArrCopyOf, interfaceC14723Arr2.length, interfaceC14723Arr.length);
        return new C23896(this.f77254, (InterfaceC14723[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 m52641(long j) {
        return this.f77254 == j ? this : new C23896(j, this.f77253);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23896.class == obj.getClass()) {
            C23896 c23896 = (C23896) obj;
            if (Arrays.equals(this.f77253, c23896.f77253) && this.f77254 == c23896.f77254) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6371.m17662(this.f77254) + (Arrays.hashCode(this.f77253) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f77253));
        long j = this.f77254;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }
}
