.class public abstract Ll/ᩳܽᩳ;
.super Ljava/lang/Object;
.source "I1VO"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [B

    .line 36
    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳܽᩳ;->֫:[B

    return-void

    nop

    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data
.end method

.method public static ֫(Ljava/util/jar/Attributes;)Ljava/util/TreeMap;
    .locals 3

    .line 111
    invoke-virtual {p0}, Ljava/util/jar/Attributes;->entrySet()Ljava/util/Set;

    move-result-object p0

    .line 112
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 113
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 114
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 115
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-virtual {v0, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ljava/io/ByteArrayOutputStream;)V
    .locals 1

    .line 73
    sget-object v0, Ll/ᩳܽᩳ;->֫:[B

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;Ljava/util/jar/Attributes;)V
    .locals 1

    const-string v0, "Name"

    .line 64
    invoke-static {p0, v0, p1}, Ll/ᩳܽᩳ;->֫(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p2}, Ljava/util/jar/Attributes;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 67
    invoke-static {p2}, Ll/ᩳܽᩳ;->֫(Ljava/util/jar/Attributes;)Ljava/util/TreeMap;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ᩳܽᩳ;->֫(Ljava/io/OutputStream;Ljava/util/TreeMap;)V

    .line 73
    :cond_0
    sget-object p1, Ll/ᩳܽᩳ;->֫:[B

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ֫(Ljava/io/ByteArrayOutputStream;Ljava/util/jar/Attributes$Name;Ljava/lang/String;)V
    .locals 0

    .line 78
    invoke-virtual {p1}, Ljava/util/jar/Attributes$Name;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p2}, Ll/ᩳܽᩳ;->֫(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-string v0, ": "

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 87
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    .line 89
    array-length p2, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 91
    :goto_0
    sget-object v2, Ll/ᩳܽᩳ;->֫:[B

    if-lez p2, :cond_1

    if-eqz v0, :cond_0

    const/16 v0, 0x46

    .line 95
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 98
    :cond_0
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write([B)V

    const/16 v0, 0x20

    .line 99
    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V

    const/16 v0, 0x45

    .line 100
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 102
    :goto_1
    invoke-virtual {p0, p1, v1, v0}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr v1, v0

    sub-int/2addr p2, v0

    const/4 v0, 0x0

    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {p0, v2}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public static ֫(Ljava/io/OutputStream;Ljava/util/TreeMap;)V
    .locals 2

    .line 123
    invoke-virtual {p1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 124
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 125
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 126
    invoke-static {p0, v1, v0}, Ll/ᩳܽᩳ;->֫(Ljava/io/OutputStream;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method
