.class public final Ll/ᩳۢۢ;
.super Ljava/lang/Object;
.source "K1PX"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۧ:Z

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ll/֡᩻;

.field public final ܿ:Landroid/content/pm/PackageInfo;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageInfo;)V
    .locals 4

    .line 488
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 489
    iput-object p1, p0, Ll/ᩳۢۢ;->ܿ:Landroid/content/pm/PackageInfo;

    .line 490
    invoke-static {p1}, Ll/ۙܶۡ;->֫(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳۢۢ;->֫:Ljava/lang/String;

    .line 491
    iget-object v0, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Ll/ᩳۢۢ;->ܳ:Ljava/lang/String;

    .line 492
    iget-object v0, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v2

    .line 493
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "   "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2, v3}, Ll/᩺ۤۡ;->֫(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳۢۢ;->ᩳ:Ljava/lang/String;

    .line 494
    new-instance p1, Ll/֡᩻;

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {p1, v0}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Ll/ᩳۢۢ;->ܽ:Ll/֡᩻;

    return-void
.end method
