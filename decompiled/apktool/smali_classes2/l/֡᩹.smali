.class public final Ll/֡᩹;
.super Ljava/lang/Object;
.source "K22G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/app/Application;

.field public final synthetic ᩹:Ll/֨᩹;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ll/֨᩹;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩹;->᩸:Landroid/app/Application;

    iput-object p2, p0, Ll/֡᩹;->᩹:Ll/֨᩹;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 165
    iget-object v0, p0, Ll/֡᩹;->᩸:Landroid/app/Application;

    iget-object v1, p0, Ll/֡᩹;->᩹:Ll/֨᩹;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
