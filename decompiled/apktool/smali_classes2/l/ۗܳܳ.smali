.class public final Ll/ۗܳܳ;
.super Ljava/lang/Object;
.source "37C1"


# static fields
.field public static final ֫:[Ljava/lang/String;

.field public static final ۧ:Ljava/util/regex/Pattern;

.field public static final ܽ:Ljava/util/Set;

.field public static final ᩳ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۗܳܳ;->ᩳ:Ljava/lang/Object;

    const-string v0, "-lnt:numbers,table"

    const-string v1, "-lvt"

    .line 27
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۗܳܳ;->֫:[Ljava/lang/String;

    const-string v0, "^\\s*//\\s*(\\d+)#(?:.*)?$"

    .line 32
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۗܳܳ;->ۧ:Ljava/util/regex/Pattern;

    const/16 v0, 0x9

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "var"

    aput-object v3, v1, v2

    const-string v3, "type"

    const/4 v4, 0x1

    aput-object v3, v1, v4

    const-string v3, "endvar"

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-string v3, "endtype"

    const/4 v4, 0x3

    aput-object v3, v1, v4

    const-string v3, "try"

    const/4 v4, 0x4

    aput-object v3, v1, v4

    const-string v3, "endtry"

    const/4 v4, 0x5

    aput-object v3, v1, v4

    const-string v3, "catch"

    const/4 v4, 0x6

    aput-object v3, v1, v4

    const-string v3, "locals_map"

    const/4 v4, 0x7

    aput-object v3, v1, v4

    const-string v3, "stack_map"

    const/16 v4, 0x8

    aput-object v3, v1, v4

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, v1, v2

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v4, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 37
    sput-object v0, Ll/ۗܳܳ;->ܽ:Ljava/util/Set;

    return-void
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 7

    const-string v1, "Jdis disassembly produced "

    .line 58
    array-length v0, p0

    if-eqz v0, :cond_3

    .line 61
    sget-object v0, Ll/ۗܳܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x0

    .line 63
    :try_start_0
    new-instance v3, Ll/֡۬ۚ;

    invoke-direct {v3}, Ll/֡۬ۚ;-><init>()V

    .line 64
    new-instance v4, Ll/᩸۬ۚ;

    invoke-direct {v4}, Ll/᩸۬ۚ;-><init>()V

    .line 65
    new-instance v5, Ll/ۙܽ֨;

    new-instance v6, Ll/֫۬ۚ;

    invoke-direct {v6, p0}, Ll/֫۬ۚ;-><init>([B)V

    sget-object p0, Ll/ۗܳܳ;->֫:[Ljava/lang/String;

    invoke-direct {v5, v3, v4, v6, p0}, Ll/ۙܽ֨;-><init>(Ll/֡۬ۚ;Ll/᩸۬ۚ;Ll/֫۬ۚ;[Ljava/lang/String;)V

    .line 67
    invoke-virtual {v5}, Ll/ۙܽ֨;->ۧ()I

    move-result p0

    if-nez p0, :cond_2

    .line 71
    invoke-virtual {v3}, Ll/֡۬ۚ;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 v5, 0x1

    if-ne p0, v5, :cond_1

    .line 77
    invoke-virtual {v3}, Ll/֡۬ۚ;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩵۬ۚ;

    invoke-virtual {p0}, Ll/᩵۬ۚ;->֫()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 78
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 82
    invoke-static {p0}, Ll/ۗܳܳ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ll/۬ܳܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :cond_0
    :try_start_2
    const-string p0, "Jdis disassembly succeeded but produced no jasm text."

    .line 80
    invoke-virtual {v4}, Ll/᩸۬ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 79
    invoke-static {p0, v1, v2}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0

    .line 73
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " jasm outputs, but this API only supports a single output."

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 75
    invoke-virtual {v4}, Ll/᩸۬ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-static {p0, v1, v2}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0

    :cond_2
    const-string p0, "Jdis disassembly failed."

    .line 69
    invoke-virtual {v4}, Ll/᩸۬ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v2}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0
    :try_end_2
    .catch Ll/۬ܳܳ; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_3
    const-string v1, "Unexpected exception while running Jdis."

    .line 86
    invoke-static {v1, v2, p0}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 84
    throw p0

    .line 88
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0

    .line 59
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "classBytes must not be empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;
    .locals 1

    if-eqz p1, :cond_0

    .line 146
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    if-eqz p2, :cond_1

    .line 147
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    if-eqz p1, :cond_2

    .line 149
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 152
    :cond_2
    new-instance p1, Ll/۬ܳܳ;

    .line 19
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 8

    const-string v1, "Jasm assembly produced "

    if-eqz p0, :cond_4

    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 105
    sget-object v0, Ll/ۗܳܳ;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    const/4 v2, 0x0

    .line 107
    :try_start_0
    new-instance v3, Ll/ۢ۬ۚ;

    invoke-direct {v3}, Ll/ۢ۬ۚ;-><init>()V

    .line 108
    new-instance v4, Ll/᩸۬ۚ;

    invoke-direct {v4}, Ll/᩸۬ۚ;-><init>()V

    .line 109
    new-instance v5, Ll/۬ۨۚ;

    new-instance v6, Ll/ܿ۬ۚ;

    .line 30
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v6, p0}, Ll/֫۬ۚ;-><init>([B)V

    .line 109
    invoke-direct {v5, v3, v4, v6}, Ll/۬ۨۚ;-><init>(Ll/ۢ۬ۚ;Ll/᩸۬ۚ;Ll/ܿ۬ۚ;)V

    .line 111
    invoke-virtual {v5}, Ll/۬ۨۚ;->ۧ()I

    move-result p0

    if-nez p0, :cond_2

    .line 115
    invoke-virtual {v3}, Ll/ۢ۬ۚ;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    const/4 v5, 0x1

    if-ne p0, v5, :cond_1

    .line 121
    invoke-virtual {v3}, Ll/ۢ۬ۚ;->ܽ()Ljava/util/ArrayList;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩷۬ۚ;

    invoke-virtual {p0}, Ll/᩷۬ۚ;->֫()[B

    move-result-object p0

    if-eqz p0, :cond_0

    .line 122
    array-length v1, p0
    :try_end_0
    .catch Ll/۬ܳܳ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 126
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p0

    :cond_0
    :try_start_2
    const-string p0, "Jasm assembly succeeded but produced no class data."

    .line 124
    invoke-virtual {v4}, Ll/᩸۬ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-static {p0, v1, v2}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0

    .line 117
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " class outputs, but this API only supports a single output."

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 119
    invoke-virtual {v4}, Ll/᩸۬ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    .line 117
    invoke-static {p0, v1, v2}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0

    :cond_2
    const-string p0, "Jasm assembly failed."

    .line 113
    invoke-virtual {v4}, Ll/᩸۬ۚ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v2}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0
    :try_end_2
    .catch Ll/۬ܳܳ; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_3
    const-string v1, "Unexpected exception while running Jasm."

    .line 130
    invoke-static {v1, v2, p0}, Ll/ۗܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/RuntimeException;)Ll/۬ܳܳ;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 128
    throw p0

    .line 132
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0

    .line 103
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "jasmSource must not be blank."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 100
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "jasmSource must not be null."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    const-string v0, "\r\n"

    .line 162
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "\n"

    :goto_0
    const-string v1, "\\R"

    const/4 v2, -0x1

    .line 163
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    .line 164
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/lit8 p0, p0, 0x40

    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 p0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    .line 166
    :goto_1
    array-length v6, v1

    if-ge v4, v6, :cond_c

    .line 167
    aget-object v6, v1, v4

    .line 168
    sget-object v7, Ll/ۗܳܳ;->ۧ:Ljava/util/regex/Pattern;

    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    .line 169
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->matches()Z

    move-result v8

    const/4 v9, 0x1

    if-eqz v8, :cond_1

    .line 170
    invoke-virtual {v7, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_6

    :cond_1
    if-eqz v5, :cond_a

    .line 192
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 193
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, "//"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, ";"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "line "

    .line 196
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, "LineTable"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9

    const-string v8, "SourceFile"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_4

    :cond_3
    const/16 v8, 0x3a

    .line 199
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-lez v8, :cond_6

    .line 201
    invoke-virtual {v7, p0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    .line 202
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_6

    const/4 v11, 0x0

    .line 30
    :goto_2
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v11, v12, :cond_5

    .line 31
    invoke-virtual {v10, v11}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v12

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 203
    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    :cond_6
    :goto_3
    const/16 v8, 0x20

    .line 206
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    if-gez v8, :cond_7

    const/16 v8, 0x3b

    .line 208
    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(I)I

    move-result v8

    :cond_7
    if-gez v8, :cond_8

    goto :goto_4

    .line 213
    :cond_8
    invoke-virtual {v7, p0, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 214
    sget-object v8, Ll/ۗܳܳ;->ܽ:Ljava/util/Set;

    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    xor-int/2addr v7, v9

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_a

    const-string v7, "  // line "

    .line 0
    invoke-static {v6, v7, v5}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v5, v3

    .line 177
    :cond_a
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    array-length v6, v1

    sub-int/2addr v6, v9

    if-ge v4, v6, :cond_b

    .line 179
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 182
    :cond_c
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
