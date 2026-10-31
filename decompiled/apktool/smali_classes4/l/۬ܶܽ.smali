.class public Ll/۬ܶܽ;
.super Ll/ۗܶۢ;
.source "MB7O"


# static fields
.field public static final synthetic ᩵֫:I


# instance fields
.field public ۖ֫:Ll/ܶ᩵ܿ;

.field public ۘ֫:Ll/ܶ᩵ܿ;

.field public ۡ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ܺ֫:Z

.field public ᩴ֫:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ll/ۗܶۢ;-><init>()V

    .line 60
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/۬ܶܽ;->ۡ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 61
    sget-object v0, Ll/ܽ֡ܿ;->᩷:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/۬ܶܽ;->ۘ֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method private ֫(Landroid/content/ContextWrapper;Ll/ܿ۠ۢ;)V
    .locals 2

    .line 188
    invoke-virtual {p2}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 189
    iget-object p2, p0, Ll/۬ܶܽ;->ۡ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    if-nez p2, :cond_0

    .line 190
    iget-object p1, p0, Ll/۬ܶܽ;->ۖ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    const p1, 0x7f1206ed

    .line 191
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    return-void

    .line 193
    :cond_0
    new-instance p2, Landroid/content/Intent;

    const-class v0, Ll/᩹ۖ᩷;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 194
    iget-object v0, p0, Ll/۬ܶܽ;->ۖ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܶۧ()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "saveAsPath"

    .line 195
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "savedAsPath"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    const/4 p2, 0x1

    .line 183
    iput-boolean p2, p0, Ll/۬ܶܽ;->ܺ֫:Z

    .line 184
    invoke-direct {p0, p1, p4}, Ll/۬ܶܽ;->֫(Landroid/content/ContextWrapper;Ll/ܿ۠ۢ;)V

    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "saveAsPath"

    .line 70
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f1205b7

    .line 651
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 70
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2d

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 65
    sget-object v0, Ll/᩻ܶۢ;->ܽ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 15

    .line 82
    iget-object v0, p0, Ll/۬ܶܽ;->ۘ֫:Ll/ܶ᩵ܿ;

    const-string v1, "saveAsPath"

    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, "inputPath1"

    .line 83
    invoke-virtual {p0, v2}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    const-string v3, "inputPath2"

    .line 84
    invoke-virtual {p0, v3}, Ll/ۘ۠ۢ;->֡(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 85
    sget-object v4, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ᩴ֫()Ll/ܶ᩵ܿ;

    move-result-object v4

    iput-object v4, p0, Ll/۬ܶܽ;->ᩴ֫:Ll/ܶ᩵ܿ;

    .line 86
    new-instance v5, Ll/ۡܰۡ;

    invoke-direct {v5, v4}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    const/4 v4, 0x0

    .line 87
    :try_start_0
    invoke-virtual {v5, v4}, Ll/ۡܰۡ;->ۧ(I)V

    .line 88
    new-instance v6, Ljava/io/BufferedOutputStream;

    invoke-virtual {v5}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 89
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    aput-object v7, v9, v4

    const v7, 0x7f1207a8

    invoke-static {v7, v9}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 90
    invoke-static {v2}, Ll/۫ܶܽ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 91
    invoke-static {v9, v0}, Ll/۫ۨ᩷;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    const-string v12, "a/"

    if-eqz v11, :cond_1

    :try_start_1
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۙۨ᩷;

    .line 92
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ll/ۙۨ᩷;->֫()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v5, v13}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v11, v6}, Ll/ۙۨ᩷;->֫(Ljava/io/OutputStream;)V

    .line 94
    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V

    .line 95
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v11

    if-eqz v11, :cond_0

    .line 99
    :cond_1
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    if-eq v9, v2, :cond_2

    .line 101
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۫()Z

    .line 103
    :cond_2
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 104
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 124
    invoke-virtual {v5}, Ll/ۡܰۡ;->close()V

    return-object v0

    .line 106
    :cond_3
    :try_start_2
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 107
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v9

    new-array v8, v8, [Ljava/lang/Object;

    aput-object v9, v8, v4

    invoke-static {v7, v8}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    .line 108
    invoke-static {v3}, Ll/۫ܶܽ;->֫(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 109
    invoke-static {v4, v0}, Ll/۫ۨ᩷;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const-string v9, "b/"

    if-eqz v8, :cond_5

    :try_start_3
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۙۨ᩷;

    .line 110
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ll/ۙۨ᩷;->֫()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v8, v6}, Ll/ۙۨ᩷;->֫(Ljava/io/OutputStream;)V

    .line 112
    invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V

    .line 113
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 117
    :cond_5
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    if-eq v4, v3, :cond_6

    .line 119
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->۫()Z

    .line 121
    :cond_6
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 122
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 124
    invoke-virtual {v5}, Ll/ۡܰۡ;->close()V

    return-object v0

    :cond_7
    invoke-virtual {v5}, Ll/ۡܰۡ;->close()V

    const v0, 0x7f1207a7

    .line 125
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    .line 126
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 127
    sget-object v4, Ll/ܽ֡ܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    iput-object v1, p0, Ll/۬ܶܽ;->ۖ֫:Ll/ܶ᩵ܿ;

    .line 128
    new-instance v1, Ll/ᩳܰۡ;

    iget-object v4, p0, Ll/۬ܶܽ;->ᩴ֫:Ll/ܶ᩵ܿ;

    invoke-direct {v1, v4}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    :try_start_4
    new-instance v4, Ll/ۡܰۡ;

    iget-object v5, p0, Ll/۬ܶܽ;->ۖ֫:Ll/ܶ᩵ܿ;

    invoke-direct {v4, v5}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 129
    :try_start_5
    invoke-virtual {v1}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ᩺ۡ;

    .line 130
    invoke-virtual {v6}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v7

    .line 131
    invoke-virtual {v7, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    const/4 v10, 0x2

    if-eqz v8, :cond_9

    .line 132
    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 133
    new-instance v8, Ll/ۗܶܽ;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v7, v8}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙܶܽ;

    .line 134
    iput-object v6, v7, Ll/ۙܶܽ;->֫:Ll/ۗ᩺ۡ;

    goto :goto_0

    .line 135
    :cond_9
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 136
    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 137
    new-instance v8, Ll/ۗܶܽ;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v7, v8}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۙܶܽ;

    .line 138
    iput-object v6, v7, Ll/ۙܶܽ;->ۧ:Ll/ۗ᩺ۡ;

    goto :goto_0

    .line 141
    :cond_a
    new-instance v5, Ll/᩸۟ۡ;

    invoke-direct {v5}, Ll/᩸۟ۡ;-><init>()V

    const-string v6, "type"

    const-string v7, "arsc"

    .line 142
    invoke-virtual {v5, v6, v7}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v6, "file1"

    .line 143
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v6, v2}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "file2"

    .line 144
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "versionCode"

    const v3, 0x18e4545

    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Ll/᩸۟ۡ;->֫(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "info.json"

    .line 146
    invoke-virtual {v4, v2}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 574
    invoke-virtual {v5}, Ll/ۚ۟ۡ;->ܽ()Ljava/lang/String;

    move-result-object v2

    .line 147
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۡܰۡ;->write([B)V

    .line 148
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 149
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 150
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 175
    :try_start_6
    invoke-virtual {v4}, Ll/ۡܰۡ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    return-object v0

    .line 152
    :cond_c
    :try_start_7
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 153
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙܶܽ;

    .line 154
    iget-object v5, v2, Ll/ۙܶܽ;->֫:Ll/ۗ᩺ۡ;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    iget-object v6, p0, Ll/۬ܶܽ;->ۡ֫:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v5, :cond_d

    :try_start_8
    iget-object v7, v2, Ll/ۙܶܽ;->ۧ:Ll/ۗ᩺ۡ;

    if-nez v7, :cond_d

    .line 155
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 156
    iget-object v2, v2, Ll/ۙܶܽ;->֫:Ll/ۗ᩺ۡ;

    invoke-virtual {v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۡܰۡ;->֫(Ljava/io/InputStream;)V

    .line 157
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    goto :goto_1

    :cond_d
    if-nez v5, :cond_e

    .line 158
    iget-object v7, v2, Ll/ۙܶܽ;->ۧ:Ll/ۗ᩺ۡ;

    if-eqz v7, :cond_e

    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 160
    iget-object v2, v2, Ll/ۙܶܽ;->ۧ:Ll/ۗ᩺ۡ;

    invoke-virtual {v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۡܰۡ;->֫(Ljava/io/InputStream;)V

    .line 161
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    goto :goto_1

    :cond_e
    const/4 v7, 0x0

    .line 1757
    invoke-virtual {v1, v5, v7}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v5

    .line 165
    iget-object v8, v2, Ll/ۙܶܽ;->ۧ:Ll/ۗ᩺ۡ;

    .line 1757
    invoke-virtual {v1, v8, v7}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v7

    .line 166
    invoke-static {v5, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-nez v5, :cond_b

    .line 167
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 168
    iget-object v5, v2, Ll/ۙܶܽ;->֫:Ll/ۗ᩺ۡ;

    invoke-virtual {v1, v5}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ۡܰۡ;->֫(Ljava/io/InputStream;)V

    .line 169
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/ۡܰۡ;->֫(Ljava/lang/String;)V

    .line 170
    iget-object v2, v2, Ll/ۙܶܽ;->ۧ:Ll/ۗ᩺ۡ;

    invoke-virtual {v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v4, v2}, Ll/ۡܰۡ;->֫(Ljava/io/InputStream;)V

    .line 171
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto/16 :goto_1

    .line 175
    :cond_f
    :try_start_9
    invoke-virtual {v4}, Ll/ۡܰۡ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    .line 176
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 128
    :try_start_a
    invoke-virtual {v4}, Ll/ۡܰۡ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v2

    :try_start_b
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception v0

    :try_start_c
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0

    :catchall_4
    move-exception v0

    .line 86
    :try_start_d
    invoke-virtual {v5}, Ll/ۡܰۡ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/۬ܶܽ;->ܺ֫:Z

    if-nez v0, :cond_0

    .line 204
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ll/۬ܶܽ;->֫(Landroid/content/ContextWrapper;Ll/ܿ۠ۢ;)V

    .line 206
    :cond_0
    invoke-virtual {p1}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Ll/۬ܶܽ;->ۖ֫:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_1

    .line 207
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 209
    :cond_1
    iget-object p1, p0, Ll/۬ܶܽ;->ᩴ֫:Ll/ܶ᩵ܿ;

    if-eqz p1, :cond_2

    .line 210
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 212
    :cond_2
    iget-object p1, p0, Ll/۬ܶܽ;->ۘ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 213
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f1205b7

    .line 75
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const v0, 0x7f120528

    .line 76
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ܿ(I)V

    return-void
.end method
