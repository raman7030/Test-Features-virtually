.class public final Ll/ۚ֫ۢ;
.super Ljava/lang/Object;
.source "Z1GQ"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/lang/StringBuilder;

.field public ܽ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;)V
    .locals 1

    .line 1275
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1271
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۚ֫ۢ;->ۧ:Ljava/lang/StringBuilder;

    .line 1276
    iput-object p2, p0, Ll/ۚ֫ۢ;->ܽ:Ljava/lang/CharSequence;

    .line 1277
    iput p1, p0, Ll/ۚ֫ۢ;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 7

    .line 1284
    :goto_0
    iget v0, p0, Ll/ۚ֫ۢ;->֫:I

    const/16 v1, 0xd

    const/16 v2, 0xa

    const/16 v3, 0x9

    const/16 v4, 0x20

    iget-object v5, p0, Ll/ۚ֫ۢ;->ܽ:Ljava/lang/CharSequence;

    if-ltz v0, :cond_1

    .line 1285
    invoke-interface {v5, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-ne v0, v1, :cond_1

    .line 1288
    :cond_0
    iget v0, p0, Ll/ۚ֫ۢ;->֫:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۚ֫ۢ;->֫:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 1291
    iget-object v6, p0, Ll/ۚ֫ۢ;->ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1292
    :goto_1
    iget v0, p0, Ll/ۚ֫ۢ;->֫:I

    if-ltz v0, :cond_4

    .line 1293
    invoke-interface {v5, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_3

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 1297
    :cond_2
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1298
    iget v0, p0, Ll/ۚ֫ۢ;->֫:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۚ֫ۢ;->֫:I

    goto :goto_1

    .line 1295
    :cond_3
    :goto_2
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1301
    :cond_4
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
