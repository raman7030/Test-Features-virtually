.class public Ll/ۧۗ᩷;
.super Ll/ۘۙ᩷;
.source "LAIU"


# instance fields
.field public ۫֫:Ll/֫ۗ᩷;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-direct {p0}, Ll/ۧۗ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 24
    invoke-direct {p0}, Ll/ۧۗ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    invoke-direct {p0}, Ll/ۧۗ᩷;->ۢ֫()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۘۙ᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 34
    invoke-direct {p0}, Ll/ۧۗ᩷;->ۢ֫()V

    return-void
.end method

.method public static ֫(Ll/ۧۗ᩷;[I)V
    .locals 6

    .line 106
    iget-object v0, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    const/4 v1, 0x0

    aget p1, p1, v1

    invoke-static {v0, p1}, Ll/֫ۗ᩷;->֫(Ll/֫ۗ᩷;I)V

    .line 43
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object p1

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    iget-object v2, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v2}, Ll/֫ۗ᩷;->ᩳ(Ll/֫ۗ᩷;)I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-eq v2, v3, :cond_0

    goto/16 :goto_0

    .line 57
    :cond_0
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v5, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v5}, Ll/֫ۗ᩷;->ۧ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v5

    invoke-direct {v2, v5, v3, v4}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v5, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v5}, Ll/֫ۗ᩷;->֫(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v5

    invoke-direct {v2, v5, v3, v4}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v3, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v3}, Ll/֫ۗ᩷;->ܽ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v3

    invoke-direct {v2, v3, v4, v1}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 52
    :cond_1
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v5, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v5}, Ll/֫ۗ᩷;->ۧ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v5

    invoke-direct {v2, v5, v3, v4}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v5, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v5}, Ll/֫ۗ᩷;->ܽ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v5

    invoke-direct {v2, v5, v3, v4}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v3, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v3}, Ll/֫ۗ᩷;->֫(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v3

    invoke-direct {v2, v3, v4, v1}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_2
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v5, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v5}, Ll/֫ۗ᩷;->֫(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v5

    invoke-direct {v2, v5, v3, v4}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v5, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v5}, Ll/֫ۗ᩷;->ܽ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v5

    invoke-direct {v2, v5, v3, v4}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    new-instance v2, Ll/۟ۙ᩷;

    iget-object v3, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v3}, Ll/֫ۗ᩷;->ۧ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;

    move-result-object v3

    invoke-direct {v2, v3, v4, v1}, Ll/۟ۙ᩷;-><init>(Landroid/content/ComponentName;II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۙ᩷;

    .line 63
    iget-object v2, v1, Ll/۟ۙ᩷;->֫:Landroid/content/ComponentName;

    iget v3, v1, Ll/۟ۙ᩷;->ܽ:I

    iget v1, v1, Ll/۟ۙ᩷;->ۧ:I

    invoke-virtual {p1, v2, v3, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    goto :goto_1

    .line 65
    :cond_3
    invoke-direct {p0}, Ll/ۧۗ᩷;->ۡ֫()V

    return-void
.end method

.method private ۡ֫()V
    .locals 2

    .line 82
    iget-object v0, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v0}, Ll/֫ۗ᩷;->ᩳ(Ll/֫ۗ᩷;)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    const v0, 0x7f120460

    .line 90
    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->ܿ(I)V

    return-void

    :cond_1
    const v0, 0x7f12045e

    .line 87
    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->ܿ(I)V

    return-void

    :cond_2
    const v0, 0x7f12045f

    .line 84
    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->ܿ(I)V

    return-void
.end method

.method private ۢ֫()V
    .locals 2

    .line 38
    new-instance v0, Ll/֫ۗ᩷;

    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֫ۗ᩷;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    .line 39
    invoke-direct {p0}, Ll/ۧۗ᩷;->ۡ֫()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 5

    .line 97
    iget-object v0, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v0}, Ll/֫ۗ᩷;->ᩳ(Ll/֫ۗ᩷;)I

    move-result v0

    filled-new-array {v0}, [I

    move-result-object v0

    .line 98
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f120512

    .line 99
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v2, p0, Ll/ۧۗ᩷;->۫֫:Ll/֫ۗ᩷;

    invoke-static {v2}, Ll/֫ۗ᩷;->ᩳ(Ll/֫ۗ᩷;)I

    move-result v2

    new-instance v3, Ll/᩺ۙ᩷;

    invoke-direct {v3, v0}, Ll/᩺ۙ᩷;-><init>([I)V

    const v4, 0x7f03001e

    .line 100
    invoke-virtual {v1, v4, v2, v3}, Ll/᩵ۚۢ;->֫(IILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/ۧ۫ܳ;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v0, v3}, Ll/ۧ۫ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p1, 0x7f12070a

    .line 101
    invoke-virtual {v1, p1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 111
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 112
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
