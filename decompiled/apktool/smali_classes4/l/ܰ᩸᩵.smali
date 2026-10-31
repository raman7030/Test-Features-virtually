.class public final Ll/ܰ᩸᩵;
.super Ll/ۨ᩸᩵;
.source "8AWA"


# virtual methods
.method public final ֫()Ll/᩵᩶᩵;
    .locals 2

    .line 40
    sget-object v0, Ll/᩺᩸᩵;->֫:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ll/ۖ᩶᩵;

    invoke-direct {v0}, Ll/ۖ᩶᩵;-><init>()V

    return-object v0

    .line 58
    :cond_1
    :goto_0
    new-instance v0, Ll/֡᩶᩵;

    .line 35
    invoke-direct {v0}, Ll/᩵᩶᩵;-><init>()V

    return-object v0
.end method
