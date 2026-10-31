.class public final Ll/ۖܺ᩵;
.super Ll/ۛܺ᩵;
.source "X9ZK"


# static fields
.field public static final ᩻:[C


# instance fields
.field public ֫:B

.field public ۧ:B

.field public ܳ:S

.field public ܽ:[B

.field public ܿ:I

.field public ᩳ:S


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 73
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖܺ᩵;->᩻:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    const/16 v0, 0x8

    const/4 v1, 0x0

    .line 125
    invoke-static {p1, v1, v0}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v0

    iput v0, p0, Ll/ۖܺ᩵;->ܿ:I

    const/16 v0, 0x9

    const/4 v2, 0x4

    .line 126
    invoke-static {p1, v0, v2}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v0

    const v3, 0xffff

    and-int/2addr v0, v3

    int-to-short v0, v0

    iput-short v0, p0, Ll/ۖܺ᩵;->ܳ:S

    const/16 v0, 0xe

    .line 127
    invoke-static {p1, v0, v2}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v0

    and-int/2addr v0, v3

    int-to-short v0, v0

    iput-short v0, p0, Ll/ۖܺ᩵;->ᩳ:S

    const/16 v0, 0x13

    const/4 v3, 0x2

    .line 128
    invoke-static {p1, v0, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    iput-byte v0, p0, Ll/ۖܺ᩵;->֫:B

    const/16 v0, 0x15

    .line 129
    invoke-static {p1, v0, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    iput-byte v0, p0, Ll/ۖܺ᩵;->ۧ:B

    const/4 v0, 0x6

    new-array v0, v0, [B

    .line 130
    iput-object v0, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/16 v4, 0x18

    .line 131
    invoke-static {p1, v4, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v4

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    .line 132
    iget-object v0, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/16 v1, 0x1a

    invoke-static {p1, v1, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v4, 0x1

    aput-byte v1, v0, v4

    .line 133
    iget-object v0, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/16 v1, 0x1c

    invoke-static {p1, v1, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v3

    .line 134
    iget-object v0, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/16 v1, 0x1e

    invoke-static {p1, v1, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    const/4 v4, 0x3

    aput-byte v1, v0, v4

    .line 135
    iget-object v0, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/16 v1, 0x20

    invoke-static {p1, v1, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    aput-byte v1, v0, v2

    .line 136
    iget-object v0, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/16 v1, 0x22

    invoke-static {p1, v1, v3}, Ll/ۖܺ᩵;->֫([CII)I

    move-result p1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v1, 0x5

    aput-byte p1, v0, v1

    return-void
.end method

.method public static ֫([CII)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, p1

    .line 33
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    if-ge v0, p2, :cond_0

    shl-int/lit8 v1, v1, 0x4

    .line 35
    aget-char v3, p0, v2

    packed-switch v3, :pswitch_data_0

    packed-switch v3, :pswitch_data_1

    packed-switch v3, :pswitch_data_2

    .line 65
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    add-int/lit8 v3, v3, -0x30

    goto :goto_1

    :pswitch_1
    add-int/lit8 v3, v3, -0x37

    goto :goto_1

    :pswitch_2
    add-int/lit8 v3, v3, -0x57

    :goto_1
    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public static ֫(II)Ljava/lang/String;
    .locals 3

    .line 79
    new-array v0, p1, [C

    :goto_0
    add-int/lit8 v1, p1, -0x1

    if-lez p1, :cond_0

    and-int/lit8 p1, p0, 0xf

    .line 82
    sget-object v2, Ll/ۖܺ᩵;->᩻:[C

    aget-char p1, v2, p1

    aput-char p1, v0, v1

    ushr-int/lit8 p0, p0, 0x4

    move p1, v1

    goto :goto_0

    .line 85
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/ۖܺ᩵;->ܿ:I

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-short v2, p0, Ll/ۖܺ᩵;->ܳ:S

    const/4 v3, 0x4

    invoke-static {v2, v3}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-short v2, p0, Ll/ۖܺ᩵;->ᩳ:S

    invoke-static {v2, v3}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/ۖܺ᩵;->֫:B

    const/4 v4, 0x2

    .line 143
    invoke-static {v2, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Ll/ۖܺ᩵;->ۧ:B

    invoke-static {v2, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/4 v2, 0x0

    aget-byte v1, v1, v2

    invoke-static {v1, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/4 v2, 0x1

    aget-byte v1, v1, v2

    .line 144
    invoke-static {v1, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖܺ᩵;->ܽ:[B

    aget-byte v1, v1, v4

    invoke-static {v1, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/4 v2, 0x3

    aget-byte v1, v1, v2

    invoke-static {v1, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖܺ᩵;->ܽ:[B

    aget-byte v1, v1, v3

    invoke-static {v1, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖܺ᩵;->ܽ:[B

    const/4 v2, 0x5

    aget-byte v1, v1, v2

    .line 145
    invoke-static {v1, v4}, Ll/ۖܺ᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 4

    const/4 v0, 0x4

    .line 43
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 44
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/ۖܺ᩵;->ܿ:I

    .line 45
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ۧ()I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Ll/ۖܺ᩵;->ܳ:S

    .line 46
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ۧ()I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Ll/ۖܺ᩵;->ᩳ:S

    .line 47
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v0

    int-to-byte v0, v0

    iput-byte v0, p0, Ll/ۖܺ᩵;->֫:B

    .line 48
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v0

    int-to-byte v0, v0

    iput-byte v0, p0, Ll/ۖܺ᩵;->ۧ:B

    .line 50
    iget v0, p1, Ll/۬ܺ᩵;->ܽ:I

    const/4 v1, 0x6

    .line 51
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->֫(I)V

    .line 53
    iget-object v2, p0, Ll/ۖܺ᩵;->ܽ:[B

    if-nez v2, :cond_0

    new-array v2, v1, [B

    .line 56
    iput-object v2, p0, Ll/ۖܺ᩵;->ܽ:[B

    .line 58
    :cond_0
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    .line 60
    iget-object v2, p0, Ll/ۖܺ᩵;->ܽ:[B

    invoke-virtual {p1}, Ll/۬ܺ᩵;->ܽ()I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 3

    const/4 v0, 0x4

    .line 24
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 25
    iget v0, p0, Ll/ۖܺ᩵;->ܿ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 26
    iget-short v0, p0, Ll/ۖܺ᩵;->ܳ:S

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 27
    iget-short v0, p0, Ll/ۖܺ᩵;->ᩳ:S

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܿ(I)V

    .line 28
    iget-byte v0, p0, Ll/ۖܺ᩵;->֫:B

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܳ(I)V

    .line 29
    iget-byte v0, p0, Ll/ۖܺ᩵;->ۧ:B

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܳ(I)V

    .line 31
    iget v0, p1, Ll/۬ܺ᩵;->ܽ:I

    const/4 v1, 0x6

    .line 32
    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->֫(I)V

    .line 34
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ܽ(I)Ll/۬ܺ᩵;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 36
    iget-object v2, p0, Ll/ۖܺ᩵;->ܽ:[B

    aget-byte v2, v2, v0

    invoke-virtual {p1, v2}, Ll/۬ܺ᩵;->ܳ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
