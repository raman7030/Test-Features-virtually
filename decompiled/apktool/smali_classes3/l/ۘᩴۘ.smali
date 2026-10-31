.class public final Ll/ۘᩴۘ;
.super Ll/᩷ᩴۘ;
.source "V8DC"


# instance fields
.field public final synthetic ۬:Ll/ᩴᩴۘ;


# direct methods
.method public constructor <init>(Ll/ᩴᩴۘ;Ll/ۖ᩹ۢ;II)V
    .locals 1

    .line 52
    iput-object p1, p0, Ll/ۘᩴۘ;->۬:Ll/ᩴᩴۘ;

    .line 41
    invoke-direct {p0, p1}, Ljava/util/EventObject;-><init>(Ljava/lang/Object;)V

    add-int p1, p3, p4

    .line 78
    invoke-virtual {p2}, Ll/ۖ᩹ۢ;->ۧ()I

    move-result v0

    if-gt p1, v0, :cond_1

    if-ltz p3, :cond_0

    .line 84
    iput-object p2, p0, Ll/᩷ᩴۘ;->ۗ:Ll/ۖ᩹ۢ;

    .line 85
    new-instance p1, Ll/ۡᩴۘ;

    const/4 p2, 0x3

    .line 24
    invoke-direct {p1, p2}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 86
    iput p3, p0, Ll/ۢᩴۘ;->ۙ:I

    .line 87
    iput p4, p0, Ll/ۢᩴۘ;->᩹:I

    return-void

    .line 81
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "tried to queue before start of data, "

    .line 0
    invoke-static {p3, p2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 81
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "tried to queue past end of data, "

    .line 0
    invoke-static {p1, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 79
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 58
    iget-object v0, p0, Ll/ۘᩴۘ;->۬:Ll/ᩴᩴۘ;

    invoke-static {v0}, Ll/ᩴᩴۘ;->֫(Ll/ᩴᩴۘ;)Ljava/util/LinkedList;

    move-result-object v0

    monitor-enter v0

    .line 60
    :try_start_0
    iget-object v1, p0, Ll/ۘᩴۘ;->۬:Ll/ᩴᩴۘ;

    invoke-static {v1}, Ll/ᩴᩴۘ;->֫(Ll/ᩴᩴۘ;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 61
    iget-object v1, p0, Ll/ۘᩴۘ;->۬:Ll/ᩴᩴۘ;

    invoke-static {v1}, Ll/ᩴᩴۘ;->֫(Ll/ᩴᩴۘ;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢᩴۘ;

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    :cond_0
    iget-object v1, p0, Ll/ۘᩴۘ;->۬:Ll/ᩴᩴۘ;

    invoke-static {v1}, Ll/ᩴᩴۘ;->֫(Ll/ᩴᩴۘ;)Ljava/util/LinkedList;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 90
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
