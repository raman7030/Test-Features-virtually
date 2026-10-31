.class public final Ll/ۖܿܳ;
.super Ljava/lang/Object;
.source "G72T"

# interfaces
.implements Ll/֡۟ۧ;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/ܶ᩵ܿ;

.field public ۙ:I

.field public final ۛ:Ljava/util/HashSet;

.field public final ۟:Ll/ܰܺܳ;

.field public final ۤ:Z

.field public final ۨ:Ljava/lang/Object;

.field public final ۫:Z

.field public final ۬:Ljava/lang/String;

.field public final ܰ:Ljava/lang/Object;

.field public ᩶:Z

.field public final ᩸:Ll/֨ۚ᩷;

.field public final ᩹:Z

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֨ۚ᩷;Ll/ܰܺܳ;Ljava/lang/String;ZLl/ܶ᩵ܿ;Ljava/lang/String;Z)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۖܿܳ;->ܰ:Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۖܿܳ;->ۛ:Ljava/util/HashSet;

    .line 65
    iput-object p1, p0, Ll/ۖܿܳ;->᩸:Ll/֨ۚ᩷;

    .line 66
    iput-object p2, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    .line 68
    instance-of p1, p2, Ll/ۖۛܳ;

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    iput-object p1, p0, Ll/ۖܿܳ;->ۨ:Ljava/lang/Object;

    .line 69
    iput-object p3, p0, Ll/ۖܿܳ;->᩺:Ljava/lang/String;

    .line 70
    iput-boolean p4, p0, Ll/ۖܿܳ;->۫:Z

    .line 71
    instance-of p1, p2, Ll/ۗۢ᩻;

    iput-boolean p1, p0, Ll/ۖܿܳ;->ۤ:Z

    .line 72
    iput-object p5, p0, Ll/ۖܿܳ;->ۗ:Ll/ܶ᩵ܿ;

    .line 73
    iput-object p6, p0, Ll/ۖܿܳ;->۬:Ljava/lang/String;

    .line 74
    iput-boolean p7, p0, Ll/ۖܿܳ;->᩹:Z

    return-void
.end method

