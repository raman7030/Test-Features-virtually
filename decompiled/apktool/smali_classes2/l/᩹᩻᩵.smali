.class public final Ll/᩹᩻᩵;
.super Ll/֨᩻᩵;
.source "I6PU"


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 5

    .line 1087
    iget-object v0, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_2

    iget-object v3, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-nez v3, :cond_0

    goto :goto_0

    .line 1090
    :cond_0
    iget-object v4, v3, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v4, :cond_1

    .line 1091
    invoke-virtual {v3, v2}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Object;)V

    .line 1092
    :cond_1
    iput-object v1, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    .line 1093
    invoke-virtual {v3, v0, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۗ᩻᩵;I)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method
