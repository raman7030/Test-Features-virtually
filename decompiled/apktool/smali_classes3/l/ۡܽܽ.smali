.class public final Ll/ۡܽܽ;
.super Ljava/lang/Object;
.source "DAO9"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۜ:Ljava/lang/String;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:[B

.field public ܿ:F

.field public ᩳ:D

.field public ᩻:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 713
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۡܽܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 736
    iget v0, p0, Ll/ۡܽܽ;->ۧ:I

    const/16 v1, 0x10

    sparse-switch v0, :sswitch_data_0

    const/4 v0, 0x0

    return-object v0

    :sswitch_0
    const-string v0, "false"

    return-object v0

    :sswitch_1
    const-string v0, "true"

    return-object v0

    .line 757
    :sswitch_2
    iget-wide v0, p0, Ll/ۡܽܽ;->ᩳ:D

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 755
    :sswitch_3
    iget v0, p0, Ll/ۡܽܽ;->ܿ:F

    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 753
    :sswitch_4
    iget-wide v2, p0, Ll/ۡܽܽ;->᩻:J

    invoke-static {v2, v3, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 751
    :sswitch_5
    iget-wide v0, p0, Ll/ۡܽܽ;->᩻:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 749
    :sswitch_6
    iget v0, p0, Ll/ۡܽܽ;->ܳ:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 747
    :sswitch_7
    iget v0, p0, Ll/ۡܽܽ;->ܳ:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 745
    :sswitch_8
    iget-object v0, p0, Ll/ۡܽܽ;->ܽ:[B

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 743
    :sswitch_9
    iget-object v0, p0, Ll/ۡܽܽ;->ܽ:[B

    invoke-static {v0}, Ll/ܺܽܽ;->֫([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 741
    :sswitch_a
    iget-object v0, p0, Ll/ۡܽܽ;->ۜ:Ljava/lang/String;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_a
        0x30 -> :sswitch_a
        0x40 -> :sswitch_9
        0x50 -> :sswitch_8
        0x60 -> :sswitch_7
        0x70 -> :sswitch_6
        0x80 -> :sswitch_5
        0x90 -> :sswitch_4
        0xa0 -> :sswitch_3
        0xb0 -> :sswitch_2
        0xc0 -> :sswitch_1
        0xd0 -> :sswitch_0
    .end sparse-switch
.end method
