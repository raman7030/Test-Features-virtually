.class public final Ll/᩹۠ܺ;
.super Ll/᩸۠ܺ;
.source "532I"


# instance fields
.field public final ᩸:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    .line 947
    invoke-direct {p0}, Ll/ۨ۠ܺ;-><init>()V

    .line 1619
    iput-char p1, p0, Ll/᩹۠ܺ;->᩸:C

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1655
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CharMatcher.is(\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-char v1, p0, Ll/᩹۠ܺ;->᩸:C

    invoke-static {v1}, Ll/ۨ۠ܺ;->ۧ(C)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\')"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۨ۠ܺ;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(C)Z
    .locals 1

    .line 1624
    iget-char v0, p0, Ll/᩹۠ܺ;->᩸:C

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
