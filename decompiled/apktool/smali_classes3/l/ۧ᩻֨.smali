.class public final Ll/ۧ᩻֨;
.super Ljava/lang/Object;
.source "KA2K"


# static fields
.field public static final ֫:[Ljava/lang/String;

.field public static ۧ:Z

.field public static final ܳ:Ll/ۡ᩻֨;

.field public static volatile ܽ:I

.field public static ܿ:Ljava/lang/String;

.field public static final ᩳ:Ll/ۜۚۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 86
    new-instance v0, Ll/ۡ᩻֨;

    invoke-direct {v0}, Ll/ۡ᩻֨;-><init>()V

    sput-object v0, Ll/ۧ᩻֨;->ܳ:Ll/ۡ᩻֨;

    .line 87
    new-instance v0, Ll/ۜۚۜ;

    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 87
    sput-object v0, Ll/ۧ᩻֨;->ᩳ:Ll/ۜۚۜ;

    const-string v0, "slf4j.detectLoggerNameMismatch"

    .line 45
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const-string v1, "true"

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    .line 93
    :goto_1
    sput-boolean v0, Ll/ۧ᩻֨;->ۧ:Z

    const-string v0, "1.6"

    const-string v1, "1.7"

    .line 102
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۧ᩻֨;->֫:[Ljava/lang/String;

    const-string v0, "org/slf4j/impl/StaticLoggerBinder.class"

    .line 295
    sput-object v0, Ll/ۧ᩻֨;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/Class;)Ll/֫᩻֨;
    .locals 4

    .line 388
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v0

    .line 389
    sget-boolean v1, Ll/ۧ᩻֨;->ۧ:Z

    if-eqz v1, :cond_0

    .line 390
    invoke-static {}, Ll/ۖ᩻֨;->֫()Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 401
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_0

    .line 392
    invoke-interface {v0}, Ll/֫᩻֨;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Detected logger name mismatch. Given name: \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"; computed name: \""

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\"."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string p0, "See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"

    .line 394
    invoke-static {p0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/֫᩻֨;
    .locals 1

    .line 362
    invoke-static {}, Ll/ۧ᩻֨;->ܽ()Ll/۟ܳ֨;

    move-result-object v0

    .line 363
    invoke-interface {v0, p0}, Ll/۟ܳ֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object p0

    return-object p0
.end method

.method public static final ֫()V
    .locals 6

    const-string v0, "Reported exception:"

    const-string v1, "Failed to instantiate SLF4J LoggerFactory"

    const/4 v2, 0x2

    .line 145
    :try_start_0
    invoke-static {}, Ll/ۧ᩻֨;->ᩳ()Z

    move-result v3

    if-nez v3, :cond_0

    .line 146
    invoke-static {}, Ll/ۧ᩻֨;->ۧ()Ljava/util/LinkedHashSet;

    move-result-object v3

    .line 147
    invoke-static {v3}, Ll/ۧ᩻֨;->ۧ(Ljava/util/LinkedHashSet;)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 150
    :goto_0
    invoke-static {}, Lorg/slf4j/impl/StaticLoggerBinder;->getSingleton()Lorg/slf4j/impl/StaticLoggerBinder;

    const/4 v4, 0x3

    .line 151
    sput v4, Ll/ۧ᩻֨;->ܽ:I

    .line 152
    invoke-static {v3}, Ll/ۧ᩻֨;->֫(Ljava/util/LinkedHashSet;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    invoke-static {}, Ll/ۧ᩻֨;->ܿ()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v3

    .line 200
    :try_start_1
    sput v2, Ll/ۧ᩻֨;->ܽ:I

    .line 122
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 175
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected initialization failure"

    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception v0

    .line 165
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v3, "org.slf4j.impl.StaticLoggerBinder.getSingleton()"

    .line 166
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 167
    sput v2, Ll/ۧ᩻֨;->ܽ:I

    const-string v1, "slf4j-api 1.6.x (or later) is incompatible with this binding."

    .line 168
    invoke-static {v1}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v1, "Your binding is version 1.5.5 or earlier."

    .line 169
    invoke-static {v1}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v1, "Upgrade your binding to version 1.6.x."

    .line 170
    invoke-static {v1}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    .line 172
    :cond_1
    throw v0

    :catch_2
    move-exception v3

    .line 154
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    const-string v5, "org/slf4j/impl/StaticLoggerBinder"

    .line 133
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "org.slf4j.impl.StaticLoggerBinder"

    .line 135
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_1
    const/4 v0, 0x4

    .line 156
    sput v0, Ll/ۧ᩻֨;->ܽ:I

    const-string v0, "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."

    .line 157
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "Defaulting to no-operation (NOP) logger implementation"

    .line 158
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."

    .line 159
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    invoke-static {}, Ll/ۧ᩻֨;->ܿ()V

    return-void

    .line 200
    :cond_3
    :try_start_2
    sput v2, Ll/ۧ᩻֨;->ܽ:I

    .line 122
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 162
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 177
    :goto_2
    invoke-static {}, Ll/ۧ᩻֨;->ܿ()V

    throw v0
.end method

.method public static ֫(Ljava/util/LinkedHashSet;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 321
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    const/4 v0, 0x1

    if-le p0, v0, :cond_0

    .line 349
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "Actual binding is of type ["

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lorg/slf4j/impl/StaticLoggerBinder;->getSingleton()Lorg/slf4j/impl/StaticLoggerBinder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/slf4j/impl/StaticLoggerBinder;->getLoggerFactoryClassStr()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ۧ()Ljava/util/LinkedHashSet;
    .locals 3

    .line 301
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 303
    :try_start_0
    const-class v1, Ll/ۧ᩻֨;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 305
    sget-object v2, Ll/ۧ᩻֨;->ܿ:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 306
    :try_start_1
    invoke-static {v2}, Ljava/lang/ClassLoader;->getSystemResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v1

    goto :goto_0

    .line 308
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v1

    .line 310
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 311
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/URL;

    .line 312
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    const-string v1, "Error getting resources from path"

    .line 122
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v2, "Reported exception:"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ۧ(Ljava/util/LinkedHashSet;)V
    .locals 3

    .line 321
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    const-string v0, "Class path contains multiple SLF4J bindings."

    .line 331
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    .line 332
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/URL;

    .line 333
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Found binding in ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p0, "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."

    .line 335
    invoke-static {p0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static final ܳ()V
    .locals 6

    .line 268
    :try_start_0
    sget-object v0, Lorg/slf4j/impl/StaticLoggerBinder;->REQUESTED_API_VERSION:Ljava/lang/String;

    .line 271
    sget-object v1, Ll/ۧ᩻֨;->֫:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v5, v1, v3

    .line 272
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    .line 277
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The requested version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " by your slf4j binding is not compatible with "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ll/ۧ᩻֨;->֫:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "See http://www.slf4j.org/codes.html#version_mismatch for further details."

    .line 279
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string v0, "Unexpected problem occured during version sanity check"

    .line 122
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 123
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    const-string v1, "Reported exception:"

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :catch_0
    :cond_2
    return-void
.end method

.method public static ܽ()Ll/۟ܳ֨;
    .locals 4

    .line 413
    sget v0, Ll/ۧ᩻֨;->ܽ:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 414
    const-class v0, Ll/ۧ᩻֨;

    monitor-enter v0

    .line 415
    :try_start_0
    sget v3, Ll/ۧ᩻֨;->ܽ:I

    if-nez v3, :cond_0

    .line 416
    sput v2, Ll/ۧ᩻֨;->ܽ:I

    .line 124
    invoke-static {}, Ll/ۧ᩻֨;->֫()V

    .line 125
    sget v3, Ll/ۧ᩻֨;->ܽ:I

    if-ne v3, v1, :cond_0

    .line 126
    invoke-static {}, Ll/ۧ᩻֨;->ܳ()V

    .line 419
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 421
    :cond_1
    :goto_0
    sget v0, Ll/ۧ᩻֨;->ܽ:I

    if-eq v0, v2, :cond_5

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 425
    sget-object v0, Ll/ۧ᩻֨;->ᩳ:Ll/ۜۚۜ;

    return-object v0

    .line 433
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unreachable code"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 423
    :cond_3
    invoke-static {}, Lorg/slf4j/impl/StaticLoggerBinder;->getSingleton()Lorg/slf4j/impl/StaticLoggerBinder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/slf4j/impl/StaticLoggerBinder;->getLoggerFactory()Ll/۟ܳ֨;

    move-result-object v0

    return-object v0

    .line 427
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 431
    :cond_5
    sget-object v0, Ll/ۧ᩻֨;->ܳ:Ll/ۡ᩻֨;

    return-object v0
.end method

.method public static ܿ()V
    .locals 10

    .line 189
    sget-object v1, Ll/ۧ᩻֨;->ܳ:Ll/ۡ᩻֨;

    move-object v0, v1

    monitor-enter v0

    .line 190
    :try_start_0
    invoke-virtual {v1}, Ll/ۡ᩻֨;->ᩳ()V

    .line 191
    invoke-virtual {v1}, Ll/ۡ᩻֨;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ᩻֨;

    .line 192
    invoke-virtual {v2}, Ll/ۢ᩻֨;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ۧ᩻֨;->֫(Ljava/lang/String;)Ll/֫᩻֨;

    move-result-object v3

    .line 193
    invoke-virtual {v2, v3}, Ll/ۢ᩻֨;->֫(Ll/֫᩻֨;)V

    goto :goto_0

    .line 195
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    sget-object v0, Ll/ۧ᩻֨;->ܳ:Ll/ۡ᩻֨;

    invoke-virtual {v0}, Ll/ۡ᩻֨;->ۧ()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v1

    .line 206
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v2

    .line 209
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0x80

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    .line 211
    :goto_1
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->drainTo(Ljava/util/Collection;I)I

    move-result v5

    if-nez v5, :cond_1

    .line 185
    sget-object v0, Ll/ۧ᩻֨;->ܳ:Ll/ۡ᩻֨;

    invoke-virtual {v0}, Ll/ۡ᩻֨;->֫()V

    return-void

    .line 214
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳ᩻֨;

    if-nez v6, :cond_2

    goto :goto_3

    .line 237
    :cond_2
    invoke-virtual {v6}, Ll/ܳ᩻֨;->֫()Ll/ۢ᩻֨;

    move-result-object v7

    .line 238
    invoke-virtual {v7}, Ll/ۢ᩻֨;->getName()Ljava/lang/String;

    move-result-object v8

    .line 239
    invoke-virtual {v7}, Ll/ۢ᩻֨;->᩻()Z

    move-result v9

    if-nez v9, :cond_8

    .line 243
    invoke-virtual {v7}, Ll/ۢ᩻֨;->ܳ()Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_3

    .line 245
    :cond_3
    invoke-virtual {v7}, Ll/ۢ᩻֨;->ܿ()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 246
    invoke-virtual {v7, v6}, Ll/ۢ᩻֨;->֫(Ll/ܳ᩻֨;)V

    goto :goto_3

    .line 248
    :cond_4
    invoke-static {v8}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    :goto_3
    add-int/lit8 v7, v0, 0x1

    if-nez v0, :cond_7

    .line 224
    invoke-virtual {v6}, Ll/ܳ᩻֨;->֫()Ll/ۢ᩻֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ᩻֨;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v6, "A number ("

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ") of logging calls during the initialization phase have been intercepted and are"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "now being replayed. These are subject to the filtering rules of the underlying logging system."

    .line 262
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "See also http://www.slf4j.org/codes.html#replay"

    .line 263
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    goto :goto_4

    .line 226
    :cond_5
    invoke-virtual {v6}, Ll/ܳ᩻֨;->֫()Ll/ۢ᩻֨;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ᩻֨;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    const-string v0, "The following set of substitute loggers may have been accessed"

    .line 253
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "during the initialization phase. Logging calls during this"

    .line 254
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "phase were not honored. However, subsequent logging calls to these"

    .line 255
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "loggers will work as normally expected."

    .line 256
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    const-string v0, "See also http://www.slf4j.org/codes.html#substituteLogger"

    .line 257
    invoke-static {v0}, Ll/ۖ᩻֨;->֫(Ljava/lang/String;)V

    :cond_7
    :goto_4
    move v0, v7

    goto/16 :goto_2

    .line 240
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Delegate logger cannot be null at this state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 219
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    goto/16 :goto_1

    :catchall_0
    move-exception v1

    .line 195
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ᩳ()Z
    .locals 2

    const-string v0, "java.vendor.url"

    .line 45
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 343
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method
