.class public final Ll/ۗۡ֫;
.super Ljava/lang/Object;
.source "P1KP"

# interfaces
.implements Ll/᩻ۡ֫;


# static fields
.field public static final ۛ:Ll/ۗۡ֫;


# instance fields
.field public final ۗ:Ll/᩷ۡ֫;

.field public ۙ:Z

.field public ۤ:Z

.field public ۫:I

.field public ۬:I

.field public final ᩶:Ll/ۙۡ֫;

.field public final ᩸:Ll/᩵᩺ᩳ;

.field public ᩹:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 75
    new-instance v0, Ll/ۗۡ֫;

    invoke-direct {v0}, Ll/ۗۡ֫;-><init>()V

    sput-object v0, Ll/ۗۡ֫;->ۛ:Ll/ۗۡ֫;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/ۗۡ֫;->ۙ:Z

    .line 52
    iput-boolean v0, p0, Ll/ۗۡ֫;->ۤ:Z

    .line 54
    new-instance v0, Ll/᩷ۡ֫;

    invoke-direct {v0, p0}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    .line 55
    new-instance v0, Ll/᩵᩺ᩳ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۗۡ֫;->᩸:Ll/᩵᩺ᩳ;

    .line 60
    new-instance v0, Ll/ۙۡ֫;

    invoke-direct {v0, p0}, Ll/ۙۡ֫;-><init>(Ll/ۗۡ֫;)V

    iput-object v0, p0, Ll/ۗۡ֫;->᩶:Ll/ۙۡ֫;

    return-void
.end method

.method public static ֫(Ll/ۗۡ֫;)V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    .line 127
    iget v1, p0, Ll/ۗۡ֫;->۬:I

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 128
    iput-boolean v2, p0, Ll/ۗۡ֫;->ۙ:Z

    .line 129
    sget-object v1, Ll/᩺ۢ֫;->۬:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 134
    :cond_0
    iget v1, p0, Ll/ۗۡ֫;->۫:I

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ۗۡ֫;->ۙ:Z

    if-eqz v1, :cond_1

    .line 135
    sget-object v1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 136
    iput-boolean v2, p0, Ll/ۗۡ֫;->ۤ:Z

    :cond_1
    return-void
.end method

.method public static final synthetic ۧ(Ll/ۗۡ֫;)Ll/ۙۡ֫;
    .locals 0

    .line 47
    iget-object p0, p0, Ll/ۗۡ֫;->᩶:Ll/ۙۡ֫;

    return-object p0
.end method

.method public static final synthetic ܿ()Ll/ۗۡ֫;
    .locals 1

    .line 47
    sget-object v0, Ll/ۗۡ֫;->ۛ:Ll/ۗۡ֫;

    return-object v0
.end method


# virtual methods
.method public final getLifecycle()Ll/۟ۢ֫;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 115
    iget v0, p0, Ll/ۗۡ֫;->۬:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۗۡ֫;->۬:I

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Ll/ۗۡ֫;->᩹:Landroid/os/Handler;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    iget-object v1, p0, Ll/ۗۡ֫;->᩸:Ll/᩵᩺ᩳ;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ll/ۗۡ֫;->᩹:Landroid/os/Handler;

    .line 143
    iget-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    .line 144
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    .line 145
    new-instance v0, Ll/᩶ۡ֫;

    invoke-direct {v0, p0}, Ll/᩶ۡ֫;-><init>(Ll/ۗۡ֫;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 103
    iget v0, p0, Ll/ۗۡ֫;->۬:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۗۡ֫;->۬:I

    if-ne v0, v1, :cond_1

    .line 105
    iget-boolean v0, p0, Ll/ۗۡ֫;->ۙ:Z

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->۫:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x0

    .line 107
    iput-boolean v0, p0, Ll/ۗۡ֫;->ۙ:Z

    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Ll/ۗۡ֫;->᩹:Landroid/os/Handler;

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    iget-object v1, p0, Ll/ۗۡ֫;->᩸:Ll/᩵᩺ᩳ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 95
    iget v0, p0, Ll/ۗۡ֫;->۫:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۗۡ֫;->۫:I

    if-ne v0, v1, :cond_0

    .line 96
    iget-boolean v0, p0, Ll/ۗۡ֫;->ۤ:Z

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x0

    .line 98
    iput-boolean v0, p0, Ll/ۗۡ֫;->ۤ:Z

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 122
    iget v0, p0, Ll/ۗۡ֫;->۫:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۗۡ֫;->۫:I

    if-nez v0, :cond_0

    .line 134
    iget-boolean v0, p0, Ll/ۗۡ֫;->ۙ:Z

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Ll/ۗۡ֫;->ۗ:Ll/᩷ۡ֫;

    sget-object v1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, v1}, Ll/᩷ۡ֫;->֫(Ll/᩺ۢ֫;)V

    const/4 v0, 0x1

    .line 136
    iput-boolean v0, p0, Ll/ۗۡ֫;->ۤ:Z

    :cond_0
    return-void
.end method
