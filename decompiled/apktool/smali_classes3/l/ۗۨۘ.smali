.class public final Ll/ۗۨۘ;
.super Ll/᩻᩶ۘ;
.source "5907"


# instance fields
.field public final ֫:Ll/᩻ۨۘ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 79
    new-instance v0, Ll/᩻ۨۘ;

    invoke-direct {v0}, Ll/᩻ۨۘ;-><init>()V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object v0, p0, Ll/ۗۨۘ;->֫:Ll/᩻ۨۘ;

    return-void
.end method

.method public static ֫(Ll/ۖ᩻ۡ;)Ll/ۗۨۘ;
    .locals 1

    .line 70
    new-instance v0, Ll/ۗۨۘ;

    invoke-direct {v0}, Ll/ۗۨۘ;-><init>()V

    .line 71
    invoke-virtual {p0, v0}, Ll/ۖ᩻ۡ;->֫(Ll/ۗۨۘ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;)V
    .locals 0

    .line 192
    invoke-static {p1}, Ll/᩵ۨۘ;->ۧ(Landroid/widget/TextView;)V

    return-void
.end method

.method public final ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 0

    .line 187
    invoke-static {p1}, Ll/᩵ۨۘ;->ܽ(Landroid/widget/TextView;)V

    return-void
.end method

.method public final ֫(Ll/֨᩶ۘ;)V
    .locals 2

    .line 182
    new-instance v0, Ll/ۙۨۘ;

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 182
    const-class v1, Ll/ۡۚ֡;

    invoke-interface {p1, v1, v0}, Ll/֨᩶ۘ;->֫(Ljava/lang/Class;Ll/֫ۙۘ;)Ll/֨᩶ۘ;

    return-void
.end method

.method public final ֫(Ll/ۘ᩶ۘ;)V
    .locals 2

    .line 114
    iget-object v0, p0, Ll/ۗۨۘ;->֫:Ll/᩻ۨۘ;

    iget-boolean v1, v0, Ll/᩻ۨۘ;->ܽ:Z

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 104
    iput-boolean v1, v0, Ll/᩻ۨۘ;->ܽ:Z

    .line 106
    iget-object v1, v0, Ll/᩻ۨۘ;->ۧ:Ljava/util/concurrent/ExecutorService;

    if-nez v1, :cond_0

    .line 107
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    iput-object v1, v0, Ll/᩻ۨۘ;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 110
    :cond_0
    new-instance v1, Ll/ۢۨۘ;

    invoke-direct {v1, v0}, Ll/ۢۨۘ;-><init>(Ll/᩻ۨۘ;)V

    .line 177
    invoke-virtual {p1, v1}, Ll/ۘ᩶ۘ;->֫(Ll/ܳۨۘ;)V

    return-void

    .line 115
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ImagesPlugin has already been configured and cannot be modified any further"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/۫ۨۘ;)V
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۗۨۘ;->֫:Ll/᩻ۨۘ;

    invoke-virtual {v0, p1}, Ll/᩻ۨۘ;->֫(Ll/۫ۨۘ;)V

    return-void
.end method
