.class public final Ll/ۖۧ֡;
.super Ll/ܶ۟᩵;
.source "I4F9"


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩹:Ll/᩹ۧ֡;


# direct methods
.method public varargs constructor <init>(Ll/᩹ۧ֡;[Ljava/lang/Object;ILl/ܰ֫֡;)V
    .locals 0

    .line 983
    iput-object p1, p0, Ll/ۖۧ֡;->᩹:Ll/᩹ۧ֡;

    iput p3, p0, Ll/ۖۧ֡;->᩶:I

    const-string p1, "OkHttp %s Push Reset[%s]"

    invoke-direct {p0, p1, p2}, Ll/ܶ۟᩵;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 985
    iget-object v0, p0, Ll/ۖۧ֡;->᩹:Ll/᩹ۧ֡;

    iget-object v0, v0, Ll/᩹ۧ֡;->ᩳ֫:Ll/۟ۧ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    iget-object v0, p0, Ll/ۖۧ֡;->᩹:Ll/᩹ۧ֡;

    monitor-enter v0

    .line 987
    :try_start_0
    iget-object v1, p0, Ll/ۖۧ֡;->᩹:Ll/᩹ۧ֡;

    iget-object v1, v1, Ll/᩹ۧ֡;->ۙ:Ljava/util/LinkedHashSet;

    iget v2, p0, Ll/ۖۧ֡;->᩶:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 988
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
