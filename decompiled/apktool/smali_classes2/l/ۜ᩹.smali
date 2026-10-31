.class public final synthetic Ll/ۜ᩹;
.super Ljava/lang/Object;
.source "U5Z7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩹;->᩸:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 664
    iget-object v0, p0, Ll/ۜ᩹;->᩸:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/۠᩹;->֫(Landroid/app/Activity;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 666
    invoke-virtual {v0}, Landroid/app/Activity;->recreate()V

    :cond_0
    return-void
.end method
