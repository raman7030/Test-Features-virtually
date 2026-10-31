.class public Ll/ۘ᩻֨;
.super Ljava/lang/Object;
.source "L1T5"


# static fields
.field public static volatile ֫:Ll/ۘ᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 69
    new-instance v0, Ll/ۘ᩻֨;

    .line 137
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "org.tukaani.xz.ArrayCache"

    .line 78
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Dummy"

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    const-string v3, "Basic"

    .line 82
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 84
    sput-object v0, Ll/ۘ᩻֨;->֫:Ll/ۘ᩻֨;

    return-void

    .line 92
    :cond_1
    new-instance v0, Ljava/lang/Error;

    const-string v2, "Unsupported value \'"

    const-string v3, "\' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 92
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_2
    sget-object v0, Ll/ۚ᩻֨;->֫:Ll/֨᩻֨;

    .line 88
    sput-object v0, Ll/ۘ᩻֨;->֫:Ll/ۘ᩻֨;

    return-void
.end method

.method public static ֫()Ll/ۘ᩻֨;
    .locals 1

    .line 115
    sget-object v0, Ll/ۘ᩻֨;->֫:Ll/ۘ᩻֨;

    return-object v0
.end method


# virtual methods
.method public ֫([B)V
    .locals 0

    return-void
.end method

.method public ֫([I)V
    .locals 0

    return-void
.end method

.method public ֫(I)[B
    .locals 0

    .line 155
    new-array p1, p1, [B

    return-object p1
.end method

.method public ֫(IZ)[I
    .locals 0

    .line 182
    new-array p1, p1, [I

    return-object p1
.end method
