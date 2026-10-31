.class public abstract Ll/ۘᩴۖ;
.super Ll/ۡۜۖ;
.source "X93U"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static alwaysUseFieldBuilders:Z = false

.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public unknownFields:Ll/ۢ֨ۖ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Ll/ۡۜۖ;-><init>()V

    .line 64
    invoke-static {}, Ll/ۢ֨ۖ;->ܽ()Ll/ۢ֨ۖ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘᩴۖ;->unknownFields:Ll/ۢ֨ۖ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۘۖ;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ll/ۡۜۖ;-><init>()V

    .line 68
    invoke-virtual {p1}, Ll/᩶ۘۖ;->getUnknownFields()Ll/ۢ֨ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘᩴۖ;->unknownFields:Ll/ۢ֨ۖ;

    return-void
.end method

.method public static ֫(ILjava/lang/Object;)I
    .locals 1

    .line 3156
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3157
    check-cast p1, Ljava/lang/String;

    .line 600
    invoke-static {p0}, Ll/ܳ᩷ۖ;->ܳ(I)I

    move-result p0

    invoke-static {p1}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result p1

    add-int/2addr p1, p0

    return p1

    .line 3159
    :cond_0
    check-cast p1, Ll/ۛۜۖ;

    invoke-static {p0, p1}, Ll/ܳ᩷ۖ;->ܽ(ILl/ۛۜۖ;)I

    move-result p0

    return p0
.end method

