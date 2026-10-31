.class public final Ll/᩷ܺ;
.super Ll/ۜܺ;
.source "K51P"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 133
    invoke-direct {p0}, Ll/ۜܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    .locals 0

    .line 143
    invoke-virtual {p2}, Landroid/widget/TextView;->getTextDirectionHeuristic()Landroid/text/TextDirectionHeuristic;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setTextDirection(Landroid/text/TextDirectionHeuristic;)Landroid/text/StaticLayout$Builder;

    return-void
.end method

.method public ֫(Landroid/widget/TextView;)Z
    .locals 0

    .line 137
    invoke-virtual {p1}, Landroid/widget/TextView;->isHorizontallyScrollable()Z

    move-result p1

    return p1
.end method
