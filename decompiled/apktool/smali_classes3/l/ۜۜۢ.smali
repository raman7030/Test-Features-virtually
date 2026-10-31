.class public final Ll/ۜۜۢ;
.super Ll/۟ܶۡ;
.source "M1KQ"


# instance fields
.field public final synthetic ۜ:Ll/ܶۜۢ;

.field public ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩷:I

.field public ᩻:Ll/᩺ۤܿ;


# direct methods
.method public constructor <init>(Ll/ܶۜۢ;I)V
    .locals 0

    .line 124
    iput-object p1, p0, Ll/ۜۜۢ;->ۜ:Ll/ܶۜۢ;

    iput p2, p0, Ll/ۜۜۢ;->᩷:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 177
    iget-object v0, p0, Ll/ۜۜۢ;->ܳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۜۜۢ;->ۜ:Ll/ܶۜۢ;

    invoke-static {v1, v0}, Ll/ܶۜۢ;->֫(Ll/ܶۜۢ;Ljava/util/ArrayList;)V

    .line 178
    invoke-static {v1}, Ll/ܶۜۢ;->ܽ(Ll/ܶۜۢ;)Ll/֡ۜۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 183
    iget-object v0, p0, Ll/ۜۜۢ;->ۜ:Ll/ܶۜۢ;

    invoke-static {v0}, Ll/ܶۜۢ;->ۡ(Ll/ܶۜۢ;)Ll/ۘۛ᩷;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 131
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/ۜۜۢ;->ۜ:Ll/ܶۜۢ;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v2

    check-cast v2, Ll/ۗܺ᩷;

    invoke-direct {v0, v2}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    iget v2, p0, Ll/ۜۜۢ;->᩷:I

    .line 132
    invoke-virtual {v0, v2}, Ll/᩺ۤܿ;->ܽ(I)V

    const/4 v2, 0x0

    .line 65
    invoke-virtual {v0, v2}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 134
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/ۜۜۢ;->᩻:Ll/᩺ۤܿ;

    .line 135
    invoke-static {v1}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 136
    invoke-static {v1, v2}, Ll/ܶۜۢ;->֫(Ll/ܶۜۢ;Ljava/util/ArrayList;)V

    .line 137
    invoke-static {v1}, Ll/ܶۜۢ;->ܽ(Ll/ܶۜۢ;)Ll/֡ۜۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final ܿ()V
    .locals 8

    .line 143
    :goto_0
    iget-object v0, p0, Ll/ۜۜۢ;->ۜ:Ll/ܶۜۢ;

    invoke-static {v0}, Ll/ܶۜۢ;->ܳ(Ll/ܶۜۢ;)Ll/۫ۧۢ;

    move-result-object v1

    if-nez v1, :cond_0

    const-wide/16 v0, 0xa

    .line 144
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    .line 146
    :cond_0
    invoke-static {v0}, Ll/ܶۜۢ;->ܳ(Ll/ܶۜۢ;)Ll/۫ۧۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۧۢ;->۠()V

    .line 147
    invoke-static {v0}, Ll/ܶۜۢ;->ܳ(Ll/ܶۜۢ;)Ll/۫ۧۢ;

    move-result-object v1

    new-instance v2, Ll/᩻ۜۢ;

    invoke-direct {v2, p0}, Ll/᩻ۜۢ;-><init>(Ll/ۜۜۢ;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    new-instance v3, Ll/ۧۤᩴ;

    invoke-direct {v3}, Ll/ۧۤᩴ;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v3

    .line 1070
    invoke-virtual {v1}, Ll/۫ۧۢ;->ۜ()Ljava/util/ArrayList;

    move-result-object v1

    .line 1071
    new-instance v4, Ll/᩵ۛۡ;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    int-to-long v5, v5

    invoke-direct {v4, v5, v6}, Ll/᩵ۛۡ;-><init>(J)V

    invoke-virtual {v4, v2}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 1072
    sget-object v5, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v5, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v5}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v5

    .line 1073
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰ֫ۢ;

    .line 1074
    new-instance v7, Ll/᩶ۧۢ;

    invoke-direct {v7, v2, v4, v6, v3}, Ll/᩶ۧۢ;-><init>(Ll/ۡۛۡ;Ll/᩵ۛۡ;Ll/ܰ֫ۢ;Ljava/util/Set;)V

    invoke-interface {v5, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_1

    .line 1082
    :cond_1
    invoke-static {v5}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    .line 158
    new-instance v1, Ll/ܿۜۢ;

    invoke-direct {v1, p0}, Ll/ܿۜۢ;-><init>(Ll/ۜۜۢ;)V

    invoke-static {v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 163
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ۜۜۢ;->ܳ:Ljava/util/ArrayList;

    .line 164
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 165
    new-instance v4, Ll/ܺۜۢ;

    invoke-direct {v4, v3}, Ll/ܺۜۢ;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 167
    :cond_2
    new-instance v2, Ll/ܳۜۢ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v2, 0x0

    .line 168
    invoke-static {v0, v2}, Ll/ܶۜۢ;->ۧ(Ll/ܶۜۢ;Z)V

    .line 169
    invoke-static {v0, v2}, Ll/ܶۜۢ;->֫(Ll/ܶۜۢ;Z)V

    .line 170
    invoke-static {v0, v1}, Ll/ܶۜۢ;->ۧ(Ll/ܶۜۢ;Ljava/util/ArrayList;)V

    .line 171
    invoke-static {v0}, Ll/ܶۜۢ;->ۖ(Ll/ܶۜۢ;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ۜۜۢ;->ۜ:Ll/ܶۜۢ;

    invoke-static {v0}, Ll/ܶۜۢ;->ܳ(Ll/ܶۜۢ;)Ll/۫ۧۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۧۢ;->ܶ()V

    .line 189
    iget-object v0, p0, Ll/ۜۜۢ;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method
