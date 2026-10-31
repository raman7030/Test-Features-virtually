.class public abstract Ll/᩺ܳ֡;
.super Ljava/lang/Object;
.source "4ARJ"


# static fields
.field public static final ᩻:Ljava/util/List;


# instance fields
.field public ֫:Ll/᩸ܳ֡;

.field public ۧ:Z

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:Ll/᩻᩷֡;

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const-string v11, "PLUS_LOOP_BACK"

    const-string v12, "LOOP_END"

    const-string v0, "INVALID"

    const-string v1, "BASIC"

    const-string v2, "RULE_START"

    const-string v3, "BLOCK_START"

    const-string v4, "PLUS_BLOCK_START"

    const-string v5, "STAR_BLOCK_START"

    const-string v6, "TOKEN_START"

    const-string v7, "RULE_STOP"

    const-string v8, "BLOCK_END"

    const-string v9, "STAR_LOOP_BACK"

    const-string v10, "STAR_LOOP_ENTRY"

    .line 95
    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    .line 96
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll/᩺ܳ֡;->᩻:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 115
    iput-object v0, p0, Ll/᩺ܳ֡;->֫:Ll/᩸ܳ֡;

    const/4 v0, -0x1

    .line 117
    iput v0, p0, Ll/᩺ܳ֡;->ܿ:I

    const/4 v0, 0x0

    .line 121
    iput-boolean v0, p0, Ll/᩺ܳ֡;->ۧ:Z

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 136
    instance-of v0, p1, Ll/᩺ܳ֡;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩺ܳ֡;->ܿ:I

    check-cast p1, Ll/᩺ܳ֡;

    iget p1, p1, Ll/᩺ܳ֡;->ܿ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 131
    iget v0, p0, Ll/᩺ܳ֡;->ܿ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 146
    iget v0, p0, Ll/᩺ܳ֡;->ܿ:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 154
    iget-object v0, p0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/۬ۜ֡;
    .locals 1

    .line 190
    iget-object v0, p0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۜ֡;

    return-object p1
.end method

.method public final ֫(Ll/۬ۜ֡;)V
    .locals 7

    .line 158
    iget-object v0, p0, Ll/᩺ܳ֡;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 162
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 163
    invoke-virtual {p1}, Ll/۬ۜ֡;->ۧ()Z

    move-result v2

    iput-boolean v2, p0, Ll/᩺ܳ֡;->ۧ:Z

    goto :goto_0

    .line 165
    :cond_0
    iget-boolean v2, p0, Ll/᩺ܳ֡;->ۧ:Z

    invoke-virtual {p1}, Ll/۬ۜ֡;->ۧ()Z

    move-result v3

    if-eq v2, v3, :cond_1

    .line 166
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    iget v4, p0, Ll/᩺ܳ֡;->ܿ:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    const-string v4, "ATN state %d has both epsilon and non-epsilon transitions.\n"

    invoke-virtual {v2, v3, v4, v5}, Ljava/io/PrintStream;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 167
    iput-boolean v6, p0, Ll/᩺ܳ֡;->ۧ:Z

    .line 171
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ۜ֡;

    .line 172
    iget-object v4, v3, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget v4, v4, Ll/᩺ܳ֡;->ܿ:I

    iget-object v5, p1, Ll/۬ۜ֡;->֫:Ll/᩺ܳ֡;

    iget v5, v5, Ll/᩺ܳ֡;->ܿ:I

    if-ne v4, v5, :cond_2

    .line 173
    invoke-virtual {v3}, Ll/۬ۜ֡;->ܽ()Ll/᩻᩷֡;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Ll/۬ۜ֡;->ܽ()Ll/᩻᩷֡;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ll/۬ۜ֡;->ܽ()Ll/᩻᩷֡;

    move-result-object v4

    invoke-virtual {p1}, Ll/۬ۜ֡;->ܽ()Ll/᩻᩷֡;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩻᩷֡;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 178
    :cond_3
    invoke-virtual {v3}, Ll/۬ۜ֡;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Ll/۬ۜ֡;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    return-void

    .line 186
    :cond_4
    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public abstract ۧ()I
.end method
