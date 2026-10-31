.class public final Ll/᩵ۙ֡;
.super Ll/ۚۙ֡;
.source "U4WH"


# static fields
.field public static final ۗ:[B

.field public static final ۙ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 40
    fill-array-data v1, :array_0

    sput-object v1, Ll/᩵ۙ֡;->ۙ:[B

    new-array v0, v0, [B

    .line 41
    fill-array-data v0, :array_1

    sput-object v0, Ll/᩵ۙ֡;->ۗ:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x64t
        0x65t
        0x78t
        0xat
        0x30t
        0x33t
        0x35t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x64t
        0x65t
        0x78t
        0xat
        0x30t
        0x33t
        0x36t
        0x0t
    .end array-data
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 35
    check-cast p1, Ll/᩵ۙ֡;

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(I)I
    .locals 0

    const/16 p1, 0x70

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "header_item"

    return-object v0
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 10

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 148
    :goto_0
    sget-object v3, Ll/᩵ۙ֡;->ۙ:[B

    const/16 v4, 0x8

    if-ge v2, v4, :cond_0

    .line 149
    aget-byte v3, v3, v2

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 152
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ֡᩵;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    .line 347
    invoke-virtual {p1, v3, v1, v4}, Ll/֫ۗ֡;->֫([BII)V

    .line 156
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    const/16 v0, 0x14

    new-array v2, v0, [B

    .line 347
    invoke-virtual {p1, v2, v1, v0}, Ll/֫ۗ֡;->֫([BII)V

    .line 161
    iget-object v0, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    invoke-virtual {v0}, Ll/ۗ᩶֡;->ܽ()I

    move-result v2

    iget-object v3, v0, Ll/ۗ᩶֡;->ܺ:Ll/᩸ۙ֡;

    iget-object v4, v0, Ll/ۗ᩶֡;->ܳ:Ll/֡ۙ֡;

    iget-object v5, v0, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    iget-object v6, v0, Ll/ۗ᩶֡;->ۢ:Ll/֡ۙ֡;

    iget-object v7, v0, Ll/ۗ᩶֡;->ۘ:Ll/֡ۙ֡;

    iget-object v8, v0, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    iget-object v9, v0, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 163
    invoke-virtual {v0}, Ll/ۗ᩶֡;->ܽ()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    const/16 v2, 0x70

    .line 165
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 166
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    const v2, 0x12345678

    .line 168
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 169
    invoke-virtual {p1, v2}, Ll/֫ۗ֡;->ܽ(I)V

    .line 172
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 175
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 202
    iget v1, v3, Ll/ۚۙ֡;->᩶:I

    .line 177
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 202
    iget v1, v3, Ll/ۚۙ֡;->᩶:I

    .line 178
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 180
    iget-object v1, v9, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    iget-object v1, v9, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 181
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 171
    iget v1, v9, Ll/ۤۙ֡;->ᩳ:I

    .line 183
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    iget v1, v9, Ll/ۤۙ֡;->ᩳ:I

    .line 184
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 180
    iget-object v1, v8, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 186
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 180
    iget-object v1, v8, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 187
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 171
    iget v1, v8, Ll/ۤۙ֡;->ᩳ:I

    .line 189
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    iget v1, v8, Ll/ۤۙ֡;->ᩳ:I

    .line 190
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 180
    iget-object v1, v7, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 192
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 180
    iget-object v1, v7, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 193
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 171
    iget v1, v7, Ll/ۤۙ֡;->ᩳ:I

    .line 195
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    iget v1, v7, Ll/ۤۙ֡;->ᩳ:I

    .line 196
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 180
    iget-object v1, v6, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 198
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 180
    iget-object v1, v6, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 199
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 171
    iget v1, v6, Ll/ۤۙ֡;->ᩳ:I

    .line 201
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    iget v1, v6, Ll/ۤۙ֡;->ᩳ:I

    .line 202
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 180
    iget-object v1, v5, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 204
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 180
    iget-object v1, v5, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 205
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 171
    iget v1, v5, Ll/ۤۙ֡;->ᩳ:I

    .line 207
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    iget v1, v5, Ll/ۤۙ֡;->ᩳ:I

    .line 208
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 180
    iget-object v1, v4, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 210
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 180
    iget-object v1, v4, Ll/ۤۙ֡;->ܽ:Ljava/util/ArrayList;

    .line 211
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 171
    iget v1, v4, Ll/ۤۙ֡;->ᩳ:I

    .line 213
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    iget v1, v4, Ll/ۤۙ֡;->ᩳ:I

    .line 214
    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 216
    invoke-virtual {v0}, Ll/ۗ᩶֡;->ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 218
    invoke-virtual {v0}, Ll/ۗ᩶֡;->ۧ()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/֫ۗ֡;->ܽ(I)V

    .line 220
    invoke-virtual {v0}, Ll/ۗ᩶֡;->֫()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 221
    invoke-virtual {v0}, Ll/ۗ᩶֡;->֫()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 3

    const/16 v0, 0x8

    .line 68
    invoke-virtual {p1, v0}, Ll/ۧۗ֡;->ۧ(I)[B

    const/16 v0, 0x14

    .line 76
    invoke-virtual {p1, v0}, Ll/ۧۗ֡;->ۧ(I)[B

    .line 77
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    .line 78
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    .line 79
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    const/16 v1, 0x70

    if-ne v0, v1, :cond_3

    .line 83
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    const v1, 0x78562312

    if-eq v0, v1, :cond_2

    const v1, 0x12345678

    if-ne v0, v1, :cond_1

    .line 91
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    or-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 92
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "This dex file has a link section, which is not supported. Ignoring."

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 99
    :cond_0
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 100
    sget-object v1, Ll/ܶۙ֡;->ᩳ֫:Ll/ܶۙ֡;

    const/4 v2, 0x1

    invoke-virtual {p2, v1, v2, v0}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 103
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 104
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 105
    sget-object v2, Ll/ܶۙ֡;->ۜ֫:Ll/ܶۙ֡;

    invoke-virtual {p2, v2, v0, v1}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 108
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 109
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 110
    sget-object v2, Ll/ܶۙ֡;->᩷֫:Ll/ܶۙ֡;

    invoke-virtual {p2, v2, v0, v1}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 113
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 114
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 115
    sget-object v2, Ll/ܶۙ֡;->ܳ֫:Ll/ܶۙ֡;

    invoke-virtual {p2, v2, v0, v1}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 118
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 119
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 120
    sget-object v2, Ll/ܶۙ֡;->ۧ֫:Ll/ܶۙ֡;

    invoke-virtual {p2, v2, v0, v1}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 123
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 124
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 125
    sget-object v2, Ll/ܶۙ֡;->ܿ֫:Ll/ܶۙ֡;

    invoke-virtual {p2, v2, v0, v1}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 128
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v0

    .line 129
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    .line 130
    sget-object v2, Ll/ܶۙ֡;->᩺:Ll/ܶۙ֡;

    invoke-virtual {p2, v2, v0, v1}, Ll/۫ۙ֡;->֫(Ll/ܶۙ֡;II)V

    .line 132
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    .line 133
    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    return-void

    .line 87
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The endian tag is not 0x12345678 or 0x78563412"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 85
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This dex file is big endian. Only little endian is currently supported."

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 80
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The header size is not the expected value (0x70)"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
