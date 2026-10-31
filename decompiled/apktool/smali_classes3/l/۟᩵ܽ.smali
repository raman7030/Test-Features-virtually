.class public final Ll/۟᩵ܽ;
.super Ljava/lang/Object;
.source "I6VW"

# interfaces
.implements Ll/ۧۚܽ;


# instance fields
.field public final ֫:Ll/ۧۚܽ;

.field public final ۧ:I

.field public volatile ܽ:Ll/ܰ᩵ܽ;

.field public final ᩳ:Ll/ۧۚܽ;


# direct methods
.method public constructor <init>(ILl/ۧۚܽ;Ll/ۧۚܽ;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput p1, p0, Ll/۟᩵ܽ;->ۧ:I

    .line 17
    iput-object p2, p0, Ll/۟᩵ܽ;->֫:Ll/ۧۚܽ;

    .line 18
    iput-object p3, p0, Ll/۟᩵ܽ;->ᩳ:Ll/ۧۚܽ;

    return-void
.end method

.method public static ֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;
    .locals 2

    .line 37
    new-instance v0, Ll/۟᩵ܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/۟᩵ܽ;-><init>(ILl/ۧۚܽ;Ll/ۧۚܽ;)V

    if-eqz p2, :cond_0

    .line 38
    new-instance p0, Ll/ۛ᩵ܽ;

    invoke-direct {p0, v0}, Ll/ۛ᩵ܽ;-><init>(Ll/۟᩵ܽ;)V

    return-object p0

    :cond_0
    return-object v0
.end method

.method private ֫()Ll/ܰ᩵ܽ;
    .locals 2

    .line 58
    iget-object v1, p0, Ll/۟᩵ܽ;->ܽ:Ll/ܰ᩵ܽ;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    iget-object v1, p0, Ll/۟᩵ܽ;->ܽ:Ll/ܰ᩵ܽ;

    if-nez v1, :cond_0

    .line 62
    invoke-static {p0}, Ll/۟᩵ܽ;->֫(Ll/۟᩵ܽ;)Ll/ܰ᩵ܽ;

    move-result-object v1

    iput-object v1, p0, Ll/۟᩵ܽ;->ܽ:Ll/ܰ᩵ܽ;

    .line 63
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-object v1
.end method

.method public static ֫(Ll/۟᩵ܽ;)Ll/ܰ᩵ܽ;
    .locals 9

    .line 136
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 138
    new-instance v2, Ll/ۨ᩵ܽ;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, p0, v3, v4}, Ll/ۨ᩵ܽ;-><init>(Ll/ۧۚܽ;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    const/4 p0, 0x1

    .line 0
    invoke-static {v0, p0}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    .line 141
    check-cast v2, Ll/ۨ᩵ܽ;

    .line 142
    iget-object v3, v2, Ll/ۨ᩵ܽ;->ܽ:Ll/ۧۚܽ;

    instance-of v5, v3, Ll/ۛ᩵ܽ;

    if-eqz v5, :cond_0

    check-cast v3, Ll/ۛ᩵ܽ;

    iget-object v3, v3, Ll/ۛ᩵ܽ;->֫:Ll/۟᩵ܽ;

    iput-object v3, v2, Ll/ۨ᩵ܽ;->ܽ:Ll/ۧۚܽ;

    .line 143
    :cond_0
    iget-object v3, v2, Ll/ۨ᩵ܽ;->ܽ:Ll/ۧۚܽ;

    instance-of v5, v3, Ll/۟᩵ܽ;

    if-eqz v5, :cond_6

    check-cast v3, Ll/۟᩵ܽ;

    iget-object v5, v3, Ll/۟᩵ܽ;->֫:Ll/ۧۚܽ;

    .line 147
    iget v6, v3, Ll/۟᩵ܽ;->ۧ:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    .line 148
    iput-object v5, v2, Ll/ۨ᩵ܽ;->ܽ:Ll/ۧۚܽ;

    .line 149
    iget p0, v2, Ll/ۨ᩵ܽ;->ۧ:I

    .line 150
    iget v3, v2, Ll/ۨ᩵ܽ;->֫:I

    iput v3, v2, Ll/ۨ᩵ܽ;->ۧ:I

    .line 151
    iput p0, v2, Ll/ۨ᩵ܽ;->֫:I

    goto :goto_0

    .line 152
    :cond_1
    iget v8, v2, Ll/ۨ᩵ܽ;->ᩳ:I

    if-nez v8, :cond_2

    .line 153
    iput p0, v2, Ll/ۨ᩵ܽ;->ᩳ:I

    .line 154
    new-instance p0, Ll/ۨ᩵ܽ;

    iget-object v3, v3, Ll/۟᩵ܽ;->ᩳ:Ll/ۧۚܽ;

    iget v5, v2, Ll/ۨ᩵ܽ;->ۧ:I

    iget v2, v2, Ll/ۨ᩵ܽ;->֫:I

    invoke-direct {p0, v3, v5, v2}, Ll/ۨ᩵ܽ;-><init>(Ll/ۧۚܽ;II)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-ne v8, p0, :cond_5

    .line 156
    iput v7, v2, Ll/ۨ᩵ܽ;->ᩳ:I

    .line 157
    new-instance v3, Ll/ۨ᩵ܽ;

    if-nez v6, :cond_3

    move v7, v4

    goto :goto_1

    :cond_3
    iget v7, v2, Ll/ۨ᩵ܽ;->ۧ:I

    :goto_1
    if-ne v6, p0, :cond_4

    move p0, v4

    goto :goto_2

    .line 158
    :cond_4
    iget p0, v2, Ll/ۨ᩵ܽ;->֫:I

    :goto_2
    invoke-direct {v3, v5, v7, p0}, Ll/ۨ᩵ܽ;-><init>(Ll/ۧۚܽ;II)V

    .line 157
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 0
    :cond_5
    invoke-static {v0, p0}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_0

    .line 144
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 145
    new-instance v3, Ll/᩺᩵ܽ;

    iget-object v5, v2, Ll/ۨ᩵ܽ;->ܽ:Ll/ۧۚܽ;

    iget v6, v2, Ll/ۨ᩵ܽ;->ۧ:I

    iget v2, v2, Ll/ۨ᩵ܽ;->֫:I

    invoke-direct {v3, v5, v6, v2}, Ll/᩺᩵ܽ;-><init>(Ll/ۧۚܽ;II)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, p0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 163
    :cond_7
    new-instance p0, Ll/ܰ᩵ܽ;

    invoke-direct {p0, v1, v4}, Ll/ܰ᩵ܽ;-><init>(Ljava/util/ArrayList;I)V

    return-object p0
.end method

.method public static ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;
    .locals 2

    .line 37
    new-instance v0, Ll/۟᩵ܽ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/۟᩵ܽ;-><init>(ILl/ۧۚܽ;Ll/ۧۚܽ;)V

    if-eqz p2, :cond_0

    .line 38
    new-instance p0, Ll/ۛ᩵ܽ;

    invoke-direct {p0, v0}, Ll/ۛ᩵ܽ;-><init>(Ll/۟᩵ܽ;)V

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;
    .locals 3

    .line 32
    new-instance v0, Ll/۟᩵ܽ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Ll/۟᩵ܽ;-><init>(ILl/ۧۚܽ;Ll/ۧۚܽ;)V

    return-object v0
.end method

.method public static ᩳ(Ll/ۧۚܽ;)V
    .locals 1

    .line 43
    instance-of v0, p0, Ll/ۛ᩵ܽ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۛ᩵ܽ;

    .line 44
    iget-object p0, p0, Ll/ۛ᩵ܽ;->֫:Ll/۟᩵ܽ;

    invoke-direct {p0}, Ll/۟᩵ܽ;->֫()Ll/ܰ᩵ܽ;

    return-void

    .line 45
    :cond_0
    instance-of v0, p0, Ll/۟᩵ܽ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/۟᩵ܽ;

    .line 46
    invoke-direct {p0}, Ll/۟᩵ܽ;->֫()Ll/ܰ᩵ܽ;

    :cond_1
    return-void
.end method


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 1

    .line 53
    invoke-direct {p0}, Ll/۟᩵ܽ;->֫()Ll/ܰ᩵ܽ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܰ᩵ܽ;->֫(I)Z

    move-result p1

    return p1
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
