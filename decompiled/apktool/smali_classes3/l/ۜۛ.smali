.class public final Ll/ۜۛ;
.super Ljava/lang/Object;
.source "JB1Y"

# interfaces
.implements Ll/᩷ۛ;


# instance fields
.field public final ֫:Landroid/view/ContentInfo$Builder;


# direct methods
.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0

    .line 665
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 666
    invoke-static {p1, p2}, Ll/᩻ۛ;->֫(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۛ;->֫:Landroid/view/ContentInfo$Builder;

    return-void
.end method


# virtual methods
.method public final build()Ll/ۘۛ;
    .locals 3

    .line 701
    new-instance v0, Ll/ۘۛ;

    new-instance v1, Ll/ۡۛ;

    iget-object v2, p0, Ll/ۜۛ;->֫:Landroid/view/ContentInfo$Builder;

    invoke-virtual {v2}, Landroid/view/ContentInfo$Builder;->build()Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ۡۛ;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Ll/ۘۛ;-><init>(Ll/ܺۛ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 685
    iget-object v0, p0, Ll/ۜۛ;->֫:Landroid/view/ContentInfo$Builder;

    invoke-virtual {v0, p1}, Landroid/view/ContentInfo$Builder;->setFlags(I)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public final ֫(Landroid/net/Uri;)V
    .locals 1

    .line 690
    iget-object v0, p0, Ll/ۜۛ;->֫:Landroid/view/ContentInfo$Builder;

    invoke-virtual {v0, p1}, Landroid/view/ContentInfo$Builder;->setLinkUri(Landroid/net/Uri;)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public final ֫(Landroid/os/Bundle;)V
    .locals 1

    .line 695
    iget-object v0, p0, Ll/ۜۛ;->֫:Landroid/view/ContentInfo$Builder;

    invoke-virtual {v0, p1}, Landroid/view/ContentInfo$Builder;->setExtras(Landroid/os/Bundle;)Landroid/view/ContentInfo$Builder;

    return-void
.end method
