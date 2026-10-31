.class public Ll/ۛ᩺ܳ;
.super Ll/᩹ܶۢ;
.source "K8BJ"


# static fields
.field public static final synthetic ᩴ֫:I


# instance fields
.field public final ۘ֫:Ll/۟۟ܳ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    invoke-direct {p0}, Ll/᩹ܶۢ;-><init>()V

    .line 68
    new-instance v0, Ll/۟۟ܳ;

    invoke-direct {v0}, Ll/۟۟ܳ;-><init>()V

    iput-object v0, p0, Ll/ۛ᩺ܳ;->ۘ֫:Ll/۟۟ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 140
    invoke-virtual {p4}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 141
    invoke-virtual {p2}, Ll/ܽۢܳ;->ܳ()V

    .line 143
    :cond_0
    iget-object p1, p0, Ll/ۛ᩺ܳ;->ۘ֫:Ll/۟۟ܳ;

    invoke-virtual {p1}, Ll/۟۟ܳ;->֫()Ljava/util/HashSet;

    move-result-object p1

    .line 144
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ۘ۠ۢ;->֫(Ll/ܽۢܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 145
    invoke-virtual {p3, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 146
    invoke-virtual {p3}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_1
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "targetPath"

    .line 77
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۚ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2a

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 72
    sget-object v0, Ll/᩻ܶۢ;->֡:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 5

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "targetPath"

    .line 90
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 91
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v2

    .line 92
    new-instance v3, Ll/ۤ᩺ܳ;

    invoke-direct {v3, p0}, Ll/ۤ᩺ܳ;-><init>(Ll/ۛ᩺ܳ;)V

    iget-object v4, p0, Ll/ۛ᩺ܳ;->ۘ֫:Ll/۟۟ܳ;

    invoke-virtual {v4, v2, v0, v1, v3}, Ll/۟۟ܳ;->֫(Ll/ܰܺܳ;[Ljava/lang/String;Ljava/lang/String;Ll/ۨ۟ܳ;)V

    .line 134
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->۬֫()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 152
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120797

    .line 82
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 83
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
