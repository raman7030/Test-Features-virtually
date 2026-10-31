.class public final Ll/ܿۖ;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢۖ;


# direct methods
.method public constructor <init>(Ll/ۢۖ;)V
    .locals 0

    .line 1359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۖ;->᩸:Ll/ۢۖ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1364
    iget-object v0, p0, Ll/ܿۖ;->᩸:Ll/ۢۖ;

    .line 845
    iget-object v0, v0, Ll/ۢۖ;->۫:Ll/۫ܺ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 848
    invoke-virtual {v0, v1}, Ll/۫ܺ;->֫(Z)V

    .line 850
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method
