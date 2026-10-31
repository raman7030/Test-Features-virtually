.class public final Ll/᩵ۡۢ;
.super Ljava/lang/Object;
.source "31PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩸:Ljava/lang/ref/WeakReference;

.field public ᩹:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/۟ۡۢ;)V
    .locals 2

    .line 1171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1172
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩵ۡۢ;->᩸:Ljava/lang/ref/WeakReference;

    .line 1173
    invoke-static {p1}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۡۢ;->᩹:Ljava/util/List;

    .line 1174
    invoke-virtual {p0}, Ll/᩵ۡۢ;->֫()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const-wide/16 v0, 0x3e8

    .line 1175
    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1191
    iget-object v0, p0, Ll/᩵ۡۢ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۡۢ;

    if-eqz v0, :cond_4

    .line 1192
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Ll/᩵ۡۢ;->᩹:Ljava/util/List;

    invoke-static {v0}, Ll/۟ۡۢ;->᩷(Ll/۟ۡۢ;)Ljava/util/List;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 1194
    :cond_0
    invoke-static {v0}, Ll/۟ۡۢ;->ᩳ(Ll/۟ۡۢ;)Z

    move-result v1

    if-nez v1, :cond_1

    const-wide/16 v0, 0x1388

    .line 1195
    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    .line 1198
    :cond_1
    invoke-virtual {p0}, Ll/᩵ۡۢ;->֫()Ljava/util/ArrayList;

    move-result-object v1

    .line 1199
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    .line 1201
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v3, v2, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_3

    .line 1203
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽܺۢ;

    iget v5, v5, Ll/ܽܺۢ;->ۙ:I

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1205
    :cond_3
    sget-object v2, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/ۘۡۢ;

    invoke-direct {v4, p0, v3, v1, v0}, Ll/ۘۡۢ;-><init>(Ll/᩵ۡۢ;[ILjava/util/ArrayList;Ll/۟ۡۢ;)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫()Ljava/util/ArrayList;
    .locals 5

    .line 1180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1181
    iget-object v1, p0, Ll/᩵ۡۢ;->᩹:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽܺۢ;

    .line 1182
    iget v3, v2, Ll/ܽܺۢ;->۫:I

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    .line 1183
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method
