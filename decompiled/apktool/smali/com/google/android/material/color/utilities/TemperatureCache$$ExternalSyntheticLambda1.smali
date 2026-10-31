.class public final synthetic Lcom/google/android/material/color/utilities/TemperatureCache$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "TemperatureCache"

# interfaces
.implements Ljava/util/Comparator;


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Double;

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p1, p2}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    move-result p1

    return p1
.end method
