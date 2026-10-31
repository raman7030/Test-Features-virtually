.class public final Ll/ܺᩳۧ;
.super Ll/ۙ᩹֫;
.source "18KG"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final ֡֫:Ll/ۡᩳۧ;

.field public ֨֫:Z

.field public ۖ֫:J

.field public ۘ֫:Ll/ܿᩴۧ;

.field public final ۚ֫:Landroid/os/Handler;

.field public ۜ֫:Ll/ܿᩳۧ;

.field public ۠֫:Ll/۠ᩴ֫;

.field public final ۡ֫:Ll/ۗۙ֫;

.field public ۢ֫:J

.field public final ܳ֫:Ll/ۙۘۧ;

.field public ܶ֫:Ll/ܿᩴۧ;

.field public ܺ֫:Z

.field public ᩴ֫:I

.field public ᩵֫:Ll/ᩳᩴۧ;

.field public ᩶֫:Z

.field public ᩷֫:I

.field public ᩸֫:Ll/۟ۘۧ;

.field public final ᩹֫:Ll/ۢᩳۧ;

.field public final ᩻֫:Ll/᩸᩸֫;


# direct methods
.method public constructor <init>(Ll/ۡᩳۧ;Landroid/os/Looper;)V
    .locals 2

    .line 137
    sget-object v0, Ll/ۢᩳۧ;->֫:Ll/ۢᩳۧ;

    const/4 v1, 0x3

    .line 153
    invoke-direct {p0, v1}, Ll/ۙ᩹֫;-><init>(I)V

    .line 154
    iput-object p1, p0, Ll/ܺᩳۧ;->֡֫:Ll/ۡᩳۧ;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 783
    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 156
    :goto_0
    iput-object p1, p0, Ll/ܺᩳۧ;->ۚ֫:Landroid/os/Handler;

    .line 157
    iput-object v0, p0, Ll/ܺᩳۧ;->᩹֫:Ll/ۢᩳۧ;

    .line 158
    new-instance p1, Ll/ۙۘۧ;

    .line 29
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 158
    iput-object p1, p0, Ll/ܺᩳۧ;->ܳ֫:Ll/ۙۘۧ;

    .line 159
    new-instance p1, Ll/᩸᩸֫;

    const/4 p2, 0x1

    const/4 v0, 0x0

    .line 132
    invoke-direct {p1, p2, v0}, Ll/᩸᩸֫;-><init>(II)V

    .line 159
    iput-object p1, p0, Ll/ܺᩳۧ;->᩻֫:Ll/᩸᩸֫;

    .line 161
    new-instance p1, Ll/ۗۙ֫;

    .line 25
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 161
    iput-object p1, p0, Ll/ܺᩳۧ;->ۡ֫:Ll/ۗۙ֫;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 162
    iput-wide p1, p0, Ll/ܺᩳۧ;->ۢ֫:J

    .line 163
    iput-wide p1, p0, Ll/ܺᩳۧ;->ۖ֫:J

    return-void
.end method

