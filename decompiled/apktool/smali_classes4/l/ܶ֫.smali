.class public final Ll/ܶ֫;
.super Ljava/lang/Object;
.source "N5R1"


# instance fields
.field public final ֫:Ll/֨֫;

.field public final ۧ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ܳۧ;)V
    .locals 2

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 230
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ll/᩶۬ᩴ;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ֫;->ۧ:Ljava/util/Set;

    .line 233
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 234
    new-instance v0, Ll/۠֫;

    .line 2386
    invoke-direct {v0, p1, p2}, Ll/֨֫;-><init>(Landroid/content/Context;Ll/ܳۧ;)V

    .line 234
    iput-object v0, p0, Ll/ܶ֫;->֫:Ll/֨֫;

    return-void

    .line 236
    :cond_0
    new-instance v0, Ll/֨֫;

    invoke-direct {v0, p1, p2}, Ll/֨֫;-><init>(Landroid/content/Context;Ll/ܳۧ;)V

    iput-object v0, p0, Ll/ܶ֫;->֫:Ll/֨֫;

    return-void

    .line 228
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sessionToken must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Landroid/view/KeyEvent;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 262
    iget-object v0, p0, Ll/ܶ֫;->֫:Ll/֨֫;

    .line 2061
    iget-object v0, v0, Ll/֨֫;->ۧ:Landroid/media/session/MediaController;

    invoke-virtual {v0, p1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    return-void

    .line 260
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "KeyEvent may not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
