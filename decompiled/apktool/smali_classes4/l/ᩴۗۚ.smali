.class public final Ll/ᩴۗۚ;
.super Ljava/lang/Object;
.source "74MB"


# static fields
.field public static final ֫:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 53
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴۗۚ;->֫:[C

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

.method public static ֫(C)Ljava/lang/String;
    .locals 2

    const/16 v0, 0xc

    const-string v1, "\\"

    if-eq p0, v0, :cond_5

    const/16 v0, 0xd

    if-eq p0, v0, :cond_4

    const/16 v0, 0x22

    if-eq p0, v0, :cond_3

    const/16 v0, 0x27

    if-eq p0, v0, :cond_2

    const/16 v0, 0x5c

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_0

    .line 154
    invoke-static {p0}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "\\u%04x"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "n"

    .line 147
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-string p0, "t"

    .line 146
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_2
    const-string p0, "b"

    .line 149
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 154
    :cond_0
    invoke-static {p0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 153
    :cond_1
    invoke-virtual {v1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p0, "\'"

    .line 152
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string p0, "\""

    .line 151
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    const-string p0, "r"

    .line 148
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const-string p0, "f"

    .line 150
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 104
    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_0

    aget-object v0, p1, v1

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 105
    :goto_0
    array-length v2, p1

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    aget-object p1, p1, v3

    goto :goto_1

    :cond_1
    move-object p1, v0

    .line 106
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 108
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/ᩴۗۚ;->֫(C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 110
    :cond_2
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫([I)Ljava/lang/String;
    .locals 2

    .line 326
    invoke-static {p0}, Ll/᩹۬ᩴ;->stream([I)Ll/ۧ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/ۖۗۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, Ll/ۧ᩺ᩴ;->mapToObj(Ljava/util/function/IntFunction;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    const-string v0, ", "

    invoke-static {v0}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "{%s}"

    .line 325
    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IILjava/io/DataInputStream;)Ljava/util/ArrayList;
    .locals 13

    .line 187
    div-int/lit8 v0, p1, 0x6

    add-int/lit8 v1, v0, 0x1

    .line 188
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 189
    new-instance v3, Ll/ۘۗۚ;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 190
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    .line 192
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/StringBuilder;

    add-int/lit8 v6, p0, 0x2

    const/4 v7, 0x0

    .line 197
    :try_start_0
    new-array v6, v6, [B

    shr-int/lit8 v8, p0, 0x8

    int-to-byte v8, v8

    .line 198
    aput-byte v8, v6, v4

    int-to-byte v8, p0

    const/4 v9, 0x1

    .line 199
    aput-byte v8, v6, v9
    :try_end_0
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v8, p0, :cond_2

    .line 201
    :try_start_1
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readByte()B

    move-result v10

    add-int/lit8 v11, v8, 0x2

    .line 202
    aput-byte v10, v6, v11

    add-int/lit8 v9, v9, 0x1

    const-string v11, "0x"

    .line 204
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v11, Ll/ᩴۗۚ;->֫:[C

    shr-int/lit8 v12, v10, 0x4

    and-int/lit8 v12, v12, 0xf

    aget-char v12, v11, v12

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v10, v10, 0xf

    aget-char v10, v11, v10

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 205
    rem-int v10, v8, v1

    if-ne v10, v0, :cond_0

    .line 206
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v8, 0x1

    if-eq v10, p0, :cond_1

    const-string v10, " "

    .line 208
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_7

    :catch_0
    move-exception p0

    move v4, v9

    goto/16 :goto_5

    :cond_2
    if-lez v9, :cond_3

    .line 212
    :try_start_2
    new-instance p0, Ljava/io/DataInputStream;

    new-instance p2, Ljava/io/ByteArrayInputStream;

    invoke-direct {p2, v6}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p0, p2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/io/UTFDataFormatException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 213
    :try_start_3
    invoke-static {p0}, Ljava/io/DataInputStream;->readUTF(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 214
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/UTFDataFormatException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception p2

    .line 212
    :try_start_5
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    :try_start_6
    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_6
    .catch Ljava/io/UTFDataFormatException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_1
    nop

    goto :goto_3

    .line 215
    :catch_2
    :try_start_7
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "The bytes do not represent a valid modified UTF-8 encoding of a Unicode string."

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "// == "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " =="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/NegativeArraySizeException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_3
    :goto_3
    if-lez v9, :cond_5

    .line 224
    invoke-static {p1, v7}, Ll/ᩴۗۚ;->֫(ILjava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 226
    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance p1, Ll/ۡۗۚ;

    invoke-direct {p1, v2}, Ll/ۡۗۚ;-><init>(Ljava/util/ArrayList;)V

    .line 227
    invoke-interface {p0, p1}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_4

    .line 229
    :cond_4
    invoke-static {v3}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance p1, Ll/᩺ᩳ֨;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Ll/᩺ᩳ֨;-><init>(I)V

    invoke-interface {p0, p1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance p1, Ll/ܺۗۚ;

    invoke-direct {p1, v2}, Ll/ܺۗۚ;-><init>(Ljava/util/ArrayList;)V

    .line 230
    invoke-interface {p0, p1}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    :cond_5
    :goto_4
    return-object v2

    :catchall_3
    move-exception p0

    goto :goto_6

    :catch_3
    move-exception p0

    .line 221
    :goto_5
    :try_start_8
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Requested array size exceeds VM limit"

    invoke-direct {p2, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_6
    move v9, v4

    :goto_7
    if-lez v9, :cond_7

    .line 224
    invoke-static {p1, v7}, Ll/ᩴۗۚ;->֫(ILjava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 226
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance p2, Ll/ۡۗۚ;

    invoke-direct {p2, v2}, Ll/ۡۗۚ;-><init>(Ljava/util/ArrayList;)V

    .line 227
    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    goto :goto_8

    .line 229
    :cond_6
    invoke-static {v3}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance p2, Ll/᩺ᩳ֨;

    const/16 v0, 0x8

    invoke-direct {p2, v0}, Ll/᩺ᩳ֨;-><init>(I)V

    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance p2, Ll/ܺۗۚ;

    invoke-direct {p2, v2}, Ll/ܺۗۚ;-><init>(Ljava/util/ArrayList;)V

    .line 230
    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 233
    :cond_7
    :goto_8
    throw p0
.end method

.method public static ֫(ILjava/lang/String;)Ljava/util/ArrayList;
    .locals 7

    if-eqz p1, :cond_7

    .line 277
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 278
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-char v5, v1, v4

    const/16 v6, 0x20

    if-lt v5, v6, :cond_0

    const/16 v6, 0x7e

    if-gt v5, v6, :cond_0

    .line 280
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 283
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 260
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    const/4 v1, 0x0

    .line 46
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-char v2, v2

    .line 260
    invoke-static {v2}, Ll/ᩴۗۚ;->ۧ(C)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 120
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, ""

    move-object v2, v1

    .line 122
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 123
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lt v4, p0, :cond_4

    .line 124
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v2, v1

    .line 0
    :cond_4
    invoke-static {v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 127
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ll/ᩴۗۚ;->֫(C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 129
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    .line 130
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-object v0

    :cond_7
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(C)Z
    .locals 2

    .line 342
    invoke-static {p0}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object v0

    .line 343
    invoke-static {p0}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v1

    if-nez v1, :cond_0

    const v1, 0xffff

    if-eq p0, v1, :cond_0

    if-eqz v0, :cond_0

    sget-object p0, Ljava/lang/Character$UnicodeBlock;->SPECIALS:Ljava/lang/Character$UnicodeBlock;

    if-eq v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
