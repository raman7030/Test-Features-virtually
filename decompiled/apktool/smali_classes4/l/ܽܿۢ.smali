.class public final Ll/ܽܿۢ;
.super Ljava/lang/Object;
.source "81J9"

# interfaces
.implements Ll/ۖܰۧ;


# instance fields
.field public final synthetic ᩸:Ll/᩻ܿۢ;


# direct methods
.method public constructor <init>(Ll/᩻ܿۢ;)V
    .locals 0

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܿۢ;->᩸:Ll/᩻ܿۢ;

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public final onPageSelected(I)V
    .locals 2

    const/4 v0, 0x3

    .line 163
    iget-object v1, p0, Ll/ܽܿۢ;->᩸:Ll/᩻ܿۢ;

    if-ne p1, v0, :cond_0

    .line 164
    invoke-static {v1}, Ll/᩻ܿۢ;->ۧ(Ll/᩻ܿۢ;)Ll/ۘۛ᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۘۛ᩷;->ܿ()V

    .line 166
    :cond_0
    invoke-static {v1}, Ll/᩻ܿۢ;->ᩳ(Ll/᩻ܿۢ;)V

    return-void
.end method
