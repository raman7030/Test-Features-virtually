package com.amazonaws.services.p061s3.model;

import p067l.C10965;

/* JADX INFO: loaded from: classes.dex */
public enum GroupGrantee implements Grantee {
    AllUsers("http://acs.amazonaws.com/groups/global/AllUsers"),
    AuthenticatedUsers("http://acs.amazonaws.com/groups/global/AuthenticatedUsers"),
    LogDelivery("http://acs.amazonaws.com/groups/s3/LogDelivery");


    /* JADX INFO: renamed from: ᩸ */
    public String f1764;

    /* JADX INFO: renamed from: ۧ */
    public String m1743() {
        return "uri";
    }

    GroupGrantee(String str) {
        this.f1764 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m1742() {
        return this.f1764;
    }

    @Override // com.amazonaws.services.p061s3.model.Grantee
    /* JADX INFO: renamed from: ֫ */
    public void mo1705(String str) {
        throw new UnsupportedOperationException("Group grantees have preset identifiers that cannot be modified.");
    }

    @Override // java.lang.Enum
    public String toString() {
        return C10965.m25286(new StringBuilder("GroupGrantee ["), this.f1764, "]");
    }

    /* JADX INFO: renamed from: ۧ */
    public static GroupGrantee m1741(String str) {
        for (GroupGrantee groupGrantee : values()) {
            if (groupGrantee.f1764.equals(str)) {
                return groupGrantee;
            }
        }
        return null;
    }
}
