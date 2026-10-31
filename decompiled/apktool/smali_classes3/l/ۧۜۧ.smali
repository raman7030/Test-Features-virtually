.class public final Ll/ۧۜۧ;
.super Ljava/lang/Object;
.source "E8P4"


# instance fields
.field public final ֫:Landroid/os/Handler;

.field public final ۧ:Ll/ܽۜۧ;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ll/ܽۜۧ;)V
    .locals 0

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 165
    :goto_0
    iput-object p1, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    .line 166
    iput-object p2, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    return-void
.end method

.method public static ֫(IJLl/ۧۜۧ;)V
    .locals 1

    .line 213
    iget-object p3, p3, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 214
    invoke-interface {p3, p0, p1, p2}, Ll/ܽۜۧ;->֫(IJ)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ljava/lang/Exception;)V
    .locals 1

    .line 256
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p1}, Ll/ܽۜۧ;->ۧ(Ljava/lang/Exception;)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ljava/lang/Object;J)V
    .locals 1

    .line 230
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p2, p3, p1}, Ll/ܽۜۧ;->֫(JLjava/lang/Object;)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ljava/lang/String;)V
    .locals 1

    .line 237
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p1}, Ll/ܽۜۧ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ljava/lang/String;JJ)V
    .locals 6

    .line 182
    iget-object v0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object p0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    .line 183
    invoke-interface/range {v0 .. v5}, Ll/ܽۜۧ;->֫(Ljava/lang/String;JJ)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ll/ۗ᩹֫;)V
    .locals 1

    move-object v0, p1

    .line 0
    monitor-enter v0

    .line 133
    monitor-exit v0

    .line 248
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p1}, Ll/ܽۜۧ;->֫(Ll/ۗ᩹֫;)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ll/ۜ֡֫;)V
    .locals 1

    .line 221
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p1}, Ll/ܽۜۧ;->֫(Ll/ۜ֡֫;)V

    return-void
.end method

.method public static ֫(Ll/ۧۜۧ;Ll/۠ᩴ֫;Ll/۬᩹֫;)V
    .locals 1

    .line 197
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Ll/ܽۜۧ;->ۧ(Ll/۠ᩴ֫;Ll/۬᩹֫;)V

    return-void
.end method

.method public static ۧ(IJLl/ۧۜۧ;)V
    .locals 1

    .line 204
    iget-object p3, p3, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p3, p0, p1, p2}, Ll/ܽۜۧ;->ۧ(IJ)V

    return-void
.end method

.method public static ۧ(Ll/ۧۜۧ;Ll/ۗ᩹֫;)V
    .locals 1

    .line 172
    iget-object p0, p0, Ll/ۧۜۧ;->ۧ:Ll/ܽۜۧ;

    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    invoke-interface {p0, p1}, Ll/ܽۜۧ;->ܽ(Ll/ۗ᩹֫;)V

    return-void
.end method


# virtual methods
.method public final ֫(IJ)V
    .locals 2

    .line 203
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 204
    new-instance v1, Ll/۟᩻ۧ;

    invoke-direct {v1, p1, p2, p3, p0}, Ll/۟᩻ۧ;-><init>(IJLl/ۧۜۧ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 3

    .line 255
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 256
    new-instance v1, Ll/᩷֨᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Ll/᩷֨᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 4

    .line 227
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 229
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    .line 230
    new-instance v3, Ll/᩺᩻ۧ;

    invoke-direct {v3, p0, p1, v1, v2}, Ll/᩺᩻ۧ;-><init>(Ll/ۧۜۧ;Ljava/lang/Object;J)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 236
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 237
    new-instance v1, Ll/ᩴ֫᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p1}, Ll/ᩴ֫᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;JJ)V
    .locals 9

    .line 179
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 180
    new-instance v8, Ll/ܰ᩻ۧ;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Ll/ܰ᩻ۧ;-><init>(Ll/ۧۜۧ;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗ᩹֫;)V
    .locals 3

    move-object v0, p1

    .line 0
    monitor-enter v0

    .line 133
    monitor-exit v0

    .line 244
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 245
    new-instance v1, Ll/ۖ֡ܳ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Ll/ۖ֡ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۜ֡֫;)V
    .locals 3

    .line 220
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 221
    new-instance v1, Ll/᩷ܰ᩷;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Ll/᩷ܰ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;Ll/۬᩹֫;)V
    .locals 3

    .line 195
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 196
    new-instance v1, Ll/ۡܰ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, p2, v2}, Ll/ۡܰ᩷;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(IJ)V
    .locals 2

    .line 210
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 211
    new-instance v1, Ll/֫ۜۧ;

    invoke-direct {v1, p1, p2, p3, p0}, Ll/֫ۜۧ;-><init>(IJLl/ۧۜۧ;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۗ᩹֫;)V
    .locals 3

    .line 171
    iget-object v0, p0, Ll/ۧۜۧ;->֫:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 172
    new-instance v1, Ll/۫۬֫;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, p1}, Ll/۫۬֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
