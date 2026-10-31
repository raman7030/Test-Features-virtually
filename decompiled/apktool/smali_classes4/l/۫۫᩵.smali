.class public abstract Ll/۫۫᩵;
.super Ll/ۛ۫᩵;
.source "3ANU"


# virtual methods
.method public ֫(Ll/᩻ۤ᩵;)Z
    .locals 5

    .line 619
    invoke-virtual {p0}, Ll/۫۫᩵;->ܳ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 620
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ܽ()Ll/ܿۛ᩵;

    move-result-object v0

    .line 166
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->᩷()Ll/᩷ۛ᩵;

    move-result-object v2

    .line 620
    instance-of v3, v2, Ll/᩷ۤ᩵;

    if-eqz v3, :cond_1

    goto :goto_1

    .line 168
    :cond_1
    invoke-virtual {v2, p1, v0}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    .line 621
    :cond_2
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ܽ()Ll/ܿۛ᩵;

    move-result-object v0

    .line 91
    new-instance v2, Ll/۬۫᩵;

    invoke-direct {v2, p1, p0}, Ll/۬۫᩵;-><init>(Ll/᩷ۛ᩵;Ll/۫۫᩵;)V

    .line 179
    :goto_0
    invoke-virtual {v0}, Ll/᩷ۛ᩵;->᩷()Ll/᩷ۛ᩵;

    move-result-object v3

    .line 621
    instance-of v4, v3, Ll/᩷ۤ᩵;

    if-eqz v4, :cond_3

    goto :goto_1

    .line 181
    :cond_3
    invoke-virtual {v3, p1, v0, v2}, Ll/᩷ۛ᩵;->֫(Ll/᩷ۛ᩵;Ll/ܿۛ᩵;Ll/᩻ۛ᩵;)I

    move-result v3

    if-eq v3, v1, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_2
    return v1
.end method

.method public final ۜ()Ll/۟۫᩵;
    .locals 1

    .line 699
    new-instance v0, Ll/᩶۫᩵;

    invoke-direct {v0, p0}, Ll/᩶۫᩵;-><init>(Ll/۫۫᩵;)V

    return-object v0
.end method

.method public abstract ܳ()Z
.end method

.method public ᩷()Ljava/lang/Object;
    .locals 1

    .line 542
    invoke-virtual {p0}, Ll/ۛ۫᩵;->ܿ()Ll/᩷ۤ᩵;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ll/ۤ۫᩵;->ᩳ:Ll/ܶۛ᩵;

    return-object v0

    .line 547
    :cond_0
    invoke-virtual {v0}, Ll/᩷ۤ᩵;->ۘ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract ᩻()Z
.end method
