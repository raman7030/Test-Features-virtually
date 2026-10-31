.class public final Ll/ۙ᩸᩻;
.super Ll/֫ۜܳ;
.source "J97P"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public ۗ:Z

.field public ۛ:J

.field public ۤ:I

.field public ۫:I

.field public ۬:Ll/ۗ᩸᩻;


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205f2

    const v1, 0x7f080227

    .line 20
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    const-wide/16 v0, 0x0

    .line 24
    iput-wide v0, p0, Ll/ۙ᩸᩻;->ۛ:J

    const/4 v0, 0x0

    .line 25
    iput v0, p0, Ll/ۙ᩸᩻;->۫:I

    .line 26
    iput v0, p0, Ll/ۙ᩸᩻;->ۤ:I

    .line 27
    iput-boolean v0, p0, Ll/ۙ᩸᩻;->ۗ:Z

    return-void
.end method

.method private ֫(Ljava/util/Collection;)V
    .locals 7

    .line 80
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 82
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 83
    iget-boolean p1, p0, Ll/ۙ᩸᩻;->ۗ:Z

    if-eqz p1, :cond_0

    goto :goto_2

    .line 86
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩵ܿ;

    const/4 v1, 0x1

    .line 413
    invoke-virtual {p1, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p1

    .line 87
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 88
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 89
    iget v3, p0, Ll/ۙ᩸᩻;->ۤ:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/ۙ᩸᩻;->ۤ:I

    .line 90
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    .line 91
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_1

    .line 94
    :cond_2
    iget v3, p0, Ll/ۙ᩸᩻;->۫:I

    add-int/2addr v3, v1

    iput v3, p0, Ll/ۙ᩸᩻;->۫:I

    .line 95
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩸֫()Z

    move-result v3

    if-nez v3, :cond_1

    .line 96
    iget-wide v3, p0, Ll/ۙ᩸᩻;->ۛ:J

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/ۙ᩸᩻;->ۛ:J

    goto :goto_1

    .line 100
    :cond_3
    new-instance p1, Ll/᩶᩸᩻;

    invoke-direct {p1, p0}, Ll/᩶᩸᩻;-><init>(Ll/ۙ᩸᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public static synthetic ֫(Ll/ۙ᩸᩻;)V
    .locals 5

    .line 44
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    iget-wide v1, p0, Ll/ۙ᩸᩻;->ۛ:J

    iget v3, p0, Ll/ۙ᩸᩻;->۫:I

    iget v4, p0, Ll/ۙ᩸᩻;->ۤ:I

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/ۗ᩸᩻;->֫(IIJ)V

    .line 45
    iget-object p0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {p0}, Ll/ۗ᩸᩻;->֫()V

    return-void
.end method

.method public static ֫(Ll/ۙ᩸᩻;Ljava/util/List;)V
    .locals 6

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 57
    invoke-interface {v1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 58
    iget v2, p0, Ll/ۙ᩸᩻;->ۤ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۙ᩸᩻;->ۤ:I

    .line 59
    invoke-interface {v1}, Ll/ᩳۜܳ;->۬()Z

    move-result v2

    if-nez v2, :cond_0

    .line 60
    invoke-interface {v1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 63
    :cond_1
    iget v2, p0, Ll/ۙ᩸᩻;->۫:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۙ᩸᩻;->۫:I

    .line 64
    invoke-interface {v1}, Ll/ᩳۜܳ;->۬()Z

    move-result v2

    if-nez v2, :cond_0

    .line 65
    iget-wide v2, p0, Ll/ۙ᩸᩻;->ۛ:J

    invoke-interface {v1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v4

    add-long/2addr v4, v2

    iput-wide v4, p0, Ll/ۙ᩸᩻;->ۛ:J

    goto :goto_0

    .line 69
    :cond_2
    new-instance p1, Ll/᩸᩸᩻;

    invoke-direct {p1, p0}, Ll/᩸᩸᩻;-><init>(Ll/ۙ᩸᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 70
    invoke-direct {p0, v0}, Ll/ۙ᩸᩻;->֫(Ljava/util/Collection;)V

    .line 71
    new-instance p1, Ll/᩹᩸᩻;

    invoke-direct {p1, p0}, Ll/᩹᩸᩻;-><init>(Ll/ۙ᩸᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/ۙ᩸᩻;Ll/ᩳۜܳ;)V
    .locals 0

    .line 42
    invoke-interface {p1}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۙ᩸᩻;->֫(Ljava/util/Collection;)V

    .line 43
    new-instance p1, Ll/ܶ᩸᩻;

    invoke-direct {p1, p0}, Ll/ܶ᩸᩻;-><init>(Ll/ۙ᩸᩻;)V

    .line 242
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۙ᩸᩻;)V
    .locals 5

    .line 72
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    iget-wide v1, p0, Ll/ۙ᩸᩻;->ۛ:J

    iget v3, p0, Ll/ۙ᩸᩻;->۫:I

    iget v4, p0, Ll/ۙ᩸᩻;->ۤ:I

    invoke-virtual {v0, v3, v4, v1, v2}, Ll/ۗ᩸᩻;->֫(IIJ)V

    .line 73
    iget-object p0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {p0}, Ll/ۗ᩸᩻;->֫()V

    return-void
.end method

.method public static synthetic ܽ(Ll/ۙ᩸᩻;)V
    .locals 4

    .line 69
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    iget-wide v1, p0, Ll/ۙ᩸᩻;->ۛ:J

    iget v3, p0, Ll/ۙ᩸᩻;->۫:I

    iget p0, p0, Ll/ۙ᩸᩻;->ۤ:I

    invoke-virtual {v0, v3, p0, v1, v2}, Ll/ۗ᩸᩻;->֫(IIJ)V

    return-void
.end method

.method public static synthetic ᩳ(Ll/ۙ᩸᩻;)V
    .locals 4

    .line 100
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    iget-wide v1, p0, Ll/ۙ᩸᩻;->ۛ:J

    iget v3, p0, Ll/ۙ᩸᩻;->۫:I

    iget p0, p0, Ll/ۙ᩸᩻;->ۤ:I

    invoke-virtual {v0, v3, p0, v1, v2}, Ll/ۗ᩸᩻;->֫(IIJ)V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    const/4 p1, 0x1

    .line 106
    iput-boolean p1, p0, Ll/ۙ᩸᩻;->ۗ:Z

    return-void
.end method

.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    const-string v0, "trash"

    .line 31
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 34
    new-instance v1, Ll/ۗ᩸᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ۗ᩸᩻;-><init>(Ll/ܽۢܳ;)V

    iput-object v1, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

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
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {v0, p0}, Ll/ۗ᩸᩻;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 40
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {v0, p1}, Ll/ۗ᩸᩻;->ۧ(Ll/ᩳۜܳ;)V

    .line 41
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/֨᩸᩻;

    invoke-direct {v1, p0, p1}, Ll/֨᩸᩻;-><init>(Ll/ۙ᩸᩻;Ll/ᩳۜܳ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 49
    :cond_0
    iget-object v0, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {v0, p1}, Ll/ۗ᩸᩻;->֫(Ll/ᩳۜܳ;)V

    return-void

    .line 52
    :cond_1
    iget-object v1, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {v1, p0}, Ll/ۗ᩸᩻;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 53
    iget-object v1, p0, Ll/ۙ᩸᩻;->۬:Ll/ۗ᩸᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ll/ۗ᩸᩻;->֫(Ljava/lang/String;Ljava/util/List;)V

    .line 54
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/۠᩸᩻;

    invoke-direct {v1, p0, v0}, Ll/۠᩸᩻;-><init>(Ll/ۙ᩸᩻;Ljava/util/List;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