.method public static synthetic ֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 46
    invoke-static {p0, p1, p2}, Ll/ۘᩴۖ;->ۧ(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 0

    .line 46
    invoke-static {p0, p1, p2}, Ll/ۘᩴۖ;->ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۘᩴۖ;Z)Ljava/util/Map;
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Ll/ۘᩴۖ;->֫(Z)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Z)Ljava/util/Map;
    .locals 6

    .line 138
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 139
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v1

    .line 141
    invoke-static {v1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;)Ll/ᩳۖۖ;

    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    .line 144
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 145
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ۖۖ;

    .line 146
    invoke-virtual {v3}, Ll/֡ۖۖ;->ܺ()Ll/ܶۖۖ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 154
    invoke-virtual {v4}, Ll/ܶۖۖ;->ᩴ()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    add-int/2addr v2, v3

    .line 155
    invoke-virtual {p0, v4}, Ll/ۘᩴۖ;->hasOneof(Ll/ܶۖۖ;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    .line 160
    :cond_0
    invoke-virtual {p0, v4}, Ll/ۘᩴۖ;->getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;

    move-result-object v3

    goto :goto_1

    .line 163
    :cond_1
    invoke-virtual {v3}, Ll/֡ۖۖ;->۟֫()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 164
    invoke-virtual {p0, v3}, Ll/ۘᩴۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 165
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    .line 166
    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 170
    :cond_2
    invoke-virtual {p0, v3}, Ll/ۘᩴۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 175
    invoke-virtual {v3}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v4

    sget-object v5, Ll/ᩴۖۖ;->᩺:Ll/ᩴۖۖ;

    if-ne v4, v5, :cond_4

    .line 176
    invoke-virtual {p0, v3}, Ll/ۘᩴۖ;->getFieldRaw(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 178
    :cond_4
    invoke-virtual {p0, v3}, Ll/ۘᩴۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_6
    return-object v0
.end method

.method public static synthetic ֫(Ll/ۨۖۖ;)Ll/ۛۖۖ;
    .locals 0

    .line 46
    invoke-static {p0}, Ll/ۘᩴۖ;->ۧ(Ll/ۨۖۖ;)Ll/ۛۖۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/Class;Ll/᩻֡ۖ;)Ll/ܺᩴۖ;
    .locals 3

    .line 1634
    new-instance v0, Ll/ܺᩴۖ;

    const/4 v1, 0x0

    sget-object v2, Ll/ۤۖۖ;->᩹:Ll/ۤۖۖ;

    invoke-direct {v0, v1, p0, p1, v2}, Ll/ܺᩴۖ;-><init>(Ll/ܶۘۖ;Ljava/lang/Class;Ll/᩻֡ۖ;Ll/ۤۖۖ;)V

    return-object v0
.end method

.method public static ֫(Ll/᩻֡ۖ;ILjava/lang/Class;Ll/᩻֡ۖ;)Ll/ܺᩴۖ;
    .locals 2

    .line 1615
    new-instance v0, Ll/ܺᩴۖ;

    new-instance v1, Ll/ܶۘۖ;

    invoke-direct {v1, p0, p1}, Ll/ܶۘۖ;-><init>(Ll/᩻֡ۖ;I)V

    sget-object p0, Ll/ۤۖۖ;->᩹:Ll/ۤۖۖ;

    invoke-direct {v0, v1, p2, p3, p0}, Ll/ܺᩴۖ;-><init>(Ll/ܶۘۖ;Ljava/lang/Class;Ll/᩻֡ۖ;Ll/ۤۖۖ;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Class;)Ll/᩺ᩴۖ;
    .locals 0

    .line 427
    invoke-static {}, Ll/᩺֡ۖ;->ܽ()Ll/᩺֡ۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩺ᩴۖ;)Ll/᩺ᩴۖ;
    .locals 1

    const/4 v0, 0x0

    .line 408
    invoke-static {p0, v0}, Ll/ۘᩴۖ;->֫(Ll/᩺ᩴۖ;I)Ll/᩺ᩴۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩺ᩴۖ;I)Ll/᩺ᩴۖ;
    .locals 1

    .line 414
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gt p1, v0, :cond_0

    mul-int/lit8 p1, v0, 0x2

    :cond_0
    if-gtz p1, :cond_1

    const/16 p1, 0xa

    .line 422
    :cond_1
    invoke-interface {p0, p1}, Ll/᩺ᩴۖ;->᩷(I)Ll/᩺ᩴۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;
    .locals 0

    .line 367
    :try_start_0
    invoke-interface {p0, p1}, Ll/۫֡ۖ;->parseDelimitedFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 369
    invoke-virtual {p0}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;
    .locals 0

    .line 377
    :try_start_0
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parseDelimitedFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 379
    invoke-virtual {p0}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/۫֡ۖ;Ll/۟ۜۖ;)Ll/᩻֡ۖ;
    .locals 0

    .line 345
    :try_start_0
    invoke-interface {p0, p1}, Ll/۫֡ۖ;->parseFrom(Ll/۟ۜۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 347
    invoke-virtual {p0}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/۫֡ۖ;Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;
    .locals 0

    .line 356
    :try_start_0
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parseFrom(Ll/۟ۜۖ;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 358
    invoke-virtual {p0}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ܳ᩷ۖ;ILjava/lang/Object;)V
    .locals 1

    .line 3173
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3174
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->֫(ILjava/lang/String;)V

    return-void

    .line 3176
    :cond_0
    check-cast p2, Ll/ۛۜۖ;

    invoke-virtual {p0, p1, p2}, Ll/ܳ᩷ۖ;->֫(ILl/ۛۜۖ;)V

    return-void
.end method

.method public static ֫(Ll/ܳ᩷ۖ;Ljava/lang/Object;)V
    .locals 1

    .line 3182
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3183
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->֫(Ljava/lang/String;)V

    return-void

    .line 3185
    :cond_0
    check-cast p1, Ll/ۛۜۖ;

    invoke-virtual {p0, p1}, Ll/ܳ᩷ۖ;->֫(Ll/ۛۜۖ;)V

    return-void
.end method

.method public static ֫(Ll/ܳ᩷ۖ;Ljava/util/Map;Ll/᩶᩵ۖ;I)V
    .locals 0

    .line 3293
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    .line 3297
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    .line 228
    throw p0
.end method

.method public static ֫(Ll/ܳ᩷ۖ;Ljava/util/Map;Ll/᩶᩵ۖ;IZ)V
    .locals 0

    .line 3283
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    .line 3285
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    .line 228
    throw p0
.end method

.method public static ֫(Ll/ܳ᩷ۖ;Ll/ܰ᩵ۖ;Ll/᩶᩵ۖ;I)V
    .locals 0

    .line 3267
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p1

    .line 3268
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3269
    invoke-static {p0, p1, p2, p3}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;Ljava/util/Map;Ll/᩶᩵ۖ;I)V

    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 384
    invoke-static {}, Ll/᩸֨ۖ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ll/᩸֨ۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static varargs ۧ(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1898
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1903
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 1904
    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    .line 1906
    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    .line 1907
    check-cast p0, Ljava/lang/Error;

    throw p0

    .line 1909
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 1905
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    .line 1900
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static varargs ۧ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    .line 1885
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p2

    .line 1887
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Generated message class \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1888
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\" missing method \""

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۧ(Ll/ۨۖۖ;)Ll/ۛۖۖ;
    .locals 1

    .line 3140
    invoke-virtual {p0}, Ll/ۨۖۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3144
    check-cast p0, Ll/ۛۖۖ;

    return-object p0

    .line 3141
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected non-lite extension."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ()Ll/᩶ᩴۖ;
    .locals 1

    .line 404
    invoke-static {}, Ll/ۚۜۖ;->ܽ()Ll/ۚۜۖ;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;)Ll/᩻֡ۖ;
    .locals 0

    .line 324
    :try_start_0
    invoke-interface {p0, p1}, Ll/۫֡ۖ;->parseFrom(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 326
    invoke-virtual {p0}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ll/۫֡ۖ;Ljava/io/InputStream;Ll/ᩳۘۖ;)Ll/᩻֡ۖ;
    .locals 0

    .line 334
    :try_start_0
    invoke-interface {p0, p1, p2}, Ll/۫֡ۖ;->parseFrom(Ljava/io/InputStream;Ll/ᩳۘۖ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻֡ۖ;
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 336
    invoke-virtual {p0}, Ll/֫᩵ۖ;->֫()Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method

.method public static ۧ(Ll/ܳ᩷ۖ;Ll/ܰ᩵ۖ;Ll/᩶᩵ۖ;I)V
    .locals 0

    .line 3195
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p1

    .line 3196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3197
    invoke-static {p0, p1, p2, p3}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;Ljava/util/Map;Ll/᩶᩵ۖ;I)V

    return-void
