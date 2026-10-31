.class public final Ll/ۤᩳ֨;
.super Ll/ۨ֫֨;
.source "I7E4"


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 3

    .line 44
    iget-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 45
    iget v0, p0, Ll/ۨ֫֨;->ۗ֫:I

    new-instance v1, Ll/۫ᩳ֨;

    invoke-direct {v1, p0}, Ll/۫ᩳ֨;-><init>(Ll/ۤᩳ֨;)V

    iget-object v2, p0, Ll/ۨ֫֨;->۟֫:Ll/ۤۧ֨;

    invoke-virtual {v2, v0, v1}, Ll/ۤۧ֨;->֫(ILjava/util/function/Function;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    .line 48
    :cond_0
    iget-object v0, p0, Ll/ۨ֫֨;->᩺֫:Ljava/lang/String;

    return-object v0
.end method
