.class public Ll/᩷۟;
.super Ljava/lang/Object;
.source "K4SO"


# instance fields
.field public final ֫:Landroid/view/accessibility/AccessibilityNodeProvider;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 120
    new-instance v0, Ll/ۜ۟;

    .line 96
    invoke-direct {v0, p0}, Ll/᩻۟;-><init>(Ll/᩷۟;)V

    .line 120
    iput-object v0, p0, Ll/᩷۟;->֫:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-void

    .line 122
    :cond_0
    new-instance v0, Ll/᩻۟;

    invoke-direct {v0, p0}, Ll/᩻۟;-><init>(Ll/᩷۟;)V

    iput-object v0, p0, Ll/᩷۟;->֫:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-void
.end method

.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeProvider;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Ll/᩷۟;->֫:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/᩷۟;->֫:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-object v0
.end method

.method public ֫(I)Ll/ܳ۟;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public ֫(IILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ۧ(I)Ll/ܳ۟;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
