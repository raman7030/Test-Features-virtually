.class public abstract Ll/᩹ܶۢ;
.super Ll/ۘ۠ۢ;
.source "2AIU"


# static fields
.field public static final synthetic ۖ֫:I


# instance fields
.field public ۡ֫:Z

.field public ܺ֫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ll/ۘ۠ۢ;-><init>()V

    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    return-void
.end method

.method public static ֫(Ll/᩹ܶۢ;Ll/᩹ۗܿ;)V
    .locals 1

    .line 37
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ᩴ֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩹ۗܿ;->ܿ(Ljava/lang/CharSequence;)V

    .line 40
    :cond_0
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ܶ֫()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۜ֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩹ۗܿ;->ᩳ(Ljava/lang/CharSequence;)V

    .line 43
    :cond_1
    iget-boolean v0, p0, Ll/᩹ܶۢ;->ۡ֫:Z

    if-eqz v0, :cond_2

    .line 44
    invoke-virtual {p1}, Ll/᩹ۗܿ;->ۖ()V

    .line 45
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۢ֫()I

    move-result p0

    invoke-virtual {p1, p0}, Ll/᩹ۗܿ;->ܿ(I)V

    return-void

    .line 47
    :cond_2
    invoke-virtual {p1}, Ll/᩹ۗܿ;->ᩴ()V

    .line 56
    iget v0, p0, Ll/᩹ܶۢ;->ܺ֫:I

    .line 48
    invoke-virtual {p1, v0}, Ll/᩹ۗܿ;->ܿ(I)V

    .line 49
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۢ֫()I

    move-result p0

    invoke-virtual {p1, p0}, Ll/᩹ۗܿ;->ܳ(I)V

    return-void
.end method


# virtual methods
.method public final ۤ֫()V
    .locals 1

    .line 78
    iget-boolean v0, p0, Ll/᩹ܶۢ;->ۡ֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 79
    iput-boolean v0, p0, Ll/᩹ܶۢ;->ۡ֫:Z

    .line 80
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۗܺ᩷;)Ll/֡ۚۢ;
    .locals 3

    .line 27
    new-instance v0, Ll/᩹ۗܿ;

    invoke-direct {v0, p1}, Ll/᩹ۗܿ;-><init>(Ll/ۗܺ᩷;)V

    .line 29
    new-instance p1, Ll/᩵۫᩷;

    const/4 v1, 0x5

    invoke-direct {p1, v1, p0}, Ll/᩵۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩹ۗܿ;->֫(Ljava/lang/Runnable;)V

    .line 32
    new-instance p1, Ll/ۖ֨ᩳ;

    const/4 v1, 0x2

    invoke-direct {p1, v1, v0}, Ll/ۖ֨ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩹ۗܿ;->֫(Ll/ۖ֨ᩳ;)V

    .line 36
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->ۚ()Ll/ۚۡ֫;

    move-result-object p1

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ܿ()Ll/֡ۚۢ;

    move-result-object v1

    new-instance v2, Ll/ܶܶۢ;

    invoke-direct {v2, p0, v0}, Ll/ܶܶۢ;-><init>(Ll/᩹ܶۢ;Ll/᩹ۗܿ;)V

    invoke-virtual {p1, v1, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 52
    invoke-virtual {v0}, Ll/᩹ۗܿ;->ۡ()V

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ܿ()Ll/֡ۚۢ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/۬ۧᩳ;
    .locals 1

    const v0, 0x7f1209a7

    .line 86
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const/4 v0, 0x0

    .line 87
    invoke-virtual {p0, v0}, Ll/᩹ܶۢ;->ܺ(I)V

    .line 88
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۢ(I)V

    .line 89
    new-instance v0, Ll/᩸ܶۢ;

    invoke-direct {v0, p0}, Ll/᩸ܶۢ;-><init>(Ll/᩹ܶۢ;)V

    return-object v0
.end method

.method public final ۫֫()V
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/᩹ܶۢ;->ۡ֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Ll/᩹ܶۢ;->ۡ֫:Z

    .line 73
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    :cond_0
    return-void
.end method

.method public final ܺ(I)V
    .locals 1

    .line 64
    iget v0, p0, Ll/᩹ܶۢ;->ܺ֫:I

    if-eq v0, p1, :cond_0

    .line 65
    iput p1, p0, Ll/᩹ܶۢ;->ܺ֫:I

    .line 66
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩶֫()V

    :cond_0
    return-void
.end method

.method public final ܽ(JJ)V
    .locals 0

    .line 60
    invoke-static {p1, p2, p3, p4}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩹ܶۢ;->ܺ(I)V

    return-void
.end method
