.class public final Ll/ۨ֡֨;
.super Ljava/lang/Object;
.source "J7QK"


# static fields
.field public static final ܳ:Ll/ۖܶ۠;

.field public static final ᩻:Ll/ۖܶ۠;


# instance fields
.field public ֫:Ll/ۖܶ۠;

.field public ۧ:Ll/ۖܶ۠;

.field public ܽ:Ll/ۖܶ۠;

.field public ܿ:Ll/ۖܶ۠;

.field public final ᩳ:Ll/ۛ֡֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 64
    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    sput-object v1, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    .line 65
    invoke-static {v0}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    sput-object v0, Ll/ۨ֡֨;->ܳ:Ll/ۖܶ۠;

    return-void
.end method

.method public constructor <init>(Ll/ۛ֡֨;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    sget-object v0, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    .line 76
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    .line 82
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    .line 88
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    .line 96
    iput-object p1, p0, Ll/ۨ֡֨;->ᩳ:Ll/ۛ֡֨;

    return-void
.end method

.method public static ֫(Ll/ۖܶ۠;Ll/ܽۘ֨;)Ll/ۖܶ۠;
    .locals 2

    .line 261
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 262
    invoke-virtual {p0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۘ֨;

    if-eq v1, p1, :cond_0

    .line 227
    invoke-virtual {v0, v1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/ۖܶ۠;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ֫(Ll/ۖܶ۠;)V
    .locals 2

    .line 187
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    .line 251
    sget-object v1, Ll/ۨ֡֨;->ܳ:Ll/ۖܶ۠;

    if-eq v0, v1, :cond_0

    sget-object v1, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    if-ne v0, v1, :cond_1

    .line 252
    :cond_0
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 187
    :cond_1
    iput-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    .line 189
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    .line 191
    :cond_2
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 192
    iput-object p1, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    return-void

    .line 194
    :cond_3
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 194
    iput-object p1, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    return-void
.end method

.method public final ֫(Ll/ۨ֡֨;)V
    .locals 6

    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    iget-object v0, p1, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    .line 251
    sget-object v1, Ll/ۨ֡֨;->ܳ:Ll/ۖܶ۠;

    if-eq v0, v1, :cond_0

    sget-object v1, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    if-ne v0, v1, :cond_1

    .line 252
    :cond_0
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 148
    :cond_1
    invoke-virtual {p0, v0}, Ll/ۨ֡֨;->ܳ(Ll/ۖܶ۠;)V

    .line 149
    iget-object v0, p0, Ll/ۨ֡֨;->ᩳ:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide v3, 0x80000000L

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_5

    .line 150
    iget-object v1, p1, Ll/ۨ֡֨;->ᩳ:Ll/ۛ֡֨;

    iget-object v1, v1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v2, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ll/۫ۙ;->֫(Z)V

    .line 151
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 104
    iget-object v2, p1, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    .line 152
    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۘ֨;

    .line 154
    iget-object v4, v3, Ll/ܽۘ֨;->ۧ:Ll/ۤ֨֨;

    iget-object v4, v4, Ll/ۤ֨֨;->ۖ:Ll/ۢۚ֨;

    invoke-virtual {v4}, Ll/ۢۚ֨;->֫()Z

    move-result v4

    if-nez v4, :cond_3

    .line 155
    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_1

    .line 157
    :cond_4
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۨ֡֨;->ۜ(Ll/ۖܶ۠;)V

    goto :goto_2

    .line 104
    :cond_5
    iget-object v1, p1, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    .line 159
    invoke-virtual {p0, v1}, Ll/ۨ֡֨;->ۜ(Ll/ۖܶ۠;)V

    .line 161
    :goto_2
    iget-object v0, v0, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_6

    .line 108
    iget-object v0, p1, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    .line 162
    invoke-virtual {p0, v0}, Ll/ۨ֡֨;->᩻(Ll/ۖܶ۠;)V

    .line 112
    iget-object p1, p1, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    .line 163
    invoke-virtual {p0, p1}, Ll/ۨ֡֨;->ܿ(Ll/ۖܶ۠;)V

    :cond_6
    return-void
.end method

.method public final ֫(Ll/ܽۘ֨;)V
    .locals 6

    .line 271
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    invoke-static {v0, p1}, Ll/ۨ֡֨;->֫(Ll/ۖܶ۠;Ll/ܽۘ֨;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    return-void

    .line 275
    :cond_0
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۘ֨;

    .line 276
    invoke-virtual {v1}, Ll/ܽۘ֨;->ܿ()Z

    move-result v2

    iget-object v3, v1, Ll/ܽۘ֨;->ᩳ:Ll/ۖܶ۠;

    if-eqz v2, :cond_1

    invoke-virtual {v3}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x0

    .line 277
    invoke-virtual {v3, v2}, Ll/ۖܶ۠;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ܶ۠;

    .line 278
    iget-object v4, v3, Ll/᩺ܶ۠;->֫:Ljava/lang/Object;

    check-cast v4, Ll/ۘ֡֨;

    .line 723
    iget-object v4, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    const-string v5, "value"

    .line 278
    invoke-virtual {v4, v5}, Ll/ۤܶ۠;->֫(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 279
    iget-object v3, v3, Ll/᩺ܶ۠;->ۧ:Ljava/lang/Object;

    instance-of v4, v3, Ll/֫ۘ֨;

    if-eqz v4, :cond_1

    check-cast v3, Ll/֫ۘ֨;

    .line 280
    iget-object v3, v3, Ll/֫ۘ֨;->ۧ:[Ll/ۡۘ֨;

    array-length v4, v3

    if-eqz v4, :cond_1

    aget-object v2, v3, v2

    instance-of v3, v2, Ll/ܽۘ֨;

    if-eqz v3, :cond_1

    iget-object v2, v2, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    iget-object v3, p1, Ll/ۡۘ֨;->֫:Ll/ۙ֨֨;

    if-ne v2, v3, :cond_1

    .line 283
    iget-object v2, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    invoke-static {v2, v1}, Ll/ۨ֡֨;->֫(Ll/ۖܶ۠;Ll/ܽۘ֨;)Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۜ()V
    .locals 1

    .line 168
    sget-object v0, Ll/ۨ֡֨;->ܳ:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    return-void
.end method

.method public final ۜ(Ll/ۖܶ۠;)V
    .locals 0

    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    iput-object p1, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ۧ()Ll/ۖܶ۠;
    .locals 2

    .line 100
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    .line 251
    sget-object v1, Ll/ۨ֡֨;->ܳ:Ll/ۖܶ۠;

    if-eq v0, v1, :cond_1

    sget-object v1, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 252
    :cond_1
    :goto_0
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ۖܶ۠;)V
    .locals 1

    .line 227
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iput-object p1, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    return-void

    .line 232
    :cond_1
    iget-object v0, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 232
    iput-object p1, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ܳ(Ll/ۖܶ۠;)V
    .locals 2

    .line 116
    invoke-virtual {p0}, Ll/ۨ֡֨;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    sget-object v1, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 116
    :goto_0
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    iput-object p1, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 179
    iget-object v0, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ll/ۖܶ۠;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ܽ(Ll/ۖܶ۠;)V
    .locals 1

    .line 216
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 218
    :cond_0
    iget-object v0, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    iput-object p1, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    return-void

    .line 221
    :cond_1
    iget-object v0, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    invoke-virtual {p1, v0}, Ll/ۖܶ۠;->ܽ(Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    .line 221
    iput-object p1, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ܿ(Ll/ۖܶ۠;)V
    .locals 0

    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    iput-object p1, p0, Ll/ۨ֡֨;->ۧ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ܿ()Z
    .locals 2

    .line 257
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    sget-object v1, Ll/ۨ֡֨;->᩻:Ll/ۖܶ۠;

    if-eq v0, v1, :cond_1

    .line 174
    invoke-virtual {p0}, Ll/ۨ֡֨;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    .line 175
    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Ll/ۖܶ۠;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ᩳ(Ll/ۖܶ۠;)V
    .locals 2

    .line 200
    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 202
    :cond_0
    iget-object v0, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 203
    iput-object p1, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    return-void

    .line 207
    :cond_1
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜۘ֨;

    .line 208
    iget-object v1, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 209
    iget-object v1, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֡֨;->ܿ:Ll/ۖܶ۠;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final ᩻(Ll/ۖܶ۠;)V
    .locals 0

    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    iput-object p1, p0, Ll/ۨ֡֨;->ܽ:Ll/ۖܶ۠;

    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 183
    iget-object v0, p0, Ll/ۨ֡֨;->֫:Ll/ۖܶ۠;

    sget-object v1, Ll/ۨ֡֨;->ܳ:Ll/ۖܶ۠;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
