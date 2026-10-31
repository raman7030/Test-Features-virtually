.class public final Ll/ۤۢܿ;
.super Ljava/lang/Object;
.source "570W"


# instance fields
.field public final ֫:Ll/۫ۢܿ;

.field public final ۧ:Ll/ۛۢܿ;

.field public ܽ:Z

.field public final ܿ:Ll/ۘۖܿ;

.field public volatile ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۛۢܿ;Ll/۫ۢܿ;Ll/ۘۖܿ;Z)V
    .locals 0

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    iput-object p1, p0, Ll/ۤۢܿ;->ۧ:Ll/ۛۢܿ;

    .line 176
    iput-object p2, p0, Ll/ۤۢܿ;->֫:Ll/۫ۢܿ;

    .line 177
    iput-object p3, p0, Ll/ۤۢܿ;->ܿ:Ll/ۘۖܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤۢܿ;)Ll/۫ۢܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۢܿ;->֫:Ll/۫ۢܿ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۤۢܿ;)Ll/ۛۢܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۢܿ;->ۧ:Ll/ۛۢܿ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۤۢܿ;)Ll/ۘۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۢܿ;->ܿ:Ll/ۘۖܿ;

    return-object p0
.end method


# virtual methods
.method public final ֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ۤۢܿ;->ܿ:Ll/ۘۖܿ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۘۖܿ;->֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ܺۖܿ;
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ۤۢܿ;->ܿ:Ll/ۘۖܿ;

    invoke-virtual {v0}, Ll/ۘۖܿ;->֫()Ll/ܺۖܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܶۡܿ;)V
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۤۢܿ;->ܿ:Ll/ۘۖܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۘۖܿ;->֫(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܶۡܿ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 200
    iget-object v0, p0, Ll/ۤۢܿ;->ܿ:Ll/ۘۖܿ;

    invoke-virtual {v0}, Ll/ۘۖܿ;->ۧ()V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 220
    iget-boolean v0, p0, Ll/ۤۢܿ;->ܽ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 221
    iput-boolean v0, p0, Ll/ۤۢܿ;->ܽ:Z

    .line 222
    iget-object v0, p0, Ll/ۤۢܿ;->ۧ:Ll/ۛۢܿ;

    invoke-static {v0, p0}, Ll/ۛۢܿ;->֫(Ll/ۛۢܿ;Ll/ۤۢܿ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۤۢܿ;->ᩳ:Z

    .line 224
    :cond_0
    iget-boolean v0, p0, Ll/ۤۢܿ;->ᩳ:Z

    return v0
.end method
