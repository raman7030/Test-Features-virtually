.class public final Ll/ܿᩳᩳ;
.super Ljava/lang/Object;
.source "L19N"


# instance fields
.field public final ֫:Ljava/util/function/Supplier;

.field public volatile ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/function/Supplier;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, Ll/ܿᩳᩳ;->֫:Ljava/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 3

    .line 144
    iget-object v1, p0, Ll/ܿᩳᩳ;->ۧ:Ljava/lang/Object;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 146
    monitor-enter v0

    .line 147
    :try_start_0
    iget-object v2, p0, Ll/ܿᩳᩳ;->ۧ:Ljava/lang/Object;

    if-nez v2, :cond_0

    .line 148
    iget-object v1, p0, Ll/ܿᩳᩳ;->֫:Ljava/util/function/Supplier;

    invoke-interface {v1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll/ܿᩳᩳ;->ۧ:Ljava/lang/Object;

    .line 150
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-object v1
.end method
