.class public final Ll/֫ۚ᩵;
.super Ll/᩻ۚ᩵;
.source "O9XM"


# virtual methods
.method public final ֫(Ll/ܳۚ᩵;)Ll/۬ۚ᩵;
    .locals 11

    .line 48
    new-instance v10, Ll/۬ۚ᩵;

    .line 49
    invoke-virtual {p0}, Ll/᩻ۚ᩵;->֫()Ll/ۤۡ᩵;

    move-result-object v1

    .line 50
    invoke-interface {p1}, Ll/ܳۚ᩵;->getName()Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-interface {p1}, Ll/ܳۚ᩵;->getAttributes()I

    move-result v5

    .line 55
    invoke-interface {p1}, Ll/ܳۚ᩵;->ۚ()J

    move-result-wide v6

    .line 57
    invoke-interface {p1}, Ll/ܳۚ᩵;->length()J

    move-result-wide v8

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Ll/۬ۚ᩵;-><init>(Ll/ۤۡ᩵;Ljava/lang/String;ZIIJJ)V

    return-object v10
.end method
