.class public final Ll/ۘ֡ۚ;
.super Ll/ۤ֡ۚ;
.source "K1HS"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/ۤ֡ۚ;-><init>()V

    .line 19
    iput-object p1, p0, Ll/ۤ֡ۚ;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 57
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/ۘ֡ۚ;

    return-object v0
.end method

.method public final clone()Ll/ۨ֡ۚ;
    .locals 1

    .line 57
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/ۘ֡ۚ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 52
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 2

    .line 40
    invoke-virtual {p3}, Ll/֡֡ۚ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 611
    iget v0, p0, Ll/ۨ֡ۚ;->᩹:I

    if-nez v0, :cond_1

    .line 40
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    instance-of v1, v0, Ll/᩶֡ۚ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/᩶֡ۚ;

    invoke-virtual {v0}, Ll/᩶֡ۚ;->ۜ֫()Ll/ܽ֨ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p1, p2, p3}, Ll/ۨ֡ۚ;->ܽ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V

    :cond_1
    :goto_0
    const-string p2, "<!--"

    .line 43
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    .line 31
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object p2

    .line 44
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const-string p2, "-->"

    .line 45
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public final ۛ()Z
    .locals 3

    .line 31
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    const-string v1, "!"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۤ()Ll/ܽۚۚ;
    .locals 6

    .line 31
    invoke-virtual {p0}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v1, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const-string v4, "!"

    if-le v3, v1, :cond_0

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "?"

    invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "<"

    const-string v3, ">"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 250
    new-instance v2, Ll/ۧ֨ۚ;

    new-instance v3, Ll/ܿۚۚ;

    invoke-direct {v3}, Ll/ܿۚۚ;-><init>()V

    invoke-direct {v2, v3}, Ll/ۧ֨ۚ;-><init>(Ll/֡ܶۚ;)V

    .line 88
    invoke-virtual {v2}, Ll/ۧ֨ۚ;->ܿ()V

    .line 13
    invoke-super {p0}, Ll/ۤ֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v3

    .line 88
    invoke-virtual {v2, v1, v3}, Ll/ۧ֨ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/֨֡ۚ;

    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶֡ۚ;->۫()Ll/֫᩸ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 90
    invoke-virtual {v1}, Ll/֨֡ۚ;->ᩴ֫()Ll/᩶֡ۚ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶֡ۚ;->᩶()Ll/᩶֡ۚ;

    move-result-object v2

    .line 91
    new-instance v3, Ll/ܽۚۚ;

    invoke-static {v1}, Ll/᩺֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۧ֨ۚ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ֨ۚ;->ܿ()Ll/֫֨ۚ;

    move-result-object v1

    invoke-virtual {v2}, Ll/᩶֡ۚ;->᩷֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/֫֨ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    invoke-direct {v3, v1, v0}, Ll/ܽۚۚ;-><init>(Ljava/lang/String;Z)V

    .line 92
    invoke-virtual {v3}, Ll/ۤ֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    invoke-virtual {v2}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܺ֡ۚ;->֫(Ll/ܺ֡ۚ;)V

    return-object v3

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 0

    return-void
.end method

.method public final ܳ()Ll/ۨ֡ۚ;
    .locals 0

    return-object p0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    const-string v0, "#comment"

    return-object v0
.end method

.method public final bridge synthetic ᩳ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