.end method

.method public static ۧ(Z)V
    .locals 0

    .line 95
    sput-boolean p0, Ll/ۘᩴۖ;->alwaysUseFieldBuilders:Z

    return-void
.end method

.method public static ܳ()Ll/ۨᩴۖ;
    .locals 1

    .line 392
    invoke-static {}, Ll/ۚ᩵ۖ;->ܽ()Ll/ۚ᩵ۖ;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ(Ljava/lang/Object;)I
    .locals 1

    .line 3164
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3165
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ܳ᩷ۖ;->ۧ(Ljava/lang/String;)I

    move-result p0

    return p0

    .line 3167
    :cond_0
    check-cast p0, Ll/ۛۜۖ;

    sget v0, Ll/ܳ᩷ۖ;->ۧ:I

    .line 845
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result p0

    .line 869
    invoke-static {p0}, Ll/ܳ᩷ۖ;->᩻(I)I

    move-result v0

    add-int/2addr v0, p0

    return v0
.end method

.method public static ܽ()Ll/ۙᩴۖ;
    .locals 1

    .line 400
    invoke-static {}, Ll/᩶ۖۖ;->ܽ()Ll/᩶ۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public static ܽ(Ll/ܳ᩷ۖ;Ll/ܰ᩵ۖ;Ll/᩶᩵ۖ;I)V
    .locals 0

    .line 3220
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p1

    .line 3221
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3222
    invoke-static {p0, p1, p2, p3}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;Ljava/util/Map;Ll/᩶᩵ۖ;I)V

    return-void
.end method

.method public static ܿ()Ll/ۛᩴۖ;
    .locals 1

    .line 388
    invoke-static {}, Ll/᩹ᩴۖ;->ܽ()Ll/᩹ᩴۖ;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ()Ll/ۤᩴۖ;
    .locals 1

    .line 396
    invoke-static {}, Ll/۠ۘۖ;->ܽ()Ll/۠ۘۖ;

    move-result-object v0

    return-object v0
.end method

.method public static ᩳ(Ll/ܳ᩷ۖ;Ll/ܰ᩵ۖ;Ll/᩶᩵ۖ;I)V
    .locals 0

    .line 3244
    invoke-virtual {p1}, Ll/ܰ᩵ۖ;->ܳ()Ljava/util/Map;

    move-result-object p1

    .line 3245
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3246
    invoke-static {p0, p1, p2, p3}, Ll/ۘᩴۖ;->֫(Ll/ܳ᩷ۖ;Ljava/util/Map;Ll/᩶᩵ۖ;I)V

    return-void
