.class public Ll/᩶ܳ᩻;
.super Ll/᩶ܶۢ;
.source "O8BF"


# static fields
.field public static final synthetic ۛ֫:I


# instance fields
.field public ۗ֫:Ll/ܶ᩵ܿ;

.field public ۤ֫:Ll/ۙۡ᩻;

.field public ۫֫:Z

.field public ۬֫:Ll/ۧ᩻᩻;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    invoke-direct {p0}, Ll/᩶ܶۢ;-><init>()V

    .line 75
    new-instance v0, Ll/ۧ᩻᩻;

    invoke-direct {v0}, Ll/ۧ᩻᩻;-><init>()V

    iput-object v0, p0, Ll/᩶ܳ᩻;->۬֫:Ll/ۧ᩻᩻;

    .line 76
    new-instance v0, Ll/ۙۡ᩻;

    invoke-direct {v0}, Ll/ۙۡ᩻;-><init>()V

    iput-object v0, p0, Ll/᩶ܳ᩻;->ۤ֫:Ll/ۙۡ᩻;

    const/4 v0, 0x1

    .line 77
    iput-boolean v0, p0, Ll/᩶ܳ᩻;->۫֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 262
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 263
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 265
    :cond_0
    iget-object p1, p0, Ll/᩶ܳ᩻;->ۤ֫:Ll/ۙۡ᩻;

    invoke-virtual {p1}, Ll/ۙۡ᩻;->֫()Ljava/util/List;

    move-result-object p1

    .line 266
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 267
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 268
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "streamMode"

    .line 87
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "targetPath"

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2f

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 89
    :cond_0
    iget-boolean v0, p0, Ll/᩶ܳ᩻;->۫֫:Z

    if-eqz v0, :cond_1

    const v0, 0x7f12052f

    .line 651
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a28

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 92
    :cond_1
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a31

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 82
    sget-object v0, Ll/᩻ܶۢ;->ᩳ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 12

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const-string v0, "targetPath"

    .line 109
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 110
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/ۗۢ᩻;

    .line 111
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܽ֫()Ll/ܰܺܳ;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ll/ۗۢ᩻;

    const-string v0, "streamMode"

    .line 113
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 116
    sget-object v1, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ll/ܶ᩵ܿ;->᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ܳ᩻;->ۗ֫:Ll/ܶ᩵ܿ;

    .line 117
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۛ()V

    .line 118
    iget-object v1, p0, Ll/᩶ܳ᩻;->ۗ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ll/ܶܳ᩻;

    invoke-direct {v7, p0}, Ll/ܶܳ᩻;-><init>(Ll/᩶ܳ᩻;)V

    iget-object v1, p0, Ll/᩶ܳ᩻;->۬֫:Ll/ۧ᩻᩻;

    move-object v3, v8

    move-object v4, v10

    invoke-virtual/range {v1 .. v7}, Ll/ۧ᩻᩻;->֫(Ll/ۗۢ᩻;Ll/ۗۢ᩻;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ll/֨ۡ᩻;)V

    .line 301
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 160
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :cond_0
    const v1, 0x7f120797

    .line 162
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v1, "..."

    .line 163
    invoke-virtual {p0, v1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 164
    invoke-virtual {p0, v1}, Ll/᩶ܶۢ;->ᩳ(Z)V

    const v1, 0x7f12052f

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 165
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ARG_MSG_TO"

    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ll/᩶ܶۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    new-instance v1, Ll/᩵᩶᩻;

    iget-object v2, p0, Ll/᩶ܳ᩻;->۬֫:Ll/ۧ᩻᩻;

    invoke-virtual {v2}, Ll/ۧ᩻᩻;->֫()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/᩵᩶᩻;-><init>(Ljava/util/ArrayList;)V

    const-string v2, "/"

    const/4 v3, 0x1

    .line 199
    invoke-virtual {v1, v2, v3}, Ll/᩵᩶᩻;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object v2

    .line 167
    invoke-static {v2}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/֫ᩳ֨;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Ll/֫ᩳ֨;-><init>(I)V

    .line 168
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v3, Ll/۠ܳ᩻;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 169
    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, [Ljava/lang/String;

    .line 170
    new-instance v2, Ll/᩸ܳ᩻;

    invoke-direct {v2, p0}, Ll/᩸ܳ᩻;-><init>(Ll/᩶ܳ᩻;)V

    iget-object v3, p0, Ll/᩶ܳ᩻;->ۤ֫:Ll/ۙۡ᩻;

    invoke-virtual {v3, v2}, Ll/ۙۡ᩻;->֫(Ll/᩸۬ܳ;)V

    move-object v7, v1

    goto :goto_0

    :cond_1
    move-object v7, v2

    :goto_0
    move-object v9, v5

    .line 203
    new-instance v11, Ll/᩹ܳ᩻;

    invoke-direct {v11, p0, v0}, Ll/᩹ܳ᩻;-><init>(Ll/᩶ܳ᩻;Z)V

    iget-object v6, p0, Ll/᩶ܳ᩻;->ۤ֫:Ll/ۙۡ᩻;

    invoke-virtual/range {v6 .. v11}, Ll/ۙۡ᩻;->֫(Ll/ܰܺܳ;Ll/ۗۢ᩻;[Ljava/lang/String;Ljava/lang/String;Ll/᩹ۡ᩻;)V

    .line 257
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 274
    iget-object p1, p0, Ll/᩶ܳ᩻;->ۗ֫:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_0

    .line 275
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 277
    :cond_0
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    .line 278
    iget-object p1, p0, Ll/᩶ܳ᩻;->ۤ֫:Ll/ۙۡ᩻;

    invoke-virtual {p1}, Ll/ۙۡ᩻;->ܽ()Ll/ۗۢ᩻;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 280
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ᩷()V
    .locals 2

    const v0, 0x7f120797

    .line 98
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 99
    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    const-string v0, "streamMode"

    .line 100
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "ARG_MSG_FROM"

    .line 101
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f12052f

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll/᩶ܶۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
