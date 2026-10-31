.class public final Ll/ۜܳۡ;
.super Ll/֫ܳۡ;
.source "TBJG"


# instance fields
.field public ܽ:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    const/4 p1, 0x0

    .line 424
    invoke-direct {p0, p1}, Ll/֫ܳۡ;-><init>(I)V

    .line 426
    iput-boolean p1, p0, Ll/ۜܳۡ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 430
    iput-boolean v0, p0, Ll/ۜܳۡ;->ܽ:Z

    return-void
.end method

.method public final ۧ()I
    .locals 3

    .line 435
    invoke-virtual {p0}, Ll/֫ܳۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ll/֫ܳۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v2, "/ >"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 437
    :cond_0
    invoke-virtual {p0}, Ll/֫ܳۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v2, "</"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 4

    .line 460
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 465
    :cond_0
    :goto_0
    iget-boolean v2, p0, Ll/ۜܳۡ;->ܽ:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Ll/֫ܳۡ;->֫:Ljava/io/StringReader;

    invoke-virtual {v2}, Ljava/io/Reader;->read()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    int-to-char v2, v2

    .line 468
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x22

    if-ne v2, v3, :cond_1

    xor-int/lit8 v1, v1, 0x1

    :cond_1
    const/16 v3, 0x3e

    if-ne v2, v3, :cond_0

    if-nez v1, :cond_0

    const/4 v2, 0x1

    .line 475
    iput-boolean v2, p0, Ll/ۜܳۡ;->ܽ:Z

    goto :goto_0

    .line 478
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 446
    invoke-virtual {p0}, Ll/֫ܳۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "</"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
