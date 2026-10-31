.class public Ll/۟ܿ᩻;
.super Ll/᩶ܶۢ;
.source "G7TD"


# instance fields
.field public ۗ֫:Ll/ۙۡ᩻;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 87
    invoke-direct {p0}, Ll/᩶ܶۢ;-><init>()V

    .line 89
    new-instance v0, Ll/ۙۡ᩻;

    invoke-direct {v0}, Ll/ۙۡ᩻;-><init>()V

    iput-object v0, p0, Ll/۟ܿ᩻;->ۗ֫:Ll/ۙۡ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 171
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 172
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 173
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    .line 175
    :cond_0
    iget-object p1, p0, Ll/۟ܿ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual {p1}, Ll/ۙۡ᩻;->֫()Ljava/util/List;

    move-result-object p1

    .line 176
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 177
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 178
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "descPath"

    .line 98
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2c

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 93
    sget-object v0, Ll/᩻ܶۢ;->ܿ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 7

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const-string v0, "targetPath"

    .line 111
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 112
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v2

    .line 113
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܽ֫()Ll/ܰܺܳ;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ۗۢ᩻;

    .line 114
    iget-object v0, p0, Ll/۟ܿ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual {v0}, Ll/ۙۡ᩻;->ᩳ()V

    .line 115
    new-instance v6, Ll/ܰܿ᩻;

    invoke-direct {v6, p0}, Ll/ܰܿ᩻;-><init>(Ll/۟ܿ᩻;)V

    iget-object v1, p0, Ll/۟ܿ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual/range {v1 .. v6}, Ll/ۙۡ᩻;->֫(Ll/ܰܺܳ;Ll/ۗۢ᩻;[Ljava/lang/String;Ljava/lang/String;Ll/᩹ۡ᩻;)V

    .line 166
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 2

    .line 184
    iget-object p1, p0, Ll/۟ܿ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual {p1}, Ll/ۙۡ᩻;->ܽ()Ll/ۗۢ᩻;

    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    .line 187
    invoke-virtual {p1}, Ll/ۙۡ᩻;->ۧ()Ll/ܰܺܳ;

    move-result-object p1

    .line 188
    instance-of v1, p1, Ll/ۖۧ᩻;

    if-eqz v1, :cond_0

    .line 189
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void

    .line 190
    :cond_0
    instance-of v1, p1, Ll/ۗۢ᩻;

    if-eqz v1, :cond_1

    check-cast p1, Ll/ۗۢ᩻;

    .line 191
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 192
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 103
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 104
    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
