.class public Ll/ܶۜۢ;
.super Ll/ۡ᩻֫;
.source "M1KQ"


# instance fields
.field public ۗ:[I

.field public ۙ:Ll/۫ۧۢ;

.field public ۛ:Z

.field public ۤ:Z

.field public ۨ:Ll/۬۬ۧ;

.field public ۫:Ljava/lang/String;

.field public ۬:I

.field public ᩶:Ljava/util/List;

.field public ᩸:Ll/֡ۜۢ;

.field public ᩹:Z

.field public ᩺:Ll/ۘۛ᩷;


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0x7f0d01e2

    .line 79
    invoke-direct {p0, v0}, Ll/ۡ᩻֫;-><init>(I)V

    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Ll/ܶۜۢ;->ۛ:Z

    return-void
.end method

.method private ֫(Ljava/util/List;)V
    .locals 5

    .line 199
    iget-object v0, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    invoke-virtual {v0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "strings"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x0

    .line 200
    :try_start_0
    new-instance v2, Ljava/io/BufferedOutputStream;

    new-instance v3, Ll/ۤۖܽ;

    .line 446
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0

    .line 200
    invoke-direct {v3, v0}, Ll/ۤۖܽ;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const v0, 0x31843431

    .line 201
    :try_start_1
    invoke-static {v2, v0}, Ll/ۛۖܽ;->֫(Ljava/io/BufferedOutputStream;I)V

    .line 202
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v2, v0}, Ll/ۛۖܽ;->֫(Ljava/io/BufferedOutputStream;I)V

    .line 203
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۜۢ;

    .line 204
    iget-boolean v3, v0, Ll/ܺۜۢ;->ܽ:Z

    if-eqz v3, :cond_1

    const/16 v3, 0xff

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 413
    :goto_1
    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write(I)V

    .line 205
    invoke-static {v0}, Ll/ܺۜۢ;->ۧ(Ll/ܺۜۢ;)Ljava/lang/String;

    move-result-object v3

    .line 224
    invoke-static {v3}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-static {v2, v4}, Ll/ۛۖܽ;->֫(Ljava/io/BufferedOutputStream;I)V

    .line 225
    invoke-static {v2, v3}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V

    .line 206
    iget-boolean v3, v0, Ll/ܺۜۢ;->ܽ:Z

    if-eqz v3, :cond_0

    .line 207
    invoke-static {v0}, Ll/ܺۜۢ;->֫(Ll/ܺۜۢ;)Ljava/lang/String;

    move-result-object v0

    .line 224
    invoke-static {v0}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-static {v2, v3}, Ll/ۛۖܽ;->֫(Ljava/io/BufferedOutputStream;I)V

    .line 225
    invoke-static {v2, v0}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 210
    :cond_2
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catchall_0
    move-exception p1

    .line 200
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 212
    iget-object v0, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    if-eqz v0, :cond_3

    .line 213
    invoke-virtual {v0, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    .line 216
    :cond_3
    :goto_3
    iget-object p1, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    invoke-virtual {p1}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object p1

    const-string v0, "strings_changed"

    invoke-virtual {p1, v0}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 217
    iget-boolean v0, p0, Ll/ܶۜۢ;->᩹:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    :try_start_5
    new-array v2, v0, [B

    aput-byte v0, v2, v1

    .line 219
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    invoke-virtual {p1, v2, v1, v0}, Ll/ܶ᩵ܿ;->֫([BII)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_4

    :catch_1
    move-exception p1

    .line 222
    iget-object v0, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    if-eqz v0, :cond_5

    .line 223
    invoke-virtual {v0, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_4

    .line 227
    :cond_4
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_5
    :goto_4
    return-void
.end method

.method public static ֫(Ll/ܶۜۢ;)V
    .locals 9

    .line 90
    iget-boolean v0, p0, Ll/ܶۜۢ;->ۛ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 92
    iput-boolean v0, p0, Ll/ܶۜۢ;->ۛ:Z

    .line 237
    iput-boolean v0, p0, Ll/ܶۜۢ;->᩹:Z

    .line 238
    iput-boolean v0, p0, Ll/ܶۜۢ;->ۤ:Z

    .line 239
    iget-object v1, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    invoke-virtual {v1}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v2, "strings"

    invoke-virtual {v1, v2}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 240
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 241
    :try_start_0
    new-instance v2, Ll/ۙۖܽ;

    new-instance v3, Ljava/util/zip/GZIPInputStream;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ll/ۙۖܽ;-><init>(Ljava/util/zip/GZIPInputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 242
    :try_start_1
    invoke-virtual {v2}, Ll/ۙۖܽ;->readInt()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v3, 0x31843431

    if-eq v1, v3, :cond_1

    .line 264
    :try_start_2
    invoke-virtual {v2}, Ll/ۙۖܽ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_4

    .line 245
    :cond_1
    :try_start_3
    invoke-virtual {v2}, Ll/ۙۖܽ;->readInt()I

    move-result v1

    .line 246
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    const/16 v3, 0x400

    new-array v3, v3, [B

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v1, :cond_4

    .line 463
    invoke-virtual {v2}, Ll/ۙۖܽ;->read()I

    move-result v6

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    .line 250
    iput-boolean v5, p0, Ll/ܶۜۢ;->᩹:Z

    .line 251
    iget-object v5, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    new-instance v6, Ll/ܺۜۢ;

    invoke-virtual {v2, v3}, Ll/ۙۖܽ;->ۧ([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v3}, Ll/ۙۖܽ;->ۧ([B)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ll/ܺۜۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 253
    :cond_2
    iget-object v5, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    new-instance v6, Ll/ܺۜۢ;

    invoke-virtual {v2, v3}, Ll/ۙۖܽ;->ۧ([B)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ll/ܺۜۢ;-><init>(Ljava/lang/String;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 465
    :cond_3
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 255
    :cond_4
    invoke-direct {p0}, Ll/ܶۜۢ;->ܳ()V

    .line 256
    iget-object v1, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    invoke-virtual {v1}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v1

    const-string v3, "strings_changed"

    invoke-virtual {v1, v3}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 257
    iget-boolean v3, p0, Ll/ܶۜۢ;->᩹:Z

    if-eqz v3, :cond_5

    new-array v3, v5, [B

    aput-byte v5, v3, v0

    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    invoke-virtual {v1, v3, v0, v5}, Ll/ܶ᩵ܿ;->֫([BII)V

    goto :goto_2

    .line 260
    :cond_5
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    .line 262
    :goto_2
    iget-object v0, p0, Ll/ܶۜۢ;->᩸:Ll/֡ۜۢ;

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 264
    :try_start_4
    invoke-virtual {v2}, Ll/ۙۖܽ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    return-void

    :catchall_0
    move-exception v0

    .line 241
    :try_start_5
    invoke-virtual {v2}, Ll/ۙۖܽ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v1

    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    .line 265
    iget-object v1, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    if-eqz v1, :cond_6

    .line 266
    invoke-virtual {v1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    .line 124
    :cond_6
    :goto_4
    new-instance v0, Ll/ۜۜۢ;

    const v1, 0x7f120528

    invoke-direct {v0, p0, v1}, Ll/ۜۜۢ;-><init>(Ll/ܶۜۢ;I)V

    .line 191
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۢ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶۜۢ;->۬:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۢ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶۜۢ;->۫:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۢ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    return-void
.end method

.method public static synthetic ֫(Ll/ܶۜۢ;Ll/۫ۧۢ;)V
    .locals 2

    .line 87
    iput-object p1, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    .line 88
    iget-object p1, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    new-instance v0, Ll/ܽ۫᩷;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Ll/ܽ۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Ll/ۘۛ᩷;->֫(Ll/ܶۜۢ;Ll/ܽ۫᩷;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۢ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܶۜۢ;->᩹:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶۜۢ;[I)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܶۜۢ;->ۗ:[I

    return-void
.end method

.method public static ۖ(Ll/ܶۜۢ;)V
    .locals 4

    .line 274
    iget-object v0, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    invoke-virtual {v0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "stringsFilter"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 275
    iget-boolean v1, p0, Ll/ܶۜۢ;->ۤ:Z

    if-eqz v1, :cond_2

    const v1, 0x44268286

    .line 0
    invoke-static {v1}, Ll/ᩴۘܿ;->֫(I)Ll/ۤۜܽ;

    move-result-object v1

    .line 278
    iget-object v2, p0, Ll/ܶۜۢ;->۫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 279
    iget v2, p0, Ll/ܶۜۢ;->۬:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v2, 0x0

    .line 280
    :goto_0
    iget v3, p0, Ll/ܶۜۢ;->۬:I

    if-ge v2, v3, :cond_0

    .line 281
    iget-object v3, p0, Ll/ܶۜۢ;->ۗ:[I

    aget v3, v3, v2

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 284
    :cond_0
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 287
    iget-object v1, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    if-eqz v1, :cond_1

    .line 288
    iget-object p0, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    invoke-virtual {p0, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    :cond_1
    return-void

    .line 292
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public static ۘ(Ll/ܶۜۢ;)V
    .locals 4

    .line 314
    new-instance v0, Ll/᩷ۜۢ;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ۗܺ᩷;

    iget-boolean v2, p0, Ll/ܶۜۢ;->ۤ:Z

    invoke-static {}, Ll/ۖۛ᩷;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Ll/᩷ۜۢ;-><init>(Ll/ܶۜۢ;Ll/ۗܺ᩷;ZLjava/lang/String;)V

    .line 330
    invoke-virtual {v0}, Ll/ܿ۬ܿ;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܶۜۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶۜۢ;->۬:I

    return p0
.end method

.method public static bridge synthetic ۡ(Ll/ܶۜۢ;)Ll/ۘۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ܶۜۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۜۢ;->ۤ:Z

    return p0
.end method

.method public static synthetic ۧ(Ll/ܶۜۢ;)V
    .locals 2

    .line 107
    iget-object v0, p0, Ll/ܶۜۢ;->ۨ:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->scrollToPosition(I)V

    .line 108
    iget-object p0, p0, Ll/ܶۜۢ;->᩸:Ll/֡ۜۢ;

    invoke-virtual {p0}, Ll/֡ۜۢ;->֫()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶۜۢ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶۜۢ;->֫(Ljava/util/List;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܶۜۢ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܶۜۢ;->ۤ:Z

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܶۜۢ;)Ll/۫ۧۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    return-object p0
.end method

.method private ܳ()V
    .locals 4

    .line 296
    iget-object v0, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    invoke-virtual {v0}, Ll/۫ۧۢ;->ۖ()Ll/ۧ۫᩷;

    move-result-object v0

    const-string v1, "stringsFilter"

    invoke-virtual {v0, v1}, Ll/ۧ۫᩷;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 298
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩵ۧ()Ll/۬ۜܽ;

    move-result-object v0

    .line 299
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const v2, 0x44268286

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    .line 300
    iput-boolean v1, p0, Ll/ܶۜۢ;->ۤ:Z

    .line 301
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܶۜۢ;->۫:Ljava/lang/String;

    .line 302
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, p0, Ll/ܶۜۢ;->۬:I

    .line 303
    iget-object v2, p0, Ll/ܶۜۢ;->ۗ:[I

    if-eqz v2, :cond_0

    array-length v2, v2

    if-ge v2, v1, :cond_1

    .line 304
    :cond_0
    new-array v1, v1, [I

    iput-object v1, p0, Ll/ܶۜۢ;->ۗ:[I

    :cond_1
    const/4 v1, 0x0

    .line 306
    :goto_0
    iget v2, p0, Ll/ܶۜۢ;->۬:I

    if-ge v1, v2, :cond_2

    .line 307
    iget-object v2, p0, Ll/ܶۜۢ;->ۗ:[I

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ܺ(Ll/ܶۜۢ;)V
    .locals 5

    .line 383
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    .line 384
    new-instance v1, Ll/᩺ۤܿ;

    invoke-direct {v1, v0}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v2, 0x7f1207a7

    .line 385
    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->ܽ(I)V

    const/4 v2, 0x0

    .line 65
    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 385
    invoke-virtual {v1}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    .line 386
    new-instance v2, Ll/ۡۜۢ;

    invoke-direct {v2, p0, v1, v0}, Ll/ۡۜۢ;-><init>(Ll/ܶۜۢ;Ll/᩺ۤܿ;Ll/ܿۛ᩷;)V

    .line 422
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    .line 423
    iget-object v1, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺۜۢ;

    .line 424
    iget-boolean v4, v3, Ll/ܺۜۢ;->ܽ:Z

    if-eqz v4, :cond_0

    .line 425
    invoke-static {v3}, Ll/ܺۜۢ;->ۧ(Ll/ܺۜۢ;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Ll/ܺۜۢ;->֫(Ll/ܺۜۢ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 427
    :cond_1
    iget-object p0, p0, Ll/ܶۜۢ;->ۙ:Ll/۫ۧۢ;

    .line 935
    new-instance v1, Ljava/lang/Thread;

    new-instance v3, Ll/֫ܽۢ;

    invoke-direct {v3, p0, v2, v0}, Ll/֫ܽۢ;-><init>(Ll/۫ۧۢ;Ll/᩸ۛ᩷;Ll/ۖ᩵;)V

    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 974
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܶۜۢ;)Ll/֡ۜۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۢ;->᩸:Ll/֡ۜۢ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܶۜۢ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܶۜۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶۜۢ;->᩹:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ܶۜۢ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۢ;->۫:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܶۜۢ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۜۢ;->ۗ:[I

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 84
    invoke-super {p0, p1}, Ll/ۡ᩻֫;->onCreate(Landroid/os/Bundle;)V

    .line 85
    new-instance p1, Ll/ۙܺ֫;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v0, Ll/ۘۛ᩷;

    invoke-virtual {p1, v0}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object p1

    check-cast p1, Ll/ۘۛ᩷;

    iput-object p1, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    .line 86
    invoke-virtual {p1}, Ll/ۘۛ᩷;->᩻()Ll/ۚۡ֫;

    move-result-object p1

    new-instance v0, Ll/᩹ۤۡ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩹ۤۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 98
    new-instance p1, Ll/֡ۜۢ;

    invoke-direct {p1, p0}, Ll/֡ۜۢ;-><init>(Ll/ܶۜۢ;)V

    iput-object p1, p0, Ll/ܶۜۢ;->᩸:Ll/֡ۜۢ;

    return-void
.end method

.method public final onDestroyView()V
    .locals 2

    .line 114
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    .line 115
    iget-object v0, p0, Ll/ܶۜۢ;->ۨ:Ll/۬۬ۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 116
    iput-object v1, p0, Ll/ܶۜۢ;->ۨ:Ll/۬۬ۧ;

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const p2, 0x7f0a0486

    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    iput-object p1, p0, Ll/ܶۜۢ;->ۨ:Ll/۬۬ۧ;

    const-string p2, "RecyclerView3"

    .line 104
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 105
    iget-object p1, p0, Ll/ܶۜۢ;->ۨ:Ll/۬۬ۧ;

    iget-object p2, p0, Ll/ܶۜۢ;->᩸:Ll/֡ۜۢ;

    invoke-virtual {p1, p2}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 106
    iget-object p1, p0, Ll/ܶۜۢ;->᩺:Ll/ۘۛ᩷;

    invoke-virtual {p0}, Ll/ۡ᩻֫;->getViewLifecycleOwner()Ll/᩻ۡ֫;

    move-result-object p2

    new-instance v0, Ll/ᩳۜۢ;

    invoke-direct {v0, p0}, Ll/ᩳۜۢ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v0}, Ll/ۘۛ᩷;->֫(Ll/᩻ۡ֫;Ll/ᩳۜۢ;)V

    return-void
.end method

.method public final ۧ()Ll/᩶ۗۧ;
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ܶۜۢ;->᩸:Ll/֡ۜۢ;

    return-object v0
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public final ܿ()V
    .locals 1

    .line 195
    iget-object v0, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    invoke-direct {p0, v0}, Ll/ܶۜۢ;->֫(Ljava/util/List;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 441
    iget-object v0, p0, Ll/ܶۜۢ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۜۢ;

    .line 442
    iget-boolean v1, v1, Ll/ܺۜۢ;->ܽ:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 447
    :goto_0
    iput-boolean v0, p0, Ll/ܶۜۢ;->᩹:Z

    return-void
.end method
