package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public final class C18047 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f56244;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f56245;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14518 f56246;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        C14518 c14518 = this.f56246;
        String str3 = this.f56245;
        int iM34670 = c14518.m34670(str3);
        String str4 = "";
        if (iM34670 != -1 && (str = c14518.f44499[iM34670]) != null) {
            str4 = str;
        }
        int iM34671 = c14518.m34670(str3);
        if (iM34671 != -1) {
            c14518.f44499[iM34671] = str2;
        }
        this.f56244 = str2;
        return str4;
    }

    public C18047(String str, String str2, C14518 c14518) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        this.f56245 = str.trim();
        if (str.length() != 0) {
            this.f56244 = str2;
            this.f56246 = c14518;
            return;
        }
        throw new IllegalArgumentException("String must not be empty");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f56245;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f56245;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f56244;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.f56244;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18047.class == obj.getClass()) {
            C18047 c18047 = (C18047) obj;
            String str = c18047.f56245;
            String str2 = this.f56245;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f56244;
            String str4 = c18047.f56244;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.f56245;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56244;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C18047) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
