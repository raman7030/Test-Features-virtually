.class public final Ll/ܽ֡᩵;
.super Ljava/lang/Object;
.source "V42A"


# instance fields
.field public ֫:Ll/֨ۡ᩵;

.field public ۧ:I

.field public ܽ:Ljava/lang/String;

.field public ܿ:I

.field public ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Ll/ܽ֡᩵;->֫:Ll/֨ۡ᩵;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, Ll/ܽ֡᩵;->֫:Ll/֨ۡ᩵;

    .line 96
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xf

    if-le v0, v2, :cond_0

    .line 97
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 99
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    .line 100
    iput p3, p0, Ll/ܽ֡᩵;->ۧ:I

    if-eqz p4, :cond_1

    .line 101
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p4, 0x0

    :goto_0
    iput-object p4, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    .line 102
    iput v1, p0, Ll/ܽ֡᩵;->ܿ:I

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;Ll/ܽ֡᩵;)V
    .locals 0

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, Ll/ܽ֡᩵;->֫:Ll/֨ۡ᩵;

    .line 66
    iget-object p1, p2, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    .line 112
    iput-object p1, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    .line 84
    iget p1, p2, Ll/ܽ֡᩵;->ۧ:I

    .line 113
    iput p1, p0, Ll/ܽ֡᩵;->ۧ:I

    .line 75
    iget-object p1, p2, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    .line 114
    iput-object p1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    .line 116
    iget p1, p2, Ll/ܽ֡᩵;->ܿ:I

    iput p1, p0, Ll/ܽ֡᩵;->ܿ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 242
    instance-of v0, p1, Ll/ܽ֡᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 245
    :cond_0
    check-cast p1, Ll/ܽ֡᩵;

    .line 246
    iget-object v0, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p1, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 247
    iget-object v0, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ܽ֡᩵;->ۧ:I

    iget p1, p1, Ll/ܽ֡᩵;->ۧ:I

    if-ne v0, p1, :cond_1

    return v2

    :cond_1
    return v1

    .line 249
    :cond_2
    iget-object v0, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ܽ֡᩵;->ۧ:I

    iget v3, p1, Ll/ܽ֡᩵;->ۧ:I

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 225
    iget-object v0, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 226
    iget v1, p0, Ll/ܽ֡᩵;->ۧ:I

    const v2, 0x1003f

    mul-int v1, v1, v2

    add-int/2addr v1, v0

    .line 227
    iget v0, p0, Ll/ܽ֡᩵;->ܿ:I

    mul-int v0, v0, v2

    add-int/2addr v0, v1

    .line 231
    iget-object v1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    .line 232
    iget-object v1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1

    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 255
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 256
    iget-object v1, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 261
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 262
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    const/16 v3, 0x2e

    .line 263
    aput-char v3, v1, v2

    .line 264
    aput-char v3, v1, v4

    const/16 v2, 0xe

    .line 265
    aput-char v3, v1, v2

    .line 266
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V

    move-object v1, v2

    .line 269
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Ll/ܽ֡᩵;->ۧ:I

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 270
    iget-object v1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, "."

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 273
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[B)I
    .locals 8

    const/16 v0, 0x21

    new-array v1, v0, [B

    const/16 v2, 0xf

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    :goto_0
    if-ge v4, v2, :cond_1

    mul-int/lit8 v6, v4, 0x2

    add-int/lit8 v7, v6, 0x1

    add-int/2addr v7, p1

    .line 154
    aget-byte v7, p2, v7

    and-int/lit16 v7, v7, 0xff

    add-int/lit8 v7, v7, -0x41

    shl-int/lit8 v7, v7, 0x4

    int-to-byte v7, v7

    aput-byte v7, v1, v4

    add-int/lit8 v6, v6, 0x2

    add-int/2addr v6, p1

    .line 155
    aget-byte v6, p2, v6

    and-int/lit16 v6, v6, 0xff

    add-int/lit8 v6, v6, -0x41

    and-int/2addr v6, v2

    int-to-byte v6, v6

    or-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    const/16 v7, 0x20

    if-eq v6, v7, :cond_0

    add-int/lit8 v5, v4, 0x1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 160
    :cond_1
    iget-object v4, p0, Ll/ܽ֡᩵;->֫:Ll/֨ۡ᩵;

    invoke-static {v1, v3, v5, v4}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    add-int/lit8 v1, p1, 0x1f

    .line 161
    aget-byte v1, p2, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v1, v1, -0x41

    shl-int/lit8 v1, v1, 0x4

    iput v1, p0, Ll/ܽ֡᩵;->ۧ:I

    add-int/lit8 v3, p1, 0x20

    .line 162
    aget-byte v3, p2, v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v3, v3, -0x41

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    iput v1, p0, Ll/ܽ֡᩵;->ۧ:I

    add-int/lit8 v1, p1, 0x21

    add-int/lit8 p1, p1, 0x22

    .line 204
    aget-byte v2, p2, v1

    and-int/lit16 v2, v2, 0xff

    if-nez v2, :cond_2

    const/4 p1, 0x0

    .line 205
    iput-object p1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    const/4 p1, 0x1

    goto :goto_2

    .line 209
    :cond_2
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-static {p2, p1, v2, v4}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    :goto_1
    add-int/2addr p1, v2

    add-int/lit8 v2, p1, 0x1

    .line 211
    aget-byte p1, p2, p1

    and-int/lit16 p1, p1, 0xff

    if-eqz p1, :cond_3

    const/16 v5, 0x2e

    .line 212
    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    invoke-static {p2, v2, p1, v4}, Ll/ۤ֨᩵;->֫([BIILl/֨ۡ᩵;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 215
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    sub-int p1, v2, v1

    :goto_2
    add-int/2addr p1, v0

    return p1
.end method

.method public final ֫()Z
    .locals 2

    const-string v0, "0.0.0.0"

    .line 125
    iget-object v1, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ܽ֡᩵;->ۧ:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(I[B)I
    .locals 9

    const/16 v0, 0x20

    .line 131
    aput-byte v0, p2, p1

    .line 133
    iget-object v0, p0, Ll/ܽ֡᩵;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܽ֡᩵;->֫:Ll/֨ۡ᩵;

    invoke-static {v0, v1}, Ll/ۤ֨᩵;->֫(Ljava/lang/String;Ll/֨ۡ᩵;)[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 135
    :goto_0
    array-length v4, v0

    const/16 v5, 0xf

    const/16 v6, 0x41

    if-ge v3, v4, :cond_0

    mul-int/lit8 v4, v3, 0x2

    add-int/lit8 v7, v4, 0x1

    add-int/2addr v7, p1

    .line 136
    aget-byte v8, v0, v3

    and-int/lit16 v8, v8, 0xf0

    shr-int/lit8 v8, v8, 0x4

    add-int/2addr v8, v6

    int-to-byte v8, v8

    aput-byte v8, p2, v7

    add-int/lit8 v4, v4, 0x2

    add-int/2addr v4, p1

    .line 137
    aget-byte v7, v0, v3

    and-int/2addr v5, v7

    add-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, p2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, v5, :cond_1

    mul-int/lit8 v0, v3, 0x2

    add-int/lit8 v4, v0, 0x1

    add-int/2addr v4, p1

    const/16 v7, 0x43

    .line 140
    aput-byte v7, p2, v4

    add-int/lit8 v0, v0, 0x2

    add-int/2addr v0, p1

    .line 141
    aput-byte v6, p2, v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, p1, 0x1f

    .line 143
    iget v3, p0, Ll/ܽ֡᩵;->ۧ:I

    and-int/lit16 v4, v3, 0xf0

    shr-int/lit8 v4, v4, 0x4

    add-int/2addr v4, v6

    int-to-byte v4, v4

    aput-byte v4, p2, v0

    add-int/lit8 v0, p1, 0x20

    and-int/2addr v3, v5

    add-int/2addr v3, v6

    int-to-byte v3, v3

    .line 144
    aput-byte v3, p2, v0

    add-int/lit8 v0, p1, 0x21

    .line 168
    iget-object v3, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    if-nez v3, :cond_2

    .line 169
    aput-byte v2, p2, v0

    const/4 p1, 0x1

    goto :goto_4

    :cond_2
    add-int/lit8 p1, p1, 0x22

    const/16 v4, 0x2e

    .line 174
    aput-byte v4, p2, v0

    .line 175
    invoke-static {v3, v1}, Ll/ۤ֨᩵;->֫(Ljava/lang/String;Ll/֨ۡ᩵;)[B

    move-result-object v0

    iget-object v1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v0, v2, p2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 176
    iget-object v0, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, p1

    .line 178
    aput-byte v2, p2, v0

    add-int/lit8 v0, v0, -0x1

    .line 183
    iget-object p1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int p1, v0, p1

    const/4 v1, 0x0

    .line 187
    :goto_2
    aget-byte v2, p2, v0

    if-ne v2, v4, :cond_3

    int-to-byte v1, v1

    .line 188
    aput-byte v1, p2, v0

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    :goto_3
    add-int/lit8 v2, v0, -0x1

    if-gt v0, p1, :cond_4

    .line 195
    iget-object p1, p0, Ll/ܽ֡᩵;->ᩳ:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    :goto_4
    add-int/lit8 p1, p1, 0x21

    return p1

    :cond_4
    move v0, v2

    goto :goto_2
.end method
