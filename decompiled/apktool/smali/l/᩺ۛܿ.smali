.class public Ll/᩺ۛܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/ܳۨܿ;)V
    .locals 1

    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩺ۛܿ;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 2

    .line 211
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_1

    .line 212
    iget-object p2, p0, Ll/᩺ۛܿ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳۨܿ;

    if-eqz p2, :cond_0

    .line 214
    invoke-static {p2}, Ll/ܳۨܿ;->ܳ(Ll/ܳۨܿ;)V

    .line 216
    :cond_0
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void

    .line 219
    :cond_1
    sget-object v0, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    if-ne p2, v0, :cond_5

    .line 220
    iget-object p2, p0, Ll/᩺ۛܿ;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܳۨܿ;

    if-nez p2, :cond_2

    .line 222
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void

    .line 225
    :cond_2
    invoke-static {p2}, Ll/ܳۨܿ;->ܿ(Ll/ܳۨܿ;)Ll/֡ۚۢ;

    move-result-object v0

    .line 226
    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-nez v1, :cond_3

    .line 227
    invoke-interface {p1}, Ll/᩻ۡ֫;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void

    .line 230
    :cond_3
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lbin/mt/function/ar/ActivityRecordService;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_4

    const v0, 0x7f1209e1

    goto :goto_0

    :cond_4
    const v0, 0x7f1209d2

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 231
    invoke-static {p2}, Ll/ܳۨܿ;->ܽ(Ll/ܳۨܿ;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 232
    sget-object p1, Lbin/mt/function/ar/ActivityRecordService;->ۨ:Ljava/util/LinkedList;

    move-object v0, p1

    monitor-enter v0

    .line 233
    :try_start_0
    invoke-static {p2}, Ll/ܳۨܿ;->ܽ(Ll/ܳۨܿ;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 234
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 235
    invoke-static {p2}, Ll/ܳۨܿ;->ᩳ(Ll/ܳۨܿ;)Landroid/widget/BaseAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :catchall_0
    move-exception p1

    .line 234
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    return-void
.end method
