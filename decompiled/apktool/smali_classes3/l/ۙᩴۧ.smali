.class public abstract Ll/ۙᩴۧ;
.super Ljava/lang/Object;
.source "78QG"

# interfaces
.implements Ll/۟ۘۧ;


# instance fields
.field public final ֫:Ljava/util/ArrayDeque;

.field public final ۧ:Ljava/util/ArrayDeque;

.field public ܳ:J

.field public ܽ:Ll/᩹ᩴۧ;

.field public ܿ:J

.field public ᩳ:J

.field public final ᩻:Ljava/util/ArrayDeque;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۙᩴۧ;->֫:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xa

    if-ge v1, v2, :cond_0

    .line 49
    iget-object v2, p0, Ll/ۙᩴۧ;->֫:Ljava/util/ArrayDeque;

    new-instance v3, Ll/᩹ᩴۧ;

    invoke-direct {v3, v0}, Ll/᩹ᩴۧ;-><init>(I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 51
    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Ll/ۙᩴۧ;->ۧ:Ljava/util/ArrayDeque;

    :goto_1
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 53
    iget-object v1, p0, Ll/ۙᩴۧ;->ۧ:Ljava/util/ArrayDeque;

    new-instance v2, Ll/᩶ᩴۧ;

    new-instance v3, Ll/᩸ᩴۧ;

    invoke-direct {v3, p0}, Ll/᩸ᩴۧ;-><init>(Ll/ۙᩴۧ;)V

    invoke-direct {v2, v3}, Ll/᩶ᩴۧ;-><init>(Ll/᩸ᩴۧ;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 55
    :cond_1
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۙᩴۧ;->᩻:Ljava/util/ArrayDeque;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    iput-wide v0, p0, Ll/ۙᩴۧ;->ᩳ:J

    return-void
.end method


# virtual methods
.method public flush()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 148
    iput-wide v0, p0, Ll/ۙᩴۧ;->ܳ:J

    .line 149
    iput-wide v0, p0, Ll/ۙᩴۧ;->ܿ:J

    .line 150
    :goto_0
    iget-object v0, p0, Ll/ۙᩴۧ;->᩻:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ۙᩴۧ;->֫:Ljava/util/ArrayDeque;

    if-nez v1, :cond_0

    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ᩴۧ;

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 137
    invoke-virtual {v0}, Ll/᩸᩸֫;->ۧ()V

    .line 138
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 153
    :cond_0
    iget-object v0, p0, Ll/ۙᩴۧ;->ܽ:Ll/᩹ᩴۧ;

    if-eqz v0, :cond_1

    .line 137
    invoke-virtual {v0}, Ll/᩸᩸֫;->ۧ()V

    .line 138
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 155
    iput-object v0, p0, Ll/ۙᩴۧ;->ܽ:Ll/᩹ᩴۧ;

    :cond_1
    return-void
.end method

.method public ֫(J)V
    .locals 0

    .line 69
    iput-wide p1, p0, Ll/ۙᩴۧ;->ܿ:J

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 7

    .line 31
    check-cast p1, Ll/ᩳᩴۧ;

    .line 85
    iget-object v0, p0, Ll/ۙᩴۧ;->ܽ:Ll/᩹ᩴۧ;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 86
    check-cast p1, Ll/᩹ᩴۧ;

    .line 87
    invoke-virtual {p1}, Ll/ۘ᩸֫;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Ll/᩸᩸֫;->ۤ:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v2, p0, Ll/ۙᩴۧ;->ᩳ:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 137
    invoke-virtual {p1}, Ll/᩸᩸֫;->ۧ()V

    .line 138
    iget-object v0, p0, Ll/ۙᩴۧ;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 94
    :cond_1
    iget-wide v0, p0, Ll/ۙᩴۧ;->ܳ:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ۙᩴۧ;->ܳ:J

    invoke-static {p1, v0, v1}, Ll/᩹ᩴۧ;->֫(Ll/᩹ᩴۧ;J)V

    .line 95
    iget-object v0, p0, Ll/ۙᩴۧ;->᩻:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :goto_1
    const/4 p1, 0x0

    .line 97
    iput-object p1, p0, Ll/ۙᩴۧ;->ܽ:Ll/᩹ᩴۧ;

    return-void
.end method

.method public final ֫(Ll/ܿᩴۧ;)V
    .locals 1

    .line 142
    invoke-virtual {p1}, Ll/ܿᩴۧ;->ۧ()V

    .line 143
    iget-object v0, p0, Ll/ۙᩴۧ;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract ֫(Ll/ᩳᩴۧ;)V
.end method

.method public bridge synthetic ۧ()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ۙᩴۧ;->ۧ()Ll/ܿᩴۧ;

    move-result-object v0

    return-object v0
.end method

.method public ۧ()Ll/ܿᩴۧ;
    .locals 10

    .line 103
    iget-object v0, p0, Ll/ۙᩴۧ;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 108
    :cond_0
    :goto_0
    iget-object v1, p0, Ll/ۙᩴۧ;->᩻:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    .line 109
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩹ᩴۧ;

    sget-object v3, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget-wide v2, v2, Ll/᩸᩸֫;->ۤ:J

    iget-wide v4, p0, Ll/ۙᩴۧ;->ܿ:J

    cmp-long v6, v2, v4

    if-gtz v6, :cond_3

    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ᩴۧ;

    .line 112
    invoke-virtual {v1}, Ll/ۘ᩸֫;->᩻()Z

    move-result v2

    iget-object v3, p0, Ll/ۙᩴۧ;->֫:Ljava/util/ArrayDeque;

    if-eqz v2, :cond_1

    .line 114
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿᩴۧ;

    const/4 v2, 0x4

    .line 115
    invoke-virtual {v0, v2}, Ll/ۘ᩸֫;->ۧ(I)V

    .line 137
    :goto_1
    invoke-virtual {v1}, Ll/᩸᩸֫;->ۧ()V

    .line 138
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-object v0

    .line 120
    :cond_1
    invoke-virtual {p0, v1}, Ll/ۙᩴۧ;->֫(Ll/ᩳᩴۧ;)V

    .line 122
    invoke-virtual {p0}, Ll/ۙᩴۧ;->᩻()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 123
    invoke-virtual {p0}, Ll/ۙᩴۧ;->ᩳ()Ll/ܰۘۧ;

    move-result-object v7

    .line 125
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿᩴۧ;

    .line 126
    iget-wide v5, v1, Ll/᩸᩸֫;->ۤ:J

    const-wide v8, 0x7fffffffffffffffL

    move-object v4, v0

    invoke-virtual/range {v4 .. v9}, Ll/ܿᩴۧ;->֫(JLl/ܰۘۧ;J)V

    goto :goto_1

    .line 137
    :cond_2
    invoke-virtual {v1}, Ll/᩸᩸֫;->ۧ()V

    .line 138
    invoke-virtual {v3, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(J)V
    .locals 0

    .line 64
    iput-wide p1, p0, Ll/ۙᩴۧ;->ᩳ:J

    return-void
.end method

.method public final ܳ()J
    .locals 2

    .line 182
    iget-wide v0, p0, Ll/ۙᩴۧ;->ܿ:J

    return-wide v0
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ۙᩴۧ;->ܽ:Ll/᩹ᩴۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 76
    iget-object v0, p0, Ll/ۙᩴۧ;->֫:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩹ᩴۧ;

    iput-object v0, p0, Ll/ۙᩴۧ;->ܽ:Ll/᩹ᩴۧ;

    :goto_1
    return-object v0
.end method

.method public final ܿ()Ll/ܿᩴۧ;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/ۙᩴۧ;->ۧ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿᩴۧ;

    return-object v0
.end method

.method public abstract ᩳ()Ll/ܰۘۧ;
.end method

.method public abstract ᩻()Z
.end method
