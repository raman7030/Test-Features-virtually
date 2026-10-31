.class public Ll/ۜܺ;
.super Ll/ۢܺ;
.source "K51P"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 119
    invoke-direct {p0}, Ll/ۢܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    .locals 2

    const-string v0, "getTextDirectionHeuristic"

    .line 124
    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 125
    invoke-static {v0, p2, v1}, Ll/ۡܺ;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/text/TextDirectionHeuristic;

    .line 127
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    return-void
.end method
