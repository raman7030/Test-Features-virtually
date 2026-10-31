.class public abstract Ll/ۗᩴ᩵;
.super Ljava/lang/Object;
.source "NA29"

# interfaces
.implements Ll/ܰܺ᩵;


# instance fields
.field public ֫֫:I

.field public ۗ:Ll/֨ۡ᩵;

.field public ۙ:I

.field public ۛ:I

.field public ۜ֫:I

.field public ۟:Ll/ۗᩴ᩵;

.field public ۤ:Ll/ۛᩴ᩵;

.field public ۧ֫:[B

.field public ۨ:I

.field public ۫:I

.field public ۬:I

.field public ܰ:J

.field public ܳ֫:[B

.field public ܽ֫:I

.field public ܿ֫:J

.field public ᩳ֫:Z

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:J

.field public ᩺:I

.field public ᩻֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 99
    iput-object v0, p0, Ll/ۗᩴ᩵;->ܳ֫:[B

    const/4 v0, 0x0

    .line 100
    iput-object v0, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    .line 122
    iput-object p1, p0, Ll/ۗᩴ᩵;->ۗ:Ll/֨ۡ᩵;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 1

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 99
    iput-object v0, p0, Ll/ۗᩴ᩵;->ܳ֫:[B

    const/4 v0, 0x0

    .line 100
    iput-object v0, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    .line 127
    iput-object p1, p0, Ll/ۗᩴ᩵;->ۗ:Ll/֨ۡ᩵;

    .line 128
    iput p2, p0, Ll/ۗᩴ᩵;->ۙ:I

    return-void
.end method

.method public static final ۡ(I)I
    .locals 1

    .line 509
    rem-int/lit8 v0, p0, 0x8

    if-nez v0, :cond_0

    return p0

    :cond_0
    if-gez v0, :cond_1

    add-int/lit8 v0, v0, 0x8

    :cond_1
    add-int/lit8 p0, p0, 0x8

    sub-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final decode([B)I
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 536
    invoke-virtual {p0, p1, v0, v1}, Ll/ۗᩴ᩵;->֫([BIZ)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 713
    instance-of v0, p1, Ll/ۗᩴ᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۗᩴ᩵;

    iget-wide v0, p1, Ll/ۗᩴ᩵;->ܰ:J

    iget-wide v2, p0, Ll/ۗᩴ᩵;->ܰ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getDigest()Ll/ۛᩴ᩵;
    .locals 1

    .line 281
    iget-object v0, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    return-object v0
.end method

.method public final getDigest()Ll/ܿۖ᩵;
    .locals 1

    .line 281
    iget-object v0, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    return-object v0
.end method

.method public getErrorCode()I
    .locals 1

    .line 241
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۢ֫()I

    move-result v0

    return v0
.end method

.method public final getNext()Ll/ۗᩴ᩵;
    .locals 1

    .line 407
    iget-object v0, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 707
    iget-wide v0, p0, Ll/ۗᩴ᩵;->ܰ:J

    long-to-int v1, v0

    return v1
.end method

.method public reset()V
    .locals 3

    const/4 v0, 0x0

    .line 142
    iput v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    const/4 v1, 0x0

    .line 143
    iput-object v1, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    const-wide/16 v1, 0x0

    .line 144
    iput-wide v1, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    .line 145
    iput v0, p0, Ll/ۗᩴ᩵;->ۜ֫:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 720
    iget v0, p0, Ll/ۗᩴ᩵;->ۙ:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "UNKNOWN"

    goto :goto_0

    :pswitch_0
    const-string v0, "SMB2_OPLOCK_BREAK"

    goto :goto_0

    :pswitch_1
    const-string v0, "SMB2_SET_INFO"

    goto :goto_0

    :pswitch_2
    const-string v0, "SMB2_QUERY_INFO"

    goto :goto_0

    :pswitch_3
    const-string v0, "SMB2_CHANGE_NOTIFY"

    goto :goto_0

    :pswitch_4
    const-string v0, "SMB2_QUERY_DIRECTORY"

    goto :goto_0

    :pswitch_5
    const-string v0, "SMB2_ECHO"

    goto :goto_0

    :pswitch_6
    const-string v0, "SMB2_CANCEL"

    goto :goto_0

    :pswitch_7
    const-string v0, "SMB2_IOCTL"

    goto :goto_0

    :pswitch_8
    const-string v0, "SMB2_LOCK"

    goto :goto_0

    :pswitch_9
    const-string v0, "SMB2_WRITE"

    goto :goto_0

    :pswitch_a
    const-string v0, "SMB2_READ"

    goto :goto_0

    :pswitch_b
    const-string v0, "SMB2_FLUSH"

    goto :goto_0

    :pswitch_c
    const-string v0, "SMB2_CLOSE"

    goto :goto_0

    :pswitch_d
    const-string v0, "SMB2_CREATE"

    goto :goto_0

    :pswitch_e
    const-string v0, "SMB2_TREE_DISCONNECT"

    goto :goto_0

    :pswitch_f
    const-string v0, "SMB2_TREE_CONNECT"

    goto :goto_0

    :pswitch_10
    const-string v0, "SMB2_LOGOFF"

    goto :goto_0

    :pswitch_11
    const-string v0, "SMB2_SESSION_SETUP"

    goto :goto_0

    :pswitch_12
    const-string v0, "SMB2_NEGOTIATE"

    .line 782
    :goto_0
    iget v1, p0, Ll/ۗᩴ᩵;->᩻֫:I

    if-nez v1, :cond_0

    const-string v1, "0"

    goto :goto_1

    :cond_0
    invoke-static {v1}, Ll/ۗۚ᩵;->֫(I)Ljava/lang/String;

    move-result-object v1

    .line 783
    :goto_1
    new-instance v2, Ljava/lang/String;

    const-string v3, ",status="

    const-string v4, ",flags=0x"

    const-string v5, "command="

    .line 0
    invoke-static {v5, v0, v3, v1, v4}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 783
    iget v1, p0, Ll/ۗᩴ᩵;->ۛ:I

    const/4 v3, 0x4

    const-string v4, ",mid="

    .line 0
    invoke-static {v1, v3, v4, v0}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 784
    iget-wide v3, p0, Ll/ۗᩴ᩵;->ܰ:J

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",wordCount=0,byteCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۗᩴ᩵;->᩶:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֡()V
    .locals 1

    const/4 v0, 0x1

    .line 252
    iput-boolean v0, p0, Ll/ۗᩴ᩵;->ᩳ֫:Z

    return-void
.end method

.method public ֫(I[B)I
    .locals 9

    .line 470
    iput p1, p0, Ll/ۗᩴ᩵;->ۨ:I

    const/16 v0, 0x44

    .line 626
    sget-object v1, Ll/֫֡᩵;->֫:[B

    const/4 v2, 0x0

    invoke-static {v1, v2, p2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 628
    iget v0, p0, Ll/ۗᩴ᩵;->۫:I

    int-to-long v0, v0

    add-int/lit8 v3, p1, 0x6

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 629
    iget v0, p0, Ll/ۗᩴ᩵;->ۙ:I

    int-to-long v0, v0

    add-int/lit8 v3, p1, 0xc

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 630
    iget v0, p0, Ll/ۗᩴ᩵;->۬:I

    int-to-long v0, v0

    add-int/lit8 v3, p1, 0xe

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 631
    iget v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    int-to-long v0, v0

    add-int/lit8 v3, p1, 0x10

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 632
    iget v0, p0, Ll/ۗᩴ᩵;->֫֫:I

    int-to-long v0, v0

    add-int/lit8 v3, p1, 0x14

    invoke-static {v0, v1, v3, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 633
    iget-wide v0, p0, Ll/ۗᩴ᩵;->ܰ:J

    add-int/lit8 v4, p1, 0x18

    invoke-static {v0, v1, v4, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    .line 635
    iget-boolean v0, p0, Ll/ۗᩴ᩵;->᩸:Z

    if-eqz v0, :cond_0

    .line 636
    iget-wide v0, p0, Ll/ۗᩴ᩵;->᩹:J

    add-int/lit8 v4, p1, 0x20

    invoke-static {v0, v1, v4, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    .line 637
    iget-wide v0, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    add-int/lit8 v4, p1, 0x28

    invoke-static {v0, v1, v4, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    goto :goto_0

    .line 640
    :cond_0
    iget v0, p0, Ll/ۗᩴ᩵;->ۜ֫:I

    int-to-long v0, v0

    add-int/lit8 v4, p1, 0x24

    invoke-static {v0, v1, v4, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 641
    iget-wide v0, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    add-int/lit8 v4, p1, 0x28

    invoke-static {v0, v1, v4, p2}, Ll/֫֡᩵;->ܽ(JI[B)V

    :goto_0
    add-int/lit8 v0, p1, 0x40

    .line 473
    invoke-virtual {p0, v0, p2}, Ll/ۗᩴ᩵;->ᩳ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۗᩴ᩵;->᩶:I

    add-int/2addr v0, v1

    .line 475
    invoke-virtual {p0, v0}, Ll/ۗᩴ᩵;->᩻(I)I

    move-result v1

    add-int/2addr v0, v1

    sub-int v1, v0, p1

    .line 477
    iput v1, p0, Ll/ۗᩴ᩵;->᩺:I

    .line 481
    iget-object v4, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    if-eqz v4, :cond_1

    .line 483
    invoke-virtual {v4, v0, p2}, Ll/ۗᩴ᩵;->֫(I[B)I

    move-result v4

    add-int/2addr v4, v0

    int-to-long v5, v1

    .line 485
    invoke-static {v5, v6, v3, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    sub-int/2addr v4, v0

    add-int/2addr v1, v4

    .line 489
    :cond_1
    iget-object v3, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    if-eqz v3, :cond_2

    .line 490
    iget v5, p0, Ll/ۗᩴ᩵;->ۨ:I

    iget v6, p0, Ll/ۗᩴ᩵;->᩺:I

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۧ()Ll/۫ᩴ᩵;

    move-result-object v8

    move-object v4, p2

    move-object v7, p0

    invoke-virtual/range {v3 .. v8}, Ll/ۛᩴ᩵;->֫([BIILl/ܰܺ᩵;Ll/ܰܺ᩵;)V

    .line 258
    :cond_2
    iget-boolean v0, p0, Ll/ۗᩴ᩵;->ᩳ֫:Z

    if-eqz v0, :cond_3

    .line 494
    new-array v0, v1, [B

    iput-object v0, p0, Ll/ۗᩴ᩵;->ۧ֫:[B

    .line 495
    invoke-static {p2, p1, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return v1
.end method

.method public final ֫([BIZ)I
    .locals 6

    .line 548
    iput p2, p0, Ll/ۗᩴ᩵;->ۨ:I

    .line 651
    invoke-static {p2, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v0, p2, 0x4

    .line 653
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    add-int/lit8 v0, p2, 0x6

    .line 654
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->۫:I

    add-int/lit8 v0, p2, 0x8

    .line 656
    invoke-static {v0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->᩻֫:I

    add-int/lit8 v0, p2, 0xc

    .line 658
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->ۙ:I

    add-int/lit8 v0, p2, 0xe

    .line 659
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->۬:I

    add-int/lit8 v0, p2, 0x10

    .line 662
    invoke-static {v0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    add-int/lit8 v0, p2, 0x14

    .line 664
    invoke-static {v0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->֫֫:I

    add-int/lit8 v0, p2, 0x18

    .line 666
    invoke-static {v0, p1}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗᩴ᩵;->ܰ:J

    add-int/lit8 v0, p2, 0x20

    .line 669
    iget v1, p0, Ll/ۗᩴ᩵;->ۛ:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    iget-object v3, p0, Ll/ۗᩴ᩵;->ܳ֫:[B

    const/4 v4, 0x0

    const/16 v5, 0x10

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 671
    iput-boolean v1, p0, Ll/ۗᩴ᩵;->᩸:Z

    .line 672
    invoke-static {v0, p1}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗᩴ᩵;->᩹:J

    add-int/lit8 v0, p2, 0x28

    .line 674
    invoke-static {v0, p1}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    add-int/lit8 v0, p2, 0x30

    .line 676
    invoke-static {p1, v0, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 680
    :cond_0
    iput-boolean v4, p0, Ll/ۗᩴ᩵;->᩸:Z

    add-int/lit8 v0, p2, 0x24

    .line 682
    invoke-static {v0, p1}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۗᩴ᩵;->ۜ֫:I

    add-int/lit8 v0, p2, 0x28

    .line 684
    invoke-static {v0, p1}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    add-int/lit8 v0, p2, 0x30

    .line 686
    invoke-static {p1, v0, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    add-int/lit8 v0, p2, 0x40

    .line 550
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܺ֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 551
    invoke-virtual {p0, v0, p1}, Ll/ۗᩴ᩵;->ܽ(I[B)I

    move-result v1

    goto :goto_1

    .line 553
    :cond_1
    invoke-virtual {p0, v0, p1}, Ll/ۗᩴ᩵;->ۧ(I[B)I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    sub-int v1, v0, p2

    .line 556
    iput v1, p0, Ll/ۗᩴ᩵;->᩺:I

    .line 559
    iget v2, p0, Ll/ۗᩴ᩵;->֫֫:I

    if-eqz v2, :cond_2

    .line 561
    invoke-virtual {p0, v0}, Ll/ۗᩴ᩵;->᩻(I)I

    move-result p3

    :goto_2
    add-int/2addr v1, p3

    goto :goto_3

    :cond_2
    if-eqz p3, :cond_3

    if-nez v2, :cond_3

    .line 562
    iget p3, p0, Ll/ۗᩴ᩵;->ܽ֫:I

    if-lez p3, :cond_3

    sub-int/2addr p3, v1

    goto :goto_2

    .line 572
    :cond_3
    :goto_3
    invoke-virtual {p0, p2, v1, p1}, Ll/ۗᩴ᩵;->֫(II[B)V

    .line 574
    iget p1, p0, Ll/ۗᩴ᩵;->֫֫:I

    if-eqz p1, :cond_5

    iget-object p2, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    if-eqz p2, :cond_5

    .line 575
    rem-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_4

    goto :goto_4

    .line 576
    :cond_4
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Chained command is not aligned"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 576
    throw p1

    :cond_5
    :goto_4
    return v1
.end method

.method public ֫(I)V
    .locals 0

    .line 154
    invoke-virtual {p0, p1}, Ll/ۗᩴ᩵;->ۜ(I)V

    return-void
.end method

.method public ֫(II[B)V
    .locals 0

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 387
    iput-wide p1, p0, Ll/ۗᩴ᩵;->ܰ:J

    return-void
.end method

.method public final ֫(Ll/۫ᩴ᩵;)V
    .locals 0

    .line 412
    iput-object p1, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    return-void
.end method

.method public final ֫(Ll/ܿۖ᩵;)V
    .locals 1

    .line 292
    move-object v0, p1

    check-cast v0, Ll/ۛᩴ᩵;

    iput-object v0, p0, Ll/ۗᩴ᩵;->ۤ:Ll/ۛᩴ᩵;

    .line 293
    iget-object v0, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    if-eqz v0, :cond_0

    .line 294
    invoke-virtual {v0, p1}, Ll/ۗᩴ᩵;->֫(Ll/ܿۖ᩵;)V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/ۗᩴ᩵;)Z
    .locals 1

    .line 396
    iget-object v0, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    if-eqz v0, :cond_0

    .line 397
    invoke-virtual {v0, p1}, Ll/ۗᩴ᩵;->֫(Ll/ۗᩴ᩵;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x4

    .line 400
    invoke-virtual {p1, v0}, Ll/ۗᩴ᩵;->ܳ(I)V

    .line 401
    iput-object p1, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫֫()V
    .locals 1

    .line 369
    iget v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    return-void
.end method

.method public final ۖ֫()Z
    .locals 1

    .line 258
    iget-boolean v0, p0, Ll/ۗᩴ᩵;->ᩳ֫:Z

    return v0
.end method

.method public final ۜ()J
    .locals 2

    .line 378
    iget-wide v0, p0, Ll/ۗᩴ᩵;->ܰ:J

    return-wide v0
.end method

.method public final ۜ(I)V
    .locals 0

    .line 238
    iput p1, p0, Ll/ۗᩴ᩵;->۬:I

    return-void
.end method

.method public final ۜ֫()[B
    .locals 1

    .line 264
    iget-object v0, p0, Ll/ۗᩴ᩵;->ۧ֫:[B

    return-object v0
.end method

.method public final ۡ֫()I
    .locals 1

    .line 195
    iget v0, p0, Ll/ۗᩴ᩵;->ۜ֫:I

    return v0
.end method

.method public final ۢ(I)V
    .locals 1

    .line 203
    iput p1, p0, Ll/ۗᩴ᩵;->ۜ֫:I

    .line 204
    iget-object v0, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0, p1}, Ll/ۗᩴ᩵;->ۢ(I)V

    :cond_0
    return-void
.end method

.method public final ۢ֫()I
    .locals 1

    .line 303
    iget v0, p0, Ll/ۗᩴ᩵;->᩻֫:I

    return v0
.end method

.method public abstract ۧ(I[B)I
.end method

.method public ۧ()Ll/۫ᩴ᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 0

    return-void
.end method

.method public final ۧ(J)V
    .locals 1

    .line 320
    iput-wide p1, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    .line 321
    iget-object v0, p0, Ll/ۗᩴ᩵;->۟:Ll/ۗᩴ᩵;

    if-eqz v0, :cond_0

    .line 322
    invoke-virtual {v0, p1, p2}, Ll/ۗᩴ᩵;->ۧ(J)V

    :cond_0
    return-void
.end method

.method public final ۧ([B)V
    .locals 0

    .line 270
    iput-object p1, p0, Ll/ۗᩴ᩵;->ۧ֫:[B

    return-void
.end method

.method public final ۧ֫()J
    .locals 2

    .line 214
    iget-wide v0, p0, Ll/ۗᩴ᩵;->᩹:J

    return-wide v0
.end method

.method public final ۨ()Z
    .locals 1

    .line 178
    iget-boolean v0, p0, Ll/ۗᩴ᩵;->᩸:Z

    return v0
.end method

.method public final ܳ(I)V
    .locals 1

    .line 361
    iget v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۗᩴ᩵;->ۛ:I

    return-void
.end method

.method public final ܳ֫()I
    .locals 1

    .line 456
    iget v0, p0, Ll/ۗᩴ᩵;->ۨ:I

    return v0
.end method

.method public ܶ()I
    .locals 1

    .line 261
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ᩳ֫()I

    move-result v0

    return v0
.end method

.method public ܺ֫()Z
    .locals 1

    .line 303
    iget v0, p0, Ll/ۗᩴ᩵;->᩻֫:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ(I[B)I
    .locals 4

    .line 606
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p1, 0x2

    .line 610
    aget-byte v0, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 613
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/lit8 v1, p1, 0x8

    if-lez v0, :cond_0

    .line 617
    new-array v2, v0, [B

    const/4 v3, 0x0

    .line 618
    invoke-static {p2, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v0

    :cond_0
    sub-int/2addr v1, p1

    return v1

    .line 608
    :cond_1
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Error structureSize should be 9"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 608
    throw p1
.end method

.method public final ܽ(J)V
    .locals 0

    .line 222
    iput-wide p1, p0, Ll/ۗᩴ᩵;->᩹:J

    return-void
.end method

.method public final ܽ֫()Ll/֨ۡ᩵;
    .locals 1

    .line 136
    iget-object v0, p0, Ll/ۗᩴ᩵;->ۗ:Ll/֨ۡ᩵;

    return-object v0
.end method

.method public final ܿ(I)V
    .locals 0

    .line 187
    iput p1, p0, Ll/ۗᩴ᩵;->ۙ:I

    return-void
.end method

.method public final ܿ֫()I
    .locals 1

    .line 353
    iget v0, p0, Ll/ۗᩴ᩵;->ۛ:I

    return v0
.end method

.method public abstract ᩳ(I[B)I
.end method

.method public ᩳ(I)V
    .locals 0

    .line 204
    invoke-virtual {p0, p1}, Ll/ۗᩴ᩵;->ۢ(I)V

    return-void
.end method

.method public final ᩳ֫()I
    .locals 1

    .line 230
    iget v0, p0, Ll/ۗᩴ᩵;->۬:I

    return v0
.end method

.method public final ᩶()I
    .locals 1

    .line 154
    iget v0, p0, Ll/ۗᩴ᩵;->ۙ:I

    return v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 170
    iput p1, p0, Ll/ۗᩴ᩵;->ܽ֫:I

    return-void
.end method

.method public final ᩷֫()J
    .locals 2

    .line 311
    iget-wide v0, p0, Ll/ۗᩴ᩵;->ܿ֫:J

    return-wide v0
.end method

.method public ᩹()Ll/֫ۖ᩵;
    .locals 1

    .line 66
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getNext()Ll/ۗᩴ᩵;

    move-result-object v0

    check-cast v0, Ll/֫ۖ᩵;

    return-object v0
.end method

.method public ᩺()I
    .locals 1

    .line 195
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۡ֫()I

    move-result v0

    return v0
.end method

.method public final ᩻(I)I
    .locals 1

    .line 525
    iget v0, p0, Ll/ۗᩴ᩵;->ۨ:I

    sub-int/2addr p1, v0

    .line 526
    rem-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    rsub-int/lit8 p1, p1, 0x8

    return p1
.end method

.method public final ᩻֫()I
    .locals 1

    .line 464
    iget v0, p0, Ll/ۗᩴ᩵;->᩺:I

    return v0
.end method
