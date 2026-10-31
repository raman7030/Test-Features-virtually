.class public Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$8;
.super Landroid/util/Property;
.source "ExtendedFloatingActionButton.java"


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 969
    invoke-direct {p0, p1, p2}, Landroid/util/Property;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public get(Landroid/view/View;)Ljava/lang/Float;
    .locals 1

    .line 983
    sget v0, Ll/ܿ᩺;->֫:I

    .line 2220
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    move-result p1

    int-to-float p1, p1

    .line 983
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 969
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$8;->get(Landroid/view/View;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public set(Landroid/view/View;Ljava/lang/Float;)V
    .locals 3

    .line 974
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    move-result p2

    .line 975
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    .line 976
    sget v1, Ll/ܿ᩺;->֫:I

    .line 2235
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    .line 977
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    .line 2255
    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method

.method public bridge synthetic set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 969
    check-cast p1, Landroid/view/View;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton$8;->set(Landroid/view/View;Ljava/lang/Float;)V

    return-void
.end method
