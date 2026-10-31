.class public final Ll/ᩳۜܿ;
.super Ljava/lang/Object;
.source "4BIJ"

# interfaces
.implements Ll/ܿۜܿ;


# instance fields
.field public final synthetic ܺ:Ll/۠᩶ۢ;


# direct methods
.method public constructor <init>(Ll/۠᩶ۢ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۜܿ;->ܺ:Ll/۠᩶ۢ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۨᩳ;Ljava/lang/CharSequence;Ll/ᩴ᩷ܿ;)V
    .locals 3

    .line 51
    iget-object v0, p0, Ll/ᩳۜܿ;->ܺ:Ll/۠᩶ۢ;

    .line 28
    :try_start_0
    new-instance v1, Ll/ۗ᩶ۢ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->᩸ۧ()Z

    move-result v2

    invoke-virtual {p1}, Ll/۫ۨᩳ;->֫ۧ()I

    move-result p1

    invoke-direct {v1, p1, v2}, Ll/ۗ᩶ۢ;-><init>(IZ)V

    .line 51
    invoke-interface {v0, p2, v1, p3}, Ll/۠᩶ۢ;->֫(Ljava/lang/CharSequence;Ll/ۗ᩶ۢ;Ll/ᩴ᩷ܿ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 60
    sget-object p2, Ll/᩹᩶ۢ;->ۜ:Ll/۠᩶ۢ;

    if-ne v0, p2, :cond_1

    instance-of p2, p1, Ll/ᩴܰۢ;

    if-eqz p2, :cond_1

    check-cast p1, Ll/ᩴܰۢ;

    .line 62
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 63
    iget-object p3, p1, Ll/ᩴܰۢ;->᩶:Ll/֡ܰۢ;

    sget-object v0, Ll/֡ܰۢ;->ۗ:Ll/֡ܰۢ;

    if-ne p3, v0, :cond_0

    .line 64
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "line "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p1, Ll/ᩴܰۢ;->᩹:I

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Ll/ᩴܰۢ;->᩸:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 66
    :cond_0
    new-instance p1, Ll/᩵ۤۡ;

    .line 14
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    .line 68
    :cond_1
    sget-object p2, Ll/᩹᩶ۢ;->ܳ:Ll/ۚۤۢ;

    const/4 p3, 0x0

    if-ne v0, p2, :cond_3

    instance-of p2, p1, Ll/֡ۤۢ;

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    check-cast p1, Ll/֡ۤۢ;

    .line 69
    new-instance p2, Ll/ۘۜܿ;

    iget v0, p1, Ll/֡ۤۢ;->᩸:I

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 21
    iget v2, p1, Ll/֡ۤۢ;->᩹:I

    invoke-direct {p2, p3, v2, v0, v1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 69
    invoke-virtual {p2, p1}, Ll/ۘۜܿ;->initCause(Ljava/lang/Throwable;)V

    :goto_0
    move-object p1, p2

    goto :goto_2

    .line 71
    :cond_3
    :goto_1
    sget-object p2, Ll/᩹᩶ۢ;->᩻:Ll/۠᩶ۢ;

    if-ne v0, p2, :cond_4

    instance-of p2, p1, Ll/ۧۨۢ;

    if-eqz p2, :cond_4

    check-cast p1, Ll/ۧۨۢ;

    .line 72
    new-instance p2, Ll/ۘۜܿ;

    invoke-virtual {p1}, Ll/ۧۨۢ;->ۧ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۧۨۢ;->֫()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    .line 21
    invoke-direct {p2, p3, v0, v1, v2}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 72
    invoke-virtual {p2, p1}, Ll/ۘۜܿ;->initCause(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 53
    :cond_4
    :goto_2
    throw p1
.end method
