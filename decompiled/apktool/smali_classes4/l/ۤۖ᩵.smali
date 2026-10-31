.class public abstract Ll/ۤۖ᩵;
.super Ll/ۨۖ᩵;
.source "ZA1E"


# static fields
.field public static final ۠֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:Ll/ۨۖ᩵;

.field public ֨֫:I

.field public ۚ֫:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Ll/ۤۖ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۤۖ᩵;->۠֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    const/4 v0, 0x0

    .line 74
    invoke-direct {p0, p1, v0}, Ll/ۤۖ᩵;-><init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;BLjava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;BLjava/lang/String;)V

    const/4 p1, -0x1

    .line 44
    iput-byte p1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Ll/ۤۖ᩵;->֨֫:I

    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;BLl/ۨۖ᩵;)V
    .locals 1

    const/4 v0, 0x0

    .line 251
    invoke-direct {p0, p1, p2, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;BLjava/lang/String;)V

    const/4 p1, -0x1

    .line 44
    iput-byte p1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Ll/ۤۖ᩵;->֨֫:I

    .line 66
    iput-object p3, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    if-eqz p3, :cond_0

    .line 68
    invoke-virtual {p3}, Ll/ۨۖ᩵;->᩶()I

    move-result p1

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    :cond_0
    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;Ll/ۨۖ᩵;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    const/4 p1, -0x1

    .line 44
    iput-byte p1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Ll/ۤۖ᩵;->֨֫:I

    .line 80
    iput-object p2, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    if-eqz p2, :cond_0

    .line 82
    invoke-virtual {p2}, Ll/ۨۖ᩵;->᩶()I

    move-result p1

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    :cond_0
    return-void
.end method


