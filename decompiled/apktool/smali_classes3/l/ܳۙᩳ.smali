.class public final Ll/ܳۙᩳ;
.super Ljava/lang/Object;
.source "K6U1"


# instance fields
.field public ֫:J

.field public final ۧ:Ljava/util/IdentityHashMap;

.field public ܳ:Ll/ۢۙᩳ;

.field public ܽ:Ll/ۢۙᩳ;

.field public final ܿ:Ll/ᩳۙᩳ;

.field public final ᩳ:Ll/ܿۙᩳ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ܳۙᩳ;->ۧ:Ljava/util/IdentityHashMap;

    .line 12
    new-instance v0, Ll/ᩳۙᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ᩳۙᩳ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ܳۙᩳ;->ܿ:Ll/ᩳۙᩳ;

    new-instance v0, Ll/ܿۙᩳ;

    invoke-direct {v0, p0}, Ll/ܿۙᩳ;-><init>(Ll/ܳۙᩳ;)V

    iput-object v0, p0, Ll/ܳۙᩳ;->ᩳ:Ll/ܿۙᩳ;

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)J
    .locals 3

    .line 79
    instance-of v0, p0, Ll/ۚۗᩳ;

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x48

    return-wide v0

    .line 80
    :cond_0
    instance-of v0, p0, Ll/᩺᩶ᩳ;

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x80

    return-wide v0

    .line 81
    :cond_1
    instance-of v0, p0, Ll/ۡ۬ᩳ;

    const-wide/16 v1, 0x68

    if-eqz v0, :cond_2

    return-wide v1

    .line 82
    :cond_2
    instance-of v0, p0, Ll/ۢۙᩳ;

    if-eqz v0, :cond_3

    return-wide v1

    .line 83
    :cond_3
    invoke-static {p0}, Ll/ۘ᩹ᩳ;->֫(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method private ֫(Ljava/lang/Object;Z)V
    .locals 1

    .line 65
    instance-of v0, p1, Ll/ۢۙᩳ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۢۙᩳ;

    .line 66
    iget-object v0, p1, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    return-void

    .line 67
    :cond_0
    iget-object v0, p1, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-direct {p0, v0, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    iget-object p1, p1, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-direct {p0, p1, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    return-void

    .line 68
    :cond_1
    instance-of v0, p1, Ll/ۡ۬ᩳ;

    if-eqz v0, :cond_2

    check-cast p1, Ll/ۡ۬ᩳ;

    .line 69
    iget-object p1, p1, Ll/ۡ۬ᩳ;->֫:Ll/ܺۙᩳ;

    iget-object p1, p1, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    invoke-direct {p0, p1, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    return-void

    .line 70
    :cond_2
    instance-of v0, p1, Ll/᩺᩶ᩳ;

    if-eqz v0, :cond_3

    check-cast p1, Ll/᩺᩶ᩳ;

    .line 71
    iget-object v0, p1, Ll/᩺᩶ᩳ;->᩻:Ll/ۚۗᩳ;

    invoke-direct {p0, v0, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    .line 72
    iget-object v0, p1, Ll/᩺᩶ᩳ;->ܳ:Ll/ۨ᩹ᩳ;

    invoke-direct {p0, v0, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    .line 73
    iget-object p1, p1, Ll/᩺᩶ᩳ;->֫:Ll/ۨ᩹ᩳ;

    invoke-direct {p0, p1, p2}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;Z)V

    return-void

    :cond_3
    if-eqz p2, :cond_4

    .line 74
    iget-object p2, p0, Ll/ܳۙᩳ;->ܿ:Ll/ᩳۙᩳ;

    goto :goto_0

    :cond_4
    iget-object p2, p0, Ll/ܳۙᩳ;->ᩳ:Ll/ܿۙᩳ;

    :goto_0
    invoke-static {p1, p2}, Ll/ۘ᩹ᩳ;->֫(Ljava/lang/Object;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۙᩳ;Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method private ۧ(Ljava/lang/Object;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 48
    :cond_0
    iget-object v0, p0, Ll/ܳۙᩳ;->ۧ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 51
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-wide v0, p0, Ll/ܳۙᩳ;->֫:J

    invoke-static {p1}, Ll/ܳۙᩳ;->֫(Ljava/lang/Object;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܳۙᩳ;->֫:J

    .line 12
    instance-of v0, p1, Ll/۠۬ᩳ;

    if-nez v0, :cond_2

    instance-of v1, p1, Ll/ۧ۫ᩳ;

    if-eqz v1, :cond_4

    :cond_2
    if-eqz v0, :cond_3

    goto :goto_0

    .line 14
    :cond_3
    move-object v0, p1

    check-cast v0, Ll/ۧ۫ᩳ;

    invoke-virtual {v0}, Ll/ۧ۫ᩳ;->֫()J

    :cond_4
    :goto_0
    const/4 v0, 0x0

    .line 57
    invoke-direct {p0, p1, v0}, Ll/ܳۙᩳ;->֫(Ljava/lang/Object;Z)V

    return-void

    .line 49
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unbalanced history budget release"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ۧ(Ljava/lang/Object;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 61
    invoke-direct {p0, p1}, Ll/ܳۙᩳ;->ܽ(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܳۙᩳ;Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܳۙᩳ;->ܽ(Ljava/lang/Object;)V

    return-void
.end method

.method private ܽ(Ljava/lang/Object;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Ll/ܳۙᩳ;->ۧ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v3, v1

    int-to-long v1, v2

    add-long/2addr v3, v1

    long-to-int v1, v3

    int-to-long v5, v1

    cmp-long v2, v3, v5

    if-nez v2, :cond_1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 0
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 37
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    iget-wide v0, p0, Ll/ܳۙᩳ;->֫:J

    invoke-static {p1}, Ll/ܳۙᩳ;->֫(Ljava/lang/Object;)J

    move-result-wide v3

    add-long/2addr v0, v3

    iput-wide v0, p0, Ll/ܳۙᩳ;->֫:J

    .line 12
    instance-of v0, p1, Ll/۠۬ᩳ;

    if-nez v0, :cond_3

    instance-of v1, p1, Ll/ۧ۫ᩳ;

    if-eqz v1, :cond_5

    :cond_3
    if-eqz v0, :cond_4

    goto :goto_0

    .line 14
    :cond_4
    move-object v0, p1

    check-cast v0, Ll/ۧ۫ᩳ;

    invoke-virtual {v0}, Ll/ۧ۫ᩳ;->֫()J

    .line 43
    :cond_5
    :goto_0
    invoke-direct {p0, p1, v2}, Ll/ܳۙᩳ;->֫(Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 16
    iget-wide v0, p0, Ll/ܳۙᩳ;->֫:J

    return-wide v0
.end method

.method public final ֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V
    .locals 3

    .line 22
    iget-object v0, p0, Ll/ܳۙᩳ;->ܳ:Ll/ۢۙᩳ;

    iget-object v1, p1, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܳۙᩳ;->ܽ:Ll/ۢۙᩳ;

    iget-object v2, p2, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    if-ne v0, v2, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-direct {p0, v1}, Ll/ܳۙᩳ;->ܽ(Ljava/lang/Object;)V

    .line 24
    iget-object v0, p2, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    invoke-direct {p0, v0}, Ll/ܳۙᩳ;->ܽ(Ljava/lang/Object;)V

    .line 25
    iget-object v0, p0, Ll/ܳۙᩳ;->ܳ:Ll/ۢۙᩳ;

    invoke-direct {p0, v0}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;)V

    .line 26
    iget-object v0, p0, Ll/ܳۙᩳ;->ܽ:Ll/ۢۙᩳ;

    invoke-direct {p0, v0}, Ll/ܳۙᩳ;->ۧ(Ljava/lang/Object;)V

    .line 27
    iget-object p1, p1, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    iput-object p1, p0, Ll/ܳۙᩳ;->ܳ:Ll/ۢۙᩳ;

    .line 28
    iget-object p1, p2, Ll/ܺۙᩳ;->᩸:Ll/ۢۙᩳ;

    iput-object p1, p0, Ll/ܳۙᩳ;->ܽ:Ll/ۢۙᩳ;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 31
    new-instance v0, Ll/ܺۙᩳ;

    invoke-direct {v0}, Ll/ܺۙᩳ;-><init>()V

    new-instance v1, Ll/ܺۙᩳ;

    invoke-direct {v1}, Ll/ܺۙᩳ;-><init>()V

    invoke-virtual {p0, v0, v1}, Ll/ܳۙᩳ;->֫(Ll/ܺۙᩳ;Ll/ܺۙᩳ;)V

    return-void
.end method
