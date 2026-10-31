.class public abstract Ll/֨᩻᩵;
.super Ll/ۘ᩻᩵;
.source "I6PU"


# instance fields
.field public ۛ:Ll/ۗ᩻᩵;

.field public ۨ:Ljava/util/concurrent/Executor;

.field public ᩺:Ll/ۗ᩻᩵;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ll/ۗ᩻᩵;Ll/ۗ᩻᩵;)V
    .locals 0

    .line 547
    invoke-direct {p0}, Ll/ۘ᩻᩵;-><init>()V

    .line 548
    iput-object p1, p0, Ll/֨᩻᩵;->ۨ:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    iput-object p3, p0, Ll/֨᩻᩵;->᩺:Ll/ۗ᩻᩵;

    return-void
.end method


# virtual methods
.method public final ۜ()Z
    .locals 3

    .line 558
    iget-object v0, p0, Ll/֨᩻᩵;->ۨ:Ljava/util/concurrent/Executor;

    .line 559
    invoke-virtual {p0}, Ll/ۡۜ᩵;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 562
    iput-object v1, p0, Ll/֨᩻᩵;->ۨ:Ljava/util/concurrent/Executor;

    .line 563
    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return v2
.end method

.method public final ܳ()Z
    .locals 1

    .line 568
    iget-object v0, p0, Ll/֨᩻᩵;->ۛ:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
