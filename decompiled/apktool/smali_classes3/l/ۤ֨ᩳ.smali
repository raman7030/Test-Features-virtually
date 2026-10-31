.class public final synthetic Ll/ۤ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ܶۜ᩵;


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/ۨ᩵ᩳ;

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 638
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
