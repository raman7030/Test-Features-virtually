.class public final Ll/ۙܿۧ;
.super Ljava/lang/Object;
.source "38N3"


# instance fields
.field public final ֫:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙܿۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(JIJ)V
    .locals 10

    .line 77
    iget-object v0, p0, Ll/ۙܿۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/᩶ܿۧ;

    .line 78
    invoke-static {v3}, Ll/᩶ܿۧ;->ܽ(Ll/᩶ܿۧ;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 79
    invoke-static {v3}, Ll/᩶ܿۧ;->֫(Ll/᩶ܿۧ;)Landroid/os/Handler;

    move-result-object v1

    new-instance v9, Ll/᩹ܿۧ;

    move-object v2, v9

    move v4, p3

    move-wide v5, p1

    move-wide v7, p4

    invoke-direct/range {v2 .. v8}, Ll/᩹ܿۧ;-><init>(Ll/᩶ܿۧ;IJJ)V

    invoke-virtual {v1, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Landroid/os/Handler;Ll/ۗܿۧ;)V
    .locals 1

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    invoke-virtual {p0, p2}, Ll/ۙܿۧ;->֫(Ll/ۗܿۧ;)V

    .line 63
    new-instance v0, Ll/᩶ܿۧ;

    invoke-direct {v0, p1, p2}, Ll/᩶ܿۧ;-><init>(Landroid/os/Handler;Ll/ۗܿۧ;)V

    iget-object p1, p0, Ll/ۙܿۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۗܿۧ;)V
    .locals 4

    .line 68
    iget-object v0, p0, Ll/ۙܿۧ;->֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ܿۧ;

    .line 69
    invoke-static {v2}, Ll/᩶ܿۧ;->ۧ(Ll/᩶ܿۧ;)Ll/ۗܿۧ;

    move-result-object v3

    if-ne v3, p1, :cond_0

    .line 70
    invoke-virtual {v2}, Ll/᩶ܿۧ;->֫()V

    .line 71
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method
