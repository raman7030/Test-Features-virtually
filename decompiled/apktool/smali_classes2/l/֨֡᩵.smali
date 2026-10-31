.class public final Ll/֨֡᩵;
.super Ll/ۚ֡᩵;
.source "WA0T"


# instance fields
.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ᩴۡ᩵;ILjava/lang/String;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->ۡ֫()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    const v0, 0x2000200

    or-int/2addr p1, v0

    or-int/2addr p1, p2

    .line 57
    invoke-virtual {p0, p1}, Ll/ۚ֡᩵;->ۧ(I)V

    .line 103
    iput-object p3, p0, Ll/֨֡᩵;->ᩳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Type1Message[suppliedDomain="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "null"

    iget-object v2, p0, Ll/֨֡᩵;->ᩳ:Ljava/lang/String;

    if-nez v2, :cond_0

    move-object v2, v1

    :cond_0
    const-string v3, ",suppliedWorkstation="

    const-string v4, ",flags=0x"

    .line 0
    invoke-static {v0, v2, v3, v1, v4}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    invoke-virtual {p0}, Ll/ۚ֡᩵;->֫()I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()[B
    .locals 10

    const-string v0, "Cp850"

    .line 130
    :try_start_0
    invoke-virtual {p0}, Ll/ۚ֡᩵;->֫()I

    move-result v1

    const/high16 v2, 0x2000000

    and-int v3, v1, v2

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const/16 v6, 0x8

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/16 v7, 0x20

    add-int/2addr v6, v7

    new-array v8, v5, [B

    .line 93
    iget-object v9, p0, Ll/֨֡᩵;->ᩳ:Ljava/lang/String;

    if-nez v3, :cond_1

    if-eqz v9, :cond_1

    .line 135
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    or-int/lit16 v1, v1, 0x1000

    .line 137
    invoke-virtual {v9}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v8

    .line 138
    array-length v0, v8

    add-int/2addr v6, v0

    goto :goto_1

    :cond_1
    and-int/lit16 v1, v1, -0x1001

    :goto_1
    new-array v0, v5, [B

    and-int/lit16 v3, v1, -0x2001

    .line 153
    new-array v6, v6, [B

    .line 156
    sget-object v9, Ll/ۚ֡᩵;->ۧ:[B

    invoke-static {v9, v5, v6, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v9, 0x1

    .line 159
    invoke-static {v4, v9, v6}, Ll/ۚ֡᩵;->֫(II[B)V

    const/16 v9, 0xc

    .line 162
    invoke-static {v9, v3, v6}, Ll/ۚ֡᩵;->֫(II[B)V

    const/16 v3, 0x10

    .line 165
    invoke-static {v3, v6, v8}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v3

    const/16 v9, 0x18

    .line 168
    invoke-static {v9, v6, v0}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v9

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 172
    sget-object v1, Ll/ۚ֡᩵;->ܽ:[B

    invoke-static {v1, v5, v6, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v7, 0x28

    .line 176
    :cond_2
    invoke-static {v7, v3, v6, v8}, Ll/ۚ֡᩵;->֫(II[B[B)I

    move-result v1

    add-int/2addr v7, v1

    .line 177
    invoke-static {v7, v9, v6, v0}, Ll/ۚ֡᩵;->֫(II[B[B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v6

    :catch_0
    move-exception v0

    .line 180
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
