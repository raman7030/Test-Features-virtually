.class public final Ll/ۡۛ;
.super Ljava/lang/Object;
.source "JB1Y"

# interfaces
.implements Ll/ܺۛ;


# instance fields
.field public final ֫:Landroid/view/ContentInfo;


# direct methods
.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 0

    .line 443
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    iput-object p1, p0, Ll/ۡۛ;->֫:Landroid/view/ContentInfo;

    return-void
.end method


# virtual methods
.method public final getSource()I
    .locals 1

    .line 462
    iget-object v0, p0, Ll/ۡۛ;->֫:Landroid/view/ContentInfo;

    invoke-virtual {v0}, Landroid/view/ContentInfo;->getSource()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 486
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡۛ;->֫:Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/view/ContentInfo;
    .locals 1

    .line 450
    iget-object v0, p0, Ll/ۡۛ;->֫:Landroid/view/ContentInfo;

    return-object v0
.end method

.method public final ۧ()Landroid/content/ClipData;
    .locals 1

    .line 456
    iget-object v0, p0, Ll/ۡۛ;->֫:Landroid/view/ContentInfo;

    invoke-virtual {v0}, Landroid/view/ContentInfo;->getClip()Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 468
    iget-object v0, p0, Ll/ۡۛ;->֫:Landroid/view/ContentInfo;

    invoke-virtual {v0}, Landroid/view/ContentInfo;->getFlags()I

    move-result v0

    return v0
.end method
