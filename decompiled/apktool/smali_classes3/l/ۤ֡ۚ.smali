.class public abstract Ll/ۤ֡ۚ;
.super Ll/ۨ֡ۚ;
.source "EBIH"


# instance fields
.field public ۙ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ll/ۨ֡ۚ;-><init>()V

    return-void
.end method

.method private ۤ()V
    .locals 3

    .line 12
    iget-object v0, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    instance-of v1, v0, Ll/ܺ֡ۚ;

    if-nez v1, :cond_0

    .line 24
    new-instance v1, Ll/ܺ֡ۚ;

    invoke-direct {v1}, Ll/ܺ֡ۚ;-><init>()V

    .line 25
    iput-object v1, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ܺ()Ljava/lang/String;

    move-result-object v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ll/ܺ֡ۚ;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 72
    invoke-direct {p0}, Ll/ۤ֡ۚ;->ۤ()V

    .line 73
    invoke-super {p0, p1}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;
    .locals 1

    .line 12
    iget-object v0, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    instance-of v0, v0, Ll/ܺ֡ۚ;

    if-nez v0, :cond_0

    const-string v0, "#doctype"

    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iput-object p2, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    return-object p0

    .line 52
    :cond_0
    invoke-direct {p0}, Ll/ۤ֡ۚ;->ۤ()V

    .line 53
    invoke-super {p0, p1, p2}, Ll/ۨ֡ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ۨ֡ۚ;

    return-object p0
.end method

.method public final ֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;
    .locals 2

    .line 103
    invoke-super {p0, p1}, Ll/ۨ֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;

    move-result-object p1

    check-cast p1, Ll/ۤ֡ۚ;

    .line 12
    iget-object v0, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    instance-of v1, v0, Ll/ܺ֡ۚ;

    if-eqz v1, :cond_0

    .line 107
    check-cast v0, Ll/ܺ֡ۚ;

    invoke-virtual {v0}, Ll/ܺ֡ۚ;->clone()Ll/ܺ֡ۚ;

    move-result-object v0

    iput-object v0, p1, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final ֫()Ll/ܺ֡ۚ;
    .locals 1

    .line 17
    invoke-direct {p0}, Ll/ۤ֡ۚ;->ۤ()V

    .line 18
    iget-object v0, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    check-cast v0, Ll/ܺ֡ۚ;

    return-object v0
.end method

.method public ۗ()Ljava/lang/String;
    .locals 1

    .line 28
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ()Ljava/util/List;
    .locals 1

    .line 98
    sget-object v0, Ll/ۨ֡ۚ;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    instance-of v0, v0, Ll/ܺ֡ۚ;

    if-nez v0, :cond_1

    .line 42
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ܺ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1

    .line 44
    :cond_1
    invoke-super {p0, p1}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ۫()Ljava/lang/String;
    .locals 1

    .line 51
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܳ()Ll/ۨ֡ۚ;
    .locals 0

    return-object p0
.end method

.method public ܽ()Ljava/lang/String;
    .locals 1

    .line 78
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    .line 78
    invoke-virtual {v0}, Ll/ۨ֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ᩳ(Ljava/lang/String;)Z
    .locals 0

    .line 60
    invoke-direct {p0}, Ll/ۤ֡ۚ;->ۤ()V

    .line 61
    invoke-super {p0, p1}, Ll/ۨ֡ۚ;->ᩳ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    .line 32
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ܺ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۤ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 12
    iget-object v0, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    instance-of v0, v0, Ll/ܺ֡ۚ;

    return v0
.end method
