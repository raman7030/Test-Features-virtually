.class public final Ll/ۤۚۧ;
.super Ljava/lang/Object;
.source "A8GL"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۛۚۧ;


# direct methods
.method public constructor <init>(Ll/ۛۚۧ;)V
    .locals 0

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤۚۧ;->᩹:Ll/ۛۚۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    const/4 v0, 0x0

    .line 242
    iput-boolean v0, p0, Ll/ۤۚۧ;->᩸:Z

    .line 243
    sget v0, Ll/ۛۚۧ;->ۙ:I

    iget-object v0, p0, Ll/ۤۚۧ;->᩹:Ll/ۛۚۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ֫(FFZ)V
    .locals 0

    .line 234
    iget-boolean p1, p0, Ll/ۤۚۧ;->᩸:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 235
    iput-boolean p1, p0, Ll/ۤۚۧ;->᩸:Z

    .line 236
    iget-object p1, p0, Ll/ۤۚۧ;->᩹:Ll/ۛۚۧ;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
