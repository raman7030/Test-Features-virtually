package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J89P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6427 implements InterfaceC18547 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19874;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f19875;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f19876 = "";

    public final int hashCode() {
        return C11003.hash(Boolean.TRUE, this.f19876);
    }

    public final String toString() {
        String str = this.f19876;
        return str == null ? "null" : C4860.m14172("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m17788() {
        return this.f19876;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17789(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Expected non-null value");
        }
        this.f19876 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m17792(C2319 c2319) throws IOException {
        c2319.m7579(EnumC3730.FOUR);
        c2319.m7581(this.f19876.length() + 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17791(C2319 c2319) throws IOException {
        c2319.m7579(EnumC3730.FOUR);
        c2319.m7581(0);
        c2319.m7581(this.f19876.length() + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17790(C2319 c2319) throws IOException {
        c2319.m7578(this.f19876);
        c2319.m7582(0);
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ܽ */
    public final void mo5152(C15723 c15723) throws EOFException {
        c15723.m37107(EnumC3730.FOUR);
        c15723.m37106(4);
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ۧ */
    public final void mo5151(C15723 c15723) {
        c15723.m37107(EnumC3730.FOUR);
        this.f19875 = m17787("Offset", c15723);
        this.f19874 = m17787("ActualCount", c15723);
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ֫ */
    public final void mo5150(C15723 c15723) throws EOFException {
        boolean z;
        c15723.m37107(EnumC3730.TWO);
        c15723.m37106(this.f19875 * 2);
        int i = this.f19874;
        if (i > 0) {
            i--;
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(c15723.m37110());
        }
        this.f19876 = sb.toString();
        if (z) {
            c15723.m37106(2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC6427) && C11003.equals(this.f19876, ((AbstractC6427) obj).f19876);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17787(String str, C15723 c15723) throws C8669 {
        long jM37112 = c15723.m37112();
        if (jM37112 <= 2147483647L) {
            return (int) jM37112;
        }
        throw new C8669(String.format("%s %d > %d", str, Long.valueOf(jM37112), Integer.MAX_VALUE));
    }
}
