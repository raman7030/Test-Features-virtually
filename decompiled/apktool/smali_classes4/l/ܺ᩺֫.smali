.class public final Ll/ܺ᩺֫;
.super Ljava/lang/Object;
.source "K7MX"

# interfaces
.implements Ll/֫ܰ֫;


# instance fields
.field public final synthetic ᩸:Ll/ᩴ᩺֫;


# direct methods
.method public constructor <init>(Ll/ᩴ᩺֫;)V
    .locals 0

    .line 922
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩺֫;->᩸:Ll/ᩴ᩺֫;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/net/Uri;Ll/֫ܳۧ;Z)Z
    .locals 9

    .line 932
    iget-object p3, p0, Ll/ܺ᩺֫;->᩸:Ll/ᩴ᩺֫;

    invoke-static {p3}, Ll/ᩴ᩺֫;->᩷(Ll/ᩴ᩺֫;)Ll/ۙ᩺֫;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 933
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 935
    invoke-static {p3}, Ll/ᩴ᩺֫;->ܿ(Ll/ᩴ᩺֫;)Ll/۫᩺֫;

    move-result-object v0

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-object v0, v0, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 936
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_1

    .line 938
    invoke-static {p3}, Ll/ᩴ᩺֫;->ܳ(Ll/ᩴ᩺֫;)Ljava/util/HashMap;

    move-result-object v6

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬᩺֫;

    iget-object v7, v7, Ll/۬᩺֫;->ܿ:Landroid/net/Uri;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘ᩺֫;

    if-eqz v6, :cond_0

    .line 939
    invoke-static {v6}, Ll/ۘ᩺֫;->֫(Ll/ۘ᩺֫;)J

    move-result-wide v6

    cmp-long v8, v2, v6

    if-gez v8, :cond_0

    add-int/lit8 v5, v5, 0x1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 943
    :cond_1
    new-instance v0, Ll/ܰܿۧ;

    invoke-static {p3}, Ll/ᩴ᩺֫;->ܿ(Ll/ᩴ᩺֫;)Ll/۫᩺֫;

    move-result-object v2

    iget-object v2, v2, Ll/۫᩺֫;->ܺ:Ljava/util/List;

    .line 947
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2, v5}, Ll/ܰܿۧ;-><init>(II)V

    .line 950
    invoke-static {p3}, Ll/ᩴ᩺֫;->ᩳ(Ll/ᩴ᩺֫;)Ll/ۧܳۧ;

    move-result-object v2

    .line 951
    invoke-interface {v2, v0, p2}, Ll/ۧܳۧ;->֫(Ll/ܰܿۧ;Ll/֫ܳۧ;)Ll/۟ܿۧ;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 952
    iget v0, p2, Ll/۟ܿۧ;->ۧ:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    .line 954
    invoke-static {p3}, Ll/ᩴ᩺֫;->ܳ(Ll/ᩴ᩺֫;)Ljava/util/HashMap;

    move-result-object p3

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘ᩺֫;

    if-eqz p1, :cond_2

    .line 956
    iget-wide p2, p2, Ll/۟ܿۧ;->֫:J

    invoke-static {p1, p2, p3}, Ll/ۘ᩺֫;->֫(Ll/ۘ᩺֫;J)Z

    :cond_2
    return v1
.end method

.method public final ᩳ()V
    .locals 1

    .line 927
    iget-object v0, p0, Ll/ܺ᩺֫;->᩸:Ll/ᩴ᩺֫;

    invoke-static {v0}, Ll/ᩴ᩺֫;->ܽ(Ll/ᩴ᩺֫;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
