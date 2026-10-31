.class public final Ll/ܳܳ᩵;
.super Ll/ۗ᩺ᩴ;
.source "N673"

# interfaces
.implements Ll/۠ۨᩴ;


# virtual methods
.method public final a(Ll/ܶ۫ᩴ;JJJJ)Ll/ܶ۫ᩴ;
    .locals 11

    .line 868
    move-object v1, p1

    check-cast v1, Ll/۠ۨᩴ;

    .line 883
    new-instance v10, Ll/ܳܳ᩵;

    move-object v0, v10

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    .line 768
    invoke-direct/range {v0 .. v9}, Ll/ۘܰᩴ;-><init>(Ll/ܶ۫ᩴ;JJJJ)V

    return-object v10
.end method

.method public final b()Ljava/lang/Object;
    .locals 2

    .line 888
    new-instance v0, Ll/᩷᩺ᩴ;

    const/4 v1, 0x1

    .line 0
    invoke-direct {v0, v1}, Ll/᩷᩺ᩴ;-><init>(I)V

    return-object v0
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->b(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->g(Ll/۠ۨᩴ;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
