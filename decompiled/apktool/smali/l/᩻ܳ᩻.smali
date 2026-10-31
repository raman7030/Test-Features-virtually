.class public final Ll/᩻ܳ᩻;
.super Ll/֫ۜܳ;
.source "QAI5"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public ۗ:Z

.field public ۛ:J

.field public ۤ:I

.field public ۨ:Ll/ۗۢ᩻;

.field public ۫:I

.field public ۬:Ll/֡᩷᩻;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205f2

    const v1, 0x7f080227

    .line 18
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    const-wide/16 v0, 0x0

    .line 22
    iput-wide v0, p0, Ll/᩻ܳ᩻;->ۛ:J

    const/4 v0, 0x0

    .line 23
    iput v0, p0, Ll/᩻ܳ᩻;->۫:I

    .line 24
    iput v0, p0, Ll/᩻ܳ᩻;->ۤ:I

    .line 25
    iput-boolean v0, p0, Ll/᩻ܳ᩻;->ۗ:Z

    return-void
.end method

.method private ֫(Ljava/lang/String;)V
    .locals 7

    .line 77
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 78
    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 80
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 81
    iget-boolean p1, p0, Ll/᩻ܳ᩻;->ۗ:Z

    if-eqz p1, :cond_0

    goto :goto_2

    .line 86
    :cond_0
    :try_start_0
    iget-object p1, p0, Ll/᩻ܳ᩻;->ۨ:Ll/ۗۢ᩻;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    .line 199
    invoke-virtual {p1, v1, v2}, Ll/ܰܺܳ;->֫(Ljava/lang/String;Z)Ljava/util/ArrayList;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 92
    invoke-interface {v1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 93
    iget v3, p0, Ll/᩻ܳ᩻;->ۤ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩻ܳ᩻;->ۤ:I

    .line 94
    invoke-interface {v1}, Ll/ᩳۜܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_1

    .line 95
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_1

    .line 98
    :cond_2
    iget v3, p0, Ll/᩻ܳ᩻;->۫:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/᩻ܳ᩻;->۫:I

    .line 99
    invoke-interface {v1}, Ll/ᩳۜܳ;->۬()Z

    move-result v3

    if-nez v3, :cond_1

    .line 100
    iget-wide v3, p0, Ll/᩻ܳ᩻;->ۛ:J

    invoke-interface {v1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v5

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/᩻ܳ᩻;->ۛ:J

    goto :goto_1

    .line 104
    :cond_3
    new-instance p1, Ll/ܳܳ᩻;

    invoke-direct {p1, p0}, Ll/ܳܳ᩻;-><init>(Ll/᩻ܳ᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_0

    :catch_0
    :cond_4
    :goto_2
    return-void
.end method

.method public static synthetic ֫(Ll/᩻ܳ᩻;)V
    .locals 4

    .line 104
    iget-object v0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    iget-wide v1, p0, Ll/᩻ܳ᩻;->ۛ:J

    iget v3, p0, Ll/᩻ܳ᩻;->۫:I

    iget p0, p0, Ll/᩻ܳ᩻;->ۤ:I

    invoke-virtual {v0, v3, p0, v1, v2}, Ll/֡᩷᩻;->֫(IIJ)V

    return-void
.end method

.method public static ֫(Ll/᩻ܳ᩻;Ljava/util/List;)V
    .locals 5

    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 56
    invoke-interface {v0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 57
    iget v1, p0, Ll/᩻ܳ᩻;->ۤ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩻ܳ᩻;->ۤ:I

    .line 58
    invoke-interface {v0}, Ll/ᩳۜܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_0

    .line 59
    invoke-interface {v0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩻ܳ᩻;->֫(Ljava/lang/String;)V

    goto :goto_0

    .line 62
    :cond_1
    iget v1, p0, Ll/᩻ܳ᩻;->۫:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/᩻ܳ᩻;->۫:I

    .line 63
    invoke-interface {v0}, Ll/ᩳۜܳ;->۬()Z

    move-result v1

    if-nez v1, :cond_0

    .line 64
    iget-wide v1, p0, Ll/᩻ܳ᩻;->ۛ:J

    invoke-interface {v0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/᩻ܳ᩻;->ۛ:J

    goto :goto_0

    .line 68
    :cond_2
    new-instance p1, Ll/ܿܳ᩻;

    invoke-direct {p1, p0}, Ll/ܿܳ᩻;-><init>(Ll/᩻ܳ᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/᩻ܳ᩻;Ll/ᩳۜܳ;)V
    .locals 0

    .line 42
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩻ܳ᩻;->֫(Ljava/lang/String;)V

    .line 43
    new-instance p1, Ll/ᩳܳ᩻;

    invoke-direct {p1, p0}, Ll/ᩳܳ᩻;-><init>(Ll/᩻ܳ᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/᩻ܳ᩻;)V
    .locals 5

    .line 44
    iget-object v0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    iget-wide v1, p0, Ll/᩻ܳ᩻;->ۛ:J

    iget v3, p0, Ll/᩻ܳ᩻;->۫:I

    iget v4, p0, Ll/᩻ܳ᩻;->ۤ:I

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/֡᩷᩻;->֫(IIJ)V

    .line 45
    iget-object p0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {p0}, Ll/֡᩷᩻;->֫()V

    return-void
.end method

.method public static synthetic ܽ(Ll/᩻ܳ᩻;)V
    .locals 5

    .line 69
    iget-object v0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    iget-wide v1, p0, Ll/᩻ܳ᩻;->ۛ:J

    iget v3, p0, Ll/᩻ܳ᩻;->۫:I

    iget v4, p0, Ll/᩻ܳ᩻;->ۤ:I

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/֡᩷᩻;->֫(IIJ)V

    .line 70
    iget-object p0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {p0}, Ll/֡᩷᩻;->֫()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    const/4 p1, 0x1

    .line 110
    iput-boolean p1, p0, Ll/᩻ܳ᩻;->ۗ:Z

    return-void
.end method

.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    const-string v0, "net"

    .line 30
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v0

    check-cast v0, Ll/ۗۢ᩻;

    iput-object v0, p0, Ll/᩻ܳ᩻;->ۨ:Ll/ۗۢ᩻;

    .line 33
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 34
    new-instance v1, Ll/֡᩷᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/֡᩷᩻;-><init>(Ll/ܽۢܳ;Ljava/util/List;)V

    iput-object v1, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    .line 36
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 p1, 0x0

    .line 37
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    .line 38
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {v0, p0}, Ll/֡᩷᩻;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 40
    iget-object v0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {v0, p1}, Ll/֡᩷᩻;->ۧ(Ll/ᩳۜܳ;)V

    .line 41
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ۧܳ᩻;

    invoke-direct {v1, p0, p1}, Ll/ۧܳ᩻;-><init>(Ll/᩻ܳ᩻;Ll/ᩳۜܳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {v0, p1}, Ll/֡᩷᩻;->֫(Ll/ᩳۜܳ;)V

    return-void

    .line 52
    :cond_1
    iget-object v1, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {v1, p0}, Ll/֡᩷᩻;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 53
    iget-object v1, p0, Ll/᩻ܳ᩻;->۬:Ll/֡᩷᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/֡᩷᩻;->֫(Ljava/lang/String;)V

    .line 54
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܽܳ᩻;

    invoke-direct {v1, p0, v0}, Ll/ܽܳ᩻;-><init>(Ll/᩻ܳ᩻;Ljava/util/List;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
