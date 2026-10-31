.class public final Ll/ۢۚ᩵;
.super Ll/᩻ۚ᩵;
.source "Z9SC"


# virtual methods
.method public final ֫(Ll/ܳۚ᩵;)Ll/۬ۚ᩵;
    .locals 11

    .line 47
    new-instance v10, Ll/۬ۚ᩵;

    invoke-virtual {p0}, Ll/᩻ۚ᩵;->֫()Ll/ۤۡ᩵;

    move-result-object v1

    invoke-interface {p1}, Ll/ܳۚ᩵;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ll/ܳۚ᩵;->getType()I

    move-result v4

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v3, 0x0

    const/16 v5, 0x11

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Ll/۬ۚ᩵;-><init>(Ll/ۤۡ᩵;Ljava/lang/String;ZIIJJ)V

    return-object v10
.end method
