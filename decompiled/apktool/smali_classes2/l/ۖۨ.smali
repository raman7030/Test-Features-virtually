.class public final Ll/ۖۨ;
.super Ljava/lang/Object;
.source "A9BS"


# instance fields
.field public final ֫:Ll/᩷ۨ;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 48
    new-instance v0, Ll/ۡۨ;

    invoke-direct {v0, p1}, Ll/ۡۨ;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Ll/ۖۨ;->֫:Ll/᩷ۨ;

    return-void

    .line 50
    :cond_0
    new-instance v0, Ll/᩷ۨ;

    invoke-direct {v0, p1}, Ll/᩷ۨ;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Ll/ۖۨ;->֫:Ll/᩷ۨ;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Ll/ۡۨ;

    invoke-direct {v0, p1}, Ll/ۡۨ;-><init>(Landroid/view/WindowInsetsController;)V

    iput-object v0, p0, Ll/ۖۨ;->֫:Ll/᩷ۨ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۖۨ;->֫:Ll/᩷ۨ;

    invoke-virtual {v0}, Ll/᩷ۨ;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ۖۨ;->֫:Ll/᩷ۨ;

    invoke-virtual {v0}, Ll/᩷ۨ;->ۧ()V

    return-void
.end method