.end method

.method public static ᩳ(Ljava/lang/Object;)Z
    .locals 1

    .line 3148
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3149
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    return p0

    .line 3151
    :cond_0
    check-cast p0, Ll/ۛۜۖ;

    .line 217
    invoke-virtual {p0}, Ll/ۛۜۖ;->size()I

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩻()V
    .locals 1

    const/4 v0, 0x1

    .line 83
    invoke-static {v0}, Ll/ۘᩴۖ;->ۧ(Z)V

    return-void
.end method


# virtual methods
.method public getAllFields()Ljava/util/Map;
    .locals 1

    const/4 v0, 0x0

    .line 217
    invoke-direct {p0, v0}, Ll/ۘᩴۖ;->֫(Z)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getAllFieldsRaw()Ljava/util/Map;
    .locals 1

    const/4 v0, 0x1

    .line 229
    invoke-direct {p0, v0}, Ll/ۘᩴۖ;->֫(Z)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Ll/ᩳۖۖ;
    .locals 1

    .line 106
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;)Ll/ᩳۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public getField(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 1

    .line 249
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getFieldRaw(Ll/֡ۖۖ;)Ljava/lang/Object;
    .locals 1

    .line 260
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->ܽ(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getOneofFieldDescriptor(Ll/ܶۖۖ;)Ll/֡ۖۖ;
    .locals 1

    .line 239
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/ܶۖۖ;)Ll/᩺ۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/᩺ۘۖ;->֫(Ll/ۘᩴۖ;)Ll/֡ۖۖ;

    move-result-object p1

    return-object p1
.end method

.method public getParserForType()Ll/۫֡ۖ;
    .locals 2

    .line 74
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is supposed to be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getRepeatedField(Ll/֡ۖۖ;I)Ljava/lang/Object;
    .locals 1

    .line 270
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p2, p0}, Ll/ۛۘۖ;->֫(ILl/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getRepeatedFieldCount(Ll/֡ۖۖ;)I
    .locals 1

    .line 265
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->ᩳ(Ll/ۘᩴۖ;)I

    move-result p1

    return p1
.end method

.method public getSerializedSize()I
    .locals 2

    .line 437
    iget v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 443
    :cond_0
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getAllFieldsRaw()Ljava/util/Map;

    move-result-object v0

    .line 442
    invoke-static {p0, v0}, Ll/۠֡ۖ;->֫(Ll/ۡۜۖ;Ljava/util/Map;)I

    move-result v0

    iput v0, p0, Ll/ۡۜۖ;->memoizedSize:I

    return v0
.end method

.method public getUnknownFields()Ll/ۢ֨ۖ;
    .locals 1

    .line 276
    iget-object v0, p0, Ll/ۘᩴۖ;->unknownFields:Ll/ۢ֨ۖ;

    return-object v0
.end method

.method public hasField(Ll/֡ۖۖ;)Z
    .locals 1

    .line 244
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/֡ۖۖ;)Ll/ۛۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/ۛۘۖ;->ۧ(Ll/ۘᩴۖ;)Z

    move-result p1

    return p1
.end method

.method public hasOneof(Ll/ܶۖۖ;)Z
    .locals 1

    .line 234
    invoke-virtual {p0}, Ll/ۘᩴۖ;->internalGetFieldAccessorTable()Ll/ۢᩴۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢᩴۖ;->֫(Ll/ۢᩴۖ;Ll/ܶۖۖ;)Ll/᩺ۘۖ;

    move-result-object p1

    invoke-interface {p1, p0}, Ll/᩺ۘۖ;->ۧ(Ll/ۘᩴۖ;)Z

    move-result p1

    return p1
.end method

.method public abstract internalGetFieldAccessorTable()Ll/ۢᩴۖ;
.end method

.method public internalGetMapField(I)Ll/ܰ᩵ۖ;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1935
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "No map fields found in "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public internalGetMapFieldReflection(I)Ll/֫֡ۖ;
    .locals 0

    .line 1926
    invoke-virtual {p0, p1}, Ll/ۘᩴۖ;->internalGetMapField(I)Ll/ܰ᩵ۖ;

    move-result-object p1

    return-object p1
