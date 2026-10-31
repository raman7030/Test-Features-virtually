.class public final Ll/ۧۤۡ;
.super Ljava/lang/ThreadLocal;
.source "A5R0"


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 5

    .line 26
    new-instance v0, Ll/ᩳۤۡ;

    const-string v1, "dd-MM-yy HH:mm:ss"

    const-string v2, "dd-MM-yy HH:mm"

    const-string v3, "dd-MM-yyyy HH:mm:ss"

    const-string v4, "dd-MM-yyyy HH:mm"

    invoke-direct {v0, v3, v4, v1, v2}, Ll/ᩳۤۡ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
