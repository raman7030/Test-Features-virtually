.class public final Ll/ۘۜܿ;
.super Ljava/lang/RuntimeException;
.source "B929"


# instance fields
.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(Landroid/graphics/Point;Ljava/lang/String;)V
    .locals 2

    .line 17
    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p1, p2}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 3

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x3a

    if-eqz p1, :cond_0

    const-string v2, "["

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "] line "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-lez p3, :cond_2

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p3, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const/16 p1, 0x5d

    if-lez p3, :cond_1

    const/16 v2, 0x5b

    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "[line "

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    .line 69
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    const/16 p1, 0x20

    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 27
    iput p2, p0, Ll/ۘۜܿ;->᩹:I

    .line 28
    iput p3, p0, Ll/ۘۜܿ;->᩸:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Ll/ۘۜܿ;->initCause(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public final declared-synchronized initCause(Ljava/lang/Throwable;)V
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 34
    :try_start_0
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/۫ۨᩳ;)V
    .locals 2

    .line 51
    iget v0, p0, Ll/ۘۜܿ;->᩹:I

    iget v1, p0, Ll/ۘۜܿ;->᩸:I

    invoke-static {v0, v1}, Ll/᩵ۛ᩷;->֫(II)Ll/᩵ۛ᩷;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۛ᩷;->֫(Ll/۫ۨᩳ;)V

    return-void
.end method
