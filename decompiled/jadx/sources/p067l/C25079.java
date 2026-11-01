package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩻᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AVI */
/* JADX INFO: loaded from: classes.dex */
public final class C25079 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16361[] f80004;

    /* JADX INFO: renamed from: ۧ */
    public final long f80005;

    public C25079() {
        throw null;
    }

    public C25079(InterfaceC16361... interfaceC16361Arr) {
        this(-9223372036854775807L, interfaceC16361Arr);
    }

    public C25079(long j, InterfaceC16361... interfaceC16361Arr) {
        this.f80005 = j;
        this.f80004 = interfaceC16361Arr;
    }

    public C25079(List list) {
        this((InterfaceC16361[]) list.toArray(new InterfaceC16361[0]));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m55048() {
        return this.f80004.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16361 m55049(int i) {
        return this.f80004[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25079 m55051(C25079 c25079) {
        return c25079 == null ? this : m55052(c25079.f80004);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25079 m55052(InterfaceC16361... interfaceC16361Arr) {
        if (interfaceC16361Arr.length == 0) {
            return this;
        }
        String str = C5792.f14228;
        InterfaceC16361[] interfaceC16361Arr2 = this.f80004;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC16361Arr2, interfaceC16361Arr2.length + interfaceC16361Arr.length);
        System.arraycopy(interfaceC16361Arr, 0, objArrCopyOf, interfaceC16361Arr2.length, interfaceC16361Arr.length);
        return new C25079(this.f80005, (InterfaceC16361[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25079 m55050(long j) {
        return this.f80005 == j ? this : new C25079(j, this.f80004);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25079.class == obj.getClass()) {
            C25079 c25079 = (C25079) obj;
            if (Arrays.equals(this.f80004, c25079.f80004) && this.f80005 == c25079.f80005) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8424.m19607(this.f80005) + (Arrays.hashCode(this.f80004) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f80004));
        long j = this.f80005;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }
}
