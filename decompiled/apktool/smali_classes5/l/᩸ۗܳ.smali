.class public final Ll/᩸ۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ll/᩷ۨܽ;


# instance fields
.field public final synthetic ֫:Ll/ۨۧᩳ;

.field public final synthetic ۧ:Ll/۬ۗܳ;


# direct methods
.method public constructor <init>(Ll/۬ۗܳ;Ll/ۨۧᩳ;)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۗܳ;->ۧ:Ll/۬ۗܳ;

    iput-object p2, p0, Ll/᩸ۗܳ;->֫:Ll/ۨۧᩳ;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    .line 142
    iget-object v0, p0, Ll/᩸ۗܳ;->ۧ:Ll/۬ۗܳ;

    invoke-interface {v0}, Ll/۬ۗܳ;->onCanceled()V

    return-void
.end method

.method public final onSuccess()V
    .locals 3

    .line 132
    iget-object v0, p0, Ll/᩸ۗܳ;->֫:Ll/ۨۧᩳ;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/᩸ۗܳ;->ۧ:Ll/۬ۗܳ;

    invoke-interface {v2, v0, v1}, Ll/۬ۗܳ;->֫(Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 1

    .line 137
    iget-object v0, p0, Ll/᩸ۗܳ;->ۧ:Ll/۬ۗܳ;

    invoke-interface {v0, p1}, Ll/۬ۗܳ;->֫(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method
