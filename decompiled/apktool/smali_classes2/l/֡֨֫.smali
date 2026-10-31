.class public final Ll/֡֨֫;
.super Ljava/lang/Object;
.source "L8R4"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(IILjava/lang/String;[B)V
    .locals 5

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 185
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "auxiliary.tracks.map"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_1
    const-string v0, "auxiliary.tracks.offset"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_2
    const-string v0, "auxiliary.tracks.length"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_3
    const-string v0, "auxiliary.tracks.interleaved"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_4
    const-string v0, "com.android.capture.fps"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    if-nez p2, :cond_5

    const/4 v2, 0x1

    .line 194
    :cond_5
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    goto :goto_1

    :pswitch_1
    const/16 v0, 0x4e

    if-ne p2, v0, :cond_6

    .line 191
    array-length v0, p4

    const/16 v1, 0x8

    if-ne v0, v1, :cond_6

    const/4 v2, 0x1

    :cond_6
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    goto :goto_1

    :pswitch_2
    const/16 v0, 0x4b

    if-ne p2, v0, :cond_8

    .line 197
    array-length v0, p4

    if-ne v0, v3, :cond_8

    aget-byte v0, p4, v2

    if-eqz v0, :cond_7

    if-ne v0, v3, :cond_8

    :cond_7
    const/4 v2, 0x1

    :cond_8
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    goto :goto_1

    :pswitch_3
    const/16 v0, 0x17

    if-ne p2, v0, :cond_9

    .line 187
    array-length v0, p4

    if-ne v0, v1, :cond_9

    const/4 v2, 0x1

    :cond_9
    invoke-static {v2}, Ll/᩺֡֫;->֫(Z)V

    .line 106
    :goto_1
    iput-object p3, p0, Ll/֡֨֫;->֫:Ljava/lang/String;

    .line 107
    iput-object p4, p0, Ll/֡֨֫;->ᩳ:[B

    .line 108
    iput p1, p0, Ll/֡֨֫;->ۧ:I

    .line 109
    iput p2, p0, Ll/֡֨֫;->ܽ:I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7438daab -> :sswitch_4
        -0x100eb5d5 -> :sswitch_3
        0x3c4d37e4 -> :sswitch_2
        0x41766191 -> :sswitch_1
        0x7755f91e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 132
    const-class v2, Ll/֡֨֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 135
    :cond_1
    check-cast p1, Ll/֡֨֫;

    .line 136
    iget-object v2, p0, Ll/֡֨֫;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/֡֨֫;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֡֨֫;->ᩳ:[B

    iget-object v3, p1, Ll/֡֨֫;->ᩳ:[B

    .line 137
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Ll/֡֨֫;->ۧ:I

    iget v3, p1, Ll/֡֨֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/֡֨֫;->ܽ:I

    iget p1, p1, Ll/֡֨֫;->ܽ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    const/16 v0, 0x20f

    const/16 v1, 0x1f

    .line 0
    iget-object v2, p0, Ll/֡֨֫;->֫:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/ۧ۬֫;->֫(IILjava/lang/String;)I

    move-result v0

    .line 146
    iget-object v1, p0, Ll/֡֨֫;->ᩳ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 147
    iget v0, p0, Ll/֡֨֫;->ۧ:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 148
    iget v0, p0, Ll/֡֨֫;->ܽ:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    const/4 v0, 0x2

    const/4 v1, 0x4

    .line 155
    iget-object v2, p0, Ll/֡֨֫;->֫:Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Ll/֡֨֫;->ᩳ:[B

    iget v5, p0, Ll/֡֨֫;->ܽ:I

    if-eqz v5, :cond_7

    const/4 v6, 0x1

    if-eq v5, v6, :cond_6

    const/16 v7, 0x17

    const/4 v8, 0x3

    const-string v9, "array too small: %s < %s"

    if-eq v5, v7, :cond_4

    const/16 v7, 0x43

    if-eq v5, v7, :cond_2

    const/16 v0, 0x4b

    if-eq v5, v0, :cond_1

    const/16 v0, 0x4e

    if-eq v5, v0, :cond_0

    goto/16 :goto_2

    .line 169
    :cond_0
    new-instance v0, Ll/ᩳ֨֫;

    invoke-direct {v0, v4}, Ll/ᩳ֨֫;-><init>([B)V

    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۙ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 166
    :cond_1
    aget-byte v0, v4, v3

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 348
    :cond_2
    array-length v5, v4

    if-lt v5, v1, :cond_3

    const/4 v5, 0x1

    goto :goto_0

    :cond_3
    const/4 v5, 0x0

    :goto_0
    array-length v7, v4

    invoke-static {v9, v7, v1, v5}, Ll/ۘܶܺ;->֫(Ljava/lang/String;IIZ)V

    .line 349
    aget-byte v1, v4, v3

    aget-byte v3, v4, v6

    aget-byte v0, v4, v0

    aget-byte v4, v4, v8

    invoke-static {v1, v3, v0, v4}, Ll/۬᩺ܺ;->֫(BBBB)I

    move-result v0

    .line 163
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_4

    .line 348
    :cond_4
    array-length v5, v4

    if-lt v5, v1, :cond_5

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    array-length v7, v4

    invoke-static {v9, v7, v1, v5}, Ll/ۘܶܺ;->֫(Ljava/lang/String;IIZ)V

    .line 349
    aget-byte v1, v4, v3

    aget-byte v3, v4, v6

    aget-byte v0, v4, v0

    aget-byte v4, v4, v8

    invoke-static {v1, v3, v0, v4}, Ll/۬᩺ܺ;->֫(BBBB)I

    move-result v0

    .line 160
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 157
    :cond_6
    invoke-static {v4}, Ll/ۘ֨֫;->֫([B)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_7
    const-string v0, "auxiliary.tracks.map"

    .line 172
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 173
    invoke-virtual {p0}, Ll/֡֨֫;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "track types = "

    .line 0
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 211
    invoke-static {}, Ll/ۜܶܺ;->֫()Ll/ۜܶܺ;

    move-result-object v3

    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Ll/ۜܶܺ;->֫(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V

    .line 212
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 178
    :cond_8
    :goto_2
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 2083
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v5, v4

    mul-int/lit8 v5, v5, 0x2

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2084
    :goto_3
    array-length v5, v4

    if-ge v3, v5, :cond_9

    .line 2085
    aget-byte v5, v4, v3

    shr-int/2addr v5, v1

    and-int/lit8 v5, v5, 0xf

    const/16 v6, 0x10

    .line 2086
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-byte v5, v4, v3

    and-int/lit8 v5, v5, 0xf

    .line 2087
    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 2089
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_4
    const-string v1, "mdta: key="

    const-string v3, ", value="

    .line 0
    invoke-static {v1, v2, v3, v0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ᩳ᩵֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 5

    .line 117
    iget-object v0, p0, Ll/֡֨֫;->֫:Ljava/lang/String;

    const-string v1, "auxiliary.tracks.map"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Metadata is not an auxiliary tracks map"

    invoke-static {v1, v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    .line 119
    iget-object v1, p0, Ll/֡֨֫;->ᩳ:[B

    aget-byte v0, v1, v0

    .line 120
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    add-int/lit8 v4, v3, 0x2

    .line 122
    aget-byte v4, v1, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method
