.class public final Ll/ۤۛۚ;
.super Ljava/lang/Object;
.source "C7DD"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ᩸:I

.field public ᩹:Ll/ܺۤۚ;


# virtual methods
.method public final getLength()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 3

    .line 54
    iget-object v0, p0, Ll/ۤۛۚ;->᩹:Ll/ܺۤۚ;

    iget v1, p0, Ll/ۤۛۚ;->᩸:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 55
    iget v1, v0, Ll/ۜۨۚ;->᩸:I

    iput v1, p0, Ll/ۤۛۚ;->᩸:I

    .line 57
    :cond_0
    iget v1, p0, Ll/ۤۛۚ;->᩸:I

    if-ne v1, v2, :cond_2

    .line 58
    new-instance p1, Ljava/io/IOException;

    if-nez v0, :cond_1

    const-string v0, "null"

    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v0}, Ll/ܺۤۚ;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "a file due to implementation issue:\n\t\t \"Can\'t retrieve CP Index for "

    const-string v2, "\""

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_2
    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
