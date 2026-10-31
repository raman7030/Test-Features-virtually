.class public final Ll/᩻᩷֡;
.super Ljava/lang/Object;
.source "VASI"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 77
    new-instance v0, Ll/᩻᩷֡;

    const/4 v1, 0x0

    new-array v2, v1, [I

    invoke-direct {v0, v2}, Ll/᩻᩷֡;-><init>([I)V

    const v2, 0x10ffff

    .line 78
    invoke-virtual {v0, v1, v2}, Ll/᩻᩷֡;->֫(II)V

    const/4 v2, 0x1

    .line 690
    iput-boolean v2, v0, Ll/᩻᩷֡;->ۧ:Z

    .line 38
    new-instance v0, Ll/᩻᩷֡;

    new-array v1, v1, [I

    invoke-direct {v0, v1}, Ll/᩻᩷֡;-><init>([I)V

    .line 690
    iput-boolean v2, v0, Ll/᩻᩷֡;->ۧ:Z

    return-void
.end method

.method public constructor <init>(Ll/᩻᩷֡;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 53
    invoke-direct {p0, v0}, Ll/᩻᩷֡;-><init>([I)V

    .line 54
    invoke-virtual {p0, p1}, Ll/᩻᩷֡;->֫(Ll/᩻᩷֡;)V

    return-void
.end method

.method public varargs constructor <init>([I)V
    .locals 3

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    .line 63
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    invoke-virtual {p0, v2}, Ll/᩻᩷֡;->֫(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩻᩷֡;Ll/᩻᩷֡;)Ll/᩻᩷֡;
    .locals 8

    .line 230
    invoke-virtual {p0}, Ll/᩻᩷֡;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 231
    new-instance p0, Ll/᩻᩷֡;

    new-array p1, v1, [I

    invoke-direct {p0, p1}, Ll/᩻᩷֡;-><init>([I)V

    return-object p0

    .line 234
    :cond_0
    new-instance v0, Ll/᩻᩷֡;

    invoke-direct {v0, p0}, Ll/᩻᩷֡;-><init>(Ll/᩻᩷֡;)V

    .line 235
    iget-object p0, p1, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/᩻᩷֡;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 p1, 0x0

    .line 242
    :goto_0
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_9

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_9

    .line 243
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷֡;

    .line 244
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩷֡;

    .line 248
    iget v4, v3, Ll/ܳ᩷֡;->ۧ:I

    iget v5, v2, Ll/ܳ᩷֡;->֫:I

    if-ge v4, v5, :cond_2

    goto :goto_3

    .line 253
    :cond_2
    iget v3, v3, Ll/ܳ᩷֡;->֫:I

    iget v2, v2, Ll/ܳ᩷֡;->ۧ:I

    if-le v3, v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    if-le v3, v5, :cond_4

    .line 261
    new-instance v7, Ll/ܳ᩷֡;

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v7, v5, v3}, Ll/ܳ᩷֡;-><init>(II)V

    goto :goto_1

    :cond_4
    move-object v7, v6

    :goto_1
    if-ge v4, v2, :cond_5

    .line 265
    new-instance v6, Ll/ܳ᩷֡;

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v6, v4, v2}, Ll/ܳ᩷֡;-><init>(II)V

    :cond_5
    if-eqz v7, :cond_7

    if-eqz v6, :cond_6

    .line 271
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 272
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_3

    .line 279
    :cond_6
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    if-eqz v6, :cond_8

    .line 287
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 293
    :cond_8
    iget-object v2, v0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_9
    :goto_4
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 465
    instance-of v0, p1, Ll/᩻᩷֡;

    if-nez v0, :cond_0

    goto :goto_0

    .line 468
    :cond_0
    check-cast p1, Ll/᩻᩷֡;

    .line 469
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    iget-object p1, p1, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 449
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩷֡;

    .line 450
    iget v4, v3, Ll/ܳ᩷֡;->֫:I

    invoke-static {v2, v4}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v2

    .line 451
    iget v3, v3, Ll/ܳ᩷֡;->ۧ:I

    invoke-static {v2, v3}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v2

    goto :goto_0

    .line 454
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 476
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 477
    iget-object v1, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    .line 480
    :cond_0
    invoke-virtual {p0}, Ll/᩻᩷֡;->ܿ()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    const-string v2, "{"

    .line 481
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 484
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 485
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷֡;

    .line 486
    iget v4, v2, Ll/ܳ᩷֡;->֫:I

    .line 487
    iget v2, v2, Ll/ܳ᩷֡;->ۧ:I

    if-ne v4, v2, :cond_4

    const/4 v2, -0x1

    if-ne v4, v2, :cond_3

    const-string v2, "<EOF>"

    .line 489
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 491
    :cond_3
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 495
    :cond_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ".."

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 497
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, ", "

    .line 498
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 501
    :cond_5
    invoke-virtual {p0}, Ll/᩻᩷֡;->ܿ()I

    move-result v1

    if-le v1, v3, :cond_6

    const-string v1, "}"

    .line 502
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_7
    :goto_2
    const-string v0, "{}"

    return-object v0
.end method

.method public final ֫()I
    .locals 2

    .line 434
    invoke-virtual {p0}, Ll/᩻᩷֡;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 438
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩷֡;

    iget v0, v0, Ll/ܳ᩷֡;->֫:I

    return v0

    .line 435
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "set is empty"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/۠ܳ֡;)Ljava/lang/String;
    .locals 12

    .line 516
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 517
    iget-object v1, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    .line 520
    :cond_0
    invoke-virtual {p0}, Ll/᩻᩷֡;->ܿ()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    const-string v2, "{"

    .line 521
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 524
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 525
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷֡;

    .line 526
    iget v4, v2, Ll/ܳ᩷֡;->֫:I

    .line 527
    iget v2, v2, Ll/ܳ᩷֡;->ۧ:I

    const-string v5, "<EPSILON>"

    const/4 v6, -0x2

    const-string v7, "<EOF>"

    const/4 v8, -0x1

    const-string v9, ", "

    if-ne v4, v2, :cond_5

    if-ne v4, v8, :cond_3

    move-object v5, v7

    goto :goto_1

    :cond_3
    if-ne v4, v6, :cond_4

    goto :goto_1

    .line 564
    :cond_4
    move-object v2, p1

    check-cast v2, Ll/ܶܳ֡;

    invoke-virtual {v2, v4}, Ll/ܶܳ֡;->֫(I)Ljava/lang/String;

    move-result-object v5

    .line 529
    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_5
    move v10, v4

    :goto_2
    if-gt v10, v2, :cond_9

    if-le v10, v4, :cond_6

    .line 533
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    if-ne v10, v8, :cond_7

    move-object v11, v7

    goto :goto_3

    :cond_7
    if-ne v10, v6, :cond_8

    move-object v11, v5

    goto :goto_3

    .line 564
    :cond_8
    move-object v11, p1

    check-cast v11, Ll/ܶܳ֡;

    invoke-virtual {v11, v10}, Ll/ܶܳ֡;->֫(I)Ljava/lang/String;

    move-result-object v11

    .line 534
    :goto_3
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 537
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 538
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 541
    :cond_a
    invoke-virtual {p0}, Ll/᩻᩷֡;->ܿ()I

    move-result p1

    if-le p1, v3, :cond_b

    const-string p1, "}"

    .line 542
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    :cond_b
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_5
    const-string p1, "{}"

    return-object p1
.end method

.method public final ֫(I)V
    .locals 1

    .line 92
    iget-boolean v0, p0, Ll/᩻᩷֡;->ۧ:Z

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0, p1, p1}, Ll/᩻᩷֡;->֫(II)V

    return-void

    .line 92
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "can\'t alter readonly IntervalSet"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(II)V
    .locals 7

    .line 104
    invoke-static {p1, p2}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object p1

    .line 109
    iget-boolean p2, p0, Ll/᩻᩷֡;->ۧ:Z

    if-nez p2, :cond_b

    .line 111
    iget p2, p1, Ll/ܳ᩷֡;->ۧ:I

    iget v0, p1, Ll/ܳ᩷֡;->֫:I

    if-ge p2, v0, :cond_0

    goto/16 :goto_5

    .line 116
    :cond_0
    iget-object p2, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 117
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩷֡;

    .line 118
    invoke-virtual {p1, v1}, Ll/ܳ᩷֡;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_5

    .line 93
    :cond_2
    iget v2, p1, Ll/ܳ᩷֡;->֫:I

    iget v3, v1, Ll/ܳ᩷֡;->ۧ:I

    add-int/lit8 v4, v3, 0x1

    if-eq v2, v4, :cond_5

    iget v4, p1, Ll/ܳ᩷֡;->ۧ:I

    iget v5, v1, Ll/ܳ᩷֡;->֫:I

    add-int/lit8 v6, v5, -0x1

    if-ne v4, v6, :cond_3

    goto :goto_1

    :cond_3
    if-ge v2, v5, :cond_4

    if-ge v4, v5, :cond_4

    goto :goto_0

    :cond_4
    if-le v2, v3, :cond_5

    :goto_0
    if-ge v2, v5, :cond_1

    if-ge v4, v5, :cond_1

    .line 143
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 144
    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    return-void

    .line 102
    :cond_5
    :goto_1
    iget p2, v1, Ll/ܳ᩷֡;->֫:I

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget p1, p1, Ll/ܳ᩷֡;->ۧ:I

    iget v1, v1, Ll/ܳ᩷֡;->ۧ:I

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p2, p1}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object p1

    .line 124
    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 127
    :goto_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 128
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳ᩷֡;

    .line 93
    iget v1, p1, Ll/ܳ᩷֡;->֫:I

    iget v2, p2, Ll/ܳ᩷֡;->ۧ:I

    add-int/lit8 v3, v2, 0x1

    if-eq v1, v3, :cond_8

    iget v3, p1, Ll/ܳ᩷֡;->ۧ:I

    iget v4, p2, Ll/ܳ᩷֡;->֫:I

    add-int/lit8 v5, v4, -0x1

    if-ne v3, v5, :cond_6

    goto :goto_4

    :cond_6
    if-ge v1, v4, :cond_7

    if-ge v3, v4, :cond_7

    goto :goto_3

    :cond_7
    if-le v1, v2, :cond_8

    :goto_3
    return-void

    .line 134
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 135
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 102
    iget v1, p1, Ll/ܳ᩷֡;->֫:I

    iget v2, p2, Ll/ܳ᩷֡;->֫:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v2, p1, Ll/ܳ᩷֡;->ۧ:I

    iget p2, p2, Ll/ܳ᩷֡;->ۧ:I

    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {v1, p2}, Ll/ܳ᩷֡;->֫(II)Ll/ܳ᩷֡;

    move-result-object p2

    .line 136
    invoke-interface {v0, p2}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 137
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    goto :goto_2

    :cond_9
    :goto_5
    return-void

    .line 151
    :cond_a
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 109
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "can\'t alter readonly IntervalSet"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩻᩷֡;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    .line 168
    :cond_0
    iget-object p1, p1, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    .line 170
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 172
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷֡;

    .line 173
    iget v3, v2, Ll/ܳ᩷֡;->֫:I

    iget v2, v2, Ll/ܳ᩷֡;->ۧ:I

    invoke-virtual {p0, v3, v2}, Ll/᩻᩷֡;->֫(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 410
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ(I)Z
    .locals 8

    .line 386
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-gt v4, v1, :cond_2

    add-int v5, v4, v1

    .line 392
    div-int/lit8 v5, v5, 0x2

    .line 393
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳ᩷֡;

    .line 394
    iget v7, v6, Ll/ܳ᩷֡;->֫:I

    .line 395
    iget v6, v6, Ll/ܳ᩷֡;->ۧ:I

    if-ge v6, p1, :cond_0

    add-int/lit8 v4, v5, 0x1

    goto :goto_0

    :cond_0
    if-le v7, p1, :cond_1

    add-int/lit8 v1, v5, -0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    return v3
.end method

.method public final ܽ()V
    .locals 7

    .line 651
    iget-boolean v0, p0, Ll/᩻᩷֡;->ۧ:Z

    if-nez v0, :cond_6

    .line 652
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    .line 654
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩷֡;

    .line 655
    iget v4, v3, Ll/ܳ᩷֡;->֫:I

    .line 656
    iget v5, v3, Ll/ܳ᩷֡;->ۧ:I

    const/4 v6, -0x2

    if-ge v6, v4, :cond_0

    goto :goto_1

    :cond_0
    if-ne v6, v4, :cond_1

    if-ne v6, v5, :cond_1

    .line 662
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_1
    if-ne v6, v4, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 667
    iput v4, v3, Ll/ܳ᩷֡;->֫:I

    return-void

    :cond_2
    if-ne v6, v5, :cond_3

    add-int/lit8 v5, v5, -0x1

    .line 672
    iput v5, v3, Ll/ܳ᩷֡;->ۧ:I

    return-void

    :cond_3
    if-le v6, v4, :cond_4

    if-ge v6, v5, :cond_4

    const/4 v4, -0x3

    .line 678
    iput v4, v3, Ll/ܳ᩷֡;->ۧ:I

    const/4 v3, -0x1

    .line 679
    invoke-virtual {p0, v3, v5}, Ll/᩻᩷֡;->֫(II)V

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return-void

    .line 651
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "can\'t alter readonly IntervalSet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()I
    .locals 7

    .line 571
    iget-object v0, p0, Ll/᩻᩷֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    .line 573
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩷֡;

    .line 574
    iget v1, v0, Ll/ܳ᩷֡;->ۧ:I

    iget v0, v0, Ll/ܳ᩷֡;->֫:I

    sub-int/2addr v1, v0

    add-int/2addr v1, v3

    return v1

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 577
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳ᩷֡;

    .line 578
    iget v6, v5, Ll/ܳ᩷֡;->ۧ:I

    iget v5, v5, Ll/ܳ᩷֡;->֫:I

    sub-int/2addr v6, v5

    add-int/2addr v6, v3

    add-int/2addr v4, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v4
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 690
    iput-boolean v0, p0, Ll/᩻᩷֡;->ۧ:Z

    return-void
.end method
