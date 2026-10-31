.class public final synthetic Ll/᩷֡᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/ܺ᩹᩵;


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ll/ᩳۜܳ;

    .line 648
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 0
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
