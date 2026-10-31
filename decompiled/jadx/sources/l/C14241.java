package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܳۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14241 implements InterfaceC18476, Map.Entry, InterfaceC16241 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42916;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9304 f42917;

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo15809() {
        return mo15807();
    }

    public C14241(C9304 c9304) {
        this.f42917 = c9304;
    }

    public C14241(C9304 c9304, int i) {
        this.f42917 = c9304;
        this.f42916 = i;
    }

    @Override // l.InterfaceC18476
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long mo33889() {
        return this.f42917.f28196[this.f42916];
    }

    @Override // l.InterfaceC16241
    public final Object first() {
        return Long.valueOf(this.f42917.f28196[this.f42916]);
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܽ */
    public final Object mo15808() {
        return Long.valueOf(this.f42917.f28196[this.f42916]);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f42917.f28191[this.f42916];
    }

    @Override // l.InterfaceC16241
    /* JADX INFO: renamed from: ܳ */
    public final Object mo15807() {
        return this.f42917.f28191[this.f42916];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object[] objArr = this.f42917.f28191;
        int i = this.f42916;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.Map.Entry
    @Deprecated
    public final Object getKey() {
        return Long.valueOf(this.f42917.f28196[this.f42916]);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C9304 c9304 = this.f42917;
        return c9304.f28196[this.f42916] == ((Long) entry.getKey()).longValue() && C11003.equals(c9304.f28191[this.f42916], entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        C9304 c9304 = this.f42917;
        long[] jArr = c9304.f28196;
        int i = this.f42916;
        long j = jArr[i];
        int i2 = (int) (j ^ (j >>> 32));
        Object obj = c9304.f28191[i];
        return (obj == null ? 0 : obj.hashCode()) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C9304 c9304 = this.f42917;
        sb.append(c9304.f28196[this.f42916]);
        sb.append("=>");
        sb.append(c9304.f28191[this.f42916]);
        return sb.toString();
    }
}
