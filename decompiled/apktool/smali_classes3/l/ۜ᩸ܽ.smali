.class public final synthetic Ll/ۜ᩸ܽ;
.super Ljava/lang/Object;
.source "G1PO"

# interfaces
.implements Ll/ۖۛۡ;
.implements Ll/᩺᩵᩷;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/ᩴܺܳ;
.implements Ll/᩻ۗۜ;
.implements Ll/۟ܶۧ;
.implements Ll/᩶ۤۡ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܰܳᩳ;

    .line 260
    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    .line 263
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    return p1

    .line 261
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ֫(Ll/֫᩸ۧ;)Ljava/lang/CharSequence;
    .locals 3

    .line 2
    iget-object p1, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast p1, Landroid/content/Context;

    .line 21
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "ais"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const v0, 0x7f120aa3

    .line 20
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "com.android.vending"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f120055

    .line 25
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const/4 v1, 0x0

    .line 29
    :try_start_0
    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    return-object v0
.end method

.method public ֫(Ll/ۗ۠֫;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ᩴ᩸ܽ;

    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۛ۟᩷;

    check-cast p1, [Ljava/lang/Object;

    invoke-static {v0, p1}, Ll/ۛ۟᩷;->֫(Ll/ۛ۟᩷;[Ljava/lang/Object;)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩹ۙܽ;

    invoke-static {v0, p1}, Ll/᩹ۙܽ;->֫(Ll/᩹ۙܽ;Ljava/lang/String;)V

    return-void
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۜ᩸ܽ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 105
    new-instance v1, Ll/᩵ۤܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ll/᩵ۤܿ;-><init>(Ll/ܽۢܳ;Ljava/lang/String;)V

    return-void
.end method
