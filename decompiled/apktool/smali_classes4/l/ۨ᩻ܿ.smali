.class public final Ll/ۨ᩻ܿ;
.super Ll/ۢܺܿ;
.source "7AR1"


# instance fields
.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۢܺܿ;Ll/۬ۜܽ;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    const/16 p1, 0x4f04

    .line 20
    invoke-static {p2, p1}, Ll/᩹ۜܽ;->֫(Ll/۬ۜܽ;I)V

    .line 21
    invoke-virtual {p2}, Ll/۬ۜܽ;->readInt()I

    .line 22
    invoke-virtual {p2}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢܺܿ;)Ll/ۢܺܿ;
    .locals 1

    .line 54
    new-instance v0, Ll/ۨ᩻ܿ;

    .line 15
    invoke-direct {v0, p1}, Ll/ۢܺܿ;-><init>(Ll/ۢܺܿ;)V

    .line 55
    iget-object p1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    iput-object p1, v0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    .line 56
    iget-object p1, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    iput-object p1, v0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/lang/StringBuilder;I)V
    .locals 2

    const-string v0, "\t"

    .line 62
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, p2, 0x1

    .line 63
    invoke-static {v1, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "builtIn: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-static {p2, v0}, Ll/ۢܺ֡;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "}\n"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 1

    const/16 v0, 0x4f04

    .line 28
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ۡ(I)V

    .line 29
    invoke-virtual {p1}, Ll/ۤۜܽ;->ܳ()V

    .line 30
    iget-object v0, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Ll/ۤۜܽ;->֫()V

    return-void
.end method

.method public final ֫(Ll/᩷ܺܿ;)V
    .locals 2

    .line 37
    :try_start_0
    iget-object p1, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    iget-object v0, p0, Ll/ۢܺܿ;->֫:Ll/ۢܺܿ;

    invoke-static {v0, p1}, Ll/ۜ᩷ܿ;->֫(Ll/ۢܺܿ;Ljava/lang/String;)Ll/ۢܺܿ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 39
    new-instance v0, Ll/ۘۜܿ;

    iget-object v1, p0, Ll/ۢܺܿ;->ۧ:Landroid/graphics/Point;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/ۘۜܿ;-><init>(Landroid/graphics/Point;Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ۨ᩻ܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
