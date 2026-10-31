.class public final Ll/ۗ۫ۧ;
.super Ll/ᩴ᩸᩵;
.source "6AM8"


# annotations
.annotation runtime Ll/֡᩸᩵;
    c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2"
    f = "FoldingFeatureObserver.kt"
    l = {
        0x8a
    }
    m = "emit"
.end annotation


# instance fields
.field public synthetic ۗ:Ljava/lang/Object;

.field public ۙ:I

.field public final synthetic ۬:Ll/۬۫ۧ;


# direct methods
.method public constructor <init>(Ll/۬۫ۧ;Ll/ᩴ᩸᩵;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۗ۫ۧ;->۬:Ll/۬۫ۧ;

    invoke-direct {p0, p2}, Ll/ᩴ᩸᩵;-><init>(Ll/ۨܶ᩵;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iput-object p1, p0, Ll/ۗ۫ۧ;->ۗ:Ljava/lang/Object;

    iget p1, p0, Ll/ۗ۫ۧ;->ۙ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۗ۫ۧ;->ۙ:I

    iget-object p1, p0, Ll/ۗ۫ۧ;->۬:Ll/۬۫ۧ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ll/۬۫ۧ;->֫(Ljava/lang/Object;Ll/ᩴ᩸᩵;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
