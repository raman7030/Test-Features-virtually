.class public final Ll/ܺۡ᩵;
.super Ljava/lang/Object;
.source "E9U4"


# static fields
.field public static final ֫:Ljava/nio/charset/Charset;

.field public static final ۧ:[B

.field public static final ܽ:[B

.field public static ᩳ:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 18
    const-class v0, Ll/ܺۡ᩵;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܺۡ᩵;->ᩳ:Ll/֫᩻֨;

    const/4 v0, 0x0

    new-array v1, v0, [B

    .line 34
    sput-object v1, Ll/ܺۡ᩵;->ܽ:[B

    const/4 v1, 0x1

    new-array v1, v1, [B

    aput-byte v0, v1, v0

    .line 42
    sput-object v1, Ll/ܺۡ᩵;->ۧ:[B

    const-string v0, "UTF-8"

    .line 52
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ܺۡ᩵;->֫:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(II[B)Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ll/ܺۡ᩵;->֫:Ljava/nio/charset/Charset;

    invoke-direct {v0, p2, p0, p1, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public static ֫(Ljava/util/Hashtable;[B)V
    .locals 7

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 79
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_4

    add-int/lit8 v2, v1, 0x1

    .line 81
    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    if-eqz v1, :cond_3

    add-int v3, v2, v1

    .line 84
    array-length v4, p1

    if-le v3, v4, :cond_0

    goto :goto_3

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_1

    add-int v5, v2, v4

    .line 93
    aget-byte v5, p1, v5

    const/16 v6, 0x3d

    if-eq v5, v6, :cond_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 98
    :cond_1
    invoke-static {v2, v4, p1}, Ll/ܺۡ᩵;->֫(II[B)Ljava/lang/String;

    move-result-object v5

    if-ne v4, v1, :cond_2

    .line 104
    sget-object v1, Ll/ܺۡ᩵;->ܽ:[B

    invoke-virtual {p0, v5, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    sub-int/2addr v1, v4

    .line 106
    new-array v6, v1, [B

    add-int/2addr v2, v4

    .line 107
    invoke-static {p1, v2, v6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 108
    invoke-virtual {p0, v5, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    move v1, v3

    goto :goto_0

    .line 88
    :cond_3
    :goto_3
    invoke-virtual {p0}, Ljava/util/Hashtable;->clear()V

    :cond_4
    return-void
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 5

    .line 159
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 160
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 58
    sget-object v2, Ll/ܺۡ᩵;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 162
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 163
    array-length v2, v1

    const/16 v3, 0xff

    sget-object v4, Ll/ܺۡ᩵;->ۧ:[B

    if-le v2, v3, :cond_0

    .line 164
    sget-object v0, Ll/ܺۡ᩵;->ᩳ:Ll/֫᩻֨;

    const-string v1, "Cannot have individual values larger that 255 chars. Offending value: {}"

    invoke-interface {v0, p0, v1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4

    .line 167
    :cond_0
    array-length p0, v1

    int-to-byte p0, p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 p0, 0x0

    .line 168
    array-length v2, v1

    invoke-virtual {v0, v1, p0, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 170
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    .line 172
    array-length v0, p0

    if-lez v0, :cond_1

    return-object p0

    :cond_1
    return-object v4
.end method

.method public static ֫(Ljava/util/HashMap;)[B
    .locals 9

    .line 119
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 120
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v2, Ll/ܺۡ᩵;->ۧ:[B

    if-eqz v1, :cond_6

    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 121
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 122
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 123
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    const/16 v5, 0x64

    invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 58
    sget-object v5, Ll/ܺۡ᩵;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    .line 59
    invoke-virtual {v4, v6}, Ljava/io/OutputStream;->write([B)V

    const/4 v6, 0x0

    if-nez v1, :cond_0

    goto :goto_1

    .line 127
    :cond_0
    instance-of v7, v1, Ljava/lang/String;

    const/16 v8, 0x3d

    if-eqz v7, :cond_1

    .line 128
    invoke-virtual {v4, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 129
    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    .line 58
    invoke-virtual {v7, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    .line 59
    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    goto :goto_1

    .line 130
    :cond_1
    instance-of v5, v1, [B

    if-eqz v5, :cond_5

    .line 131
    move-object v5, v1

    check-cast v5, [B

    .line 132
    array-length v7, v5

    if-lez v7, :cond_2

    .line 133
    invoke-virtual {v4, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 134
    array-length v7, v5

    invoke-virtual {v4, v5, v6, v7}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 141
    :goto_1
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    .line 142
    array-length v5, v4

    const/16 v7, 0xff

    if-le v5, v7, :cond_4

    .line 143
    sget-object p0, Ll/ܺۡ᩵;->ᩳ:Ll/֫᩻֨;

    const-string v0, "Cannot have individual values larger that 255 chars. Offending value: {}"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v1, :cond_3

    const-string v1, ""

    goto :goto_2

    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1, v0}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    .line 146
    :cond_4
    array-length v1, v4

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 147
    array-length v1, v4

    invoke-virtual {v0, v4, v6, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto/16 :goto_0

    .line 139
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid property value: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 149
    :cond_6
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p0, :cond_7

    .line 155
    array-length v0, p0

    if-lez v0, :cond_7

    return-object p0

    :cond_7
    return-object v2

    :catch_0
    move-exception p0

    .line 151
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unexpected exception: "

    .line 0
    invoke-static {v1, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;

    move-result-object p0

    .line 151
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
