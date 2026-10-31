.class public final Ll/ۧ᩵᩵;
.super Ll/۫ᩴ᩵;
.source "P9V5"

# interfaces
.implements Ll/ܳۖ᩵;


# static fields
.field public static final ܶ֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:I

.field public final ֨֫:Ljava/lang/String;

.field public ۚ֫:[B

.field public ۠֫:J

.field public ᩴ֫:[Ll/᩺ᩴ᩵;

.field public ᩵֫:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    const-class v0, Ll/ۧ᩵᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۧ᩵᩵;->ܶ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/֨ۡ᩵;)V
    .locals 0

    .line 64
    invoke-direct {p0, p2}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    const/16 p2, 0x10

    new-array p2, p2, [B

    .line 54
    iput-object p2, p0, Ll/ۧ᩵᩵;->ۚ֫:[B

    .line 65
    iput-object p1, p0, Ll/ۧ᩵᩵;->֨֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAttributes()I
    .locals 1

    .line 183
    iget v0, p0, Ll/ۧ᩵᩵;->֡֫:I

    return v0
.end method

.method public final getSize()J
    .locals 2

    .line 164
    iget-wide v0, p0, Ll/ۧ᩵᩵;->᩵֫:J

    return-wide v0
.end method

.method public final ֡֫()[B
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۧ᩵᩵;->ۚ֫:[B

    return-object v0
.end method

.method public final ֫(Ll/۟ܺ᩵;)V
    .locals 2

    .line 76
    invoke-virtual {p0}, Ll/۫ᩴ᩵;->۟()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ll/ۙᩴ᩵;

    if-eqz v0, :cond_0

    .line 77
    move-object v0, p1

    check-cast v0, Ll/ۙᩴ᩵;

    iget-object v1, p0, Ll/ۧ᩵᩵;->ۚ֫:[B

    invoke-interface {v0, v1}, Ll/ۙᩴ᩵;->֫([B)V

    .line 79
    :cond_0
    invoke-super {p0, p1}, Ll/۫ᩴ᩵;->֫(Ll/۟ܺ᩵;)V

    return-void
.end method

.method public final ۛ()J
    .locals 2

    .line 140
    iget-wide v0, p0, Ll/ۧ᩵᩵;->۠֫:J

    return-wide v0
.end method

.method public final ۧ(I[B)I
    .locals 12

    .line 242
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x59

    if-ne v0, v1, :cond_4

    add-int/lit8 v0, p1, 0x2

    .line 248
    aget-byte v0, p2, v0

    add-int/lit8 v0, p1, 0x3

    .line 249
    aget-byte v0, p2, v0

    add-int/lit8 v0, p1, 0x4

    .line 252
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v0, p1, 0x8

    .line 255
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v0, p1, 0x10

    .line 257
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v0, p1, 0x18

    .line 259
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۧ᩵᩵;->۠֫:J

    add-int/lit8 v0, p1, 0x20

    .line 261
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v0, p1, 0x28

    .line 264
    invoke-static {v0, p2}, Ll/֫֡᩵;->ܽ(I[B)J

    add-int/lit8 v0, p1, 0x30

    .line 266
    invoke-static {v0, p2}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۧ᩵᩵;->᩵֫:J

    add-int/lit8 v0, p1, 0x38

    .line 269
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۧ᩵᩵;->֡֫:I

    add-int/lit8 v0, p1, 0x40

    .line 273
    iget-object v1, p0, Ll/ۧ᩵᩵;->ۚ֫:[B

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-static {p2, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, p1, 0x50

    .line 276
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/lit8 v3, p1, 0x54

    .line 278
    invoke-static {v3, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v3

    add-int/lit8 v4, p1, 0x58

    if-lez v0, :cond_2

    if-lez v3, :cond_2

    .line 282
    new-instance v3, Ljava/util/LinkedList;

    invoke-direct {v3}, Ljava/util/LinkedList;-><init>()V

    .line 283
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܳ֫()I

    move-result v5

    add-int/2addr v5, v0

    .line 287
    :cond_0
    invoke-static {v5, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    add-int/lit8 v6, v5, 0x4

    .line 290
    invoke-static {v6, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v6

    add-int/lit8 v7, v5, 0x6

    .line 291
    invoke-static {v7, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v7

    add-int/lit8 v8, v5, 0xa

    .line 294
    invoke-static {v8, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v8

    add-int/lit8 v9, v5, 0xc

    .line 296
    invoke-static {v9, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v9

    add-int/lit8 v10, v5, 0x10

    .line 299
    new-array v11, v7, [B

    add-int/2addr v6, v5

    .line 300
    invoke-static {p2, v6, v11, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v6, v7

    .line 301
    invoke-static {v10, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/2addr v8, v5

    add-int/2addr v8, v9

    .line 309
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-lez v0, :cond_1

    add-int/2addr v5, v0

    .line 314
    :cond_1
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-gtz v0, :cond_0

    new-array p2, v2, [Ll/᩺ᩴ᩵;

    .line 317
    invoke-virtual {v3, p2}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/᩺ᩴ᩵;

    iput-object p2, p0, Ll/ۧ᩵᩵;->ᩴ֫:[Ll/᩺ᩴ᩵;

    .line 320
    :cond_2
    sget-object p2, Ll/ۧ᩵᩵;->ܶ֫:Ll/֫᩻֨;

    invoke-interface {p2}, Ll/֫᩻֨;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Opened "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۧ᩵᩵;->֨֫:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    array-length v3, v1

    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    .line 321
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_3
    sub-int/2addr v4, p1

    return v4

    .line 245
    :cond_4
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Structure size is not 89"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 245
    throw p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵֫()J
    .locals 2

    .line 164
    iget-wide v0, p0, Ll/ۧ᩵᩵;->᩵֫:J

    return-wide v0
.end method
