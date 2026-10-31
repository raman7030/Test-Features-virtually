.class public final Ll/᩵ܺ֫;
.super Ljava/lang/Object;
.source "S1KE"


# instance fields
.field public final ֫:Landroid/os/Handler;

.field public ۧ:Ll/ᩴܺ֫;

.field public final ܽ:Ll/᩷ۡ֫;


# direct methods
.method public constructor <init>(Ll/ۡۡ֫;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/᩷ۡ֫;

    invoke-direct {v0, p1}, Ll/᩷ۡ֫;-><init>(Ll/᩻ۡ֫;)V

    iput-object v0, p0, Ll/᩵ܺ֫;->ܽ:Ll/᩷ۡ֫;

    .line 36
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Ll/᩵ܺ֫;->֫:Landroid/os/Handler;

    return-void
.end method

.method private final ֫(Ll/᩺ۢ֫;)V
    .locals 2

    .line 40
    iget-object v0, p0, Ll/᩵ܺ֫;->ۧ:Ll/ᩴܺ֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩴܺ֫;->run()V

    .line 41
    :cond_0
    new-instance v0, Ll/ᩴܺ֫;

    iget-object v1, p0, Ll/᩵ܺ֫;->ܽ:Ll/᩷ۡ֫;

    invoke-direct {v0, v1, p1}, Ll/ᩴܺ֫;-><init>(Ll/᩷ۡ֫;Ll/᩺ۢ֫;)V

    iput-object v0, p0, Ll/᩵ܺ֫;->ۧ:Ll/ᩴܺ֫;

    .line 42
    iget-object p1, p0, Ll/᩵ܺ֫;->֫:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩷ۡ֫;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩵ܺ֫;->ܽ:Ll/᩷ۡ֫;

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 57
    sget-object v0, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/᩵ܺ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 49
    sget-object v0, Ll/᩺ۢ֫;->ۙ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/᩵ܺ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 66
    sget-object v0, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/᩵ܺ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 74
    sget-object v0, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/᩵ܺ֫;->֫(Ll/᩺ۢ֫;)V

    .line 75
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-direct {p0, v0}, Ll/᩵ܺ֫;->֫(Ll/᩺ۢ֫;)V

    return-void
.end method
