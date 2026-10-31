.class public final Ll/۬ۛۖ;
.super Ljava/lang/Object;
.source "T9JB"


# instance fields
.field public ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬ۛۖ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method private ۧ(Ll/᩻ۨۖ;Ll/֡֫ۘ;)V
    .locals 5

    .line 81
    invoke-virtual {p1}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    .line 82
    sget-object p1, Ll/۟۫ۖ;->ۤ:Ll/۟۫ۖ;

    invoke-virtual {p1}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    iget-object p1, p0, Ll/۬ۛۖ;->֫:Ljava/util/ArrayList;

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 83
    new-instance v0, Ll/᩶ۛۖ;

    .line 164
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 168
    invoke-virtual {p2}, Ll/ۤܰۖ;->ۜ()J

    .line 83
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 84
    :cond_0
    sget-object v2, Ll/۟۫ۖ;->᩸ۧ:Ll/۟۫ۖ;

    invoke-virtual {v2}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 85
    new-instance v0, Ll/ۗۛۖ;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 85
    invoke-static {v0, p2}, Ll/ۗۛۖ;->֫(Ll/ۗۛۖ;Ll/֡֫ۘ;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/ArrayList;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/۬ۛۖ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ֫(Ll/᩻ۨۖ;Ll/֡֫ۘ;)V
    .locals 3

    const/4 v0, 0x2

    .line 37
    invoke-virtual {p2, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 38
    invoke-virtual {p2}, Ll/ۤܰۖ;->ܿ()B

    move-result v0

    const/4 v1, 0x1

    .line 39
    invoke-virtual {p2, v1}, Ll/ۤܰۖ;->ܿ(I)V

    .line 40
    invoke-virtual {p2}, Ll/ۤܰۖ;->᩷()I

    move-result v2

    if-lez v0, :cond_0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 66
    invoke-virtual {p2}, Ll/ۤܰۖ;->᩷()I

    const/4 v2, 0x4

    .line 67
    invoke-virtual {p2, v2}, Ll/ۤܰۖ;->ܿ(I)V

    .line 68
    invoke-direct {p0, p1, p2}, Ll/۬ۛۖ;->ۧ(Ll/᩻ۨۖ;Ll/֡֫ۘ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v2, :cond_1

    .line 45
    invoke-direct {p0, p1, p2}, Ll/۬ۛۖ;->ۧ(Ll/᩻ۨۖ;Ll/֡֫ۘ;)V

    return-void

    :cond_1
    if-nez v2, :cond_2

    .line 48
    invoke-virtual {p2}, Ll/ۤܰۖ;->ܽ()I

    move-result p1

    if-lez p1, :cond_2

    .line 49
    invoke-virtual {p2, v1}, Ll/ۤܰۖ;->ܿ(I)V

    :cond_2
    return-void
.end method
