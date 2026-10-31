.class public final Ll/ۡܿ֨;
.super Ll/ۨ֫֨;
.source "47EM"


# static fields
.field public static final synthetic ֫ۧ:I


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 3

    .line 48
    iget-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 49
    iget v0, p0, Ll/ۨ֫֨;->ۗ֫:I

    new-instance v1, Ll/᩸ܶ᩷;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/᩸ܶ᩷;-><init>(I)V

    iget-object v2, p0, Ll/ۨ֫֨;->۟֫:Ll/ۤۧ֨;

    invoke-virtual {v2, v0, v1}, Ll/ۤۧ֨;->ۧ(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    .line 51
    :cond_0
    iget-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 44
    iget-boolean v0, p0, Ll/ۢܽ֨;->۫:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۡܿ֨;->֨()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
