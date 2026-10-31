.class public Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;
.super Ljava/lang/Object;
.source "ColorResourcesTableCreator.java"


# instance fields
.field public final id:I

.field public final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 546
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 547
    iput p1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;->id:I

    .line 548
    iput-object p2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;->name:Ljava/lang/String;

    return-void
.end method

.method public static synthetic access$1000(Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;)I
    .locals 0

    .line 542
    iget p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;->id:I

    return p0
.end method

.method public static synthetic access$1100(Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;)Ljava/lang/String;
    .locals 0

    .line 542
    iget-object p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$PackageInfo;->name:Ljava/lang/String;

    return-object p0
.end method
