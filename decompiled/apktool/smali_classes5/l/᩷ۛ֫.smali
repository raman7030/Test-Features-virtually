.class public final Ll/᩷ۛ֫;
.super Ljava/lang/Object;
.source "08RN"

# interfaces
.implements Ll/᩶ۛ֫;


# instance fields
.field public final synthetic ۙ:Ll/ۖۛ֫;

.field public ᩶:Ll/֡ۛ֫;

.field public final ᩸:Ll/ܶۛ֫;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۖۛ֫;Ll/ܶۛ֫;)V
    .locals 0

    .line 951
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۖۛ֫;

    .line 952
    iput-object p2, p0, Ll/᩷ۛ֫;->᩸:Ll/ܶۛ֫;

    return-void
.end method

.method public static synthetic ֫(Ll/᩷ۛ֫;)V
    .locals 2

    .line 986
    iget-boolean v0, p0, Ll/᩷ۛ֫;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 989
    :cond_0
    iget-object v0, p0, Ll/᩷ۛ֫;->᩶:Ll/֡ۛ֫;

    if-eqz v0, :cond_1

    .line 990
    iget-object v1, p0, Ll/᩷ۛ֫;->᩸:Ll/ܶۛ֫;

    invoke-interface {v0, v1}, Ll/֡ۛ֫;->ۧ(Ll/ܶۛ֫;)V

    .line 992
    :cond_1
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۖۛ֫;

    invoke-static {v0}, Ll/ۖۛ֫;->ܳ(Ll/ۖۛ֫;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    .line 993
    iput-boolean v0, p0, Ll/᩷ۛ֫;->᩹:Z

    return-void
.end method

.method public static ֫(Ll/᩷ۛ֫;Ll/۠ᩴ֫;)V
    .locals 3

    .line 964
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۖۛ֫;

    invoke-static {v0}, Ll/ۖۛ֫;->᩻(Ll/ۖۛ֫;)I

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/᩷ۛ֫;->᩹:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 969
    :cond_0
    invoke-static {v0}, Ll/ۖۛ֫;->ܿ(Ll/ۖۛ֫;)Landroid/os/Looper;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    iget-object v2, p0, Ll/᩷ۛ֫;->᩸:Ll/ܶۛ֫;

    .line 970
    invoke-static {v0, v1, v2, p1}, Ll/ۖۛ֫;->֫(Ll/ۖۛ֫;Landroid/os/Looper;Ll/ܶۛ֫;Ll/۠ᩴ֫;)Ll/֡ۛ֫;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ۛ֫;->᩶:Ll/֡ۛ֫;

    .line 975
    invoke-static {v0}, Ll/ۖۛ֫;->ܳ(Ll/ۖۛ֫;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 983
    iget-object v0, p0, Ll/᩷ۛ֫;->ۙ:Ll/ۖۛ֫;

    invoke-static {v0}, Ll/ۖۛ֫;->ᩳ(Ll/ۖۛ֫;)Landroid/os/Handler;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    new-instance v1, Ll/᩻ۛ֫;

    invoke-direct {v1, p0}, Ll/᩻ۛ֫;-><init>(Ll/᩷ۛ֫;)V

    .line 983
    invoke-static {v0, v1}, Ll/ۘ֨֫;->֫(Landroid/os/Handler;Ljava/lang/Runnable;)V

    return-void
.end method
