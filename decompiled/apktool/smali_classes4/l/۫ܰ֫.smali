.class public final Ll/۫ܰ֫;
.super Ljava/lang/Object;
.source "08PI"

# interfaces
.implements Ll/ܰܰ֫;


# instance fields
.field public final ֫:Landroid/content/ContextWrapper;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;)V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput-object p1, p0, Ll/۫ܰ֫;->֫:Landroid/content/ContextWrapper;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩺ܰ֫;)Ll/ۧ۟֫;
    .locals 4

    .line 150
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    goto :goto_0

    .line 176
    :cond_0
    iget-object v1, p0, Ll/۫ܰ֫;->֫:Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_1

    .line 178
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.amazon.hardware.tv_screen"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    :goto_0
    iget-object v0, p1, Ll/᩺ܰ֫;->ܽ:Ll/۠ᩴ֫;

    iget-object v0, v0, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v0}, Ll/ۢ᩵֫;->ܿ(Ljava/lang/String;)I

    move-result v0

    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Creating an asynchronous MediaCodec adapter for track type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    invoke-static {v0}, Ll/ۘ֨֫;->ܳ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 154
    invoke-static {v1}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;)V

    .line 162
    new-instance v1, Ll/۠ܰ֫;

    .line 70
    new-instance v2, Ll/ۚܰ֫;

    invoke-direct {v2, v0}, Ll/ۚܰ֫;-><init>(I)V

    new-instance v3, Ll/֨ܰ֫;

    invoke-direct {v3, v0}, Ll/֨ܰ֫;-><init>(I)V

    invoke-direct {v1, v2, v3}, Ll/۠ܰ֫;-><init>(Ll/ۚܰ֫;Ll/֨ܰ֫;)V

    .line 164
    invoke-virtual {v1, p1}, Ll/۠ܰ֫;->֫(Ll/᩺ܰ֫;)Ll/ܶܰ֫;

    move-result-object p1

    return-object p1

    .line 166
    :cond_1
    new-instance v0, Ll/ۙ۟֫;

    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 166
    invoke-virtual {v0, p1}, Ll/ۙ۟֫;->֫(Ll/᩺ܰ֫;)Ll/ۧ۟֫;

    move-result-object p1

    return-object p1
.end method
