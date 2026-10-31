.class public final Ll/᩷ܽ᩻;
.super Ljava/lang/Object;
.source "X992"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public ۧ:Z

.field public final ܳ:Landroid/content/pm/PackageInfo;

.field public ܽ:Z

.field public ܿ:Z

.field public final ᩳ:Ll/֡᩻;

.field public final synthetic ᩻:Ll/ۢܽ᩻;


# direct methods
.method public constructor <init>(Ll/ۢܽ᩻;Landroid/content/pm/PackageInfo;)V
    .locals 1

    .line 261
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ܽ᩻;->᩻:Ll/ۢܽ᩻;

    .line 262
    iput-object p2, p0, Ll/᩷ܽ᩻;->ܳ:Landroid/content/pm/PackageInfo;

    .line 263
    invoke-static {p2}, Ll/ۙܶۡ;->֫(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܽ᩻;->֫:Ljava/lang/String;

    .line 264
    new-instance p1, Ll/֡᩻;

    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-direct {p1, p2}, Ll/֡᩻;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object p1, p0, Ll/᩷ܽ᩻;->ᩳ:Ll/֡᩻;

    const/4 p1, 0x1

    .line 265
    iput-boolean p1, p0, Ll/᩷ܽ᩻;->ܿ:Z

    return-void
.end method
