.class public final Ll/ᩴۨܳ;
.super Ll/۟ܶۡ;
.source "77HY"


# instance fields
.field public final synthetic ۜ:Ll/ᩳۜܳ;

.field public final synthetic ۡ:Ll/ܽۢܳ;

.field public final synthetic ۢ:Ljava/util/function/BooleanSupplier;

.field public ܳ:Ll/ۧۢܳ;

.field public final synthetic ᩷:Ljava/lang/Runnable;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ljava/util/function/BooleanSupplier;Ll/ᩳۜܳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 39
    iput-object p1, p0, Ll/ᩴۨܳ;->ۡ:Ll/ܽۢܳ;

    iput-object p2, p0, Ll/ᩴۨܳ;->ۢ:Ljava/util/function/BooleanSupplier;

    iput-object p3, p0, Ll/ᩴۨܳ;->ۜ:Ll/ᩳۜܳ;

    iput-object p4, p0, Ll/ᩴۨܳ;->᩷:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 55
    iget-object v0, p0, Ll/ᩴۨܳ;->ܳ:Ll/ۧۢܳ;

    invoke-virtual {v0}, Ll/ۧۢܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 56
    iget-boolean v0, p0, Ll/ᩴۨܳ;->᩻:Z

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Ll/ᩴۨܳ;->ۡ:Ll/ܽۢܳ;

    iget-object v1, p0, Ll/ᩴۨܳ;->ۜ:Ll/ᩳۜܳ;

    invoke-static {v0, v1}, Ll/᩵ܺܳ;->ۧ(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void

    .line 59
    :cond_0
    iget-object v0, p0, Ll/ᩴۨܳ;->᩷:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 66
    iget-object p1, p0, Ll/ᩴۨܳ;->ܳ:Ll/ۧۢܳ;

    invoke-virtual {p1}, Ll/ۧۢܳ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 67
    iget-object p1, p0, Ll/ᩴۨܳ;->ۡ:Ll/ܽۢܳ;

    iget-object v0, p0, Ll/ᩴۨܳ;->ۜ:Ll/ᩳۜܳ;

    invoke-static {p1, v0}, Ll/᩵ܺܳ;->ۧ(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ᩴۨܳ;->ۡ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ֫()Ll/ۧۢܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴۨܳ;->ܳ:Ll/ۧۢܳ;

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ᩴۨܳ;->ۢ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    iput-boolean v0, p0, Ll/ᩴۨܳ;->᩻:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ᩴۨܳ;->ܳ:Ll/ۧۢܳ;

    invoke-virtual {v0}, Ll/ۧۢܳ;->֫()V

    return-void
.end method
