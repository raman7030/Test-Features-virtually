.class public Ll/۬ܳ᩻;
.super Ll/᩶ܶۢ;
.source "MAIE"


# instance fields
.field public ۗ֫:Ll/ۙۡ᩻;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Ll/᩶ܶۢ;-><init>()V

    .line 66
    new-instance v0, Ll/ۙۡ᩻;

    invoke-direct {v0}, Ll/ۙۡ᩻;-><init>()V

    iput-object v0, p0, Ll/۬ܳ᩻;->ۗ֫:Ll/ۙۡ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 147
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 148
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 150
    :cond_0
    iget-object p1, p0, Ll/۬ܳ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual {p1}, Ll/ۙۡ᩻;->֫()Ljava/util/List;

    move-result-object p1

    .line 151
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 152
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 153
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "descPath"

    .line 75
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

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

    .line 70
    sget-object v0, Ll/᩻ܶۢ;->֡:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 7

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const-string v0, "targetPath"

    .line 88
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 89
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v2

    .line 90
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܽ֫()Ll/ܰܺܳ;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ۗۢ᩻;

    .line 91
    new-instance v6, Ll/ۗܳ᩻;

    invoke-direct {v6, p0}, Ll/ۗܳ᩻;-><init>(Ll/۬ܳ᩻;)V

    iget-object v1, p0, Ll/۬ܳ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual/range {v1 .. v6}, Ll/ۙۡ᩻;->֫(Ll/ܰܺܳ;Ll/ۗۢ᩻;[Ljava/lang/String;Ljava/lang/String;Ll/᩹ۡ᩻;)V

    .line 142
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 159
    iget-object p1, p0, Ll/۬ܳ᩻;->ۗ֫:Ll/ۙۡ᩻;

    invoke-virtual {p1}, Ll/ۙۡ᩻;->ܽ()Ll/ۗۢ᩻;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 161
    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 80
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 81
    invoke-virtual {p0, v0}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method
