.class public final Ll/᩶ۡۧ;
.super Ljava/lang/Object;
.source "P8TI"

# interfaces
.implements Ll/ܳ᩵֫;


# static fields
.field public static final ۜ:Ll/۠ᩴ֫;

.field public static final ᩻:Ll/۠ᩴ֫;


# instance fields
.field public final ֫:J

.field public ۧ:I

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:J

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 50
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "application/id3"

    .line 51
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/᩶ۡۧ;->᩻:Ll/۠ᩴ֫;

    .line 52
    new-instance v0, Ll/֨ᩴ֫;

    invoke-direct {v0}, Ll/֨ᩴ֫;-><init>()V

    const-string v1, "application/x-scte35"

    .line 53
    invoke-virtual {v0, v1}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    sput-object v0, Ll/᩶ۡۧ;->ۜ:Ll/۠ᩴ֫;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    .line 83
    iput-object p2, p0, Ll/᩶ۡۧ;->ܳ:Ljava/lang/String;

    .line 84
    iput-wide p3, p0, Ll/᩶ۡۧ;->֫:J

    .line 85
    iput-wide p5, p0, Ll/᩶ۡۧ;->ܽ:J

    .line 86
    iput-object p7, p0, Ll/᩶ۡۧ;->ᩳ:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 128
    const-class v2, Ll/᩶ۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 131
    :cond_1
    check-cast p1, Ll/᩶ۡۧ;

    .line 132
    iget-wide v2, p0, Ll/᩶ۡۧ;->֫:J

    iget-wide v4, p1, Ll/᩶ۡۧ;->֫:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/᩶ۡۧ;->ܽ:J

    iget-wide v4, p1, Ll/᩶ۡۧ;->ܽ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-object v2, p0, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    .line 134
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩶ۡۧ;->ܳ:Ljava/lang/String;

    iget-object v3, p1, Ll/᩶ۡۧ;->ܳ:Ljava/lang/String;

    .line 135
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩶ۡۧ;->ᩳ:[B

    iget-object p1, p1, Ll/᩶ۡۧ;->ᩳ:[B

    .line 136
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 111
    iget v0, p0, Ll/᩶ۡۧ;->ۧ:I

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 113
    iget-object v1, p0, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/lit16 v1, v1, 0x20f

    mul-int/lit8 v1, v1, 0x1f

    .line 114
    iget-object v2, p0, Ll/᩶ۡۧ;->ܳ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 115
    iget-wide v2, p0, Ll/᩶ۡۧ;->֫:J

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v3, v2

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x1f

    .line 116
    iget-wide v2, p0, Ll/᩶ۡۧ;->ܽ:J

    ushr-long v4, v2, v0

    xor-long/2addr v2, v4

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 117
    iget-object v0, p0, Ll/᩶ۡۧ;->ᩳ:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/2addr v0, v1

    .line 118
    iput v0, p0, Ll/᩶ۡۧ;->ۧ:I

    .line 120
    :cond_2
    iget v0, p0, Ll/᩶ۡۧ;->ۧ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 141
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EMSG: scheme="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩶ۡۧ;->ܽ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", durationMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll/᩶ۡۧ;->֫:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶ۡۧ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/۠ᩴ֫;
    .locals 3

    .line 92
    iget-object v0, p0, Ll/᩶ۡۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "https://developer.apple.com/streaming/emsg-id3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "https://aomedia.org/emsg/ID3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "urn:scte:scte35:2014:bin"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const/4 v0, 0x0

    return-object v0

    .line 95
    :pswitch_0
    sget-object v0, Ll/᩶ۡۧ;->᩻:Ll/۠ᩴ֫;

    return-object v0

    .line 97
    :pswitch_1
    sget-object v0, Ll/᩶ۡۧ;->ۜ:Ll/۠ᩴ֫;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x578730ab -> :sswitch_2
        -0x2f712a89 -> :sswitch_1
        0x4db418c9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic ֫(Ll/ᩳ᩵֫;)V
    .locals 0

    return-void
.end method

.method public final ۧ()[B
    .locals 1

    .line 106
    invoke-virtual {p0}, Ll/᩶ۡۧ;->֫()Ll/۠ᩴ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩶ۡۧ;->ᩳ:[B

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
