package com.tencent.p062mm.opensdk.diffdev.p064a;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.diffdev.a.g */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0613g {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(405),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);

    public int code;

    EnumC0613g(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UUIDStatusCode:" + this.code;
    }
}
