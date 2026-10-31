.class public final synthetic Ll/ܽܽۢ;
.super Ljava/lang/Object;
.source "R1EE"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/᩹ۛ᩷;

.field public final synthetic ۙ:Ll/ۖ᩵;

.field public final synthetic ᩶:Ll/᩵ۛۡ;

.field public final synthetic ᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final synthetic ᩹:Ll/᩸ۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ll/᩸ۛ᩷;Ll/᩵ۛۡ;Ll/ۖ᩵;Ll/᩹ۛ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܽۢ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    iput-object p2, p0, Ll/ܽܽۢ;->᩹:Ll/᩸ۛ᩷;

    iput-object p3, p0, Ll/ܽܽۢ;->᩶:Ll/᩵ۛۡ;

    iput-object p4, p0, Ll/ܽܽۢ;->ۙ:Ll/ۖ᩵;

    iput-object p5, p0, Ll/ܽܽۢ;->ۗ:Ll/᩹ۛ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 947
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ܽܽۢ;->᩸:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 949
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ֫ۢ;

    if-eqz v0, :cond_6

    .line 950
    iget-object v1, p0, Ll/ܽܽۢ;->᩹:Ll/᩸ۛ᩷;

    invoke-interface {v1}, Ll/᩸ۛ᩷;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 41
    :cond_1
    iget-object v1, p0, Ll/ܽܽۢ;->᩶:Ll/᩵ۛۡ;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ll/᩵ۛۡ;->֫(I)Z

    .line 955
    invoke-interface {v0}, Ll/ܰ֫ۢ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    .line 1097
    new-instance v2, Ll/۫ᩳۢ;

    invoke-direct {v2, v1}, Ll/۫ᩳۢ;-><init>(Ljava/lang/String;)V

    .line 1099
    new-instance v3, Ll/᩺ۖܽ;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ll/᩺ۖܽ;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 1100
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ll/۫ᩳۢ;->֫()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    .line 1101
    iget-object v6, v2, Ll/۫ᩳۢ;->ܳ:Ljava/lang/String;

    .line 369
    iget-object v8, p0, Ll/ܽܽۢ;->ۙ:Ll/ۖ᩵;

    invoke-virtual {v8, v6, v7}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 1101
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 1103
    iget v7, v2, Ll/۫ᩳۢ;->ܿ:I

    invoke-virtual {v3, v1, v5, v7}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    .line 1105
    :try_start_0
    invoke-static {v3, v6}, Ll/ܰ᩵ۚ;->֫(Ljava/io/Writer;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1109
    :catch_0
    iget v5, v2, Ll/۫ᩳۢ;->֫:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    goto :goto_2

    .line 1115
    :cond_4
    iget-object v2, p0, Ll/ܽܽۢ;->ۗ:Ll/᩹ۛ᩷;

    invoke-virtual {v2, v4}, Ll/᩹ۛ᩷;->֫(I)V

    .line 1116
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v5, v2, :cond_5

    .line 1117
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v3, v1, v5, v2}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    .line 1119
    :cond_5
    invoke-virtual {v3}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_2
    if-eqz v7, :cond_0

    .line 958
    invoke-interface {v0, v7}, Ll/ܰ֫ۢ;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    :goto_3
    return-void
.end method
