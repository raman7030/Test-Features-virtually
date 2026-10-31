.class public final Ll/۬۬᩵;
.super Ljava/lang/Object;
.source "TAWY"


# direct methods
.method public static synthetic ֫(Ll/ۤ۬᩵;Ll/۟۬᩵;I)Ll/ۡ۬᩵;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 341
    :goto_1
    invoke-interface {p0, v0, v1, p1}, Ll/ۤ۬᩵;->֫(ZZLl/۟۬᩵;)Ll/ۡ۬᩵;

    move-result-object p0

    return-object p0
.end method
