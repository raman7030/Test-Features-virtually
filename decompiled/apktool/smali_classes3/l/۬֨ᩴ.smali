.class public Ll/۬֨ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ljava/util/BitSet;

.field public static final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 119
    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    sput-object v0, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    const/16 v0, 0x61

    :goto_0
    const/16 v1, 0x7a

    if-gt v0, v1, :cond_0

    .line 122
    sget-object v1, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x41

    :goto_1
    const/16 v1, 0x5a

    if-gt v0, v1, :cond_1

    .line 125
    sget-object v1, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const/16 v0, 0x30

    :goto_2
    const/16 v1, 0x39

    if-gt v0, v1, :cond_2

    .line 128
    sget-object v1, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 130
    :cond_2
    sget-object v0, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    const/16 v1, 0x2d

    .line 132
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    const/16 v1, 0x5f

    .line 133
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    const/16 v1, 0x2e

    .line 134
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    const/16 v1, 0x2a

    .line 135
    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    .line 104
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    const-string v1, "file.encoding"

    if-nez v0, :cond_3

    .line 105
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 107
    :cond_3
    new-instance v0, Ll/ۢ᩹ᩴ;

    .line 63
    invoke-direct {v0}, Ll/ۢ᩹ᩴ;-><init>()V

    .line 64
    iput-object v1, v0, Ll/ۢ᩹ᩴ;->b:Ljava/lang/Object;

    .line 107
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 137
    :goto_3
    sput-object v0, Ll/۬֨ᩴ;->b:Ljava/lang/String;

    return-void
.end method

.method public static encode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 162
    :try_start_0
    sget-object v0, Ll/۬֨ᩴ;->b:Ljava/lang/String;

    invoke-static {p0, v0}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    .line 195
    :try_start_0
    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    .line 196
    invoke-static {p0, v0}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/nio/charset/IllegalCharsetNameException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 198
    :catch_0
    new-instance p0, Ljava/io/UnsupportedEncodingException;

    invoke-direct {p0, p1}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 191
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "charsetName"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static encode(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 8

    const-string v0, "charset"

    .line 221
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 225
    new-instance v1, Ljava/io/CharArrayWriter;

    invoke-direct {v1}, Ljava/io/CharArrayWriter;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 227
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_7

    .line 228
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 230
    sget-object v5, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    invoke-virtual {v5, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    if-ne v4, v5, :cond_0

    const/16 v4, 0x2b

    const/4 v3, 0x1

    :cond_0
    int-to-char v4, v4

    .line 236
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 241
    :cond_1
    invoke-virtual {v1, v4}, Ljava/io/CharArrayWriter;->write(I)V

    const v3, 0xd800

    if-lt v4, v3, :cond_2

    const v3, 0xdbff

    if-gt v4, v3, :cond_2

    add-int/lit8 v3, v2, 0x1

    .line 255
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 256
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v5, 0xdc00

    if-lt v4, v5, :cond_2

    const v5, 0xdfff

    if-gt v4, v5, :cond_2

    .line 267
    invoke-virtual {v1, v4}, Ljava/io/CharArrayWriter;->write(I)V

    move v2, v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 273
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    sget-object v3, Ll/۬֨ᩴ;->a:Ljava/util/BitSet;

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 275
    :cond_3
    invoke-virtual {v1}, Ljava/io/CharArrayWriter;->flush()V

    .line 276
    new-instance v3, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/CharArrayWriter;->toCharArray()[C

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([C)V

    .line 277
    invoke-virtual {v3, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const/4 v4, 0x0

    .line 278
    :goto_1
    array-length v5, v3

    if-ge v4, v5, :cond_6

    const/16 v5, 0x25

    .line 279
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 280
    aget-byte v5, v3, v4

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0xf

    const/16 v6, 0x10

    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    .line 283
    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    move-result v7

    if-eqz v7, :cond_4

    add-int/lit8 v5, v5, -0x20

    int-to-char v5, v5

    .line 286
    :cond_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 287
    aget-byte v5, v3, v4

    and-int/lit8 v5, v5, 0xf

    invoke-static {v5, v6}, Ljava/lang/Character;->forDigit(II)C

    move-result v5

    .line 288
    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    move-result v6

    if-eqz v6, :cond_5

    add-int/lit8 v5, v5, -0x20

    int-to-char v5, v5

    .line 291
    :cond_5
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 293
    :cond_6
    invoke-virtual {v1}, Ljava/io/CharArrayWriter;->reset()V

    const/4 v3, 0x1

    goto/16 :goto_0

    :cond_7
    if-eqz v3, :cond_8

    .line 298
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_8
    return-object p0
.end method
