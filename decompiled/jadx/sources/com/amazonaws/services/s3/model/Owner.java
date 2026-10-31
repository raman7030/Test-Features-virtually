package com.amazonaws.services.s3.model;

import java.io.Serializable;
import l.C9045;

/* JADX INFO: loaded from: classes.dex */
public class Owner implements Serializable {
    public static final long serialVersionUID = -8916731456944569115L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f637;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f638;

    public final String toString() {
        StringBuilder sb = new StringBuilder("S3Owner [name=");
        sb.append(this.f637);
        sb.append(",id=");
        return C9045.m23341(sb, this.f638, "]");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m642(String str) {
        this.f638 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m641(String str) {
        this.f637 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Owner)) {
            return false;
        }
        Owner owner = (Owner) obj;
        String str = owner.f638;
        String str2 = owner.f637;
        String str3 = this.f638;
        String str4 = this.f637;
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
        String str = this.f638;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