.end method

.method public isInitialized()Z
    .locals 5

    .line 187
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getDescriptorForType()Ll/ᩳۖۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۖۖ;

    .line 189
    invoke-virtual {v1}, Ll/֡ۖۖ;->ۛ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 190
    invoke-virtual {p0, v1}, Ll/ۘᩴۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v2

    if-nez v2, :cond_1

    return v3

    .line 195
    :cond_1
    invoke-virtual {v1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    move-result-object v2

    sget-object v4, Ll/ᩴۖۖ;->ۨ:Ll/ᩴۖۖ;

    if-ne v2, v4, :cond_0

    .line 196
    invoke-virtual {v1}, Ll/֡ۖۖ;->۟֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 198
    invoke-virtual {p0, v1}, Ll/ۘᩴۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 199
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻֡ۖ;

    .line 200
    invoke-interface {v2}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v2

    if-nez v2, :cond_2

    return v3

    .line 205
    :cond_3
    invoke-virtual {p0, v1}, Ll/ۘᩴۖ;->hasField(Ll/֡ۖۖ;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Ll/ۘᩴۖ;->getField(Ll/֡ۖۖ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻֡ۖ;

    invoke-interface {v1}, Ll/ܺ֡ۖ;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_0

    return v3

    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public mergeFromAndMakeImmutableInternal(Ll/۟ۜۖ;Ll/ᩳۘۖ;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 119
    invoke-static {}, Ll/ۨ֡ۖ;->֫()Ll/ۨ֡ۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨ֡ۖ;->֫(Ljava/lang/Class;)Ll/ۢۚۖ;

    move-result-object v0

    .line 121
    :try_start_0
    invoke-static {p1}, Ll/֫᩷ۖ;->֫(Ll/۟ۜۖ;)Ll/֫᩷ۖ;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;Ll/ۧۚۖ;Ll/ᩳۘۖ;)V
    :try_end_0
    .catch Ll/֫᩵ۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    invoke-interface {v0, p0}, Ll/ۢۚۖ;->֫(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception p1

    .line 125
    new-instance p2, Ll/֫᩵ۖ;

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    invoke-virtual {p2, p0}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p2

    :catch_1
    move-exception p1

    .line 123
    invoke-virtual {p1, p0}, Ll/֫᩵ۖ;->֫(Ll/ۡ֡ۖ;)V

    throw p1
.end method

.method public newInstance(Ll/ۖᩴۖ;)Ljava/lang/Object;
    .locals 1

    .line 463
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This method must be overridden by the subclass."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public parseUnknownField(Ll/۟ۜۖ;Ll/ܳ֨ۖ;Ll/ᩳۘۖ;I)Z
    .locals 0

    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    invoke-virtual {p2, p4, p1}, Ll/ܳ֨ۖ;->֫(ILl/۟ۜۖ;)Z

    move-result p1

    return p1
.end method

.method public parseUnknownFieldProto3(Ll/۟ۜۖ;Ll/ܳ֨ۖ;Ll/ᩳۘۖ;I)Z
    .locals 0

    .line 316
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۘᩴۖ;->parseUnknownField(Ll/۟ۜۖ;Ll/ܳ֨ۖ;Ll/ᩳۘۖ;I)Z

    move-result p1

    return p1
.end method

.method public setUnknownFields(Ll/ۢ֨ۖ;)V
    .locals 0

    .line 282
    iput-object p1, p0, Ll/ۘᩴۖ;->unknownFields:Ll/ۢ֨ۖ;

    return-void
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 3132
    new-instance v0, Ll/ܶᩴۖ;

    invoke-direct {v0, p0}, Ll/ܶᩴۖ;-><init>(Ll/ۘᩴۖ;)V

    return-object v0
.end method

.method public writeTo(Ll/ܳ᩷ۖ;)V
    .locals 1

    .line 432
    invoke-virtual {p0}, Ll/ۘᩴۖ;->getAllFieldsRaw()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0, p1}, Ll/۠֡ۖ;->֫(Ll/ۡۜۖ;Ljava/util/Map;Ll/ܳ᩷ۖ;)V

    return-void
.end method