# virtual methods
.method public final decode([B)I
    .locals 4

    const/4 v0, 0x4

    .line 160
    iput v0, p0, Ll/ۨۖ᩵;->۟:I

    .line 162
    invoke-virtual {p0, p1}, Ll/ۨۖ᩵;->֫([B)V

    const/16 v1, 0x24

    .line 163
    invoke-virtual {p0, v1, p1}, Ll/ۤۖ᩵;->ۜ(I[B)I

    move-result v1

    add-int/lit8 v1, v1, 0x20

    .line 166
    iput v1, p0, Ll/ۨۖ᩵;->ۧ֫:I

    .line 168
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩷֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 169
    new-array v2, v1, [B

    const/4 v3, 0x0

    .line 170
    invoke-static {p1, v0, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    :cond_0
    invoke-virtual {p0, v0, v1, p1}, Ll/ۨۖ᩵;->֫(II[B)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    .line 175
    :cond_1
    new-instance p1, Ll/ᩳۖ᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Signature verification failed for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    throw p1
.end method

.method public final getNext()Ll/۟ܺ᩵;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    return-object v0
.end method

.method public final getNext()Ll/ۨۖ᩵;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 399
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",andxCommand=0x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/ۤۖ᩵;->ۚ֫:B

    const/4 v3, 0x2

    const-string v4, ",andxOffset="

    .line 0
    invoke-static {v2, v3, v4, v1}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 399
    iget v2, p0, Ll/ۤۖ᩵;->֨֫:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(I[B)I
    .locals 10

    .line 137
    iput p1, p0, Ll/ۨۖ᩵;->۟:I

    .line 139
    invoke-virtual {p0, p1, p2}, Ll/ۨۖ᩵;->ܳ(I[B)V

    add-int/lit8 v0, p1, 0x20

    add-int/lit8 v1, p1, 0x23

    add-int/lit8 v2, p1, 0x25

    .line 184
    invoke-virtual {p0, v2, p2}, Ll/ۨۖ᩵;->᩻(I[B)I

    move-result v2

    add-int/lit8 v3, v2, 0x4

    add-int/lit8 v2, v2, 0x5

    add-int/2addr v2, v0

    .line 187
    div-int/lit8 v3, v3, 0x2

    iput v3, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 188
    aput-byte v3, p2, v0

    add-int/lit8 v3, v2, 0x2

    .line 190
    invoke-virtual {p0, v3, p2}, Ll/ۨۖ᩵;->ܿ(I[B)I

    move-result v4

    iput v4, p0, Ll/ۨۖ᩵;->᩸:I

    add-int/lit8 v5, v2, 0x1

    and-int/lit16 v6, v4, 0xff

    int-to-byte v6, v6

    .line 191
    aput-byte v6, p2, v2

    shr-int/lit8 v2, v4, 0x8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 192
    aput-byte v2, p2, v5

    add-int/2addr v3, v4

    .line 206
    iget-object v2, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ֫()Ll/֨ۡ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    const/4 v2, -0x1

    .line 207
    iput-byte v2, p0, Ll/ۤۖ᩵;->ۚ֫:B

    const/4 v4, 0x0

    .line 208
    iput-object v4, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    add-int/lit8 v4, p1, 0x21

    .line 210
    aput-byte v2, p2, v4

    add-int/lit8 v2, p1, 0x22

    const/4 v4, 0x0

    .line 211
    aput-byte v4, p2, v2

    const/16 v2, -0x22

    .line 214
    aput-byte v2, p2, v1

    add-int/lit8 v1, p1, 0x24

    .line 215
    aput-byte v2, p2, v1

    sub-int/2addr v3, v0

    add-int/2addr v3, v0

    sub-int v7, v3, p1

    .line 141
    iput v7, p0, Ll/ۨۖ᩵;->ۧ֫:I

    .line 143
    iget-object v4, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    if-eqz v4, :cond_1

    .line 144
    iget v6, p0, Ll/ۨۖ᩵;->۟:I

    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v9

    move-object v5, p2

    move-object v8, p0

    invoke-virtual/range {v4 .. v9}, Ll/ۛۖ᩵;->֫([BIILl/ܰܺ᩵;Ll/ܰܺ᩵;)V

    .line 147
    :cond_1
    iget p1, p0, Ll/ۨۖ᩵;->ۧ֫:I

    return p1
.end method

.method public final ۜ(I[B)I
    .locals 7

    add-int/lit8 v0, p1, 0x1

    .line 278
    aget-byte v1, p2, p1

    iput v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    const/4 v2, -0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_2

    .line 286
    aget-byte v1, p2, v0

    iput-byte v1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    add-int/lit8 v1, p1, 0x3

    .line 287
    invoke-static {v1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v1

    iput v1, p0, Ll/ۤۖ᩵;->֨֫:I

    if-nez v1, :cond_0

    .line 290
    iput-byte v2, p0, Ll/ۤۖ᩵;->ۚ֫:B

    .line 298
    :cond_0
    iget v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    if-le v1, v3, :cond_1

    add-int/lit8 v1, p1, 0x5

    .line 299
    invoke-virtual {p0, v1, p2}, Ll/ۨۖ᩵;->ܽ(I[B)I

    .line 308
    invoke-virtual {p0}, Ll/ۨۖ᩵;->᩶()I

    move-result v1

    const/16 v4, -0x5e

    if-ne v1, v4, :cond_1

    move-object v1, p0

    check-cast v1, Ll/᩷ۘ᩵;

    invoke-virtual {v1}, Ll/᩷ۘ᩵;->ᩴ֫()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 309
    invoke-virtual {v1}, Ll/᩷ۘ᩵;->ۘ֫()I

    move-result v1

    const/4 v4, 0x1

    if-eq v1, v4, :cond_1

    .line 310
    iget v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    add-int/lit8 v1, v1, 0x8

    iput v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    .line 314
    :cond_1
    iget v1, p0, Ll/ۨۖ᩵;->ᩴ֫:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 317
    :cond_2
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v1

    iput v1, p0, Ll/ۨۖ᩵;->᩸:I

    add-int/2addr v0, v3

    if-eqz v1, :cond_4

    .line 322
    invoke-virtual {p0, v0, p2}, Ll/ۨۖ᩵;->ۧ(I[B)I

    move-result v1

    .line 323
    iget v4, p0, Ll/ۨۖ᩵;->᩸:I

    if-eq v1, v4, :cond_3

    sget-object v4, Ll/ۤۖ᩵;->۠֫:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_3

    const-string v5, "Short read, have "

    const-string v6, ", want "

    .line 0
    invoke-static {v1, v5, v6}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 324
    iget v5, p0, Ll/ۨۖ᩵;->᩸:I

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 326
    :cond_3
    iget v1, p0, Ll/ۨۖ᩵;->᩸:I

    add-int/2addr v0, v1

    .line 336
    :cond_4
    iget v1, p0, Ll/ۨۖ᩵;->۬:I

    if-nez v1, :cond_a

    iget-byte v1, p0, Ll/ۤۖ᩵;->ۚ֫:B

    if-ne v1, v2, :cond_5

    goto/16 :goto_1

    .line 339
    :cond_5
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    if-eqz v0, :cond_9

    .line 348
    iget v2, p0, Ll/ۨۖ᩵;->۟:I

    iget v4, p0, Ll/ۤۖ᩵;->֨֫:I

    add-int/2addr v4, v2

    .line 350
    iput v2, v0, Ll/ۨۖ᩵;->۟:I

    .line 351
    invoke-virtual {v0, v1}, Ll/ۨۖ᩵;->ܿ(I)V

    .line 352
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    .line 537
    iget v1, p0, Ll/ۨۖ᩵;->۬:I

    .line 545
    iput v1, v0, Ll/ۨۖ᩵;->۬:I

    .line 353
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ܽ֫()B

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۨۖ᩵;->֫(B)V

    .line 354
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    .line 478
    iget v1, p0, Ll/ۨۖ᩵;->᩺:I

    .line 486
    iput v1, v0, Ll/ۨۖ᩵;->᩺:I

    .line 789
    iget v1, p0, Ll/ۨۖ᩵;->ۡ֫:I

    .line 798
    iput v1, v0, Ll/ۨۖ᩵;->ۡ֫:I

    .line 806
    iget v1, p0, Ll/ۨۖ᩵;->ܿ֫:I

    .line 814
    iput v1, v0, Ll/ۨۖ᩵;->ܿ֫:I

    .line 822
    iget v1, p0, Ll/ۨۖ᩵;->ܺ֫:I

    .line 831
    iput v1, v0, Ll/ۨۖ᩵;->ܺ֫:I

    .line 772
    iget v1, p0, Ll/ۨۖ᩵;->ܽ֫:I

    int-to-long v1, v1

    long-to-int v2, v1

    .line 781
    iput v2, v0, Ll/ۨۖ᩵;->ܽ֫:I

    .line 359
    invoke-virtual {p0}, Ll/ۨۖ᩵;->ۢ֫()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۨۖ᩵;->ۧ(Z)V

    .line 361
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    instance-of v1, v0, Ll/ۤۖ᩵;

    if-eqz v1, :cond_6

    .line 362
    check-cast v0, Ll/ۤۖ᩵;

    invoke-virtual {v0, v4, p2}, Ll/ۤۖ᩵;->ۜ(I[B)I

    move-result p2

    add-int/2addr v4, p2

    move v0, v4

    goto :goto_0

    :cond_6
    add-int/lit8 v1, v4, 0x1

    .line 369
    iget v2, v0, Ll/ۨۖ᩵;->ᩴ֫:I

    and-int/lit16 v5, v2, 0xff

    int-to-byte v5, v5

    aput-byte v5, p2, v4

    if-eqz v2, :cond_7

    if-le v2, v3, :cond_7

    .line 378
    invoke-virtual {v0, v1, p2}, Ll/ۨۖ᩵;->ܽ(I[B)I

    move-result v0

    add-int/2addr v1, v0

    .line 382
    :cond_7
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    invoke-static {v1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v2

    iput v2, v0, Ll/ۨۖ᩵;->᩸:I

    add-int/2addr v1, v3

    .line 385
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    iget v2, v0, Ll/ۨۖ᩵;->᩸:I

    if-eqz v2, :cond_8

    .line 386
    invoke-virtual {v0, v1, p2}, Ll/ۨۖ᩵;->ۧ(I[B)I

    .line 387
    iget-object p2, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    iget p2, p2, Ll/ۨۖ᩵;->᩸:I

    add-int/2addr v1, p2

    :cond_8
    move v0, v1

    .line 390
    :goto_0
    iget-object p2, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    invoke-virtual {p2}, Ll/ۨۖ᩵;->᩷()V

    goto :goto_2

    .line 340
    :cond_9
    iput-byte v2, p0, Ll/ۤۖ᩵;->ۚ֫:B

    .line 341
    new-instance p1, Ll/۬ۡ᩵;

    const-string p2, "no andx command supplied with response"

    .line 58
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 341
    throw p1

    .line 337
    :cond_a
    :goto_1
    iput-byte v2, p0, Ll/ۤۖ᩵;->ۚ֫:B

    const/4 p2, 0x0

    .line 338
    iput-object p2, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    :goto_2
    sub-int/2addr v0, p1

    return v0
.end method

.method public final ۡ֫()Ll/ۨۖ᩵;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    return-object v0
.end method

.method public final ܿ()Ll/۟ܺ᩵;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    return-object v0
.end method

.method public final ᩹()Ll/֫ۖ᩵;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/ۤۖ᩵;->֡֫:Ll/ۨۖ᩵;

    return-object v0
.end method
