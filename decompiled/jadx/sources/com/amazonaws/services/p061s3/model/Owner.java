package com.amazonaws.services.p061s3.model;

import java.io.Serializable;
import p067l.C10965;

/* JADX INFO: loaded from: classes.dex */
public class Owner implements Serializable {
    public static final long serialVersionUID = -8916731456944569115L;

    /* JADX INFO: renamed from: ᩸ */
    public String f1797;

    /* JADX INFO: renamed from: ᩹ */
    public String f1798;

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Owner [name=");
        sb.append(this.f1797);
        sb.append(",id=");
        return C10965.m25286(sb, this.f1798, "]");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1807(String str) {
        this.f1798 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1806(String str) {
        this.f1797 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f1798;
        String str2 = owner.f1797;
        String str3 = this.f1798;
        String str4 = this.f1797;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str4 == null) {
            str4 = "";
        }
        return str.equals(str3) && str2.equals(str4);
    }

    public final int hashCode() {
        String str = this.f1798;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
