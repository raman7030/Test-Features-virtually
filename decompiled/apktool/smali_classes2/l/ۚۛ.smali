.class public final Ll/ۚۛ;
.super Ljava/lang/Object;
.source "51AH"


# instance fields
.field public final ֫:Landroid/view/DisplayCutout;


# direct methods
.method public constructor <init>(Landroid/view/DisplayCutout;)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    return-void
.end method

.method public static ֫(Landroid/view/DisplayCutout;)Ll/ۚۛ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 212
    :cond_0
    new-instance v0, Ll/ۚۛ;

    invoke-direct {v0, p0}, Ll/ۚۛ;-><init>(Landroid/view/DisplayCutout;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 193
    const-class v0, Ll/ۚۛ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 196
    :cond_1
    check-cast p1, Ll/ۚۛ;

    .line 197
    iget-object v0, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    iget-object p1, p1, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/DisplayCutout;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DisplayCutoutCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 2

    .line 126
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 127
    iget-object v0, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    invoke-static {v0}, Ll/֡ۛ;->ۧ(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()I
    .locals 2

    .line 135
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 136
    iget-object v0, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    invoke-static {v0}, Ll/֡ۛ;->ܽ(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()I
    .locals 2

    .line 144
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 145
    iget-object v0, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    invoke-static {v0}, Ll/֡ۛ;->ᩳ(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 118
    iget-object v0, p0, Ll/ۚۛ;->֫:Landroid/view/DisplayCutout;

    invoke-static {v0}, Ll/֡ۛ;->ܿ(Landroid/view/DisplayCutout;)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
