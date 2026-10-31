.class public Ll/ۘ᩷ۘ;
.super Ljava/lang/Object;
.source "27XL"


# static fields
.field public static final ܿ:[[B


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:[B

.field public ܽ:Ljava/lang/String;

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 34
    sget-object v0, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "ssh-dss"

    invoke-static {v1, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "ssh-rsa"

    invoke-static {v2, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "ecdsa-sha2-nistp256"

    invoke-static {v3, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v4, "ecdsa-sha2-nistp384"

    invoke-static {v4, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const-string v5, "ecdsa-sha2-nistp521"

    invoke-static {v5, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v5

    const-string v6, "ssh-ed25519"

    invoke-static {v6, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v6

    const-string v7, "ssh-ed448"

    invoke-static {v7, v0}, Ll/᩵ۡۘ;->֫(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v7, 0x7

    new-array v7, v7, [[B

    const/4 v8, 0x0

    aput-object v1, v7, v8

    const/4 v1, 0x1

    aput-object v2, v7, v1

    const/4 v1, 0x2

    aput-object v3, v7, v1

    const/4 v1, 0x3

    aput-object v4, v7, v1

    const/4 v1, 0x4

    aput-object v5, v7, v1

    const/4 v1, 0x5

    aput-object v6, v7, v1

    const/4 v1, 0x6

    aput-object v0, v7, v1

    .line 36
    sput-object v7, Ll/ۘ᩷ۘ;->ܿ:[[B

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p2, p0, Ll/ۘ᩷ۘ;->ܽ:Ljava/lang/String;

    .line 69
    iput-object p3, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    if-nez p1, :cond_7

    const/16 p1, 0x8

    .line 71
    aget-byte p1, p5, p1

    const/16 p2, 0x64

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    .line 72
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    :cond_0
    const/16 p2, 0x72

    if-ne p1, p2, :cond_1

    const/4 p1, 0x2

    .line 74
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    :cond_1
    const/16 p2, 0x32

    const/16 p3, 0xa

    const/16 p4, 0x65

    if-ne p1, p4, :cond_2

    .line 75
    aget-byte v0, p5, p3

    if-ne v0, p2, :cond_2

    const/4 p1, 0x6

    .line 76
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    :cond_2
    if-ne p1, p4, :cond_3

    .line 77
    aget-byte p3, p5, p3

    const/16 p4, 0x34

    if-ne p3, p4, :cond_3

    const/4 p1, 0x7

    .line 78
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    :cond_3
    const/16 p3, 0x14

    const/16 p4, 0x61

    if-ne p1, p4, :cond_4

    .line 79
    aget-byte v0, p5, p3

    if-ne v0, p2, :cond_4

    const/4 p1, 0x3

    .line 80
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    :cond_4
    if-ne p1, p4, :cond_5

    .line 81
    aget-byte p2, p5, p3

    const/16 v0, 0x33

    if-ne p2, v0, :cond_5

    const/4 p1, 0x4

    .line 82
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    :cond_5
    if-ne p1, p4, :cond_6

    .line 83
    aget-byte p1, p5, p3

    const/16 p2, 0x35

    if-ne p1, p2, :cond_6

    const/4 p1, 0x5

    .line 84
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    goto :goto_0

    .line 86
    :cond_6
    new-instance p1, Ll/۫᩷ۘ;

    const-string p2, "invalid key type"

    .line 39
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    throw p1

    .line 89
    :cond_7
    iput p1, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    .line 91
    :goto_0
    iput-object p5, p0, Ll/ۘ᩷ۘ;->ۧ:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[B)V
    .locals 6

    const/4 v4, 0x0

    const-string v2, ""

    move-object v0, p0

    move v1, p2

    move-object v3, p1

    move-object v5, p3

    .line 63
    invoke-direct/range {v0 .. v5}, Ll/ۘ᩷ۘ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 100
    iget v0, p0, Ll/ۘ᩷ۘ;->ᩳ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    const/4 v2, 0x7

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v2, 0x5

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "UNKNOWN"

    return-object v0

    .line 102
    :cond_1
    :goto_0
    sget-object v2, Ll/ۘ᩷ۘ;->ܿ:[[B

    sub-int/2addr v0, v1

    aget-object v0, v2, v0

    invoke-static {v0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 11

    .line 148
    iget-object v6, p0, Ll/ۘ᩷ۘ;->֫:Ljava/lang/String;

    .line 149
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    .line 150
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v7, :cond_3

    const/16 v0, 0x2c

    .line 153
    invoke-virtual {v6, v0, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v10

    const/4 v0, -0x1

    if-ne v10, v0, :cond_1

    sub-int/2addr v7, v2

    if-eq v8, v7, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, v6

    move-object v3, p1

    move v5, v8

    .line 157
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    return p1

    :cond_1
    sub-int v0, v10, v2

    if-ne v8, v0, :cond_2

    const/4 v1, 0x1

    const/4 v4, 0x0

    move-object v0, v6

    move-object v3, p1

    move v5, v8

    .line 160
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    add-int/lit8 v2, v10, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v9
.end method