.method private ֫(ILjava/lang/String;Z)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 200
    iget-boolean v0, p0, Ll/ۖܿܳ;->ۤ:Z

    if-eqz v0, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    .line 201
    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const v0, 0x7f120711

    .line 203
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</p><p><a href=\"\">"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x7f1205f5

    .line 205
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->escapeHtml(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</a></p>"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 206
    new-instance v7, Landroid/webkit/WebResourceResponse;

    .line 207
    invoke-static {}, Ll/ۖܿܳ;->ܽ()Ljava/util/HashMap;

    move-result-object v5

    new-instance v6, Ljava/io/ByteArrayInputStream;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    invoke-direct {v6, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    move-object v0, v7

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object v7

    .line 200
    :cond_1
    :goto_0
    invoke-static {p1, p2}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ll/᩺ᩳܳ;I)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 171
    iget-object v0, p0, Ll/ۖܿܳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 172
    :try_start_0
    iget-boolean v1, p0, Ll/ۖܿܳ;->᩶:Z

    if-nez v1, :cond_0

    iget v1, p0, Ll/ۖܿܳ;->ۙ:I

    if-ne p4, v1, :cond_0

    .line 173
    iget-object p4, p0, Ll/ۖܿܳ;->ۛ:Ljava/util/HashSet;

    invoke-virtual {p4, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 174
    new-instance p4, Landroid/webkit/WebResourceResponse;

    const-string v5, "OK"

    .line 175
    invoke-static {}, Ll/ۖܿܳ;->ܽ()Ljava/util/HashMap;

    move-result-object v6

    const/16 v4, 0xc8

    move-object v1, p4

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    monitor-exit v0

    return-object p4

    .line 177
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    invoke-virtual {p3}, Ll/᩺ᩳܳ;->close()V

    const/16 p1, 0x194

    const-string p2, "Not Found"

    .line 179
    invoke-static {p1, p2}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 177
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(Ljava/lang/String;Z)Landroid/webkit/WebResourceResponse;
    .locals 7

    .line 95
    iget-object v0, p0, Ll/ۖܿܳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 96
    :try_start_0
    iget v2, p0, Ll/ۖܿܳ;->ۙ:I

    .line 97
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 98
    invoke-direct {p0, v2}, Ll/ۖܿܳ;->֫(I)Z

    move-result v0

    const/16 v3, 0x194

    if-nez v0, :cond_0

    const-string p1, "Not Found"

    .line 99
    invoke-static {v3, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 101
    :cond_0
    invoke-static {p1}, Ll/ۜܿܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 102
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 104
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "index.html"

    goto :goto_0

    :cond_2
    const-string p1, "/index.html"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v0, p1

    :cond_3
    move-object p1, v0

    .line 106
    iget-object v0, p0, Ll/ۖܿܳ;->᩺:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۜܿܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz p1, :cond_10

    if-nez v4, :cond_4

    goto/16 :goto_6

    .line 112
    :cond_4
    :try_start_1
    iget-object v0, p0, Ll/ۖܿܳ;->ۗ:Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ۖܿܳ;->۬:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string p1, "text/html"

    const-string v0, "UTF-8"

    .line 113
    new-instance v1, Ll/᩺ᩳܳ;

    iget-object v4, p0, Ll/ۖܿܳ;->ۗ:Ll/ܶ᩵ܿ;

    .line 114
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v4

    new-instance v5, Ll/ۡܿܳ;

    invoke-direct {v5, p0}, Ll/ۡܿܳ;-><init>(Ll/ۖܿܳ;)V

    invoke-direct {v1, v4, v5}, Ll/᩺ᩳܳ;-><init>(Ljava/io/InputStream;Ljava/util/function/Consumer;)V

    .line 113
    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۖܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/᩺ᩳܳ;I)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 117
    :cond_5
    iget-boolean v0, p0, Ll/ۖܿܳ;->᩹:Z

    if-nez v0, :cond_6

    const-string p1, "Not Found"

    .line 118
    invoke-static {v3, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    .line 121
    :cond_6
    iget-object v0, p0, Ll/ۖܿܳ;->ۨ:Ljava/lang/Object;

    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    :try_start_2
    iget-object v1, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 124
    :try_start_3
    invoke-direct {p0, v2}, Ll/ۖܿܳ;->֫(I)Z

    move-result v5

    if-nez v5, :cond_7

    const-string p1, "Not Found"

    .line 125
    invoke-static {v3, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-object p1

    .line 127
    :cond_7
    :try_start_5
    iget-boolean v5, p0, Ll/ۖܿܳ;->ۤ:Z

    if-eqz v5, :cond_8

    if-eqz p2, :cond_8

    .line 129
    iget-object v5, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ll/ܰܺܳ;->֫(Z)V

    .line 131
    :cond_8
    iget-boolean v5, p0, Ll/ۖܿܳ;->۫:Z

    if-nez v5, :cond_a

    iget-boolean v5, p0, Ll/ۖܿܳ;->ۤ:Z

    if-eqz v5, :cond_9

    goto :goto_1

    .line 133
    :cond_9
    iget-object v5, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    invoke-virtual {v5, v4}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v4

    goto :goto_2

    .line 132
    :cond_a
    :goto_1
    invoke-direct {p0, p1}, Ll/ۖܿܳ;->ᩳ(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v4

    :goto_2
    if-eqz v4, :cond_e

    .line 134
    move-object v5, v4

    check-cast v5, Ll/ܺۘܳ;

    invoke-virtual {v5}, Ll/ܺۘܳ;->ۙ֫()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_4

    .line 137
    :cond_b
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    :try_start_6
    iget-boolean v1, p0, Ll/ۖܿܳ;->ۤ:Z

    if-eqz v1, :cond_c

    .line 139
    new-instance v1, Ll/᩺ᩳܳ;

    new-instance v5, Ll/ܺܿܳ;

    invoke-direct {v5, p0, v2, v4}, Ll/ܺܿܳ;-><init>(Ll/ۖܿܳ;ILl/ᩳۜܳ;)V

    new-instance v4, Ll/ۡܿܳ;

    invoke-direct {v4, p0}, Ll/ۡܿܳ;-><init>(Ll/ۖܿܳ;)V

    invoke-direct {v1, v5, v4}, Ll/᩺ᩳܳ;-><init>(Ll/ۨᩳܳ;Ljava/util/function/Consumer;)V

    goto :goto_3

    .line 149
    :cond_c
    iget-object v1, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    iget-object v5, p0, Ll/ۖܿܳ;->᩸:Ll/֨ۚ᩷;

    invoke-virtual {v1, v5, v4}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v1

    if-nez v1, :cond_d

    const-string p1, "Not Found"

    .line 150
    invoke-static {v3, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 151
    :cond_d
    new-instance v4, Ll/᩺ᩳܳ;

    new-instance v5, Ll/ۡܿܳ;

    invoke-direct {v5, p0}, Ll/ۡܿܳ;-><init>(Ll/ۖܿܳ;)V

    invoke-direct {v4, v1, v5}, Ll/᩺ᩳܳ;-><init>(Ljava/io/InputStream;Ljava/util/function/Consumer;)V

    move-object v1, v4

    .line 153
    :goto_3
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 154
    :try_start_7
    invoke-static {p1}, Ll/֨ᩳܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۖܿܳ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/᩺ᩳܳ;I)Landroid/webkit/WebResourceResponse;

    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0

    return-object p1

    :cond_e
    :goto_4
    :try_start_8
    const-string p1, "Not Found"

    .line 135
    invoke-direct {p0, v3, p1, p2}, Ll/ۖܿܳ;->֫(ILjava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    return-object p1

    :catchall_0
    move-exception p1

    .line 137
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw p1

    :catchall_1
    move-exception p1

    .line 153
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw p1
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_0

    .line 157
    :catch_0
    iget-boolean p1, p0, Ll/ۖܿܳ;->ۤ:Z

    if-eqz p1, :cond_f

    invoke-direct {p0, v2}, Ll/ۖܿܳ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_f

    const/16 p1, 0x1f6

    const-string v0, "Bad Gateway"

    .line 158
    invoke-direct {p0, p1, v0, p2}, Ll/ۖܿܳ;->֫(ILjava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    goto :goto_5

    :cond_f
    const-string p1, "Not Found"

    .line 159
    invoke-static {v3, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    :goto_5
    return-object p1

    :cond_10
    :goto_6
    const-string p1, "Not Found"

    .line 108
    invoke-static {v3, p1}, Ll/ۖܿܳ;->ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1

    :catchall_2
    move-exception p1

    .line 97
    :try_start_d
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    throw p1
.end method

.method public static synthetic ֫(Ll/ۖܿܳ;ILl/ᩳۜܳ;)Ljava/io/InputStream;
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    monitor-enter v0

    .line 141
    :try_start_0
    invoke-direct {p0, p1}, Ll/ۖܿܳ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    iget-object p1, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    iget-object p0, p0, Ll/ۖܿܳ;->᩸:Ll/֨ۚ᩷;

    invoke-virtual {p1, p0, p2}, Ll/ܰܺܳ;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 142
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "HTML preview request was cancelled"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    .line 145
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ۖܿܳ;Ll/᩺ᩳܳ;)V
    .locals 1

    .line 259
    iget-object v0, p0, Ll/ۖܿܳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 260
    :try_start_0
    iget-object p0, p0, Ll/ۖܿܳ;->ۛ:Ljava/util/HashSet;

    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 261
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private ֫(Z)V
    .locals 3

    .line 243
    iget-object v0, p0, Ll/ۖܿܳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 244
    :try_start_0
    iget-boolean v1, p0, Ll/ۖܿܳ;->᩶:Z

    or-int/2addr p1, v1

    iput-boolean p1, p0, Ll/ۖܿܳ;->᩶:Z

    .line 245
    iget p1, p0, Ll/ۖܿܳ;->ۙ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۖܿܳ;->ۙ:I

    .line 246
    iget-object p1, p0, Ll/ۖܿܳ;->ۛ:Ljava/util/HashSet;

    const/4 v1, 0x0

    new-array v2, v1, [Ll/᩺ᩳܳ;

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩺ᩳܳ;

    .line 247
    iget-object v2, p0, Ll/ۖܿܳ;->ۛ:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    .line 248
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    array-length v0, p1

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Ll/᩺ᩳܳ;->close()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 248
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ֫(I)Z
    .locals 2

    .line 253
    iget-object v0, p0, Ll/ۖܿܳ;->ܰ:Ljava/lang/Object;

    monitor-enter v0

    .line 254
    :try_start_0
    iget-boolean v1, p0, Ll/ۖܿܳ;->᩶:Z

    if-nez v1, :cond_0

    iget v1, p0, Ll/ۖܿܳ;->ۙ:I

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 255
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static ۧ(ILjava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 215
    new-instance v7, Landroid/webkit/WebResourceResponse;

    .line 216
    invoke-static {}, Ll/ۖܿܳ;->ܽ()Ljava/util/HashMap;

    move-result-object v5

    new-instance v6, Ljava/io/ByteArrayInputStream;

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-direct {v6, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v1, "text/plain"

    const-string v2, "UTF-8"

    move-object v0, v7

    move v3, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    return-object v7
.end method

.method public static ܽ()Ljava/util/HashMap;
    .locals 3

    .line 223
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Cache-Control"

    const-string v2, "no-store"

    .line 224
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Referrer-Policy"

    const-string v2, "same-origin"

    .line 225
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Cross-Origin-Resource-Policy"

    .line 226
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private ᩳ(Ljava/lang/String;)Ll/ᩳۜܳ;
    .locals 7

    .line 112
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۖܿܳ;->᩺:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 115
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    const/16 v3, 0x2f

    .line 116
    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    .line 119
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    .line 121
    :cond_1
    invoke-virtual {v1, p1, v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    if-eqz v5, :cond_2

    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v5, :cond_3

    .line 124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v2, v4, 0x1

    goto :goto_0

    .line 189
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 190
    iget-object v2, p0, Ll/ۖܿܳ;->۟:Ll/ܰܺܳ;

    invoke-virtual {v2, v1}, Ll/ܰܺܳ;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 191
    move-object v2, v1

    check-cast v2, Ll/ܺۘܳ;

    invoke-virtual {v2}, Ll/ܺۘܳ;->۬()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_6
    return-object v0

    :cond_7
    return-object v1
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    .line 238
    invoke-direct {p0, v0}, Ll/ۖܿܳ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    const/4 v0, 0x0

    .line 83
    invoke-direct {p0, p1, v0}, Ll/ۖܿܳ;->֫(Ljava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 232
    invoke-direct {p0, v0}, Ll/ۖܿܳ;->֫(Z)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 89
    iget-boolean v0, p0, Ll/ۖܿܳ;->ۤ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 232
    invoke-direct {p0, v0}, Ll/ۖܿܳ;->֫(Z)V

    :cond_0
    const/4 v0, 0x1

    .line 90
    invoke-direct {p0, p1, v0}, Ll/ۖܿܳ;->֫(Ljava/lang/String;Z)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method
