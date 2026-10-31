.class public final Ll/ۤܳۧ;
.super Ljava/lang/Object;
.source "D8IT"

# interfaces
.implements Ll/ۜۜۧ;


# instance fields
.field public ֫:Ll/۠ᩴ֫;

.field public final ۜ:Ll/ۙ᩻ۧ;

.field public ۧ:Ll/ܿۜۧ;

.field public final ܳ:Ljava/util/ArrayDeque;

.field public ܽ:Ljava/util/concurrent/Executor;

.field public ܿ:J

.field public ᩳ:Landroid/view/Surface;

.field public final ᩷:Ll/ۨ᩻ۧ;

.field public ᩻:Ll/᩹᩻ۧ;


# direct methods
.method public constructor <init>(Ll/ۙ᩻ۧ;Ll/ܽۚ֫;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    .line 70
    invoke-virtual {p1, p2}, Ll/ۙ᩻ۧ;->֫(Ll/ܽۚ֫;)V

    .line 71
    new-instance p2, Ll/ۨ᩻ۧ;

    new-instance v0, Ll/۫ܳۧ;

    invoke-direct {v0, p0}, Ll/۫ܳۧ;-><init>(Ll/ۤܳۧ;)V

    invoke-direct {p2, v0, p1}, Ll/ۨ᩻ۧ;-><init>(Ll/۫ܳۧ;Ll/ۙ᩻ۧ;)V

    iput-object p2, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    .line 73
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/ۤܳۧ;->ܳ:Ljava/util/ArrayDeque;

    .line 74
    new-instance p1, Ll/֨ᩴ֫;

    invoke-direct {p1}, Ll/֨ᩴ֫;-><init>()V

    invoke-virtual {p1}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object p1

    iput-object p1, p0, Ll/ۤܳۧ;->֫:Ll/۠ᩴ֫;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    iput-wide p1, p0, Ll/ۤܳۧ;->ܿ:J

    .line 76
    sget-object p1, Ll/ܿۜۧ;->֫:Ll/ܿۜۧ;

    iput-object p1, p0, Ll/ۤܳۧ;->ۧ:Ll/ܿۜۧ;

    .line 77
    new-instance p1, Ll/᩸ܳۧ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܳۧ;->ܽ:Ljava/util/concurrent/Executor;

    .line 78
    new-instance p1, Ll/᩹ܳۧ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܳۧ;->᩻:Ll/᩹᩻ۧ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۤܳۧ;)V
    .locals 0

    .line 235
    iget-object p0, p0, Ll/ۤܳۧ;->ۧ:Ll/ܿۜۧ;

    invoke-interface {p0}, Ll/ܿۜۧ;->֫()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۤܳۧ;)Ll/ܿۜۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤܳۧ;->ۧ:Ll/ܿۜۧ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۤܳۧ;)Ll/᩹᩻ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤܳۧ;->᩻:Ll/᩹᩻ۧ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۤܳۧ;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤܳۧ;->ܽ:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۤܳۧ;)Ljava/util/ArrayDeque;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤܳۧ;->ܳ:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۤܳۧ;)Landroid/view/Surface;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤܳۧ;->ᩳ:Landroid/view/Surface;

    return-object p0
.end method


# virtual methods
.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(F)V
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۙ᩻ۧ;->ۧ(F)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۙ᩻ۧ;->ۧ(I)V

    return-void
.end method

.method public final ֫(J)V
    .locals 0

    .line 179
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(JJ)V
    .locals 1

    .line 252
    :try_start_0
    iget-object v0, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۨ᩻ۧ;->֫(JJ)V
    :try_end_0
    .catch Ll/ᩳ᩶֫; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 254
    new-instance p2, Ll/᩻ۜۧ;

    iget-object p3, p0, Ll/ۤܳۧ;->֫:Ll/۠ᩴ֫;

    invoke-direct {p2, p1, p3}, Ll/᩻ۜۧ;-><init>(Ljava/lang/Exception;Ll/۠ᩴ֫;)V

    throw p2
.end method

