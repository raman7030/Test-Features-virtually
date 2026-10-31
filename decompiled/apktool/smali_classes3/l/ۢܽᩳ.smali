.class public final synthetic Ll/ۢܽᩳ;
.super Ljava/lang/Object;
.source "B1VV"

# interfaces
.implements Ljava/util/function/Supplier;


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    .line 78
    new-instance v6, Ll/֨ܽᩳ;

    const-string v4, "SHA256withRSA"

    const/4 v5, 0x0

    const/16 v1, 0x103

    const-string v2, "SHA-256"

    const-string v3, "RSA"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/֨ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V

    return-object v6
.end method
