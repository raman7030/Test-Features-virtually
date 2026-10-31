.class public final Ll/ۙ᩻᩵;
.super Ll/֨᩻᩵;
.source "I6PU"


# instance fields
.field public ܰ:Ll/۠ۜ᩵;


# virtual methods
.method public final ֫(I)Ll/ۗ᩻᩵;
    .locals 6

    .line 830
    iget-object v0, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-eqz v2, :cond_2

    iget-object v3, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-eqz v3, :cond_2

    iget-object v4, p0, Ll/ۙ᩻᩵;->ܰ:Ll/۠ۜ᩵;

    if-eqz v4, :cond_2

    if-lez p1, :cond_0

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, p0

    .line 832
    :goto_0
    invoke-virtual {v3, v2, v4, v5}, Ll/ۗ᩻᩵;->֫(Ljava/lang/Object;Ll/۠ۜ᩵;Ll/ۙ᩻᩵;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 834
    :cond_1
    iput-object v1, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    iput-object v1, p0, Ll/ۙ᩻᩵;->ܰ:Ll/۠ۜ᩵;

    .line 835
    invoke-virtual {v3, v0, p1}, Ll/ۗ᩻᩵;->֫(Ll/ۗ᩻᩵;I)Ll/ۗ᩻᩵;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    return-object v1
.end method
