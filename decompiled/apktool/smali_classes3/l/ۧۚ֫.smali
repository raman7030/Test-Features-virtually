.class public final Ll/ۧۚ֫;
.super Ljava/lang/Object;
.source "I7U9"


# instance fields
.field public final ֫:Ll/᩵ۚ֫;

.field public ۧ:Ljava/lang/Object;

.field public ܳ:I

.field public final ܽ:Ll/᩵ۚ֫;

.field public final ܿ:Ll/֫ۚ֫;

.field public ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/os/Looper;Landroid/os/Looper;Ll/ܳ֨֫;Ll/֫ۚ֫;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 81
    invoke-virtual {p4, p2, v0}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object p2

    iput-object p2, p0, Ll/ۧۚ֫;->֫:Ll/᩵ۚ֫;

    .line 82
    invoke-virtual {p4, p3, v0}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object p2

    iput-object p2, p0, Ll/ۧۚ֫;->ܽ:Ll/᩵ۚ֫;

    .line 83
    iput-object p1, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 84
    iput-object p1, p0, Ll/ۧۚ֫;->ۧ:Ljava/lang/Object;

    .line 85
    iput-object p5, p0, Ll/ۧۚ֫;->ܿ:Ll/֫ۚ֫;

    return-void
.end method

.method public static ֫(Ll/ۧۚ֫;Ljava/lang/Object;)V
    .locals 2

    .line 144
    iget v0, p0, Ll/ۧۚ֫;->ܳ:I

    if-nez v0, :cond_0

    .line 178
    iget-object v0, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 179
    iput-object p1, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 181
    iget-object p0, p0, Ll/ۧۚ֫;->ܿ:Ll/֫ۚ֫;

    invoke-interface {p0, v0, p1}, Ll/֫ۚ֫;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۧۚ֫;Ll/ܽܶܺ;)V
    .locals 2

    .line 120
    iget-object v0, p0, Ll/ۧۚ֫;->ۧ:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ll/ܽܶܺ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/ۧۚ֫;->ۧ:Ljava/lang/Object;

    .line 122
    new-instance v0, Ll/ۛ۫ܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/ۛ۫ܿ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 170
    iget-object p0, p0, Ll/ۧۚ֫;->ܽ:Ll/᩵ۚ֫;

    invoke-interface {p0}, Ll/᩵ۚ֫;->ܽ()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 174
    :cond_0
    invoke-interface {p0, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static ۧ(Ll/ۧۚ֫;Ljava/lang/Object;)V
    .locals 2

    .line 124
    iget v0, p0, Ll/ۧۚ֫;->ܳ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۧۚ֫;->ܳ:I

    if-nez v0, :cond_0

    .line 178
    iget-object v0, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 179
    iput-object p1, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 181
    iget-object p0, p0, Ll/ۧۚ֫;->ܿ:Ll/֫ۚ֫;

    invoke-interface {p0, v0, p1}, Ll/֫ۚ֫;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 141
    iput-object p1, p0, Ll/ۧۚ֫;->ۧ:Ljava/lang/Object;

    .line 142
    new-instance v0, Ll/ᩳܽۢ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Ll/ᩳܽۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 170
    iget-object p1, p0, Ll/ۧۚ֫;->ܽ:Ll/᩵ۚ֫;

    invoke-interface {p1}, Ll/᩵ۚ֫;->ܽ()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 174
    :cond_0
    invoke-interface {p1, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 2

    .line 162
    iget-object v0, p0, Ll/ۧۚ֫;->֫:Ll/᩵ۚ֫;

    invoke-interface {v0}, Ll/᩵ۚ֫;->ܽ()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 166
    :cond_0
    invoke-interface {v0, p1}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(Ll/ܽܶܺ;Ll/ܽܶܺ;)V
    .locals 2

    .line 116
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ll/ۧۚ֫;->ܽ:Ll/᩵ۚ֫;

    invoke-interface {v1}, Ll/᩵ۚ֫;->ܽ()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 117
    iget v0, p0, Ll/ۧۚ֫;->ܳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۧۚ֫;->ܳ:I

    .line 118
    new-instance v0, Ll/᩷ܰ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p2}, Ll/᩷ܰ᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Ll/ۧۚ֫;->֫(Ljava/lang/Runnable;)V

    .line 129
    iget-object p2, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    invoke-interface {p1, p2}, Ll/ܽܶܺ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 178
    iget-object p2, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 179
    iput-object p1, p0, Ll/ۧۚ֫;->ᩳ:Ljava/lang/Object;

    .line 180
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 181
    iget-object v0, p0, Ll/ۧۚ֫;->ܿ:Ll/֫ۚ֫;

    invoke-interface {v0, p2, p1}, Ll/֫ۚ֫;->֫(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
