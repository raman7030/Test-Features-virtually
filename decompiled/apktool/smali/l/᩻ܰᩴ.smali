.class public final synthetic Ll/᩻ܰᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/ObjLongConsumer;
.implements Ljava/util/function/LongBinaryOperator;
.implements Ljava/util/function/ToLongFunction;
.implements Ljava/util/function/BiConsumer;
.implements Ljava/util/function/IntFunction;
.implements Ljava/util/function/LongFunction;
.implements Ljava/util/function/Consumer;
.implements Ljava/util/function/BinaryOperator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ll/᩻ܰᩴ;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method private final accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method private final accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public accept(Ljava/lang/Object;J)V
    .locals 5

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [J

    const/4 v0, 0x0

    .line 449
    aget-wide v1, p1, v0

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    .line 450
    aget-wide v1, p1, v0

    add-long/2addr v1, p2

    aput-wide v1, p1, v0

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۨܳ᩵;

    invoke-virtual {p1, p2, p3}, Ll/ۨܳ᩵;->accept(J)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [J

    check-cast p2, [J

    const/4 v0, 0x0

    .line 453
    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-long/2addr v1, v3

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    .line 454
    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-long/2addr v1, v3

    aput-wide v1, p1, v0

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۨܳ᩵;

    check-cast p2, Ll/ۨܳ᩵;

    invoke-virtual {p1, p2}, Ll/ۨܳ᩵;->a(Ll/ۨܳ᩵;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    :pswitch_0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public apply(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 240
    new-array p1, p1, [Ljava/lang/Double;

    return-object p1

    .line 493
    :sswitch_0
    new-array p1, p1, [Ljava/lang/Long;

    return-object p1

    .line 183
    :sswitch_1
    new-array p1, p1, [Ljava/lang/Long;

    return-object p1

    .line 418
    :sswitch_2
    new-array p1, p1, [Ljava/lang/Integer;

    return-object p1

    .line 126
    :sswitch_3
    new-array p1, p1, [Ljava/lang/Integer;

    return-object p1

    .line 476
    :sswitch_4
    new-array p1, p1, [Ljava/lang/Double;

    return-object p1

    .line 367
    :sswitch_5
    new-array p1, p1, [Ljava/lang/Long;

    return-object p1

    .line 258
    :sswitch_6
    new-array p1, p1, [Ljava/lang/Integer;

    return-object p1

    .line 523
    :sswitch_7
    new-array p1, p1, [Ljava/lang/Object;

    return-object p1

    .line 77
    :sswitch_8
    new-array p1, p1, [Ljava/lang/Object;

    return-object p1

    .line 521
    :sswitch_9
    new-array p1, p1, [Ljava/lang/Long;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_9
        0xb -> :sswitch_8
        0x13 -> :sswitch_7
        0x14 -> :sswitch_6
        0x15 -> :sswitch_5
        0x16 -> :sswitch_4
        0x19 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public apply(J)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {p1, p2}, Ll/ۡ᩺ᩴ;->Y(J)Ll/۟ܿ᩵;

    move-result-object p1

    return-object p1

    :sswitch_0
    invoke-static {p1, p2}, Ll/ۡ᩺ᩴ;->X(J)Ll/᩹ܿ᩵;

    move-result-object p1

    return-object p1

    :sswitch_1
    invoke-static {p1, p2}, Ll/ۡ᩺ᩴ;->O(J)Ll/ܺܿ᩵;

    move-result-object p1

    return-object p1

    :sswitch_2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0xc -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Ll/ܽᩳ᩵;

    check-cast p1, Ll/ۚ۟ᩴ;

    check-cast p2, Ll/ۚ۟ᩴ;

    .line 791
    invoke-direct {v0, p1, p2}, Ll/ܳ֫᩵;-><init>(Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)V

    return-object v0

    .line 0
    :pswitch_1
    new-instance v0, Ll/ᩴܽ᩵;

    check-cast p1, Ll/ۛܰᩴ;

    check-cast p2, Ll/ۛܰᩴ;

    .line 855
    invoke-direct {v0, p1, p2}, Ll/ܳ֫᩵;-><init>(Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)V

    return-object v0

    .line 0
    :pswitch_2
    new-instance v0, Ll/ᩳܽ᩵;

    check-cast p1, Ll/ۜܰᩴ;

    check-cast p2, Ll/ۜܰᩴ;

    .line 855
    invoke-direct {v0, p1, p2}, Ll/ܳ֫᩵;-><init>(Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)V

    return-object v0

    .line 0
    :pswitch_3
    new-instance v0, Ll/۬ۧ᩵;

    check-cast p1, Ll/۠᩺ᩴ;

    check-cast p2, Ll/۠᩺ᩴ;

    .line 855
    invoke-direct {v0, p1, p2}, Ll/ܳ֫᩵;-><init>(Ll/ۚ۟ᩴ;Ll/ۚ۟ᩴ;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public applyAsLong(JJ)J
    .locals 1

    iget v0, p0, Ll/᩻ܰᩴ;->a:I

    sparse-switch v0, :sswitch_data_0

    add-long/2addr p1, p3

    return-wide p1

    .line 0
    :sswitch_0
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1

    :sswitch_1
    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public applyAsLong(Ljava/lang/Object;)J
    .locals 2

    check-cast p1, Ljava/lang/Long;

    .line 414
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
