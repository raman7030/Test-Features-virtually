.class public final Ll/ۚۢ֨;
.super Ll/֨ۢ֨;
.source "L5HA"


# instance fields
.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 129
    invoke-direct {p0}, Ll/֨ۢ֨;-><init>()V

    const/4 v0, 0x0

    .line 130
    iput v0, p0, Ll/ۚۢ֨;->ᩳ:I

    .line 131
    iput v0, p0, Ll/ۚۢ֨;->ܽ:I

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 123
    invoke-direct {p0, p1, p2, p3}, Ll/֨ۢ֨;-><init>(Landroid/view/View;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 124
    invoke-static {p1, p2, p3}, Ll/ۚۢ֨;->֫(Landroid/widget/ImageView;Landroid/util/AttributeSet;Z)I

    move-result p3

    iput p3, p0, Ll/ۚۢ֨;->ᩳ:I

    const/4 p3, 0x0

    .line 125
    invoke-static {p1, p2, p3}, Ll/ۚۢ֨;->֫(Landroid/widget/ImageView;Landroid/util/AttributeSet;Z)I

    move-result p1

    iput p1, p0, Ll/ۚۢ֨;->ܽ:I

    return-void
.end method

.method public static ֫(Landroid/widget/ImageView;Landroid/util/AttributeSet;Z)I
    .locals 3

    if-eqz p2, :cond_0

    const-string v0, "src"

    goto :goto_0

    :cond_0
    const-string v0, "background"

    :goto_0
    const-string v1, "http://schemas.android.com/apk/res/android"

    const/4 v2, 0x0

    .line 135
    invoke-interface {p1, v1, v0, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    if-lez p1, :cond_1

    .line 137
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v0

    .line 138
    sget-object v1, Ll/۠ۢ֨;->֫:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p2, p1}, Ll/۠ۢ֨;->֫(Landroid/widget/ImageView;ZI)Z

    move-result p0

    if-nez p0, :cond_1

    return p1

    :cond_1
    return v2
.end method
