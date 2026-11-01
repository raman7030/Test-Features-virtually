package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public final class C19520 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public String f59446;

    /* JADX INFO: renamed from: ᩸ */
    public String f59447;

    /* JADX INFO: renamed from: ᩹ */
    public C16166 f59448;

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        String str2 = (String) obj;
        C16166 c16166 = this.f59448;
        String str3 = this.f59447;
        int iM36812 = c16166.m36812(str3);
        String str4 = "";
        if (iM36812 != -1 && (str = c16166.f47605[iM36812]) != null) {
            str4 = str;
        }
        int iM36813 = c16166.m36812(str3);
        if (iM36813 != -1) {
            c16166.f47605[iM36813] = str2;
        }
        this.f59446 = str2;
        return str4;
    }

    public C19520(String str, String str2, C16166 c16166) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        this.f59447 = str.trim();
        if (str.length() != 0) {
            this.f59446 = str2;
            this.f59448 = c16166;
            return;
        }
        throw new IllegalArgumentException("String must not be empty");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f59447;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.f59447;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f59446;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.f59446;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19520.class == obj.getClass()) {
            C19520 c19520 = (C19520) obj;
            String str = c19520.f59447;
            String str2 = this.f59447;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f59446;
            String str4 = c19520.f59446;
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
        String str = this.f59447;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f59446;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final Object clone() {
        try {
            return (C19520) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
