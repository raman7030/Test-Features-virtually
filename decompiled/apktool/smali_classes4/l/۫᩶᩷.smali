.class public Ll/۫᩶᩷;
.super Ll/᩵ܶۧ;
.source "V97Y"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Ll/᩵ܶۧ;-><init>(Landroid/content/Context;)V

    .line 29
    invoke-direct {p0}, Ll/۫᩶᩷;->֨֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Ll/᩵ܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-direct {p0}, Ll/۫᩶᩷;->֨֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Ll/᩵ܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    invoke-direct {p0}, Ll/۫᩶᩷;->֨֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩵ܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 14
    invoke-direct {p0}, Ll/۫᩶᩷;->֨֫()V

    return-void
.end method

.method private ֨֫()V
    .locals 16

    move-object/from16 v0, p0

    .line 33
    invoke-virtual/range {p0 .. p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f12010a

    .line 35
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v4, v5, v6

    const v4, 0x7f110008

    invoke-virtual {v1, v4, v3, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x3

    .line 37
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v8, v9, v6

    invoke-virtual {v1, v4, v7, v9}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x7

    .line 38
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    new-array v11, v3, [Ljava/lang/Object;

    aput-object v10, v11, v6

    invoke-virtual {v1, v4, v9, v11}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0xe

    .line 39
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v13, v3, [Ljava/lang/Object;

    aput-object v12, v13, v6

    invoke-virtual {v1, v4, v11, v13}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x1e

    .line 40
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    new-array v14, v3, [Ljava/lang/Object;

    aput-object v13, v14, v6

    invoke-virtual {v1, v4, v12, v14}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x3c

    .line 41
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    new-array v15, v3, [Ljava/lang/Object;

    aput-object v14, v15, v6

    invoke-virtual {v1, v4, v13, v15}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/16 v13, 0x5a

    .line 42
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x0

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v14, v9, v15

    invoke-virtual {v1, v4, v13, v9}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x8

    new-array v9, v4, [Ljava/lang/CharSequence;

    aput-object v2, v9, v15

    aput-object v5, v9, v3

    const/4 v2, 0x2

    aput-object v8, v9, v2

    aput-object v10, v9, v7

    const/4 v5, 0x4

    aput-object v11, v9, v5

    const/4 v8, 0x5

    aput-object v12, v9, v8

    const/4 v10, 0x6

    aput-object v6, v9, v10

    const/4 v6, 0x7

    aput-object v1, v9, v6

    new-array v1, v4, [Ljava/lang/CharSequence;

    const-string v4, "0"

    aput-object v4, v1, v15

    const-string v4, "1"

    aput-object v4, v1, v3

    const-string v3, "3"

    aput-object v3, v1, v2

    const-string v2, "7"

    aput-object v2, v1, v7

    const-string v2, "14"

    aput-object v2, v1, v5

    const-string v2, "30"

    aput-object v2, v1, v8

    const-string v2, "60"

    aput-object v2, v1, v10

    const-string v2, "90"

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 45
    invoke-virtual {v0, v9}, Ll/᩵ܶۧ;->֫([Ljava/lang/CharSequence;)V

    .line 46
    invoke-virtual {v0, v1}, Ll/᩵ܶۧ;->ۧ([Ljava/lang/CharSequence;)V

    return-void
.end method
