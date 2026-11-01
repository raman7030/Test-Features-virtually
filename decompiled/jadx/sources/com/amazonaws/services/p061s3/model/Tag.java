package com.amazonaws.services.p061s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Tag implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public String f1829;

    /* JADX INFO: renamed from: ᩹ */
    public String f1830;

    public Tag(String str, String str2) {
        this.f1829 = str;
        this.f1830 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1837() {
        return this.f1829;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m1838() {
        return this.f1830;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Tag tag = (Tag) obj;
            String str = tag.f1830;
            String str2 = tag.f1829;
            String str3 = this.f1829;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            String str4 = this.f1830;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1829;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1830;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
