.class public final Ll/ܳᩳۧ;
.super Ll/᩺ۘۧ;
.source "T8QE"


# instance fields
.field public final ᩵:Ll/ۢᩴۧ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۢᩴۧ;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Ll/᩺ۘۧ;-><init>(Ljava/lang/String;)V

    .line 52
    iput-object p2, p0, Ll/ܳᩳۧ;->᩵:Ll/ۢᩴۧ;

    return-void
.end method


# virtual methods
.method public final ֫([BIZ)Ll/ܰۘۧ;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܳᩳۧ;->᩵:Ll/ۢᩴۧ;

    if-eqz p3, :cond_0

    .line 58
    invoke-interface {v0}, Ll/ۢᩴۧ;->reset()V

    :cond_0
    const/4 p3, 0x0

    .line 60
    invoke-interface {v0, p3, p2, p1}, Ll/ۢᩴۧ;->֫(II[B)Ll/ܰۘۧ;

    move-result-object p1

    return-object p1
.end method
