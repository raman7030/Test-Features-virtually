.class public final Ll/ᩳ֨֫;
.super Ljava/lang/Object;
.source "Q8SP"


# static fields
.field public static final ܳ:Ll/ۛ۬ܺ;

.field public static final ܿ:[C

.field public static final ᩳ:[C


# instance fields
.field public ֫:[B

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [C

    .line 45
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳ֨֫;->ᩳ:[C

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput-char v1, v0, v2

    .line 46
    sput-object v0, Ll/ᩳ֨֫;->ܿ:[C

    .line 47
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 48
    invoke-static {}, Ll/ۛ۬ܺ;->᩷()Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ᩳ֨֫;->ܳ:Ll/ۛ۬ܺ;

    return-void

    nop

    :array_0
    .array-data 2
        0xds
        0xas
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    sget-object v0, Ll/ۘ֨֫;->ܿ:[B

    iput-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    new-array v0, p1, [B

    iput-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    .line 72
    iput p1, p0, Ll/ᩳ֨֫;->ۧ:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    .line 82
    array-length p1, p1

    iput p1, p0, Ll/ᩳ֨֫;->ۧ:I

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    .line 93
    iput p2, p0, Ll/ᩳ֨֫;->ۧ:I

    return-void
.end method

.method private ֫(ILjava/nio/ByteOrder;)C
    .locals 1

    .line 283
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne p2, v0, :cond_0

    .line 284
    iget-object p2, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, p1

    aget-byte p1, p2, v0

    add-int/lit8 v0, v0, 0x1

    aget-byte p2, p2, v0

    goto :goto_0

    .line 285
    :cond_0
    iget-object p2, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, p1

    add-int/lit8 p1, v0, 0x1

    aget-byte p1, p2, p1

    aget-byte p2, p2, v0

    :goto_0
    shl-int/lit8 p1, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    or-int/2addr p1, p2

    int-to-char p1, p1

    return p1
.end method

.method private ֫(Ljava/nio/charset/Charset;[C)C
    .locals 9

    .line 775
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    invoke-static {p1}, Ll/ᩳ֨֫;->ܽ(Ljava/nio/charset/Charset;)I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    goto :goto_3

    .line 778
    :cond_0
    invoke-direct {p0, p1}, Ll/ᩳ֨֫;->ᩳ(Ljava/nio/charset/Charset;)I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    ushr-int/lit8 v0, p1, 0x8

    int-to-long v0, v0

    const/16 v3, 0x20

    shr-long v3, v0, v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    cmp-long v8, v3, v5

    if-nez v8, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    const-string v4, "out of range: %s"

    .line 94
    invoke-static {v0, v1, v4, v3}, Ll/ۘܶܺ;->֫(JLjava/lang/String;Z)V

    long-to-int v1, v0

    .line 784
    invoke-static {v1}, Ljava/lang/Character;->isSupplementaryCodePoint(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    int-to-long v0, v1

    long-to-int v3, v0

    int-to-char v3, v3

    int-to-long v4, v3

    cmp-long v6, v4, v0

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v7, 0x0

    :goto_1
    const-string v4, "Out of range: %s"

    .line 87
    invoke-static {v0, v1, v4, v7}, Ll/ۘܶܺ;->֫(JLjava/lang/String;Z)V

    .line 134
    array-length v0, p2

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_6

    aget-char v4, p2, v1

    if-ne v4, v3, :cond_5

    .line 789
    iget p2, p0, Ll/ᩳ֨֫;->ܽ:I

    and-int/lit16 p1, p1, 0xff

    int-to-long v0, p1

    invoke-static {v0, v1}, Ll/۬᩺ܺ;->֫(J)I

    move-result p1

    add-int/2addr p1, p2

    iput p1, p0, Ll/ᩳ֨֫;->ܽ:I

    return v3

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    return v2
.end method

.method public static ֫(IIII)I
    .locals 2

    and-int/lit8 p0, p0, 0x7

    shl-int/lit8 p0, p0, 0x2

    and-int/lit8 v0, p1, 0x30

    shr-int/lit8 v0, v0, 0x4

    or-int/2addr p0, v0

    int-to-long v0, p0

    .line 908
    invoke-static {v0, v1}, Ll/ۨ᩺ܺ;->֫(J)B

    move-result p0

    int-to-byte p1, p1

    and-int/lit8 p1, p1, 0xf

    shl-int/lit8 p1, p1, 0x4

    int-to-byte p2, p2

    and-int/lit8 v0, p2, 0x3c

    shr-int/lit8 v0, v0, 0x2

    or-int/2addr p1, v0

    int-to-long v0, p1

    .line 909
    invoke-static {v0, v1}, Ll/ۨ᩺ܺ;->֫(J)B

    move-result p1

    and-int/lit8 p2, p2, 0x3

    shl-int/lit8 p2, p2, 0x6

    int-to-byte p3, p3

    and-int/lit8 p3, p3, 0x3f

    or-int/2addr p2, p3

    int-to-long p2, p2

    .line 910
    invoke-static {p2, p3}, Ll/ۨ᩺ܺ;->֫(J)B

    move-result p2

    const/4 p3, 0x0

    .line 906
    invoke-static {p3, p0, p1, p2}, Ll/۬᩺ܺ;->֫(BBBB)I

    move-result p0

    return p0
.end method

.method public static ֫(B)Z
    .locals 1

    and-int/lit16 p0, p0, 0xc0

    const/16 v0, 0x80

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/nio/charset/Charset;)I
    .locals 3

    .line 866
    sget-object v0, Ll/ᩳ֨֫;->ܳ:Ll/ۛ۬ܺ;

    .line 867
    invoke-virtual {v0, p0}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported charset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 866
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 868
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ᩳ(Ljava/nio/charset/Charset;)I
    .locals 7

    .line 810
    sget-object v0, Ll/ᩳ֨֫;->ܳ:Ll/ۛ۬ܺ;

    .line 811
    invoke-virtual {v0, p1}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported charset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 810
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 812
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    invoke-static {p1}, Ll/ᩳ֨֫;->ܽ(Ljava/nio/charset/Charset;)I

    move-result v1

    if-lt v0, v1, :cond_d

    .line 817
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 818
    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte p1, p1, v0

    and-int/lit16 v0, p1, 0x80

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    and-int/lit16 p1, p1, 0xff

    goto/16 :goto_5

    .line 823
    :cond_1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eqz v0, :cond_a

    .line 878
    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte p1, p1, v0

    and-int/lit16 v0, p1, 0x80

    const/4 v5, 0x3

    if-nez v0, :cond_2

    const/4 p1, 0x1

    goto/16 :goto_0

    :cond_2
    const/16 v0, 0xe0

    and-int/2addr p1, v0

    const/16 v6, 0xc0

    if-ne p1, v6, :cond_3

    .line 881
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lt p1, v4, :cond_3

    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v6, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v6, v1

    aget-byte p1, p1, v6

    .line 882
    invoke-static {p1}, Ll/ᩳ֨֫;->֫(B)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    .line 884
    :cond_3
    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v6, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte p1, p1, v6

    const/16 v6, 0xf0

    and-int/2addr p1, v6

    if-ne p1, v0, :cond_4

    .line 885
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lt p1, v5, :cond_4

    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, v1

    aget-byte p1, p1, v0

    .line 886
    invoke-static {p1}, Ll/ᩳ֨֫;->֫(B)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, v4

    aget-byte p1, p1, v0

    .line 887
    invoke-static {p1}, Ll/ᩳ֨֫;->֫(B)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    goto :goto_0

    .line 889
    :cond_4
    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xf8

    if-ne p1, v6, :cond_5

    .line 890
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    if-lt p1, v3, :cond_5

    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, v1

    aget-byte p1, p1, v0

    .line 891
    invoke-static {p1}, Ll/ᩳ֨֫;->֫(B)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, v4

    aget-byte p1, p1, v0

    .line 892
    invoke-static {p1}, Ll/ᩳ֨֫;->֫(B)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, v5

    aget-byte p1, p1, v0

    .line 893
    invoke-static {p1}, Ll/ᩳ֨֫;->֫(B)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x4

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    if-eq p1, v1, :cond_9

    if-eq p1, v4, :cond_8

    if-eq p1, v5, :cond_7

    if-eq p1, v3, :cond_6

    :goto_1
    return v2

    .line 839
    :cond_6
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v1

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v0, v3

    add-int/lit8 v4, v1, 0x2

    aget-byte v4, v0, v4

    add-int/2addr v1, v5

    aget-byte v0, v0, v1

    .line 840
    invoke-static {v2, v3, v4, v0}, Ll/ᩳ֨֫;->֫(IIII)I

    move-result v0

    goto :goto_2

    .line 833
    :cond_7
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit8 v3, v3, 0xf

    add-int/lit8 v5, v1, 0x1

    .line 834
    aget-byte v5, v0, v5

    add-int/2addr v1, v4

    aget-byte v0, v0, v1

    .line 835
    invoke-static {v2, v3, v5, v0}, Ll/ᩳ֨֫;->֫(IIII)I

    move-result v0

    goto :goto_2

    .line 830
    :cond_8
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v3, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v4, v0, v3

    add-int/2addr v3, v1

    aget-byte v0, v0, v3

    invoke-static {v2, v2, v4, v0}, Ll/ᩳ֨֫;->֫(IIII)I

    move-result v0

    goto :goto_2

    .line 827
    :cond_9
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    :goto_2
    move v1, p1

    goto :goto_4

    .line 849
    :cond_a
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    goto :goto_3

    :cond_b
    sget-object p1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 850
    :goto_3
    invoke-direct {p0, v2, p1}, Ll/ᩳ֨֫;->֫(ILjava/nio/ByteOrder;)C

    move-result v0

    .line 851
    invoke-static {v0}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v1

    if-lt v1, v3, :cond_c

    .line 852
    invoke-direct {p0, v4, p1}, Ll/ᩳ֨֫;->֫(ILjava/nio/ByteOrder;)C

    move-result p1

    .line 853
    invoke-static {v0, p1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result p1

    const/4 v1, 0x4

    goto :goto_5

    :cond_c
    const/4 v1, 0x2

    :goto_4
    move p1, v0

    :goto_5
    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p1, v1

    return p1

    .line 813
    :cond_d
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "position="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ᩳ֨֫;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֡()S
    .locals 4

    .line 338
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v3

    int-to-short v0, v0

    return v0
.end method

.method public final ֨()I
    .locals 3

    .line 323
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ֫()I
    .locals 2

    .line 145
    iget v0, p0, Ll/ᩳ֨֫;->ۧ:I

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/nio/charset/Charset;)I
    .locals 2

    .line 317
    invoke-direct {p0, p1}, Ll/ᩳ֨֫;->ᩳ(Ljava/nio/charset/Charset;)I

    move-result p1

    if-eqz p1, :cond_0

    ushr-int/lit8 p1, p1, 0x8

    int-to-long v0, p1

    .line 318
    invoke-static {v0, v1}, Ll/۬᩺ܺ;->֫(J)I

    move-result p1

    return p1

    :cond_0
    const/high16 p1, 0x110000

    return p1
.end method

.method public final ֫(ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    .line 521
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v2, p0, Ll/ᩳ֨֫;->ܽ:I

    invoke-direct {v0, v1, v2, p1, p2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 522
    iget p2, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ᩳ֨֫;->ܽ:I

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 195
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    array-length v1, v0

    if-le p1, v1, :cond_0

    .line 139
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ֨֫;->֫:[B

    :cond_0
    return-void
.end method

.method public final ֫(II[B)V
    .locals 2

    .line 230
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    invoke-static {v0, v1, p3, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 231
    iget p1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/ᩳ֨֫;->ܽ:I

    return-void
.end method

.method public final ֫(I[B)V
    .locals 0

    .line 123
    iput-object p2, p0, Ll/ᩳ֨֫;->֫:[B

    .line 124
    iput p1, p0, Ll/ᩳ֨֫;->ۧ:I

    const/4 p1, 0x0

    .line 125
    iput p1, p0, Ll/ᩳ֨֫;->ܽ:I

    return-void
.end method

.method public final ۖ()I
    .locals 3

    .line 473
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 475
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Top bit not zero: "

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 475
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۗ()I
    .locals 4

    .line 328
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v3

    return v0
.end method

.method public final ۘ()I
    .locals 4

    .line 333
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    return v0
.end method

.method public final ۙ()J
    .locals 5

    .line 486
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ᩴ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    return-wide v0

    .line 488
    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Top bit not zero: "

    .line 0
    invoke-static {v0, v1, v3}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 488
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ۚ()I
    .locals 4

    .line 446
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    .line 447
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v1

    .line 448
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    .line 449
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v3

    shl-int/lit8 v0, v0, 0x15

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x7

    or-int/2addr v0, v1

    or-int/2addr v0, v3

    return v0
.end method

.method public final ۜ()I
    .locals 5

    .line 355
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    shr-int/lit8 v3, v3, 0x8

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x3

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0
.end method

.method public final ۠()I
    .locals 5

    .line 432
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v3

    add-int/lit8 v1, v1, 0x4

    .line 433
    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    return v0
.end method

.method public final ۡ()S
    .locals 4

    .line 343
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    int-to-short v0, v0

    return v0
.end method

.method public final ۢ()J
    .locals 11

    .line 420
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x8

    shl-long/2addr v8, v2

    or-long/2addr v3, v8

    add-int/lit8 v8, v1, 0x3

    iput v8, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v9, v7

    and-long/2addr v9, v5

    const/16 v7, 0x10

    shl-long/2addr v9, v7

    or-long/2addr v3, v9

    add-int/lit8 v7, v1, 0x4

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v10, 0x18

    shl-long/2addr v8, v10

    or-long/2addr v3, v8

    add-int/lit8 v8, v1, 0x5

    iput v8, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v9, v7

    and-long/2addr v9, v5

    const/16 v7, 0x20

    shl-long/2addr v9, v7

    or-long/2addr v3, v9

    add-int/lit8 v7, v1, 0x6

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v8, v0, v8

    int-to-long v8, v8

    and-long/2addr v8, v5

    const/16 v10, 0x28

    shl-long/2addr v8, v10

    or-long/2addr v3, v8

    add-int/lit8 v8, v1, 0x7

    iput v8, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v9, v7

    and-long/2addr v9, v5

    const/16 v7, 0x30

    shl-long/2addr v9, v7

    or-long/2addr v3, v9

    add-int/2addr v1, v2

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v8

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v2, 0x38

    shl-long/2addr v0, v2

    or-long/2addr v0, v3

    return-wide v0
.end method

.method public final ۧ()I
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    array-length v0, v0

    return v0
.end method

.method public final ۧ(I)Ljava/lang/String;
    .locals 5

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    .line 538
    :cond_0
    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int v1, v0, p1

    add-int/lit8 v1, v1, -0x1

    .line 539
    iget v2, p0, Ll/ᩳ֨֫;->ۧ:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ll/ᩳ֨֫;->֫:[B

    aget-byte v1, v2, v1

    if-nez v1, :cond_1

    add-int/lit8 v1, p1, -0x1

    goto :goto_0

    :cond_1
    move v1, p1

    .line 542
    :goto_0
    iget-object v2, p0, Ll/ᩳ֨֫;->֫:[B

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1065
    new-instance v3, Ljava/lang/String;

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v0, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 543
    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ᩳ֨֫;->ܽ:I

    return-object v3
.end method

.method public final ۧ(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 4

    .line 609
    sget-object v0, Ll/ᩳ֨֫;->ܳ:Ll/ۛ۬ܺ;

    .line 610
    invoke-virtual {v0, p1}, Ll/᩺ۗܺ;->contains(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported charset: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 609
    invoke-static {v1, v0}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 611
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 614
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 615
    invoke-virtual {p0}, Ll/ᩳ֨֫;->۫()Ljava/nio/charset/Charset;

    .line 732
    :cond_1
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 734
    :cond_2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    .line 735
    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 736
    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 739
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    const/4 v0, 0x2

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v0, 0x1

    .line 741
    :goto_2
    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    :goto_3
    iget v2, p0, Ll/ᩳ֨֫;->ۧ:I

    add-int/lit8 v3, v0, -0x1

    sub-int v3, v2, v3

    if-ge v1, v3, :cond_b

    .line 742
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    iget-object v2, p0, Ll/ᩳ֨֫;->֫:[B

    aget-byte v2, v2, v1

    .line 743
    invoke-static {v2}, Ll/ۘ֨֫;->᩷(I)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    .line 745
    :cond_7
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    .line 746
    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    iget-object v2, p0, Ll/ᩳ֨֫;->֫:[B

    aget-byte v3, v2, v1

    if-nez v3, :cond_9

    add-int/lit8 v3, v1, 0x1

    aget-byte v2, v2, v3

    .line 748
    invoke-static {v2}, Ll/ۘ֨֫;->᩷(I)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_4

    .line 750
    :cond_9
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, p0, Ll/ᩳ֨֫;->֫:[B

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v2, v3

    if-nez v3, :cond_a

    aget-byte v2, v2, v1

    .line 752
    invoke-static {v2}, Ll/ۘ֨֫;->᩷(I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_4

    :cond_a
    add-int/2addr v1, v0

    goto :goto_3

    :cond_b
    move v1, v2

    .line 618
    :goto_4
    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1, p1}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    .line 619
    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    iget v2, p0, Ll/ᩳ֨֫;->ۧ:I

    if-ne v1, v2, :cond_c

    goto :goto_5

    .line 760
    :cond_c
    sget-object v1, Ll/ᩳ֨֫;->ᩳ:[C

    invoke-direct {p0, p1, v1}, Ll/ᩳ֨֫;->֫(Ljava/nio/charset/Charset;[C)C

    move-result v1

    const/16 v2, 0xd

    if-ne v1, v2, :cond_d

    .line 761
    sget-object v1, Ll/ᩳ֨֫;->ܿ:[C

    invoke-direct {p0, p1, v1}, Ll/ᩳ֨֫;->֫(Ljava/nio/charset/Charset;[C)C

    :cond_d
    :goto_5
    return-object v0
.end method

.method public final ۫()Ljava/nio/charset/Charset;
    .locals 7

    .line 709
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v2

    const/16 v4, -0x11

    if-ne v3, v4, :cond_0

    add-int/lit8 v3, v2, 0x1

    aget-byte v3, v0, v3

    const/16 v4, -0x45

    if-ne v3, v4, :cond_0

    add-int/lit8 v3, v2, 0x2

    aget-byte v0, v0, v3

    const/16 v3, -0x41

    if-ne v0, v3, :cond_0

    add-int/2addr v2, v1

    .line 713
    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    .line 714
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    return-object v0

    .line 715
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 716
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v2

    const/4 v4, -0x1

    const/4 v5, -0x2

    if-ne v3, v5, :cond_1

    add-int/lit8 v6, v2, 0x1

    aget-byte v6, v0, v6

    if-ne v6, v4, :cond_1

    add-int/2addr v2, v1

    .line 717
    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    .line 718
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16BE:Ljava/nio/charset/Charset;

    return-object v0

    :cond_1
    if-ne v3, v4, :cond_2

    add-int/lit8 v3, v2, 0x1

    .line 719
    aget-byte v0, v0, v3

    if-ne v0, v5, :cond_2

    add-int/2addr v2, v1

    .line 720
    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    .line 721
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16LE:Ljava/nio/charset/Charset;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۬()J
    .locals 12

    .line 634
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v1

    int-to-long v0, v0

    const/4 v2, 0x7

    const/4 v3, 0x7

    :goto_0
    const/4 v4, 0x6

    const/4 v5, 0x1

    if-ltz v3, :cond_2

    shl-int v6, v5, v3

    int-to-long v7, v6

    and-long/2addr v7, v0

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-nez v11, :cond_1

    if-ge v3, v4, :cond_0

    sub-int/2addr v6, v5

    int-to-long v6, v6

    and-long/2addr v0, v6

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_0
    if-ne v3, v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    :goto_2
    if-ge v5, v2, :cond_4

    .line 651
    iget-object v3, p0, Ll/ᩳ֨֫;->֫:[B

    iget v6, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v6, v5

    aget-byte v3, v3, v6

    and-int/lit16 v6, v3, 0xc0

    const/16 v7, 0x80

    if-ne v6, v7, :cond_3

    shl-long/2addr v0, v4

    and-int/lit8 v3, v3, 0x3f

    int-to-long v6, v3

    or-long/2addr v0, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 653
    :cond_3
    new-instance v2, Ljava/lang/NumberFormatException;

    const-string v3, "Invalid UTF-8 sequence continuation byte: "

    .line 0
    invoke-static {v0, v1, v3}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 653
    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 657
    :cond_4
    iget v3, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ᩳ֨֫;->ܽ:I

    return-wide v0

    .line 648
    :cond_5
    new-instance v2, Ljava/lang/NumberFormatException;

    const-string v3, "Invalid UTF-8 sequence first byte: "

    .line 0
    invoke-static {v0, v1, v3}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 648
    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final ܳ()I
    .locals 2

    .line 248
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ܳ(I)V
    .locals 1

    .line 206
    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܿ(I)V

    return-void
.end method

.method public final ܶ()J
    .locals 10

    .line 376
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x18

    shl-long/2addr v3, v7

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x10

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v1, 0x3

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x8

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v4

    int-to-long v0, v0

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܺ()J
    .locals 10

    .line 384
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x8

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v1, 0x3

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x10

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v4

    int-to-long v0, v0

    and-long/2addr v0, v5

    const/16 v4, 0x18

    shl-long/2addr v0, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ܽ(I)V
    .locals 2

    .line 195
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    array-length v1, v0

    if-ge v1, p1, :cond_0

    .line 103
    new-array v0, p1, [B

    :cond_0
    invoke-virtual {p0, p1, v0}, Ll/ᩳ֨֫;->֫(I[B)V

    return-void
.end method

.method public final ܽ()[B
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 150
    iget v0, p0, Ll/ᩳ֨֫;->ۧ:I

    return v0
.end method

.method public final ܿ(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 177
    iget v0, p0, Ll/ᩳ֨֫;->ۧ:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 178
    iput p1, p0, Ll/ᩳ֨֫;->ܽ:I

    return-void
.end method

.method public final ᩳ()I
    .locals 1

    .line 165
    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    return v0
.end method

.method public final ᩳ(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 159
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    array-length v0, v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 160
    iput p1, p0, Ll/ᩳ֨֫;->ۧ:I

    return-void
.end method

.method public final ᩴ()J
    .locals 10

    .line 408
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v7, 0x38

    shl-long/2addr v3, v7

    add-int/lit8 v7, v1, 0x2

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    int-to-long v8, v2

    and-long/2addr v8, v5

    const/16 v2, 0x30

    shl-long/2addr v8, v2

    or-long v2, v3, v8

    add-int/lit8 v4, v1, 0x3

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x28

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v7, v1, 0x4

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v4, v0, v4

    int-to-long v8, v4

    and-long/2addr v8, v5

    const/16 v4, 0x20

    shl-long/2addr v8, v4

    or-long/2addr v2, v8

    add-int/lit8 v4, v1, 0x5

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x18

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/lit8 v7, v1, 0x6

    iput v7, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v4, v0, v4

    int-to-long v8, v4

    and-long/2addr v8, v5

    const/16 v4, 0x10

    shl-long/2addr v8, v4

    or-long/2addr v2, v8

    add-int/lit8 v4, v1, 0x7

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v7, v0, v7

    int-to-long v7, v7

    and-long/2addr v7, v5

    const/16 v9, 0x8

    shl-long/2addr v7, v9

    or-long/2addr v2, v7

    add-int/2addr v1, v9

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v4

    int-to-long v0, v0

    and-long/2addr v0, v5

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 6

    .line 566
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 569
    :cond_0
    iget v0, p0, Ll/ᩳ֨֫;->ܽ:I

    .line 570
    :goto_0
    iget v1, p0, Ll/ᩳ֨֫;->ۧ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ll/ᩳ֨֫;->֫:[B

    aget-byte v1, v1, v0

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 573
    :cond_1
    iget-object v1, p0, Ll/ᩳ֨֫;->֫:[B

    iget v2, p0, Ll/ᩳ֨֫;->ܽ:I

    sub-int v3, v0, v2

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 1065
    new-instance v4, Ljava/lang/String;

    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v1, v2, v3, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 574
    iput v0, p0, Ll/ᩳ֨֫;->ܽ:I

    .line 575
    iget v1, p0, Ll/ᩳ֨֫;->ۧ:I

    if-ge v0, v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 576
    iput v0, p0, Ll/ᩳ֨֫;->ܽ:I

    :cond_2
    return-object v4
.end method

.method public final ᩶()I
    .locals 10

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move-wide v3, v0

    :goto_0
    const/16 v5, 0x9

    if-ge v2, v5, :cond_2

    .line 674
    iget v5, p0, Ll/ᩳ֨֫;->ܽ:I

    iget v6, p0, Ll/ᩳ֨֫;->ۧ:I

    if-eq v5, v6, :cond_1

    .line 677
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result v5

    int-to-long v5, v5

    const-wide/16 v7, 0x7f

    and-long/2addr v7, v5

    mul-int/lit8 v9, v2, 0x7

    shl-long/2addr v7, v9

    or-long/2addr v3, v7

    const-wide/16 v7, 0x80

    and-long/2addr v5, v7

    cmp-long v7, v5, v0

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 675
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to read a byte over the limit."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 695
    :cond_2
    :goto_1
    invoke-static {v3, v4}, Ll/۬᩺ܺ;->֫(J)I

    move-result v0

    return v0
.end method

.method public final ᩷()I
    .locals 5

    .line 400
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x3

    iput v3, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v2

    return v0
.end method

.method public final ᩸()I
    .locals 5

    .line 348
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x3

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0
.end method

.method public final ᩹()I
    .locals 3

    .line 459
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩻()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 461
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Top bit not zero: "

    .line 0
    invoke-static {v0, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 461
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ᩻()I
    .locals 5

    .line 392
    iget-object v0, p0, Ll/ᩳ֨֫;->֫:[B

    iget v1, p0, Ll/ᩳ֨֫;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    add-int/lit8 v4, v1, 0x2

    iput v4, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v2, v3

    add-int/lit8 v3, v1, 0x3

    iput v3, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ᩳ֨֫;->ܽ:I

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v2

    return v0
.end method