.method public final ֫(Landroid/view/Surface;Ll/ܿ֨֫;)V
    .locals 0

    .line 184
    iput-object p1, p0, Ll/ۤܳۧ;->ᩳ:Landroid/view/Surface;

    .line 185
    iget-object p2, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {p2, p1}, Ll/ۙ᩻ۧ;->֫(Landroid/view/Surface;)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    .line 169
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/۠ᩴ֫;JILjava/util/List;)V
    .locals 4

    .line 211
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    move-result p5

    invoke-static {p5}, Ll/᩺֡֫;->ۧ(Z)V

    .line 212
    iget p5, p1, Ll/۠ᩴ֫;->᩷֫:I

    iget v0, p1, Ll/۠ᩴ֫;->۠:I

    iget-object v1, p0, Ll/ۤܳۧ;->֫:Ll/۠ᩴ֫;

    iget v2, v1, Ll/۠ᩴ֫;->᩷֫:I

    iget-object v3, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    if-ne p5, v2, :cond_0

    iget v1, v1, Ll/۠ᩴ֫;->۠:I

    if-eq v0, v1, :cond_1

    .line 213
    :cond_0
    invoke-virtual {v3, p5, v0}, Ll/ۨ᩻ۧ;->֫(II)V

    .line 215
    :cond_1
    iget p5, p1, Ll/۠ᩴ֫;->֡:F

    iget-object v0, p0, Ll/ۤܳۧ;->֫:Ll/۠ᩴ֫;

    iget v0, v0, Ll/۠ᩴ֫;->֡:F

    cmpl-float v0, p5, v0

    if-eqz v0, :cond_2

    .line 216
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0, p5}, Ll/ۙ᩻ۧ;->֫(F)V

    .line 218
    :cond_2
    iput-object p1, p0, Ll/ۤܳۧ;->֫:Ll/۠ᩴ֫;

    .line 219
    iget-wide v0, p0, Ll/ۤܳۧ;->ܿ:J

    cmp-long p1, p2, v0

    if-eqz p1, :cond_3

    .line 220
    invoke-virtual {v3, p4, p2, p3}, Ll/ۨ᩻ۧ;->֫(IJ)V

    .line 221
    iput-wide p2, p0, Ll/ۤܳۧ;->ܿ:J

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܿۜۧ;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 93
    iput-object p1, p0, Ll/ۤܳۧ;->ۧ:Ll/ܿۜۧ;

    .line 94
    iput-object p2, p0, Ll/ۤܳۧ;->ܽ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public final ֫(Ll/᩹᩻ۧ;)V
    .locals 0

    .line 154
    iput-object p1, p0, Ll/ۤܳۧ;->᩻:Ll/᩹᩻ۧ;

    return-void
.end method

.method public final ֫(JLl/ܳۜۧ;)Z
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ۤܳۧ;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 234
    iget-object p3, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    invoke-virtual {p3, p1, p2}, Ll/ۨ᩻ۧ;->֫(J)V

    .line 235
    iget-object p1, p0, Ll/ۤܳۧ;->ܽ:Ljava/util/concurrent/Executor;

    new-instance p2, Ll/᩶ܳۧ;

    invoke-direct {p2, p0}, Ll/᩶ܳۧ;-><init>(Ll/ۤܳۧ;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/۠ᩴ֫;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Z)Z
    .locals 1

    .line 129
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۙ᩻ۧ;->֫(Z)Z

    move-result p1

    return p1
.end method

.method public final ۜ()V
    .locals 1

    .line 227
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->֫()V

    return-void
.end method

.method public final ۡ()V
    .locals 2

    const/4 v0, 0x0

    .line 190
    iput-object v0, p0, Ll/ۤܳۧ;->ᩳ:Landroid/view/Surface;

    .line 191
    iget-object v1, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v1, v0}, Ll/ۙ᩻ۧ;->֫(Landroid/view/Surface;)V

    return-void
.end method

.method public final ۢ()V
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->ܽ()V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 121
    iget-object p1, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {p1}, Ll/ۙ᩻ۧ;->ܿ()V

    .line 123
    :cond_0
    iget-object p1, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    invoke-virtual {p1}, Ll/ۨ᩻ۧ;->֫()V

    .line 124
    iget-object p1, p0, Ll/ۤܳۧ;->ܳ:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    invoke-virtual {v0}, Ll/ۨ᩻ۧ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ܽ(Z)V
    .locals 1

    .line 260
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0, p1}, Ll/ۙ᩻ۧ;->ۧ(Z)V

    return-void
.end method

.method public final ܿ()Landroid/view/Surface;
    .locals 1

    .line 149
    iget-object v0, p0, Ll/ۤܳۧ;->ᩳ:Landroid/view/Surface;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 115
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ᩷()V
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۤܳۧ;->ۜ:Ll/ۙ᩻ۧ;

    invoke-virtual {v0}, Ll/ۙ᩻ۧ;->ᩳ()V

    return-void
.end method

.method public final ᩻()V
    .locals 1

    .line 134
    iget-object v0, p0, Ll/ۤܳۧ;->᩷:Ll/ۨ᩻ۧ;

    invoke-virtual {v0}, Ll/ۨ᩻ۧ;->ܽ()V

    return-void
.end method
