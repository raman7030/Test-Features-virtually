.class public final Ll/ܿܰۖ;
.super Ll/᩻ܰۖ;
.source "Q9I3"


# instance fields
.field public ۜ:[B

.field public ۢ:[B

.field public ܳ:[B

.field public ܿ:[B

.field public ᩳ:[B

.field public ᩷:[B

.field public ᩻:[B


# direct methods
.method public constructor <init>([B[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/util/AbstractSet;Ll/᩵ܰۖ;)V
    .locals 0

    .line 49
    invoke-direct {p0, p7, p8}, Ll/᩻ܰۖ;-><init>(Ljava/util/Set;Ll/᩵ܰۖ;)V

    .line 41
    sget-object p8, Ll/ܺܰۖ;->֫:[B

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p8

    .line 50
    :goto_0
    iput-object p1, p0, Ll/ܿܰۖ;->ܳ:[B

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, p8

    .line 51
    :goto_1
    iput-object p2, p0, Ll/ܿܰۖ;->ۜ:[B

    if-eqz p3, :cond_2

    .line 48
    sget-object p1, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p3, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, p8

    .line 52
    :goto_2
    iput-object p1, p0, Ll/ܿܰۖ;->᩷:[B

    if-eqz p4, :cond_3

    .line 48
    sget-object p1, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p4, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, p8

    .line 53
    :goto_3
    iput-object p1, p0, Ll/ܿܰۖ;->ᩳ:[B

    if-eqz p5, :cond_4

    .line 48
    sget-object p1, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p5, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    goto :goto_4

    :cond_4
    move-object p1, p8

    .line 54
    :goto_4
    iput-object p1, p0, Ll/ܿܰۖ;->ۢ:[B

    if-eqz p6, :cond_5

    goto :goto_5

    :cond_5
    move-object p6, p8

    .line 55
    :goto_5
    iput-object p6, p0, Ll/ܿܰۖ;->ܿ:[B

    .line 56
    iput-object p7, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NtlmAuthenticate{\n  mic="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    iget-object v1, p0, Ll/ܿܰۖ;->᩻:[B

    if-eqz v1, :cond_0

    invoke-static {v1}, Ll/֨ܰۖ;->֫([B)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "[]"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  lmResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿܰۖ;->ܳ:[B

    .line 132
    invoke-static {v1}, Ll/֨ܰۖ;->֫([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  ntResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿܰۖ;->ۜ:[B

    .line 133
    invoke-static {v1}, Ll/֨ܰۖ;->֫([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n  domainName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ""

    .line 52
    iget-object v2, p0, Ll/ܿܰۖ;->ᩳ:[B

    if-eqz v2, :cond_1

    new-instance v3, Ljava/lang/String;

    sget-object v4, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_1

    .line 134
    :cond_1
    sget-object v2, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    move-object v3, v1

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\',\n  userName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    iget-object v2, p0, Ll/ܿܰۖ;->᩷:[B

    if-eqz v2, :cond_2

    new-instance v3, Ljava/lang/String;

    sget-object v4, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v3, v2, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_2

    :cond_2
    move-object v3, v1

    .line 135
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\',\n  workstation=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    iget-object v2, p0, Ll/ܿܰۖ;->ۢ:[B

    if-eqz v2, :cond_3

    new-instance v1, Ljava/lang/String;

    sget-object v3, Ll/ܽܰۖ;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    :cond_3
    const-string v2, "\',\n  encryptedRandomSessionKey=[<secret>],\n}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۫ܰۖ;)V
    .locals 10

    const-string v0, "NTLMSSP\u0000"

    .line 75
    sget-object v1, Ll/۠ܰۖ;->ܿ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    const-wide/16 v0, 0x3

    .line 76
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(J)V

    .line 61
    iget-object v0, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    sget-object v1, Ll/᩷ܰۖ;->ܳ֫:Ll/᩷ܰۖ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܿܰۖ;->᩻:[B

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x40

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v0, 0x48

    .line 65
    :goto_1
    iget-object v2, p0, Ll/ܿܰۖ;->᩻:[B

    if-eqz v2, :cond_2

    add-int/lit8 v0, v0, 0x10

    .line 79
    :cond_2
    iget-object v2, p0, Ll/ܿܰۖ;->ܳ:[B

    invoke-static {p1, v2, v0}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    move-result v0

    .line 80
    iget-object v3, p0, Ll/ܿܰۖ;->ۜ:[B

    invoke-static {p1, v3, v0}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    move-result v0

    .line 81
    iget-object v4, p0, Ll/ܿܰۖ;->ᩳ:[B

    invoke-static {p1, v4, v0}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    move-result v0

    .line 82
    iget-object v5, p0, Ll/ܿܰۖ;->᩷:[B

    invoke-static {p1, v5, v0}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    move-result v0

    .line 83
    iget-object v6, p0, Ll/ܿܰۖ;->ۢ:[B

    invoke-static {p1, v6, v0}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    move-result v0

    .line 84
    iget-object v7, p0, Ll/ܿܰۖ;->ܿ:[B

    invoke-static {p1, v7, v0}, Ll/ܺܰۖ;->֫(Ll/۫ܰۖ;[BI)I

    .line 86
    iget-object v0, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    invoke-static {v0}, Ll/ܶܰۖ;->֫(Ljava/util/Collection;)J

    move-result-wide v8

    invoke-virtual {p1, v8, v9}, Ll/ۤܰۖ;->ۧ(J)V

    .line 88
    iget-object v0, p0, Ll/᩻ܰۖ;->֫:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 117
    new-instance v0, Ll/۫ܰۖ;

    .line 42
    invoke-direct {v0}, Ll/ۤܰۖ;-><init>()V

    const/4 v1, 0x6

    .line 118
    invoke-virtual {v0, v1}, Ll/ۤܰۖ;->֫(B)V

    const/4 v1, 0x1

    .line 119
    invoke-virtual {v0, v1}, Ll/ۤܰۖ;->֫(B)V

    const/16 v1, 0x1db0

    .line 120
    invoke-virtual {v0, v1}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v1, 0x3

    new-array v8, v1, [B

    .line 121
    fill-array-data v8, :array_0

    .line 318
    invoke-virtual {v0, v1, v8}, Ll/ۤܰۖ;->֫(I[B)V

    const/16 v1, 0xf

    .line 123
    invoke-virtual {v0, v1}, Ll/ۤܰۖ;->֫(B)V

    .line 124
    invoke-virtual {v0}, Ll/ۤܰۖ;->ᩳ()[B

    move-result-object v0

    .line 318
    array-length v1, v0

    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    goto :goto_2

    .line 90
    :cond_3
    iget-object v0, p0, Ll/ܿܰۖ;->᩻:[B

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x0

    .line 91
    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ܽ(J)V

    .line 94
    :cond_4
    :goto_2
    iget-object v0, p0, Ll/ܿܰۖ;->᩻:[B

    if-eqz v0, :cond_5

    const/16 v1, 0x10

    .line 95
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    .line 318
    :cond_5
    array-length v0, v2

    invoke-virtual {p1, v0, v2}, Ll/ۤܰۖ;->֫(I[B)V

    array-length v0, v3

    invoke-virtual {p1, v0, v3}, Ll/ۤܰۖ;->֫(I[B)V

    array-length v0, v4

    invoke-virtual {p1, v0, v4}, Ll/ۤܰۖ;->֫(I[B)V

    array-length v0, v5

    invoke-virtual {p1, v0, v5}, Ll/ۤܰۖ;->֫(I[B)V

    array-length v0, v6

    invoke-virtual {p1, v0, v6}, Ll/ۤܰۖ;->֫(I[B)V

    array-length v0, v7

    invoke-virtual {p1, v0, v7}, Ll/ۤܰۖ;->֫(I[B)V

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public final ֫([B)V
    .locals 0

    .line 108
    iput-object p1, p0, Ll/ܿܰۖ;->᩻:[B

    return-void
.end method
