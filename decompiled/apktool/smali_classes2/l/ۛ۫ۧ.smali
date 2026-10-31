.class public final Ll/ۛ۫ۧ;
.super Ljava/lang/Object;
.source "6AM8"


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public ۧ:Ll/ۤ۬᩵;

.field public ܽ:Ll/᩶۫ۧ;

.field public final ᩳ:Ll/ᩳܽܽ;


# direct methods
.method public constructor <init>(Ll/ᩳܽܽ;Ljava/util/concurrent/Executor;)V
    .locals 1

    const-string v0, "executor"

    .line 5
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ۛ۫ۧ;->ᩳ:Ll/ᩳܽܽ;

    .line 38
    iput-object p2, p0, Ll/ۛ۫ۧ;->֫:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static final synthetic ֫(Ll/ۛ۫ۧ;)Ll/᩶۫ۧ;
    .locals 0

    .line 36
    iget-object p0, p0, Ll/ۛ۫ۧ;->ܽ:Ll/᩶۫ۧ;

    return-object p0
.end method

.method public static final synthetic ۧ(Ll/ۛ۫ۧ;)Ll/۟ۧܽ;
    .locals 0

    .line 36
    iget-object p0, p0, Ll/ۛ۫ۧ;->ᩳ:Ll/ᩳܽܽ;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ۛ۫ۧ;->ۧ:Ll/ۤ۬᩵;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 183
    check-cast v0, Ll/ᩳ۫᩵;

    invoke-virtual {v0, v1}, Ll/ᩳ۫᩵;->֫(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final ֫(Landroid/app/Activity;)V
    .locals 3

    .line 69
    iget-object v0, p0, Ll/ۛ۫ۧ;->ۧ:Ll/ۤ۬᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 183
    :cond_0
    check-cast v0, Ll/ᩳ۫᩵;

    invoke-virtual {v0, v1}, Ll/ᩳ۫᩵;->֫(Ljava/util/concurrent/CancellationException;)V

    .line 100
    :goto_0
    new-instance v0, Ll/᩸۬᩵;

    iget-object v2, p0, Ll/ۛ۫ۧ;->֫:Ljava/util/concurrent/Executor;

    invoke-direct {v0, v2}, Ll/᩸۬᩵;-><init>(Ljava/util/concurrent/Executor;)V

    .line 70
    invoke-static {v0}, Ll/᩺ۗ᩵;->֫(Ll/᩸۬᩵;)Ll/֫ۛ᩵;

    move-result-object v0

    new-instance v2, Ll/ۤ۫ۧ;

    invoke-direct {v2, p0, p1, v1}, Ll/ۤ۫ۧ;-><init>(Ll/ۛ۫ۧ;Landroid/app/Activity;Ll/ۨܶ᩵;)V

    invoke-static {v0, v2}, Ll/ܳۗ᩵;->֫(Ll/֫ۛ᩵;Ll/᩵᩹᩵;)Ll/ۤ۬᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ۫ۧ;->ۧ:Ll/ۤ۬᩵;

    return-void
.end method

.method public final ֫(Ll/᩶۫ۧ;)V
    .locals 0

    .line 61
    iput-object p1, p0, Ll/ۛ۫ۧ;->ܽ:Ll/᩶۫ۧ;

    return-void
.end method
