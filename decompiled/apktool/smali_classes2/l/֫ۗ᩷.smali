.class public final Ll/֫ۗ᩷;
.super Ljava/lang/Object;
.source "LAIU"


# instance fields
.field public ֫:Landroid/content/ComponentName;

.field public ۧ:Landroid/content/ComponentName;

.field public ܽ:Landroid/content/ComponentName;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "bin.mt.plus.MainLightIcon"

    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Ll/֫ۗ᩷;->ۧ:Landroid/content/ComponentName;

    .line 123
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "bin.mt.plus.MainDarkIcon"

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Ll/֫ۗ᩷;->֫:Landroid/content/ComponentName;

    .line 124
    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "bin.mt.plus.MainNoBgIcon"

    invoke-direct {v2, p1, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v2, p0, Ll/֫ۗ᩷;->ܽ:Landroid/content/ComponentName;

    .line 125
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object p1

    .line 126
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result p1

    if-ne p1, v2, :cond_1

    .line 130
    iput v2, p0, Ll/֫ۗ᩷;->ᩳ:I

    return-void

    :cond_1
    const/4 p1, 0x2

    .line 132
    iput p1, p0, Ll/֫ۗ᩷;->ᩳ:I

    return-void

    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 128
    iput p1, p0, Ll/֫ۗ᩷;->ᩳ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۗ᩷;)Landroid/content/ComponentName;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۗ᩷;->֫:Landroid/content/ComponentName;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/֫ۗ᩷;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֫ۗ᩷;->ᩳ:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۗ᩷;->ۧ:Landroid/content/ComponentName;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֫ۗ᩷;)Landroid/content/ComponentName;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۗ᩷;->ܽ:Landroid/content/ComponentName;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֫ۗ᩷;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ۗ᩷;->ᩳ:I

    return p0
.end method


# virtual methods
.method public final ֫()Landroid/content/ComponentName;
    .locals 2

    .line 137
    iget v0, p0, Ll/֫ۗ᩷;->ᩳ:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 143
    iget-object v0, p0, Ll/֫ۗ᩷;->ܽ:Landroid/content/ComponentName;

    return-object v0

    .line 145
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 141
    :cond_1
    iget-object v0, p0, Ll/֫ۗ᩷;->֫:Landroid/content/ComponentName;

    return-object v0

    .line 139
    :cond_2
    iget-object v0, p0, Ll/֫ۗ᩷;->ۧ:Landroid/content/ComponentName;

    return-object v0
.end method
