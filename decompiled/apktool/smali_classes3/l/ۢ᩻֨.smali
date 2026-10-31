.class public final Ll/ۢ᩻֨;
.super Ljava/lang/Object;
.source "19TZ"

# interfaces
.implements Ll/֫᩻֨;


# instance fields
.field public ۗ:Ll/ܽ᩻֨;

.field public ۙ:Ljava/util/Queue;

.field public final ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/reflect/Method;

.field public ᩶:Ljava/lang/Boolean;

.field public volatile ᩸:Ll/֫᩻֨;

.field public final ᩹:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;Z)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Ll/ۢ᩻֨;->۫:Ljava/lang/String;

    .line 60
    iput-object p2, p0, Ll/ۢ᩻֨;->ۙ:Ljava/util/Queue;

    .line 61
    iput-boolean p3, p0, Ll/ۢ᩻֨;->᩹:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 312
    const-class v2, Ll/ۢ᩻֨;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 315
    :cond_1
    check-cast p1, Ll/ۢ᩻֨;

    .line 317
    iget-object v2, p0, Ll/ۢ᩻֨;->۫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۢ᩻֨;->۫:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۢ᩻֨;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 325
    iget-object v0, p0, Ll/ۢ᩻֨;->۫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 269
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 265
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 137
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 129
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 233
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 229
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/֫᩻֨;)V
    .locals 0

    .line 355
    iput-object p1, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    return-void
.end method

.method public final ֫(Ll/ܳ᩻֨;)V
    .locals 4

    .line 372
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 374
    :try_start_0
    iget-object v0, p0, Ll/ۢ᩻֨;->۬:Ljava/lang/reflect/Method;

    iget-object v1, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final varargs ֫([Ljava/lang/Object;)V
    .locals 1

    .line 181
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->֫([Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 117
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 173
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 121
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 185
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 81
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 281
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final varargs ۧ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 133
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final varargs ۧ([Ljava/lang/Object;)V
    .locals 1

    .line 85
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ۧ([Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 165
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0}, Ll/֫᩻֨;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 388
    iget-object v0, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    instance-of v0, v0, Ll/ۜ᩻֨;

    return v0
.end method

.method public final ܽ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 77
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 169
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 89
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 225
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/֫᩻֨;->ܽ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 69
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ܿ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 125
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 1

    .line 73
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 273
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ܿ()Z
    .locals 5

    .line 359
    iget-object v0, p0, Ll/ۢ᩻֨;->᩶:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 360
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 363
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "log"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ll/ܿ᩻֨;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ᩻֨;->۬:Ljava/lang/reflect/Method;

    .line 364
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/ۢ᩻֨;->᩶:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 366
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/ۢ᩻֨;->᩶:Ljava/lang/Boolean;

    .line 368
    :goto_0
    iget-object v0, p0, Ll/ۢ᩻֨;->᩶:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Ll/֫᩻֨;
    .locals 2

    .line 333
    iget-object v0, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    return-object v0

    .line 336
    :cond_0
    iget-boolean v0, p0, Ll/ۢ᩻֨;->᩹:Z

    if-eqz v0, :cond_1

    .line 337
    sget-object v0, Ll/ۜ᩻֨;->᩸:Ll/ۜ᩻֨;

    return-object v0

    .line 344
    :cond_1
    iget-object v0, p0, Ll/ۢ᩻֨;->ۗ:Ll/ܽ᩻֨;

    if-nez v0, :cond_2

    .line 345
    new-instance v0, Ll/ܽ᩻֨;

    iget-object v1, p0, Ll/ۢ᩻֨;->ۙ:Ljava/util/Queue;

    invoke-direct {v0, p0, v1}, Ll/ܽ᩻֨;-><init>(Ll/ۢ᩻֨;Ljava/util/Queue;)V

    iput-object v0, p0, Ll/ۢ᩻֨;->ۗ:Ll/ܽ᩻֨;

    .line 347
    :cond_2
    iget-object v0, p0, Ll/ۢ᩻֨;->ۗ:Ll/ܽ᩻֨;

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 221
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll/֫᩻֨;->ᩳ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 217
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 177
    invoke-virtual {p0}, Ll/ۢ᩻֨;->ᩳ()Ll/֫᩻֨;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 384
    iget-object v0, p0, Ll/ۢ᩻֨;->᩸:Ll/֫᩻֨;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
