.class public final Ll/ۢ᩻ᩳ;
.super Ljava/lang/Object;
.source "SB38"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;Ljava/util/function/Consumer;)Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 6

    const-string v0, ".part1.rar"

    .line 43
    invoke-static {}, Ll/ۖ᩻ᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 46
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 47
    new-instance v2, Ll/᩻᩻ᩳ;

    invoke-direct {v2, v1, p1}, Ll/᩻᩻ᩳ;-><init>(Ljava/lang/String;Ljava/util/function/Consumer;)V

    const/4 v1, 0x0

    .line 69
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})"

    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 70
    invoke-static {p0, p1}, Ll/ۢ᩻ᩳ;->ۧ(Ll/ܶ᩵ܿ;Ljava/util/function/Consumer;)Ll/ۘ᩺᩵;

    move-result-object p1

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".*\\.part[0-9]+\\.rar"

    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 72
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".part"

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 75
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 77
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object p0, p1

    .line 82
    :cond_1
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/᩵ܳᩳ;->getStream(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/IInStream;

    move-result-object p1

    goto :goto_0

    .line 85
    :cond_2
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 87
    new-instance p1, Ll/ۘ᩺᩵;

    invoke-direct {p1, p0}, Ll/ۘ᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    :goto_0
    :try_start_1
    move-object v0, p1

    check-cast v0, Ll/ۘ᩺᩵;

    invoke-static {v0, v2}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(Ll/ۘ᩺᩵;Ll/᩵ܳᩳ;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v1

    .line 90
    invoke-interface {v1, p1}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 91
    invoke-interface {v1, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 92
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileName(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileSize(J)V

    .line 94
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    invoke-interface {v1, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileTime(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    move-object p1, v1

    .line 100
    :goto_1
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 101
    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 102
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 104
    throw p0

    .line 44
    :cond_3
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-static {}, Ll/ۖ᩻ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Lbin/mt/plus/Main;Ll/ܶ᩵ܿ;Ll/᩷᩻ᩳ;)V
    .locals 6

    const-string v0, ".part1.rar"

    .line 112
    invoke-static {}, Ll/ۖ᩻ᩳ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 115
    new-instance v1, Ll/ۜ᩻ᩳ;

    invoke-direct {v1, p0, p2}, Ll/ۜ᩻ᩳ;-><init>(Ll/ۗܺ᩷;Ll/᩷᩻ᩳ;)V

    .line 127
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/֨ܳᩳ;->ܺ(Ljava/lang/String;)V

    .line 128
    new-instance p0, Ll/ܿ᩻ᩳ;

    invoke-direct {p0, p2}, Ll/ܿ᩻ᩳ;-><init>(Ll/᩷᩻ᩳ;)V

    invoke-virtual {v1, p0}, Ll/֨ܳᩳ;->֫(Ljava/util/function/BooleanSupplier;)V

    :goto_0
    const/4 p0, 0x0

    .line 135
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 136
    new-instance v2, Ll/ܳ᩻ᩳ;

    invoke-direct {v2, p2}, Ll/ܳ᩻ᩳ;-><init>(Ll/᩷᩻ᩳ;)V

    invoke-static {p1, v2}, Ll/ۢ᩻ᩳ;->ۧ(Ll/ܶ᩵ܿ;Ljava/util/function/Consumer;)Ll/ۘ᩺᩵;

    move-result-object v2

    goto :goto_1

    .line 137
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".*\\.part[0-9]+\\.rar"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 138
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 140
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".part"

    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 141
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 142
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object p1, v2

    .line 148
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩵ܳᩳ;->getStream(Ljava/lang/String;)Lnet/sf/sevenzipjbinding/IInStream;

    move-result-object v2

    goto :goto_1

    .line 150
    :cond_2
    invoke-interface {p2, p1}, Ll/᩷᩻ᩳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 151
    new-instance v2, Ll/ۘ᩺᩵;

    invoke-direct {v2, p1}, Ll/ۘ᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 154
    :goto_1
    :try_start_1
    move-object v3, v2

    check-cast v3, Ll/ۘ᩺᩵;

    invoke-static {v3, v1}, Lnet/sf/sevenzipjbinding/SevenZip;->֫(Ll/ۘ᩺᩵;Ll/᩵ܳᩳ;)Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object p0
    :try_end_1
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    :try_start_2
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileName(Ljava/lang/String;)V

    .line 174
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileSize(J)V

    .line 175
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v3

    invoke-interface {p0, v3, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->setFileTime(J)V

    .line 176
    invoke-interface {p0, v2}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 177
    invoke-interface {p0, v1}, Lnet/sf/sevenzipjbinding/IInArchive;->addAutoCloseable(Ljava/io/Closeable;)V

    .line 178
    invoke-virtual {v1}, Ll/֨ܳᩳ;->᩹֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 179
    invoke-virtual {v1}, Ll/֨ܳᩳ;->ܶ֫()Ljava/lang/String;

    move-result-object v0

    .line 180
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 181
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    :cond_3
    invoke-virtual {v1}, Ll/֨ܳᩳ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 185
    invoke-virtual {v1}, Ll/֨ܳᩳ;->ܶ֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/᩹᩶᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    :cond_4
    invoke-interface {p2, p0}, Ll/᩷᩻ᩳ;->֫(Lnet/sf/sevenzipjbinding/IInArchive;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v3

    .line 156
    invoke-virtual {v1}, Ll/֨ܳᩳ;->᩸֫()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 157
    invoke-interface {p2}, Ll/᩷᩻ᩳ;->ܽ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 196
    :try_start_3
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 197
    invoke-virtual {v1}, Ll/᩵ܳᩳ;->᩶֫()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 204
    invoke-virtual {v1}, Ll/᩵ܳᩳ;->close()V

    return-void

    .line 160
    :cond_5
    :try_start_4
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-nez v4, :cond_8

    .line 164
    invoke-virtual {v1}, Ll/֨ܳᩳ;->᩹֫()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 165
    invoke-virtual {v1}, Ll/֨ܳᩳ;->ۖ()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 166
    invoke-static {}, Ll/᩹᩶᩻;->֫()V

    .line 168
    :cond_6
    invoke-virtual {v1, p0}, Ll/֨ܳᩳ;->ܺ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 196
    :try_start_5
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 197
    invoke-virtual {v1}, Ll/᩵ܳᩳ;->᩶֫()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto/16 :goto_0

    .line 171
    :cond_7
    :try_start_6
    throw v3

    .line 161
    :cond_8
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_1
    move-exception p1

    move-object v2, p0

    :goto_2
    if-eqz p0, :cond_9

    .line 194
    :try_start_7
    invoke-static {p0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    goto :goto_3

    .line 196
    :cond_9
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 197
    invoke-virtual {v1}, Ll/᩵ܳᩳ;->᩶֫()V

    .line 200
    :goto_3
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catchall_2
    move-exception p0

    .line 204
    invoke-virtual {v1}, Ll/᩵ܳᩳ;->close()V

    .line 206
    throw p0

    .line 113
    :cond_a
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-static {}, Ll/ۖ᩻ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;Ljava/util/function/Consumer;)Ll/ۘ᩺᩵;
    .locals 13

    .line 210
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩻֫()Ll/ܶ᩵ܿ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 212
    new-instance p1, Ll/ۘ᩺᩵;

    invoke-direct {p1, p0}, Ll/ۘ᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V

    return-object p1

    .line 214
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 215
    new-instance v2, Ll/ۙۖᩴ;

    invoke-direct {v2}, Ll/ۙۖᩴ;-><init>()V

    .line 217
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 218
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x3

    sub-int/2addr v4, v5

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x0

    .line 0
    invoke-static {v5, v6, v3}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    const/4 v8, 0x1

    :goto_0
    const/16 v9, 0x3e7

    const/4 v10, 0x2

    if-gt v8, v9, :cond_3

    if-ne v8, v4, :cond_1

    .line 223
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v9

    invoke-virtual {v2, v9, v10}, Ll/ۙۖᩴ;->add(J)Z

    .line 224
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 227
    :cond_1
    sget-object v9, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    new-array v12, v10, [Ljava/lang/Object;

    aput-object v5, v12, v6

    aput-object v11, v12, v7

    const-string v11, "%s%03d"

    invoke-static {v9, v11, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v9

    .line 228
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v11

    if-eqz v11, :cond_2

    .line 229
    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v10

    invoke-virtual {v2, v10, v11}, Ll/ۙۖᩴ;->add(J)Z

    .line 230
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    if-ge v8, v4, :cond_3

    .line 233
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 234
    invoke-virtual {v2}, Ll/ۙۖᩴ;->clear()V

    .line 239
    :cond_3
    invoke-virtual {v2}, Ll/ۙۖᩴ;->size()I

    move-result v0

    if-le v0, v7, :cond_5

    .line 241
    invoke-virtual {v2}, Ll/ۙۖᩴ;->᩷()V

    .line 242
    invoke-virtual {v1}, Ljava/util/ArrayList;->trimToSize()V

    .line 244
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 245
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_2

    .line 248
    :cond_4
    invoke-virtual {v2}, Ll/ۛܺᩴ;->ܿ()[J

    move-result-object p0

    new-instance p1, Ll/ܺ᩵ܿ;

    invoke-direct {p1, v10, v1}, Ll/ܺ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3, p0, p1}, Ll/᩶ۖܽ;->֫(Ljava/lang/String;[JLl/᩹ۖܽ;)Ll/᩶ۖܽ;

    move-result-object p0

    invoke-static {p0}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p0

    .line 250
    new-instance p1, Ll/ۘ᩺᩵;

    invoke-direct {p1, p0}, Ll/ۘ᩺᩵;-><init>(Ll/۠ۖܽ;)V

    return-object p1

    .line 253
    :cond_5
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 255
    new-instance p1, Ll/ۘ᩺᩵;

    invoke-direct {p1, p0}, Ll/ۘ᩺᩵;-><init>(Ll/ܶ᩵ܿ;)V

    return-object p1
.end method
