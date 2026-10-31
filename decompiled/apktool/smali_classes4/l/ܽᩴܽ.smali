.class public final Ll/ܽᩴܽ;
.super Ljava/lang/Object;
.source "W6QR"


# instance fields
.field public final ֫:Ljava/util/BitSet;

.field public final ۧ:Ljava/lang/StringBuilder;

.field public ܽ:I

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 4

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 391
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Ll/ܽᩴܽ;->֫:Ljava/util/BitSet;

    .line 392
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽᩴܽ;->ᩳ:Ljava/util/ArrayList;

    .line 396
    iput-object p2, p0, Ll/ܽᩴܽ;->ܿ:Ljava/lang/String;

    .line 397
    iput-object p1, p0, Ll/ܽᩴܽ;->ۧ:Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    :goto_0
    add-int/lit8 v0, p1, 0x1

    .line 398
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 399
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x5c

    if-eq v1, v2, :cond_0

    move p1, v0

    goto :goto_0

    .line 401
    :cond_0
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x51

    if-eq v0, v1, :cond_1

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_1
    add-int/lit8 v0, p1, 0x2

    const-string v1, "\\E"

    .line 404
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    if-gez v1, :cond_2

    .line 405
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v1, 0x2

    .line 406
    :goto_1
    iget-object v3, p0, Ll/ܽᩴܽ;->ᩳ:Ljava/util/ArrayList;

    if-gez v1, :cond_3

    move v1, v2

    :cond_3
    filled-new-array {p1, v0, v1, v2}, [I

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move p1, v2

    goto :goto_0

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 9

    .line 414
    iget-object v0, p0, Ll/ܽᩴܽ;->֫:Ljava/util/BitSet;

    invoke-virtual {v0, p1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    .line 415
    :cond_0
    :goto_0
    iget v2, p0, Ll/ܽᩴܽ;->ܽ:I

    iget-object v3, p0, Ll/ܽᩴܽ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget-object v5, p0, Ll/ܽᩴܽ;->ۧ:Ljava/lang/StringBuilder;

    iget-object v6, p0, Ll/ܽᩴܽ;->ܿ:Ljava/lang/String;

    if-ge v2, v4, :cond_5

    .line 416
    iget v2, p0, Ll/ܽᩴܽ;->ܽ:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    const/4 v3, 0x0

    .line 417
    aget v4, v2, v3

    if-lt v4, p2, :cond_1

    goto :goto_2

    .line 418
    :cond_1
    iget v7, p0, Ll/ܽᩴܽ;->ܽ:I

    const/4 v8, 0x1

    add-int/2addr v7, v8

    iput v7, p0, Ll/ܽᩴܽ;->ܽ:I

    if-lt v4, p1, :cond_0

    const/4 v4, 0x3

    .line 419
    aget v7, v2, v4

    if-le v7, p2, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-ltz v1, :cond_3

    .line 420
    aget v7, v2, v3

    if-ge v1, v7, :cond_3

    add-int/lit8 v1, v1, 0x1

    .line 421
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v1

    goto :goto_1

    :cond_3
    if-ltz v1, :cond_4

    .line 424
    aget v7, v2, v4

    if-ge v1, v7, :cond_4

    goto :goto_0

    .line 425
    :cond_4
    aget v3, v2, v3

    invoke-static {p1, v3, v6, v5}, Ll/᩷ᩴܽ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 427
    aget p1, v2, v8

    const/4 v3, 0x2

    aget v3, v2, v3

    invoke-static {p1, v3, v6, v5}, Ll/᩷ᩴܽ;->ۧ(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 428
    aget p1, v2, v4

    goto :goto_0

    .line 430
    :cond_5
    :goto_2
    invoke-static {p1, p2, v6, v5}, Ll/᩷ᩴܽ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    return-void
.end method