.method private ֫֫()V
    .locals 3
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "streamFormat"
        }
    .end annotation

    .line 616
    iget-object v0, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "application/cea-608"

    .line 618
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "application/x-mp4-cea-608"

    .line 619
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "application/cea-708"

    .line 620
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Legacy decoding is disabled, can\'t handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    iget-object v2, v2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " samples (expected application/x-media3-cues)."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 616
    invoke-static {v1, v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method

.method private ۧ֫()V
    .locals 4

    .line 563
    new-instance v0, Ll/ۙ֡֫;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v1

    iget-wide v2, p0, Ll/ܺᩳۧ;->ۖ֫:J

    invoke-direct {p0, v2, v3}, Ll/ܺᩳۧ;->ᩳ(J)J

    invoke-direct {v0, v1}, Ll/ۙ֡֫;-><init>(Ljava/util/List;)V

    .line 555
    iget-object v1, p0, Ll/ܺᩳۧ;->ۚ֫:Landroid/os/Handler;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 556
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void

    .line 579
    :cond_0
    iget-object v1, v0, Ll/ۙ֡֫;->֫:Ll/ܳ۬ܺ;

    iget-object v2, p0, Ll/ܺᩳۧ;->֡֫:Ll/ۡᩳۧ;

    invoke-interface {v2, v1}, Ll/ۡᩳۧ;->֫(Ljava/util/List;)V

    .line 580
    invoke-interface {v2, v0}, Ll/ۡᩳۧ;->֫(Ll/ۙ֡֫;)V

    return-void
.end method

.method private ܽ֫()J
    .locals 4

    .line 545
    iget v0, p0, Ll/ܺᩳۧ;->ᩴ֫:I

    const/4 v1, -0x1

    const-wide v2, 0x7fffffffffffffffL

    if-ne v0, v1, :cond_0

    return-wide v2

    .line 548
    :cond_0
    iget-object v0, p0, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    iget v0, p0, Ll/ܺᩳۧ;->ᩴ֫:I

    iget-object v1, p0, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    invoke-virtual {v1}, Ll/ܿᩴۧ;->֫()I

    move-result v1

    if-lt v0, v1, :cond_1

    return-wide v2

    .line 551
    :cond_1
    iget-object v0, p0, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    iget v1, p0, Ll/ܺᩳۧ;->ᩴ֫:I

    invoke-virtual {v0, v1}, Ll/ܿᩴۧ;->֫(I)J

    move-result-wide v0

    return-wide v0
.end method

.method private ᩳ(J)J
    .locals 3
    .annotation runtime Lorg/checkerframework/dataflow/qual/SideEffectFree;
    .end annotation

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 610
    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 611
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۗ()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method private ᩳ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 514
    iput-object v0, p0, Ll/ܺᩳۧ;->᩵֫:Ll/ᩳᩴۧ;

    const/4 v1, -0x1

    .line 515
    iput v1, p0, Ll/ܺᩳۧ;->ᩴ֫:I

    .line 516
    iget-object v1, p0, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    if-eqz v1, :cond_0

    .line 517
    invoke-virtual {v1}, Ll/᩶᩸֫;->ᩴ()V

    .line 518
    iput-object v0, p0, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    .line 520
    :cond_0
    iget-object v1, p0, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;

    if-eqz v1, :cond_1

    .line 521
    invoke-virtual {v1}, Ll/᩶᩸֫;->ᩴ()V

    .line 522
    iput-object v0, p0, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;

    :cond_1
    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TextRenderer"

    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 568
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 570
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ll/ۙ֡֫;

    .line 579
    iget-object v0, p1, Ll/ۙ֡֫;->֫:Ll/ܳ۬ܺ;

    iget-object v2, p0, Ll/ܺᩳۧ;->֡֫:Ll/ۡᩳۧ;

    invoke-interface {v2, v0}, Ll/ۡᩳۧ;->֫(Ljava/util/List;)V

    .line 580
    invoke-interface {v2, p1}, Ll/ۡᩳۧ;->֫(Ll/ۙ֡֫;)V

    return v1

    .line 573
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 2

    .line 631
    iget-object v0, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v1, "application/x-media3-cues"

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 178
    iget-object v0, p0, Ll/ܺᩳۧ;->᩹֫:Ll/ۢᩳۧ;

    check-cast v0, Ll/᩷ᩳۧ;

    invoke-virtual {v0, p1}, Ll/᩷ᩳۧ;->ۧ(Ll/۠ᩴ֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 181
    :cond_0
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {p1}, Ll/ۢ᩵֫;->᩷(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 245
    invoke-static {p1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    :cond_1
    invoke-static {v1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1

    .line 180
    :cond_2
    :goto_0
    iget p1, p1, Ll/۠ᩴ֫;->᩷:I

    if-nez p1, :cond_3

    const/4 p1, 0x4

    goto :goto_1

    :cond_3
    const/4 p1, 0x2

    .line 245
    :goto_1
    invoke-static {p1, v1, v1, v1}, Ll/ۧ۬֫;->֫(IIII)I

    move-result p1

    return p1
.end method

.method public final ֫(JJ)V
    .locals 18

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    .line 249
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->ܺ()Z

    move-result v0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    iget-wide v5, v1, Ll/ܺᩳۧ;->ۢ֫:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v5, v7

    if-eqz v0, :cond_0

    cmp-long v0, v2, v5

    if-ltz v0, :cond_0

    .line 252
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 253
    iput-boolean v4, v1, Ll/ܺᩳۧ;->֨֫:Z

    .line 256
    :cond_0
    iget-boolean v0, v1, Ll/ܺᩳۧ;->֨֫:Z

    if-eqz v0, :cond_1

    goto/16 :goto_c

    .line 260
    :cond_1
    iget-object v0, v1, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v5, "application/x-media3-cues"

    invoke-static {v0, v5}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 260
    iget-object v5, v1, Ll/ܺᩳۧ;->֡֫:Ll/ۡᩳۧ;

    iget-object v6, v1, Ll/ܺᩳۧ;->ۚ֫:Landroid/os/Handler;

    const/4 v7, -0x4

    iget-object v8, v1, Ll/ܺᩳۧ;->ۡ֫:Ll/ۗۙ֫;

    const/4 v9, 0x0

    if-eqz v0, :cond_a

    .line 261
    iget-object v0, v1, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    iget-boolean v0, v1, Ll/ܺᩳۧ;->ܺ֫:Z

    if-eqz v0, :cond_2

    goto/16 :goto_1

    .line 325
    :cond_2
    iget-object v0, v1, Ll/ܺᩳۧ;->᩻֫:Ll/᩸᩸֫;

    invoke-virtual {v1, v8, v0, v9}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v8

    if-eq v8, v7, :cond_3

    goto/16 :goto_1

    .line 328
    :cond_3
    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 329
    iput-boolean v4, v1, Ll/ܺᩳۧ;->ܺ֫:Z

    goto/16 :goto_1

    .line 332
    :cond_4
    invoke-virtual {v0}, Ll/᩸᩸֫;->ᩴ()V

    .line 333
    iget-object v7, v0, Ll/᩸᩸֫;->ۙ:Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    iget-wide v11, v0, Ll/᩸᩸֫;->ۤ:J

    .line 337
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v8

    .line 338
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v10

    .line 339
    invoke-virtual {v7}, Ljava/nio/Buffer;->limit()I

    move-result v7

    .line 335
    iget-object v13, v1, Ll/ܺᩳۧ;->ܳ֫:Ll/ۙۘۧ;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v13

    .line 49
    invoke-virtual {v13, v8, v10, v7}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 50
    invoke-virtual {v13, v9}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 51
    const-class v7, Landroid/os/Bundle;

    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    invoke-virtual {v13, v7}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object v7

    .line 52
    invoke-virtual {v13}, Landroid/os/Parcel;->recycle()V

    const-string v8, "c"

    .line 54
    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 155
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    new-instance v15, Ll/۬ۘۧ;

    .line 64
    sget v10, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v10, Ll/֫۬ܺ;

    invoke-direct {v10}, Ll/֫۬ܺ;-><init>()V

    .line 65
    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    if-ge v9, v13, :cond_5

    .line 66
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/os/Bundle;

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    invoke-static {v13}, Ll/᩶֡֫;->֫(Landroid/os/Bundle;)Ll/᩶֡֫;

    move-result-object v13

    .line 68
    invoke-virtual {v10, v13}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 70
    :cond_5
    invoke-virtual {v10}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object v8

    const-string v9, "d"

    .line 58
    invoke-virtual {v7, v9}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    move-object v10, v15

    move-object v7, v15

    move-object v15, v8

    invoke-direct/range {v10 .. v15}, Ll/۬ۘۧ;-><init>(JJLjava/util/List;)V

    .line 340
    invoke-virtual {v0}, Ll/᩸᩸֫;->ۧ()V

    .line 342
    iget-object v0, v1, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    invoke-interface {v0, v7, v2, v3}, Ll/ܿᩳۧ;->֫(Ll/۬ۘۧ;J)Z

    move-result v9

    .line 296
    :goto_1
    iget-object v0, v1, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    iget-wide v7, v1, Ll/ܺᩳۧ;->ۖ֫:J

    invoke-interface {v0, v7, v8}, Ll/ܿᩳۧ;->ܽ(J)J

    move-result-wide v7

    const-wide/high16 v10, -0x8000000000000000L

    cmp-long v0, v7, v10

    if-nez v0, :cond_6

    .line 297
    iget-boolean v10, v1, Ll/ܺᩳۧ;->ܺ֫:Z

    if-eqz v10, :cond_6

    if-nez v9, :cond_6

    .line 298
    iput-boolean v4, v1, Ll/ܺᩳۧ;->֨֫:Z

    :cond_6
    if-eqz v0, :cond_7

    cmp-long v0, v7, v2

    if-gtz v0, :cond_7

    const/4 v9, 0x1

    :cond_7
    if-eqz v9, :cond_9

    .line 305
    iget-object v0, v1, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    invoke-interface {v0, v2, v3}, Ll/ܿᩳۧ;->֫(J)Ll/ܳ۬ܺ;

    move-result-object v0

    .line 306
    iget-object v7, v1, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    invoke-interface {v7, v2, v3}, Ll/ܿᩳۧ;->ۧ(J)J

    move-result-wide v7

    .line 307
    new-instance v9, Ll/ۙ֡֫;

    invoke-direct {v1, v7, v8}, Ll/ܺᩳۧ;->ᩳ(J)J

    invoke-direct {v9, v0}, Ll/ۙ֡֫;-><init>(Ljava/util/List;)V

    if-eqz v6, :cond_8

    .line 556
    invoke-virtual {v6, v4, v9}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_2

    .line 579
    :cond_8
    iget-object v0, v9, Ll/ۙ֡֫;->֫:Ll/ܳ۬ܺ;

    invoke-interface {v5, v0}, Ll/ۡᩳۧ;->֫(Ljava/util/List;)V

    .line 580
    invoke-interface {v5, v9}, Ll/ۡᩳۧ;->֫(Ll/ۙ֡֫;)V

    .line 308
    :goto_2
    iget-object v0, v1, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    invoke-interface {v0, v7, v8}, Ll/ܿᩳۧ;->ᩳ(J)V

    .line 310
    :cond_9
    iput-wide v2, v1, Ll/ܺᩳۧ;->ۖ֫:J

    return-void

    .line 264
    :cond_a
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->֫֫()V

    .line 351
    iput-wide v2, v1, Ll/ܺᩳۧ;->ۖ֫:J

    .line 352
    iget-object v0, v1, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;

    const-string v7, "Subtitle decoding failed. streamFormat="

    iget-object v10, v1, Ll/ܺᩳۧ;->᩹֫:Ll/ۢᩳۧ;

    const/4 v11, 0x0

    if-nez v0, :cond_b

    .line 353
    iget-object v0, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    invoke-interface {v0, v2, v3}, Ll/۟ۘۧ;->֫(J)V

    .line 355
    :try_start_0
    iget-object v0, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    invoke-interface {v0}, Ll/֨᩸֫;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿᩴۧ;

    iput-object v0, v1, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;
    :try_end_0
    .catch Ll/֫ᩴۧ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 590
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_3
    iget-object v3, v1, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Ll/᩶ۚ֫;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 591
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ۧ֫()V

    .line 527
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 528
    iget-object v0, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    invoke-interface {v0}, Ll/֨᩸֫;->֫()V

    .line 529
    iput-object v11, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 530
    iput v9, v1, Ll/ܺᩳۧ;->᩷֫:I

    .line 534
    iput-boolean v4, v1, Ll/ܺᩳۧ;->᩶֫:Z

    .line 535
    iget-object v0, v1, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    check-cast v10, Ll/᩷ᩳۧ;

    invoke-virtual {v10, v0}, Ll/᩷ᩳۧ;->֫(Ll/۠ᩴ֫;)Ll/۟ۘۧ;

    move-result-object v0

    iput-object v0, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 536
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v2

    invoke-interface {v0, v2, v3}, Ll/֨᩸֫;->ۧ(J)V

    goto/16 :goto_c

    .line 362
    :cond_b
    :goto_4
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->getState()I

    move-result v0

    const/4 v12, 0x2

    if-eq v0, v12, :cond_c

    goto/16 :goto_c

    .line 367
    :cond_c
    iget-object v0, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    if-eqz v0, :cond_d

    .line 370
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ܽ֫()J

    move-result-wide v13

    const/4 v0, 0x0

    :goto_5
    cmp-long v15, v13, v2

    if-gtz v15, :cond_e

    .line 372
    iget v0, v1, Ll/ܺᩳۧ;->ᩴ֫:I

    add-int/2addr v0, v4

    iput v0, v1, Ll/ܺᩳۧ;->ᩴ֫:I

    .line 373
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ܽ֫()J

    move-result-wide v13

    const/4 v0, 0x1

    goto :goto_5

    :cond_d
    const/4 v0, 0x0

    .line 377
    :cond_e
    iget-object v13, v1, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;

    if-eqz v13, :cond_12

    .line 379
    invoke-virtual {v13}, Ll/ۘ᩸֫;->᩻()Z

    move-result v14

    if-eqz v14, :cond_10

    if-nez v0, :cond_12

    .line 380
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ܽ֫()J

    move-result-wide v13

    const-wide v15, 0x7fffffffffffffffL

    cmp-long v17, v13, v15

    if-nez v17, :cond_12

    .line 381
    iget v13, v1, Ll/ܺᩳۧ;->᩷֫:I

    if-ne v13, v12, :cond_f

    .line 527
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 528
    iget-object v13, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    invoke-interface {v13}, Ll/֨᩸֫;->֫()V

    .line 529
    iput-object v11, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 530
    iput v9, v1, Ll/ܺᩳۧ;->᩷֫:I

    .line 534
    iput-boolean v4, v1, Ll/ܺᩳۧ;->᩶֫:Z

    .line 535
    iget-object v13, v1, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    move-object v14, v10

    check-cast v14, Ll/᩷ᩳۧ;

    invoke-virtual {v14, v13}, Ll/᩷ᩳۧ;->֫(Ll/۠ᩴ֫;)Ll/۟ۘۧ;

    move-result-object v13

    iput-object v13, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 536
    invoke-virtual/range {p0 .. p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide v14

    invoke-interface {v13, v14, v15}, Ll/֨᩸֫;->ۧ(J)V

    goto :goto_6

    .line 384
    :cond_f
    invoke-direct/range {p0 .. p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 385
    iput-boolean v4, v1, Ll/ܺᩳۧ;->֨֫:Z

    goto :goto_6

    .line 388
    :cond_10
    iget-wide v14, v13, Ll/᩶᩸֫;->ۙ:J

    cmp-long v16, v14, v2

    if-gtz v16, :cond_12

    .line 390
    iget-object v0, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    if-eqz v0, :cond_11

    .line 391
    invoke-virtual {v0}, Ll/᩶᩸֫;->ᩴ()V

    .line 393
    :cond_11
    invoke-virtual {v13, v2, v3}, Ll/ܿᩴۧ;->֫(J)I

    move-result v0

    iput v0, v1, Ll/ܺᩳۧ;->ᩴ֫:I

    .line 394
    iput-object v13, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    .line 395
    iput-object v11, v1, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;

    const/4 v0, 0x1

    :cond_12
    :goto_6
    if-eqz v0, :cond_17

    .line 402
    iget-object v0, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    iget-object v0, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    invoke-virtual {v0, v2, v3}, Ll/ܿᩴۧ;->֫(J)I

    move-result v0

    if-eqz v0, :cond_15

    .line 599
    iget-object v13, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    invoke-virtual {v13}, Ll/ܿᩴۧ;->֫()I

    move-result v13

    if-nez v13, :cond_13

    goto :goto_7

    :cond_13
    const/4 v13, -0x1

    if-ne v0, v13, :cond_14

    .line 604
    iget-object v0, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    invoke-virtual {v0}, Ll/ܿᩴۧ;->֫()I

    move-result v13

    sub-int/2addr v13, v4

    invoke-virtual {v0, v13}, Ll/ܿᩴۧ;->֫(I)J

    move-result-wide v13

    goto :goto_8

    .line 605
    :cond_14
    iget-object v13, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    sub-int/2addr v0, v4

    invoke-virtual {v13, v0}, Ll/ܿᩴۧ;->֫(I)J

    move-result-wide v13

    goto :goto_8

    .line 600
    :cond_15
    :goto_7
    iget-object v0, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    iget-wide v13, v0, Ll/᩶᩸֫;->ۙ:J

    .line 404
    :goto_8
    invoke-direct {v1, v13, v14}, Ll/ܺᩳۧ;->ᩳ(J)J

    .line 405
    new-instance v0, Ll/ۙ֡֫;

    iget-object v13, v1, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    invoke-virtual {v13, v2, v3}, Ll/ܿᩴۧ;->ܽ(J)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/ۙ֡֫;-><init>(Ljava/util/List;)V

    if-eqz v6, :cond_16

    .line 556
    invoke-virtual {v6, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_9

    .line 579
    :cond_16
    iget-object v2, v0, Ll/ۙ֡֫;->֫:Ll/ܳ۬ܺ;

    invoke-interface {v5, v2}, Ll/ۡᩳۧ;->֫(Ljava/util/List;)V

    .line 580
    invoke-interface {v5, v0}, Ll/ۡᩳۧ;->֫(Ll/ۙ֡֫;)V

    .line 409
    :cond_17
    :goto_9
    iget v0, v1, Ll/ܺᩳۧ;->᩷֫:I

    if-ne v0, v12, :cond_18

    goto/16 :goto_c

    .line 414
    :cond_18
    :goto_a
    :try_start_1
    iget-boolean v0, v1, Ll/ܺᩳۧ;->ܺ֫:Z

    if-nez v0, :cond_1f

    .line 415
    iget-object v0, v1, Ll/ܺᩳۧ;->᩵֫:Ll/ᩳᩴۧ;

    if-nez v0, :cond_1a

    .line 417
    iget-object v0, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    invoke-interface {v0}, Ll/֨᩸֫;->ܽ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳᩴۧ;

    if-nez v0, :cond_19

    goto :goto_c

    .line 421
    :cond_19
    iput-object v0, v1, Ll/ܺᩳۧ;->᩵֫:Ll/ᩳᩴۧ;

    .line 423
    :cond_1a
    iget v2, v1, Ll/ܺᩳۧ;->᩷֫:I

    if-ne v2, v4, :cond_1b

    const/4 v2, 0x4

    .line 424
    invoke-virtual {v0, v2}, Ll/ۘ᩸֫;->ܿ(I)V

    .line 425
    iget-object v2, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    invoke-interface {v2, v0}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 426
    iput-object v11, v1, Ll/ܺᩳۧ;->᩵֫:Ll/ᩳᩴۧ;

    .line 427
    iput v12, v1, Ll/ܺᩳۧ;->᩷֫:I

    return-void

    .line 431
    :cond_1b
    invoke-virtual {v1, v8, v0, v9}, Ll/ۙ᩹֫;->֫(Ll/ۗۙ֫;Ll/᩸᩸֫;I)I

    move-result v2

    const/4 v3, -0x4

    if-ne v2, v3, :cond_1e

    .line 433
    invoke-virtual {v0}, Ll/ۘ᩸֫;->᩻()Z

    move-result v2

    if-eqz v2, :cond_1c

    .line 434
    iput-boolean v4, v1, Ll/ܺᩳۧ;->ܺ֫:Z

    .line 435
    iput-boolean v9, v1, Ll/ܺᩳۧ;->᩶֫:Z

    goto :goto_b

    .line 437
    :cond_1c
    iget-object v2, v8, Ll/ۗۙ֫;->ۧ:Ll/۠ᩴ֫;

    if-nez v2, :cond_1d

    goto :goto_c

    .line 442
    :cond_1d
    iget-wide v2, v2, Ll/۠ᩴ֫;->ܳ֫:J

    iput-wide v2, v0, Ll/ᩳᩴۧ;->ۨ:J

    .line 443
    invoke-virtual {v0}, Ll/᩸᩸֫;->ᩴ()V

    .line 444
    iget-boolean v2, v1, Ll/ܺᩳۧ;->᩶֫:Z

    invoke-virtual {v0}, Ll/ۘ᩸֫;->ۢ()Z

    move-result v3

    xor-int/2addr v3, v4

    and-int/2addr v2, v3

    iput-boolean v2, v1, Ll/ܺᩳۧ;->᩶֫:Z

    .line 446
    :goto_b
    iget-boolean v2, v1, Ll/ܺᩳۧ;->᩶֫:Z

    if-nez v2, :cond_18

    .line 447
    iget-object v2, v1, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    invoke-interface {v2, v0}, Ll/֨᩸֫;->֫(Ljava/lang/Object;)V

    .line 448
    iput-object v11, v1, Ll/ܺᩳۧ;->᩵֫:Ll/ᩳᩴۧ;
    :try_end_1
    .catch Ll/֫ᩴۧ; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_a

    :cond_1e
    const/4 v0, -0x3

    if-ne v2, v0, :cond_18

    goto :goto_c

    :catch_1
    move-exception v0

    .line 590
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1f
    :goto_c
    return-void
.end method

.method public final ֫(JZ)V
    .locals 0

    .line 227
    iput-wide p1, p0, Ll/ܺᩳۧ;->ۖ֫:J

    .line 228
    iget-object p1, p0, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    if-eqz p1, :cond_0

    .line 229
    invoke-interface {p1}, Ll/ܿᩳۧ;->clear()V

    .line 231
    :cond_0
    invoke-direct {p0}, Ll/ܺᩳۧ;->ۧ֫()V

    const/4 p1, 0x0

    .line 232
    iput-boolean p1, p0, Ll/ܺᩳۧ;->ܺ֫:Z

    .line 233
    iput-boolean p1, p0, Ll/ܺᩳۧ;->֨֫:Z

    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 234
    iput-wide p2, p0, Ll/ܺᩳۧ;->ۢ֫:J

    .line 235
    iget-object p2, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    if-eqz p2, :cond_2

    .line 631
    iget-object p2, p2, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string p3, "application/x-media3-cues"

    invoke-static {p2, p3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 236
    iget p2, p0, Ll/ܺᩳۧ;->᩷֫:I

    if-eqz p2, :cond_1

    .line 527
    invoke-direct {p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 528
    iget-object p2, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    invoke-interface {p2}, Ll/֨᩸֫;->֫()V

    const/4 p2, 0x0

    .line 529
    iput-object p2, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 530
    iput p1, p0, Ll/ܺᩳۧ;->᩷֫:I

    const/4 p1, 0x1

    .line 534
    iput-boolean p1, p0, Ll/ܺᩳۧ;->᩶֫:Z

    .line 535
    iget-object p1, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    iget-object p2, p0, Ll/ܺᩳۧ;->᩹֫:Ll/ۢᩳۧ;

    check-cast p2, Ll/᩷ᩳۧ;

    invoke-virtual {p2, p1}, Ll/᩷ᩳۧ;->֫(Ll/۠ᩴ֫;)Ll/۟ۘۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 536
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Ll/֨᩸֫;->ۧ(J)V

    return-void

    .line 239
    :cond_1
    invoke-direct {p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 240
    iget-object p1, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    invoke-interface {p1}, Ll/֨᩸֫;->flush()V

    .line 242
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Ll/֨᩸֫;->ۧ(J)V

    :cond_2
    return-void
.end method

.method public final ֫([Ll/۠ᩴ֫;JJLl/ܺۧۧ;)V
    .locals 0

    const/4 p2, 0x0

    .line 209
    aget-object p1, p1, p2

    iput-object p1, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    .line 631
    iget-object p1, p1, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string p2, "application/x-media3-cues"

    invoke-static {p1, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_1

    .line 211
    invoke-direct {p0}, Ll/ܺᩳۧ;->֫֫()V

    .line 212
    iget-object p1, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    if-eqz p1, :cond_0

    .line 213
    iput p2, p0, Ll/ܺᩳۧ;->᩷֫:I

    return-void

    .line 534
    :cond_0
    iput-boolean p2, p0, Ll/ܺᩳۧ;->᩶֫:Z

    .line 535
    iget-object p1, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    iget-object p2, p0, Ll/ܺᩳۧ;->᩹֫:Ll/ۢᩳۧ;

    check-cast p2, Ll/᩷ᩳۧ;

    invoke-virtual {p2, p1}, Ll/᩷ᩳۧ;->֫(Ll/۠ᩴ֫;)Ll/۟ۘۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 536
    invoke-virtual {p0}, Ll/ۙ᩹֫;->᩹()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Ll/֨᩸֫;->ۧ(J)V

    return-void

    .line 219
    :cond_1
    iget-object p1, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    iget p1, p1, Ll/۠ᩴ֫;->ۢ:I

    if-ne p1, p2, :cond_2

    .line 220
    new-instance p1, Ll/᩻ᩳۧ;

    invoke-direct {p1}, Ll/᩻ᩳۧ;-><init>()V

    goto :goto_0

    .line 221
    :cond_2
    new-instance p1, Ll/ۜᩳۧ;

    invoke-direct {p1}, Ll/ۜᩳۧ;-><init>()V

    :goto_0
    iput-object p1, p0, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    return-void
.end method

.method public final ۤ()V
    .locals 3

    const/4 v0, 0x0

    .line 461
    iput-object v0, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 462
    iput-wide v1, p0, Ll/ܺᩳۧ;->ۢ֫:J

    .line 463
    invoke-direct {p0}, Ll/ܺᩳۧ;->ۧ֫()V

    .line 464
    iput-wide v1, p0, Ll/ܺᩳۧ;->ۖ֫:J

    .line 465
    iget-object v1, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    if-eqz v1, :cond_0

    .line 527
    invoke-direct {p0}, Ll/ܺᩳۧ;->ᩳ֫()V

    .line 528
    iget-object v1, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    invoke-interface {v1}, Ll/֨᩸֫;->֫()V

    .line 529
    iput-object v0, p0, Ll/ܺᩳۧ;->᩸֫:Ll/۟ۘۧ;

    const/4 v0, 0x0

    .line 530
    iput v0, p0, Ll/ܺᩳۧ;->᩷֫:I

    :cond_0
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 472
    iget-boolean v0, p0, Ll/ܺᩳۧ;->֨֫:Z

    return v0
.end method

.method public final ܽ(J)V
    .locals 1

    .line 199
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ܺ()Z

    move-result v0

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 200
    iput-wide p1, p0, Ll/ܺᩳۧ;->ۢ֫:J

    return-void
.end method

.method public final ܿ()Z
    .locals 7

    .line 477
    iget-object v0, p0, Ll/ܺᩳۧ;->۠֫:Ll/۠ᩴ֫;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_0

    .line 631
    :cond_0
    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    const-string v2, "application/x-media3-cues"

    invoke-static {v0, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 484
    iget-object v0, p0, Ll/ܺᩳۧ;->ۜ֫:Ll/ܿᩳۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    iget-wide v3, p0, Ll/ܺᩳۧ;->ۖ֫:J

    invoke-interface {v0, v3, v4}, Ll/ܿᩳۧ;->ܽ(J)J

    move-result-wide v3

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, v3, v5

    if-eqz v0, :cond_1

    goto :goto_0

    .line 492
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/ۙ᩹֫;->ۡ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    return v2

    .line 499
    :cond_2
    iget-boolean v0, p0, Ll/ܺᩳۧ;->֨֫:Z

    if-nez v0, :cond_6

    iget-boolean v0, p0, Ll/ܺᩳۧ;->ܺ֫:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ܺᩳۧ;->ܶ֫:Ll/ܿᩴۧ;

    iget-wide v3, p0, Ll/ܺᩳۧ;->ۖ֫:J

    if-eqz v0, :cond_3

    .line 509
    invoke-virtual {v0}, Ll/ܿᩴۧ;->֫()I

    move-result v5

    if-lez v5, :cond_3

    .line 510
    invoke-virtual {v0}, Ll/ܿᩴۧ;->֫()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-virtual {v0, v5}, Ll/ܿᩴۧ;->֫(I)J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_3

    goto :goto_0

    .line 501
    :cond_3
    iget-object v0, p0, Ll/ܺᩳۧ;->ۘ֫:Ll/ܿᩴۧ;

    iget-wide v3, p0, Ll/ܺᩳۧ;->ۖ֫:J

    if-eqz v0, :cond_4

    .line 509
    invoke-virtual {v0}, Ll/ܿᩴۧ;->֫()I

    move-result v5

    if-lez v5, :cond_4

    .line 510
    invoke-virtual {v0}, Ll/ܿᩴۧ;->֫()I

    move-result v5

    sub-int/2addr v5, v1

    invoke-virtual {v0, v5}, Ll/ܿᩴۧ;->֫(I)J

    move-result-wide v5

    cmp-long v0, v5, v3

    if-lez v0, :cond_4

    goto :goto_0

    .line 502
    :cond_4
    iget-object v0, p0, Ll/ܺᩳۧ;->᩵֫:Ll/ᩳᩴۧ;

    if-nez v0, :cond_6

    :cond_5
    :goto_0
    return v1

    :cond_6
    return v2
.end method
