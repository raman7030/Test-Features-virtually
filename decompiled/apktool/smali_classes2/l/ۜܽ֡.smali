.class public final Ll/ۜܽ֡;
.super Ljava/lang/Object;
.source "I4F2"


# instance fields
.field public final ֫:Ljava/lang/reflect/Method;

.field public final ۧ:Ljava/lang/reflect/Method;

.field public final ܽ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 343
    iput-object p1, p0, Ll/ۜܽ֡;->֫:Ljava/lang/reflect/Method;

    .line 344
    iput-object p2, p0, Ll/ۜܽ֡;->ۧ:Ljava/lang/reflect/Method;

    .line 345
    iput-object p3, p0, Ll/ۜܽ֡;->ܽ:Ljava/lang/reflect/Method;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    .line 349
    iget-object v1, p0, Ll/ۜܽ֡;->֫:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    .line 351
    :try_start_0
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 352
    iget-object v2, p0, Ll/ۜܽ֡;->ۧ:Ljava/lang/reflect/Method;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "response.body().close()"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_0
    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 364
    :try_start_0
    iget-object v0, p0, Ll/ۜܽ֡;->ܽ:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return p1
.end method
