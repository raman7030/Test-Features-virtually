.class public final Ll/ܽۛ֫;
.super Ljava/lang/Object;
.source "08RN"


# instance fields
.field public ֫:Ll/᩵ۢ֡;

.field public ۜ:Ljava/util/UUID;

.field public final ۧ:Ljava/util/HashMap;

.field public ܳ:J

.field public ܽ:Ll/᩺ܿۧ;

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩻:[I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܽۛ֫;->ۧ:Ljava/util/HashMap;

    .line 110
    sget-object v0, Ll/᩻ᩴ֫;->ܿ:Ljava/util/UUID;

    iput-object v0, p0, Ll/ܽۛ֫;->ۜ:Ljava/util/UUID;

    .line 111
    sget-object v0, Ll/ᩳۨ֫;->ᩳ:Ll/᩵ۢ֡;

    iput-object v0, p0, Ll/ܽۛ֫;->֫:Ll/᩵ۢ֡;

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 112
    iput-object v0, p0, Ll/ܽۛ֫;->᩻:[I

    const/4 v0, 0x1

    .line 113
    iput-boolean v0, p0, Ll/ܽۛ֫;->ܿ:Z

    .line 114
    new-instance v0, Ll/᩺ܿۧ;

    .line 76
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object v0, p0, Ll/ܽۛ֫;->ܽ:Ll/᩺ܿۧ;

    const-wide/32 v0, 0x493e0

    .line 115
    iput-wide v0, p0, Ll/ܽۛ֫;->ܳ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۨ֫;)Ll/ۖۛ֫;
    .locals 12

    .line 243
    new-instance v11, Ll/ۖۛ֫;

    iget-object v1, p0, Ll/ܽۛ֫;->ۜ:Ljava/util/UUID;

    iget-object v2, p0, Ll/ܽۛ֫;->֫:Ll/᩵ۢ֡;

    iget-boolean v5, p0, Ll/ܽۛ֫;->ᩳ:Z

    iget-object v6, p0, Ll/ܽۛ֫;->᩻:[I

    iget-boolean v7, p0, Ll/ܽۛ֫;->ܿ:Z

    iget-object v8, p0, Ll/ܽۛ֫;->ܽ:Ll/᩺ܿۧ;

    iget-wide v9, p0, Ll/ܽۛ֫;->ܳ:J

    iget-object v4, p0, Ll/ܽۛ֫;->ۧ:Ljava/util/HashMap;

    move-object v0, v11

    move-object v3, p1

    invoke-direct/range {v0 .. v10}, Ll/ۖۛ֫;-><init>(Ljava/util/UUID;Ll/᩵ۢ֡;Ll/ܿۨ֫;Ljava/util/HashMap;Z[IZLl/᩺ܿۧ;J)V

    return-object v11
.end method

.method public final ֫(Ljava/util/UUID;)V
    .locals 0

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    iput-object p1, p0, Ll/ܽۛ֫;->ۜ:Ljava/util/UUID;

    .line 148
    sget-object p1, Ll/ᩳۨ֫;->ᩳ:Ll/᩵ۢ֡;

    iput-object p1, p0, Ll/ܽۛ֫;->֫:Ll/᩵ۢ֡;

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 164
    iput-boolean p1, p0, Ll/ܽۛ֫;->ᩳ:Z

    return-void
.end method

.method public final varargs ֫([I)V
    .locals 5

    .line 185
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget v2, p1, v1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 186
    :cond_1
    :goto_1
    invoke-static {v4}, Ll/᩺֡֫;->֫(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 189
    :cond_2
    invoke-virtual {p1}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Ll/ܽۛ֫;->᩻:[I

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    .line 203
    iput-boolean p1, p0, Ll/ܽۛ֫;->ܿ:Z

    return-void
.end method
