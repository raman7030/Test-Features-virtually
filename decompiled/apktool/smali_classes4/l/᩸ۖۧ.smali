.class public final Ll/᩸ۖۧ;
.super Ljava/lang/Object;
.source "U8RL"


# instance fields
.field public final ֫:Ll/ۘۖۧ;


# direct methods
.method public constructor <init>(Ll/ۘۖۧ;)V
    .locals 0

    .line 2784
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2785
    iput-object p1, p0, Ll/᩸ۖۧ;->֫:Ll/ۘۖۧ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ۖۧ;)Ll/ۘۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۖۧ;->֫:Ll/ۘۖۧ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 2

    .line 2789
    iget-object v0, p0, Ll/᩸ۖۧ;->֫:Ll/ۘۖۧ;

    invoke-static {v0}, Ll/ۘۖۧ;->֫(Ll/ۘۖۧ;)Ll/֡ۖۧ;

    move-result-object v1

    invoke-static {v1}, Ll/֡ۖۧ;->ۧ(Ll/֡ۖۧ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۘۖۧ;->֫(Ll/ۘۖۧ;)Ll/֡ۖۧ;

    move-result-object v0

    invoke-static {v0}, Ll/֡ۖۧ;->ܽ(Ll/֡ۖۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
