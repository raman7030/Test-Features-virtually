.class public final synthetic Ll/᩷ܽᩳ;
.super Ljava/lang/Object;
.source "B1VV"

# interfaces
.implements Ljava/util/function/Supplier;


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 8

    .line 73
    new-instance v6, Ll/֨ܽᩳ;

    new-instance v7, Ljava/security/spec/PSSParameterSpec;

    sget-object v3, Ljava/security/spec/MGF1ParameterSpec;->SHA512:Ljava/security/spec/MGF1ParameterSpec;

    const/16 v4, 0x40

    const/4 v5, 0x1

    const-string v1, "SHA-512"

    const-string v2, "MGF1"

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, Ljava/security/spec/PSSParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;II)V

    const/16 v1, 0x102

    const-string v2, "SHA-512"

    const-string v3, "RSA"

    const-string v4, "SHA512withRSA/PSS"

    move-object v0, v6

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Ll/֨ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V

    return-object v6
.end method
