.class public final Ll/ۛۜ֡;
.super Ljava/lang/Object;
.source "H4RX"


# instance fields
.field public final ֫:Ll/ۜ᩻֡;

.field public final ۧ:I

.field public final ܽ:Z

.field public final ܿ:Ljava/util/HashMap;

.field public volatile ᩳ:Ll/ܰۜ֡;


# direct methods
.method public constructor <init>(Ll/ۜ᩻֡;I)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛۜ֡;->ܿ:Ljava/util/HashMap;

    .line 50
    iput-object p1, p0, Ll/ۛۜ֡;->֫:Ll/ۜ᩻֡;

    .line 51
    iput p2, p0, Ll/ۛۜ֡;->ۧ:I

    .line 54
    instance-of p2, p1, Ll/᩹ۜ֡;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 55
    check-cast p1, Ll/᩹ۜ֡;

    iget-boolean p1, p1, Ll/᩹ۜ֡;->ۢ:Z

    if-eqz p1, :cond_0

    .line 57
    new-instance p1, Ll/ܰۜ֡;

    new-instance p2, Ll/۬ܳ֡;

    invoke-direct {p2}, Ll/۬ܳ֡;-><init>()V

    invoke-direct {p1, p2}, Ll/ܰۜ֡;-><init>(Ll/۬ܳ֡;)V

    new-array p2, v0, [Ll/ܰۜ֡;

    .line 58
    iput-object p2, p1, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    .line 59
    iput-boolean v0, p1, Ll/ܰۜ֡;->ܽ:Z

    .line 60
    iput-boolean v0, p1, Ll/ܰۜ֡;->᩻:Z

    .line 61
    iput-object p1, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    const/4 v0, 0x1

    .line 65
    :cond_0
    iput-boolean v0, p0, Ll/ۛۜ֡;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 174
    sget-object v0, Ll/ܶܳ֡;->ܿ:Ll/ܶܳ֡;

    .line 187
    iget-object v1, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    .line 191
    :cond_0
    new-instance v1, Ll/ۨۜ֡;

    invoke-direct {v1, p0, v0}, Ll/ۨۜ֡;-><init>(Ll/ۛۜ֡;Ll/۠ܳ֡;)V

    .line 192
    invoke-virtual {v1}, Ll/ۨۜ֡;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ܰۜ֡;
    .locals 1

    .line 80
    iget-boolean v0, p0, Ll/ۛۜ֡;->ܽ:Z

    if-eqz v0, :cond_2

    if-ltz p1, :cond_1

    .line 100
    iget-object v0, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iget-object v0, v0, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    iget-object v0, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iget-object v0, v0, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    aget-object p1, v0, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 96
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Only precedence DFAs may contain a precedence start state."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(ILl/ܰۜ֡;)V
    .locals 4

    .line 80
    iget-boolean v0, p0, Ll/ۛۜ֡;->ܽ:Z

    if-eqz v0, :cond_2

    if-gez p1, :cond_0

    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    monitor-enter v0

    .line 131
    :try_start_0
    iget-object v1, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iget-object v1, v1, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    array-length v1, v1

    if-lt p1, v1, :cond_1

    .line 132
    iget-object v1, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iget-object v2, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iget-object v2, v2, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    add-int/lit8 v3, p1, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ܰۜ֡;

    iput-object v2, v1, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    .line 135
    :cond_1
    iget-object v1, p0, Ll/ۛۜ֡;->ᩳ:Ll/ܰۜ֡;

    iget-object v1, v1, Ll/ܰۜ֡;->ۧ:[Ll/ܰۜ֡;

    aput-object p2, v1, p1

    .line 136
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 120
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Only precedence DFAs may contain a precedence start state."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 80
    iget-boolean v0, p0, Ll/ۛۜ֡;->ܽ:Z

    return v0
.end method
