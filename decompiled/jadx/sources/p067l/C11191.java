package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97L */
/* JADX INFO: loaded from: classes3.dex */
public final class C11191 implements InterfaceC13348, Map.Entry, InterfaceC17804 {

    /* JADX INFO: renamed from: ᩸ */
    public int f31071;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C20579 f31072;

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo17724() {
        return mo17722();
    }

    public C11191(C20579 c20579, int i) {
        this.f31072 = c20579;
        this.f31071 = i;
    }

    public C11191(C20579 c20579) {
        this.f31072 = c20579;
    }

    @Override // p067l.InterfaceC13348
    /* JADX INFO: renamed from: ܿ */
    public final char mo25825() {
        return this.f31072.f63607[this.f31071];
    }

    @Override // p067l.InterfaceC17804
    public final Object first() {
        return Character.valueOf(this.f31072.f63607[this.f31071]);
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo17723() {
        return Character.valueOf(this.f31072.f63607[this.f31071]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f31072.f63617[this.f31071];
    }

    @Override // p067l.InterfaceC17804
    /* JADX INFO: renamed from: ܳ */
    public final Object mo17722() {
        return this.f31072.f63617[this.f31071];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f31072.f63617;
        int i = this.f31071;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Character.valueOf(this.f31072.f63607[this.f31071]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C20579 c20579 = this.f31072;
        return c20579.f63607[this.f31071] == ((Character) entry.getKey()).charValue() && C12826.equals(c20579.f63617[this.f31071], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C20579 c20579 = this.f31072;
        char[] cArr = c20579.f63607;
        int i = this.f31071;
        char c = cArr[i];
        Object obj = c20579.f63617[i];
        return (obj == null ? 0 : obj.hashCode()) ^ c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C20579 c20579 = this.f31072;
        sb.append(c20579.f63607[this.f31071]);
        sb.append("=>");
        sb.append(c20579.f63617[this.f31071]);
        return sb.toString();
    }
}
