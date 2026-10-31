.class public final synthetic Ll/۟֫ᩴ;
.super Ljava/lang/Object;
.source "RC7A"

# interfaces
.implements Ll/ܶۚ֫;
.implements Ll/۠ۚ֫;
.implements Ll/᩸ۜ᩵;
.implements Ll/ۚۚۢ;


# direct methods
.method public static bridge synthetic ֫(Ljava/lang/Object;)Landroid/os/storage/StorageVolume;
    .locals 0

    .line 0
    check-cast p0, Landroid/os/storage/StorageVolume;

    return-object p0
.end method

.method public static ֫(ILjava/util/List;)Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, p0

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/security/Key;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static ֫(Ll/֫ۧᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/֫ۧᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ۧᩴ;

    invoke-interface {p0, p1}, Ll/֫ۧᩴ;->ܽ(Ll/֫ۧᩴ;)Ll/ܰ֫ᩴ;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Landroid/content/res/Configuration;I)V
    .locals 0

    .line 0
    iput p1, p0, Landroid/content/res/Configuration;->colorMode:I

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ll/ۗ᩻᩵;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ll/֨۬֫;

    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 0

    .line 0
    check-cast p1, Ll/᩵᩷ۡ;

    invoke-static {p1}, Ll/᩵᩷ۡ;->֫(Ll/᩵᩷ۡ;)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;Ll/ۚᩴ֫;)V
    .locals 1

    check-cast p1, Ll/֡᩵֫;

    .line 301
    new-instance v0, Ll/᩵᩵֫;

    invoke-direct {v0, p2}, Ll/᩵᩵֫;-><init>(Ll/ۚᩴ֫;)V

    invoke-interface {p1, v0}, Ll/֡᩵֫;->֫(Ll/᩵᩵֫;)V

    return-void
.end method
