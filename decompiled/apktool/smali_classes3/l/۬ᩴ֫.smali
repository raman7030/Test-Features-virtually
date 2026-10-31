.class public final Ll/۬ᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public ֫:Z

.field public ۜ:Ljava/util/UUID;

.field public ۧ:Ll/ܳ۬ܺ;

.field public ܳ:Z

.field public ܽ:[B

.field public ܿ:Landroid/net/Uri;

.field public ᩳ:Ll/ۢ۬ܺ;

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 668
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 669
    invoke-static {}, Ll/ۢ۬ܺ;->of()Ll/ۢ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/۬ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    const/4 v0, 0x1

    .line 670
    iput-boolean v0, p0, Ll/۬ᩴ֫;->᩻:Z

    .line 671
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/۬ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    return-void
.end method

.method public constructor <init>(Ll/۫ᩴ֫;)V
    .locals 1

    .line 674
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 675
    iget-object v0, p1, Ll/۫ᩴ֫;->ۜ:Ljava/util/UUID;

    iput-object v0, p0, Ll/۬ᩴ֫;->ۜ:Ljava/util/UUID;

    .line 676
    iget-object v0, p1, Ll/۫ᩴ֫;->ܿ:Landroid/net/Uri;

    iput-object v0, p0, Ll/۬ᩴ֫;->ܿ:Landroid/net/Uri;

    .line 677
    iget-object v0, p1, Ll/۫ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    iput-object v0, p0, Ll/۬ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    .line 678
    iget-boolean v0, p1, Ll/۫ᩴ֫;->ܳ:Z

    iput-boolean v0, p0, Ll/۬ᩴ֫;->ܳ:Z

    .line 679
    iget-boolean v0, p1, Ll/۫ᩴ֫;->᩻:Z

    iput-boolean v0, p0, Ll/۬ᩴ֫;->᩻:Z

    .line 680
    iget-boolean v0, p1, Ll/۫ᩴ֫;->֫:Z

    iput-boolean v0, p0, Ll/۬ᩴ֫;->֫:Z

    .line 681
    iget-object v0, p1, Ll/۫ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/۬ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    .line 682
    invoke-static {p1}, Ll/۫ᩴ֫;->֫(Ll/۫ᩴ֫;)[B

    move-result-object p1

    iput-object p1, p0, Ll/۬ᩴ֫;->ܽ:[B

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۬ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬ᩴ֫;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/۬ᩴ֫;)Ljava/util/UUID;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩴ֫;->ۜ:Ljava/util/UUID;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/۬ᩴ֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/۬ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬ᩴ֫;->ܳ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۬ᩴ֫;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩴ֫;->ܽ:[B

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/۬ᩴ֫;)Landroid/net/Uri;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩴ֫;->ܿ:Landroid/net/Uri;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/۬ᩴ֫;)Ll/ۢ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/۬ᩴ֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬ᩴ֫;->᩻:Z

    return p0
.end method
