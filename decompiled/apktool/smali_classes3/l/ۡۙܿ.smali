.class public final Ll/ۡۙܿ;
.super Ljava/lang/Object;
.source "L9CC"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۙܿ;->᩸:Ll/ۗۙܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 152
    iget-object v0, p0, Ll/ۡۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {v0}, Ll/ۗۙܿ;->ۚ(Ll/ۗۙܿ;)V

    .line 153
    invoke-static {v0}, Ll/ۗۙܿ;->֡(Ll/ۗۙܿ;)V

    .line 154
    invoke-static {v0}, Ll/ۗۙܿ;->֫(Ll/ۗۙܿ;)Landroid/view/ViewGroup;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method
