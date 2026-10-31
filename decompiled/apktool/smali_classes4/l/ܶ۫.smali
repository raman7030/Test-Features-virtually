.class public final Ll/ܶ۫;
.super Ljava/lang/Object;
.source "CB27"


# instance fields
.field public final ֫:Ll/᩻۬;

.field public final ۧ:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Ll/᩻۬;Landroid/os/Handler;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/ܶ۫;->֫:Ll/᩻۬;

    .line 42
    iput-object p2, p0, Ll/ܶ۫;->ۧ:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۧۤ;)V
    .locals 3

    .line 314
    iget v0, p1, Ll/ۧۤ;->֫:I

    iget-object v1, p0, Ll/ܶ۫;->ۧ:Landroid/os/Handler;

    iget-object v2, p0, Ll/ܶ۫;->֫:Ll/᩻۬;

    if-nez v0, :cond_0

    .line 81
    iget-object p1, p1, Ll/ۧۤ;->ۧ:Landroid/graphics/Typeface;

    .line 55
    new-instance v0, Ll/֨۫;

    invoke-direct {v0, v2, p1}, Ll/֨۫;-><init>(Ll/᩻۬;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 68
    :cond_0
    new-instance p1, Ll/۠۫;

    invoke-direct {p1, v2, v0}, Ll/۠۫;-><init>(Ll/᩻۬;I)V

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
