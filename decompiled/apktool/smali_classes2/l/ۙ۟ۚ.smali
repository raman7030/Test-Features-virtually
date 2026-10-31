.class public final Ll/ۙ۟ۚ;
.super Ljava/lang/Object;
.source "A7FF"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 383
    iget v0, p0, Ll/ۙ۟ۚ;->ܽ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۙ۟ۚ;->ۧ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Ll/ۙ۟ۚ;->֫:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const-string v0, "start_pc: %d, length: %d, index: %d"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
