.class public final Ll/᩺۬ۧ;
.super Ll/ۢ۬ۧ;
.source "92WK"


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/۟۬ۧ;


# direct methods
.method public constructor <init>(Ll/۟۬ۧ;)V
    .locals 0

    .line 44
    iput-object p1, p0, Ll/᩺۬ۧ;->ۧ:Ll/۟۬ۧ;

    invoke-direct {p0}, Ll/ۢ۬ۧ;-><init>()V

    const/4 p1, 0x0

    .line 45
    iput-boolean p1, p0, Ll/᩺۬ۧ;->֫:Z

    return-void
.end method


# virtual methods
.method public final onScrollStateChanged(Ll/۬۬ۧ;I)V
    .locals 0

    .line 49
    invoke-super {p0, p1, p2}, Ll/ۢ۬ۧ;->onScrollStateChanged(Ll/۬۬ۧ;I)V

    if-nez p2, :cond_0

    .line 50
    iget-boolean p1, p0, Ll/᩺۬ۧ;->֫:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 51
    iput-boolean p1, p0, Ll/᩺۬ۧ;->֫:Z

    .line 52
    iget-object p1, p0, Ll/᩺۬ۧ;->ۧ:Ll/۟۬ۧ;

    invoke-virtual {p1}, Ll/۟۬ۧ;->snapToTargetExistingView()V

    :cond_0
    return-void
.end method

.method public final onScrolled(Ll/۬۬ۧ;II)V
    .locals 0

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 59
    iput-boolean p1, p0, Ll/᩺۬ۧ;->֫:Z

    return-void
.end method
