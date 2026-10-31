.class public final Ll/֫ۘܽ;
.super Ll/֫ۛۡ;
.source "A5OQ"


# instance fields
.field public ᩸:Ll/ܽۘܽ;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 35
    new-instance p1, Ll/ܽۘܽ;

    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/֫ۘܽ;->᩸:Ll/ܽۘܽ;

    .line 36
    invoke-virtual {p1, p2}, Ll/ܽۘܽ;->ܳ(I)V

    .line 37
    invoke-virtual {p1, p3}, Ll/ܽۘܽ;->֫(I)V

    .line 38
    invoke-virtual {p1, p2}, Ll/ܽۘܽ;->ᩳ(I)V

    .line 39
    invoke-virtual {p1, p3}, Ll/ܽۘܽ;->ܽ(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/۟ۖܽ;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 45
    new-instance p1, Ll/ܽۘܽ;

    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/֫ۘܽ;->᩸:Ll/ܽۘܽ;

    .line 46
    invoke-virtual {p1, p2}, Ll/ܽۘܽ;->ۧ(Ll/۟ۖܽ;)V

    .line 47
    invoke-virtual {p1, p2}, Ll/ܽۘܽ;->֫(Ll/۟ۖܽ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۡۘܽ;)V
    .locals 1

    .line 26
    invoke-virtual {p2}, Ll/ۡۘܽ;->ᩳ()I

    move-result v0

    invoke-virtual {p2}, Ll/ۡۘܽ;->ۧ()I

    move-result p2

    invoke-direct {p0, p1, v0, p2}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;II)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ܽۘܽ;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 15
    iput-object p2, p0, Ll/֫ۘܽ;->᩸:Ll/ܽۘܽ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ᩴۘܽ;)V
    .locals 1

    .line 30
    invoke-virtual {p2}, Ll/ᩴۘܽ;->ᩳ()I

    move-result v0

    invoke-virtual {p2}, Ll/ᩴۘܽ;->ܽ()I

    move-result p2

    invoke-direct {p0, p1, v0, p2}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public final bridge synthetic initCause(Ljava/lang/Throwable;)Ll/֫ۛۡ;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public final declared-synchronized initCause(Ljava/lang/Throwable;)V
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 64
    :try_start_0
    invoke-super {p0, p1}, Ll/֫ۛۡ;->initCause(Ljava/lang/Throwable;)Ll/֫ۛۡ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/֫ۛۡ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫ۘܽ;->᩸:Ll/ܽۘܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ܽۘܽ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/֫ۘܽ;->᩸:Ll/ܽۘܽ;

    return-object v0
.end method
