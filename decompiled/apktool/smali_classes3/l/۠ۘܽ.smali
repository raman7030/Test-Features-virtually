.class public final synthetic Ll/۠ۘܽ;
.super Ljava/lang/Object;
.source "Z5ED"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ljava/io/File;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۘܽ;->᩸:Ljava/io/File;

    iput-wide p2, p0, Ll/۠ۘܽ;->᩹:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 79
    iget-object v0, p0, Ll/۠ۘܽ;->᩸:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 173
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, v0, v3

    .line 80
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 81
    invoke-static {v5}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    const-string v6, ".log"

    .line 486
    invoke-static {v5, v6, v2}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    :try_start_0
    const-string v6, " is less than zero."

    const-string v7, "Requested character count "

    .line 371
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, -0x4

    const/4 v9, 0x0

    if-gez v8, :cond_0

    const/4 v8, 0x0

    :cond_0
    if-ltz v8, :cond_2

    .line 578
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-le v8, v6, :cond_1

    move v8, v6

    :cond_1
    invoke-virtual {v5, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "substring(...)"

    invoke-static {v5, v6}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    goto :goto_1

    :cond_2
    invoke-static {v8, v7, v6}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 577
    new-instance v6, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v5

    .line 82
    invoke-static {v5}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Throwable;)Ll/ۖ۠᩵;

    move-result-object v5

    .line 32
    :goto_1
    instance-of v6, v5, Ll/ۖ۠᩵;

    if-nez v6, :cond_3

    .line 83
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    .line 84
    iget-wide v7, p0, Ll/۠ۘܽ;->᩹:J

    cmp-long v9, v5, v7

    if-gez v9, :cond_3

    .line 85
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method
