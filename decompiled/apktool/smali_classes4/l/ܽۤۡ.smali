.class public final Ll/ܽۤۡ;
.super Ljava/lang/ThreadLocal;
.source "A5R0"


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 5

    .line 38
    new-instance v0, Ll/ᩳۤۡ;

    const-string v1, "HH:mm:ss dd-MM-yy"

    const-string v2, "HH:mm dd-MM-yy"

    const-string v3, "HH:mm:ss dd-MM-yyyy"

    const-string v4, "HH:mm dd-MM-yyyy"

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ᩳۤۡ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
