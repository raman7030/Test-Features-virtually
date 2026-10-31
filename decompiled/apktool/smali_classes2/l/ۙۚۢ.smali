.class public final Ll/ۙۚۢ;
.super Ljava/lang/Thread;
.source "B99D"


# instance fields
.field public ۙ:Z

.field public final synthetic ᩶:Ll/۬ۚۢ;

.field public final ᩸:Ljava/lang/StringBuilder;

.field public final ᩹:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۬ۚۢ;)V
    .locals 0

    .line 212
    iput-object p1, p0, Ll/ۙۚۢ;->᩶:Ll/۬ۚۢ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 213
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۙۚۢ;->᩹:Ljava/util/ArrayList;

    .line 214
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/ۙۚۢ;->᩸:Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    .line 215
    iput-boolean p1, p0, Ll/ۙۚۢ;->ۙ:Z

    return-void
.end method

.method private ֫()V
    .locals 4

    .line 242
    :goto_0
    iget-boolean v0, p0, Ll/ۙۚۢ;->ۙ:Z

    iget-object v1, p0, Ll/ۙۚۢ;->᩶:Ll/۬ۚۢ;

    if-eqz v0, :cond_7

    invoke-static {v1}, Ll/۬ۚۢ;->ۧ(Ll/۬ۚۢ;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 243
    invoke-static {v1}, Ll/۬ۚۢ;->ᩳ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    const-string v2, "unused DT entry"

    if-eqz v0, :cond_3

    .line 245
    :cond_0
    invoke-static {v1}, Ll/۬ۚۢ;->ᩳ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    const-string v3, "MT - End of command"

    .line 246
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 247
    :cond_1
    :goto_1
    invoke-static {v1}, Ll/۬ۚۢ;->ܽ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 248
    invoke-static {v1}, Ll/۬ۚۢ;->ܽ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 249
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 250
    invoke-direct {p0, v0}, Ll/ۙۚۢ;->֫(Ljava/lang/String;)V

    goto :goto_1

    .line 254
    :cond_2
    iget-object v3, p0, Ll/ۙۚۢ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    invoke-static {v1}, Ll/۬ۚۢ;->ᩳ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 257
    :cond_3
    invoke-static {v1}, Ll/۬ۚۢ;->ܽ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 259
    :cond_4
    invoke-static {v1}, Ll/۬ۚۢ;->ܽ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 260
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 261
    invoke-direct {p0, v0}, Ll/ۙۚۢ;->֫(Ljava/lang/String;)V

    .line 262
    :cond_5
    invoke-static {v1}, Ll/۬ۚۢ;->ܽ(Ll/۬ۚۢ;)Ljava/io/BufferedReader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->ready()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_6
    :goto_2
    const-wide/16 v0, 0x1

    .line 266
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto/16 :goto_0

    .line 271
    :cond_7
    iget-boolean v0, p0, Ll/ۙۚۢ;->ۙ:Z

    if-nez v0, :cond_8

    const-string v0, "Read shell timeout."

    .line 272
    invoke-direct {p0, v0}, Ll/ۙۚۢ;->֫(Ljava/lang/String;)V

    .line 274
    :cond_8
    invoke-static {v1}, Ll/۬ۚۢ;->ۧ(Ll/۬ۚۢ;)Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "Shell closed."

    .line 275
    invoke-direct {p0, v0}, Ll/ۙۚۢ;->֫(Ljava/lang/String;)V

    :cond_9
    return-void
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 2

    .line 280
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 281
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 282
    iget-object v0, p0, Ll/ۙۚۢ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/16 v1, 0xa

    .line 283
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 284
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 234
    :try_start_0
    invoke-direct {p0}, Ll/ۙۚۢ;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۙۚۢ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(J)Ll/۫ۚۢ;
    .locals 4

    .line 218
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-lez v3, :cond_0

    .line 221
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Thread;->join(J)V

    .line 222
    iput-boolean v2, p0, Ll/ۙۚۢ;->ۙ:Z

    .line 224
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 228
    :catch_0
    new-instance p1, Ll/۫ۚۢ;

    iget-object p2, p0, Ll/ۙۚۢ;->᩹:Ljava/util/ArrayList;

    new-array v0, v2, [Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    iget-object v0, p0, Ll/ۙۚۢ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p2}, Ll/۫ۚۢ;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-object p1
.end method
