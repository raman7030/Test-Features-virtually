.class public final Ll/ۨ֨ۢ;
.super Ljava/lang/Object;
.source "85H5"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Landroid/content/pm/PackageInfo;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-direct {p0, v0, p1, p2}, Ll/ۨ֨ۢ;-><init>(Landroid/content/pm/PackageInfo;ILjava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Landroid/content/pm/PackageInfo;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p3, p1, p2}, Ll/ۨ֨ۢ;-><init>(Landroid/content/pm/PackageInfo;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageInfo;ILjava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput p2, p0, Ll/ۨ֨ۢ;->ᩳ:I

    .line 50
    iput-object p3, p0, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    .line 51
    iput-object p1, p0, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۨ֨ۢ;->ᩳ:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۨ֨ۢ;->֫:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 60
    iget-object v0, p0, Ll/ۨ֨ۢ;->ܽ:Landroid/content/pm/PackageInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 63
    :cond_0
    invoke-static {v0}, Ll/ۙܶۡ;->֫(Landroid/content/pm/PackageInfo;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۨ֨ۢ;->֫:Ljava/lang/String;

    .line 65
    :cond_1
    iget-object v0, p0, Ll/ۨ֨ۢ;->֫:Ljava/lang/String;

    return-object v0
.end method
