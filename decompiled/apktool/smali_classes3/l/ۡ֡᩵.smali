.class public abstract Ll/ۡ֡᩵;
.super Ljava/lang/Object;
.source "59W6"


# instance fields
.field public ֡:I

.field public ֨:I

.field public ֫:I

.field public ۖ:Z

.field public ۗ:I

.field public ۘ:I

.field public ۙ:I

.field public ۚ:Ll/ܽ֡᩵;

.field public ۜ:Z

.field public ۠:I

.field public ۡ:Z

.field public ۢ:Z

.field public ۧ:Ljava/net/InetAddress;

.field public ܳ:I

.field public ܶ:Z

.field public ܺ:Z

.field public ܽ:[Ll/ܺ֡᩵;

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:I

.field public ᩷:Z

.field public ᩸:I

.field public ᩹:Ll/ܽ֡᩵;

.field public ᩻:Ll/֨ۡ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Ll/ۡ֡᩵;->᩻:Ll/֨ۡ᩵;

    const/4 p1, 0x1

    .line 110
    iput-boolean p1, p0, Ll/ۡ֡᩵;->ۡ:Z

    .line 111
    iput-boolean p1, p0, Ll/ۡ֡᩵;->᩷:Z

    .line 112
    iput p1, p0, Ll/ۡ֡᩵;->֡:I

    .line 113
    iput p1, p0, Ll/ۡ֡᩵;->᩵:I

    return-void
.end method

.method public static ֫(II[B)V
    .locals 2

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 63
    aput-byte v1, p2, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    .line 64
    aput-byte p0, p2, v0

    return-void
.end method

.method public static ܳ(I[B)I
    .locals 2

    .line 82
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    add-int/2addr v0, p0

    return v0
.end method

.method public static ܿ(I[B)I
    .locals 1

    .line 77
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    add-int/2addr v0, p0

    return v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 12

    .line 262
    iget v0, p0, Ll/ۡ֡᩵;->ᩴ:I

    const/4 v1, 0x7

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    .line 270
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "WACK"

    goto :goto_0

    :cond_1
    const-string v0, "QUERY"

    .line 273
    :goto_0
    iget v2, p0, Ll/ۡ֡᩵;->ۙ:I

    const/4 v3, 0x2

    const-string v4, "0x"

    const/4 v5, 0x4

    const/4 v6, 0x1

    if-eq v2, v6, :cond_7

    if-eq v2, v3, :cond_6

    if-eq v2, v5, :cond_5

    const/4 v7, 0x5

    if-eq v2, v7, :cond_4

    const/4 v7, 0x6

    if-eq v2, v7, :cond_3

    if-eq v2, v1, :cond_2

    .line 293
    invoke-static {v2, v6}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const-string v1, "CFT_ERR"

    goto :goto_1

    :cond_3
    const-string v1, "ACT_ERR"

    goto :goto_1

    :cond_4
    const-string v1, "RFS_ERR"

    goto :goto_1

    :cond_5
    const-string v1, "IMP_ERR"

    goto :goto_1

    :cond_6
    const-string v1, "SRV_ERR"

    goto :goto_1

    :cond_7
    const-string v1, "FMT_ERR"

    .line 296
    :goto_1
    iget v2, p0, Ll/ۡ֡᩵;->֨:I

    const-string v7, "NB"

    const-string v8, "NBSTAT"

    const/16 v9, 0x21

    const/16 v10, 0x20

    if-eq v2, v10, :cond_9

    if-eq v2, v9, :cond_8

    .line 304
    invoke-static {v2, v5}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_8
    move-object v2, v8

    goto :goto_2

    :cond_9
    move-object v2, v7

    .line 307
    :goto_2
    iget v11, p0, Ll/ۡ֡᩵;->᩶:I

    if-eq v11, v6, :cond_d

    if-eq v11, v3, :cond_c

    const/16 v3, 0xa

    if-eq v11, v3, :cond_b

    if-eq v11, v10, :cond_e

    if-eq v11, v9, :cond_a

    .line 324
    invoke-static {v11, v5}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_a
    move-object v7, v8

    goto :goto_3

    :cond_b
    const-string v7, "NULL"

    goto :goto_3

    :cond_c
    const-string v7, "NS"

    goto :goto_3

    :cond_d
    const-string v7, "A"

    .line 328
    :cond_e
    :goto_3
    new-instance v3, Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "nameTrnId="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v9, p0, Ll/ۡ֡᩵;->ۘ:I

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ",isResponse="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v9, p0, Ll/ۡ֡᩵;->ܺ:Z

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ",opCode="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",isAuthAnswer="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۡ֡᩵;->ۜ:Z

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ",isTruncated="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۡ֡᩵;->ۖ:Z

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ",isRecurAvailable="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۡ֡᩵;->ۢ:Z

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ",isRecurDesired="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۡ֡᩵;->ۡ:Z

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ",isBroadcast="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۡ֡᩵;->᩷:Z

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ",resultCode="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",questionCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ֡᩵;->֡:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",answerCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ֡᩵;->ܿ:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",authorityCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ֡᩵;->ܳ:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",additionalCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ֡᩵;->֫:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",questionName="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ",questionType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",questionClass="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    iget v0, p0, Ll/ۡ֡᩵;->᩵:I

    const-string v1, "IN"

    if-ne v0, v6, :cond_f

    move-object v0, v1

    goto :goto_4

    :cond_f
    invoke-static {v0, v5}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",recordName="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۡ֡᩵;->᩹:Ll/ܽ֡᩵;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ",recordType="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",recordClass="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    iget v0, p0, Ll/ۡ֡᩵;->᩸:I

    if-ne v0, v6, :cond_10

    goto :goto_5

    :cond_10
    invoke-static {v0, v5}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_5
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",ttl="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ֡᩵;->ۗ:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",rDataLength="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ֡᩵;->۠:I

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v3
.end method

.method public abstract ֫(I[B)I
.end method

.method public final ֫([B)V
    .locals 4

    const/4 v0, 0x0

    .line 149
    invoke-static {v0, p1}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۡ֡᩵;->ۘ:I

    const/4 v1, 0x2

    .line 150
    aget-byte v1, p1, v1

    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    iput-boolean v2, p0, Ll/ۡ֡᩵;->ܺ:Z

    and-int/lit8 v2, v1, 0x78

    const/4 v3, 0x3

    shr-int/2addr v2, v3

    .line 151
    iput v2, p0, Ll/ۡ֡᩵;->ᩴ:I

    and-int/lit8 v2, v1, 0x4

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    .line 152
    :goto_1
    iput-boolean v2, p0, Ll/ۡ֡᩵;->ۜ:Z

    and-int/lit8 v2, v1, 0x2

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    const/4 v2, 0x1

    .line 153
    :goto_2
    iput-boolean v2, p0, Ll/ۡ֡᩵;->ۖ:Z

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    const/4 v1, 0x1

    .line 154
    :goto_3
    iput-boolean v1, p0, Ll/ۡ֡᩵;->ۡ:Z

    .line 155
    aget-byte v1, p1, v3

    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    const/4 v2, 0x1

    :goto_4
    iput-boolean v2, p0, Ll/ۡ֡᩵;->ۢ:Z

    and-int/lit8 v2, v1, 0x10

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    const/4 v0, 0x1

    .line 156
    :goto_5
    iput-boolean v0, p0, Ll/ۡ֡᩵;->᩷:Z

    and-int/lit8 v0, v1, 0xf

    .line 157
    iput v0, p0, Ll/ۡ֡᩵;->ۙ:I

    const/4 v0, 0x4

    .line 158
    invoke-static {v0, p1}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۡ֡᩵;->֡:I

    const/4 v0, 0x6

    .line 159
    invoke-static {v0, p1}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۡ֡᩵;->ܿ:I

    const/16 v0, 0x8

    .line 160
    invoke-static {v0, p1}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۡ֡᩵;->ܳ:I

    const/16 v0, 0xa

    .line 161
    invoke-static {v0, p1}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v0

    iput v0, p0, Ll/ۡ֡᩵;->֫:I

    const/16 v0, 0xc

    .line 128
    invoke-virtual {p0, v0, p1}, Ll/ۡ֡᩵;->֫(I[B)I

    return-void
.end method

.method public abstract ۧ(I[B)I
.end method

.method public final ۧ([B)I
    .locals 7

    .line 135
    iget v0, p0, Ll/ۡ֡᩵;->ۘ:I

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Ll/ۡ֡᩵;->֫(II[B)V

    .line 136
    iget-boolean v0, p0, Ll/ۡ֡᩵;->ܺ:Z

    const/16 v2, 0x80

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v3, p0, Ll/ۡ֡᩵;->ᩴ:I

    const/4 v4, 0x3

    shl-int/2addr v3, v4

    and-int/lit8 v3, v3, 0x78

    add-int/2addr v0, v3

    .line 137
    iget-boolean v3, p0, Ll/ۡ֡᩵;->ۜ:Z

    const/4 v5, 0x4

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    add-int/2addr v0, v3

    iget-boolean v3, p0, Ll/ۡ֡᩵;->ۖ:Z

    const/4 v6, 0x2

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    add-int/2addr v0, v3

    iget-boolean v3, p0, Ll/ۡ֡᩵;->ۡ:Z

    add-int/2addr v0, v3

    int-to-byte v0, v0

    aput-byte v0, p1, v6

    .line 139
    iget-boolean v0, p0, Ll/ۡ֡᩵;->ۢ:Z

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    iget-boolean v0, p0, Ll/ۡ֡᩵;->᩷:Z

    if-eqz v0, :cond_4

    const/16 v1, 0x10

    :cond_4
    add-int/2addr v2, v1

    iget v0, p0, Ll/ۡ֡᩵;->ۙ:I

    and-int/lit8 v0, v0, 0xf

    add-int/2addr v2, v0

    int-to-byte v0, v2

    aput-byte v0, p1, v4

    .line 140
    iget v0, p0, Ll/ۡ֡᩵;->֡:I

    invoke-static {v0, v5, p1}, Ll/ۡ֡᩵;->֫(II[B)V

    .line 141
    iget v0, p0, Ll/ۡ֡᩵;->ܿ:I

    const/4 v1, 0x6

    invoke-static {v0, v1, p1}, Ll/ۡ֡᩵;->֫(II[B)V

    .line 142
    iget v0, p0, Ll/ۡ֡᩵;->ܳ:I

    const/16 v1, 0x8

    invoke-static {v0, v1, p1}, Ll/ۡ֡᩵;->֫(II[B)V

    .line 143
    iget v0, p0, Ll/ۡ֡᩵;->֫:I

    const/16 v1, 0xa

    invoke-static {v0, v1, p1}, Ll/ۡ֡᩵;->֫(II[B)V

    const/16 v0, 0xc

    .line 120
    invoke-virtual {p0, v0, p1}, Ll/ۡ֡᩵;->ᩳ(I[B)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public final ܽ(I[B)I
    .locals 3

    .line 213
    aget-byte v0, p2, p1

    const/16 v1, 0xc0

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    .line 214
    iget-object v0, p0, Ll/ۡ֡᩵;->ۚ:Ll/ܽ֡᩵;

    iput-object v0, p0, Ll/ۡ֡᩵;->᩹:Ll/ܽ֡᩵;

    add-int/lit8 v0, p1, 0x2

    goto :goto_0

    .line 217
    :cond_0
    iget-object v0, p0, Ll/ۡ֡᩵;->᩹:Ll/ܽ֡᩵;

    invoke-virtual {v0, p1, p2}, Ll/ܽ֡᩵;->֫(I[B)I

    move-result v0

    add-int/2addr v0, p1

    .line 219
    :goto_0
    invoke-static {v0, p2}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۡ֡᩵;->᩶:I

    add-int/lit8 v1, v0, 0x2

    .line 221
    invoke-static {v1, p2}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۡ֡᩵;->᩸:I

    add-int/lit8 v1, v0, 0x4

    .line 223
    invoke-static {v1, p2}, Ll/ۡ֡᩵;->ܳ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۡ֡᩵;->ۗ:I

    add-int/lit8 v1, v0, 0x8

    .line 225
    invoke-static {v1, p2}, Ll/ۡ֡᩵;->ܿ(I[B)I

    move-result v1

    iput v1, p0, Ll/ۡ֡᩵;->۠:I

    add-int/lit8 v0, v0, 0xa

    .line 228
    div-int/lit8 v2, v1, 0x6

    new-array v2, v2, [Ll/ܺ֡᩵;

    iput-object v2, p0, Ll/ۡ֡᩵;->ܽ:[Ll/ܺ֡᩵;

    add-int/2addr v1, v0

    const/4 v2, 0x0

    .line 238
    :goto_1
    iput v2, p0, Ll/ۡ֡᩵;->ᩳ:I

    if-ge v0, v1, :cond_1

    .line 239
    invoke-virtual {p0, v0, p2}, Ll/ۡ֡᩵;->ۧ(I[B)I

    move-result v2

    add-int/2addr v0, v2

    .line 238
    iget v2, p0, Ll/ۡ֡᩵;->ᩳ:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    sub-int/2addr v0, p1

    return v0
.end method

.method public abstract ᩳ(I[B)I
.end method
