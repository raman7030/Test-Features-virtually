.class public Ll/۠ۢۢ;
.super Ll/ۗܺ᩷;
.source "K1PX"


# static fields
.field public static final synthetic ᩻ۧ:I


# instance fields
.field public ܳۧ:Ll/֡ܰۧ;

.field public ܿۧ:Ll/ۖۢۢ;

.field public ᩳۧ:Ll/ܿۢۢ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۠ۢۢ;)Ll/ܿۢۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۢۢ;->ᩳۧ:Ll/ܿۢۢ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۢۢ;->ܿۧ:Ll/ۖۢۢ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/۠ۢۢ;)Ll/֡ܰۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۠ۢۢ;->ܳۧ:Ll/֡ܰۧ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 72
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 73
    invoke-virtual {p0}, Ll/ۗܺ᩷;->֡()V

    const p1, 0x7f0d0051

    .line 74
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120087

    .line 75
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 76
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 77
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 78
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object p1

    .line 129
    new-instance v0, Ll/ܽۢۢ;

    invoke-direct {v0, p0}, Ll/ܽۢۢ;-><init>(Ll/۠ۢۢ;)V

    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {p1, v0}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    .line 81
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 82
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/᩵ۗܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩵ۗܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    new-instance p1, Ll/ۖۢۢ;

    invoke-direct {p1, p0}, Ll/ۖۢۢ;-><init>(Ll/۠ۢۢ;)V

    iput-object p1, p0, Ll/۠ۢۢ;->ܿۧ:Ll/ۖۢۢ;

    .line 85
    new-instance p1, Ll/ܿۢۢ;

    invoke-direct {p1, p0}, Ll/ܿۢۢ;-><init>(Ll/۠ۢۢ;)V

    iput-object p1, p0, Ll/۠ۢۢ;->ᩳۧ:Ll/ܿۢۢ;

    const p1, 0x7f0a05a0

    .line 87
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    const v0, 0x7f0a0685

    .line 88
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/֡ܰۧ;

    iput-object v0, p0, Ll/۠ۢۢ;->ܳۧ:Ll/֡ܰۧ;

    .line 90
    new-instance v1, Ll/ۧۢۢ;

    invoke-direct {v1, p0}, Ll/ۧۢۢ;-><init>(Ll/۠ۢۢ;)V

    invoke-virtual {v0, v1}, Ll/֡ܰۧ;->֫(Ll/ۨ᩺ۧ;)V

    .line 121
    iget-object v0, p0, Ll/۠ۢۢ;->ܳۧ:Ll/֡ܰۧ;

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Ll/֡ܰۧ;)V

    .line 123
    iget-object p1, p0, Ll/۠ۢۢ;->ܿۧ:Ll/ۖۢۢ;

    iget-object p1, p1, Ll/ۖۢۢ;->֫:Ll/ۚۢۢ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۚۢۢ;->ۧ(Ljava/lang/String;)V

    .line 124
    iget-object p1, p0, Ll/۠ۢۢ;->ᩳۧ:Ll/ܿۢۢ;

    iget-object p1, p1, Ll/ܿۢۢ;->֫:Ll/ۢۢۢ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܳۢۢ;

    invoke-direct {v1, p1}, Ll/ܳۢۢ;-><init>(Ll/ۢۢۢ;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ApkSelectorActivity"

    return-object v0
.end method
