.class public final Ll/ۙܺܽ;
.super Ljava/lang/Object;
.source "J55M"


# instance fields
.field public final ֫:Ljava/nio/ByteBuffer;

.field public final ۧ:Z

.field public final ܽ:[Ll/ۤܺܽ;

.field public final ᩳ:Ll/ۛܺܽ;


# direct methods
.method public constructor <init>([B)V
    .locals 7

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/ۙܺܽ;->֫:Ljava/nio/ByteBuffer;

    const/16 v0, 0x10

    new-array v1, v0, [B

    .line 101
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/4 v2, 0x0

    .line 102
    aget-byte v3, v1, v2

    const/16 v4, 0x7f

    if-ne v3, v4, :cond_6

    const/4 v3, 0x1

    aget-byte v4, v1, v3

    const/16 v5, 0x45

    if-ne v4, v5, :cond_6

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    const/16 v6, 0x4c

    if-ne v5, v6, :cond_6

    const/4 v5, 0x3

    aget-byte v5, v1, v5

    const/16 v6, 0x46

    if-ne v5, v6, :cond_6

    const/4 v5, 0x4

    .line 106
    aget-byte v5, v1, v5

    if-eq v5, v3, :cond_1

    if-ne v5, v4, :cond_0

    .line 111
    iput-boolean v3, p0, Ll/ۙܺܽ;->ۧ:Z

    goto :goto_0

    .line 114
    :cond_0
    new-instance p1, Ll/᩹ܺܽ;

    const-string v0, "Invalid ELF class"

    .line 11
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 114
    throw p1

    .line 108
    :cond_1
    iput-boolean v2, p0, Ll/ۙܺܽ;->ۧ:Z

    :goto_0
    const/4 v2, 0x5

    .line 117
    aget-byte v2, v1, v2

    if-eq v2, v3, :cond_3

    if-ne v2, v4, :cond_2

    .line 122
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 125
    :cond_2
    new-instance p1, Ll/᩹ܺܽ;

    const-string v0, "Invalid ELF endian"

    .line 11
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 125
    throw p1

    .line 119
    :cond_3
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    :goto_1
    const/4 v2, 0x6

    .line 128
    aget-byte v1, v1, v2

    if-ne v1, v3, :cond_5

    .line 135
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    const/16 v0, 0x12

    .line 136
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    const/16 v0, 0x14

    .line 137
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 139
    iget-boolean v0, p0, Ll/ۙܺܽ;->ۧ:Z

    const/16 v1, 0x30

    const/16 v2, 0x18

    const v3, 0xffff

    if-eqz v0, :cond_4

    .line 140
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 141
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 v0, 0x28

    .line 142
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    const/16 v1, 0x3a

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    and-int/2addr v1, v3

    const/16 v2, 0x3c

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v2

    and-int/2addr v2, v3

    invoke-direct {p0, v0, v1, v2}, Ll/ۙܺܽ;->֫(III)[Ll/ۤܺܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܺܽ;->ܽ:[Ll/ۤܺܽ;

    const/16 v1, 0x3e

    .line 143
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    and-int/2addr p1, v3

    aget-object p1, v0, p1

    check-cast p1, Ll/ۛܺܽ;

    iput-object p1, p0, Ll/ۙܺܽ;->ᩳ:Ll/ۛܺܽ;

    return-void

    .line 145
    :cond_4
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 v0, 0x24

    .line 146
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    const/16 v0, 0x20

    .line 147
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    const/16 v2, 0x2e

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v2

    and-int/2addr v2, v3

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    and-int/2addr v1, v3

    invoke-direct {p0, v0, v2, v1}, Ll/ۙܺܽ;->֫(III)[Ll/ۤܺܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܺܽ;->ܽ:[Ll/ۤܺܽ;

    const/16 v1, 0x32

    .line 148
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    and-int/2addr p1, v3

    aget-object p1, v0, p1

    check-cast p1, Ll/ۛܺܽ;

    iput-object p1, p0, Ll/ۙܺܽ;->ᩳ:Ll/ۛܺܽ;

    return-void

    .line 129
    :cond_5
    new-instance p1, Ll/᩹ܺܽ;

    const-string v0, "Invalid ELF version"

    .line 11
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 129
    throw p1

    .line 103
    :cond_6
    new-instance p1, Ll/᩹ܺܽ;

    const-string v0, "Invalid ELF signature"

    .line 11
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    throw p1
.end method

.method private ֫(III)[Ll/ۤܺܽ;
    .locals 5

    .line 153
    new-array v0, p3, [Ll/ۤܺܽ;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_4

    mul-int v2, v1, p2

    add-int/2addr v2, p1

    add-int/lit8 v3, v2, 0x4

    .line 113
    iget-object v4, p0, Ll/ۙܺܽ;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    if-eqz v3, :cond_3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_2

    const/16 v4, 0xb

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-eq v3, v4, :cond_0

    const/4 v4, 0x4

    if-eq v3, v4, :cond_2

    .line 126
    new-instance v3, Ll/ۤܺܽ;

    invoke-direct {v3, p0, v2}, Ll/ۤܺܽ;-><init>(Ll/ۙܺܽ;I)V

    goto :goto_1

    .line 121
    :cond_0
    new-instance v3, Ll/ۛܺܽ;

    .line 8
    invoke-direct {v3, p0, v2}, Ll/ۤܺܽ;-><init>(Ll/ۙܺܽ;I)V

    goto :goto_1

    .line 119
    :cond_1
    new-instance v3, Ll/ܰܺܽ;

    .line 8
    invoke-direct {v3, p0, v2}, Ll/ۤܺܽ;-><init>(Ll/ۙܺܽ;I)V

    goto :goto_1

    .line 124
    :cond_2
    new-instance v3, Ll/۫ܺܽ;

    .line 9
    invoke-direct {v3, p0, v2}, Ll/ۤܺܽ;-><init>(Ll/ۙܺܽ;I)V

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    .line 155
    :goto_1
    aput-object v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method
