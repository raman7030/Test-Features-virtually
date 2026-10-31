.class public final Ll/᩹ۙ᩵;
.super Ljava/lang/Object;
.source "S4VX"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ۗ:I

.field public final ۙ:Ljava/lang/CharSequence;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "string"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۙ᩵;->ۙ:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 9

    .line 1284
    iget v0, p0, Ll/᩹ۙ᩵;->᩶:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1

    .line 1288
    :cond_1
    iget v0, p0, Ll/᩹ۙ᩵;->᩸:I

    const/4 v3, 0x2

    if-gez v0, :cond_2

    .line 1289
    iput v3, p0, Ll/᩹ۙ᩵;->᩶:I

    return v1

    .line 1294
    :cond_2
    iget-object v0, p0, Ll/᩹ۙ᩵;->ۙ:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 1296
    iget v4, p0, Ll/᩹ۙ᩵;->ۗ:I

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_5

    .line 1297
    invoke-interface {v0, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    const/16 v7, 0xd

    const/16 v8, 0xa

    if-eq v6, v8, :cond_3

    if-eq v6, v7, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    if-ne v6, v7, :cond_4

    add-int/lit8 v1, v4, 0x1

    .line 1301
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v1, v5, :cond_4

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-ne v0, v8, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x1

    :goto_1
    move v1, v4

    goto :goto_2

    :cond_5
    const/4 v3, -0x1

    .line 1308
    :goto_2
    iput v2, p0, Ll/᩹ۙ᩵;->᩶:I

    .line 1309
    iput v3, p0, Ll/᩹ۙ᩵;->᩸:I

    .line 1310
    iput v1, p0, Ll/᩹ۙ᩵;->᩹:I

    return v2
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1316
    invoke-virtual {p0}, Ll/᩹ۙ᩵;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1320
    iput v0, p0, Ll/᩹ۙ᩵;->᩶:I

    .line 1321
    iget v0, p0, Ll/᩹ۙ᩵;->᩹:I

    .line 1322
    iget v1, p0, Ll/᩹ۙ᩵;->ۗ:I

    .line 1323
    iget v2, p0, Ll/᩹ۙ᩵;->᩸:I

    add-int/2addr v2, v0

    iput v2, p0, Ll/᩹ۙ᩵;->ۗ:I

    .line 1324
    iget-object v2, p0, Ll/᩹ۙ᩵;->ۙ:Ljava/lang/CharSequence;

    invoke-interface {v2, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1317
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
