.class public final synthetic Ll/֡ܽᩳ;
.super Ljava/lang/Object;
.source "B1VV"

# interfaces
.implements Ljava/util/function/Supplier;


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    .line 106
    new-instance v0, Ll/۠ܽᩳ;

    const-string v1, "DSA"

    const-string v2, "SHA256withDSA"

    const/16 v3, 0x425

    invoke-direct {v0, v3, v1, v2}, Ll/۠ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
