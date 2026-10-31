.class public final Ll/᩷᩹;
.super Ljava/lang/Object;
.source "U5Z7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Landroid/app/Activity;

.field public final synthetic ᩹:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Ljava/lang/String;I)V
    .locals 0

    .line 548
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩷᩹;->᩹:[Ljava/lang/String;

    iput-object p1, p0, Ll/᩷᩹;->᩸:Landroid/app/Activity;

    iput p3, p0, Ll/᩷᩹;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 551
    iget-object v0, p0, Ll/᩷᩹;->᩹:[Ljava/lang/String;

    array-length v1, v0

    new-array v1, v1, [I

    .line 553
    iget-object v2, p0, Ll/᩷᩹;->᩸:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 554
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 556
    array-length v5, v0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    .line 558
    aget-object v7, v0, v6

    invoke-virtual {v3, v7, v4}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v7

    aput v7, v1, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 562
    :cond_0
    check-cast v2, Ll/ۖ᩹;

    iget v3, p0, Ll/᩷᩹;->᩶:I

    invoke-interface {v2, v3, v0, v1}, Ll/ۖ᩹;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method
